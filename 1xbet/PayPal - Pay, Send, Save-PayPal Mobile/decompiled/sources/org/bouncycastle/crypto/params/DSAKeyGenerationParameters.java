package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class DSAKeyGenerationParameters extends org.bouncycastle.crypto.KeyGenerationParameters {
    private org.bouncycastle.crypto.params.DSAParameters getHighSpeedVideoSizes;

    public org.bouncycastle.crypto.params.DSAParameters getParameters() {
        return this.getHighSpeedVideoSizes;
    }

    public DSAKeyGenerationParameters(java.security.SecureRandom secureRandom, org.bouncycastle.crypto.params.DSAParameters dSAParameters) {
        super(secureRandom, dSAParameters.getP().bitLength() - 1);
        this.getHighSpeedVideoSizes = dSAParameters;
    }
}
