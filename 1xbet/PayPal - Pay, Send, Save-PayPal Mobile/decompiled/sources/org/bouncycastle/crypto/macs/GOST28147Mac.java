package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
public class GOST28147Mac implements org.bouncycastle.crypto.Mac {
    private int getHighResolutionOutputSizeshNQ4ISI = 8;
    private int getOutputFormats = 4;
    private boolean Camera2StreamConfigurationMap = true;
    private int[] getHighSpeedVideoSizesFor = null;
    private byte[] getOutputMinFrameDuration = null;
    private byte[] getHighSpeedVideoFpsRanges = {9, 6, 3, 2, 8, com.google.common.base.Ascii.VT, 1, 7, 10, 4, 14, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, 0, 13, 5, 3, 7, 14, 9, 8, 10, com.google.common.base.Ascii.SI, 0, 5, 2, 6, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, 4, 13, 1, 14, 4, 6, 2, com.google.common.base.Ascii.VT, 3, 13, 8, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, 5, 10, 0, 7, 1, 9, 14, 7, 10, com.google.common.base.Ascii.FF, 13, 1, 3, 9, 0, 2, com.google.common.base.Ascii.VT, 4, com.google.common.base.Ascii.SI, 8, 5, 6, com.google.common.base.Ascii.VT, 5, 1, 9, 8, 13, com.google.common.base.Ascii.SI, 0, 14, 4, 2, 3, com.google.common.base.Ascii.FF, 7, 10, 6, 3, 10, 13, com.google.common.base.Ascii.FF, 1, 2, 0, com.google.common.base.Ascii.VT, 7, 5, 9, 4, 8, com.google.common.base.Ascii.SI, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, com.google.common.base.Ascii.FF, 4, 5, com.google.common.base.Ascii.SI, 3, com.google.common.base.Ascii.VT, 14, com.google.common.base.Ascii.VT, 10, com.google.common.base.Ascii.SI, 5, 0, com.google.common.base.Ascii.FF, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};
    private byte[] getInputFormats = new byte[8];
    private byte[] getHighSpeedVideoFpsRangesFor = new byte[8];
    private int getHighSpeedVideoSizes = 0;

