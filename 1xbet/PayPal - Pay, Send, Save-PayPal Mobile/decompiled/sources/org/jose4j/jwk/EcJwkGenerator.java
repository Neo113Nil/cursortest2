package org.jose4j.jwk;

/* loaded from: classes18.dex */
public class EcJwkGenerator {
    public static org.jose4j.jwk.EllipticCurveJsonWebKey generateJwk(java.security.spec.ECParameterSpec eCParameterSpec) throws org.jose4j.lang.JoseException {
        return generateJwk(eCParameterSpec, null, null);
    }

    public static org.jose4j.jwk.EllipticCurveJsonWebKey generateJwk(java.security.spec.ECParameterSpec eCParameterSpec, java.lang.String str, java.security.SecureRandom secureRandom) throws org.jose4j.lang.JoseException {
        java.security.KeyPair generateKeyPair = new org.jose4j.keys.EcKeyUtil(str, secureRandom).generateKeyPair(eCParameterSpec);
        org.jose4j.jwk.EllipticCurveJsonWebKey ellipticCurveJsonWebKey = (org.jose4j.jwk.EllipticCurveJsonWebKey) org.jose4j.jwk.PublicJsonWebKey.Factory.newPublicJwk(generateKeyPair.getPublic());
        ellipticCurveJsonWebKey.setPrivateKey(generateKeyPair.getPrivate());
        return ellipticCurveJsonWebKey;
    }
}
