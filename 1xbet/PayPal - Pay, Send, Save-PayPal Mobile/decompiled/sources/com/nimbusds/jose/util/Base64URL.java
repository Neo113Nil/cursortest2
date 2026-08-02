package com.nimbusds.jose.util;

@net.jcip.annotations.Immutable
/* loaded from: classes4.dex */
public class Base64URL extends com.nimbusds.jose.util.Base64 {
    public Base64URL(java.lang.String str) {
        super(str);
    }

    @Override // com.nimbusds.jose.util.Base64
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof com.nimbusds.jose.util.Base64URL) && toString().equals(obj.toString());
    }

    public static com.nimbusds.jose.util.Base64URL from(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return new com.nimbusds.jose.util.Base64URL(str);
    }

    public static com.nimbusds.jose.util.Base64URL encode(byte[] bArr) {
        return new com.nimbusds.jose.util.Base64URL(com.nimbusds.jose.util.Base64Codec.encodeToString(bArr, true));
    }

    public static com.nimbusds.jose.util.Base64URL encode(java.math.BigInteger bigInteger) {
        return encode(com.nimbusds.jose.util.BigIntegerUtils.toBytesUnsigned(bigInteger));
    }

    public static com.nimbusds.jose.util.Base64URL encode(java.lang.String str) {
        return encode(str.getBytes(com.nimbusds.jose.util.StandardCharset.UTF_8));
    }
}
