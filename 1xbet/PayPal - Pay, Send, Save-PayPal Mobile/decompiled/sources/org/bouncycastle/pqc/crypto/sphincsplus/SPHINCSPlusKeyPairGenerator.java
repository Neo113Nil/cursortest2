package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: classes17.dex */
public class SPHINCSPlusKeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    private java.security.SecureRandom getHighSpeedVideoFpsRanges;
    private org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine sPHINCSPlusEngine = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
        byte[] bArr = new byte[sPHINCSPlusEngine.getHighSpeedVideoSizesFor];
        this.getHighSpeedVideoFpsRanges.nextBytes(bArr);
        byte[] bArr2 = new byte[sPHINCSPlusEngine.getHighSpeedVideoSizesFor];
        this.getHighSpeedVideoFpsRanges.nextBytes(bArr2);
        org.bouncycastle.pqc.crypto.sphincsplus.SK sk = new org.bouncycastle.pqc.crypto.sphincsplus.SK(bArr, bArr2);
        byte[] bArr3 = new byte[sPHINCSPlusEngine.getHighSpeedVideoSizesFor];
        this.getHighSpeedVideoFpsRanges.nextBytes(bArr3);
        org.bouncycastle.pqc.crypto.sphincsplus.PK pk = new org.bouncycastle.pqc.crypto.sphincsplus.PK(bArr3, new org.bouncycastle.pqc.crypto.sphincsplus.HT(sPHINCSPlusEngine, sk.Camera2StreamConfigurationMap, bArr3).getHighSpeedVideoSizes);
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPublicKeyParameters(this.getHighSpeedVideoFpsRangesFor, pk), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPrivateKeyParameters(this.getHighSpeedVideoFpsRangesFor, sk, pk));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        this.getHighSpeedVideoFpsRanges = keyGenerationParameters.getRandom();
        this.getHighSpeedVideoFpsRangesFor = ((org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusKeyGenerationParameters) keyGenerationParameters).getHighSpeedVideoSizes;
    }
}
