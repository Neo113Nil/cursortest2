package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class CamelliaLightEngine implements org.bouncycastle.crypto.BlockCipher {
    private static final int[] getHighResolutionOutputSizeshNQ4ISI = {-1600231809, 1003262091, -1233459112, 1286239154, -957401297, -380665154, 1426019237, -237801700, 283453434, -563598051, -1336506174, -1276722691};
    private static final byte[] getHighSpeedVideoFpsRanges = {com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -126, 44, -20, -77, 39, com.visa.cbp.getEncExpo.startTransaction, -27, -28, -123, 87, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -22, com.google.common.base.Ascii.FF, -82, 65, 35, -17, 107, -109, 69, com.google.common.base.Ascii.EM, -91, 33, -19, 14, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 78, com.google.common.base.Ascii.GS, 101, -110, -67, -122, -72, -81, -113, 124, -21, com.google.common.base.Ascii.US, -50, 62, 48, -36, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 94, -59, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SUB, -90, -31, 57, -54, -43, 71, 93, kotlin.io.encoding.Base64.padSymbol, -39, 1, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -42, 81, 86, 108, 77, -117, 13, -102, 102, -5, -52, -80, 45, 116, 18, 43, 32, com.visa.cbp.getEncExpo.onUnminimized, -79, -124, com.visa.cbp.getEncExpo.registerForActivityResult, -33, 76, -53, -62, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 126, 118, 5, 109, -73, -87, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -47, com.google.common.base.Ascii.ETB, 4, -41, com.google.common.base.Ascii.DC4, 88, 58, 97, -34, com.google.common.base.Ascii.ESC, 17, com.google.common.base.Ascii.FS, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, com.google.common.base.Ascii.SI, -100, com.google.common.base.Ascii.SYN, 83, com.google.common.base.Ascii.CAN, -14, 34, -2, 68, com.visa.cbp.getEncExpo.kernelVersion, -78, -61, -75, 122, -111, 36, 8, -24, -88, com.visa.cbp.getEncExpo.IResultReceiver2, -4, 105, 80, -86, -48, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 125, -95, -119, 98, -105, 84, 91, com.google.common.base.Ascii.RS, -107, -32, -1, 100, -46, 16, -60, 0, 72, -93, -9, 117, -37, -118, 3, -26, -38, 9, 63, -35, -108, -121, 92, -125, 2, -51, 74, -112, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 115, 103, -10, -13, -99, Byte.MAX_VALUE, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -30, 82, -101, -40, 38, -56, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -58, 59, -127, -106, 111, 75, 19, -66, 99, 46, -23, 121, -89, -116, -97, 110, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -114, 41, -11, -7, -74, 47, -3, -76, 89, 120, -104, 6, 106, -25, 70, 113, -70, -44, 37, -85, 66, -120, -94, -115, -6, 114, 7, -71, 85, -8, -18, -84, 10, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 73, 42, 104, 60, 56, -15, -92, 64, 40, -45, 123, -69, -55, 67, -63, com.google.common.base.Ascii.NAK, -29, -83, -12, com.visa.cbp.getEncExpo.IResultReceiver, -57, Byte.MIN_VALUE, -98};
    private boolean getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private int[] getInputSizeshNQ4ISI = new int[96];
    private int[] getOutputMinFrameDuration = new int[8];
    private int[] Camera2StreamConfigurationMap = new int[12];
    private int[] getOutputFormats = new int[4];

    private static void getHighSpeedVideoSizes(int[] iArr, int[] iArr2, int i) {
        int i2 = iArr[1];
        int i3 = iArr[0];
        int i4 = iArr2[i] & i3;
        int i5 = i2 ^ ((i4 << 1) + (i4 >>> 31));
        iArr[1] = i5;
        iArr[0] = (iArr2[i + 1] | i5) ^ i3;
        int i6 = iArr[2];
        int i7 = iArr2[i + 3];
        int i8 = iArr[3];
        int i9 = i6 ^ (i7 | i8);
        iArr[2] = i9;
        int i10 = iArr2[i + 2] & i9;
        iArr[3] = ((i10 << 1) + (i10 >>> 31)) ^ i8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    private void getHighSpeedVideoFpsRanges(int[] iArr, int[] iArr2, int i) {
        int i2 = iArr[0];
        int i3 = iArr2[i] ^ i2;
        byte[] bArr = getHighSpeedVideoFpsRanges;
        byte b = (byte) (i3 & 255);
        int i4 = bArr[((byte) ((b << 1) | ((b & 255) >>> 7))) & 255] & 255;
        byte b2 = bArr[(i3 >>> 8) & 255];
        int i5 = ((byte) ((b2 << 7) | ((b2 & 255) >>> 1))) & 255;
        byte b3 = bArr[(i3 >>> 16) & 255];
        int i6 = ((byte) ((b3 << 1) | ((b3 & 255) >>> 7))) & 255;
        byte b4 = bArr[(i3 >>> 24) & 255];
        int i7 = iArr[1];
        int i8 = iArr2[i + 1] ^ i7;
        byte b5 = bArr[i8 & 255];
        byte b6 = (byte) ((i8 >>> 8) & 255);
        int i9 = bArr[((byte) ((b6 << 1) | ((b6 & 255) >>> 7))) & 255] & 255;
        byte b7 = bArr[(i8 >>> 16) & 255];
        int i10 = ((byte) ((b7 << 7) | ((b7 & 255) >>> 1))) & 255;
        byte b8 = bArr[(i8 >>> 24) & 255];
        int i11 = ((((byte) ((b8 << 1) | ((b8 & 255) >>> 7))) & 255) << 24) | (b5 & 255) | (i9 << 8) | (i10 << 16);
        int i12 = (i11 << 8) + (i11 >>> 24);
        int i13 = (((b4 & 255) << 24) | ((i4 | (i5 << 8)) | (i6 << 16))) ^ i12;
        int i14 = ((i12 << 8) + (i12 >>> 24)) ^ i13;
        int i15 = ((i13 >>> 8) + (i13 << 24)) ^ i14;
        int i16 = (((i14 << 16) + (i14 >>> 16)) ^ i15) ^ iArr[2];
        iArr[2] = i16;
        int i17 = ((i15 << 8) + (i15 >>> 24)) ^ iArr[3];
        iArr[3] = i17;
        int i18 = i16 ^ iArr2[i + 2];
        byte b9 = (byte) (i18 & 255);
        int i19 = bArr[((byte) ((b9 << 1) | ((b9 & 255) >>> 7))) & 255] & 255;
        byte b10 = bArr[(i18 >>> 8) & 255];
        int i20 = ((byte) ((b10 << 7) | ((b10 & 255) >>> 1))) & 255;
        byte b11 = bArr[(i18 >>> 16) & 255];
        int i21 = ((byte) ((b11 << 1) | ((b11 & 255) >>> 7))) & 255;
        byte b12 = bArr[(i18 >>> 24) & 255];
        int i22 = i17 ^ iArr2[i + 3];
        byte b13 = bArr[i22 & 255];
        byte b14 = (byte) ((i22 >>> 8) & 255);
        int i23 = bArr[((byte) ((b14 << 1) | ((b14 & 255) >>> 7))) & 255] & 255;
        byte b15 = bArr[(i22 >>> 16) & 255];
        byte b16 = bArr[(i22 >>> 24) & 255];
        int i24 = (b16 & 255) >>> 7;
        int i25 = ((((byte) ((b16 << 1) | i24)) & 255) << 24) | (b13 & 255) | (i23 << 8) | ((((byte) ((b15 << 7) | ((b15 & 255) >>> 1))) & 255) << 16);
        int i26 = (i25 << 8) + (i25 >>> 24);
        int i27 = (((b12 & 255) << 24) | (((i20 << 8) | i19) | (i21 << 16))) ^ i26;
        int i28 = ((i26 << 8) + (i26 >>> 24)) ^ i27;
        int i29 = ((i27 >>> 8) + (i27 << 24)) ^ i28;
        iArr[0] = i2 ^ (((i28 << 16) + (i28 >>> 16)) ^ i29);
        iArr[1] = ((i29 << 8) + (i29 >>> 24)) ^ i7;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            throw new java.lang.IllegalArgumentException("only simple KeyParameter expected.");
        }
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        int[] iArr = new int[8];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[4];
        int length = key.length;
        if (length != 16) {
            if (length == 24) {
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    i = (i << 8) + (key[i2] & 255);
                }
                iArr[0] = i;
                int i3 = 0;
                for (int i4 = 0; i4 < 4; i4++) {
                    i3 = (i3 << 8) + (key[i4 + 4] & 255);
                }
                iArr[1] = i3;
                int i5 = 0;
                for (int i6 = 0; i6 < 4; i6++) {
                    i5 = (i5 << 8) + (key[i6 + 8] & 255);
                }
                iArr[2] = i5;
                int i7 = 0;
                for (int i8 = 0; i8 < 4; i8++) {
                    i7 = (i7 << 8) + (key[i8 + 12] & 255);
                }
                iArr[3] = i7;
                int i9 = 0;
                for (int i10 = 0; i10 < 4; i10++) {
                    i9 = (i9 << 8) + (key[i10 + 16] & 255);
                }
                iArr[4] = i9;
                int i11 = 0;
                for (int i12 = 0; i12 < 4; i12++) {
                    i11 = (i11 << 8) + (key[i12 + 20] & 255);
                }
                iArr[5] = i11;
                iArr[6] = ~iArr[4];
                iArr[7] = ~i11;
            } else {
                if (length != 32) {
                    throw new java.lang.IllegalArgumentException("key sizes are only 16/24/32 bytes.");
                }
                int i13 = 0;
                for (int i14 = 0; i14 < 4; i14++) {
                    i13 = (i13 << 8) + (key[i14] & 255);
                }
                iArr[0] = i13;
                int i15 = 0;
                for (int i16 = 0; i16 < 4; i16++) {
                    i15 = (i15 << 8) + (key[i16 + 4] & 255);
                }
                iArr[1] = i15;
                int i17 = 0;
                for (int i18 = 0; i18 < 4; i18++) {
                    i17 = (i17 << 8) + (key[i18 + 8] & 255);
                }
                iArr[2] = i17;
                int i19 = 0;
                for (int i20 = 0; i20 < 4; i20++) {
                    i19 = (i19 << 8) + (key[i20 + 12] & 255);
                }
                iArr[3] = i19;
                int i21 = 0;
                for (int i22 = 0; i22 < 4; i22++) {
                    i21 = (i21 << 8) + (key[i22 + 16] & 255);
                }
                iArr[4] = i21;
                int i23 = 0;
                for (int i24 = 0; i24 < 4; i24++) {
                    i23 = (i23 << 8) + (key[i24 + 20] & 255);
                }
                iArr[5] = i23;
                int i25 = 0;
                for (int i26 = 0; i26 < 4; i26++) {
                    i25 = (i25 << 8) + (key[i26 + 24] & 255);
                }
                iArr[6] = i25;
                int i27 = 0;
                for (int i28 = 0; i28 < 4; i28++) {
                    i27 = (i27 << 8) + (key[i28 + 28] & 255);
                }
                iArr[7] = i27;
            }
            this.getHighSpeedVideoSizes = false;
        } else {
            this.getHighSpeedVideoSizes = true;
            int i29 = 0;
            for (int i30 = 0; i30 < 4; i30++) {
                i29 = (i29 << 8) + (key[i30] & 255);
            }
            iArr[0] = i29;
            int i31 = 0;
            for (int i32 = 0; i32 < 4; i32++) {
                i31 = (i31 << 8) + (key[i32 + 4] & 255);
            }
            iArr[1] = i31;
            int i33 = 0;
            for (int i34 = 0; i34 < 4; i34++) {
                i33 = (i33 << 8) + (key[i34 + 8] & 255);
            }
            iArr[2] = i33;
            int i35 = 0;
            for (int i36 = 0; i36 < 4; i36++) {
                i35 = (i35 << 8) + (key[i36 + 12] & 255);
            }
            iArr[3] = i35;
            iArr[7] = 0;
            iArr[6] = 0;
            iArr[5] = 0;
            iArr[4] = 0;
        }
        for (int i37 = 0; i37 < 4; i37++) {
            iArr2[i37] = iArr[i37] ^ iArr[i37 + 4];
        }
        getHighSpeedVideoFpsRanges(iArr2, getHighResolutionOutputSizeshNQ4ISI, 0);
        for (int i38 = 0; i38 < 4; i38++) {
            iArr2[i38] = iArr2[i38] ^ iArr[i38];
        }
        getHighSpeedVideoFpsRanges(iArr2, getHighResolutionOutputSizeshNQ4ISI, 4);
        if (this.getHighSpeedVideoSizes) {
            int[] iArr5 = this.getOutputMinFrameDuration;
            if (z) {
                iArr5[0] = iArr[0];
                iArr5[1] = iArr[1];
                iArr5[2] = iArr[2];
                iArr5[3] = iArr[3];
                getHighResolutionOutputSizeshNQ4ISI(15, iArr, 0, this.getInputSizeshNQ4ISI, 4);
                getHighResolutionOutputSizeshNQ4ISI(30, iArr, 0, this.getInputSizeshNQ4ISI, 12);
                getHighResolutionOutputSizeshNQ4ISI(15, iArr, 0, iArr4, 0);
                int[] iArr6 = this.getInputSizeshNQ4ISI;
                iArr6[18] = iArr4[2];
                iArr6[19] = iArr4[3];
                getHighResolutionOutputSizeshNQ4ISI(17, iArr, 0, this.Camera2StreamConfigurationMap, 4);
                getHighResolutionOutputSizeshNQ4ISI(17, iArr, 0, this.getInputSizeshNQ4ISI, 24);
                getHighResolutionOutputSizeshNQ4ISI(17, iArr, 0, this.getInputSizeshNQ4ISI, 32);
                int[] iArr7 = this.getInputSizeshNQ4ISI;
                iArr7[0] = iArr2[0];
                iArr7[1] = iArr2[1];
                iArr7[2] = iArr2[2];
                iArr7[3] = iArr2[3];
                getHighResolutionOutputSizeshNQ4ISI(15, iArr2, 0, iArr7, 8);
                getHighResolutionOutputSizeshNQ4ISI(15, iArr2, 0, this.Camera2StreamConfigurationMap, 0);
                getHighResolutionOutputSizeshNQ4ISI(15, iArr2, 0, iArr4, 0);
                int[] iArr8 = this.getInputSizeshNQ4ISI;
                iArr8[16] = iArr4[0];
                iArr8[17] = iArr4[1];
                getHighResolutionOutputSizeshNQ4ISI(15, iArr2, 0, iArr8, 20);
                Camera2StreamConfigurationMap(34, iArr2, 0, this.getInputSizeshNQ4ISI, 28);
                getHighResolutionOutputSizeshNQ4ISI(17, iArr2, 0, this.getOutputMinFrameDuration, 4);
            } else {
                iArr5[4] = iArr[0];
                iArr5[5] = iArr[1];
                iArr5[6] = iArr[2];
                iArr5[7] = iArr[3];
                getHighSpeedVideoFpsRangesFor(15, iArr, 0, this.getInputSizeshNQ4ISI, 28);
                getHighSpeedVideoFpsRangesFor(30, iArr, 0, this.getInputSizeshNQ4ISI, 20);
                getHighSpeedVideoFpsRangesFor(15, iArr, 0, iArr4, 0);
                int[] iArr9 = this.getInputSizeshNQ4ISI;
                iArr9[16] = iArr4[0];
                iArr9[17] = iArr4[1];
                getHighSpeedVideoFpsRangesFor(17, iArr, 0, this.Camera2StreamConfigurationMap, 0);
                getHighSpeedVideoFpsRangesFor(17, iArr, 0, this.getInputSizeshNQ4ISI, 8);
                getHighSpeedVideoFpsRangesFor(17, iArr, 0, this.getInputSizeshNQ4ISI, 0);
                int[] iArr10 = this.getInputSizeshNQ4ISI;
                iArr10[34] = iArr2[0];
                iArr10[35] = iArr2[1];
                iArr10[32] = iArr2[2];
                iArr10[33] = iArr2[3];
                getHighSpeedVideoFpsRangesFor(15, iArr2, 0, iArr10, 24);
                getHighSpeedVideoFpsRangesFor(15, iArr2, 0, this.Camera2StreamConfigurationMap, 4);
                getHighSpeedVideoFpsRangesFor(15, iArr2, 0, iArr4, 0);
                int[] iArr11 = this.getInputSizeshNQ4ISI;
                iArr11[18] = iArr4[2];
                iArr11[19] = iArr4[3];
                getHighSpeedVideoFpsRangesFor(15, iArr2, 0, iArr11, 12);
                getHighSpeedVideoFpsRanges(34, iArr2, 0, this.getInputSizeshNQ4ISI, 4);
                getHighResolutionOutputSizeshNQ4ISI(17, iArr2, 0, this.getOutputMinFrameDuration, 0);
            }
        } else {
            for (int i39 = 0; i39 < 4; i39++) {
                iArr3[i39] = iArr2[i39] ^ iArr[i39 + 4];
            }
            getHighSpeedVideoFpsRanges(iArr3, getHighResolutionOutputSizeshNQ4ISI, 8);
            int[] iArr12 = this.getOutputMinFrameDuration;
            if (z) {
                iArr12[0] = iArr[0];
                iArr12[1] = iArr[1];
                iArr12[2] = iArr[2];
                iArr12[3] = iArr[3];
                Camera2StreamConfigurationMap(45, iArr, 0, this.getInputSizeshNQ4ISI, 16);
                getHighResolutionOutputSizeshNQ4ISI(15, iArr, 0, this.Camera2StreamConfigurationMap, 4);
                getHighResolutionOutputSizeshNQ4ISI(17, iArr, 0, this.getInputSizeshNQ4ISI, 32);
                Camera2StreamConfigurationMap(34, iArr, 0, this.getInputSizeshNQ4ISI, 44);
                getHighResolutionOutputSizeshNQ4ISI(15, iArr, 4, this.getInputSizeshNQ4ISI, 4);
                getHighResolutionOutputSizeshNQ4ISI(15, iArr, 4, this.Camera2StreamConfigurationMap, 0);
                getHighResolutionOutputSizeshNQ4ISI(30, iArr, 4, this.getInputSizeshNQ4ISI, 24);
                Camera2StreamConfigurationMap(34, iArr, 4, this.getInputSizeshNQ4ISI, 36);
                getHighResolutionOutputSizeshNQ4ISI(15, iArr2, 0, this.getInputSizeshNQ4ISI, 8);
                getHighResolutionOutputSizeshNQ4ISI(30, iArr2, 0, this.getInputSizeshNQ4ISI, 20);
                int[] iArr13 = this.Camera2StreamConfigurationMap;
                iArr13[8] = iArr2[1];
                iArr13[9] = iArr2[2];
                iArr13[10] = iArr2[3];
                iArr13[11] = iArr2[0];
                Camera2StreamConfigurationMap(49, iArr2, 0, this.getInputSizeshNQ4ISI, 40);
                int[] iArr14 = this.getInputSizeshNQ4ISI;
                iArr14[0] = iArr3[0];
                iArr14[1] = iArr3[1];
                iArr14[2] = iArr3[2];
                iArr14[3] = iArr3[3];
                getHighResolutionOutputSizeshNQ4ISI(30, iArr3, 0, iArr14, 12);
                getHighResolutionOutputSizeshNQ4ISI(30, iArr3, 0, this.getInputSizeshNQ4ISI, 28);
                Camera2StreamConfigurationMap(51, iArr3, 0, this.getOutputMinFrameDuration, 4);
            } else {
                iArr12[4] = iArr[0];
                iArr12[5] = iArr[1];
                iArr12[6] = iArr[2];
                iArr12[7] = iArr[3];
                getHighSpeedVideoFpsRanges(45, iArr, 0, this.getInputSizeshNQ4ISI, 28);
                getHighSpeedVideoFpsRangesFor(15, iArr, 0, this.Camera2StreamConfigurationMap, 4);
                getHighSpeedVideoFpsRangesFor(17, iArr, 0, this.getInputSizeshNQ4ISI, 12);
                getHighSpeedVideoFpsRanges(34, iArr, 0, this.getInputSizeshNQ4ISI, 0);
                getHighSpeedVideoFpsRangesFor(15, iArr, 4, this.getInputSizeshNQ4ISI, 40);
                getHighSpeedVideoFpsRangesFor(15, iArr, 4, this.Camera2StreamConfigurationMap, 8);
                getHighSpeedVideoFpsRangesFor(30, iArr, 4, this.getInputSizeshNQ4ISI, 20);
                getHighSpeedVideoFpsRanges(34, iArr, 4, this.getInputSizeshNQ4ISI, 8);
                getHighSpeedVideoFpsRangesFor(15, iArr2, 0, this.getInputSizeshNQ4ISI, 36);
                getHighSpeedVideoFpsRangesFor(30, iArr2, 0, this.getInputSizeshNQ4ISI, 24);
                int[] iArr15 = this.Camera2StreamConfigurationMap;
                iArr15[2] = iArr2[1];
                iArr15[3] = iArr2[2];
                iArr15[0] = iArr2[3];
                iArr15[1] = iArr2[0];
                getHighSpeedVideoFpsRanges(49, iArr2, 0, this.getInputSizeshNQ4ISI, 4);
                int[] iArr16 = this.getInputSizeshNQ4ISI;
                iArr16[46] = iArr3[0];
                iArr16[47] = iArr3[1];
                iArr16[44] = iArr3[2];
                iArr16[45] = iArr3[3];
                getHighSpeedVideoFpsRangesFor(30, iArr3, 0, iArr16, 32);
                getHighSpeedVideoFpsRangesFor(30, iArr3, 0, this.getInputSizeshNQ4ISI, 16);
                Camera2StreamConfigurationMap(51, iArr3, 0, this.getOutputMinFrameDuration, 0);
            }
        }
        this.getHighSpeedVideoFpsRangesFor = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws java.lang.IllegalStateException {
        if (!this.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException("Camellia is not initialized");
        }
        if (i + 16 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        int i3 = 0;
        if (this.getHighSpeedVideoSizes) {
            for (int i4 = 0; i4 < 4; i4++) {
                int[] iArr = this.getOutputFormats;
                int i5 = (i4 * 4) + i;
                int i6 = 0;
                for (int i7 = 0; i7 < 4; i7++) {
                    i6 = (i6 << 8) + (bArr[i7 + i5] & 255);
                }
                iArr[i4] = i6;
                int[] iArr2 = this.getOutputFormats;
                iArr2[i4] = iArr2[i4] ^ this.getOutputMinFrameDuration[i4];
            }
            getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 0);
            getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 4);
            getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 8);
            getHighSpeedVideoSizes(this.getOutputFormats, this.Camera2StreamConfigurationMap, 0);
            getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 12);
            getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 16);
            getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 20);
            getHighSpeedVideoSizes(this.getOutputFormats, this.Camera2StreamConfigurationMap, 4);
            getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 24);
            getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 28);
            getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 32);
            int[] iArr3 = this.getOutputFormats;
            int i8 = iArr3[2];
            int[] iArr4 = this.getOutputMinFrameDuration;
            int i9 = i8 ^ iArr4[4];
            iArr3[2] = i9;
            iArr3[3] = iArr3[3] ^ iArr4[5];
            iArr3[0] = iArr3[0] ^ iArr4[6];
            iArr3[1] = iArr3[1] ^ iArr4[7];
            for (int i10 = 0; i10 < 4; i10++) {
                bArr2[(3 - i10) + i2] = (byte) i9;
                i9 >>>= 8;
            }
            int i11 = this.getOutputFormats[3];
            int i12 = i2 + 4;
            for (int i13 = 0; i13 < 4; i13++) {
                bArr2[(3 - i13) + i12] = (byte) i11;
                i11 >>>= 8;
            }
            int i14 = this.getOutputFormats[0];
            int i15 = i2 + 8;
            for (int i16 = 0; i16 < 4; i16++) {
                bArr2[(3 - i16) + i15] = (byte) i14;
                i14 >>>= 8;
            }
            int i17 = this.getOutputFormats[1];
            int i18 = i2 + 12;
            while (i3 < 4) {
                bArr2[(3 - i3) + i18] = (byte) i17;
                i17 >>>= 8;
                i3++;
            }
            return 16;
        }
        for (int i19 = 0; i19 < 4; i19++) {
            int[] iArr5 = this.getOutputFormats;
            int i20 = (i19 * 4) + i;
            int i21 = 0;
            for (int i22 = 0; i22 < 4; i22++) {
                i21 = (i21 << 8) + (bArr[i22 + i20] & 255);
            }
            iArr5[i19] = i21;
            int[] iArr6 = this.getOutputFormats;
            iArr6[i19] = iArr6[i19] ^ this.getOutputMinFrameDuration[i19];
        }
        getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 0);
        getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 4);
        getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 8);
        getHighSpeedVideoSizes(this.getOutputFormats, this.Camera2StreamConfigurationMap, 0);
        getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 12);
        getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 16);
        getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 20);
        getHighSpeedVideoSizes(this.getOutputFormats, this.Camera2StreamConfigurationMap, 4);
        getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 24);
        getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 28);
        getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 32);
        getHighSpeedVideoSizes(this.getOutputFormats, this.Camera2StreamConfigurationMap, 8);
        getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 36);
        getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 40);
        getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getInputSizeshNQ4ISI, 44);
        int[] iArr7 = this.getOutputFormats;
        int i23 = iArr7[2];
        int[] iArr8 = this.getOutputMinFrameDuration;
        int i24 = i23 ^ iArr8[4];
        iArr7[2] = i24;
        iArr7[3] = iArr7[3] ^ iArr8[5];
        iArr7[0] = iArr7[0] ^ iArr8[6];
        iArr7[1] = iArr7[1] ^ iArr8[7];
        for (int i25 = 0; i25 < 4; i25++) {
            bArr2[(3 - i25) + i2] = (byte) i24;
            i24 >>>= 8;
        }
        int i26 = this.getOutputFormats[3];
        int i27 = i2 + 4;
        for (int i28 = 0; i28 < 4; i28++) {
            bArr2[(3 - i28) + i27] = (byte) i26;
            i26 >>>= 8;
        }
        int i29 = this.getOutputFormats[0];
        int i30 = i2 + 8;
        for (int i31 = 0; i31 < 4; i31++) {
            bArr2[(3 - i31) + i30] = (byte) i29;
            i29 >>>= 8;
        }
        int i32 = this.getOutputFormats[1];
        int i33 = i2 + 12;
        while (i3 < 4) {
            bArr2[(3 - i3) + i33] = (byte) i32;
            i32 >>>= 8;
            i3++;
        }
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "Camellia";
    }

    private static void Camera2StreamConfigurationMap(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4 = i2 + 1;
        int i5 = i - 32;
        int i6 = i2 + 2;
        int i7 = 64 - i;
        iArr2[i3] = (iArr[i4] << i5) | (iArr[i6] >>> i7);
        int i8 = i3 + 1;
        int i9 = i2 + 3;
        iArr2[i8] = (iArr[i6] << i5) | (iArr[i9] >>> i7);
        int i10 = i3 + 2;
        iArr2[i10] = (iArr[i9] << i5) | (iArr[i2] >>> i7);
        int i11 = i3 + 3;
        iArr2[i11] = (iArr[i4] >>> i7) | (iArr[i2] << i5);
        iArr[i2] = iArr2[i3];
        iArr[i4] = iArr2[i8];
        iArr[i6] = iArr2[i10];
        iArr[i9] = iArr2[i11];
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4 = i2 + 1;
        int i5 = 32 - i;
        iArr2[i3] = (iArr[i2] << i) | (iArr[i4] >>> i5);
        int i6 = i3 + 1;
        int i7 = i2 + 2;
        iArr2[i6] = (iArr[i4] << i) | (iArr[i7] >>> i5);
        int i8 = i3 + 2;
        int i9 = i2 + 3;
        iArr2[i8] = (iArr[i7] << i) | (iArr[i9] >>> i5);
        int i10 = i3 + 3;
        iArr2[i10] = (iArr[i9] << i) | (iArr[i2] >>> i5);
        iArr[i2] = iArr2[i3];
        iArr[i4] = iArr2[i6];
        iArr[i7] = iArr2[i8];
        iArr[i9] = iArr2[i10];
    }

    private static void getHighSpeedVideoFpsRanges(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4 = i3 + 2;
        int i5 = i2 + 1;
        int i6 = i - 32;
        int i7 = i2 + 2;
        int i8 = 64 - i;
        iArr2[i4] = (iArr[i5] << i6) | (iArr[i7] >>> i8);
        int i9 = i3 + 3;
        int i10 = i2 + 3;
        iArr2[i9] = (iArr[i7] << i6) | (iArr[i10] >>> i8);
        iArr2[i3] = (iArr[i10] << i6) | (iArr[i2] >>> i8);
        int i11 = i3 + 1;
        iArr2[i11] = (iArr[i5] >>> i8) | (iArr[i2] << i6);
        iArr[i2] = iArr2[i4];
        iArr[i5] = iArr2[i9];
        iArr[i7] = iArr2[i3];
        iArr[i10] = iArr2[i11];
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4 = i3 + 2;
        int i5 = i2 + 1;
        int i6 = 32 - i;
        iArr2[i4] = (iArr[i2] << i) | (iArr[i5] >>> i6);
        int i7 = i3 + 3;
        int i8 = i2 + 2;
        iArr2[i7] = (iArr[i5] << i) | (iArr[i8] >>> i6);
        int i9 = i2 + 3;
        iArr2[i3] = (iArr[i8] << i) | (iArr[i9] >>> i6);
        int i10 = i3 + 1;
        iArr2[i10] = (iArr[i9] << i) | (iArr[i2] >>> i6);
        iArr[i2] = iArr2[i4];
        iArr[i5] = iArr2[i7];
        iArr[i8] = iArr2[i3];
        iArr[i9] = iArr2[i10];
    }
}
