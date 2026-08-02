package org.apache.commons.codec.net;

/* loaded from: classes17.dex */
public class BCodec extends org.apache.commons.codec.net.RFC1522Codec implements org.apache.commons.codec.StringEncoder, org.apache.commons.codec.StringDecoder {
    private static final org.apache.commons.codec.CodecPolicy getHighSpeedVideoSizes = org.apache.commons.codec.CodecPolicy.LENIENT;
    private final java.nio.charset.Charset getHighResolutionOutputSizeshNQ4ISI;
    private final org.apache.commons.codec.CodecPolicy getHighSpeedVideoFpsRangesFor;

    public BCodec() {
        this(java.nio.charset.StandardCharsets.UTF_8);
    }

    public BCodec(java.nio.charset.Charset charset) {
        this(charset, getHighSpeedVideoSizes);
    }

    public BCodec(java.nio.charset.Charset charset, org.apache.commons.codec.CodecPolicy codecPolicy) {
        this.getHighResolutionOutputSizeshNQ4ISI = charset;
        this.getHighSpeedVideoFpsRangesFor = codecPolicy;
    }

    public BCodec(java.lang.String str) {
        this(java.nio.charset.Charset.forName(str));
    }

    @Override // org.apache.commons.codec.Decoder
    public java.lang.Object decode(java.lang.Object obj) throws org.apache.commons.codec.DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof java.lang.String) {
            return decode((java.lang.String) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Objects of type ");
        sb.append(obj.getClass().getName());
        sb.append(" cannot be decoded using BCodec");
        throw new org.apache.commons.codec.DecoderException(sb.toString());
    }

    @Override // org.apache.commons.codec.StringDecoder
    public java.lang.String decode(java.lang.String str) throws org.apache.commons.codec.DecoderException {
        if (str == null) {
            return null;
        }
        try {
            return decodeText(str);
        } catch (java.io.UnsupportedEncodingException | java.lang.IllegalArgumentException e) {
            throw new org.apache.commons.codec.DecoderException(e.getMessage(), e);
        }
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    protected byte[] doDecoding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new org.apache.commons.codec.binary.Base64(0, org.apache.commons.codec.binary.BaseNCodec.getChunkSeparator(), false, this.getHighSpeedVideoFpsRangesFor).decode(bArr);
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    protected byte[] doEncoding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return org.apache.commons.codec.binary.Base64.encodeBase64(bArr);
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws org.apache.commons.codec.EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof java.lang.String) {
            return encode((java.lang.String) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Objects of type ");
        sb.append(obj.getClass().getName());
        sb.append(" cannot be encoded using BCodec");
        throw new org.apache.commons.codec.EncoderException(sb.toString());
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String str) throws org.apache.commons.codec.EncoderException {
        if (str == null) {
            return null;
        }
        return encode(str, getCharset());
    }

    public java.lang.String encode(java.lang.String str, java.nio.charset.Charset charset) throws org.apache.commons.codec.EncoderException {
        if (str == null) {
            return null;
        }
        return encodeText(str, charset);
    }

    public java.lang.String encode(java.lang.String str, java.lang.String str2) throws org.apache.commons.codec.EncoderException {
        if (str == null) {
            return null;
        }
        try {
            return encodeText(str, str2);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new org.apache.commons.codec.EncoderException(e.getMessage(), e);
        }
    }

    public java.nio.charset.Charset getCharset() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String getDefaultCharset() {
        return this.getHighResolutionOutputSizeshNQ4ISI.name();
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    protected java.lang.String getEncoding() {
        return "B";
    }

    public boolean isStrictDecoding() {
        return this.getHighSpeedVideoFpsRangesFor == org.apache.commons.codec.CodecPolicy.STRICT;
    }
}
