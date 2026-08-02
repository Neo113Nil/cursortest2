package org.bouncycastle.crypto.prng;

/* loaded from: classes17.dex */
public class DigestRandomGenerator implements org.bouncycastle.crypto.prng.RandomGenerator {
    private static long Camera2StreamConfigurationMap = 10;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoSizes;
    private long getHighSpeedVideoFpsRanges = 1;
    private long getInputFormats = 1;

    private void getHighSpeedVideoFpsRanges() {
        long j = this.getInputFormats;
        this.getInputFormats = j + 1;
        for (int i = 0; i != 8; i++) {
            this.getHighSpeedVideoSizes.update((byte) j);
            j >>>= 8;
        }
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes.update(bArr, 0, bArr.length);
        byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes.update(bArr2, 0, bArr2.length);
        this.getHighSpeedVideoSizes.doFinal(this.getHighResolutionOutputSizeshNQ4ISI, 0);
        if (this.getInputFormats % Camera2StreamConfigurationMap == 0) {
            byte[] bArr3 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes.update(bArr3, 0, bArr3.length);
            long j2 = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = 1 + j2;
            for (int i2 = 0; i2 != 8; i2++) {
                this.getHighSpeedVideoSizes.update((byte) j2);
                j2 >>>= 8;
            }
            this.getHighSpeedVideoSizes.doFinal(this.getHighSpeedVideoFpsRangesFor, 0);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j) {
        synchronized (this) {
            for (int i = 0; i != 8; i++) {
                this.getHighSpeedVideoSizes.update((byte) j);
                j >>>= 8;
            }
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes.update(bArr, 0, bArr.length);
            this.getHighSpeedVideoSizes.doFinal(this.getHighSpeedVideoFpsRangesFor, 0);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        synchronized (this) {
            if (!org.bouncycastle.util.Arrays.isNullOrEmpty(bArr)) {
                this.getHighSpeedVideoSizes.update(bArr, 0, bArr.length);
            }
            byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes.update(bArr2, 0, bArr2.length);
            this.getHighSpeedVideoSizes.doFinal(this.getHighSpeedVideoFpsRangesFor, 0);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i, int i2) {
        synchronized (this) {
            getHighSpeedVideoFpsRanges();
            int i3 = i;
            int i4 = 0;
            while (i3 != i2 + i) {
                if (i4 == this.getHighResolutionOutputSizeshNQ4ISI.length) {
                    getHighSpeedVideoFpsRanges();
                    i4 = 0;
                }
                bArr[i3] = this.getHighResolutionOutputSizeshNQ4ISI[i4];
                i3++;
                i4++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        nextBytes(bArr, 0, bArr.length);
    }

    public DigestRandomGenerator(org.bouncycastle.crypto.Digest digest) {
        this.getHighSpeedVideoSizes = digest;
        this.getHighSpeedVideoFpsRangesFor = new byte[digest.getDigestSize()];
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[digest.getDigestSize()];
    }
}
