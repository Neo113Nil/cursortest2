package codec.net;

/* loaded from: classes7.dex */
public class QCodec extends com.payair.csdk.e2 implements codec.StringEncoder, codec.StringDecoder {
    public static final java.util.BitSet c;

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.charset.Charset f2816a;
    public boolean b;

    static {
        java.util.BitSet bitSet = new java.util.BitSet(256);
        c = bitSet;
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
            c.set(i);
        }
        java.util.BitSet bitSet2 = c;
        bitSet2.set(58);
        bitSet2.set(59);
        bitSet2.set(60);
        bitSet2.set(62);
        bitSet2.set(64);
        for (int i2 = 65; i2 <= 90; i2++) {
            c.set(i2);
        }
        java.util.BitSet bitSet3 = c;
        bitSet3.set(91);
        bitSet3.set(92);
        bitSet3.set(93);
        bitSet3.set(94);
        bitSet3.set(96);
        for (int i3 = 97; i3 <= 122; i3++) {
            c.set(i3);
        }
        java.util.BitSet bitSet4 = c;
        bitSet4.set(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        bitSet4.set(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        bitSet4.set(125);
        bitSet4.set(126);
    }

    public QCodec() {
        this(codec.Charsets.UTF_8);
    }

    @Override // codec.StringDecoder
    public java.lang.String decode(java.lang.String str) throws codec.DecoderException {
        if (str == null) {
            return null;
        }
        try {
            return decodeText(str);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new codec.DecoderException(e.getMessage(), e);
        }
    }

    @Override // com.payair.csdk.e2
    public byte[] doDecoding(byte[] bArr) throws codec.DecoderException {
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
                return codec.net.QuotedPrintableCodec.decodeQuotedPrintable(bArr2);
            }
        }
        return codec.net.QuotedPrintableCodec.decodeQuotedPrintable(bArr);
    }

    @Override // com.payair.csdk.e2
    public byte[] doEncoding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] encodeQuotedPrintable = codec.net.QuotedPrintableCodec.encodeQuotedPrintable(c, bArr);
        if (this.b) {
            for (int i = 0; i < encodeQuotedPrintable.length; i++) {
                if (encodeQuotedPrintable[i] == 32) {
                    encodeQuotedPrintable[i] = com.visa.cbp.getEncExpo.addOnTrimMemoryListener;
                }
            }
        }
        return encodeQuotedPrintable;
    }

    public java.lang.String encode(java.lang.String str, java.nio.charset.Charset charset) throws codec.EncoderException {
        if (str == null) {
            return null;
        }
        return encodeText(str, charset);
    }

    public java.nio.charset.Charset getCharset() {
        return this.f2816a;
    }

    public java.lang.String getDefaultCharset() {
        return this.f2816a.name();
    }

    @Override // com.payair.csdk.e2
    public java.lang.String getEncoding() {
        return com.visa.cbp.getEncExpo.updateVisuals;
    }

    public boolean isEncodeBlanks() {
        return this.b;
    }

    public void setEncodeBlanks(boolean z) {
        this.b = z;
    }

    public QCodec(java.nio.charset.Charset charset) {
        this.b = false;
        this.f2816a = charset;
    }

    public java.lang.String encode(java.lang.String str, java.lang.String str2) throws codec.EncoderException {
        if (str == null) {
            return null;
        }
        try {
            return encodeText(str, str2);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new codec.EncoderException(e.getMessage(), e);
        }
    }

    @Override // codec.Decoder
    public java.lang.Object decode(java.lang.Object obj) throws codec.DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof java.lang.String) {
            return decode((java.lang.String) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Objects of type ");
        sb.append(obj.getClass().getName());
        sb.append(" cannot be decoded using Q codec");
        throw new codec.DecoderException(sb.toString());
    }

    @Override // codec.StringEncoder
    public java.lang.String encode(java.lang.String str) throws codec.EncoderException {
        if (str == null) {
            return null;
        }
        return encode(str, getCharset());
    }

    @Override // codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws codec.EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof java.lang.String) {
            return encode((java.lang.String) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Objects of type ");
        sb.append(obj.getClass().getName());
        sb.append(" cannot be encoded using Q codec");
        throw new codec.EncoderException(sb.toString());
    }

    public QCodec(java.lang.String str) {
        this(java.nio.charset.Charset.forName(str));
    }
}
