package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class RSAEncrypter extends com.nimbusds.jose.crypto.impl.RSACryptoProvider implements com.nimbusds.jose.JWEEncrypter {
    private final java.security.interfaces.RSAPublicKey publicKey;

    public RSAEncrypter(java.security.interfaces.RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, null);
    }

    public RSAEncrypter(com.nimbusds.jose.jwk.RSAKey rSAKey) throws com.nimbusds.jose.JOSEException {
        this(rSAKey.toRSAPublicKey());
    }

    public RSAEncrypter(java.security.interfaces.RSAPublicKey rSAPublicKey, javax.crypto.SecretKey secretKey) {
        super(secretKey);
        if (rSAPublicKey == null) {
            throw new java.lang.IllegalArgumentException("The public RSA key must not be null");
        }
        this.publicKey = rSAPublicKey;
    }

    public java.security.interfaces.RSAPublicKey getPublicKey() {
        return this.publicKey;
    }

    @java.lang.Deprecated
    public com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr) throws com.nimbusds.jose.JOSEException {
        return encrypt(jWEHeader, bArr, com.nimbusds.jose.crypto.impl.AAD.compute(jWEHeader));
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr, byte[] bArr2) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.util.Base64URL encode;
        com.nimbusds.jose.JWEAlgorithm algorithmAndEnsureNotNull = com.nimbusds.jose.crypto.impl.JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader);
        javax.crypto.SecretKey cek = getCEK(jWEHeader.getEncryptionMethod());
        if (algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.RSA1_5)) {
            encode = com.nimbusds.jose.util.Base64URL.encode(com.nimbusds.jose.crypto.impl.RSA1_5.encryptCEK(this.publicKey, cek, getJCAContext().getKeyEncryptionProvider()));
        } else if (algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP)) {
            encode = com.nimbusds.jose.util.Base64URL.encode(com.nimbusds.jose.crypto.impl.RSA_OAEP.encryptCEK(this.publicKey, cek, getJCAContext().getKeyEncryptionProvider()));
        } else if (algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP_256)) {
            encode = com.nimbusds.jose.util.Base64URL.encode(com.nimbusds.jose.crypto.impl.RSA_OAEP_SHA2.encryptCEK(this.publicKey, cek, 256, getJCAContext().getKeyEncryptionProvider()));
        } else if (algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP_384)) {
            encode = com.nimbusds.jose.util.Base64URL.encode(com.nimbusds.jose.crypto.impl.RSA_OAEP_SHA2.encryptCEK(this.publicKey, cek, 384, getJCAContext().getKeyEncryptionProvider()));
        } else if (algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP_512)) {
            encode = com.nimbusds.jose.util.Base64URL.encode(com.nimbusds.jose.crypto.impl.RSA_OAEP_SHA2.encryptCEK(this.publicKey, cek, 512, getJCAContext().getKeyEncryptionProvider()));
        } else {
            throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedJWEAlgorithm(algorithmAndEnsureNotNull, SUPPORTED_ALGORITHMS));
        }
        return com.nimbusds.jose.crypto.impl.ContentCryptoProvider.encrypt(jWEHeader, bArr, bArr2, cek, encode, getJCAContext());
    }
}
