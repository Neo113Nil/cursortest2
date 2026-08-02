package org.jose4j.base64url;

/* loaded from: classes18.dex */
public class Base64Url {
    private org.jose4j.base64url.internal.apache.commons.codec.binary.Base64 getHighSpeedVideoFpsRanges = new org.jose4j.base64url.internal.apache.commons.codec.binary.Base64(-1, null, true);

    public java.lang.String base64UrlDecodeToUtf8String(java.lang.String str) {
        return base64UrlDecodeToString(str, "UTF-8");
    }

    public java.lang.String base64UrlDecodeToString(java.lang.String str, java.lang.String str2) {
        return org.jose4j.lang.StringUtil.newString(base64UrlDecode(str), str2);
    }

    public byte[] base64UrlDecode(java.lang.String str) {
        return this.getHighSpeedVideoFpsRanges.decode(str);
    }

    public java.lang.String base64UrlEncodeUtf8ByteRepresentation(java.lang.String str) {
        return base64UrlEncode(str, "UTF-8");
    }

    public java.lang.String base64UrlEncode(java.lang.String str, java.lang.String str2) {
        return base64UrlEncode(org.jose4j.lang.StringUtil.getBytesUnchecked(str, str2));
    }

    public java.lang.String base64UrlEncode(byte[] bArr) {
        return this.getHighSpeedVideoFpsRanges.encodeToString(bArr);
    }

    public static byte[] decode(java.lang.String str) {
        return new org.jose4j.base64url.Base64Url().base64UrlDecode(str);
    }

    public static java.lang.String decodeToString(java.lang.String str, java.lang.String str2) {
        return new org.jose4j.base64url.Base64Url().base64UrlDecodeToString(str, str2);
    }

    public static java.lang.String decodeToUtf8String(java.lang.String str) {
        return new org.jose4j.base64url.Base64Url().base64UrlDecodeToString(str, "UTF-8");
    }

    public static java.lang.String encode(java.lang.String str, java.lang.String str2) {
        return new org.jose4j.base64url.Base64Url().base64UrlEncode(str, str2);
    }

    public static java.lang.String encode(byte[] bArr) {
        return new org.jose4j.base64url.Base64Url().base64UrlEncode(bArr);
    }

    public static java.lang.String encodeUtf8ByteRepresentation(java.lang.String str) {
        return new org.jose4j.base64url.Base64Url().base64UrlEncodeUtf8ByteRepresentation(str);
    }
}
