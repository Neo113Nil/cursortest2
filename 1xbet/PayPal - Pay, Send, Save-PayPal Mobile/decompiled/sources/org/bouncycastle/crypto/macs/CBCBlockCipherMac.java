package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
public class CBCBlockCipherMac implements org.bouncycastle.crypto.Mac {
    private byte[] Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.BlockCipher getHighSpeedVideoSizes;
    private org.bouncycastle.crypto.paddings.BlockCipherPadding getOutputFormats;

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = this.getHighSpeedVideoSizes.getBlockSize();
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i4 = blockSize - i3;
        if (i2 > i4) {
            java.lang.System.arraycopy(bArr, i, this.Camera2StreamConfigurationMap, i3, i4);
            this.getHighSpeedVideoSizes.processBlock(this.Camera2StreamConfigurationMap, 0, this.getHighSpeedVideoFpsRangesFor, 0);
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            i2 -= i4;
            i += i4;
            while (i2 > blockSize) {
                this.getHighSpeedVideoSizes.processBlock(bArr, i, this.getHighSpeedVideoFpsRangesFor, 0);
                i2 -= blockSize;
                i += blockSize;
            }
        }
        java.lang.System.arraycopy(bArr, i, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, i2);
        this.getHighResolutionOutputSizeshNQ4ISI += i2;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        byte[] bArr = this.Camera2StreamConfigurationMap;
        if (i == bArr.length) {
            this.getHighSpeedVideoSizes.processBlock(bArr, 0, this.getHighSpeedVideoFpsRangesFor, 0);
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
        }
        byte[] bArr2 = this.Camera2StreamConfigurationMap;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = i2 + 1;
        bArr2[i2] = b;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.Camera2StreamConfigurationMap;
            if (i >= bArr.length) {
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
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
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.crypto.Mac
    public java.lang.String getAlgorithmName() {
        return this.getHighSpeedVideoSizes.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        int blockSize = this.getHighSpeedVideoSizes.getBlockSize();
        if (this.getOutputFormats == null) {
            while (true) {
                int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i2 >= blockSize) {
                    break;
                }
                this.Camera2StreamConfigurationMap[i2] = 0;
                this.getHighResolutionOutputSizeshNQ4ISI = i2 + 1;
            }
        } else {
            if (this.getHighResolutionOutputSizeshNQ4ISI == blockSize) {
                this.getHighSpeedVideoSizes.processBlock(this.Camera2StreamConfigurationMap, 0, this.getHighSpeedVideoFpsRangesFor, 0);
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
            }
            this.getOutputFormats.addPadding(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
        }
        this.getHighSpeedVideoSizes.processBlock(this.Camera2StreamConfigurationMap, 0, this.getHighSpeedVideoFpsRangesFor, 0);
        java.lang.System.arraycopy(this.getHighSpeedVideoFpsRangesFor, 0, bArr, i, this.getHighSpeedVideoFpsRanges);
        reset();
        return this.getHighSpeedVideoFpsRanges;
    }

    public CBCBlockCipherMac(org.bouncycastle.crypto.BlockCipher blockCipher, org.bouncycastle.crypto.paddings.BlockCipherPadding blockCipherPadding) {
        this(blockCipher, (blockCipher.getBlockSize() * 8) / 2, blockCipherPadding);
    }

    public CBCBlockCipherMac(org.bouncycastle.crypto.BlockCipher blockCipher, int i, org.bouncycastle.crypto.paddings.BlockCipherPadding blockCipherPadding) {
        if (i % 8 != 0) {
            throw new java.lang.IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.modes.CBCBlockCipher(blockCipher);
        this.getOutputFormats = blockCipherPadding;
        this.getHighSpeedVideoFpsRanges = i / 8;
        this.getHighSpeedVideoFpsRangesFor = new byte[blockCipher.getBlockSize()];
        this.Camera2StreamConfigurationMap = new byte[blockCipher.getBlockSize()];
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }

    public CBCBlockCipherMac(org.bouncycastle.crypto.BlockCipher blockCipher, int i) {
        this(blockCipher, i, null);
    }

    public CBCBlockCipherMac(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this(blockCipher, (blockCipher.getBlockSize() * 8) / 2, null);
    }
}
