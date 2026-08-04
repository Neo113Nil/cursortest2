package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzgjj {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long jZzb = zzb(bArr, 0, 0);
        long jZzb2 = zzb(bArr, 3, 2) & 67108611;
        long jZzb3 = zzb(bArr, 6, 4) & 67092735;
        long jZzb4 = zzb(bArr, 9, 6) & 66076671;
        long jZzb5 = zzb(bArr, 12, 8) & 1048575;
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
                long jZzc = (((j18 & j25) | (j19 & 67108863 & j26) | (j27 << 26)) & 4294967295L) + zzc(bArr, 16);
                long jZzc2 = (((j27 >> 6) | (j28 << 20)) & 4294967295L) + zzc(bArr, 20);
                long jZzc3 = (((j29 << 14) | (j28 >> 12)) & 4294967295L) + zzc(bArr, 24);
                long jZzc4 = (((j29 >> 18) | (j30 << 8)) & 4294967295L) + zzc(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, jZzc & 4294967295L, 0);
                long j31 = jZzc2 + (jZzc >> 32);
                zzd(bArr4, j31 & 4294967295L, 4);
                long j32 = jZzc3 + (j31 >> 32);
                zzd(bArr4, j32 & 4294967295L, 8);
                zzd(bArr4, (jZzc4 + (j32 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i8);
            System.arraycopy(bArr2, i8, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i7, (byte) 0);
            }
            long j33 = jZzb5 * 5;
            long j34 = jZzb4 * 5;
            long j35 = jZzb3 * 5;
            long jZzb6 = j9 + zzb(bArr3, 0, 0);
            long jZzb7 = j3 + zzb(bArr3, 3, 2);
            long jZzb8 = j + zzb(bArr3, 6, 4);
            long jZzb9 = j7 + zzb(bArr3, 9, 6);
            long jZzb10 = j8 + (zzb(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j36 = jZzb7 * jZzb;
            long j37 = jZzb7 * jZzb2;
            long j38 = jZzb8 * jZzb;
            long j39 = jZzb7 * jZzb3;
            long j40 = jZzb8 * jZzb2;
            long j41 = jZzb9 * jZzb;
            long j42 = jZzb7 * jZzb4;
            long j43 = jZzb8 * jZzb3;
            long j44 = jZzb9 * jZzb2;
            long j45 = jZzb10 * jZzb;
            long j46 = (jZzb2 * 5 * jZzb10) + (jZzb9 * j35) + (jZzb8 * j34) + (jZzb7 * j33) + (jZzb6 * jZzb);
            long j47 = j46 & 67108863;
            long j48 = jZzb9 * j34;
            long j49 = j35 * jZzb10;
            long j50 = j49 + j48 + (jZzb8 * j33) + (jZzb6 * jZzb2) + j36 + (j46 >> 26);
            long j51 = j34 * jZzb10;
            long j52 = j51 + (jZzb9 * j33) + (jZzb6 * jZzb3) + j37 + j38 + (j50 >> 26);
            long j53 = (jZzb10 * j33) + (jZzb6 * jZzb4) + j39 + j40 + j41 + (j52 >> 26);
            long j54 = (jZzb6 * jZzb5) + j42 + j43 + j44 + j45 + (j53 >> 26);
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
        return ((long) (((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16))) & 4294967295L;
    }

    private static void zzd(byte[] bArr, long j, int i7) {
        for (int i8 = 0; i8 < 4; i8++) {
            bArr[i7 + i8] = (byte) (255 & j);
            j >>= 8;
        }
    }
}
