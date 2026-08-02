package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
public class LMSKeyGenerationParameters extends org.bouncycastle.crypto.KeyGenerationParameters {
    private final org.bouncycastle.pqc.crypto.lms.LMSParameters getHighResolutionOutputSizeshNQ4ISI;

    public org.bouncycastle.pqc.crypto.lms.LMSParameters getParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public LMSKeyGenerationParameters(org.bouncycastle.pqc.crypto.lms.LMSParameters lMSParameters, java.security.SecureRandom secureRandom) {
        super(secureRandom, org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighResolutionOutputSizeshNQ4ISI(lMSParameters));
        this.getHighResolutionOutputSizeshNQ4ISI = lMSParameters;
    }
}
