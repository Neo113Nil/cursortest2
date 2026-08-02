package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class OCBBlockCipher implements org.bouncycastle.crypto.modes.AEADBlockCipher {
    private org.bouncycastle.crypto.BlockCipher accessartificialFrame;
    private int coroutineBoundary;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private java.util.Vector getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private byte[] getInputFormats;
    private byte[] getOutputMinFrameDuration;
    private byte[] getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private long getOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.BlockCipher getOutputStallDuration;
    private boolean getOutputStallDurationlomOqCM;
    private byte[] getValidOutputFormatsForInputhNQ4ISI;
    private byte[] isOutputSupportedFor;
    private long isOutputSupportedForhNQ4ISI;
    private byte[] toString;
    private int unwrapAs;
    private byte[] Camera2StreamConfigurationMap = null;
    private byte[] getOutputFormats = new byte[24];
    private byte[] getHighSpeedVideoSizesFor = new byte[16];
    private byte[] getInputSizeshNQ4ISI = new byte[16];

    protected static int OCB_ntz(long j) {
        if (j == 0) {
            return 64;
        }
        int i = 0;
        while ((1 & j) == 0) {
            i++;
            j >>>= 1;
        }
        return i;
    }

    protected void updateHASH(byte[] bArr) {
        xor(this.getInputFormats, bArr);
        xor(this.getOutputMinFrameDurationlomOqCM, this.getInputFormats);
        org.bouncycastle.crypto.BlockCipher blockCipher = this.getOutputStallDuration;
        byte[] bArr2 = this.getOutputMinFrameDurationlomOqCM;
        blockCipher.processBlock(bArr2, 0, bArr2, 0);
        xor(this.getOutputMinFrameDuration, this.getOutputMinFrameDurationlomOqCM);
    }

    protected void reset(boolean z) {
        this.getOutputStallDuration.reset();
        this.accessartificialFrame.reset();
        clear(this.getOutputMinFrameDurationlomOqCM);
        clear(this.isOutputSupportedFor);
        this.getOutputSizes = 0;
        this.coroutineBoundary = 0;
        this.getOutputSizeshNQ4ISI = 0L;
        this.isOutputSupportedForhNQ4ISI = 0L;
        clear(this.getInputFormats);
        clear(this.getOutputMinFrameDuration);
        java.lang.System.arraycopy(this.getHighSpeedVideoSizesFor, 0, this.getInputSizeshNQ4ISI, 0, 16);
        clear(this.getHighResolutionOutputSizeshNQ4ISI);
        if (z) {
            this.getValidOutputFormatsForInputhNQ4ISI = null;
        }
        byte[] bArr = this.toString;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    protected int processNonce(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        java.lang.System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
        bArr2[0] = (byte) (this.unwrapAs << 4);
        int length = 15 - bArr.length;
        bArr2[length] = (byte) (bArr2[length] | 1);
        byte b = bArr2[15];
        bArr2[15] = (byte) (b & com.visa.cbp.getEncExpo.startTransaction);
        byte[] bArr3 = this.Camera2StreamConfigurationMap;
        if (bArr3 == null || !org.bouncycastle.util.Arrays.areEqual(bArr2, bArr3)) {
            byte[] bArr4 = new byte[16];
            this.Camera2StreamConfigurationMap = bArr2;
            this.getOutputStallDuration.processBlock(bArr2, 0, bArr4, 0);
            java.lang.System.arraycopy(bArr4, 0, this.getOutputFormats, 0, 16);
            while (i < 8) {
                int i2 = i + 1;
                this.getOutputFormats[i + 16] = (byte) (bArr4[i] ^ bArr4[i2]);
                i = i2;
            }
        }
        return b & 63;
    }

    protected void processMainBlock(byte[] bArr, int i) {
        if (bArr.length < i + 16) {
            throw new org.bouncycastle.crypto.OutputLengthException("Output buffer too short");
        }
        if (this.getOutputStallDurationlomOqCM) {
            xor(this.getHighResolutionOutputSizeshNQ4ISI, this.isOutputSupportedFor);
            this.coroutineBoundary = 0;
        }
        byte[] bArr2 = this.getInputSizeshNQ4ISI;
        long j = this.isOutputSupportedForhNQ4ISI + 1;
        this.isOutputSupportedForhNQ4ISI = j;
        xor(bArr2, getLSub(OCB_ntz(j)));
        xor(this.isOutputSupportedFor, this.getInputSizeshNQ4ISI);
        org.bouncycastle.crypto.BlockCipher blockCipher = this.accessartificialFrame;
        byte[] bArr3 = this.isOutputSupportedFor;
        blockCipher.processBlock(bArr3, 0, bArr3, 0);
        xor(this.isOutputSupportedFor, this.getInputSizeshNQ4ISI);
        java.lang.System.arraycopy(this.isOutputSupportedFor, 0, bArr, i, 16);
        if (this.getOutputStallDurationlomOqCM) {
            return;
        }
        xor(this.getHighResolutionOutputSizeshNQ4ISI, this.isOutputSupportedFor);
        byte[] bArr4 = this.isOutputSupportedFor;
        java.lang.System.arraycopy(bArr4, 16, bArr4, 0, this.unwrapAs);
        this.coroutineBoundary = this.unwrapAs;
    }

    protected void processHashBlock() {
        long j = this.getOutputSizeshNQ4ISI + 1;
        this.getOutputSizeshNQ4ISI = j;
        updateHASH(getLSub(OCB_ntz(j)));
        this.getOutputSizes = 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws org.bouncycastle.crypto.DataLengthException {
        if (bArr.length < i + i2) {
            throw new org.bouncycastle.crypto.DataLengthException("Input buffer too short");
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            byte[] bArr3 = this.isOutputSupportedFor;
            int i6 = this.coroutineBoundary;
            bArr3[i6] = bArr[i + i5];
            int i7 = i6 + 1;
            this.coroutineBoundary = i7;
            if (i7 == bArr3.length) {
                processMainBlock(bArr2, i3 + i4);
                i4 += 16;
            }
        }
        return i4;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b, byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException {
        byte[] bArr2 = this.isOutputSupportedFor;
        int i2 = this.coroutineBoundary;
        bArr2[i2] = b;
        int i3 = i2 + 1;
        this.coroutineBoundary = i3;
        if (i3 != bArr2.length) {
            return 0;
        }
        processMainBlock(bArr, i);
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.getOutputMinFrameDurationlomOqCM;
            int i4 = this.getOutputSizes;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.getOutputSizes = i5;
            if (i5 == bArr2.length) {
                processHashBlock();
            }
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b) {
        byte[] bArr = this.getOutputMinFrameDurationlomOqCM;
        int i = this.getOutputSizes;
        bArr[i] = b;
        int i2 = i + 1;
        this.getOutputSizes = i2;
        if (i2 == bArr.length) {
            processHashBlock();
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        byte[] iv;
        org.bouncycastle.crypto.params.KeyParameter keyParameter;
        boolean z2 = this.getOutputStallDurationlomOqCM;
        this.getOutputStallDurationlomOqCM = z;
        this.getValidOutputFormatsForInputhNQ4ISI = null;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.AEADParameters) {
            org.bouncycastle.crypto.params.AEADParameters aEADParameters = (org.bouncycastle.crypto.params.AEADParameters) cipherParameters;
            iv = aEADParameters.getNonce();
            this.toString = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 64 || macSize > 128 || macSize % 8 != 0) {
                throw new java.lang.IllegalArgumentException("Invalid value for MAC size: ".concat(java.lang.String.valueOf(macSize)));
            }
            this.unwrapAs = macSize / 8;
            keyParameter = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
                throw new java.lang.IllegalArgumentException("invalid parameters passed to OCB");
            }
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            this.toString = null;
            this.unwrapAs = 16;
            keyParameter = (org.bouncycastle.crypto.params.KeyParameter) parametersWithIV.getParameters();
        }
        this.getOutputMinFrameDurationlomOqCM = new byte[16];
        this.isOutputSupportedFor = new byte[z ? 16 : this.unwrapAs + 16];
        if (iv == null) {
            iv = new byte[0];
        }
        if (iv.length > 15) {
            throw new java.lang.IllegalArgumentException("IV must be no more than 15 bytes");
        }
        if (keyParameter != null) {
            this.getOutputStallDuration.init(true, keyParameter);
            this.accessartificialFrame.init(z, keyParameter);
            this.Camera2StreamConfigurationMap = null;
        } else if (z2 != z) {
            throw new java.lang.IllegalArgumentException("cannot change encrypting state without providing key.");
        }
        byte[] bArr = new byte[16];
        this.getHighSpeedVideoSizes = bArr;
        this.getOutputStallDuration.processBlock(bArr, 0, bArr, 0);
        this.getHighSpeedVideoFpsRangesFor = OCB_double(this.getHighSpeedVideoSizes);
        java.util.Vector vector = new java.util.Vector();
        this.getHighSpeedVideoFpsRanges = vector;
        vector.addElement(OCB_double(this.getHighSpeedVideoFpsRangesFor));
        int processNonce = processNonce(iv);
        int i = processNonce % 8;
        int i2 = processNonce / 8;
        if (i == 0) {
            java.lang.System.arraycopy(this.getOutputFormats, i2, this.getHighSpeedVideoSizesFor, 0, 16);
        } else {
            for (int i3 = 0; i3 < 16; i3++) {
                byte[] bArr2 = this.getOutputFormats;
                byte b = bArr2[i2];
                i2++;
                this.getHighSpeedVideoSizesFor[i3] = (byte) (((bArr2[i2] & 255) >>> (8 - i)) | ((b & 255) << i));
            }
        }
        this.getOutputSizes = 0;
        this.coroutineBoundary = 0;
        this.getOutputSizeshNQ4ISI = 0L;
        this.isOutputSupportedForhNQ4ISI = 0L;
        this.getInputFormats = new byte[16];
        this.getOutputMinFrameDuration = new byte[16];
        java.lang.System.arraycopy(this.getHighSpeedVideoSizesFor, 0, this.getInputSizeshNQ4ISI, 0, 16);
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[16];
        byte[] bArr3 = this.toString;
        if (bArr3 != null) {
            processAADBytes(bArr3, 0, bArr3.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        int i2 = i + this.coroutineBoundary;
        if (!this.getOutputStallDurationlomOqCM) {
            int i3 = this.unwrapAs;
            if (i2 < i3) {
                return 0;
            }
            i2 -= i3;
        }
        return i2 - (i2 % 16);
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() {
        return this.accessartificialFrame;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        int i2 = i + this.coroutineBoundary;
        if (this.getOutputStallDurationlomOqCM) {
            return i2 + this.unwrapAs;
        }
        int i3 = this.unwrapAs;
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        byte[] bArr = this.getValidOutputFormatsForInputhNQ4ISI;
        return bArr == null ? new byte[this.unwrapAs] : org.bouncycastle.util.Arrays.clone(bArr);
    }

    protected byte[] getLSub(int i) {
        while (i >= this.getHighSpeedVideoFpsRanges.size()) {
            java.util.Vector vector = this.getHighSpeedVideoFpsRanges;
            vector.addElement(OCB_double((byte[]) vector.lastElement()));
        }
        return (byte[]) this.getHighSpeedVideoFpsRanges.elementAt(i);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.accessartificialFrame.getAlgorithmName());
        sb.append("/OCB");
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) throws java.lang.IllegalStateException, org.bouncycastle.crypto.InvalidCipherTextException {
        byte[] bArr2;
        if (this.getOutputStallDurationlomOqCM) {
            bArr2 = null;
        } else {
            int i2 = this.coroutineBoundary;
            int i3 = this.unwrapAs;
            if (i2 < i3) {
                throw new org.bouncycastle.crypto.InvalidCipherTextException("data too short");
            }
            int i4 = i2 - i3;
            this.coroutineBoundary = i4;
            bArr2 = new byte[i3];
            java.lang.System.arraycopy(this.isOutputSupportedFor, i4, bArr2, 0, i3);
        }
        int i5 = this.getOutputSizes;
        if (i5 > 0) {
            OCB_extend(this.getOutputMinFrameDurationlomOqCM, i5);
            updateHASH(this.getHighSpeedVideoSizes);
        }
        int i6 = this.coroutineBoundary;
        if (i6 > 0) {
            if (this.getOutputStallDurationlomOqCM) {
                OCB_extend(this.isOutputSupportedFor, i6);
                xor(this.getHighResolutionOutputSizeshNQ4ISI, this.isOutputSupportedFor);
            }
            xor(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
            byte[] bArr3 = new byte[16];
            this.getOutputStallDuration.processBlock(this.getInputSizeshNQ4ISI, 0, bArr3, 0);
            xor(this.isOutputSupportedFor, bArr3);
            int length = bArr.length;
            int i7 = this.coroutineBoundary;
            if (length < i + i7) {
                throw new org.bouncycastle.crypto.OutputLengthException("Output buffer too short");
            }
            java.lang.System.arraycopy(this.isOutputSupportedFor, 0, bArr, i, i7);
            if (!this.getOutputStallDurationlomOqCM) {
                OCB_extend(this.isOutputSupportedFor, this.coroutineBoundary);
                xor(this.getHighResolutionOutputSizeshNQ4ISI, this.isOutputSupportedFor);
            }
        }
        xor(this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI);
        xor(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.crypto.BlockCipher blockCipher = this.getOutputStallDuration;
        byte[] bArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
        blockCipher.processBlock(bArr4, 0, bArr4, 0);
        xor(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration);
        int i8 = this.unwrapAs;
        byte[] bArr5 = new byte[i8];
        this.getValidOutputFormatsForInputhNQ4ISI = bArr5;
        java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr5, 0, i8);
        int i9 = this.coroutineBoundary;
        if (this.getOutputStallDurationlomOqCM) {
            int length2 = bArr.length;
            int i10 = i + i9;
            int i11 = this.unwrapAs;
            if (length2 < i10 + i11) {
                throw new org.bouncycastle.crypto.OutputLengthException("Output buffer too short");
            }
            java.lang.System.arraycopy(this.getValidOutputFormatsForInputhNQ4ISI, 0, bArr, i10, i11);
            i9 += this.unwrapAs;
        } else if (!org.bouncycastle.util.Arrays.constantTimeAreEqual(this.getValidOutputFormatsForInputhNQ4ISI, bArr2)) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("mac check in OCB failed");
        }
        reset(false);
        return i9;
    }

    protected void clear(byte[] bArr) {
        if (bArr != null) {
            org.bouncycastle.util.Arrays.fill(bArr, (byte) 0);
        }
    }

    protected static void xor(byte[] bArr, byte[] bArr2) {
        for (int i = 15; i >= 0; i--) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    protected static int shiftLeft(byte[] bArr, byte[] bArr2) {
        int i = 16;
        int i2 = 0;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            int i3 = bArr[i] & 255;
            bArr2[i] = (byte) (i2 | (i3 << 1));
            i2 = (i3 >>> 7) & 1;
        }
    }

    protected static void OCB_extend(byte[] bArr, int i) {
        bArr[i] = Byte.MIN_VALUE;
        while (true) {
            i++;
            if (i >= 16) {
                return;
            } else {
                bArr[i] = 0;
            }
        }
    }

    protected static byte[] OCB_double(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) ((135 >>> ((1 - shiftLeft(bArr, bArr2)) << 3)) ^ bArr2[15]);
        return bArr2;
    }

    public OCBBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher, org.bouncycastle.crypto.BlockCipher blockCipher2) {
        if (blockCipher == null) {
            throw new java.lang.IllegalArgumentException("'hashCipher' cannot be null");
        }
        if (blockCipher.getBlockSize() != 16) {
            throw new java.lang.IllegalArgumentException("'hashCipher' must have a block size of 16");
        }
        if (blockCipher2 == null) {
            throw new java.lang.IllegalArgumentException("'mainCipher' cannot be null");
        }
        if (blockCipher2.getBlockSize() != 16) {
            throw new java.lang.IllegalArgumentException("'mainCipher' must have a block size of 16");
        }
        if (!blockCipher.getAlgorithmName().equals(blockCipher2.getAlgorithmName())) {
            throw new java.lang.IllegalArgumentException("'hashCipher' and 'mainCipher' must be the same algorithm");
        }
        this.getOutputStallDuration = blockCipher;
        this.accessartificialFrame = blockCipher2;
    }
}
