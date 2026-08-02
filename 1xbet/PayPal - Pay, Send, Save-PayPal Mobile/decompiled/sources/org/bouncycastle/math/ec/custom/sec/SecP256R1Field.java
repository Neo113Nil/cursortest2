package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecP256R1Field {
    static final int[] getHighSpeedVideoFpsRanges = {-1, -1, -1, 0, 0, 0, 1, -1};
    private static final int[] Camera2StreamConfigurationMap = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat256.sub(iArr, iArr2, iArr3) != 0) {
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
            long j5 = j2 + (iArr3[3] & 4294967295L) + 1;
            iArr3[3] = (int) j5;
            long j6 = j5 >> 32;
            if (j6 != 0) {
                long j7 = j6 + (iArr3[4] & 4294967295L);
                iArr3[4] = (int) j7;
                long j8 = (j7 >> 32) + (iArr3[5] & 4294967295L);
                iArr3[5] = (int) j8;
                j6 = j8 >> 32;
            }
            long j9 = j6 + (iArr3[6] & 4294967295L) + 1;
            iArr3[6] = (int) j9;
            iArr3[7] = (int) ((j9 >> 32) + ((iArr3[7] & 4294967295L) - 1));
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat.shiftUpBit(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && org.bouncycastle.math.raw.Nat256.gte(iArr2, getHighSpeedVideoFpsRanges))) {
            getHighResolutionOutputSizeshNQ4ISI(iArr2);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat.sub(16, iArr, iArr2, iArr3) != 0) {
            org.bouncycastle.math.raw.Nat.addTo(16, Camera2StreamConfigurationMap, iArr3);
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
                long j6 = (j5 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = j4 + ((iArr[3] & 4294967295L) - j2);
            iArr[3] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (iArr[4] & 4294967295L);
                iArr[4] = (int) j9;
                long j10 = (j9 >> 32) + (iArr[5] & 4294967295L);
                iArr[5] = (int) j10;
                j8 = j10 >> 32;
            }
            long j11 = j8 + ((iArr[6] & 4294967295L) - j2);
            iArr[6] = (int) j11;
            long j12 = (j11 >> 32) + (4294967295L & iArr[7]) + j2;
            iArr[7] = (int) j12;
            j = j12 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || (iArr[7] == -1 && org.bouncycastle.math.raw.Nat256.gte(iArr, getHighSpeedVideoFpsRanges))) {
            getHighResolutionOutputSizeshNQ4ISI(iArr);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j = iArr[9] & 4294967295L;
        long j2 = iArr[10] & 4294967295L;
        long j3 = iArr[11] & 4294967295L;
        long j4 = iArr[12] & 4294967295L;
        long j5 = iArr[13] & 4294967295L;
        long j6 = iArr[14] & 4294967295L;
        long j7 = iArr[15] & 4294967295L;
        long j8 = (iArr[8] & 4294967295L) - 6;
        long j9 = j + j2;
        long j10 = (j2 + j3) - j7;
        long j11 = j3 + j4;
        long j12 = j4 + j5;
        long j13 = j5 + j6;
        long j14 = j6 + j7;
        long j15 = j13 - (j + j8);
        long j16 = ((iArr[0] & 4294967295L) - j11) - j15;
        iArr2[0] = (int) j16;
        long j17 = (j16 >> 32) + ((((iArr[1] & 4294967295L) + j9) - j12) - j14);
        iArr2[1] = (int) j17;
        long j18 = (j17 >> 32) + (((iArr[2] & 4294967295L) + j10) - j13);
        iArr2[2] = (int) j18;
        long j19 = (j18 >> 32) + ((((iArr[3] & 4294967295L) + (j11 << 1)) + j15) - j14);
        iArr2[3] = (int) j19;
        long j20 = (j19 >> 32) + ((((iArr[4] & 4294967295L) + (j12 << 1)) + j6) - j9);
        iArr2[4] = (int) j20;
        long j21 = (j20 >> 32) + (((iArr[5] & 4294967295L) + (j13 << 1)) - j10);
        iArr2[5] = (int) j21;
        long j22 = (j21 >> 32) + (iArr[6] & 4294967295L) + (j14 << 1) + j15;
        iArr2[6] = (int) j22;
        long j23 = (j22 >> 32) + (((((iArr[7] & 4294967295L) + (j7 << 1)) + j8) - j10) - j12);
        iArr2[7] = (int) j23;
        reduce32((int) ((j23 >> 32) + 6), iArr2);
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
        if (org.bouncycastle.math.raw.Nat256.mulAddTo(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && org.bouncycastle.math.raw.Nat.gte(16, iArr3, Camera2StreamConfigurationMap))) {
            org.bouncycastle.math.raw.Nat.subFrom(16, Camera2StreamConfigurationMap, iArr3);
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
        if (fromBigInteger[7] == -1) {
            int[] iArr = getHighSpeedVideoFpsRanges;
            if (org.bouncycastle.math.raw.Nat256.gte(fromBigInteger, iArr)) {
                org.bouncycastle.math.raw.Nat256.subFrom(iArr, fromBigInteger);
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
        long j5 = j2 + ((iArr[3] & 4294967295L) - 1);
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j8;
            j6 = j8 >> 32;
        }
        long j9 = j6 + ((iArr[6] & 4294967295L) - 1);
        iArr[6] = (int) j9;
        iArr[7] = (int) ((j9 >> 32) + (4294967295L & iArr[7]) + 1);
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat.inc(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && org.bouncycastle.math.raw.Nat256.gte(iArr2, getHighSpeedVideoFpsRanges))) {
            getHighResolutionOutputSizeshNQ4ISI(iArr2);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat.add(16, iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && org.bouncycastle.math.raw.Nat.gte(16, iArr3, Camera2StreamConfigurationMap))) {
            org.bouncycastle.math.raw.Nat.subFrom(16, Camera2StreamConfigurationMap, iArr3);
        }
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat256.add(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && org.bouncycastle.math.raw.Nat256.gte(iArr3, getHighSpeedVideoFpsRanges))) {
            getHighResolutionOutputSizeshNQ4ISI(iArr3);
        }
    }
}
