package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class Haraka256Digest extends org.bouncycastle.crypto.digests.HarakaBase {
    private static final byte[][] getHighSpeedVideoSizes;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        if (this.getHighResolutionOutputSizeshNQ4ISI != 32) {
            throw new java.lang.IllegalStateException("input must be exactly 32 bytes");
        }
        if (bArr.length - i < 32) {
            throw new java.lang.IllegalArgumentException("output too short to receive digest");
        }
        byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
        byte[][] bArr3 = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, 2, 16);
        byte[][] bArr4 = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, 2, 16);
        java.lang.System.arraycopy(bArr2, 0, bArr3[0], 0, 16);
        java.lang.System.arraycopy(bArr2, 16, bArr3[1], 0, 16);
        byte[] bArr5 = bArr3[0];
        byte[][] bArr6 = getHighSpeedVideoSizes;
        bArr3[0] = getHighSpeedVideoSizes(bArr5, bArr6[0]);
        bArr3[1] = getHighSpeedVideoSizes(bArr3[1], bArr6[1]);
        bArr3[0] = getHighSpeedVideoSizes(bArr3[0], bArr6[2]);
        bArr3[1] = getHighSpeedVideoSizes(bArr3[1], bArr6[3]);
        getHighResolutionOutputSizeshNQ4ISI(bArr3, bArr4);
        bArr3[0] = getHighSpeedVideoSizes(bArr4[0], bArr6[4]);
        bArr3[1] = getHighSpeedVideoSizes(bArr4[1], bArr6[5]);
        bArr3[0] = getHighSpeedVideoSizes(bArr3[0], bArr6[6]);
        bArr3[1] = getHighSpeedVideoSizes(bArr3[1], bArr6[7]);
        getHighResolutionOutputSizeshNQ4ISI(bArr3, bArr4);
        bArr3[0] = getHighSpeedVideoSizes(bArr4[0], bArr6[8]);
        bArr3[1] = getHighSpeedVideoSizes(bArr4[1], bArr6[9]);
        bArr3[0] = getHighSpeedVideoSizes(bArr3[0], bArr6[10]);
        bArr3[1] = getHighSpeedVideoSizes(bArr3[1], bArr6[11]);
        getHighResolutionOutputSizeshNQ4ISI(bArr3, bArr4);
        bArr3[0] = getHighSpeedVideoSizes(bArr4[0], bArr6[12]);
        bArr3[1] = getHighSpeedVideoSizes(bArr4[1], bArr6[13]);
        bArr3[0] = getHighSpeedVideoSizes(bArr3[0], bArr6[14]);
        bArr3[1] = getHighSpeedVideoSizes(bArr3[1], bArr6[15]);
        getHighResolutionOutputSizeshNQ4ISI(bArr3, bArr4);
        bArr3[0] = getHighSpeedVideoSizes(bArr4[0], bArr6[16]);
        bArr3[1] = getHighSpeedVideoSizes(bArr4[1], bArr6[17]);
        bArr3[0] = getHighSpeedVideoSizes(bArr3[0], bArr6[18]);
        bArr3[1] = getHighSpeedVideoSizes(bArr3[1], bArr6[19]);
        getHighResolutionOutputSizeshNQ4ISI(bArr3, bArr4);
        bArr3[0] = getHighSpeedVideoFpsRangesFor(bArr4[0], bArr2, 0);
        bArr3[1] = getHighSpeedVideoFpsRangesFor(bArr4[1], bArr2, 16);
        java.lang.System.arraycopy(bArr3[0], 0, bArr, i, 16);
        java.lang.System.arraycopy(bArr3[1], 0, bArr, i + 16, 16);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i3 + i2 > 32) {
            throw new java.lang.IllegalArgumentException("total input cannot be more than 32 bytes");
        }
        java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoFpsRangesFor, i3, i2);
        this.getHighResolutionOutputSizeshNQ4ISI += i2;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 1;
        if (i2 > 32) {
            throw new java.lang.IllegalArgumentException("total input cannot be more than 32 bytes");
        }
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        bArr[i] = b;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        org.bouncycastle.util.Arrays.clear(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "Haraka-256";
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(byte[][] bArr, byte[][] bArr2) {
        java.lang.System.arraycopy(bArr[0], 0, bArr2[0], 0, 4);
        java.lang.System.arraycopy(bArr[1], 0, bArr2[0], 4, 4);
        java.lang.System.arraycopy(bArr[0], 4, bArr2[0], 8, 4);
        java.lang.System.arraycopy(bArr[1], 4, bArr2[0], 12, 4);
        java.lang.System.arraycopy(bArr[0], 8, bArr2[1], 0, 4);
        java.lang.System.arraycopy(bArr[1], 8, bArr2[1], 4, 4);
        java.lang.System.arraycopy(bArr[0], 12, bArr2[1], 8, 4);
        java.lang.System.arraycopy(bArr[1], 12, bArr2[1], 12, 4);
    }

    public Haraka256Digest(org.bouncycastle.crypto.digests.Haraka256Digest haraka256Digest) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(haraka256Digest.getHighSpeedVideoFpsRangesFor);
        this.getHighResolutionOutputSizeshNQ4ISI = haraka256Digest.getHighResolutionOutputSizeshNQ4ISI;
    }

    public Haraka256Digest() {
        this.getHighSpeedVideoFpsRangesFor = new byte[32];
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
        getHighSpeedVideoSizes = new byte[][]{new byte[]{6, -124, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 76, -26, 32, com.visa.cbp.getEncExpo.startTransaction, 10, -78, -59, -2, com.visa.cbp.getEncExpo.onUnminimized, 117, -127, 123, -99}, new byte[]{-117, 102, -76, -31, -120, -13, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 107, 100, com.google.common.base.Ascii.SI, 107, -92, 47, 8, -9, com.google.common.base.Ascii.ETB}, new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 2, -34, 45, 83, -14, -124, -104, com.visa.cbp.getEncExpo.kernelVersion, 2, -99, com.visa.cbp.getEncExpo.IResultReceiver2, -97, 2, -111, com.google.common.base.Ascii.DC4}, new byte[]{14, -42, -22, -26, 46, 123, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 8, -69, -13, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -81, -3, 91, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 121}, new byte[]{-53, com.visa.cbp.getEncExpo.kernelVersion, -80, -53, 72, 114, 68, -117, 121, -18, -51, com.google.common.base.Ascii.FS, -66, 57, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 68}, new byte[]{126, -22, -51, -18, 110, -112, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -73, -115, 83, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -19, 43, -118, 5, 123}, new byte[]{103, -62, -113, 67, 94, 46, 124, -48, -30, 65, 39, 97, -38, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -17, com.google.common.base.Ascii.ESC}, new byte[]{41, 36, -39, -80, -81, -54, -52, 7, 103, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -3, -30, com.google.common.base.Ascii.US, -57, com.google.common.base.Ascii.VT, 59}, new byte[]{-85, 77, 99, -15, -26, -122, Byte.MAX_VALUE, -23, -20, -37, -113, -54, -71, -44, 101, -18}, new byte[]{com.google.common.base.Ascii.FS, 48, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -124, -44, -73, -51, 100, 91, 42, 64, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -83, 3, 126, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE}, new byte[]{-78, -52, com.google.common.base.Ascii.VT, -71, -108, com.google.common.base.Ascii.ETB, 35, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 105, 2, -117, 46, -115, -10, -104, 0}, new byte[]{-6, 4, 120, -90, -34, 111, 85, 114, 74, -86, -98, -56, 92, -99, 45, -118}, new byte[]{-33, -76, -97, 43, 107, com.visa.cbp.getEncExpo.IResultReceiver, 42, 18, 14, -6, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 46, 41, 18, -97, -44}, new byte[]{com.google.common.base.Ascii.RS, -95, 3, 68, -12, 73, -94, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -42, 17, -82, -69, 106, 18, -18}, bArr, new byte[]{33, 2, 94, -40, -99, com.google.common.base.Ascii.EM, -100, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 120, -94, -57, -29, 39, -27, -109, -20}, new byte[]{com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 58, -86, -8, -89, 89, -55, -73, -71, 40, 46, -51, -126, -44, 1, 115}, new byte[]{98, com.visa.cbp.getEncExpo.IResultReceiver2, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 13, 97, -122, -80, com.google.common.base.Ascii.ETB, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -14, -17, -39, 16, 48, 125, 107}, new byte[]{com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -54, 69, -62, 33, 48, 4, 67, -127, -62, -111, 83, -10, -4, -102, -58}, new byte[]{-110, 35, -105, 60, 34, 107, 104, -69, 44, -81, -110, -24, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -47, -108, 58}};
    }
}
