package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecP224K1Field {
    static final int[] getHighResolutionOutputSizeshNQ4ISI = {-6803, -2, -1, -1, -1, -1, -1};
    private static final int[] getHighSpeedVideoFpsRanges = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};
    private static final int[] Camera2StreamConfigurationMap = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    public static void twice(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat.shiftUpBit(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && org.bouncycastle.math.raw.Nat224.gte(iArr2, getHighResolutionOutputSizeshNQ4ISI))) {
            org.bouncycastle.math.raw.Nat.add33To(7, 6803, iArr2);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat.sub(14, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = Camera2StreamConfigurationMap;
            if (org.bouncycastle.math.raw.Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                org.bouncycastle.math.raw.Nat.decAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat224.sub(iArr, iArr2, iArr3) != 0) {
            org.bouncycastle.math.raw.Nat.sub33From(7, 6803, iArr3);
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
        if ((i == 0 || org.bouncycastle.math.raw.Nat224.mul33WordAdd(6803, i, iArr, 0) == 0) && !(iArr[6] == -1 && org.bouncycastle.math.raw.Nat224.gte(iArr, getHighResolutionOutputSizeshNQ4ISI))) {
            return;
        }
        org.bouncycastle.math.raw.Nat.add33To(7, 6803, iArr);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat224.mul33DWordAdd(6803, org.bouncycastle.math.raw.Nat224.mul33Add(6803, iArr, 7, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[6] == -1 && org.bouncycastle.math.raw.Nat224.gte(iArr2, getHighResolutionOutputSizeshNQ4ISI))) {
            org.bouncycastle.math.raw.Nat.add33To(7, 6803, iArr2);
        }
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
        if (org.bouncycastle.math.raw.Nat224.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && org.bouncycastle.math.raw.Nat.gte(14, iArr3, getHighSpeedVideoFpsRanges))) {
            int[] iArr4 = Camera2StreamConfigurationMap;
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
        if (fromBigInteger[6] == -1 && org.bouncycastle.math.raw.Nat224.gte(fromBigInteger, getHighResolutionOutputSizeshNQ4ISI)) {
            org.bouncycastle.math.raw.Nat.add33To(7, 6803, fromBigInteger);
        }
        return fromBigInteger;
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat.inc(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && org.bouncycastle.math.raw.Nat224.gte(iArr2, getHighResolutionOutputSizeshNQ4ISI))) {
            org.bouncycastle.math.raw.Nat.add33To(7, 6803, iArr2);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat.add(14, iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && org.bouncycastle.math.raw.Nat.gte(14, iArr3, getHighSpeedVideoFpsRanges))) {
            int[] iArr4 = Camera2StreamConfigurationMap;
            if (org.bouncycastle.math.raw.Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                org.bouncycastle.math.raw.Nat.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat224.add(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && org.bouncycastle.math.raw.Nat224.gte(iArr3, getHighResolutionOutputSizeshNQ4ISI))) {
            org.bouncycastle.math.raw.Nat.add33To(7, 6803, iArr3);
        }
    }
}
