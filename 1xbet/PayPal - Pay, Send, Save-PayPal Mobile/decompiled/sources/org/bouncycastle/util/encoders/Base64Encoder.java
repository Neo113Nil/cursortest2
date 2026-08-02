package org.bouncycastle.util.encoders;

/* loaded from: classes17.dex */
public class Base64Encoder implements org.bouncycastle.util.encoders.Encoder {
    protected final byte[] encodingTable = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 113, 114, 115, 116, 117, 118, com.visa.cbp.getEncExpo.IResultReceiver, 120, 121, 122, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 43, 47};
    protected byte padding = kotlin.io.encoding.Base64.padSymbol;
    protected final byte[] decodingTable = new byte[128];

    private static int getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, int i2) {
        while (i < i2) {
            char c = (char) bArr[i];
            if (c != '\n' && c != '\r' && c != '\t' && c != ' ') {
                break;
            }
            i++;
        }
        return i;
    }

    private static int getHighSpeedVideoSizes(java.lang.String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\n' && charAt != '\r' && charAt != '\t' && charAt != ' ') {
                break;
            }
            i++;
        }
        return i;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(java.lang.String str, java.io.OutputStream outputStream) throws java.io.IOException {
        char charAt;
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '\n' || charAt == '\r' || charAt == '\t' || charAt == ' ')) {
            length--;
        }
        if (length == 0) {
            return 0;
        }
        int i = length;
        int i2 = 0;
        while (i > 0 && i2 != 4) {
            char charAt2 = str.charAt(i - 1);
            if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != '\t' && charAt2 != ' ') {
                i2++;
            }
            i--;
        }
        int highSpeedVideoSizes = getHighSpeedVideoSizes(str, 0, i);
        int i3 = 0;
        int i4 = 0;
        while (highSpeedVideoSizes < i) {
            byte b = this.decodingTable[str.charAt(highSpeedVideoSizes)];
            int highSpeedVideoSizes2 = getHighSpeedVideoSizes(str, highSpeedVideoSizes + 1, i);
            byte b2 = this.decodingTable[str.charAt(highSpeedVideoSizes2)];
            int highSpeedVideoSizes3 = getHighSpeedVideoSizes(str, highSpeedVideoSizes2 + 1, i);
            byte b3 = this.decodingTable[str.charAt(highSpeedVideoSizes3)];
            int highSpeedVideoSizes4 = getHighSpeedVideoSizes(str, highSpeedVideoSizes3 + 1, i);
            byte b4 = this.decodingTable[str.charAt(highSpeedVideoSizes4)];
            if ((b | b2 | b3 | b4) < 0) {
                throw new java.io.IOException("invalid characters encountered in base64 data");
            }
            bArr[i3] = (byte) ((b << 2) | (b2 >> 4));
            bArr[i3 + 1] = (byte) ((b2 << 4) | (b3 >> 2));
            int i5 = i3 + 3;
            bArr[i3 + 2] = (byte) ((b3 << 6) | b4);
            i4 += 3;
            if (i5 == 54) {
                outputStream.write(bArr);
                i3 = 0;
            } else {
                i3 = i5;
            }
            highSpeedVideoSizes = getHighSpeedVideoSizes(str, highSpeedVideoSizes4 + 1, i);
        }
        if (i3 > 0) {
            outputStream.write(bArr, 0, i3);
        }
        int highSpeedVideoSizes5 = getHighSpeedVideoSizes(str, highSpeedVideoSizes, length);
        int highSpeedVideoSizes6 = getHighSpeedVideoSizes(str, highSpeedVideoSizes5 + 1, length);
        int highSpeedVideoSizes7 = getHighSpeedVideoSizes(str, highSpeedVideoSizes6 + 1, length);
        return i4 + Camera2StreamConfigurationMap(outputStream, str.charAt(highSpeedVideoSizes5), str.charAt(highSpeedVideoSizes6), str.charAt(highSpeedVideoSizes7), str.charAt(getHighSpeedVideoSizes(str, highSpeedVideoSizes7 + 1, length)));
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) throws java.io.IOException {
        char c;
        byte[] bArr2 = new byte[54];
        int i3 = i2 + i;
        while (i3 > i && ((c = (char) bArr[i3 - 1]) == '\n' || c == '\r' || c == '\t' || c == ' ')) {
            i3--;
        }
        if (i3 == 0) {
            return 0;
        }
        int i4 = i3;
        int i5 = 0;
        while (i4 > i && i5 != 4) {
            char c2 = (char) bArr[i4 - 1];
            if (c2 != '\n' && c2 != '\r' && c2 != '\t' && c2 != ' ') {
                i5++;
            }
            i4--;
        }
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr, i, i4);
        int i6 = 0;
        int i7 = 0;
        while (highSpeedVideoFpsRangesFor < i4) {
            byte b = this.decodingTable[bArr[highSpeedVideoFpsRangesFor]];
            int highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(bArr, highSpeedVideoFpsRangesFor + 1, i4);
            byte b2 = this.decodingTable[bArr[highSpeedVideoFpsRangesFor2]];
            int highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(bArr, highSpeedVideoFpsRangesFor2 + 1, i4);
            byte b3 = this.decodingTable[bArr[highSpeedVideoFpsRangesFor3]];
            int highSpeedVideoFpsRangesFor4 = getHighSpeedVideoFpsRangesFor(bArr, highSpeedVideoFpsRangesFor3 + 1, i4);
            byte b4 = this.decodingTable[bArr[highSpeedVideoFpsRangesFor4]];
            if ((b | b2 | b3 | b4) < 0) {
                throw new java.io.IOException("invalid characters encountered in base64 data");
            }
            bArr2[i6] = (byte) ((b << 2) | (b2 >> 4));
            bArr2[i6 + 1] = (byte) ((b2 << 4) | (b3 >> 2));
            int i8 = i6 + 3;
            bArr2[i6 + 2] = (byte) ((b3 << 6) | b4);
            if (i8 == 54) {
                outputStream.write(bArr2);
                i6 = 0;
            } else {
                i6 = i8;
            }
            i7 += 3;
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr, highSpeedVideoFpsRangesFor4 + 1, i4);
        }
        if (i6 > 0) {
            outputStream.write(bArr2, 0, i6);
        }
        int highSpeedVideoFpsRangesFor5 = getHighSpeedVideoFpsRangesFor(bArr, highSpeedVideoFpsRangesFor, i3);
        int highSpeedVideoFpsRangesFor6 = getHighSpeedVideoFpsRangesFor(bArr, highSpeedVideoFpsRangesFor5 + 1, i3);
        int highSpeedVideoFpsRangesFor7 = getHighSpeedVideoFpsRangesFor(bArr, highSpeedVideoFpsRangesFor6 + 1, i3);
        return i7 + Camera2StreamConfigurationMap(outputStream, (char) bArr[highSpeedVideoFpsRangesFor5], (char) bArr[highSpeedVideoFpsRangesFor6], (char) bArr[highSpeedVideoFpsRangesFor7], (char) bArr[getHighSpeedVideoFpsRangesFor(bArr, highSpeedVideoFpsRangesFor7 + 1, i3)]);
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
                return;
            }
            this.decodingTable[bArr2[i]] = (byte) i;
            i++;
        }
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i) {
        return (i / 4) * 3;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getEncodedLength(int i) {
        return ((i + 2) / 3) * 4;
    }

    public int encode(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws java.io.IOException {
        int i4 = i;
        int i5 = i3;
        while (i4 < (i + i2) - 2) {
            byte b = bArr[i4];
            int i6 = bArr[i4 + 1] & 255;
            int i7 = i4 + 3;
            byte b2 = bArr[i4 + 2];
            byte[] bArr3 = this.encodingTable;
            bArr2[i5] = bArr3[(b >>> 2) & 63];
            bArr2[i5 + 1] = bArr3[((b << 4) | (i6 >>> 4)) & 63];
            bArr2[i5 + 2] = bArr3[((i6 << 2) | ((b2 & 255) >>> 6)) & 63];
            bArr2[i5 + 3] = bArr3[b2 & 63];
            i5 += 4;
            i4 = i7;
        }
        int i8 = i2 - (i4 - i);
        if (i8 == 1) {
            int i9 = bArr[i4] & 255;
            byte[] bArr4 = this.encodingTable;
            bArr2[i5] = bArr4[(i9 >>> 2) & 63];
            bArr2[i5 + 1] = bArr4[(i9 << 4) & 63];
            byte b3 = this.padding;
            bArr2[i5 + 2] = b3;
            bArr2[i5 + 3] = b3;
            i5 += 4;
        } else if (i8 == 2) {
            int i10 = bArr[i4] & 255;
            int i11 = bArr[i4 + 1] & 255;
            byte[] bArr5 = this.encodingTable;
            bArr2[i5] = bArr5[(i10 >>> 2) & 63];
            bArr2[i5 + 1] = bArr5[((i10 << 4) | (i11 >>> 4)) & 63];
            bArr2[i5 + 2] = bArr5[(i11 << 2) & 63];
            bArr2[i5 + 3] = this.padding;
            i5 += 4;
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
            int min = java.lang.Math.min(54, i3);
            outputStream.write(bArr2, 0, encode(bArr, i, min, bArr2, 0));
            i += min;
            i3 -= min;
        }
        return ((i2 + 2) / 3) * 4;
    }

    private int Camera2StreamConfigurationMap(java.io.OutputStream outputStream, char c, char c2, char c3, char c4) throws java.io.IOException {
        char c5 = this.padding;
        if (c3 == c5) {
            if (c4 != c5) {
                throw new java.io.IOException("invalid characters encountered at end of base64 data");
            }
            byte[] bArr = this.decodingTable;
            byte b = bArr[c];
            byte b2 = bArr[c2];
            if ((b | b2) < 0) {
                throw new java.io.IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b << 2) | (b2 >> 4));
            return 1;
        }
        if (c4 == c5) {
            byte[] bArr2 = this.decodingTable;
            byte b3 = bArr2[c];
            byte b4 = bArr2[c2];
            byte b5 = bArr2[c3];
            if ((b3 | b4 | b5) < 0) {
                throw new java.io.IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b3 << 2) | (b4 >> 4));
            outputStream.write((b4 << 4) | (b5 >> 2));
            return 2;
        }
        byte[] bArr3 = this.decodingTable;
        byte b6 = bArr3[c];
        byte b7 = bArr3[c2];
        byte b8 = bArr3[c3];
        byte b9 = bArr3[c4];
        if ((b6 | b7 | b8 | b9) < 0) {
            throw new java.io.IOException("invalid characters encountered at end of base64 data");
        }
        outputStream.write((b6 << 2) | (b7 >> 4));
        outputStream.write((b7 << 4) | (b8 >> 2));
        outputStream.write((b8 << 6) | b9);
        return 3;
    }

    public Base64Encoder() {
        initialiseDecodingTable();
    }
}
