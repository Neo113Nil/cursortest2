package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecP160R1Field {
    static final int[] getHighSpeedVideoSizes = {Integer.MAX_VALUE, -1, -1, -1, -1};
    private static final int[] getHighSpeedVideoFpsRanges = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};
    private static final int[] Camera2StreamConfigurationMap = {-1, -1073741826, -1, -1, -1, 1, 1};

    public static void twice(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat.shiftUpBit(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && org.bouncycastle.math.raw.Nat160.gte(iArr2, getHighSpeedVideoSizes))) {
            org.bouncycastle.math.raw.Nat.addWordTo(5, androidx.media3.common.C.RATE_UNSET_INT, iArr2);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat.sub(10, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = Camera2StreamConfigurationMap;
            if (org.bouncycastle.math.raw.Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                org.bouncycastle.math.raw.Nat.decAt(10, iArr3, iArr4.length);
            }
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat160.sub(iArr, iArr2, iArr3) != 0) {
            org.bouncycastle.math.raw.Nat.subWordFrom(5, androidx.media3.common.C.RATE_UNSET_INT, iArr3);
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
        if ((i == 0 || org.bouncycastle.math.raw.Nat160.mulWordsAdd(androidx.media3.common.C.RATE_UNSET_INT, i, iArr, 0) == 0) && !(iArr[4] == -1 && org.bouncycastle.math.raw.Nat160.gte(iArr, getHighSpeedVideoSizes))) {
            return;
        }
        org.bouncycastle.math.raw.Nat.addWordTo(5, androidx.media3.common.C.RATE_UNSET_INT, iArr);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j = iArr[5] & 4294967295L;
        long j2 = iArr[6] & 4294967295L;
        long j3 = iArr[7] & 4294967295L;
        long j4 = iArr[8] & 4294967295L;
        long j5 = iArr[9] & 4294967295L;
        long j6 = (iArr[0] & 4294967295L) + j + (j << 31);
        iArr2[0] = (int) j6;
        long j7 = (j6 >>> 32) + (iArr[1] & 4294967295L) + j2 + (j2 << 31);
        iArr2[1] = (int) j7;
        long j8 = (j7 >>> 32) + (iArr[2] & 4294967295L) + j3 + (j3 << 31);
        iArr2[2] = (int) j8;
        long j9 = (j8 >>> 32) + (iArr[3] & 4294967295L) + j4 + (j4 << 31);
        iArr2[3] = (int) j9;
        long j10 = (j9 >>> 32) + (4294967295L & iArr[4]) + j5 + (j5 << 31);
        iArr2[4] = (int) j10;
        reduce32((int) (j10 >>> 32), iArr2);
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
        } while (org.bouncycastle.math.raw.Nat.lessThan(5, iArr, getHighSpeedVideoSizes) == 0);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            org.bouncycastle.math.raw.Nat160.sub(getHighSpeedVideoSizes, iArr, iArr2);
        } else {
            int[] iArr3 = getHighSpeedVideoSizes;
            org.bouncycastle.math.raw.Nat160.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat160.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && org.bouncycastle.math.raw.Nat.gte(10, iArr3, getHighSpeedVideoFpsRanges))) {
            int[] iArr4 = Camera2StreamConfigurationMap;
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
        org.bouncycastle.math.raw.Mod.checkedModOddInverse(getHighSpeedVideoSizes, iArr, iArr2);
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            org.bouncycastle.math.raw.Nat.shiftDownBit(5, iArr, 0, iArr2);
        } else {
            org.bouncycastle.math.raw.Nat.shiftDownBit(5, iArr2, org.bouncycastle.math.raw.Nat160.add(iArr, getHighSpeedVideoSizes, iArr2));
        }
    }

    public static int[] fromBigInteger(java.math.BigInteger bigInteger) {
        int[] fromBigInteger = org.bouncycastle.math.raw.Nat160.fromBigInteger(bigInteger);
        if (fromBigInteger[4] == -1) {
            int[] iArr = getHighSpeedVideoSizes;
            if (org.bouncycastle.math.raw.Nat160.gte(fromBigInteger, iArr)) {
                org.bouncycastle.math.raw.Nat160.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (org.bouncycastle.math.raw.Nat.inc(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && org.bouncycastle.math.raw.Nat160.gte(iArr2, getHighSpeedVideoSizes))) {
            org.bouncycastle.math.raw.Nat.addWordTo(5, androidx.media3.common.C.RATE_UNSET_INT, iArr2);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat.add(10, iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && org.bouncycastle.math.raw.Nat.gte(10, iArr3, getHighSpeedVideoFpsRanges))) {
            int[] iArr4 = Camera2StreamConfigurationMap;
            if (org.bouncycastle.math.raw.Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                org.bouncycastle.math.raw.Nat.incAt(10, iArr3, iArr4.length);
            }
        }
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (org.bouncycastle.math.raw.Nat160.add(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && org.bouncycastle.math.raw.Nat160.gte(iArr3, getHighSpeedVideoSizes))) {
            org.bouncycastle.math.raw.Nat.addWordTo(5, androidx.media3.common.C.RATE_UNSET_INT, iArr3);
        }
    }
}
