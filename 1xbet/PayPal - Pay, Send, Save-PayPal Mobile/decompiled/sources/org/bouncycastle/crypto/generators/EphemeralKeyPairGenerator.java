package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class EphemeralKeyPairGenerator {
    private org.bouncycastle.crypto.KeyEncoder Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator getHighResolutionOutputSizeshNQ4ISI;

    public org.bouncycastle.crypto.EphemeralKeyPair generate() {
        return new org.bouncycastle.crypto.EphemeralKeyPair(this.getHighResolutionOutputSizeshNQ4ISI.generateKeyPair(), this.Camera2StreamConfigurationMap);
    }

    public EphemeralKeyPairGenerator(org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator asymmetricCipherKeyPairGenerator, org.bouncycastle.crypto.KeyEncoder keyEncoder) {
        this.getHighResolutionOutputSizeshNQ4ISI = asymmetricCipherKeyPairGenerator;
        this.Camera2StreamConfigurationMap = keyEncoder;
    }
}
