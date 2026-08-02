package com.nimbusds.jose.crypto.impl;

/* loaded from: classes10.dex */
public class RSASSA {
    public static java.security.Signature getSignerAndVerifier(com.nimbusds.jose.JWSAlgorithm jWSAlgorithm, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        java.security.Signature signerAndVerifier;
        java.security.Signature signerAndVerifier2;
        java.security.Signature signerAndVerifier3;
        java.security.Signature signerAndVerifier4;
        java.security.Signature signerAndVerifier5;
        java.security.Signature signerAndVerifier6;
        java.security.Signature signerAndVerifier7;
        java.security.Signature signerAndVerifier8;
        java.security.Signature signerAndVerifier9;
        if (jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.RS256) && (signerAndVerifier9 = getSignerAndVerifier("SHA256withRSA", provider)) != null) {
            return signerAndVerifier9;
        }
        if (jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.RS384) && (signerAndVerifier8 = getSignerAndVerifier("SHA384withRSA", provider)) != null) {
            return signerAndVerifier8;
        }
        if (jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.RS512) && (signerAndVerifier7 = getSignerAndVerifier("SHA512withRSA", provider)) != null) {
            return signerAndVerifier7;
        }
        if (jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.PS256) && (signerAndVerifier6 = getSignerAndVerifier(org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS, provider, new java.security.spec.PSSParameterSpec("SHA-256", "MGF1", java.security.spec.MGF1ParameterSpec.SHA256, 32, 1))) != null) {
            return signerAndVerifier6;
        }
        if (jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.PS256) && (signerAndVerifier5 = getSignerAndVerifier("SHA256withRSAandMGF1", provider)) != null) {
            return signerAndVerifier5;
        }
        if (jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.PS384) && (signerAndVerifier4 = getSignerAndVerifier(org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS, provider, new java.security.spec.PSSParameterSpec("SHA-384", "MGF1", java.security.spec.MGF1ParameterSpec.SHA384, 48, 1))) != null) {
            return signerAndVerifier4;
        }
        if (jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.PS384) && (signerAndVerifier3 = getSignerAndVerifier("SHA384withRSAandMGF1", provider)) != null) {
            return signerAndVerifier3;
        }
        if (jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.PS512) && (signerAndVerifier2 = getSignerAndVerifier(org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS, provider, new java.security.spec.PSSParameterSpec("SHA-512", "MGF1", java.security.spec.MGF1ParameterSpec.SHA512, 64, 1))) != null) {
            return signerAndVerifier2;
        }
        if (!jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.PS512) || (signerAndVerifier = getSignerAndVerifier("SHA512withRSAandMGF1", provider)) == null) {
            throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedJWSAlgorithm(jWSAlgorithm, com.nimbusds.jose.crypto.impl.RSASSAProvider.SUPPORTED_ALGORITHMS));
        }
        return signerAndVerifier;
    }

    private static java.security.Signature getSignerAndVerifier(java.lang.String str, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        return getSignerAndVerifier(str, provider, null);
    }

    private static java.security.Signature getSignerAndVerifier(java.lang.String str, java.security.Provider provider, java.security.spec.PSSParameterSpec pSSParameterSpec) throws com.nimbusds.jose.JOSEException {
        java.security.Signature signature;
        try {
            if (provider != null) {
                signature = java.security.Signature.getInstance(str, provider);
            } else {
                signature = java.security.Signature.getInstance(str);
            }
            if (pSSParameterSpec == null) {
                return signature;
            }
            try {
                signature.setParameter(pSSParameterSpec);
                return signature;
            } catch (java.security.InvalidAlgorithmParameterException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid RSASSA-PSS salt length parameter: ");
                sb.append(e.getMessage());
                throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
            }
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private RSASSA() {
    }
}
