package codec.binary;

/* loaded from: classes7.dex */
public class BinaryCodec implements codec.BinaryDecoder, codec.BinaryEncoder {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f2766a = new char[0];
    public static final byte[] b = new byte[0];
    public static final int[] c = {1, 2, 4, 8, 16, 32, 64, 128};

    public static byte[] fromAscii(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return b;
        }
        int length = cArr.length >> 3;
        byte[] bArr = new byte[length];
        int length2 = cArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = 0;
            while (true) {
                int[] iArr = c;
                if (i2 < 8) {
                    if (cArr[length2 - i2] == '1') {
                        bArr[i] = (byte) (iArr[i2] | bArr[i]);
                    }
                    i2++;
                }
            }
            i++;
            length2 -= 8;
        }
        return bArr;
    }

    public static byte[] toAsciiBytes(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return b;
        }
        int length = bArr.length << 3;
        byte[] bArr2 = new byte[length];
        int i = length - 1;
        int i2 = 0;
        while (i2 < bArr.length) {
            int i3 = 0;
            while (true) {
                int[] iArr = c;
                if (i3 < 8) {
                    if ((iArr[i3] & bArr[i2]) == 0) {
                        bArr2[i - i3] = 48;
                    } else {
                        bArr2[i - i3] = org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE;
                    }
                    i3++;
                }
            }
            i2++;
            i -= 8;
        }
        return bArr2;
    }

    public static char[] toAsciiChars(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return f2766a;
        }
        int length = bArr.length << 3;
        char[] cArr = new char[length];
        int i = length - 1;
        int i2 = 0;
        while (i2 < bArr.length) {
            int i3 = 0;
            while (true) {
                int[] iArr = c;
                if (i3 < 8) {
                    if ((iArr[i3] & bArr[i2]) == 0) {
                        cArr[i - i3] = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    } else {
                        cArr[i - i3] = '1';
                    }
                    i3++;
                }
            }
            i2++;
            i -= 8;
        }
        return cArr;
    }

    public static java.lang.String toAsciiString(byte[] bArr) {
        return new java.lang.String(toAsciiChars(bArr));
    }

    @Override // codec.Decoder
    public java.lang.Object decode(java.lang.Object obj) throws codec.DecoderException {
        if (obj == null) {
            return b;
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
        throw new codec.DecoderException("argument not a byte array");
    }

    @Override // codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return toAsciiBytes(bArr);
    }

    public byte[] toByteArray(java.lang.String str) {
        return str == null ? b : fromAscii(str.toCharArray());
    }

    @Override // codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws codec.EncoderException {
        if (obj instanceof byte[]) {
            return toAsciiChars((byte[]) obj);
        }
        throw new codec.EncoderException("argument not a byte array");
    }

    @Override // codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        return fromAscii(bArr);
    }

    public static byte[] fromAscii(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            int length = bArr.length >> 3;
            byte[] bArr2 = new byte[length];
            int length2 = bArr.length - 1;
            int i = 0;
            while (i < length) {
                int i2 = 0;
                while (true) {
                    int[] iArr = c;
                    if (i2 < 8) {
                        if (bArr[length2 - i2] == 49) {
                            bArr2[i] = (byte) (iArr[i2] | bArr2[i]);
                        }
                        i2++;
                    }
                }
                i++;
                length2 -= 8;
            }
            return bArr2;
        }
        return b;
    }
}
