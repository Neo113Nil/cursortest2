package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class OpenSSLPBKDF {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.symmetric.OpenSSLPBKDF.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getHighResolutionOutputSizeshNQ4ISI);
            sb.append("$PBKDF");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF-OPENSSL", sb.toString());
        }
    }

    public static class PBKDF extends org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
            if (!(keySpec instanceof javax.crypto.spec.PBEKeySpec)) {
                throw new java.security.spec.InvalidKeySpecException("Invalid KeySpec");
            }
            javax.crypto.spec.PBEKeySpec pBEKeySpec = (javax.crypto.spec.PBEKeySpec) keySpec;
            if (pBEKeySpec.getSalt() == null) {
                throw new java.security.spec.InvalidKeySpecException("missing required salt");
            }
            if (pBEKeySpec.getIterationCount() <= 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("positive iteration count required: ");
                sb.append(pBEKeySpec.getIterationCount());
                throw new java.security.spec.InvalidKeySpecException(sb.toString());
            }
            if (pBEKeySpec.getKeyLength() <= 0) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("positive key length required: ");
                sb2.append(pBEKeySpec.getKeyLength());
                throw new java.security.spec.InvalidKeySpecException(sb2.toString());
            }
            if (pBEKeySpec.getPassword().length == 0) {
                throw new java.lang.IllegalArgumentException("password empty");
            }
            org.bouncycastle.crypto.generators.OpenSSLPBEParametersGenerator openSSLPBEParametersGenerator = new org.bouncycastle.crypto.generators.OpenSSLPBEParametersGenerator();
            openSSLPBEParametersGenerator.init(org.bouncycastle.util.Strings.toUTF8ByteArray(pBEKeySpec.getPassword()), pBEKeySpec.getSalt());
            return new javax.crypto.spec.SecretKeySpec(((org.bouncycastle.crypto.params.KeyParameter) openSSLPBEParametersGenerator.generateDerivedParameters(pBEKeySpec.getKeyLength())).getKey(), "OpenSSLPBKDF");
        }

        public PBKDF() {
            super("PBKDF-OpenSSL", null);
        }
    }

    private OpenSSLPBKDF() {
    }
}
