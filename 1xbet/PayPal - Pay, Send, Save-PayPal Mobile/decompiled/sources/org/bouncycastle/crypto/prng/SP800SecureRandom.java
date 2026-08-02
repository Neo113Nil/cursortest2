package org.bouncycastle.crypto.prng;

/* loaded from: classes17.dex */
public class SP800SecureRandom extends java.security.SecureRandom {
    private final org.bouncycastle.crypto.prng.DRBGProvider Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.crypto.prng.EntropySource getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.prng.drbg.SP80090DRBG getHighSpeedVideoFpsRangesFor;
    private final java.security.SecureRandom getHighSpeedVideoSizes;

    @Override // java.security.SecureRandom
    public void setSeed(byte[] bArr) {
        synchronized (this) {
            java.security.SecureRandom secureRandom = this.getHighSpeedVideoSizes;
            if (secureRandom != null) {
                secureRandom.setSeed(bArr);
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void setSeed(long j) {
        synchronized (this) {
            java.security.SecureRandom secureRandom = this.getHighSpeedVideoSizes;
            if (secureRandom != null) {
                secureRandom.setSeed(j);
            }
        }
    }

    public void reseed(byte[] bArr) {
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges);
            }
            this.getHighSpeedVideoFpsRangesFor.reseed(bArr);
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges);
            }
            if (this.getHighSpeedVideoFpsRangesFor.generate(bArr, null, this.getHighResolutionOutputSizeshNQ4ISI) < 0) {
                this.getHighSpeedVideoFpsRangesFor.reseed(null);
                this.getHighSpeedVideoFpsRangesFor.generate(bArr, null, this.getHighResolutionOutputSizeshNQ4ISI);
            }
        }
    }

    @Override // java.security.SecureRandom
    public java.lang.String getAlgorithm() {
        return this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap();
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i) {
        return org.bouncycastle.crypto.prng.EntropyUtil.generateSeed(this.getHighSpeedVideoFpsRanges, i);
    }

    SP800SecureRandom(java.security.SecureRandom secureRandom, org.bouncycastle.crypto.prng.EntropySource entropySource, org.bouncycastle.crypto.prng.DRBGProvider dRBGProvider, boolean z) {
        this.getHighSpeedVideoSizes = secureRandom;
        this.getHighSpeedVideoFpsRanges = entropySource;
        this.Camera2StreamConfigurationMap = dRBGProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }
}
