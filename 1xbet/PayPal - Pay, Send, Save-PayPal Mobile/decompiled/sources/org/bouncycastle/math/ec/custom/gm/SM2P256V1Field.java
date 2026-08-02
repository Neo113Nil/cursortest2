package org.bouncycastle.math.ec.custom.gm;

/* loaded from: classes17.dex */
public class SM2P256V1Field {
    static final int[] getHighSpeedVideoFpsRanges = {-1, -1, 0, -1, -1, -1, -1, -2};
    private static final int[] getHighSpeedVideoFpsRangesFor = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat256.sub(iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j3;
                j2 = j3 >> 32;
            }
            long j4 = j2 + (iArr3[2] & 4294967295L) + 1;
            iArr3[2] = (int) j4;
            long j5 = (j4 >> 32) + ((iArr3[3] & 4294967295L) - 1);
            iArr3[3] = (int) j5;
            long j6 = j5 >> 32;
            if (j6 != 0) {
                long j7 = j6 + (iArr3[4] & 4294967295L);
                iArr3[4] = (int) j7;
                long j8 = (j7 >> 32) + (iArr3[5] & 4294967295L);
                iArr3[5] = (int) j8;
                long j9 = (j8 >> 32) + (iArr3[6] & 4294967295L);
                iArr3[6] = (int) j9;
                j6 = j9 >> 32;
            }
            iArr3[7] = (int) (j6 + ((4294967295L & iArr3[7]) - 1));
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat.shiftUpBit(8, iArr, 0, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && org.bouncycastle.math.raw.Nat256.gte(iArr2, getHighSpeedVideoFpsRanges))) {
            getHighSpeedVideoFpsRangesFor(iArr2);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat.sub(16, iArr, iArr2, iArr3) != 0) {
            org.bouncycastle.math.raw.Nat.addTo(16, getHighSpeedVideoFpsRangesFor, iArr3);
        }
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] createExt = org.bouncycastle.math.raw.Nat256.createExt();
        org.bouncycastle.math.raw.Nat256.square(iArr, createExt);
        while (true) {
            reduce(createExt, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                org.bouncycastle.math.raw.Nat256.square(iArr2, createExt);
            }
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = org.bouncycastle.math.raw.Nat256.createExt();
        org.bouncycastle.math.raw.Nat256.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void reduce32(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = i & 4294967295L;
            long j3 = (iArr[0] & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = j4 + ((iArr[2] & 4294967295L) - j2);
            iArr[2] = (int) j6;
            long j7 = (j6 >> 32) + (iArr[3] & 4294967295L) + j2;
            iArr[3] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (iArr[4] & 4294967295L);
                iArr[4] = (int) j9;
                long j10 = (j9 >> 32) + (iArr[5] & 4294967295L);
                iArr[5] = (int) j10;
                long j11 = (j10 >> 32) + (iArr[6] & 4294967295L);
                iArr[6] = (int) j11;
                j8 = j11 >> 32;
            }
            long j12 = j8 + (4294967295L & iArr[7]) + j2;
            iArr[7] = (int) j12;
            j = j12 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && org.bouncycastle.math.raw.Nat256.gte(iArr, getHighSpeedVideoFpsRanges))) {
            getHighSpeedVideoFpsRangesFor(iArr);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j = iArr[8] & 4294967295L;
        long j2 = iArr[9] & 4294967295L;
        long j3 = iArr[10] & 4294967295L;
        long j4 = iArr[11] & 4294967295L;
        long j5 = iArr[12] & 4294967295L;
        long j6 = iArr[13] & 4294967295L;
        long j7 = iArr[14] & 4294967295L;
        long j8 = iArr[15] & 4294967295L;
        long j9 = j3 + j4;
        long j10 = j6 + j7;
        long j11 = j10 + (j8 << 1);
        long j12 = j + j2 + j10;
        long j13 = j9 + j5 + j8 + j12;
        long j14 = (iArr[0] & 4294967295L) + j13 + j6 + j7 + j8;
        iArr2[0] = (int) j14;
        long j15 = (j14 >> 32) + (((iArr[1] & 4294967295L) + j13) - j) + j7 + j8;
        iArr2[1] = (int) j15;
        long j16 = (j15 >> 32) + ((iArr[2] & 4294967295L) - j12);
        iArr2[2] = (int) j16;
        long j17 = (j16 >> 32) + ((((iArr[3] & 4294967295L) + j13) - j2) - j3) + j6;
        iArr2[3] = (int) j17;
        long j18 = (j17 >> 32) + ((((iArr[4] & 4294967295L) + j13) - j9) - j) + j7;
        iArr2[4] = (int) j18;
        long j19 = (j18 >> 32) + (iArr[5] & 4294967295L) + j11 + j3;
        iArr2[5] = (int) j19;
        long j20 = (j19 >> 32) + (iArr[6] & 4294967295L) + j4 + j7 + j8;
        iArr2[6] = (int) j20;
        long j21 = (j20 >> 32) + (iArr[7] & 4294967295L) + j13 + j11 + j5;
        iArr2[7] = (int) j21;
        reduce32((int) (j21 >> 32), iArr2);
    }

    public static void randomMult(java.security.SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void random(java.security.SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            org.bouncycastle.util.Pack.littleEndianToInt(bArr, 0, iArr, 0, 8);
        } while (org.bouncycastle.math.raw.Nat.lessThan(8, iArr, getHighSpeedVideoFpsRanges) == 0);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            org.bouncycastle.math.raw.Nat256.sub(getHighSpeedVideoFpsRanges, iArr, iArr2);
        } else {
            int[] iArr3 = getHighSpeedVideoFpsRanges;
            org.bouncycastle.math.raw.Nat256.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat256.mulAddTo(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && org.bouncycastle.math.raw.Nat.gte(16, iArr3, getHighSpeedVideoFpsRangesFor))) {
            org.bouncycastle.math.raw.Nat.subFrom(16, getHighSpeedVideoFpsRangesFor, iArr3);
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = org.bouncycastle.math.raw.Nat256.createExt();
        org.bouncycastle.math.raw.Nat256.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static int isZero(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void inv(int[] iArr, int[] iArr2) {
        org.bouncycastle.math.raw.Mod.checkedModOddInverse(getHighSpeedVideoFpsRanges, iArr, iArr2);
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            org.bouncycastle.math.raw.Nat.shiftDownBit(8, iArr, 0, iArr2);
        } else {
            org.bouncycastle.math.raw.Nat.shiftDownBit(8, iArr2, org.bouncycastle.math.raw.Nat256.add(iArr, getHighSpeedVideoFpsRanges, iArr2));
        }
    }

    public static int[] fromBigInteger(java.math.BigInteger bigInteger) {
        int[] fromBigInteger = org.bouncycastle.math.raw.Nat256.fromBigInteger(bigInteger);
        if ((fromBigInteger[7] >>> 1) >= Integer.MAX_VALUE) {
            int[] iArr = getHighSpeedVideoFpsRanges;
            if (org.bouncycastle.math.raw.Nat256.gte(fromBigInteger, iArr)) {
                org.bouncycastle.math.raw.Nat256.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    private static void getHighSpeedVideoFpsRangesFor(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + ((iArr[2] & 4294967295L) - 1);
        iArr[2] = (int) j4;
        long j5 = (j4 >> 32) + (iArr[3] & 4294967295L) + 1;
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j8;
            long j9 = (j8 >> 32) + (iArr[6] & 4294967295L);
            iArr[6] = (int) j9;
            j6 = j9 >> 32;
        }
        iArr[7] = (int) (j6 + (4294967295L & iArr[7]) + 1);
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat.inc(8, iArr, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && org.bouncycastle.math.raw.Nat256.gte(iArr2, getHighSpeedVideoFpsRanges))) {
            getHighSpeedVideoFpsRangesFor(iArr2);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat.add(16, iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && org.bouncycastle.math.raw.Nat.gte(16, iArr3, getHighSpeedVideoFpsRangesFor))) {
            org.bouncycastle.math.raw.Nat.subFrom(16, getHighSpeedVideoFpsRangesFor, iArr3);
        }
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat256.add(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= Integer.MAX_VALUE && org.bouncycastle.math.raw.Nat256.gte(iArr3, getHighSpeedVideoFpsRanges))) {
            getHighSpeedVideoFpsRangesFor(iArr3);
        }
    }
}
