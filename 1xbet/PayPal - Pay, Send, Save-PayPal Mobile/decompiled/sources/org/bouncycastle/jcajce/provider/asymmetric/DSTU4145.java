package org.bouncycastle.jcajce.provider.asymmetric;

/* loaded from: classes17.dex */
public class DSTU4145 {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu.KeyFactorySpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.DSTU-4145-2002", "DSTU4145");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.DSTU4145-3410", "DSTU4145");
            registerOid(configurableProvider, org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145le, "DSTU4145", new org.bouncycastle.jcajce.provider.asymmetric.dstu.KeyFactorySpi());
            registerOidAlgorithmParameters(configurableProvider, org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145le, "DSTU4145");
            registerOid(configurableProvider, org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145be, "DSTU4145", new org.bouncycastle.jcajce.provider.asymmetric.dstu.KeyFactorySpi());
            registerOidAlgorithmParameters(configurableProvider, org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145be, "DSTU4145");
            configurableProvider.addAlgorithm("KeyPairGenerator.DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu.KeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.DSTU-4145", "DSTU4145");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.DSTU-4145-2002", "DSTU4145");
            configurableProvider.addAlgorithm("Signature.DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.DSTU-4145", "DSTU4145");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.DSTU-4145-2002", "DSTU4145");
            addSignatureAlgorithm(configurableProvider, "GOST3411", "DSTU4145LE", "org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpiLe", org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145le);
            addSignatureAlgorithm(configurableProvider, "GOST3411", "DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi", org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145be);
        }
    }
}
