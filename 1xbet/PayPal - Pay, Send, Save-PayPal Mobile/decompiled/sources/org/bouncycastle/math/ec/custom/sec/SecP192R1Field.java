package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecP192R1Field {
    static final int[] getHighSpeedVideoFpsRanges = {-1, -1, -2, -1, -1, -1};
    private static final int[] getHighResolutionOutputSizeshNQ4ISI = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    private static final int[] Camera2StreamConfigurationMap = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat192.sub(iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j3;
                j2 = j3 >> 32;
            }
            long j4 = j2 + ((4294967295L & iArr3[2]) - 1);
            iArr3[2] = (int) j4;
            if ((j4 >> 32) != 0) {
                org.bouncycastle.math.raw.Nat.decAt(6, iArr3, 3);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat.shiftUpBit(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && org.bouncycastle.math.raw.Nat192.gte(iArr2, getHighSpeedVideoFpsRanges))) {
            getHighSpeedVideoFpsRanges(iArr2);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat.sub(12, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = Camera2StreamConfigurationMap;
            if (org.bouncycastle.math.raw.Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                org.bouncycastle.math.raw.Nat.decAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] createExt = org.bouncycastle.math.raw.Nat192.createExt();
        org.bouncycastle.math.raw.Nat192.square(iArr, createExt);
        while (true) {
            reduce(createExt, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                org.bouncycastle.math.raw.Nat192.square(iArr2, createExt);
            }
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = org.bouncycastle.math.raw.Nat192.createExt();
        org.bouncycastle.math.raw.Nat192.square(iArr, createExt);
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
            long j6 = j4 + (4294967295L & iArr[2]) + j2;
            iArr[2] = (int) j6;
            j = j6 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || org.bouncycastle.math.raw.Nat.incAt(6, iArr, 3) == 0) && !(iArr[5] == -1 && org.bouncycastle.math.raw.Nat192.gte(iArr, getHighSpeedVideoFpsRanges))) {
            return;
        }
        getHighSpeedVideoFpsRanges(iArr);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j = iArr[6] & 4294967295L;
        long j2 = iArr[7] & 4294967295L;
        long j3 = iArr[8];
        long j4 = iArr[9];
        long j5 = (iArr[10] & 4294967295L) + j;
        long j6 = (iArr[11] & 4294967295L) + j2;
        long j7 = (iArr[0] & 4294967295L) + j5;
        int i = (int) j7;
        long j8 = (j7 >> 32) + (iArr[1] & 4294967295L) + j6;
        int i2 = (int) j8;
        iArr2[1] = i2;
        long j9 = j5 + (j3 & 4294967295L);
        long j10 = j6 + (j4 & 4294967295L);
        long j11 = (j8 >> 32) + (iArr[2] & 4294967295L) + j9;
        long j12 = (j11 >> 32) + (iArr[3] & 4294967295L) + j10;
        iArr2[3] = (int) j12;
        long j13 = (j12 >> 32) + (iArr[4] & 4294967295L) + (j9 - j);
        iArr2[4] = (int) j13;
        long j14 = (j13 >> 32) + (iArr[5] & 4294967295L) + (j10 - j2);
        iArr2[5] = (int) j14;
        long j15 = j14 >> 32;
        long j16 = (j11 & 4294967295L) + j15;
        long j17 = j15 + (i & 4294967295L);
        iArr2[0] = (int) j17;
        long j18 = j17 >> 32;
        if (j18 != 0) {
            long j19 = j18 + (4294967295L & i2);
            iArr2[1] = (int) j19;
            j16 += j19 >> 32;
        }
        iArr2[2] = (int) j16;
        if (((j16 >> 32) == 0 || org.bouncycastle.math.raw.Nat.incAt(6, iArr2, 3) == 0) && !(iArr2[5] == -1 && org.bouncycastle.math.raw.Nat192.gte(iArr2, getHighSpeedVideoFpsRanges))) {
            return;
        }
        getHighSpeedVideoFpsRanges(iArr2);
    }

    public static void randomMult(java.security.SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void random(java.security.SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[24];
        do {
            secureRandom.nextBytes(bArr);
            org.bouncycastle.util.Pack.littleEndianToInt(bArr, 0, iArr, 0, 6);
        } while (org.bouncycastle.math.raw.Nat.lessThan(6, iArr, getHighSpeedVideoFpsRanges) == 0);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            org.bouncycastle.math.raw.Nat192.sub(getHighSpeedVideoFpsRanges, iArr, iArr2);
        } else {
            int[] iArr3 = getHighSpeedVideoFpsRanges;
            org.bouncycastle.math.raw.Nat192.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat192.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && org.bouncycastle.math.raw.Nat.gte(12, iArr3, getHighResolutionOutputSizeshNQ4ISI))) {
            int[] iArr4 = Camera2StreamConfigurationMap;
            if (org.bouncycastle.math.raw.Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                org.bouncycastle.math.raw.Nat.incAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = org.bouncycastle.math.raw.Nat192.createExt();
        org.bouncycastle.math.raw.Nat192.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static int isZero(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void inv(int[] iArr, int[] iArr2) {
        org.bouncycastle.math.raw.Mod.checkedModOddInverse(getHighSpeedVideoFpsRanges, iArr, iArr2);
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            org.bouncycastle.math.raw.Nat.shiftDownBit(6, iArr, 0, iArr2);
        } else {
            org.bouncycastle.math.raw.Nat.shiftDownBit(6, iArr2, org.bouncycastle.math.raw.Nat192.add(iArr, getHighSpeedVideoFpsRanges, iArr2));
        }
    }

    public static int[] fromBigInteger(java.math.BigInteger bigInteger) {
        int[] fromBigInteger = org.bouncycastle.math.raw.Nat192.fromBigInteger(bigInteger);
        if (fromBigInteger[5] == -1) {
            int[] iArr = getHighSpeedVideoFpsRanges;
            if (org.bouncycastle.math.raw.Nat192.gte(fromBigInteger, iArr)) {
                org.bouncycastle.math.raw.Nat192.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    private static void getHighSpeedVideoFpsRanges(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + (4294967295L & iArr[2]) + 1;
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            org.bouncycastle.math.raw.Nat.incAt(6, iArr, 3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat.inc(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && org.bouncycastle.math.raw.Nat192.gte(iArr2, getHighSpeedVideoFpsRanges))) {
            getHighSpeedVideoFpsRanges(iArr2);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat.add(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && org.bouncycastle.math.raw.Nat.gte(12, iArr3, getHighResolutionOutputSizeshNQ4ISI))) {
            int[] iArr4 = Camera2StreamConfigurationMap;
            if (org.bouncycastle.math.raw.Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                org.bouncycastle.math.raw.Nat.incAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat192.add(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && org.bouncycastle.math.raw.Nat192.gte(iArr3, getHighSpeedVideoFpsRanges))) {
            getHighSpeedVideoFpsRanges(iArr3);
        }
    }
}
