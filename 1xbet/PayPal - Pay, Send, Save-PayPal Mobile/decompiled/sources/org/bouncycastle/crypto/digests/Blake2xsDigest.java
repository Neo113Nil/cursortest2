package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class Blake2xsDigest implements org.bouncycastle.crypto.Xof {
    public static final int UNKNOWN_DIGEST_LENGTH = 65535;
    private int Camera2StreamConfigurationMap;
    private long getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private org.bouncycastle.crypto.digests.Blake2sDigest getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private long getOutputMinFrameDuration;

    public Blake2xsDigest(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.getInputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRanges = new byte[32];
        this.getHighSpeedVideoFpsRangesFor = 32;
        this.getHighSpeedVideoSizes = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
        if (i <= 0 || i > 65535) {
            throw new java.lang.IllegalArgumentException("BLAKE2xs digest length must be between 1 and 2^16-1");
        }
        this.Camera2StreamConfigurationMap = i;
        this.getOutputMinFrameDuration = i * 4294967296L;
        this.getInputFormats = new org.bouncycastle.crypto.digests.Blake2sDigest(bArr, bArr2, bArr3, this.getOutputMinFrameDuration);
    }

    public long getUnknownMaxLength() {
        return 137438953472L;
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i, int i2) {
        if (this.getInputSizeshNQ4ISI == null) {
            byte[] bArr2 = new byte[this.getInputFormats.getDigestSize()];
            this.getInputSizeshNQ4ISI = bArr2;
            this.getInputFormats.doFinal(bArr2, 0);
        }
        int i3 = this.Camera2StreamConfigurationMap;
        if (i3 != 65535) {
            if (this.getHighSpeedVideoSizes + i2 > i3) {
                throw new java.lang.IllegalArgumentException("Output length is above the digest length");
            }
        } else if ((this.getHighResolutionOutputSizeshNQ4ISI << 5) >= getUnknownMaxLength()) {
            throw new java.lang.IllegalArgumentException("Maximum length is 2^32 blocks of 32 bytes");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            if (this.getHighSpeedVideoFpsRangesFor >= 32) {
                int i5 = this.Camera2StreamConfigurationMap;
                org.bouncycastle.crypto.digests.Blake2sDigest blake2sDigest = new org.bouncycastle.crypto.digests.Blake2sDigest(i5 != 65535 ? java.lang.Math.min(32, i5 - this.getHighSpeedVideoSizes) : 32, this.getOutputMinFrameDuration);
                byte[] bArr3 = this.getInputSizeshNQ4ISI;
                blake2sDigest.update(bArr3, 0, bArr3.length);
                org.bouncycastle.util.Arrays.fill(this.getHighSpeedVideoFpsRanges, (byte) 0);
                blake2sDigest.doFinal(this.getHighSpeedVideoFpsRanges, 0);
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getOutputMinFrameDuration++;
                this.getHighResolutionOutputSizeshNQ4ISI++;
            }
            byte[] bArr4 = this.getHighSpeedVideoFpsRanges;
            int i6 = this.getHighSpeedVideoFpsRangesFor;
            bArr[i4] = bArr4[i6];
            this.getHighSpeedVideoFpsRangesFor = i6 + 1;
            this.getHighSpeedVideoSizes++;
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.getInputFormats.reset();
        this.getInputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRangesFor = 32;
        this.getHighSpeedVideoSizes = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
        this.getOutputMinFrameDuration = this.Camera2StreamConfigurationMap * 4294967296L;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        this.getInputFormats.update(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        this.getInputFormats.update(b);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.getInputFormats.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "BLAKE2xs";
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i, int i2) {
        int doOutput = doOutput(bArr, i, i2);
        reset();
        return doOutput;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        return doFinal(bArr, i, bArr.length);
    }

    public Blake2xsDigest(org.bouncycastle.crypto.digests.Blake2xsDigest blake2xsDigest) {
        this.getInputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRanges = new byte[32];
        this.getHighSpeedVideoFpsRangesFor = 32;
        this.getHighSpeedVideoSizes = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
        this.Camera2StreamConfigurationMap = blake2xsDigest.Camera2StreamConfigurationMap;
        this.getInputFormats = new org.bouncycastle.crypto.digests.Blake2sDigest(blake2xsDigest.getInputFormats);
        this.getInputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(blake2xsDigest.getInputSizeshNQ4ISI);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(blake2xsDigest.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoFpsRangesFor = blake2xsDigest.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = blake2xsDigest.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = blake2xsDigest.getHighResolutionOutputSizeshNQ4ISI;
        this.getOutputMinFrameDuration = blake2xsDigest.getOutputMinFrameDuration;
    }

    public Blake2xsDigest(int i, byte[] bArr) {
        this(i, bArr, null, null);
    }

    public Blake2xsDigest(int i) {
        this(i, null, null, null);
    }

    public Blake2xsDigest() {
        this(65535);
    }
}
