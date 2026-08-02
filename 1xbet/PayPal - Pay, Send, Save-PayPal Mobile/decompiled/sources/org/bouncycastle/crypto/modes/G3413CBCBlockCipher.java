package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class G3413CBCBlockCipher implements org.bouncycastle.crypto.BlockCipher {
    private org.bouncycastle.crypto.BlockCipher Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private boolean getInputFormats = false;
    private int getOutputFormats;

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        org.bouncycastle.crypto.BlockCipher blockCipher;
        this.getHighSpeedVideoSizes = z;
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
            int i = this.getHighSpeedVideoFpsRanges;
            this.getOutputFormats = i;
            byte[] bArr = new byte[i];
            this.getHighResolutionOutputSizeshNQ4ISI = bArr;
            byte[] bArr2 = new byte[i];
            this.getHighSpeedVideoFpsRangesFor = bArr2;
            java.lang.System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            if (cipherParameters != null) {
                blockCipher = this.Camera2StreamConfigurationMap;
                blockCipher.init(z, cipherParameters);
            }
            this.getInputFormats = true;
        }
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv.length < this.getHighSpeedVideoFpsRanges) {
            throw new java.lang.IllegalArgumentException("Parameter m must blockSize <= m");
        }
        int length = iv.length;
        this.getOutputFormats = length;
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[length];
        this.getHighSpeedVideoFpsRangesFor = new byte[length];
        byte[] clone = org.bouncycastle.util.Arrays.clone(iv);
        this.getHighSpeedVideoFpsRangesFor = clone;
        java.lang.System.arraycopy(clone, 0, this.getHighResolutionOutputSizeshNQ4ISI, 0, clone.length);
        if (parametersWithIV.getParameters() != null) {
            blockCipher = this.Camera2StreamConfigurationMap;
            cipherParameters = parametersWithIV.getParameters();
            blockCipher.init(z, cipherParameters);
        }
        this.getInputFormats = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (this.getHighSpeedVideoSizes) {
            byte[] highSpeedVideoFpsRanges = org.bouncycastle.crypto.modes.GOST3413CipherUtil.getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.modes.GOST3413CipherUtil.getHighSpeedVideoFpsRangesFor(bArr, this.getHighSpeedVideoFpsRanges, i), org.bouncycastle.crypto.modes.GOST3413CipherUtil.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges));
            int length = highSpeedVideoFpsRanges.length;
            byte[] bArr3 = new byte[length];
            this.Camera2StreamConfigurationMap.processBlock(highSpeedVideoFpsRanges, 0, bArr3, 0);
            java.lang.System.arraycopy(bArr3, 0, bArr2, i2, length);
            if (bArr2.length > i2 + highSpeedVideoFpsRanges.length) {
                getHighSpeedVideoFpsRanges(bArr3);
            }
            return length;
        }
        byte[] highSpeedVideoFpsRanges2 = org.bouncycastle.crypto.modes.GOST3413CipherUtil.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
        byte[] highSpeedVideoFpsRangesFor = org.bouncycastle.crypto.modes.GOST3413CipherUtil.getHighSpeedVideoFpsRangesFor(bArr, this.getHighSpeedVideoFpsRanges, i);
        byte[] bArr4 = new byte[highSpeedVideoFpsRangesFor.length];
        this.Camera2StreamConfigurationMap.processBlock(highSpeedVideoFpsRangesFor, 0, bArr4, 0);
        byte[] highSpeedVideoFpsRanges3 = org.bouncycastle.crypto.modes.GOST3413CipherUtil.getHighSpeedVideoFpsRanges(bArr4, highSpeedVideoFpsRanges2);
        java.lang.System.arraycopy(highSpeedVideoFpsRanges3, 0, bArr2, i2, highSpeedVideoFpsRanges3.length);
        if (bArr2.length > i2 + highSpeedVideoFpsRanges3.length) {
            getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor);
        }
        return highSpeedVideoFpsRanges3.length;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        if (this.getInputFormats) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            java.lang.System.arraycopy(bArr, 0, this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr.length);
            this.Camera2StreamConfigurationMap.reset();
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.Camera2StreamConfigurationMap.getAlgorithmName());
        sb.append("/CBC");
        return sb.toString();
    }

    private void getHighSpeedVideoFpsRanges(byte[] bArr) {
        byte[] highSpeedVideoFpsRangesFor = org.bouncycastle.crypto.modes.GOST3413CipherUtil.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats - this.getHighSpeedVideoFpsRanges);
        java.lang.System.arraycopy(highSpeedVideoFpsRangesFor, 0, this.getHighResolutionOutputSizeshNQ4ISI, 0, highSpeedVideoFpsRangesFor.length);
        java.lang.System.arraycopy(bArr, 0, this.getHighResolutionOutputSizeshNQ4ISI, highSpeedVideoFpsRangesFor.length, this.getOutputFormats - highSpeedVideoFpsRangesFor.length);
    }

    public G3413CBCBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this.getHighSpeedVideoFpsRanges = blockCipher.getBlockSize();
        this.Camera2StreamConfigurationMap = blockCipher;
    }
}
