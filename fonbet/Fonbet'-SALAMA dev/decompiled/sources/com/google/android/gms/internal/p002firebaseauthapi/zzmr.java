package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzmr {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    public static void zza(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        zzb(jArr3, jArr2);
        zzb(jArr12, jArr3);
        zzb(jArr11, jArr12);
        zza(jArr4, jArr11, jArr2);
        zza(jArr5, jArr4, jArr3);
        zzb(jArr11, jArr5);
        zza(jArr6, jArr11, jArr4);
        zzb(jArr11, jArr6);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zza(jArr7, jArr11, jArr6);
        zzb(jArr11, jArr7);
        zzb(jArr12, jArr11);
        for (int i7 = 2; i7 < 10; i7 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr8, jArr12, jArr7);
        zzb(jArr11, jArr8);
        zzb(jArr12, jArr11);
        for (int i8 = 2; i8 < 20; i8 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr8);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        for (int i9 = 2; i9 < 10; i9 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr9, jArr11, jArr7);
        zzb(jArr11, jArr9);
        zzb(jArr12, jArr11);
        for (int i10 = 2; i10 < 50; i10 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr10, jArr12, jArr9);
        zzb(jArr12, jArr10);
        zzb(jArr11, jArr12);
        for (int i11 = 2; i11 < 100; i11 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr12, jArr11, jArr10);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        for (int i12 = 2; i12 < 50; i12 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr9);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zza(jArr, jArr12, jArr5);
    }

    public static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j = jArr2[0];
        long j3 = jArr3[1] * j;
        long j7 = jArr2[1];
        long j8 = jArr3[0];
        jArr[1] = (j7 * j8) + j3;
        long j9 = jArr2[1];
        long j10 = jArr3[1];
        jArr[2] = (jArr2[2] * j8) + (jArr3[2] * j) + (j9 * 2 * j10);
        long j11 = jArr3[2];
        long j12 = jArr2[2];
        jArr[3] = (jArr2[3] * j8) + (jArr3[3] * j) + (j12 * j10) + (j9 * j11);
        long j13 = jArr3[3];
        long j14 = jArr2[3];
        jArr[4] = (jArr2[4] * j8) + (jArr3[4] * j) + (((j14 * j10) + (j9 * j13)) * 2) + (j12 * j11);
        long j15 = jArr3[4];
        long j16 = (j9 * j15) + (j14 * j11) + (j12 * j13);
        long j17 = jArr2[4];
        jArr[5] = (jArr2[5] * j8) + (jArr3[5] * j) + (j17 * j10) + j16;
        long j18 = jArr3[5];
        long j19 = jArr2[5];
        jArr[6] = (jArr2[6] * j8) + (jArr3[6] * j) + (j17 * j11) + (j12 * j15) + (((j19 * j10) + (j9 * j18) + (j14 * j13)) * 2);
        long j20 = (j19 * j11) + (j12 * j18) + (j17 * j13) + (j14 * j15);
        long j21 = jArr3[6];
        long j22 = (j9 * j21) + j20;
        long j23 = jArr2[6];
        jArr[7] = (jArr2[7] * j8) + (jArr3[7] * j) + (j23 * j10) + j22;
        long j24 = jArr3[7];
        long j25 = (j9 * j24) + (j19 * j13) + (j14 * j18);
        long j26 = jArr2[7];
        long j27 = (((j26 * j10) + j25) * 2) + (j17 * j15);
        jArr[8] = (jArr2[8] * j8) + (jArr3[8] * j) + (j23 * j11) + (j12 * j21) + j27;
        long j28 = (j26 * j11) + (j12 * j24) + (j23 * j13) + (j14 * j21) + (j19 * j15) + (j17 * j18);
        long j29 = jArr3[8];
        long j30 = (j9 * j29) + j28;
        long j31 = jArr2[8];
        jArr[9] = (jArr2[9] * j8) + (j * jArr3[9]) + (j31 * j10) + j30;
        long j32 = (j26 * j13) + (j14 * j24) + (j19 * j18);
        long j33 = jArr3[9];
        long j34 = jArr2[9];
        long j35 = j17 * j21;
        jArr[10] = (j31 * j11) + (j12 * j29) + (j23 * j15) + j35 + (((j10 * j34) + (j9 * j33) + j32) * 2);
        long j36 = j12 * j33;
        long j37 = j11 * j34;
        jArr[11] = j37 + j36 + (j31 * j13) + (j14 * j29) + (j26 * j15) + (j17 * j24) + (j23 * j18) + (j19 * j21);
        long j38 = j14 * j33;
        long j39 = j13 * j34;
        long j40 = j31 * j15;
        jArr[12] = j40 + (j17 * j29) + ((j39 + j38 + (j26 * j18) + (j19 * j24)) * 2) + (j23 * j21);
        long j41 = j17 * j33;
        long j42 = j15 * j34;
        jArr[13] = j42 + j41 + (j31 * j18) + (j19 * j29) + (j26 * j21) + (j23 * j24);
        long j43 = j18 * j34;
        long j44 = j31 * j21;
        jArr[14] = j44 + (j23 * j29) + ((j43 + (j19 * j33) + (j26 * j24)) * 2);
        long j45 = j23 * j33;
        long j46 = j21 * j34;
        jArr[15] = j46 + j45 + (j31 * j24) + (j26 * j29);
        jArr[16] = (((j24 * j34) + (j26 * j33)) * 2) + (j31 * j29);
        jArr[17] = (j29 * j34) + (j31 * j33);
        jArr[18] = j34 * 2 * j33;
    }

    public static void zzc(long[] jArr, long[] jArr2) {
        zzc(jArr, jArr2, jArr);
    }

    public static void zzd(long[] jArr, long[] jArr2) {
        zzd(jArr, jArr, jArr2);
    }

    private static void zze(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        zzb(jArr);
        zza(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void zzc(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i7 = 0; i7 < 10; i7++) {
            jArr[i7] = jArr2[i7] - jArr3[i7];
        }
    }

    public static void zzd(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i7 = 0; i7 < 10; i7++) {
            jArr[i7] = jArr2[i7] + jArr3[i7];
        }
    }

    public static byte[] zzc(long[] jArr) {
        int i7;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i8 = 0;
        while (true) {
            if (i8 >= 2) {
                break;
            }
            int i9 = 0;
            while (i9 < 9) {
                long j = copyOf[i9];
                int i10 = -((int) (((j >> 31) & j) >> zzd[i9 & 1]));
                copyOf[i9] = j + (i10 << r14);
                i9++;
                copyOf[i9] = copyOf[i9] - i10;
            }
            long j3 = copyOf[9];
            copyOf[9] = j3 + (r6 << 25);
            copyOf[0] = copyOf[0] - ((-((int) (((j3 >> 31) & j3) >> 25))) * 19);
            i8++;
        }
        long j7 = copyOf[0];
        copyOf[0] = j7 + (r3 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j7 >> 31) & j7) >> 26)));
        int i11 = 0;
        for (i7 = 2; i11 < i7; i7 = 2) {
            int i12 = 0;
            while (i12 < 9) {
                long j8 = copyOf[i12];
                int i13 = (int) (j8 >> zzd[i12 & 1]);
                copyOf[i12] = j8 & zzc[r15];
                i12++;
                copyOf[i12] = copyOf[i12] + i13;
            }
            i11++;
        }
        copyOf[9] = copyOf[9] & 33554431;
        long j9 = (((int) (r9 >> 25)) * 19) + copyOf[0];
        copyOf[0] = j9;
        int i14 = ~((((int) j9) - 67108845) >> 31);
        for (int i15 = 1; i15 < 10; i15++) {
            int i16 = ~(((int) copyOf[i15]) ^ zzc[i15 & 1]);
            int i17 = i16 & (i16 << 16);
            int i18 = i17 & (i17 << 8);
            int i19 = i18 & (i18 << 4);
            int i20 = i19 & (i19 << 2);
            i14 &= (i20 & (i20 << 1)) >> 31;
        }
        copyOf[0] = copyOf[0] - (67108845 & i14);
        long j10 = 33554431 & i14;
        copyOf[1] = copyOf[1] - j10;
        for (int i21 = 2; i21 < 10; i21 += 2) {
            copyOf[i21] = copyOf[i21] - (67108863 & i14);
            int i22 = i21 + 1;
            copyOf[i22] = copyOf[i22] - j10;
        }
        for (int i23 = 0; i23 < 10; i23++) {
            copyOf[i23] = copyOf[i23] << zzb[i23];
        }
        byte[] bArr = new byte[32];
        for (int i24 = 0; i24 < 10; i24++) {
            int i25 = zza[i24];
            long j11 = bArr[i25];
            long j12 = copyOf[i24];
            bArr[i25] = (byte) (j11 | (j12 & 255));
            bArr[i25 + 1] = (byte) (bArr[r5] | ((j12 >> 8) & 255));
            bArr[i25 + 2] = (byte) (bArr[r5] | ((j12 >> 16) & 255));
            bArr[i25 + 3] = (byte) (bArr[r4] | ((j12 >> 24) & 255));
        }
        return bArr;
    }

    public static void zzb(long[] jArr) {
        long j = jArr[8];
        long j3 = jArr[18];
        long j7 = j + (j3 << 4);
        jArr[8] = j7;
        long j8 = j7 + (j3 << 1);
        jArr[8] = j8;
        jArr[8] = j8 + j3;
        long j9 = jArr[7];
        long j10 = jArr[17];
        long j11 = j9 + (j10 << 4);
        jArr[7] = j11;
        long j12 = j11 + (j10 << 1);
        jArr[7] = j12;
        jArr[7] = j12 + j10;
        long j13 = jArr[6];
        long j14 = jArr[16];
        long j15 = j13 + (j14 << 4);
        jArr[6] = j15;
        long j16 = j15 + (j14 << 1);
        jArr[6] = j16;
        jArr[6] = j16 + j14;
        long j17 = jArr[5];
        long j18 = jArr[15];
        long j19 = j17 + (j18 << 4);
        jArr[5] = j19;
        long j20 = j19 + (j18 << 1);
        jArr[5] = j20;
        jArr[5] = j20 + j18;
        long j21 = jArr[4];
        long j22 = jArr[14];
        long j23 = j21 + (j22 << 4);
        jArr[4] = j23;
        long j24 = j23 + (j22 << 1);
        jArr[4] = j24;
        jArr[4] = j24 + j22;
        long j25 = jArr[3];
        long j26 = jArr[13];
        long j27 = j25 + (j26 << 4);
        jArr[3] = j27;
        long j28 = j27 + (j26 << 1);
        jArr[3] = j28;
        jArr[3] = j28 + j26;
        long j29 = jArr[2];
        long j30 = jArr[12];
        long j31 = j29 + (j30 << 4);
        jArr[2] = j31;
        long j32 = j31 + (j30 << 1);
        jArr[2] = j32;
        jArr[2] = j32 + j30;
        long j33 = jArr[1];
        long j34 = jArr[11];
        long j35 = j33 + (j34 << 4);
        jArr[1] = j35;
        long j36 = j35 + (j34 << 1);
        jArr[1] = j36;
        jArr[1] = j36 + j34;
        long j37 = jArr[0];
        long j38 = jArr[10];
        long j39 = j37 + (j38 << 4);
        jArr[0] = j39;
        long j40 = j39 + (j38 << 1);
        jArr[0] = j40;
        jArr[0] = j40 + j38;
    }

    public static void zzb(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j3 = jArr2[1];
        long j7 = jArr2[2];
        long j8 = jArr2[3];
        long j9 = jArr2[4];
        long j10 = jArr2[5];
        long j11 = jArr2[6];
        long j12 = jArr2[7];
        long j13 = jArr2[8];
        long j14 = jArr2[9];
        zze(new long[]{j * j, j * 2 * j3, ((j * j7) + (j3 * j3)) * 2, ((j * j8) + (j3 * j7)) * 2, (j * 2 * j9) + (j3 * 4 * j8) + (j7 * j7), ((j * j10) + (j3 * j9) + (j7 * j8)) * 2, ((j3 * 2 * j10) + (j * j11) + (j7 * j9) + (j8 * j8)) * 2, ((j * j12) + (j3 * j11) + (j7 * j10) + (j8 * j9)) * 2, (((((j8 * j10) + (j3 * j12)) * 2) + (j * j13) + (j7 * j11)) * 2) + (j9 * j9), ((j * j14) + (j3 * j13) + (j7 * j12) + (j8 * j11) + (j9 * j10)) * 2, ((((j3 * j14) + (j8 * j12)) * 2) + (j7 * j13) + (j9 * j11) + (j10 * j10)) * 2, ((j7 * j14) + (j8 * j13) + (j9 * j12) + (j10 * j11)) * 2, (((((j8 * j14) + (j10 * j12)) * 2) + (j9 * j13)) * 2) + (j11 * j11), ((j9 * j14) + (j10 * j13) + (j11 * j12)) * 2, ((j10 * 2 * j14) + (j11 * j13) + (j12 * j12)) * 2, ((j11 * j14) + (j12 * j13)) * 2, (j12 * 4 * j14) + (j13 * j13), j13 * 2 * j14, 2 * j14 * j14}, jArr);
    }

    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zze(jArr4, jArr);
    }

    public static void zza(long[] jArr) {
        jArr[10] = 0;
        int i7 = 0;
        while (i7 < 10) {
            long j = jArr[i7];
            long j3 = j / 67108864;
            jArr[i7] = j - (j3 << 26);
            int i8 = i7 + 1;
            long j7 = jArr[i8] + j3;
            jArr[i8] = j7;
            long j8 = j7 / 33554432;
            jArr[i8] = j7 - (j8 << 25);
            i7 += 2;
            jArr[i7] = jArr[i7] + j8;
        }
        long j9 = jArr[0];
        long j10 = jArr[10];
        long j11 = j9 + (j10 << 4);
        jArr[0] = j11;
        long j12 = j11 + (j10 << 1);
        jArr[0] = j12;
        long j13 = j12 + j10;
        jArr[0] = j13;
        jArr[10] = 0;
        long j14 = j13 / 67108864;
        jArr[0] = j13 - (j14 << 26);
        jArr[1] = jArr[1] + j14;
    }

    public static void zza(long[] jArr, long[] jArr2, long j) {
        for (int i7 = 0; i7 < 10; i7++) {
            jArr[i7] = jArr2[i7] * j;
        }
    }

    public static long[] zza(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i7 = 0; i7 < 10; i7++) {
            int i8 = zza[i7];
            jArr[i7] = (((((bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8)) | ((bArr[i8 + 2] & 255) << 16)) | ((bArr[i8 + 3] & 255) << 24)) >> zzb[i7]) & zzc[i7 & 1];
        }
        return jArr;
    }
}
