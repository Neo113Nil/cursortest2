package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzht {
    private static long zza(byte[] bArr, int i7, int i8) {
        return (zza(bArr, i7) >> i8) & 67108863;
    }

    private static long zza(byte[] bArr, int i7) {
        return (((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16)) & 4294967295L;
    }

    private static void zza(byte[] bArr, long j, int i7) {
        int i8 = 0;
        while (i8 < 4) {
            bArr[i7 + i8] = (byte) (255 & j);
            i8++;
            j >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long zza = zza(bArr, 0, 0) & 67108863;
            long zza2 = zza(bArr, 3, 2) & 67108611;
            long zza3 = zza(bArr, 6, 4) & 67092735;
            long zza4 = zza(bArr, 9, 6) & 66076671;
            long zza5 = zza(bArr, 12, 8) & 1048575;
            long j = zza2 * 5;
            long j3 = zza3 * 5;
            long j7 = zza4 * 5;
            long j8 = zza5 * 5;
            int i7 = 17;
            byte[] bArr3 = new byte[17];
            long j9 = 0;
            int i8 = 0;
            long j10 = 0;
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            while (i8 < bArr2.length) {
                int min = Math.min(16, bArr2.length - i8);
                System.arraycopy(bArr2, i8, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i7, (byte) 0);
                }
                long zza6 = j13 + zza(bArr3, 0, 0);
                long zza7 = j9 + zza(bArr3, 3, 2);
                long zza8 = j10 + zza(bArr3, 6, 4);
                long zza9 = j11 + zza(bArr3, 9, 6);
                long zza10 = j12 + (zza(bArr3, 12, 8) | (bArr3[16] << 24));
                long j14 = (zza10 * j) + (zza9 * j3) + (zza8 * j7) + (zza7 * j8) + (zza6 * zza);
                long j15 = (zza10 * j3) + (zza9 * j7) + (zza8 * j8) + (zza7 * zza) + (zza6 * zza2);
                long j16 = (zza10 * j7) + (zza9 * j8) + (zza8 * zza) + (zza7 * zza2) + (zza6 * zza3);
                long j17 = (zza10 * j8) + (zza9 * zza) + (zza8 * zza2) + (zza7 * zza3) + (zza6 * zza4);
                long j18 = zza9 * zza2;
                long j19 = zza10 * zza;
                long j20 = j15 + (j14 >> 26);
                long j21 = j16 + (j20 >> 26);
                long j22 = j17 + (j21 >> 26);
                long j23 = j19 + j18 + (zza8 * zza3) + (zza7 * zza4) + (zza6 * zza5) + (j22 >> 26);
                long j24 = j23 >> 26;
                j12 = j23 & 67108863;
                long j25 = (j24 * 5) + (j14 & 67108863);
                i8 += 16;
                j10 = j21 & 67108863;
                j11 = j22 & 67108863;
                i7 = 17;
                j13 = j25 & 67108863;
                j9 = (j20 & 67108863) + (j25 >> 26);
            }
            long j26 = j10 + (j9 >> 26);
            long j27 = j26 & 67108863;
            long j28 = j11 + (j26 >> 26);
            long j29 = j28 & 67108863;
            long j30 = j12 + (j28 >> 26);
            long j31 = j30 & 67108863;
            long j32 = ((j30 >> 26) * 5) + j13;
            long j33 = j32 >> 26;
            long j34 = j32 & 67108863;
            long j35 = (j9 & 67108863) + j33;
            long j36 = j34 + 5;
            long j37 = j36 & 67108863;
            long j38 = (j36 >> 26) + j35;
            long j39 = j27 + (j38 >> 26);
            long j40 = j29 + (j39 >> 26);
            long j41 = (j31 + (j40 >> 26)) - 67108864;
            long j42 = j41 >> 63;
            long j43 = j34 & j42;
            long j44 = j35 & j42;
            long j45 = j27 & j42;
            long j46 = j29 & j42;
            long j47 = j31 & j42;
            long j48 = ~j42;
            long j49 = j44 | (j38 & 67108863 & j48);
            long j50 = j45 | (j39 & 67108863 & j48);
            long j51 = j46 | (j40 & 67108863 & j48);
            long j52 = (j43 | (j37 & j48) | (j49 << 26)) & 4294967295L;
            long j53 = ((j49 >> 6) | (j50 << 20)) & 4294967295L;
            long j54 = ((j50 >> 12) | (j51 << 14)) & 4294967295L;
            long j55 = ((j51 >> 18) | ((j47 | (j41 & j48)) << 8)) & 4294967295L;
            long zza11 = j52 + zza(bArr, 16);
            long j56 = zza11 & 4294967295L;
            long zza12 = j53 + zza(bArr, 20) + (zza11 >> 32);
            long j57 = zza12 & 4294967295L;
            long zza13 = j54 + zza(bArr, 24) + (zza12 >> 32);
            long j58 = zza13 & 4294967295L;
            long zza14 = (j55 + zza(bArr, 28) + (zza13 >> 32)) & 4294967295L;
            byte[] bArr4 = new byte[16];
            zza(bArr4, j56, 0);
            zza(bArr4, j57, 4);
            zza(bArr4, j58, 8);
            zza(bArr4, zza14, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
