package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
public class Poly1305 implements org.bouncycastle.crypto.Mac {
    private final byte[] Camera2StreamConfigurationMap;
    private final byte[] CoroutineDebuggingKt;
    private int coroutineBoundary;
    private final org.bouncycastle.crypto.BlockCipher getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private int getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private int getOutputSizeshNQ4ISI;
    private int getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private int getValidOutputFormatsForInputhNQ4ISI;
    private int isOutputSupportedFor;
    private int isOutputSupportedForhNQ4ISI;
    private int toString;
    private int unwrapAs;

    private void getHighResolutionOutputSizeshNQ4ISI() {
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i < 16) {
            this.Camera2StreamConfigurationMap[i] = 1;
            for (int i2 = i + 1; i2 < 16; i2++) {
                this.Camera2StreamConfigurationMap[i2] = 0;
            }
        }
        long littleEndianToInt = org.bouncycastle.util.Pack.littleEndianToInt(this.Camera2StreamConfigurationMap, 0);
        long littleEndianToInt2 = org.bouncycastle.util.Pack.littleEndianToInt(this.Camera2StreamConfigurationMap, 4) & 4294967295L;
        long littleEndianToInt3 = org.bouncycastle.util.Pack.littleEndianToInt(this.Camera2StreamConfigurationMap, 8) & 4294967295L;
        long littleEndianToInt4 = org.bouncycastle.util.Pack.littleEndianToInt(this.Camera2StreamConfigurationMap, 12) & 4294967295L;
        int i3 = (int) (this.getHighSpeedVideoSizes + (littleEndianToInt & 67108863));
        this.getHighSpeedVideoSizes = i3;
        int i4 = (int) (this.getHighSpeedVideoFpsRanges + ((((littleEndianToInt2 << 32) | (littleEndianToInt & 4294967295L)) >>> 26) & 67108863));
        this.getHighSpeedVideoFpsRanges = i4;
        int i5 = (int) (this.getInputSizeshNQ4ISI + (((littleEndianToInt2 | (littleEndianToInt3 << 32)) >>> 20) & 67108863));
        this.getInputSizeshNQ4ISI = i5;
        int i6 = (int) (this.getInputFormats + (((littleEndianToInt3 | (littleEndianToInt4 << 32)) >>> 14) & 67108863));
        this.getInputFormats = i6;
        int i7 = (int) (this.getHighSpeedVideoSizesFor + (littleEndianToInt4 >>> 8));
        this.getHighSpeedVideoSizesFor = i7;
        if (this.getHighSpeedVideoFpsRangesFor == 16) {
            this.getHighSpeedVideoSizesFor = i7 + 16777216;
        }
        int i8 = this.getOutputSizes;
        int i9 = this.coroutineBoundary;
        int i10 = this.unwrapAs;
        int i11 = this.toString;
        int i12 = this.getHighSpeedVideoSizesFor;
        long j = ((i3 & 4294967295L) * i8) + ((i4 & 4294967295L) * i9) + ((i5 & 4294967295L) * i10) + ((i6 & 4294967295L) * i11) + ((i12 & 4294967295L) * this.isOutputSupportedForhNQ4ISI);
        int i13 = this.getOutputStallDuration;
        long j2 = (i3 & 4294967295L) * i13;
        long j3 = (i4 & 4294967295L) * i8;
        long j4 = (i6 & 4294967295L) * i10;
        long j5 = (i12 & 4294967295L) * i11;
        int i14 = this.getOutputMinFrameDurationlomOqCM;
        long j6 = (i4 & 4294967295L) * i13;
        long j7 = (i5 & 4294967295L) * i8;
        long j8 = (i6 & 4294967295L) * i9;
        long j9 = (i12 & 4294967295L) * i10;
        int i15 = this.isOutputSupportedFor;
        long j10 = (i4 & 4294967295L) * i14;
        long j11 = (i5 & 4294967295L) * i13;
        long j12 = (i6 & 4294967295L) * i8;
        long j13 = (i12 & 4294967295L) * i9;
        long j14 = (i4 & 4294967295L) * i15;
        long j15 = (i5 & 4294967295L) * i14;
        long j16 = (i6 & 4294967295L) * i13;
        long j17 = (i12 & 4294967295L) * i8;
        int i16 = (int) j;
        long j18 = j2 + j3 + ((i5 & 4294967295L) * i9) + j4 + j5 + (j >>> 26);
        long j19 = ((i3 & 4294967295L) * i14) + j6 + j7 + j8 + j9 + (j18 >>> 26);
        this.getInputSizeshNQ4ISI = ((int) j19) & 67108863;
        long j20 = (j19 >>> 26) + ((i3 & 4294967295L) * i15) + j10 + j11 + j12 + j13;
        this.getInputFormats = ((int) j20) & 67108863;
        long j21 = ((i3 & 4294967295L) * this.getValidOutputFormatsForInputhNQ4ISI) + j14 + j15 + j16 + j17 + (j20 >>> 26);
        this.getHighSpeedVideoSizesFor = ((int) j21) & 67108863;
        int i17 = (i16 & 67108863) + (((int) (j21 >>> 26)) * 5);
        this.getHighSpeedVideoFpsRanges = (((int) j18) & 67108863) + (i17 >>> 26);
        this.getHighSpeedVideoSizes = i17 & 67108863;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        byte[] bArr;
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            bArr = null;
        } else {
            if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
                throw new java.lang.IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
            }
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            bArr = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        }
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            throw new java.lang.IllegalArgumentException("Poly1305 requires a key.");
        }
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        if (key.length != 32) {
            throw new java.lang.IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        int i = 16;
        if (this.getHighResolutionOutputSizeshNQ4ISI != null && (bArr == null || bArr.length != 16)) {
            throw new java.lang.IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        int littleEndianToInt = org.bouncycastle.util.Pack.littleEndianToInt(key, 0);
        int littleEndianToInt2 = org.bouncycastle.util.Pack.littleEndianToInt(key, 4);
        int littleEndianToInt3 = org.bouncycastle.util.Pack.littleEndianToInt(key, 8);
        int littleEndianToInt4 = org.bouncycastle.util.Pack.littleEndianToInt(key, 12);
        this.getOutputSizes = 67108863 & littleEndianToInt;
        int i2 = ((littleEndianToInt >>> 26) | (littleEndianToInt2 << 6)) & 67108611;
        this.getOutputStallDuration = i2;
        int i3 = ((littleEndianToInt2 >>> 20) | (littleEndianToInt3 << 12)) & 67092735;
        this.getOutputMinFrameDurationlomOqCM = i3;
        int i4 = ((littleEndianToInt3 >>> 14) | (littleEndianToInt4 << 18)) & 66076671;
        this.isOutputSupportedFor = i4;
        int i5 = (littleEndianToInt4 >>> 8) & 1048575;
        this.getValidOutputFormatsForInputhNQ4ISI = i5;
        this.isOutputSupportedForhNQ4ISI = i2 * 5;
        this.toString = i3 * 5;
        this.unwrapAs = i4 * 5;
        this.coroutineBoundary = i5 * 5;
        org.bouncycastle.crypto.BlockCipher blockCipher = this.getHighResolutionOutputSizeshNQ4ISI;
        if (blockCipher != null) {
            byte[] bArr2 = new byte[16];
            blockCipher.init(true, new org.bouncycastle.crypto.params.KeyParameter(key, 16, 16));
            this.getHighResolutionOutputSizeshNQ4ISI.processBlock(bArr, 0, bArr2, 0);
            i = 0;
            key = bArr2;
        }
        this.getOutputFormats = org.bouncycastle.util.Pack.littleEndianToInt(key, i);
        this.getOutputMinFrameDuration = org.bouncycastle.util.Pack.littleEndianToInt(key, i + 4);
        this.getOutputStallDurationlomOqCM = org.bouncycastle.util.Pack.littleEndianToInt(key, i + 8);
        this.getOutputSizeshNQ4ISI = org.bouncycastle.util.Pack.littleEndianToInt(key, i + 12);
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        int i3 = 0;
        while (i2 > i3) {
            if (this.getHighSpeedVideoFpsRangesFor == 16) {
                getHighResolutionOutputSizeshNQ4ISI();
                this.getHighSpeedVideoFpsRangesFor = 0;
            }
            int min = java.lang.Math.min(i2 - i3, 16 - this.getHighSpeedVideoFpsRangesFor);
            java.lang.System.arraycopy(bArr, i3 + i, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, min);
            i3 += min;
            this.getHighSpeedVideoFpsRangesFor += min;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) throws java.lang.IllegalStateException {
        byte[] bArr = this.CoroutineDebuggingKt;
        bArr[0] = b;
        update(bArr, 0, 1);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getHighSpeedVideoSizesFor = 0;
        this.getInputFormats = 0;
        this.getInputSizeshNQ4ISI = 0;
        this.getHighSpeedVideoFpsRanges = 0;
        this.getHighSpeedVideoSizes = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public java.lang.String getAlgorithmName() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            return "Poly1305";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Poly1305-");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getAlgorithmName());
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (i + 16 > bArr.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("Output buffer is too short.");
        }
        if (this.getHighSpeedVideoFpsRangesFor > 0) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
        int i2 = this.getHighSpeedVideoFpsRanges;
        int i3 = this.getHighSpeedVideoSizes;
        int i4 = i2 + (i3 >>> 26);
        int i5 = this.getInputSizeshNQ4ISI + (i4 >>> 26);
        int i6 = this.getInputFormats + (i5 >>> 26);
        int i7 = i5 & 67108863;
        int i8 = this.getHighSpeedVideoSizesFor + (i6 >>> 26);
        int i9 = i6 & 67108863;
        int i10 = (i3 & 67108863) + ((i8 >>> 26) * 5);
        int i11 = i8 & 67108863;
        int i12 = (i4 & 67108863) + (i10 >>> 26);
        int i13 = i10 & 67108863;
        int i14 = i13 + 5;
        int i15 = (i14 >>> 26) + i12;
        int i16 = (i15 >>> 26) + i7;
        int i17 = (i16 >>> 26) + i9;
        int i18 = ((i17 >>> 26) + i11) - 67108864;
        int i19 = (i18 >>> 31) - 1;
        int i20 = ~i19;
        this.getHighSpeedVideoSizes = (i13 & i20) | (i14 & 67108863 & i19);
        int i21 = (i12 & i20) | (i15 & 67108863 & i19);
        this.getHighSpeedVideoFpsRanges = i21;
        int i22 = (i7 & i20) | (i16 & 67108863 & i19);
        this.getInputSizeshNQ4ISI = i22;
        int i23 = (i9 & i20) | (67108863 & i17 & i19);
        this.getInputFormats = i23;
        this.getHighSpeedVideoSizesFor = (i11 & i20) | (i18 & i19);
        long j = ((r4 | (i21 << 26)) & 4294967295L) + (this.getOutputFormats & 4294967295L);
        long j2 = (i21 >>> 6) | (i22 << 20);
        long j3 = this.getOutputMinFrameDuration;
        long j4 = (i22 >>> 12) | (i23 << 14);
        long j5 = this.getOutputStallDurationlomOqCM;
        long j6 = this.getOutputSizeshNQ4ISI;
        org.bouncycastle.util.Pack.intToLittleEndian((int) j, bArr, i);
        long j7 = (j2 & 4294967295L) + (j3 & 4294967295L) + (j >>> 32);
        org.bouncycastle.util.Pack.intToLittleEndian((int) j7, bArr, i + 4);
        long j8 = (j4 & 4294967295L) + (j5 & 4294967295L) + (j7 >>> 32);
        org.bouncycastle.util.Pack.intToLittleEndian((int) j8, bArr, i + 8);
        org.bouncycastle.util.Pack.intToLittleEndian((int) ((((i23 >>> 18) | (r7 << 8)) & 4294967295L) + (j6 & 4294967295L) + (j8 >>> 32)), bArr, i + 12);
        reset();
        return 16;
    }

    public Poly1305(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this.CoroutineDebuggingKt = new byte[1];
        this.Camera2StreamConfigurationMap = new byte[16];
        this.getHighSpeedVideoFpsRangesFor = 0;
        if (blockCipher.getBlockSize() != 16) {
            throw new java.lang.IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = blockCipher;
    }

    public Poly1305() {
        this.CoroutineDebuggingKt = new byte[1];
        this.Camera2StreamConfigurationMap = new byte[16];
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }
}
