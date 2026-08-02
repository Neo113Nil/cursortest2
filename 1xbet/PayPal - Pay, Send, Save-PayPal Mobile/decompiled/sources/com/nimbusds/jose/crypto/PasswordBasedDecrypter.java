package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class PasswordBasedDecrypter extends com.nimbusds.jose.crypto.impl.PasswordBasedCryptoProvider implements com.nimbusds.jose.JWEDecrypter, com.nimbusds.jose.CriticalHeaderParamsAware {
    public static final int MAX_ALLOWED_ITERATION_COUNT = 1000000;
    private final com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral critPolicy;

    public PasswordBasedDecrypter(byte[] bArr) {
        super(bArr);
        this.critPolicy = new com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral();
    }

    public PasswordBasedDecrypter(java.lang.String str) {
        super(str.getBytes(com.nimbusds.jose.util.StandardCharset.UTF_8));
        this.critPolicy = new com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral();
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public java.util.Set<java.lang.String> getProcessedCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public java.util.Set<java.lang.String> getDeferredCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    @java.lang.Deprecated
    public byte[] decrypt(com.nimbusds.jose.JWEHeader jWEHeader, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4) throws com.nimbusds.jose.JOSEException {
        return decrypt(jWEHeader, base64URL, base64URL2, base64URL3, base64URL4, com.nimbusds.jose.crypto.impl.AAD.compute(jWEHeader));
    }

    @Override // com.nimbusds.jose.JWEDecrypter
    public byte[] decrypt(com.nimbusds.jose.JWEHeader jWEHeader, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, byte[] bArr) throws com.nimbusds.jose.JOSEException {
        if (base64URL == null) {
            throw new com.nimbusds.jose.JOSEException("Missing JWE encrypted key");
        }
        if (base64URL2 == null) {
            throw new com.nimbusds.jose.JOSEException("Missing JWE initialization vector (IV)");
        }
        if (base64URL4 == null) {
            throw new com.nimbusds.jose.JOSEException("Missing JWE authentication tag");
        }
        if (jWEHeader.getPBES2Salt() == null) {
            throw new com.nimbusds.jose.JOSEException("Missing JWE p2s header parameter");
        }
        byte[] decode = jWEHeader.getPBES2Salt().decode();
        if (jWEHeader.getPBES2Count() <= 0) {
            throw new com.nimbusds.jose.JOSEException("Missing JWE p2c header parameter");
        }
        int pBES2Count = jWEHeader.getPBES2Count();
        if (pBES2Count > 1000000) {
            throw new com.nimbusds.jose.JOSEException("The JWE p2c header exceeds the maximum allowed 1000000 count");
        }
        this.critPolicy.ensureHeaderPasses(jWEHeader);
        com.nimbusds.jose.JWEAlgorithm algorithmAndEnsureNotNull = com.nimbusds.jose.crypto.impl.JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader);
        return com.nimbusds.jose.crypto.impl.ContentCryptoProvider.decrypt(jWEHeader, bArr, base64URL, base64URL2, base64URL3, base64URL4, com.nimbusds.jose.crypto.impl.AESKW.unwrapCEK(com.nimbusds.jose.crypto.impl.PBKDF2.deriveKey(getPassword(), com.nimbusds.jose.crypto.impl.PBKDF2.formatSalt(algorithmAndEnsureNotNull, decode), pBES2Count, com.nimbusds.jose.crypto.impl.PRFParams.resolve(algorithmAndEnsureNotNull, getJCAContext().getMACProvider())), base64URL.decode(), getJCAContext().getKeyEncryptionProvider()), getJCAContext());
    }
}
