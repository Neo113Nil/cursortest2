package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecP160R2Field {
    static final int[] getHighSpeedVideoFpsRangesFor = {-21389, -2, -1, -1, -1};
    private static final int[] getHighResolutionOutputSizeshNQ4ISI = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};
    private static final int[] getHighSpeedVideoSizes = {-457489321, -42779, -2, -1, -1, 42777, 2};

    public static void twice(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat.shiftUpBit(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && org.bouncycastle.math.raw.Nat160.gte(iArr2, getHighSpeedVideoFpsRangesFor))) {
            org.bouncycastle.math.raw.Nat.add33To(5, 21389, iArr2);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat.sub(10, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = getHighSpeedVideoSizes;
            if (org.bouncycastle.math.raw.Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                org.bouncycastle.math.raw.Nat.decAt(10, iArr3, iArr4.length);
            }
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat160.sub(iArr, iArr2, iArr3) != 0) {
            org.bouncycastle.math.raw.Nat.sub33From(5, 21389, iArr3);
        }
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] createExt = org.bouncycastle.math.raw.Nat160.createExt();
        org.bouncycastle.math.raw.Nat160.square(iArr, createExt);
        while (true) {
            reduce(createExt, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                org.bouncycastle.math.raw.Nat160.square(iArr2, createExt);
            }
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = org.bouncycastle.math.raw.Nat160.createExt();
        org.bouncycastle.math.raw.Nat160.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void reduce32(int i, int[] iArr) {
        if ((i == 0 || org.bouncycastle.math.raw.Nat160.mul33WordAdd(21389, i, iArr, 0) == 0) && !(iArr[4] == -1 && org.bouncycastle.math.raw.Nat160.gte(iArr, getHighSpeedVideoFpsRangesFor))) {
            return;
        }
        org.bouncycastle.math.raw.Nat.add33To(5, 21389, iArr);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat160.mul33DWordAdd(21389, org.bouncycastle.math.raw.Nat160.mul33Add(21389, iArr, 5, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[4] == -1 && org.bouncycastle.math.raw.Nat160.gte(iArr2, getHighSpeedVideoFpsRangesFor))) {
            org.bouncycastle.math.raw.Nat.add33To(5, 21389, iArr2);
        }
    }

    public static void randomMult(java.security.SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void random(java.security.SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[20];
        do {
            secureRandom.nextBytes(bArr);
            org.bouncycastle.util.Pack.littleEndianToInt(bArr, 0, iArr, 0, 5);
        } while (org.bouncycastle.math.raw.Nat.lessThan(5, iArr, getHighSpeedVideoFpsRangesFor) == 0);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            org.bouncycastle.math.raw.Nat160.sub(getHighSpeedVideoFpsRangesFor, iArr, iArr2);
        } else {
            int[] iArr3 = getHighSpeedVideoFpsRangesFor;
            org.bouncycastle.math.raw.Nat160.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat160.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && org.bouncycastle.math.raw.Nat.gte(10, iArr3, getHighResolutionOutputSizeshNQ4ISI))) {
            int[] iArr4 = getHighSpeedVideoSizes;
            if (org.bouncycastle.math.raw.Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                org.bouncycastle.math.raw.Nat.incAt(10, iArr3, iArr4.length);
            }
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = org.bouncycastle.math.raw.Nat160.createExt();
        org.bouncycastle.math.raw.Nat160.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static int isZero(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void inv(int[] iArr, int[] iArr2) {
        org.bouncycastle.math.raw.Mod.checkedModOddInverse(getHighSpeedVideoFpsRangesFor, iArr, iArr2);
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            org.bouncycastle.math.raw.Nat.shiftDownBit(5, iArr, 0, iArr2);
        } else {
            org.bouncycastle.math.raw.Nat.shiftDownBit(5, iArr2, org.bouncycastle.math.raw.Nat160.add(iArr, getHighSpeedVideoFpsRangesFor, iArr2));
        }
    }

    public static int[] fromBigInteger(java.math.BigInteger bigInteger) {
        int[] fromBigInteger = org.bouncycastle.math.raw.Nat160.fromBigInteger(bigInteger);
        if (fromBigInteger[4] == -1) {
            int[] iArr = getHighSpeedVideoFpsRangesFor;
            if (org.bouncycastle.math.raw.Nat160.gte(fromBigInteger, iArr)) {
                org.bouncycastle.math.raw.Nat160.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat.inc(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && org.bouncycastle.math.raw.Nat160.gte(iArr2, getHighSpeedVideoFpsRangesFor))) {
            org.bouncycastle.math.raw.Nat.add33To(5, 21389, iArr2);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat.add(10, iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && org.bouncycastle.math.raw.Nat.gte(10, iArr3, getHighResolutionOutputSizeshNQ4ISI))) {
            int[] iArr4 = getHighSpeedVideoSizes;
            if (org.bouncycastle.math.raw.Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                org.bouncycastle.math.raw.Nat.incAt(10, iArr3, iArr4.length);
            }
        }
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat160.add(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && org.bouncycastle.math.raw.Nat160.gte(iArr3, getHighSpeedVideoFpsRangesFor))) {
            org.bouncycastle.math.raw.Nat.add33To(5, 21389, iArr3);
        }
    }
}
