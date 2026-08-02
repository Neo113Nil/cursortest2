package com.nimbusds.jose.crypto.impl;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public final class PRFParams {
    private final int dkLen;
    private final java.lang.String jcaMacAlg;
    private final java.security.Provider macProvider;

    public PRFParams(java.lang.String str, java.security.Provider provider, int i) {
        this.jcaMacAlg = str;
        this.macProvider = provider;
        this.dkLen = i;
    }

    public final java.lang.String getMACAlgorithm() {
        return this.jcaMacAlg;
    }

    public final java.security.Provider getMacProvider() {
        return this.macProvider;
    }

    public final int getDerivedKeyByteLength() {
        return this.dkLen;
    }

    public static com.nimbusds.jose.crypto.impl.PRFParams resolve(com.nimbusds.jose.JWEAlgorithm jWEAlgorithm, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        java.lang.String str;
        int i;
        if (com.nimbusds.jose.JWEAlgorithm.PBES2_HS256_A128KW.equals(jWEAlgorithm)) {
            str = org.jose4j.mac.MacUtil.HMAC_SHA256;
            i = 16;
        } else if (com.nimbusds.jose.JWEAlgorithm.PBES2_HS384_A192KW.equals(jWEAlgorithm)) {
            str = org.jose4j.mac.MacUtil.HMAC_SHA384;
            i = 24;
        } else if (com.nimbusds.jose.JWEAlgorithm.PBES2_HS512_A256KW.equals(jWEAlgorithm)) {
            str = org.jose4j.mac.MacUtil.HMAC_SHA512;
            i = 32;
        } else {
            throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedJWEAlgorithm(jWEAlgorithm, com.nimbusds.jose.crypto.impl.PasswordBasedCryptoProvider.SUPPORTED_ALGORITHMS));
        }
        return new com.nimbusds.jose.crypto.impl.PRFParams(str, provider, i);
    }
}
