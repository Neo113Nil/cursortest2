package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class HC128Engine implements org.bouncycastle.crypto.StreamCipher {
    private boolean Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getInputSizeshNQ4ISI;
    private int[] getOutputMinFrameDuration = new int[512];
    private int[] getOutputFormats = new int[512];
    private int getHighSpeedVideoFpsRangesFor = 0;
    private byte[] getHighSpeedVideoFpsRanges = new byte[4];
    private int getHighSpeedVideoSizes = 0;

    private static int Camera2StreamConfigurationMap(int i, int i2, int i3) {
        return (((i >>> 10) | (i << (-10))) ^ ((i3 >>> 23) | (i3 << (-23)))) + ((i2 >>> 8) | (i2 << (-8)));
    }

    private void getHighSpeedVideoFpsRanges() {
        if (this.getInputSizeshNQ4ISI.length != 16) {
            throw new java.lang.IllegalArgumentException("The key must be 128 bits long");
        }
        this.getHighSpeedVideoSizes = 0;
        this.getHighSpeedVideoFpsRangesFor = 0;
        int[] iArr = new int[1280];
        for (int i = 0; i < 16; i++) {
            int i2 = i >> 2;
            iArr[i2] = ((this.getInputSizeshNQ4ISI[i] & 255) << ((i & 3) * 8)) | iArr[i2];
        }
        java.lang.System.arraycopy(iArr, 0, iArr, 4, 4);
        int i3 = 0;
        while (true) {
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i3 >= bArr.length || i3 >= 16) {
                break;
            }
            int i4 = (i3 >> 2) + 8;
            iArr[i4] = ((bArr[i3] & 255) << ((i3 & 3) * 8)) | iArr[i4];
            i3++;
        }
        java.lang.System.arraycopy(iArr, 8, iArr, 12, 4);
        for (int i5 = 16; i5 < 1280; i5++) {
            int i6 = iArr[i5 - 2];
            int i7 = ((((i6 >>> 19) | (i6 << (-19))) ^ ((i6 << (-17)) | (i6 >>> 17))) ^ (i6 >>> 10)) + iArr[i5 - 7];
            int i8 = iArr[i5 - 15];
            iArr[i5] = i7 + ((((i8 >>> 18) | (i8 << (-18))) ^ ((i8 << (-7)) | (i8 >>> 7))) ^ (i8 >>> 3)) + iArr[i5 - 16] + i5;
        }
        java.lang.System.arraycopy(iArr, 256, this.getOutputMinFrameDuration, 0, 512);
        java.lang.System.arraycopy(iArr, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS, this.getOutputFormats, 0, 512);
        for (int i9 = 0; i9 < 512; i9++) {
            this.getOutputMinFrameDuration[i9] = getHighResolutionOutputSizeshNQ4ISI();
        }
        for (int i10 = 0; i10 < 512; i10++) {
            this.getOutputFormats[i10] = getHighResolutionOutputSizeshNQ4ISI();
        }
        this.getHighSpeedVideoFpsRangesFor = 0;
    }

    private static int getHighSpeedVideoSizes(int i, int i2, int i3) {
        return (((i << 10) | (i >>> (-10))) ^ ((i3 << 23) | (i3 >>> (-23)))) + ((i2 << 8) | (i2 >>> (-8)));
    }

    private int getHighResolutionOutputSizeshNQ4ISI() {
        int i;
        int i2;
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        int i4 = i3 & 511;
        if (i3 < 512) {
            int[] iArr = this.getOutputMinFrameDuration;
            iArr[i4] = iArr[i4] + Camera2StreamConfigurationMap(iArr[(i4 - 3) & 511], iArr[(i4 - 10) & 511], iArr[(i4 - 511) & 511]);
            int[] iArr2 = this.getOutputMinFrameDuration;
            int i5 = iArr2[(i4 - 12) & 511];
            int[] iArr3 = this.getOutputFormats;
            i = iArr3[i5 & 255] + iArr3[((i5 >> 16) & 255) + 256];
            i2 = iArr2[i4];
        } else {
            int[] iArr4 = this.getOutputFormats;
            iArr4[i4] = iArr4[i4] + getHighSpeedVideoSizes(iArr4[(i4 - 3) & 511], iArr4[(i4 - 10) & 511], iArr4[(i4 - 511) & 511]);
            int[] iArr5 = this.getOutputFormats;
            int i6 = iArr5[(i4 - 12) & 511];
            int[] iArr6 = this.getOutputMinFrameDuration;
            i = iArr6[i6 & 255] + iArr6[((i6 >> 16) & 255) + 256];
            i2 = iArr5[i4];
        }
        this.getHighSpeedVideoFpsRangesFor = (this.getHighSpeedVideoFpsRangesFor + 1) & 1023;
        return i2 ^ i;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        return (byte) (b ^ Camera2StreamConfigurationMap());
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        getHighSpeedVideoFpsRanges();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws org.bouncycastle.crypto.DataLengthException {
        if (!this.Camera2StreamConfigurationMap) {
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
            bArr2[i3 + i4] = (byte) (bArr[i + i4] ^ Camera2StreamConfigurationMap());
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        org.bouncycastle.crypto.CipherParameters cipherParameters2;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            this.getHighResolutionOutputSizeshNQ4ISI = parametersWithIV.getIV();
            cipherParameters2 = parametersWithIV.getParameters();
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = new byte[0];
            cipherParameters2 = cipherParameters;
        }
        if (!(cipherParameters2 instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid parameter passed to HC128 init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getInputSizeshNQ4ISI = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters2).getKey();
        getHighSpeedVideoFpsRanges();
        this.Camera2StreamConfigurationMap = true;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public java.lang.String getAlgorithmName() {
        return "HC-128";
    }

    private byte Camera2StreamConfigurationMap() {
        if (this.getHighSpeedVideoSizes == 0) {
            int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            byte[] bArr = this.getHighSpeedVideoFpsRanges;
            bArr[0] = (byte) (highResolutionOutputSizeshNQ4ISI & 255);
            bArr[1] = (byte) ((highResolutionOutputSizeshNQ4ISI >> 8) & 255);
            bArr[2] = (byte) ((highResolutionOutputSizeshNQ4ISI >> 16) & 255);
            bArr[3] = (byte) ((highResolutionOutputSizeshNQ4ISI >> 24) & 255);
        }
        byte[] bArr2 = this.getHighSpeedVideoFpsRanges;
        int i = this.getHighSpeedVideoSizes;
        byte b = bArr2[i];
        this.getHighSpeedVideoSizes = (i + 1) & 3;
        return b;
    }
}
