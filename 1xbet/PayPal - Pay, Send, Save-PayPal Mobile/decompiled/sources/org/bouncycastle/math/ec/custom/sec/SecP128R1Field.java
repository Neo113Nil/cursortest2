package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecP128R1Field {
    static final int[] getHighSpeedVideoFpsRanges = {-1, -1, -1, -3};
    private static final int[] getHighSpeedVideoSizes = {1, 0, 0, 4, -2, -1, 3, -4};
    private static final int[] getHighResolutionOutputSizeshNQ4ISI = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat128.sub(iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (iArr3[2] & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            iArr3[3] = (int) (j2 + ((4294967295L & iArr3[3]) - 2));
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat.shiftUpBit(4, iArr, 0, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && org.bouncycastle.math.raw.Nat128.gte(iArr2, getHighSpeedVideoFpsRanges))) {
            getHighResolutionOutputSizeshNQ4ISI(iArr2);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat.sub(10, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = getHighResolutionOutputSizeshNQ4ISI;
            org.bouncycastle.math.raw.Nat.subFrom(iArr4.length, iArr4, iArr3);
        }
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] createExt = org.bouncycastle.math.raw.Nat128.createExt();
        org.bouncycastle.math.raw.Nat128.square(iArr, createExt);
        while (true) {
            reduce(createExt, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                org.bouncycastle.math.raw.Nat128.square(iArr2, createExt);
            }
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = org.bouncycastle.math.raw.Nat128.createExt();
        org.bouncycastle.math.raw.Nat128.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void reduce32(int i, int[] iArr) {
        while (i != 0) {
            long j = i & 4294967295L;
            long j2 = (iArr[0] & 4294967295L) + j;
            iArr[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j4;
                long j5 = (j4 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = j3 + (4294967295L & iArr[3]) + (j << 1);
            iArr[3] = (int) j6;
            i = (int) (j6 >> 32);
        }
        if ((iArr[3] >>> 1) < 2147483646 || !org.bouncycastle.math.raw.Nat128.gte(iArr, getHighSpeedVideoFpsRanges)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(iArr);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j = iArr[0];
        long j2 = iArr[1];
        long j3 = iArr[2];
        long j4 = iArr[3];
        long j5 = iArr[4];
        long j6 = iArr[5];
        long j7 = iArr[7] & 4294967295L;
        long j8 = (iArr[6] & 4294967295L) + (j7 << 1);
        long j9 = (j6 & 4294967295L) + (j8 << 1);
        long j10 = (j5 & 4294967295L) + (j9 << 1);
        long j11 = (j & 4294967295L) + j10;
        iArr2[0] = (int) j11;
        long j12 = (j2 & 4294967295L) + j9 + (j11 >>> 32);
        iArr2[1] = (int) j12;
        long j13 = (j3 & 4294967295L) + j8 + (j12 >>> 32);
        iArr2[2] = (int) j13;
        long j14 = (j4 & 4294967295L) + j7 + (j10 << 1) + (j13 >>> 32);
        iArr2[3] = (int) j14;
        reduce32((int) (j14 >>> 32), iArr2);
    }

    public static void randomMult(java.security.SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void random(java.security.SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[16];
        do {
            secureRandom.nextBytes(bArr);
            org.bouncycastle.util.Pack.littleEndianToInt(bArr, 0, iArr, 0, 4);
        } while (org.bouncycastle.math.raw.Nat.lessThan(4, iArr, getHighSpeedVideoFpsRanges) == 0);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            org.bouncycastle.math.raw.Nat128.sub(getHighSpeedVideoFpsRanges, iArr, iArr2);
        } else {
            int[] iArr3 = getHighSpeedVideoFpsRanges;
            org.bouncycastle.math.raw.Nat128.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat128.mulAddTo(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && org.bouncycastle.math.raw.Nat256.gte(iArr3, getHighSpeedVideoSizes))) {
            int[] iArr4 = getHighResolutionOutputSizeshNQ4ISI;
            org.bouncycastle.math.raw.Nat.addTo(iArr4.length, iArr4, iArr3);
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = org.bouncycastle.math.raw.Nat128.createExt();
        org.bouncycastle.math.raw.Nat128.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static int isZero(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void inv(int[] iArr, int[] iArr2) {
        org.bouncycastle.math.raw.Mod.checkedModOddInverse(getHighSpeedVideoFpsRanges, iArr, iArr2);
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            org.bouncycastle.math.raw.Nat.shiftDownBit(4, iArr, 0, iArr2);
        } else {
            org.bouncycastle.math.raw.Nat.shiftDownBit(4, iArr2, org.bouncycastle.math.raw.Nat128.add(iArr, getHighSpeedVideoFpsRanges, iArr2));
        }
    }

    public static int[] fromBigInteger(java.math.BigInteger bigInteger) {
        int[] fromBigInteger = org.bouncycastle.math.raw.Nat128.fromBigInteger(bigInteger);
        if ((fromBigInteger[3] >>> 1) >= 2147483646) {
            int[] iArr = getHighSpeedVideoFpsRanges;
            if (org.bouncycastle.math.raw.Nat128.gte(fromBigInteger, iArr)) {
                org.bouncycastle.math.raw.Nat128.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        iArr[3] = (int) (j2 + (4294967295L & iArr[3]) + 2);
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat.inc(4, iArr, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && org.bouncycastle.math.raw.Nat128.gte(iArr2, getHighSpeedVideoFpsRanges))) {
            getHighResolutionOutputSizeshNQ4ISI(iArr2);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat256.add(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && org.bouncycastle.math.raw.Nat256.gte(iArr3, getHighSpeedVideoSizes))) {
            int[] iArr4 = getHighResolutionOutputSizeshNQ4ISI;
            org.bouncycastle.math.raw.Nat.addTo(iArr4.length, iArr4, iArr3);
        }
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat128.add(iArr, iArr2, iArr3) != 0 || ((iArr3[3] >>> 1) >= 2147483646 && org.bouncycastle.math.raw.Nat128.gte(iArr3, getHighSpeedVideoFpsRanges))) {
            getHighResolutionOutputSizeshNQ4ISI(iArr3);
        }
    }
}
