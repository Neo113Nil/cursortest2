package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecP224R1Field {
    static final int[] getHighResolutionOutputSizeshNQ4ISI = {1, 0, 0, -1, -1, -1, -1};
    private static final int[] getHighSpeedVideoSizes = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    private static final int[] getHighSpeedVideoFpsRanges = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat224.sub(iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) + 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (iArr3[2] & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            long j5 = j2 + ((4294967295L & iArr3[3]) - 1);
            iArr3[3] = (int) j5;
            if ((j5 >> 32) != 0) {
                org.bouncycastle.math.raw.Nat.decAt(7, iArr3, 4);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat.shiftUpBit(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && org.bouncycastle.math.raw.Nat224.gte(iArr2, getHighResolutionOutputSizeshNQ4ISI))) {
            getHighSpeedVideoFpsRangesFor(iArr2);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat.sub(14, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = getHighSpeedVideoFpsRanges;
            if (org.bouncycastle.math.raw.Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                org.bouncycastle.math.raw.Nat.decAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] createExt = org.bouncycastle.math.raw.Nat224.createExt();
        org.bouncycastle.math.raw.Nat224.square(iArr, createExt);
        while (true) {
            reduce(createExt, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                org.bouncycastle.math.raw.Nat224.square(iArr2, createExt);
            }
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = org.bouncycastle.math.raw.Nat224.createExt();
        org.bouncycastle.math.raw.Nat224.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void reduce32(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = i & 4294967295L;
            long j3 = (iArr[0] & 4294967295L) - j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = j4 + (4294967295L & iArr[3]) + j2;
            iArr[3] = (int) j7;
            j = j7 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || org.bouncycastle.math.raw.Nat.incAt(7, iArr, 4) == 0) && !(iArr[6] == -1 && org.bouncycastle.math.raw.Nat224.gte(iArr, getHighResolutionOutputSizeshNQ4ISI))) {
            return;
        }
        getHighSpeedVideoFpsRangesFor(iArr);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j = iArr[10] & 4294967295L;
        long j2 = iArr[11] & 4294967295L;
        long j3 = iArr[12] & 4294967295L;
        long j4 = iArr[13] & 4294967295L;
        long j5 = ((iArr[7] & 4294967295L) + j2) - 1;
        long j6 = (iArr[8] & 4294967295L) + j3;
        long j7 = (iArr[9] & 4294967295L) + j4;
        long j8 = (iArr[0] & 4294967295L) - j5;
        long j9 = (j8 >> 32) + ((iArr[1] & 4294967295L) - j6);
        int i = (int) j9;
        iArr2[1] = i;
        long j10 = (j9 >> 32) + ((iArr[2] & 4294967295L) - j7);
        int i2 = (int) j10;
        iArr2[2] = i2;
        long j11 = (j10 >> 32) + (((iArr[3] & 4294967295L) + j5) - j);
        long j12 = (j11 >> 32) + (((iArr[4] & 4294967295L) + j6) - j2);
        iArr2[4] = (int) j12;
        long j13 = (j12 >> 32) + (((iArr[5] & 4294967295L) + j7) - j3);
        iArr2[5] = (int) j13;
        long j14 = (j13 >> 32) + (((iArr[6] & 4294967295L) + j) - j4);
        iArr2[6] = (int) j14;
        long j15 = (j14 >> 32) + 1;
        long j16 = (j11 & 4294967295L) + j15;
        long j17 = (j8 & 4294967295L) - j15;
        iArr2[0] = (int) j17;
        long j18 = j17 >> 32;
        if (j18 != 0) {
            long j19 = j18 + (i & 4294967295L);
            iArr2[1] = (int) j19;
            long j20 = (j19 >> 32) + (4294967295L & i2);
            iArr2[2] = (int) j20;
            j16 += j20 >> 32;
        }
        iArr2[3] = (int) j16;
        if (((j16 >> 32) == 0 || org.bouncycastle.math.raw.Nat.incAt(7, iArr2, 4) == 0) && !(iArr2[6] == -1 && org.bouncycastle.math.raw.Nat224.gte(iArr2, getHighResolutionOutputSizeshNQ4ISI))) {
            return;
        }
        getHighSpeedVideoFpsRangesFor(iArr2);
    }

    public static void randomMult(java.security.SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void random(java.security.SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[28];
        do {
            secureRandom.nextBytes(bArr);
            org.bouncycastle.util.Pack.littleEndianToInt(bArr, 0, iArr, 0, 7);
        } while (org.bouncycastle.math.raw.Nat.lessThan(7, iArr, getHighResolutionOutputSizeshNQ4ISI) == 0);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            org.bouncycastle.math.raw.Nat224.sub(getHighResolutionOutputSizeshNQ4ISI, iArr, iArr2);
        } else {
            int[] iArr3 = getHighResolutionOutputSizeshNQ4ISI;
            org.bouncycastle.math.raw.Nat224.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat224.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && org.bouncycastle.math.raw.Nat.gte(14, iArr3, getHighSpeedVideoSizes))) {
            int[] iArr4 = getHighSpeedVideoFpsRanges;
            if (org.bouncycastle.math.raw.Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                org.bouncycastle.math.raw.Nat.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = org.bouncycastle.math.raw.Nat224.createExt();
        org.bouncycastle.math.raw.Nat224.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static int isZero(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 7; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void inv(int[] iArr, int[] iArr2) {
        org.bouncycastle.math.raw.Mod.checkedModOddInverse(getHighResolutionOutputSizeshNQ4ISI, iArr, iArr2);
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            org.bouncycastle.math.raw.Nat.shiftDownBit(7, iArr, 0, iArr2);
        } else {
            org.bouncycastle.math.raw.Nat.shiftDownBit(7, iArr2, org.bouncycastle.math.raw.Nat224.add(iArr, getHighResolutionOutputSizeshNQ4ISI, iArr2));
        }
    }

    public static int[] fromBigInteger(java.math.BigInteger bigInteger) {
        int[] fromBigInteger = org.bouncycastle.math.raw.Nat224.fromBigInteger(bigInteger);
        if (fromBigInteger[6] == -1) {
            int[] iArr = getHighResolutionOutputSizeshNQ4ISI;
            if (org.bouncycastle.math.raw.Nat224.gte(fromBigInteger, iArr)) {
                org.bouncycastle.math.raw.Nat224.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    private static void getHighSpeedVideoFpsRangesFor(int[] iArr) {
        long j = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = j2 + (4294967295L & iArr[3]) + 1;
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            org.bouncycastle.math.raw.Nat.incAt(7, iArr, 4);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat.inc(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && org.bouncycastle.math.raw.Nat224.gte(iArr2, getHighResolutionOutputSizeshNQ4ISI))) {
            getHighSpeedVideoFpsRangesFor(iArr2);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat.add(14, iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && org.bouncycastle.math.raw.Nat.gte(14, iArr3, getHighSpeedVideoSizes))) {
            int[] iArr4 = getHighSpeedVideoFpsRanges;
            if (org.bouncycastle.math.raw.Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                org.bouncycastle.math.raw.Nat.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat224.add(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && org.bouncycastle.math.raw.Nat224.gte(iArr3, getHighResolutionOutputSizeshNQ4ISI))) {
            getHighSpeedVideoFpsRangesFor(iArr3);
        }
    }
}
