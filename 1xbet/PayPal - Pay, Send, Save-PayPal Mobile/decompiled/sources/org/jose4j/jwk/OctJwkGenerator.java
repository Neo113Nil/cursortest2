package org.jose4j.jwk;

/* loaded from: classes18.dex */
public class OctJwkGenerator {
    public static org.jose4j.jwk.OctetSequenceJsonWebKey generateJwk(int i) {
        return generateJwk(i, null);
    }

    public static org.jose4j.jwk.OctetSequenceJsonWebKey generateJwk(int i, java.security.SecureRandom secureRandom) {
        return new org.jose4j.jwk.OctetSequenceJsonWebKey(new org.jose4j.keys.AesKey(org.jose4j.lang.ByteUtil.randomBytes(org.jose4j.lang.ByteUtil.byteLength(i), secureRandom)));
    }
}
