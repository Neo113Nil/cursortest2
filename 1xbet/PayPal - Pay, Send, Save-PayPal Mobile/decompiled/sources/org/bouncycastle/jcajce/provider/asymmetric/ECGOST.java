package org.bouncycastle.jcajce.provider.asymmetric;

/* loaded from: classes17.dex */
public class ECGOST {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyFactorySpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.GOST-3410-2001", "ECGOST3410");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.ECGOST-3410", "ECGOST3410");
            registerOid(configurableProvider, org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001, "ECGOST3410", new org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyFactorySpi());
            registerOid(configurableProvider, org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001DH, "ECGOST3410", new org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyFactorySpi());
            registerOidAlgorithmParameters(configurableProvider, org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001, "ECGOST3410");
            configurableProvider.addAlgorithm("KeyPairGenerator.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.ECGOST-3410", "ECGOST3410");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.GOST-3410-2001", "ECGOST3410");
            configurableProvider.addAlgorithm("Signature.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.SignatureSpi");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.ECGOST-3410", "ECGOST3410");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.GOST-3410-2001", "ECGOST3410");
            configurableProvider.addAlgorithm("KeyAgreement.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyAgreementSpi$ECVKO");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Alg.Alias.KeyAgreement.");
            sb.append(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001);
            configurableProvider.addAlgorithm(sb.toString(), "ECGOST3410");
            configurableProvider.addAlgorithm("Alg.Alias.KeyAgreement.GOST-3410-2001", "ECGOST3410");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.KeyAgreement.");
            sb2.append(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_ESDH);
            configurableProvider.addAlgorithm(sb2.toString(), "ECGOST3410");
            configurableProvider.addAlgorithm("AlgorithmParameters.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ec.AlgorithmParametersSpi");
            configurableProvider.addAlgorithm("AlgorithmParameters.ECGOST3410-2012", "org.bouncycastle.jcajce.provider.asymmetric.ec.AlgorithmParametersSpi");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.GOST-3410-2001", "ECGOST3410");
            addSignatureAlgorithm(configurableProvider, "GOST3411", "ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.SignatureSpi", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001);
            configurableProvider.addAlgorithm("KeyFactory.ECGOST3410-2012", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.GOST-3410-2012", "ECGOST3410-2012");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.ECGOST-3410-2012", "ECGOST3410-2012");
            registerOid(configurableProvider, org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256, "ECGOST3410-2012", new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
            registerOid(configurableProvider, org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_256, "ECGOST3410-2012", new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
            registerOidAlgorithmParameters(configurableProvider, org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256, "ECGOST3410-2012");
            registerOid(configurableProvider, org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512, "ECGOST3410-2012", new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
            registerOid(configurableProvider, org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_512, "ECGOST3410-2012", new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
            registerOidAlgorithmParameters(configurableProvider, org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512, "ECGOST3410-2012");
            configurableProvider.addAlgorithm("KeyPairGenerator.ECGOST3410-2012", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.ECGOST3410-2012", "ECGOST3410-2012");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.GOST-3410-2012", "ECGOST3410-2012");
            configurableProvider.addAlgorithm("Signature.ECGOST3410-2012-256", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi256");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.ECGOST3410-2012-256", "ECGOST3410-2012-256");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.GOST-3410-2012-256", "ECGOST3410-2012-256");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.GOST3411WITHECGOST3410-2012-256", "ECGOST3410-2012-256");
            addSignatureAlgorithm(configurableProvider, "GOST3411-2012-256", "ECGOST3410-2012-256", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi256", org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256);
            configurableProvider.addAlgorithm("Signature.ECGOST3410-2012-512", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi512");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.ECGOST3410-2012-512", "ECGOST3410-2012-512");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.GOST-3410-2012-512", "ECGOST3410-2012-512");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.GOST3411WITHECGOST3410-2012-512", "ECGOST3410-2012-512");
            addSignatureAlgorithm(configurableProvider, "GOST3411-2012-512", "ECGOST3410-2012-512", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi512", org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512);
            configurableProvider.addAlgorithm("KeyAgreement.ECGOST3410-2012-256", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi$ECVKO256");
            configurableProvider.addAlgorithm("KeyAgreement.ECGOST3410-2012-512", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi$ECVKO512");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Alg.Alias.KeyAgreement.");
            sb3.append(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_256);
            configurableProvider.addAlgorithm(sb3.toString(), "ECGOST3410-2012-256");
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Alg.Alias.KeyAgreement.");
            sb4.append(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_512);
            configurableProvider.addAlgorithm(sb4.toString(), "ECGOST3410-2012-512");
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Alg.Alias.KeyAgreement.");
            sb5.append(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256);
            configurableProvider.addAlgorithm(sb5.toString(), "ECGOST3410-2012-256");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Alg.Alias.KeyAgreement.");
            sb6.append(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512);
            configurableProvider.addAlgorithm(sb6.toString(), "ECGOST3410-2012-512");
        }
    }
}
