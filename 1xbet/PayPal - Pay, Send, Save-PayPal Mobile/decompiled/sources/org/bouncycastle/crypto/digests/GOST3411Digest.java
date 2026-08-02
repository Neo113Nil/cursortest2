package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class GOST3411Digest implements org.bouncycastle.crypto.ExtendedDigest, org.bouncycastle.util.Memoable {
    private static final byte[] getOutputFormats = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    byte[] Camera2StreamConfigurationMap;
    byte[] getHighResolutionOutputSizeshNQ4ISI;
    byte[] getHighSpeedVideoFpsRanges;
    byte[] getHighSpeedVideoFpsRangesFor;
    byte[] getHighSpeedVideoSizes;
    short[] getHighSpeedVideoSizesFor;
    private byte[][] getInputFormats;
    short[] getInputSizeshNQ4ISI;
    private byte[] getOutputMinFrameDuration;
    private byte[] getOutputMinFrameDurationlomOqCM;
    private byte[] getOutputSizes;
    private byte[] getOutputSizeshNQ4ISI;
    private long getOutputStallDuration;
    private byte[] getOutputStallDurationlomOqCM;
    private byte[] getValidOutputFormatsForInputhNQ4ISI;
    private org.bouncycastle.crypto.BlockCipher isOutputSupportedFor;
    private byte[] isOutputSupportedForhNQ4ISI;
    private int unwrapAs;

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    private void getHighSpeedVideoSizes(byte[] bArr) {
        short[] sArr = this.getInputSizeshNQ4ISI;
        for (int i = 0; i < bArr.length / 2; i++) {
            int i2 = i * 2;
            sArr[i] = (short) ((bArr[i2] & 255) | ((bArr[i2 + 1] << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK));
        }
        short[] sArr2 = this.getHighSpeedVideoSizesFor;
        short[] sArr3 = this.getInputSizeshNQ4ISI;
        sArr2[15] = (short) (((((sArr3[0] ^ sArr3[1]) ^ sArr3[2]) ^ sArr3[3]) ^ sArr3[12]) ^ sArr3[15]);
        java.lang.System.arraycopy(sArr3, 1, sArr2, 0, 15);
        short[] sArr4 = this.getHighSpeedVideoSizesFor;
        for (int i3 = 0; i3 < bArr.length / 2; i3++) {
            int i4 = i3 * 2;
            short s = sArr4[i3];
            bArr[i4 + 1] = (byte) (s >> 8);
            bArr[i4] = (byte) s;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        org.bouncycastle.util.Pack.longToLittleEndian(this.getOutputStallDuration * 8, this.getOutputMinFrameDurationlomOqCM, 0);
        while (this.unwrapAs != 0) {
            update((byte) 0);
        }
        processBlock(this.getOutputMinFrameDurationlomOqCM, 0);
        processBlock(this.getOutputSizeshNQ4ISI, 0);
        byte[] bArr2 = this.getOutputMinFrameDuration;
        java.lang.System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        while (this.unwrapAs != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (true) {
            byte[] bArr2 = this.isOutputSupportedForhNQ4ISI;
            if (i2 <= bArr2.length) {
                break;
            }
            java.lang.System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
            getHighSpeedVideoFpsRangesFor(this.isOutputSupportedForhNQ4ISI);
            processBlock(this.isOutputSupportedForhNQ4ISI, 0);
            byte[] bArr3 = this.isOutputSupportedForhNQ4ISI;
            i += bArr3.length;
            i2 -= bArr3.length;
            this.getOutputStallDuration += bArr3.length;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        byte[] bArr = this.isOutputSupportedForhNQ4ISI;
        int i = this.unwrapAs;
        int i2 = i + 1;
        this.unwrapAs = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            getHighSpeedVideoFpsRangesFor(bArr);
            processBlock(this.isOutputSupportedForhNQ4ISI, 0);
            this.unwrapAs = 0;
        }
        this.getOutputStallDuration++;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        org.bouncycastle.crypto.digests.GOST3411Digest gOST3411Digest = (org.bouncycastle.crypto.digests.GOST3411Digest) memoable;
        byte[] bArr = gOST3411Digest.getValidOutputFormatsForInputhNQ4ISI;
        this.getValidOutputFormatsForInputhNQ4ISI = bArr;
        this.isOutputSupportedFor.init(true, new org.bouncycastle.crypto.params.ParametersWithSBox(null, bArr));
        reset();
        byte[] bArr2 = gOST3411Digest.getOutputMinFrameDuration;
        java.lang.System.arraycopy(bArr2, 0, this.getOutputMinFrameDuration, 0, bArr2.length);
        byte[] bArr3 = gOST3411Digest.getOutputMinFrameDurationlomOqCM;
        java.lang.System.arraycopy(bArr3, 0, this.getOutputMinFrameDurationlomOqCM, 0, bArr3.length);
        byte[] bArr4 = gOST3411Digest.getOutputSizes;
        java.lang.System.arraycopy(bArr4, 0, this.getOutputSizes, 0, bArr4.length);
        byte[] bArr5 = gOST3411Digest.getOutputSizeshNQ4ISI;
        java.lang.System.arraycopy(bArr5, 0, this.getOutputSizeshNQ4ISI, 0, bArr5.length);
        byte[] bArr6 = gOST3411Digest.getInputFormats[1];
        java.lang.System.arraycopy(bArr6, 0, this.getInputFormats[1], 0, bArr6.length);
        byte[] bArr7 = gOST3411Digest.getInputFormats[2];
        java.lang.System.arraycopy(bArr7, 0, this.getInputFormats[2], 0, bArr7.length);
        byte[] bArr8 = gOST3411Digest.getInputFormats[3];
        java.lang.System.arraycopy(bArr8, 0, this.getInputFormats[3], 0, bArr8.length);
        byte[] bArr9 = gOST3411Digest.isOutputSupportedForhNQ4ISI;
        java.lang.System.arraycopy(bArr9, 0, this.isOutputSupportedForhNQ4ISI, 0, bArr9.length);
        this.unwrapAs = gOST3411Digest.unwrapAs;
        this.getOutputStallDuration = gOST3411Digest.getOutputStallDuration;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.getOutputStallDuration = 0L;
        this.unwrapAs = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.getOutputMinFrameDuration;
            if (i >= bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.getOutputMinFrameDurationlomOqCM;
            if (i2 >= bArr2.length) {
                break;
            }
            bArr2[i2] = 0;
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.getOutputSizes;
            if (i3 >= bArr3.length) {
                break;
            }
            bArr3[i3] = 0;
            i3++;
        }
        int i4 = 0;
        while (true) {
            byte[] bArr4 = this.getInputFormats[1];
            if (i4 >= bArr4.length) {
                break;
            }
            bArr4[i4] = 0;
            i4++;
        }
        int i5 = 0;
        while (true) {
            byte[] bArr5 = this.getInputFormats[3];
            if (i5 >= bArr5.length) {
                break;
            }
            bArr5[i5] = 0;
            i5++;
        }
        int i6 = 0;
        while (true) {
            byte[] bArr6 = this.getOutputSizeshNQ4ISI;
            if (i6 >= bArr6.length) {
                break;
            }
            bArr6[i6] = 0;
            i6++;
        }
        int i7 = 0;
        while (true) {
            byte[] bArr7 = this.isOutputSupportedForhNQ4ISI;
            if (i7 >= bArr7.length) {
                byte[] bArr8 = getOutputFormats;
                java.lang.System.arraycopy(bArr8, 0, this.getInputFormats[2], 0, bArr8.length);
                return;
            } else {
                bArr7[i7] = 0;
                i7++;
            }
        }
    }

    protected void processBlock(byte[] bArr, int i) {
        java.lang.System.arraycopy(bArr, i, this.getOutputSizes, 0, 32);
        java.lang.System.arraycopy(this.getOutputMinFrameDuration, 0, this.getHighSpeedVideoFpsRanges, 0, 32);
        java.lang.System.arraycopy(this.getOutputSizes, 0, this.Camera2StreamConfigurationMap, 0, 32);
        for (int i2 = 0; i2 < 32; i2++) {
            this.getHighSpeedVideoSizes[i2] = (byte) (this.getHighSpeedVideoFpsRanges[i2] ^ this.Camera2StreamConfigurationMap[i2]);
        }
        Camera2StreamConfigurationMap(getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes), this.getHighSpeedVideoFpsRangesFor, 0, this.getOutputMinFrameDuration, 0);
        for (int i3 = 1; i3 < 4; i3++) {
            byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges);
            for (int i4 = 0; i4 < 32; i4++) {
                this.getHighSpeedVideoFpsRanges[i4] = (byte) (highResolutionOutputSizeshNQ4ISI[i4] ^ this.getInputFormats[i3][i4]);
            }
            this.Camera2StreamConfigurationMap = getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap));
            for (int i5 = 0; i5 < 32; i5++) {
                this.getHighSpeedVideoSizes[i5] = (byte) (this.getHighSpeedVideoFpsRanges[i5] ^ this.Camera2StreamConfigurationMap[i5]);
            }
            int i6 = i3 * 8;
            Camera2StreamConfigurationMap(getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes), this.getHighSpeedVideoFpsRangesFor, i6, this.getOutputMinFrameDuration, i6);
        }
        for (int i7 = 0; i7 < 12; i7++) {
            getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor);
        }
        for (int i8 = 0; i8 < 32; i8++) {
            byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
            bArr2[i8] = (byte) (bArr2[i8] ^ this.getOutputSizes[i8]);
        }
        getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor);
        for (int i9 = 0; i9 < 32; i9++) {
            byte[] bArr3 = this.getHighSpeedVideoFpsRangesFor;
            bArr3[i9] = (byte) (this.getOutputMinFrameDuration[i9] ^ bArr3[i9]);
        }
        for (int i10 = 0; i10 < 61; i10++) {
            getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor);
        }
        byte[] bArr4 = this.getHighSpeedVideoFpsRangesFor;
        byte[] bArr5 = this.getOutputMinFrameDuration;
        java.lang.System.arraycopy(bArr4, 0, bArr5, 0, bArr5.length);
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "GOST3411";
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.GOST3411Digest(this);
    }

    private void getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.getOutputSizeshNQ4ISI;
            if (i == bArr2.length) {
                return;
            }
            int i3 = (bArr2[i] & 255) + (bArr[i] & 255) + i2;
            bArr2[i] = (byte) i3;
            i2 = i3 >>> 8;
            i++;
        }
    }

    private byte[] getHighSpeedVideoFpsRanges(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            byte[] bArr2 = this.getOutputStallDurationlomOqCM;
            int i2 = i * 4;
            bArr2[i2] = bArr[i];
            bArr2[i2 + 1] = bArr[i + 8];
            bArr2[i2 + 2] = bArr[i + 16];
            bArr2[i2 + 3] = bArr[i + 24];
        }
        return this.getOutputStallDurationlomOqCM;
    }

    private void Camera2StreamConfigurationMap(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2) {
        this.isOutputSupportedFor.init(true, new org.bouncycastle.crypto.params.KeyParameter(bArr));
        this.isOutputSupportedFor.processBlock(bArr3, i2, bArr2, i);
    }

    private byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            this.getHighResolutionOutputSizeshNQ4ISI[i] = (byte) (bArr[i] ^ bArr[i + 8]);
        }
        java.lang.System.arraycopy(bArr, 8, bArr, 0, 24);
        java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr, 24, 8);
        return bArr;
    }

    public GOST3411Digest(byte[] bArr) {
        this.getOutputMinFrameDuration = new byte[32];
        this.getOutputMinFrameDurationlomOqCM = new byte[32];
        this.getOutputSizes = new byte[32];
        this.getOutputSizeshNQ4ISI = new byte[32];
        this.getInputFormats = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, 4, 32);
        this.isOutputSupportedForhNQ4ISI = new byte[32];
        this.isOutputSupportedFor = new org.bouncycastle.crypto.engines.GOST28147Engine();
        this.getOutputStallDurationlomOqCM = new byte[32];
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[8];
        this.getInputSizeshNQ4ISI = new short[16];
        this.getHighSpeedVideoSizesFor = new short[16];
        this.getHighSpeedVideoFpsRangesFor = new byte[32];
        this.getHighSpeedVideoFpsRanges = new byte[32];
        this.Camera2StreamConfigurationMap = new byte[32];
        this.getHighSpeedVideoSizes = new byte[32];
        byte[] clone = org.bouncycastle.util.Arrays.clone(bArr);
        this.getValidOutputFormatsForInputhNQ4ISI = clone;
        this.isOutputSupportedFor.init(true, new org.bouncycastle.crypto.params.ParametersWithSBox(null, clone));
        reset();
    }

    public GOST3411Digest(org.bouncycastle.crypto.digests.GOST3411Digest gOST3411Digest) {
        this.getOutputMinFrameDuration = new byte[32];
        this.getOutputMinFrameDurationlomOqCM = new byte[32];
        this.getOutputSizes = new byte[32];
        this.getOutputSizeshNQ4ISI = new byte[32];
        this.getInputFormats = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, 4, 32);
        this.isOutputSupportedForhNQ4ISI = new byte[32];
        this.isOutputSupportedFor = new org.bouncycastle.crypto.engines.GOST28147Engine();
        this.getOutputStallDurationlomOqCM = new byte[32];
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[8];
        this.getInputSizeshNQ4ISI = new short[16];
        this.getHighSpeedVideoSizesFor = new short[16];
        this.getHighSpeedVideoFpsRangesFor = new byte[32];
        this.getHighSpeedVideoFpsRanges = new byte[32];
        this.Camera2StreamConfigurationMap = new byte[32];
        this.getHighSpeedVideoSizes = new byte[32];
        reset(gOST3411Digest);
    }

    public GOST3411Digest() {
        this.getOutputMinFrameDuration = new byte[32];
        this.getOutputMinFrameDurationlomOqCM = new byte[32];
        this.getOutputSizes = new byte[32];
        this.getOutputSizeshNQ4ISI = new byte[32];
        this.getInputFormats = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, 4, 32);
        this.isOutputSupportedForhNQ4ISI = new byte[32];
        this.isOutputSupportedFor = new org.bouncycastle.crypto.engines.GOST28147Engine();
        this.getOutputStallDurationlomOqCM = new byte[32];
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[8];
        this.getInputSizeshNQ4ISI = new short[16];
        this.getHighSpeedVideoSizesFor = new short[16];
        this.getHighSpeedVideoFpsRangesFor = new byte[32];
        this.getHighSpeedVideoFpsRanges = new byte[32];
        this.Camera2StreamConfigurationMap = new byte[32];
        this.getHighSpeedVideoSizes = new byte[32];
        byte[] sBox = org.bouncycastle.crypto.engines.GOST28147Engine.getSBox("D-A");
        this.getValidOutputFormatsForInputhNQ4ISI = sBox;
        this.isOutputSupportedFor.init(true, new org.bouncycastle.crypto.params.ParametersWithSBox(null, sBox));
        reset();
    }
}
