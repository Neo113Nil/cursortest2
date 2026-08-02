package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class MultiDecrypter extends com.nimbusds.jose.crypto.impl.MultiCryptoProvider implements com.nimbusds.jose.JWEDecrypter, com.nimbusds.jose.CriticalHeaderParamsAware {
    private final com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral critPolicy;
    private final com.nimbusds.jose.jwk.JWK jwk;
    private final java.lang.String kid;
    private final com.nimbusds.jose.util.Base64URL thumbprint;
    private final java.util.List<com.nimbusds.jose.util.Base64> x5c;
    private final com.nimbusds.jose.util.Base64URL x5t;
    private final com.nimbusds.jose.util.Base64URL x5t256;
    private final java.net.URI x5u;

    public MultiDecrypter(com.nimbusds.jose.jwk.JWK jwk) throws com.nimbusds.jose.JOSEException, com.nimbusds.jose.KeyLengthException {
        this(jwk, null);
    }

    public MultiDecrypter(com.nimbusds.jose.jwk.JWK jwk, java.util.Set<java.lang.String> set) throws com.nimbusds.jose.JOSEException, com.nimbusds.jose.KeyLengthException {
        super(null);
        com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral();
        this.critPolicy = criticalHeaderParamsDeferral;
        if (jwk == null) {
            throw new java.lang.IllegalArgumentException("The private key (JWK) must not be null");
        }
        this.jwk = jwk;
        this.kid = jwk.getKeyID();
        this.x5c = jwk.getX509CertChain();
        this.x5u = jwk.getX509CertURL();
        this.x5t = jwk.getX509CertThumbprint();
        this.x5t256 = jwk.getX509CertSHA256Thumbprint();
        this.thumbprint = jwk.computeThumbprint();
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public java.util.Set<java.lang.String> getProcessedCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public java.util.Set<java.lang.String> getDeferredCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    private boolean jwkMatched(com.nimbusds.jose.JWEHeader jWEHeader) throws com.nimbusds.jose.JOSEException {
        if (this.thumbprint.toString().equals(jWEHeader.getKeyID())) {
            return true;
        }
        com.nimbusds.jose.jwk.JWK jwk = jWEHeader.getJWK();
        if (jwk != null && this.thumbprint.equals(jwk.computeThumbprint())) {
            return true;
        }
        java.net.URI uri = this.x5u;
        if (uri != null && uri.equals(jWEHeader.getX509CertURL())) {
            return true;
        }
        com.nimbusds.jose.util.Base64URL base64URL = this.x5t;
        if (base64URL != null && base64URL.equals(jWEHeader.getX509CertThumbprint())) {
            return true;
        }
        com.nimbusds.jose.util.Base64URL base64URL2 = this.x5t256;
        if (base64URL2 != null && base64URL2.equals(jWEHeader.getX509CertSHA256Thumbprint())) {
            return true;
        }
        java.util.List x509CertChain = jWEHeader.getX509CertChain();
        java.util.List<com.nimbusds.jose.util.Base64> list = this.x5c;
        if (list != null && x509CertChain != null && list.containsAll(x509CertChain) && x509CertChain.containsAll(this.x5c)) {
            return true;
        }
        java.lang.String str = this.kid;
        return str != null && str.equals(jWEHeader.getKeyID());
    }

    @java.lang.Deprecated
    public byte[] decrypt(com.nimbusds.jose.JWEHeader jWEHeader, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4) throws com.nimbusds.jose.JOSEException {
        return decrypt(jWEHeader, base64URL, base64URL2, base64URL3, base64URL4, com.nimbusds.jose.crypto.impl.AAD.compute(jWEHeader));
    }

    @Override // com.nimbusds.jose.JWEDecrypter
    public byte[] decrypt(com.nimbusds.jose.JWEHeader jWEHeader, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, byte[] bArr) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.JWEObjectJSON.Recipient recipient;
        com.nimbusds.jose.JWEDecrypter x25519Decrypter;
        if (base64URL2 == null) {
            throw new com.nimbusds.jose.JOSEException("Unexpected present JWE initialization vector (IV)");
        }
        if (base64URL4 == null) {
            throw new com.nimbusds.jose.JOSEException("Missing JWE authentication tag");
        }
        if (bArr == null) {
            throw new com.nimbusds.jose.JOSEException("Missing JWE additional authenticated data (AAD)");
        }
        com.nimbusds.jose.jwk.KeyType keyType = this.jwk.getKeyType();
        java.util.Set<java.lang.String> deferredCriticalHeaderParams = this.critPolicy.getDeferredCriticalHeaderParams();
        com.nimbusds.jose.JWEHeader jWEHeader2 = null;
        try {
            java.util.Iterator<java.lang.Object> it = com.nimbusds.jose.util.JSONObjectUtils.getJSONArray(com.nimbusds.jose.util.JSONObjectUtils.parse(base64URL.decodeToString()), "recipients").iterator();
            recipient = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    recipient = com.nimbusds.jose.JWEObjectJSON.Recipient.parse((java.util.Map) it.next());
                    com.nimbusds.jose.JWEHeader jWEHeader3 = (com.nimbusds.jose.JWEHeader) jWEHeader.join(recipient.getUnprotectedHeader());
                    if (jwkMatched(jWEHeader3)) {
                        jWEHeader2 = jWEHeader3;
                        break;
                    }
                } catch (java.lang.Exception e) {
                    throw new com.nimbusds.jose.JOSEException(e.getMessage());
                }
            }
        } catch (java.lang.Exception unused) {
            recipient = new com.nimbusds.jose.JWEObjectJSON.Recipient(null, base64URL);
            jWEHeader2 = jWEHeader;
        }
        if (jWEHeader2 == null) {
            throw new com.nimbusds.jose.JOSEException("No recipient found");
        }
        com.nimbusds.jose.JWEAlgorithm algorithmAndEnsureNotNull = com.nimbusds.jose.crypto.impl.JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader2);
        this.critPolicy.ensureHeaderPasses(jWEHeader2);
        if (com.nimbusds.jose.jwk.KeyType.RSA.equals(keyType) && com.nimbusds.jose.crypto.RSADecrypter.SUPPORTED_ALGORITHMS.contains(algorithmAndEnsureNotNull)) {
            x25519Decrypter = new com.nimbusds.jose.crypto.RSADecrypter(this.jwk.toRSAKey().toRSAPrivateKey(), deferredCriticalHeaderParams);
        } else if (com.nimbusds.jose.jwk.KeyType.EC.equals(keyType) && com.nimbusds.jose.crypto.ECDHDecrypter.SUPPORTED_ALGORITHMS.contains(algorithmAndEnsureNotNull)) {
            x25519Decrypter = new com.nimbusds.jose.crypto.ECDHDecrypter(this.jwk.toECKey().toECPrivateKey(), deferredCriticalHeaderParams);
        } else if (com.nimbusds.jose.jwk.KeyType.OCT.equals(keyType) && com.nimbusds.jose.crypto.AESDecrypter.SUPPORTED_ALGORITHMS.contains(algorithmAndEnsureNotNull)) {
            x25519Decrypter = new com.nimbusds.jose.crypto.AESDecrypter(this.jwk.toOctetSequenceKey().toSecretKey(org.jose4j.keys.AesKey.ALGORITHM), deferredCriticalHeaderParams);
        } else if (com.nimbusds.jose.jwk.KeyType.OCT.equals(keyType) && com.nimbusds.jose.crypto.DirectDecrypter.SUPPORTED_ALGORITHMS.contains(algorithmAndEnsureNotNull)) {
            x25519Decrypter = new com.nimbusds.jose.crypto.DirectDecrypter(this.jwk.toOctetSequenceKey().toSecretKey(org.jose4j.keys.AesKey.ALGORITHM), deferredCriticalHeaderParams);
        } else if (com.nimbusds.jose.jwk.KeyType.OKP.equals(keyType) && com.nimbusds.jose.crypto.X25519Decrypter.SUPPORTED_ALGORITHMS.contains(algorithmAndEnsureNotNull)) {
            x25519Decrypter = new com.nimbusds.jose.crypto.X25519Decrypter(this.jwk.toOctetKeyPair(), deferredCriticalHeaderParams);
        } else {
            throw new com.nimbusds.jose.JOSEException("Unsupported algorithm");
        }
        return x25519Decrypter.decrypt(jWEHeader2, recipient.getEncryptedKey(), base64URL2, base64URL3, base64URL4, bArr);
    }
}
