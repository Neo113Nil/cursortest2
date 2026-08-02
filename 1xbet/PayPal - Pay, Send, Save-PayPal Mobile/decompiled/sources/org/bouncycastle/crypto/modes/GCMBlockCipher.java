package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class GCMBlockCipher implements org.bouncycastle.crypto.modes.AEADBlockCipher {
    private long ArtificialStackFrames;
    private byte[] Camera2StreamConfigurationMap;
    private byte[] CoroutineDebuggingKt;
    private int accessartificialFrame;
    private org.bouncycastle.crypto.modes.gcm.GCMMultiplier coroutineCreation;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private long getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private long getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private int getOutputMinFrameDuration;
    private byte[] getOutputMinFrameDurationlomOqCM;
    private byte[] getOutputSizes;
    private int getOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.modes.gcm.GCMExponentiator getOutputStallDuration;
    private org.bouncycastle.crypto.BlockCipher getOutputStallDurationlomOqCM;
    private boolean getValidOutputFormatsForInputhNQ4ISI;
    private boolean isOutputSupportedFor;
    private byte[] isOutputSupportedForhNQ4ISI;
    private byte[] toString;
    private byte[] unwrapAs;

    private void getHighSpeedVideoFpsRangesFor() {
        if (this.getHighSpeedVideoSizesFor > 0) {
            java.lang.System.arraycopy(this.Camera2StreamConfigurationMap, 0, this.getHighResolutionOutputSizeshNQ4ISI, 0, 16);
            this.getInputSizeshNQ4ISI = this.getHighSpeedVideoSizesFor;
        }
        int i = this.getOutputFormats;
        if (i > 0) {
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(bArr, this.getInputFormats, 0, i);
            this.coroutineCreation.multiplyH(bArr);
            this.getInputSizeshNQ4ISI += this.getOutputFormats;
        }
        if (this.getInputSizeshNQ4ISI > 0) {
            java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoFpsRangesFor, 0, 16);
        }
    }

    private void Camera2StreamConfigurationMap(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr2.length - i2 < 16) {
            throw new org.bouncycastle.crypto.OutputLengthException("Output buffer too short");
        }
        if (this.ArtificialStackFrames == 0) {
            getHighSpeedVideoFpsRangesFor();
        }
        byte[] bArr3 = new byte[16];
        getHighSpeedVideoFpsRanges(bArr3);
        if (this.isOutputSupportedFor) {
            org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(bArr3, bArr, i);
            byte[] bArr4 = this.getHighSpeedVideoFpsRangesFor;
            org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(bArr4, bArr3);
            this.coroutineCreation.multiplyH(bArr4);
            java.lang.System.arraycopy(bArr3, 0, bArr2, i2, 16);
        } else {
            byte[] bArr5 = this.getHighSpeedVideoFpsRangesFor;
            org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(bArr5, bArr, i);
            this.coroutineCreation.multiplyH(bArr5);
            org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(bArr3, 0, bArr, i, bArr2, i2);
        }
        this.ArtificialStackFrames += 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) throws java.lang.IllegalStateException, org.bouncycastle.crypto.InvalidCipherTextException {
        getHighSpeedVideoSizes();
        if (this.ArtificialStackFrames == 0) {
            getHighSpeedVideoFpsRangesFor();
        }
        int i2 = this.getOutputSizeshNQ4ISI;
        if (!this.isOutputSupportedFor) {
            int i3 = this.accessartificialFrame;
            if (i2 < i3) {
                throw new org.bouncycastle.crypto.InvalidCipherTextException("data too short");
            }
            i2 -= i3;
            if (bArr.length - i < i2) {
                throw new org.bouncycastle.crypto.OutputLengthException("Output buffer too short");
            }
        } else if (bArr.length - i < this.accessartificialFrame + i2) {
            throw new org.bouncycastle.crypto.OutputLengthException("Output buffer too short");
        }
        if (i2 > 0) {
            byte[] bArr2 = this.getOutputMinFrameDurationlomOqCM;
            byte[] bArr3 = new byte[16];
            getHighSpeedVideoFpsRanges(bArr3);
            if (this.isOutputSupportedFor) {
                org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(bArr2, 0, bArr3, 0, i2);
                byte[] bArr4 = this.getHighSpeedVideoFpsRangesFor;
                org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(bArr4, bArr2, 0, i2);
                this.coroutineCreation.multiplyH(bArr4);
            } else {
                byte[] bArr5 = this.getHighSpeedVideoFpsRangesFor;
                org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(bArr5, bArr2, 0, i2);
                this.coroutineCreation.multiplyH(bArr5);
                org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(bArr2, 0, bArr3, 0, i2);
            }
            java.lang.System.arraycopy(bArr2, 0, bArr, i, i2);
            this.ArtificialStackFrames += i2;
        }
        long j = this.getHighSpeedVideoSizesFor;
        int i4 = this.getOutputFormats;
        long j2 = j + i4;
        this.getHighSpeedVideoSizesFor = j2;
        if (j2 > this.getInputSizeshNQ4ISI) {
            if (i4 > 0) {
                byte[] bArr6 = this.Camera2StreamConfigurationMap;
                org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(bArr6, this.getInputFormats, 0, i4);
                this.coroutineCreation.multiplyH(bArr6);
            }
            if (this.getInputSizeshNQ4ISI > 0) {
                org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
            }
            long j3 = this.ArtificialStackFrames;
            byte[] bArr7 = new byte[16];
            if (this.getOutputStallDuration == null) {
                org.bouncycastle.crypto.modes.gcm.BasicGCMExponentiator basicGCMExponentiator = new org.bouncycastle.crypto.modes.gcm.BasicGCMExponentiator();
                this.getOutputStallDuration = basicGCMExponentiator;
                basicGCMExponentiator.init(this.getHighSpeedVideoFpsRanges);
            }
            this.getOutputStallDuration.exponentiateX(((j3 * 8) + 127) >>> 7, bArr7);
            org.bouncycastle.crypto.modes.gcm.GCMUtil.multiply(this.Camera2StreamConfigurationMap, bArr7);
            org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        }
        byte[] bArr8 = new byte[16];
        org.bouncycastle.util.Pack.longToBigEndian(this.getHighSpeedVideoSizesFor * 8, bArr8, 0);
        org.bouncycastle.util.Pack.longToBigEndian(this.ArtificialStackFrames * 8, bArr8, 8);
        byte[] bArr9 = this.getHighSpeedVideoFpsRangesFor;
        org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(bArr9, bArr8);
        this.coroutineCreation.multiplyH(bArr9);
        byte[] bArr10 = new byte[16];
        this.getOutputStallDurationlomOqCM.processBlock(this.getHighSpeedVideoSizes, 0, bArr10, 0);
        org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(bArr10, this.getHighSpeedVideoFpsRangesFor);
        int i5 = this.accessartificialFrame;
        byte[] bArr11 = new byte[i5];
        this.unwrapAs = bArr11;
        java.lang.System.arraycopy(bArr10, 0, bArr11, 0, i5);
        if (this.isOutputSupportedFor) {
            java.lang.System.arraycopy(this.unwrapAs, 0, bArr, this.getOutputSizeshNQ4ISI + i, this.accessartificialFrame);
            i2 += this.accessartificialFrame;
        } else {
            int i6 = this.accessartificialFrame;
            byte[] bArr12 = new byte[i6];
            java.lang.System.arraycopy(this.getOutputMinFrameDurationlomOqCM, i2, bArr12, 0, i6);
            if (!org.bouncycastle.util.Arrays.constantTimeAreEqual(this.unwrapAs, bArr12)) {
                throw new org.bouncycastle.crypto.InvalidCipherTextException("mac check in GCM failed");
            }
        }
        getHighResolutionOutputSizeshNQ4ISI(false);
        return i2;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        byte[] iv;
        org.bouncycastle.crypto.params.KeyParameter keyParameter;
        byte[] bArr;
        this.isOutputSupportedFor = z;
        this.unwrapAs = null;
        this.getValidOutputFormatsForInputhNQ4ISI = true;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.AEADParameters) {
            org.bouncycastle.crypto.params.AEADParameters aEADParameters = (org.bouncycastle.crypto.params.AEADParameters) cipherParameters;
            iv = aEADParameters.getNonce();
            this.isOutputSupportedForhNQ4ISI = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 32 || macSize > 128 || macSize % 8 != 0) {
                throw new java.lang.IllegalArgumentException("Invalid value for MAC size: ".concat(java.lang.String.valueOf(macSize)));
            }
            this.accessartificialFrame = macSize / 8;
            keyParameter = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
                throw new java.lang.IllegalArgumentException("invalid parameters passed to GCM");
            }
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            this.isOutputSupportedForhNQ4ISI = null;
            this.accessartificialFrame = 16;
            keyParameter = (org.bouncycastle.crypto.params.KeyParameter) parametersWithIV.getParameters();
        }
        this.getOutputMinFrameDurationlomOqCM = new byte[z ? 16 : this.accessartificialFrame + 16];
        if (iv == null || iv.length <= 0) {
            throw new java.lang.IllegalArgumentException("IV must be at least 1 byte");
        }
        if (z && (bArr = this.CoroutineDebuggingKt) != null && org.bouncycastle.util.Arrays.areEqual(bArr, iv)) {
            if (keyParameter == null) {
                throw new java.lang.IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
            byte[] bArr2 = this.toString;
            if (bArr2 != null && org.bouncycastle.util.Arrays.areEqual(bArr2, keyParameter.getKey())) {
                throw new java.lang.IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
        }
        this.CoroutineDebuggingKt = iv;
        if (keyParameter != null) {
            this.toString = keyParameter.getKey();
        }
        if (keyParameter != null) {
            this.getOutputStallDurationlomOqCM.init(true, keyParameter);
            byte[] bArr3 = new byte[16];
            this.getHighSpeedVideoFpsRanges = bArr3;
            this.getOutputStallDurationlomOqCM.processBlock(bArr3, 0, bArr3, 0);
            this.coroutineCreation.init(this.getHighSpeedVideoFpsRanges);
            this.getOutputStallDuration = null;
        } else if (this.getHighSpeedVideoFpsRanges == null) {
            throw new java.lang.IllegalArgumentException("Key must be specified in initial init");
        }
        byte[] bArr4 = new byte[16];
        this.getHighSpeedVideoSizes = bArr4;
        byte[] bArr5 = this.CoroutineDebuggingKt;
        if (bArr5.length == 12) {
            java.lang.System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            this.getHighSpeedVideoSizes[15] = 1;
        } else {
            int length = bArr5.length;
            for (int i = 0; i < length; i += 16) {
                org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(bArr4, bArr5, i, java.lang.Math.min(length - i, 16));
                this.coroutineCreation.multiplyH(bArr4);
            }
            byte[] bArr6 = new byte[16];
            org.bouncycastle.util.Pack.longToBigEndian(this.CoroutineDebuggingKt.length * 8, bArr6, 8);
            byte[] bArr7 = this.getHighSpeedVideoSizes;
            org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(bArr7, bArr6);
            this.coroutineCreation.multiplyH(bArr7);
        }
        this.getHighSpeedVideoFpsRangesFor = new byte[16];
        this.Camera2StreamConfigurationMap = new byte[16];
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[16];
        this.getInputFormats = new byte[16];
        this.getOutputFormats = 0;
        this.getHighSpeedVideoSizesFor = 0L;
        this.getInputSizeshNQ4ISI = 0L;
        this.getOutputSizes = org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes);
        this.getOutputMinFrameDuration = -2;
        this.getOutputSizeshNQ4ISI = 0;
        this.ArtificialStackFrames = 0L;
        byte[] bArr8 = this.isOutputSupportedForhNQ4ISI;
        if (bArr8 != null) {
            processAADBytes(bArr8, 0, bArr8.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b) {
        getHighSpeedVideoSizes();
        byte[] bArr = this.getInputFormats;
        int i = this.getOutputFormats;
        bArr[i] = b;
        int i2 = i + 1;
        this.getOutputFormats = i2;
        if (i2 == 16) {
            byte[] bArr2 = this.Camera2StreamConfigurationMap;
            org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(bArr2, bArr);
            this.coroutineCreation.multiplyH(bArr2);
            this.getOutputFormats = 0;
            this.getHighSpeedVideoSizesFor += 16;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        getHighSpeedVideoSizes();
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.getInputFormats;
            int i4 = this.getOutputFormats;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.getOutputFormats = i5;
            if (i5 == 16) {
                byte[] bArr3 = this.Camera2StreamConfigurationMap;
                org.bouncycastle.crypto.modes.gcm.GCMUtil.xor(bArr3, bArr2);
                this.coroutineCreation.multiplyH(bArr3);
                this.getOutputFormats = 0;
                this.getHighSpeedVideoSizesFor += 16;
            }
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        getHighResolutionOutputSizeshNQ4ISI(true);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws org.bouncycastle.crypto.DataLengthException {
        int i4;
        int i5;
        getHighSpeedVideoSizes();
        if (bArr.length - i < i2) {
            throw new org.bouncycastle.crypto.DataLengthException("Input buffer too short");
        }
        if (!this.isOutputSupportedFor) {
            int i6 = 0;
            for (int i7 = 0; i7 < i2; i7++) {
                byte[] bArr3 = this.getOutputMinFrameDurationlomOqCM;
                int i8 = this.getOutputSizeshNQ4ISI;
                bArr3[i8] = bArr[i + i7];
                int i9 = i8 + 1;
                this.getOutputSizeshNQ4ISI = i9;
                if (i9 == bArr3.length) {
                    Camera2StreamConfigurationMap(bArr3, 0, bArr2, i3 + i6);
                    byte[] bArr4 = this.getOutputMinFrameDurationlomOqCM;
                    java.lang.System.arraycopy(bArr4, 16, bArr4, 0, this.accessartificialFrame);
                    this.getOutputSizeshNQ4ISI = this.accessartificialFrame;
                    i6 += 16;
                }
            }
            return i6;
        }
        if (this.getOutputSizeshNQ4ISI != 0) {
            while (i2 > 0) {
                i2--;
                byte[] bArr5 = this.getOutputMinFrameDurationlomOqCM;
                int i10 = this.getOutputSizeshNQ4ISI;
                i4 = i + 1;
                bArr5[i10] = bArr[i];
                int i11 = i10 + 1;
                this.getOutputSizeshNQ4ISI = i11;
                if (i11 == 16) {
                    Camera2StreamConfigurationMap(bArr5, 0, bArr2, i3);
                    this.getOutputSizeshNQ4ISI = 0;
                    i5 = 16;
                    break;
                }
                i = i4;
            }
        }
        i4 = i;
        i5 = 0;
        while (i2 >= 16) {
            Camera2StreamConfigurationMap(bArr, i4, bArr2, i3 + i5);
            i4 += 16;
            i2 -= 16;
            i5 += 16;
        }
        if (i2 > 0) {
            java.lang.System.arraycopy(bArr, i4, this.getOutputMinFrameDurationlomOqCM, 0, i2);
            this.getOutputSizeshNQ4ISI = i2;
        }
        return i5;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b, byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException {
        getHighSpeedVideoSizes();
        byte[] bArr2 = this.getOutputMinFrameDurationlomOqCM;
        int i2 = this.getOutputSizeshNQ4ISI;
        bArr2[i2] = b;
        int i3 = i2 + 1;
        this.getOutputSizeshNQ4ISI = i3;
        if (i3 != bArr2.length) {
            return 0;
        }
        Camera2StreamConfigurationMap(bArr2, 0, bArr, i);
        if (this.isOutputSupportedFor) {
            this.getOutputSizeshNQ4ISI = 0;
        } else {
            byte[] bArr3 = this.getOutputMinFrameDurationlomOqCM;
            java.lang.System.arraycopy(bArr3, 16, bArr3, 0, this.accessartificialFrame);
            this.getOutputSizeshNQ4ISI = this.accessartificialFrame;
        }
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        int i2 = i + this.getOutputSizeshNQ4ISI;
        if (!this.isOutputSupportedFor) {
            int i3 = this.accessartificialFrame;
            if (i2 < i3) {
                return 0;
            }
            i2 -= i3;
        }
        return i2 - (i2 % 16);
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() {
        return this.getOutputStallDurationlomOqCM;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        int i2 = i + this.getOutputSizeshNQ4ISI;
        if (this.isOutputSupportedFor) {
            return i2 + this.accessartificialFrame;
        }
        int i3 = this.accessartificialFrame;
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        byte[] bArr = this.unwrapAs;
        return bArr == null ? new byte[this.accessartificialFrame] : org.bouncycastle.util.Arrays.clone(bArr);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getOutputStallDurationlomOqCM.getAlgorithmName());
        sb.append("/GCM");
        return sb.toString();
    }

    private void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        this.getOutputStallDurationlomOqCM.reset();
        this.getHighSpeedVideoFpsRangesFor = new byte[16];
        this.Camera2StreamConfigurationMap = new byte[16];
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[16];
        this.getInputFormats = new byte[16];
        this.getOutputFormats = 0;
        this.getHighSpeedVideoSizesFor = 0L;
        this.getInputSizeshNQ4ISI = 0L;
        this.getOutputSizes = org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes);
        this.getOutputMinFrameDuration = -2;
        this.getOutputSizeshNQ4ISI = 0;
        this.ArtificialStackFrames = 0L;
        byte[] bArr = this.getOutputMinFrameDurationlomOqCM;
        if (bArr != null) {
            org.bouncycastle.util.Arrays.fill(bArr, (byte) 0);
        }
        if (z) {
            this.unwrapAs = null;
        }
        if (this.isOutputSupportedFor) {
            this.getValidOutputFormatsForInputhNQ4ISI = false;
            return;
        }
        byte[] bArr2 = this.isOutputSupportedForhNQ4ISI;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }

    private void getHighSpeedVideoFpsRanges(byte[] bArr) {
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            throw new java.lang.IllegalStateException("Attempt to process too many blocks");
        }
        this.getOutputMinFrameDuration = i - 1;
        byte[] bArr2 = this.getOutputSizes;
        int i2 = (bArr2[15] & 255) + 1;
        bArr2[15] = (byte) i2;
        int i3 = (i2 >>> 8) + (bArr2[14] & 255);
        bArr2[14] = (byte) i3;
        int i4 = (i3 >>> 8) + (bArr2[13] & 255);
        bArr2[13] = (byte) i4;
        bArr2[12] = (byte) ((i4 >>> 8) + (bArr2[12] & 255));
        this.getOutputStallDurationlomOqCM.processBlock(bArr2, 0, bArr, 0);
    }

    private void getHighSpeedVideoSizes() {
        if (this.getValidOutputFormatsForInputhNQ4ISI) {
            return;
        }
        if (!this.isOutputSupportedFor) {
            throw new java.lang.IllegalStateException("GCM cipher needs to be initialised");
        }
        throw new java.lang.IllegalStateException("GCM cipher cannot be reused for encryption");
    }

    public GCMBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher, org.bouncycastle.crypto.modes.gcm.GCMMultiplier gCMMultiplier) {
        if (blockCipher.getBlockSize() != 16) {
            throw new java.lang.IllegalArgumentException("cipher required with a block size of 16.");
        }
        gCMMultiplier = gCMMultiplier == null ? new org.bouncycastle.crypto.modes.gcm.Tables4kGCMMultiplier() : gCMMultiplier;
        this.getOutputStallDurationlomOqCM = blockCipher;
        this.coroutineCreation = gCMMultiplier;
    }

    public GCMBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this(blockCipher, null);
    }
}
