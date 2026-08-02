package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public final class XMSSMTKeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    private java.security.SecureRandom Camera2StreamConfigurationMap;
    private org.bouncycastle.pqc.crypto.xmss.XMSSParameters getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public final org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        org.bouncycastle.pqc.crypto.xmss.BDSStateMap bDSStateMap = new org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters.Builder(this.getHighSpeedVideoFpsRangesFor).build().getHighResolutionOutputSizeshNQ4ISI;
        int treeDigestSize = this.getHighSpeedVideoFpsRangesFor.getTreeDigestSize();
        byte[] bArr = new byte[treeDigestSize];
        this.Camera2StreamConfigurationMap.nextBytes(bArr);
        byte[] bArr2 = new byte[treeDigestSize];
        this.Camera2StreamConfigurationMap.nextBytes(bArr2);
        byte[] bArr3 = new byte[treeDigestSize];
        this.Camera2StreamConfigurationMap.nextBytes(bArr3);
        org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters build = new org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters.Builder(this.getHighSpeedVideoFpsRangesFor).withSecretKeySeed(bArr).withSecretKeyPRF(bArr2).withPublicSeed(bArr3).withBDSState(bDSStateMap).build();
        new org.bouncycastle.pqc.crypto.xmss.WOTSPlus(this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap).getHighSpeedVideoFpsRanges(new byte[this.getHighSpeedVideoFpsRangesFor.getTreeDigestSize()], build.getPublicSeed());
        int layers = this.getHighSpeedVideoFpsRangesFor.getLayers() - 1;
        org.bouncycastle.pqc.crypto.xmss.BDS bds = new org.bouncycastle.pqc.crypto.xmss.BDS(this.getHighResolutionOutputSizeshNQ4ISI, build.getPublicSeed(), build.getSecretKeySeed(), (org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().withLayerAddress(layers).build());
        org.bouncycastle.pqc.crypto.xmss.XMSSNode root = bds.getRoot();
        build.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor.put(org.bouncycastle.util.Integers.valueOf(layers), bds);
        org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters build2 = new org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters.Builder(this.getHighSpeedVideoFpsRangesFor).withSecretKeySeed(build.getSecretKeySeed()).withSecretKeyPRF(build.getSecretKeyPRF()).withPublicSeed(build.getPublicSeed()).withRoot(root.getValue()).withBDSState(build.getHighResolutionOutputSizeshNQ4ISI).build();
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters.Builder(this.getHighSpeedVideoFpsRangesFor).withRoot(root.getValue()).withPublicSeed(build2.getPublicSeed()).build(), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) build2);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public final void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyGenerationParameters xMSSMTKeyGenerationParameters = (org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyGenerationParameters) keyGenerationParameters;
        this.Camera2StreamConfigurationMap = xMSSMTKeyGenerationParameters.getRandom();
        org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters parameters = xMSSMTKeyGenerationParameters.getParameters();
        this.getHighSpeedVideoFpsRangesFor = parameters;
        this.getHighResolutionOutputSizeshNQ4ISI = parameters.getXMSSParameters();
    }
}
