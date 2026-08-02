package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class GOST3412_2015Engine implements org.bouncycastle.crypto.BlockCipher {
    protected static final int BLOCK_SIZE = 16;
    private byte[][] Camera2StreamConfigurationMap;
    private boolean getInputSizeshNQ4ISI;
    private static final byte[] getHighSpeedVideoFpsRanges = {-4, -18, -35, 17, com.visa.cbp.getEncExpo.kernelVersion, 110, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.SYN, -5, -60, -6, -38, 35, -59, 4, 77, -23, com.visa.cbp.getEncExpo.IResultReceiver, com.visa.cbp.getEncExpo.onUnminimized, -37, -109, 46, com.visa.cbp.getEncExpo.registerForActivityResult, -70, com.google.common.base.Ascii.ETB, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -15, -69, com.google.common.base.Ascii.DC4, -51, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -63, -7, com.google.common.base.Ascii.CAN, 101, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -30, 92, -17, 33, -127, com.google.common.base.Ascii.FS, 60, 66, -117, 1, -114, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 5, -124, 2, -82, -29, 106, -113, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 6, com.google.common.base.Ascii.VT, -19, -104, Byte.MAX_VALUE, -44, -45, com.google.common.base.Ascii.US, -21, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 44, 81, -22, -56, 72, -85, -14, 42, 104, -94, -3, 58, -50, -52, -75, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 14, 86, 8, com.google.common.base.Ascii.FF, 118, 18, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 114, 19, 71, -100, -73, 93, -121, com.google.common.base.Ascii.NAK, -95, -106, 41, 16, 123, -102, -57, -13, -111, 120, 111, -99, -98, -78, -79, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 117, com.google.common.base.Ascii.EM, kotlin.io.encoding.Base64.padSymbol, -1, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -118, 126, 109, 84, -58, Byte.MIN_VALUE, -61, -67, 13, 87, -33, -11, 36, -87, 62, -88, 67, -55, -41, 121, -42, -10, 124, 34, -71, 3, -32, com.google.common.base.Ascii.SI, -20, -34, 122, -108, -80, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -36, -24, 40, 80, 78, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 10, 74, -89, -105, com.visa.cbp.getEncExpo.IResultReceiver2, 115, com.google.common.base.Ascii.RS, 0, 98, 68, com.google.common.base.Ascii.SUB, -72, 56, -126, 100, -97, 38, 65, -83, 69, 70, -110, 39, 94, 85, 47, -116, -93, -91, 125, 105, -43, -107, 59, 7, 88, -77, 64, -122, -84, com.google.common.base.Ascii.GS, -9, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 107, -28, -120, -39, -25, -119, -31, com.google.common.base.Ascii.ESC, -125, 73, 76, 63, -8, -2, -115, 83, -86, -112, -54, -40, -123, 97, 32, 113, 103, -92, 45, 43, 9, 91, -53, -101, 37, -48, -66, -27, 108, 82, 89, -90, 116, -46, -26, -12, -76, com.visa.cbp.getEncExpo.startTransaction, -47, 102, -81, -62, 57, 75, 99, -74};
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = {-91, 45, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -113, 14, 48, 56, com.visa.cbp.getEncExpo.startTransaction, 84, -26, -98, 57, 85, 126, 82, -111, 100, 3, 87, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.google.common.base.Ascii.FS, com.visa.cbp.getEncExpo.IResultReceiver2, 7, com.google.common.base.Ascii.CAN, 33, 114, -88, -47, 41, -58, -92, 63, -32, 39, -115, com.google.common.base.Ascii.FF, -126, -22, -82, -76, -102, 99, 73, -27, 66, -28, com.google.common.base.Ascii.NAK, -73, -56, 6, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -99, 65, 117, com.google.common.base.Ascii.EM, -55, -86, -4, 77, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 42, 115, -124, -43, -61, -81, 43, -122, -89, -79, -78, 91, 70, -45, -97, -3, -44, com.google.common.base.Ascii.SI, -100, 47, -101, 67, -17, -39, 121, -74, 83, Byte.MAX_VALUE, -63, com.visa.cbp.getEncExpo.onUnminimized, 35, -25, 37, 94, -75, com.google.common.base.Ascii.RS, -94, -33, -90, -2, -84, 34, -7, -30, 74, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -54, -18, 120, 5, 107, 81, -31, 89, -93, -14, 113, 86, 17, 106, -119, -108, 101, -116, -69, com.visa.cbp.getEncExpo.IResultReceiver, 60, 123, 40, -85, -46, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -34, -60, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -52, com.visa.cbp.getEncExpo.kernelVersion, 118, 44, -72, -40, 46, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -37, 105, -77, com.google.common.base.Ascii.DC4, -107, -66, 98, -95, 59, com.google.common.base.Ascii.SYN, 102, -23, 92, 108, 109, -83, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 97, 75, -71, -29, -70, -15, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -123, -125, -38, 71, -59, -80, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -6, -106, 111, 110, -62, -10, 80, -1, 93, -87, -114, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.ESC, -105, 125, -20, 88, -9, com.google.common.base.Ascii.US, -5, 124, 9, 13, 122, 103, 69, -121, -36, -24, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, com.google.common.base.Ascii.GS, 78, 4, -21, -8, -13, 62, kotlin.io.encoding.Base64.padSymbol, -67, -118, -120, -35, -51, com.google.common.base.Ascii.VT, 19, -104, 2, -109, Byte.MIN_VALUE, -112, -48, 36, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -53, -19, -12, -50, com.visa.cbp.getEncExpo.registerForActivityResult, 16, 68, 64, -110, 58, 1, 38, 18, com.google.common.base.Ascii.SUB, 72, 104, -11, -127, -117, -57, -42, 32, 10, 8, 0, 76, -41, 116};
    private final byte[] getInputFormats = {-108, 32, -123, 16, -62, com.visa.cbp.getEncExpo.startTransaction, 1, -5, 1, com.visa.cbp.getEncExpo.startTransaction, -62, 16, -123, 32, -108, 1};
    private int getHighSpeedVideoFpsRangesFor = 32;
    private int getHighSpeedVideoSizes = 16;
    private byte[][] getHighSpeedVideoSizesFor = null;

    private byte getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        byte b = bArr[15];
        for (int i = 14; i >= 0; i--) {
            b = (byte) (b ^ this.Camera2StreamConfigurationMap[bArr[i] & 255][this.getInputFormats[i] & 255]);
        }
        return b;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    public GOST3412_2015Engine() {
        byte[][] bArr = new byte[256][];
        for (int i = 0; i < 256; i++) {
            bArr[i] = new byte[256];
            for (int i2 = 0; i2 < 256; i2++) {
                byte[] bArr2 = bArr[i];
                byte b = (byte) i;
                byte b2 = (byte) i2;
                byte b3 = 0;
                for (byte b4 = 0; b4 < 8 && b != 0 && b2 != 0; b4 = (byte) (b4 + 1)) {
                    b3 = (b2 & 1) != 0 ? (byte) (b3 ^ b) : b3;
                    byte b5 = (byte) (b & 128);
                    b = (byte) (b << 1);
                    if (b5 != 0) {
                        b = (byte) (b ^ 195);
                    }
                    b2 = (byte) (b2 >> 1);
                }
                bArr2[i2] = b3;
            }
        }
        this.Camera2StreamConfigurationMap = bArr;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            byte highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr);
            java.lang.System.arraycopy(bArr, 0, bArr, 1, 15);
            bArr[0] = highSpeedVideoFpsRangesFor;
        }
    }

    private byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, byte[] bArr2) {
        byte[] copyOf = org.bouncycastle.util.Arrays.copyOf(bArr, bArr.length);
        for (int i = 0; i < copyOf.length; i++) {
            copyOf[i] = (byte) (copyOf[i] ^ bArr2[i]);
        }
        for (int i2 = 0; i2 < copyOf.length; i2++) {
            copyOf[i2] = getHighSpeedVideoFpsRanges[copyOf[i2] & 255];
        }
        getHighResolutionOutputSizeshNQ4ISI(copyOf);
        return copyOf;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        int i;
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            if (cipherParameters == null) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to GOST3412_2015 init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getInputSizeshNQ4ISI = z;
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        if (key.length != this.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        this.getHighSpeedVideoSizesFor = new byte[10][];
        for (int i2 = 0; i2 < 10; i2++) {
            this.getHighSpeedVideoSizesFor[i2] = new byte[this.getHighSpeedVideoSizes];
        }
        int i3 = this.getHighSpeedVideoSizes;
        byte[] bArr = new byte[i3];
        byte[] bArr2 = new byte[i3];
        int i4 = 0;
        while (true) {
            i = this.getHighSpeedVideoSizes;
            if (i4 >= i) {
                break;
            }
            byte[][] bArr3 = this.getHighSpeedVideoSizesFor;
            byte[] bArr4 = bArr3[0];
            byte b = key[i4];
            bArr[i4] = b;
            bArr4[i4] = b;
            byte[] bArr5 = bArr3[1];
            byte b2 = key[i + i4];
            bArr2[i4] = b2;
            bArr5[i4] = b2;
            i4++;
        }
        byte[] bArr6 = new byte[i];
        for (int i5 = 1; i5 < 5; i5++) {
            for (int i6 = 1; i6 <= 8; i6++) {
                org.bouncycastle.util.Arrays.clear(bArr6);
                bArr6[15] = (byte) (((i5 - 1) * 8) + i6);
                getHighResolutionOutputSizeshNQ4ISI(bArr6);
                byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr6, bArr);
                for (int i7 = 0; i7 < highResolutionOutputSizeshNQ4ISI.length; i7++) {
                    highResolutionOutputSizeshNQ4ISI[i7] = (byte) (highResolutionOutputSizeshNQ4ISI[i7] ^ bArr2[i7]);
                }
                java.lang.System.arraycopy(bArr, 0, bArr2, 0, this.getHighSpeedVideoSizes);
                java.lang.System.arraycopy(highResolutionOutputSizeshNQ4ISI, 0, bArr, 0, this.getHighSpeedVideoSizes);
            }
            int i8 = i5 * 2;
            java.lang.System.arraycopy(bArr, 0, this.getHighSpeedVideoSizesFor[i8], 0, this.getHighSpeedVideoSizes);
            java.lang.System.arraycopy(bArr2, 0, this.getHighSpeedVideoSizesFor[i8 + 1], 0, this.getHighSpeedVideoSizes);
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        byte[][] bArr3;
        if (this.getHighSpeedVideoSizesFor == null) {
            throw new java.lang.IllegalStateException("GOST3412_2015 engine not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        byte[] bArr4 = new byte[16];
        java.lang.System.arraycopy(bArr, i, bArr4, 0, 16);
        int i3 = 9;
        if (this.getInputSizeshNQ4ISI) {
            for (int i4 = 0; i4 < 9; i4++) {
                bArr4 = org.bouncycastle.util.Arrays.copyOf(getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizesFor[i4], bArr4), 16);
            }
            byte[] bArr5 = this.getHighSpeedVideoSizesFor[9];
            for (int i5 = 0; i5 < bArr4.length; i5++) {
                bArr4[i5] = (byte) (bArr4[i5] ^ bArr5[i5]);
            }
        } else {
            while (true) {
                bArr3 = this.getHighSpeedVideoSizesFor;
                if (i3 <= 0) {
                    break;
                }
                byte[] bArr6 = bArr3[i3];
                byte[] copyOf = org.bouncycastle.util.Arrays.copyOf(bArr6, bArr6.length);
                for (int i6 = 0; i6 < copyOf.length; i6++) {
                    copyOf[i6] = (byte) (copyOf[i6] ^ bArr4[i6]);
                }
                for (int i7 = 0; i7 < 16; i7++) {
                    byte[] bArr7 = new byte[16];
                    java.lang.System.arraycopy(copyOf, 1, bArr7, 0, 15);
                    bArr7[15] = copyOf[0];
                    byte highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr7);
                    java.lang.System.arraycopy(copyOf, 1, copyOf, 0, 15);
                    copyOf[15] = highSpeedVideoFpsRangesFor;
                }
                for (int i8 = 0; i8 < copyOf.length; i8++) {
                    copyOf[i8] = getHighResolutionOutputSizeshNQ4ISI[copyOf[i8] & 255];
                }
                bArr4 = org.bouncycastle.util.Arrays.copyOf(copyOf, 16);
                i3--;
            }
            byte[] bArr8 = bArr3[0];
            for (int i9 = 0; i9 < bArr4.length; i9++) {
                bArr4[i9] = (byte) (bArr4[i9] ^ bArr8[i9]);
            }
        }
        java.lang.System.arraycopy(bArr4, 0, bArr2, i2, 16);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "GOST3412_2015";
    }
}
