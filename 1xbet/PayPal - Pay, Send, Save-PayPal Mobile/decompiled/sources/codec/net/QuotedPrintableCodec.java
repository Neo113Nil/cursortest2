package codec.net;

/* loaded from: classes7.dex */
public class QuotedPrintableCodec implements codec.BinaryEncoder, codec.BinaryDecoder, codec.StringEncoder, codec.StringDecoder {
    public static final java.util.BitSet c = new java.util.BitSet(256);

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.charset.Charset f2817a;
    public final boolean b;

    static {
        for (int i = 33; i <= 60; i++) {
            c.set(i);
        }
        for (int i2 = 62; i2 <= 126; i2++) {
            c.set(i2);
        }
        java.util.BitSet bitSet = c;
        bitSet.set(9);
        bitSet.set(32);
    }

    public QuotedPrintableCodec() {
        this(codec.Charsets.UTF_8, false);
    }

    public static final byte[] decodeQuotedPrintable(byte[] bArr) throws codec.DecoderException {
        if (bArr == null) {
            return null;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 61) {
                int i2 = i + 1;
                try {
                    byte b2 = bArr[i2];
                    if (b2 != 13) {
                        i += 2;
                        byteArrayOutputStream.write((char) ((com.payair.csdk.c4.a(b2) << 4) + com.payair.csdk.c4.a(bArr[i])));
                    } else {
                        i = i2;
                    }
                } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                    throw new codec.DecoderException("Invalid quoted-printable encoding", e);
                }
            } else if (b != 13 && b != 10) {
                byteArrayOutputStream.write(b);
            }
            i++;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static final byte[] encodeQuotedPrintable(java.util.BitSet bitSet, byte[] bArr) {
        return encodeQuotedPrintable(bitSet, bArr, false);
    }

    @Override // codec.BinaryDecoder
    public byte[] decode(byte[] bArr) throws codec.DecoderException {
        return decodeQuotedPrintable(bArr);
    }

