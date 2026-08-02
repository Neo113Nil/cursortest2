package org.bouncycastle.crypto.modes.kgcm;

/* loaded from: classes17.dex */
public class KGCMUtil_128 {
    public static final int SIZE = 2;

    public static void zero(long[] jArr) {
        jArr[0] = 0;
        jArr[1] = 0;
    }

    public static void x(long[] jArr) {
        jArr[0] = 2;
        jArr[1] = 0;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        org.bouncycastle.math.raw.Interleave.expand64To128(jArr[0], jArr3, 0);
        org.bouncycastle.math.raw.Interleave.expand64To128(jArr[1], jArr3, 2);
        long j = jArr3[0];
        long j2 = jArr3[1];
        long j3 = jArr3[2];
        long j4 = jArr3[3];
        long j5 = j3 ^ ((j4 >>> 57) ^ ((j4 >>> 63) ^ (j4 >>> 62)));
        jArr2[0] = j ^ ((((j5 << 1) ^ j5) ^ (j5 << 2)) ^ (j5 << 7));
        jArr2[1] = ((j5 >>> 57) ^ ((j5 >>> 63) ^ (j5 >>> 62))) ^ (((((j4 << 1) ^ j4) ^ (j4 << 2)) ^ (j4 << 7)) ^ j2);
    }

    public static void one(long[] jArr) {
        jArr[0] = 1;
        jArr[1] = 0;
    }

    public static void multiplyX8(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = j2 >>> 56;
        jArr2[0] = ((j3 << 2) ^ (((j << 8) ^ j3) ^ (j3 << 1))) ^ (j3 << 7);
        jArr2[1] = (j >>> 56) | (j2 << 8);
    }

    public static void multiplyX(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        jArr2[0] = ((j2 >> 63) & 135) ^ (j << 1);
        jArr2[1] = (j >>> 63) | (j2 << 1);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        int i = 0;
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr2[0];
        long j4 = jArr2[1];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        while (i < 64) {
            long j8 = j7;
            long j9 = -(j & 1);
            long j10 = j6 ^ (j3 & j9);
            long j11 = -(j2 & 1);
            j2 >>>= 1;
            j5 ^= j11 & j4;
            long j12 = (j4 << 1) | (j3 >>> 63);
            j7 = ((j4 & j9) ^ j8) ^ (j3 & j11);
            i++;
            j >>>= 1;
            j3 = (j3 << 1) ^ ((j4 >> 63) & 135);
            j4 = j12;
            j6 = j10;
        }
        jArr3[0] = ((((j5 << 1) ^ j5) ^ (j5 << 2)) ^ (j5 << 7)) ^ j6;
        jArr3[1] = (((j5 >>> 63) ^ (j5 >>> 62)) ^ (j5 >>> 57)) ^ j7;
    }

    public static boolean equal(long[] jArr, long[] jArr2) {
        return ((jArr2[1] ^ jArr[1]) | (jArr[0] ^ jArr2[0])) == 0;
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }
}
