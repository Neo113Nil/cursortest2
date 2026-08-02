package com.visa.cbp.sdk.facade;

/* loaded from: classes16.dex */
public class CryptoCredentialHeader {
    private java.lang.String kid;
    private java.lang.String alg = org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_P256_CURVE_AND_SHA256;
    private java.lang.String typ = "JOSE+ext_crypto_credential";

    public CryptoCredentialHeader(java.lang.String str) {
        this.kid = str;
    }
}
