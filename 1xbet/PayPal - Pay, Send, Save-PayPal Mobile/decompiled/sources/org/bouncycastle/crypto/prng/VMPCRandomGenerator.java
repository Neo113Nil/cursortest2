package org.bouncycastle.crypto.prng;

/* loaded from: classes17.dex */
public class VMPCRandomGenerator implements org.bouncycastle.crypto.prng.RandomGenerator {
    private byte Camera2StreamConfigurationMap = 0;
    private byte[] getHighSpeedVideoFpsRanges = {-69, 44, 98, Byte.MAX_VALUE, -75, -86, -44, 13, -127, -2, -78, -126, -53, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -95, 8, com.google.common.base.Ascii.CAN, 113, 86, -24, 73, 2, 16, -60, -34, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -91, -20, Byte.MIN_VALUE, 18, -72, 105, -38, 47, 117, -52, -94, 9, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 3, 97, 45, -3, -32, -35, 5, 67, -112, -83, -56, -31, -81, 87, -101, 76, -40, 81, -82, 80, -123, 60, 10, -28, -13, -100, 38, 35, 83, -55, -125, -105, 70, -79, com.visa.cbp.getEncExpo.registerForActivityResult, 100, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.visa.cbp.getEncExpo.IResultReceiver, -43, com.google.common.base.Ascii.GS, -42, 120, -67, 94, -80, -118, 34, 56, -8, 104, 43, 42, -59, -45, -9, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 111, -33, 4, -27, -107, 62, 37, -122, -90, com.google.common.base.Ascii.VT, -113, -15, 36, 14, -41, 64, -77, com.visa.cbp.getEncExpo.kernelVersion, 126, 6, com.google.common.base.Ascii.NAK, -102, 77, com.google.common.base.Ascii.FS, -93, -37, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -110, 88, 17, 39, -12, 89, -48, 78, 106, com.google.common.base.Ascii.ETB, 91, -84, -1, 7, com.visa.cbp.getEncExpo.startTransaction, 101, 121, -4, -57, -51, 118, 66, 93, -25, 58, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 122, 48, 40, com.google.common.base.Ascii.SI, 115, 1, -7, -47, -46, com.google.common.base.Ascii.EM, -23, -111, -71, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -19, 65, 109, -76, -61, -98, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 99, -6, com.google.common.base.Ascii.US, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, com.visa.cbp.getEncExpo.IResultReceiver2, 71, -119, com.visa.cbp.getEncExpo.onUnminimized, -106, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -109, kotlin.io.encoding.Base64.padSymbol, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 75, -39, -88, -63, com.google.common.base.Ascii.ESC, -10, 57, -117, -73, com.google.common.base.Ascii.FF, 32, -50, -120, 110, -74, 116, -114, -115, com.google.common.base.Ascii.SYN, 41, -14, -121, -11, -21, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -29, -5, 85, -97, -58, 68, 74, 69, 125, -30, 107, 92, 108, 102, -87, -116, -18, -124, 19, -89, com.google.common.base.Ascii.RS, -99, -36, 103, 72, -70, 46, -26, -92, -85, 124, -108, 0, 33, -17, -22, -66, -54, 114, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 82, -104, 63, -62, com.google.common.base.Ascii.DC4, 123, 59, 84};
    private byte getHighSpeedVideoFpsRangesFor = -66;

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i, int i2) {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            for (int i3 = i; i3 != i2 + i; i3++) {
                byte[] bArr2 = this.getHighSpeedVideoFpsRanges;
                byte b = this.getHighSpeedVideoFpsRangesFor;
                byte b2 = this.Camera2StreamConfigurationMap;
                int i4 = b2 & 255;
                byte b3 = bArr2[(b + bArr2[i4]) & 255];
                this.getHighSpeedVideoFpsRangesFor = b3;
                int i5 = b3 & 255;
                bArr[i3] = bArr2[(bArr2[bArr2[i5] & 255] + 1) & 255];
                byte b4 = bArr2[i4];
                bArr2[i4] = bArr2[i5];
                bArr2[i5] = b4;
                this.Camera2StreamConfigurationMap = (byte) ((b2 + 1) & 255);
            }
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        nextBytes(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        for (byte b : bArr) {
            byte[] bArr2 = this.getHighSpeedVideoFpsRanges;
            byte b2 = this.getHighSpeedVideoFpsRangesFor;
            byte b3 = this.Camera2StreamConfigurationMap;
            int i = b3 & 255;
            byte b4 = bArr2[i];
            byte b5 = bArr2[(b2 + b4 + b) & 255];
            this.getHighSpeedVideoFpsRangesFor = b5;
            int i2 = b5 & 255;
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b4;
            this.Camera2StreamConfigurationMap = (byte) ((b3 + 1) & 255);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j) {
        addSeedMaterial(org.bouncycastle.util.Pack.longToBigEndian(j));
    }
}
