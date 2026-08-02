package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class ChaCha20Poly1305 implements org.bouncycastle.crypto.modes.AEADCipher {
    private static final byte[] getHighSpeedVideoSizes = new byte[15];
    private final org.bouncycastle.crypto.engines.ChaCha7539Engine Camera2StreamConfigurationMap;
    private long getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private long getInputSizeshNQ4ISI;
    private final byte[] getOutputFormats;
    private final byte[] getOutputMinFrameDuration;
    private final org.bouncycastle.crypto.Mac getOutputSizeshNQ4ISI;
    private int getOutputStallDurationlomOqCM;

    private void getHighResolutionOutputSizeshNQ4ISI() {
        int i;
        switch (this.getOutputStallDurationlomOqCM) {
            case 1:
            case 2:
                i = 3;
                break;
            case 3:
            case 7:
                return;
            case 4:
                throw new java.lang.IllegalStateException("ChaCha20Poly1305 cannot be reused for encryption");
            case 5:
            case 6:
                i = 7;
                break;
            default:
                throw new java.lang.IllegalStateException();
        }
        int i2 = ((int) this.getHighResolutionOutputSizeshNQ4ISI) & 15;
        if (i2 != 0) {
            this.getOutputSizeshNQ4ISI.update(getHighSpeedVideoSizes, 0, 16 - i2);
        }
        this.getOutputStallDurationlomOqCM = i;
    }

    private void getHighSpeedVideoFpsRanges(int i) {
        int i2 = ((int) this.getInputSizeshNQ4ISI) & 15;
        if (i2 != 0) {
            this.getOutputSizeshNQ4ISI.update(getHighSpeedVideoSizes, 0, 16 - i2);
        }
        byte[] bArr = new byte[16];
        org.bouncycastle.util.Pack.longToLittleEndian(this.getHighResolutionOutputSizeshNQ4ISI, bArr, 0);
        org.bouncycastle.util.Pack.longToLittleEndian(this.getInputSizeshNQ4ISI, bArr, 8);
        this.getOutputSizeshNQ4ISI.update(bArr, 0, 16);
        this.getOutputSizeshNQ4ISI.doFinal(this.getOutputFormats, 0);
        this.getOutputStallDurationlomOqCM = i;
    }

    private void getHighSpeedVideoFpsRangesFor(boolean z, boolean z2) {
        org.bouncycastle.util.Arrays.clear(this.getHighSpeedVideoFpsRangesFor);
        if (z) {
            org.bouncycastle.util.Arrays.clear(this.getOutputFormats);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
        this.getInputSizeshNQ4ISI = 0L;
        this.getHighSpeedVideoFpsRanges = 0;
        switch (this.getOutputStallDurationlomOqCM) {
            case 1:
            case 5:
                break;
            case 2:
            case 3:
            case 4:
                this.getOutputStallDurationlomOqCM = 4;
                return;
            case 6:
            case 7:
            case 8:
                this.getOutputStallDurationlomOqCM = 5;
                break;
            default:
                throw new java.lang.IllegalStateException();
        }
        if (z2) {
            this.Camera2StreamConfigurationMap.reset();
        }
        byte[] bArr = new byte[64];
        try {
            this.Camera2StreamConfigurationMap.processBytes(bArr, 0, 64, bArr, 0);
            this.getOutputSizeshNQ4ISI.init(new org.bouncycastle.crypto.params.KeyParameter(bArr, 0, 32));
            org.bouncycastle.util.Arrays.clear(bArr);
            byte[] bArr2 = this.getInputFormats;
            if (bArr2 != null) {
                processAADBytes(bArr2, 0, bArr2.length);
            }
        } catch (java.lang.Throwable th) {
            org.bouncycastle.util.Arrays.clear(bArr);
            throw th;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        getHighSpeedVideoFpsRangesFor(true, true);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws org.bouncycastle.crypto.DataLengthException {
        int i4;
        int i5;
        int i6 = i;
        int i7 = i2;
        if (bArr == null) {
            throw new java.lang.NullPointerException("'in' cannot be null");
        }
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException("'inOff' cannot be negative");
        }
        if (i7 < 0) {
            throw new java.lang.IllegalArgumentException("'len' cannot be negative");
        }
        if (i6 > bArr.length - i7) {
            throw new org.bouncycastle.crypto.DataLengthException("Input buffer too short");
        }
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException("'outOff' cannot be negative");
        }
        getHighResolutionOutputSizeshNQ4ISI();
        int i8 = this.getOutputStallDurationlomOqCM;
        if (i8 != 3) {
            if (i8 != 7) {
                throw new java.lang.IllegalStateException();
            }
            int i9 = 0;
            for (int i10 = 0; i10 < i7; i10++) {
                byte[] bArr3 = this.getHighSpeedVideoFpsRangesFor;
                int i11 = this.getHighSpeedVideoFpsRanges;
                bArr3[i11] = bArr[i6 + i10];
                int i12 = i11 + 1;
                this.getHighSpeedVideoFpsRanges = i12;
                if (i12 == bArr3.length) {
                    this.getOutputSizeshNQ4ISI.update(bArr3, 0, 64);
                    getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, 0, 64, bArr2, i3 + i9);
                    byte[] bArr4 = this.getHighSpeedVideoFpsRangesFor;
                    java.lang.System.arraycopy(bArr4, 64, bArr4, 0, 16);
                    this.getHighSpeedVideoFpsRanges = 16;
                    i9 += 64;
                }
            }
            return i9;
        }
        if (this.getHighSpeedVideoFpsRanges != 0) {
            while (i7 > 0) {
                i7--;
                byte[] bArr5 = this.getHighSpeedVideoFpsRangesFor;
                int i13 = this.getHighSpeedVideoFpsRanges;
                i4 = i6 + 1;
                bArr5[i13] = bArr[i6];
                int i14 = i13 + 1;
                this.getHighSpeedVideoFpsRanges = i14;
                if (i14 == 64) {
                    getHighResolutionOutputSizeshNQ4ISI(bArr5, 0, 64, bArr2, i3);
                    this.getOutputSizeshNQ4ISI.update(bArr2, i3, 64);
                    this.getHighSpeedVideoFpsRanges = 0;
                    i5 = 64;
                    break;
                }
                i6 = i4;
            }
        }
        i4 = i6;
        i5 = 0;
        while (i7 >= 64) {
            int i15 = i3 + i5;
            getHighResolutionOutputSizeshNQ4ISI(bArr, i4, 64, bArr2, i15);
            this.getOutputSizeshNQ4ISI.update(bArr2, i15, 64);
            i4 += 64;
            i7 -= 64;
            i5 += 64;
        }
        if (i7 > 0) {
            java.lang.System.arraycopy(bArr, i4, this.getHighSpeedVideoFpsRangesFor, 0, i7);
            this.getHighSpeedVideoFpsRanges = i7;
        }
        return i5;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b, byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException {
        getHighResolutionOutputSizeshNQ4ISI();
        int i2 = this.getOutputStallDurationlomOqCM;
        if (i2 == 3) {
            byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
            int i3 = this.getHighSpeedVideoFpsRanges;
            bArr2[i3] = b;
            int i4 = i3 + 1;
            this.getHighSpeedVideoFpsRanges = i4;
            if (i4 != 64) {
                return 0;
            }
            getHighResolutionOutputSizeshNQ4ISI(bArr2, 0, 64, bArr, i);
            this.getOutputSizeshNQ4ISI.update(bArr, i, 64);
            this.getHighSpeedVideoFpsRanges = 0;
            return 64;
        }
        if (i2 != 7) {
            throw new java.lang.IllegalStateException();
        }
        byte[] bArr3 = this.getHighSpeedVideoFpsRangesFor;
        int i5 = this.getHighSpeedVideoFpsRanges;
        bArr3[i5] = b;
        int i6 = i5 + 1;
        this.getHighSpeedVideoFpsRanges = i6;
        if (i6 != bArr3.length) {
            return 0;
        }
        this.getOutputSizeshNQ4ISI.update(bArr3, 0, 64);
        getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, 0, 64, bArr, i);
        byte[] bArr4 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.System.arraycopy(bArr4, 64, bArr4, 0, 16);
        this.getHighSpeedVideoFpsRanges = 16;
        return 64;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("'in' cannot be null");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("'inOff' cannot be negative");
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("'len' cannot be negative");
        }
        if (i > bArr.length - i2) {
            throw new org.bouncycastle.crypto.DataLengthException("Input buffer too short");
        }
        getHighSpeedVideoFpsRanges();
        if (i2 > 0) {
            this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, i2, -1L);
            this.getOutputSizeshNQ4ISI.update(bArr, i, i2);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b) {
        getHighSpeedVideoFpsRanges();
        this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, 1, -1L);
        this.getOutputSizeshNQ4ISI.update(b);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV;
        org.bouncycastle.crypto.params.KeyParameter keyParameter;
        byte[] iv;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.AEADParameters) {
            org.bouncycastle.crypto.params.AEADParameters aEADParameters = (org.bouncycastle.crypto.params.AEADParameters) cipherParameters;
            int macSize = aEADParameters.getMacSize();
            if (128 != macSize) {
                throw new java.lang.IllegalArgumentException("Invalid value for MAC size: ".concat(java.lang.String.valueOf(macSize)));
            }
            keyParameter = aEADParameters.getKey();
            iv = aEADParameters.getNonce();
            parametersWithIV = new org.bouncycastle.crypto.params.ParametersWithIV(keyParameter, iv);
            this.getInputFormats = aEADParameters.getAssociatedText();
        } else {
            if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
                throw new java.lang.IllegalArgumentException("invalid parameters passed to ChaCha20Poly1305");
            }
            parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            keyParameter = (org.bouncycastle.crypto.params.KeyParameter) parametersWithIV.getParameters();
            iv = parametersWithIV.getIV();
            this.getInputFormats = null;
        }
        if (keyParameter == null) {
            if (this.getOutputStallDurationlomOqCM == 0) {
                throw new java.lang.IllegalArgumentException("Key must be specified in initial init");
            }
        } else if (32 != keyParameter.getKey().length) {
            throw new java.lang.IllegalArgumentException("Key must be 256 bits");
        }
        if (iv == null || 12 != iv.length) {
            throw new java.lang.IllegalArgumentException("Nonce must be 96 bits");
        }
        if (this.getOutputStallDurationlomOqCM != 0 && z && org.bouncycastle.util.Arrays.areEqual(this.getOutputMinFrameDuration, iv) && (keyParameter == null || org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoSizesFor, keyParameter.getKey()))) {
            throw new java.lang.IllegalArgumentException("cannot reuse nonce for ChaCha20Poly1305 encryption");
        }
        if (keyParameter != null) {
            java.lang.System.arraycopy(keyParameter.getKey(), 0, this.getHighSpeedVideoSizesFor, 0, 32);
        }
        java.lang.System.arraycopy(iv, 0, this.getOutputMinFrameDuration, 0, 12);
        this.Camera2StreamConfigurationMap.init(true, parametersWithIV);
        this.getOutputStallDurationlomOqCM = z ? 1 : 5;
        getHighSpeedVideoFpsRangesFor(true, false);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        int max = java.lang.Math.max(0, i) + this.getHighSpeedVideoFpsRanges;
        int i2 = this.getOutputStallDurationlomOqCM;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            if (i2 != 5 && i2 != 6 && i2 != 7) {
                throw new java.lang.IllegalStateException();
            }
            max = java.lang.Math.max(0, max - 16);
        }
        return max - (max % 64);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        int max = java.lang.Math.max(0, i) + this.getHighSpeedVideoFpsRanges;
        int i2 = this.getOutputStallDurationlomOqCM;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return max + 16;
        }
        if (i2 == 5 || i2 == 6 || i2 == 7) {
            return java.lang.Math.max(0, max - 16);
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return org.bouncycastle.util.Arrays.clone(this.getOutputFormats);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public java.lang.String getAlgorithmName() {
        return "ChaCha20Poly1305";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) throws java.lang.IllegalStateException, org.bouncycastle.crypto.InvalidCipherTextException {
        int i2;
        if (bArr == null) {
            throw new java.lang.NullPointerException("'out' cannot be null");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("'outOff' cannot be negative");
        }
        getHighResolutionOutputSizeshNQ4ISI();
        org.bouncycastle.util.Arrays.clear(this.getOutputFormats);
        int i3 = this.getOutputStallDurationlomOqCM;
        if (i3 == 3) {
            int i4 = this.getHighSpeedVideoFpsRanges;
            i2 = i4 + 16;
            if (i > bArr.length - i2) {
                throw new org.bouncycastle.crypto.OutputLengthException("Output buffer too short");
            }
            if (i4 > 0) {
                getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, 0, i4, bArr, i);
                this.getOutputSizeshNQ4ISI.update(bArr, i, this.getHighSpeedVideoFpsRanges);
            }
            getHighSpeedVideoFpsRanges(4);
            java.lang.System.arraycopy(this.getOutputFormats, 0, bArr, this.getHighSpeedVideoFpsRanges + i, 16);
        } else {
            if (i3 != 7) {
                throw new java.lang.IllegalStateException();
            }
            int i5 = this.getHighSpeedVideoFpsRanges;
            if (i5 < 16) {
                throw new org.bouncycastle.crypto.InvalidCipherTextException("data too short");
            }
            i2 = i5 - 16;
            if (i > bArr.length - i2) {
                throw new org.bouncycastle.crypto.OutputLengthException("Output buffer too short");
            }
            if (i2 > 0) {
                this.getOutputSizeshNQ4ISI.update(this.getHighSpeedVideoFpsRangesFor, 0, i2);
                getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, 0, i2, bArr, i);
            }
            getHighSpeedVideoFpsRanges(8);
            if (!org.bouncycastle.util.Arrays.constantTimeAreEqual(16, this.getOutputFormats, 0, this.getHighSpeedVideoFpsRangesFor, i2)) {
                throw new org.bouncycastle.crypto.InvalidCipherTextException("mac check in ChaCha20Poly1305 failed");
            }
        }
        getHighSpeedVideoFpsRangesFor(false, true);
        return i2;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i3 > bArr2.length - i2) {
            throw new org.bouncycastle.crypto.OutputLengthException("Output buffer too short");
        }
        this.Camera2StreamConfigurationMap.processBytes(bArr, i, i2, bArr2, i3);
        this.getInputSizeshNQ4ISI = Camera2StreamConfigurationMap(this.getInputSizeshNQ4ISI, i2, 274877906880L);
    }

    private static long Camera2StreamConfigurationMap(long j, int i, long j2) {
        long j3 = i;
        if (j - Long.MIN_VALUE <= (j2 - j3) - Long.MIN_VALUE) {
            return j + j3;
        }
        throw new java.lang.IllegalStateException("Limit exceeded");
    }

    private void getHighSpeedVideoFpsRanges() {
        int i = this.getOutputStallDurationlomOqCM;
        if (i == 1) {
            this.getOutputStallDurationlomOqCM = 2;
            return;
        }
        if (i != 2) {
            if (i == 4) {
                throw new java.lang.IllegalStateException("ChaCha20Poly1305 cannot be reused for encryption");
            }
            if (i == 5) {
                this.getOutputStallDurationlomOqCM = 6;
            } else if (i != 6) {
                throw new java.lang.IllegalStateException();
            }
        }
    }

    public ChaCha20Poly1305(org.bouncycastle.crypto.Mac mac) {
        this.getHighSpeedVideoSizesFor = new byte[32];
        this.getOutputMinFrameDuration = new byte[12];
        this.getHighSpeedVideoFpsRangesFor = new byte[80];
        this.getOutputFormats = new byte[16];
        this.getOutputStallDurationlomOqCM = 0;
        if (mac == null) {
            throw new java.lang.NullPointerException("'poly1305' cannot be null");
        }
        if (16 != mac.getMacSize()) {
            throw new java.lang.IllegalArgumentException("'poly1305' must be a 128-bit MAC");
        }
        this.Camera2StreamConfigurationMap = new org.bouncycastle.crypto.engines.ChaCha7539Engine();
        this.getOutputSizeshNQ4ISI = mac;
    }

    static final class State {
        private State() {
        }
    }

    public ChaCha20Poly1305() {
        this(new org.bouncycastle.crypto.macs.Poly1305());
    }
}
