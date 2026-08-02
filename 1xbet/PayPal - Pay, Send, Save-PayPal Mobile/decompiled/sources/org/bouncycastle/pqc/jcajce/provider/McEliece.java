package org.bouncycastle.pqc.jcajce.provider;

/* loaded from: classes17.dex */
public class McEliece {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyPairGenerator.McElieceKobaraImai", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.McEliecePointcheval", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.McElieceFujisaki", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.McEliece", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.McEliece-CCA2", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyFactory.McElieceKobaraImai", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyFactorySpi");
            configurableProvider.addAlgorithm("KeyFactory.McEliecePointcheval", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyFactorySpi");
            configurableProvider.addAlgorithm("KeyFactory.McElieceFujisaki", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyFactorySpi");
            configurableProvider.addAlgorithm("KeyFactory.McEliece", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyFactory.McEliece-CCA2", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyFactorySpi");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("KeyFactory.");
            sb.append(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.mcElieceCca2);
            configurableProvider.addAlgorithm(sb.toString(), "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyFactorySpi");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("KeyFactory.");
            sb2.append(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.mcEliece);
            configurableProvider.addAlgorithm(sb2.toString(), "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyFactorySpi");
            configurableProvider.addAlgorithm("Cipher.McEliece", "org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePKCSCipherSpi$McEliecePKCS");
            configurableProvider.addAlgorithm("Cipher.McEliecePointcheval", "org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi$McEliecePointcheval");
            configurableProvider.addAlgorithm("Cipher.McElieceKobaraImai", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi$McElieceKobaraImai");
            configurableProvider.addAlgorithm("Cipher.McElieceFujisaki", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi$McElieceFujisaki");
        }
    }
}
