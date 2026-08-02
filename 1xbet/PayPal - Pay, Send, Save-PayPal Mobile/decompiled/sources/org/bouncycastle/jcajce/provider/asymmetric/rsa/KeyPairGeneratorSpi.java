package org.bouncycastle.jcajce.provider.asymmetric.rsa;

/* loaded from: classes17.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    org.bouncycastle.crypto.generators.RSAKeyPairGenerator getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.crypto.params.RSAKeyGenerationParameters getHighSpeedVideoSizes;
    private static final org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, org.bouncycastle.asn1.DERNull.INSTANCE);
    private static final org.bouncycastle.asn1.x509.AlgorithmIdentifier getOutputMinFrameDuration = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS);
    static final java.math.BigInteger getHighSpeedVideoFpsRanges = java.math.BigInteger.valueOf(65537);

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof java.security.spec.RSAKeyGenParameterSpec)) {
            throw new java.security.InvalidAlgorithmParameterException("parameter object not a RSAKeyGenParameterSpec");
        }
        java.security.spec.RSAKeyGenParameterSpec rSAKeyGenParameterSpec = (java.security.spec.RSAKeyGenParameterSpec) algorithmParameterSpec;
        org.bouncycastle.crypto.params.RSAKeyGenerationParameters rSAKeyGenerationParameters = new org.bouncycastle.crypto.params.RSAKeyGenerationParameters(rSAKeyGenParameterSpec.getPublicExponent(), secureRandom, rSAKeyGenParameterSpec.getKeysize(), org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator.getDefaultCertainty(2048));
        this.getHighSpeedVideoSizes = rSAKeyGenerationParameters;
        this.getHighResolutionOutputSizeshNQ4ISI.init(rSAKeyGenerationParameters);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, java.security.SecureRandom secureRandom) {
        org.bouncycastle.crypto.params.RSAKeyGenerationParameters rSAKeyGenerationParameters = new org.bouncycastle.crypto.params.RSAKeyGenerationParameters(getHighSpeedVideoFpsRanges, secureRandom, i, org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator.getDefaultCertainty(i));
        this.getHighSpeedVideoSizes = rSAKeyGenerationParameters;
        this.getHighResolutionOutputSizeshNQ4ISI.init(rSAKeyGenerationParameters);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public java.security.KeyPair generateKeyPair() {
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = this.getHighResolutionOutputSizeshNQ4ISI.generateKeyPair();
        return new java.security.KeyPair(new org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey(this.getHighSpeedVideoFpsRangesFor, (org.bouncycastle.crypto.params.RSAKeyParameters) generateKeyPair.getPublic()), new org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateCrtKey(this.getHighSpeedVideoFpsRangesFor, (org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters) generateKeyPair.getPrivate()));
    }

    public KeyPairGeneratorSpi(java.lang.String str, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        super(str);
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.generators.RSAKeyPairGenerator();
        org.bouncycastle.crypto.params.RSAKeyGenerationParameters rSAKeyGenerationParameters = new org.bouncycastle.crypto.params.RSAKeyGenerationParameters(getHighSpeedVideoFpsRanges, org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom(), 2048, org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator.getDefaultCertainty(2048));
        this.getHighSpeedVideoSizes = rSAKeyGenerationParameters;
        this.getHighResolutionOutputSizeshNQ4ISI.init(rSAKeyGenerationParameters);
    }

    public static class PSS extends org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyPairGeneratorSpi {
        public PSS() {
            super(org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS, org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyPairGeneratorSpi.getOutputMinFrameDuration);
        }
    }

    public KeyPairGeneratorSpi() {
        this("RSA", Camera2StreamConfigurationMap);
    }
}
