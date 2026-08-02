package com.nimbusds.jose.proc;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class DefaultJOSEProcessor<C extends com.nimbusds.jose.proc.SecurityContext> implements com.nimbusds.jose.proc.ConfigurableJOSEProcessor<C> {
    private com.nimbusds.jose.proc.JWEKeySelector<C> jweKeySelector;
    private com.nimbusds.jose.proc.JWSKeySelector<C> jwsKeySelector;
    private com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> jwsTypeVerifier = com.nimbusds.jose.proc.DefaultJOSEObjectTypeVerifier.JOSE;
    private com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> jweTypeVerifier = com.nimbusds.jose.proc.DefaultJOSEObjectTypeVerifier.JOSE;
    private com.nimbusds.jose.proc.JWSVerifierFactory jwsVerifierFactory = new com.nimbusds.jose.crypto.factories.DefaultJWSVerifierFactory();
    private com.nimbusds.jose.proc.JWEDecrypterFactory jweDecrypterFactory = new com.nimbusds.jose.crypto.factories.DefaultJWEDecrypterFactory();

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> getJWSTypeVerifier() {
        return this.jwsTypeVerifier;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWSTypeVerifier(com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier) {
        this.jwsTypeVerifier = jOSEObjectTypeVerifier;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public com.nimbusds.jose.proc.JWSKeySelector<C> getJWSKeySelector() {
        return this.jwsKeySelector;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWSKeySelector(com.nimbusds.jose.proc.JWSKeySelector<C> jWSKeySelector) {
        this.jwsKeySelector = jWSKeySelector;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> getJWETypeVerifier() {
        return this.jweTypeVerifier;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWETypeVerifier(com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier) {
        this.jweTypeVerifier = jOSEObjectTypeVerifier;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public com.nimbusds.jose.proc.JWEKeySelector<C> getJWEKeySelector() {
        return this.jweKeySelector;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWEKeySelector(com.nimbusds.jose.proc.JWEKeySelector<C> jWEKeySelector) {
        this.jweKeySelector = jWEKeySelector;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public com.nimbusds.jose.proc.JWSVerifierFactory getJWSVerifierFactory() {
        return this.jwsVerifierFactory;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWSVerifierFactory(com.nimbusds.jose.proc.JWSVerifierFactory jWSVerifierFactory) {
        this.jwsVerifierFactory = jWSVerifierFactory;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public com.nimbusds.jose.proc.JWEDecrypterFactory getJWEDecrypterFactory() {
        return this.jweDecrypterFactory;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWEDecrypterFactory(com.nimbusds.jose.proc.JWEDecrypterFactory jWEDecrypterFactory) {
        this.jweDecrypterFactory = jWEDecrypterFactory;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessor
    public com.nimbusds.jose.Payload process(java.lang.String str, C c) throws java.text.ParseException, com.nimbusds.jose.proc.BadJOSEException, com.nimbusds.jose.JOSEException {
        return process(com.nimbusds.jose.JOSEObject.parse(str), (com.nimbusds.jose.JOSEObject) c);
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessor
    public com.nimbusds.jose.Payload process(com.nimbusds.jose.JOSEObject jOSEObject, C c) throws com.nimbusds.jose.proc.BadJOSEException, com.nimbusds.jose.JOSEException {
        if (jOSEObject instanceof com.nimbusds.jose.JWSObject) {
            return process((com.nimbusds.jose.JWSObject) jOSEObject, (com.nimbusds.jose.JWSObject) c);
        }
        if (jOSEObject instanceof com.nimbusds.jose.JWEObject) {
            return process((com.nimbusds.jose.JWEObject) jOSEObject, (com.nimbusds.jose.JWEObject) c);
        }
        if (jOSEObject instanceof com.nimbusds.jose.PlainObject) {
            return process((com.nimbusds.jose.PlainObject) jOSEObject, (com.nimbusds.jose.PlainObject) c);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected JOSE object type: ");
        sb.append(jOSEObject.getClass());
        throw new com.nimbusds.jose.JOSEException(sb.toString());
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessor
    public com.nimbusds.jose.Payload process(com.nimbusds.jose.PlainObject plainObject, C c) throws com.nimbusds.jose.proc.BadJOSEException {
        com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier = this.jwsTypeVerifier;
        if (jOSEObjectTypeVerifier == null) {
            throw new com.nimbusds.jose.proc.BadJOSEException("Unsecured (plain) JOSE object rejected: No JWS header typ (type) verifier is configured");
        }
        jOSEObjectTypeVerifier.verify(plainObject.getHeader().getType(), c);
        throw new com.nimbusds.jose.proc.BadJOSEException("Unsecured (plain) JOSE objects are rejected, extend class to handle");
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessor
    public com.nimbusds.jose.Payload process(com.nimbusds.jose.JWSObject jWSObject, C c) throws com.nimbusds.jose.proc.BadJOSEException, com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier = this.jwsTypeVerifier;
        if (jOSEObjectTypeVerifier == null) {
            throw new com.nimbusds.jose.proc.BadJOSEException("JWS object rejected: No JWS header typ (type) verifier is configured");
        }
        jOSEObjectTypeVerifier.verify(jWSObject.getHeader().getType(), c);
        if (getJWSKeySelector() == null) {
            throw new com.nimbusds.jose.proc.BadJOSEException("JWS object rejected: No JWS key selector is configured");
        }
        if (getJWSVerifierFactory() == null) {
            throw new com.nimbusds.jose.JOSEException("No JWS verifier is configured");
        }
        java.util.List<? extends java.security.Key> selectJWSKeys = getJWSKeySelector().selectJWSKeys(jWSObject.getHeader(), c);
        if (selectJWSKeys == null || selectJWSKeys.isEmpty()) {
            throw new com.nimbusds.jose.proc.BadJOSEException("JWS object rejected: Another algorithm expected, or no matching key(s) found");
        }
        java.util.ListIterator<? extends java.security.Key> listIterator = selectJWSKeys.listIterator();
        while (listIterator.hasNext()) {
            com.nimbusds.jose.JWSVerifier createJWSVerifier = getJWSVerifierFactory().createJWSVerifier(jWSObject.getHeader(), listIterator.next());
            if (createJWSVerifier != null) {
                if (jWSObject.verify(createJWSVerifier)) {
                    return jWSObject.getPayload();
                }
                if (!listIterator.hasNext()) {
                    throw new com.nimbusds.jose.proc.BadJWSException("JWS object rejected: Invalid signature");
                }
            }
        }
        throw new com.nimbusds.jose.proc.BadJOSEException("JWS object rejected: No matching verifier(s) found");
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessor
    public com.nimbusds.jose.Payload process(com.nimbusds.jose.JWEObject jWEObject, C c) throws com.nimbusds.jose.proc.BadJOSEException, com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier = this.jweTypeVerifier;
        if (jOSEObjectTypeVerifier == null) {
            throw new com.nimbusds.jose.proc.BadJOSEException("JWE object rejected: No JWE header typ (type) verifier is configured");
        }
        jOSEObjectTypeVerifier.verify(jWEObject.getHeader().getType(), c);
        if (getJWEKeySelector() == null) {
            throw new com.nimbusds.jose.proc.BadJOSEException("JWE object rejected: No JWE key selector is configured");
        }
        if (getJWEDecrypterFactory() == null) {
            throw new com.nimbusds.jose.JOSEException("No JWE decrypter is configured");
        }
        java.util.List<? extends java.security.Key> selectJWEKeys = getJWEKeySelector().selectJWEKeys(jWEObject.getHeader(), c);
        if (selectJWEKeys == null || selectJWEKeys.isEmpty()) {
            throw new com.nimbusds.jose.proc.BadJOSEException("JWE object rejected: Another algorithm expected, or no matching key(s) found");
        }
        java.util.ListIterator<? extends java.security.Key> listIterator = selectJWEKeys.listIterator();
        while (listIterator.hasNext()) {
            com.nimbusds.jose.JWEDecrypter createJWEDecrypter = getJWEDecrypterFactory().createJWEDecrypter(jWEObject.getHeader(), listIterator.next());
            if (createJWEDecrypter != null) {
                try {
                    jWEObject.decrypt(createJWEDecrypter);
                    if ("JWT".equalsIgnoreCase(jWEObject.getHeader().getContentType())) {
                        com.nimbusds.jose.JWSObject jWSObject = jWEObject.getPayload().toJWSObject();
                        if (jWSObject == null) {
                            return jWEObject.getPayload();
                        }
                        return process(jWSObject, (com.nimbusds.jose.JWSObject) c);
                    }
                    return jWEObject.getPayload();
                } catch (com.nimbusds.jose.JOSEException e) {
                    if (!listIterator.hasNext()) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("JWE object rejected: ");
                        sb.append(e.getMessage());
                        throw new com.nimbusds.jose.proc.BadJWEException(sb.toString(), e);
                    }
                }
            }
        }
        throw new com.nimbusds.jose.proc.BadJOSEException("JWE object rejected: No matching decrypter(s) found");
    }
}
