package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class DSTU7624Engine implements org.bouncycastle.crypto.BlockCipher {
    private boolean getHighSpeedVideoSizesFor;
    private long[] getOutputFormats;
    private int getOutputMinFrameDurationlomOqCM;
    private long[] getOutputSizes;
    private int getOutputSizeshNQ4ISI;
    private long[][] getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private static final byte[] getHighSpeedVideoSizes = {-88, 67, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 6, 107, 117, 108, 89, 113, -33, -121, -107, com.google.common.base.Ascii.ETB, com.visa.cbp.getEncExpo.onUnminimized, -40, 9, 109, -13, com.google.common.base.Ascii.GS, -53, -55, 77, 44, -81, 121, -32, -105, -3, 111, 75, 69, 57, 62, -35, -93, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -76, -74, -102, 14, com.google.common.base.Ascii.US, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, com.google.common.base.Ascii.NAK, -31, 73, -46, -109, -58, -110, 114, -98, 97, -47, 99, -6, -18, -12, com.google.common.base.Ascii.EM, -43, -83, 88, -92, -69, -95, -36, -14, -125, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 66, -28, 122, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -100, -52, -85, 74, -113, 110, 4, 39, 46, -25, -30, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -106, com.google.common.base.Ascii.SYN, 35, 43, -62, 101, 102, com.google.common.base.Ascii.SI, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -87, 71, 65, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 72, -4, -73, 106, -120, -91, 83, -122, -7, 91, -37, 56, 123, -61, com.google.common.base.Ascii.RS, 34, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 36, 40, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -57, -78, 59, -114, com.visa.cbp.getEncExpo.IResultReceiver, -70, -11, com.google.common.base.Ascii.DC4, -97, 8, 85, -101, 76, -2, com.visa.cbp.getEncExpo.IResultReceiver2, 92, -38, com.google.common.base.Ascii.CAN, 70, -51, 125, 33, -80, 63, com.google.common.base.Ascii.ESC, -119, -1, -21, -124, 105, 58, -99, -41, -45, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 103, 64, -75, -34, 93, 48, -111, -79, 120, 17, 1, -27, 0, 104, -104, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -59, 2, -90, 116, 45, com.google.common.base.Ascii.VT, -94, 118, -77, -66, -50, -67, -82, -23, -118, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.FS, -20, -15, com.visa.cbp.getEncExpo.registerForActivityResult, -108, -86, -10, 38, 47, -17, -24, -116, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 3, -44, Byte.MAX_VALUE, -5, 5, -63, 94, -112, 32, kotlin.io.encoding.Base64.padSymbol, -126, -9, -22, 10, 13, 126, -8, 80, com.google.common.base.Ascii.SUB, -60, 7, 87, -72, 60, 98, -29, -56, -84, 82, 100, 16, -48, -39, 19, com.google.common.base.Ascii.FF, 18, 41, 81, -71, com.visa.cbp.getEncExpo.kernelVersion, -42, 115, -115, -127, 84, com.visa.cbp.getEncExpo.startTransaction, -19, 78, 68, -89, 42, -123, 37, -26, -54, 124, -117, 86, Byte.MIN_VALUE};
    private static final byte[] getHighSpeedVideoFpsRangesFor = {-50, -69, -21, -110, -22, -53, 19, -63, -23, 58, -42, -78, -46, -112, com.google.common.base.Ascii.ETB, -8, 66, com.google.common.base.Ascii.NAK, 86, -76, 101, com.google.common.base.Ascii.FS, -120, 67, -59, 92, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -70, -11, 87, 103, -115, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -10, 100, 88, -98, -12, 34, -86, 117, com.google.common.base.Ascii.SI, 2, -79, -33, 109, 115, 77, 124, 38, 46, -9, 8, 93, 68, 62, -97, com.google.common.base.Ascii.DC4, -56, -82, 84, 16, -40, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, com.google.common.base.Ascii.SUB, 107, 105, -13, -67, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -85, -6, -47, -101, 104, 78, com.google.common.base.Ascii.SYN, -107, -111, -18, 76, 99, -114, 91, -52, 60, com.google.common.base.Ascii.EM, -95, -127, 73, 123, -39, 111, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, com.visa.cbp.getEncExpo.IResultReceiver2, -54, -25, 43, 72, -3, -106, 69, -4, 65, 18, 13, 121, -27, -119, -116, -29, 32, 48, -36, -73, 108, 74, -75, 63, -105, -44, 98, 45, 6, -92, -91, -125, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 42, -38, -55, 0, 126, -94, 85, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 17, -43, -100, com.visa.cbp.getEncExpo.kernelVersion, 14, 10, kotlin.io.encoding.Base64.padSymbol, 81, 125, -109, com.google.common.base.Ascii.ESC, -2, -60, 71, 9, -122, com.google.common.base.Ascii.VT, -113, -99, 106, 7, -71, -80, -104, com.google.common.base.Ascii.CAN, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 113, 75, -17, 59, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -28, 64, -1, -61, -87, -26, 120, -7, -117, 70, Byte.MIN_VALUE, com.google.common.base.Ascii.RS, 56, -31, -72, -88, -32, com.google.common.base.Ascii.FF, 35, 118, com.google.common.base.Ascii.GS, 37, 36, 5, -15, 110, -108, 40, -102, -124, -24, -93, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, com.visa.cbp.getEncExpo.IResultReceiver, -45, -123, -30, 82, -14, -126, 80, 122, 47, 116, 83, -77, 97, -81, 57, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -34, -51, com.google.common.base.Ascii.US, com.visa.cbp.getEncExpo.registerForActivityResult, -84, -83, 114, 44, -35, -48, -121, -66, 94, -90, -20, 4, -58, 3, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -5, -37, 89, -74, -62, 1, com.visa.cbp.getEncExpo.onUnminimized, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -19, -89, 102, 33, Byte.MAX_VALUE, -118, 39, -57, com.visa.cbp.getEncExpo.startTransaction, 41, -41};
    private static final byte[] getHighSpeedVideoFpsRanges = {-109, -39, -102, -75, -104, 34, 69, -4, -70, 106, -33, 2, -97, -36, 81, 89, 74, com.google.common.base.Ascii.ETB, 43, -62, -108, -12, -69, -93, 98, -28, 113, -44, -51, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, com.google.common.base.Ascii.SYN, -31, 73, 60, com.visa.cbp.getEncExpo.startTransaction, -40, 92, -101, -83, -123, 83, -95, 122, -56, 45, -32, -47, 114, -90, 44, -60, -29, 118, 120, -73, -76, 9, 59, 14, 65, 76, -34, -78, -112, 37, -91, -41, 3, 17, 0, -61, 46, -110, -17, 78, 18, -99, 125, -53, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 16, -43, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -98, 77, -87, 85, -58, -48, 123, com.google.common.base.Ascii.CAN, -105, -45, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -26, 72, 86, -127, -113, com.visa.cbp.getEncExpo.IResultReceiver, -52, -100, -71, -30, -84, -72, 47, com.google.common.base.Ascii.NAK, -92, 124, -38, 56, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.VT, 5, -42, com.google.common.base.Ascii.DC4, 110, 108, 126, 102, -3, -79, -27, com.visa.cbp.getEncExpo.IResultReceiver2, -81, 94, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -121, -55, com.visa.cbp.getEncExpo.onUnminimized, 93, 109, 63, -120, -115, -57, -9, com.google.common.base.Ascii.GS, -23, -20, -19, Byte.MIN_VALUE, 41, 39, com.visa.cbp.getEncExpo.kernelVersion, com.visa.cbp.getEncExpo.registerForActivityResult, -88, 80, com.google.common.base.Ascii.SI, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 36, 40, 48, -107, -46, 62, 91, 64, -125, -77, 105, 87, com.google.common.base.Ascii.US, 7, com.google.common.base.Ascii.FS, -118, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 32, -21, -50, -114, -85, -18, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -94, 115, -7, -54, 58, com.google.common.base.Ascii.SUB, -5, 13, -63, -2, -6, -14, 111, -67, -106, -35, 67, 82, -74, 8, -13, -82, -66, com.google.common.base.Ascii.EM, -119, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 38, -80, -22, 75, 100, -124, -126, 107, -11, 121, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 1, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 117, 99, com.google.common.base.Ascii.ESC, 35, kotlin.io.encoding.Base64.padSymbol, 104, 42, 101, -24, -111, -10, -1, 19, 88, -15, 71, 10, Byte.MAX_VALUE, -59, -89, -25, 97, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 6, 70, 68, 66, 4, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -37, 57, -122, 84, -86, -116, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 33, -117, -8, com.google.common.base.Ascii.FF, 116, 103};
    private static final byte[] Camera2StreamConfigurationMap = {104, -115, -54, 77, 115, 75, 78, 42, -44, 82, 38, -77, 84, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.US, 34, 3, 70, kotlin.io.encoding.Base64.padSymbol, 45, 74, 83, -125, 19, -118, -73, -43, 37, 121, -11, -67, 88, 47, 13, 2, -19, 81, -98, 17, -14, 62, 85, 94, -47, com.google.common.base.Ascii.SYN, 60, 102, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 93, -13, 69, 64, -52, -24, -108, 86, 8, -50, com.google.common.base.Ascii.SUB, 58, -46, -31, -33, -75, 56, 110, 14, -27, -12, -7, -122, -23, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -42, -123, 35, com.visa.cbp.getEncExpo.kernelVersion, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, com.visa.cbp.getEncExpo.registerForActivityResult, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.DC4, -82, -18, -56, 72, -45, 48, -95, -110, 65, -79, com.google.common.base.Ascii.CAN, -60, 44, 113, 114, 68, com.google.common.base.Ascii.NAK, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -66, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -86, -101, -120, -40, -85, -119, -100, -6, com.visa.cbp.getEncExpo.IResultReceiver2, -22, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 98, com.google.common.base.Ascii.FF, 36, -90, -88, -20, 103, 32, -37, 124, 40, -35, -84, 91, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 126, 16, -15, 123, -113, 99, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 5, -102, 67, com.visa.cbp.getEncExpo.IResultReceiver, 33, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 39, 9, -61, -97, -74, -41, 41, -62, -21, com.visa.cbp.getEncExpo.startTransaction, -92, -117, -116, com.google.common.base.Ascii.GS, -5, -1, -63, -78, -105, 46, -8, 101, -10, 117, 7, 4, 73, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -28, -39, -71, -48, 66, -57, 108, -112, 0, -114, 111, 80, 1, -59, -38, 71, 63, -51, 105, -94, -30, 122, -89, -58, -109, com.google.common.base.Ascii.SI, 10, 6, -26, 43, -106, -93, com.google.common.base.Ascii.FS, -81, 106, 18, -124, 57, -25, -80, -126, -9, -2, -99, -121, 92, -127, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -34, -76, -91, -4, Byte.MIN_VALUE, -17, -53, -69, 107, 118, -70, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 125, 120, com.google.common.base.Ascii.VT, -107, -29, -83, 116, -104, 59, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 100, 109, -36, com.visa.cbp.getEncExpo.onUnminimized, 89, -87, 76, com.google.common.base.Ascii.ETB, Byte.MAX_VALUE, -111, -72, -55, 87, com.google.common.base.Ascii.ESC, -32, 97};
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = {-92, -94, -87, -59, 78, -55, 3, -39, 126, com.google.common.base.Ascii.SI, -46, -83, -25, -45, 39, 91, -29, -95, -24, -26, 124, 42, 85, com.google.common.base.Ascii.FF, -122, 57, -41, -115, -72, 18, 111, 40, -51, -118, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 86, 114, -7, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 115, -23, -9, 87, com.google.common.base.Ascii.SYN, -84, 80, com.visa.cbp.getEncExpo.startTransaction, -99, -73, 71, 113, com.visa.cbp.getEncExpo.IResultReceiver2, -60, 116, 67, 108, com.google.common.base.Ascii.US, -109, com.visa.cbp.getEncExpo.IResultReceiver, -36, -50, 32, -116, com.visa.cbp.getEncExpo.registerForActivityResult, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 68, 1, -11, com.google.common.base.Ascii.RS, -121, 94, 97, 44, 75, com.google.common.base.Ascii.GS, -127, com.google.common.base.Ascii.NAK, -12, 35, -42, -22, -31, 103, -15, Byte.MAX_VALUE, -2, -38, 60, 7, 83, 106, -124, -100, -53, 2, -125, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -35, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -30, 89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -104, -91, -110, 100, 4, 6, 16, 77, com.google.common.base.Ascii.FS, -105, 8, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -18, -85, 5, -81, 121, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, com.google.common.base.Ascii.CAN, 70, 109, -4, -119, -44, -57, -1, com.visa.cbp.getEncExpo.onUnminimized, com.visa.cbp.getEncExpo.kernelVersion, 66, -111, -8, 104, 10, 101, -114, -74, -3, -61, -17, 120, 76, -52, -98, 48, 46, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, com.google.common.base.Ascii.VT, 84, com.google.common.base.Ascii.SUB, -90, -69, 38, Byte.MIN_VALUE, 72, -108, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 125, -89, 63, -82, 34, kotlin.io.encoding.Base64.padSymbol, 102, -86, -10, 0, 93, -67, 74, -32, 59, -76, com.google.common.base.Ascii.ETB, -117, -97, 118, -80, 36, -102, 37, 99, -37, -21, 122, 62, 92, -77, -79, 41, -14, -54, 88, 110, -40, -88, 47, 117, -33, com.google.common.base.Ascii.DC4, -5, 19, 73, -120, -78, -20, -28, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 45, -106, -58, 58, -19, -107, 14, -27, -123, 107, 64, 33, -101, 9, com.google.common.base.Ascii.EM, 43, 82, -34, 69, -93, -6, 81, -62, -75, -47, -112, -71, -13, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -63, 13, -70, 65, 17, 56, 123, -66, -48, -43, 105, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -56, 98, com.google.common.base.Ascii.ESC, -126, -113};
    private static final byte[] getOutputMinFrameDuration = {-125, -14, 42, -21, -23, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 123, -100, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -106, -115, -104, -71, 105, -116, 41, kotlin.io.encoding.Base64.padSymbol, -120, 104, 6, 57, 17, 76, 14, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 86, 64, -110, com.google.common.base.Ascii.NAK, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -77, -36, 111, -8, 38, -70, -66, -67, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -5, -61, -2, Byte.MIN_VALUE, 97, -31, 122, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -46, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 32, -95, 69, -20, -39, com.google.common.base.Ascii.SUB, 93, -76, -40, 9, -91, 85, -114, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 118, -87, 103, 16, com.google.common.base.Ascii.ETB, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 101, -79, -107, 98, 89, 116, -93, 80, 47, 75, -56, -48, -113, -51, -44, 60, -122, 18, com.google.common.base.Ascii.GS, 35, -17, -12, 83, com.google.common.base.Ascii.EM, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -26, Byte.MAX_VALUE, 94, -42, 121, 81, 34, com.google.common.base.Ascii.DC4, -9, com.google.common.base.Ascii.RS, 74, 66, -101, 65, 115, 45, -63, 92, -90, -94, -32, 46, -45, 40, -69, -55, -82, 106, -47, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 48, -112, -124, -7, -78, 88, com.visa.cbp.getEncExpo.kernelVersion, 126, -59, -53, -105, -28, com.google.common.base.Ascii.SYN, 108, -6, -80, 109, com.google.common.base.Ascii.US, 82, com.visa.cbp.getEncExpo.registerForActivityResult, 13, 78, 3, -111, -62, 77, 100, com.visa.cbp.getEncExpo.IResultReceiver, -97, -35, -60, 73, -118, -102, 36, 56, -89, 87, -123, -57, 124, 125, -25, -10, -73, -84, 39, 70, -34, -33, 59, -41, -98, 43, com.google.common.base.Ascii.VT, -43, 19, 117, com.visa.cbp.getEncExpo.onUnminimized, 114, -74, -99, com.google.common.base.Ascii.ESC, 1, 63, 68, -27, -121, -3, 7, -15, -85, -108, com.google.common.base.Ascii.CAN, -22, -4, 58, -126, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 5, 84, -37, 0, -117, -29, 72, com.google.common.base.Ascii.FF, -54, 120, -119, 10, -1, 62, 91, -127, -18, 113, -30, -38, 44, -72, -75, -52, 110, -88, 107, -83, com.visa.cbp.getEncExpo.IResultReceiver2, -58, 8, 4, 2, -24, -11, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -92, -13, com.visa.cbp.getEncExpo.startTransaction, -50, 67, 37, com.google.common.base.Ascii.FS, 33, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, com.google.common.base.Ascii.SI, -81, 71, -19, 102, 99, -109, -86};
    private static final byte[] getInputFormats = {69, -44, com.google.common.base.Ascii.VT, 67, -15, 114, -19, -92, -62, 56, -26, 113, -3, -74, 58, -107, 80, 68, 75, -30, 116, 107, com.google.common.base.Ascii.RS, 17, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -58, -76, -40, -91, -118, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -93, -88, -6, 5, -39, -105, 64, -55, -112, -104, -113, -36, 18, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 44, 71, 106, com.visa.cbp.getEncExpo.registerForActivityResult, -82, -56, Byte.MAX_VALUE, -7, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 93, -106, 111, -12, -77, 57, 33, -38, -100, -123, -98, 59, com.visa.cbp.getEncExpo.onUnminimized, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -17, 6, -18, -27, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 32, 16, -52, 60, 84, 74, 82, -108, 14, com.visa.cbp.getEncExpo.startTransaction, 40, -10, 86, com.visa.cbp.getEncExpo.IResultReceiver2, -94, -29, com.google.common.base.Ascii.SI, -20, -99, 36, -125, 126, -43, 124, -21, com.google.common.base.Ascii.CAN, -41, -51, -35, 120, -1, -37, -95, 9, -48, 118, -124, 117, -69, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SUB, 47, -80, -2, -42, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 99, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -46, 42, 89, 109, 77, com.visa.cbp.getEncExpo.IResultReceiver, -25, -114, 97, com.visa.cbp.getEncExpo.kernelVersion, -97, -50, 39, -11, Byte.MIN_VALUE, -122, -57, -90, -5, -8, -121, -85, 98, 63, -33, 72, 0, com.google.common.base.Ascii.DC4, -102, -67, 91, 4, -110, 2, 37, 101, 76, 83, com.google.common.base.Ascii.FF, -14, 41, -81, com.google.common.base.Ascii.ETB, 108, 65, 48, -23, -109, 85, -9, -84, 104, 38, -60, 125, -54, 122, 62, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 3, -63, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 105, 102, 8, com.google.common.base.Ascii.SYN, -89, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -59, -45, 34, -73, 19, 70, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -24, 87, -120, 43, -127, -78, 78, 100, com.google.common.base.Ascii.FS, -86, -111, 88, 46, -101, 92, com.google.common.base.Ascii.ESC, 81, 115, 66, 35, 1, 110, -13, 13, -66, kotlin.io.encoding.Base64.padSymbol, 10, 45, com.google.common.base.Ascii.US, 103, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, com.google.common.base.Ascii.EM, 123, 94, -22, -34, -117, -53, -87, -116, -115, -83, 73, -126, -28, -70, -61, com.google.common.base.Ascii.NAK, -47, -32, -119, -4, -79, -71, -75, 7, 121, -72, -31};
    private static final byte[] getInputSizeshNQ4ISI = {-78, -74, 35, 17, -89, -120, -59, -90, 57, -113, -60, -24, 115, 34, 67, -61, -126, 39, -51, com.google.common.base.Ascii.CAN, 81, 98, 45, -9, 92, 14, 59, -3, -54, -101, 13, com.google.common.base.Ascii.SI, 121, -116, 16, 76, 116, com.google.common.base.Ascii.FS, 10, -114, 124, -108, 7, -57, 94, com.google.common.base.Ascii.DC4, -95, 33, 87, 80, 78, -87, Byte.MIN_VALUE, -39, -17, 100, 65, com.visa.cbp.getEncExpo.kernelVersion, 60, -18, 46, 19, 41, -70, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -82, -118, 97, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 18, -71, 85, -88, com.google.common.base.Ascii.NAK, 5, -10, 3, 6, 73, -75, 37, 9, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, 42, 56, -4, 32, -12, -27, Byte.MAX_VALUE, -41, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 43, 102, 111, -1, 114, -122, com.visa.cbp.getEncExpo.onUnminimized, -93, 47, 120, 0, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -52, -30, -80, -15, 66, -76, 48, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, com.visa.cbp.getEncExpo.IResultReceiver2, 4, -20, -91, -29, -117, -25, com.google.common.base.Ascii.GS, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -124, 123, -26, -127, -8, -34, -40, -46, com.google.common.base.Ascii.ETB, -50, 75, 71, -42, 105, 108, com.google.common.base.Ascii.EM, com.visa.cbp.getEncExpo.registerForActivityResult, -102, 1, -77, -123, -79, -7, 89, -62, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -23, -56, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -19, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -119, 104, 109, -43, 38, -111, -121, 88, -67, -55, -104, -36, 117, com.visa.cbp.getEncExpo.startTransaction, 118, -11, 103, 107, 126, -21, 82, -53, -47, 91, -97, com.google.common.base.Ascii.VT, -37, 64, -110, com.google.common.base.Ascii.SUB, -6, -84, -28, -31, 113, com.google.common.base.Ascii.US, 101, -115, -105, -98, -107, -112, 93, -73, -63, -81, 84, -5, 2, -32, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -69, 58, 77, -83, 44, kotlin.io.encoding.Base64.padSymbol, 86, 8, com.google.common.base.Ascii.ESC, 74, -109, 106, -85, -72, 122, -14, 125, -38, 63, -2, 62, -66, -22, -86, 68, -58, -48, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 72, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -106, com.visa.cbp.getEncExpo.IResultReceiver, 36, 83, -33, -13, -125, 40, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 69, com.google.common.base.Ascii.RS, -92, -45, -94, 70, 110, -100, -35, 99, -44, -99};

    private static long Camera2StreamConfigurationMap(long j) {
        long j2 = ((j << (-8)) | (j >>> 8)) ^ j;
        long j3 = (j << (-48)) | (j >>> 48);
        long j4 = (j2 ^ ((j2 << (-32)) | (j2 >>> 32))) ^ j3;
        long j5 = j4 ^ j;
        long j6 = (j << (-56)) | (j >>> 56);
        long j7 = j5 ^ j6;
        long j8 = ((j5 << (-56)) | (j5 >>> 56)) ^ ((((j7 & (-9187201950435737472L)) >>> 7) * 29) ^ ((j7 & 9187201950435737471L) << 1));
        long j9 = (((j8 & 9187201950435737471L) << 1) ^ (((j8 & (-9187201950435737472L)) >>> 7) * 29)) ^ j;
        long j10 = ((j9 << (-40)) | (j9 >>> 40)) ^ (((j5 << (-16)) | (j5 >>> 16)) ^ j);
        long j11 = ((((j10 & (-9187201950435737472L)) >>> 7) * 29) ^ ((j10 & 9187201950435737471L) << 1)) ^ (j5 ^ j3);
        long j12 = (((j11 & (-9187201950435737472L)) >>> 7) * 29) ^ ((j11 & 9187201950435737471L) << 1);
        long j13 = j12 ^ ((j4 << (-16)) | (j4 >>> 16));
        long j14 = (((j13 & (-9187201950435737472L)) >>> 7) * 29) ^ ((j13 & 9187201950435737471L) << 1);
        long j15 = ((j3 ^ (((j << (-24)) | (j >>> 24)) ^ j5)) ^ j6) ^ j14;
        long j16 = ((j ^ ((j5 << (-32)) | (j5 >>> 32))) ^ j6) ^ (((j15 & 9187201950435737471L) << 1) ^ (((j15 & (-9187201950435737472L)) >>> 7) * 29));
        long j17 = (j16 >>> 40) | (j16 << (-40));
        return j4 ^ (((j17 & 9187201950435737471L) << 1) ^ (((j17 & (-9187201950435737472L)) >>> 7) * 29));
    }

    private static long getHighSpeedVideoFpsRanges(long j) {
        long j2 = (((j & (-9187201950435737472L)) >>> 7) * 29) ^ ((j & 9187201950435737471L) << 1);
        long j3 = ((j << (-8)) | (j >>> 8)) ^ j;
        long j4 = (j3 ^ ((j3 << (-16)) | (j3 >>> 16))) ^ ((j << (-48)) | (j >>> 48));
        long j5 = (j ^ j4) ^ j2;
        long j6 = (((((-9187201950435737472L) & j5) >>> 6) * 29) ^ ((4557430888798830399L & j5) << 2)) ^ (((4629771061636907072L & j5) >>> 6) * 29);
        return ((((j6 >>> 32) | (j6 << (-32))) ^ j4) ^ ((j2 << (-40)) | (j2 >>> 40))) ^ ((j2 >>> 48) | (j2 << (-48)));
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[LOOP:0: B:22:0x005c->B:24:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[EDGE_INSN: B:25:0x006a->B:26:0x006a BREAK  A[LOOP:0: B:22:0x005c->B:24:0x0061], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    @Override // org.bouncycastle.crypto.BlockCipher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        int i;
        int i2;
        long[][] jArr;
        int i3;
        int i4;
        int i5;
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            throw new java.lang.IllegalArgumentException("Invalid parameter passed to DSTU7624Engine init");
        }
        this.getHighSpeedVideoSizesFor = z;
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        int length = key.length << 3;
        int i6 = this.getOutputSizeshNQ4ISI << 6;
        if (length != 128 && length != 256 && length != 512) {
            throw new java.lang.IllegalArgumentException("unsupported key length: only 128/256/512 are allowed");
        }
        if (length != i6 && length != i6 * 2) {
            throw new java.lang.IllegalArgumentException("Unsupported key length");
        }
        if (length == 128) {
            i = 10;
        } else {
            if (length != 256) {
                if (length == 512) {
                    i = 18;
                }
                this.getOutputMinFrameDurationlomOqCM = length >>> 6;
                this.getOutputStallDuration = new long[this.getOutputStallDurationlomOqCM + 1][];
                i2 = 0;
                while (true) {
                    jArr = this.getOutputStallDuration;
                    if (i2 < jArr.length) {
                        break;
                    }
                    jArr[i2] = new long[this.getOutputSizeshNQ4ISI];
                    i2++;
                }
                long[] jArr2 = new long[this.getOutputMinFrameDurationlomOqCM];
                this.getOutputSizes = jArr2;
                if (key.length == (length >>> 3)) {
                    throw new java.lang.IllegalArgumentException("Invalid key parameter passed to DSTU7624Engine init");
                }
                org.bouncycastle.util.Pack.littleEndianToLong(key, 0, jArr2);
                int i7 = this.getOutputSizeshNQ4ISI;
                long[] jArr3 = new long[i7];
                long[] jArr4 = this.getOutputSizes;
                long[] jArr5 = new long[i7];
                long[] jArr6 = new long[i7];
                long[] jArr7 = new long[i7];
                this.getOutputFormats = jArr7;
                long j = jArr7[0];
                int i8 = this.getOutputMinFrameDurationlomOqCM;
                jArr7[0] = j + i7 + i8 + 1;
                java.lang.System.arraycopy(jArr4, 0, jArr5, 0, i7);
                if (i7 == i8) {
                    java.lang.System.arraycopy(jArr4, 0, jArr6, 0, i7);
                } else {
                    int i9 = this.getOutputSizeshNQ4ISI;
                    java.lang.System.arraycopy(jArr4, i9, jArr6, 0, i9);
                }
                int i10 = 0;
                while (true) {
                    long[] jArr8 = this.getOutputFormats;
                    if (i10 >= jArr8.length) {
                        break;
                    }
                    jArr8[i10] = jArr8[i10] + jArr5[i10];
                    i10++;
                }
                getHighSpeedVideoFpsRanges();
                Camera2StreamConfigurationMap();
                for (int i11 = 0; i11 < this.getOutputSizeshNQ4ISI; i11++) {
                    long[] jArr9 = this.getOutputFormats;
                    jArr9[i11] = getHighSpeedVideoFpsRanges(jArr9[i11]);
                }
                int i12 = 0;
                while (true) {
                    long[] jArr10 = this.getOutputFormats;
                    if (i12 >= jArr10.length) {
                        break;
                    }
                    jArr10[i12] = jArr10[i12] ^ jArr6[i12];
                    i12++;
                }
                getHighSpeedVideoFpsRanges();
                Camera2StreamConfigurationMap();
                for (int i13 = 0; i13 < this.getOutputSizeshNQ4ISI; i13++) {
                    long[] jArr11 = this.getOutputFormats;
                    jArr11[i13] = getHighSpeedVideoFpsRanges(jArr11[i13]);
                }
                int i14 = 0;
                while (true) {
                    long[] jArr12 = this.getOutputFormats;
                    if (i14 >= jArr12.length) {
                        break;
                    }
                    jArr12[i14] = jArr12[i14] + jArr5[i14];
                    i14++;
                }
                getHighSpeedVideoFpsRanges();
                Camera2StreamConfigurationMap();
                int i15 = 0;
                while (true) {
                    i3 = this.getOutputSizeshNQ4ISI;
                    if (i15 >= i3) {
                        break;
                    }
                    long[] jArr13 = this.getOutputFormats;
                    jArr13[i15] = getHighSpeedVideoFpsRanges(jArr13[i15]);
                    i15++;
                }
                java.lang.System.arraycopy(this.getOutputFormats, 0, jArr3, 0, i3);
                long[] jArr14 = this.getOutputSizes;
                int i16 = this.getOutputMinFrameDurationlomOqCM;
                long[] jArr15 = new long[i16];
                long[] jArr16 = new long[this.getOutputSizeshNQ4ISI];
                java.lang.System.arraycopy(jArr14, 0, jArr15, 0, i16);
                long j2 = 281479271743489L;
                int i17 = 0;
                while (true) {
                    for (int i18 = 0; i18 < this.getOutputSizeshNQ4ISI; i18++) {
                        jArr16[i18] = jArr3[i18] + j2;
                    }
                    for (int i19 = 0; i19 < this.getOutputSizeshNQ4ISI; i19++) {
                        this.getOutputFormats[i19] = jArr15[i19] + jArr16[i19];
                    }
                    getHighSpeedVideoFpsRanges();
                    Camera2StreamConfigurationMap();
                    for (int i20 = 0; i20 < this.getOutputSizeshNQ4ISI; i20++) {
                        long[] jArr17 = this.getOutputFormats;
                        jArr17[i20] = getHighSpeedVideoFpsRanges(jArr17[i20]);
                    }
                    for (int i21 = 0; i21 < this.getOutputSizeshNQ4ISI; i21++) {
                        long[] jArr18 = this.getOutputFormats;
                        jArr18[i21] = jArr18[i21] ^ jArr16[i21];
                    }
                    getHighSpeedVideoFpsRanges();
                    Camera2StreamConfigurationMap();
                    for (int i22 = 0; i22 < this.getOutputSizeshNQ4ISI; i22++) {
                        long[] jArr19 = this.getOutputFormats;
                        jArr19[i22] = getHighSpeedVideoFpsRanges(jArr19[i22]);
                    }
                    int i23 = 0;
                    while (true) {
                        i4 = this.getOutputSizeshNQ4ISI;
                        if (i23 >= i4) {
                            break;
                        }
                        long[] jArr20 = this.getOutputFormats;
                        jArr20[i23] = jArr20[i23] + jArr16[i23];
                        i23++;
                    }
                    java.lang.System.arraycopy(this.getOutputFormats, 0, this.getOutputStallDuration[i17], 0, i4);
                    if (this.getOutputStallDurationlomOqCM == i17) {
                        break;
                    }
                    if (this.getOutputSizeshNQ4ISI != this.getOutputMinFrameDurationlomOqCM) {
                        i17 += 2;
                        j2 <<= 1;
                        for (int i24 = 0; i24 < this.getOutputSizeshNQ4ISI; i24++) {
                            jArr16[i24] = jArr3[i24] + j2;
                        }
                        int i25 = 0;
                        while (true) {
                            int i26 = this.getOutputSizeshNQ4ISI;
                            if (i25 >= i26) {
                                break;
                            }
                            this.getOutputFormats[i25] = jArr15[i26 + i25] + jArr16[i25];
                            i25++;
                        }
                        getHighSpeedVideoFpsRanges();
                        Camera2StreamConfigurationMap();
                        for (int i27 = 0; i27 < this.getOutputSizeshNQ4ISI; i27++) {
                            long[] jArr21 = this.getOutputFormats;
                            jArr21[i27] = getHighSpeedVideoFpsRanges(jArr21[i27]);
                        }
                        for (int i28 = 0; i28 < this.getOutputSizeshNQ4ISI; i28++) {
                            long[] jArr22 = this.getOutputFormats;
                            jArr22[i28] = jArr22[i28] ^ jArr16[i28];
                        }
                        getHighSpeedVideoFpsRanges();
                        Camera2StreamConfigurationMap();
                        for (int i29 = 0; i29 < this.getOutputSizeshNQ4ISI; i29++) {
                            long[] jArr23 = this.getOutputFormats;
                            jArr23[i29] = getHighSpeedVideoFpsRanges(jArr23[i29]);
                        }
                        int i30 = 0;
                        while (true) {
                            i5 = this.getOutputSizeshNQ4ISI;
                            if (i30 >= i5) {
                                break;
                            }
                            long[] jArr24 = this.getOutputFormats;
                            jArr24[i30] = jArr24[i30] + jArr16[i30];
                            i30++;
                        }
                        java.lang.System.arraycopy(this.getOutputFormats, 0, this.getOutputStallDuration[i17], 0, i5);
                        if (this.getOutputStallDurationlomOqCM == i17) {
                            break;
                        }
                    }
                    i17 += 2;
                    j2 <<= 1;
                    long j3 = jArr15[0];
                    for (int i31 = 1; i31 < i16; i31++) {
                        jArr15[i31 - 1] = jArr15[i31];
                    }
                    jArr15[i16 - 1] = j3;
                }
                for (int i32 = 1; i32 < this.getOutputStallDurationlomOqCM; i32 += 2) {
                    long[][] jArr25 = this.getOutputStallDuration;
                    long[] jArr26 = jArr25[i32 - 1];
                    long[] jArr27 = jArr25[i32];
                    int i33 = this.getOutputSizeshNQ4ISI;
                    if (i33 == 2) {
                        long j4 = jArr26[0];
                        long j5 = jArr26[1];
                        jArr27[0] = (j4 >>> 56) | (j5 << 8);
                        jArr27[1] = (j4 << 8) | (j5 >>> 56);
                    } else if (i33 == 4) {
                        long j6 = jArr26[0];
                        long j7 = jArr26[1];
                        long j8 = jArr26[2];
                        long j9 = jArr26[3];
                        jArr27[0] = (j7 >>> 24) | (j8 << 40);
                        jArr27[1] = (j8 >>> 24) | (j9 << 40);
                        jArr27[2] = (j9 >>> 24) | (j6 << 40);
                        jArr27[3] = (j6 >>> 24) | (j7 << 40);
                    } else {
                        if (i33 != 8) {
                            throw new java.lang.IllegalStateException("unsupported block length: only 128/256/512 are allowed");
                        }
                        long j10 = jArr26[0];
                        long j11 = jArr26[1];
                        long j12 = jArr26[2];
                        long j13 = jArr26[3];
                        long j14 = jArr26[4];
                        long j15 = jArr26[5];
                        long j16 = jArr26[6];
                        long j17 = jArr26[7];
                        jArr27[0] = (j12 >>> 24) | (j13 << 40);
                        jArr27[1] = (j13 >>> 24) | (j14 << 40);
                        jArr27[2] = (j14 >>> 24) | (j15 << 40);
                        jArr27[3] = (j15 >>> 24) | (j16 << 40);
                        jArr27[4] = (j16 >>> 24) | (j17 << 40);
                        jArr27[5] = (j17 >>> 24) | (j10 << 40);
                        jArr27[6] = (j10 >>> 24) | (j11 << 40);
                        jArr27[7] = (j11 >>> 24) | (j12 << 40);
                    }
                }
                return;
            }
            i = 14;
        }
        this.getOutputStallDurationlomOqCM = i;
        this.getOutputMinFrameDurationlomOqCM = length >>> 6;
        this.getOutputStallDuration = new long[this.getOutputStallDurationlomOqCM + 1][];
        i2 = 0;
        while (true) {
            jArr = this.getOutputStallDuration;
            if (i2 < jArr.length) {
            }
            jArr[i2] = new long[this.getOutputSizeshNQ4ISI];
            i2++;
        }
        long[] jArr28 = new long[this.getOutputMinFrameDurationlomOqCM];
        this.getOutputSizes = jArr28;
        if (key.length == (length >>> 3)) {
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        long j;
        long j2;
        long[][] jArr;
        int i3;
        long highSpeedVideoFpsRanges;
        long highSpeedVideoFpsRanges2;
        int i4;
        int i5;
        if (this.getOutputSizes == null) {
            throw new java.lang.IllegalStateException("DSTU7624Engine not initialised");
        }
        if (getBlockSize() + i > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("Input buffer too short");
        }
        if (getBlockSize() + i2 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("Output buffer too short");
        }
        int i6 = 2;
        char c = ' ';
        int i7 = 8;
        if (this.getHighSpeedVideoSizesFor) {
            if (this.getOutputSizeshNQ4ISI != 2) {
                org.bouncycastle.util.Pack.littleEndianToLong(bArr, i, this.getOutputFormats);
                Camera2StreamConfigurationMap(0);
                int i8 = 0;
                while (true) {
                    getHighSpeedVideoFpsRanges();
                    Camera2StreamConfigurationMap();
                    for (int i9 = 0; i9 < this.getOutputSizeshNQ4ISI; i9++) {
                        long[] jArr2 = this.getOutputFormats;
                        jArr2[i9] = getHighSpeedVideoFpsRanges(jArr2[i9]);
                    }
                    i8++;
                    i5 = this.getOutputStallDurationlomOqCM;
                    if (i8 == i5) {
                        break;
                    }
                    getHighSpeedVideoFpsRanges(i8);
                }
                Camera2StreamConfigurationMap(i5);
                org.bouncycastle.util.Pack.longToLittleEndian(this.getOutputFormats, bArr2, i2);
            } else {
                long littleEndianToLong = org.bouncycastle.util.Pack.littleEndianToLong(bArr, i);
                long littleEndianToLong2 = org.bouncycastle.util.Pack.littleEndianToLong(bArr, i + 8);
                long[] jArr3 = this.getOutputStallDuration[0];
                long j3 = littleEndianToLong + jArr3[0];
                long j4 = littleEndianToLong2 + jArr3[1];
                int i10 = 0;
                while (true) {
                    int i11 = (int) j3;
                    int i12 = (int) (j3 >>> c);
                    int i13 = (int) j4;
                    int i14 = (int) (j4 >>> c);
                    byte[] bArr3 = getHighSpeedVideoSizes;
                    byte b = bArr3[i11 & 255];
                    byte[] bArr4 = getHighSpeedVideoFpsRangesFor;
                    byte b2 = bArr4[(i11 >>> 8) & 255];
                    byte[] bArr5 = getHighSpeedVideoFpsRanges;
                    byte b3 = bArr5[(i11 >>> 16) & 255];
                    byte[] bArr6 = Camera2StreamConfigurationMap;
                    byte b4 = bArr6[i11 >>> 24];
                    byte b5 = bArr3[i14 & 255];
                    byte b6 = bArr4[(i14 >>> 8) & 255];
                    byte b7 = bArr5[(i14 >>> 16) & 255];
                    byte b8 = bArr6[i14 >>> 24];
                    long j5 = (b4 << com.google.common.base.Ascii.CAN) | ((b3 & 255) << 16) | ((b2 & 255) << i7) | (b & 255);
                    long j6 = (b8 << com.google.common.base.Ascii.CAN) | ((b6 & 255) << i7) | (b5 & 255) | ((b7 & 255) << 16);
                    byte b9 = bArr3[i13 & 255];
                    byte b10 = bArr4[(i13 >>> 8) & 255];
                    byte b11 = bArr5[(i13 >>> 16) & 255];
                    byte b12 = bArr6[i13 >>> 24];
                    byte b13 = bArr3[i12 & 255];
                    byte b14 = bArr4[(i12 >>> 8) & 255];
                    byte b15 = bArr5[(i12 >>> 16) & 255];
                    byte b16 = bArr6[i12 >>> 24];
                    long j7 = (b9 & 255) | ((b10 & 255) << 8) | ((b11 & 255) << 16) | (b12 << com.google.common.base.Ascii.CAN);
                    long j8 = (b16 << com.google.common.base.Ascii.CAN) | (b13 & 255) | ((b14 & 255) << 8) | ((b15 & 255) << 16);
                    highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((j6 << 32) | (j5 & 4294967295L));
                    highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges((j8 << 32) | (j7 & 4294967295L));
                    i10++;
                    i4 = this.getOutputStallDurationlomOqCM;
                    if (i10 == i4) {
                        break;
                    }
                    long[] jArr4 = this.getOutputStallDuration[i10];
                    long j9 = jArr4[0];
                    j4 = highSpeedVideoFpsRanges2 ^ jArr4[1];
                    j3 = highSpeedVideoFpsRanges ^ j9;
                    c = ' ';
                    i7 = 8;
                }
                long[] jArr5 = this.getOutputStallDuration[i4];
                long j10 = jArr5[0];
                long j11 = jArr5[1];
                org.bouncycastle.util.Pack.longToLittleEndian(highSpeedVideoFpsRanges + j10, bArr2, i2);
                org.bouncycastle.util.Pack.longToLittleEndian(highSpeedVideoFpsRanges2 + j11, bArr2, i2 + 8);
            }
        } else if (this.getOutputSizeshNQ4ISI != 2) {
            org.bouncycastle.util.Pack.littleEndianToLong(bArr, i, this.getOutputFormats);
            getHighResolutionOutputSizeshNQ4ISI(this.getOutputStallDurationlomOqCM);
            int i15 = this.getOutputStallDurationlomOqCM;
            while (true) {
                int i16 = 0;
                while (true) {
                    i3 = this.getOutputSizeshNQ4ISI;
                    if (i16 >= i3) {
                        break;
                    }
                    long[] jArr6 = this.getOutputFormats;
                    jArr6[i16] = Camera2StreamConfigurationMap(jArr6[i16]);
                    i16++;
                }
                if (i3 == i6) {
                    long[] jArr7 = this.getOutputFormats;
                    long j12 = jArr7[0];
                    long j13 = jArr7[1];
                    long j14 = (j12 ^ j13) & (-4294967296L);
                    jArr7[0] = j12 ^ j14;
                    jArr7[1] = j14 ^ j13;
                } else if (i3 == 4) {
                    long[] jArr8 = this.getOutputFormats;
                    long j15 = jArr8[0];
                    long j16 = jArr8[1];
                    long j17 = jArr8[i6];
                    long j18 = jArr8[3];
                    long j19 = (j15 ^ j16) & (-281470681808896L);
                    long j20 = j15 ^ j19;
                    long j21 = j16 ^ j19;
                    long j22 = (j17 ^ j18) & (-281470681808896L);
                    long j23 = j17 ^ j22;
                    long j24 = j18 ^ j22;
                    long j25 = (j20 ^ j23) & (-4294967296L);
                    long j26 = (j21 ^ j24) & 281474976645120L;
                    jArr8[0] = j20 ^ j25;
                    jArr8[1] = j21 ^ j26;
                    jArr8[i6] = j23 ^ j25;
                    jArr8[3] = j26 ^ j24;
                } else {
                    if (i3 != 8) {
                        throw new java.lang.IllegalStateException("unsupported block length: only 128/256/512 are allowed");
                    }
                    long[] jArr9 = this.getOutputFormats;
                    long j27 = jArr9[0];
                    long j28 = jArr9[1];
                    long j29 = jArr9[i6];
                    long j30 = jArr9[3];
                    long j31 = jArr9[4];
                    long j32 = jArr9[5];
                    long j33 = jArr9[6];
                    long j34 = jArr9[7];
                    long j35 = (j27 ^ j28) & (-71777214294589696L);
                    long j36 = j27 ^ j35;
                    long j37 = j28 ^ j35;
                    long j38 = (j29 ^ j30) & (-71777214294589696L);
                    long j39 = j29 ^ j38;
                    long j40 = j30 ^ j38;
                    long j41 = (j31 ^ j32) & (-71777214294589696L);
                    long j42 = j31 ^ j41;
                    long j43 = j32 ^ j41;
                    long j44 = (j33 ^ j34) & (-71777214294589696L);
                    long j45 = j33 ^ j44;
                    long j46 = j34 ^ j44;
                    long j47 = (j36 ^ j39) & (-281470681808896L);
                    long j48 = j36 ^ j47;
                    long j49 = j39 ^ j47;
                    long j50 = (j37 ^ j40) & 72056494543077120L;
                    long j51 = j37 ^ j50;
                    long j52 = j40 ^ j50;
                    long j53 = (j42 ^ j45) & (-281470681808896L);
                    long j54 = j42 ^ j53;
                    long j55 = j45 ^ j53;
                    long j56 = (j43 ^ j46) & 72056494543077120L;
                    long j57 = j43 ^ j56;
                    long j58 = j46 ^ j56;
                    long j59 = (j48 ^ j54) & (-4294967296L);
                    long j60 = (j51 ^ j57) & 72057594021150720L;
                    long j61 = (j49 ^ j55) & 281474976645120L;
                    long j62 = (j52 ^ j58) & 1099511627520L;
                    jArr9[0] = j48 ^ j59;
                    jArr9[1] = j51 ^ j60;
                    jArr9[i6] = j49 ^ j61;
                    jArr9[3] = j52 ^ j62;
                    jArr9[4] = j54 ^ j59;
                    jArr9[5] = j57 ^ j60;
                    jArr9[6] = j61 ^ j55;
                    jArr9[7] = j58 ^ j62;
                }
                for (int i17 = 0; i17 < this.getOutputSizeshNQ4ISI; i17++) {
                    long[] jArr10 = this.getOutputFormats;
                    long j63 = jArr10[i17];
                    int i18 = (int) j63;
                    int i19 = (int) (j63 >>> 32);
                    byte[] bArr7 = getHighResolutionOutputSizeshNQ4ISI;
                    byte b17 = bArr7[i18 & 255];
                    byte[] bArr8 = getOutputMinFrameDuration;
                    byte b18 = bArr8[(i18 >>> 8) & 255];
                    byte[] bArr9 = getInputFormats;
                    byte b19 = bArr9[(i18 >>> 16) & 255];
                    byte[] bArr10 = getInputSizeshNQ4ISI;
                    byte b20 = bArr10[i18 >>> 24];
                    byte b21 = bArr7[i19 & 255];
                    byte b22 = bArr8[(i19 >>> 8) & 255];
                    byte b23 = bArr9[(i19 >>> 16) & 255];
                    byte b24 = bArr10[i19 >>> 24];
                    jArr10[i17] = (((b24 << com.google.common.base.Ascii.CAN) | (((b21 & 255) | ((b22 & 255) << 8)) | ((b23 & 255) << 16))) << 32) | (((b20 << com.google.common.base.Ascii.CAN) | (b17 & 255) | ((b18 & 255) << 8) | ((b19 & 255) << 16)) & 4294967295L);
                }
                i15--;
                if (i15 == 0) {
                    getHighResolutionOutputSizeshNQ4ISI(0);
                    org.bouncycastle.util.Pack.longToLittleEndian(this.getOutputFormats, bArr2, i2);
                    break;
                }
                getHighSpeedVideoFpsRanges(i15);
                i6 = 2;
            }
        } else {
            long littleEndianToLong3 = org.bouncycastle.util.Pack.littleEndianToLong(bArr, i);
            long littleEndianToLong4 = org.bouncycastle.util.Pack.littleEndianToLong(bArr, i + 8);
            long[][] jArr11 = this.getOutputStallDuration;
            int i20 = this.getOutputStallDurationlomOqCM;
            long[] jArr12 = jArr11[i20];
            long j64 = littleEndianToLong3 - jArr12[0];
            long j65 = littleEndianToLong4 - jArr12[1];
            while (true) {
                long Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(j64);
                long Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(j65);
                int i21 = (int) Camera2StreamConfigurationMap2;
                int i22 = (int) (Camera2StreamConfigurationMap2 >>> 32);
                int i23 = (int) Camera2StreamConfigurationMap3;
                int i24 = (int) (Camera2StreamConfigurationMap3 >>> 32);
                byte[] bArr11 = getHighResolutionOutputSizeshNQ4ISI;
                byte b25 = bArr11[i21 & 255];
                byte[] bArr12 = getOutputMinFrameDuration;
                byte b26 = bArr12[(i21 >>> 8) & 255];
                byte[] bArr13 = getInputFormats;
                byte b27 = bArr13[(i21 >>> 16) & 255];
                byte[] bArr14 = getInputSizeshNQ4ISI;
                byte b28 = bArr14[i21 >>> 24];
                byte b29 = bArr11[i24 & 255];
                byte b30 = bArr12[(i24 >>> 8) & 255];
                byte b31 = bArr13[(i24 >>> 16) & 255];
                byte b32 = bArr14[i24 >>> 24];
                int i25 = i20;
                j = (((b32 << com.google.common.base.Ascii.CAN) | ((((b30 & 255) << 8) | (b29 & 255)) | ((b31 & 255) << 16))) << 32) | (((b28 << com.google.common.base.Ascii.CAN) | (b25 & 255) | ((b26 & 255) << 8) | ((b27 & 255) << 16)) & 4294967295L);
                byte b33 = bArr11[i23 & 255];
                byte b34 = bArr12[(i23 >>> 8) & 255];
                byte b35 = bArr13[(i23 >>> 16) & 255];
                byte b36 = bArr14[i23 >>> 24];
                byte b37 = bArr11[i22 & 255];
                byte b38 = bArr12[(i22 >>> 8) & 255];
                byte b39 = bArr13[(i22 >>> 16) & 255];
                byte b40 = bArr14[i22 >>> 24];
                j2 = (((b40 << com.google.common.base.Ascii.CAN) | (((b37 & 255) | ((b38 & 255) << 8)) | ((b39 & 255) << 16))) << 32) | (((b33 & 255) | ((b34 & 255) << 8) | ((b35 & 255) << 16) | (b36 << com.google.common.base.Ascii.CAN)) & 4294967295L);
                i20 = i25 - 1;
                jArr = this.getOutputStallDuration;
                if (i20 == 0) {
                    break;
                }
                long[] jArr13 = jArr[i20];
                long j66 = jArr13[0];
                j65 = j2 ^ jArr13[1];
                j64 = j ^ j66;
            }
            long[] jArr14 = jArr[0];
            long j67 = jArr14[0];
            long j68 = jArr14[1];
            org.bouncycastle.util.Pack.longToLittleEndian(j - j67, bArr2, i2);
            org.bouncycastle.util.Pack.longToLittleEndian(j2 - j68, bArr2, i2 + 8);
        }
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        org.bouncycastle.util.Arrays.fill(this.getOutputFormats, 0L);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.getOutputSizeshNQ4ISI << 3;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "DSTU7624";
    }

    private void getHighSpeedVideoFpsRanges(int i) {
        long[] jArr = this.getOutputStallDuration[i];
        for (int i2 = 0; i2 < this.getOutputSizeshNQ4ISI; i2++) {
            long[] jArr2 = this.getOutputFormats;
            jArr2[i2] = jArr2[i2] ^ jArr[i2];
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(int i) {
        long[] jArr = this.getOutputStallDuration[i];
        for (int i2 = 0; i2 < this.getOutputSizeshNQ4ISI; i2++) {
            long[] jArr2 = this.getOutputFormats;
            jArr2[i2] = jArr2[i2] - jArr[i2];
        }
    }

    private void getHighSpeedVideoFpsRanges() {
        for (int i = 0; i < this.getOutputSizeshNQ4ISI; i++) {
            long[] jArr = this.getOutputFormats;
            long j = jArr[i];
            int i2 = (int) j;
            int i3 = (int) (j >>> 32);
            byte[] bArr = getHighSpeedVideoSizes;
            byte b = bArr[i2 & 255];
            byte[] bArr2 = getHighSpeedVideoFpsRangesFor;
            byte b2 = bArr2[(i2 >>> 8) & 255];
            byte[] bArr3 = getHighSpeedVideoFpsRanges;
            byte b3 = bArr3[(i2 >>> 16) & 255];
            byte[] bArr4 = Camera2StreamConfigurationMap;
            byte b4 = bArr4[i2 >>> 24];
            byte b5 = bArr[i3 & 255];
            byte b6 = bArr2[(i3 >>> 8) & 255];
            byte b7 = bArr3[(i3 >>> 16) & 255];
            byte b8 = bArr4[i3 >>> 24];
            jArr[i] = (((b8 << com.google.common.base.Ascii.CAN) | (((b5 & 255) | ((b6 & 255) << 8)) | ((b7 & 255) << 16))) << 32) | (((b4 << com.google.common.base.Ascii.CAN) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16)) & 4294967295L);
        }
    }

    private void Camera2StreamConfigurationMap() {
        int i = this.getOutputSizeshNQ4ISI;
        if (i == 2) {
            long[] jArr = this.getOutputFormats;
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = (-4294967296L) & (j ^ j2);
            jArr[0] = j ^ j3;
            jArr[1] = j3 ^ j2;
            return;
        }
        if (i == 4) {
            long[] jArr2 = this.getOutputFormats;
            long j4 = jArr2[0];
            long j5 = jArr2[1];
            long j6 = jArr2[2];
            long j7 = jArr2[3];
            long j8 = (j4 ^ j6) & (-4294967296L);
            long j9 = j4 ^ j8;
            long j10 = j6 ^ j8;
            long j11 = (j5 ^ j7) & 281474976645120L;
            long j12 = j5 ^ j11;
            long j13 = j7 ^ j11;
            long j14 = (j9 ^ j12) & (-281470681808896L);
            long j15 = (j10 ^ j13) & (-281470681808896L);
            jArr2[0] = j9 ^ j14;
            jArr2[1] = j12 ^ j14;
            jArr2[2] = j10 ^ j15;
            jArr2[3] = j13 ^ j15;
            return;
        }
        if (i != 8) {
            throw new java.lang.IllegalStateException("unsupported block length: only 128/256/512 are allowed");
        }
        long[] jArr3 = this.getOutputFormats;
        long j16 = jArr3[0];
        long j17 = jArr3[1];
        long j18 = jArr3[2];
        long j19 = jArr3[3];
        long j20 = jArr3[4];
        long j21 = jArr3[5];
        long j22 = jArr3[6];
        long j23 = jArr3[7];
        long j24 = (j16 ^ j20) & (-4294967296L);
        long j25 = j16 ^ j24;
        long j26 = j20 ^ j24;
        long j27 = (j17 ^ j21) & 72057594021150720L;
        long j28 = j17 ^ j27;
        long j29 = j21 ^ j27;
        long j30 = (j18 ^ j22) & 281474976645120L;
        long j31 = j18 ^ j30;
        long j32 = j22 ^ j30;
        long j33 = (j19 ^ j23) & 1099511627520L;
        long j34 = j19 ^ j33;
        long j35 = j23 ^ j33;
        long j36 = (j25 ^ j31) & (-281470681808896L);
        long j37 = j25 ^ j36;
        long j38 = j31 ^ j36;
        long j39 = (j28 ^ j34) & 72056494543077120L;
        long j40 = j28 ^ j39;
        long j41 = j34 ^ j39;
        long j42 = (j26 ^ j32) & (-281470681808896L);
        long j43 = j26 ^ j42;
        long j44 = j32 ^ j42;
        long j45 = (j29 ^ j35) & 72056494543077120L;
        long j46 = j29 ^ j45;
        long j47 = j35 ^ j45;
        long j48 = (j37 ^ j40) & (-71777214294589696L);
        long j49 = (j38 ^ j41) & (-71777214294589696L);
        long j50 = (j43 ^ j46) & (-71777214294589696L);
        long j51 = (j44 ^ j47) & (-71777214294589696L);
        jArr3[0] = j37 ^ j48;
        jArr3[1] = j40 ^ j48;
        jArr3[2] = j38 ^ j49;
        jArr3[3] = j41 ^ j49;
        jArr3[4] = j43 ^ j50;
        jArr3[5] = j46 ^ j50;
        jArr3[6] = j44 ^ j51;
        jArr3[7] = j47 ^ j51;
    }

    private void Camera2StreamConfigurationMap(int i) {
        long[] jArr = this.getOutputStallDuration[i];
        for (int i2 = 0; i2 < this.getOutputSizeshNQ4ISI; i2++) {
            long[] jArr2 = this.getOutputFormats;
            jArr2[i2] = jArr2[i2] + jArr[i2];
        }
    }

    public DSTU7624Engine(int i) throws java.lang.IllegalArgumentException {
        if (i != 128 && i != 256 && i != 512) {
            throw new java.lang.IllegalArgumentException("unsupported block length: only 128/256/512 are allowed");
        }
        int i2 = i >>> 6;
        this.getOutputSizeshNQ4ISI = i2;
        this.getOutputFormats = new long[i2];
    }
}
