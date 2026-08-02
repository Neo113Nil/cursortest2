package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class ParallelHash implements org.bouncycastle.crypto.Xof, org.bouncycastle.crypto.Digest {
    private static final byte[] Camera2StreamConfigurationMap = org.bouncycastle.util.Strings.toByteArray("ParallelHash");
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private final byte[] getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private int getInputSizeshNQ4ISI;
    private final org.bouncycastle.crypto.digests.CSHAKEDigest getOutputFormats;
    private final org.bouncycastle.crypto.digests.CSHAKEDigest getOutputMinFrameDuration;
    private final int getOutputStallDuration;

    private void getHighSpeedVideoFpsRangesFor(int i) {
        int i2 = this.getHighSpeedVideoSizes;
        if (i2 != 0) {
            getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI, 0, i2);
            this.getHighSpeedVideoSizes = 0;
        }
        byte[] rightEncode = org.bouncycastle.crypto.digests.XofUtils.rightEncode(this.getInputSizeshNQ4ISI);
        byte[] rightEncode2 = org.bouncycastle.crypto.digests.XofUtils.rightEncode(i * 8);
        this.getOutputFormats.update(rightEncode, 0, rightEncode.length);
        this.getOutputFormats.update(rightEncode2, 0, rightEncode2.length);
        this.getInputFormats = false;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) throws java.lang.IllegalStateException {
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.getHighSpeedVideoSizes;
        int i2 = i + 1;
        this.getHighSpeedVideoSizes = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            getHighResolutionOutputSizeshNQ4ISI(bArr, 0, i2);
            this.getHighSpeedVideoSizes = 0;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        int i3 = 0;
        int max = java.lang.Math.max(0, i2);
        if (this.getHighSpeedVideoSizes != 0) {
            int i4 = 0;
            while (i4 < max) {
                int i5 = this.getHighSpeedVideoSizes;
                byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i5 == bArr2.length) {
                    break;
                }
                this.getHighSpeedVideoSizes = i5 + 1;
                bArr2[i5] = bArr[i4 + i];
                i4++;
            }
            int i6 = this.getHighSpeedVideoSizes;
            byte[] bArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i6 == bArr3.length) {
                getHighResolutionOutputSizeshNQ4ISI(bArr3, 0, i6);
                this.getHighSpeedVideoSizes = 0;
            }
            i3 = i4;
        }
        if (i3 < max) {
            while (true) {
                int i7 = this.getHighSpeedVideoFpsRanges;
                if (max - i3 <= i7) {
                    break;
                }
                getHighResolutionOutputSizeshNQ4ISI(bArr, i + i3, i7);
                i3 += this.getHighSpeedVideoFpsRanges;
            }
        }
        while (i3 < max) {
            update(bArr[i3 + i]);
            i3++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.getOutputFormats.reset();
        org.bouncycastle.util.Arrays.clear(this.getHighResolutionOutputSizeshNQ4ISI);
        byte[] leftEncode = org.bouncycastle.crypto.digests.XofUtils.leftEncode(this.getHighSpeedVideoFpsRanges);
        this.getOutputFormats.update(leftEncode, 0, leftEncode.length);
        this.getInputSizeshNQ4ISI = 0;
        this.getHighSpeedVideoSizes = 0;
        this.getInputFormats = true;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.getOutputStallDuration;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.getOutputFormats.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ParallelHash");
        sb.append(this.getOutputFormats.getAlgorithmName().substring(6));
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i, int i2) {
        if (this.getInputFormats) {
            getHighSpeedVideoFpsRangesFor(0);
        }
        return this.getOutputFormats.doOutput(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i, int i2) {
        if (this.getInputFormats) {
            getHighSpeedVideoFpsRangesFor(this.getOutputStallDuration);
        }
        int doFinal = this.getOutputFormats.doFinal(bArr, i, i2);
        reset();
        return doFinal;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (this.getInputFormats) {
            getHighSpeedVideoFpsRangesFor(this.getOutputStallDuration);
        }
        int doFinal = this.getOutputFormats.doFinal(bArr, i, getDigestSize());
        reset();
        return doFinal;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2) {
        this.getOutputMinFrameDuration.update(bArr, i, i2);
        org.bouncycastle.crypto.digests.CSHAKEDigest cSHAKEDigest = this.getOutputMinFrameDuration;
        byte[] bArr2 = this.getHighSpeedVideoSizesFor;
        cSHAKEDigest.doFinal(bArr2, 0, bArr2.length);
        org.bouncycastle.crypto.digests.CSHAKEDigest cSHAKEDigest2 = this.getOutputFormats;
        byte[] bArr3 = this.getHighSpeedVideoSizesFor;
        cSHAKEDigest2.update(bArr3, 0, bArr3.length);
        this.getInputSizeshNQ4ISI++;
    }

    public ParallelHash(org.bouncycastle.crypto.digests.ParallelHash parallelHash) {
        this.getOutputFormats = new org.bouncycastle.crypto.digests.CSHAKEDigest(parallelHash.getOutputFormats);
        this.getOutputMinFrameDuration = new org.bouncycastle.crypto.digests.CSHAKEDigest(parallelHash.getOutputMinFrameDuration);
        this.getHighSpeedVideoFpsRangesFor = parallelHash.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRanges = parallelHash.getHighSpeedVideoFpsRanges;
        this.getOutputStallDuration = parallelHash.getOutputStallDuration;
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(parallelHash.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoSizesFor = org.bouncycastle.util.Arrays.clone(parallelHash.getHighSpeedVideoSizesFor);
    }

    public ParallelHash(int i, byte[] bArr, int i2, int i3) {
        this.getOutputFormats = new org.bouncycastle.crypto.digests.CSHAKEDigest(i, Camera2StreamConfigurationMap, bArr);
        this.getOutputMinFrameDuration = new org.bouncycastle.crypto.digests.CSHAKEDigest(i, new byte[0], new byte[0]);
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges = i2;
        this.getOutputStallDuration = (i3 + 7) / 8;
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[i2];
        this.getHighSpeedVideoSizesFor = new byte[(i * 2) / 8];
        reset();
    }

    public ParallelHash(int i, byte[] bArr, int i2) {
        this(i, bArr, i2, i * 2);
    }
}
