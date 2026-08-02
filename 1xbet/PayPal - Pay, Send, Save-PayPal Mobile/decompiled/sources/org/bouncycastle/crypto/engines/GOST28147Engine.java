package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class GOST28147Engine implements org.bouncycastle.crypto.BlockCipher {
    protected static final int BLOCK_SIZE = 8;
    private static java.util.Hashtable getInputSizeshNQ4ISI;
    private boolean getOutputSizeshNQ4ISI;
    private static byte[] getOutputFormats = {4, 10, 9, 2, 13, 8, 0, 14, 6, com.google.common.base.Ascii.VT, 1, com.google.common.base.Ascii.FF, 7, com.google.common.base.Ascii.SI, 5, 3, 14, com.google.common.base.Ascii.VT, 4, com.google.common.base.Ascii.FF, 6, 13, com.google.common.base.Ascii.SI, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, 14, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, 7, 6, 0, 9, com.google.common.base.Ascii.VT, 7, 13, 10, 1, 0, 8, 9, com.google.common.base.Ascii.SI, 14, 4, 6, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, 2, 5, 3, 6, com.google.common.base.Ascii.FF, 7, 1, 5, com.google.common.base.Ascii.SI, 13, 8, 4, 10, 9, 14, 0, 3, com.google.common.base.Ascii.VT, 2, 4, com.google.common.base.Ascii.VT, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, 14, 13, com.google.common.base.Ascii.VT, 4, 1, 3, com.google.common.base.Ascii.SI, 5, 9, 0, 10, 14, 7, 6, 8, 2, com.google.common.base.Ascii.FF, 1, com.google.common.base.Ascii.SI, 13, 0, 5, 7, 10, 4, 9, 2, 3, 14, 6, com.google.common.base.Ascii.VT, 8, com.google.common.base.Ascii.FF};
    private static byte[] getOutputMinFrameDuration = {4, 2, com.google.common.base.Ascii.SI, 5, 9, 1, 0, 8, 14, 3, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 13, 7, 10, 6, com.google.common.base.Ascii.FF, 9, com.google.common.base.Ascii.SI, 14, 8, 1, 3, 10, 2, 7, 4, 13, 6, 0, com.google.common.base.Ascii.VT, 5, 13, 8, 14, com.google.common.base.Ascii.FF, 7, 3, 9, 10, 1, 5, 2, 4, 6, com.google.common.base.Ascii.SI, 0, com.google.common.base.Ascii.VT, 14, 9, com.google.common.base.Ascii.VT, 2, 5, com.google.common.base.Ascii.SI, 7, 1, 0, 13, com.google.common.base.Ascii.FF, 6, 10, 4, 3, 8, 3, 14, 5, 9, 6, 8, 0, 13, 10, com.google.common.base.Ascii.VT, 7, com.google.common.base.Ascii.FF, 2, 1, com.google.common.base.Ascii.SI, 4, 8, com.google.common.base.Ascii.SI, 6, com.google.common.base.Ascii.VT, 1, 9, com.google.common.base.Ascii.FF, 5, 13, 3, 7, 10, 0, 14, 2, 4, 9, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 0, 3, 6, 7, 5, 4, 8, 14, com.google.common.base.Ascii.SI, 1, 10, 2, 13, com.google.common.base.Ascii.FF, 6, 5, 2, com.google.common.base.Ascii.VT, 0, 9, 13, 3, 14, 7, 10, com.google.common.base.Ascii.SI, 4, 1, 8};
    private static byte[] getHighSpeedVideoFpsRanges = {9, 6, 3, 2, 8, com.google.common.base.Ascii.VT, 1, 7, 10, 4, 14, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, 0, 13, 5, 3, 7, 14, 9, 8, 10, com.google.common.base.Ascii.SI, 0, 5, 2, 6, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, 4, 13, 1, 14, 4, 6, 2, com.google.common.base.Ascii.VT, 3, 13, 8, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, 5, 10, 0, 7, 1, 9, 14, 7, 10, com.google.common.base.Ascii.FF, 13, 1, 3, 9, 0, 2, com.google.common.base.Ascii.VT, 4, com.google.common.base.Ascii.SI, 8, 5, 6, com.google.common.base.Ascii.VT, 5, 1, 9, 8, 13, com.google.common.base.Ascii.SI, 0, 14, 4, 2, 3, com.google.common.base.Ascii.FF, 7, 10, 6, 3, 10, 13, com.google.common.base.Ascii.FF, 1, 2, 0, com.google.common.base.Ascii.VT, 7, 5, 9, 4, 8, com.google.common.base.Ascii.SI, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, com.google.common.base.Ascii.FF, 4, 5, com.google.common.base.Ascii.SI, 3, com.google.common.base.Ascii.VT, 14, com.google.common.base.Ascii.VT, 10, com.google.common.base.Ascii.SI, 5, 0, com.google.common.base.Ascii.FF, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};
    private static byte[] Camera2StreamConfigurationMap = {8, 4, com.google.common.base.Ascii.VT, 1, 3, 5, 0, 9, 2, 14, 10, com.google.common.base.Ascii.FF, 13, 6, 7, com.google.common.base.Ascii.SI, 0, 1, 2, 10, 4, 13, 5, com.google.common.base.Ascii.FF, 9, 7, 3, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.VT, 8, 6, 14, 14, com.google.common.base.Ascii.FF, 0, 10, 9, 2, 13, com.google.common.base.Ascii.VT, 7, 5, 8, com.google.common.base.Ascii.SI, 3, 6, 1, 4, 7, 5, 0, 13, com.google.common.base.Ascii.VT, 6, 1, 2, 3, 10, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, 4, 14, 9, 8, 2, 7, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, 9, 5, 10, com.google.common.base.Ascii.VT, 1, 4, 0, 13, 6, 8, 14, 3, 8, 3, 2, 6, 4, 13, 14, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 1, 7, com.google.common.base.Ascii.SI, 10, 0, 9, 5, 5, 2, 10, com.google.common.base.Ascii.VT, 9, 1, com.google.common.base.Ascii.FF, 3, 7, 4, 13, 0, 6, com.google.common.base.Ascii.SI, 8, 14, 0, 4, com.google.common.base.Ascii.VT, 14, 8, 3, 7, 1, 10, 2, 9, 6, com.google.common.base.Ascii.SI, 13, 5, com.google.common.base.Ascii.FF};
    private static byte[] getHighSpeedVideoSizes = {1, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 2, 9, 13, 0, com.google.common.base.Ascii.SI, 4, 5, 8, 14, 10, 7, 6, 3, 0, 1, 7, 13, com.google.common.base.Ascii.VT, 4, 5, 2, 8, 14, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, 9, 10, 6, 3, 8, 2, 5, 0, 4, 9, com.google.common.base.Ascii.SI, 10, 3, 7, com.google.common.base.Ascii.FF, 13, 6, 14, 1, com.google.common.base.Ascii.VT, 3, 6, 0, 1, 5, 13, 10, 8, com.google.common.base.Ascii.VT, 2, 9, 7, 14, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, 4, 8, 13, com.google.common.base.Ascii.VT, 0, 4, 5, 1, 2, 9, 3, com.google.common.base.Ascii.FF, 14, 6, com.google.common.base.Ascii.SI, 10, 7, com.google.common.base.Ascii.FF, 9, com.google.common.base.Ascii.VT, 1, 8, 14, 2, 4, 7, 3, 6, 5, 10, 0, com.google.common.base.Ascii.SI, 13, 10, 9, 6, 8, 13, 14, 2, 0, com.google.common.base.Ascii.SI, 3, 5, com.google.common.base.Ascii.VT, 4, 1, com.google.common.base.Ascii.FF, 7, 7, 4, 0, 5, 10, 2, com.google.common.base.Ascii.SI, 14, com.google.common.base.Ascii.FF, 6, 1, com.google.common.base.Ascii.VT, 13, 9, 3, 8};
    private static byte[] getInputFormats = {com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, 2, 10, 6, 4, 5, 0, 7, 9, 14, 13, 1, com.google.common.base.Ascii.VT, 8, 3, com.google.common.base.Ascii.VT, 6, 3, 4, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, 14, 2, 7, 13, 8, 0, 5, 10, 9, 1, 1, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, 0, com.google.common.base.Ascii.SI, 14, 6, 5, 10, 13, 4, 8, 9, 3, 7, 2, 1, 5, 14, com.google.common.base.Ascii.FF, 10, 7, 0, 13, 6, 2, com.google.common.base.Ascii.VT, 4, 9, 3, com.google.common.base.Ascii.SI, 8, 0, com.google.common.base.Ascii.FF, 8, 9, 13, 2, 10, com.google.common.base.Ascii.VT, 7, 3, 6, 5, 4, 14, com.google.common.base.Ascii.SI, 1, 8, 0, com.google.common.base.Ascii.SI, 3, 2, 5, 14, com.google.common.base.Ascii.VT, 1, 10, 4, 7, com.google.common.base.Ascii.FF, 9, 13, 6, 3, 0, 6, com.google.common.base.Ascii.SI, 1, 14, 9, 2, 13, 8, com.google.common.base.Ascii.FF, 4, com.google.common.base.Ascii.VT, 10, 5, 7, 1, 10, 6, 8, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.VT, 0, 4, com.google.common.base.Ascii.FF, 3, 5, 9, 7, 13, 2, 14};
    private static byte[] getHighSpeedVideoSizesFor = {com.google.common.base.Ascii.FF, 4, 6, 2, 10, 5, com.google.common.base.Ascii.VT, 9, 14, 8, 13, 7, 0, 3, com.google.common.base.Ascii.SI, 1, 6, 8, 2, 3, 9, 10, 5, com.google.common.base.Ascii.FF, 1, 14, 4, 7, com.google.common.base.Ascii.VT, 13, 0, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.VT, 3, 5, 8, 2, com.google.common.base.Ascii.SI, 10, 13, 14, 1, 7, 4, com.google.common.base.Ascii.FF, 9, 6, 0, com.google.common.base.Ascii.FF, 8, 2, 1, 13, 4, com.google.common.base.Ascii.SI, 6, 7, 0, 10, 5, 3, 14, 9, com.google.common.base.Ascii.VT, 7, com.google.common.base.Ascii.SI, 5, 10, 8, 1, 6, 13, 0, 9, 3, 14, com.google.common.base.Ascii.VT, 4, 2, com.google.common.base.Ascii.FF, 5, 13, com.google.common.base.Ascii.SI, 6, 9, 2, com.google.common.base.Ascii.FF, 10, com.google.common.base.Ascii.VT, 7, 8, 1, 4, 3, 14, 0, 8, 14, 2, 5, 6, 9, 1, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, 4, com.google.common.base.Ascii.VT, 0, 13, 10, 3, 7, 1, 7, 14, 13, 0, 5, 8, 3, 4, com.google.common.base.Ascii.SI, 10, 6, 9, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, 2};
    private static byte[] getHighSpeedVideoFpsRangesFor = {4, 10, 9, 2, 13, 8, 0, 14, 6, com.google.common.base.Ascii.VT, 1, com.google.common.base.Ascii.FF, 7, com.google.common.base.Ascii.SI, 5, 3, 14, com.google.common.base.Ascii.VT, 4, com.google.common.base.Ascii.FF, 6, 13, com.google.common.base.Ascii.SI, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, 14, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, 7, 6, 0, 9, com.google.common.base.Ascii.VT, 7, 13, 10, 1, 0, 8, 9, com.google.common.base.Ascii.SI, 14, 4, 6, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, 2, 5, 3, 6, com.google.common.base.Ascii.FF, 7, 1, 5, com.google.common.base.Ascii.SI, 13, 8, 4, 10, 9, 14, 0, 3, com.google.common.base.Ascii.VT, 2, 4, com.google.common.base.Ascii.VT, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, 14, 13, com.google.common.base.Ascii.VT, 4, 1, 3, com.google.common.base.Ascii.SI, 5, 9, 0, 10, 14, 7, 6, 8, 2, com.google.common.base.Ascii.FF, 1, com.google.common.base.Ascii.SI, 13, 0, 5, 7, 10, 4, 9, 2, 3, 14, 6, com.google.common.base.Ascii.VT, 8, com.google.common.base.Ascii.FF};
    private static byte[] getHighResolutionOutputSizeshNQ4ISI = {10, 4, 5, 6, 8, 1, 3, 7, 13, com.google.common.base.Ascii.FF, 14, 0, 9, 2, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SI, 5, com.google.common.base.Ascii.SI, 4, 0, 2, 13, com.google.common.base.Ascii.VT, 9, 1, 7, 6, 3, com.google.common.base.Ascii.FF, 14, 10, 8, 7, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, 14, 9, 4, 1, 0, 3, com.google.common.base.Ascii.VT, 5, 2, 6, 10, 8, 13, 4, 10, 7, com.google.common.base.Ascii.FF, 0, com.google.common.base.Ascii.SI, 2, 8, 14, 1, 6, 5, 13, com.google.common.base.Ascii.VT, 9, 3, 7, 6, 4, com.google.common.base.Ascii.VT, 9, com.google.common.base.Ascii.FF, 2, 10, 1, 8, 0, 14, com.google.common.base.Ascii.SI, 13, 3, 5, 7, 6, 2, 4, 13, 9, com.google.common.base.Ascii.SI, 0, 10, 1, 5, com.google.common.base.Ascii.VT, 8, 14, com.google.common.base.Ascii.FF, 3, 13, 14, 4, 1, 7, 0, 5, 10, 3, com.google.common.base.Ascii.FF, 8, com.google.common.base.Ascii.SI, 6, 2, 9, com.google.common.base.Ascii.VT, 1, 3, 10, 9, 5, com.google.common.base.Ascii.VT, 4, com.google.common.base.Ascii.SI, 8, 6, 7, 14, 13, 0, 2, com.google.common.base.Ascii.FF};
    private int[] getOutputSizes = null;
    private byte[] getOutputStallDuration = getOutputFormats;

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    static {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        getInputSizeshNQ4ISI = hashtable;
        hashtable.put(org.bouncycastle.util.Strings.toUpperCase("Default"), getOutputFormats);
        getInputSizeshNQ4ISI.put(org.bouncycastle.util.Strings.toUpperCase("E-TEST"), getOutputMinFrameDuration);
        getInputSizeshNQ4ISI.put(org.bouncycastle.util.Strings.toUpperCase("E-A"), getHighSpeedVideoFpsRanges);
        getInputSizeshNQ4ISI.put(org.bouncycastle.util.Strings.toUpperCase("E-B"), Camera2StreamConfigurationMap);
        getInputSizeshNQ4ISI.put(org.bouncycastle.util.Strings.toUpperCase("E-C"), getHighSpeedVideoSizes);
        getInputSizeshNQ4ISI.put(org.bouncycastle.util.Strings.toUpperCase("E-D"), getInputFormats);
        getInputSizeshNQ4ISI.put(org.bouncycastle.util.Strings.toUpperCase("Param-Z"), getHighSpeedVideoSizesFor);
        getInputSizeshNQ4ISI.put(org.bouncycastle.util.Strings.toUpperCase("D-TEST"), getHighSpeedVideoFpsRangesFor);
        getInputSizeshNQ4ISI.put(org.bouncycastle.util.Strings.toUpperCase("D-A"), getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3;
        int i4;
        int[] iArr = this.getOutputSizes;
        if (iArr == null) {
            throw new java.lang.IllegalStateException("GOST28147 engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr, i);
        int highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(bArr, i + 4);
        int i5 = 7;
        if (this.getOutputSizeshNQ4ISI) {
            for (int i6 = 0; i6 < 3; i6++) {
                int i7 = 0;
                while (i7 < 8) {
                    int highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, iArr[i7]);
                    i7++;
                    int i8 = highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI2 ^ highResolutionOutputSizeshNQ4ISI3;
                    highResolutionOutputSizeshNQ4ISI2 = i8;
                }
            }
            i3 = highResolutionOutputSizeshNQ4ISI2;
            i4 = highResolutionOutputSizeshNQ4ISI;
            while (i5 > 0) {
                int highResolutionOutputSizeshNQ4ISI4 = getHighResolutionOutputSizeshNQ4ISI(i4, iArr[i5]);
                i5--;
                int i9 = i3 ^ highResolutionOutputSizeshNQ4ISI4;
                i3 = i4;
                i4 = i9;
            }
        } else {
            int i10 = 0;
            while (i10 < 8) {
                int highResolutionOutputSizeshNQ4ISI5 = getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, iArr[i10]);
                i10++;
                int i11 = highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI2 ^ highResolutionOutputSizeshNQ4ISI5;
                highResolutionOutputSizeshNQ4ISI2 = i11;
            }
            i3 = highResolutionOutputSizeshNQ4ISI2;
            i4 = highResolutionOutputSizeshNQ4ISI;
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = 7;
                while (i13 >= 0 && (i12 != 2 || i13 != 0)) {
                    int highResolutionOutputSizeshNQ4ISI6 = getHighResolutionOutputSizeshNQ4ISI(i4, iArr[i13]);
                    i13--;
                    int i14 = i3 ^ highResolutionOutputSizeshNQ4ISI6;
                    i3 = i4;
                    i4 = i14;
                }
            }
        }
        int highResolutionOutputSizeshNQ4ISI7 = getHighResolutionOutputSizeshNQ4ISI(i4, iArr[0]);
        getHighResolutionOutputSizeshNQ4ISI(i4, bArr2, i2);
        getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI7 ^ i3, bArr2, i2 + 4);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithSBox)) {
            if (cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter) {
                this.getOutputSizes = getHighResolutionOutputSizeshNQ4ISI(z, ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey());
                return;
            } else {
                if (cipherParameters == null) {
                    return;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to GOST28147 init - ");
                sb.append(cipherParameters.getClass().getName());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        org.bouncycastle.crypto.params.ParametersWithSBox parametersWithSBox = (org.bouncycastle.crypto.params.ParametersWithSBox) cipherParameters;
        byte[] sBox = parametersWithSBox.getSBox();
        if (sBox.length != getOutputFormats.length) {
            throw new java.lang.IllegalArgumentException("invalid S-box passed to GOST28147 init");
        }
        this.getOutputStallDuration = org.bouncycastle.util.Arrays.clone(sBox);
        if (parametersWithSBox.getParameters() != null) {
            this.getOutputSizes = getHighResolutionOutputSizeshNQ4ISI(z, ((org.bouncycastle.crypto.params.KeyParameter) parametersWithSBox.getParameters()).getKey());
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "GOST28147";
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >>> 24);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2] = (byte) i;
    }

    public static java.lang.String getSBoxName(byte[] bArr) {
        java.util.Enumeration keys = getInputSizeshNQ4ISI.keys();
        while (keys.hasMoreElements()) {
            java.lang.String str = (java.lang.String) keys.nextElement();
            if (org.bouncycastle.util.Arrays.areEqual((byte[]) getInputSizeshNQ4ISI.get(str), bArr)) {
                return str;
            }
        }
        throw new java.lang.IllegalArgumentException("SBOX provided did not map to a known one");
    }

    public static byte[] getSBox(java.lang.String str) {
        byte[] bArr = (byte[]) getInputSizeshNQ4ISI.get(org.bouncycastle.util.Strings.toUpperCase(str));
        if (bArr != null) {
            return org.bouncycastle.util.Arrays.clone(bArr);
        }
        throw new java.lang.IllegalArgumentException("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"Param-Z\", \"D-Test\", \"D-A\".");
    }

    private int[] getHighResolutionOutputSizeshNQ4ISI(boolean z, byte[] bArr) {
        this.getOutputSizeshNQ4ISI = z;
        if (bArr.length != 32) {
            throw new java.lang.IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        int[] iArr = new int[8];
        for (int i = 0; i != 8; i++) {
            iArr[i] = getHighResolutionOutputSizeshNQ4ISI(bArr, i * 4);
        }
        return iArr;
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i) {
        return ((bArr[i + 3] << com.google.common.base.Ascii.CAN) & (-16777216)) + ((bArr[i + 2] << 16) & 16711680) + ((bArr[i + 1] << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr[i] & 255);
    }

    private int getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
        int i3 = i2 + i;
        byte[] bArr = this.getOutputStallDuration;
        int i4 = bArr[i3 & 15] + (bArr[((i3 >> 4) & 15) + 16] << 4) + (bArr[((i3 >> 8) & 15) + 32] << 8) + (bArr[((i3 >> 12) & 15) + 48] << com.google.common.base.Ascii.FF) + (bArr[((i3 >> 16) & 15) + 64] << 16) + (bArr[((i3 >> 20) & 15) + 80] << com.google.common.base.Ascii.DC4) + (bArr[((i3 >> 24) & 15) + 96] << com.google.common.base.Ascii.CAN) + (bArr[((i3 >> 28) & 15) + 112] << com.google.common.base.Ascii.FS);
        return (i4 << 11) | (i4 >>> 21);
    }
}
