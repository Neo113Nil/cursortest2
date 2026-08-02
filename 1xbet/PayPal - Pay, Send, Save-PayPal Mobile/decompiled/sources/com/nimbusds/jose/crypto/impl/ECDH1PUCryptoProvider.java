package com.nimbusds.jose.crypto.impl;

/* loaded from: classes10.dex */
public abstract class ECDH1PUCryptoProvider extends com.nimbusds.jose.crypto.impl.BaseJWEProvider {
    public static final java.util.Set<com.nimbusds.jose.JWEAlgorithm> SUPPORTED_ALGORITHMS;
    public static final java.util.Set<com.nimbusds.jose.EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS = com.nimbusds.jose.crypto.impl.ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS;
    private final com.nimbusds.jose.crypto.impl.ConcatKDF concatKDF;
    private final com.nimbusds.jose.jwk.Curve curve;

    public abstract java.util.Set<com.nimbusds.jose.jwk.Curve> supportedEllipticCurves();

    static {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.ECDH_1PU);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.ECDH_1PU_A128KW);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.ECDH_1PU_A192KW);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.ECDH_1PU_A256KW);
        SUPPORTED_ALGORITHMS = java.util.Collections.unmodifiableSet(linkedHashSet);
    }

    public ECDH1PUCryptoProvider(com.nimbusds.jose.jwk.Curve curve, javax.crypto.SecretKey secretKey) throws com.nimbusds.jose.JOSEException {
        super(SUPPORTED_ALGORITHMS, com.nimbusds.jose.crypto.impl.ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS, secretKey);
        com.nimbusds.jose.jwk.Curve curve2 = curve != null ? curve : new com.nimbusds.jose.jwk.Curve("unknown");
        if (!supportedEllipticCurves().contains(curve)) {
            throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedEllipticCurve(curve2, supportedEllipticCurves()));
        }
        this.curve = curve;
        this.concatKDF = new com.nimbusds.jose.crypto.impl.ConcatKDF("SHA-256");
    }

    protected com.nimbusds.jose.crypto.impl.ConcatKDF getConcatKDF() {
        return this.concatKDF;
    }

    public com.nimbusds.jose.jwk.Curve getCurve() {
        return this.curve;
    }

    protected com.nimbusds.jose.JWECryptoParts encryptWithZ(com.nimbusds.jose.JWEHeader jWEHeader, javax.crypto.SecretKey secretKey, byte[] bArr, byte[] bArr2) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode resolveAlgorithmMode = com.nimbusds.jose.crypto.impl.ECDH1PU.resolveAlgorithmMode(com.nimbusds.jose.crypto.impl.JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader));
        com.nimbusds.jose.EncryptionMethod encryptionMethod = jWEHeader.getEncryptionMethod();
        if (resolveAlgorithmMode.equals(com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode.DIRECT)) {
            if (isCEKProvided()) {
                throw new com.nimbusds.jose.JOSEException("The provided CEK is not supported");
            }
            getConcatKDF().getJCAContext().setProvider(getJCAContext().getMACProvider());
            return com.nimbusds.jose.crypto.impl.ContentCryptoProvider.encrypt(jWEHeader, bArr, bArr2, com.nimbusds.jose.crypto.impl.ECDH1PU.deriveSharedKey(jWEHeader, secretKey, getConcatKDF()), null, getJCAContext());
        }
        if (resolveAlgorithmMode.equals(com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode.KW)) {
            if (!com.nimbusds.jose.EncryptionMethod.Family.AES_CBC_HMAC_SHA.contains(encryptionMethod)) {
                throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedEncryptionMethod(jWEHeader.getEncryptionMethod(), com.nimbusds.jose.EncryptionMethod.Family.AES_CBC_HMAC_SHA));
            }
            javax.crypto.SecretKey cek = getCEK(encryptionMethod);
            com.nimbusds.jose.JWECryptoParts encrypt = com.nimbusds.jose.crypto.impl.ContentCryptoProvider.encrypt(jWEHeader, bArr, bArr2, cek, null, getJCAContext());
            return new com.nimbusds.jose.JWECryptoParts(jWEHeader, com.nimbusds.jose.util.Base64URL.encode(com.nimbusds.jose.crypto.impl.AESKW.wrapCEK(cek, com.nimbusds.jose.crypto.impl.ECDH1PU.deriveSharedKey(jWEHeader, secretKey, encrypt.getAuthenticationTag(), getConcatKDF()), getJCAContext().getKeyEncryptionProvider())), encrypt.getInitializationVector(), encrypt.getCipherText(), encrypt.getAuthenticationTag());
        }
        throw new com.nimbusds.jose.JOSEException("Unexpected JWE ECDH algorithm mode: ".concat(java.lang.String.valueOf(resolveAlgorithmMode)));
    }

    protected byte[] decryptWithZ(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr, javax.crypto.SecretKey secretKey, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4) throws com.nimbusds.jose.JOSEException {
        javax.crypto.SecretKey unwrapCEK;
        com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode resolveAlgorithmMode = com.nimbusds.jose.crypto.impl.ECDH1PU.resolveAlgorithmMode(com.nimbusds.jose.crypto.impl.JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader));
        getConcatKDF().getJCAContext().setProvider(getJCAContext().getMACProvider());
        if (resolveAlgorithmMode.equals(com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode.DIRECT)) {
            unwrapCEK = com.nimbusds.jose.crypto.impl.ECDH1PU.deriveSharedKey(jWEHeader, secretKey, getConcatKDF());
        } else {
            if (!resolveAlgorithmMode.equals(com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode.KW)) {
                throw new com.nimbusds.jose.JOSEException("Unexpected JWE ECDH algorithm mode: ".concat(java.lang.String.valueOf(resolveAlgorithmMode)));
            }
            if (base64URL == null) {
                throw new com.nimbusds.jose.JOSEException("Missing JWE encrypted key");
            }
            unwrapCEK = com.nimbusds.jose.crypto.impl.AESKW.unwrapCEK(com.nimbusds.jose.crypto.impl.ECDH1PU.deriveSharedKey(jWEHeader, secretKey, base64URL4, getConcatKDF()), base64URL.decode(), getJCAContext().getKeyEncryptionProvider());
        }
        return com.nimbusds.jose.crypto.impl.ContentCryptoProvider.decrypt(jWEHeader, bArr, null, base64URL2, base64URL3, base64URL4, unwrapCEK, getJCAContext());
    }
}
