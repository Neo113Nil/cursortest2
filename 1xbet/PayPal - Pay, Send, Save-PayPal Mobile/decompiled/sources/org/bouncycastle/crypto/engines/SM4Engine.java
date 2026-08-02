package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class SM4Engine implements org.bouncycastle.crypto.BlockCipher {
    private static final byte[] getHighSpeedVideoFpsRanges = {-42, -112, -23, -2, -52, -31, kotlin.io.encoding.Base64.padSymbol, -73, com.google.common.base.Ascii.SYN, -74, com.google.common.base.Ascii.DC4, -62, 40, -5, 44, 5, 43, 103, -102, 118, 42, -66, 4, -61, -86, 68, 19, 38, 73, -122, 6, com.visa.cbp.getEncExpo.registerForActivityResult, -100, 66, 80, -12, -111, -17, -104, 122, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 84, com.google.common.base.Ascii.VT, 67, -19, com.visa.cbp.getEncExpo.kernelVersion, -84, 98, -28, -77, com.google.common.base.Ascii.FS, -87, -55, 8, -24, -107, Byte.MIN_VALUE, -33, -108, -6, 117, -113, 63, -90, 71, 7, -89, -4, -13, 115, com.google.common.base.Ascii.ETB, -70, -125, 89, 60, com.google.common.base.Ascii.EM, -26, -123, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -88, 104, 107, -127, -78, 113, 100, -38, -117, -8, -21, com.google.common.base.Ascii.SI, 75, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 86, -99, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.google.common.base.Ascii.RS, 36, 14, 94, 99, 88, -47, -94, 37, 34, 124, 59, 1, 33, 120, -121, -44, 0, 70, 87, -97, -45, 39, 82, 76, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 2, -25, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -60, -56, -98, -22, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -118, -46, 64, -57, 56, -75, -93, -9, -14, -50, -7, 97, com.google.common.base.Ascii.NAK, -95, -32, -82, 93, -92, -101, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, com.google.common.base.Ascii.SUB, 85, -83, -109, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 48, -11, -116, -79, -29, com.google.common.base.Ascii.GS, -10, -30, 46, -126, 102, -54, com.visa.cbp.getEncExpo.IResultReceiver2, com.visa.cbp.getEncExpo.startTransaction, 41, 35, -85, 13, 83, 78, 111, -43, -37, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 69, -34, -3, -114, 47, 3, -1, 106, 114, 109, 108, 91, 81, -115, com.google.common.base.Ascii.ESC, -81, -110, -69, -35, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, Byte.MAX_VALUE, 17, -39, 92, 65, com.google.common.base.Ascii.US, 16, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -40, 10, -63, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -120, -91, -51, 123, -67, 45, 116, -48, 18, -72, -27, -76, -80, -119, 105, -105, 74, com.google.common.base.Ascii.FF, -106, com.visa.cbp.getEncExpo.IResultReceiver, 126, 101, -71, -15, 9, -59, 110, -58, -124, com.google.common.base.Ascii.CAN, com.visa.cbp.getEncExpo.onUnminimized, 125, -20, 58, -36, 77, 32, 121, -18, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 62, -41, -53, 57, 72};
    private static final int[] getHighSpeedVideoFpsRangesFor = {462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257};
    private static final int[] getHighSpeedVideoSizes = {-1548633402, 1453994832, 1736282519, -1301273892};
    private int[] Camera2StreamConfigurationMap;
    private final int[] getHighResolutionOutputSizeshNQ4ISI = new int[4];

    private int Camera2StreamConfigurationMap(int i) {
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i);
        return (highSpeedVideoFpsRangesFor ^ ((highSpeedVideoFpsRangesFor >>> (-13)) | (highSpeedVideoFpsRangesFor << 13))) ^ ((highSpeedVideoFpsRangesFor >>> (-23)) | (highSpeedVideoFpsRangesFor << 23));
    }

    private static int getHighSpeedVideoSizes(int i) {
        return (((i ^ ((i >>> (-2)) | (i << 2))) ^ ((i >>> (-10)) | (i << 10))) ^ ((i >>> (-18)) | (i << 18))) ^ ((i >>> (-24)) | (i << 24));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to SM4 init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new java.lang.IllegalArgumentException("SM4 requires a 128 bit key");
        }
        int[] iArr = new int[32];
        int[] iArr2 = {org.bouncycastle.util.Pack.bigEndianToInt(key, 0), org.bouncycastle.util.Pack.bigEndianToInt(key, 4), org.bouncycastle.util.Pack.bigEndianToInt(key, 8), org.bouncycastle.util.Pack.bigEndianToInt(key, 12)};
        int i = iArr2[0];
        int[] iArr3 = getHighSpeedVideoSizes;
        int[] iArr4 = {i ^ iArr3[0], iArr2[1] ^ iArr3[1], iArr2[2] ^ iArr3[2], iArr2[3] ^ iArr3[3]};
        if (z) {
            int i2 = iArr4[0];
            int i3 = iArr4[1];
            int i4 = iArr4[2];
            int i5 = iArr4[3];
            int[] iArr5 = getHighSpeedVideoFpsRangesFor;
            int Camera2StreamConfigurationMap = i2 ^ Camera2StreamConfigurationMap(((i3 ^ i4) ^ i5) ^ iArr5[0]);
            iArr[0] = Camera2StreamConfigurationMap;
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap((Camera2StreamConfigurationMap ^ (iArr4[2] ^ iArr4[3])) ^ iArr5[1]) ^ iArr4[1];
            iArr[1] = Camera2StreamConfigurationMap2;
            int Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap((Camera2StreamConfigurationMap2 ^ (iArr4[3] ^ iArr[0])) ^ iArr5[2]) ^ iArr4[2];
            iArr[2] = Camera2StreamConfigurationMap3;
            iArr[3] = iArr4[3] ^ Camera2StreamConfigurationMap(((iArr[0] ^ iArr[1]) ^ Camera2StreamConfigurationMap3) ^ iArr5[3]);
            for (int i6 = 4; i6 < 32; i6++) {
                iArr[i6] = iArr[i6 - 4] ^ Camera2StreamConfigurationMap(((iArr[i6 - 3] ^ iArr[i6 - 2]) ^ iArr[i6 - 1]) ^ getHighSpeedVideoFpsRangesFor[i6]);
            }
        } else {
            int i7 = iArr4[0];
            int i8 = iArr4[1];
            int i9 = iArr4[2];
            int i10 = iArr4[3];
            int[] iArr6 = getHighSpeedVideoFpsRangesFor;
            int Camera2StreamConfigurationMap4 = i7 ^ Camera2StreamConfigurationMap(iArr6[0] ^ ((i8 ^ i9) ^ i10));
            iArr[31] = Camera2StreamConfigurationMap4;
            int Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap((Camera2StreamConfigurationMap4 ^ (iArr4[2] ^ iArr4[3])) ^ iArr6[1]) ^ iArr4[1];
            iArr[30] = Camera2StreamConfigurationMap5;
            int Camera2StreamConfigurationMap6 = Camera2StreamConfigurationMap((Camera2StreamConfigurationMap5 ^ (iArr4[3] ^ iArr[31])) ^ iArr6[2]) ^ iArr4[2];
            iArr[29] = Camera2StreamConfigurationMap6;
            iArr[28] = iArr4[3] ^ Camera2StreamConfigurationMap((Camera2StreamConfigurationMap6 ^ (iArr[31] ^ iArr[30])) ^ iArr6[3]);
            for (int i11 = 27; i11 >= 0; i11--) {
                iArr[i11] = iArr[i11 + 4] ^ Camera2StreamConfigurationMap(((iArr[i11 + 3] ^ iArr[i11 + 2]) ^ iArr[i11 + 1]) ^ getHighSpeedVideoFpsRangesFor[31 - i11]);
            }
        }
        this.Camera2StreamConfigurationMap = iArr;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new java.lang.IllegalStateException("SM4 not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        this.getHighResolutionOutputSizeshNQ4ISI[0] = org.bouncycastle.util.Pack.bigEndianToInt(bArr, i);
        this.getHighResolutionOutputSizeshNQ4ISI[1] = org.bouncycastle.util.Pack.bigEndianToInt(bArr, i + 4);
        this.getHighResolutionOutputSizeshNQ4ISI[2] = org.bouncycastle.util.Pack.bigEndianToInt(bArr, i + 8);
        this.getHighResolutionOutputSizeshNQ4ISI[3] = org.bouncycastle.util.Pack.bigEndianToInt(bArr, i + 12);
        for (int i3 = 0; i3 < 32; i3 += 4) {
            int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
            iArr[0] = getHighSpeedVideoSizes(getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap[i3] ^ ((iArr[1] ^ iArr[2]) ^ iArr[3]))) ^ iArr[0];
            int[] iArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
            iArr2[1] = getHighSpeedVideoSizes(getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap[i3 + 1] ^ ((iArr2[2] ^ iArr2[3]) ^ iArr2[0]))) ^ iArr2[1];
            int[] iArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
            iArr3[2] = getHighSpeedVideoSizes(getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap[i3 + 2] ^ ((iArr3[3] ^ iArr3[0]) ^ iArr3[1]))) ^ iArr3[2];
            int[] iArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
            iArr4[3] = getHighSpeedVideoSizes(getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap[i3 + 3] ^ ((iArr4[0] ^ iArr4[1]) ^ iArr4[2]))) ^ iArr4[3];
        }
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighResolutionOutputSizeshNQ4ISI[3], bArr2, i2);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighResolutionOutputSizeshNQ4ISI[2], bArr2, i2 + 4);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighResolutionOutputSizeshNQ4ISI[1], bArr2, i2 + 8);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighResolutionOutputSizeshNQ4ISI[0], bArr2, i2 + 12);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "SM4";
    }

    private static int getHighSpeedVideoFpsRangesFor(int i) {
        byte[] bArr = getHighSpeedVideoFpsRanges;
        return (bArr[i & 255] & 255) | ((bArr[(i >> 24) & 255] & 255) << 24) | ((bArr[(i >> 16) & 255] & 255) << 16) | ((bArr[(i >> 8) & 255] & 255) << 8);
    }
}
