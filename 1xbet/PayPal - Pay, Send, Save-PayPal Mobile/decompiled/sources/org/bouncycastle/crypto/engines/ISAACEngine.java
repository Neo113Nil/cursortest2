package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class ISAACEngine implements org.bouncycastle.crypto.StreamCipher {
    private final int getInputFormats = 8;
    private final int getHighSpeedVideoSizesFor = 256;
    private int[] getHighSpeedVideoSizes = null;
    private int[] getOutputMinFrameDuration = null;
    private int getHighSpeedVideoFpsRangesFor = 0;
    private int Camera2StreamConfigurationMap = 0;
    private int getHighResolutionOutputSizeshNQ4ISI = 0;
    private int getHighSpeedVideoFpsRanges = 0;
    private byte[] getOutputFormats = new byte[1024];
    private byte[] getOutputMinFrameDurationlomOqCM = null;
    private boolean getInputSizeshNQ4ISI = false;

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        if (this.getHighSpeedVideoFpsRanges == 0) {
            getHighResolutionOutputSizeshNQ4ISI();
            this.getOutputFormats = org.bouncycastle.util.Pack.intToBigEndian(this.getOutputMinFrameDuration);
        }
        byte[] bArr = this.getOutputFormats;
        int i = this.getHighSpeedVideoFpsRanges;
        byte b2 = (byte) (b ^ bArr[i]);
        this.getHighSpeedVideoFpsRanges = (i + 1) & 1023;
        return b2;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        getHighSpeedVideoSizes(this.getOutputMinFrameDurationlomOqCM);
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
        for (int i4 = 0; i4 < i2; i4++) {
            if (this.getHighSpeedVideoFpsRanges == 0) {
                getHighResolutionOutputSizeshNQ4ISI();
                this.getOutputFormats = org.bouncycastle.util.Pack.intToBigEndian(this.getOutputMinFrameDuration);
            }
            byte[] bArr3 = this.getOutputFormats;
            int i5 = this.getHighSpeedVideoFpsRanges;
            bArr2[i4 + i3] = (byte) (bArr3[i5] ^ bArr[i4 + i]);
            this.getHighSpeedVideoFpsRanges = (i5 + 1) & 1023;
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter) {
            getHighSpeedVideoSizes(((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey());
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to ISAAC init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public java.lang.String getAlgorithmName() {
        return "ISAAC";
    }

    private void getHighSpeedVideoSizes(byte[] bArr) {
        this.getOutputMinFrameDurationlomOqCM = bArr;
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = new int[256];
        }
        if (this.getOutputMinFrameDuration == null) {
            this.getOutputMinFrameDuration = new int[256];
        }
        for (int i = 0; i < 256; i++) {
            int[] iArr = this.getHighSpeedVideoSizes;
            this.getOutputMinFrameDuration[i] = 0;
            iArr[i] = 0;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getHighSpeedVideoFpsRanges = 0;
        int length = bArr.length + (bArr.length & 3);
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i2 = 0; i2 < length; i2 += 4) {
            this.getOutputMinFrameDuration[i2 >>> 2] = org.bouncycastle.util.Pack.littleEndianToInt(bArr2, i2);
        }
        int[] iArr2 = new int[8];
        for (int i3 = 0; i3 < 8; i3++) {
            iArr2[i3] = -1640531527;
        }
        for (int i4 = 0; i4 < 4; i4++) {
            getHighSpeedVideoFpsRanges(iArr2);
        }
        int i5 = 0;
        while (i5 < 2) {
            for (int i6 = 0; i6 < 256; i6 += 8) {
                for (int i7 = 0; i7 < 8; i7++) {
                    iArr2[i7] = iArr2[i7] + (i5 <= 0 ? this.getOutputMinFrameDuration[i6 + i7] : this.getHighSpeedVideoSizes[i6 + i7]);
                }
                getHighSpeedVideoFpsRanges(iArr2);
                for (int i8 = 0; i8 < 8; i8++) {
                    this.getHighSpeedVideoSizes[i6 + i8] = iArr2[i8];
                }
            }
            i5++;
        }
        getHighResolutionOutputSizeshNQ4ISI();
        this.getInputSizeshNQ4ISI = true;
    }

    private static void getHighSpeedVideoFpsRanges(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = i ^ (i2 << 11);
        iArr[0] = i3;
        int i4 = iArr[3] + i3;
        iArr[3] = i4;
        int i5 = iArr[2];
        int i6 = i2 + i5;
        iArr[1] = i6;
        int i7 = i6 ^ (i5 >>> 2);
        iArr[1] = i7;
        int i8 = iArr[4] + i7;
        iArr[4] = i8;
        int i9 = i5 + i4;
        iArr[2] = i9;
        int i10 = i9 ^ (i4 << 8);
        iArr[2] = i10;
        int i11 = iArr[5] + i10;
        iArr[5] = i11;
        int i12 = i4 + i8;
        iArr[3] = i12;
        int i13 = i12 ^ (i8 >>> 16);
        iArr[3] = i13;
        int i14 = iArr[6] + i13;
        iArr[6] = i14;
        int i15 = i8 + i11;
        iArr[4] = i15;
        int i16 = (i11 << 10) ^ i15;
        iArr[4] = i16;
        int i17 = iArr[7] + i16;
        iArr[7] = i17;
        int i18 = i11 + i14;
        iArr[5] = i18;
        int i19 = (i14 >>> 4) ^ i18;
        iArr[5] = i19;
        int i20 = i3 + i19;
        iArr[0] = i20;
        int i21 = i14 + i17;
        iArr[6] = i21;
        int i22 = (i17 << 8) ^ i21;
        iArr[6] = i22;
        int i23 = i7 + i22;
        iArr[1] = i23;
        int i24 = i17 + i20;
        iArr[7] = i24;
        int i25 = (i20 >>> 9) ^ i24;
        iArr[7] = i25;
        iArr[2] = i10 + i25;
        iArr[0] = i20 + i23;
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        int i;
        int i2;
        int i3 = this.Camera2StreamConfigurationMap;
        int i4 = this.getHighResolutionOutputSizeshNQ4ISI + 1;
        this.getHighResolutionOutputSizeshNQ4ISI = i4;
        this.Camera2StreamConfigurationMap = i3 + i4;
        for (int i5 = 0; i5 < 256; i5++) {
            int[] iArr = this.getHighSpeedVideoSizes;
            int i6 = iArr[i5];
            int i7 = i5 & 3;
            if (i7 == 0) {
                i = this.getHighSpeedVideoFpsRangesFor;
                i2 = i << 13;
            } else if (i7 == 1) {
                i = this.getHighSpeedVideoFpsRangesFor;
                i2 = i >>> 6;
            } else if (i7 == 2) {
                i = this.getHighSpeedVideoFpsRangesFor;
                i2 = i << 2;
            } else if (i7 == 3) {
                i = this.getHighSpeedVideoFpsRangesFor;
                i2 = i >>> 16;
            } else {
                int i8 = this.getHighSpeedVideoFpsRangesFor + iArr[(i5 + 128) & 255];
                this.getHighSpeedVideoFpsRangesFor = i8;
                int i9 = iArr[(i6 >>> 2) & 255] + i8 + this.Camera2StreamConfigurationMap;
                iArr[i5] = i9;
                int[] iArr2 = this.getOutputMinFrameDuration;
                int i10 = iArr[(i9 >>> 10) & 255] + i6;
                this.Camera2StreamConfigurationMap = i10;
                iArr2[i5] = i10;
            }
            this.getHighSpeedVideoFpsRangesFor = i ^ i2;
            int i82 = this.getHighSpeedVideoFpsRangesFor + iArr[(i5 + 128) & 255];
            this.getHighSpeedVideoFpsRangesFor = i82;
            int i92 = iArr[(i6 >>> 2) & 255] + i82 + this.Camera2StreamConfigurationMap;
            iArr[i5] = i92;
            int[] iArr22 = this.getOutputMinFrameDuration;
            int i102 = iArr[(i92 >>> 10) & 255] + i6;
            this.Camera2StreamConfigurationMap = i102;
            iArr22[i5] = i102;
        }
    }
}
