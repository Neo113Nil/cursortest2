package org.bouncycastle.crypto.prng;

/* loaded from: classes17.dex */
public class BasicEntropySourceProvider implements org.bouncycastle.crypto.prng.EntropySourceProvider {
    private final boolean Camera2StreamConfigurationMap;
    private final java.security.SecureRandom getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
    public org.bouncycastle.crypto.prng.EntropySource get(final int i) {
        return new org.bouncycastle.crypto.prng.EntropySource() { // from class: org.bouncycastle.crypto.prng.BasicEntropySourceProvider.1
            @Override // org.bouncycastle.crypto.prng.EntropySource
            public boolean isPredictionResistant() {
                return org.bouncycastle.crypto.prng.BasicEntropySourceProvider.this.Camera2StreamConfigurationMap;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public byte[] getEntropy() {
                if ((org.bouncycastle.crypto.prng.BasicEntropySourceProvider.this.getHighSpeedVideoFpsRanges instanceof org.bouncycastle.crypto.prng.SP800SecureRandom) || (org.bouncycastle.crypto.prng.BasicEntropySourceProvider.this.getHighSpeedVideoFpsRanges instanceof org.bouncycastle.crypto.prng.X931SecureRandom)) {
                    byte[] bArr = new byte[(i + 7) / 8];
                    org.bouncycastle.crypto.prng.BasicEntropySourceProvider.this.getHighSpeedVideoFpsRanges.nextBytes(bArr);
                    return bArr;
                }
                return org.bouncycastle.crypto.prng.BasicEntropySourceProvider.this.getHighSpeedVideoFpsRanges.generateSeed((i + 7) / 8);
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public int entropySize() {
                return i;
            }
        };
    }

    public BasicEntropySourceProvider(java.security.SecureRandom secureRandom, boolean z) {
        this.getHighSpeedVideoFpsRanges = secureRandom;
        this.Camera2StreamConfigurationMap = z;
    }
}
