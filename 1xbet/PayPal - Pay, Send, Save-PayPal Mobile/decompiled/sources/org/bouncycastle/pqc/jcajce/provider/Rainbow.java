package org.bouncycastle.pqc.jcajce.provider;

/* loaded from: classes17.dex */
public class Rainbow {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.Rainbow", "org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.Rainbow", "org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyPairGeneratorSpi");
            addSignatureAlgorithm(configurableProvider, "SHA224", "Rainbow", "org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi$withSha224", org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.rainbowWithSha224);
            addSignatureAlgorithm(configurableProvider, "SHA256", "Rainbow", "org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi$withSha256", org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.rainbowWithSha256);
            addSignatureAlgorithm(configurableProvider, "SHA384", "Rainbow", "org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi$withSha384", org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.rainbowWithSha384);
            addSignatureAlgorithm(configurableProvider, "SHA512", "Rainbow", "org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi$withSha512", org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.rainbowWithSha512);
            registerOid(configurableProvider, org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.rainbow, "Rainbow", new org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyFactorySpi());
        }
    }
}
