package com.payair.csdk;

/* loaded from: classes10.dex */
public abstract class e2 {
    protected static final java.lang.String POSTFIX = "?=";
    protected static final java.lang.String PREFIX = "=?";
    protected static final char SEP = '?';

    public java.lang.String decodeText(java.lang.String str) throws codec.DecoderException, java.io.UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        if (!str.startsWith(PREFIX) || !str.endsWith(POSTFIX)) {
            throw new codec.DecoderException("RFC 1522 violation: malformed encoded content");
        }
        int length = str.length() - 2;
        int indexOf = str.indexOf(63, 2);
        if (indexOf == length) {
            throw new codec.DecoderException("RFC 1522 violation: charset token not found");
        }
        java.lang.String substring = str.substring(2, indexOf);
        if (substring.equals("")) {
            throw new codec.DecoderException("RFC 1522 violation: charset not specified");
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(63, i);
        if (indexOf2 == length) {
            throw new codec.DecoderException("RFC 1522 violation: encoding token not found");
        }
        java.lang.String substring2 = str.substring(i, indexOf2);
        if (getEncoding().equalsIgnoreCase(substring2)) {
            int i2 = indexOf2 + 1;
            return new java.lang.String(doDecoding(codec.binary.StringUtils.getBytesUsAscii(str.substring(i2, str.indexOf(63, i2)))), substring);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("This codec cannot decode ");
        sb.append(substring2);
        sb.append(" encoded content");
        throw new codec.DecoderException(sb.toString());
    }

    public abstract byte[] doDecoding(byte[] bArr);

    public abstract byte[] doEncoding(byte[] bArr);

    public java.lang.String encodeText(java.lang.String str, java.nio.charset.Charset charset) throws codec.EncoderException {
        if (str == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(PREFIX);
        sb.append(charset);
        sb.append('?');
        sb.append(getEncoding());
        sb.append('?');
        sb.append(codec.binary.StringUtils.newStringUsAscii(doEncoding(str.getBytes(charset))));
        sb.append(POSTFIX);
        return sb.toString();
    }

    public abstract java.lang.String getEncoding();

    public java.lang.String encodeText(java.lang.String str, java.lang.String str2) throws codec.EncoderException, java.io.UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return encodeText(str, java.nio.charset.Charset.forName(str2));
    }
}
