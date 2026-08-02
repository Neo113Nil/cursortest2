package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class DHKeyGenerationParameters extends org.bouncycastle.crypto.KeyGenerationParameters {
    private org.bouncycastle.crypto.params.DHParameters getHighResolutionOutputSizeshNQ4ISI;

    public DHKeyGenerationParameters(java.security.SecureRandom secureRandom, org.bouncycastle.crypto.params.DHParameters dHParameters) {
        super(secureRandom, dHParameters.getL() != 0 ? dHParameters.getL() : dHParameters.getP().bitLength());
        this.getHighResolutionOutputSizeshNQ4ISI = dHParameters;
    }

    public org.bouncycastle.crypto.params.DHParameters getParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
