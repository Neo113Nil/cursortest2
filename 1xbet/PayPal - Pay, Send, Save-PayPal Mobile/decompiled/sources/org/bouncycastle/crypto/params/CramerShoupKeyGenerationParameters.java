package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class CramerShoupKeyGenerationParameters extends org.bouncycastle.crypto.KeyGenerationParameters {
    private org.bouncycastle.crypto.params.CramerShoupParameters getHighSpeedVideoFpsRangesFor;

    public CramerShoupKeyGenerationParameters(java.security.SecureRandom secureRandom, org.bouncycastle.crypto.params.CramerShoupParameters cramerShoupParameters) {
        super(secureRandom, cramerShoupParameters.getP().bitLength());
        this.getHighSpeedVideoFpsRangesFor = cramerShoupParameters;
    }

    public org.bouncycastle.crypto.params.CramerShoupParameters getParameters() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
