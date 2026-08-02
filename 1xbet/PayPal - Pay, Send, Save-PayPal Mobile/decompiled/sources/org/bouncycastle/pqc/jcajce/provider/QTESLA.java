package org.bouncycastle.pqc.jcajce.provider;

/* loaded from: classes17.dex */
public class QTESLA {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.QTESLA", "org.bouncycastle.pqc.jcajce.provider.qtesla.QTESLAKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.QTESLA", "org.bouncycastle.pqc.jcajce.provider.qtesla.KeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("Signature.QTESLA", "org.bouncycastle.pqc.jcajce.provider.qtesla.SignatureSpi$qTESLA");
            addSignatureAlgorithm(configurableProvider, "QTESLA-P-I", "org.bouncycastle.pqc.jcajce.provider.qtesla.SignatureSpi$PI", org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.qTESLA_p_I);
            addSignatureAlgorithm(configurableProvider, "QTESLA-P-III", "org.bouncycastle.pqc.jcajce.provider.qtesla.SignatureSpi$PIII", org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.qTESLA_p_III);
            org.bouncycastle.pqc.jcajce.provider.qtesla.QTESLAKeyFactorySpi qTESLAKeyFactorySpi = new org.bouncycastle.pqc.jcajce.provider.qtesla.QTESLAKeyFactorySpi();
            registerOid(configurableProvider, org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.qTESLA_p_I, "QTESLA-P-I", qTESLAKeyFactorySpi);
            registerOid(configurableProvider, org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.qTESLA_p_III, "QTESLA-P-III", qTESLAKeyFactorySpi);
        }
    }
}
