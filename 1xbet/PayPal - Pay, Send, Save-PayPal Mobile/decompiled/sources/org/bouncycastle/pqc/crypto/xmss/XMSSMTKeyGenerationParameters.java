package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public final class XMSSMTKeyGenerationParameters extends org.bouncycastle.crypto.KeyGenerationParameters {
    private final org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters getHighResolutionOutputSizeshNQ4ISI;

    public final org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters getParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public XMSSMTKeyGenerationParameters(org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters xMSSMTParameters, java.security.SecureRandom secureRandom) {
        super(secureRandom, -1);
        this.getHighResolutionOutputSizeshNQ4ISI = xMSSMTParameters;
    }
}