    @Override // codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return encodeQuotedPrintable(c, bArr, this.b);
    }

    public java.nio.charset.Charset getCharset() {
        return this.f2817a;
    }

    public java.lang.String getDefaultCharset() {
        return this.f2817a.name();
    }

    public QuotedPrintableCodec(boolean z) {
        this(codec.Charsets.UTF_8, z);
    }

    public static final byte[] encodeQuotedPrintable(java.util.BitSet bitSet, byte[] bArr, boolean z) {
        if (bArr == null) {
            return null;
        }
        if (bitSet == null) {
            bitSet = c;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i = 0;
        if (z) {
            int i2 = 1;
            int i3 = 1;
            while (true) {
                int i4 = 3;
                if (i >= bArr.length - 3) {
                    break;
                }
                int i5 = bArr[i];
                if (i5 < 0) {
                    i5 += 256;
                }
                if (i3 < 73) {
                    if (bitSet.get(i5)) {
                        byteArrayOutputStream.write(i5);
                        i4 = 1;
                    } else {
                        byteArrayOutputStream.write(61);
                        char a2 = com.payair.csdk.c4.a(i5 >> 4);
                        char a3 = com.payair.csdk.c4.a(i5);
                        byteArrayOutputStream.write(a2);
                        byteArrayOutputStream.write(a3);
                    }
                    i3 += i4;
                } else {
                    if (!bitSet.get(i5) || i5 == 32 || i5 == 9) {
                        byteArrayOutputStream.write(61);
                        char a4 = com.payair.csdk.c4.a(i5 >> 4);
                        char a5 = com.payair.csdk.c4.a(i5);
                        byteArrayOutputStream.write(a4);
                        byteArrayOutputStream.write(a5);
                    } else {
                        byteArrayOutputStream.write(i5);
                    }
                    byteArrayOutputStream.write(61);
                    byteArrayOutputStream.write(13);
                    byteArrayOutputStream.write(10);
                    i3 = 1;
                }
                i++;
            }
            int i6 = bArr[bArr.length - 3];
            if (i6 < 0) {
                i6 += 256;
            }
            if (!bitSet.get(i6) || ((i6 == 32 || i6 == 9) && i3 > 68)) {
                byteArrayOutputStream.write(61);
                char a6 = com.payair.csdk.c4.a(i6 >> 4);
                char a7 = com.payair.csdk.c4.a(i6);
                byteArrayOutputStream.write(a6);
                byteArrayOutputStream.write(a7);
                i2 = 3;
            } else {
                byteArrayOutputStream.write(i6);
            }
            if (i3 + i2 > 71) {
                byteArrayOutputStream.write(61);
                byteArrayOutputStream.write(13);
                byteArrayOutputStream.write(10);
            }
            for (int length = bArr.length - 2; length < bArr.length; length++) {
                int i7 = bArr[length];
                if (i7 < 0) {
                    i7 += 256;
                }
                if (!bitSet.get(i7) || (length > bArr.length - 2 && (i7 == 32 || i7 == 9))) {
                    byteArrayOutputStream.write(61);
                    char a8 = com.payair.csdk.c4.a(i7 >> 4);
                    char a9 = com.payair.csdk.c4.a(i7);
                    byteArrayOutputStream.write(a8);
                    byteArrayOutputStream.write(a9);
                } else {
                    byteArrayOutputStream.write(i7);
                }
            }
        } else {
            int length2 = bArr.length;
            while (i < length2) {
                int i8 = bArr[i];
                if (i8 < 0) {
                    i8 += 256;
                }
                if (bitSet.get(i8)) {
                    byteArrayOutputStream.write(i8);
                } else {
                    byteArrayOutputStream.write(61);
                    char a10 = com.payair.csdk.c4.a(i8 >> 4);
                    char a11 = com.payair.csdk.c4.a(i8);
                    byteArrayOutputStream.write(a10);
                    byteArrayOutputStream.write(a11);
                }
                i++;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public java.lang.String decode(java.lang.String str, java.nio.charset.Charset charset) throws codec.DecoderException {
        if (str == null) {
            return null;
        }
        return new java.lang.String(decode(codec.binary.StringUtils.getBytesUsAscii(str)), charset);
    }

    @Override // codec.StringEncoder
    public java.lang.String encode(java.lang.String str) throws codec.EncoderException {
        return encode(str, getCharset());
    }

    public QuotedPrintableCodec(java.nio.charset.Charset charset) {
        this(charset, false);
    }

    public java.lang.String decode(java.lang.String str, java.lang.String str2) throws codec.DecoderException, java.io.UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return new java.lang.String(decode(codec.binary.StringUtils.getBytesUsAscii(str)), str2);
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
        sb.append(" cannot be quoted-printable encoded");
        throw new codec.EncoderException(sb.toString());
    }

    public QuotedPrintableCodec(java.nio.charset.Charset charset, boolean z) {
        this.f2817a = charset;
        this.b = z;
    }

    @Override // codec.StringDecoder
    public java.lang.String decode(java.lang.String str) throws codec.DecoderException {
        return decode(str, getCharset());
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
        sb.append(" cannot be quoted-printable decoded");
        throw new codec.DecoderException(sb.toString());
    }

    public QuotedPrintableCodec(java.lang.String str) throws java.nio.charset.IllegalCharsetNameException, java.lang.IllegalArgumentException, java.nio.charset.UnsupportedCharsetException {
        this(java.nio.charset.Charset.forName(str), false);
    }

    public java.lang.String encode(java.lang.String str, java.nio.charset.Charset charset) {
        if (str == null) {
            return null;
        }
        return codec.binary.StringUtils.newStringUsAscii(encode(str.getBytes(charset)));
    }

    public java.lang.String encode(java.lang.String str, java.lang.String str2) throws java.io.UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return codec.binary.StringUtils.newStringUsAscii(encode(str.getBytes(str2)));
    }
}
