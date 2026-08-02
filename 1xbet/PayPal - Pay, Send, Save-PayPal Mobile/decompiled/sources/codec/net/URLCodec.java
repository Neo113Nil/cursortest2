package codec.net;

/* loaded from: classes7.dex */
public class URLCodec implements codec.BinaryEncoder, codec.BinaryDecoder, codec.StringEncoder, codec.StringDecoder {
    protected static final byte ESCAPE_CHAR = 37;

    @java.lang.Deprecated
    protected static final java.util.BitSet WWW_FORM_URL;

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.BitSet f2818a = new java.util.BitSet(256);

    @java.lang.Deprecated
    protected volatile java.lang.String charset;

    static {
        for (int i = 97; i <= 122; i++) {
            f2818a.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f2818a.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            f2818a.set(i3);
        }
        java.util.BitSet bitSet = f2818a;
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        bitSet.set(42);
        bitSet.set(32);
        WWW_FORM_URL = (java.util.BitSet) bitSet.clone();
    }

    public URLCodec() {
        this("UTF-8");
    }

    public static final byte[] decodeUrl(byte[] bArr) throws codec.DecoderException {
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
                    byteArrayOutputStream.write((char) ((com.payair.csdk.c4.a(bArr[i + 1]) << 4) + com.payair.csdk.c4.a(bArr[i])));
                } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                    throw new codec.DecoderException("Invalid URL encoding: ", e);
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
            bitSet = f2818a;
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
                char a2 = com.payair.csdk.c4.a(i2 >> 4);
                char a3 = com.payair.csdk.c4.a(i2);
                byteArrayOutputStream.write(a2);
                byteArrayOutputStream.write(a3);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // codec.BinaryDecoder
    public byte[] decode(byte[] bArr) throws codec.DecoderException {
        return decodeUrl(bArr);
    }

    @Override // codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return encodeUrl(f2818a, bArr);
    }

    public java.lang.String getDefaultCharset() {
        return this.charset;
    }

    @java.lang.Deprecated
    public java.lang.String getEncoding() {
        return this.charset;
    }

    public URLCodec(java.lang.String str) {
        this.charset = str;
    }

    public java.lang.String decode(java.lang.String str, java.lang.String str2) throws codec.DecoderException, java.io.UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return new java.lang.String(decode(codec.binary.StringUtils.getBytesUsAscii(str)), str2);
    }

    public java.lang.String encode(java.lang.String str, java.lang.String str2) throws java.io.UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return codec.binary.StringUtils.newStringUsAscii(encode(str.getBytes(str2)));
    }

    @Override // codec.StringDecoder
    public java.lang.String decode(java.lang.String str) throws codec.DecoderException {
        if (str == null) {
            return null;
        }
        try {
            return decode(str, getDefaultCharset());
        } catch (java.io.UnsupportedEncodingException e) {
            throw new codec.DecoderException(e.getMessage(), e);
        }
    }

    @Override // codec.StringEncoder
    public java.lang.String encode(java.lang.String str) throws codec.EncoderException {
        if (str == null) {
            return null;
        }
        try {
            return encode(str, getDefaultCharset());
        } catch (java.io.UnsupportedEncodingException e) {
            throw new codec.EncoderException(e.getMessage(), e);
        }
    }

    @Override // codec.Decoder
    public java.lang.Object decode(java.lang.Object obj) throws codec.DecoderException {
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
        throw new codec.DecoderException(sb.toString());
    }

    @Override // codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws codec.EncoderException {
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
        throw new codec.EncoderException(sb.toString());
    }
}
