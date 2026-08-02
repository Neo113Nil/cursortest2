package org.bouncycastle.pqc.jcajce.provider;

/* loaded from: classes17.dex */
public class SPHINCS {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.SPHINCS256", "org.bouncycastle.pqc.jcajce.provider.sphincs.Sphincs256KeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.SPHINCS256", "org.bouncycastle.pqc.jcajce.provider.sphincs.Sphincs256KeyPairGeneratorSpi");
            addSignatureAlgorithm(configurableProvider, "SHA512", "SPHINCS256", "org.bouncycastle.pqc.jcajce.provider.sphincs.SignatureSpi$withSha512", org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.sphincs256_with_SHA512);
            addSignatureAlgorithm(configurableProvider, "SHA3-512", "SPHINCS256", "org.bouncycastle.pqc.jcajce.provider.sphincs.SignatureSpi$withSha3_512", org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.sphincs256_with_SHA3_512);
            registerOid(configurableProvider, org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.sphincs256, "SPHINCS256", new org.bouncycastle.pqc.jcajce.provider.sphincs.Sphincs256KeyFactorySpi());
            registerOidAlgorithmParameters(configurableProvider, org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.sphincs256, "SPHINCS256");
        }
    }
}
