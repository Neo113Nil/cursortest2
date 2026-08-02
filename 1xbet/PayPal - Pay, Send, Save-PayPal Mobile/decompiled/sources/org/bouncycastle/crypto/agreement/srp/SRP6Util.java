package org.bouncycastle.crypto.agreement.srp;

/* loaded from: classes17.dex */
public class SRP6Util {
    private static java.math.BigInteger getHighSpeedVideoFpsRangesFor = java.math.BigInteger.valueOf(0);
    private static java.math.BigInteger getHighSpeedVideoSizes = java.math.BigInteger.valueOf(1);

    public static java.math.BigInteger calculateKey(org.bouncycastle.crypto.Digest digest, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        int bitLength = (bigInteger.bitLength() + 7) / 8;
        byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(bigInteger2);
        if (asUnsignedByteArray.length < bitLength) {
            byte[] bArr = new byte[bitLength];
            java.lang.System.arraycopy(asUnsignedByteArray, 0, bArr, bitLength - asUnsignedByteArray.length, asUnsignedByteArray.length);
            asUnsignedByteArray = bArr;
        }
        digest.update(asUnsignedByteArray, 0, asUnsignedByteArray.length);
        byte[] bArr2 = new byte[digest.getDigestSize()];
        digest.doFinal(bArr2, 0);
        return new java.math.BigInteger(1, bArr2);
    }

    private static java.math.BigInteger Camera2StreamConfigurationMap(org.bouncycastle.crypto.Digest digest, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3) {
        int bitLength = (bigInteger.bitLength() + 7) / 8;
        byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(bigInteger2);
        if (asUnsignedByteArray.length < bitLength) {
            byte[] bArr = new byte[bitLength];
            java.lang.System.arraycopy(asUnsignedByteArray, 0, bArr, bitLength - asUnsignedByteArray.length, asUnsignedByteArray.length);
            asUnsignedByteArray = bArr;
        }
        byte[] asUnsignedByteArray2 = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(bigInteger3);
        if (asUnsignedByteArray2.length < bitLength) {
            byte[] bArr2 = new byte[bitLength];
            java.lang.System.arraycopy(asUnsignedByteArray2, 0, bArr2, bitLength - asUnsignedByteArray2.length, asUnsignedByteArray2.length);
            asUnsignedByteArray2 = bArr2;
        }
        digest.update(asUnsignedByteArray, 0, asUnsignedByteArray.length);
        digest.update(asUnsignedByteArray2, 0, asUnsignedByteArray2.length);
        byte[] bArr3 = new byte[digest.getDigestSize()];
        digest.doFinal(bArr3, 0);
        return new java.math.BigInteger(1, bArr3);
    }

    private static java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.Digest digest, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4) {
        int bitLength = (bigInteger.bitLength() + 7) / 8;
        byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(bigInteger2);
        if (asUnsignedByteArray.length < bitLength) {
            byte[] bArr = new byte[bitLength];
            java.lang.System.arraycopy(asUnsignedByteArray, 0, bArr, bitLength - asUnsignedByteArray.length, asUnsignedByteArray.length);
            asUnsignedByteArray = bArr;
        }
        byte[] asUnsignedByteArray2 = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(bigInteger3);
        if (asUnsignedByteArray2.length < bitLength) {
            byte[] bArr2 = new byte[bitLength];
            java.lang.System.arraycopy(asUnsignedByteArray2, 0, bArr2, bitLength - asUnsignedByteArray2.length, asUnsignedByteArray2.length);
            asUnsignedByteArray2 = bArr2;
        }
        byte[] asUnsignedByteArray3 = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(bigInteger4);
        if (asUnsignedByteArray3.length < bitLength) {
            byte[] bArr3 = new byte[bitLength];
            java.lang.System.arraycopy(asUnsignedByteArray3, 0, bArr3, bitLength - asUnsignedByteArray3.length, asUnsignedByteArray3.length);
            asUnsignedByteArray3 = bArr3;
        }
        digest.update(asUnsignedByteArray, 0, asUnsignedByteArray.length);
        digest.update(asUnsignedByteArray2, 0, asUnsignedByteArray2.length);
        digest.update(asUnsignedByteArray3, 0, asUnsignedByteArray3.length);
        byte[] bArr4 = new byte[digest.getDigestSize()];
        digest.doFinal(bArr4, 0);
        return new java.math.BigInteger(1, bArr4);
    }

    public static java.math.BigInteger validatePublicValue(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) throws org.bouncycastle.crypto.CryptoException {
        java.math.BigInteger mod = bigInteger2.mod(bigInteger);
        if (mod.equals(getHighSpeedVideoFpsRangesFor)) {
            throw new org.bouncycastle.crypto.CryptoException("Invalid public value: 0");
        }
        return mod;
    }

    public static java.math.BigInteger generatePrivateValue(org.bouncycastle.crypto.Digest digest, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.security.SecureRandom secureRandom) {
        return org.bouncycastle.util.BigIntegers.createRandomInRange(getHighSpeedVideoSizes.shiftLeft(java.lang.Math.min(256, bigInteger.bitLength() / 2) - 1), bigInteger.subtract(getHighSpeedVideoSizes), secureRandom);
    }

    public static java.math.BigInteger calculateX(org.bouncycastle.crypto.Digest digest, java.math.BigInteger bigInteger, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int digestSize = digest.getDigestSize();
        byte[] bArr4 = new byte[digestSize];
        digest.update(bArr2, 0, bArr2.length);
        digest.update((byte) 58);
        digest.update(bArr3, 0, bArr3.length);
        digest.doFinal(bArr4, 0);
        digest.update(bArr, 0, bArr.length);
        digest.update(bArr4, 0, digestSize);
        digest.doFinal(bArr4, 0);
        return new java.math.BigInteger(1, bArr4);
    }

    public static java.math.BigInteger calculateU(org.bouncycastle.crypto.Digest digest, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3) {
        return Camera2StreamConfigurationMap(digest, bigInteger, bigInteger2, bigInteger3);
    }

    public static java.math.BigInteger calculateM2(org.bouncycastle.crypto.Digest digest, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4) {
        return getHighResolutionOutputSizeshNQ4ISI(digest, bigInteger, bigInteger2, bigInteger3, bigInteger4);
    }

    public static java.math.BigInteger calculateM1(org.bouncycastle.crypto.Digest digest, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4) {
        return getHighResolutionOutputSizeshNQ4ISI(digest, bigInteger, bigInteger2, bigInteger3, bigInteger4);
    }

    public static java.math.BigInteger calculateK(org.bouncycastle.crypto.Digest digest, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        return Camera2StreamConfigurationMap(digest, bigInteger, bigInteger, bigInteger2);
    }
}
