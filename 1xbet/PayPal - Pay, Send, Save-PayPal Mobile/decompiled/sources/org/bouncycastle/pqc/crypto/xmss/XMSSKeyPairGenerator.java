package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public final class XMSSKeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    private org.bouncycastle.pqc.crypto.xmss.XMSSParameters Camera2StreamConfigurationMap;
    private java.security.SecureRandom getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public final org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        org.bouncycastle.pqc.crypto.xmss.XMSSParameters xMSSParameters = this.Camera2StreamConfigurationMap;
        java.security.SecureRandom secureRandom = this.getHighSpeedVideoSizes;
        int treeDigestSize = xMSSParameters.getTreeDigestSize();
        byte[] bArr = new byte[treeDigestSize];
        secureRandom.nextBytes(bArr);
        byte[] bArr2 = new byte[treeDigestSize];
        secureRandom.nextBytes(bArr2);
        byte[] bArr3 = new byte[treeDigestSize];
        secureRandom.nextBytes(bArr3);
        org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters build = new org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters.Builder(xMSSParameters).withSecretKeySeed(bArr).withSecretKeyPRF(bArr2).withPublicSeed(bArr3).withBDSState(new org.bouncycastle.pqc.crypto.xmss.BDS(xMSSParameters, bArr3, bArr, (org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().build())).build();
        org.bouncycastle.pqc.crypto.xmss.XMSSNode root = build.getHighSpeedVideoFpsRangesFor.getRoot();
        org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters build2 = new org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters.Builder(this.Camera2StreamConfigurationMap).withSecretKeySeed(build.getSecretKeySeed()).withSecretKeyPRF(build.getSecretKeyPRF()).withPublicSeed(build.getPublicSeed()).withRoot(root.getValue()).withBDSState(build.getHighSpeedVideoFpsRangesFor).build();
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters.Builder(this.Camera2StreamConfigurationMap).withRoot(root.getValue()).withPublicSeed(build2.getPublicSeed()).build(), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) build2);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public final void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        org.bouncycastle.pqc.crypto.xmss.XMSSKeyGenerationParameters xMSSKeyGenerationParameters = (org.bouncycastle.pqc.crypto.xmss.XMSSKeyGenerationParameters) keyGenerationParameters;
        this.getHighSpeedVideoSizes = xMSSKeyGenerationParameters.getRandom();
        this.Camera2StreamConfigurationMap = xMSSKeyGenerationParameters.getParameters();
    }
}
