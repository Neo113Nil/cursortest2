package org.bouncycastle.math.ec.rfc7748;

/* loaded from: classes17.dex */
public abstract class X25519 {
    public static final int POINT_SIZE = 32;
    public static final int SCALAR_SIZE = 32;

    public static void scalarMult(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int[] iArr = new int[8];
        for (int i4 = 0; i4 < 8; i4++) {
            int i5 = (i4 * 4) + i;
            iArr[i4] = (bArr[i5 + 3] << com.google.common.base.Ascii.CAN) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16);
        }
        iArr[0] = iArr[0] & (-8);
        int i6 = iArr[7] & Integer.MAX_VALUE;
        iArr[7] = i6;
        iArr[7] = i6 | 1073741824;
        int[] create = org.bouncycastle.math.ec.rfc7748.X25519.F.create();
        org.bouncycastle.math.ec.rfc7748.X25519.F.decode(bArr2, i2, create);
        int[] create2 = org.bouncycastle.math.ec.rfc7748.X25519.F.create();
        org.bouncycastle.math.ec.rfc7748.X25519.F.copy(create, 0, create2, 0);
        int[] create3 = org.bouncycastle.math.ec.rfc7748.X25519.F.create();
        create3[0] = 1;
        int[] create4 = org.bouncycastle.math.ec.rfc7748.X25519.F.create();
        create4[0] = 1;
        int[] create5 = org.bouncycastle.math.ec.rfc7748.X25519.F.create();
        int[] create6 = org.bouncycastle.math.ec.rfc7748.X25519.F.create();
        int[] create7 = org.bouncycastle.math.ec.rfc7748.X25519.F.create();
        int i7 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE;
        int i8 = 1;
        while (true) {
            org.bouncycastle.math.ec.rfc7748.X25519.F.apm(create4, create5, create6, create4);
            org.bouncycastle.math.ec.rfc7748.X25519.F.apm(create2, create3, create5, create2);
            org.bouncycastle.math.ec.rfc7748.X25519.F.mul(create6, create2, create6);
            org.bouncycastle.math.ec.rfc7748.X25519.F.mul(create4, create5, create4);
            org.bouncycastle.math.ec.rfc7748.X25519.F.sqr(create5, create5);
            org.bouncycastle.math.ec.rfc7748.X25519.F.sqr(create2, create2);
            org.bouncycastle.math.ec.rfc7748.X25519.F.sub(create5, create2, create7);
            org.bouncycastle.math.ec.rfc7748.X25519.F.mul(create7, 121666, create3);
            org.bouncycastle.math.ec.rfc7748.X25519.F.add(create3, create2, create3);
            org.bouncycastle.math.ec.rfc7748.X25519.F.mul(create3, create7, create3);
            org.bouncycastle.math.ec.rfc7748.X25519.F.mul(create2, create5, create2);
            org.bouncycastle.math.ec.rfc7748.X25519.F.apm(create6, create4, create4, create5);
            org.bouncycastle.math.ec.rfc7748.X25519.F.sqr(create4, create4);
            org.bouncycastle.math.ec.rfc7748.X25519.F.sqr(create5, create5);
            org.bouncycastle.math.ec.rfc7748.X25519.F.mul(create5, create, create5);
            i7--;
            int i9 = (iArr[i7 >>> 5] >>> (i7 & 31)) & 1;
            int i10 = i8 ^ i9;
            org.bouncycastle.math.ec.rfc7748.X25519.F.cswap(i10, create2, create4);
            org.bouncycastle.math.ec.rfc7748.X25519.F.cswap(i10, create3, create5);
            if (i7 < 3) {
                break;
            } else {
                i8 = i9;
            }
        }
        for (int i11 = 0; i11 < 3; i11++) {
            int[] create8 = org.bouncycastle.math.ec.rfc7748.X25519.F.create();
            int[] create9 = org.bouncycastle.math.ec.rfc7748.X25519.F.create();
            org.bouncycastle.math.ec.rfc7748.X25519.F.apm(create2, create3, create8, create9);
            org.bouncycastle.math.ec.rfc7748.X25519.F.sqr(create8, create8);
            org.bouncycastle.math.ec.rfc7748.X25519.F.sqr(create9, create9);
            org.bouncycastle.math.ec.rfc7748.X25519.F.mul(create8, create9, create2);
            org.bouncycastle.math.ec.rfc7748.X25519.F.sub(create8, create9, create8);
            org.bouncycastle.math.ec.rfc7748.X25519.F.mul(create8, 121666, create3);
            org.bouncycastle.math.ec.rfc7748.X25519.F.add(create3, create9, create3);
            org.bouncycastle.math.ec.rfc7748.X25519.F.mul(create3, create8, create3);
        }
        org.bouncycastle.math.ec.rfc7748.X25519.F.inv(create3, create3);
        org.bouncycastle.math.ec.rfc7748.X25519.F.mul(create2, create3, create2);
        org.bouncycastle.math.ec.rfc7748.X25519.F.normalize(create2);
        org.bouncycastle.math.ec.rfc7748.X25519.F.encode(create2, bArr3, i3);
    }

    public static void scalarMultBase(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] create = org.bouncycastle.math.ec.rfc7748.X25519.F.create();
        int[] create2 = org.bouncycastle.math.ec.rfc7748.X25519.F.create();
        org.bouncycastle.math.ec.rfc8032.Ed25519.scalarMultBaseYZ(org.bouncycastle.math.ec.rfc7748.X25519.Friend.getHighResolutionOutputSizeshNQ4ISI, bArr, i, create, create2);
        org.bouncycastle.math.ec.rfc7748.X25519.F.apm(create2, create, create, create2);
        org.bouncycastle.math.ec.rfc7748.X25519.F.inv(create2, create2);
        org.bouncycastle.math.ec.rfc7748.X25519.F.mul(create, create2, create);
        org.bouncycastle.math.ec.rfc7748.X25519.F.normalize(create);
        org.bouncycastle.math.ec.rfc7748.X25519.F.encode(create, bArr2, i2);
    }

    public static void precompute() {
        org.bouncycastle.math.ec.rfc8032.Ed25519.precompute();
    }

    public static class Friend {
        private static final org.bouncycastle.math.ec.rfc7748.X25519.Friend getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.math.ec.rfc7748.X25519.Friend();

        private Friend() {
        }
    }

    public static void generatePublicKey(byte[] bArr, int i, byte[] bArr2, int i2) {
        scalarMultBase(bArr, i, bArr2, i2);
    }

    public static void generatePrivateKey(java.security.SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 248);
        byte b = (byte) (bArr[31] & Byte.MAX_VALUE);
        bArr[31] = b;
        bArr[31] = (byte) (b | 64);
    }

    static class F extends org.bouncycastle.math.ec.rfc7748.X25519Field {
        private F() {
        }
    }

    public static boolean calculateAgreement(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        scalarMult(bArr, i, bArr2, i2, bArr3, i3);
        return !org.bouncycastle.util.Arrays.areAllZeroes(bArr3, i3, 32);
    }
}
