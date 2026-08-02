package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecP192K1Field {
    static final int[] getHighSpeedVideoFpsRanges = {-4553, -2, -1, -1, -1, -1};
    private static final int[] getHighSpeedVideoFpsRangesFor = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};
    private static final int[] getHighSpeedVideoSizes = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    public static void twice(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat.shiftUpBit(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && org.bouncycastle.math.raw.Nat192.gte(iArr2, getHighSpeedVideoFpsRanges))) {
            org.bouncycastle.math.raw.Nat.add33To(6, 4553, iArr2);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat.sub(12, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = getHighSpeedVideoSizes;
            if (org.bouncycastle.math.raw.Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                org.bouncycastle.math.raw.Nat.decAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat192.sub(iArr, iArr2, iArr3) != 0) {
            org.bouncycastle.math.raw.Nat.sub33From(6, 4553, iArr3);
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
        if ((i == 0 || org.bouncycastle.math.raw.Nat192.mul33WordAdd(4553, i, iArr, 0) == 0) && !(iArr[5] == -1 && org.bouncycastle.math.raw.Nat192.gte(iArr, getHighSpeedVideoFpsRanges))) {
            return;
        }
        org.bouncycastle.math.raw.Nat.add33To(6, 4553, iArr);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat192.mul33DWordAdd(4553, org.bouncycastle.math.raw.Nat192.mul33Add(4553, iArr, 6, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[5] == -1 && org.bouncycastle.math.raw.Nat192.gte(iArr2, getHighSpeedVideoFpsRanges))) {
            org.bouncycastle.math.raw.Nat.add33To(6, 4553, iArr2);
        }
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
        if (org.bouncycastle.math.raw.Nat192.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && org.bouncycastle.math.raw.Nat.gte(12, iArr3, getHighSpeedVideoFpsRangesFor))) {
            int[] iArr4 = getHighSpeedVideoSizes;
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

    public static void addOne(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat.inc(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && org.bouncycastle.math.raw.Nat192.gte(iArr2, getHighSpeedVideoFpsRanges))) {
            org.bouncycastle.math.raw.Nat.add33To(6, 4553, iArr2);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat.add(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && org.bouncycastle.math.raw.Nat.gte(12, iArr3, getHighSpeedVideoFpsRangesFor))) {
            int[] iArr4 = getHighSpeedVideoSizes;
            if (org.bouncycastle.math.raw.Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                org.bouncycastle.math.raw.Nat.incAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat192.add(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && org.bouncycastle.math.raw.Nat192.gte(iArr3, getHighSpeedVideoFpsRanges))) {
            org.bouncycastle.math.raw.Nat.add33To(6, 4553, iArr3);
        }
    }
}
