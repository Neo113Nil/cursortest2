package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class Haraka512Digest extends org.bouncycastle.crypto.digests.HarakaBase {
    private static byte[][] getHighSpeedVideoFpsRangesFor;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        if (this.getHighResolutionOutputSizeshNQ4ISI != 64) {
            throw new java.lang.IllegalStateException("input must be exactly 64 bytes");
        }
        if (bArr.length - i < 32) {
            throw new java.lang.IllegalArgumentException("output too short to receive digest");
        }
        byte[] bArr2 = this.getHighSpeedVideoSizes;
        byte[][] bArr3 = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, 4, 16);
        byte[][] bArr4 = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, 4, 16);
        java.lang.System.arraycopy(bArr2, 0, bArr3[0], 0, 16);
        java.lang.System.arraycopy(bArr2, 16, bArr3[1], 0, 16);
        java.lang.System.arraycopy(bArr2, 32, bArr3[2], 0, 16);
        java.lang.System.arraycopy(bArr2, 48, bArr3[3], 0, 16);
        bArr3[0] = getHighSpeedVideoSizes(bArr3[0], getHighSpeedVideoFpsRangesFor[0]);
        bArr3[1] = getHighSpeedVideoSizes(bArr3[1], getHighSpeedVideoFpsRangesFor[1]);
        bArr3[2] = getHighSpeedVideoSizes(bArr3[2], getHighSpeedVideoFpsRangesFor[2]);
        bArr3[3] = getHighSpeedVideoSizes(bArr3[3], getHighSpeedVideoFpsRangesFor[3]);
        bArr3[0] = getHighSpeedVideoSizes(bArr3[0], getHighSpeedVideoFpsRangesFor[4]);
        bArr3[1] = getHighSpeedVideoSizes(bArr3[1], getHighSpeedVideoFpsRangesFor[5]);
        bArr3[2] = getHighSpeedVideoSizes(bArr3[2], getHighSpeedVideoFpsRangesFor[6]);
        bArr3[3] = getHighSpeedVideoSizes(bArr3[3], getHighSpeedVideoFpsRangesFor[7]);
        getHighResolutionOutputSizeshNQ4ISI(bArr3, bArr4);
        bArr3[0] = getHighSpeedVideoSizes(bArr4[0], getHighSpeedVideoFpsRangesFor[8]);
        bArr3[1] = getHighSpeedVideoSizes(bArr4[1], getHighSpeedVideoFpsRangesFor[9]);
        bArr3[2] = getHighSpeedVideoSizes(bArr4[2], getHighSpeedVideoFpsRangesFor[10]);
        bArr3[3] = getHighSpeedVideoSizes(bArr4[3], getHighSpeedVideoFpsRangesFor[11]);
        bArr3[0] = getHighSpeedVideoSizes(bArr3[0], getHighSpeedVideoFpsRangesFor[12]);
        bArr3[1] = getHighSpeedVideoSizes(bArr3[1], getHighSpeedVideoFpsRangesFor[13]);
        bArr3[2] = getHighSpeedVideoSizes(bArr3[2], getHighSpeedVideoFpsRangesFor[14]);
        bArr3[3] = getHighSpeedVideoSizes(bArr3[3], getHighSpeedVideoFpsRangesFor[15]);
        getHighResolutionOutputSizeshNQ4ISI(bArr3, bArr4);
        bArr3[0] = getHighSpeedVideoSizes(bArr4[0], getHighSpeedVideoFpsRangesFor[16]);
        bArr3[1] = getHighSpeedVideoSizes(bArr4[1], getHighSpeedVideoFpsRangesFor[17]);
        bArr3[2] = getHighSpeedVideoSizes(bArr4[2], getHighSpeedVideoFpsRangesFor[18]);
        bArr3[3] = getHighSpeedVideoSizes(bArr4[3], getHighSpeedVideoFpsRangesFor[19]);
        bArr3[0] = getHighSpeedVideoSizes(bArr3[0], getHighSpeedVideoFpsRangesFor[20]);
        bArr3[1] = getHighSpeedVideoSizes(bArr3[1], getHighSpeedVideoFpsRangesFor[21]);
        bArr3[2] = getHighSpeedVideoSizes(bArr3[2], getHighSpeedVideoFpsRangesFor[22]);
        bArr3[3] = getHighSpeedVideoSizes(bArr3[3], getHighSpeedVideoFpsRangesFor[23]);
        getHighResolutionOutputSizeshNQ4ISI(bArr3, bArr4);
        bArr3[0] = getHighSpeedVideoSizes(bArr4[0], getHighSpeedVideoFpsRangesFor[24]);
        bArr3[1] = getHighSpeedVideoSizes(bArr4[1], getHighSpeedVideoFpsRangesFor[25]);
        bArr3[2] = getHighSpeedVideoSizes(bArr4[2], getHighSpeedVideoFpsRangesFor[26]);
        bArr3[3] = getHighSpeedVideoSizes(bArr4[3], getHighSpeedVideoFpsRangesFor[27]);
        bArr3[0] = getHighSpeedVideoSizes(bArr3[0], getHighSpeedVideoFpsRangesFor[28]);
        bArr3[1] = getHighSpeedVideoSizes(bArr3[1], getHighSpeedVideoFpsRangesFor[29]);
        bArr3[2] = getHighSpeedVideoSizes(bArr3[2], getHighSpeedVideoFpsRangesFor[30]);
        bArr3[3] = getHighSpeedVideoSizes(bArr3[3], getHighSpeedVideoFpsRangesFor[31]);
        getHighResolutionOutputSizeshNQ4ISI(bArr3, bArr4);
        bArr3[0] = getHighSpeedVideoSizes(bArr4[0], getHighSpeedVideoFpsRangesFor[32]);
        bArr3[1] = getHighSpeedVideoSizes(bArr4[1], getHighSpeedVideoFpsRangesFor[33]);
        bArr3[2] = getHighSpeedVideoSizes(bArr4[2], getHighSpeedVideoFpsRangesFor[34]);
        bArr3[3] = getHighSpeedVideoSizes(bArr4[3], getHighSpeedVideoFpsRangesFor[35]);
        bArr3[0] = getHighSpeedVideoSizes(bArr3[0], getHighSpeedVideoFpsRangesFor[36]);
        bArr3[1] = getHighSpeedVideoSizes(bArr3[1], getHighSpeedVideoFpsRangesFor[37]);
        bArr3[2] = getHighSpeedVideoSizes(bArr3[2], getHighSpeedVideoFpsRangesFor[38]);
        bArr3[3] = getHighSpeedVideoSizes(bArr3[3], getHighSpeedVideoFpsRangesFor[39]);
        getHighResolutionOutputSizeshNQ4ISI(bArr3, bArr4);
        bArr3[0] = getHighSpeedVideoFpsRangesFor(bArr4[0], bArr2, 0);
        bArr3[1] = getHighSpeedVideoFpsRangesFor(bArr4[1], bArr2, 16);
        bArr3[2] = getHighSpeedVideoFpsRangesFor(bArr4[2], bArr2, 32);
        bArr3[3] = getHighSpeedVideoFpsRangesFor(bArr4[3], bArr2, 48);
        java.lang.System.arraycopy(bArr3[0], 8, bArr, i, 8);
        java.lang.System.arraycopy(bArr3[1], 8, bArr, i + 8, 8);
        java.lang.System.arraycopy(bArr3[2], 0, bArr, i + 16, 8);
        java.lang.System.arraycopy(bArr3[3], 0, bArr, i + 24, 8);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i3 + i2 > 64) {
            throw new java.lang.IllegalArgumentException("total input cannot be more than 64 bytes");
        }
        java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoSizes, i3, i2);
        this.getHighResolutionOutputSizeshNQ4ISI += i2;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 1;
        if (i2 > 64) {
            throw new java.lang.IllegalArgumentException("total input cannot be more than 64 bytes");
        }
        byte[] bArr = this.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        bArr[i] = b;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        org.bouncycastle.util.Arrays.clear(this.getHighSpeedVideoSizes);
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "Haraka-512";
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(byte[][] bArr, byte[][] bArr2) {
        java.lang.System.arraycopy(bArr[0], 12, bArr2[0], 0, 4);
        java.lang.System.arraycopy(bArr[2], 12, bArr2[0], 4, 4);
        java.lang.System.arraycopy(bArr[1], 12, bArr2[0], 8, 4);
        java.lang.System.arraycopy(bArr[3], 12, bArr2[0], 12, 4);
        java.lang.System.arraycopy(bArr[2], 0, bArr2[1], 0, 4);
        java.lang.System.arraycopy(bArr[0], 0, bArr2[1], 4, 4);
        java.lang.System.arraycopy(bArr[3], 0, bArr2[1], 8, 4);
        java.lang.System.arraycopy(bArr[1], 0, bArr2[1], 12, 4);
        java.lang.System.arraycopy(bArr[2], 4, bArr2[2], 0, 4);
        java.lang.System.arraycopy(bArr[0], 4, bArr2[2], 4, 4);
        java.lang.System.arraycopy(bArr[3], 4, bArr2[2], 8, 4);
        java.lang.System.arraycopy(bArr[1], 4, bArr2[2], 12, 4);
        java.lang.System.arraycopy(bArr[0], 8, bArr2[3], 0, 4);
        java.lang.System.arraycopy(bArr[2], 8, bArr2[3], 4, 4);
        java.lang.System.arraycopy(bArr[1], 8, bArr2[3], 8, 4);
        java.lang.System.arraycopy(bArr[3], 8, bArr2[3], 12, 4);
    }

    public Haraka512Digest(org.bouncycastle.crypto.digests.Haraka512Digest haraka512Digest) {
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(haraka512Digest.getHighSpeedVideoSizes);
        this.getHighResolutionOutputSizeshNQ4ISI = haraka512Digest.getHighResolutionOutputSizeshNQ4ISI;
    }

    public Haraka512Digest() {
        this.getHighSpeedVideoSizes = new byte[64];
    }

    static {
        byte[] bArr = new byte[16];
        // fill-array-data instruction
        bArr[0] = -81;
        bArr[1] = 4;
        bArr[2] = 73;
        bArr[3] = -120;
        bArr[4] = 75;
        bArr[5] = 5;
        bArr[6] = 0;
        bArr[7] = -124;
        bArr[8] = 95;
        bArr[9] = -106;
        bArr[10] = 0;
        bArr[11] = -55;
        bArr[12] = -100;
        bArr[13] = -88;
        bArr[14] = -20;
        bArr[15] = -90;
        getHighSpeedVideoFpsRangesFor = new byte[][]{new byte[]{6, -124, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 76, -26, 32, com.visa.cbp.getEncExpo.startTransaction, 10, -78, -59, -2, com.visa.cbp.getEncExpo.onUnminimized, 117, -127, 123, -99}, new byte[]{-117, 102, -76, -31, -120, -13, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 107, 100, com.google.common.base.Ascii.SI, 107, -92, 47, 8, -9, com.google.common.base.Ascii.ETB}, new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 2, -34, 45, 83, -14, -124, -104, com.visa.cbp.getEncExpo.kernelVersion, 2, -99, com.visa.cbp.getEncExpo.IResultReceiver2, -97, 2, -111, com.google.common.base.Ascii.DC4}, new byte[]{14, -42, -22, -26, 46, 123, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 8, -69, -13, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -81, -3, 91, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 121}, new byte[]{-53, com.visa.cbp.getEncExpo.kernelVersion, -80, -53, 72, 114, 68, -117, 121, -18, -51, com.google.common.base.Ascii.FS, -66, 57, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 68}, new byte[]{126, -22, -51, -18, 110, -112, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -73, -115, 83, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -19, 43, -118, 5, 123}, new byte[]{103, -62, -113, 67, 94, 46, 124, -48, -30, 65, 39, 97, -38, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -17, com.google.common.base.Ascii.ESC}, new byte[]{41, 36, -39, -80, -81, -54, -52, 7, 103, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -3, -30, com.google.common.base.Ascii.US, -57, com.google.common.base.Ascii.VT, 59}, new byte[]{-85, 77, 99, -15, -26, -122, Byte.MAX_VALUE, -23, -20, -37, -113, -54, -71, -44, 101, -18}, new byte[]{com.google.common.base.Ascii.FS, 48, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -124, -44, -73, -51, 100, 91, 42, 64, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -83, 3, 126, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE}, new byte[]{-78, -52, com.google.common.base.Ascii.VT, -71, -108, com.google.common.base.Ascii.ETB, 35, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 105, 2, -117, 46, -115, -10, -104, 0}, new byte[]{-6, 4, 120, -90, -34, 111, 85, 114, 74, -86, -98, -56, 92, -99, 45, -118}, new byte[]{-33, -76, -97, 43, 107, com.visa.cbp.getEncExpo.IResultReceiver, 42, 18, 14, -6, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 46, 41, 18, -97, -44}, new byte[]{com.google.common.base.Ascii.RS, -95, 3, 68, -12, 73, -94, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -42, 17, -82, -69, 106, 18, -18}, bArr, new byte[]{33, 2, 94, -40, -99, com.google.common.base.Ascii.EM, -100, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 120, -94, -57, -29, 39, -27, -109, -20}, new byte[]{com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 58, -86, -8, -89, 89, -55, -73, -71, 40, 46, -51, -126, -44, 1, 115}, new byte[]{98, com.visa.cbp.getEncExpo.IResultReceiver2, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 13, 97, -122, -80, com.google.common.base.Ascii.ETB, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -14, -17, -39, 16, 48, 125, 107}, new byte[]{com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -54, 69, -62, 33, 48, 4, 67, -127, -62, -111, 83, -10, -4, -102, -58}, new byte[]{-110, 35, -105, 60, 34, 107, 104, -69, 44, -81, -110, -24, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -47, -108, 58}, new byte[]{-45, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -110, 56, 34, 88, -122, -21, 108, -70, -71, 88, -27, 16, 113, -76}, new byte[]{-37, -122, 60, -27, -82, com.visa.cbp.getEncExpo.onUnminimized, -58, com.visa.cbp.getEncExpo.IResultReceiver, -109, kotlin.io.encoding.Base64.padSymbol, -3, -35, 36, -31, 18, -115}, new byte[]{-69, com.visa.cbp.getEncExpo.IResultReceiver2, 98, 104, -1, -21, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -100, -125, -28, -115, -29, -53, 34, 18, -79}, new byte[]{115, 75, -45, -36, -30, -28, -47, -100, 45, -71, com.google.common.base.Ascii.SUB, 78, -57, 43, -9, 125}, new byte[]{67, -69, 71, -61, 97, 48, com.google.common.base.Ascii.ESC, 67, 75, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, -60, 44, -77, -110, 78}, new byte[]{-37, -89, 117, -88, -25, 7, -17, -10, 3, -78, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -35, com.google.common.base.Ascii.SYN, -21, 104, com.visa.cbp.getEncExpo.registerForActivityResult}, new byte[]{109, -13, 97, 75, 60, 117, 89, com.visa.cbp.getEncExpo.IResultReceiver, -114, 94, 35, 2, 126, -54, 71, 44}, new byte[]{-51, -89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.google.common.base.Ascii.ETB, -42, -34, 125, com.visa.cbp.getEncExpo.IResultReceiver, 109, com.google.common.base.Ascii.ESC, -27, -71, -72, -122, com.google.common.base.Ascii.ETB, -7}, new byte[]{-20, 107, 67, com.visa.cbp.getEncExpo.onUnminimized, 107, -88, -23, -86, -99, 108, 6, -99, -87, 70, -18, 93}, new byte[]{-53, com.google.common.base.Ascii.RS, 105, 80, -7, 87, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 43, -94, 83, 17, 89, 59, -13, 39, -63}, new byte[]{44, -18, com.google.common.base.Ascii.FF, 117, 0, -38, 97, -100, -28, -19, 3, 83, com.visa.cbp.getEncExpo.IResultReceiver2, 14, -48, -39}, new byte[]{com.visa.cbp.getEncExpo.onUnminimized, -79, -91, -95, -106, -23, com.google.common.base.Ascii.FF, -85, Byte.MIN_VALUE, -69, -70, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 99, -92, -93, 80}, new byte[]{-82, kotlin.io.encoding.Base64.padSymbol, -79, 2, 94, -106, 41, -120, -85, 13, -34, 48, -109, -115, -54, 57}, new byte[]{com.google.common.base.Ascii.ETB, -69, -113, 56, -43, 84, -92, com.google.common.base.Ascii.VT, -120, com.google.common.base.Ascii.DC4, -13, -88, 46, 117, -76, 66}, new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -69, -118, 91, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 66, Byte.MAX_VALUE, -41, -82, -74, -73, 121, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 10, com.google.common.base.Ascii.SYN, -10}, new byte[]{38, -10, 82, 65, -53, -27, 84, 56, 67, -50, 89, com.google.common.base.Ascii.CAN, -1, -70, -81, -34}, new byte[]{76, -23, -102, 84, -71, -13, 2, 106, -94, -54, -100, -9, -125, -98, -55, 120}, new byte[]{-82, 81, -91, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, -33, -9, -66, 64, com.visa.cbp.getEncExpo.startTransaction, 110, 40, 34, -112, 18, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE}, new byte[]{com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -63, 97, 60, -70, 126, -46, 43, -63, 115, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, com.google.common.base.Ascii.SI, 72, -90, 89, com.visa.cbp.getEncExpo.kernelVersion}, new byte[]{117, 106, -52, 3, 2, 40, -126, -120, 74, -42, -67, -3, -23, -59, -99, -95}};
    }
}
