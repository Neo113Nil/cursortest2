package org.bouncycastle.pqc.crypto.rainbow;

/* loaded from: classes17.dex */
public class RainbowKeyGenerationParameters extends org.bouncycastle.crypto.KeyGenerationParameters {
    private org.bouncycastle.pqc.crypto.rainbow.RainbowParameters getHighSpeedVideoFpsRanges;

    public org.bouncycastle.pqc.crypto.rainbow.RainbowParameters getParameters() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public RainbowKeyGenerationParameters(java.security.SecureRandom secureRandom, org.bouncycastle.pqc.crypto.rainbow.RainbowParameters rainbowParameters) {
        super(secureRandom, rainbowParameters.getVi()[rainbowParameters.getVi().length - 1] - rainbowParameters.getVi()[0]);
        this.getHighSpeedVideoFpsRanges = rainbowParameters;
    }
}
