package org.apache.commons.codec.binary;

/* loaded from: classes5.dex */
public class Hex implements org.apache.commons.codec.BinaryEncoder, org.apache.commons.codec.BinaryDecoder {
    private final java.nio.charset.Charset getHighResolutionOutputSizeshNQ4ISI;
    public static final java.nio.charset.Charset DEFAULT_CHARSET = java.nio.charset.StandardCharsets.UTF_8;
    public static final java.lang.String DEFAULT_CHARSET_NAME = org.apache.commons.codec.CharEncoding.UTF_8;
    private static final char[] getHighSpeedVideoFpsRanges = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'e', 'f'};
    private static final char[] Camera2StreamConfigurationMap = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static byte[] decodeHex(char[] cArr) throws org.apache.commons.codec.DecoderException {
        byte[] bArr = new byte[cArr.length >> 1];
        decodeHex(cArr, bArr, 0);
        return bArr;
    }

    public static int decodeHex(char[] cArr, byte[] bArr, int i) throws org.apache.commons.codec.DecoderException {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new org.apache.commons.codec.DecoderException("Odd number of characters.");
        }
        int i2 = length >> 1;
        if (bArr.length - i < i2) {
            throw new org.apache.commons.codec.DecoderException("Output array is not large enough to accommodate decoded data.");
        }
        int i3 = 0;
        while (i3 < length) {
            int digit = toDigit(cArr[i3], i3);
            int i4 = i3 + 1;
            i3 += 2;
            bArr[i] = (byte) (((digit << 4) | toDigit(cArr[i4], i4)) & 255);
            i++;
        }
        return i2;
    }

    public static byte[] decodeHex(java.lang.String str) throws org.apache.commons.codec.DecoderException {
        return decodeHex(str.toCharArray());
    }

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, true);
    }

    public static char[] encodeHex(byte[] bArr, boolean z) {
        return encodeHex(bArr, z ? getHighSpeedVideoFpsRanges : Camera2StreamConfigurationMap);
    }

    protected static char[] encodeHex(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[length << 1];
        getHighSpeedVideoFpsRangesFor(bArr, 0, length, cArr, cArr2, 0);
        return cArr2;
    }

    public static char[] encodeHex(byte[] bArr, int i, int i2, boolean z) {
        char[] cArr = new char[i2 << 1];
        getHighSpeedVideoFpsRangesFor(bArr, i, i2, z ? getHighSpeedVideoFpsRanges : Camera2StreamConfigurationMap, cArr, 0);
        return cArr;
    }

    public static void encodeHex(byte[] bArr, int i, int i2, boolean z, char[] cArr, int i3) {
        getHighSpeedVideoFpsRangesFor(bArr, i, i2, z ? getHighSpeedVideoFpsRanges : Camera2StreamConfigurationMap, cArr, i3);
    }

    private static void getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, int i2, char[] cArr, char[] cArr2, int i3) {
        int i4 = i;
        while (i4 < i + i2) {
            byte b = bArr[i4];
            cArr2[i3] = cArr[(b & com.visa.cbp.getEncExpo.onUnminimized) >>> 4];
            cArr2[i3 + 1] = cArr[b & com.google.common.base.Ascii.SI];
            i4++;
            i3 += 2;
        }
    }

    public static char[] encodeHex(java.nio.ByteBuffer byteBuffer) {
        return encodeHex(byteBuffer, true);
    }

    public static char[] encodeHex(java.nio.ByteBuffer byteBuffer, boolean z) {
        return encodeHex(byteBuffer, z ? getHighSpeedVideoFpsRanges : Camera2StreamConfigurationMap);
    }

    protected static char[] encodeHex(java.nio.ByteBuffer byteBuffer, char[] cArr) {
        return encodeHex(Camera2StreamConfigurationMap(byteBuffer), cArr);
    }

    public static java.lang.String encodeHexString(byte[] bArr) {
        return new java.lang.String(encodeHex(bArr));
    }

    public static java.lang.String encodeHexString(byte[] bArr, boolean z) {
        return new java.lang.String(encodeHex(bArr, z));
    }

    public static java.lang.String encodeHexString(java.nio.ByteBuffer byteBuffer) {
        return new java.lang.String(encodeHex(byteBuffer));
    }

    public static java.lang.String encodeHexString(java.nio.ByteBuffer byteBuffer, boolean z) {
        return new java.lang.String(encodeHex(byteBuffer, z));
    }

    private static byte[] Camera2StreamConfigurationMap(java.nio.ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            byte[] array = byteBuffer.array();
            if (remaining == array.length) {
                byteBuffer.position(remaining);
                return array;
            }
        }
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        return bArr;
    }

    protected static int toDigit(char c, int i) throws org.apache.commons.codec.DecoderException {
        int digit = java.lang.Character.digit(c, 16);
        if (digit != -1) {
            return digit;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Illegal hexadecimal character ");
        sb.append(c);
        sb.append(" at index ");
        sb.append(i);
        throw new org.apache.commons.codec.DecoderException(sb.toString());
    }

    public Hex() {
        this.getHighResolutionOutputSizeshNQ4ISI = DEFAULT_CHARSET;
    }

    public Hex(java.nio.charset.Charset charset) {
        this.getHighResolutionOutputSizeshNQ4ISI = charset;
    }

    public Hex(java.lang.String str) {
        this(java.nio.charset.Charset.forName(str));
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) throws org.apache.commons.codec.DecoderException {
        return decodeHex(new java.lang.String(bArr, getCharset()).toCharArray());
    }

    public byte[] decode(java.nio.ByteBuffer byteBuffer) throws org.apache.commons.codec.DecoderException {
        return decodeHex(new java.lang.String(Camera2StreamConfigurationMap(byteBuffer), getCharset()).toCharArray());
    }

    @Override // org.apache.commons.codec.Decoder
    public java.lang.Object decode(java.lang.Object obj) throws org.apache.commons.codec.DecoderException {
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
            throw new org.apache.commons.codec.DecoderException(e.getMessage(), e);
        }
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return encodeHexString(bArr).getBytes(getCharset());
    }

    public byte[] encode(java.nio.ByteBuffer byteBuffer) {
        return encodeHexString(byteBuffer).getBytes(getCharset());
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws org.apache.commons.codec.EncoderException {
        byte[] bArr;
        if (obj instanceof java.lang.String) {
            bArr = ((java.lang.String) obj).getBytes(getCharset());
        } else if (obj instanceof java.nio.ByteBuffer) {
            bArr = Camera2StreamConfigurationMap((java.nio.ByteBuffer) obj);
        } else {
            try {
                bArr = (byte[]) obj;
            } catch (java.lang.ClassCastException e) {
                throw new org.apache.commons.codec.EncoderException(e.getMessage(), e);
            }
        }
        return encodeHex(bArr);
    }

    public java.nio.charset.Charset getCharset() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String getCharsetName() {
        return this.getHighResolutionOutputSizeshNQ4ISI.name();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[charsetName=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("]");
        return sb.toString();
    }
}
