package org.apache.commons.codec.net;

/* loaded from: classes17.dex */
public class QCodec extends org.apache.commons.codec.net.RFC1522Codec implements org.apache.commons.codec.StringEncoder, org.apache.commons.codec.StringDecoder {
    private static final java.util.BitSet getHighSpeedVideoFpsRangesFor;
    private final java.nio.charset.Charset getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoSizes;

    static {
        java.util.BitSet bitSet = new java.util.BitSet(256);
        getHighSpeedVideoFpsRangesFor = bitSet;
        bitSet.set(32);
        bitSet.set(33);
        bitSet.set(34);
        bitSet.set(35);
        bitSet.set(36);
        bitSet.set(37);
        bitSet.set(38);
        bitSet.set(39);
        bitSet.set(40);
        bitSet.set(41);
        bitSet.set(42);
        bitSet.set(43);
        bitSet.set(44);
        bitSet.set(45);
        bitSet.set(46);
        bitSet.set(47);
        for (int i = 48; i <= 57; i++) {
            getHighSpeedVideoFpsRangesFor.set(i);
        }
        java.util.BitSet bitSet2 = getHighSpeedVideoFpsRangesFor;
        bitSet2.set(58);
        bitSet2.set(59);
        bitSet2.set(60);
        bitSet2.set(62);
        bitSet2.set(64);
        for (int i2 = 65; i2 <= 90; i2++) {
            getHighSpeedVideoFpsRangesFor.set(i2);
        }
        java.util.BitSet bitSet3 = getHighSpeedVideoFpsRangesFor;
        bitSet3.set(91);
        bitSet3.set(92);
        bitSet3.set(93);
        bitSet3.set(94);
        bitSet3.set(96);
        for (int i3 = 97; i3 <= 122; i3++) {
            getHighSpeedVideoFpsRangesFor.set(i3);
        }
        java.util.BitSet bitSet4 = getHighSpeedVideoFpsRangesFor;
        bitSet4.set(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        bitSet4.set(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        bitSet4.set(125);
        bitSet4.set(126);
    }

    public QCodec() {
        this(java.nio.charset.StandardCharsets.UTF_8);
    }

    public QCodec(java.nio.charset.Charset charset) {
        this.getHighResolutionOutputSizeshNQ4ISI = charset;
    }

    public QCodec(java.lang.String str) {
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
        sb.append(" cannot be decoded using Q codec");
        throw new org.apache.commons.codec.DecoderException(sb.toString());
    }

    @Override // org.apache.commons.codec.StringDecoder
    public java.lang.String decode(java.lang.String str) throws org.apache.commons.codec.DecoderException {
        if (str == null) {
            return null;
        }
        try {
            return decodeText(str);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new org.apache.commons.codec.DecoderException(e.getMessage(), e);
        }
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    protected byte[] doDecoding(byte[] bArr) throws org.apache.commons.codec.DecoderException {
        if (bArr == null) {
            return null;
        }
        for (byte b : bArr) {
            if (b == 95) {
                byte[] bArr2 = new byte[bArr.length];
                for (int i = 0; i < bArr.length; i++) {
                    byte b2 = bArr[i];
                    if (b2 != 95) {
                        bArr2[i] = b2;
                    } else {
                        bArr2[i] = 32;
                    }
                }
                return org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(bArr2);
            }
        }
        return org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(bArr);
    }

    @Override // org.apache.commons.codec.net.RFC1522Codec
    protected byte[] doEncoding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] encodeQuotedPrintable = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(getHighSpeedVideoFpsRangesFor, bArr);
        if (this.getHighSpeedVideoSizes) {
            for (int i = 0; i < encodeQuotedPrintable.length; i++) {
                if (encodeQuotedPrintable[i] == 32) {
                    encodeQuotedPrintable[i] = com.visa.cbp.getEncExpo.addOnTrimMemoryListener;
                }
            }
        }
        return encodeQuotedPrintable;
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
        sb.append(" cannot be encoded using Q codec");
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
        return com.visa.cbp.getEncExpo.updateVisuals;
    }

    public boolean isEncodeBlanks() {
        return this.getHighSpeedVideoSizes;
    }

    public void setEncodeBlanks(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }
}
