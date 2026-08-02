package codec.net;

/* loaded from: classes7.dex */
public class BCodec extends com.payair.csdk.e2 implements codec.StringEncoder, codec.StringDecoder {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.charset.Charset f2814a;

    public BCodec() {
        this(codec.Charsets.UTF_8);
    }

    @Override // codec.StringDecoder
    public java.lang.String decode(java.lang.String str) throws codec.DecoderException {
        if (str == null) {
            return null;
        }
        try {
            return decodeText(str);
        } catch (java.io.UnsupportedEncodingException | java.lang.IllegalArgumentException e) {
            throw new codec.DecoderException(e.getMessage(), e);
        }
    }

    @Override // com.payair.csdk.e2
    public byte[] doDecoding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return codec.binary.Base64.decodeBase64(bArr);
    }

    @Override // com.payair.csdk.e2
    public byte[] doEncoding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return codec.binary.Base64.encodeBase64(bArr);
    }

    public java.lang.String encode(java.lang.String str, java.nio.charset.Charset charset) throws codec.EncoderException {
        if (str == null) {
            return null;
        }
        return encodeText(str, charset);
    }

    public java.nio.charset.Charset getCharset() {
        return this.f2814a;
    }

    public java.lang.String getDefaultCharset() {
        return this.f2814a.name();
    }

    @Override // com.payair.csdk.e2
    public java.lang.String getEncoding() {
        return "B";
    }

    public BCodec(java.nio.charset.Charset charset) {
        this.f2814a = charset;
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

    public BCodec(java.lang.String str) {
        this(java.nio.charset.Charset.forName(str));
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
        sb.append(" cannot be decoded using BCodec");
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
        sb.append(" cannot be encoded using BCodec");
        throw new codec.EncoderException(sb.toString());
    }
}
