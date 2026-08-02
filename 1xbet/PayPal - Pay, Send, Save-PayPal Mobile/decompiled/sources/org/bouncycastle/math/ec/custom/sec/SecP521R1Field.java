package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecP521R1Field {
    static final int[] getHighSpeedVideoSizes = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    public static void twice(int[] iArr, int[] iArr2) {
        int i = iArr[16];
        iArr2[16] = (org.bouncycastle.math.raw.Nat.shiftUpBit(16, iArr, i << 23, iArr2) | (i << 1)) & 511;
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        int sub = (org.bouncycastle.math.raw.Nat.sub(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (sub < 0) {
            sub = (sub + org.bouncycastle.math.raw.Nat.dec(16, iArr3)) & 511;
        }
        iArr3[16] = sub;
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] create = org.bouncycastle.math.raw.Nat.create(33);
        implSquare(iArr, create);
        while (true) {
            reduce(create, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                implSquare(iArr2, create);
            }
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] create = org.bouncycastle.math.raw.Nat.create(33);
        implSquare(iArr, create);
        reduce(create, iArr2);
    }

    public static void reduce23(int[] iArr) {
        int i = iArr[16];
        int addWordTo = org.bouncycastle.math.raw.Nat.addWordTo(16, i >>> 9, iArr) + (i & 511);
        if (addWordTo > 511 || (addWordTo == 511 && org.bouncycastle.math.raw.Nat.eq(16, iArr, getHighSpeedVideoSizes))) {
            addWordTo = (addWordTo + org.bouncycastle.math.raw.Nat.inc(16, iArr)) & 511;
        }
        iArr[16] = addWordTo;
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        int i = iArr[32];
        int shiftDownBits = (org.bouncycastle.math.raw.Nat.shiftDownBits(16, iArr, 16, 9, i, iArr2, 0) >>> 23) + (i >>> 9) + org.bouncycastle.math.raw.Nat.addTo(16, iArr, iArr2);
        if (shiftDownBits > 511 || (shiftDownBits == 511 && org.bouncycastle.math.raw.Nat.eq(16, iArr2, getHighSpeedVideoSizes))) {
            shiftDownBits = (shiftDownBits + org.bouncycastle.math.raw.Nat.inc(16, iArr2)) & 511;
        }
        iArr2[16] = shiftDownBits;
    }

    public static void randomMult(java.security.SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void random(java.security.SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[68];
        do {
            secureRandom.nextBytes(bArr);
            org.bouncycastle.util.Pack.littleEndianToInt(bArr, 0, iArr, 0, 17);
            iArr[16] = iArr[16] & 511;
        } while (org.bouncycastle.math.raw.Nat.lessThan(17, iArr, getHighSpeedVideoSizes) == 0);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            org.bouncycastle.math.raw.Nat.sub(17, getHighSpeedVideoSizes, iArr, iArr2);
        } else {
            int[] iArr3 = getHighSpeedVideoSizes;
            org.bouncycastle.math.raw.Nat.sub(17, iArr3, iArr3, iArr2);
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = org.bouncycastle.math.raw.Nat.create(33);
        implMultiply(iArr, iArr2, create);
        reduce(create, iArr3);
    }

    public static int isZero(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 17; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void inv(int[] iArr, int[] iArr2) {
        org.bouncycastle.math.raw.Mod.checkedModOddInverse(getHighSpeedVideoSizes, iArr, iArr2);
    }

    protected static void implSquare(int[] iArr, int[] iArr2) {
        org.bouncycastle.math.raw.Nat512.square(iArr, iArr2);
        int i = iArr[16];
        iArr2[32] = org.bouncycastle.math.raw.Nat.mulWordAddTo(16, i << 1, iArr, 0, iArr2, 16) + (i * i);
    }

    protected static void implMultiply(int[] iArr, int[] iArr2, int[] iArr3) {
        org.bouncycastle.math.raw.Nat512.mul(iArr, iArr2, iArr3);
        int i = iArr[16];
        int i2 = iArr2[16];
        iArr3[32] = org.bouncycastle.math.raw.Nat.mul31BothAdd(16, i, iArr2, i2, iArr, iArr3, 16) + (i * i2);
    }

    public static void half(int[] iArr, int[] iArr2) {
        int i = iArr[16];
        iArr2[16] = (org.bouncycastle.math.raw.Nat.shiftDownBit(16, iArr, i, iArr2) >>> 23) | (i >>> 1);
    }

    public static int[] fromBigInteger(java.math.BigInteger bigInteger) {
        int[] fromBigInteger = org.bouncycastle.math.raw.Nat.fromBigInteger(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL, bigInteger);
        if (org.bouncycastle.math.raw.Nat.eq(17, fromBigInteger, getHighSpeedVideoSizes)) {
            org.bouncycastle.math.raw.Nat.zero(17, fromBigInteger);
        }
        return fromBigInteger;
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        int inc = org.bouncycastle.math.raw.Nat.inc(16, iArr, iArr2) + iArr[16];
        if (inc > 511 || (inc == 511 && org.bouncycastle.math.raw.Nat.eq(16, iArr2, getHighSpeedVideoSizes))) {
            inc = (inc + org.bouncycastle.math.raw.Nat.inc(16, iArr2)) & 511;
        }
        iArr2[16] = inc;
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        int add = org.bouncycastle.math.raw.Nat.add(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (add > 511 || (add == 511 && org.bouncycastle.math.raw.Nat.eq(16, iArr3, getHighSpeedVideoSizes))) {
            add = (add + org.bouncycastle.math.raw.Nat.inc(16, iArr3)) & 511;
        }
        iArr3[16] = add;
    }
}
