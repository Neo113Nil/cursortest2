package org.bouncycastle.util.encoders;

/* loaded from: classes17.dex */
public class HexEncoder implements org.bouncycastle.util.encoders.Encoder {
    protected final byte[] encodingTable = {48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 97, 98, 99, 100, 101, 102};
    protected final byte[] decodingTable = new byte[128];

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(java.lang.String str, java.io.OutputStream outputStream) throws java.io.IOException {
        char c;
        char charAt;
        byte[] bArr = new byte[36];
        int length = str.length();
        while (true) {
            c = ' ';
            if (length <= 0 || !((charAt = str.charAt(length - 1)) == '\n' || charAt == '\r' || charAt == '\t' || charAt == ' ')) {
                break;
            }
            length--;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != '\t' && charAt2 != c) {
                    break;
                }
                i++;
            }
            int i4 = i + 1;
            byte b = this.decodingTable[str.charAt(i)];
            while (i4 < length) {
                char charAt3 = str.charAt(i4);
                if (charAt3 != '\n' && charAt3 != '\r' && charAt3 != '\t' && charAt3 != c) {
                    break;
                }
                i4++;
            }
            byte b2 = this.decodingTable[str.charAt(i4)];
            if ((b | b2) < 0) {
                throw new java.io.IOException("invalid characters encountered in Hex string");
            }
            int i5 = i2 + 1;
            bArr[i2] = (byte) ((b << 4) | b2);
            if (i5 == 36) {
                outputStream.write(bArr);
                i2 = 0;
            } else {
                i2 = i5;
            }
            i3++;
            i = i4 + 1;
            c = ' ';
        }
        if (i2 > 0) {
            outputStream.write(bArr, 0, i2);
        }
        return i3;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) throws java.io.IOException {
        char c;
        int i3 = i;
        byte[] bArr2 = new byte[36];
        int i4 = i2 + i3;
        while (i4 > i3 && ((c = (char) bArr[i4 - 1]) == '\n' || c == '\r' || c == '\t' || c == ' ')) {
            i4--;
        }
        int i5 = 0;
        int i6 = 0;
        while (i3 < i4) {
            while (i3 < i4) {
                char c2 = (char) bArr[i3];
                if (c2 != '\n' && c2 != '\r' && c2 != '\t' && c2 != ' ') {
                    break;
                }
                i3++;
            }
            int i7 = i3 + 1;
            byte b = this.decodingTable[bArr[i3]];
            while (i7 < i4) {
                char c3 = (char) bArr[i7];
                if (c3 != '\n' && c3 != '\r' && c3 != '\t' && c3 != ' ') {
                    break;
                }
                i7++;
            }
            byte b2 = this.decodingTable[bArr[i7]];
            if ((b | b2) < 0) {
                throw new java.io.IOException("invalid characters encountered in Hex data");
            }
            int i8 = i5 + 1;
            bArr2[i5] = (byte) ((b << 4) | b2);
            if (i8 == 36) {
                outputStream.write(bArr2);
                i5 = 0;
            } else {
                i5 = i8;
            }
            i6++;
            i3 = i7 + 1;
        }
        if (i5 > 0) {
            outputStream.write(bArr2, 0, i5);
        }
        return i6;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getEncodedLength(int i) {
        return i * 2;
    }

    protected void initialiseDecodingTable() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.decodingTable;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.encodingTable;
            if (i >= bArr2.length) {
                byte[] bArr3 = this.decodingTable;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.decodingTable[bArr2[i]] = (byte) i;
            i++;
        }
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i) {
        return i / 2;
    }

    public int encode(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws java.io.IOException {
        int i4 = i;
        int i5 = i3;
        while (i4 < i2 + i) {
            byte b = bArr[i4];
            byte[] bArr3 = this.encodingTable;
            bArr2[i5] = bArr3[(b & 255) >>> 4];
            bArr2[i5 + 1] = bArr3[b & com.google.common.base.Ascii.SI];
            i4++;
            i5 += 2;
        }
        return i5 - i3;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int encode(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) throws java.io.IOException {
        if (i2 < 0) {
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i3 = i2;
        while (i3 > 0) {
            int min = java.lang.Math.min(36, i3);
            outputStream.write(bArr2, 0, encode(bArr, i, min, bArr2, 0));
            i += min;
            i3 -= min;
        }
        return i2 * 2;
    }

    final byte[] getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, int i2) throws java.io.IOException {
        if (str == null) {
            throw new java.lang.NullPointerException("'str' cannot be null");
        }
        if (i < 0 || i2 < 0 || i > str.length() - i2) {
            throw new java.lang.IndexOutOfBoundsException("invalid offset and/or length specified");
        }
        if ((i2 & 1) != 0) {
            throw new java.io.IOException("a hexadecimal encoding must have an even number of characters");
        }
        int i3 = i2 >>> 1;
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (i4 < i3) {
            byte b = this.decodingTable[str.charAt(i)];
            int i5 = i + 2;
            int i6 = this.decodingTable[str.charAt(i + 1)] | (b << 4);
            if (i6 < 0) {
                throw new java.io.IOException("invalid characters encountered in Hex string");
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return bArr;
    }

    public HexEncoder() {
        initialiseDecodingTable();
    }
}
