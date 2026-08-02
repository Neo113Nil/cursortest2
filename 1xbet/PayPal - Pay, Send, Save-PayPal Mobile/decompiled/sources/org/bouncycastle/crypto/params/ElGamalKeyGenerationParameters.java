package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class ElGamalKeyGenerationParameters extends org.bouncycastle.crypto.KeyGenerationParameters {
    private org.bouncycastle.crypto.params.ElGamalParameters Camera2StreamConfigurationMap;

    public ElGamalKeyGenerationParameters(java.security.SecureRandom secureRandom, org.bouncycastle.crypto.params.ElGamalParameters elGamalParameters) {
        super(secureRandom, elGamalParameters.getL() != 0 ? elGamalParameters.getL() : elGamalParameters.getP().bitLength());
        this.Camera2StreamConfigurationMap = elGamalParameters;
    }

    public org.bouncycastle.crypto.params.ElGamalParameters getParameters() {
        return this.Camera2StreamConfigurationMap;
    }
}
