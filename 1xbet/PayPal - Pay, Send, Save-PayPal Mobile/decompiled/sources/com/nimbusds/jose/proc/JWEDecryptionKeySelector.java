package com.nimbusds.jose.proc;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class JWEDecryptionKeySelector<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.proc.AbstractJWKSelectorWithSource<C> implements com.nimbusds.jose.proc.JWEKeySelector<C> {
    private final com.nimbusds.jose.JWEAlgorithm jweAlg;
    private final com.nimbusds.jose.EncryptionMethod jweEnc;

    @Override // com.nimbusds.jose.proc.AbstractJWKSelectorWithSource
    public /* bridge */ /* synthetic */ com.nimbusds.jose.jwk.source.JWKSource getJWKSource() {
        return super.getJWKSource();
    }

    public JWEDecryptionKeySelector(com.nimbusds.jose.JWEAlgorithm jWEAlgorithm, com.nimbusds.jose.EncryptionMethod encryptionMethod, com.nimbusds.jose.jwk.source.JWKSource<C> jWKSource) {
        super(jWKSource);
        if (jWEAlgorithm == null) {
            throw new java.lang.IllegalArgumentException("The JWE algorithm must not be null");
        }
        this.jweAlg = jWEAlgorithm;
        if (encryptionMethod == null) {
            throw new java.lang.IllegalArgumentException("The JWE encryption method must not be null");
        }
        this.jweEnc = encryptionMethod;
    }

    public com.nimbusds.jose.JWEAlgorithm getExpectedJWEAlgorithm() {
        return this.jweAlg;
    }

    public com.nimbusds.jose.EncryptionMethod getExpectedJWEEncryptionMethod() {
        return this.jweEnc;
    }

    protected com.nimbusds.jose.jwk.JWKMatcher createJWKMatcher(com.nimbusds.jose.JWEHeader jWEHeader) {
        if (getExpectedJWEAlgorithm().equals(jWEHeader.getAlgorithm()) && getExpectedJWEEncryptionMethod().equals(jWEHeader.getEncryptionMethod())) {
            return com.nimbusds.jose.jwk.JWKMatcher.forJWEHeader(jWEHeader);
        }
        return null;
    }

    @Override // com.nimbusds.jose.proc.JWEKeySelector
    public java.util.List<java.security.Key> selectJWEKeys(com.nimbusds.jose.JWEHeader jWEHeader, C c) throws com.nimbusds.jose.KeySourceException {
        if (!this.jweAlg.equals(jWEHeader.getAlgorithm()) || !this.jweEnc.equals(jWEHeader.getEncryptionMethod())) {
            return java.util.Collections.emptyList();
        }
        java.util.List<com.nimbusds.jose.jwk.JWK> list = getJWKSource().get(new com.nimbusds.jose.jwk.JWKSelector(createJWKMatcher(jWEHeader)), c);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.security.Key key : com.nimbusds.jose.jwk.KeyConverter.toJavaKeys(list)) {
            if ((key instanceof java.security.PrivateKey) || (key instanceof javax.crypto.SecretKey)) {
                linkedList.add(key);
            }
        }
        return linkedList;
    }
}
