package org.jose4j.jws;

/* loaded from: classes18.dex */
public class RsaUsingShaAlgorithm extends org.jose4j.jws.BaseSignatureAlgorithm implements org.jose4j.jws.JsonWebSignatureAlgorithm {
    public static final java.lang.String RSASSA_PSS = "RSASSA-PSS";

    public RsaUsingShaAlgorithm(java.lang.String str, java.lang.String str2) {
        super(str, str2, "RSA");
    }

    @Override // org.jose4j.jws.BaseSignatureAlgorithm
    public void validatePublicKey(java.security.PublicKey publicKey) throws org.jose4j.lang.InvalidKeyException {
        org.jose4j.jwx.KeyValidationSupport.checkRsaKeySize(publicKey);
    }

    @Override // org.jose4j.jws.BaseSignatureAlgorithm
    public void validatePrivateKey(java.security.PrivateKey privateKey) throws org.jose4j.lang.InvalidKeyException {
        org.jose4j.jwx.KeyValidationSupport.checkRsaKeySize(privateKey);
    }

    public static class RsaSha256 extends org.jose4j.jws.RsaUsingShaAlgorithm {
        public RsaSha256() {
            super(org.jose4j.jws.AlgorithmIdentifiers.RSA_USING_SHA256, "SHA256withRSA");
        }
    }

    public static class RsaSha384 extends org.jose4j.jws.RsaUsingShaAlgorithm {
        public RsaSha384() {
            super(org.jose4j.jws.AlgorithmIdentifiers.RSA_USING_SHA384, "SHA384withRSA");
        }
    }

    public static class RsaSha512 extends org.jose4j.jws.RsaUsingShaAlgorithm {
        public RsaSha512() {
            super(org.jose4j.jws.AlgorithmIdentifiers.RSA_USING_SHA512, "SHA512withRSA");
        }
    }

    public static class RsaPssSha256 extends org.jose4j.jws.RsaUsingShaAlgorithm {
        public RsaPssSha256() {
            super(org.jose4j.jws.AlgorithmIdentifiers.RSA_PSS_USING_SHA256, (!java.security.Security.getAlgorithms("Signature").contains(org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS) || java.lang.Boolean.getBoolean("org.jose4j.jws.use-legacy-rsapss-alg-names")) ? "SHA256withRSAandMGF1" : org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS);
            if (getJavaAlgorithm().equals(org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS)) {
                java.security.spec.MGF1ParameterSpec mGF1ParameterSpec = java.security.spec.MGF1ParameterSpec.SHA256;
                setAlgorithmParameterSpec(new java.security.spec.PSSParameterSpec(mGF1ParameterSpec.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec, 32, 1));
            }
        }
    }

    public static class RsaPssSha384 extends org.jose4j.jws.RsaUsingShaAlgorithm {
        public RsaPssSha384() {
            super(org.jose4j.jws.AlgorithmIdentifiers.RSA_PSS_USING_SHA384, (!java.security.Security.getAlgorithms("Signature").contains(org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS) || java.lang.Boolean.getBoolean("org.jose4j.jws.use-legacy-rsapss-alg-names")) ? "SHA384withRSAandMGF1" : org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS);
            if (getJavaAlgorithm().equals(org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS)) {
                java.security.spec.MGF1ParameterSpec mGF1ParameterSpec = java.security.spec.MGF1ParameterSpec.SHA384;
                setAlgorithmParameterSpec(new java.security.spec.PSSParameterSpec(mGF1ParameterSpec.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec, 48, 1));
            }
        }
    }

    public static class RsaPssSha512 extends org.jose4j.jws.RsaUsingShaAlgorithm {
        public RsaPssSha512() {
            super(org.jose4j.jws.AlgorithmIdentifiers.RSA_PSS_USING_SHA512, (!java.security.Security.getAlgorithms("Signature").contains(org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS) || java.lang.Boolean.getBoolean("org.jose4j.jws.use-legacy-rsapss-alg-names")) ? "SHA512withRSAandMGF1" : org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS);
            if (getJavaAlgorithm().equals(org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS)) {
                java.security.spec.MGF1ParameterSpec mGF1ParameterSpec = java.security.spec.MGF1ParameterSpec.SHA512;
                setAlgorithmParameterSpec(new java.security.spec.PSSParameterSpec(mGF1ParameterSpec.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec, 64, 1));
            }
        }
    }
}
