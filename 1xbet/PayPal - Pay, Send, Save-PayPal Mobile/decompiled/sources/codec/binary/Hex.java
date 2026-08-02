package codec.binary;

/* loaded from: classes7.dex */
public class Hex implements codec.BinaryEncoder, codec.BinaryDecoder {
    public static final java.lang.String DEFAULT_CHARSET_NAME = "UTF-8";

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.charset.Charset f2767a;
    public static final java.nio.charset.Charset DEFAULT_CHARSET = codec.Charsets.UTF_8;
    public static final char[] b = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'e', 'f'};
    public static final char[] c = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public Hex() {
        this.f2767a = DEFAULT_CHARSET;
    }

    public static byte[] decodeHex(java.lang.String str) throws codec.DecoderException {
        return decodeHex(str.toCharArray());
    }

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, true);
    }

    public static java.lang.String encodeHexString(byte[] bArr) {
        return new java.lang.String(encodeHex(bArr));
    }

    public static int toDigit(char c2, int i) throws codec.DecoderException {
        int digit = java.lang.Character.digit(c2, 16);
        if (digit != -1) {
            return digit;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Illegal hexadecimal character ");
        sb.append(c2);
        sb.append(" at index ");
        sb.append(i);
        throw new codec.DecoderException(sb.toString());
    }

    @Override // codec.BinaryDecoder
    public byte[] decode(byte[] bArr) throws codec.DecoderException {
        return decodeHex(new java.lang.String(bArr, getCharset()).toCharArray());
    }

    @Override // codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return encodeHexString(bArr).getBytes(getCharset());
    }

    public java.nio.charset.Charset getCharset() {
        return this.f2767a;
    }

    public java.lang.String getCharsetName() {
        return this.f2767a.name();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[charsetName=");
        sb.append(this.f2767a);
        sb.append("]");
        return sb.toString();
    }

    public static byte[] decodeHex(char[] cArr) throws codec.DecoderException {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new codec.DecoderException("Odd number of characters.");
        }
        byte[] bArr = new byte[length >> 1];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int digit = toDigit(cArr[i], i);
            int i3 = i + 1;
            i += 2;
            bArr[i2] = (byte) (((digit << 4) | toDigit(cArr[i3], i3)) & 255);
            i2++;
        }
        return bArr;
    }

    public static char[] encodeHex(java.nio.ByteBuffer byteBuffer) {
        return encodeHex(byteBuffer, true);
    }

    public static java.lang.String encodeHexString(byte[] bArr, boolean z) {
        return new java.lang.String(encodeHex(bArr, z));
    }

    public byte[] encode(java.nio.ByteBuffer byteBuffer) {
        return encodeHexString(byteBuffer).getBytes(getCharset());
    }

    public static char[] encodeHex(byte[] bArr, boolean z) {
        return encodeHex(bArr, z ? b : c);
    }

    public static java.lang.String encodeHexString(java.nio.ByteBuffer byteBuffer) {
        return new java.lang.String(encodeHex(byteBuffer));
    }

    public byte[] decode(java.nio.ByteBuffer byteBuffer) throws codec.DecoderException {
        byte[] bArr;
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
        } else {
            byte[] bArr2 = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr2);
            bArr = bArr2;
        }
        return decodeHex(new java.lang.String(bArr, getCharset()).toCharArray());
    }

    @Override // codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws codec.EncoderException {
        byte[] bArr;
        if (obj instanceof java.lang.String) {
            bArr = ((java.lang.String) obj).getBytes(getCharset());
        } else if (obj instanceof java.nio.ByteBuffer) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
            if (byteBuffer.hasArray()) {
                bArr = byteBuffer.array();
            } else {
                byte[] bArr2 = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr2);
                bArr = bArr2;
            }
        } else {
            try {
                bArr = (byte[]) obj;
            } catch (java.lang.ClassCastException e) {
                throw new codec.EncoderException(e.getMessage(), e);
            }
        }
        return encodeHex(bArr);
    }

    public Hex(java.nio.charset.Charset charset) {
        this.f2767a = charset;
    }

    public static char[] encodeHex(java.nio.ByteBuffer byteBuffer, boolean z) {
        return encodeHex(byteBuffer, z ? b : c);
    }

    public static java.lang.String encodeHexString(java.nio.ByteBuffer byteBuffer, boolean z) {
        return new java.lang.String(encodeHex(byteBuffer, z));
    }

    public static char[] encodeHex(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[length << 1];
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            cArr2[i] = cArr[(b2 & com.visa.cbp.getEncExpo.onUnminimized) >>> 4];
            cArr2[i + 1] = cArr[b2 & com.google.common.base.Ascii.SI];
            i2++;
            i += 2;
        }
        return cArr2;
    }

    public Hex(java.lang.String str) {
        this(java.nio.charset.Charset.forName(str));
    }

    @Override // codec.Decoder
    public java.lang.Object decode(java.lang.Object obj) throws codec.DecoderException {
        if (obj instanceof java.lang.String) {
            return decode(((java.lang.String) obj).toCharArray());
        }
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof java.nio.ByteBuffer) {
            return decode((java.nio.ByteBuffer) obj);
        }
        try {
            return decodeHex((char[]) obj);
        } catch (java.lang.ClassCastException e) {
            throw new codec.DecoderException(e.getMessage(), e);
        }
    }

    public static char[] encodeHex(java.nio.ByteBuffer byteBuffer, char[] cArr) {
        byte[] bArr;
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
        } else {
            byte[] bArr2 = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr2);
            bArr = bArr2;
        }
        return encodeHex(bArr, cArr);
    }
}
