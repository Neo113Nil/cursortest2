package Ti;

import io.sentry.hints.m;
import java.util.Arrays;
import ru.ozon.android.gallery.media.view.GalleryActivity;

/* loaded from: classes10.dex */
public final class c implements Ib.b, m {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long c11 = c(0, bArr) & 67108863;
        int i11 = 3;
        long c12 = (c(3, bArr) >> 2) & 67108611;
        long c13 = (c(6, bArr) >> 4) & 67092735;
        long c14 = (c(9, bArr) >> 6) & 66076671;
        long c15 = (c(12, bArr) >> 8) & 1048575;
        long j11 = c12 * 5;
        long j12 = c13 * 5;
        long j13 = c14 * 5;
        long j14 = c15 * 5;
        byte[] bArr3 = new byte[17];
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        int i12 = 0;
        while (i12 < bArr2.length) {
            int min = Math.min(16, bArr2.length - i12);
            System.arraycopy(bArr2, i12, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, 17, (byte) 0);
            }
            long c16 = j19 + (c(0, bArr3) & 67108863);
            long c17 = j15 + ((c(i11, bArr3) >> 2) & 67108863);
            long c18 = j16 + ((c(6, bArr3) >> 4) & 67108863);
            long c19 = j17 + ((c(9, bArr3) >> 6) & 67108863);
            long j21 = c12;
            long c21 = j18 + (((c(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j22 = (c21 * j11) + (c19 * j12) + (c18 * j13) + (c17 * j14) + (c16 * c11);
            long j23 = (c21 * j12) + (c19 * j13) + (c18 * j14) + (c17 * c11) + (c16 * j21);
            long j24 = (c21 * j13) + (c19 * j14) + (c18 * c11) + (c17 * j21) + (c16 * c13);
            long j25 = (c21 * j14) + (c19 * c11) + (c18 * j21) + (c17 * c13) + (c16 * c14);
            long j26 = c19 * j21;
            long j27 = c21 * c11;
            long j28 = j23 + (j22 >> 26);
            long j29 = j24 + (j28 >> 26);
            long j31 = j25 + (j29 >> 26);
            long j32 = j27 + j26 + (c18 * c13) + (c17 * c14) + (c16 * c15) + (j31 >> 26);
            long j33 = j32 >> 26;
            j18 = j32 & 67108863;
            long j34 = (j33 * 5) + (j22 & 67108863);
            i12 += 16;
            j16 = j29 & 67108863;
            j17 = j31 & 67108863;
            j19 = j34 & 67108863;
            j15 = (j28 & 67108863) + (j34 >> 26);
            c12 = j21;
            i11 = 3;
        }
        long j35 = j16 + (j15 >> 26);
        long j36 = j35 & 67108863;
        long j37 = j17 + (j35 >> 26);
        long j38 = j37 & 67108863;
        long j39 = j18 + (j37 >> 26);
        long j41 = j39 & 67108863;
        long j42 = ((j39 >> 26) * 5) + j19;
        long j43 = j42 >> 26;
        long j44 = j42 & 67108863;
        long j45 = (j15 & 67108863) + j43;
        long j46 = j44 + 5;
        long j47 = j46 & 67108863;
        long j48 = j45 + (j46 >> 26);
        long j49 = j36 + (j48 >> 26);
        long j51 = j38 + (j49 >> 26);
        long j52 = j51 & 67108863;
        long j53 = (j41 + (j51 >> 26)) - 67108864;
        long j54 = j53 >> 63;
        long j55 = j44 & j54;
        long j56 = j45 & j54;
        long j57 = j36 & j54;
        long j58 = j38 & j54;
        long j59 = j41 & j54;
        long j61 = ~j54;
        long j62 = j56 | (j48 & 67108863 & j61);
        long j63 = j57 | (j49 & 67108863 & j61);
        long j64 = j58 | (j52 & j61);
        long j65 = (j55 | (j47 & j61) | (j62 << 26)) & 4294967295L;
        long j66 = ((j62 >> 6) | (j63 << 20)) & 4294967295L;
        long j67 = ((j63 >> 12) | (j64 << 14)) & 4294967295L;
        long j68 = ((j64 >> 18) | ((j59 | (j53 & j61)) << 8)) & 4294967295L;
        long c22 = j65 + c(16, bArr);
        long c23 = j66 + c(20, bArr) + (c22 >> 32);
        long c24 = j67 + c(24, bArr) + (c23 >> 32);
        long c25 = (j68 + c(28, bArr) + (c24 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        d(bArr4, c22 & 4294967295L, 0);
        d(bArr4, c23 & 4294967295L, 4);
        d(bArr4, c24 & 4294967295L, 8);
        d(bArr4, c25, 12);
        return bArr4;
    }

    public static void b(i iVar, GalleryActivity galleryActivity) {
        galleryActivity.f83800h = iVar;
    }

    private static long c(int i11, byte[] bArr) {
        return (((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16)) & 4294967295L;
    }

    private static void d(byte[] bArr, long j11, int i11) {
        int i12 = 0;
        while (i12 < 4) {
            bArr[i11 + i12] = (byte) (255 & j11);
            i12++;
            j11 >>= 8;
        }
    }
}
