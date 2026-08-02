package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
public class BlockCipherMac implements org.bouncycastle.crypto.Mac {
    private int Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.BlockCipher getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = this.getHighSpeedVideoSizes.getBlockSize();
        int i3 = this.Camera2StreamConfigurationMap;
        int i4 = blockSize - i3;
        if (i2 > i4) {
            java.lang.System.arraycopy(bArr, i, this.getHighResolutionOutputSizeshNQ4ISI, i3, i4);
            this.getHighSpeedVideoSizes.processBlock(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoFpsRanges, 0);
            this.Camera2StreamConfigurationMap = 0;
            i2 -= i4;
            i += i4;
            while (i2 > blockSize) {
                this.getHighSpeedVideoSizes.processBlock(bArr, i, this.getHighSpeedVideoFpsRanges, 0);
                i2 -= blockSize;
                i += blockSize;
            }
        }
        java.lang.System.arraycopy(bArr, i, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, i2);
        this.Camera2StreamConfigurationMap += i2;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) {
        int i = this.Camera2StreamConfigurationMap;
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == bArr.length) {
            this.getHighSpeedVideoSizes.processBlock(bArr, 0, this.getHighSpeedVideoFpsRanges, 0);
            this.Camera2StreamConfigurationMap = 0;
        }
        byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = this.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = i2 + 1;
        bArr2[i2] = b;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i >= bArr.length) {
                this.Camera2StreamConfigurationMap = 0;
                this.getHighSpeedVideoSizes.reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        reset();
        this.getHighSpeedVideoSizes.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.crypto.Mac
    public java.lang.String getAlgorithmName() {
        return this.getHighSpeedVideoSizes.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        int blockSize = this.getHighSpeedVideoSizes.getBlockSize();
        while (true) {
            int i2 = this.Camera2StreamConfigurationMap;
            if (i2 >= blockSize) {
                this.getHighSpeedVideoSizes.processBlock(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoFpsRanges, 0);
                java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, 0, bArr, i, this.getHighSpeedVideoFpsRangesFor);
                reset();
                return this.getHighSpeedVideoFpsRangesFor;
            }
            this.getHighResolutionOutputSizeshNQ4ISI[i2] = 0;
            this.Camera2StreamConfigurationMap = i2 + 1;
        }
    }

    public BlockCipherMac(org.bouncycastle.crypto.BlockCipher blockCipher, int i) {
        if (i % 8 != 0) {
            throw new java.lang.IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.modes.CBCBlockCipher(blockCipher);
        this.getHighSpeedVideoFpsRangesFor = i / 8;
        this.getHighSpeedVideoFpsRanges = new byte[blockCipher.getBlockSize()];
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[blockCipher.getBlockSize()];
        this.Camera2StreamConfigurationMap = 0;
    }

    public BlockCipherMac(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this(blockCipher, (blockCipher.getBlockSize() * 8) / 2);
    }
}
