package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class KCTRBlockCipher extends org.bouncycastle.crypto.StreamBlockCipher {
    private org.bouncycastle.crypto.BlockCipher Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private byte[] getInputFormats;

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b) {
        byte[] bArr;
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i2 = i + 1;
            this.getHighSpeedVideoFpsRanges = i2;
            byte b2 = (byte) (b ^ bArr2[i]);
            if (i2 == this.getInputFormats.length) {
                this.getHighSpeedVideoFpsRanges = 0;
            }
            return b2;
        }
        int i3 = 0;
        while (true) {
            bArr = this.getInputFormats;
            if (i3 >= bArr.length) {
                break;
            }
            byte b3 = (byte) (bArr[i3] + 1);
            bArr[i3] = b3;
            if (b3 != 0) {
                break;
            }
            i3++;
        }
        this.Camera2StreamConfigurationMap.processBlock(bArr, 0, this.getHighResolutionOutputSizeshNQ4ISI, 0);
        byte[] bArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i4 = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = i4 + 1;
        return (byte) (b ^ bArr3[i4]);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        if (this.getHighSpeedVideoSizes) {
            this.Camera2StreamConfigurationMap.processBlock(this.getHighSpeedVideoFpsRangesFor, 0, this.getInputFormats, 0);
        }
        this.Camera2StreamConfigurationMap.reset();
        this.getHighSpeedVideoFpsRanges = 0;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (bArr.length - i < getBlockSize()) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (bArr2.length - i2 < getBlockSize()) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        processBytes(bArr, i, getBlockSize(), bArr2, i2);
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        this.getHighSpeedVideoSizes = true;
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
            throw new java.lang.IllegalArgumentException("invalid parameter passed");
        }
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        int length = bArr.length;
        int length2 = iv.length;
        org.bouncycastle.util.Arrays.fill(bArr, (byte) 0);
        java.lang.System.arraycopy(iv, 0, this.getHighSpeedVideoFpsRangesFor, length - length2, iv.length);
        org.bouncycastle.crypto.CipherParameters parameters = parametersWithIV.getParameters();
        if (parameters != null) {
            this.Camera2StreamConfigurationMap.init(true, parameters);
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.Camera2StreamConfigurationMap.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.Camera2StreamConfigurationMap.getAlgorithmName());
        sb.append("/KCTR");
        return sb.toString();
    }

    public KCTRBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        super(blockCipher);
        this.Camera2StreamConfigurationMap = blockCipher;
        this.getHighSpeedVideoFpsRangesFor = new byte[blockCipher.getBlockSize()];
        this.getInputFormats = new byte[blockCipher.getBlockSize()];
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[blockCipher.getBlockSize()];
    }
}
