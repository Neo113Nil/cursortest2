package org.jose4j.jwk;

/* loaded from: classes18.dex */
public class RsaJwkGenerator {
    public static org.jose4j.jwk.RsaJsonWebKey generateJwk(int i) throws org.jose4j.lang.JoseException {
        return generateJwk(i, null, null);
    }

    public static org.jose4j.jwk.RsaJsonWebKey generateJwk(int i, java.lang.String str, java.security.SecureRandom secureRandom) throws org.jose4j.lang.JoseException {
        java.security.KeyPair generateKeyPair = new org.jose4j.keys.RsaKeyUtil(str, secureRandom).generateKeyPair(i);
        org.jose4j.jwk.RsaJsonWebKey rsaJsonWebKey = (org.jose4j.jwk.RsaJsonWebKey) org.jose4j.jwk.PublicJsonWebKey.Factory.newPublicJwk(generateKeyPair.getPublic());
        rsaJsonWebKey.setPrivateKey(generateKeyPair.getPrivate());
        return rsaJsonWebKey;
    }
}
