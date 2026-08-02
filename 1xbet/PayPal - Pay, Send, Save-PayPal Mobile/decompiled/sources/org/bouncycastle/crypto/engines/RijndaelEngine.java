package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class RijndaelEngine implements org.bouncycastle.crypto.BlockCipher {
    private long getHighSpeedVideoSizesFor;
    private long getInputSizeshNQ4ISI;
    private long getOutputFormats;
    private int getOutputMinFrameDurationlomOqCM;
    private long getOutputSizes;
    private long getOutputSizeshNQ4ISI;
    private int getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private long[][] getValidOutputFormatsForInputhNQ4ISI;
    private byte[] isOutputSupportedFor;
    private byte[] isOutputSupportedForhNQ4ISI;
    private boolean unwrapAs;
    private static final byte[] getInputFormats = {0, 0, com.google.common.base.Ascii.EM, 1, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 2, com.google.common.base.Ascii.SUB, -58, 75, -57, com.google.common.base.Ascii.ESC, 104, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -18, -33, 3, 100, 4, -32, 14, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -115, -127, -17, 76, 113, 8, -56, -8, 105, com.google.common.base.Ascii.FS, -63, 125, -62, com.google.common.base.Ascii.GS, -75, -7, -71, 39, 106, 77, -28, -90, 114, -102, -55, 9, 120, 101, 47, -118, 5, 33, com.google.common.base.Ascii.SI, -31, 36, 18, com.visa.cbp.getEncExpo.onUnminimized, -126, 69, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -109, -38, -114, -106, -113, -37, -67, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -48, -50, -108, 19, 92, -46, -15, 64, 70, -125, 56, 102, -35, -3, 48, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 6, -117, 98, -77, 37, -30, -104, 34, -120, -111, 16, 126, 110, 72, -61, -93, -74, com.google.common.base.Ascii.RS, 66, 58, 107, 40, 84, -6, -123, kotlin.io.encoding.Base64.padSymbol, -70, 43, 121, 10, com.google.common.base.Ascii.NAK, -101, -97, 94, -54, 78, -44, -84, -27, -13, 115, -89, 87, -81, 88, -88, 80, -12, -22, -42, 116, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -82, -23, -43, -25, -26, -83, -24, 44, -41, 117, 122, -21, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.VT, -11, 89, -53, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -80, -100, -87, 81, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, Byte.MAX_VALUE, com.google.common.base.Ascii.FF, -10, 111, com.google.common.base.Ascii.ETB, -60, 73, -20, -40, 67, com.google.common.base.Ascii.US, 45, -92, 118, 123, -73, -52, -69, 62, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -5, com.visa.cbp.getEncExpo.IResultReceiver2, -79, -122, 59, 82, -95, 108, -86, 85, 41, -99, -105, -78, -121, -112, 97, -66, -36, -4, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -107, com.visa.cbp.getEncExpo.kernelVersion, -51, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 63, 91, -47, 83, 57, -124, 60, 65, -94, 109, 71, com.google.common.base.Ascii.DC4, 42, -98, 93, 86, -14, -45, -85, 68, 17, -110, -39, 35, 32, 46, -119, -76, 124, -72, 38, com.visa.cbp.getEncExpo.IResultReceiver, com.visa.cbp.getEncExpo.registerForActivityResult, -29, -91, 103, 74, -19, -34, -59, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -2, com.google.common.base.Ascii.CAN, 13, 99, -116, Byte.MIN_VALUE, com.visa.cbp.getEncExpo.startTransaction, -9, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 7};
    private static final byte[] Camera2StreamConfigurationMap = {0, 3, 5, com.google.common.base.Ascii.SI, 17, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 85, -1, com.google.common.base.Ascii.SUB, 46, 114, -106, -95, -8, 19, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -31, 56, 72, -40, 115, -107, -92, -9, 2, 6, 10, com.google.common.base.Ascii.RS, 34, 102, -86, -27, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 92, -28, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 89, -21, 38, 106, -66, -39, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -112, -85, -26, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 83, -11, 4, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.DC4, 60, 68, -52, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -47, 104, -72, -45, 110, -78, -51, 76, -44, 103, -87, -32, 59, 77, -41, 98, -90, -15, 8, com.google.common.base.Ascii.CAN, 40, 120, -120, -125, -98, -71, -48, 107, -67, -36, Byte.MAX_VALUE, -127, -104, -77, -50, 73, -37, 118, -102, -75, -60, 87, -7, 16, 48, 80, com.visa.cbp.getEncExpo.onUnminimized, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.GS, 39, 105, -69, -42, 97, -93, -2, com.google.common.base.Ascii.EM, 43, 125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 32, com.visa.cbp.getEncExpo.IResultReceiver2, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -5, com.google.common.base.Ascii.SYN, 58, 78, -46, 109, -73, -62, 93, -25, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 86, -6, com.google.common.base.Ascii.NAK, 63, 65, -61, 94, -30, kotlin.io.encoding.Base64.padSymbol, 71, -55, 64, com.visa.cbp.getEncExpo.startTransaction, 91, -19, 44, 116, -100, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -38, 117, -97, -70, -43, 100, -84, -17, 42, 126, -126, -99, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -33, 122, -114, -119, Byte.MIN_VALUE, -101, -74, -63, 88, -24, 35, 101, -81, -22, 37, 111, -79, -56, 67, -59, 84, -4, com.google.common.base.Ascii.US, 33, 99, -91, -12, 7, 9, com.google.common.base.Ascii.ESC, 45, com.visa.cbp.getEncExpo.IResultReceiver, com.visa.cbp.getEncExpo.registerForActivityResult, -80, -53, 70, -54, 69, com.visa.cbp.getEncExpo.kernelVersion, 74, -34, 121, -117, -122, -111, -88, -29, 62, 66, -58, 81, -13, 14, 18, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, 13, com.google.common.base.Ascii.ETB, 57, 75, -35, 124, -124, -105, -94, -3, com.google.common.base.Ascii.FS, 36, 108, -76, -57, 82, -10, 1, 3, 5, com.google.common.base.Ascii.SI, 17, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 85, -1, com.google.common.base.Ascii.SUB, 46, 114, -106, -95, -8, 19, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -31, 56, 72, -40, 115, -107, -92, -9, 2, 6, 10, com.google.common.base.Ascii.RS, 34, 102, -86, -27, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 92, -28, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 89, -21, 38, 106, -66, -39, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -112, -85, -26, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 83, -11, 4, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.DC4, 60, 68, -52, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -47, 104, -72, -45, 110, -78, -51, 76, -44, 103, -87, -32, 59, 77, -41, 98, -90, -15, 8, com.google.common.base.Ascii.CAN, 40, 120, -120, -125, -98, -71, -48, 107, -67, -36, Byte.MAX_VALUE, -127, -104, -77, -50, 73, -37, 118, -102, -75, -60, 87, -7, 16, 48, 80, com.visa.cbp.getEncExpo.onUnminimized, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.GS, 39, 105, -69, -42, 97, -93, -2, com.google.common.base.Ascii.EM, 43, 125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 32, com.visa.cbp.getEncExpo.IResultReceiver2, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -5, com.google.common.base.Ascii.SYN, 58, 78, -46, 109, -73, -62, 93, -25, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 86, -6, com.google.common.base.Ascii.NAK, 63, 65, -61, 94, -30, kotlin.io.encoding.Base64.padSymbol, 71, -55, 64, com.visa.cbp.getEncExpo.startTransaction, 91, -19, 44, 116, -100, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -38, 117, -97, -70, -43, 100, -84, -17, 42, 126, -126, -99, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -33, 122, -114, -119, Byte.MIN_VALUE, -101, -74, -63, 88, -24, 35, 101, -81, -22, 37, 111, -79, -56, 67, -59, 84, -4, com.google.common.base.Ascii.US, 33, 99, -91, -12, 7, 9, com.google.common.base.Ascii.ESC, 45, com.visa.cbp.getEncExpo.IResultReceiver, com.visa.cbp.getEncExpo.registerForActivityResult, -80, -53, 70, -54, 69, com.visa.cbp.getEncExpo.kernelVersion, 74, -34, 121, -117, -122, -111, -88, -29, 62, 66, -58, 81, -13, 14, 18, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, 13, com.google.common.base.Ascii.ETB, 57, 75, -35, 124, -124, -105, -94, -3, com.google.common.base.Ascii.FS, 36, 108, -76, -57, 82, -10, 1};
    private static final byte[] getHighSpeedVideoFpsRangesFor = {99, 124, com.visa.cbp.getEncExpo.IResultReceiver, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, com.visa.cbp.getEncExpo.onUnminimized, -83, -44, -94, -81, -100, -92, 114, com.visa.cbp.getEncExpo.startTransaction, -73, -3, -109, 38, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 63, -9, -52, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -91, -27, -15, 113, -40, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.NAK, 4, -57, 35, -61, com.google.common.base.Ascii.CAN, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, 110, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, com.visa.cbp.getEncExpo.kernelVersion, -48, -17, -86, -5, 67, 77, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, 16, -1, -13, -46, -51, com.google.common.base.Ascii.FF, 19, -20, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -105, 68, com.google.common.base.Ascii.ETB, -60, -89, 126, kotlin.io.encoding.Base64.padSymbol, 100, 93, com.google.common.base.Ascii.EM, 115, com.visa.cbp.getEncExpo.IResultReceiver2, -127, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -36, 34, 42, -112, -120, 70, -18, -72, com.google.common.base.Ascii.DC4, -34, 94, com.google.common.base.Ascii.VT, -37, -32, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, com.google.common.base.Ascii.FS, -90, -76, -58, -24, -35, 116, com.google.common.base.Ascii.US, 75, -67, -117, -118, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 62, -75, 102, 72, 3, -10, 14, 97, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 87, -71, -122, -63, com.google.common.base.Ascii.GS, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, com.google.common.base.Ascii.RS, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -26, 66, 104, 65, com.visa.cbp.getEncExpo.registerForActivityResult, 45, com.google.common.base.Ascii.SI, -80, 84, -69, com.google.common.base.Ascii.SYN};
    private static final byte[] getHighSpeedVideoSizes = {82, 9, 106, -43, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -91, 56, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -90, -62, 35, kotlin.io.encoding.Base64.padSymbol, -18, 76, -107, com.google.common.base.Ascii.VT, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, com.google.common.base.Ascii.SYN, -44, -92, 92, -52, 93, 101, -74, -110, 108, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 72, 80, -3, -19, -71, -38, 94, com.google.common.base.Ascii.NAK, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, com.google.common.base.Ascii.RS, -113, -54, 63, com.google.common.base.Ascii.SI, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 103, -36, -22, -105, -14, com.visa.cbp.getEncExpo.kernelVersion, -50, com.visa.cbp.getEncExpo.onUnminimized, -76, -26, 115, -106, -84, 116, 34, -25, -83, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -123, -30, -7, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -24, com.google.common.base.Ascii.FS, 117, -33, 110, 71, -15, com.google.common.base.Ascii.SUB, 113, com.google.common.base.Ascii.GS, 41, -59, -119, 111, -73, 98, 14, -86, com.google.common.base.Ascii.CAN, -66, com.google.common.base.Ascii.ESC, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, com.visa.cbp.getEncExpo.startTransaction, -2, 120, -51, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -12, com.google.common.base.Ascii.US, -35, -88, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -120, 7, -57, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -79, 18, 16, 89, 39, Byte.MIN_VALUE, -20, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, com.visa.cbp.getEncExpo.IResultReceiver2, 81, Byte.MAX_VALUE, -87, com.google.common.base.Ascii.EM, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, com.visa.cbp.getEncExpo.registerForActivityResult, 97, com.google.common.base.Ascii.ETB, 43, 4, 126, -70, com.visa.cbp.getEncExpo.IResultReceiver, -42, 38, -31, 105, com.google.common.base.Ascii.DC4, 99, 85, 33, com.google.common.base.Ascii.FF, 125};
    private static final int[] getOutputMinFrameDuration = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, 171, 77, 154, 47, 94, 188, 99, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, 151, 53, 106, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, 179, 125, 250, 239, 197, 145};
    static byte[][] getHighSpeedVideoFpsRanges = {new byte[]{0, 8, 16, com.google.common.base.Ascii.CAN}, new byte[]{0, 8, 16, com.google.common.base.Ascii.CAN}, new byte[]{0, 8, 16, com.google.common.base.Ascii.CAN}, new byte[]{0, 8, 16, 32}, new byte[]{0, 8, com.google.common.base.Ascii.CAN, 32}};
    static byte[][] getHighResolutionOutputSizeshNQ4ISI = {new byte[]{0, com.google.common.base.Ascii.CAN, 16, 8}, new byte[]{0, 32, com.google.common.base.Ascii.CAN, 16}, new byte[]{0, 40, 32, com.google.common.base.Ascii.CAN}, new byte[]{0, 48, 40, com.google.common.base.Ascii.CAN}, new byte[]{0, 56, 40, 32}};

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    private void getHighSpeedVideoFpsRanges(byte[] bArr) {
        long j = this.getHighSpeedVideoSizesFor;
        byte b = bArr[1];
        int i = this.getOutputStallDurationlomOqCM;
        long j2 = (j >>> b) | (j << (i - b));
        long j3 = this.getOutputSizes;
        this.getHighSpeedVideoSizesFor = j2 & j3;
        long j4 = this.getInputSizeshNQ4ISI;
        byte b2 = bArr[2];
        this.getInputSizeshNQ4ISI = ((j4 >>> b2) | (j4 << (i - b2))) & j3;
        long j5 = this.getOutputSizeshNQ4ISI;
        byte b3 = bArr[3];
        this.getOutputSizeshNQ4ISI = ((j5 >>> b3) | (j5 << (i - b3))) & j3;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        int i;
        int i2;
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to Rijndael init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        int i3 = 8;
        int length = key.length * 8;
        int i4 = 4;
        byte[][] bArr = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, 4, 64);
        long[][] jArr = (long[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Long.TYPE, 15, 4);
        if (length == 128) {
            i = 4;
        } else if (length == 160) {
            i = 5;
        } else if (length == 192) {
            i = 6;
        } else if (length == 224) {
            i = 7;
        } else {
            if (length != 256) {
                throw new java.lang.IllegalArgumentException("Key length not 128/160/192/224/256 bits.");
            }
            i = 8;
        }
        this.getOutputStallDuration = length >= this.getOutputMinFrameDurationlomOqCM ? i + 6 : (this.getOutputStallDurationlomOqCM / 8) + 6;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < key.length) {
            bArr[i6 % 4][i6 / 4] = key[i7];
            i6++;
            i7++;
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < i && i9 < (this.getOutputStallDuration + 1) * (this.getOutputStallDurationlomOqCM / 8)) {
            int i10 = 0;
            while (i10 < i4) {
                int i11 = this.getOutputStallDurationlomOqCM;
                long[] jArr2 = jArr[i9 / (i11 / 8)];
                jArr2[i10] = ((bArr[i10][i8] & 255) << ((i9 * 8) % i11)) | jArr2[i10];
                i10++;
                jArr = jArr;
                i4 = 4;
            }
            i8++;
            i9++;
            i4 = 4;
        }
        long[][] jArr3 = jArr;
        int i12 = 0;
        while (i9 < (this.getOutputStallDuration + 1) * (this.getOutputStallDurationlomOqCM / i3)) {
            int i13 = i5;
            while (i13 < 4) {
                byte[] bArr2 = bArr[i13];
                i13++;
                bArr2[i5] = (byte) (bArr2[i5] ^ getHighSpeedVideoFpsRangesFor[bArr[i13 % 4][i - 1] & 255]);
            }
            byte[] bArr3 = bArr[i5];
            bArr3[i5] = (byte) (bArr3[i5] ^ getOutputMinFrameDuration[i12]);
            int i14 = 1;
            if (i <= 6) {
                while (i14 < i) {
                    for (int i15 = i5; i15 < 4; i15++) {
                        byte[] bArr4 = bArr[i15];
                        bArr4[i14] = (byte) (bArr4[i14] ^ bArr4[i14 - 1]);
                    }
                    i14++;
                }
            } else {
                while (true) {
                    i2 = 4;
                    if (i14 >= 4) {
                        break;
                    }
                    int i16 = i5;
                    while (i16 < i2) {
                        byte[] bArr5 = bArr[i16];
                        bArr5[i14] = (byte) (bArr5[i14] ^ bArr5[i14 - 1]);
                        i16++;
                        i2 = 4;
                    }
                    i14++;
                }
                for (int i17 = i5; i17 < 4; i17++) {
                    byte[] bArr6 = bArr[i17];
                    bArr6[4] = (byte) (bArr6[4] ^ getHighSpeedVideoFpsRangesFor[bArr6[3] & 255]);
                }
                int i18 = 5;
                while (i18 < i) {
                    int i19 = i5;
                    while (i19 < i2) {
                        byte[] bArr7 = bArr[i19];
                        bArr7[i18] = (byte) (bArr7[i18] ^ bArr7[i18 - 1]);
                        i19++;
                        i2 = 4;
                    }
                    i18++;
                    i2 = 4;
                }
            }
            int i20 = i5;
            while (i20 < i && i9 < (this.getOutputStallDuration + 1) * (this.getOutputStallDurationlomOqCM / i3)) {
                int i21 = i5;
                while (i21 < 4) {
                    int i22 = this.getOutputStallDurationlomOqCM;
                    long[] jArr4 = jArr3[i9 / (i22 / 8)];
                    jArr4[i21] = ((bArr[i21][i20] & 255) << ((i9 * 8) % i22)) | jArr4[i21];
                    i21++;
                    bArr = bArr;
                }
                i20++;
                i9++;
                i5 = 0;
                i3 = 8;
            }
            i12++;
            bArr = bArr;
            i5 = 0;
            i3 = 8;
        }
        this.getValidOutputFormatsForInputhNQ4ISI = jArr3;
        this.unwrapAs = z;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3;
        if (this.getValidOutputFormatsForInputhNQ4ISI == null) {
            throw new java.lang.IllegalStateException("Rijndael engine not initialised");
        }
        int i4 = this.getOutputStallDurationlomOqCM / 2;
        if (i4 + i > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i4 + i2 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        boolean z = this.unwrapAs;
        this.getOutputFormats = bArr[i] & 255;
        this.getHighSpeedVideoSizesFor = bArr[i + 1] & 255;
        this.getInputSizeshNQ4ISI = bArr[i + 2] & 255;
        int i5 = i + 4;
        this.getOutputSizeshNQ4ISI = bArr[i + 3] & 255;
        int i6 = 8;
        while (i6 != this.getOutputStallDurationlomOqCM) {
            this.getOutputFormats |= (bArr[i5] & 255) << i6;
            this.getHighSpeedVideoSizesFor |= (bArr[i5 + 1] & 255) << i6;
            this.getInputSizeshNQ4ISI |= (bArr[i5 + 2] & 255) << i6;
            this.getOutputSizeshNQ4ISI |= (bArr[i5 + 3] & 255) << i6;
            i6 += 8;
            i5 += 4;
        }
        long[][] jArr = this.getValidOutputFormatsForInputhNQ4ISI;
        long j = 255;
        int i7 = 0;
        if (z) {
            getHighSpeedVideoSizes(jArr[0]);
            int i8 = 1;
            while (i8 < this.getOutputStallDuration) {
                Camera2StreamConfigurationMap(getHighSpeedVideoFpsRangesFor);
                getHighSpeedVideoFpsRanges(this.isOutputSupportedFor);
                int i9 = i7;
                long j2 = 0;
                long j3 = 0;
                long j4 = 0;
                long j5 = 0;
                while (i9 < this.getOutputStallDurationlomOqCM) {
                    int i10 = (int) ((this.getOutputFormats >> i9) & j);
                    long[][] jArr2 = jArr;
                    int i11 = (int) ((this.getHighSpeedVideoSizesFor >> i9) & j);
                    int i12 = i8;
                    int i13 = (int) ((this.getInputSizeshNQ4ISI >> i9) & j);
                    long j6 = j2;
                    int i14 = (int) ((this.getOutputSizeshNQ4ISI >> i9) & j);
                    j3 |= (((((i11 != 0 ? Camera2StreamConfigurationMap[(getInputFormats[i11] & 255) + 1] : (byte) 0) ^ (i10 != 0 ? Camera2StreamConfigurationMap[(getInputFormats[i10] & 255) + 25] : (byte) 0)) ^ i13) ^ i14) & 255) << i9;
                    j4 |= (((((i11 != 0 ? Camera2StreamConfigurationMap[(getInputFormats[i11] & 255) + 25] : (byte) 0) ^ (i13 != 0 ? Camera2StreamConfigurationMap[(getInputFormats[i13] & 255) + 1] : (byte) 0)) ^ i14) ^ i10) & 255) << i9;
                    j2 = j6 | ((((((i13 != 0 ? Camera2StreamConfigurationMap[(getInputFormats[i13] & 255) + 25] : (byte) 0) ^ (i14 != 0 ? Camera2StreamConfigurationMap[(getInputFormats[i14] & 255) + 1] : (byte) 0)) ^ i10) ^ i11) & 255) << i9);
                    j5 = ((((i11 ^ ((i14 != 0 ? Camera2StreamConfigurationMap[(getInputFormats[i14] & 255) + 25] : (byte) 0) ^ (i10 != 0 ? Camera2StreamConfigurationMap[(getInputFormats[i10] & 255) + 1] : (byte) 0))) ^ i13) & 255) << i9) | j5;
                    i9 += 8;
                    jArr = jArr2;
                    i8 = i12;
                    j = 255;
                }
                long[][] jArr3 = jArr;
                int i15 = i8;
                this.getOutputFormats = j3;
                this.getHighSpeedVideoSizesFor = j4;
                this.getInputSizeshNQ4ISI = j2;
                this.getOutputSizeshNQ4ISI = j5;
                getHighSpeedVideoSizes(jArr3[i15]);
                i8 = i15 + 1;
                jArr = jArr3;
                j = 255;
                i7 = 0;
            }
            Camera2StreamConfigurationMap(getHighSpeedVideoFpsRangesFor);
            getHighSpeedVideoFpsRanges(this.isOutputSupportedFor);
            getHighSpeedVideoSizes(jArr[this.getOutputStallDuration]);
            i3 = 0;
        } else {
            long[][] jArr4 = jArr;
            getHighSpeedVideoSizes(jArr4[this.getOutputStallDuration]);
            Camera2StreamConfigurationMap(getHighSpeedVideoSizes);
            getHighSpeedVideoFpsRanges(this.isOutputSupportedForhNQ4ISI);
            for (int i16 = this.getOutputStallDuration - 1; i16 > 0; i16--) {
                getHighSpeedVideoSizes(jArr4[i16]);
                int i17 = 0;
                long j7 = 0;
                long j8 = 0;
                long j9 = 0;
                long j10 = 0;
                while (i17 < this.getOutputStallDurationlomOqCM) {
                    int i18 = (int) ((this.getOutputFormats >> i17) & 255);
                    long[][] jArr5 = jArr4;
                    long j11 = j10;
                    int i19 = (int) ((this.getHighSpeedVideoSizesFor >> i17) & 255);
                    int i20 = (int) ((this.getInputSizeshNQ4ISI >> i17) & 255);
                    long j12 = j9;
                    int i21 = (int) ((this.getOutputSizeshNQ4ISI >> i17) & 255);
                    int i22 = i18 != 0 ? getInputFormats[i18 & 255] & 255 : -1;
                    int i23 = i19 != 0 ? getInputFormats[i19 & 255] & 255 : -1;
                    int i24 = i20 != 0 ? getInputFormats[i20 & 255] & 255 : -1;
                    int i25 = i21 != 0 ? getInputFormats[i21 & 255] & 255 : -1;
                    j7 |= (((((i22 >= 0 ? Camera2StreamConfigurationMap[i22 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE] : (byte) 0) ^ (i23 >= 0 ? Camera2StreamConfigurationMap[i23 + 104] : (byte) 0)) ^ (i24 >= 0 ? Camera2StreamConfigurationMap[i24 + 238] : (byte) 0)) ^ (i25 >= 0 ? Camera2StreamConfigurationMap[i25 + 199] : (byte) 0)) & 255) << i17;
                    j8 |= (((((i23 >= 0 ? Camera2StreamConfigurationMap[i23 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE] : (byte) 0) ^ (i24 >= 0 ? Camera2StreamConfigurationMap[i24 + 104] : (byte) 0)) ^ (i25 >= 0 ? Camera2StreamConfigurationMap[i25 + 238] : (byte) 0)) ^ (i22 >= 0 ? Camera2StreamConfigurationMap[i22 + 199] : (byte) 0)) & 255) << i17;
                    long j13 = j12 | ((((((i24 >= 0 ? Camera2StreamConfigurationMap[i24 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE] : (byte) 0) ^ (i25 >= 0 ? Camera2StreamConfigurationMap[i25 + 104] : (byte) 0)) ^ (i22 >= 0 ? Camera2StreamConfigurationMap[i22 + 238] : (byte) 0)) ^ (i23 >= 0 ? Camera2StreamConfigurationMap[i23 + 199] : (byte) 0)) & 255) << i17);
                    j10 = ((((((i25 >= 0 ? Camera2StreamConfigurationMap[i25 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE] : (byte) 0) ^ (i22 >= 0 ? Camera2StreamConfigurationMap[i22 + 104] : (byte) 0)) ^ (i23 >= 0 ? Camera2StreamConfigurationMap[i23 + 238] : (byte) 0)) ^ (i24 >= 0 ? Camera2StreamConfigurationMap[i24 + 199] : (byte) 0)) & 255) << i17) | j11;
                    i17 += 8;
                    jArr4 = jArr5;
                    j9 = j13;
                }
                this.getOutputFormats = j7;
                this.getHighSpeedVideoSizesFor = j8;
                this.getInputSizeshNQ4ISI = j9;
                this.getOutputSizeshNQ4ISI = j10;
                Camera2StreamConfigurationMap(getHighSpeedVideoSizes);
                getHighSpeedVideoFpsRanges(this.isOutputSupportedForhNQ4ISI);
            }
            i3 = 0;
            getHighSpeedVideoSizes(jArr4[0]);
        }
        int i26 = i3;
        int i27 = i2;
        while (true) {
            int i28 = this.getOutputStallDurationlomOqCM;
            if (i26 == i28) {
                return i28 / 2;
            }
            bArr2[i27] = (byte) (this.getOutputFormats >> i26);
            bArr2[i27 + 1] = (byte) (this.getHighSpeedVideoSizesFor >> i26);
            bArr2[i27 + 2] = (byte) (this.getInputSizeshNQ4ISI >> i26);
            bArr2[i27 + 3] = (byte) (this.getOutputSizeshNQ4ISI >> i26);
            i26 += 8;
            i27 += 4;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.getOutputStallDurationlomOqCM / 2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "Rijndael";
    }

    private long getHighSpeedVideoFpsRangesFor(long j, byte[] bArr) {
        long j2 = 0;
        for (int i = 0; i < this.getOutputStallDurationlomOqCM; i += 8) {
            j2 |= (bArr[(int) ((j >> i) & 255)] & 255) << i;
        }
        return j2;
    }

    private void Camera2StreamConfigurationMap(byte[] bArr) {
        this.getOutputFormats = getHighSpeedVideoFpsRangesFor(this.getOutputFormats, bArr);
        this.getHighSpeedVideoSizesFor = getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizesFor, bArr);
        this.getInputSizeshNQ4ISI = getHighSpeedVideoFpsRangesFor(this.getInputSizeshNQ4ISI, bArr);
        this.getOutputSizeshNQ4ISI = getHighSpeedVideoFpsRangesFor(this.getOutputSizeshNQ4ISI, bArr);
    }

    private void getHighSpeedVideoSizes(long[] jArr) {
        this.getOutputFormats ^= jArr[0];
        this.getHighSpeedVideoSizesFor ^= jArr[1];
        this.getInputSizeshNQ4ISI ^= jArr[2];
        this.getOutputSizeshNQ4ISI ^= jArr[3];
    }

    public RijndaelEngine(int i) {
        if (i == 128) {
            this.getOutputStallDurationlomOqCM = 32;
            this.getOutputSizes = 4294967295L;
            this.isOutputSupportedFor = getHighSpeedVideoFpsRanges[0];
            this.isOutputSupportedForhNQ4ISI = getHighResolutionOutputSizeshNQ4ISI[0];
        } else if (i == 160) {
            this.getOutputStallDurationlomOqCM = 40;
            this.getOutputSizes = 1099511627775L;
            this.isOutputSupportedFor = getHighSpeedVideoFpsRanges[1];
            this.isOutputSupportedForhNQ4ISI = getHighResolutionOutputSizeshNQ4ISI[1];
        } else if (i == 192) {
            this.getOutputStallDurationlomOqCM = 48;
            this.getOutputSizes = 281474976710655L;
            this.isOutputSupportedFor = getHighSpeedVideoFpsRanges[2];
            this.isOutputSupportedForhNQ4ISI = getHighResolutionOutputSizeshNQ4ISI[2];
        } else if (i == 224) {
            this.getOutputStallDurationlomOqCM = 56;
            this.getOutputSizes = 72057594037927935L;
            this.isOutputSupportedFor = getHighSpeedVideoFpsRanges[3];
            this.isOutputSupportedForhNQ4ISI = getHighResolutionOutputSizeshNQ4ISI[3];
        } else {
            if (i != 256) {
                throw new java.lang.IllegalArgumentException("unknown blocksize to Rijndael");
            }
            this.getOutputStallDurationlomOqCM = 64;
            this.getOutputSizes = -1L;
            this.isOutputSupportedFor = getHighSpeedVideoFpsRanges[4];
            this.isOutputSupportedForhNQ4ISI = getHighResolutionOutputSizeshNQ4ISI[4];
        }
        this.getOutputMinFrameDurationlomOqCM = i;
    }

    public RijndaelEngine() {
        this(128);
    }
}
