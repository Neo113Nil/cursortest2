package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public class SCRYPT {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoSizes = org.bouncycastle.jcajce.provider.symmetric.SCRYPT.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoSizes;
            sb.append(str);
            sb.append("$ScryptWithUTF8");
            configurableProvider.addAlgorithm("SecretKeyFactory.SCRYPT", sb.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_scrypt;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$ScryptWithUTF8");
            configurableProvider.addAlgorithm("SecretKeyFactory", aSN1ObjectIdentifier, sb2.toString());
        }
    }

    public static class BasePBKDF2 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory {
        private int getHighResolutionOutputSizeshNQ4ISI;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
            if (!(keySpec instanceof org.bouncycastle.jcajce.spec.ScryptKeySpec)) {
                throw new java.security.spec.InvalidKeySpecException("Invalid KeySpec");
            }
            org.bouncycastle.jcajce.spec.ScryptKeySpec scryptKeySpec = (org.bouncycastle.jcajce.spec.ScryptKeySpec) keySpec;
            if (scryptKeySpec.getSalt() == null) {
                throw new java.lang.IllegalArgumentException("Salt S must be provided.");
            }
            if (scryptKeySpec.getCostParameter() <= 1) {
                throw new java.lang.IllegalArgumentException("Cost parameter N must be > 1.");
            }
            if (scryptKeySpec.getKeyLength() <= 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("positive key length required: ");
                sb.append(scryptKeySpec.getKeyLength());
                throw new java.security.spec.InvalidKeySpecException(sb.toString());
            }
            if (scryptKeySpec.getPassword().length == 0) {
                throw new java.lang.IllegalArgumentException("password empty");
            }
            return new org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey(this.algName, new org.bouncycastle.crypto.params.KeyParameter(org.bouncycastle.crypto.generators.SCrypt.generate(org.bouncycastle.crypto.PasswordConverter.UTF8.convert(scryptKeySpec.getPassword()), scryptKeySpec.getSalt(), scryptKeySpec.getCostParameter(), scryptKeySpec.getBlockSize(), scryptKeySpec.getParallelizationParameter(), scryptKeySpec.getKeyLength() / 8)));
        }

        public BasePBKDF2(java.lang.String str, int i) {
            super(str, org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_scrypt);
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }
    }

    public static class ScryptWithUTF8 extends org.bouncycastle.jcajce.provider.symmetric.SCRYPT.BasePBKDF2 {
        public ScryptWithUTF8() {
            super("SCRYPT", 5);
        }
    }

    private SCRYPT() {
    }
}
