package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class Zuc128CoreEngine implements org.bouncycastle.crypto.StreamCipher, org.bouncycastle.util.Memoable {
    private static final byte[] Camera2StreamConfigurationMap = {62, 114, 91, 71, -54, -32, 0, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 4, -47, 84, -104, 9, -71, 109, -53, 123, com.google.common.base.Ascii.ESC, -7, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -81, -99, 106, -91, -72, 45, -4, com.google.common.base.Ascii.GS, 8, 83, 3, -112, 77, 78, -124, com.visa.cbp.getEncExpo.registerForActivityResult, -28, -50, -39, -111, -35, -74, -123, 72, -117, 41, 110, -84, -51, -63, -8, com.google.common.base.Ascii.RS, 115, 67, 105, -58, -75, -67, -3, 57, 99, 32, -44, 56, 118, 125, -78, -89, com.visa.cbp.getEncExpo.kernelVersion, -19, 87, -59, -13, 44, -69, com.google.common.base.Ascii.DC4, 33, 6, 85, -101, -29, -17, 94, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, Byte.MAX_VALUE, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -92, 13, -126, 81, 73, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -70, 88, com.google.common.base.Ascii.FS, 74, com.google.common.base.Ascii.SYN, -43, com.google.common.base.Ascii.ETB, -88, -110, 36, com.google.common.base.Ascii.US, -116, -1, -40, -82, 46, 1, -45, -83, 59, 75, -38, 70, -21, -55, -34, -102, -113, -121, -41, 58, Byte.MIN_VALUE, 111, 47, -56, -79, -76, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -9, 10, 34, 19, 40, 124, -52, 60, -119, -57, -61, -106, 86, 7, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 126, com.visa.cbp.getEncExpo.onUnminimized, com.google.common.base.Ascii.VT, 43, -105, 82, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 65, 121, 97, -90, 76, 16, -2, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 38, -107, -120, -118, -80, -93, -5, com.visa.cbp.getEncExpo.startTransaction, com.google.common.base.Ascii.CAN, -108, -14, -31, -27, -23, 93, -48, -36, 17, 102, 100, 92, -20, 89, 66, 117, 18, -11, 116, -100, -86, 35, 14, -122, -85, -66, 42, 2, -25, 103, -26, 68, -94, 108, -62, -109, -97, -15, -10, -6, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -46, 80, 104, -98, 98, 113, com.google.common.base.Ascii.NAK, kotlin.io.encoding.Base64.padSymbol, -42, 64, -60, -30, com.google.common.base.Ascii.SI, -114, -125, com.visa.cbp.getEncExpo.IResultReceiver, 107, 37, 5, 63, com.google.common.base.Ascii.FF, 48, -22, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -73, -95, -24, -87, 101, -115, 39, com.google.common.base.Ascii.SUB, -37, -127, -77, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -12, 69, 122, com.google.common.base.Ascii.EM, -33, -18, 120, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, com.visa.cbp.getEncExpo.IResultReceiver2};
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = {85, -62, 99, 113, 59, -56, 71, -122, -97, 60, -38, 91, 41, -86, -3, com.visa.cbp.getEncExpo.IResultReceiver, -116, -59, -108, com.google.common.base.Ascii.FF, -90, com.google.common.base.Ascii.SUB, 19, 0, -29, -88, com.google.common.base.Ascii.SYN, 114, 64, -7, -8, 66, 68, 38, 104, -106, -127, -39, 69, 62, 16, 118, -58, -89, -117, 57, 67, -31, 58, -75, 86, 42, com.visa.cbp.getEncExpo.startTransaction, 109, -77, 5, 34, 102, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -36, com.google.common.base.Ascii.VT, -6, 98, 72, -35, 32, 17, 6, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -55, -63, com.visa.cbp.getEncExpo.kernelVersion, -10, 39, 82, -69, 105, -11, -44, -121, Byte.MAX_VALUE, -124, 76, -46, -100, 87, -92, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -102, -33, -2, -42, -115, 122, -21, 43, 83, -40, 92, -95, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.ETB, -5, 35, -43, 125, 48, 103, 115, 8, 9, -18, -73, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 63, 97, -78, com.google.common.base.Ascii.EM, -114, 78, -27, 75, -109, -113, 93, -37, -87, -83, -15, -82, 46, -53, 13, -4, -12, 45, 70, 110, com.google.common.base.Ascii.GS, -105, -24, -47, -23, 77, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -91, 117, 94, -125, -98, -85, -126, -99, -71, com.google.common.base.Ascii.FS, -32, -51, 73, -119, 1, -74, -67, 88, 36, -94, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 56, 120, com.visa.cbp.getEncExpo.registerForActivityResult, com.google.common.base.Ascii.NAK, -112, 80, -72, -107, -28, -48, -111, -57, -50, -19, com.google.common.base.Ascii.SI, -76, 111, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -52, com.visa.cbp.getEncExpo.onUnminimized, 2, 74, 121, -61, -34, -93, -17, -22, 81, -26, 107, com.google.common.base.Ascii.CAN, -20, com.google.common.base.Ascii.ESC, 44, Byte.MIN_VALUE, -9, 116, -25, -1, 33, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 106, 84, com.google.common.base.Ascii.RS, 65, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -110, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -60, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 7, 10, -70, 126, 14, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -120, -79, -104, 124, -13, kotlin.io.encoding.Base64.padSymbol, com.visa.cbp.getEncExpo.IResultReceiver2, 108, 123, -54, -45, com.google.common.base.Ascii.US, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 101, 4, 40, 100, -66, -123, -101, 47, 89, -118, -41, -80, 37, -84, -81, 18, 3, -30, -14};
    private static final short[] getHighSpeedVideoSizes = {17623, 9916, 25195, 4958, 22409, 13794, 28981, 2479, 19832, 12051, 27588, 6897, 24102, 15437, 30874, 18348};
    private final int[] getHighSpeedVideoFpsRanges;
    private final int[] getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private final int[] getInputSizeshNQ4ISI;
    private final byte[] getOutputFormats;
    private org.bouncycastle.crypto.engines.Zuc128CoreEngine getOutputMinFrameDuration;

    private int Camera2StreamConfigurationMap() {
        int[] iArr = this.getHighSpeedVideoFpsRanges;
        int i = iArr[0];
        int[] iArr2 = this.getHighSpeedVideoFpsRangesFor;
        int i2 = iArr2[0];
        int i3 = iArr2[1];
        int i4 = iArr[1] + i2;
        int i5 = iArr[2] ^ i3;
        int i6 = (i4 << 16) | (i5 >>> 16);
        int i7 = (i6 >>> 22) | (i6 << 10);
        int i8 = (i6 >>> 14) | (i6 << 18);
        int i9 = (i6 >>> 8) | (i6 << 24);
        int i10 = (((i6 ^ ((i6 >>> 30) | (i6 << 2))) ^ i7) ^ i8) ^ i9;
        int i11 = (i5 << 16) | (i4 >>> 16);
        int i12 = (i11 >>> 18) | (i11 << 14);
        int i13 = (i11 >>> 10) | (i11 << 22);
        int i14 = (i11 >>> 2) | (i11 << 30);
        int i15 = (((i11 ^ ((i11 >>> 24) | (i11 << 8))) ^ i12) ^ i13) ^ i14;
        byte[] bArr = Camera2StreamConfigurationMap;
        byte b = bArr[i10 >>> 24];
        byte[] bArr2 = getHighResolutionOutputSizeshNQ4ISI;
        iArr2[0] = Camera2StreamConfigurationMap(b, bArr2[(i10 >>> 16) & 255], bArr[(i10 >>> 8) & 255], bArr2[i10 & 255]);
        this.getHighSpeedVideoFpsRangesFor[1] = Camera2StreamConfigurationMap(bArr[i15 >>> 24], bArr2[(i15 >>> 16) & 255], bArr[(i15 >>> 8) & 255], bArr2[i15 & 255]);
        return (i ^ i2) + i3;
    }

    private static int Camera2StreamConfigurationMap(byte b, byte b2, byte b3, byte b4) {
        return ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    private void getHighSpeedVideoSizes() {
        int[] iArr = this.getInputSizeshNQ4ISI;
        int i = iArr[0];
        int i2 = i + (((i >>> 23) | (i << 8)) & Integer.MAX_VALUE);
        int i3 = iArr[4];
        int i4 = (i2 & Integer.MAX_VALUE) + (i2 >>> 31) + (((i3 >>> 11) | (i3 << 20)) & Integer.MAX_VALUE);
        int i5 = iArr[10];
        int i6 = (i4 & Integer.MAX_VALUE) + (i4 >>> 31) + (((i5 >>> 10) | (i5 << 21)) & Integer.MAX_VALUE);
        int i7 = iArr[13];
        int i8 = (i6 & Integer.MAX_VALUE) + (i6 >>> 31) + (((i7 >>> 14) | (i7 << 17)) & Integer.MAX_VALUE);
        int i9 = iArr[15];
        int i10 = (i8 & Integer.MAX_VALUE) + (i8 >>> 31) + (((i9 >>> 16) | (i9 << 15)) & Integer.MAX_VALUE);
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = i3;
        iArr[4] = iArr[5];
        iArr[5] = iArr[6];
        iArr[6] = iArr[7];
        iArr[7] = iArr[8];
        iArr[8] = iArr[9];
        iArr[9] = i5;
        iArr[10] = iArr[11];
        iArr[11] = iArr[12];
        iArr[12] = i7;
        iArr[13] = iArr[14];
        iArr[14] = i9;
        iArr[15] = (Integer.MAX_VALUE & i10) + (i10 >>> 31);
    }

    protected int getMaxIterations() {
        return 2047;
    }

    protected void setKeyAndIV(int[] iArr, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 16) {
            throw new java.lang.IllegalArgumentException("A key of 16 bytes is needed");
        }
        if (bArr2 == null || bArr2.length != 16) {
            throw new java.lang.IllegalArgumentException("An IV of 16 bytes is needed");
        }
        int[] iArr2 = this.getInputSizeshNQ4ISI;
        byte b = bArr[0];
        short[] sArr = getHighSpeedVideoSizes;
        iArr2[0] = ((b & 255) << 23) | ((sArr[0] & kotlin.UShort.MAX_VALUE) << 8) | (bArr2[0] & 255);
        iArr2[1] = ((bArr[1] & 255) << 23) | ((sArr[1] & kotlin.UShort.MAX_VALUE) << 8) | (bArr2[1] & 255);
        iArr2[2] = ((bArr[2] & 255) << 23) | ((sArr[2] & kotlin.UShort.MAX_VALUE) << 8) | (bArr2[2] & 255);
        iArr2[3] = ((bArr[3] & 255) << 23) | ((sArr[3] & kotlin.UShort.MAX_VALUE) << 8) | (bArr2[3] & 255);
        iArr2[4] = ((bArr[4] & 255) << 23) | ((sArr[4] & kotlin.UShort.MAX_VALUE) << 8) | (bArr2[4] & 255);
        iArr2[5] = ((bArr[5] & 255) << 23) | ((sArr[5] & kotlin.UShort.MAX_VALUE) << 8) | (bArr2[5] & 255);
        iArr2[6] = ((bArr[6] & 255) << 23) | ((sArr[6] & kotlin.UShort.MAX_VALUE) << 8) | (bArr2[6] & 255);
        iArr2[7] = ((bArr[7] & 255) << 23) | ((sArr[7] & kotlin.UShort.MAX_VALUE) << 8) | (bArr2[7] & 255);
        iArr2[8] = ((bArr[8] & 255) << 23) | ((sArr[8] & kotlin.UShort.MAX_VALUE) << 8) | (bArr2[8] & 255);
        iArr2[9] = ((bArr[9] & 255) << 23) | ((sArr[9] & kotlin.UShort.MAX_VALUE) << 8) | (bArr2[9] & 255);
        iArr2[10] = ((bArr[10] & 255) << 23) | ((sArr[10] & kotlin.UShort.MAX_VALUE) << 8) | (bArr2[10] & 255);
        iArr2[11] = ((bArr[11] & 255) << 23) | ((sArr[11] & kotlin.UShort.MAX_VALUE) << 8) | (bArr2[11] & 255);
        iArr2[12] = ((bArr[12] & 255) << 23) | ((sArr[12] & kotlin.UShort.MAX_VALUE) << 8) | (bArr2[12] & 255);
        iArr2[13] = ((bArr[13] & 255) << 23) | ((sArr[13] & kotlin.UShort.MAX_VALUE) << 8) | (bArr2[13] & 255);
        iArr2[14] = ((bArr[14] & 255) << 23) | ((sArr[14] & kotlin.UShort.MAX_VALUE) << 8) | (bArr2[14] & 255);
        iArr2[15] = ((bArr[15] & 255) << 23) | ((sArr[15] & kotlin.UShort.MAX_VALUE) << 8) | (bArr2[15] & 255);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        byte[] bArr;
        org.bouncycastle.crypto.CipherParameters cipherParameters2 = cipherParameters;
        if (cipherParameters2 instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters2;
            bArr = parametersWithIV.getIV();
            cipherParameters2 = parametersWithIV.getParameters();
        } else {
            bArr = null;
        }
        byte[] key = cipherParameters2 instanceof org.bouncycastle.crypto.params.KeyParameter ? ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters2).getKey() : null;
        this.getHighSpeedVideoSizesFor = 0;
        this.getInputFormats = 0;
        setKeyAndIV(this.getInputSizeshNQ4ISI, key, bArr);
        int[] iArr = this.getHighSpeedVideoFpsRangesFor;
        iArr[0] = 0;
        iArr[1] = 0;
        int i = 32;
        while (true) {
            getHighResolutionOutputSizeshNQ4ISI();
            if (i <= 0) {
                Camera2StreamConfigurationMap();
                getHighSpeedVideoSizes();
                this.getOutputMinFrameDuration = (org.bouncycastle.crypto.engines.Zuc128CoreEngine) copy();
                return;
            }
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap() >>> 1;
            int[] iArr2 = this.getInputSizeshNQ4ISI;
            int i2 = iArr2[0];
            int i3 = i2 + (((i2 >>> 23) | (i2 << 8)) & Integer.MAX_VALUE);
            int i4 = iArr2[4];
            int i5 = (i3 & Integer.MAX_VALUE) + (i3 >>> 31) + (((i4 >>> 11) | (i4 << 20)) & Integer.MAX_VALUE);
            int i6 = iArr2[10];
            int i7 = (i5 & Integer.MAX_VALUE) + (i5 >>> 31) + (((i6 >>> 10) | (i6 << 21)) & Integer.MAX_VALUE);
            int i8 = iArr2[13];
            int i9 = (i7 & Integer.MAX_VALUE) + (i7 >>> 31) + (((i8 >>> 14) | (i8 << 17)) & Integer.MAX_VALUE);
            int i10 = iArr2[15];
            int i11 = (i9 & Integer.MAX_VALUE) + (i9 >>> 31) + (((i10 >>> 16) | (i10 << 15)) & Integer.MAX_VALUE);
            int i12 = (i11 & Integer.MAX_VALUE) + (i11 >>> 31) + Camera2StreamConfigurationMap2;
            iArr2[0] = iArr2[1];
            iArr2[1] = iArr2[2];
            iArr2[2] = iArr2[3];
            iArr2[3] = i4;
            iArr2[4] = iArr2[5];
            iArr2[5] = iArr2[6];
            iArr2[6] = iArr2[7];
            iArr2[7] = iArr2[8];
            iArr2[8] = iArr2[9];
            iArr2[9] = i6;
            iArr2[10] = iArr2[11];
            iArr2[11] = iArr2[12];
            iArr2[12] = i8;
            iArr2[13] = iArr2[14];
            iArr2[14] = i10;
            iArr2[15] = (i12 & Integer.MAX_VALUE) + (i12 >>> 31);
            i--;
        }
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        if (this.getHighSpeedVideoSizesFor == 0) {
            encode32be(makeKeyStreamWord(), this.getOutputFormats, 0);
        }
        byte[] bArr = this.getOutputFormats;
        int i = this.getHighSpeedVideoSizesFor;
        byte b2 = (byte) (b ^ bArr[i]);
        this.getHighSpeedVideoSizesFor = (i + 1) % 4;
        return b2;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        org.bouncycastle.crypto.engines.Zuc128CoreEngine zuc128CoreEngine = (org.bouncycastle.crypto.engines.Zuc128CoreEngine) memoable;
        int[] iArr = zuc128CoreEngine.getInputSizeshNQ4ISI;
        int[] iArr2 = this.getInputSizeshNQ4ISI;
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = zuc128CoreEngine.getHighSpeedVideoFpsRangesFor;
        int[] iArr4 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        int[] iArr5 = zuc128CoreEngine.getHighSpeedVideoFpsRanges;
        int[] iArr6 = this.getHighSpeedVideoFpsRanges;
        java.lang.System.arraycopy(iArr5, 0, iArr6, 0, iArr6.length);
        byte[] bArr = zuc128CoreEngine.getOutputFormats;
        byte[] bArr2 = this.getOutputFormats;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.getHighSpeedVideoSizesFor = zuc128CoreEngine.getHighSpeedVideoSizesFor;
        this.getInputFormats = zuc128CoreEngine.getInputFormats;
        this.getOutputMinFrameDuration = zuc128CoreEngine;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        org.bouncycastle.crypto.engines.Zuc128CoreEngine zuc128CoreEngine = this.getOutputMinFrameDuration;
        if (zuc128CoreEngine != null) {
            reset(zuc128CoreEngine);
        }
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (this.getOutputMinFrameDuration == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getAlgorithmName());
            sb.append(" not initialised");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (i + i2 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4 + i3] = returnByte(bArr[i4 + i]);
        }
        return i2;
    }

    public int makeKeyStreamWord() {
        int i = this.getInputFormats;
        this.getInputFormats = i + 1;
        if (i >= getMaxIterations()) {
            throw new java.lang.IllegalStateException("Too much data processed by singleKey/IV");
        }
        getHighResolutionOutputSizeshNQ4ISI();
        int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
        int i2 = this.getHighSpeedVideoFpsRanges[3];
        getHighSpeedVideoSizes();
        return Camera2StreamConfigurationMap2 ^ i2;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public java.lang.String getAlgorithmName() {
        return "Zuc-128";
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.engines.Zuc128CoreEngine(this);
    }

    public static void encode32be(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        int[] iArr = this.getHighSpeedVideoFpsRanges;
        int[] iArr2 = this.getInputSizeshNQ4ISI;
        iArr[0] = ((iArr2[15] & 2147450880) << 1) | (iArr2[14] & 65535);
        iArr[1] = ((iArr2[11] & 65535) << 16) | (iArr2[9] >>> 15);
        iArr[2] = ((iArr2[7] & 65535) << 16) | (iArr2[5] >>> 15);
        iArr[3] = (iArr2[0] >>> 15) | ((iArr2[2] & 65535) << 16);
    }

    protected Zuc128CoreEngine(org.bouncycastle.crypto.engines.Zuc128CoreEngine zuc128CoreEngine) {
        this.getInputSizeshNQ4ISI = new int[16];
        this.getHighSpeedVideoFpsRangesFor = new int[2];
        this.getHighSpeedVideoFpsRanges = new int[4];
        this.getOutputFormats = new byte[4];
        reset(zuc128CoreEngine);
    }

    public Zuc128CoreEngine() {
        this.getInputSizeshNQ4ISI = new int[16];
        this.getHighSpeedVideoFpsRangesFor = new int[2];
        this.getHighSpeedVideoFpsRanges = new int[4];
        this.getOutputFormats = new byte[4];
    }
}
