package org.bouncycastle.crypto.prng;

/* loaded from: classes17.dex */
public class X931SecureRandom extends java.security.SecureRandom {
    private final java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.crypto.prng.X931RNG getHighSpeedVideoSizes;

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i) {
        return org.bouncycastle.crypto.prng.EntropyUtil.generateSeed(this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges, i);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            if (this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(bArr, this.getHighSpeedVideoFpsRangesFor) < 0) {
                org.bouncycastle.crypto.prng.X931RNG x931rng = this.getHighSpeedVideoSizes;
                byte[] entropy = x931rng.getHighSpeedVideoFpsRanges.getEntropy();
                x931rng.getHighResolutionOutputSizeshNQ4ISI = entropy;
                if (entropy.length != x931rng.getHighSpeedVideoSizes.getBlockSize()) {
                    throw new java.lang.IllegalStateException("Insufficient entropy returned");
                }
                x931rng.Camera2StreamConfigurationMap = 1L;
                this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(bArr, this.getHighSpeedVideoFpsRangesFor);
            }
        }
    }

    @Override // java.security.SecureRandom
    public void setSeed(byte[] bArr) {
        synchronized (this) {
            java.security.SecureRandom secureRandom = this.getHighResolutionOutputSizeshNQ4ISI;
            if (secureRandom != null) {
                secureRandom.setSeed(bArr);
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void setSeed(long j) {
        synchronized (this) {
            java.security.SecureRandom secureRandom = this.getHighResolutionOutputSizeshNQ4ISI;
            if (secureRandom != null) {
                secureRandom.setSeed(j);
            }
        }
    }

    X931SecureRandom(java.security.SecureRandom secureRandom, org.bouncycastle.crypto.prng.X931RNG x931rng, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = secureRandom;
        this.getHighSpeedVideoSizes = x931rng;
        this.getHighSpeedVideoFpsRangesFor = z;
    }
}
