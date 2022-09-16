import java.util.*;

public class Main {

    public static void main(String[] args) {
        int deger = 0;
        int dizi = 0;
        int can = 5;
        int[] hata = new int[5];
        Random r = new Random();
        int sayi = r.nextInt(100);
        Scanner s = new Scanner(System.in);
        System.out.println(sayi);
        while (can >= 1) {
            can -= 1;
            System.out.print((deger + 1) + ". Tahmininizi giriniz, ( 0-100 ) : ");
            int tahmin = s.nextInt();
            if (tahmin == sayi) {
                System.out.println("Tebrikler! " + (deger + 1) + ". tahminde bildiniz !");
                break;
            } else if (tahmin > sayi) {
                deger += 1;
                hata[dizi++] = tahmin;
                if (deger < 5) {
                    System.out.println(tahmin + " sayısından daha küçük sayı girmelisiniz ! " + (can) + " hakkınız kaldı.");
                }
            } else {
                deger += 1;
                hata[dizi++] = tahmin;
                if (deger < 5) {
                    System.out.println(tahmin + " sayısından daha büyük sayı girmelisiniz ! " + (can) + " hakkınız kaldı.");
                }
            }
        }
        if (can == 0) {
            System.out.println("Hakkınız kalmamıştır. Kaybettiniz. Doğru Sayı : " +sayi);
            System.out.println("Tahminleriniz : " + Arrays.toString(hata));
        }
    }
}
