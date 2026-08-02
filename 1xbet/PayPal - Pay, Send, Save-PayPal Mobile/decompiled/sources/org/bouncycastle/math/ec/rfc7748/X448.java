package org.bouncycastle.math.ec.rfc7748;

/* loaded from: classes17.dex */
public abstract class X448 {
    public static final int POINT_SIZE = 56;
    public static final int SCALAR_SIZE = 56;

    public static void scalarMult(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int[] iArr = new int[14];
        for (int i4 = 0; i4 < 14; i4++) {
            int i5 = (i4 * 4) + i;
            iArr[i4] = (bArr[i5 + 3] << com.google.common.base.Ascii.CAN) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16);
        }
        iArr[0] = iArr[0] & (-4);
        iArr[13] = iArr[13] | Integer.MIN_VALUE;
        int[] create = org.bouncycastle.math.ec.rfc7748.X448.F.create();
        org.bouncycastle.math.ec.rfc7748.X448.F.decode(bArr2, i2, create);
        int[] create2 = org.bouncycastle.math.ec.rfc7748.X448.F.create();
        org.bouncycastle.math.ec.rfc7748.X448.F.copy(create, 0, create2, 0);
        int[] create3 = org.bouncycastle.math.ec.rfc7748.X448.F.create();
        create3[0] = 1;
        int[] create4 = org.bouncycastle.math.ec.rfc7748.X448.F.create();
        create4[0] = 1;
        int[] create5 = org.bouncycastle.math.ec.rfc7748.X448.F.create();
        int[] create6 = org.bouncycastle.math.ec.rfc7748.X448.F.create();
        int[] create7 = org.bouncycastle.math.ec.rfc7748.X448.F.create();
        int i6 = 447;
        int i7 = 1;
        while (true) {
            org.bouncycastle.math.ec.rfc7748.X448.F.add(create4, create5, create6);
            org.bouncycastle.math.ec.rfc7748.X448.F.sub(create4, create5, create4);
            org.bouncycastle.math.ec.rfc7748.X448.F.add(create2, create3, create5);
            org.bouncycastle.math.ec.rfc7748.X448.F.sub(create2, create3, create2);
            org.bouncycastle.math.ec.rfc7748.X448.F.mul(create6, create2, create6);
            org.bouncycastle.math.ec.rfc7748.X448.F.mul(create4, create5, create4);
            org.bouncycastle.math.ec.rfc7748.X448.F.sqr(create5, create5);
            org.bouncycastle.math.ec.rfc7748.X448.F.sqr(create2, create2);
            org.bouncycastle.math.ec.rfc7748.X448.F.sub(create5, create2, create7);
            org.bouncycastle.math.ec.rfc7748.X448.F.mul(create7, 39082, create3);
            org.bouncycastle.math.ec.rfc7748.X448.F.add(create3, create2, create3);
            org.bouncycastle.math.ec.rfc7748.X448.F.mul(create3, create7, create3);
            org.bouncycastle.math.ec.rfc7748.X448.F.mul(create2, create5, create2);
            org.bouncycastle.math.ec.rfc7748.X448.F.sub(create6, create4, create5);
            org.bouncycastle.math.ec.rfc7748.X448.F.add(create6, create4, create4);
            org.bouncycastle.math.ec.rfc7748.X448.F.sqr(create4, create4);
            org.bouncycastle.math.ec.rfc7748.X448.F.sqr(create5, create5);
            org.bouncycastle.math.ec.rfc7748.X448.F.mul(create5, create, create5);
            i6--;
            int i8 = (iArr[i6 >>> 5] >>> (i6 & 31)) & 1;
            int i9 = i7 ^ i8;
            org.bouncycastle.math.ec.rfc7748.X448.F.cswap(i9, create2, create4);
            org.bouncycastle.math.ec.rfc7748.X448.F.cswap(i9, create3, create5);
            if (i6 < 2) {
                break;
            } else {
                i7 = i8;
            }
        }
        for (int i10 = 0; i10 < 2; i10++) {
            int[] create8 = org.bouncycastle.math.ec.rfc7748.X448.F.create();
            int[] create9 = org.bouncycastle.math.ec.rfc7748.X448.F.create();
            org.bouncycastle.math.ec.rfc7748.X448.F.add(create2, create3, create8);
            org.bouncycastle.math.ec.rfc7748.X448.F.sub(create2, create3, create9);
            org.bouncycastle.math.ec.rfc7748.X448.F.sqr(create8, create8);
            org.bouncycastle.math.ec.rfc7748.X448.F.sqr(create9, create9);
            org.bouncycastle.math.ec.rfc7748.X448.F.mul(create8, create9, create2);
            org.bouncycastle.math.ec.rfc7748.X448.F.sub(create8, create9, create8);
            org.bouncycastle.math.ec.rfc7748.X448.F.mul(create8, 39082, create3);
            org.bouncycastle.math.ec.rfc7748.X448.F.add(create3, create9, create3);
            org.bouncycastle.math.ec.rfc7748.X448.F.mul(create3, create8, create3);
        }
        org.bouncycastle.math.ec.rfc7748.X448.F.inv(create3, create3);
        org.bouncycastle.math.ec.rfc7748.X448.F.mul(create2, create3, create2);
        org.bouncycastle.math.ec.rfc7748.X448.F.normalize(create2);
        org.bouncycastle.math.ec.rfc7748.X448.F.encode(create2, bArr3, i3);
    }

    public static void scalarMultBase(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] create = org.bouncycastle.math.ec.rfc7748.X448.F.create();
        int[] create2 = org.bouncycastle.math.ec.rfc7748.X448.F.create();
        org.bouncycastle.math.ec.rfc8032.Ed448.scalarMultBaseXY(org.bouncycastle.math.ec.rfc7748.X448.Friend.getHighSpeedVideoSizes, bArr, i, create, create2);
        org.bouncycastle.math.ec.rfc7748.X448.F.inv(create, create);
        org.bouncycastle.math.ec.rfc7748.X448.F.mul(create, create2, create);
        org.bouncycastle.math.ec.rfc7748.X448.F.sqr(create, create);
        org.bouncycastle.math.ec.rfc7748.X448.F.normalize(create);
        org.bouncycastle.math.ec.rfc7748.X448.F.encode(create, bArr2, i2);
    }

    public static void precompute() {
        org.bouncycastle.math.ec.rfc8032.Ed448.precompute();
    }

    public static class Friend {
        private static final org.bouncycastle.math.ec.rfc7748.X448.Friend getHighSpeedVideoSizes = new org.bouncycastle.math.ec.rfc7748.X448.Friend();

        private Friend() {
        }
    }

    public static void generatePublicKey(byte[] bArr, int i, byte[] bArr2, int i2) {
        scalarMultBase(bArr, i, bArr2, i2);
    }

    public static void generatePrivateKey(java.security.SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 252);
        bArr[55] = (byte) (bArr[55] | 128);
    }

    static class F extends org.bouncycastle.math.ec.rfc7748.X448Field {
        private F() {
        }
    }

    public static boolean calculateAgreement(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        scalarMult(bArr, i, bArr2, i2, bArr3, i3);
        return !org.bouncycastle.util.Arrays.areAllZeroes(bArr3, i3, 56);
    }
}
