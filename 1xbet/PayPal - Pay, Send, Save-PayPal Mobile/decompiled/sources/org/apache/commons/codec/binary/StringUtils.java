package org.apache.commons.codec.binary;

/* loaded from: classes17.dex */
public class StringUtils {
    public static boolean equals(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null) {
            return false;
        }
        if ((charSequence instanceof java.lang.String) && (charSequence2 instanceof java.lang.String)) {
            return charSequence.equals(charSequence2);
        }
        return charSequence.length() == charSequence2.length() && org.apache.commons.codec.binary.CharSequenceUtils.getHighResolutionOutputSizeshNQ4ISI(charSequence, charSequence2, charSequence.length());
    }

    public static java.nio.ByteBuffer getByteBufferUtf8(java.lang.String str) {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        if (str == null) {
            return null;
        }
        return java.nio.ByteBuffer.wrap(str.getBytes(charset));
    }

    public static byte[] getBytesIso8859_1(java.lang.String str) {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.ISO_8859_1;
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
        } catch (java.io.UnsupportedEncodingException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str2);
            sb.append(": ");
            sb.append(e);
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    public static byte[] getBytesUsAscii(java.lang.String str) {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.US_ASCII;
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    public static byte[] getBytesUtf16(java.lang.String str) {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_16;
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    public static byte[] getBytesUtf16Be(java.lang.String str) {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_16BE;
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    public static byte[] getBytesUtf16Le(java.lang.String str) {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_16LE;
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    public static byte[] getBytesUtf8(java.lang.String str) {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    public static java.lang.String newString(byte[] bArr, java.lang.String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new java.lang.String(bArr, str);
        } catch (java.io.UnsupportedEncodingException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(": ");
            sb.append(e);
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    public static java.lang.String newStringIso8859_1(byte[] bArr) {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.ISO_8859_1;
        if (bArr == null) {
            return null;
        }
        return new java.lang.String(bArr, charset);
    }

    public static java.lang.String newStringUsAscii(byte[] bArr) {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.US_ASCII;
        if (bArr == null) {
            return null;
        }
        return new java.lang.String(bArr, charset);
    }

    public static java.lang.String newStringUtf16(byte[] bArr) {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_16;
        if (bArr == null) {
            return null;
        }
        return new java.lang.String(bArr, charset);
    }

    public static java.lang.String newStringUtf16Be(byte[] bArr) {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_16BE;
        if (bArr == null) {
            return null;
        }
        return new java.lang.String(bArr, charset);
    }

    public static java.lang.String newStringUtf16Le(byte[] bArr) {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_16LE;
        if (bArr == null) {
            return null;
        }
        return new java.lang.String(bArr, charset);
    }

    public static java.lang.String newStringUtf8(byte[] bArr) {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        if (bArr == null) {
            return null;
        }
        return new java.lang.String(bArr, charset);
    }

    @java.lang.Deprecated
    public StringUtils() {
    }
}
