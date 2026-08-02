package org.bouncycastle.math.ec.custom.djb;

/* loaded from: classes17.dex */
public class Curve25519Field {
    static final int[] getHighSpeedVideoSizes = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] getHighSpeedVideoFpsRangesFor = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK};

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat256.sub(iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) - 19;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                j2 = org.bouncycastle.math.raw.Nat.decAt(7, iArr3, 1);
            }
            iArr3[7] = (int) (j2 + (4294967295L & iArr3[7]) + 2147483648L);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat.sub(16, iArr, iArr2, iArr3) != 0) {
            long j = iArr3[0];
            int[] iArr4 = getHighSpeedVideoFpsRangesFor;
            long j2 = (j & 4294967295L) + (iArr4[0] & 4294967295L);
            iArr3[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                j3 = org.bouncycastle.math.raw.Nat.incAt(8, iArr3, 1);
            }
            long j4 = j3 + ((iArr3[8] & 4294967295L) - 19);
            iArr3[8] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                j5 = org.bouncycastle.math.raw.Nat.decAt(15, iArr3, 9);
            }
            iArr3[15] = (int) (j5 + (iArr3[15] & 4294967295L) + ((iArr4[15] + 1) & 4294967295L));
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        org.bouncycastle.math.raw.Nat.shiftUpBit(8, iArr, 0, iArr2);
        if (org.bouncycastle.math.raw.Nat256.gte(iArr2, getHighSpeedVideoSizes)) {
            getHighSpeedVideoFpsRanges(iArr2);
        }
    }

    private static int getHighSpeedVideoFpsRanges(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 19;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            j2 = org.bouncycastle.math.raw.Nat.incAt(7, iArr, 1);
        }
        long j3 = j2 + ((4294967295L & iArr[7]) - 2147483648L);
        iArr[7] = (int) j3;
        return (int) (j3 >> 32);
    }

    private static int getHighSpeedVideoFpsRangesFor(int[] iArr) {
        long j = iArr[0];
        int[] iArr2 = getHighSpeedVideoFpsRangesFor;
        long j2 = (j & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            j3 = org.bouncycastle.math.raw.Nat.decAt(8, iArr, 1);
        }
        long j4 = j3 + (iArr[8] & 4294967295L) + 19;
        iArr[8] = (int) j4;
        long j5 = j4 >> 32;
        if (j5 != 0) {
            j5 = org.bouncycastle.math.raw.Nat.incAt(15, iArr, 9);
        }
        long j6 = j5 + ((iArr[15] & 4294967295L) - ((iArr2[15] + 1) & 4294967295L));
        iArr[15] = (int) j6;
        return (int) (j6 >> 32);
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

    public static void reduce27(int i, int[] iArr) {
        int i2 = iArr[7];
        iArr[7] = (Integer.MAX_VALUE & i2) + org.bouncycastle.math.raw.Nat.addWordTo(7, ((i << 1) | (i2 >>> 31)) * 19, iArr);
        if (org.bouncycastle.math.raw.Nat256.gte(iArr, getHighSpeedVideoSizes)) {
            getHighSpeedVideoFpsRanges(iArr);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        int i = iArr[7];
        org.bouncycastle.math.raw.Nat.shiftUpBit(8, iArr, 8, i, iArr2, 0);
        int mulByWordAddTo = org.bouncycastle.math.raw.Nat256.mulByWordAddTo(19, iArr, iArr2);
        int i2 = iArr2[7];
        iArr2[7] = (Integer.MAX_VALUE & i2) + org.bouncycastle.math.raw.Nat.addWordTo(7, ((mulByWordAddTo << 1) + ((i2 >>> 31) - (i >>> 31))) * 19, iArr2);
        if (org.bouncycastle.math.raw.Nat256.gte(iArr2, getHighSpeedVideoSizes)) {
            getHighSpeedVideoFpsRanges(iArr2);
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
            iArr[7] = iArr[7] & Integer.MAX_VALUE;
        } while (org.bouncycastle.math.raw.Nat.lessThan(8, iArr, getHighSpeedVideoSizes) == 0);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            org.bouncycastle.math.raw.Nat256.sub(getHighSpeedVideoSizes, iArr, iArr2);
        } else {
            int[] iArr3 = getHighSpeedVideoSizes;
            org.bouncycastle.math.raw.Nat256.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        org.bouncycastle.math.raw.Nat256.mulAddTo(iArr, iArr2, iArr3);
        if (org.bouncycastle.math.raw.Nat.gte(16, iArr3, getHighSpeedVideoFpsRangesFor)) {
            getHighSpeedVideoFpsRangesFor(iArr3);
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
        org.bouncycastle.math.raw.Mod.checkedModOddInverse(getHighSpeedVideoSizes, iArr, iArr2);
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            org.bouncycastle.math.raw.Nat.shiftDownBit(8, iArr, 0, iArr2);
        } else {
            org.bouncycastle.math.raw.Nat256.add(iArr, getHighSpeedVideoSizes, iArr2);
            org.bouncycastle.math.raw.Nat.shiftDownBit(8, iArr2, 0);
        }
    }

    public static int[] fromBigInteger(java.math.BigInteger bigInteger) {
        int[] fromBigInteger = org.bouncycastle.math.raw.Nat256.fromBigInteger(bigInteger);
        while (true) {
            int[] iArr = getHighSpeedVideoSizes;
            if (!org.bouncycastle.math.raw.Nat256.gte(fromBigInteger, iArr)) {
                return fromBigInteger;
            }
            org.bouncycastle.math.raw.Nat256.subFrom(iArr, fromBigInteger);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        org.bouncycastle.math.raw.Nat.inc(8, iArr, iArr2);
        if (org.bouncycastle.math.raw.Nat256.gte(iArr2, getHighSpeedVideoSizes)) {
            getHighSpeedVideoFpsRanges(iArr2);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        org.bouncycastle.math.raw.Nat.add(16, iArr, iArr2, iArr3);
        if (org.bouncycastle.math.raw.Nat.gte(16, iArr3, getHighSpeedVideoFpsRangesFor)) {
            getHighSpeedVideoFpsRangesFor(iArr3);
        }
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        org.bouncycastle.math.raw.Nat256.add(iArr, iArr2, iArr3);
        if (org.bouncycastle.math.raw.Nat256.gte(iArr3, getHighSpeedVideoSizes)) {
            getHighSpeedVideoFpsRanges(iArr3);
        }
    }
}
