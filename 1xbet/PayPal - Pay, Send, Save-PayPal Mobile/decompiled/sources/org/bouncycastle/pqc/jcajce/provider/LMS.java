package org.bouncycastle.pqc.jcajce.provider;

/* loaded from: classes17.dex */
public class LMS {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.LMS", "org.bouncycastle.pqc.jcajce.provider.lms.LMSKeyFactorySpi");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Alg.Alias.KeyFactory.");
            sb.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_hss_lms_hashsig);
            configurableProvider.addAlgorithm(sb.toString(), "LMS");
            configurableProvider.addAlgorithm("KeyPairGenerator.LMS", "org.bouncycastle.pqc.jcajce.provider.lms.LMSKeyPairGeneratorSpi");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.KeyPairGenerator.");
            sb2.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_hss_lms_hashsig);
            configurableProvider.addAlgorithm(sb2.toString(), "LMS");
            configurableProvider.addAlgorithm("Signature.LMS", "org.bouncycastle.pqc.jcajce.provider.lms.LMSSignatureSpi$generic");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Alg.Alias.Signature.");
            sb3.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_hss_lms_hashsig);
            configurableProvider.addAlgorithm(sb3.toString(), "LMS");
        }
    }
}
