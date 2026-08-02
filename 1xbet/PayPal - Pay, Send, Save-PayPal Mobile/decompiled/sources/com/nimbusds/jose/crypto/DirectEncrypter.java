package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class DirectEncrypter extends com.nimbusds.jose.crypto.impl.DirectCryptoProvider implements com.nimbusds.jose.JWEEncrypter {
    public DirectEncrypter(javax.crypto.SecretKey secretKey) throws com.nimbusds.jose.KeyLengthException {
        super(secretKey);
    }

    public DirectEncrypter(byte[] bArr) throws com.nimbusds.jose.KeyLengthException {
        this(new javax.crypto.spec.SecretKeySpec(bArr, org.jose4j.keys.AesKey.ALGORITHM));
    }

    public DirectEncrypter(com.nimbusds.jose.jwk.OctetSequenceKey octetSequenceKey) throws com.nimbusds.jose.KeyLengthException {
        this(octetSequenceKey.toSecretKey(org.jose4j.keys.AesKey.ALGORITHM));
    }

    @java.lang.Deprecated
    public com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr) throws com.nimbusds.jose.JOSEException {
        return encrypt(jWEHeader, bArr, com.nimbusds.jose.crypto.impl.AAD.compute(jWEHeader));
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr, byte[] bArr2) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.JWEAlgorithm algorithmAndEnsureNotNull = com.nimbusds.jose.crypto.impl.JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader);
        if (!algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.DIR)) {
            throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedJWEAlgorithm(algorithmAndEnsureNotNull, SUPPORTED_ALGORITHMS));
        }
        return com.nimbusds.jose.crypto.impl.ContentCryptoProvider.encrypt(jWEHeader, bArr, bArr2, getKey(), null, getJCAContext());
    }
}
