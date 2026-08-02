package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
public class HSSKeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    org.bouncycastle.pqc.crypto.lms.HSSKeyGenerationParameters getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        this.getHighSpeedVideoSizes = (org.bouncycastle.pqc.crypto.lms.HSSKeyGenerationParameters) keyGenerationParameters;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters highResolutionOutputSizeshNQ4ISI = org.bouncycastle.pqc.crypto.lms.HSS.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes);
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) highResolutionOutputSizeshNQ4ISI.getPublicKey(), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) highResolutionOutputSizeshNQ4ISI);
    }
}
