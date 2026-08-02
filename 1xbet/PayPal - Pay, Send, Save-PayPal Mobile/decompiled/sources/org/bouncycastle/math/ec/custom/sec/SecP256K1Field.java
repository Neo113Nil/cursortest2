package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecP256K1Field {
    static final int[] getHighResolutionOutputSizeshNQ4ISI = {-977, -2, -1, -1, -1, -1, -1, -1};
    private static final int[] getHighSpeedVideoSizes = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};
    private static final int[] getHighSpeedVideoFpsRangesFor = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    public static void twice(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat.shiftUpBit(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && org.bouncycastle.math.raw.Nat256.gte(iArr2, getHighResolutionOutputSizeshNQ4ISI))) {
            org.bouncycastle.math.raw.Nat.add33To(8, 977, iArr2);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat.sub(16, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = getHighSpeedVideoFpsRangesFor;
            if (org.bouncycastle.math.raw.Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                org.bouncycastle.math.raw.Nat.decAt(16, iArr3, iArr4.length);
            }
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat256.sub(iArr, iArr2, iArr3) != 0) {
            org.bouncycastle.math.raw.Nat.sub33From(8, 977, iArr3);
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
        if ((i == 0 || org.bouncycastle.math.raw.Nat256.mul33WordAdd(977, i, iArr, 0) == 0) && !(iArr[7] == -1 && org.bouncycastle.math.raw.Nat256.gte(iArr, getHighResolutionOutputSizeshNQ4ISI))) {
            return;
        }
        org.bouncycastle.math.raw.Nat.add33To(8, 977, iArr);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat256.mul33DWordAdd(977, org.bouncycastle.math.raw.Nat256.mul33Add(977, iArr, 8, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[7] == -1 && org.bouncycastle.math.raw.Nat256.gte(iArr2, getHighResolutionOutputSizeshNQ4ISI))) {
            org.bouncycastle.math.raw.Nat.add33To(8, 977, iArr2);
        }
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
        } while (org.bouncycastle.math.raw.Nat.lessThan(8, iArr, getHighResolutionOutputSizeshNQ4ISI) == 0);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            org.bouncycastle.math.raw.Nat256.sub(getHighResolutionOutputSizeshNQ4ISI, iArr, iArr2);
        } else {
            int[] iArr3 = getHighResolutionOutputSizeshNQ4ISI;
            org.bouncycastle.math.raw.Nat256.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat256.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && org.bouncycastle.math.raw.Nat.gte(16, iArr3, getHighSpeedVideoSizes))) {
            int[] iArr4 = getHighSpeedVideoFpsRangesFor;
            if (org.bouncycastle.math.raw.Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                org.bouncycastle.math.raw.Nat.incAt(16, iArr3, iArr4.length);
            }
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
        org.bouncycastle.math.raw.Mod.checkedModOddInverse(getHighResolutionOutputSizeshNQ4ISI, iArr, iArr2);
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            org.bouncycastle.math.raw.Nat.shiftDownBit(8, iArr, 0, iArr2);
        } else {
            org.bouncycastle.math.raw.Nat.shiftDownBit(8, iArr2, org.bouncycastle.math.raw.Nat256.add(iArr, getHighResolutionOutputSizeshNQ4ISI, iArr2));
        }
    }

    public static int[] fromBigInteger(java.math.BigInteger bigInteger) {
        int[] fromBigInteger = org.bouncycastle.math.raw.Nat256.fromBigInteger(bigInteger);
        if (fromBigInteger[7] == -1) {
            int[] iArr = getHighResolutionOutputSizeshNQ4ISI;
            if (org.bouncycastle.math.raw.Nat256.gte(fromBigInteger, iArr)) {
                org.bouncycastle.math.raw.Nat256.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat.inc(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && org.bouncycastle.math.raw.Nat256.gte(iArr2, getHighResolutionOutputSizeshNQ4ISI))) {
            org.bouncycastle.math.raw.Nat.add33To(8, 977, iArr2);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat.add(16, iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && org.bouncycastle.math.raw.Nat.gte(16, iArr3, getHighSpeedVideoSizes))) {
            int[] iArr4 = getHighSpeedVideoFpsRangesFor;
            if (org.bouncycastle.math.raw.Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                org.bouncycastle.math.raw.Nat.incAt(16, iArr3, iArr4.length);
            }
        }
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat256.add(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && org.bouncycastle.math.raw.Nat256.gte(iArr3, getHighResolutionOutputSizeshNQ4ISI))) {
            org.bouncycastle.math.raw.Nat.add33To(8, 977, iArr3);
        }
    }
}
