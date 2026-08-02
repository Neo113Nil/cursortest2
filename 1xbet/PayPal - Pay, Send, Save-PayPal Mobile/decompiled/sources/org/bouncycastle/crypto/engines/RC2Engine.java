package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class RC2Engine implements org.bouncycastle.crypto.BlockCipher {
    private static byte[] getHighSpeedVideoSizes = {-39, 120, -7, -60, com.google.common.base.Ascii.EM, -35, -75, -19, 40, -23, -3, 121, 74, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -40, -99, -58, 126, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -125, 43, 118, 83, -114, 98, 76, 100, -120, 68, -117, -5, -94, com.google.common.base.Ascii.ETB, -102, 89, -11, -121, -77, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 19, 97, 69, 109, -115, 9, -127, 125, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -67, -113, 64, -21, -122, -73, 123, com.google.common.base.Ascii.VT, com.visa.cbp.getEncExpo.onUnminimized, -107, 33, 34, 92, 107, 78, -126, 84, -42, 101, -109, -50, com.visa.cbp.getEncExpo.IResultReceiver2, -78, com.google.common.base.Ascii.FS, 115, 86, com.visa.cbp.getEncExpo.startTransaction, com.google.common.base.Ascii.DC4, -89, -116, -15, -36, 18, 117, -54, com.google.common.base.Ascii.US, 59, -66, -28, -47, 66, kotlin.io.encoding.Base64.padSymbol, -44, 48, -93, 60, -74, 38, 111, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 14, -38, 70, 105, 7, 87, 39, -14, com.google.common.base.Ascii.GS, -101, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -108, 67, 3, -8, 17, -57, -10, -112, -17, 62, -25, 6, -61, -43, 47, -56, 102, com.google.common.base.Ascii.RS, -41, 8, -24, -22, -34, Byte.MIN_VALUE, 82, -18, -9, -124, -86, 114, -84, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 77, 106, 42, -106, com.google.common.base.Ascii.SUB, -46, 113, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.google.common.base.Ascii.NAK, 73, 116, 75, -97, -48, 94, 4, com.google.common.base.Ascii.CAN, -92, -20, -62, -32, 65, 110, com.google.common.base.Ascii.SI, 81, -53, -52, 36, -111, -81, 80, -95, -12, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 57, com.visa.cbp.getEncExpo.registerForActivityResult, 124, 58, -123, 35, -72, -76, 122, -4, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 91, 37, 85, -105, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 45, 93, -6, -104, -29, -118, -110, -82, 5, -33, 41, 16, 103, 108, -70, -55, -45, 0, -26, com.visa.cbp.getEncExpo.kernelVersion, -31, -98, -88, 44, 99, com.google.common.base.Ascii.SYN, 1, 63, 88, -30, -119, -87, 13, 56, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, com.google.common.base.Ascii.ESC, -85, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -1, -80, -69, 72, com.google.common.base.Ascii.FF, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -71, -79, -51, 46, -59, -13, -37, 71, -27, -91, -100, com.visa.cbp.getEncExpo.IResultReceiver, 10, -90, 32, 104, -2, Byte.MAX_VALUE, -63, -83};
    private boolean Camera2StreamConfigurationMap;
    private int[] getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public final int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.getHighSpeedVideoFpsRanges == null) {
            throw new java.lang.IllegalStateException("RC2 engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        if (this.Camera2StreamConfigurationMap) {
            int i3 = ((bArr[i + 7] & 255) << 8) + (bArr[i + 6] & 255);
            int i4 = ((bArr[i + 5] & 255) << 8) + (bArr[i + 4] & 255);
            int i5 = ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255);
            int i6 = ((bArr[i + 1] & 255) << 8) + (bArr[i] & 255);
            for (int i7 = 0; i7 <= 16; i7 += 4) {
                int i8 = i6 + ((~i3) & i5) + (i4 & i3);
                int[] iArr = this.getHighSpeedVideoFpsRanges;
                int i9 = (i8 + iArr[i7]) & 65535;
                i6 = (i9 << 1) | (i9 >> 15);
                int i10 = (i5 + ((~i6) & i4) + (i3 & i6) + iArr[i7 + 1]) & 65535;
                i5 = (i10 << 2) | (i10 >> 14);
                int i11 = (i4 + ((~i5) & i3) + (i6 & i5) + iArr[i7 + 2]) & 65535;
                i4 = (i11 << 3) | (i11 >> 13);
                int i12 = (i3 + ((~i4) & i6) + (i5 & i4) + iArr[i7 + 3]) & 65535;
                i3 = (i12 << 5) | (i12 >> 11);
            }
            int[] iArr2 = this.getHighSpeedVideoFpsRanges;
            int i13 = i6 + iArr2[i3 & 63];
            int i14 = i5 + iArr2[i13 & 63];
            int i15 = i4 + iArr2[i14 & 63];
            int i16 = i3 + iArr2[i15 & 63];
            for (int i17 = 20; i17 <= 40; i17 += 4) {
                int i18 = i13 + ((~i16) & i14) + (i15 & i16);
                int[] iArr3 = this.getHighSpeedVideoFpsRanges;
                int i19 = (i18 + iArr3[i17]) & 65535;
                i13 = (i19 >> 15) | (i19 << 1);
                int i20 = (i14 + ((~i13) & i15) + (i16 & i13) + iArr3[i17 + 1]) & 65535;
                i14 = (i20 >> 14) | (i20 << 2);
                int i21 = (i15 + ((~i14) & i16) + (i13 & i14) + iArr3[i17 + 2]) & 65535;
                i15 = (i21 >> 13) | (i21 << 3);
                int i22 = (i16 + ((~i15) & i13) + (i14 & i15) + iArr3[i17 + 3]) & 65535;
                i16 = (i22 >> 11) | (i22 << 5);
            }
            int[] iArr4 = this.getHighSpeedVideoFpsRanges;
            int i23 = i13 + iArr4[i16 & 63];
            int i24 = i14 + iArr4[i23 & 63];
            int i25 = i15 + iArr4[i24 & 63];
            int i26 = i16 + iArr4[i25 & 63];
            for (int i27 = 44; i27 < 64; i27 += 4) {
                int i28 = i23 + ((~i26) & i24) + (i25 & i26);
                int[] iArr5 = this.getHighSpeedVideoFpsRanges;
                int i29 = (i28 + iArr5[i27]) & 65535;
                i23 = (i29 >> 15) | (i29 << 1);
                int i30 = (i24 + ((~i23) & i25) + (i26 & i23) + iArr5[i27 + 1]) & 65535;
                i24 = (i30 >> 14) | (i30 << 2);
                int i31 = (i25 + ((~i24) & i26) + (i23 & i24) + iArr5[i27 + 2]) & 65535;
                i25 = (i31 >> 13) | (i31 << 3);
                int i32 = (i26 + ((~i25) & i23) + (i24 & i25) + iArr5[i27 + 3]) & 65535;
                i26 = (i32 >> 11) | (i32 << 5);
            }
            bArr2[i2] = (byte) i23;
            bArr2[i2 + 1] = (byte) (i23 >> 8);
            bArr2[i2 + 2] = (byte) i24;
            bArr2[i2 + 3] = (byte) (i24 >> 8);
            bArr2[i2 + 4] = (byte) i25;
            bArr2[i2 + 5] = (byte) (i25 >> 8);
            bArr2[i2 + 6] = (byte) i26;
            bArr2[i2 + 7] = (byte) (i26 >> 8);
        } else {
            int i33 = ((bArr[i + 7] & 255) << 8) + (bArr[i + 6] & 255);
            int i34 = ((bArr[i + 5] & 255) << 8) + (bArr[i + 4] & 255);
            int i35 = ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255);
            int i36 = ((bArr[i + 1] & 255) << 8) + (bArr[i] & 255);
            for (int i37 = 60; i37 >= 44; i37 -= 4) {
                int i38 = i33 & 65535;
                int i39 = ((~i34) & i36) + (i35 & i34);
                int[] iArr6 = this.getHighSpeedVideoFpsRanges;
                i33 = ((i38 << 11) | (i38 >> 5)) - (i39 + iArr6[i37 + 3]);
                int i40 = i34 & 65535;
                i34 = ((i40 << 13) | (i40 >> 3)) - ((((~i35) & i33) + (i36 & i35)) + iArr6[i37 + 2]);
                int i41 = i35 & 65535;
                i35 = ((i41 << 14) | (i41 >> 2)) - ((((~i36) & i34) + (i33 & i36)) + iArr6[i37 + 1]);
                int i42 = i36 & 65535;
                i36 = ((i42 << 15) | (i42 >> 1)) - ((((~i33) & i35) + (i34 & i33)) + iArr6[i37]);
            }
            int[] iArr7 = this.getHighSpeedVideoFpsRanges;
            int i43 = i33 - iArr7[i34 & 63];
            int i44 = i34 - iArr7[i35 & 63];
            int i45 = i35 - iArr7[i36 & 63];
            int i46 = i36 - iArr7[i43 & 63];
            for (int i47 = 40; i47 >= 20; i47 -= 4) {
                int i48 = i43 & 65535;
                int i49 = ((~i44) & i46) + (i45 & i44);
                int[] iArr8 = this.getHighSpeedVideoFpsRanges;
                i43 = ((i48 << 11) | (i48 >> 5)) - (i49 + iArr8[i47 + 3]);
                int i50 = i44 & 65535;
                i44 = ((i50 << 13) | (i50 >> 3)) - ((((~i45) & i43) + (i46 & i45)) + iArr8[i47 + 2]);
                int i51 = i45 & 65535;
                i45 = ((i51 << 14) | (i51 >> 2)) - ((((~i46) & i44) + (i43 & i46)) + iArr8[i47 + 1]);
                int i52 = i46 & 65535;
                i46 = ((i52 << 15) | (i52 >> 1)) - ((((~i43) & i45) + (i44 & i43)) + iArr8[i47]);
            }
            int[] iArr9 = this.getHighSpeedVideoFpsRanges;
            int i53 = i43 - iArr9[i44 & 63];
            int i54 = i44 - iArr9[i45 & 63];
            int i55 = i45 - iArr9[i46 & 63];
            int i56 = i46 - iArr9[i53 & 63];
            for (int i57 = 16; i57 >= 0; i57 -= 4) {
                int i58 = i53 & 65535;
                int i59 = ((~i54) & i56) + (i55 & i54);
                int[] iArr10 = this.getHighSpeedVideoFpsRanges;
                i53 = ((i58 << 11) | (i58 >> 5)) - (i59 + iArr10[i57 + 3]);
                int i60 = i54 & 65535;
                i54 = ((i60 << 13) | (i60 >> 3)) - ((((~i55) & i53) + (i56 & i55)) + iArr10[i57 + 2]);
                int i61 = i55 & 65535;
                i55 = ((i61 << 14) | (i61 >> 2)) - ((((~i56) & i54) + (i53 & i56)) + iArr10[i57 + 1]);
                int i62 = i56 & 65535;
                i56 = ((i62 << 15) | (i62 >> 1)) - ((((~i53) & i55) + (i54 & i53)) + iArr10[i57]);
            }
            bArr2[i2] = (byte) i56;
            bArr2[i2 + 1] = (byte) (i56 >> 8);
            bArr2[i2 + 2] = (byte) i55;
            bArr2[i2 + 3] = (byte) (i55 >> 8);
            bArr2[i2 + 4] = (byte) i54;
            bArr2[i2 + 5] = (byte) (i54 >> 8);
            bArr2[i2 + 6] = (byte) i53;
            bArr2[i2 + 7] = (byte) (i53 >> 8);
        }
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.Camera2StreamConfigurationMap = z;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.RC2Parameters) {
            org.bouncycastle.crypto.params.RC2Parameters rC2Parameters = (org.bouncycastle.crypto.params.RC2Parameters) cipherParameters;
            this.getHighSpeedVideoFpsRanges = Camera2StreamConfigurationMap(rC2Parameters.getKey(), rC2Parameters.getEffectiveKeyBits());
        } else if (cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter) {
            byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
            this.getHighSpeedVideoFpsRanges = Camera2StreamConfigurationMap(key, key.length * 8);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to RC2 init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "RC2";
    }

    private static int[] Camera2StreamConfigurationMap(byte[] bArr, int i) {
        int[] iArr = new int[128];
        for (int i2 = 0; i2 != bArr.length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        int length = bArr.length;
        if (length < 128) {
            int i3 = iArr[length - 1];
            int i4 = 0;
            while (true) {
                i3 = getHighSpeedVideoSizes[(i3 + iArr[i4]) & 255] & 255;
                int i5 = length + 1;
                iArr[length] = i3;
                if (i5 >= 128) {
                    break;
                }
                i4++;
                length = i5;
            }
        }
        int i6 = (i + 7) >> 3;
        int i7 = 128 - i6;
        int i8 = getHighSpeedVideoSizes[(255 >> ((-i) & 7)) & iArr[i7]] & 255;
        iArr[i7] = i8;
        for (int i9 = 127 - i6; i9 >= 0; i9--) {
            i8 = getHighSpeedVideoSizes[i8 ^ iArr[i9 + i6]] & 255;
            iArr[i9] = i8;
        }
        int[] iArr2 = new int[64];
        for (int i10 = 0; i10 != 64; i10++) {
            int i11 = i10 * 2;
            iArr2[i10] = iArr[i11] + (iArr[i11 + 1] << 8);
        }
        return iArr2;
    }
}
