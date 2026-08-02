package org.jose4j.jwk;

/* loaded from: classes18.dex */
public class OkpJwkGenerator {
    public static org.jose4j.jwk.OctetKeyPairJsonWebKey generateJwk(java.lang.String str) throws org.jose4j.lang.JoseException {
        return generateJwk(str, null, null);
    }

    public static org.jose4j.jwk.OctetKeyPairJsonWebKey generateJwk(java.lang.String str, java.lang.String str2, java.security.SecureRandom secureRandom) throws org.jose4j.lang.JoseException {
        org.jose4j.keys.OctetKeyPairUtil octetKeyPairUtil = org.jose4j.keys.OctetKeyPairUtil.getOctetKeyPairUtil(str, str2, secureRandom);
        if (octetKeyPairUtil == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot create OKP JWK. The subtype/crv \"");
            sb.append(str);
            sb.append("\" is unknown or unsupported.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.security.KeyPair generateKeyPair = octetKeyPairUtil.generateKeyPair(str);
        org.jose4j.jwk.OctetKeyPairJsonWebKey octetKeyPairJsonWebKey = (org.jose4j.jwk.OctetKeyPairJsonWebKey) org.jose4j.jwk.PublicJsonWebKey.Factory.newPublicJwk(generateKeyPair.getPublic());
        octetKeyPairJsonWebKey.setPrivateKey(generateKeyPair.getPrivate());
        return octetKeyPairJsonWebKey;
    }
}
