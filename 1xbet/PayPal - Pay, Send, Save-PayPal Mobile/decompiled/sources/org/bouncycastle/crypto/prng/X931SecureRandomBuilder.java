package org.bouncycastle.crypto.prng;

/* loaded from: classes17.dex */
public class X931SecureRandomBuilder {
    private byte[] Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.prng.EntropySourceProvider getHighResolutionOutputSizeshNQ4ISI;
    private java.security.SecureRandom getHighSpeedVideoSizes;

    public org.bouncycastle.crypto.prng.X931SecureRandomBuilder setDateTimeVector(byte[] bArr) {
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(bArr);
        return this;
    }

    public org.bouncycastle.crypto.prng.X931SecureRandom build(org.bouncycastle.crypto.BlockCipher blockCipher, org.bouncycastle.crypto.params.KeyParameter keyParameter, boolean z) {
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = new byte[blockCipher.getBlockSize()];
            org.bouncycastle.util.Pack.longToBigEndian(java.lang.System.currentTimeMillis(), this.Camera2StreamConfigurationMap, 0);
        }
        blockCipher.init(true, keyParameter);
        return new org.bouncycastle.crypto.prng.X931SecureRandom(this.getHighSpeedVideoSizes, new org.bouncycastle.crypto.prng.X931RNG(blockCipher, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI.get(blockCipher.getBlockSize() * 8)), z);
    }

    public X931SecureRandomBuilder(org.bouncycastle.crypto.prng.EntropySourceProvider entropySourceProvider) {
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI = entropySourceProvider;
    }

    public X931SecureRandomBuilder(java.security.SecureRandom secureRandom, boolean z) {
        this.getHighSpeedVideoSizes = secureRandom;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.prng.BasicEntropySourceProvider(secureRandom, z);
    }

    public X931SecureRandomBuilder() {
        this(org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom(), false);
    }
}
