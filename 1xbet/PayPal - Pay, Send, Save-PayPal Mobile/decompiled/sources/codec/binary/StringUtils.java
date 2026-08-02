package codec.binary;

/* loaded from: classes3.dex */
public class StringUtils {
    public static java.lang.String a(byte[] bArr, java.nio.charset.Charset charset) {
        if (bArr == null) {
            return null;
        }
        return new java.lang.String(bArr, charset);
    }

    public static boolean equals(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence != null && charSequence2 != null) {
            boolean z = charSequence instanceof java.lang.String;
            if (z && (charSequence2 instanceof java.lang.String)) {
                return charSequence.equals(charSequence2);
            }
            if (charSequence.length() == charSequence2.length()) {
                int length = charSequence.length();
                if (!z || !(charSequence2 instanceof java.lang.String)) {
                    int i = 0;
                    int i2 = 0;
                    while (length > 0) {
                        if (charSequence.charAt(i) == charSequence2.charAt(i2)) {
                            length--;
                            i++;
                            i2++;
                        }
                    }
                    return true;
                }
                if (((java.lang.String) charSequence).regionMatches(false, 0, (java.lang.String) charSequence2, 0, length)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static java.nio.ByteBuffer getByteBufferUtf8(java.lang.String str) {
        java.nio.charset.Charset charset = codec.Charsets.UTF_8;
        if (str == null) {
            return null;
        }
        return java.nio.ByteBuffer.wrap(str.getBytes(charset));
    }

    public static byte[] getBytesIso8859_1(java.lang.String str) {
        java.nio.charset.Charset charset = codec.Charsets.ISO_8859_1;
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
        java.nio.charset.Charset charset = codec.Charsets.US_ASCII;
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    public static byte[] getBytesUtf16(java.lang.String str) {
        java.nio.charset.Charset charset = codec.Charsets.UTF_16;
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    public static byte[] getBytesUtf16Be(java.lang.String str) {
        java.nio.charset.Charset charset = codec.Charsets.UTF_16BE;
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    public static byte[] getBytesUtf16Le(java.lang.String str) {
        java.nio.charset.Charset charset = codec.Charsets.UTF_16LE;
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    public static byte[] getBytesUtf8(java.lang.String str) {
        java.nio.charset.Charset charset = codec.Charsets.UTF_8;
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
        return a(bArr, codec.Charsets.ISO_8859_1);
    }

    public static java.lang.String newStringUsAscii(byte[] bArr) {
        return a(bArr, codec.Charsets.US_ASCII);
    }

    public static java.lang.String newStringUtf16(byte[] bArr) {
        return a(bArr, codec.Charsets.UTF_16);
    }

    public static java.lang.String newStringUtf16Be(byte[] bArr) {
        return a(bArr, codec.Charsets.UTF_16BE);
    }

    public static java.lang.String newStringUtf16Le(byte[] bArr) {
        return a(bArr, codec.Charsets.UTF_16LE);
    }

    public static java.lang.String newStringUtf8(byte[] bArr) {
        return a(bArr, codec.Charsets.UTF_8);
    }
}
