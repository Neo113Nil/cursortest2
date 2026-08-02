package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class HC256Engine implements org.bouncycastle.crypto.StreamCipher {
    private byte[] getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private byte[] getOutputFormats;
    private int[] getHighSpeedVideoSizesFor = new int[1024];
    private int[] getOutputMinFrameDuration = new int[1024];
    private int Camera2StreamConfigurationMap = 0;
    private byte[] getHighSpeedVideoSizes = new byte[4];
    private int getHighResolutionOutputSizeshNQ4ISI = 0;

    private void getHighResolutionOutputSizeshNQ4ISI() {
        byte[] bArr = this.getOutputFormats;
        if (bArr.length != 32 && bArr.length != 16) {
            throw new java.lang.IllegalArgumentException("The key must be 128/256 bits long");
        }
        if (this.getHighSpeedVideoFpsRanges.length < 16) {
            throw new java.lang.IllegalArgumentException("The IV must be at least 128 bits long");
        }
        if (bArr.length != 32) {
            byte[] bArr2 = new byte[32];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArr3 = this.getOutputFormats;
            java.lang.System.arraycopy(bArr3, 0, bArr2, 16, bArr3.length);
            this.getOutputFormats = bArr2;
        }
        byte[] bArr4 = this.getHighSpeedVideoFpsRanges;
        if (bArr4.length < 32) {
            byte[] bArr5 = new byte[32];
            java.lang.System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
            byte[] bArr6 = this.getHighSpeedVideoFpsRanges;
            java.lang.System.arraycopy(bArr6, 0, bArr5, bArr6.length, 32 - bArr6.length);
            this.getHighSpeedVideoFpsRanges = bArr5;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.Camera2StreamConfigurationMap = 0;
        int[] iArr = new int[2560];
        for (int i = 0; i < 32; i++) {
            int i2 = i >> 2;
            iArr[i2] = iArr[i2] | ((this.getOutputFormats[i] & 255) << ((i & 3) * 8));
        }
        for (int i3 = 0; i3 < 32; i3++) {
            int i4 = (i3 >> 2) + 8;
            iArr[i4] = iArr[i4] | ((this.getHighSpeedVideoFpsRanges[i3] & 255) << ((i3 & 3) * 8));
        }
        for (int i5 = 16; i5 < 2560; i5++) {
            int i6 = iArr[i5 - 2];
            int i7 = iArr[i5 - 15];
            iArr[i5] = ((((i6 >>> 19) | (i6 << (-19))) ^ ((i6 << (-17)) | (i6 >>> 17))) ^ (i6 >>> 10)) + iArr[i5 - 7] + ((((i7 >>> 18) | (i7 << (-18))) ^ ((i7 << (-7)) | (i7 >>> 7))) ^ (i7 >>> 3)) + iArr[i5 - 16] + i5;
        }
        java.lang.System.arraycopy(iArr, 512, this.getHighSpeedVideoSizesFor, 0, 1024);
        java.lang.System.arraycopy(iArr, 1536, this.getOutputMinFrameDuration, 0, 1024);
        for (int i8 = 0; i8 < 4096; i8++) {
            getHighSpeedVideoFpsRangesFor();
        }
        this.Camera2StreamConfigurationMap = 0;
    }

    private int getHighSpeedVideoFpsRangesFor() {
        int i;
        int i2;
        int i3;
        int i4 = this.Camera2StreamConfigurationMap;
        int i5 = i4 & 1023;
        if (i4 < 1024) {
            int[] iArr = this.getHighSpeedVideoSizesFor;
            int i6 = iArr[(i5 - 3) & 1023];
            int i7 = iArr[(i5 - 1023) & 1023];
            int[] iArr2 = this.getOutputMinFrameDuration;
            i = iArr[i5] + iArr[(i5 - 10) & 1023] + (((i6 << (-10)) | (i6 >>> 10)) ^ ((i7 << (-23)) | (i7 >>> 23))) + iArr2[(i6 ^ i7) & 1023];
            iArr[i5] = i;
            int i8 = iArr[(i5 - 12) & 1023];
            i2 = iArr2[i8 & 255] + iArr2[((i8 >> 8) & 255) + 256] + iArr2[((i8 >> 16) & 255) + 512];
            i3 = iArr2[((i8 >> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS];
        } else {
            int[] iArr3 = this.getOutputMinFrameDuration;
            int i9 = iArr3[(i5 - 3) & 1023];
            int i10 = iArr3[(i5 - 1023) & 1023];
            int[] iArr4 = this.getHighSpeedVideoSizesFor;
            i = iArr3[i5] + iArr3[(i5 - 10) & 1023] + (((i9 << (-10)) | (i9 >>> 10)) ^ ((i10 << (-23)) | (i10 >>> 23))) + iArr4[(i9 ^ i10) & 1023];
            iArr3[i5] = i;
            int i11 = iArr3[(i5 - 12) & 1023];
            i2 = iArr4[i11 & 255] + iArr4[((i11 >> 8) & 255) + 256] + iArr4[((i11 >> 16) & 255) + 512];
            i3 = iArr4[((i11 >> 24) & 255) + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS];
        }
        this.Camera2StreamConfigurationMap = (i4 + 1) & 2047;
        return i ^ (i2 + i3);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        return (byte) (b ^ getHighSpeedVideoFpsRanges());
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws org.bouncycastle.crypto.DataLengthException {
        if (!this.getHighSpeedVideoFpsRangesFor) {
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
            bArr2[i3 + i4] = (byte) (bArr[i + i4] ^ getHighSpeedVideoFpsRanges());
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        org.bouncycastle.crypto.CipherParameters cipherParameters2;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            this.getHighSpeedVideoFpsRanges = parametersWithIV.getIV();
            cipherParameters2 = parametersWithIV.getParameters();
        } else {
            this.getHighSpeedVideoFpsRanges = new byte[0];
            cipherParameters2 = cipherParameters;
        }
        if (!(cipherParameters2 instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid parameter passed to HC256 init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getOutputFormats = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters2).getKey();
        getHighResolutionOutputSizeshNQ4ISI();
        this.getHighSpeedVideoFpsRangesFor = true;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public java.lang.String getAlgorithmName() {
        return "HC-256";
    }

    private byte getHighSpeedVideoFpsRanges() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            byte[] bArr = this.getHighSpeedVideoSizes;
            bArr[0] = (byte) (highSpeedVideoFpsRangesFor & 255);
            bArr[1] = (byte) ((highSpeedVideoFpsRangesFor >> 8) & 255);
            bArr[2] = (byte) ((highSpeedVideoFpsRangesFor >> 16) & 255);
            bArr[3] = (byte) ((highSpeedVideoFpsRangesFor >> 24) & 255);
        }
        byte[] bArr2 = this.getHighSpeedVideoSizes;
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        byte b = bArr2[i];
        this.getHighResolutionOutputSizeshNQ4ISI = (i + 1) & 3;
        return b;
    }
}
