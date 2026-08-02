package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class RC4Engine implements org.bouncycastle.crypto.StreamCipher {
    private byte[] getHighSpeedVideoSizes = null;
    private int Camera2StreamConfigurationMap = 0;
    private int getHighSpeedVideoFpsRanges = 0;
    private byte[] getHighSpeedVideoFpsRangesFor = null;

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        int i = (this.Camera2StreamConfigurationMap + 1) & 255;
        this.Camera2StreamConfigurationMap = i;
        byte[] bArr = this.getHighSpeedVideoSizes;
        byte b2 = bArr[i];
        int i2 = (this.getHighSpeedVideoFpsRanges + b2) & 255;
        this.getHighSpeedVideoFpsRanges = i2;
        bArr[i] = bArr[i2];
        bArr[i2] = b2;
        return (byte) (b ^ bArr[(bArr[i] + b2) & 255]);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = (this.Camera2StreamConfigurationMap + 1) & 255;
            this.Camera2StreamConfigurationMap = i5;
            byte[] bArr3 = this.getHighSpeedVideoSizes;
            byte b = bArr3[i5];
            int i6 = (this.getHighSpeedVideoFpsRanges + b) & 255;
            this.getHighSpeedVideoFpsRanges = i6;
            bArr3[i5] = bArr3[i6];
            bArr3[i6] = b;
            bArr2[i4 + i3] = (byte) (bArr3[(bArr3[i5] + b) & 255] ^ bArr[i4 + i]);
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to RC4 init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        this.getHighSpeedVideoFpsRangesFor = key;
        getHighSpeedVideoFpsRanges(key);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public java.lang.String getAlgorithmName() {
        return "RC4";
    }

    private void getHighSpeedVideoFpsRanges(byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = bArr;
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoFpsRanges = 0;
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = new byte[256];
        }
        for (int i = 0; i < 256; i++) {
            this.getHighSpeedVideoSizes[i] = (byte) i;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            byte b = bArr[i2];
            byte[] bArr2 = this.getHighSpeedVideoSizes;
            byte b2 = bArr2[i4];
            i3 = ((b & 255) + b2 + i3) & 255;
            bArr2[i4] = bArr2[i3];
            bArr2[i3] = b2;
            i2 = (i2 + 1) % bArr.length;
        }
    }
}
