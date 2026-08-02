package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
public class LMSKeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    org.bouncycastle.pqc.crypto.lms.LMSKeyGenerationParameters getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.pqc.crypto.lms.LMSKeyGenerationParameters) keyGenerationParameters;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        java.security.SecureRandom random = this.getHighSpeedVideoFpsRanges.getRandom();
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        byte[] bArr2 = new byte[32];
        random.nextBytes(bArr2);
        org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters highSpeedVideoSizes = org.bouncycastle.pqc.crypto.lms.LMS.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges.getParameters().getLMSigParam(), this.getHighSpeedVideoFpsRanges.getParameters().getLMOTSParam(), 0, bArr, bArr2);
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) highSpeedVideoSizes.getPublicKey(), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) highSpeedVideoSizes);
    }
}
