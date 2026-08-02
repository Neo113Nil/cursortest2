package com.nimbusds.jose.crypto.impl;

/* loaded from: classes10.dex */
public class RSAKeyUtils {
    public static java.security.PrivateKey toRSAPrivateKey(com.nimbusds.jose.jwk.RSAKey rSAKey) throws com.nimbusds.jose.JOSEException {
        if (!rSAKey.isPrivate()) {
            throw new com.nimbusds.jose.JOSEException("The RSA JWK doesn't contain a private part");
        }
        return rSAKey.toPrivateKey();
    }

    public static int keyBitLength(java.security.PrivateKey privateKey) {
        if (!(privateKey instanceof java.security.interfaces.RSAPrivateKey)) {
            return -1;
        }
        try {
            return ((java.security.interfaces.RSAPrivateKey) privateKey).getModulus().bitLength();
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }
}
