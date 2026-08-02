package org.jose4j.base64url;

/* loaded from: classes18.dex */
public class SimplePEMEncoder {
    public static byte[] decode(java.lang.String str) {
        return new org.jose4j.base64url.internal.apache.commons.codec.binary.Base64(64).decode(str);
    }

    public static java.lang.String encode(byte[] bArr) {
        return new org.jose4j.base64url.internal.apache.commons.codec.binary.Base64(64).encodeToString(bArr);
    }
}
