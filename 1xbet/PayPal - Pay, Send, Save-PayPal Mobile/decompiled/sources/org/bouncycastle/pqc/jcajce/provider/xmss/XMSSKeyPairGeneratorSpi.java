package org.bouncycastle.pqc.jcajce.provider.xmss;

/* loaded from: classes17.dex */
public class XMSSKeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    private java.security.SecureRandom Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.pqc.crypto.xmss.XMSSKeyGenerationParameters getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.pqc.crypto.xmss.XMSSKeyPairGenerator getHighSpeedVideoSizes;

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.pqc.crypto.xmss.XMSSKeyGenerationParameters xMSSKeyGenerationParameters;
        if (!(algorithmParameterSpec instanceof org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec)) {
            throw new java.security.InvalidAlgorithmParameterException("parameter object not a XMSSParameterSpec");
        }
        org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec xMSSParameterSpec = (org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec) algorithmParameterSpec;
        if (xMSSParameterSpec.getTreeDigest().equals("SHA256")) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256;
            xMSSKeyGenerationParameters = new org.bouncycastle.pqc.crypto.xmss.XMSSKeyGenerationParameters(new org.bouncycastle.pqc.crypto.xmss.XMSSParameters(xMSSParameterSpec.getHeight(), new org.bouncycastle.crypto.digests.SHA256Digest()), secureRandom);
        } else if (xMSSParameterSpec.getTreeDigest().equals("SHA512")) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512;
            xMSSKeyGenerationParameters = new org.bouncycastle.pqc.crypto.xmss.XMSSKeyGenerationParameters(new org.bouncycastle.pqc.crypto.xmss.XMSSParameters(xMSSParameterSpec.getHeight(), new org.bouncycastle.crypto.digests.SHA512Digest()), secureRandom);
        } else {
            if (!xMSSParameterSpec.getTreeDigest().equals("SHAKE128")) {
                if (xMSSParameterSpec.getTreeDigest().equals("SHAKE256")) {
                    this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256;
                    xMSSKeyGenerationParameters = new org.bouncycastle.pqc.crypto.xmss.XMSSKeyGenerationParameters(new org.bouncycastle.pqc.crypto.xmss.XMSSParameters(xMSSParameterSpec.getHeight(), new org.bouncycastle.crypto.digests.SHAKEDigest(256)), secureRandom);
                }
                this.getHighSpeedVideoSizes.init(this.getHighSpeedVideoFpsRangesFor);
                this.getHighResolutionOutputSizeshNQ4ISI = true;
            }
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128;
            xMSSKeyGenerationParameters = new org.bouncycastle.pqc.crypto.xmss.XMSSKeyGenerationParameters(new org.bouncycastle.pqc.crypto.xmss.XMSSParameters(xMSSParameterSpec.getHeight(), new org.bouncycastle.crypto.digests.SHAKEDigest(128)), secureRandom);
        }
        this.getHighSpeedVideoFpsRangesFor = xMSSKeyGenerationParameters;
        this.getHighSpeedVideoSizes.init(this.getHighSpeedVideoFpsRangesFor);
        this.getHighResolutionOutputSizeshNQ4ISI = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, java.security.SecureRandom secureRandom) {
        throw new java.lang.IllegalArgumentException("use AlgorithmParameterSpec");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public java.security.KeyPair generateKeyPair() {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            org.bouncycastle.pqc.crypto.xmss.XMSSKeyGenerationParameters xMSSKeyGenerationParameters = new org.bouncycastle.pqc.crypto.xmss.XMSSKeyGenerationParameters(new org.bouncycastle.pqc.crypto.xmss.XMSSParameters(10, new org.bouncycastle.crypto.digests.SHA512Digest()), this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRangesFor = xMSSKeyGenerationParameters;
            this.getHighSpeedVideoSizes.init(xMSSKeyGenerationParameters);
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        }
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = this.getHighSpeedVideoSizes.generateKeyPair();
        return new java.security.KeyPair(new org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSPublicKey(this.getHighSpeedVideoFpsRanges, (org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters) generateKeyPair.getPublic()), new org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSPrivateKey(this.getHighSpeedVideoFpsRanges, (org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    public XMSSKeyPairGeneratorSpi() {
        super("XMSS");
        this.getHighSpeedVideoSizes = new org.bouncycastle.pqc.crypto.xmss.XMSSKeyPairGenerator();
        this.Camera2StreamConfigurationMap = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        this.getHighResolutionOutputSizeshNQ4ISI = false;
    }
}
