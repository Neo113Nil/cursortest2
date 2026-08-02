package org.bouncycastle.util.test;

/* loaded from: classes17.dex */
public class TestRandomEntropySourceProvider implements org.bouncycastle.crypto.prng.EntropySourceProvider {
    private final java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI = new java.security.SecureRandom();
    private final boolean getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
    public org.bouncycastle.crypto.prng.EntropySource get(final int i) {
        return new org.bouncycastle.crypto.prng.EntropySource() { // from class: org.bouncycastle.util.test.TestRandomEntropySourceProvider.1
            @Override // org.bouncycastle.crypto.prng.EntropySource
            public boolean isPredictionResistant() {
                return org.bouncycastle.util.test.TestRandomEntropySourceProvider.this.getHighSpeedVideoSizes;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public byte[] getEntropy() {
                byte[] bArr = new byte[(i + 7) / 8];
                org.bouncycastle.util.test.TestRandomEntropySourceProvider.this.getHighResolutionOutputSizeshNQ4ISI.nextBytes(bArr);
                return bArr;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public int entropySize() {
                return i;
            }
        };
    }

    public TestRandomEntropySourceProvider(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }
}
