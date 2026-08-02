package org.jose4j.jws;

/* loaded from: classes18.dex */
public interface JsonWebSignatureAlgorithm extends org.jose4j.jwa.Algorithm {
    org.jose4j.jwa.CryptoPrimitive prepareForSign(java.security.Key key, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException;

    byte[] sign(org.jose4j.jwa.CryptoPrimitive cryptoPrimitive, byte[] bArr) throws org.jose4j.lang.JoseException;

    void validateSigningKey(java.security.Key key) throws org.jose4j.lang.InvalidKeyException;

    void validateVerificationKey(java.security.Key key) throws org.jose4j.lang.InvalidKeyException;

    boolean verifySignature(byte[] bArr, java.security.Key key, byte[] bArr2, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException;
}
