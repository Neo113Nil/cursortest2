package org.jose4j.jws;

/* loaded from: classes18.dex */
public class UnsecuredNoneAlgorithm extends org.jose4j.jwa.AlgorithmInfo implements org.jose4j.jws.JsonWebSignatureAlgorithm {
    @Override // org.jose4j.jwa.Algorithm
    public boolean isAvailable() {
        return true;
    }

    public UnsecuredNoneAlgorithm() {
        setAlgorithmIdentifier("none");
        setKeyPersuasion(org.jose4j.keys.KeyPersuasion.NONE);
    }

    @Override // org.jose4j.jws.JsonWebSignatureAlgorithm
    public boolean verifySignature(byte[] bArr, java.security.Key key, byte[] bArr2, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        if (key == null) {
            return bArr.length == 0;
        }
        throw new org.jose4j.lang.InvalidKeyException("JWS Plaintext (alg=none) must not use a key.");
    }

    @Override // org.jose4j.jws.JsonWebSignatureAlgorithm
    public byte[] sign(org.jose4j.jwa.CryptoPrimitive cryptoPrimitive, byte[] bArr) {
        return org.jose4j.lang.ByteUtil.EMPTY_BYTES;
    }

    @Override // org.jose4j.jws.JsonWebSignatureAlgorithm
    public org.jose4j.jwa.CryptoPrimitive prepareForSign(java.security.Key key, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        if (key == null) {
            return null;
        }
        throw new org.jose4j.lang.InvalidKeyException("JWS Plaintext (alg=none) must not use a key.");
    }

    @Override // org.jose4j.jws.JsonWebSignatureAlgorithm
    public void validateSigningKey(java.security.Key key) throws org.jose4j.lang.InvalidKeyException {
        if (key != null) {
            throw new org.jose4j.lang.InvalidKeyException("JWS Plaintext (alg=none) must not use a key.");
        }
    }

    @Override // org.jose4j.jws.JsonWebSignatureAlgorithm
    public void validateVerificationKey(java.security.Key key) throws org.jose4j.lang.InvalidKeyException {
        if (key != null) {
            throw new org.jose4j.lang.InvalidKeyException("JWS Plaintext (alg=none) must not use a key.");
        }
    }
}