    private void getHighSpeedVideoFpsRangesFor(int[] iArr, byte[] bArr, byte[] bArr2) {
        int highSpeedVideoSizes = getHighSpeedVideoSizes(bArr, 0);
        int highSpeedVideoSizes2 = getHighSpeedVideoSizes(bArr, 4);
        for (int i = 0; i < 2; i++) {
            int i2 = 0;
            while (i2 < 8) {
                int i3 = iArr[i2] + highSpeedVideoSizes;
                byte[] bArr3 = this.getHighSpeedVideoFpsRanges;
                int i4 = bArr3[i3 & 15] + (bArr3[((i3 >> 4) & 15) + 16] << 4) + (bArr3[((i3 >> 8) & 15) + 32] << 8) + (bArr3[((i3 >> 12) & 15) + 48] << com.google.common.base.Ascii.FF) + (bArr3[((i3 >> 16) & 15) + 64] << 16) + (bArr3[((i3 >> 20) & 15) + 80] << com.google.common.base.Ascii.DC4) + (bArr3[((i3 >> 24) & 15) + 96] << com.google.common.base.Ascii.CAN) + (bArr3[((i3 >> 28) & 15) + 112] << com.google.common.base.Ascii.FS);
                i2++;
                int i5 = highSpeedVideoSizes;
                highSpeedVideoSizes = highSpeedVideoSizes2 ^ ((i4 << 11) | (i4 >>> 21));
                highSpeedVideoSizes2 = i5;
            }
        }
        getHighSpeedVideoSizes(highSpeedVideoSizes, bArr2, 0);
        getHighSpeedVideoSizes(highSpeedVideoSizes2, bArr2, 4);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        reset();
        this.getHighSpeedVideoFpsRangesFor = new byte[this.getHighResolutionOutputSizeshNQ4ISI];
        this.getOutputMinFrameDuration = null;
        while (cipherParameters != null) {
            if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithSBox) {
                org.bouncycastle.crypto.params.ParametersWithSBox parametersWithSBox = (org.bouncycastle.crypto.params.ParametersWithSBox) cipherParameters;
                java.lang.System.arraycopy(parametersWithSBox.getSBox(), 0, this.getHighSpeedVideoFpsRanges, 0, parametersWithSBox.getSBox().length);
                cipherParameters = parametersWithSBox.getParameters();
            } else if (cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter) {
                byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
                if (key.length != 32) {
                    throw new java.lang.IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
                }
                int[] iArr = new int[8];
                for (int i = 0; i != 8; i++) {
                    iArr[i] = getHighSpeedVideoSizes(key, i * 4);
                }
                this.getHighSpeedVideoSizesFor = iArr;
                cipherParameters = null;
            } else {
                if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to GOST28147 init - ");
                    sb.append(cipherParameters.getClass().getName());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
                byte[] iv = parametersWithIV.getIV();
                byte[] bArr = this.getInputFormats;
                java.lang.System.arraycopy(iv, 0, bArr, 0, bArr.length);
                this.getOutputMinFrameDuration = parametersWithIV.getIV();
                cipherParameters = parametersWithIV.getParameters();
            }
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Can't have a negative input length!");
        }
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i4 = this.getHighSpeedVideoSizes;
        int i5 = i3 - i4;
        if (i2 > i5) {
            java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoFpsRangesFor, i4, i5);
            byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
            byte[] bArr3 = new byte[bArr2.length];
            java.lang.System.arraycopy(bArr2, 0, bArr3, 0, this.getInputFormats.length);
            if (this.Camera2StreamConfigurationMap) {
                this.Camera2StreamConfigurationMap = false;
                byte[] bArr4 = this.getOutputMinFrameDuration;
                if (bArr4 != null) {
                    bArr3 = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, 0, bArr4);
                }
            } else {
                bArr3 = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, 0, this.getInputFormats);
            }
            getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizesFor, bArr3, this.getInputFormats);
            this.getHighSpeedVideoSizes = 0;
            while (true) {
                i2 -= i5;
                i += i5;
                if (i2 <= this.getHighResolutionOutputSizeshNQ4ISI) {
                    break;
                }
                getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizesFor, Camera2StreamConfigurationMap(bArr, i, this.getInputFormats), this.getInputFormats);
                i5 = this.getHighResolutionOutputSizeshNQ4ISI;
            }
        }
        java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, i2);
        this.getHighSpeedVideoSizes += i2;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) throws java.lang.IllegalStateException {
        int i = this.getHighSpeedVideoSizes;
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[bArr.length];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, this.getInputFormats.length);
            if (this.Camera2StreamConfigurationMap) {
                this.Camera2StreamConfigurationMap = false;
                byte[] bArr3 = this.getOutputMinFrameDuration;
                if (bArr3 != null) {
                    bArr2 = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, 0, bArr3);
                }
            } else {
                bArr2 = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, 0, this.getInputFormats);
            }
            getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizesFor, bArr2, this.getInputFormats);
            this.getHighSpeedVideoSizes = 0;
        }
        byte[] bArr4 = this.getHighSpeedVideoFpsRangesFor;
        int i2 = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = i2 + 1;
        bArr4[i2] = b;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            if (i >= bArr.length) {
                this.getHighSpeedVideoSizes = 0;
                this.Camera2StreamConfigurationMap = true;
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.getOutputFormats;
    }

    @Override // org.bouncycastle.crypto.Mac
    public java.lang.String getAlgorithmName() {
        return "GOST28147Mac";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        while (true) {
            int i2 = this.getHighSpeedVideoSizes;
            if (i2 >= this.getHighResolutionOutputSizeshNQ4ISI) {
                break;
            }
            this.getHighSpeedVideoFpsRangesFor[i2] = 0;
            this.getHighSpeedVideoSizes = i2 + 1;
        }
        byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
        byte[] bArr3 = new byte[bArr2.length];
        java.lang.System.arraycopy(bArr2, 0, bArr3, 0, this.getInputFormats.length);
        if (this.Camera2StreamConfigurationMap) {
            this.Camera2StreamConfigurationMap = false;
        } else {
            bArr3 = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, 0, this.getInputFormats);
        }
        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizesFor, bArr3, this.getInputFormats);
        byte[] bArr4 = this.getInputFormats;
        int length = bArr4.length / 2;
        int i3 = this.getOutputFormats;
        java.lang.System.arraycopy(bArr4, length - i3, bArr, i, i3);
        reset();
        return this.getOutputFormats;
    }

    private static void getHighSpeedVideoSizes(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >>> 24);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2] = (byte) i;
    }

    private static int getHighSpeedVideoSizes(byte[] bArr, int i) {
        return ((bArr[i + 3] << com.google.common.base.Ascii.CAN) & (-16777216)) + ((bArr[i + 2] << 16) & 16711680) + ((bArr[i + 1] << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr[i] & 255);
    }

    private static byte[] Camera2StreamConfigurationMap(byte[] bArr, int i, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length - i];
        java.lang.System.arraycopy(bArr, i, bArr3, 0, bArr2.length);
        for (int i2 = 0; i2 != bArr2.length; i2++) {
            bArr3[i2] = (byte) (bArr3[i2] ^ bArr2[i2]);
        }
        return bArr3;
    }
}
