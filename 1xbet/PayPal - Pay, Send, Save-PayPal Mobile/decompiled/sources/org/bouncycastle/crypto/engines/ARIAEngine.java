package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class ARIAEngine implements org.bouncycastle.crypto.BlockCipher {
    protected static final int BLOCK_SIZE = 16;
    private byte[][] getInputFormats;
    private static final byte[][] Camera2StreamConfigurationMap = {org.bouncycastle.util.encoders.Hex.decodeStrict("517cc1b727220a94fe13abe8fa9a6ee0"), org.bouncycastle.util.encoders.Hex.decodeStrict("6db14acc9e21c820ff28b1d5ef5de2b0"), org.bouncycastle.util.encoders.Hex.decodeStrict("db92371d2126e9700324977504e8c90e")};
    private static final byte[] getHighSpeedVideoFpsRanges = {99, 124, com.visa.cbp.getEncExpo.IResultReceiver, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, com.visa.cbp.getEncExpo.onUnminimized, -83, -44, -94, -81, -100, -92, 114, com.visa.cbp.getEncExpo.startTransaction, -73, -3, -109, 38, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 63, -9, -52, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -91, -27, -15, 113, -40, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.NAK, 4, -57, 35, -61, com.google.common.base.Ascii.CAN, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, 110, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, com.visa.cbp.getEncExpo.kernelVersion, -48, -17, -86, -5, 67, 77, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, 16, -1, -13, -46, -51, com.google.common.base.Ascii.FF, 19, -20, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -105, 68, com.google.common.base.Ascii.ETB, -60, -89, 126, kotlin.io.encoding.Base64.padSymbol, 100, 93, com.google.common.base.Ascii.EM, 115, com.visa.cbp.getEncExpo.IResultReceiver2, -127, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -36, 34, 42, -112, -120, 70, -18, -72, com.google.common.base.Ascii.DC4, -34, 94, com.google.common.base.Ascii.VT, -37, -32, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, com.google.common.base.Ascii.FS, -90, -76, -58, -24, -35, 116, com.google.common.base.Ascii.US, 75, -67, -117, -118, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 62, -75, 102, 72, 3, -10, 14, 97, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 87, -71, -122, -63, com.google.common.base.Ascii.GS, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, com.google.common.base.Ascii.RS, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -26, 66, 104, 65, com.visa.cbp.getEncExpo.registerForActivityResult, 45, com.google.common.base.Ascii.SI, -80, 84, -69, com.google.common.base.Ascii.SYN};
    private static final byte[] getHighSpeedVideoSizes = {-30, 78, 84, -4, -108, -62, 74, -52, 98, 13, 106, 70, 60, 77, -117, -47, 94, -6, 100, -53, -76, -105, -66, 43, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, com.visa.cbp.getEncExpo.IResultReceiver, 46, 3, -45, com.google.common.base.Ascii.EM, 89, -63, com.google.common.base.Ascii.GS, 6, 65, 107, 85, com.visa.cbp.getEncExpo.onUnminimized, com.visa.cbp.getEncExpo.registerForActivityResult, 105, -22, -100, com.google.common.base.Ascii.CAN, -82, 99, -33, -25, -69, 0, 115, 102, -5, -106, 76, -123, -28, 58, 9, 69, -86, com.google.common.base.Ascii.SI, -18, 16, -21, 45, Byte.MAX_VALUE, -12, 41, -84, com.visa.cbp.getEncExpo.kernelVersion, -83, -111, -115, 120, -56, -107, -7, 47, -50, -51, 8, 122, -120, 56, 92, -125, 42, 40, 71, -37, -72, -57, -109, -92, 18, 83, -1, -121, 14, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 33, 88, 72, 1, -114, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 116, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -54, -23, -79, -73, -85, com.google.common.base.Ascii.FF, -41, -60, 86, 66, 38, 7, -104, com.visa.cbp.getEncExpo.IResultReceiver2, -39, -74, -71, 17, 64, -20, 32, -116, -67, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -55, -124, 4, 73, 35, -15, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, com.google.common.base.Ascii.US, 19, -36, -40, com.visa.cbp.getEncExpo.startTransaction, -98, 87, -29, -61, 123, 101, 59, 2, -113, 62, -24, 37, -110, -27, com.google.common.base.Ascii.NAK, -35, -3, com.google.common.base.Ascii.ETB, -87, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -44, -102, 126, -59, 57, 103, -2, 118, -99, 67, -89, -31, -48, -11, 104, -14, com.google.common.base.Ascii.ESC, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 5, -93, -118, -43, 121, -122, -88, 48, -58, 81, 75, com.google.common.base.Ascii.RS, -90, 39, -10, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -46, 110, 36, com.google.common.base.Ascii.SYN, -126, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -38, -26, 117, -94, -17, 44, -78, com.google.common.base.Ascii.FS, -97, 93, 111, Byte.MIN_VALUE, 10, 114, 68, -101, 108, -112, com.google.common.base.Ascii.VT, 91, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 125, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 82, -13, 97, -95, -9, -80, -42, 63, 124, 109, -19, com.google.common.base.Ascii.DC4, -32, -91, kotlin.io.encoding.Base64.padSymbol, 34, -77, -8, -119, -34, 113, com.google.common.base.Ascii.SUB, -81, -70, -75, -127};
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = {82, 9, 106, -43, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -91, 56, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -90, -62, 35, kotlin.io.encoding.Base64.padSymbol, -18, 76, -107, com.google.common.base.Ascii.VT, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, com.google.common.base.Ascii.SYN, -44, -92, 92, -52, 93, 101, -74, -110, 108, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 72, 80, -3, -19, -71, -38, 94, com.google.common.base.Ascii.NAK, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, com.google.common.base.Ascii.RS, -113, -54, 63, com.google.common.base.Ascii.SI, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 103, -36, -22, -105, -14, com.visa.cbp.getEncExpo.kernelVersion, -50, com.visa.cbp.getEncExpo.onUnminimized, -76, -26, 115, -106, -84, 116, 34, -25, -83, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -123, -30, -7, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -24, com.google.common.base.Ascii.FS, 117, -33, 110, 71, -15, com.google.common.base.Ascii.SUB, 113, com.google.common.base.Ascii.GS, 41, -59, -119, 111, -73, 98, 14, -86, com.google.common.base.Ascii.CAN, -66, com.google.common.base.Ascii.ESC, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, com.visa.cbp.getEncExpo.startTransaction, -2, 120, -51, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -12, com.google.common.base.Ascii.US, -35, -88, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -120, 7, -57, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -79, 18, 16, 89, 39, Byte.MIN_VALUE, -20, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, com.visa.cbp.getEncExpo.IResultReceiver2, 81, Byte.MAX_VALUE, -87, com.google.common.base.Ascii.EM, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, com.visa.cbp.getEncExpo.registerForActivityResult, 97, com.google.common.base.Ascii.ETB, 43, 4, 126, -70, com.visa.cbp.getEncExpo.IResultReceiver, -42, 38, -31, 105, com.google.common.base.Ascii.DC4, 99, 85, 33, com.google.common.base.Ascii.FF, 125};
    private static final byte[] getHighSpeedVideoFpsRangesFor = {48, 104, com.visa.cbp.getEncExpo.registerForActivityResult, com.google.common.base.Ascii.ESC, -121, -71, 33, 120, 80, 57, -37, -31, 114, 9, 98, 60, 62, 126, 94, -114, -15, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -52, -93, 42, com.google.common.base.Ascii.GS, -5, -74, -42, 32, -60, -115, -127, 101, -11, -119, -53, -99, com.visa.cbp.getEncExpo.IResultReceiver, -58, 87, 67, 86, com.google.common.base.Ascii.ETB, -44, 64, com.google.common.base.Ascii.SUB, 77, com.visa.cbp.getEncExpo.startTransaction, 99, 108, -29, -73, -56, 100, 106, 83, -86, 56, -104, com.google.common.base.Ascii.FF, -12, -101, -19, Byte.MAX_VALUE, 34, 118, -81, -35, 58, com.google.common.base.Ascii.VT, 88, 103, -120, 6, -61, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 13, 1, -117, -116, -62, -26, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 2, 36, 117, -109, 102, com.google.common.base.Ascii.RS, -27, -30, 84, -40, 16, -50, 122, -24, 8, 44, 18, -105, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -85, -76, 39, 10, 35, -33, -17, -54, -39, -72, -6, -36, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 107, -47, -83, com.google.common.base.Ascii.EM, 73, -67, 81, -106, -18, -28, -88, 65, -38, -1, -51, 85, -122, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -66, 97, 82, -8, -69, 14, -126, 72, 105, -102, -32, 71, -98, 92, 4, 75, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, com.google.common.base.Ascii.NAK, 121, 38, -89, -34, 41, -82, -110, -41, -124, -23, -46, -70, 93, -13, -59, -80, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -92, 59, 113, 68, 70, 43, -4, -21, 111, -43, -10, com.google.common.base.Ascii.DC4, -2, 124, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 125, -3, 47, com.google.common.base.Ascii.CAN, -125, com.google.common.base.Ascii.SYN, -91, -111, com.google.common.base.Ascii.US, 5, -107, 116, -87, -63, 91, 74, -123, 109, 19, 7, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 78, 69, -78, com.google.common.base.Ascii.SI, -55, com.google.common.base.Ascii.FS, -90, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -20, 115, -112, 123, com.visa.cbp.getEncExpo.kernelVersion, 89, -113, -95, -7, 45, -14, -79, 0, -108, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -97, -48, 46, -100, 110, 40, 63, Byte.MIN_VALUE, com.visa.cbp.getEncExpo.onUnminimized, kotlin.io.encoding.Base64.padSymbol, -45, 37, -118, -75, -25, 66, -77, -57, -22, -9, 76, 17, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 3, -94, -84, com.visa.cbp.getEncExpo.IResultReceiver2};

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (this.getInputFormats == null) {
            throw new java.lang.IllegalStateException("ARIA engine not initialised");
        }
        if (i > bArr.length - 16) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i2 > bArr2.length - 16) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        byte[] bArr3 = new byte[16];
        java.lang.System.arraycopy(bArr, i, bArr3, 0, 16);
        int length = this.getInputFormats.length;
        int i3 = 0;
        while (i3 < length - 3) {
            FO(bArr3, this.getInputFormats[i3]);
            FE(bArr3, this.getInputFormats[i3 + 1]);
            i3 += 2;
        }
        FO(bArr3, this.getInputFormats[i3]);
        xor(bArr3, this.getInputFormats[i3 + 1]);
        SL2(bArr3);
        xor(bArr3, this.getInputFormats[i3 + 2]);
        java.lang.System.arraycopy(bArr3, 0, bArr2, i2, 16);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        if (cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter) {
            this.getInputFormats = keySchedule(z, ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey());
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to ARIA init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "ARIA";
    }

    protected static void xor(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    protected static void reverseKeys(byte[][] bArr) {
        int length = bArr.length;
        int i = length / 2;
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr2 = bArr[i2];
            int i3 = (length - 1) - i2;
            bArr[i2] = bArr[i3];
            bArr[i3] = bArr2;
        }
    }

    protected static void keyScheduleRound(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        int i4 = bArr3[15 - i2] & 255;
        int i5 = 0;
        while (i5 < 16) {
            int i6 = bArr3[(i5 - i2) & 15] & 255;
            bArr[i5] = (byte) (((i4 << (8 - i3)) | (i6 >>> i3)) ^ (bArr2[i5] & 255));
            i5++;
            i4 = i6;
        }
    }

    protected static byte[][] keySchedule(boolean z, byte[] bArr) {
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new java.lang.IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i = length >>> 3;
        int i2 = i - 2;
        byte[][] bArr2 = Camera2StreamConfigurationMap;
        byte[] bArr3 = bArr2[i2];
        byte[] bArr4 = bArr2[(i - 1) % 3];
        byte[] bArr5 = bArr2[i % 3];
        byte[] bArr6 = new byte[16];
        byte[] bArr7 = new byte[16];
        java.lang.System.arraycopy(bArr, 0, bArr6, 0, 16);
        java.lang.System.arraycopy(bArr, 16, bArr7, 0, length - 16);
        byte[] bArr8 = new byte[16];
        byte[] bArr9 = new byte[16];
        byte[] bArr10 = new byte[16];
        byte[] bArr11 = new byte[16];
        java.lang.System.arraycopy(bArr6, 0, bArr8, 0, 16);
        java.lang.System.arraycopy(bArr8, 0, bArr9, 0, 16);
        FO(bArr9, bArr3);
        xor(bArr9, bArr7);
        java.lang.System.arraycopy(bArr9, 0, bArr10, 0, 16);
        FE(bArr10, bArr4);
        xor(bArr10, bArr8);
        java.lang.System.arraycopy(bArr10, 0, bArr11, 0, 16);
        FO(bArr11, bArr5);
        xor(bArr11, bArr9);
        int i3 = i2 * 2;
        int i4 = i3 + 12;
        byte[][] bArr12 = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, i3 + 13, 16);
        keyScheduleRound(bArr12[0], bArr8, bArr9, 19);
        keyScheduleRound(bArr12[1], bArr9, bArr10, 19);
        keyScheduleRound(bArr12[2], bArr10, bArr11, 19);
        keyScheduleRound(bArr12[3], bArr11, bArr8, 19);
        keyScheduleRound(bArr12[4], bArr8, bArr9, 31);
        keyScheduleRound(bArr12[5], bArr9, bArr10, 31);
        keyScheduleRound(bArr12[6], bArr10, bArr11, 31);
        keyScheduleRound(bArr12[7], bArr11, bArr8, 31);
        keyScheduleRound(bArr12[8], bArr8, bArr9, 67);
        keyScheduleRound(bArr12[9], bArr9, bArr10, 67);
        keyScheduleRound(bArr12[10], bArr10, bArr11, 67);
        keyScheduleRound(bArr12[11], bArr11, bArr8, 67);
        keyScheduleRound(bArr12[12], bArr8, bArr9, 97);
        if (i4 > 12) {
            keyScheduleRound(bArr12[13], bArr9, bArr10, 97);
            keyScheduleRound(bArr12[14], bArr10, bArr11, 97);
            if (i4 > 14) {
                keyScheduleRound(bArr12[15], bArr11, bArr8, 97);
                keyScheduleRound(bArr12[16], bArr8, bArr9, 109);
            }
        }
        if (!z) {
            reverseKeys(bArr12);
            for (int i5 = 1; i5 < i4; i5++) {
                A(bArr12[i5]);
            }
        }
        return bArr12;
    }

    protected static void SL2(byte[] bArr) {
        bArr[0] = SB3(bArr[0]);
        bArr[1] = SB4(bArr[1]);
        bArr[2] = SB1(bArr[2]);
        bArr[3] = SB2(bArr[3]);
        bArr[4] = SB3(bArr[4]);
        bArr[5] = SB4(bArr[5]);
        bArr[6] = SB1(bArr[6]);
        bArr[7] = SB2(bArr[7]);
        bArr[8] = SB3(bArr[8]);
        bArr[9] = SB4(bArr[9]);
        bArr[10] = SB1(bArr[10]);
        bArr[11] = SB2(bArr[11]);
        bArr[12] = SB3(bArr[12]);
        bArr[13] = SB4(bArr[13]);
        bArr[14] = SB1(bArr[14]);
        bArr[15] = SB2(bArr[15]);
    }

    protected static void SL1(byte[] bArr) {
        bArr[0] = SB1(bArr[0]);
        bArr[1] = SB2(bArr[1]);
        bArr[2] = SB3(bArr[2]);
        bArr[3] = SB4(bArr[3]);
        bArr[4] = SB1(bArr[4]);
        bArr[5] = SB2(bArr[5]);
        bArr[6] = SB3(bArr[6]);
        bArr[7] = SB4(bArr[7]);
        bArr[8] = SB1(bArr[8]);
        bArr[9] = SB2(bArr[9]);
        bArr[10] = SB3(bArr[10]);
        bArr[11] = SB4(bArr[11]);
        bArr[12] = SB1(bArr[12]);
        bArr[13] = SB2(bArr[13]);
        bArr[14] = SB3(bArr[14]);
        bArr[15] = SB4(bArr[15]);
    }

    protected static byte SB4(byte b) {
        return getHighSpeedVideoFpsRangesFor[b & 255];
    }

    protected static byte SB3(byte b) {
        return getHighResolutionOutputSizeshNQ4ISI[b & 255];
    }

    protected static byte SB2(byte b) {
        return getHighSpeedVideoSizes[b & 255];
    }

    protected static byte SB1(byte b) {
        return getHighSpeedVideoFpsRanges[b & 255];
    }

    protected static void FO(byte[] bArr, byte[] bArr2) {
        xor(bArr, bArr2);
        SL1(bArr);
        A(bArr);
    }

    protected static void FE(byte[] bArr, byte[] bArr2) {
        xor(bArr, bArr2);
        SL2(bArr);
        A(bArr);
    }

    protected static void A(byte[] bArr) {
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        byte b4 = bArr[3];
        byte b5 = bArr[4];
        byte b6 = bArr[5];
        byte b7 = bArr[6];
        byte b8 = bArr[7];
        byte b9 = bArr[8];
        byte b10 = bArr[9];
        byte b11 = bArr[10];
        byte b12 = bArr[11];
        byte b13 = bArr[12];
        byte b14 = bArr[13];
        byte b15 = bArr[14];
        byte b16 = bArr[15];
        bArr[0] = (byte) ((((((b4 ^ b5) ^ b7) ^ b9) ^ b10) ^ b14) ^ b15);
        bArr[1] = (byte) ((((((b3 ^ b6) ^ b8) ^ b9) ^ b10) ^ b13) ^ b16);
        bArr[2] = (byte) ((((((b2 ^ b5) ^ b7) ^ b11) ^ b12) ^ b13) ^ b16);
        bArr[3] = (byte) ((((((b ^ b6) ^ b8) ^ b11) ^ b12) ^ b14) ^ b15);
        int i = b ^ b3;
        bArr[4] = (byte) (((((i ^ b6) ^ b9) ^ b12) ^ b15) ^ b16);
        int i2 = b2 ^ b4;
        bArr[5] = (byte) (((((i2 ^ b5) ^ b10) ^ b11) ^ b15) ^ b16);
        bArr[6] = (byte) (((((i ^ b8) ^ b10) ^ b11) ^ b13) ^ b14);
        bArr[7] = (byte) (((((i2 ^ b7) ^ b9) ^ b12) ^ b13) ^ b14);
        int i3 = b ^ b2;
        bArr[8] = (byte) (((((i3 ^ b5) ^ b8) ^ b11) ^ b14) ^ b16);
        bArr[9] = (byte) (((((i3 ^ b6) ^ b7) ^ b12) ^ b13) ^ b15);
        int i4 = b3 ^ b4;
        bArr[10] = (byte) (((((i4 ^ b6) ^ b7) ^ b9) ^ b14) ^ b16);
        bArr[11] = (byte) (((((i4 ^ b5) ^ b8) ^ b10) ^ b13) ^ b15);
        int i5 = b2 ^ b3;
        bArr[12] = (byte) (((((i5 ^ b7) ^ b8) ^ b10) ^ b12) ^ b13);
        int i6 = b ^ b4;
        bArr[13] = (byte) (((((i6 ^ b7) ^ b8) ^ b9) ^ b11) ^ b14);
        bArr[14] = (byte) (((((i6 ^ b5) ^ b6) ^ b10) ^ b12) ^ b15);
        bArr[15] = (byte) (((((i5 ^ b5) ^ b6) ^ b9) ^ b11) ^ b16);
    }
}
