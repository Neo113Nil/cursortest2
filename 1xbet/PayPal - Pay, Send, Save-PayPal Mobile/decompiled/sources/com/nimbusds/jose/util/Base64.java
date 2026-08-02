package com.nimbusds.jose.util;

@net.jcip.annotations.Immutable
/* loaded from: classes4.dex */
public class Base64 implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final java.lang.String value;

    public Base64(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("The Base64 value must not be null");
        }
        this.value = str;
    }

    public byte[] decode() {
        return com.nimbusds.jose.util.Base64Codec.decode(this.value);
    }

    public java.math.BigInteger decodeToBigInteger() {
        return new java.math.BigInteger(1, decode());
    }

    public java.lang.String decodeToString() {
        return new java.lang.String(decode(), com.nimbusds.jose.util.StandardCharset.UTF_8);
    }

    public java.lang.String toJSONString() {
        return com.nimbusds.jose.util.JSONStringUtils.toJSONString(this.value);
    }

    public java.lang.String toString() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof com.nimbusds.jose.util.Base64) && toString().equals(obj.toString());
    }

    public static com.nimbusds.jose.util.Base64 from(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return new com.nimbusds.jose.util.Base64(str);
    }

    public static com.nimbusds.jose.util.Base64 encode(byte[] bArr) {
        return new com.nimbusds.jose.util.Base64(com.nimbusds.jose.util.Base64Codec.encodeToString(bArr, false));
    }

    public static com.nimbusds.jose.util.Base64 encode(java.math.BigInteger bigInteger) {
        return encode(com.nimbusds.jose.util.BigIntegerUtils.toBytesUnsigned(bigInteger));
    }

    public static com.nimbusds.jose.util.Base64 encode(java.lang.String str) {
        return encode(str.getBytes(com.nimbusds.jose.util.StandardCharset.UTF_8));
    }
}
