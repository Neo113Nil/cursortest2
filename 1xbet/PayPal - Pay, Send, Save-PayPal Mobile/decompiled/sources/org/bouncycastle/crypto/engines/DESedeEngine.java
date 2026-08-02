package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class DESedeEngine extends org.bouncycastle.crypto.engines.DESEngine {
    protected static final int BLOCK_SIZE = 8;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private int[] Camera2StreamConfigurationMap = null;
    private int[] getHighSpeedVideoFpsRanges = null;
    private int[] getHighSpeedVideoFpsRangesFor = null;

    @Override // org.bouncycastle.crypto.engines.DESEngine, org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.engines.DESEngine, org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.engines.DESEngine, org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.Camera2StreamConfigurationMap;
        if (iArr == null) {
            throw new java.lang.IllegalStateException("DESede engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        byte[] bArr3 = new byte[8];
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            desFunc(iArr, bArr, i, bArr3, 0);
            desFunc(this.getHighSpeedVideoFpsRanges, bArr3, 0, bArr3, 0);
            desFunc(this.getHighSpeedVideoFpsRangesFor, bArr3, 0, bArr2, i2);
        } else {
            desFunc(this.getHighSpeedVideoFpsRangesFor, bArr, i, bArr3, 0);
            desFunc(this.getHighSpeedVideoFpsRanges, bArr3, 0, bArr3, 0);
            desFunc(this.Camera2StreamConfigurationMap, bArr3, 0, bArr2, i2);
        }
        return 8;
    }

    @Override // org.bouncycastle.crypto.engines.DESEngine, org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to DESede init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        if (key.length != 24 && key.length != 16) {
            throw new java.lang.IllegalArgumentException("key size must be 16 or 24 bytes.");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        byte[] bArr = new byte[8];
        java.lang.System.arraycopy(key, 0, bArr, 0, 8);
        this.Camera2StreamConfigurationMap = generateWorkingKey(z, bArr);
        byte[] bArr2 = new byte[8];
        java.lang.System.arraycopy(key, 8, bArr2, 0, 8);
        this.getHighSpeedVideoFpsRanges = generateWorkingKey(!z, bArr2);
        if (key.length != 24) {
            this.getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap;
            return;
        }
        byte[] bArr3 = new byte[8];
        java.lang.System.arraycopy(key, 16, bArr3, 0, 8);
        this.getHighSpeedVideoFpsRangesFor = generateWorkingKey(z, bArr3);
    }

    @Override // org.bouncycastle.crypto.engines.DESEngine, org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "DESede";
    }
}
