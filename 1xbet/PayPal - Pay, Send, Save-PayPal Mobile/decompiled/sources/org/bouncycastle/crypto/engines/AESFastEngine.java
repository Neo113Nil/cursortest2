package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class AESFastEngine implements org.bouncycastle.crypto.BlockCipher {
    private static final int[] getHighResolutionOutputSizeshNQ4ISI;
    private static final int[] getHighSpeedVideoFpsRangesFor;
    private int[][] getHighSpeedVideoSizesFor = null;
    private boolean getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private static final byte[] Camera2StreamConfigurationMap = {99, 124, com.visa.cbp.getEncExpo.IResultReceiver, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, com.visa.cbp.getEncExpo.onUnminimized, -83, -44, -94, -81, -100, -92, 114, com.visa.cbp.getEncExpo.startTransaction, -73, -3, -109, 38, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 63, -9, -52, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -91, -27, -15, 113, -40, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.NAK, 4, -57, 35, -61, com.google.common.base.Ascii.CAN, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, 110, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, com.visa.cbp.getEncExpo.kernelVersion, -48, -17, -86, -5, 67, 77, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, 16, -1, -13, -46, -51, com.google.common.base.Ascii.FF, 19, -20, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -105, 68, com.google.common.base.Ascii.ETB, -60, -89, 126, kotlin.io.encoding.Base64.padSymbol, 100, 93, com.google.common.base.Ascii.EM, 115, com.visa.cbp.getEncExpo.IResultReceiver2, -127, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -36, 34, 42, -112, -120, 70, -18, -72, com.google.common.base.Ascii.DC4, -34, 94, com.google.common.base.Ascii.VT, -37, -32, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, com.google.common.base.Ascii.FS, -90, -76, -58, -24, -35, 116, com.google.common.base.Ascii.US, 75, -67, -117, -118, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 62, -75, 102, 72, 3, -10, 14, 97, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 87, -71, -122, -63, com.google.common.base.Ascii.GS, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, com.google.common.base.Ascii.RS, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -26, 66, 104, 65, com.visa.cbp.getEncExpo.registerForActivityResult, 45, com.google.common.base.Ascii.SI, -80, 84, -69, com.google.common.base.Ascii.SYN};
    private static final byte[] getHighSpeedVideoSizes = {82, 9, 106, -43, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -91, 56, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -90, -62, 35, kotlin.io.encoding.Base64.padSymbol, -18, 76, -107, com.google.common.base.Ascii.VT, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, com.google.common.base.Ascii.SYN, -44, -92, 92, -52, 93, 101, -74, -110, 108, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 72, 80, -3, -19, -71, -38, 94, com.google.common.base.Ascii.NAK, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, com.google.common.base.Ascii.RS, -113, -54, 63, com.google.common.base.Ascii.SI, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 103, -36, -22, -105, -14, com.visa.cbp.getEncExpo.kernelVersion, -50, com.visa.cbp.getEncExpo.onUnminimized, -76, -26, 115, -106, -84, 116, 34, -25, -83, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -123, -30, -7, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -24, com.google.common.base.Ascii.FS, 117, -33, 110, 71, -15, com.google.common.base.Ascii.SUB, 113, com.google.common.base.Ascii.GS, 41, -59, -119, 111, -73, 98, 14, -86, com.google.common.base.Ascii.CAN, -66, com.google.common.base.Ascii.ESC, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, com.visa.cbp.getEncExpo.startTransaction, -2, 120, -51, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -12, com.google.common.base.Ascii.US, -35, -88, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -120, 7, -57, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -79, 18, 16, 89, 39, Byte.MIN_VALUE, -20, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, com.visa.cbp.getEncExpo.IResultReceiver2, 81, Byte.MAX_VALUE, -87, com.google.common.base.Ascii.EM, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, com.visa.cbp.getEncExpo.registerForActivityResult, 97, com.google.common.base.Ascii.ETB, 43, 4, 126, -70, com.visa.cbp.getEncExpo.IResultReceiver, -42, 38, -31, 105, com.google.common.base.Ascii.DC4, 99, 85, 33, com.google.common.base.Ascii.FF, 125};
    private static final int[] getHighSpeedVideoFpsRanges = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, 171, 77, 154, 47, 94, 188, 99, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, 151, 53, 106, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, 179, 125, 250, 239, 197, 145};

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to AES init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        int length = key.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new java.lang.IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i = length >>> 2;
        this.getOutputFormats = i + 6;
        int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, i + 7, 4);
        char c = 3;
        if (i == 4) {
            int littleEndianToInt = org.bouncycastle.util.Pack.littleEndianToInt(key, 0);
            iArr[0][0] = littleEndianToInt;
            int littleEndianToInt2 = org.bouncycastle.util.Pack.littleEndianToInt(key, 4);
            iArr[0][1] = littleEndianToInt2;
            int littleEndianToInt3 = org.bouncycastle.util.Pack.littleEndianToInt(key, 8);
            iArr[0][2] = littleEndianToInt3;
            int littleEndianToInt4 = org.bouncycastle.util.Pack.littleEndianToInt(key, 12);
            iArr[0][3] = littleEndianToInt4;
            for (int i2 = 1; i2 <= 10; i2++) {
                littleEndianToInt ^= getHighSpeedVideoFpsRangesFor((littleEndianToInt4 << (-8)) | (littleEndianToInt4 >>> 8)) ^ getHighSpeedVideoFpsRanges[i2 - 1];
                int[] iArr2 = iArr[i2];
                iArr2[0] = littleEndianToInt;
                littleEndianToInt2 ^= littleEndianToInt;
                iArr2[1] = littleEndianToInt2;
                littleEndianToInt3 ^= littleEndianToInt2;
                iArr2[2] = littleEndianToInt3;
                littleEndianToInt4 ^= littleEndianToInt3;
                iArr2[3] = littleEndianToInt4;
            }
        } else if (i == 6) {
            int littleEndianToInt5 = org.bouncycastle.util.Pack.littleEndianToInt(key, 0);
            iArr[0][0] = littleEndianToInt5;
            int littleEndianToInt6 = org.bouncycastle.util.Pack.littleEndianToInt(key, 4);
            iArr[0][1] = littleEndianToInt6;
            int littleEndianToInt7 = org.bouncycastle.util.Pack.littleEndianToInt(key, 8);
            iArr[0][2] = littleEndianToInt7;
            int littleEndianToInt8 = org.bouncycastle.util.Pack.littleEndianToInt(key, 12);
            iArr[0][3] = littleEndianToInt8;
            int littleEndianToInt9 = org.bouncycastle.util.Pack.littleEndianToInt(key, 16);
            int littleEndianToInt10 = org.bouncycastle.util.Pack.littleEndianToInt(key, 20);
            int i3 = 1;
            int i4 = 1;
            while (true) {
                int[] iArr3 = iArr[i4];
                iArr3[0] = littleEndianToInt9;
                iArr3[1] = littleEndianToInt10;
                int highSpeedVideoFpsRangesFor = littleEndianToInt5 ^ (getHighSpeedVideoFpsRangesFor((littleEndianToInt10 << (-8)) | (littleEndianToInt10 >>> 8)) ^ i3);
                int[] iArr4 = iArr[i4];
                iArr4[2] = highSpeedVideoFpsRangesFor;
                int i5 = littleEndianToInt6 ^ highSpeedVideoFpsRangesFor;
                iArr4[3] = i5;
                int i6 = littleEndianToInt7 ^ i5;
                int[] iArr5 = iArr[i4 + 1];
                iArr5[0] = i6;
                int i7 = littleEndianToInt8 ^ i6;
                iArr5[1] = i7;
                int i8 = littleEndianToInt9 ^ i7;
                iArr5[2] = i8;
                int i9 = littleEndianToInt10 ^ i8;
                iArr5[3] = i9;
                int i10 = i3 << 2;
                littleEndianToInt5 = highSpeedVideoFpsRangesFor ^ ((i3 << 1) ^ getHighSpeedVideoFpsRangesFor((i9 << (-8)) | (i9 >>> 8)));
                int[] iArr6 = iArr[i4 + 2];
                iArr6[0] = littleEndianToInt5;
                littleEndianToInt6 = i5 ^ littleEndianToInt5;
                iArr6[1] = littleEndianToInt6;
                littleEndianToInt7 = i6 ^ littleEndianToInt6;
                iArr6[2] = littleEndianToInt7;
                littleEndianToInt8 = i7 ^ littleEndianToInt7;
                iArr6[3] = littleEndianToInt8;
                i4 += 3;
                if (i4 >= 13) {
                    break;
                }
                littleEndianToInt9 = i8 ^ littleEndianToInt8;
                littleEndianToInt10 = i9 ^ littleEndianToInt9;
                i3 = i10;
            }
        } else {
            if (i != 8) {
                throw new java.lang.IllegalStateException("Should never get here");
            }
            int littleEndianToInt11 = org.bouncycastle.util.Pack.littleEndianToInt(key, 0);
            iArr[0][0] = littleEndianToInt11;
            int littleEndianToInt12 = org.bouncycastle.util.Pack.littleEndianToInt(key, 4);
            iArr[0][1] = littleEndianToInt12;
            int littleEndianToInt13 = org.bouncycastle.util.Pack.littleEndianToInt(key, 8);
            iArr[0][2] = littleEndianToInt13;
            int littleEndianToInt14 = org.bouncycastle.util.Pack.littleEndianToInt(key, 12);
            iArr[0][3] = littleEndianToInt14;
            int littleEndianToInt15 = org.bouncycastle.util.Pack.littleEndianToInt(key, 16);
            iArr[1][0] = littleEndianToInt15;
            int littleEndianToInt16 = org.bouncycastle.util.Pack.littleEndianToInt(key, 20);
            iArr[1][1] = littleEndianToInt16;
            int littleEndianToInt17 = org.bouncycastle.util.Pack.littleEndianToInt(key, 24);
            iArr[1][2] = littleEndianToInt17;
            int littleEndianToInt18 = org.bouncycastle.util.Pack.littleEndianToInt(key, 28);
            iArr[1][3] = littleEndianToInt18;
            int i11 = 2;
            int i12 = 1;
            while (true) {
                int i13 = i12 << 1;
                littleEndianToInt11 ^= getHighSpeedVideoFpsRangesFor((littleEndianToInt18 << (-8)) | (littleEndianToInt18 >>> 8)) ^ i12;
                int[] iArr7 = iArr[i11];
                iArr7[0] = littleEndianToInt11;
                littleEndianToInt12 ^= littleEndianToInt11;
                iArr7[1] = littleEndianToInt12;
                littleEndianToInt13 ^= littleEndianToInt12;
                iArr7[2] = littleEndianToInt13;
                littleEndianToInt14 ^= littleEndianToInt13;
                iArr7[c] = littleEndianToInt14;
                int i14 = i11 + 1;
                if (i14 >= 15) {
                    break;
                }
                littleEndianToInt15 ^= getHighSpeedVideoFpsRangesFor(littleEndianToInt14);
                int[] iArr8 = iArr[i14];
                iArr8[0] = littleEndianToInt15;
                littleEndianToInt16 ^= littleEndianToInt15;
                iArr8[1] = littleEndianToInt16;
                littleEndianToInt17 ^= littleEndianToInt16;
                iArr8[2] = littleEndianToInt17;
                littleEndianToInt18 ^= littleEndianToInt17;
                iArr8[3] = littleEndianToInt18;
                i11 += 2;
                i12 = i13;
                c = 3;
            }
        }
        if (!z) {
            for (int i15 = 1; i15 < this.getOutputFormats; i15++) {
                for (int i16 = 0; i16 < 4; i16++) {
                    int[] iArr9 = iArr[i15];
                    int i17 = iArr9[i16];
                    int i18 = ((i17 << (-8)) | (i17 >>> 8)) ^ i17;
                    int i19 = i17 ^ (((((-2139062144) & i18) >>> 7) * 27) ^ ((2139062143 & i18) << 1));
                    int i20 = (-1061109568) & i19;
                    int i21 = i20 ^ (i20 >>> 1);
                    int i22 = i18 ^ (((i21 >>> 2) ^ ((1061109567 & i19) << 2)) ^ (i21 >>> 5));
                    iArr9[i16] = i19 ^ (i22 ^ ((i22 << (-16)) | (i22 >>> 16)));
                }
            }
        }
        this.getHighSpeedVideoSizesFor = iArr;
        this.getInputSizeshNQ4ISI = z;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        org.bouncycastle.crypto.engines.AESFastEngine aESFastEngine = this;
        int[][] iArr = aESFastEngine.getHighSpeedVideoSizesFor;
        if (iArr == null) {
            throw new java.lang.IllegalStateException("AES engine not initialised");
        }
        if (i > bArr.length - 16) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i2 > bArr2.length - 16) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        char c = 0;
        if (aESFastEngine.getInputSizeshNQ4ISI) {
            int littleEndianToInt = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i);
            int littleEndianToInt2 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 4);
            int littleEndianToInt3 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 8);
            int littleEndianToInt4 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 12);
            int[] iArr2 = iArr[0];
            int i3 = littleEndianToInt ^ iArr2[0];
            int i4 = littleEndianToInt2 ^ iArr2[1];
            int i5 = littleEndianToInt3 ^ iArr2[2];
            int i6 = littleEndianToInt4 ^ iArr2[3];
            int i7 = 1;
            for (int i8 = 1; i7 < aESFastEngine.getOutputFormats - i8; i8 = 1) {
                int[] iArr3 = getHighSpeedVideoFpsRangesFor;
                int i9 = iArr3[i3 & 255];
                int i10 = iArr3[((i4 >>> 8) & 255) + 256];
                int i11 = iArr3[((i5 >>> 16) & 255) + 512];
                int i12 = iArr3[((i6 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS];
                int[] iArr4 = iArr[i7];
                int i13 = (((i10 ^ i9) ^ i11) ^ i12) ^ iArr4[c];
                int i14 = (((iArr3[i4 & 255] ^ iArr3[((i5 >>> 8) & 255) + 256]) ^ iArr3[((i6 >>> 16) & 255) + 512]) ^ iArr3[((i3 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS]) ^ iArr4[i8];
                int i15 = (((iArr3[i5 & 255] ^ iArr3[((i6 >>> 8) & 255) + 256]) ^ iArr3[((i3 >>> 16) & 255) + 512]) ^ iArr3[((i4 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS]) ^ iArr4[2];
                int i16 = (((iArr3[i6 & 255] ^ iArr3[((i3 >>> 8) & 255) + 256]) ^ iArr3[((i4 >>> 16) & 255) + 512]) ^ iArr3[((i5 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS]) ^ iArr4[3];
                int i17 = iArr3[i13 & 255];
                int i18 = iArr3[((i14 >>> 8) & 255) + 256];
                int i19 = iArr3[((i15 >>> 16) & 255) + 512];
                int i20 = iArr3[((i16 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS];
                int[] iArr5 = iArr[i7 + 1];
                int i21 = iArr5[0];
                int i22 = iArr3[i14 & 255];
                int i23 = iArr3[((i15 >>> 8) & 255) + 256];
                int i24 = iArr3[((i16 >>> 16) & 255) + 512];
                int i25 = iArr3[((i13 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS];
                int i26 = iArr5[1];
                int[][] iArr6 = iArr;
                int i27 = iArr3[i15 & 255];
                int i28 = iArr3[((i16 >>> 8) & 255) + 256];
                int i29 = iArr3[((i13 >>> 16) & 255) + 512];
                int i30 = iArr3[((i14 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS];
                int i31 = iArr5[2];
                i7 += 2;
                i6 = (((iArr3[i16 & 255] ^ iArr3[((i13 >>> 8) & 255) + 256]) ^ iArr3[((i14 >>> 16) & 255) + 512]) ^ iArr3[((i15 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS]) ^ iArr5[3];
                i3 = (((i17 ^ i18) ^ i19) ^ i20) ^ i21;
                i4 = (((i23 ^ i22) ^ i24) ^ i25) ^ i26;
                i5 = (((i28 ^ i27) ^ i29) ^ i30) ^ i31;
                aESFastEngine = this;
                iArr = iArr6;
                c = 0;
            }
            int[][] iArr7 = iArr;
            int[] iArr8 = getHighSpeedVideoFpsRangesFor;
            int i32 = iArr8[i3 & 255];
            int i33 = iArr8[((i4 >>> 8) & 255) + 256];
            int i34 = iArr8[((i5 >>> 16) & 255) + 512];
            int i35 = iArr8[((i6 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS];
            int[] iArr9 = iArr7[i7];
            int i36 = (((i32 ^ i33) ^ i34) ^ i35) ^ iArr9[0];
            int i37 = (((iArr8[i4 & 255] ^ iArr8[((i5 >>> 8) & 255) + 256]) ^ iArr8[((i6 >>> 16) & 255) + 512]) ^ iArr8[((i3 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS]) ^ iArr9[1];
            int i38 = (((iArr8[i5 & 255] ^ iArr8[((i6 >>> 8) & 255) + 256]) ^ iArr8[((i3 >>> 16) & 255) + 512]) ^ iArr8[((i4 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS]) ^ iArr9[2];
            int i39 = (iArr8[((i5 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS] ^ ((iArr8[i6 & 255] ^ iArr8[((i3 >>> 8) & 255) + 256]) ^ iArr8[((i4 >>> 16) & 255) + 512])) ^ iArr9[3];
            byte[] bArr3 = Camera2StreamConfigurationMap;
            byte b = bArr3[i36 & 255];
            byte b2 = bArr3[(i37 >>> 8) & 255];
            byte b3 = bArr3[(i38 >>> 16) & 255];
            byte b4 = bArr3[(i39 >>> 24) & 255];
            int[] iArr10 = iArr7[i7 + 1];
            int i40 = iArr10[0];
            byte b5 = bArr3[i37 & 255];
            byte b6 = bArr3[(i38 >>> 8) & 255];
            byte b7 = bArr3[(i39 >>> 16) & 255];
            byte b8 = bArr3[(i36 >>> 24) & 255];
            int i41 = iArr10[1];
            byte b9 = bArr3[i38 & 255];
            byte b10 = bArr3[(i39 >>> 8) & 255];
            byte b11 = bArr3[(i36 >>> 16) & 255];
            byte b12 = bArr3[(i37 >>> 24) & 255];
            int i42 = iArr10[2];
            byte b13 = bArr3[i39 & 255];
            byte b14 = bArr3[(i36 >>> 8) & 255];
            byte b15 = bArr3[(i37 >>> 16) & 255];
            byte b16 = bArr3[(i38 >>> 24) & 255];
            int i43 = iArr10[3];
            org.bouncycastle.util.Pack.intToLittleEndian((((((b2 & 255) << 8) ^ (b & 255)) ^ ((b3 & 255) << 16)) ^ ((b4 & 255) << 24)) ^ i40, bArr2, i2);
            org.bouncycastle.util.Pack.intToLittleEndian((((((b6 & 255) << 8) ^ (b5 & 255)) ^ ((b7 & 255) << 16)) ^ ((b8 & 255) << 24)) ^ i41, bArr2, i2 + 4);
            org.bouncycastle.util.Pack.intToLittleEndian((((((b10 & 255) << 8) ^ (b9 & 255)) ^ ((b11 & 255) << 16)) ^ ((b12 & 255) << 24)) ^ i42, bArr2, i2 + 8);
            org.bouncycastle.util.Pack.intToLittleEndian(((((b13 & 255) ^ ((b14 & 255) << 8)) ^ ((b15 & 255) << 16)) ^ ((b16 & 255) << 24)) ^ i43, bArr2, i2 + 12);
            return 16;
        }
        int littleEndianToInt5 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i);
        int littleEndianToInt6 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 4);
        int littleEndianToInt7 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 8);
        int littleEndianToInt8 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 12);
        int i44 = this.getOutputFormats;
        int[] iArr11 = iArr[i44];
        int i45 = littleEndianToInt5 ^ iArr11[0];
        int i46 = 1;
        int i47 = littleEndianToInt6 ^ iArr11[1];
        int i48 = littleEndianToInt7 ^ iArr11[2];
        int i49 = i44 - 1;
        int i50 = littleEndianToInt8 ^ iArr11[3];
        while (i49 > i46) {
            int[] iArr12 = getHighResolutionOutputSizeshNQ4ISI;
            int i51 = iArr12[i45 & 255];
            int i52 = iArr12[((i50 >>> 8) & 255) + 256];
            int i53 = iArr12[((i48 >>> 16) & 255) + 512];
            int i54 = iArr12[((i47 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS];
            int[] iArr13 = iArr[i49];
            int i55 = (((i51 ^ i52) ^ i53) ^ i54) ^ iArr13[0];
            int i56 = (((iArr12[i47 & 255] ^ iArr12[((i45 >>> 8) & 255) + 256]) ^ iArr12[((i50 >>> 16) & 255) + 512]) ^ iArr12[((i48 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS]) ^ iArr13[1];
            int i57 = (((iArr12[i48 & 255] ^ iArr12[((i47 >>> 8) & 255) + 256]) ^ iArr12[((i45 >>> 16) & 255) + 512]) ^ iArr12[((i50 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS]) ^ iArr13[2];
            int i58 = (iArr12[((i45 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS] ^ ((iArr12[i50 & 255] ^ iArr12[((i48 >>> 8) & 255) + 256]) ^ iArr12[((i47 >>> 16) & 255) + 512])) ^ iArr13[3];
            int i59 = iArr12[i55 & 255];
            int i60 = iArr12[((i58 >>> 8) & 255) + 256];
            int i61 = iArr12[((i57 >>> 16) & 255) + 512];
            int i62 = iArr12[((i56 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS];
            int[] iArr14 = iArr[i49 - 1];
            int i63 = iArr14[0];
            int i64 = iArr12[i56 & 255];
            int i65 = iArr12[((i55 >>> 8) & 255) + 256];
            int i66 = iArr12[((i58 >>> 16) & 255) + 512];
            int i67 = iArr12[((i57 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS];
            int i68 = iArr14[1];
            int i69 = iArr12[i57 & 255];
            int i70 = iArr12[((i56 >>> 8) & 255) + 256];
            int i71 = iArr12[((i55 >>> 16) & 255) + 512];
            int i72 = iArr12[((i58 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS];
            int i73 = iArr14[2];
            i49 -= 2;
            int i74 = (((iArr12[i58 & 255] ^ iArr12[((i57 >>> 8) & 255) + 256]) ^ iArr12[((i56 >>> 16) & 255) + 512]) ^ iArr12[((i55 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS]) ^ iArr14[3];
            int i75 = (((i59 ^ i60) ^ i61) ^ i62) ^ i63;
            i47 = (((i65 ^ i64) ^ i66) ^ i67) ^ i68;
            i48 = (((i70 ^ i69) ^ i71) ^ i72) ^ i73;
            i46 = 1;
            i50 = i74;
            i45 = i75;
        }
        int[] iArr15 = getHighResolutionOutputSizeshNQ4ISI;
        int i76 = iArr15[i45 & 255];
        int i77 = iArr15[((i50 >>> 8) & 255) + 256];
        int i78 = iArr15[((i48 >>> 16) & 255) + 512];
        int i79 = iArr15[((i47 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS];
        int[] iArr16 = iArr[1];
        int i80 = (((i76 ^ i77) ^ i78) ^ i79) ^ iArr16[0];
        int i81 = (((iArr15[i47 & 255] ^ iArr15[((i45 >>> 8) & 255) + 256]) ^ iArr15[((i50 >>> 16) & 255) + 512]) ^ iArr15[((i48 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS]) ^ iArr16[1];
        int i82 = (((iArr15[i48 & 255] ^ iArr15[((i47 >>> 8) & 255) + 256]) ^ iArr15[((i45 >>> 16) & 255) + 512]) ^ iArr15[((i50 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS]) ^ iArr16[2];
        int i83 = (iArr15[((i45 >>> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS] ^ ((iArr15[i50 & 255] ^ iArr15[((i48 >>> 8) & 255) + 256]) ^ iArr15[((i47 >>> 16) & 255) + 512])) ^ iArr16[3];
        byte[] bArr4 = getHighSpeedVideoSizes;
        byte b17 = bArr4[i80 & 255];
        byte b18 = bArr4[(i83 >>> 8) & 255];
        byte b19 = bArr4[(i82 >>> 16) & 255];
        byte b20 = bArr4[(i81 >>> 24) & 255];
        int[] iArr17 = iArr[0];
        int i84 = iArr17[0];
        byte b21 = bArr4[i81 & 255];
        byte b22 = bArr4[(i80 >>> 8) & 255];
        byte b23 = bArr4[(i83 >>> 16) & 255];
        byte b24 = bArr4[(i82 >>> 24) & 255];
        int i85 = iArr17[1];
        byte b25 = bArr4[i82 & 255];
        byte b26 = bArr4[(i81 >>> 8) & 255];
        byte b27 = bArr4[(i80 >>> 16) & 255];
        byte b28 = bArr4[(i83 >>> 24) & 255];
        int i86 = iArr17[2];
        byte b29 = bArr4[i83 & 255];
        byte b30 = bArr4[(i82 >>> 8) & 255];
        byte b31 = bArr4[(i81 >>> 16) & 255];
        byte b32 = bArr4[(i80 >>> 24) & 255];
        int i87 = iArr17[3];
        org.bouncycastle.util.Pack.intToLittleEndian(((((b17 & 255) ^ ((b18 & 255) << 8)) ^ ((b19 & 255) << 16)) ^ ((b20 & 255) << 24)) ^ i84, bArr2, i2);
        org.bouncycastle.util.Pack.intToLittleEndian((((((b22 & 255) << 8) ^ (b21 & 255)) ^ ((b23 & 255) << 16)) ^ ((b24 & 255) << 24)) ^ i85, bArr2, i2 + 4);
        org.bouncycastle.util.Pack.intToLittleEndian((((((b26 & 255) << 8) ^ (b25 & 255)) ^ ((b27 & 255) << 16)) ^ ((b28 & 255) << 24)) ^ i86, bArr2, i2 + 8);
        org.bouncycastle.util.Pack.intToLittleEndian(((((b29 & 255) ^ ((b30 & 255) << 8)) ^ ((b31 & 255) << 16)) ^ ((b32 & 255) << 24)) ^ i87, bArr2, i2 + 12);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return org.jose4j.keys.AesKey.ALGORITHM;
    }

    private static int getHighSpeedVideoFpsRangesFor(int i) {
        byte[] bArr = Camera2StreamConfigurationMap;
        return ((bArr[(i >>> 24) & 255] & 255) << 24) | (bArr[i & 255] & 255) | ((bArr[(i >>> 8) & 255] & 255) << 8) | ((bArr[(i >>> 16) & 255] & 255) << 16);
    }

    static {
        int[] iArr = new int[1024];
        int[] iArr2 = new int[1024];
        java.nio.ByteBuffer.wrap("¥ccÆ\u0084||ø\u0099wwî\u008d{{ö\ròòÿ½kkÖ±ooÞTÅÅ\u0091P00`\u0003\u0001\u0001\u0002©ggÎ}++V\u0019þþçb××µæ««M\u009avvìEÊÊ\u008f\u009d\u0082\u0082\u001f@ÉÉ\u0089\u0087}}ú\u0015úúïëYY²ÉGG\u008e\u000bððûì\u00ad\u00adAgÔÔ³ý¢¢_ê¯¯E¿\u009c\u009c#÷¤¤S\u0096rrä[ÀÀ\u009bÂ··u\u001cýýá®\u0093\u0093=j&&LZ66lA??~\u0002÷÷õOÌÌ\u0083\\44hô¥¥Q4ååÑ\bññù\u0093qqâsØØ«S11b?\u0015\u0015*\f\u0004\u0004\bRÇÇ\u0095e##F^ÃÃ\u009d(\u0018\u00180¡\u0096\u00967\u000f\u0005\u0005\nµ\u009a\u009a/\t\u0007\u0007\u000e6\u0012\u0012$\u009b\u0080\u0080\u001b=ââß&ëëÍi''NÍ²²\u007f\u009fuuê\u001b\t\t\u0012\u009e\u0083\u0083\u001dt,,X.\u001a\u001a4-\u001b\u001b6²nnÜîZZ´û  [öRR¤M;;vaÖÖ·Î³³}{))R>ããÝq//^\u0097\u0084\u0084\u0013õSS¦hÑÑ¹\u0000\u0000\u0000\u0000,ííÁ`  @\u001füüãÈ±±yí[[¶¾jjÔFËË\u008dÙ¾¾gK99rÞJJ\u0094ÔLL\u0098èXX°JÏÏ\u0085kÐÐ»*ïïÅåªªO\u0016ûûíÅCC\u0086×MM\u009aU33f\u0094\u0085\u0085\u0011ÏEE\u008a\u0010ùùé\u0006\u0002\u0002\u0004\u0081\u007f\u007fþðPP D<<xº\u009f\u009f%ã¨¨KóQQ¢þ££]À@@\u0080\u008a\u008f\u008f\u0005\u00ad\u0092\u0092?¼\u009d\u009d!H88p\u0004õõñß¼¼cÁ¶¶wuÚÚ¯c!!B0\u0010\u0010 \u001aÿÿå\u000eóóýmÒÒ¿LÍÍ\u0081\u0014\f\f\u00185\u0013\u0013&/ììÃá__¾¢\u0097\u00975ÌDD\u00889\u0017\u0017.WÄÄ\u0093ò§§U\u0082~~üG==z¬ddÈç]]º+\u0019\u00192\u0095ssæ ``À\u0098\u0081\u0081\u0019ÑOO\u009e\u007fÜÜ£f\"\"D~**T«\u0090\u0090;\u0083\u0088\u0088\u000bÊFF\u008c)îîÇÓ¸¸k<\u0014\u0014(yÞÞ§â^^¼\u001d\u000b\u000b\u0016vÛÛ\u00ad;ààÛV22dN::t\u001e\n\n\u0014ÛII\u0092\n\u0006\u0006\fl$$Hä\\\\¸]ÂÂ\u009fnÓÓ½ï¬¬C¦bbÄ¨\u0091\u00919¤\u0095\u009517ääÓ\u008byyò2ççÕCÈÈ\u008bY77n·mmÚ\u008c\u008d\u008d\u0001dÕÕ±ÒNN\u009cà©©I´llØúVV¬\u0007ôôó%êêÏ¯eeÊ\u008ezzôé®®G\u0018\b\b\u0010Õººo\u0088xxðo%%Jr..\\$\u001c\u001c8ñ¦¦WÇ´´sQÆÆ\u0097#èèË|ÝÝ¡\u009cttè!\u001f\u001f>ÝKK\u0096Ü½½a\u0086\u008b\u008b\r\u0085\u008a\u008a\u000f\u0090ppàB>>|ÄµµqªffÌØHH\u0090\u0005\u0003\u0003\u0006\u0001öö÷\u0012\u000e\u000e\u001c£aaÂ_55jùWW®Ð¹¹i\u0091\u0086\u0086\u0017XÁÁ\u0099'\u001d\u001d:¹\u009e\u009e'8ááÙ\u0013øøë³\u0098\u0098+3\u0011\u0011\"»iiÒpÙÙ©\u0089\u008e\u008e\u0007§\u0094\u00943¶\u009b\u009b-\"\u001e\u001e<\u0092\u0087\u0087\u0015 ééÉIÎÎ\u0087ÿUUªx((Pzßß¥\u008f\u008c\u008c\u0003ø¡¡Y\u0080\u0089\u0089\t\u0017\r\r\u001aÚ¿¿e1ææ×ÆBB\u0084¸hhÐÃAA\u0082°\u0099\u0099)w--Z\u0011\u000f\u000f\u001eË°°{üTT¨Ö»»m:\u0016\u0016,ccÆ¥||ø\u0084wwî\u0099{{ö\u008dòòÿ\rkkÖ½ooÞ±ÅÅ\u0091T00`P\u0001\u0001\u0002\u0003ggÎ©++V}þþç\u0019××µb««Mævvì\u009aÊÊ\u008fE\u0082\u0082\u001f\u009dÉÉ\u0089@}}ú\u0087úúï\u0015YY²ëGG\u008eÉððû\u000b\u00ad\u00adAìÔÔ³g¢¢_ý¯¯Eê\u009c\u009c#¿¤¤S÷rrä\u0096ÀÀ\u009b[··uÂýýá\u001c\u0093\u0093=®&&Lj66lZ??~A÷÷õ\u0002ÌÌ\u0083O44h\\¥¥QôååÑ4ññù\bqqâ\u0093ØØ«s11bS\u0015\u0015*?\u0004\u0004\b\fÇÇ\u0095R##FeÃÃ\u009d^\u0018\u00180(\u0096\u00967¡\u0005\u0005\n\u000f\u009a\u009a/µ\u0007\u0007\u000e\t\u0012\u0012$6\u0080\u0080\u001b\u009bââß=ëëÍ&''Ni²²\u007fÍuuê\u009f\t\t\u0012\u001b\u0083\u0083\u001d\u009e,,Xt\u001a\u001a4.\u001b\u001b6-nnÜ²ZZ´î  [ûRR¤ö;;vMÖÖ·a³³}Î))R{ããÝ>//^q\u0084\u0084\u0013\u0097SS¦õÑÑ¹h\u0000\u0000\u0000\u0000ííÁ,  @`üüã\u001f±±yÈ[[¶íjjÔ¾ËË\u008dF¾¾gÙ99rKJJ\u0094ÞLL\u0098ÔXX°èÏÏ\u0085JÐÐ»kïïÅ*ªªOåûûí\u0016CC\u0086ÅMM\u009a×33fU\u0085\u0085\u0011\u0094EE\u008aÏùùé\u0010\u0002\u0002\u0004\u0006\u007f\u007fþ\u0081PP ð<<xD\u009f\u009f%º¨¨KãQQ¢ó££]þ@@\u0080À\u008f\u008f\u0005\u008a\u0092\u0092?\u00ad\u009d\u009d!¼88pHõõñ\u0004¼¼cß¶¶wÁÚÚ¯u!!Bc\u0010\u0010 0ÿÿå\u001aóóý\u000eÒÒ¿mÍÍ\u0081L\f\f\u0018\u0014\u0013\u0013&5ììÃ/__¾á\u0097\u00975¢DD\u0088Ì\u0017\u0017.9ÄÄ\u0093W§§Uò~~ü\u0082==zGddÈ¬]]ºç\u0019\u00192+ssæ\u0095``À \u0081\u0081\u0019\u0098OO\u009eÑÜÜ£\u007f\"\"Df**T~\u0090\u0090;«\u0088\u0088\u000b\u0083FF\u008cÊîîÇ)¸¸kÓ\u0014\u0014(<ÞÞ§y^^¼â\u000b\u000b\u0016\u001dÛÛ\u00advààÛ;22dV::tN\n\n\u0014\u001eII\u0092Û\u0006\u0006\f\n$$Hl\\\\¸äÂÂ\u009f]ÓÓ½n¬¬CïbbÄ¦\u0091\u00919¨\u0095\u00951¤ääÓ7yyò\u008bççÕ2ÈÈ\u008bC77nYmmÚ·\u008d\u008d\u0001\u008cÕÕ±dNN\u009cÒ©©IàllØ´VV¬úôôó\u0007êêÏ%eeÊ¯zzô\u008e®®Gé\b\b\u0010\u0018ººoÕxxð\u0088%%Jo..\\r\u001c\u001c8$¦¦Wñ´´sÇÆÆ\u0097QèèË#ÝÝ¡|ttè\u009c\u001f\u001f>!KK\u0096Ý½½aÜ\u008b\u008b\r\u0086\u008a\u008a\u000f\u0085ppà\u0090>>|BµµqÄffÌªHH\u0090Ø\u0003\u0003\u0006\u0005öö÷\u0001\u000e\u000e\u001c\u0012aaÂ£55j_WW®ù¹¹iÐ\u0086\u0086\u0017\u0091ÁÁ\u0099X\u001d\u001d:'\u009e\u009e'¹ááÙ8øøë\u0013\u0098\u0098+³\u0011\u0011\"3iiÒ»ÙÙ©p\u008e\u008e\u0007\u0089\u0094\u00943§\u009b\u009b-¶\u001e\u001e<\"\u0087\u0087\u0015\u0092ééÉ ÎÎ\u0087IUUªÿ((Pxßß¥z\u008c\u008c\u0003\u008f¡¡Yø\u0089\u0089\t\u0080\r\r\u001a\u0017¿¿eÚææ×1BB\u0084ÆhhÐ¸AA\u0082Ã\u0099\u0099)°--Zw\u000f\u000f\u001e\u0011°°{ËTT¨ü»»mÖ\u0016\u0016,:cÆ¥c|ø\u0084|wî\u0099w{ö\u008d{òÿ\ròkÖ½koÞ±oÅ\u0091TÅ0`P0\u0001\u0002\u0003\u0001gÎ©g+V}+þç\u0019þ×µb×«Mæ«vì\u009avÊ\u008fEÊ\u0082\u001f\u009d\u0082É\u0089@É}ú\u0087}úï\u0015úY²ëYG\u008eÉGðû\u000bð\u00adAì\u00adÔ³gÔ¢_ý¢¯Eê¯\u009c#¿\u009c¤S÷¤rä\u0096rÀ\u009b[À·uÂ·ýá\u001cý\u0093=®\u0093&Lj&6lZ6?~A?÷õ\u0002÷Ì\u0083OÌ4h\\4¥Qô¥åÑ4åñù\bñqâ\u0093qØ«sØ1bS1\u0015*?\u0015\u0004\b\f\u0004Ç\u0095RÇ#Fe#Ã\u009d^Ã\u00180(\u0018\u00967¡\u0096\u0005\n\u000f\u0005\u009a/µ\u009a\u0007\u000e\t\u0007\u0012$6\u0012\u0080\u001b\u009b\u0080âß=âëÍ&ë'Ni'²\u007fÍ²uê\u009fu\t\u0012\u001b\t\u0083\u001d\u009e\u0083,Xt,\u001a4.\u001a\u001b6-\u001bnÜ²nZ´îZ [û R¤öR;vM;Ö·aÖ³}Î³)R{)ãÝ>ã/^q/\u0084\u0013\u0097\u0084S¦õSÑ¹hÑ\u0000\u0000\u0000\u0000íÁ,í @` üã\u001fü±yÈ±[¶í[jÔ¾jË\u008dFË¾gÙ¾9rK9J\u0094ÞJL\u0098ÔLX°èXÏ\u0085JÏÐ»kÐïÅ*ïªOåªûí\u0016ûC\u0086ÅCM\u009a×M3fU3\u0085\u0011\u0094\u0085E\u008aÏEùé\u0010ù\u0002\u0004\u0006\u0002\u007fþ\u0081\u007fP ðP<xD<\u009f%º\u009f¨Kã¨Q¢óQ£]þ£@\u0080À@\u008f\u0005\u008a\u008f\u0092?\u00ad\u0092\u009d!¼\u009d8pH8õñ\u0004õ¼cß¼¶wÁ¶Ú¯uÚ!Bc!\u0010 0\u0010ÿå\u001aÿóý\u000eóÒ¿mÒÍ\u0081LÍ\f\u0018\u0014\f\u0013&5\u0013ìÃ/ì_¾á_\u00975¢\u0097D\u0088ÌD\u0017.9\u0017Ä\u0093WÄ§Uò§~ü\u0082~=zG=dÈ¬d]ºç]\u00192+\u0019sæ\u0095s`À `\u0081\u0019\u0098\u0081O\u009eÑOÜ£\u007fÜ\"Df\"*T~*\u0090;«\u0090\u0088\u000b\u0083\u0088F\u008cÊFîÇ)î¸kÓ¸\u0014(<\u0014Þ§yÞ^¼â^\u000b\u0016\u001d\u000bÛ\u00advÛàÛ;à2dV2:tN:\n\u0014\u001e\nI\u0092ÛI\u0006\f\n\u0006$Hl$\\¸ä\\Â\u009f]ÂÓ½nÓ¬Cï¬bÄ¦b\u00919¨\u0091\u00951¤\u0095äÓ7äyò\u008byçÕ2çÈ\u008bCÈ7nY7mÚ·m\u008d\u0001\u008c\u008dÕ±dÕN\u009cÒN©Ià©lØ´lV¬úVôó\u0007ôêÏ%êeÊ¯ezô\u008ez®Gé®\b\u0010\u0018\bºoÕºxð\u0088x%Jo%.\\r.\u001c8$\u001c¦Wñ¦´sÇ´Æ\u0097QÆèË#èÝ¡|Ýtè\u009ct\u001f>!\u001fK\u0096ÝK½aÜ½\u008b\r\u0086\u008b\u008a\u000f\u0085\u008apà\u0090p>|B>µqÄµfÌªfH\u0090ØH\u0003\u0006\u0005\u0003ö÷\u0001ö\u000e\u001c\u0012\u000eaÂ£a5j_5W®ùW¹iÐ¹\u0086\u0017\u0091\u0086Á\u0099XÁ\u001d:'\u001d\u009e'¹\u009eáÙ8áøë\u0013ø\u0098+³\u0098\u0011\"3\u0011iÒ»iÙ©pÙ\u008e\u0007\u0089\u008e\u00943§\u0094\u009b-¶\u009b\u001e<\"\u001e\u0087\u0015\u0092\u0087éÉ éÎ\u0087IÎUªÿU(Px(ß¥zß\u008c\u0003\u008f\u008c¡Yø¡\u0089\t\u0080\u0089\r\u001a\u0017\r¿eÚ¿æ×1æB\u0084ÆBhÐ¸hA\u0082ÃA\u0099)°\u0099-Zw-\u000f\u001e\u0011\u000f°{Ë°T¨üT»mÖ»\u0016,:\u0016Æ¥ccø\u0084||î\u0099wwö\u008d{{ÿ\ròòÖ½kkÞ±oo\u0091TÅÅ`P00\u0002\u0003\u0001\u0001Î©ggV}++ç\u0019þþµb××Mæ««ì\u009avv\u008fEÊÊ\u001f\u009d\u0082\u0082\u0089@ÉÉú\u0087}}ï\u0015úú²ëYY\u008eÉGGû\u000bððAì\u00ad\u00ad³gÔÔ_ý¢¢Eê¯¯#¿\u009c\u009cS÷¤¤ä\u0096rr\u009b[ÀÀuÂ··á\u001cýý=®\u0093\u0093Lj&&lZ66~A??õ\u0002÷÷\u0083OÌÌh\\44Qô¥¥Ñ4ååù\bññâ\u0093qq«sØØbS11*?\u0015\u0015\b\f\u0004\u0004\u0095RÇÇFe##\u009d^ÃÃ0(\u0018\u00187¡\u0096\u0096\n\u000f\u0005\u0005/µ\u009a\u009a\u000e\t\u0007\u0007$6\u0012\u0012\u001b\u009b\u0080\u0080ß=ââÍ&ëëNi''\u007fÍ²²ê\u009fuu\u0012\u001b\t\t\u001d\u009e\u0083\u0083Xt,,4.\u001a\u001a6-\u001b\u001bÜ²nn´îZZ[û  ¤öRRvM;;·aÖÖ}Î³³R{))Ý>ãã^q//\u0013\u0097\u0084\u0084¦õSS¹hÑÑ\u0000\u0000\u0000\u0000Á,íí@`  ã\u001füüyÈ±±¶í[[Ô¾jj\u008dFËËgÙ¾¾rK99\u0094ÞJJ\u0098ÔLL°èXX\u0085JÏÏ»kÐÐÅ*ïïOåªªí\u0016ûû\u0086ÅCC\u009a×MMfU33\u0011\u0094\u0085\u0085\u008aÏEEé\u0010ùù\u0004\u0006\u0002\u0002þ\u0081\u007f\u007f ðPPxD<<%º\u009f\u009fKã¨¨¢óQQ]þ££\u0080À@@\u0005\u008a\u008f\u008f?\u00ad\u0092\u0092!¼\u009d\u009dpH88ñ\u0004õõcß¼¼wÁ¶¶¯uÚÚBc!! 0\u0010\u0010å\u001aÿÿý\u000eóó¿mÒÒ\u0081LÍÍ\u0018\u0014\f\f&5\u0013\u0013Ã/ìì¾á__5¢\u0097\u0097\u0088ÌDD.9\u0017\u0017\u0093WÄÄUò§§ü\u0082~~zG==È¬ddºç]]2+\u0019\u0019æ\u0095ssÀ ``\u0019\u0098\u0081\u0081\u009eÑOO£\u007fÜÜDf\"\"T~**;«\u0090\u0090\u000b\u0083\u0088\u0088\u008cÊFFÇ)îîkÓ¸¸(<\u0014\u0014§yÞÞ¼â^^\u0016\u001d\u000b\u000b\u00advÛÛÛ;ààdV22tN::\u0014\u001e\n\n\u0092ÛII\f\n\u0006\u0006Hl$$¸ä\\\\\u009f]ÂÂ½nÓÓCï¬¬Ä¦bb9¨\u0091\u00911¤\u0095\u0095Ó7ääò\u008byyÕ2çç\u008bCÈÈnY77Ú·mm\u0001\u008c\u008d\u008d±dÕÕ\u009cÒNNIà©©Ø´ll¬úVVó\u0007ôôÏ%êêÊ¯eeô\u008ezzGé®®\u0010\u0018\b\boÕººð\u0088xxJo%%\\r..8$\u001c\u001cWñ¦¦sÇ´´\u0097QÆÆË#èè¡|ÝÝè\u009ctt>!\u001f\u001f\u0096ÝKKaÜ½½\r\u0086\u008b\u008b\u000f\u0085\u008a\u008aà\u0090pp|B>>qÄµµÌªff\u0090ØHH\u0006\u0005\u0003\u0003÷\u0001öö\u001c\u0012\u000e\u000eÂ£aaj_55®ùWWiÐ¹¹\u0017\u0091\u0086\u0086\u0099XÁÁ:'\u001d\u001d'¹\u009e\u009eÙ8ááë\u0013øø+³\u0098\u0098\"3\u0011\u0011Ò»ii©pÙÙ\u0007\u0089\u008e\u008e3§\u0094\u0094-¶\u009b\u009b<\"\u001e\u001e\u0015\u0092\u0087\u0087É éé\u0087IÎÎªÿUUPx((¥zßß\u0003\u008f\u008c\u008cYø¡¡\t\u0080\u0089\u0089\u001a\u0017\r\reÚ¿¿×1ææ\u0084ÆBBÐ¸hh\u0082ÃAA)°\u0099\u0099Zw--\u001e\u0011\u000f\u000f{Ë°°¨üTTmÖ»»,:\u0016\u0016".getBytes("ISO-8859-1")).asIntBuffer().get(iArr2, 0, 1024);
        java.lang.System.arraycopy(iArr2, 0, iArr, 0, 1024);
        getHighSpeedVideoFpsRangesFor = iArr;
        int[] iArr3 = new int[1024];
        int[] iArr4 = new int[1024];
        java.nio.ByteBuffer.wrap("P§ôQSeA~Ã¤\u0017\u001a\u0096^':Ëk«;ñE\u009d\u001f«Xú¬\u0093\u0003ãKUú0 ömv\u00ad\u0091vÌ\u0088%L\u0002õü×åO×Ë*Å\u0080D5&\u008f£bµIZ±Þg\u001bº%\u0098\u000eêEáÀþ]\u0002u/Ã\u0012ðL\u0081£\u0097F\u008dÆùÓkç_\u008f\u0003\u0095\u009c\u0092\u0015ëzm¿ÚYR\u0095-\u0083¾ÔÓ!tX)iàIDÈÉ\u008ej\u0089Âuxy\u008eôk>X\u0099Ýq¹'¶Oá¾\u0017\u00ad\u0088ðf¬ É´:Î}\u0018Jßc\u00821\u001aå`3Q\u0097E\u007fSbàwd±\u0084®k»\u001c \u0081þ\u0094+\bùXhHp\u0019ýE\u008f\u0087lÞ\u0094·ø{R#Ós«â\u0002KrW\u008f\u001fã*«Uf\u0007(ë²\u0003Âµ/\u009a{Å\u0086¥\b7Óò\u0087(0²¥¿#ºj\u0003\u0002\\\u0082\u0016í+\u001cÏ\u008a\u0092´y§ðò\u0007ó¡âiNÍôÚeÕ¾\u0005\u0006\u001fb4Ñ\u008aþ¦Ä\u009dS.4 Uó¢2á\u008a\u0005uëö¤9ì\u0083\u000bªï`@\u0006\u009fq^Q\u0010n½ù\u008a!>=\u0006Ý\u0096®\u0005>ÝF½æMµ\u008dT\u0091\u0005]ÄqoÔ\u0006\u0004ÿ\u0015P`$û\u0098\u0019\u0097é½ÖÌC@\u0089w\u009eÙg½Bè°\u0088\u008b\u0089\u00078[\u0019çÛîÈyG\n|¡é\u000fB|É\u001e\u0084ø\u0000\u0000\u0000\u0000\u0083\u0086\u0080\tHí+2¬p\u0011\u001eNrZlûÿ\u000eýV8\u0085\u000f\u001eÕ®='9-6dÙ\u000f\n!¦\\hÑT[\u009b:.6$±g\n\f\u000fçW\u0093Ò\u0096î´\u009e\u0091\u009b\u001bOÅÀ\u0080¢ ÜaiKwZ\u0016\u001a\u0012\u001c\nº\u0093âå* ÀCà\"<\u001d\u0017\u001b\u0012\u000b\r\t\u000e\u00adÇ\u008bò¹¨¶-È©\u001e\u0014\u0085\u0019ñWL\u0007u¯»Ý\u0099îý`\u007f£\u009f&\u0001÷¼õr\\Å;fD4~û[v)C\u008bÜÆ#Ëhüí¶cñä¸ÊÜ1×\u0010\u0085cB@\"\u0097\u0013 \u0011Æ\u0084}$J\u0085ø=»Ò\u00112ù®m¡)ÇK/\u009e\u001dó0²ÜìR\u0086\rÐãÁwl\u0016³+\u0099¹p©úH\u0094\u0011\"déGÄ\u008cü¨\u001a?ð Ø,}Vï\u00903\"ÇNI\u0087ÁÑ8Ùþ¢Ê\u008c6\u000bÔ\u0098Ï\u0081õ¦(Þz¥&\u008e·Ú¤¿\u00ad?ä\u009d:,\r\u0092xP\u009bÌ_jbF~TÂ\u0013\u008döè¸Ø\u0090^÷9.õ¯Ã\u0082¾\u0080]\u009f|\u0093Ði©-Õo³\u0012%Ï;\u0099¬È§}\u0018\u0010nc\u009cè{»;Û\tx&Íô\u0018Yn\u0001·\u009aì¨\u009aO\u0083en\u0095æ~æÿª\bÏ¼!æè\u0015ïÙ\u009bçºÎ6oJÔ\t\u009fêÖ|°)¯²¤11#?*0\u0094¥ÆÀf¢57¼Nt¦Ê\u0082ü°Ð\u0090à\u0015Ø§3J\u0098\u0004ñ÷ÚìA\u000ePÍ\u007f/ö\u0091\u0017\u008dÖMvM°ïCTMªÌß\u0004\u0096äãµÑ\u009e\u001b\u0088jL¸\u001f,Á\u007fQeF\u0004ê^\u009d]5\u008c\u0001st\u0087ú.A\u000bûZ\u001dg³RÒÛ\u00923V\u0010é\u0013GÖm\u008ca×\u009az\f¡7\u008e\u0014øY\u0089<\u0013ëî'©Î5Éa·íå\u001cá<±GzYßÒ\u009c?sòUyÎ\u0014\u0018¿7ÇsêÍ÷S[ªý_\u0014o=ß\u0086ÛDx\u0081ó¯Ê>Äh¹,4$8_@£ÂrÃ\u001d\u0016\f%â¼\u008bI<(A\u0095\rÿq\u0001¨9Þ³\f\b\u009cä´Ø\u0090ÁVda\u0084Ë{p¶2Õt\\lHBW¸Ð§ôQPeA~S¤\u0017\u001aÃ^':\u0096k«;ËE\u009d\u001fñXú¬«\u0003ãK\u0093ú0 Umv\u00adövÌ\u0088\u0091L\u0002õ%×åOüË*Å×D5&\u0080£bµ\u008fZ±ÞI\u001bº%g\u000eêE\u0098Àþ]áu/Ã\u0002ðL\u0081\u0012\u0097F\u008d£ùÓkÆ_\u008f\u0003ç\u009c\u0092\u0015\u0095zm¿ëYR\u0095Ú\u0083¾Ô-!tXÓiàI)ÈÉ\u008eD\u0089Âujy\u008eôx>X\u0099kq¹'ÝOá¾¶\u00ad\u0088ð\u0017¬ Éf:Î}´Jßc\u00181\u001aå\u00823Q\u0097`\u007fSbEwd±à®k»\u0084 \u0081þ\u001c+\bù\u0094hHpXýE\u008f\u0019lÞ\u0094\u0087ø{R·Ós«#\u0002Krâ\u008f\u001fãW«Uf*(ë²\u0007Âµ/\u0003{Å\u0086\u009a\b7Ó¥\u0087(0ò¥¿#²j\u0003\u0002º\u0082\u0016í\\\u001cÏ\u008a+´y§\u0092ò\u0007óðâiN¡ôÚeÍ¾\u0005\u0006Õb4Ñ\u001fþ¦Ä\u008aS.4\u009dUó¢ á\u008a\u00052ëö¤uì\u0083\u000b9ï`@ª\u009fq^\u0006\u0010n½Q\u008a!>ù\u0006Ý\u0096=\u0005>Ý®½æMF\u008dT\u0091µ]Äq\u0005Ô\u0006\u0004o\u0015P`ÿû\u0098\u0019$é½Ö\u0097C@\u0089Ì\u009eÙgwBè°½\u008b\u0089\u0007\u0088[\u0019ç8îÈyÛ\n|¡G\u000fB|é\u001e\u0084øÉ\u0000\u0000\u0000\u0000\u0086\u0080\t\u0083í+2Hp\u0011\u001e¬rZlNÿ\u000eýû8\u0085\u000fVÕ®=\u001e9-6'Ù\u000f\nd¦\\h!T[\u009bÑ.6$:g\n\f±çW\u0093\u000f\u0096î´Ò\u0091\u009b\u001b\u009eÅÀ\u0080O Üa¢KwZi\u001a\u0012\u001c\u0016º\u0093â\n* Àåà\"<C\u0017\u001b\u0012\u001d\r\t\u000e\u000bÇ\u008bò\u00ad¨¶-¹©\u001e\u0014È\u0019ñW\u0085\u0007u¯LÝ\u0099î»`\u007f£ý&\u0001÷\u009fõr\\¼;fDÅ~û[4)C\u008bvÆ#ËÜüí¶hñä¸cÜ1×Ê\u0085cB\u0010\"\u0097\u0013@\u0011Æ\u0084 $J\u0085}=»Òø2ù®\u0011¡)Çm/\u009e\u001dK0²ÜóR\u0086\rìãÁwÐ\u0016³+l¹p©\u0099H\u0094\u0011údéG\"\u008cü¨Ä?ð \u001a,}VØ\u00903\"ïNI\u0087ÇÑ8ÙÁ¢Ê\u008cþ\u000bÔ\u00986\u0081õ¦ÏÞz¥(\u008e·Ú&¿\u00ad?¤\u009d:,ä\u0092xP\rÌ_j\u009bF~Tb\u0013\u008döÂ¸Ø\u0090è÷9.^¯Ã\u0082õ\u0080]\u009f¾\u0093Ði|-Õo©\u0012%Ï³\u0099¬È;}\u0018\u0010§c\u009cèn»;Û{x&Í\t\u0018Ynô·\u009aì\u0001\u009aO\u0083¨n\u0095æeæÿª~Ï¼!\bè\u0015ïæ\u009bçºÙ6oJÎ\t\u009fêÔ|°)Ö²¤1¯#?*1\u0094¥Æ0f¢5À¼Nt7Ê\u0082ü¦Ð\u0090à°Ø§3\u0015\u0098\u0004ñJÚìA÷PÍ\u007f\u000eö\u0091\u0017/ÖMv\u008d°ïCMMªÌT\u0004\u0096äßµÑ\u009eã\u0088jL\u001b\u001f,Á¸QeF\u007fê^\u009d\u00045\u008c\u0001]t\u0087úsA\u000bû.\u001dg³ZÒÛ\u0092RV\u0010é3GÖm\u0013a×\u009a\u008c\f¡7z\u0014øY\u008e<\u0013ë\u0089'©ÎîÉa·5å\u001cáí±Gz<ßÒ\u009cYsòU?Î\u0014\u0018y7Çs¿Í÷Sêªý_[o=ß\u0014ÛDx\u0086ó¯Ê\u0081Äh¹>4$8,@£Â_Ã\u001d\u0016r%â¼\fI<(\u008b\u0095\rÿA\u0001¨9q³\f\bÞä´Ø\u009cÁVd\u0090\u0084Ë{a¶2Õp\\lHtW¸ÐBôQP§A~Se\u0017\u001aÃ¤':\u0096^«;Ëk\u009d\u001fñEú¬«XãK\u0093\u00030 Uúv\u00adömÌ\u0088\u0091v\u0002õ%LåOü×*Å×Ë5&\u0080Dbµ\u008f£±ÞIZº%g\u001bêE\u0098\u000eþ]áÀ/Ã\u0002uL\u0081\u0012ðF\u008d£\u0097ÓkÆù\u008f\u0003ç_\u0092\u0015\u0095\u009cm¿ëzR\u0095ÚY¾Ô-\u0083tXÓ!àI)iÉ\u008eDÈÂuj\u0089\u008eôxyX\u0099k>¹'Ýqá¾¶O\u0088ð\u0017\u00ad Éf¬Î}´:ßc\u0018J\u001aå\u00821Q\u0097`3SbE\u007fd±àwk»\u0084®\u0081þ\u001c \bù\u0094+HpXhE\u008f\u0019ýÞ\u0094\u0087l{R·øs«#ÓKrâ\u0002\u001fãW\u008fUf*«ë²\u0007(µ/\u0003ÂÅ\u0086\u009a{7Ó¥\b(0ò\u0087¿#²¥\u0003\u0002ºj\u0016í\\\u0082Ï\u008a+\u001cy§\u0092´\u0007óðòiN¡âÚeÍô\u0005\u0006Õ¾4Ñ\u001fb¦Ä\u008aþ.4\u009dSó¢ U\u008a\u00052áö¤uë\u0083\u000b9ì`@ªïq^\u0006\u009fn½Q\u0010!>ù\u008aÝ\u0096=\u0006>Ý®\u0005æMF½T\u0091µ\u008dÄq\u0005]\u0006\u0004oÔP`ÿ\u0015\u0098\u0019$û½Ö\u0097é@\u0089ÌCÙgw\u009eè°½B\u0089\u0007\u0088\u008b\u0019ç8[ÈyÛî|¡G\nB|é\u000f\u0084øÉ\u001e\u0000\u0000\u0000\u0000\u0080\t\u0083\u0086+2Hí\u0011\u001e¬pZlNr\u000eýûÿ\u0085\u000fV8®=\u001eÕ-6'9\u000f\ndÙ\\h!¦[\u009bÑT6$:.\n\f±gW\u0093\u000fçî´Ò\u0096\u009b\u001b\u009e\u0091À\u0080OÅÜa¢ wZiK\u0012\u001c\u0016\u001a\u0093â\nº Àå*\"<Cà\u001b\u0012\u001d\u0017\t\u000e\u000b\r\u008bò\u00adÇ¶-¹¨\u001e\u0014È©ñW\u0085\u0019u¯L\u0007\u0099î»Ý\u007f£ý`\u0001÷\u009f&r\\¼õfDÅ;û[4~C\u008bv)#ËÜÆí¶hüä¸cñ1×ÊÜcB\u0010\u0085\u0097\u0013@\"Æ\u0084 \u0011J\u0085}$»Òø=ù®\u00112)Çm¡\u009e\u001dK/²Üó0\u0086\rìRÁwÐã³+l\u0016p©\u0099¹\u0094\u0011úHéG\"dü¨Ä\u008cð \u001a?}VØ,3\"ï\u0090I\u0087ÇN8ÙÁÑÊ\u008cþ¢Ô\u00986\u000bõ¦Ï\u0081z¥(Þ·Ú&\u008e\u00ad?¤¿:,ä\u009dxP\r\u0092_j\u009bÌ~TbF\u008döÂ\u0013Ø\u0090è¸9.^÷Ã\u0082õ¯]\u009f¾\u0080Ði|\u0093Õo©-%Ï³\u0012¬È;\u0099\u0018\u0010§}\u009cènc;Û{»&Í\txYnô\u0018\u009aì\u0001·O\u0083¨\u009a\u0095æenÿª~æ¼!\bÏ\u0015ïæèçºÙ\u009boJÎ6\u009fêÔ\t°)Ö|¤1¯²?*1#¥Æ0\u0094¢5ÀfNt7¼\u0082ü¦Ê\u0090à°Ð§3\u0015Ø\u0004ñJ\u0098ìA÷ÚÍ\u007f\u000eP\u0091\u0017/öMv\u008dÖïCM°ªÌTM\u0096äß\u0004Ñ\u009eãµjL\u001b\u0088,Á¸\u001feF\u007fQ^\u009d\u0004ê\u008c\u0001]5\u0087úst\u000bû.Ag³Z\u001dÛ\u0092RÒ\u0010é3VÖm\u0013G×\u009a\u008ca¡7z\føY\u008e\u0014\u0013ë\u0089<©Îî'a·5É\u001cáíåGz<±Ò\u009cYßòU?s\u0014\u0018yÎÇs¿7÷SêÍý_[ª=ß\u0014oDx\u0086Û¯Ê\u0081óh¹>Ä$8,4£Â_@\u001d\u0016rÃâ¼\f%<(\u008bI\rÿA\u0095¨9q\u0001\f\bÞ³´Ø\u009cäVd\u0090ÁË{a\u00842Õp¶lHt\\¸ÐBWQP§ô~SeA\u001aÃ¤\u0017:\u0096^';Ëk«\u001fñE\u009d¬«XúK\u0093\u0003ã Uú0\u00adömv\u0088\u0091vÌõ%L\u0002Oü×åÅ×Ë*&\u0080D5µ\u008f£bÞIZ±%g\u001bºE\u0098\u000eê]áÀþÃ\u0002u/\u0081\u0012ðL\u008d£\u0097FkÆùÓ\u0003ç_\u008f\u0015\u0095\u009c\u0092¿ëzm\u0095ÚYRÔ-\u0083¾XÓ!tI)ià\u008eDÈÉuj\u0089Âôxy\u008e\u0099k>X'Ýq¹¾¶Oáð\u0017\u00ad\u0088Éf¬ }´:Îc\u0018Jßå\u00821\u001a\u0097`3QbE\u007fS±àwd»\u0084®kþ\u001c \u0081ù\u0094+\bpXhH\u008f\u0019ýE\u0094\u0087lÞR·ø{«#Ósrâ\u0002KãW\u008f\u001ff*«U²\u0007(ë/\u0003Âµ\u0086\u009a{ÅÓ¥\b70ò\u0087(#²¥¿\u0002ºj\u0003í\\\u0082\u0016\u008a+\u001cÏ§\u0092´yóðò\u0007N¡âieÍôÚ\u0006Õ¾\u0005Ñ\u001fb4Ä\u008aþ¦4\u009dS.¢ Uó\u00052á\u008a¤uëö\u000b9ì\u0083@ªï`^\u0006\u009fq½Q\u0010n>ù\u008a!\u0096=\u0006ÝÝ®\u0005>MF½æ\u0091µ\u008dTq\u0005]Ä\u0004oÔ\u0006`ÿ\u0015P\u0019$û\u0098Ö\u0097é½\u0089ÌC@gw\u009eÙ°½Bè\u0007\u0088\u008b\u0089ç8[\u0019yÛîÈ¡G\n||é\u000fBøÉ\u001e\u0084\u0000\u0000\u0000\u0000\t\u0083\u0086\u00802Hí+\u001e¬p\u0011lNrZýûÿ\u000e\u000fV8\u0085=\u001eÕ®6'9-\ndÙ\u000fh!¦\\\u009bÑT[$:.6\f±g\n\u0093\u000fçW´Ò\u0096î\u001b\u009e\u0091\u009b\u0080OÅÀa¢ ÜZiKw\u001c\u0016\u001a\u0012â\nº\u0093Àå* <Cà\"\u0012\u001d\u0017\u001b\u000e\u000b\r\tò\u00adÇ\u008b-¹¨¶\u0014È©\u001eW\u0085\u0019ñ¯L\u0007uî»Ý\u0099£ý`\u007f÷\u009f&\u0001\\¼õrDÅ;f[4~û\u008bv)CËÜÆ#¶hüí¸cñä×ÊÜ1B\u0010\u0085c\u0013@\"\u0097\u0084 \u0011Æ\u0085}$JÒø=»®\u00112ùÇm¡)\u001dK/\u009eÜó0²\rìR\u0086wÐãÁ+l\u0016³©\u0099¹p\u0011úH\u0094G\"dé¨Ä\u008cü \u001a?ðVØ,}\"ï\u00903\u0087ÇNIÙÁÑ8\u008cþ¢Ê\u00986\u000bÔ¦Ï\u0081õ¥(ÞzÚ&\u008e·?¤¿\u00ad,ä\u009d:P\r\u0092xj\u009bÌ_TbF~öÂ\u0013\u008d\u0090è¸Ø.^÷9\u0082õ¯Ã\u009f¾\u0080]i|\u0093Ðo©-ÕÏ³\u0012%È;\u0099¬\u0010§}\u0018ènc\u009cÛ{»;Í\tx&nô\u0018Yì\u0001·\u009a\u0083¨\u009aOæen\u0095ª~æÿ!\bÏ¼ïæè\u0015ºÙ\u009bçJÎ6oêÔ\t\u009f)Ö|°1¯²¤*1#?Æ0\u0094¥5Àf¢t7¼Nü¦Ê\u0082à°Ð\u00903\u0015Ø§ñJ\u0098\u0004A÷Úì\u007f\u000ePÍ\u0017/ö\u0091v\u008dÖMCM°ïÌTMªäß\u0004\u0096\u009eãµÑL\u001b\u0088jÁ¸\u001f,F\u007fQe\u009d\u0004ê^\u0001]5\u008cúst\u0087û.A\u000b³Z\u001dg\u0092RÒÛé3V\u0010m\u0013GÖ\u009a\u008ca×7z\f¡Y\u008e\u0014øë\u0089<\u0013Îî'©·5Éaáíå\u001cz<±G\u009cYßÒU?sò\u0018yÎ\u0014s¿7ÇSêÍ÷_[ªýß\u0014o=x\u0086ÛDÊ\u0081ó¯¹>Äh8,4$Â_@£\u0016rÃ\u001d¼\f%â(\u008bI<ÿA\u0095\r9q\u0001¨\bÞ³\fØ\u009cä´d\u0090ÁV{a\u0084ËÕp¶2Ht\\lÐBW¸".getBytes("ISO-8859-1")).asIntBuffer().get(iArr4, 0, 1024);
        java.lang.System.arraycopy(iArr4, 0, iArr3, 0, 1024);
        getHighResolutionOutputSizeshNQ4ISI = iArr3;
    }
}
