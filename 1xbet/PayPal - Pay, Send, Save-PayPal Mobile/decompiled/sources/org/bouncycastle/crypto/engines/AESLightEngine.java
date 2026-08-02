package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class AESLightEngine implements org.bouncycastle.crypto.BlockCipher {
    private int[][] Camera2StreamConfigurationMap = null;
    private int getHighSpeedVideoSizes;
    private boolean getOutputMinFrameDuration;
    private static final byte[] getHighSpeedVideoFpsRangesFor = {99, 124, com.visa.cbp.getEncExpo.IResultReceiver, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, com.visa.cbp.getEncExpo.onUnminimized, -83, -44, -94, -81, -100, -92, 114, com.visa.cbp.getEncExpo.startTransaction, -73, -3, -109, 38, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 63, -9, -52, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -91, -27, -15, 113, -40, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.NAK, 4, -57, 35, -61, com.google.common.base.Ascii.CAN, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, 110, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, com.visa.cbp.getEncExpo.kernelVersion, -48, -17, -86, -5, 67, 77, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, 16, -1, -13, -46, -51, com.google.common.base.Ascii.FF, 19, -20, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -105, 68, com.google.common.base.Ascii.ETB, -60, -89, 126, kotlin.io.encoding.Base64.padSymbol, 100, 93, com.google.common.base.Ascii.EM, 115, com.visa.cbp.getEncExpo.IResultReceiver2, -127, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -36, 34, 42, -112, -120, 70, -18, -72, com.google.common.base.Ascii.DC4, -34, 94, com.google.common.base.Ascii.VT, -37, -32, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, com.google.common.base.Ascii.FS, -90, -76, -58, -24, -35, 116, com.google.common.base.Ascii.US, 75, -67, -117, -118, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 62, -75, 102, 72, 3, -10, 14, 97, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 87, -71, -122, -63, com.google.common.base.Ascii.GS, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, com.google.common.base.Ascii.RS, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -26, 66, 104, 65, com.visa.cbp.getEncExpo.registerForActivityResult, 45, com.google.common.base.Ascii.SI, -80, 84, -69, com.google.common.base.Ascii.SYN};
    private static final byte[] getHighSpeedVideoFpsRanges = {82, 9, 106, -43, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -91, 56, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -90, -62, 35, kotlin.io.encoding.Base64.padSymbol, -18, 76, -107, com.google.common.base.Ascii.VT, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, com.google.common.base.Ascii.SYN, -44, -92, 92, -52, 93, 101, -74, -110, 108, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 72, 80, -3, -19, -71, -38, 94, com.google.common.base.Ascii.NAK, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, com.google.common.base.Ascii.RS, -113, -54, 63, com.google.common.base.Ascii.SI, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 103, -36, -22, -105, -14, com.visa.cbp.getEncExpo.kernelVersion, -50, com.visa.cbp.getEncExpo.onUnminimized, -76, -26, 115, -106, -84, 116, 34, -25, -83, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -123, -30, -7, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -24, com.google.common.base.Ascii.FS, 117, -33, 110, 71, -15, com.google.common.base.Ascii.SUB, 113, com.google.common.base.Ascii.GS, 41, -59, -119, 111, -73, 98, 14, -86, com.google.common.base.Ascii.CAN, -66, com.google.common.base.Ascii.ESC, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, com.visa.cbp.getEncExpo.startTransaction, -2, 120, -51, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -12, com.google.common.base.Ascii.US, -35, -88, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -120, 7, -57, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -79, 18, 16, 89, 39, Byte.MIN_VALUE, -20, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, com.visa.cbp.getEncExpo.IResultReceiver2, 81, Byte.MAX_VALUE, -87, com.google.common.base.Ascii.EM, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, com.visa.cbp.getEncExpo.registerForActivityResult, 97, com.google.common.base.Ascii.ETB, 43, 4, 126, -70, com.visa.cbp.getEncExpo.IResultReceiver, -42, 38, -31, 105, com.google.common.base.Ascii.DC4, 99, 85, 33, com.google.common.base.Ascii.FF, 125};
    private static final int[] getHighResolutionOutputSizeshNQ4ISI = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, 171, 77, 154, 47, 94, 188, 99, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, 151, 53, 106, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, 179, 125, 250, 239, 197, 145};

    private static int getHighResolutionOutputSizeshNQ4ISI(int i) {
        int i2 = (i << (-8)) | (i >>> 8);
        int i3 = i ^ i2;
        return (((i3 & 2139062143) << 1) ^ ((((-2139062144) & i3) >>> 7) * 27)) ^ (i2 ^ ((i3 << (-16)) | (i3 >>> 16)));
    }

    private static int getHighSpeedVideoSizes(int i) {
        int i2 = ((i << (-8)) | (i >>> 8)) ^ i;
        int i3 = i ^ (((((-2139062144) & i2) >>> 7) * 27) ^ ((2139062143 & i2) << 1));
        int i4 = (-1061109568) & i3;
        int i5 = i4 ^ (i4 >>> 1);
        int i6 = i2 ^ (((i5 >>> 2) ^ ((1061109567 & i3) << 2)) ^ (i5 >>> 5));
        return i3 ^ (i6 ^ ((i6 << (-16)) | (i6 >>> 16)));
    }

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
        this.getHighSpeedVideoSizes = i + 6;
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
                littleEndianToInt ^= Camera2StreamConfigurationMap((littleEndianToInt4 << (-8)) | (littleEndianToInt4 >>> 8)) ^ getHighResolutionOutputSizeshNQ4ISI[i2 - 1];
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
                int Camera2StreamConfigurationMap = littleEndianToInt5 ^ (Camera2StreamConfigurationMap((littleEndianToInt10 << (-8)) | (littleEndianToInt10 >>> 8)) ^ i3);
                int[] iArr4 = iArr[i4];
                iArr4[2] = Camera2StreamConfigurationMap;
                int i5 = littleEndianToInt6 ^ Camera2StreamConfigurationMap;
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
                littleEndianToInt5 = Camera2StreamConfigurationMap ^ ((i3 << 1) ^ Camera2StreamConfigurationMap((i9 << (-8)) | (i9 >>> 8)));
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
                littleEndianToInt11 ^= Camera2StreamConfigurationMap((littleEndianToInt18 << (-8)) | (littleEndianToInt18 >>> 8)) ^ i12;
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
                littleEndianToInt15 ^= Camera2StreamConfigurationMap(littleEndianToInt14);
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
            for (int i15 = 1; i15 < this.getHighSpeedVideoSizes; i15++) {
                for (int i16 = 0; i16 < 4; i16++) {
                    int[] iArr9 = iArr[i15];
                    iArr9[i16] = getHighSpeedVideoSizes(iArr9[i16]);
                }
            }
        }
        this.Camera2StreamConfigurationMap = iArr;
        this.getOutputMinFrameDuration = z;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        org.bouncycastle.crypto.engines.AESLightEngine aESLightEngine = this;
        int[][] iArr = aESLightEngine.Camera2StreamConfigurationMap;
        if (iArr == null) {
            throw new java.lang.IllegalStateException("AES engine not initialised");
        }
        int i3 = 16;
        if (i > bArr.length - 16) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i2 > bArr2.length - 16) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        char c = 2;
        char c2 = 0;
        if (!aESLightEngine.getOutputMinFrameDuration) {
            int littleEndianToInt = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i);
            int littleEndianToInt2 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 4);
            int littleEndianToInt3 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 8);
            int littleEndianToInt4 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 12);
            int i4 = this.getHighSpeedVideoSizes;
            int[] iArr2 = iArr[i4];
            int i5 = littleEndianToInt ^ iArr2[0];
            int i6 = littleEndianToInt2 ^ iArr2[1];
            int i7 = littleEndianToInt3 ^ iArr2[2];
            int i8 = i4 - 1;
            int i9 = littleEndianToInt4 ^ iArr2[3];
            for (int i10 = 1; i8 > i10; i10 = 1) {
                byte[] bArr3 = getHighSpeedVideoFpsRanges;
                int highSpeedVideoSizes = getHighSpeedVideoSizes((((bArr3[i5 & 255] & 255) ^ ((bArr3[(i9 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i7 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i6 >> 24) & 255] << com.google.common.base.Ascii.CAN)) ^ iArr[i8][0];
                int highSpeedVideoSizes2 = getHighSpeedVideoSizes((((bArr3[i6 & 255] & 255) ^ ((bArr3[(i5 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i9 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i7 >> 24) & 255] << com.google.common.base.Ascii.CAN)) ^ iArr[i8][1];
                int highSpeedVideoSizes3 = getHighSpeedVideoSizes((((bArr3[i7 & 255] & 255) ^ ((bArr3[(i6 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i5 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i9 >> 24) & 255] << com.google.common.base.Ascii.CAN)) ^ iArr[i8][2];
                int highSpeedVideoSizes4 = getHighSpeedVideoSizes((bArr3[(i5 >> 24) & 255] << com.google.common.base.Ascii.CAN) ^ (((bArr3[i9 & 255] & 255) ^ ((bArr3[(i7 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i6 >> 16) & 255] & 255) << 16)));
                int i11 = i8 - 1;
                int i12 = highSpeedVideoSizes4 ^ iArr[i8][3];
                int highSpeedVideoSizes5 = getHighSpeedVideoSizes((((bArr3[highSpeedVideoSizes & 255] & 255) ^ ((bArr3[(i12 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(highSpeedVideoSizes3 >> 16) & 255] & 255) << 16)) ^ (bArr3[(highSpeedVideoSizes2 >> 24) & 255] << com.google.common.base.Ascii.CAN));
                int i13 = iArr[i11][0];
                int highSpeedVideoSizes6 = getHighSpeedVideoSizes((((bArr3[highSpeedVideoSizes2 & 255] & 255) ^ ((bArr3[(highSpeedVideoSizes >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i12 >> 16) & 255] & 255) << 16)) ^ (bArr3[(highSpeedVideoSizes3 >> 24) & 255] << com.google.common.base.Ascii.CAN));
                int i14 = iArr[i11][1];
                int highSpeedVideoSizes7 = getHighSpeedVideoSizes(((((bArr3[(highSpeedVideoSizes2 >> 8) & 255] & 255) << 8) ^ (bArr3[highSpeedVideoSizes3 & 255] & 255)) ^ ((bArr3[(highSpeedVideoSizes >> 16) & 255] & 255) << 16)) ^ (bArr3[(i12 >> 24) & 255] << com.google.common.base.Ascii.CAN));
                int i15 = iArr[i11][2];
                i8 -= 2;
                i9 = iArr[i11][3] ^ getHighSpeedVideoSizes((((bArr3[i12 & 255] & 255) ^ ((bArr3[(highSpeedVideoSizes3 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(highSpeedVideoSizes2 >> 16) & 255] & 255) << 16)) ^ (bArr3[(highSpeedVideoSizes >> 24) & 255] << com.google.common.base.Ascii.CAN));
                i5 = highSpeedVideoSizes5 ^ i13;
                i6 = highSpeedVideoSizes6 ^ i14;
                i7 = highSpeedVideoSizes7 ^ i15;
            }
            byte[] bArr4 = getHighSpeedVideoFpsRanges;
            int highSpeedVideoSizes8 = getHighSpeedVideoSizes((((bArr4[i5 & 255] & 255) ^ ((bArr4[(i9 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i7 >> 16) & 255] & 255) << 16)) ^ (bArr4[(i6 >> 24) & 255] << com.google.common.base.Ascii.CAN)) ^ iArr[i8][0];
            int highSpeedVideoSizes9 = getHighSpeedVideoSizes((((bArr4[i6 & 255] & 255) ^ ((bArr4[(i5 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i9 >> 16) & 255] & 255) << 16)) ^ (bArr4[(i7 >> 24) & 255] << com.google.common.base.Ascii.CAN)) ^ iArr[i8][1];
            int highSpeedVideoSizes10 = getHighSpeedVideoSizes((((bArr4[i7 & 255] & 255) ^ ((bArr4[(i6 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i5 >> 16) & 255] & 255) << 16)) ^ (bArr4[(i9 >> 24) & 255] << com.google.common.base.Ascii.CAN)) ^ iArr[i8][2];
            int highSpeedVideoSizes11 = getHighSpeedVideoSizes((bArr4[(i5 >> 24) & 255] << com.google.common.base.Ascii.CAN) ^ (((bArr4[i9 & 255] & 255) ^ ((bArr4[(i7 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i6 >> 16) & 255] & 255) << 16))) ^ iArr[i8][3];
            byte b = bArr4[highSpeedVideoSizes8 & 255];
            byte b2 = bArr4[(highSpeedVideoSizes11 >> 8) & 255];
            byte b3 = bArr4[(highSpeedVideoSizes10 >> 16) & 255];
            byte b4 = bArr4[(highSpeedVideoSizes9 >> 24) & 255];
            int[] iArr3 = iArr[0];
            int i16 = iArr3[0];
            byte b5 = bArr4[highSpeedVideoSizes9 & 255];
            byte b6 = bArr4[(highSpeedVideoSizes8 >> 8) & 255];
            byte b7 = bArr4[(highSpeedVideoSizes11 >> 16) & 255];
            byte b8 = bArr4[(highSpeedVideoSizes10 >> 24) & 255];
            int i17 = iArr3[1];
            byte b9 = bArr4[highSpeedVideoSizes10 & 255];
            byte b10 = bArr4[(highSpeedVideoSizes9 >> 8) & 255];
            byte b11 = bArr4[(highSpeedVideoSizes8 >> 16) & 255];
            byte b12 = bArr4[(highSpeedVideoSizes11 >> 24) & 255];
            int i18 = iArr3[2];
            byte b13 = bArr4[highSpeedVideoSizes11 & 255];
            byte b14 = bArr4[(highSpeedVideoSizes10 >> 8) & 255];
            byte b15 = bArr4[(highSpeedVideoSizes9 >> 16) & 255];
            byte b16 = bArr4[(highSpeedVideoSizes8 >> 24) & 255];
            int i19 = iArr3[3];
            org.bouncycastle.util.Pack.intToLittleEndian(((((b & 255) ^ ((b2 & 255) << 8)) ^ ((b3 & 255) << 16)) ^ (b4 << com.google.common.base.Ascii.CAN)) ^ i16, bArr2, i2);
            org.bouncycastle.util.Pack.intToLittleEndian(((((b5 & 255) ^ ((b6 & 255) << 8)) ^ ((b7 & 255) << 16)) ^ (b8 << com.google.common.base.Ascii.CAN)) ^ i17, bArr2, i2 + 4);
            org.bouncycastle.util.Pack.intToLittleEndian(((((b9 & 255) ^ ((b10 & 255) << 8)) ^ ((b11 & 255) << 16)) ^ (b12 << com.google.common.base.Ascii.CAN)) ^ i18, bArr2, i2 + 8);
            org.bouncycastle.util.Pack.intToLittleEndian(((((b13 & 255) ^ ((b14 & 255) << 8)) ^ ((b15 & 255) << 16)) ^ (b16 << com.google.common.base.Ascii.CAN)) ^ i19, bArr2, i2 + 12);
            return 16;
        }
        int littleEndianToInt5 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i);
        int littleEndianToInt6 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 4);
        int littleEndianToInt7 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 8);
        int littleEndianToInt8 = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i + 12);
        int[] iArr4 = iArr[0];
        int i20 = littleEndianToInt5 ^ iArr4[0];
        int i21 = littleEndianToInt6 ^ iArr4[1];
        int i22 = littleEndianToInt7 ^ iArr4[2];
        int i23 = littleEndianToInt8 ^ iArr4[3];
        int i24 = 1;
        for (int i25 = 1; i24 < aESLightEngine.getHighSpeedVideoSizes - i25; i25 = 1) {
            byte[] bArr5 = getHighSpeedVideoFpsRangesFor;
            int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(((((bArr5[(i21 >> 8) & 255] & 255) << 8) ^ (bArr5[i20 & 255] & 255)) ^ ((bArr5[(i22 >> 16) & 255] & 255) << i3)) ^ (bArr5[(i23 >> 24) & 255] << com.google.common.base.Ascii.CAN)) ^ iArr[i24][c2];
            int highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(((((bArr5[(i22 >> 8) & 255] & 255) << 8) ^ (bArr5[i21 & 255] & 255)) ^ ((bArr5[(i23 >> 16) & 255] & 255) << i3)) ^ (bArr5[(i20 >> 24) & 255] << com.google.common.base.Ascii.CAN)) ^ iArr[i24][i25];
            int highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(((((bArr5[(i23 >> 8) & 255] & 255) << 8) ^ (bArr5[i22 & 255] & 255)) ^ ((bArr5[(i20 >> 16) & 255] & 255) << i3)) ^ (bArr5[(i21 >> 24) & 255] << com.google.common.base.Ascii.CAN)) ^ iArr[i24][c];
            int highResolutionOutputSizeshNQ4ISI4 = getHighResolutionOutputSizeshNQ4ISI((((bArr5[i23 & 255] & 255) ^ ((bArr5[(i20 >> 8) & 255] & 255) << 8)) ^ ((bArr5[(i21 >> 16) & 255] & 255) << i3)) ^ (bArr5[(i22 >> 24) & 255] << com.google.common.base.Ascii.CAN));
            int i26 = i24 + 1;
            int i27 = highResolutionOutputSizeshNQ4ISI4 ^ iArr[i24][3];
            int highResolutionOutputSizeshNQ4ISI5 = getHighResolutionOutputSizeshNQ4ISI((((bArr5[highResolutionOutputSizeshNQ4ISI & 255] & 255) ^ ((bArr5[(highResolutionOutputSizeshNQ4ISI2 >> 8) & 255] & 255) << 8)) ^ ((bArr5[(highResolutionOutputSizeshNQ4ISI3 >> 16) & 255] & 255) << i3)) ^ (bArr5[(i27 >> 24) & 255] << com.google.common.base.Ascii.CAN));
            int i28 = iArr[i26][0];
            int highResolutionOutputSizeshNQ4ISI6 = getHighResolutionOutputSizeshNQ4ISI(((((bArr5[(highResolutionOutputSizeshNQ4ISI3 >> 8) & 255] & 255) << 8) ^ (bArr5[highResolutionOutputSizeshNQ4ISI2 & 255] & 255)) ^ ((bArr5[(i27 >> 16) & 255] & 255) << i3)) ^ (bArr5[(highResolutionOutputSizeshNQ4ISI >> 24) & 255] << com.google.common.base.Ascii.CAN));
            int i29 = iArr[i26][1];
            int highResolutionOutputSizeshNQ4ISI7 = getHighResolutionOutputSizeshNQ4ISI(((((bArr5[(i27 >> 8) & 255] & 255) << 8) ^ (bArr5[highResolutionOutputSizeshNQ4ISI3 & 255] & 255)) ^ ((bArr5[(highResolutionOutputSizeshNQ4ISI >> 16) & 255] & 255) << 16)) ^ (bArr5[(highResolutionOutputSizeshNQ4ISI2 >> 24) & 255] << com.google.common.base.Ascii.CAN));
            int i30 = iArr[i26][2];
            i24 += 2;
            i23 = getHighResolutionOutputSizeshNQ4ISI((((bArr5[i27 & 255] & 255) ^ ((bArr5[(highResolutionOutputSizeshNQ4ISI >> 8) & 255] & 255) << 8)) ^ ((bArr5[(highResolutionOutputSizeshNQ4ISI2 >> 16) & 255] & 255) << 16)) ^ (bArr5[(highResolutionOutputSizeshNQ4ISI3 >> 24) & 255] << com.google.common.base.Ascii.CAN)) ^ iArr[i26][3];
            i20 = highResolutionOutputSizeshNQ4ISI5 ^ i28;
            i21 = highResolutionOutputSizeshNQ4ISI6 ^ i29;
            i22 = highResolutionOutputSizeshNQ4ISI7 ^ i30;
            aESLightEngine = this;
            i3 = 16;
            c = 2;
            c2 = 0;
        }
        byte[] bArr6 = getHighSpeedVideoFpsRangesFor;
        int highResolutionOutputSizeshNQ4ISI8 = getHighResolutionOutputSizeshNQ4ISI((((bArr6[i20 & 255] & 255) ^ ((bArr6[(i21 >> 8) & 255] & 255) << 8)) ^ ((bArr6[(i22 >> 16) & 255] & 255) << 16)) ^ (bArr6[(i23 >> 24) & 255] << com.google.common.base.Ascii.CAN)) ^ iArr[i24][0];
        int highResolutionOutputSizeshNQ4ISI9 = getHighResolutionOutputSizeshNQ4ISI((((bArr6[i21 & 255] & 255) ^ ((bArr6[(i22 >> 8) & 255] & 255) << 8)) ^ ((bArr6[(i23 >> 16) & 255] & 255) << 16)) ^ (bArr6[(i20 >> 24) & 255] << com.google.common.base.Ascii.CAN)) ^ iArr[i24][1];
        int highResolutionOutputSizeshNQ4ISI10 = getHighResolutionOutputSizeshNQ4ISI((((bArr6[i22 & 255] & 255) ^ ((bArr6[(i23 >> 8) & 255] & 255) << 8)) ^ ((bArr6[(i20 >> 16) & 255] & 255) << 16)) ^ (bArr6[(i21 >> 24) & 255] << com.google.common.base.Ascii.CAN)) ^ iArr[i24][2];
        int highResolutionOutputSizeshNQ4ISI11 = getHighResolutionOutputSizeshNQ4ISI((((bArr6[i23 & 255] & 255) ^ ((bArr6[(i20 >> 8) & 255] & 255) << 8)) ^ ((bArr6[(i21 >> 16) & 255] & 255) << 16)) ^ (bArr6[(i22 >> 24) & 255] << com.google.common.base.Ascii.CAN)) ^ iArr[i24][3];
        byte b17 = bArr6[highResolutionOutputSizeshNQ4ISI8 & 255];
        byte b18 = bArr6[(highResolutionOutputSizeshNQ4ISI9 >> 8) & 255];
        byte b19 = bArr6[(highResolutionOutputSizeshNQ4ISI10 >> 16) & 255];
        byte b20 = bArr6[(highResolutionOutputSizeshNQ4ISI11 >> 24) & 255];
        int[] iArr5 = iArr[i24 + 1];
        int i31 = iArr5[0];
        byte b21 = bArr6[highResolutionOutputSizeshNQ4ISI9 & 255];
        byte b22 = bArr6[(highResolutionOutputSizeshNQ4ISI10 >> 8) & 255];
        byte b23 = bArr6[(highResolutionOutputSizeshNQ4ISI11 >> 16) & 255];
        byte b24 = bArr6[(highResolutionOutputSizeshNQ4ISI8 >> 24) & 255];
        int i32 = iArr5[1];
        byte b25 = bArr6[highResolutionOutputSizeshNQ4ISI10 & 255];
        byte b26 = bArr6[(highResolutionOutputSizeshNQ4ISI11 >> 8) & 255];
        byte b27 = bArr6[(highResolutionOutputSizeshNQ4ISI8 >> 16) & 255];
        byte b28 = bArr6[(highResolutionOutputSizeshNQ4ISI9 >> 24) & 255];
        int i33 = iArr5[2];
        byte b29 = bArr6[highResolutionOutputSizeshNQ4ISI11 & 255];
        byte b30 = bArr6[(highResolutionOutputSizeshNQ4ISI8 >> 8) & 255];
        byte b31 = bArr6[(highResolutionOutputSizeshNQ4ISI9 >> 16) & 255];
        byte b32 = bArr6[(highResolutionOutputSizeshNQ4ISI10 >> 24) & 255];
        int i34 = iArr5[3];
        org.bouncycastle.util.Pack.intToLittleEndian(i31 ^ ((((b17 & 255) ^ ((b18 & 255) << 8)) ^ ((b19 & 255) << 16)) ^ (b20 << com.google.common.base.Ascii.CAN)), bArr2, i2);
        org.bouncycastle.util.Pack.intToLittleEndian(((((b21 & 255) ^ ((b22 & 255) << 8)) ^ ((b23 & 255) << 16)) ^ (b24 << com.google.common.base.Ascii.CAN)) ^ i32, bArr2, i2 + 4);
        org.bouncycastle.util.Pack.intToLittleEndian(i33 ^ ((((b25 & 255) ^ ((b26 & 255) << 8)) ^ ((b27 & 255) << 16)) ^ (b28 << com.google.common.base.Ascii.CAN)), bArr2, i2 + 8);
        org.bouncycastle.util.Pack.intToLittleEndian(((b32 << com.google.common.base.Ascii.CAN) ^ (((b29 & 255) ^ ((b30 & 255) << 8)) ^ ((b31 & 255) << 16))) ^ i34, bArr2, i2 + 12);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return org.jose4j.keys.AesKey.ALGORITHM;
    }

    private static int Camera2StreamConfigurationMap(int i) {
        byte[] bArr = getHighSpeedVideoFpsRangesFor;
        return (bArr[(i >> 24) & 255] << com.google.common.base.Ascii.CAN) | (bArr[i & 255] & 255) | ((bArr[(i >> 8) & 255] & 255) << 8) | ((bArr[(i >> 16) & 255] & 255) << 16);
    }
}
