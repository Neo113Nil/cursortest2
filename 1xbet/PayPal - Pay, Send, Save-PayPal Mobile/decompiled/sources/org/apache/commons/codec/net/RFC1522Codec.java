package org.apache.commons.codec.net;

/* loaded from: classes17.dex */
abstract class RFC1522Codec {
    protected static final java.lang.String POSTFIX = "?=";
    protected static final java.lang.String PREFIX = "=?";
    protected static final char SEP = '?';

    protected abstract byte[] doDecoding(byte[] bArr) throws org.apache.commons.codec.DecoderException;

    protected abstract byte[] doEncoding(byte[] bArr) throws org.apache.commons.codec.EncoderException;

    protected abstract java.lang.String getEncoding();

    RFC1522Codec() {
    }

    protected java.lang.String decodeText(java.lang.String str) throws org.apache.commons.codec.DecoderException, java.io.UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        if (!str.startsWith(PREFIX) || !str.endsWith(POSTFIX)) {
            throw new org.apache.commons.codec.DecoderException("RFC 1522 violation: malformed encoded content");
        }
        int length = str.length() - 2;
        int indexOf = str.indexOf(63, 2);
        if (indexOf == length) {
            throw new org.apache.commons.codec.DecoderException("RFC 1522 violation: charset token not found");
        }
        java.lang.String substring = str.substring(2, indexOf);
        if (substring.isEmpty()) {
            throw new org.apache.commons.codec.DecoderException("RFC 1522 violation: charset not specified");
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(63, i);
        if (indexOf2 == length) {
            throw new org.apache.commons.codec.DecoderException("RFC 1522 violation: encoding token not found");
        }
        java.lang.String substring2 = str.substring(i, indexOf2);
        if (!getEncoding().equalsIgnoreCase(substring2)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("This codec cannot decode ");
            sb.append(substring2);
            sb.append(" encoded content");
            throw new org.apache.commons.codec.DecoderException(sb.toString());
        }
        int i2 = indexOf2 + 1;
        return new java.lang.String(doDecoding(org.apache.commons.codec.binary.StringUtils.getBytesUsAscii(str.substring(i2, str.indexOf(63, i2)))), substring);
    }

    protected java.lang.String encodeText(java.lang.String str, java.nio.charset.Charset charset) throws org.apache.commons.codec.EncoderException {
        if (str == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(PREFIX);
        sb.append(charset);
        sb.append('?');
        sb.append(getEncoding());
        sb.append('?');
        sb.append(org.apache.commons.codec.binary.StringUtils.newStringUsAscii(doEncoding(str.getBytes(charset))));
        sb.append(POSTFIX);
        return sb.toString();
    }

    protected java.lang.String encodeText(java.lang.String str, java.lang.String str2) throws org.apache.commons.codec.EncoderException, java.io.UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return encodeText(str, java.nio.charset.Charset.forName(str2));
    }
}
