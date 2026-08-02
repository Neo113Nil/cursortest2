package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public class KeyGenerationParameters {
    private int getHighResolutionOutputSizeshNQ4ISI;
    private java.security.SecureRandom getHighSpeedVideoSizes;

    public int getStrength() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.security.SecureRandom getRandom() {
        return this.getHighSpeedVideoSizes;
    }

    public KeyGenerationParameters(java.security.SecureRandom secureRandom, int i) {
        this.getHighSpeedVideoSizes = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom(secureRandom);
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }
}
