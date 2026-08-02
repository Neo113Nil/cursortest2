package org.bouncycastle.crypto.prng;

/* loaded from: classes17.dex */
public class ReversedWindowGenerator implements org.bouncycastle.crypto.prng.RandomGenerator {
    private byte[] Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.crypto.prng.RandomGenerator getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i, int i2) {
        getHighSpeedVideoSizes(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        getHighSpeedVideoSizes(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        synchronized (this) {
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getHighSpeedVideoSizes.addSeedMaterial(bArr);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j) {
        synchronized (this) {
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getHighSpeedVideoSizes.addSeedMaterial(j);
        }
    }

    private void getHighSpeedVideoSizes(byte[] bArr, int i, int i2) {
        synchronized (this) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.getHighSpeedVideoFpsRangesFor <= 0) {
                    org.bouncycastle.crypto.prng.RandomGenerator randomGenerator = this.getHighSpeedVideoSizes;
                    byte[] bArr2 = this.Camera2StreamConfigurationMap;
                    randomGenerator.nextBytes(bArr2, 0, bArr2.length);
                    this.getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.length;
                }
                byte[] bArr3 = this.Camera2StreamConfigurationMap;
                int i4 = this.getHighSpeedVideoFpsRangesFor - 1;
                this.getHighSpeedVideoFpsRangesFor = i4;
                bArr[i3 + i] = bArr3[i4];
            }
        }
    }

    public ReversedWindowGenerator(org.bouncycastle.crypto.prng.RandomGenerator randomGenerator, int i) {
        if (randomGenerator == null) {
            throw new java.lang.IllegalArgumentException("generator cannot be null");
        }
        if (i < 2) {
            throw new java.lang.IllegalArgumentException("windowSize must be at least 2");
        }
        this.getHighSpeedVideoSizes = randomGenerator;
        this.Camera2StreamConfigurationMap = new byte[i];
    }
}
