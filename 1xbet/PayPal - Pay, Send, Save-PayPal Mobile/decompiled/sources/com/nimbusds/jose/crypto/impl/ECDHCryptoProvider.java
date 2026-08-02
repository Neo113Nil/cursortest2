package com.nimbusds.jose.crypto.impl;

/* loaded from: classes10.dex */
public abstract class ECDHCryptoProvider extends com.nimbusds.jose.crypto.impl.BaseJWEProvider {
    public static final java.util.Set<com.nimbusds.jose.JWEAlgorithm> SUPPORTED_ALGORITHMS;
    public static final java.util.Set<com.nimbusds.jose.EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS = com.nimbusds.jose.crypto.impl.ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS;
    private final com.nimbusds.jose.crypto.impl.ConcatKDF concatKDF;
    private final com.nimbusds.jose.jwk.Curve curve;

    public abstract java.util.Set<com.nimbusds.jose.jwk.Curve> supportedEllipticCurves();

    static {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.ECDH_ES);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.ECDH_ES_A128KW);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.ECDH_ES_A192KW);
        linkedHashSet.add(com.nimbusds.jose.JWEAlgorithm.ECDH_ES_A256KW);
        SUPPORTED_ALGORITHMS = java.util.Collections.unmodifiableSet(linkedHashSet);
    }

    public ECDHCryptoProvider(com.nimbusds.jose.jwk.Curve curve, javax.crypto.SecretKey secretKey) throws com.nimbusds.jose.JOSEException {
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
        com.nimbusds.jose.util.Base64URL encode;
        javax.crypto.SecretKey secretKey2;
        com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode resolveAlgorithmMode = com.nimbusds.jose.crypto.impl.ECDH.resolveAlgorithmMode(com.nimbusds.jose.crypto.impl.JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader));
        com.nimbusds.jose.EncryptionMethod encryptionMethod = jWEHeader.getEncryptionMethod();
        getConcatKDF().getJCAContext().setProvider(getJCAContext().getMACProvider());
        javax.crypto.SecretKey deriveSharedKey = com.nimbusds.jose.crypto.impl.ECDH.deriveSharedKey(jWEHeader, secretKey, getConcatKDF());
        if (resolveAlgorithmMode.equals(com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode.DIRECT)) {
            if (isCEKProvided()) {
                throw new com.nimbusds.jose.JOSEException("The provided CEK is not supported");
            }
            secretKey2 = deriveSharedKey;
            encode = null;
        } else if (resolveAlgorithmMode.equals(com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode.KW)) {
            javax.crypto.SecretKey cek = getCEK(encryptionMethod);
            encode = com.nimbusds.jose.util.Base64URL.encode(com.nimbusds.jose.crypto.impl.AESKW.wrapCEK(cek, deriveSharedKey, getJCAContext().getKeyEncryptionProvider()));
            secretKey2 = cek;
        } else {
            throw new com.nimbusds.jose.JOSEException("Unexpected JWE ECDH algorithm mode: ".concat(java.lang.String.valueOf(resolveAlgorithmMode)));
        }
        return com.nimbusds.jose.crypto.impl.ContentCryptoProvider.encrypt(jWEHeader, bArr, bArr2, secretKey2, encode, getJCAContext());
    }

    protected byte[] decryptWithZ(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr, javax.crypto.SecretKey secretKey, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode resolveAlgorithmMode = com.nimbusds.jose.crypto.impl.ECDH.resolveAlgorithmMode(com.nimbusds.jose.crypto.impl.JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader));
        getConcatKDF().getJCAContext().setProvider(getJCAContext().getMACProvider());
        javax.crypto.SecretKey deriveSharedKey = com.nimbusds.jose.crypto.impl.ECDH.deriveSharedKey(jWEHeader, secretKey, getConcatKDF());
        if (!resolveAlgorithmMode.equals(com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode.DIRECT)) {
            if (!resolveAlgorithmMode.equals(com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode.KW)) {
                throw new com.nimbusds.jose.JOSEException("Unexpected JWE ECDH algorithm mode: ".concat(java.lang.String.valueOf(resolveAlgorithmMode)));
            }
            if (base64URL == null) {
                throw new com.nimbusds.jose.JOSEException("Missing JWE encrypted key");
            }
            deriveSharedKey = com.nimbusds.jose.crypto.impl.AESKW.unwrapCEK(deriveSharedKey, base64URL.decode(), getJCAContext().getKeyEncryptionProvider());
        }
        return com.nimbusds.jose.crypto.impl.ContentCryptoProvider.decrypt(jWEHeader, bArr, base64URL, base64URL2, base64URL3, base64URL4, deriveSharedKey, getJCAContext());
    }
}
