package org.bouncycastle.pqc.jcajce.provider;

/* loaded from: classes17.dex */
public class XMSS {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.XMSS", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.XMSS", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("Signature.XMSS", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi$generic");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Alg.Alias.Signature.");
            sb.append(org.bouncycastle.asn1.isara.IsaraObjectIdentifiers.id_alg_xmss);
            configurableProvider.addAlgorithm(sb.toString(), "XMSS");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.Signature.OID.");
            sb2.append(org.bouncycastle.asn1.isara.IsaraObjectIdentifiers.id_alg_xmss);
            configurableProvider.addAlgorithm(sb2.toString(), "XMSS");
            addSignatureAlgorithm(configurableProvider, "XMSS-SHA256", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi$withSha256", org.bouncycastle.asn1.bc.BCObjectIdentifiers.xmss_SHA256);
            addSignatureAlgorithm(configurableProvider, "XMSS-SHAKE128", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi$withShake128", org.bouncycastle.asn1.bc.BCObjectIdentifiers.xmss_SHAKE128);
            addSignatureAlgorithm(configurableProvider, "XMSS-SHA512", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi$withSha512", org.bouncycastle.asn1.bc.BCObjectIdentifiers.xmss_SHA512);
            addSignatureAlgorithm(configurableProvider, "XMSS-SHAKE256", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi$withShake256", org.bouncycastle.asn1.bc.BCObjectIdentifiers.xmss_SHAKE256);
            addSignatureAlgorithm(configurableProvider, "SHA256", "XMSS-SHA256", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi$withSha256andPrehash", org.bouncycastle.asn1.bc.BCObjectIdentifiers.xmss_SHA256ph);
            addSignatureAlgorithm(configurableProvider, "SHAKE128", "XMSS-SHAKE128", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi$withShake128andPrehash", org.bouncycastle.asn1.bc.BCObjectIdentifiers.xmss_SHAKE128ph);
            addSignatureAlgorithm(configurableProvider, "SHA512", "XMSS-SHA512", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi$withSha512andPrehash", org.bouncycastle.asn1.bc.BCObjectIdentifiers.xmss_SHA512ph);
            addSignatureAlgorithm(configurableProvider, "SHAKE256", "XMSS-SHAKE256", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSSignatureSpi$withShake256andPrehash", org.bouncycastle.asn1.bc.BCObjectIdentifiers.xmss_SHAKE256ph);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA256WITHXMSS", "SHA256WITHXMSS-SHA256");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHAKE128WITHXMSS", "SHAKE128WITHXMSS-SHAKE128");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA512WITHXMSS", "SHA512WITHXMSS-SHA512");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHAKE256WITHXMSS", "SHAKE256WITHXMSS-SHAKE256");
            configurableProvider.addAlgorithm("KeyFactory.XMSSMT", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.XMSSMT", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("Signature.XMSSMT", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi$generic");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Alg.Alias.Signature.");
            sb3.append(org.bouncycastle.asn1.isara.IsaraObjectIdentifiers.id_alg_xmssmt);
            configurableProvider.addAlgorithm(sb3.toString(), "XMSSMT");
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Alg.Alias.Signature.OID.");
            sb4.append(org.bouncycastle.asn1.isara.IsaraObjectIdentifiers.id_alg_xmssmt);
            configurableProvider.addAlgorithm(sb4.toString(), "XMSSMT");
            addSignatureAlgorithm(configurableProvider, "XMSSMT-SHA256", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi$withSha256", org.bouncycastle.asn1.bc.BCObjectIdentifiers.xmss_mt_SHA256);
            addSignatureAlgorithm(configurableProvider, "XMSSMT-SHAKE128", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi$withShake128", org.bouncycastle.asn1.bc.BCObjectIdentifiers.xmss_mt_SHAKE128);
            addSignatureAlgorithm(configurableProvider, "XMSSMT-SHA512", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi$withSha512", org.bouncycastle.asn1.bc.BCObjectIdentifiers.xmss_mt_SHA512);
            addSignatureAlgorithm(configurableProvider, "XMSSMT-SHAKE256", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi$withShake256", org.bouncycastle.asn1.bc.BCObjectIdentifiers.xmss_mt_SHAKE256);
            addSignatureAlgorithm(configurableProvider, "SHA256", "XMSSMT-SHA256", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi$withSha256andPrehash", org.bouncycastle.asn1.bc.BCObjectIdentifiers.xmss_mt_SHA256ph);
            addSignatureAlgorithm(configurableProvider, "SHAKE128", "XMSSMT-SHAKE128", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi$withShake128andPrehash", org.bouncycastle.asn1.bc.BCObjectIdentifiers.xmss_mt_SHAKE128ph);
            addSignatureAlgorithm(configurableProvider, "SHA512", "XMSSMT-SHA512", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi$withSha512andPrehash", org.bouncycastle.asn1.bc.BCObjectIdentifiers.xmss_mt_SHA512ph);
            addSignatureAlgorithm(configurableProvider, "SHAKE256", "XMSSMT-SHAKE256", "org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTSignatureSpi$withShake256andPrehash", org.bouncycastle.asn1.bc.BCObjectIdentifiers.xmss_mt_SHAKE256ph);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA256WITHXMSSMT", "SHA256WITHXMSSMT-SHA256");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHAKE128WITHXMSSMT", "SHAKE128WITHXMSSMT-SHAKE128");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA512WITHXMSSMT", "SHA512WITHXMSSMT-SHA512");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHAKE256WITHXMSSMT", "SHAKE256WITHXMSSMT-SHAKE256");
            registerOid(configurableProvider, org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.xmss, "XMSS", new org.bouncycastle.pqc.jcajce.provider.xmss.XMSSKeyFactorySpi());
            registerOid(configurableProvider, org.bouncycastle.asn1.isara.IsaraObjectIdentifiers.id_alg_xmss, "XMSS", new org.bouncycastle.pqc.jcajce.provider.xmss.XMSSKeyFactorySpi());
            registerOid(configurableProvider, org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.xmss_mt, "XMSSMT", new org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTKeyFactorySpi());
            registerOid(configurableProvider, org.bouncycastle.asn1.isara.IsaraObjectIdentifiers.id_alg_xmssmt, "XMSSMT", new org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTKeyFactorySpi());
        }
    }
}
