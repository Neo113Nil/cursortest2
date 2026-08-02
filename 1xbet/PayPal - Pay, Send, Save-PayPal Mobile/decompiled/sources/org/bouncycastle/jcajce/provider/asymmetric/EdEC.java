package org.bouncycastle.jcajce.provider.asymmetric;

/* loaded from: classes17.dex */
public class EdEC {
    private static final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes;

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.XDH", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$XDH");
            configurableProvider.addAlgorithm("KeyFactory.X448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$X448");
            configurableProvider.addAlgorithm("KeyFactory.X25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$X25519");
            configurableProvider.addAlgorithm("KeyFactory.EDDSA", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$EdDSA");
            configurableProvider.addAlgorithm("KeyFactory.ED448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$Ed448");
            configurableProvider.addAlgorithm("KeyFactory.ED25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$Ed25519");
            configurableProvider.addAlgorithm("Signature.EDDSA", "org.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$EdDSA");
            configurableProvider.addAlgorithm("Signature.ED448", "org.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$Ed448");
            configurableProvider.addAlgorithm("Signature.ED25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$Ed25519");
            configurableProvider.addAlgorithm("Alg.Alias.Signature", org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448, "ED448");
            configurableProvider.addAlgorithm("Alg.Alias.Signature", org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed25519, "ED25519");
            configurableProvider.addAlgorithm("KeyPairGenerator.EDDSA", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$EdDSA");
            configurableProvider.addAlgorithm("KeyPairGenerator.ED448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed448");
            configurableProvider.addAlgorithm("KeyPairGenerator.ED25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed25519");
            configurableProvider.addAlgorithm("KeyPairGenerator", org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed448");
            configurableProvider.addAlgorithm("KeyPairGenerator", org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed25519, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed25519");
            configurableProvider.addAlgorithm("KeyAgreement.XDH", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$XDH");
            configurableProvider.addAlgorithm("KeyAgreement.X448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448");
            configurableProvider.addAlgorithm("KeyAgreement.X25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519");
            configurableProvider.addAlgorithm("KeyAgreement", org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X448, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448");
            configurableProvider.addAlgorithm("KeyAgreement", org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X25519, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519");
            configurableProvider.addAlgorithm("KeyAgreement.X25519WITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA256CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.X25519WITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA384CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.X25519WITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA512CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.X448WITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA256CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.X448WITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA384CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.X448WITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA512CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.X25519WITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA256KDF");
            configurableProvider.addAlgorithm("KeyAgreement.X448WITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA512KDF");
            configurableProvider.addAlgorithm("KeyAgreement.X25519UWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519UwithSHA256KDF");
            configurableProvider.addAlgorithm("KeyAgreement.X448UWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448UwithSHA512KDF");
            configurableProvider.addAlgorithm("KeyPairGenerator.XDH", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$XDH");
            configurableProvider.addAlgorithm("KeyPairGenerator.X448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$X448");
            configurableProvider.addAlgorithm("KeyPairGenerator.X25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$X25519");
            configurableProvider.addAlgorithm("KeyPairGenerator", org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X448, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$X448");
            configurableProvider.addAlgorithm("KeyPairGenerator", org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X25519, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$X25519");
            registerOid(configurableProvider, org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X448, "XDH", new org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.X448());
            registerOid(configurableProvider, org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X25519, "XDH", new org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.X25519());
            registerOid(configurableProvider, org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448, "EDDSA", new org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.Ed448());
            registerOid(configurableProvider, org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed25519, "EDDSA", new org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi.Ed25519());
        }
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoSizes = hashMap;
        hashMap.put("SupportedKeyClasses", "java.security.interfaces.ECPublicKey|java.security.interfaces.ECPrivateKey");
        hashMap.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
