package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class ParametersWithRandom implements org.bouncycastle.crypto.CipherParameters {
    private org.bouncycastle.crypto.CipherParameters Camera2StreamConfigurationMap;
    private java.security.SecureRandom getHighSpeedVideoFpsRanges;

    public java.security.SecureRandom getRandom() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.crypto.CipherParameters getParameters() {
        return this.Camera2StreamConfigurationMap;
    }

    public ParametersWithRandom(org.bouncycastle.crypto.CipherParameters cipherParameters, java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom(secureRandom);
        this.Camera2StreamConfigurationMap = cipherParameters;
    }

    public ParametersWithRandom(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this(cipherParameters, null);
    }
}
