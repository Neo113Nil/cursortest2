package org.bouncycastle.pqc.jcajce.provider.xmss;

/* loaded from: classes17.dex */
public class XMSSMTKeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    private org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyPairGenerator Camera2StreamConfigurationMap;
    private java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyGenerationParameters getHighSpeedVideoSizes;

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyGenerationParameters xMSSMTKeyGenerationParameters;
        if (!(algorithmParameterSpec instanceof org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec)) {
            throw new java.security.InvalidAlgorithmParameterException("parameter object not a XMSSMTParameterSpec");
        }
        org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec xMSSMTParameterSpec = (org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec) algorithmParameterSpec;
        if (xMSSMTParameterSpec.getTreeDigest().equals("SHA256")) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256;
            xMSSMTKeyGenerationParameters = new org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyGenerationParameters(new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(xMSSMTParameterSpec.getHeight(), xMSSMTParameterSpec.getLayers(), new org.bouncycastle.crypto.digests.SHA256Digest()), secureRandom);
        } else if (xMSSMTParameterSpec.getTreeDigest().equals("SHA512")) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512;
            xMSSMTKeyGenerationParameters = new org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyGenerationParameters(new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(xMSSMTParameterSpec.getHeight(), xMSSMTParameterSpec.getLayers(), new org.bouncycastle.crypto.digests.SHA512Digest()), secureRandom);
        } else {
            if (!xMSSMTParameterSpec.getTreeDigest().equals("SHAKE128")) {
                if (xMSSMTParameterSpec.getTreeDigest().equals("SHAKE256")) {
                    this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256;
                    xMSSMTKeyGenerationParameters = new org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyGenerationParameters(new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(xMSSMTParameterSpec.getHeight(), xMSSMTParameterSpec.getLayers(), new org.bouncycastle.crypto.digests.SHAKEDigest(256)), secureRandom);
                }
                this.Camera2StreamConfigurationMap.init(this.getHighSpeedVideoSizes);
                this.getHighSpeedVideoFpsRanges = true;
            }
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128;
            xMSSMTKeyGenerationParameters = new org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyGenerationParameters(new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(xMSSMTParameterSpec.getHeight(), xMSSMTParameterSpec.getLayers(), new org.bouncycastle.crypto.digests.SHAKEDigest(128)), secureRandom);
        }
        this.getHighSpeedVideoSizes = xMSSMTKeyGenerationParameters;
        this.Camera2StreamConfigurationMap.init(this.getHighSpeedVideoSizes);
        this.getHighSpeedVideoFpsRanges = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, java.security.SecureRandom secureRandom) {
        throw new java.lang.IllegalArgumentException("use AlgorithmParameterSpec");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public java.security.KeyPair generateKeyPair() {
        if (!this.getHighSpeedVideoFpsRanges) {
            org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyGenerationParameters xMSSMTKeyGenerationParameters = new org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyGenerationParameters(new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(10, 20, new org.bouncycastle.crypto.digests.SHA512Digest()), this.getHighResolutionOutputSizeshNQ4ISI);
            this.getHighSpeedVideoSizes = xMSSMTKeyGenerationParameters;
            this.Camera2StreamConfigurationMap.init(xMSSMTKeyGenerationParameters);
            this.getHighSpeedVideoFpsRanges = true;
        }
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = this.Camera2StreamConfigurationMap.generateKeyPair();
        return new java.security.KeyPair(new org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSMTPublicKey(this.getHighSpeedVideoFpsRangesFor, (org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters) generateKeyPair.getPublic()), new org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSMTPrivateKey(this.getHighSpeedVideoFpsRangesFor, (org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    public XMSSMTKeyPairGeneratorSpi() {
        super("XMSSMT");
        this.Camera2StreamConfigurationMap = new org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyPairGenerator();
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        this.getHighSpeedVideoFpsRanges = false;
    }
}
