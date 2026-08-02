package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class Blake3Digest implements org.bouncycastle.crypto.ExtendedDigest, org.bouncycastle.util.Memoable, org.bouncycastle.crypto.Xof {
    private long getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private long getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private final byte[] getInputSizeshNQ4ISI;
    private final int[] getOutputFormats;
    private int getOutputMinFrameDuration;
    private final int[] getOutputMinFrameDurationlomOqCM;
    private final byte[] getOutputSizes;
    private int getOutputSizeshNQ4ISI;
    private int getOutputStallDuration;
    private final int[] getOutputStallDurationlomOqCM;
    private final java.util.Stack getValidOutputFormatsForInputhNQ4ISI;
    private int isOutputSupportedFor;
    private final int[] toString;
    private int unwrapAs;
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = {2, 6, 3, 10, 7, 0, 4, 13, 1, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 5, 9, 14, com.google.common.base.Ascii.SI, 8};
    private static final byte[] Camera2StreamConfigurationMap = {16, com.google.common.base.Ascii.FF, 8, 7};
    private static final int[] getHighSpeedVideoFpsRanges = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        byte b = 0;
        while (true) {
            byte[] bArr = this.getOutputSizes;
            if (b >= bArr.length) {
                break;
            }
            bArr[b] = b;
            b = (byte) (b + 1);
        }
        int i = 0;
        while (true) {
            Camera2StreamConfigurationMap(0, 0, 4, 8, 12);
            Camera2StreamConfigurationMap(1, 1, 5, 9, 13);
            Camera2StreamConfigurationMap(2, 2, 6, 10, 14);
            Camera2StreamConfigurationMap(3, 3, 7, 11, 15);
            Camera2StreamConfigurationMap(4, 0, 5, 10, 15);
            Camera2StreamConfigurationMap(5, 1, 6, 11, 12);
            Camera2StreamConfigurationMap(6, 2, 7, 8, 13);
            Camera2StreamConfigurationMap(7, 3, 4, 9, 14);
            if (i >= 6) {
                break;
            }
            byte b2 = 0;
            while (true) {
                byte[] bArr2 = this.getOutputSizes;
                if (b2 < bArr2.length) {
                    bArr2[b2] = getHighResolutionOutputSizeshNQ4ISI[bArr2[b2]];
                    b2 = (byte) (b2 + 1);
                }
            }
            i++;
        }
        if (!this.getHighSpeedVideoSizes) {
            for (int i2 = 0; i2 < 8; i2++) {
                int[] iArr = this.getOutputFormats;
                int[] iArr2 = this.toString;
                iArr[i2] = iArr2[i2 + 8] ^ iArr2[i2];
            }
            return;
        }
        for (int i3 = 0; i3 < 8; i3++) {
            int[] iArr3 = this.toString;
            int i4 = i3 + 8;
            iArr3[i3] = iArr3[i3] ^ iArr3[i4];
            iArr3[i4] = iArr3[i4] ^ this.getOutputFormats[i3];
        }
        for (int i5 = 0; i5 < 16; i5++) {
            org.bouncycastle.util.Pack.intToLittleEndian(this.toString[i5], this.getInputSizeshNQ4ISI, i5 * 4);
        }
        this.unwrapAs = 0;
    }

    private void Camera2StreamConfigurationMap(byte[] bArr, int i) {
        getHighSpeedVideoFpsRangesFor(64, false);
        for (int i2 = 0; i2 < 16; i2++) {
            this.getOutputStallDurationlomOqCM[i2] = org.bouncycastle.util.Pack.littleEndianToInt(bArr, (i2 * 4) + i);
        }
        getHighResolutionOutputSizeshNQ4ISI();
        if (this.getOutputMinFrameDuration == 0) {
            for (long j = this.getHighSpeedVideoSizesFor; j > 0 && (j & 1) != 1; j >>= 1) {
                java.lang.System.arraycopy((int[]) this.getValidOutputFormatsForInputhNQ4ISI.pop(), 0, this.getOutputStallDurationlomOqCM, 0, 8);
                java.lang.System.arraycopy(this.getOutputFormats, 0, this.getOutputStallDurationlomOqCM, 8, 8);
                getHighSpeedVideoFpsRangesFor();
                getHighResolutionOutputSizeshNQ4ISI();
            }
            this.getValidOutputFormatsForInputhNQ4ISI.push(org.bouncycastle.util.Arrays.copyOf(this.getOutputFormats, 8));
        }
    }

    private void getHighSpeedVideoFpsRangesFor(int i, boolean z) {
        java.lang.System.arraycopy(this.getOutputMinFrameDuration == 0 ? this.getOutputMinFrameDurationlomOqCM : this.getOutputFormats, 0, this.toString, 0, 8);
        java.lang.System.arraycopy(getHighSpeedVideoFpsRanges, 0, this.toString, 8, 4);
        int[] iArr = this.toString;
        long j = this.getHighSpeedVideoSizesFor;
        iArr[12] = (int) j;
        iArr[13] = (int) (j >> 32);
        iArr[14] = i;
        int i2 = this.getOutputSizeshNQ4ISI;
        int i3 = this.getOutputMinFrameDuration;
        int i4 = i2 + (i3 == 0 ? 1 : 0) + (z ? 2 : 0);
        iArr[15] = i4;
        int i5 = i3 + i;
        this.getOutputMinFrameDuration = i5;
        if (i5 >= 1024) {
            this.getHighSpeedVideoSizesFor = j + 1;
            this.getOutputMinFrameDuration = 0;
            iArr[15] = i4 | 2;
        }
        if (z && this.getValidOutputFormatsForInputhNQ4ISI.isEmpty()) {
            getHighSpeedVideoFpsRanges();
        }
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i, int i2) {
        int i3;
        if (!this.getHighSpeedVideoSizes) {
            getHighSpeedVideoFpsRangesFor(this.unwrapAs, true);
            byte[] bArr2 = this.getInputSizeshNQ4ISI;
            for (int i4 = 0; i4 < 16; i4++) {
                this.getOutputStallDurationlomOqCM[i4] = org.bouncycastle.util.Pack.littleEndianToInt(bArr2, i4 * 4);
            }
            getHighResolutionOutputSizeshNQ4ISI();
            while (!this.getValidOutputFormatsForInputhNQ4ISI.isEmpty()) {
                java.lang.System.arraycopy((int[]) this.getValidOutputFormatsForInputhNQ4ISI.pop(), 0, this.getOutputStallDurationlomOqCM, 0, 8);
                java.lang.System.arraycopy(this.getOutputFormats, 0, this.getOutputStallDurationlomOqCM, 8, 8);
                getHighSpeedVideoFpsRangesFor();
                if (this.getValidOutputFormatsForInputhNQ4ISI.isEmpty()) {
                    getHighSpeedVideoFpsRanges();
                }
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }
        if (i2 >= 0) {
            long j = this.getHighSpeedVideoFpsRangesFor;
            if (j < 0 || i2 <= j) {
                int i5 = this.unwrapAs;
                if (i5 < 64) {
                    int min = java.lang.Math.min(i2, 64 - i5);
                    java.lang.System.arraycopy(this.getInputSizeshNQ4ISI, this.unwrapAs, bArr, i, min);
                    this.unwrapAs += min;
                    i += min;
                    i3 = i2 - min;
                } else {
                    i3 = i2;
                }
                while (i3 > 0) {
                    this.getHighSpeedVideoSizesFor++;
                    java.lang.System.arraycopy(this.getOutputFormats, 0, this.toString, 0, 8);
                    java.lang.System.arraycopy(getHighSpeedVideoFpsRanges, 0, this.toString, 8, 4);
                    int[] iArr = this.toString;
                    long j2 = this.getHighSpeedVideoSizesFor;
                    iArr[12] = (int) j2;
                    iArr[13] = (int) (j2 >> 32);
                    iArr[14] = this.getOutputStallDuration;
                    iArr[15] = this.isOutputSupportedFor;
                    getHighResolutionOutputSizeshNQ4ISI();
                    int min2 = java.lang.Math.min(i3, 64);
                    java.lang.System.arraycopy(this.getInputSizeshNQ4ISI, 0, bArr, i, min2);
                    this.unwrapAs += min2;
                    i += min2;
                    i3 -= min2;
                }
                this.getHighSpeedVideoFpsRangesFor -= i2;
                return i2;
            }
        }
        throw new java.lang.IllegalArgumentException("Insufficient bytes remaining");
    }

    public void init(org.bouncycastle.crypto.params.Blake3Parameters blake3Parameters) {
        byte[] key = blake3Parameters == null ? null : blake3Parameters.getKey();
        byte[] context = blake3Parameters != null ? blake3Parameters.getContext() : null;
        reset();
        if (key != null) {
            for (int i = 0; i < 8; i++) {
                this.getOutputMinFrameDurationlomOqCM[i] = org.bouncycastle.util.Pack.littleEndianToInt(key, i * 4);
            }
            this.getOutputSizeshNQ4ISI = 16;
            org.bouncycastle.util.Arrays.fill(key, (byte) 0);
            return;
        }
        java.lang.System.arraycopy(getHighSpeedVideoFpsRanges, 0, this.getOutputMinFrameDurationlomOqCM, 0, 8);
        if (context == null) {
            this.getOutputSizeshNQ4ISI = 0;
            return;
        }
        this.getOutputSizeshNQ4ISI = 32;
        update(context, 0, context.length);
        doFinal(this.getInputSizeshNQ4ISI, 0);
        java.lang.System.arraycopy(this.toString, 0, this.getOutputMinFrameDurationlomOqCM, 0, 8);
        this.getOutputSizeshNQ4ISI = 64;
        reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.getHighSpeedVideoSizesFor = 0L;
        this.getOutputMinFrameDuration = 0;
        this.unwrapAs = 0;
        this.getHighSpeedVideoSizes = false;
        org.bouncycastle.util.Arrays.fill(this.getInputSizeshNQ4ISI, (byte) 0);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        if (bArr == null || i2 == 0) {
            return;
        }
        if (this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalStateException("Already outputting");
        }
        int i5 = this.unwrapAs;
        if (i5 != 0) {
            i3 = 64 - i5;
            if (i3 >= i2) {
                java.lang.System.arraycopy(bArr, i, this.getInputSizeshNQ4ISI, i5, i2);
                i4 = this.unwrapAs + i2;
                this.unwrapAs = i4;
            } else {
                java.lang.System.arraycopy(bArr, i, this.getInputSizeshNQ4ISI, i5, i3);
                Camera2StreamConfigurationMap(this.getInputSizeshNQ4ISI, 0);
                this.unwrapAs = 0;
                org.bouncycastle.util.Arrays.fill(this.getInputSizeshNQ4ISI, (byte) 0);
            }
        } else {
            i3 = 0;
        }
        int i6 = i3 + i;
        while (i6 < (i + i2) - 64) {
            Camera2StreamConfigurationMap(bArr, i6);
            i6 += 64;
        }
        int i7 = i + (i2 - i6);
        java.lang.System.arraycopy(bArr, i6, this.getInputSizeshNQ4ISI, 0, i7);
        i4 = this.unwrapAs + i7;
        this.unwrapAs = i4;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        if (this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalStateException("Already outputting");
        }
        byte[] bArr = this.getInputSizeshNQ4ISI;
        if (bArr.length - this.unwrapAs == 0) {
            Camera2StreamConfigurationMap(bArr, 0);
            org.bouncycastle.util.Arrays.fill(this.getInputSizeshNQ4ISI, (byte) 0);
            this.unwrapAs = 0;
        }
        byte[] bArr2 = this.getInputSizeshNQ4ISI;
        int i = this.unwrapAs;
        bArr2[i] = b;
        this.unwrapAs = i + 1;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        org.bouncycastle.crypto.digests.Blake3Digest blake3Digest = (org.bouncycastle.crypto.digests.Blake3Digest) memoable;
        this.getHighSpeedVideoSizesFor = blake3Digest.getHighSpeedVideoSizesFor;
        this.getOutputMinFrameDuration = blake3Digest.getOutputMinFrameDuration;
        this.getOutputSizeshNQ4ISI = blake3Digest.getOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = blake3Digest.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = blake3Digest.getHighSpeedVideoFpsRangesFor;
        this.isOutputSupportedFor = blake3Digest.isOutputSupportedFor;
        this.getOutputStallDuration = blake3Digest.getOutputStallDuration;
        int[] iArr = blake3Digest.getOutputFormats;
        int[] iArr2 = this.getOutputFormats;
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = blake3Digest.getOutputMinFrameDurationlomOqCM;
        int[] iArr4 = this.getOutputMinFrameDurationlomOqCM;
        java.lang.System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        int[] iArr5 = blake3Digest.getOutputStallDurationlomOqCM;
        int[] iArr6 = this.getOutputStallDurationlomOqCM;
        java.lang.System.arraycopy(iArr5, 0, iArr6, 0, iArr6.length);
        this.getValidOutputFormatsForInputhNQ4ISI.clear();
        java.util.Iterator it = blake3Digest.getValidOutputFormatsForInputhNQ4ISI.iterator();
        while (it.hasNext()) {
            this.getValidOutputFormatsForInputhNQ4ISI.push(org.bouncycastle.util.Arrays.clone((int[]) it.next()));
        }
        byte[] bArr = blake3Digest.getInputSizeshNQ4ISI;
        byte[] bArr2 = this.getInputSizeshNQ4ISI;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.unwrapAs = blake3Digest.unwrapAs;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.getInputFormats;
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "BLAKE3";
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i, int i2) {
        if (this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalStateException("Already outputting");
        }
        int doOutput = doOutput(bArr, i, i2);
        reset();
        return doOutput;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        return doFinal(bArr, i, getDigestSize());
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.Blake3Digest(this);
    }

    private void getHighSpeedVideoFpsRanges() {
        int[] iArr = this.toString;
        int i = iArr[15] | 8;
        iArr[15] = i;
        this.isOutputSupportedFor = i;
        this.getOutputStallDuration = iArr[14];
        this.getHighSpeedVideoSizesFor = 0L;
        this.getHighSpeedVideoSizes = true;
        this.getHighSpeedVideoFpsRangesFor = -1L;
        java.lang.System.arraycopy(iArr, 0, this.getOutputFormats, 0, 8);
    }

    private void Camera2StreamConfigurationMap(int i, int i2, int i3, int i4, int i5) {
        int i6 = i << 1;
        int[] iArr = this.toString;
        int i7 = iArr[i2] + iArr[i3] + this.getOutputStallDurationlomOqCM[this.getOutputSizes[i6]];
        iArr[i2] = i7;
        int i8 = iArr[i5];
        byte[] bArr = Camera2StreamConfigurationMap;
        iArr[i5] = org.bouncycastle.util.Integers.rotateRight(i7 ^ i8, bArr[0]);
        int[] iArr2 = this.toString;
        int i9 = iArr2[i4] + iArr2[i5];
        iArr2[i4] = i9;
        iArr2[i3] = org.bouncycastle.util.Integers.rotateRight(i9 ^ iArr2[i3], bArr[1]);
        int[] iArr3 = this.toString;
        int i10 = iArr3[i2] + iArr3[i3] + this.getOutputStallDurationlomOqCM[this.getOutputSizes[i6 + 1]];
        iArr3[i2] = i10;
        iArr3[i5] = org.bouncycastle.util.Integers.rotateRight(iArr3[i5] ^ i10, bArr[2]);
        int[] iArr4 = this.toString;
        int i11 = iArr4[i4] + iArr4[i5];
        iArr4[i4] = i11;
        iArr4[i3] = org.bouncycastle.util.Integers.rotateRight(i11 ^ iArr4[i3], bArr[3]);
    }

    private void getHighSpeedVideoFpsRangesFor() {
        java.lang.System.arraycopy(this.getOutputMinFrameDurationlomOqCM, 0, this.toString, 0, 8);
        java.lang.System.arraycopy(getHighSpeedVideoFpsRanges, 0, this.toString, 8, 4);
        int[] iArr = this.toString;
        iArr[12] = 0;
        iArr[13] = 0;
        iArr[14] = 64;
        iArr[15] = this.getOutputSizeshNQ4ISI | 4;
    }

    private Blake3Digest(org.bouncycastle.crypto.digests.Blake3Digest blake3Digest) {
        this.getInputSizeshNQ4ISI = new byte[64];
        this.getOutputMinFrameDurationlomOqCM = new int[8];
        this.getOutputFormats = new int[8];
        this.toString = new int[16];
        this.getOutputStallDurationlomOqCM = new int[16];
        this.getOutputSizes = new byte[16];
        this.getValidOutputFormatsForInputhNQ4ISI = new java.util.Stack();
        this.getInputFormats = blake3Digest.getInputFormats;
        reset(blake3Digest);
    }

    public Blake3Digest(int i) {
        this.getInputSizeshNQ4ISI = new byte[64];
        this.getOutputMinFrameDurationlomOqCM = new int[8];
        this.getOutputFormats = new int[8];
        this.toString = new int[16];
        this.getOutputStallDurationlomOqCM = new int[16];
        this.getOutputSizes = new byte[16];
        this.getValidOutputFormatsForInputhNQ4ISI = new java.util.Stack();
        this.getInputFormats = i;
        init(null);
    }

    public Blake3Digest() {
        this(32);
    }
}
