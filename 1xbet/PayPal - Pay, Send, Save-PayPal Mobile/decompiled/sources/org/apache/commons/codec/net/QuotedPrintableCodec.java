package org.apache.commons.codec.net;

/* loaded from: classes17.dex */
public class QuotedPrintableCodec implements org.apache.commons.codec.BinaryEncoder, org.apache.commons.codec.BinaryDecoder, org.apache.commons.codec.StringEncoder, org.apache.commons.codec.StringDecoder {
    private static final java.util.BitSet getHighSpeedVideoFpsRanges = new java.util.BitSet(256);
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final java.nio.charset.Charset getHighSpeedVideoSizes;

    static {
        for (int i = 33; i <= 60; i++) {
            getHighSpeedVideoFpsRanges.set(i);
        }
        for (int i2 = 62; i2 <= 126; i2++) {
            getHighSpeedVideoFpsRanges.set(i2);
        }
        java.util.BitSet bitSet = getHighSpeedVideoFpsRanges;
        bitSet.set(9);
        bitSet.set(32);
    }

    public static final byte[] decodeQuotedPrintable(byte[] bArr) throws org.apache.commons.codec.DecoderException {
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
                        byteArrayOutputStream.write((char) ((org.apache.commons.codec.net.Utils.getHighSpeedVideoFpsRanges(b2) << 4) + org.apache.commons.codec.net.Utils.getHighSpeedVideoFpsRanges(bArr[i])));
                    } else {
                        i = i2;
                    }
                } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                    throw new org.apache.commons.codec.DecoderException("Invalid quoted-printable encoding", e);
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

    public static final byte[] encodeQuotedPrintable(java.util.BitSet bitSet, byte[] bArr, boolean z) {
        int i;
        if (bArr == null) {
            return null;
        }
        if (bitSet == null) {
            bitSet = getHighSpeedVideoFpsRanges;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int length = bArr.length;
        if (!z) {
            int length2 = bArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                int i3 = bArr[i2];
                if (i3 < 0) {
                    i3 += 256;
                }
                if (bitSet.get(i3)) {
                    byteArrayOutputStream.write(i3);
                } else {
                    byteArrayOutputStream.write(61);
                    char highResolutionOutputSizeshNQ4ISI = org.apache.commons.codec.net.Utils.getHighResolutionOutputSizeshNQ4ISI(i3 >> 4);
                    char highResolutionOutputSizeshNQ4ISI2 = org.apache.commons.codec.net.Utils.getHighResolutionOutputSizeshNQ4ISI(i3);
                    byteArrayOutputStream.write(highResolutionOutputSizeshNQ4ISI);
                    byteArrayOutputStream.write(highResolutionOutputSizeshNQ4ISI2);
                }
            }
        } else {
            if (length < 3) {
                return null;
            }
            int i4 = 1;
            int i5 = 0;
            while (true) {
                i = length - 3;
                if (i5 >= i) {
                    break;
                }
                int i6 = bArr[i5];
                if (i6 < 0) {
                    i6 += 256;
                }
                if (i4 < 73) {
                    i4 += getHighSpeedVideoSizes(i6, !bitSet.get(i6), byteArrayOutputStream);
                } else {
                    getHighSpeedVideoSizes(i6, !bitSet.get(i6) || i6 == 32 || i6 == 9, byteArrayOutputStream);
                    byteArrayOutputStream.write(61);
                    byteArrayOutputStream.write(13);
                    byteArrayOutputStream.write(10);
                    i4 = 1;
                }
                i5++;
            }
            int i7 = bArr[i];
            if (i7 < 0) {
                i7 += 256;
            }
            if (i4 + getHighSpeedVideoSizes(i7, !bitSet.get(i7) || ((i7 == 32 || i7 == 9) && i4 > 68), byteArrayOutputStream) > 71) {
                byteArrayOutputStream.write(61);
                byteArrayOutputStream.write(13);
                byteArrayOutputStream.write(10);
            }
            int i8 = length - 2;
            int i9 = i8;
            while (i9 < length) {
                int i10 = bArr[i9];
                if (i10 < 0) {
                    i10 += 256;
                }
                getHighSpeedVideoSizes(i10, !bitSet.get(i10) || (i9 > i8 && (i10 == 32 || i10 == 9)), byteArrayOutputStream);
                i9++;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public QuotedPrintableCodec() {
        this(java.nio.charset.StandardCharsets.UTF_8, false);
    }

    public QuotedPrintableCodec(boolean z) {
        this(java.nio.charset.StandardCharsets.UTF_8, z);
    }

    public QuotedPrintableCodec(java.nio.charset.Charset charset) {
        this(charset, false);
    }

    public QuotedPrintableCodec(java.nio.charset.Charset charset, boolean z) {
        this.getHighSpeedVideoSizes = charset;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public QuotedPrintableCodec(java.lang.String str) throws java.nio.charset.IllegalCharsetNameException, java.lang.IllegalArgumentException, java.nio.charset.UnsupportedCharsetException {
        this(java.nio.charset.Charset.forName(str), false);
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) throws org.apache.commons.codec.DecoderException {
        return decodeQuotedPrintable(bArr);
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
        sb.append(" cannot be quoted-printable decoded");
        throw new org.apache.commons.codec.DecoderException(sb.toString());
    }

    @Override // org.apache.commons.codec.StringDecoder
    public java.lang.String decode(java.lang.String str) throws org.apache.commons.codec.DecoderException {
        return decode(str, getCharset());
    }

    public java.lang.String decode(java.lang.String str, java.nio.charset.Charset charset) throws org.apache.commons.codec.DecoderException {
        if (str == null) {
            return null;
        }
        return new java.lang.String(decode(org.apache.commons.codec.binary.StringUtils.getBytesUsAscii(str)), charset);
    }

    public java.lang.String decode(java.lang.String str, java.lang.String str2) throws org.apache.commons.codec.DecoderException, java.io.UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return new java.lang.String(decode(org.apache.commons.codec.binary.StringUtils.getBytesUsAscii(str)), str2);
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return encodeQuotedPrintable(getHighSpeedVideoFpsRanges, bArr, this.getHighResolutionOutputSizeshNQ4ISI);
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
        sb.append(" cannot be quoted-printable encoded");
        throw new org.apache.commons.codec.EncoderException(sb.toString());
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String str) throws org.apache.commons.codec.EncoderException {
        return encode(str, getCharset());
    }

    public java.lang.String encode(java.lang.String str, java.nio.charset.Charset charset) {
        if (str == null) {
            return null;
        }
        return org.apache.commons.codec.binary.StringUtils.newStringUsAscii(encode(str.getBytes(charset)));
    }

    public java.lang.String encode(java.lang.String str, java.lang.String str2) throws java.io.UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return org.apache.commons.codec.binary.StringUtils.newStringUsAscii(encode(str.getBytes(str2)));
    }

    public java.nio.charset.Charset getCharset() {
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.String getDefaultCharset() {
        return this.getHighSpeedVideoSizes.name();
    }

    private static int getHighSpeedVideoSizes(int i, boolean z, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        if (!z) {
            byteArrayOutputStream.write(i);
            return 1;
        }
        byteArrayOutputStream.write(61);
        char highResolutionOutputSizeshNQ4ISI = org.apache.commons.codec.net.Utils.getHighResolutionOutputSizeshNQ4ISI(i >> 4);
        char highResolutionOutputSizeshNQ4ISI2 = org.apache.commons.codec.net.Utils.getHighResolutionOutputSizeshNQ4ISI(i);
        byteArrayOutputStream.write(highResolutionOutputSizeshNQ4ISI);
        byteArrayOutputStream.write(highResolutionOutputSizeshNQ4ISI2);
        return 3;
    }
}
