package org.apache.commons.codec.net;

/* loaded from: classes17.dex */
public class URLCodec implements org.apache.commons.codec.BinaryEncoder, org.apache.commons.codec.BinaryDecoder, org.apache.commons.codec.StringEncoder, org.apache.commons.codec.StringDecoder {
    protected static final byte ESCAPE_CHAR = 37;

    @java.lang.Deprecated
    protected static final java.util.BitSet WWW_FORM_URL;
    private static final java.util.BitSet getHighSpeedVideoFpsRanges = new java.util.BitSet(256);

    @java.lang.Deprecated
    protected volatile java.lang.String charset;

    static {
        for (int i = 97; i <= 122; i++) {
            getHighSpeedVideoFpsRanges.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            getHighSpeedVideoFpsRanges.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            getHighSpeedVideoFpsRanges.set(i3);
        }
        java.util.BitSet bitSet = getHighSpeedVideoFpsRanges;
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        bitSet.set(42);
        bitSet.set(32);
        WWW_FORM_URL = (java.util.BitSet) bitSet.clone();
    }

    public static final byte[] decodeUrl(byte[] bArr) throws org.apache.commons.codec.DecoderException {
        if (bArr == null) {
            return null;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 43) {
                byteArrayOutputStream.write(32);
            } else if (b == 37) {
                try {
                    i += 2;
                    byteArrayOutputStream.write((char) ((org.apache.commons.codec.net.Utils.getHighSpeedVideoFpsRanges(bArr[i + 1]) << 4) + org.apache.commons.codec.net.Utils.getHighSpeedVideoFpsRanges(bArr[i])));
                } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                    throw new org.apache.commons.codec.DecoderException("Invalid URL encoding: ", e);
                }
            } else {
                byteArrayOutputStream.write(b);
            }
            i++;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static final byte[] encodeUrl(java.util.BitSet bitSet, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bitSet == null) {
            bitSet = getHighSpeedVideoFpsRanges;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = bArr[i];
            if (i2 < 0) {
                i2 += 256;
            }
            if (bitSet.get(i2)) {
                if (i2 == 32) {
                    i2 = 43;
                }
                byteArrayOutputStream.write(i2);
            } else {
                byteArrayOutputStream.write(37);
                char highResolutionOutputSizeshNQ4ISI = org.apache.commons.codec.net.Utils.getHighResolutionOutputSizeshNQ4ISI(i2 >> 4);
                char highResolutionOutputSizeshNQ4ISI2 = org.apache.commons.codec.net.Utils.getHighResolutionOutputSizeshNQ4ISI(i2);
                byteArrayOutputStream.write(highResolutionOutputSizeshNQ4ISI);
                byteArrayOutputStream.write(highResolutionOutputSizeshNQ4ISI2);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public URLCodec() {
        this(org.apache.commons.codec.CharEncoding.UTF_8);
    }

    public URLCodec(java.lang.String str) {
        this.charset = str;
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) throws org.apache.commons.codec.DecoderException {
        return decodeUrl(bArr);
    }

    @Override // org.apache.commons.codec.Decoder
    public java.lang.Object decode(java.lang.Object obj) throws org.apache.commons.codec.DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof java.lang.String) {
            return decode((java.lang.String) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Objects of type ");
        sb.append(obj.getClass().getName());
        sb.append(" cannot be URL decoded");
        throw new org.apache.commons.codec.DecoderException(sb.toString());
    }

    @Override // org.apache.commons.codec.StringDecoder
    public java.lang.String decode(java.lang.String str) throws org.apache.commons.codec.DecoderException {
        if (str == null) {
            return null;
        }
        try {
            return decode(str, getDefaultCharset());
        } catch (java.io.UnsupportedEncodingException e) {
            throw new org.apache.commons.codec.DecoderException(e.getMessage(), e);
        }
    }

    public java.lang.String decode(java.lang.String str, java.lang.String str2) throws org.apache.commons.codec.DecoderException, java.io.UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return new java.lang.String(decode(org.apache.commons.codec.binary.StringUtils.getBytesUsAscii(str)), str2);
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return encodeUrl(getHighSpeedVideoFpsRanges, bArr);
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws org.apache.commons.codec.EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        if (obj instanceof java.lang.String) {
            return encode((java.lang.String) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Objects of type ");
        sb.append(obj.getClass().getName());
        sb.append(" cannot be URL encoded");
        throw new org.apache.commons.codec.EncoderException(sb.toString());
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String str) throws org.apache.commons.codec.EncoderException {
        if (str == null) {
            return null;
        }
        try {
            return encode(str, getDefaultCharset());
        } catch (java.io.UnsupportedEncodingException e) {
            throw new org.apache.commons.codec.EncoderException(e.getMessage(), e);
        }
    }

    public java.lang.String encode(java.lang.String str, java.lang.String str2) throws java.io.UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return org.apache.commons.codec.binary.StringUtils.newStringUsAscii(encode(str.getBytes(str2)));
    }

    public java.lang.String getDefaultCharset() {
        return this.charset;
    }

    @java.lang.Deprecated
    public java.lang.String getEncoding() {
        return this.charset;
    }
}
