package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
public class CFBBlockCipherMac implements org.bouncycastle.crypto.Mac {
    private byte[] Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.macs.MacCFBBlockCipher getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private org.bouncycastle.crypto.paddings.BlockCipherPadding getOutputMinFrameDuration;

    public CFBBlockCipherMac(org.bouncycastle.crypto.BlockCipher blockCipher, int i, int i2, org.bouncycastle.crypto.paddings.BlockCipherPadding blockCipherPadding) {
        this.getOutputMinFrameDuration = null;
        if (i2 % 8 != 0) {
            throw new java.lang.IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.Camera2StreamConfigurationMap = new byte[blockCipher.getBlockSize()];
        org.bouncycastle.crypto.macs.MacCFBBlockCipher macCFBBlockCipher = new org.bouncycastle.crypto.macs.MacCFBBlockCipher(blockCipher, i);
        this.getHighResolutionOutputSizeshNQ4ISI = macCFBBlockCipher;
        this.getOutputMinFrameDuration = blockCipherPadding;
        this.getHighSpeedVideoFpsRangesFor = i2 / 8;
        this.getHighSpeedVideoFpsRanges = new byte[macCFBBlockCipher.getHighSpeedVideoFpsRangesFor];
        this.getHighSpeedVideoSizes = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
        org.bouncycastle.crypto.paddings.BlockCipherPadding blockCipherPadding = this.getOutputMinFrameDuration;
        if (blockCipherPadding == null) {
            while (true) {
                int i3 = this.getHighSpeedVideoSizes;
                if (i3 >= i2) {
                    break;
                }
                this.getHighSpeedVideoFpsRanges[i3] = 0;
                this.getHighSpeedVideoSizes = i3 + 1;
            }
        } else {
            blockCipherPadding.addPadding(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, 0, this.Camera2StreamConfigurationMap);
        org.bouncycastle.crypto.macs.MacCFBBlockCipher macCFBBlockCipher = this.getHighResolutionOutputSizeshNQ4ISI;
        macCFBBlockCipher.getHighResolutionOutputSizeshNQ4ISI.processBlock(macCFBBlockCipher.getHighSpeedVideoSizes, 0, this.Camera2StreamConfigurationMap, 0);
        java.lang.System.arraycopy(this.Camera2StreamConfigurationMap, 0, bArr, i, this.getHighSpeedVideoFpsRangesFor);
        reset();
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.crypto.Mac
    public java.lang.String getAlgorithmName() {
        org.bouncycastle.crypto.macs.MacCFBBlockCipher macCFBBlockCipher = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(macCFBBlockCipher.getHighResolutionOutputSizeshNQ4ISI.getAlgorithmName());
        sb.append("/CFB");
        sb.append(macCFBBlockCipher.getHighSpeedVideoFpsRangesFor * 8);
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.BlockCipher blockCipher;
        reset();
        org.bouncycastle.crypto.macs.MacCFBBlockCipher macCFBBlockCipher = this.getHighResolutionOutputSizeshNQ4ISI;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            int length = iv.length;
            byte[] bArr = macCFBBlockCipher.getHighSpeedVideoFpsRanges;
            if (length < bArr.length) {
                java.lang.System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
            } else {
                java.lang.System.arraycopy(iv, 0, bArr, 0, bArr.length);
            }
            byte[] bArr2 = macCFBBlockCipher.getHighSpeedVideoFpsRanges;
            java.lang.System.arraycopy(bArr2, 0, macCFBBlockCipher.getHighSpeedVideoSizes, 0, bArr2.length);
            macCFBBlockCipher.getHighResolutionOutputSizeshNQ4ISI.reset();
            blockCipher = macCFBBlockCipher.getHighResolutionOutputSizeshNQ4ISI;
            cipherParameters = parametersWithIV.getParameters();
        } else {
            byte[] bArr3 = macCFBBlockCipher.getHighSpeedVideoFpsRanges;
            java.lang.System.arraycopy(bArr3, 0, macCFBBlockCipher.getHighSpeedVideoSizes, 0, bArr3.length);
            macCFBBlockCipher.getHighResolutionOutputSizeshNQ4ISI.reset();
            blockCipher = macCFBBlockCipher.getHighResolutionOutputSizeshNQ4ISI;
        }
        blockCipher.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.getHighSpeedVideoFpsRanges;
            if (i >= bArr.length) {
                this.getHighSpeedVideoSizes = 0;
                org.bouncycastle.crypto.macs.MacCFBBlockCipher macCFBBlockCipher = this.getHighResolutionOutputSizeshNQ4ISI;
                byte[] bArr2 = macCFBBlockCipher.getHighSpeedVideoFpsRanges;
                java.lang.System.arraycopy(bArr2, 0, macCFBBlockCipher.getHighSpeedVideoSizes, 0, bArr2.length);
                macCFBBlockCipher.getHighResolutionOutputSizeshNQ4ISI.reset();
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Can't have a negative input length!");
        }
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
        int i4 = this.getHighSpeedVideoSizes;
        int i5 = i3 - i4;
        if (i2 > i5) {
            java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoFpsRanges, i4, i5);
            this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, 0, this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoSizes = 0;
            i2 -= i5;
            i += i5;
            while (i2 > i3) {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(bArr, i, this.Camera2StreamConfigurationMap);
                i2 -= i3;
                i += i3;
            }
        }
        java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, i2);
        this.getHighSpeedVideoSizes += i2;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) {
        int i = this.getHighSpeedVideoSizes;
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        if (i == bArr.length) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(bArr, 0, this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoSizes = 0;
        }
        byte[] bArr2 = this.getHighSpeedVideoFpsRanges;
        int i2 = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = i2 + 1;
        bArr2[i2] = b;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public CFBBlockCipherMac(org.bouncycastle.crypto.BlockCipher blockCipher, org.bouncycastle.crypto.paddings.BlockCipherPadding blockCipherPadding) {
        this(blockCipher, 8, (blockCipher.getBlockSize() * 8) / 2, blockCipherPadding);
    }

    public CFBBlockCipherMac(org.bouncycastle.crypto.BlockCipher blockCipher, int i, int i2) {
        this(blockCipher, i, i2, null);
    }

    public CFBBlockCipherMac(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this(blockCipher, 8, (blockCipher.getBlockSize() * 8) / 2, null);
    }
}
