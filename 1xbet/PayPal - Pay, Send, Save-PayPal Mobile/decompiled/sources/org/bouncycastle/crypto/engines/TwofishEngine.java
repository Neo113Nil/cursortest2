package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public final class TwofishEngine implements org.bouncycastle.crypto.BlockCipher {
    private static final byte[][] getHighSpeedVideoFpsRanges = {new byte[]{-87, 103, -77, -24, 4, -3, -93, 118, -102, -110, Byte.MIN_VALUE, 120, -28, -35, -47, 56, 13, -58, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -104, com.google.common.base.Ascii.CAN, -9, -20, 108, 67, 117, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 38, -6, 19, -108, 72, -14, -48, -117, 48, -124, 84, -33, 35, com.google.common.base.Ascii.EM, 91, kotlin.io.encoding.Base64.padSymbol, 89, -13, -82, -94, -126, 99, 1, -125, 46, -39, 81, -101, 124, -90, -21, -91, -66, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, -29, 97, com.visa.cbp.getEncExpo.startTransaction, -116, 58, -11, 115, 44, 37, com.google.common.base.Ascii.VT, -69, 78, -119, 107, 83, 106, -76, -15, -31, -26, -67, 69, -30, -12, -74, 102, -52, -107, 3, 86, -44, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.RS, -41, -5, -61, -114, -75, -23, com.visa.cbp.getEncExpo.kernelVersion, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -70, -22, com.visa.cbp.getEncExpo.IResultReceiver, 57, -81, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -55, 98, 113, -127, 121, 9, -83, 36, -51, -7, -40, -27, -59, -71, 77, 68, 8, -122, -25, -95, com.google.common.base.Ascii.GS, -86, -19, 6, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -78, -46, 65, 123, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 17, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -62, 39, -112, 32, -10, com.visa.cbp.getEncExpo.IResultReceiver2, -1, -106, 92, -79, -85, -98, -100, 82, com.google.common.base.Ascii.ESC, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -109, 10, -17, -111, -123, 73, -18, 45, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -113, 59, 71, -121, 109, 70, -42, 62, 105, 100, 42, -50, -53, 47, -4, -105, 5, 122, -84, Byte.MAX_VALUE, -43, com.google.common.base.Ascii.SUB, 75, 14, -89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 40, com.google.common.base.Ascii.DC4, 63, 41, -120, 60, 76, 2, -72, -38, -80, com.google.common.base.Ascii.ETB, 85, com.google.common.base.Ascii.US, -118, 125, 87, -57, -115, 116, -73, -60, -97, 114, 126, com.google.common.base.Ascii.NAK, 34, 18, 88, 7, com.visa.cbp.getEncExpo.registerForActivityResult, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 110, 80, -34, 104, 101, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -37, -8, -56, -88, 43, 64, -36, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -92, -54, 16, 33, com.visa.cbp.getEncExpo.onUnminimized, -45, 93, com.google.common.base.Ascii.SI, 0, 111, -99, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 66, 74, 94, -63, -32}, new byte[]{117, -13, -58, -12, -37, 123, -5, -56, 74, -45, -26, 107, 69, 125, -24, 75, -42, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -40, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 113, -15, -31, 48, com.google.common.base.Ascii.SI, -8, com.google.common.base.Ascii.ESC, -121, -6, 6, 63, 94, -70, -82, 91, -118, 0, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -99, 109, -63, -79, 14, Byte.MIN_VALUE, 93, -46, -43, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -124, 7, com.google.common.base.Ascii.DC4, -75, -112, 44, -93, -78, 115, 76, 84, -110, 116, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 81, 56, -80, -67, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -4, com.visa.cbp.getEncExpo.IResultReceiver2, 98, -106, 108, 66, -9, 16, 124, 40, 39, -116, 19, -107, -100, -57, 36, 70, 59, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -54, -29, -123, -53, 17, -48, -109, -72, -90, -125, 32, -1, -97, com.visa.cbp.getEncExpo.IResultReceiver, -61, -52, 3, 111, 8, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 64, -25, 43, -30, 121, com.google.common.base.Ascii.FF, -86, -126, 65, 58, -22, -71, -28, -102, -92, -105, 126, -38, 122, com.google.common.base.Ascii.ETB, 102, -108, -95, com.google.common.base.Ascii.GS, kotlin.io.encoding.Base64.padSymbol, com.visa.cbp.getEncExpo.onUnminimized, -34, -77, com.google.common.base.Ascii.VT, 114, -89, com.google.common.base.Ascii.FS, -17, -47, 83, 62, -113, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 38, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -20, 118, 42, 73, -127, -120, -18, 33, -60, com.google.common.base.Ascii.SUB, -21, -39, -59, 57, com.visa.cbp.getEncExpo.registerForActivityResult, -51, -83, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -117, 1, com.google.common.base.Ascii.CAN, 35, -35, com.google.common.base.Ascii.US, 78, 45, -7, 72, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -14, 101, -114, 120, 92, 88, com.google.common.base.Ascii.EM, -115, -27, -104, 87, 103, Byte.MAX_VALUE, 5, 100, -81, 99, -74, -2, -11, -73, 60, -91, -50, -23, 104, 68, -32, 77, 67, 105, 41, 46, -84, com.google.common.base.Ascii.NAK, 89, -88, 10, -98, 110, 71, -33, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 106, com.visa.cbp.getEncExpo.kernelVersion, -36, 34, -55, com.visa.cbp.getEncExpo.startTransaction, -101, -119, -44, -19, -85, 18, -94, 13, 82, -69, 2, 47, -87, -41, 97, com.google.common.base.Ascii.RS, -76, 80, 4, -10, -62, com.google.common.base.Ascii.SYN, 37, -122, 86, 85, 9, -66, -111}};
    private int[] getInputFormats;
    private int[] getInputSizeshNQ4ISI;
    private boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private int[] Camera2StreamConfigurationMap = new int[256];
    private int[] getHighSpeedVideoSizes = new int[256];
    private int[] getHighSpeedVideoFpsRangesFor = new int[256];
    private int[] getOutputFormats = new int[256];
    private int getOutputMinFrameDuration = 0;
    private byte[] getHighSpeedVideoSizesFor = null;

    private static int Camera2StreamConfigurationMap(int i) {
        return ((i >> 2) ^ ((i & 2) != 0 ? com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE : 0)) ^ ((i & 1) != 0 ? 90 : 0);
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(int i) {
        int i2 = i >>> 24;
        int i3 = i2 & 255;
        int i4 = (((i2 & 128) != 0 ? com.visa.cbp.getCertUsage.getODAData : 0) ^ (i3 << 1)) & 255;
        int i5 = ((i3 >>> 1) ^ ((i2 & 1) != 0 ? 166 : 0)) ^ i4;
        return ((((i << 8) ^ (i5 << 24)) ^ (i4 << 16)) ^ (i5 << 8)) ^ i3;
    }

    private int getHighSpeedVideoFpsRangesFor(int i, int[] iArr) {
        int i2;
        int i3;
        int i4 = i & 255;
        int i5 = (i >>> 8) & 255;
        int i6 = (i >>> 16) & 255;
        int i7 = (i >>> 24) & 255;
        int i8 = iArr[0];
        int i9 = iArr[1];
        int i10 = iArr[2];
        int i11 = iArr[3];
        int i12 = this.getOutputMinFrameDuration & 3;
        if (i12 != 0) {
            if (i12 == 1) {
                int[] iArr2 = this.Camera2StreamConfigurationMap;
                byte[][] bArr = getHighSpeedVideoFpsRanges;
                byte[] bArr2 = bArr[0];
                int i13 = iArr2[(bArr2[i4] & 255) ^ (i8 & 255)] ^ this.getHighSpeedVideoSizes[(bArr2[i5] & 255) ^ ((i8 >>> 8) & 255)];
                int[] iArr3 = this.getHighSpeedVideoFpsRangesFor;
                byte[] bArr3 = bArr[1];
                i2 = i13 ^ iArr3[(bArr3[i6] & 255) ^ ((i8 >>> 16) & 255)];
                i3 = this.getOutputFormats[(bArr3[i7] & 255) ^ ((i8 >>> 24) & 255)];
                return i3 ^ i2;
            }
            if (i12 != 2) {
                if (i12 != 3) {
                    return 0;
                }
            }
            int[] iArr4 = this.Camera2StreamConfigurationMap;
            byte[][] bArr4 = getHighSpeedVideoFpsRanges;
            byte[] bArr5 = bArr4[0];
            int i14 = iArr4[(bArr5[(bArr5[i4] & 255) ^ (i9 & 255)] & 255) ^ (i8 & 255)];
            int[] iArr5 = this.getHighSpeedVideoSizes;
            byte[] bArr6 = bArr4[1];
            i2 = (i14 ^ iArr5[(bArr5[(bArr6[i5] & 255) ^ ((i9 >>> 8) & 255)] & 255) ^ ((i8 >>> 8) & 255)]) ^ this.getHighSpeedVideoFpsRangesFor[(bArr6[(bArr5[i6] & 255) ^ ((i9 >>> 16) & 255)] & 255) ^ ((i8 >>> 16) & 255)];
            i3 = this.getOutputFormats[(bArr6[(bArr6[i7] & 255) ^ ((i9 >>> 24) & 255)] & 255) ^ ((i8 >>> 24) & 255)];
            return i3 ^ i2;
        }
        byte[][] bArr7 = getHighSpeedVideoFpsRanges;
        byte[] bArr8 = bArr7[1];
        i4 = (bArr8[i4] & 255) ^ (i11 & 255);
        byte[] bArr9 = bArr7[0];
        i5 = (bArr9[i5] & 255) ^ ((i11 >>> 8) & 255);
        i6 = (bArr9[i6] & 255) ^ ((i11 >>> 16) & 255);
        i7 = (bArr8[i7] & 255) ^ ((i11 >>> 24) & 255);
        byte[][] bArr10 = getHighSpeedVideoFpsRanges;
        byte[] bArr11 = bArr10[1];
        i4 = (bArr11[i4] & 255) ^ (i10 & 255);
        i5 = (bArr11[i5] & 255) ^ ((i10 >>> 8) & 255);
        byte[] bArr12 = bArr10[0];
        i6 = (bArr12[i6] & 255) ^ ((i10 >>> 16) & 255);
        i7 = (bArr12[i7] & 255) ^ ((i10 >>> 24) & 255);
        int[] iArr42 = this.Camera2StreamConfigurationMap;
        byte[][] bArr42 = getHighSpeedVideoFpsRanges;
        byte[] bArr52 = bArr42[0];
        int i142 = iArr42[(bArr52[(bArr52[i4] & 255) ^ (i9 & 255)] & 255) ^ (i8 & 255)];
        int[] iArr52 = this.getHighSpeedVideoSizes;
        byte[] bArr62 = bArr42[1];
        i2 = (i142 ^ iArr52[(bArr52[(bArr62[i5] & 255) ^ ((i9 >>> 8) & 255)] & 255) ^ ((i8 >>> 8) & 255)]) ^ this.getHighSpeedVideoFpsRangesFor[(bArr62[(bArr52[i6] & 255) ^ ((i9 >>> 16) & 255)] & 255) ^ ((i8 >>> 16) & 255)];
        i3 = this.getOutputFormats[(bArr62[(bArr62[i7] & 255) ^ ((i9 >>> 24) & 255)] & 255) ^ ((i8 >>> 24) & 255)];
        return i3 ^ i2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public final int getBlockSize() {
        return 16;
    }

    public TwofishEngine() {
        for (int i = 0; i < 256; i++) {
            byte[][] bArr = getHighSpeedVideoFpsRanges;
            int i2 = bArr[0][i];
            int i3 = i2 & 255;
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i3) ^ i3;
            int i4 = i2 & 1;
            int i5 = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
            int Camera2StreamConfigurationMap2 = (((i4 != 0 ? 180 : 0) ^ (i3 >> 1)) ^ i3) ^ Camera2StreamConfigurationMap(i3);
            int i6 = bArr[1][i];
            int i7 = i6 & 255;
            int[] iArr = {i3, i7};
            int[] iArr2 = {Camera2StreamConfigurationMap & 255, (Camera2StreamConfigurationMap(i7) ^ i7) & 255};
            if ((i6 & 1) == 0) {
                i5 = 0;
            }
            int[] iArr3 = {Camera2StreamConfigurationMap2 & 255, ((((i7 >> 1) ^ i5) ^ i7) ^ Camera2StreamConfigurationMap(i7)) & 255};
            int[] iArr4 = this.Camera2StreamConfigurationMap;
            int i8 = iArr[1];
            int i9 = iArr2[1];
            int i10 = iArr3[1];
            iArr4[i] = i8 | (i9 << 8) | (i10 << 16) | (i10 << 24);
            int[] iArr5 = this.getHighSpeedVideoSizes;
            int i11 = iArr3[0];
            iArr5[i] = i11 | (i11 << 8) | (iArr2[0] << 16) | (iArr[0] << 24);
            int[] iArr6 = this.getHighSpeedVideoFpsRangesFor;
            int i12 = iArr2[1];
            int i13 = iArr3[1];
            iArr6[i] = (iArr[1] << 16) | i12 | (i13 << 8) | (i13 << 24);
            int[] iArr7 = this.getOutputFormats;
            int i14 = iArr2[0];
            iArr7[i] = (iArr3[0] << 16) | (iArr[0] << 8) | i14 | (i14 << 24);
        }
    }

    private void getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        this.getInputFormats = new int[40];
        char c = 0;
        for (int i9 = 0; i9 < this.getOutputMinFrameDuration; i9++) {
            int i10 = i9 * 8;
            iArr[i9] = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i10);
            int littleEndianToInt = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i10 + 4);
            iArr2[i9] = littleEndianToInt;
            int i11 = (this.getOutputMinFrameDuration - 1) - i9;
            int i12 = iArr[i9];
            for (int i13 = 0; i13 < 4; i13++) {
                littleEndianToInt = getHighResolutionOutputSizeshNQ4ISI(littleEndianToInt);
            }
            int i14 = littleEndianToInt ^ i12;
            for (int i15 = 0; i15 < 4; i15++) {
                i14 = getHighResolutionOutputSizeshNQ4ISI(i14);
            }
            iArr3[i11] = i14;
        }
        for (int i16 = 0; i16 < 20; i16++) {
            int i17 = 33686018 * i16;
            int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i17, iArr);
            int rotateLeft = org.bouncycastle.util.Integers.rotateLeft(getHighSpeedVideoFpsRangesFor(i17 + android.R.attr.cacheColorHint, iArr2), 8);
            int i18 = highSpeedVideoFpsRangesFor + rotateLeft;
            int[] iArr4 = this.getInputFormats;
            int i19 = i16 * 2;
            iArr4[i19] = i18;
            int i20 = i18 + rotateLeft;
            iArr4[i19 + 1] = (i20 << 9) | (i20 >>> 23);
        }
        int i21 = iArr3[0];
        int i22 = iArr3[1];
        int i23 = 2;
        int i24 = iArr3[2];
        int i25 = 3;
        int i26 = iArr3[3];
        this.getInputSizeshNQ4ISI = new int[1024];
        int i27 = 0;
        while (i27 < 256) {
            int i28 = this.getOutputMinFrameDuration & i25;
            if (i28 != 0) {
                if (i28 == 1) {
                    int[] iArr5 = this.getInputSizeshNQ4ISI;
                    int i29 = i27 * 2;
                    int[] iArr6 = this.Camera2StreamConfigurationMap;
                    byte[][] bArr2 = getHighSpeedVideoFpsRanges;
                    byte b = bArr2[c][i27];
                    iArr5[i29] = iArr6[(i21 & 255) ^ (b & 255)];
                    iArr5[i29 + 1] = this.getHighSpeedVideoSizes[(b & 255) ^ ((i21 >>> 8) & 255)];
                    int[] iArr7 = this.getHighSpeedVideoFpsRangesFor;
                    byte b2 = bArr2[1][i27];
                    iArr5[i29 + 512] = iArr7[(b2 & 255) ^ ((i21 >>> 16) & 255)];
                    iArr5[i29 + 513] = this.getOutputFormats[(b2 & 255) ^ ((i21 >>> 24) & 255)];
                } else if (i28 == i23) {
                    i8 = i27;
                    i7 = i8;
                    i6 = i7;
                    i5 = i6;
                    int[] iArr8 = this.getInputSizeshNQ4ISI;
                    int i30 = i27 * 2;
                    int[] iArr9 = this.Camera2StreamConfigurationMap;
                    byte[][] bArr3 = getHighSpeedVideoFpsRanges;
                    byte[] bArr4 = bArr3[c];
                    iArr8[i30] = iArr9[(bArr4[(i22 & 255) ^ (bArr4[i6] & 255)] & 255) ^ (i21 & 255)];
                    int[] iArr10 = this.getHighSpeedVideoSizes;
                    byte[] bArr5 = bArr3[1];
                    iArr8[i30 + 1] = iArr10[(bArr4[((i22 >>> 8) & 255) ^ (bArr5[i5] & 255)] & 255) ^ ((i21 >>> 8) & 255)];
                    iArr8[i30 + 512] = this.getHighSpeedVideoFpsRangesFor[(bArr5[(bArr4[i8] & 255) ^ ((i22 >>> 16) & 255)] & 255) ^ ((i21 >>> 16) & 255)];
                    iArr8[i30 + 513] = this.getOutputFormats[(bArr5[(bArr5[i7] & 255) ^ ((i22 >>> 24) & 255)] & 255) ^ ((i21 >>> 24) & 255)];
                } else if (i28 == i25) {
                    i3 = i27;
                    i4 = i3;
                    i = i4;
                    i2 = i;
                }
                i27++;
                i23 = 2;
                c = 0;
                i25 = 3;
            } else {
                byte[][] bArr6 = getHighSpeedVideoFpsRanges;
                byte b3 = bArr6[1][i27];
                i = (b3 & 255) ^ (i26 & 255);
                byte b4 = bArr6[c][i27];
                i2 = (b4 & 255) ^ ((i26 >>> 8) & 255);
                i3 = (b4 & 255) ^ ((i26 >>> 16) & 255);
                i4 = (b3 & 255) ^ ((i26 >>> 24) & 255);
            }
            byte[][] bArr7 = getHighSpeedVideoFpsRanges;
            byte[] bArr8 = bArr7[1];
            i6 = (bArr8[i] & 255) ^ (i24 & 255);
            i5 = (bArr8[i2] & 255) ^ ((i24 >>> 8) & 255);
            byte[] bArr9 = bArr7[c];
            i8 = (bArr9[i3] & 255) ^ ((i24 >>> 16) & 255);
            i7 = (bArr9[i4] & 255) ^ ((i24 >>> 24) & 255);
            int[] iArr82 = this.getInputSizeshNQ4ISI;
            int i302 = i27 * 2;
            int[] iArr92 = this.Camera2StreamConfigurationMap;
            byte[][] bArr32 = getHighSpeedVideoFpsRanges;
            byte[] bArr42 = bArr32[c];
            iArr82[i302] = iArr92[(bArr42[(i22 & 255) ^ (bArr42[i6] & 255)] & 255) ^ (i21 & 255)];
            int[] iArr102 = this.getHighSpeedVideoSizes;
            byte[] bArr52 = bArr32[1];
            iArr82[i302 + 1] = iArr102[(bArr42[((i22 >>> 8) & 255) ^ (bArr52[i5] & 255)] & 255) ^ ((i21 >>> 8) & 255)];
            iArr82[i302 + 512] = this.getHighSpeedVideoFpsRangesFor[(bArr52[(bArr42[i8] & 255) ^ ((i22 >>> 16) & 255)] & 255) ^ ((i21 >>> 16) & 255)];
            iArr82[i302 + 513] = this.getOutputFormats[(bArr52[(bArr52[i7] & 255) ^ ((i22 >>> 24) & 255)] & 255) ^ ((i21 >>> 24) & 255)];
            i27++;
            i23 = 2;
            c = 0;
            i25 = 3;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public final int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.getHighSpeedVideoSizesFor == null) {
            throw new java.lang.IllegalStateException("Twofish not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            int littleEndianToInt = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i) ^ this.getInputFormats[4];
            int littleEndianToInt2 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 4) ^ this.getInputFormats[5];
            int littleEndianToInt3 = this.getInputFormats[6] ^ org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 8);
            int littleEndianToInt4 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 12) ^ this.getInputFormats[7];
            int i3 = 39;
            int i4 = 0;
            while (i4 < 16) {
                int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(littleEndianToInt);
                int highSpeedVideoSizes = getHighSpeedVideoSizes(littleEndianToInt2);
                int i5 = this.getInputFormats[i3];
                littleEndianToInt3 = org.bouncycastle.util.Integers.rotateLeft(littleEndianToInt3, 1) ^ ((highSpeedVideoFpsRangesFor + highSpeedVideoSizes) + this.getInputFormats[i3 - 1]);
                littleEndianToInt4 = org.bouncycastle.util.Integers.rotateRight(littleEndianToInt4 ^ (((highSpeedVideoSizes * 2) + highSpeedVideoFpsRangesFor) + i5), 1);
                int highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(littleEndianToInt3);
                int highSpeedVideoSizes2 = getHighSpeedVideoSizes(littleEndianToInt4);
                int i6 = this.getInputFormats[i3 - 2];
                littleEndianToInt = org.bouncycastle.util.Integers.rotateLeft(littleEndianToInt, 1) ^ ((highSpeedVideoFpsRangesFor2 + highSpeedVideoSizes2) + this.getInputFormats[i3 - 3]);
                littleEndianToInt2 = org.bouncycastle.util.Integers.rotateRight(littleEndianToInt2 ^ (((highSpeedVideoSizes2 * 2) + highSpeedVideoFpsRangesFor2) + i6), 1);
                i4 += 2;
                i3 -= 4;
            }
            org.bouncycastle.util.Pack.intToLittleEndian(littleEndianToInt3 ^ this.getInputFormats[0], bArr2, i2);
            org.bouncycastle.util.Pack.intToLittleEndian(littleEndianToInt4 ^ this.getInputFormats[1], bArr2, i2 + 4);
            org.bouncycastle.util.Pack.intToLittleEndian(this.getInputFormats[2] ^ littleEndianToInt, bArr2, i2 + 8);
            org.bouncycastle.util.Pack.intToLittleEndian(this.getInputFormats[3] ^ littleEndianToInt2, bArr2, i2 + 12);
            return 16;
        }
        int littleEndianToInt5 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i) ^ this.getInputFormats[0];
        int littleEndianToInt6 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 4) ^ this.getInputFormats[1];
        int littleEndianToInt7 = this.getInputFormats[2] ^ org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 8);
        int littleEndianToInt8 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 12) ^ this.getInputFormats[3];
        int i7 = 8;
        int i8 = littleEndianToInt6;
        int i9 = littleEndianToInt7;
        int i10 = 0;
        for (int i11 = 16; i10 < i11; i11 = 16) {
            int highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(littleEndianToInt5);
            int highSpeedVideoSizes3 = getHighSpeedVideoSizes(i8);
            i9 = org.bouncycastle.util.Integers.rotateRight(i9 ^ ((highSpeedVideoFpsRangesFor3 + highSpeedVideoSizes3) + this.getInputFormats[i7]), 1);
            littleEndianToInt8 = org.bouncycastle.util.Integers.rotateLeft(littleEndianToInt8, 1) ^ ((highSpeedVideoFpsRangesFor3 + (highSpeedVideoSizes3 * 2)) + this.getInputFormats[i7 + 1]);
            int highSpeedVideoFpsRangesFor4 = getHighSpeedVideoFpsRangesFor(i9);
            int highSpeedVideoSizes4 = getHighSpeedVideoSizes(littleEndianToInt8);
            littleEndianToInt5 = org.bouncycastle.util.Integers.rotateRight(littleEndianToInt5 ^ ((highSpeedVideoFpsRangesFor4 + highSpeedVideoSizes4) + this.getInputFormats[i7 + 2]), 1);
            i8 = org.bouncycastle.util.Integers.rotateLeft(i8, 1) ^ ((highSpeedVideoFpsRangesFor4 + (highSpeedVideoSizes4 * 2)) + this.getInputFormats[i7 + 3]);
            i10 += 2;
            i7 += 4;
        }
        org.bouncycastle.util.Pack.intToLittleEndian(this.getInputFormats[4] ^ i9, bArr2, i2);
        org.bouncycastle.util.Pack.intToLittleEndian(littleEndianToInt8 ^ this.getInputFormats[5], bArr2, i2 + 4);
        org.bouncycastle.util.Pack.intToLittleEndian(this.getInputFormats[6] ^ littleEndianToInt5, bArr2, i2 + 8);
        org.bouncycastle.util.Pack.intToLittleEndian(this.getInputFormats[7] ^ i8, bArr2, i2 + 12);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public final void reset() {
        byte[] bArr = this.getHighSpeedVideoSizesFor;
        if (bArr != null) {
            getHighSpeedVideoFpsRangesFor(bArr);
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public final void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to Twofish init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        this.getHighSpeedVideoSizesFor = key;
        int length = key.length * 8;
        if (length != 128 && length != 192 && length != 256) {
            throw new java.lang.IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        this.getOutputMinFrameDuration = key.length / 8;
        getHighSpeedVideoFpsRangesFor(key);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public final java.lang.String getAlgorithmName() {
        return "Twofish";
    }

    private int getHighSpeedVideoSizes(int i) {
        int[] iArr = this.getInputSizeshNQ4ISI;
        int i2 = iArr[((i >>> 24) & 255) * 2];
        int i3 = iArr[((i & 255) * 2) + 1];
        return iArr[(((i >>> 16) & 255) * 2) + 513] ^ ((i2 ^ i3) ^ iArr[(((i >>> 8) & 255) * 2) + 512]);
    }

    private int getHighSpeedVideoFpsRangesFor(int i) {
        int[] iArr = this.getInputSizeshNQ4ISI;
        int i2 = iArr[(i & 255) * 2];
        int i3 = iArr[(((i >>> 8) & 255) * 2) + 1];
        return iArr[(((i >>> 24) & 255) * 2) + 513] ^ ((i2 ^ i3) ^ iArr[(((i >>> 16) & 255) * 2) + 512]);
    }
}
