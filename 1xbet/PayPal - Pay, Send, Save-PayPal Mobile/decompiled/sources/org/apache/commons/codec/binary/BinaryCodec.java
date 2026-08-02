package org.apache.commons.codec.binary;

/* loaded from: classes17.dex */
public class BinaryCodec implements org.apache.commons.codec.BinaryDecoder, org.apache.commons.codec.BinaryEncoder {
    private static final char[] getHighSpeedVideoSizes = new char[0];
    private static final byte[] getHighSpeedVideoFpsRanges = new byte[0];
    private static final int[] getHighResolutionOutputSizeshNQ4ISI = {1, 2, 4, 8, 16, 32, 64, 128};

    public static byte[] fromAscii(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return getHighSpeedVideoFpsRanges;
        }
        int length = cArr.length;
        int i = length >> 3;
        byte[] bArr = new byte[i];
        int i2 = length - 1;
        int i3 = 0;
        while (i3 < i) {
            int i4 = 0;
            while (true) {
                int[] iArr = getHighResolutionOutputSizeshNQ4ISI;
                if (i4 < iArr.length) {
                    if (cArr[i2 - i4] == '1') {
                        bArr[i3] = (byte) (iArr[i4] | bArr[i3]);
                    }
                    i4++;
                }
            }
            i3++;
            i2 -= 8;
        }
        return bArr;
    }

    static boolean Camera2StreamConfigurationMap(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static java.lang.String toAsciiString(byte[] bArr) {
        return new java.lang.String(toAsciiChars(bArr));
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        return fromAscii(bArr);
    }

    @Override // org.apache.commons.codec.Decoder
    public java.lang.Object decode(java.lang.Object obj) throws org.apache.commons.codec.DecoderException {
        if (obj == null) {
            return getHighSpeedVideoFpsRanges;
        }
        if (obj instanceof byte[]) {
            return fromAscii((byte[]) obj);
        }
        if (obj instanceof char[]) {
            return fromAscii((char[]) obj);
        }
        if (obj instanceof java.lang.String) {
            return fromAscii(((java.lang.String) obj).toCharArray());
        }
        throw new org.apache.commons.codec.DecoderException("argument not a byte array");
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return toAsciiBytes(bArr);
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws org.apache.commons.codec.EncoderException {
        if (!(obj instanceof byte[])) {
            throw new org.apache.commons.codec.EncoderException("argument not a byte array");
        }
        return toAsciiChars((byte[]) obj);
    }

    public byte[] toByteArray(java.lang.String str) {
        if (str == null) {
            return getHighSpeedVideoFpsRanges;
        }
        return fromAscii(str.toCharArray());
    }

    public static byte[] fromAscii(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return getHighSpeedVideoFpsRanges;
        }
        int length = bArr.length;
        int i = length >> 3;
        byte[] bArr2 = new byte[i];
        int i2 = length - 1;
        int i3 = 0;
        while (i3 < i) {
            int i4 = 0;
            while (true) {
                int[] iArr = getHighResolutionOutputSizeshNQ4ISI;
                if (i4 < iArr.length) {
                    if (bArr[i2 - i4] == 49) {
                        bArr2[i3] = (byte) (iArr[i4] | bArr2[i3]);
                    }
                    i4++;
                }
            }
            i3++;
            i2 -= 8;
        }
        return bArr2;
    }

    public static byte[] toAsciiBytes(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return getHighSpeedVideoFpsRanges;
        }
        int length = bArr.length;
        int i = length << 3;
        byte[] bArr2 = new byte[i];
        int i2 = i - 1;
        int i3 = 0;
        while (i3 < length) {
            int i4 = 0;
            while (true) {
                int[] iArr = getHighResolutionOutputSizeshNQ4ISI;
                if (i4 < iArr.length) {
                    if ((iArr[i4] & bArr[i3]) == 0) {
                        bArr2[i2 - i4] = 48;
                    } else {
                        bArr2[i2 - i4] = org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE;
                    }
                    i4++;
                }
            }
            i3++;
            i2 -= 8;
        }
        return bArr2;
    }

    public static char[] toAsciiChars(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return getHighSpeedVideoSizes;
        }
        int length = bArr.length;
        int i = length << 3;
        char[] cArr = new char[i];
        int i2 = i - 1;
        int i3 = 0;
        while (i3 < length) {
            int i4 = 0;
            while (true) {
                int[] iArr = getHighResolutionOutputSizeshNQ4ISI;
                if (i4 < iArr.length) {
                    if ((iArr[i4] & bArr[i3]) == 0) {
                        cArr[i2 - i4] = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    } else {
                        cArr[i2 - i4] = '1';
                    }
                    i4++;
                }
            }
            i3++;
            i2 -= 8;
        }
        return cArr;
    }
}
