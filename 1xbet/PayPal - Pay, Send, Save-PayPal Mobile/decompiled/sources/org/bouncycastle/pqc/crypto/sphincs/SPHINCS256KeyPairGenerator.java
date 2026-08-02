package org.bouncycastle.pqc.crypto.sphincs;

/* loaded from: classes17.dex */
public class SPHINCS256KeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    private org.bouncycastle.crypto.Digest getHighResolutionOutputSizeshNQ4ISI;
    private java.security.SecureRandom getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        this.getHighSpeedVideoFpsRangesFor = keyGenerationParameters.getRandom();
        this.getHighResolutionOutputSizeshNQ4ISI = ((org.bouncycastle.pqc.crypto.sphincs.SPHINCS256KeyGenerationParameters) keyGenerationParameters).getTreeDigest();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        org.bouncycastle.pqc.crypto.sphincs.Tree.leafaddr leafaddrVar = new org.bouncycastle.pqc.crypto.sphincs.Tree.leafaddr();
        byte[] bArr = new byte[1088];
        this.getHighSpeedVideoFpsRangesFor.nextBytes(bArr);
        byte[] bArr2 = new byte[1056];
        java.lang.System.arraycopy(bArr, 32, bArr2, 0, 1024);
        leafaddrVar.getHighSpeedVideoSizes = 11;
        leafaddrVar.getHighResolutionOutputSizeshNQ4ISI = 0L;
        leafaddrVar.Camera2StreamConfigurationMap = 0L;
        org.bouncycastle.pqc.crypto.sphincs.Tree.getHighSpeedVideoSizes(new org.bouncycastle.pqc.crypto.sphincs.HashFunctions(this.getHighResolutionOutputSizeshNQ4ISI), bArr2, 1024, bArr, leafaddrVar, bArr2, 0);
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.pqc.crypto.sphincs.SPHINCSPublicKeyParameters(bArr2, this.getHighResolutionOutputSizeshNQ4ISI.getAlgorithmName()), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters(bArr, this.getHighResolutionOutputSizeshNQ4ISI.getAlgorithmName()));
    }
}
