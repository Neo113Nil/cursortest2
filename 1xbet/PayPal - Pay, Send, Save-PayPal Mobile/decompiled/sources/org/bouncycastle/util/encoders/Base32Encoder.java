package org.bouncycastle.util.encoders;

/* loaded from: classes17.dex */
public class Base32Encoder implements org.bouncycastle.util.encoders.Encoder {
    private static final byte[] getHighSpeedVideoFpsRangesFor = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE};
    private final byte[] Camera2StreamConfigurationMap;
    private final byte getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRanges;

    private static int getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2) {
        while (i < i2) {
            char c = (char) bArr[i];
            if (c != '\n' && c != '\r' && c != '\t' && c != ' ') {
                break;
            }
            i++;
        }
        return i;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) throws java.io.IOException {
        int i3;
        char c;
        byte[] bArr2 = new byte[55];
        int i4 = i + i2;
        while (i4 > i && ((c = (char) bArr[i4 - 1]) == '\n' || c == '\r' || c == '\t' || c == ' ')) {
            i4--;
        }
        if (i4 == 0) {
            return 0;
        }
        int i5 = i4;
        int i6 = 0;
        while (i5 > i && i6 != 8) {
            char c2 = (char) bArr[i5 - 1];
            if (c2 != '\n' && c2 != '\r' && c2 != '\t' && c2 != ' ') {
                i6++;
            }
            i5--;
        }
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr, i, i5);
        int i7 = 0;
        int i8 = 0;
        while (highResolutionOutputSizeshNQ4ISI < i5) {
            byte b = this.Camera2StreamConfigurationMap[bArr[highResolutionOutputSizeshNQ4ISI]];
            int highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI + 1, i5);
            byte b2 = this.Camera2StreamConfigurationMap[bArr[highResolutionOutputSizeshNQ4ISI2]];
            int highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI2 + 1, i5);
            byte b3 = this.Camera2StreamConfigurationMap[bArr[highResolutionOutputSizeshNQ4ISI3]];
            int highResolutionOutputSizeshNQ4ISI4 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI3 + 1, i5);
            byte b4 = this.Camera2StreamConfigurationMap[bArr[highResolutionOutputSizeshNQ4ISI4]];
            int highResolutionOutputSizeshNQ4ISI5 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI4 + 1, i5);
            byte b5 = this.Camera2StreamConfigurationMap[bArr[highResolutionOutputSizeshNQ4ISI5]];
            int highResolutionOutputSizeshNQ4ISI6 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI5 + 1, i5);
            byte b6 = this.Camera2StreamConfigurationMap[bArr[highResolutionOutputSizeshNQ4ISI6]];
            int highResolutionOutputSizeshNQ4ISI7 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI6 + 1, i5);
            byte b7 = this.Camera2StreamConfigurationMap[bArr[highResolutionOutputSizeshNQ4ISI7]];
            int highResolutionOutputSizeshNQ4ISI8 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI7 + 1, i5);
            int i9 = i4;
            byte b8 = this.Camera2StreamConfigurationMap[bArr[highResolutionOutputSizeshNQ4ISI8]];
            if ((b | b2 | b3 | b4 | b5 | b6 | b7 | b8) < 0) {
                throw new java.io.IOException("invalid characters encountered in base32 data");
            }
            bArr2[i7] = (byte) ((b << 3) | (b2 >> 2));
            bArr2[i7 + 1] = (byte) ((b2 << 6) | (b3 << 1) | (b4 >> 4));
            bArr2[i7 + 2] = (byte) ((b4 << 4) | (b5 >> 1));
            bArr2[i7 + 3] = (byte) ((b6 << 2) | (b5 << 7) | (b7 >> 3));
            int i10 = i7 + 5;
            bArr2[i7 + 4] = (byte) (b8 | (b7 << 5));
            if (i10 == 55) {
                outputStream.write(bArr2);
                i7 = 0;
            } else {
                i7 = i10;
            }
            i8 += 5;
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI8 + 1, i5);
            i4 = i9;
        }
        int i11 = i4;
        if (i7 > 0) {
            outputStream.write(bArr2, 0, i7);
        }
        int highResolutionOutputSizeshNQ4ISI9 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI, i11);
        int highResolutionOutputSizeshNQ4ISI10 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI9 + 1, i11);
        int highResolutionOutputSizeshNQ4ISI11 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI10 + 1, i11);
        int highResolutionOutputSizeshNQ4ISI12 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI11 + 1, i11);
        int highResolutionOutputSizeshNQ4ISI13 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI12 + 1, i11);
        int highResolutionOutputSizeshNQ4ISI14 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI13 + 1, i11);
        int highResolutionOutputSizeshNQ4ISI15 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI14 + 1, i11);
        int highResolutionOutputSizeshNQ4ISI16 = getHighResolutionOutputSizeshNQ4ISI(bArr, highResolutionOutputSizeshNQ4ISI15 + 1, i11);
        char c3 = (char) bArr[highResolutionOutputSizeshNQ4ISI9];
        char c4 = (char) bArr[highResolutionOutputSizeshNQ4ISI10];
        char c5 = (char) bArr[highResolutionOutputSizeshNQ4ISI11];
        char c6 = (char) bArr[highResolutionOutputSizeshNQ4ISI12];
        char c7 = (char) bArr[highResolutionOutputSizeshNQ4ISI13];
        char c8 = (char) bArr[highResolutionOutputSizeshNQ4ISI14];
        char c9 = (char) bArr[highResolutionOutputSizeshNQ4ISI15];
        char c10 = (char) bArr[highResolutionOutputSizeshNQ4ISI16];
        char c11 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (c10 != c11) {
            byte[] bArr3 = this.Camera2StreamConfigurationMap;
            byte b9 = bArr3[c3];
            byte b10 = bArr3[c4];
            byte b11 = bArr3[c5];
            byte b12 = bArr3[c6];
            byte b13 = bArr3[c7];
            byte b14 = bArr3[c8];
            byte b15 = bArr3[c9];
            byte b16 = bArr3[c10];
            if ((b9 | b10 | b11 | b12 | b13 | b14 | b15 | b16) < 0) {
                throw new java.io.IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b9 << 3) | (b10 >> 2));
            outputStream.write((b10 << 6) | (b11 << 1) | (b12 >> 4));
            outputStream.write((b12 << 4) | (b13 >> 1));
            outputStream.write((b13 << 7) | (b14 << 2) | (b15 >> 3));
            i3 = 5;
            outputStream.write(b16 | (b15 << 5));
        } else if (c9 != c11) {
            byte[] bArr4 = this.Camera2StreamConfigurationMap;
            byte b17 = bArr4[c3];
            byte b18 = bArr4[c4];
            byte b19 = bArr4[c5];
            byte b20 = bArr4[c6];
            byte b21 = bArr4[c7];
            byte b22 = bArr4[c8];
            byte b23 = bArr4[c9];
            if ((b17 | b18 | b19 | b20 | b21 | b22 | b23) < 0) {
                throw new java.io.IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b17 << 3) | (b18 >> 2));
            outputStream.write((b18 << 6) | (b19 << 1) | (b20 >> 4));
            outputStream.write((b20 << 4) | (b21 >> 1));
            outputStream.write((b23 >> 3) | (b21 << 7) | (b22 << 2));
            i3 = 4;
        } else {
            if (c8 != c11) {
                throw new java.io.IOException("invalid characters encountered at end of base32 data");
            }
            if (c7 != c11) {
                byte[] bArr5 = this.Camera2StreamConfigurationMap;
                byte b24 = bArr5[c3];
                byte b25 = bArr5[c4];
                byte b26 = bArr5[c5];
                byte b27 = bArr5[c6];
                byte b28 = bArr5[c7];
                if ((b24 | b25 | b26 | b27 | b28) < 0) {
                    throw new java.io.IOException("invalid characters encountered at end of base32 data");
                }
                outputStream.write((b24 << 3) | (b25 >> 2));
                outputStream.write((b25 << 6) | (b26 << 1) | (b27 >> 4));
                outputStream.write((b28 >> 1) | (b27 << 4));
                i3 = 3;
            } else if (c6 != c11) {
                byte[] bArr6 = this.Camera2StreamConfigurationMap;
                byte b29 = bArr6[c3];
                byte b30 = bArr6[c4];
                byte b31 = bArr6[c5];
                byte b32 = bArr6[c6];
                if ((b29 | b30 | b31 | b32) < 0) {
                    throw new java.io.IOException("invalid characters encountered at end of base32 data");
                }
                outputStream.write((b29 << 3) | (b30 >> 2));
                outputStream.write((b32 >> 4) | (b30 << 6) | (b31 << 1));
                i3 = 2;
            } else {
                if (c5 != c11) {
                    throw new java.io.IOException("invalid characters encountered at end of base32 data");
                }
                byte[] bArr7 = this.Camera2StreamConfigurationMap;
                byte b33 = bArr7[c3];
                byte b34 = bArr7[c4];
                if ((b33 | b34) < 0) {
                    throw new java.io.IOException("invalid characters encountered at end of base32 data");
                }
                outputStream.write((b34 >> 2) | (b33 << 3));
                i3 = 1;
            }
        }
        return i8 + i3;
    }

    protected void initialiseDecodingTable() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.Camera2StreamConfigurationMap;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.getHighSpeedVideoFpsRanges;
            if (i >= bArr2.length) {
                return;
            }
            this.Camera2StreamConfigurationMap[bArr2[i]] = (byte) i;
            i++;
        }
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i) {
        return (i / 8) * 5;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getEncodedLength(int i) {
        return ((i + 4) / 5) * 8;
    }

    public int encode(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws java.io.IOException {
        int i4 = i;
        int i5 = i3;
        while (i4 < (i + i2) - 4) {
            Camera2StreamConfigurationMap(bArr, i4, bArr2, i5);
            i4 += 5;
            i5 += 8;
        }
        int i6 = i2 - (i4 - i);
        if (i6 > 0) {
            byte[] bArr3 = new byte[5];
            java.lang.System.arraycopy(bArr, i4, bArr3, 0, i6);
            Camera2StreamConfigurationMap(bArr3, 0, bArr2, i5);
            if (i6 == 1) {
                byte b = this.getHighResolutionOutputSizeshNQ4ISI;
                bArr2[i5 + 2] = b;
                bArr2[i5 + 3] = b;
                bArr2[i5 + 4] = b;
                bArr2[i5 + 5] = b;
                bArr2[i5 + 6] = b;
                bArr2[i5 + 7] = b;
            } else if (i6 == 2) {
                byte b2 = this.getHighResolutionOutputSizeshNQ4ISI;
                bArr2[i5 + 4] = b2;
                bArr2[i5 + 5] = b2;
                bArr2[i5 + 6] = b2;
                bArr2[i5 + 7] = b2;
            } else if (i6 == 3) {
                byte b3 = this.getHighResolutionOutputSizeshNQ4ISI;
                bArr2[i5 + 5] = b3;
                bArr2[i5 + 6] = b3;
                bArr2[i5 + 7] = b3;
            } else if (i6 == 4) {
                bArr2[i5 + 7] = this.getHighResolutionOutputSizeshNQ4ISI;
            }
            i5 += 8;
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
            int min = java.lang.Math.min(45, i3);
            outputStream.write(bArr2, 0, encode(bArr, i, min, bArr2, 0));
            i += min;
            i3 -= min;
        }
        return ((i2 + 2) / 3) * 4;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(java.lang.String str, java.io.OutputStream outputStream) throws java.io.IOException {
        byte[] byteArray = org.bouncycastle.util.Strings.toByteArray(str);
        return decode(byteArray, 0, byteArray.length, outputStream);
    }

    private void Camera2StreamConfigurationMap(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte b = bArr[i];
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        int i5 = bArr[i + 3] & 255;
        byte b2 = bArr[i + 4];
        byte[] bArr3 = this.getHighSpeedVideoFpsRanges;
        bArr2[i2] = bArr3[(b >>> 3) & 31];
        bArr2[i2 + 1] = bArr3[((b << 2) | (i3 >>> 6)) & 31];
        bArr2[i2 + 2] = bArr3[(i3 >>> 1) & 31];
        bArr2[i2 + 3] = bArr3[((i3 << 4) | (i4 >>> 4)) & 31];
        bArr2[i2 + 4] = bArr3[((i4 << 1) | (i5 >>> 7)) & 31];
        bArr2[i2 + 5] = bArr3[(i5 >>> 2) & 31];
        bArr2[i2 + 6] = bArr3[(((b2 & 255) >>> 5) | (i5 << 3)) & 31];
        bArr2[i2 + 7] = bArr3[b2 & com.google.common.base.Ascii.US];
    }

    public Base32Encoder(byte[] bArr, byte b) {
        this.Camera2StreamConfigurationMap = new byte[128];
        if (bArr.length != 32) {
            throw new java.lang.IllegalArgumentException("encoding table needs to be length 32");
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighResolutionOutputSizeshNQ4ISI = b;
        initialiseDecodingTable();
    }

    public Base32Encoder() {
        this.Camera2StreamConfigurationMap = new byte[128];
        this.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.io.encoding.Base64.padSymbol;
        initialiseDecodingTable();
    }
}
