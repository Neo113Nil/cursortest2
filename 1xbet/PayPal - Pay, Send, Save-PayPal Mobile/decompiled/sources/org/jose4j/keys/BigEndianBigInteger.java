package org.jose4j.keys;

/* loaded from: classes18.dex */
public class BigEndianBigInteger {
    public static java.math.BigInteger fromBytes(byte[] bArr) {
        return new java.math.BigInteger(1, bArr);
    }

    public static java.math.BigInteger fromBase64Url(java.lang.String str) {
        return fromBytes(new org.jose4j.base64url.Base64Url().base64UrlDecode(str));
    }

    public static byte[] toByteArray(java.math.BigInteger bigInteger, int i) {
        byte[] byteArray = toByteArray(bigInteger);
        return i > byteArray.length ? org.jose4j.lang.ByteUtil.concat(new byte[i - byteArray.length], byteArray) : byteArray;
    }

    public static byte[] toByteArray(java.math.BigInteger bigInteger) {
        if (bigInteger.signum() < 0) {
            throw new java.lang.IllegalArgumentException("Cannot convert negative values to an unsigned magnitude byte array: ".concat(java.lang.String.valueOf(bigInteger)));
        }
        byte[] byteArray = bigInteger.toByteArray();
        return (bigInteger.bitLength() % 8 == 0 && byteArray[0] == 0 && byteArray.length > 1) ? org.jose4j.lang.ByteUtil.subArray(byteArray, 1, byteArray.length - 1) : byteArray;
    }

    public static java.lang.String toBase64Url(java.math.BigInteger bigInteger) {
        return new org.jose4j.base64url.Base64Url().base64UrlEncode(toByteArray(bigInteger));
    }

    public static java.lang.String toBase64Url(java.math.BigInteger bigInteger, int i) {
        return new org.jose4j.base64url.Base64Url().base64UrlEncode(toByteArray(bigInteger, i));
    }
}
