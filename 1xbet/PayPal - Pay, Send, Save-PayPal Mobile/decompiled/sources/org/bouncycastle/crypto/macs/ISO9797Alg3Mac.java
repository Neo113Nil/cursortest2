package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
public class ISO9797Alg3Mac implements org.bouncycastle.crypto.Mac {
    private int Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.params.KeyParameter getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.BlockCipher getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.params.KeyParameter getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private byte[] getOutputFormats;
    private org.bouncycastle.crypto.paddings.BlockCipherPadding getOutputMinFrameDuration;

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = this.getHighSpeedVideoFpsRangesFor.getBlockSize();
        int i3 = this.Camera2StreamConfigurationMap;
        int i4 = blockSize - i3;
        if (i2 > i4) {
            java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoFpsRanges, i3, i4);
            this.getHighSpeedVideoFpsRangesFor.processBlock(this.getHighSpeedVideoFpsRanges, 0, this.getOutputFormats, 0);
            this.Camera2StreamConfigurationMap = 0;
            i2 -= i4;
            i += i4;
            while (i2 > blockSize) {
                this.getHighSpeedVideoFpsRangesFor.processBlock(bArr, i, this.getOutputFormats, 0);
                i2 -= blockSize;
                i += blockSize;
            }
        }
        java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, i2);
        this.Camera2StreamConfigurationMap += i2;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) {
        int i = this.Camera2StreamConfigurationMap;
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        if (i == bArr.length) {
            this.getHighSpeedVideoFpsRangesFor.processBlock(bArr, 0, this.getOutputFormats, 0);
            this.Camera2StreamConfigurationMap = 0;
        }
        byte[] bArr2 = this.getHighSpeedVideoFpsRanges;
        int i2 = this.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = i2 + 1;
        bArr2[i2] = b;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.getHighSpeedVideoFpsRanges;
            if (i >= bArr.length) {
                this.Camera2StreamConfigurationMap = 0;
                this.getHighSpeedVideoFpsRangesFor.reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.KeyParameter keyParameter;
        reset();
        boolean z = cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter;
        if (!z && !(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
            throw new java.lang.IllegalArgumentException("params must be an instance of KeyParameter or ParametersWithIV");
        }
        byte[] key = (z ? (org.bouncycastle.crypto.params.KeyParameter) cipherParameters : (org.bouncycastle.crypto.params.KeyParameter) ((org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters).getParameters()).getKey();
        if (key.length == 16) {
            keyParameter = new org.bouncycastle.crypto.params.KeyParameter(key, 0, 8);
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.KeyParameter(key, 8, 8);
            this.getHighSpeedVideoSizes = keyParameter;
        } else {
            if (key.length != 24) {
                throw new java.lang.IllegalArgumentException("Key must be either 112 or 168 bit long");
            }
            keyParameter = new org.bouncycastle.crypto.params.KeyParameter(key, 0, 8);
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.KeyParameter(key, 8, 8);
            this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.params.KeyParameter(key, 16, 8);
        }
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
            this.getHighSpeedVideoFpsRangesFor.init(true, new org.bouncycastle.crypto.params.ParametersWithIV(keyParameter, ((org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters).getIV()));
        } else {
            this.getHighSpeedVideoFpsRangesFor.init(true, keyParameter);
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // org.bouncycastle.crypto.Mac
    public java.lang.String getAlgorithmName() {
        return "ISO9797Alg3";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        int blockSize = this.getHighSpeedVideoFpsRangesFor.getBlockSize();
        if (this.getOutputMinFrameDuration == null) {
            while (true) {
                int i2 = this.Camera2StreamConfigurationMap;
                if (i2 >= blockSize) {
                    break;
                }
                this.getHighSpeedVideoFpsRanges[i2] = 0;
                this.Camera2StreamConfigurationMap = i2 + 1;
            }
        } else {
            if (this.Camera2StreamConfigurationMap == blockSize) {
                this.getHighSpeedVideoFpsRangesFor.processBlock(this.getHighSpeedVideoFpsRanges, 0, this.getOutputFormats, 0);
                this.Camera2StreamConfigurationMap = 0;
            }
            this.getOutputMinFrameDuration.addPadding(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
        }
        this.getHighSpeedVideoFpsRangesFor.processBlock(this.getHighSpeedVideoFpsRanges, 0, this.getOutputFormats, 0);
        org.bouncycastle.crypto.engines.DESEngine dESEngine = new org.bouncycastle.crypto.engines.DESEngine();
        dESEngine.init(false, this.getHighResolutionOutputSizeshNQ4ISI);
        byte[] bArr2 = this.getOutputFormats;
        dESEngine.processBlock(bArr2, 0, bArr2, 0);
        dESEngine.init(true, this.getHighSpeedVideoSizes);
        byte[] bArr3 = this.getOutputFormats;
        dESEngine.processBlock(bArr3, 0, bArr3, 0);
        java.lang.System.arraycopy(this.getOutputFormats, 0, bArr, i, this.getHighSpeedVideoSizesFor);
        reset();
        return this.getHighSpeedVideoSizesFor;
    }

    public ISO9797Alg3Mac(org.bouncycastle.crypto.BlockCipher blockCipher, org.bouncycastle.crypto.paddings.BlockCipherPadding blockCipherPadding) {
        this(blockCipher, blockCipher.getBlockSize() * 8, blockCipherPadding);
    }

    public ISO9797Alg3Mac(org.bouncycastle.crypto.BlockCipher blockCipher, int i, org.bouncycastle.crypto.paddings.BlockCipherPadding blockCipherPadding) {
        if (i % 8 != 0) {
            throw new java.lang.IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (!(blockCipher instanceof org.bouncycastle.crypto.engines.DESEngine)) {
            throw new java.lang.IllegalArgumentException("cipher must be instance of DESEngine");
        }
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.modes.CBCBlockCipher(blockCipher);
        this.getOutputMinFrameDuration = blockCipherPadding;
        this.getHighSpeedVideoSizesFor = i / 8;
        this.getOutputFormats = new byte[blockCipher.getBlockSize()];
        this.getHighSpeedVideoFpsRanges = new byte[blockCipher.getBlockSize()];
        this.Camera2StreamConfigurationMap = 0;
    }

    public ISO9797Alg3Mac(org.bouncycastle.crypto.BlockCipher blockCipher, int i) {
        this(blockCipher, i, null);
    }

    public ISO9797Alg3Mac(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this(blockCipher, blockCipher.getBlockSize() * 8, null);
    }
}
