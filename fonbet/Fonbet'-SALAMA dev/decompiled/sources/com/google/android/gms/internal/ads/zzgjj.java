package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgjj {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long zzb = zzb(bArr, 0, 0);
        long zzb2 = zzb(bArr, 3, 2) & 67108611;
        long zzb3 = zzb(bArr, 6, 4) & 67092735;
        long zzb4 = zzb(bArr, 9, 6) & 66076671;
        long zzb5 = zzb(bArr, 12, 8) & 1048575;
        int i7 = 17;
        byte[] bArr3 = new byte[17];
        long j = 0;
        int i8 = 0;
        long j3 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        while (true) {
            int length = bArr2.length;
            if (i8 >= length) {
                long j10 = j + (j3 >> 26);
                long j11 = j10 & 67108863;
                long j12 = j7 + (j10 >> 26);
                long j13 = j12 & 67108863;
                long j14 = j8 + (j12 >> 26);
                long j15 = j14 & 67108863;
                long j16 = ((j14 >> 26) * 5) + j9;
                long j17 = j16 >> 26;
                long j18 = j16 & 67108863;
                long j19 = j18 + 5;
                long j20 = (j3 & 67108863) + j17;
                long j21 = j20 + (j19 >> 26);
                long j22 = (j21 >> 26) + j11;
                long j23 = j13 + (j22 >> 26);
                long j24 = (j15 + (j23 >> 26)) - 67108864;
                long j25 = j24 >> 63;
                long j26 = ~j25;
                long j27 = (j20 & j25) | (j21 & 67108863 & j26);
                long j28 = (j11 & j25) | (j22 & 67108863 & j26);
                long j29 = (j13 & j25) | (j23 & 67108863 & j26);
                long j30 = (j15 & j25) | (j24 & j26);
                long zzc = (((j18 & j25) | (j19 & 67108863 & j26) | (j27 << 26)) & 4294967295L) + zzc(bArr, 16);
                long zzc2 = (((j27 >> 6) | (j28 << 20)) & 4294967295L) + zzc(bArr, 20);
                long zzc3 = (((j29 << 14) | (j28 >> 12)) & 4294967295L) + zzc(bArr, 24);
                long zzc4 = (((j29 >> 18) | (j30 << 8)) & 4294967295L) + zzc(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, zzc & 4294967295L, 0);
                long j31 = zzc2 + (zzc >> 32);
                zzd(bArr4, j31 & 4294967295L, 4);
                long j32 = zzc3 + (j31 >> 32);
                zzd(bArr4, j32 & 4294967295L, 8);
                zzd(bArr4, (zzc4 + (j32 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int min = Math.min(16, length - i8);
            System.arraycopy(bArr2, i8, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i7, (byte) 0);
            }
            long j33 = zzb5 * 5;
            long j34 = zzb4 * 5;
            long j35 = zzb3 * 5;
            long zzb6 = j9 + zzb(bArr3, 0, 0);
            long zzb7 = j3 + zzb(bArr3, 3, 2);
            long zzb8 = j + zzb(bArr3, 6, 4);
            long zzb9 = j7 + zzb(bArr3, 9, 6);
            long zzb10 = j8 + (zzb(bArr3, 12, 8) | (bArr3[16] << 24));
            long j36 = zzb7 * zzb;
            long j37 = zzb7 * zzb2;
            long j38 = zzb8 * zzb;
            long j39 = zzb7 * zzb3;
            long j40 = zzb8 * zzb2;
            long j41 = zzb9 * zzb;
            long j42 = zzb7 * zzb4;
            long j43 = zzb8 * zzb3;
            long j44 = zzb9 * zzb2;
            long j45 = zzb10 * zzb;
            long j46 = (zzb2 * 5 * zzb10) + (zzb9 * j35) + (zzb8 * j34) + (zzb7 * j33) + (zzb6 * zzb);
            long j47 = j46 & 67108863;
            long j48 = zzb9 * j34;
            long j49 = j35 * zzb10;
            long j50 = j49 + j48 + (zzb8 * j33) + (zzb6 * zzb2) + j36 + (j46 >> 26);
            long j51 = j34 * zzb10;
            long j52 = j51 + (zzb9 * j33) + (zzb6 * zzb3) + j37 + j38 + (j50 >> 26);
            long j53 = (zzb10 * j33) + (zzb6 * zzb4) + j39 + j40 + j41 + (j52 >> 26);
            long j54 = (zzb6 * zzb5) + j42 + j43 + j44 + j45 + (j53 >> 26);
            long j55 = ((j54 >> 26) * 5) + j47;
            j3 = (j50 & 67108863) + (j55 >> 26);
            i8 += 16;
            j = j52 & 67108863;
            j7 = j53 & 67108863;
            j8 = j54 & 67108863;
            i7 = 17;
            j9 = j55 & 67108863;
        }
    }

    private static long zzb(byte[] bArr, int i7, int i8) {
        return (zzc(bArr, i7) >> i8) & 67108863;
    }

    private static long zzc(byte[] bArr, int i7) {
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return (((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16)) & 4294967295L;
    }

    private static void zzd(byte[] bArr, long j, int i7) {
        for (int i8 = 0; i8 < 4; i8++) {
            bArr[i7 + i8] = (byte) (255 & j);
            j >>= 8;
        }
    }
}
