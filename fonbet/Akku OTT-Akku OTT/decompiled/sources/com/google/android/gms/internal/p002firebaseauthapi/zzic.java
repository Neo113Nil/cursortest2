package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.embedding.android.KeyboardMap;
import java.util.Arrays;
import kotlin.UByte;

/* loaded from: classes4.dex */
public final class zzic {
    private static long zza(byte[] bArr, int i, int i2) {
        return (zza(bArr, i) >> i2) & 67108863;
    }

    private static long zza(byte[] bArr, int i) {
        return (((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16)) & KeyboardMap.kValueMask;
    }

    private static void zza(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long zza = zza(bArr, 0, 0) & 67108863;
            int i = 3;
            int i2 = 2;
            long zza2 = zza(bArr, 3, 2) & 67108611;
            long zza3 = zza(bArr, 6, 4) & 67092735;
            long zza4 = zza(bArr, 9, 6) & 66076671;
            long zza5 = zza(bArr, 12, 8) & 1048575;
            long j = zza2 * 5;
            long j2 = zza3 * 5;
            long j3 = zza4 * 5;
            long j4 = zza5 * 5;
            int i3 = 17;
            byte[] bArr3 = new byte[17];
            long j5 = 0;
            int i4 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            while (i4 < bArr2.length) {
                int min = Math.min(16, bArr2.length - i4);
                System.arraycopy(bArr2, i4, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i3, (byte) 0);
                }
                long zza6 = j9 + zza(bArr3, 0, 0);
                long zza7 = j5 + zza(bArr3, i, i2);
                long zza8 = j6 + zza(bArr3, 6, 4);
                long zza9 = j7 + zza(bArr3, 9, 6);
                long j10 = zza2;
                long zza10 = j8 + (zza(bArr3, 12, 8) | (bArr3[16] << 24));
                long j11 = (zza10 * j) + (zza9 * j2) + (zza8 * j3) + (zza7 * j4) + (zza6 * zza);
                long j12 = (zza10 * j2) + (zza9 * j3) + (zza8 * j4) + (zza7 * zza) + (zza6 * j10);
                long j13 = (zza10 * j3) + (zza9 * j4) + (zza8 * zza) + (zza7 * j10) + (zza6 * zza3);
                long j14 = (zza10 * j4) + (zza9 * zza) + (zza8 * j10) + (zza7 * zza3) + (zza6 * zza4);
                long j15 = zza9 * j10;
                long j16 = zza10 * zza;
                long j17 = j12 + (j11 >> 26);
                long j18 = j13 + (j17 >> 26);
                long j19 = j14 + (j18 >> 26);
                long j20 = j16 + j15 + (zza8 * zza3) + (zza7 * zza4) + (zza6 * zza5) + (j19 >> 26);
                long j21 = j20 >> 26;
                j8 = j20 & 67108863;
                long j22 = (j21 * 5) + (j11 & 67108863);
                i4 += 16;
                j6 = j18 & 67108863;
                j7 = j19 & 67108863;
                i3 = 17;
                i = 3;
                j9 = j22 & 67108863;
                j5 = (j17 & 67108863) + (j22 >> 26);
                zza2 = j10;
                i2 = 2;
            }
            long j23 = j6 + (j5 >> 26);
            long j24 = j23 & 67108863;
            long j25 = j7 + (j23 >> 26);
            long j26 = j25 & 67108863;
            long j27 = j8 + (j25 >> 26);
            long j28 = j27 & 67108863;
            long j29 = ((j27 >> 26) * 5) + j9;
            long j30 = j29 >> 26;
            long j31 = j29 & 67108863;
            long j32 = (j5 & 67108863) + j30;
            long j33 = j31 + 5;
            long j34 = j33 & 67108863;
            long j35 = (j33 >> 26) + j32;
            long j36 = j24 + (j35 >> 26);
            long j37 = j26 + (j36 >> 26);
            long j38 = (j28 + (j37 >> 26)) - 67108864;
            long j39 = j38 >> 63;
            long j40 = ~j39;
            long j41 = (j31 & j39) | (j34 & j40);
            long j42 = (j32 & j39) | (j35 & 67108863 & j40);
            long j43 = (j24 & j39) | (j36 & 67108863 & j40);
            long j44 = (j26 & j39) | (j37 & 67108863 & j40);
            long j45 = (j41 | (j42 << 26)) & KeyboardMap.kValueMask;
            long j46 = ((j42 >> 6) | (j43 << 20)) & KeyboardMap.kValueMask;
            long j47 = ((j43 >> 12) | (j44 << 14)) & KeyboardMap.kValueMask;
            long j48 = ((((j38 & j40) | (j28 & j39)) << 8) | (j44 >> 18)) & KeyboardMap.kValueMask;
            long zza11 = j45 + zza(bArr, 16);
            long j49 = zza11 & KeyboardMap.kValueMask;
            long zza12 = j46 + zza(bArr, 20) + (zza11 >> 32);
            long j50 = zza12 & KeyboardMap.kValueMask;
            long zza13 = j47 + zza(bArr, 24) + (zza12 >> 32);
            long j51 = zza13 & KeyboardMap.kValueMask;
            long zza14 = (j48 + zza(bArr, 28) + (zza13 >> 32)) & KeyboardMap.kValueMask;
            byte[] bArr4 = new byte[16];
            zza(bArr4, j49, 0);
            zza(bArr4, j50, 4);
            zza(bArr4, j51, 8);
            zza(bArr4, zza14, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
