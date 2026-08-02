package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class GCMSIVBlockCipher implements org.bouncycastle.crypto.modes.AEADBlockCipher {
    private final org.bouncycastle.crypto.modes.GCMSIVBlockCipher.GCMSIVHasher Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.crypto.BlockCipher getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.crypto.modes.GCMSIVBlockCipher.GCMSIVHasher getHighSpeedVideoSizes;
    private final org.bouncycastle.crypto.modes.gcm.GCMMultiplier getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private org.bouncycastle.crypto.modes.GCMSIVBlockCipher.GCMSIVCache getInputSizeshNQ4ISI;
    private byte[] getOutputFormats;
    private final byte[] getOutputMinFrameDuration;
    private final byte[] getOutputMinFrameDurationlomOqCM;
    private org.bouncycastle.crypto.modes.GCMSIVBlockCipher.GCMSIVCache getOutputSizeshNQ4ISI;
    private byte[] getOutputStallDuration;

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        return 0;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(org.bouncycastle.crypto.modes.GCMSIVBlockCipher gCMSIVBlockCipher, byte[] bArr) {
        byte[] bArr2 = gCMSIVBlockCipher.getOutputMinFrameDuration;
        for (int i = 0; i < 16; i++) {
            bArr2[i] = (byte) (bArr2[i] ^ bArr[i]);
        }
        gCMSIVBlockCipher.getHighSpeedVideoSizesFor.multiplyH(gCMSIVBlockCipher.getOutputMinFrameDuration);
    }

    private byte[] getHighResolutionOutputSizeshNQ4ISI() {
        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor();
        byte[] bArr = new byte[16];
        byte[] bArr2 = new byte[16];
        org.bouncycastle.util.Pack.longToBigEndian(this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges * 8, bArr2, 0);
        org.bouncycastle.util.Pack.longToBigEndian(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges * 8, bArr2, 8);
        byte[] bArr3 = this.getOutputMinFrameDuration;
        for (int i = 0; i < 16; i++) {
            bArr3[i] = (byte) (bArr3[i] ^ bArr2[i]);
        }
        this.getHighSpeedVideoSizesFor.multiplyH(this.getOutputMinFrameDuration);
        getHighSpeedVideoFpsRanges(this.getOutputMinFrameDuration, 0, 16, bArr);
        byte[] bArr4 = new byte[16];
        for (int i2 = 0; i2 < 12; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ this.getOutputStallDuration[i2]);
        }
        bArr[15] = (byte) (bArr[15] & (-129));
        this.getHighSpeedVideoFpsRanges.processBlock(bArr, 0, bArr4, 0);
        return bArr4;
    }

    private void getHighSpeedVideoFpsRanges(int i) {
        int i2 = this.getInputFormats;
        if ((i2 & 1) == 0) {
            throw new java.lang.IllegalStateException("Cipher is not initialised");
        }
        if ((i2 & 2) != 0) {
            throw new java.lang.IllegalStateException("AEAD data cannot be processed after ordinary data");
        }
        if (this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges - Long.MIN_VALUE > (2147483623 - i) - Long.MIN_VALUE) {
            throw new java.lang.IllegalStateException("AEAD byte count exceeded");
        }
    }

    private static void getHighSpeedVideoFpsRanges(byte[] bArr, int i, int i2, boolean z) {
        int length = bArr == null ? 0 : bArr.length;
        int i3 = i + i2;
        if (i2 < 0 || i < 0 || i3 < 0 || i3 > length) {
            if (!z) {
                throw new org.bouncycastle.crypto.DataLengthException("Input buffer too short.");
            }
        }
    }

    private void getHighSpeedVideoFpsRanges() {
        org.bouncycastle.crypto.modes.GCMSIVBlockCipher.GCMSIVCache gCMSIVCache = this.getOutputSizeshNQ4ISI;
        if (gCMSIVCache != null) {
            org.bouncycastle.util.Arrays.fill(gCMSIVCache.getHighSpeedVideoFpsRangesFor(), (byte) 0);
        }
        org.bouncycastle.crypto.modes.GCMSIVBlockCipher.GCMSIVHasher gCMSIVHasher = this.Camera2StreamConfigurationMap;
        gCMSIVHasher.getHighSpeedVideoFpsRangesFor = 0;
        gCMSIVHasher.getHighSpeedVideoFpsRanges = 0L;
        org.bouncycastle.crypto.modes.GCMSIVBlockCipher.GCMSIVHasher gCMSIVHasher2 = this.getHighSpeedVideoSizes;
        gCMSIVHasher2.getHighSpeedVideoFpsRangesFor = 0;
        gCMSIVHasher2.getHighSpeedVideoFpsRanges = 0L;
        this.getOutputSizeshNQ4ISI = new org.bouncycastle.crypto.modes.GCMSIVBlockCipher.GCMSIVCache();
        this.getInputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI ? null : new org.bouncycastle.crypto.modes.GCMSIVBlockCipher.GCMSIVCache();
        this.getInputFormats &= -3;
        org.bouncycastle.util.Arrays.fill(this.getOutputMinFrameDuration, (byte) 0);
        byte[] bArr = this.getOutputFormats;
        if (bArr != null) {
            this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) throws java.lang.IllegalStateException, org.bouncycastle.crypto.InvalidCipherTextException {
        int i2;
        int i3;
        getHighSpeedVideoSizes(0);
        getHighSpeedVideoFpsRanges(bArr, i, getOutputSize(0), true);
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            byte[] highSpeedVideoFpsRangesFor = this.getOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor();
            byte[] clone = org.bouncycastle.util.Arrays.clone(highResolutionOutputSizeshNQ4ISI);
            clone[15] = (byte) (clone[15] | Byte.MIN_VALUE);
            byte[] bArr2 = new byte[16];
            int size = this.getOutputSizeshNQ4ISI.size();
            int i4 = 0;
            while (size > 0) {
                this.getHighSpeedVideoFpsRanges.processBlock(clone, 0, bArr2, 0);
                int min = java.lang.Math.min(16, size);
                for (int i5 = 0; i5 < min; i5++) {
                    bArr2[i5] = (byte) (bArr2[i5] ^ highSpeedVideoFpsRangesFor[i5 + i4]);
                }
                java.lang.System.arraycopy(bArr2, 0, bArr, i + i4, min);
                size -= min;
                i4 += min;
                for (0; i3 < 4; i3 + 1) {
                    byte b = (byte) (clone[i3] + 1);
                    clone[i3] = b;
                    i3 = b == 0 ? i3 + 1 : 0;
                }
            }
            int size2 = this.getOutputSizeshNQ4ISI.size();
            java.lang.System.arraycopy(highResolutionOutputSizeshNQ4ISI, 0, bArr, i + this.getOutputSizeshNQ4ISI.size(), 16);
            byte[] bArr3 = this.getHighSpeedVideoFpsRangesFor;
            java.lang.System.arraycopy(highResolutionOutputSizeshNQ4ISI, 0, bArr3, 0, bArr3.length);
            getHighSpeedVideoFpsRanges();
            return size2 + 16;
        }
        byte[] highSpeedVideoFpsRangesFor2 = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor();
        int size3 = this.getInputSizeshNQ4ISI.size();
        int i6 = size3 - 16;
        if (i6 < 0) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("Data too short");
        }
        byte[] copyOfRange = org.bouncycastle.util.Arrays.copyOfRange(highSpeedVideoFpsRangesFor2, i6, size3);
        byte[] clone2 = org.bouncycastle.util.Arrays.clone(copyOfRange);
        clone2[15] = (byte) (clone2[15] | Byte.MIN_VALUE);
        byte[] bArr4 = new byte[16];
        int i7 = 0;
        while (i6 > 0) {
            this.getHighSpeedVideoFpsRanges.processBlock(clone2, 0, bArr4, 0);
            int min2 = java.lang.Math.min(16, i6);
            for (int i8 = 0; i8 < min2; i8++) {
                bArr4[i8] = (byte) (bArr4[i8] ^ highSpeedVideoFpsRangesFor2[i8 + i7]);
            }
            this.getOutputSizeshNQ4ISI.write(bArr4, 0, min2);
            this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(bArr4, 0, min2);
            i6 -= min2;
            i7 += min2;
            for (0; i2 < 4; i2 + 1) {
                byte b2 = (byte) (clone2[i2] + 1);
                clone2[i2] = b2;
                i2 = b2 == 0 ? i2 + 1 : 0;
            }
        }
        byte[] highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI();
        if (!org.bouncycastle.util.Arrays.constantTimeAreEqual(highResolutionOutputSizeshNQ4ISI2, copyOfRange)) {
            reset();
            throw new org.bouncycastle.crypto.InvalidCipherTextException("mac check failed");
        }
        byte[] bArr5 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.System.arraycopy(highResolutionOutputSizeshNQ4ISI2, 0, bArr5, 0, bArr5.length);
        int size4 = this.getOutputSizeshNQ4ISI.size();
        java.lang.System.arraycopy(this.getOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(), 0, bArr, i, size4);
        getHighSpeedVideoFpsRanges();
        return size4;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        byte[] iv;
        org.bouncycastle.crypto.params.KeyParameter keyParameter;
        byte[] bArr;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.AEADParameters) {
            org.bouncycastle.crypto.params.AEADParameters aEADParameters = (org.bouncycastle.crypto.params.AEADParameters) cipherParameters;
            bArr = aEADParameters.getAssociatedText();
            iv = aEADParameters.getNonce();
            keyParameter = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
                throw new java.lang.IllegalArgumentException("invalid parameters passed to GCM-SIV");
            }
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            keyParameter = (org.bouncycastle.crypto.params.KeyParameter) parametersWithIV.getParameters();
            bArr = null;
        }
        if (iv == null || iv.length != 12) {
            throw new java.lang.IllegalArgumentException("Invalid nonce");
        }
        if (keyParameter == null || !(keyParameter.getKey().length == 16 || keyParameter.getKey().length == 32)) {
            throw new java.lang.IllegalArgumentException("Invalid key");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getOutputFormats = bArr;
        this.getOutputStallDuration = iv;
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        int length = keyParameter.getKey().length;
        byte[] bArr5 = new byte[length];
        java.lang.System.arraycopy(this.getOutputStallDuration, 0, bArr2, 4, 12);
        this.getHighSpeedVideoFpsRanges.init(true, keyParameter);
        this.getHighSpeedVideoFpsRanges.processBlock(bArr2, 0, bArr3, 0);
        java.lang.System.arraycopy(bArr3, 0, bArr4, 0, 8);
        bArr2[0] = (byte) (bArr2[0] + 1);
        this.getHighSpeedVideoFpsRanges.processBlock(bArr2, 0, bArr3, 0);
        java.lang.System.arraycopy(bArr3, 0, bArr4, 8, 8);
        bArr2[0] = (byte) (bArr2[0] + 1);
        this.getHighSpeedVideoFpsRanges.processBlock(bArr2, 0, bArr3, 0);
        java.lang.System.arraycopy(bArr3, 0, bArr5, 0, 8);
        bArr2[0] = (byte) (bArr2[0] + 1);
        this.getHighSpeedVideoFpsRanges.processBlock(bArr2, 0, bArr3, 0);
        java.lang.System.arraycopy(bArr3, 0, bArr5, 8, 8);
        if (length == 32) {
            bArr2[0] = (byte) (bArr2[0] + 1);
            this.getHighSpeedVideoFpsRanges.processBlock(bArr2, 0, bArr3, 0);
            java.lang.System.arraycopy(bArr3, 0, bArr5, 16, 8);
            bArr2[0] = (byte) (bArr2[0] + 1);
            this.getHighSpeedVideoFpsRanges.processBlock(bArr2, 0, bArr3, 0);
            java.lang.System.arraycopy(bArr3, 0, bArr5, 24, 8);
        }
        this.getHighSpeedVideoFpsRanges.init(true, new org.bouncycastle.crypto.params.KeyParameter(bArr5));
        getHighSpeedVideoFpsRanges(bArr4, 0, 16, bArr3);
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            byte b = bArr3[i2];
            bArr3[i2] = (byte) (i | ((b >> 1) & 127));
            i = (b & 1) == 0 ? 0 : androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
        }
        if (i != 0) {
            bArr3[0] = (byte) (bArr3[0] ^ (-31));
        }
        this.getHighSpeedVideoSizesFor.init(bArr3);
        this.getInputFormats |= 1;
        getHighSpeedVideoFpsRanges();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b) {
        getHighSpeedVideoFpsRanges(1);
        org.bouncycastle.crypto.modes.GCMSIVBlockCipher.GCMSIVHasher gCMSIVHasher = this.Camera2StreamConfigurationMap;
        byte[] bArr = gCMSIVHasher.getHighResolutionOutputSizeshNQ4ISI;
        bArr[0] = b;
        gCMSIVHasher.getHighResolutionOutputSizeshNQ4ISI(bArr, 0, 1);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b, byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException {
        getHighSpeedVideoSizes(1);
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getOutputSizeshNQ4ISI.write(b);
            org.bouncycastle.crypto.modes.GCMSIVBlockCipher.GCMSIVHasher gCMSIVHasher = this.getHighSpeedVideoSizes;
            byte[] bArr2 = gCMSIVHasher.getHighResolutionOutputSizeshNQ4ISI;
            bArr2[0] = b;
            gCMSIVHasher.getHighResolutionOutputSizeshNQ4ISI(bArr2, 0, 1);
        } else {
            this.getInputSizeshNQ4ISI.write(b);
        }
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        getHighSpeedVideoFpsRanges();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws org.bouncycastle.crypto.DataLengthException {
        getHighSpeedVideoSizes(i2);
        getHighSpeedVideoFpsRanges(bArr, i, i2, false);
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getOutputSizeshNQ4ISI.write(bArr, i, i2);
            this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(bArr, i, i2);
        } else {
            this.getInputSizeshNQ4ISI.write(bArr, i, i2);
        }
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        getHighSpeedVideoFpsRanges(i2);
        getHighSpeedVideoFpsRanges(bArr, i, i2, false);
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return i + this.getOutputSizeshNQ4ISI.size() + 16;
        }
        int size = i + this.getInputSizeshNQ4ISI.size();
        if (size > 16) {
            return size - 16;
        }
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRanges.getAlgorithmName());
        sb.append("-GCM-SIV");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getHighSpeedVideoFpsRanges(byte[] bArr, int i, int i2, byte[] bArr2) {
        int i3 = 0;
        int i4 = 15;
        while (i3 < i2) {
            bArr2[i4] = bArr[i + i3];
            i3++;
            i4--;
        }
    }

    private void getHighSpeedVideoSizes(int i) {
        long j;
        int i2 = this.getInputFormats;
        if ((i2 & 1) == 0) {
            throw new java.lang.IllegalStateException("Cipher is not initialised");
        }
        if ((i2 & 2) == 0) {
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor();
            this.getInputFormats |= 2;
        }
        long size = this.getOutputSizeshNQ4ISI.size();
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            j = 2147483623;
        } else {
            size = this.getInputSizeshNQ4ISI.size();
            j = 2147483639;
        }
        if (size - Long.MIN_VALUE > (j - i) - Long.MIN_VALUE) {
            throw new java.lang.IllegalStateException("byte count exceeded");
        }
    }

    class GCMSIVHasher {
        private final byte[] Camera2StreamConfigurationMap;
        final byte[] getHighResolutionOutputSizeshNQ4ISI;
        long getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;

        final void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2) {
            int i3;
            int i4 = this.getHighSpeedVideoFpsRangesFor;
            int i5 = 16 - i4;
            int i6 = 0;
            if (i4 <= 0 || i2 < i5) {
                i3 = i2;
            } else {
                java.lang.System.arraycopy(bArr, i, this.Camera2StreamConfigurationMap, i4, i5);
                org.bouncycastle.crypto.modes.GCMSIVBlockCipher.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, 0, 16, org.bouncycastle.crypto.modes.GCMSIVBlockCipher.this.getOutputMinFrameDurationlomOqCM);
                org.bouncycastle.crypto.modes.GCMSIVBlockCipher gCMSIVBlockCipher = org.bouncycastle.crypto.modes.GCMSIVBlockCipher.this;
                org.bouncycastle.crypto.modes.GCMSIVBlockCipher.getHighSpeedVideoFpsRangesFor(gCMSIVBlockCipher, gCMSIVBlockCipher.getOutputMinFrameDurationlomOqCM);
                i3 = i2 - i5;
                this.getHighSpeedVideoFpsRangesFor = 0;
                i6 = i5;
            }
            while (i3 >= 16) {
                org.bouncycastle.crypto.modes.GCMSIVBlockCipher.getHighSpeedVideoFpsRanges(bArr, i + i6, 16, org.bouncycastle.crypto.modes.GCMSIVBlockCipher.this.getOutputMinFrameDurationlomOqCM);
                org.bouncycastle.crypto.modes.GCMSIVBlockCipher gCMSIVBlockCipher2 = org.bouncycastle.crypto.modes.GCMSIVBlockCipher.this;
                org.bouncycastle.crypto.modes.GCMSIVBlockCipher.getHighSpeedVideoFpsRangesFor(gCMSIVBlockCipher2, gCMSIVBlockCipher2.getOutputMinFrameDurationlomOqCM);
                i6 += i5;
                i3 -= i5;
            }
            if (i3 > 0) {
                java.lang.System.arraycopy(bArr, i + i6, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, i3);
                this.getHighSpeedVideoFpsRangesFor += i3;
            }
            this.getHighSpeedVideoFpsRanges += i2;
        }

        final void getHighSpeedVideoFpsRangesFor() {
            if (this.getHighSpeedVideoFpsRangesFor > 0) {
                org.bouncycastle.util.Arrays.fill(org.bouncycastle.crypto.modes.GCMSIVBlockCipher.this.getOutputMinFrameDurationlomOqCM, (byte) 0);
                org.bouncycastle.crypto.modes.GCMSIVBlockCipher.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, 0, this.getHighSpeedVideoFpsRangesFor, org.bouncycastle.crypto.modes.GCMSIVBlockCipher.this.getOutputMinFrameDurationlomOqCM);
                org.bouncycastle.crypto.modes.GCMSIVBlockCipher gCMSIVBlockCipher = org.bouncycastle.crypto.modes.GCMSIVBlockCipher.this;
                org.bouncycastle.crypto.modes.GCMSIVBlockCipher.getHighSpeedVideoFpsRangesFor(gCMSIVBlockCipher, gCMSIVBlockCipher.getOutputMinFrameDurationlomOqCM);
            }
        }

        /* synthetic */ GCMSIVHasher(org.bouncycastle.crypto.modes.GCMSIVBlockCipher gCMSIVBlockCipher, byte b) {
            this();
        }

        private GCMSIVHasher() {
            this.Camera2StreamConfigurationMap = new byte[16];
            this.getHighResolutionOutputSizeshNQ4ISI = new byte[1];
        }
    }

    static class GCMSIVCache extends java.io.ByteArrayOutputStream {
        final byte[] getHighSpeedVideoFpsRangesFor() {
            return this.buf;
        }

        GCMSIVCache() {
        }
    }

    public GCMSIVBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher, org.bouncycastle.crypto.modes.gcm.GCMMultiplier gCMMultiplier) {
        this.getOutputMinFrameDuration = new byte[16];
        this.getOutputMinFrameDurationlomOqCM = new byte[16];
        this.getHighSpeedVideoFpsRangesFor = new byte[16];
        if (blockCipher.getBlockSize() != 16) {
            throw new java.lang.IllegalArgumentException("Cipher required with a block size of 16.");
        }
        this.getHighSpeedVideoFpsRanges = blockCipher;
        this.getHighSpeedVideoSizesFor = gCMMultiplier;
        byte b = 0;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.crypto.modes.GCMSIVBlockCipher.GCMSIVHasher(this, b);
        this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.modes.GCMSIVBlockCipher.GCMSIVHasher(this, b);
    }

    public GCMSIVBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this(blockCipher, new org.bouncycastle.crypto.modes.gcm.Tables4kGCMMultiplier());
    }

    public GCMSIVBlockCipher() {
        this(new org.bouncycastle.crypto.engines.AESEngine());
    }
}
