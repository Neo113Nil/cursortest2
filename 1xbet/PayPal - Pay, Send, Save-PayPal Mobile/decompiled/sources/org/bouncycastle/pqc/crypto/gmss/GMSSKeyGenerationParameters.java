package org.bouncycastle.pqc.crypto.gmss;

/* loaded from: classes17.dex */
public class GMSSKeyGenerationParameters extends org.bouncycastle.crypto.KeyGenerationParameters {
    private org.bouncycastle.pqc.crypto.gmss.GMSSParameters getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.pqc.crypto.gmss.GMSSParameters getParameters() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public GMSSKeyGenerationParameters(java.security.SecureRandom secureRandom, org.bouncycastle.pqc.crypto.gmss.GMSSParameters gMSSParameters) {
        super(secureRandom, 1);
        this.getHighSpeedVideoFpsRangesFor = gMSSParameters;
    }
}
