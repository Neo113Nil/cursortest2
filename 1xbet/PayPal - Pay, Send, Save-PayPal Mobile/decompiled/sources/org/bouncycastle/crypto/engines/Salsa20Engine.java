package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class Salsa20Engine implements org.bouncycastle.crypto.SkippingStreamCipher {
    public static final int DEFAULT_ROUNDS = 20;
    private static final int[] getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Pack.littleEndianToInt(org.bouncycastle.util.Strings.toByteArray("expand 16-byte kexpand 32-byte k"), 0, 8);
    protected static final byte[] sigma = org.bouncycastle.util.Strings.toByteArray("expand 32-byte k");
    protected static final byte[] tau = org.bouncycastle.util.Strings.toByteArray("expand 16-byte k");
    private int Camera2StreamConfigurationMap;
    protected int[] engineState;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizes;
    private byte[] getHighSpeedVideoSizesFor;
    private boolean getInputSizeshNQ4ISI;
    protected int rounds;
    protected int[] x;

    protected int getNonceSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.getInputSizeshNQ4ISI) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getAlgorithmName());
            sb.append(" not initialised");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (i + i2 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        int i4 = this.getHighResolutionOutputSizeshNQ4ISI + i2;
        this.getHighResolutionOutputSizeshNQ4ISI = i4;
        if (i4 < i2 && i4 >= 0) {
            int i5 = this.getHighSpeedVideoFpsRanges + 1;
            this.getHighSpeedVideoFpsRanges = i5;
            if (i5 == 0) {
                int i6 = this.Camera2StreamConfigurationMap + 1;
                this.Camera2StreamConfigurationMap = i6;
                if ((i6 & 32) != 0) {
                    throw new org.bouncycastle.crypto.MaxBytesExceededException("2^70 byte limit per IV would be exceeded; Change IV");
                }
            }
        }
        for (int i7 = 0; i7 < i2; i7++) {
            byte[] bArr3 = this.getHighSpeedVideoSizesFor;
            int i8 = this.getHighSpeedVideoSizes;
            bArr2[i7 + i3] = (byte) (bArr3[i8] ^ bArr[i7 + i]);
            int i9 = (i8 + 1) & 63;
            this.getHighSpeedVideoSizes = i9;
            if (i9 == 0) {
                advanceCounter();
                generateKeyStream(this.getHighSpeedVideoSizesFor);
            }
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        this.getHighSpeedVideoSizes = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.getHighSpeedVideoFpsRanges = 0;
        this.Camera2StreamConfigurationMap = 0;
        resetCounter();
        generateKeyStream(this.getHighSpeedVideoSizesFor);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI + 1;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        if (i == 0) {
            int i2 = this.getHighSpeedVideoFpsRanges + 1;
            this.getHighSpeedVideoFpsRanges = i2;
            if (i2 == 0) {
                int i3 = this.Camera2StreamConfigurationMap + 1;
                this.Camera2StreamConfigurationMap = i3;
                if ((i3 & 32) != 0) {
                    throw new org.bouncycastle.crypto.MaxBytesExceededException("2^70 byte limit per IV; Change IV");
                }
            }
        }
        byte[] bArr = this.getHighSpeedVideoSizesFor;
        int i4 = this.getHighSpeedVideoSizes;
        byte b2 = (byte) (b ^ bArr[i4]);
        int i5 = (i4 + 1) & 63;
        this.getHighSpeedVideoSizes = i5;
        if (i5 == 0) {
            advanceCounter();
            generateKeyStream(this.getHighSpeedVideoSizesFor);
        }
        return b2;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long skip(long j) {
        long j2;
        if (j >= 0) {
            if (j >= 64) {
                long j3 = j / 64;
                advanceCounter(j3);
                j2 = j - (j3 * 64);
            } else {
                j2 = j;
            }
            int i = this.getHighSpeedVideoSizes;
            int i2 = (((int) j2) + i) & 63;
            this.getHighSpeedVideoSizes = i2;
            if (i2 < i) {
                advanceCounter();
            }
        } else {
            long j4 = -j;
            if (j4 >= 64) {
                long j5 = j4 / 64;
                retreatCounter(j5);
                j4 -= j5 * 64;
            }
            for (long j6 = 0; j6 < j4; j6++) {
                if (this.getHighSpeedVideoSizes == 0) {
                    retreatCounter();
                }
                this.getHighSpeedVideoSizes = (this.getHighSpeedVideoSizes - 1) & 63;
            }
        }
        generateKeyStream(this.getHighSpeedVideoSizesFor);
        return j;
    }

    protected void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(getAlgorithmName());
                sb.append(" requires 128 bit or 256 bit key");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            int length = (bArr.length - 16) / 4;
            int[] iArr = this.engineState;
            int[] iArr2 = getHighSpeedVideoFpsRangesFor;
            iArr[0] = iArr2[length];
            iArr[5] = iArr2[length + 1];
            iArr[10] = iArr2[length + 2];
            iArr[15] = iArr2[length + 3];
            org.bouncycastle.util.Pack.littleEndianToInt(bArr, 0, iArr, 1, 4);
            org.bouncycastle.util.Pack.littleEndianToInt(bArr, bArr.length - 16, this.engineState, 11, 4);
        }
        org.bouncycastle.util.Pack.littleEndianToInt(bArr2, 0, this.engineState, 6, 2);
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long seekTo(long j) {
        reset();
        return skip(j);
    }

    protected void retreatCounter(long j) {
        int i = (int) (j >>> 32);
        int i2 = (int) j;
        if (i != 0) {
            int[] iArr = this.engineState;
            int i3 = iArr[9];
            if ((i3 & 4294967295L) < (i & 4294967295L)) {
                throw new java.lang.IllegalStateException("attempt to reduce counter past zero.");
            }
            iArr[9] = i3 - i;
        }
        int[] iArr2 = this.engineState;
        int i4 = iArr2[8];
        if ((i4 & 4294967295L) >= (4294967295L & i2)) {
            iArr2[8] = i4 - i2;
            return;
        }
        int i5 = iArr2[9];
        if (i5 == 0) {
            throw new java.lang.IllegalStateException("attempt to reduce counter past zero.");
        }
        iArr2[9] = i5 - 1;
        iArr2[8] = i4 - i2;
    }

    protected void retreatCounter() {
        int[] iArr = this.engineState;
        int i = iArr[8];
        if (i == 0 && iArr[9] == 0) {
            throw new java.lang.IllegalStateException("attempt to reduce counter past zero.");
        }
        int i2 = i - 1;
        iArr[8] = i2;
        if (i2 == -1) {
            iArr[9] = iArr[9] - 1;
        }
    }

    protected void resetCounter() {
        int[] iArr = this.engineState;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    protected void packTauOrSigma(int i, int[] iArr, int i2) {
        int i3 = (i - 16) / 4;
        int[] iArr2 = getHighSpeedVideoFpsRangesFor;
        iArr[i2] = iArr2[i3];
        iArr[i2 + 1] = iArr2[i3 + 1];
        iArr[i2 + 2] = iArr2[i3 + 2];
        iArr[i2 + 3] = iArr2[i3 + 3];
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getAlgorithmName());
            sb.append(" Init parameters must include an IV");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != getNonceSize()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(getAlgorithmName());
            sb2.append(" requires exactly ");
            sb2.append(getNonceSize());
            sb2.append(" bytes of IV");
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        org.bouncycastle.crypto.CipherParameters parameters = parametersWithIV.getParameters();
        if (parameters == null) {
            if (!this.getInputSizeshNQ4ISI) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(getAlgorithmName());
                sb3.append(" KeyParameter can not be null for first initialisation");
                throw new java.lang.IllegalStateException(sb3.toString());
            }
            setKey(null, iv);
        } else {
            if (!(parameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(getAlgorithmName());
                sb4.append(" Init parameters must contain a KeyParameter (or null for re-init)");
                throw new java.lang.IllegalArgumentException(sb4.toString());
            }
            setKey(((org.bouncycastle.crypto.params.KeyParameter) parameters).getKey(), iv);
        }
        reset();
        this.getInputSizeshNQ4ISI = true;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long getPosition() {
        return (getCounter() * 64) + this.getHighSpeedVideoSizes;
    }

    protected long getCounter() {
        int[] iArr = this.engineState;
        return (iArr[9] << 32) | (iArr[8] & 4294967295L);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public java.lang.String getAlgorithmName() {
        if (this.rounds == 20) {
            return "Salsa20";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Salsa20/");
        sb.append(this.rounds);
        return sb.toString();
    }

    protected void generateKeyStream(byte[] bArr) {
        salsaCore(this.rounds, this.engineState, this.x);
        org.bouncycastle.util.Pack.intToLittleEndian(this.x, bArr, 0);
    }

    protected void advanceCounter(long j) {
        int i = (int) (j >>> 32);
        int i2 = (int) j;
        if (i > 0) {
            int[] iArr = this.engineState;
            iArr[9] = iArr[9] + i;
        }
        int[] iArr2 = this.engineState;
        int i3 = iArr2[8];
        int i4 = i2 + i3;
        iArr2[8] = i4;
        if (i3 == 0 || i4 >= i3) {
            return;
        }
        iArr2[9] = iArr2[9] + 1;
    }

    protected void advanceCounter() {
        int[] iArr = this.engineState;
        int i = iArr[8] + 1;
        iArr[8] = i;
        if (i == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    public static void salsaCore(int i, int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            throw new java.lang.IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i % 2 != 0) {
            throw new java.lang.IllegalArgumentException("Number of rounds must be even");
        }
        boolean z = false;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = 7;
        int i10 = iArr[7];
        int i11 = iArr[8];
        int i12 = 9;
        int i13 = iArr[9];
        int i14 = iArr[10];
        int i15 = iArr[11];
        int i16 = iArr[12];
        int i17 = 13;
        int i18 = iArr[13];
        int i19 = iArr[14];
        int i20 = iArr[15];
        int i21 = i19;
        int i22 = i18;
        int i23 = i16;
        int i24 = i15;
        int i25 = i14;
        int i26 = i13;
        int i27 = i11;
        int i28 = i10;
        int i29 = i8;
        int i30 = i7;
        int i31 = i6;
        int i32 = i5;
        int i33 = i4;
        int i34 = i3;
        int i35 = i2;
        int i36 = i;
        while (i36 > 0) {
            int rotateLeft = org.bouncycastle.util.Integers.rotateLeft(i35 + i23, i9) ^ i31;
            int rotateLeft2 = i27 ^ org.bouncycastle.util.Integers.rotateLeft(rotateLeft + i35, i12);
            int rotateLeft3 = i23 ^ org.bouncycastle.util.Integers.rotateLeft(rotateLeft2 + rotateLeft, i17);
            int rotateLeft4 = org.bouncycastle.util.Integers.rotateLeft(rotateLeft3 + rotateLeft2, 18) ^ i35;
            int rotateLeft5 = i26 ^ org.bouncycastle.util.Integers.rotateLeft(i30 + i34, i9);
            int rotateLeft6 = i22 ^ org.bouncycastle.util.Integers.rotateLeft(rotateLeft5 + i30, i12);
            int rotateLeft7 = i34 ^ org.bouncycastle.util.Integers.rotateLeft(rotateLeft6 + rotateLeft5, i17);
            int rotateLeft8 = org.bouncycastle.util.Integers.rotateLeft(rotateLeft7 + rotateLeft6, 18) ^ i30;
            int rotateLeft9 = i21 ^ org.bouncycastle.util.Integers.rotateLeft(i25 + i29, 7);
            int rotateLeft10 = i33 ^ org.bouncycastle.util.Integers.rotateLeft(rotateLeft9 + i25, 9);
            int rotateLeft11 = i29 ^ org.bouncycastle.util.Integers.rotateLeft(rotateLeft10 + rotateLeft9, 13);
            int rotateLeft12 = i25 ^ org.bouncycastle.util.Integers.rotateLeft(rotateLeft11 + rotateLeft10, 18);
            int rotateLeft13 = i32 ^ org.bouncycastle.util.Integers.rotateLeft(i20 + i24, 7);
            int rotateLeft14 = i28 ^ org.bouncycastle.util.Integers.rotateLeft(rotateLeft13 + i20, 9);
            int i37 = i36;
            int rotateLeft15 = i24 ^ org.bouncycastle.util.Integers.rotateLeft(rotateLeft14 + rotateLeft13, 13);
            int rotateLeft16 = i20 ^ org.bouncycastle.util.Integers.rotateLeft(rotateLeft15 + rotateLeft14, 18);
            i34 = rotateLeft7 ^ org.bouncycastle.util.Integers.rotateLeft(rotateLeft4 + rotateLeft13, 7);
            i33 = rotateLeft10 ^ org.bouncycastle.util.Integers.rotateLeft(i34 + rotateLeft4, 9);
            int rotateLeft17 = rotateLeft13 ^ org.bouncycastle.util.Integers.rotateLeft(i33 + i34, 13);
            int rotateLeft18 = rotateLeft4 ^ org.bouncycastle.util.Integers.rotateLeft(rotateLeft17 + i33, 18);
            i29 = org.bouncycastle.util.Integers.rotateLeft(rotateLeft8 + rotateLeft, 7) ^ rotateLeft11;
            i28 = org.bouncycastle.util.Integers.rotateLeft(i29 + rotateLeft8, 9) ^ rotateLeft14;
            int rotateLeft19 = org.bouncycastle.util.Integers.rotateLeft(i28 + i29, 13) ^ rotateLeft;
            i30 = rotateLeft8 ^ org.bouncycastle.util.Integers.rotateLeft(rotateLeft19 + i28, 18);
            i24 = rotateLeft15 ^ org.bouncycastle.util.Integers.rotateLeft(rotateLeft12 + rotateLeft5, 7);
            int rotateLeft20 = org.bouncycastle.util.Integers.rotateLeft(i24 + rotateLeft12, 9) ^ rotateLeft2;
            i26 = org.bouncycastle.util.Integers.rotateLeft(rotateLeft20 + i24, 13) ^ rotateLeft5;
            i25 = rotateLeft12 ^ org.bouncycastle.util.Integers.rotateLeft(i26 + rotateLeft20, 18);
            i23 = rotateLeft3 ^ org.bouncycastle.util.Integers.rotateLeft(rotateLeft16 + rotateLeft9, 7);
            i22 = rotateLeft6 ^ org.bouncycastle.util.Integers.rotateLeft(i23 + rotateLeft16, 9);
            i21 = rotateLeft9 ^ org.bouncycastle.util.Integers.rotateLeft(i22 + i23, 13);
            i20 = rotateLeft16 ^ org.bouncycastle.util.Integers.rotateLeft(i21 + i22, 18);
            i32 = rotateLeft17;
            i27 = rotateLeft20;
            i35 = rotateLeft18;
            i31 = rotateLeft19;
            z = false;
            i17 = 13;
            i12 = 9;
            i9 = 7;
            i36 = i37 - 2;
        }
        boolean z2 = z;
        iArr2[z2 ? 1 : 0] = i35 + iArr[z2 ? 1 : 0];
        iArr2[1] = i34 + iArr[1];
        iArr2[2] = i33 + iArr[2];
        iArr2[3] = i32 + iArr[3];
        iArr2[4] = i31 + iArr[4];
        iArr2[5] = i30 + iArr[5];
        iArr2[6] = i29 + iArr[6];
        iArr2[7] = i28 + iArr[7];
        iArr2[8] = i27 + iArr[8];
        iArr2[9] = i26 + iArr[9];
        iArr2[10] = i25 + iArr[10];
        iArr2[11] = i24 + iArr[11];
        iArr2[12] = i23 + iArr[12];
        iArr2[13] = i22 + iArr[13];
        iArr2[14] = i21 + iArr[14];
        iArr2[15] = i20 + iArr[15];
    }

    public Salsa20Engine(int i) {
        this.getHighSpeedVideoSizes = 0;
        this.engineState = new int[16];
        this.x = new int[16];
        this.getHighSpeedVideoSizesFor = new byte[64];
        this.getInputSizeshNQ4ISI = false;
        if (i <= 0 || (i & 1) != 0) {
            throw new java.lang.IllegalArgumentException("'rounds' must be a positive, even number");
        }
        this.rounds = i;
    }

    public Salsa20Engine() {
        this(20);
    }
}
