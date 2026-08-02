package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class MD2Digest implements org.bouncycastle.crypto.ExtendedDigest, org.bouncycastle.util.Memoable {
    private static final byte[] Camera2StreamConfigurationMap = {41, 46, 67, -55, -94, -40, 124, 1, kotlin.io.encoding.Base64.padSymbol, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 84, -95, -20, com.visa.cbp.getEncExpo.onUnminimized, 6, 19, 98, -89, 5, -13, com.visa.cbp.getEncExpo.startTransaction, -57, 115, -116, -104, -109, 43, -39, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 76, -126, -54, com.google.common.base.Ascii.RS, -101, 87, 60, -3, -44, -32, com.google.common.base.Ascii.SYN, 103, 66, 111, com.google.common.base.Ascii.CAN, -118, com.google.common.base.Ascii.ETB, -27, 18, -66, 78, -60, -42, -38, -98, -34, 73, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, com.google.common.base.Ascii.NAK, -78, 7, 63, -108, -62, 16, -119, com.google.common.base.Ascii.VT, 34, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 33, Byte.MIN_VALUE, Byte.MAX_VALUE, 93, -102, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -112, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 39, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 62, -52, -25, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -9, -105, 3, -1, com.google.common.base.Ascii.EM, 48, -77, 72, -91, -75, -47, -41, 94, -110, 42, -84, 86, -86, -58, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 89, 100, 113, -121, 32, -122, 91, com.visa.cbp.getEncExpo.kernelVersion, 101, -26, 45, -88, 2, com.google.common.base.Ascii.ESC, com.visa.cbp.getEncExpo.IResultReceiver2, 37, -83, -82, -80, -71, -10, com.google.common.base.Ascii.FS, 70, 97, 105, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 64, 126, com.google.common.base.Ascii.SI, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, 44, 83, 13, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 77, 82, 106, -36, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -56, 108, -63, -85, -6, 36, -31, 123, 8, com.google.common.base.Ascii.FF, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, com.google.common.base.Ascii.GS, 57, -14, -17, -73, 14, 102, 88, -48, -28, -90, com.visa.cbp.getEncExpo.IResultReceiver, 114, -8, -21, 117, 75, 10, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 68, 80, -76, -113, -19, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SUB, -37, com.visa.cbp.getEncExpo.registerForActivityResult, -115, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -97, 17, -125, com.google.common.base.Ascii.DC4};
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private int getInputSizeshNQ4ISI;
    private int getOutputFormats;

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        while (this.getOutputFormats != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > 16) {
            java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoFpsRangesFor, 0, 16);
            processCheckSum(this.getHighSpeedVideoFpsRangesFor);
            processBlock(this.getHighSpeedVideoFpsRangesFor);
            i2 -= 16;
            i += 16;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        int i = this.getOutputFormats;
        int i2 = i + 1;
        this.getOutputFormats = i2;
        bArr[i] = b;
        if (i2 == 16) {
            processCheckSum(bArr);
            processBlock(this.getHighSpeedVideoFpsRangesFor);
            this.getOutputFormats = 0;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        getHighSpeedVideoSizes((org.bouncycastle.crypto.digests.MD2Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.getInputSizeshNQ4ISI = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        this.getOutputFormats = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
            if (i2 == bArr2.length) {
                break;
            }
            bArr2[i2] = 0;
            i2++;
        }
        this.getHighSpeedVideoSizes = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.getHighSpeedVideoFpsRanges;
            if (i3 == bArr3.length) {
                return;
            }
            bArr3[i3] = 0;
            i3++;
        }
    }

    protected void processCheckSum(byte[] bArr) {
        byte b = this.getHighSpeedVideoFpsRanges[15];
        for (int i = 0; i < 16; i++) {
            byte[] bArr2 = this.getHighSpeedVideoFpsRanges;
            b = (byte) (Camera2StreamConfigurationMap[(b ^ bArr[i]) & 255] ^ bArr2[i]);
            bArr2[i] = b;
        }
    }

    protected void processBlock(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
            bArr2[i + 16] = bArr[i];
            bArr2[i + 32] = (byte) (bArr[i] ^ bArr2[i]);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 18; i3++) {
            for (int i4 = 0; i4 < 48; i4++) {
                byte[] bArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
                byte b = (byte) (Camera2StreamConfigurationMap[i2] ^ bArr3[i4]);
                bArr3[i4] = b;
                i2 = b & 255;
            }
            i2 = (i2 + i3) % 256;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "MD2";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        int length = this.getHighSpeedVideoFpsRangesFor.length;
        int i2 = this.getOutputFormats;
        byte b = (byte) (length - i2);
        while (true) {
            byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
            if (i2 >= bArr2.length) {
                processCheckSum(bArr2);
                processBlock(this.getHighSpeedVideoFpsRangesFor);
                processBlock(this.getHighSpeedVideoFpsRanges);
                java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, bArr, i, 16);
                reset();
                return 16;
            }
            bArr2[i2] = b;
            i2++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.MD2Digest(this);
    }

    private void getHighSpeedVideoSizes(org.bouncycastle.crypto.digests.MD2Digest mD2Digest) {
        byte[] bArr = mD2Digest.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.System.arraycopy(bArr, 0, this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr.length);
        this.getInputSizeshNQ4ISI = mD2Digest.getInputSizeshNQ4ISI;
        byte[] bArr2 = mD2Digest.getHighSpeedVideoFpsRangesFor;
        java.lang.System.arraycopy(bArr2, 0, this.getHighSpeedVideoFpsRangesFor, 0, bArr2.length);
        this.getOutputFormats = mD2Digest.getOutputFormats;
        byte[] bArr3 = mD2Digest.getHighSpeedVideoFpsRanges;
        java.lang.System.arraycopy(bArr3, 0, this.getHighSpeedVideoFpsRanges, 0, bArr3.length);
        this.getHighSpeedVideoSizes = mD2Digest.getHighSpeedVideoSizes;
    }

    public MD2Digest(org.bouncycastle.crypto.digests.MD2Digest mD2Digest) {
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[48];
        this.getHighSpeedVideoFpsRangesFor = new byte[16];
        this.getHighSpeedVideoFpsRanges = new byte[16];
        getHighSpeedVideoSizes(mD2Digest);
    }

    public MD2Digest() {
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[48];
        this.getHighSpeedVideoFpsRangesFor = new byte[16];
        this.getHighSpeedVideoFpsRanges = new byte[16];
        reset();
    }
}
