package com.nimbusds.jose.crypto.factories;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class DefaultJWEDecrypterFactory implements com.nimbusds.jose.proc.JWEDecrypterFactory {
    public static final java.util.Set<com.nimbusds.jose.JWEAlgorithm> SUPPORTED_ALGORITHMS;
    public static final java.util.Set<com.nimbusds.jose.EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS;
    private final com.nimbusds.jose.jca.JWEJCAContext jcaContext = new com.nimbusds.jose.jca.JWEJCAContext();

    static {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(com.nimbusds.jose.crypto.RSADecrypter.SUPPORTED_ALGORITHMS);
        linkedHashSet.addAll(com.nimbusds.jose.crypto.ECDHDecrypter.SUPPORTED_ALGORITHMS);
        linkedHashSet.addAll(com.nimbusds.jose.crypto.DirectDecrypter.SUPPORTED_ALGORITHMS);
        linkedHashSet.addAll(com.nimbusds.jose.crypto.AESDecrypter.SUPPORTED_ALGORITHMS);
        linkedHashSet.addAll(com.nimbusds.jose.crypto.PasswordBasedDecrypter.SUPPORTED_ALGORITHMS);
        SUPPORTED_ALGORITHMS = java.util.Collections.unmodifiableSet(linkedHashSet);
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        linkedHashSet2.addAll(com.nimbusds.jose.crypto.RSADecrypter.SUPPORTED_ENCRYPTION_METHODS);
        linkedHashSet2.addAll(com.nimbusds.jose.crypto.ECDHDecrypter.SUPPORTED_ENCRYPTION_METHODS);
        linkedHashSet2.addAll(com.nimbusds.jose.crypto.DirectDecrypter.SUPPORTED_ENCRYPTION_METHODS);
        linkedHashSet2.addAll(com.nimbusds.jose.crypto.AESDecrypter.SUPPORTED_ENCRYPTION_METHODS);
        linkedHashSet2.addAll(com.nimbusds.jose.crypto.PasswordBasedDecrypter.SUPPORTED_ENCRYPTION_METHODS);
        SUPPORTED_ENCRYPTION_METHODS = java.util.Collections.unmodifiableSet(linkedHashSet2);
    }

    @Override // com.nimbusds.jose.JWEProvider
    public java.util.Set<com.nimbusds.jose.JWEAlgorithm> supportedJWEAlgorithms() {
        return SUPPORTED_ALGORITHMS;
    }

    @Override // com.nimbusds.jose.JWEProvider
    public java.util.Set<com.nimbusds.jose.EncryptionMethod> supportedEncryptionMethods() {
        return SUPPORTED_ENCRYPTION_METHODS;
    }

    @Override // com.nimbusds.jose.jca.JCAAware
    public com.nimbusds.jose.jca.JWEJCAContext getJCAContext() {
        return this.jcaContext;
    }

    @Override // com.nimbusds.jose.proc.JWEDecrypterFactory
    public com.nimbusds.jose.JWEDecrypter createJWEDecrypter(com.nimbusds.jose.JWEHeader jWEHeader, java.security.Key key) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.JWEDecrypter passwordBasedDecrypter;
        com.nimbusds.jose.JWEDecrypter aESDecrypter;
        if (com.nimbusds.jose.crypto.RSADecrypter.SUPPORTED_ALGORITHMS.contains(jWEHeader.getAlgorithm()) && com.nimbusds.jose.crypto.RSADecrypter.SUPPORTED_ENCRYPTION_METHODS.contains(jWEHeader.getEncryptionMethod())) {
            if (!(key instanceof java.security.PrivateKey) || !(key instanceof java.security.interfaces.RSAKey)) {
                throw new com.nimbusds.jose.KeyTypeException(java.security.PrivateKey.class, java.security.interfaces.RSAKey.class);
            }
            passwordBasedDecrypter = new com.nimbusds.jose.crypto.RSADecrypter((java.security.PrivateKey) key);
        } else {
            if (com.nimbusds.jose.crypto.ECDHDecrypter.SUPPORTED_ALGORITHMS.contains(jWEHeader.getAlgorithm()) && com.nimbusds.jose.crypto.ECDHDecrypter.SUPPORTED_ENCRYPTION_METHODS.contains(jWEHeader.getEncryptionMethod())) {
                if (!(key instanceof java.security.PrivateKey) || !(key instanceof java.security.interfaces.ECKey)) {
                    throw new com.nimbusds.jose.KeyTypeException(java.security.PrivateKey.class, java.security.interfaces.ECKey.class);
                }
                aESDecrypter = new com.nimbusds.jose.crypto.ECDHDecrypter((java.security.PrivateKey) key, null, com.nimbusds.jose.jwk.Curve.forECParameterSpec(((java.security.interfaces.ECKey) key).getParams()));
            } else if (com.nimbusds.jose.crypto.DirectDecrypter.SUPPORTED_ALGORITHMS.contains(jWEHeader.getAlgorithm()) && com.nimbusds.jose.crypto.DirectDecrypter.SUPPORTED_ENCRYPTION_METHODS.contains(jWEHeader.getEncryptionMethod())) {
                if (!(key instanceof javax.crypto.SecretKey)) {
                    throw new com.nimbusds.jose.KeyTypeException(javax.crypto.SecretKey.class);
                }
                aESDecrypter = new com.nimbusds.jose.crypto.DirectDecrypter((javax.crypto.SecretKey) key);
                if (!aESDecrypter.supportedEncryptionMethods().contains(jWEHeader.getEncryptionMethod())) {
                    throw new com.nimbusds.jose.KeyLengthException(jWEHeader.getEncryptionMethod().cekBitLength(), jWEHeader.getEncryptionMethod());
                }
            } else if (com.nimbusds.jose.crypto.AESDecrypter.SUPPORTED_ALGORITHMS.contains(jWEHeader.getAlgorithm()) && com.nimbusds.jose.crypto.AESDecrypter.SUPPORTED_ENCRYPTION_METHODS.contains(jWEHeader.getEncryptionMethod())) {
                if (!(key instanceof javax.crypto.SecretKey)) {
                    throw new com.nimbusds.jose.KeyTypeException(javax.crypto.SecretKey.class);
                }
                aESDecrypter = new com.nimbusds.jose.crypto.AESDecrypter((javax.crypto.SecretKey) key);
                if (!aESDecrypter.supportedJWEAlgorithms().contains(jWEHeader.getAlgorithm())) {
                    throw new com.nimbusds.jose.KeyLengthException(jWEHeader.getAlgorithm());
                }
            } else if (com.nimbusds.jose.crypto.PasswordBasedDecrypter.SUPPORTED_ALGORITHMS.contains(jWEHeader.getAlgorithm()) && com.nimbusds.jose.crypto.PasswordBasedDecrypter.SUPPORTED_ENCRYPTION_METHODS.contains(jWEHeader.getEncryptionMethod())) {
                if (!(key instanceof javax.crypto.SecretKey)) {
                    throw new com.nimbusds.jose.KeyTypeException(javax.crypto.SecretKey.class);
                }
                passwordBasedDecrypter = new com.nimbusds.jose.crypto.PasswordBasedDecrypter(key.getEncoded());
            } else {
                throw new com.nimbusds.jose.JOSEException("Unsupported JWE algorithm or encryption method");
            }
            passwordBasedDecrypter = aESDecrypter;
        }
        passwordBasedDecrypter.getJCAContext().setSecureRandom(this.jcaContext.getSecureRandom());
        passwordBasedDecrypter.getJCAContext().setProvider(this.jcaContext.getProvider());
        passwordBasedDecrypter.getJCAContext().setKeyEncryptionProvider(this.jcaContext.getKeyEncryptionProvider());
        passwordBasedDecrypter.getJCAContext().setMACProvider(this.jcaContext.getMACProvider());
        passwordBasedDecrypter.getJCAContext().setContentEncryptionProvider(this.jcaContext.getContentEncryptionProvider());
        return passwordBasedDecrypter;
    }
}
