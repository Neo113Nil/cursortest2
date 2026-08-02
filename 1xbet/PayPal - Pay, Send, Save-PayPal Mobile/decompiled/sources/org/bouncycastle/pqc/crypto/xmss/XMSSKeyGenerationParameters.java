package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public final class XMSSKeyGenerationParameters extends org.bouncycastle.crypto.KeyGenerationParameters {
    private final org.bouncycastle.pqc.crypto.xmss.XMSSParameters getHighSpeedVideoSizes;

    public final org.bouncycastle.pqc.crypto.xmss.XMSSParameters getParameters() {
        return this.getHighSpeedVideoSizes;
    }

    public XMSSKeyGenerationParameters(org.bouncycastle.pqc.crypto.xmss.XMSSParameters xMSSParameters, java.security.SecureRandom secureRandom) {
        super(secureRandom, -1);
        this.getHighSpeedVideoSizes = xMSSParameters;
    }
}
