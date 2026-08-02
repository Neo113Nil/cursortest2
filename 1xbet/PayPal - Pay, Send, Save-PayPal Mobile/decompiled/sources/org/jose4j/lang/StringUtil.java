package org.jose4j.lang;

/* loaded from: classes18.dex */
public class StringUtil {
    public static final java.lang.String US_ASCII = "US-ASCII";
    public static final java.lang.String UTF_8 = "UTF-8";

    public static java.lang.String newStringUtf8(byte[] bArr) {
        return newString(bArr, "UTF-8");
    }

    public static java.lang.String newStringUsAscii(byte[] bArr) {
        return newString(bArr, "US-ASCII");
    }

    public static java.lang.String newString(byte[] bArr, java.lang.String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new java.lang.String(bArr, str);
        } catch (java.io.UnsupportedEncodingException unused) {
            throw new java.lang.IllegalStateException("Unknown or unsupported character set name: ".concat(java.lang.String.valueOf(str)));
        }
    }

    public static java.lang.String newString(byte[] bArr, java.nio.charset.Charset charset) {
        if (bArr == null) {
            return null;
        }
        return new java.lang.String(bArr, charset);
    }

    public static byte[] getBytesUtf8(java.lang.String str) {
        return getBytesUnchecked(str, "UTF-8");
    }

    public static byte[] getBytesAscii(java.lang.String str) {
        return getBytesUnchecked(str, "US-ASCII");
    }

    public static byte[] getBytes(java.lang.String str, java.nio.charset.Charset charset) {
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    public static byte[] getBytesUnchecked(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (java.io.UnsupportedEncodingException unused) {
            throw new java.lang.IllegalStateException("Unknown or unsupported character set name: ".concat(java.lang.String.valueOf(str2)));
        }
    }
}
