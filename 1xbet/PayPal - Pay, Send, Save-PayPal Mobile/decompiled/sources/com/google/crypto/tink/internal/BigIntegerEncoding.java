package com.google.crypto.tink.internal;

/* loaded from: classes9.dex */
public final class BigIntegerEncoding {
    public static byte[] toBigEndianBytes(java.math.BigInteger bigInteger) {
        if (bigInteger.signum() == -1) {
            throw new java.lang.IllegalArgumentException("n must not be negative");
        }
        return bigInteger.toByteArray();
    }

    public static byte[] toUnsignedBigEndianBytes(java.math.BigInteger bigInteger) {
        if (bigInteger.signum() == -1) {
            throw new java.lang.IllegalArgumentException("n must not be negative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        return byteArray[0] == 0 ? java.util.Arrays.copyOfRange(byteArray, 1, byteArray.length) : byteArray;
    }

    public static byte[] toBigEndianBytesOfFixedLength(java.math.BigInteger bigInteger, int i) throws java.security.GeneralSecurityException {
        if (bigInteger.signum() == -1) {
            throw new java.lang.IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        if (byteArray.length > i2) {
            throw new java.security.GeneralSecurityException("integer too large");
        }
        if (byteArray.length == i2) {
            if (byteArray[0] == 0) {
                return java.util.Arrays.copyOfRange(byteArray, 1, byteArray.length);
            }
            throw new java.security.GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(byteArray, 0, bArr, i - byteArray.length, byteArray.length);
        return bArr;
    }

    public static java.math.BigInteger fromUnsignedBigEndianBytes(byte[] bArr) {
        return new java.math.BigInteger(1, bArr);
    }

    private BigIntegerEncoding() {
    }
}
