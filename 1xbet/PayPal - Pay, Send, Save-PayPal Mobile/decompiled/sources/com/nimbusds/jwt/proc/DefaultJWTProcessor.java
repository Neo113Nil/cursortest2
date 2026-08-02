package com.nimbusds.jwt.proc;

/* loaded from: classes10.dex */
public class DefaultJWTProcessor<C extends com.nimbusds.jose.proc.SecurityContext> implements com.nimbusds.jwt.proc.ConfigurableJWTProcessor<C> {
    private com.nimbusds.jose.proc.JWEKeySelector<C> getHighResolutionOutputSizeshNQ4ISI;
    private com.nimbusds.jwt.proc.JWTClaimsSetAwareJWSKeySelector<C> getHighSpeedVideoFpsRangesFor;
    private com.nimbusds.jose.proc.JWSKeySelector<C> getHighSpeedVideoSizesFor;
    private com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> getOutputMinFrameDuration = com.nimbusds.jose.proc.DefaultJOSEObjectTypeVerifier.JWT;
    private com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> Camera2StreamConfigurationMap = com.nimbusds.jose.proc.DefaultJOSEObjectTypeVerifier.JWT;
    private com.nimbusds.jose.proc.JWSVerifierFactory getInputSizeshNQ4ISI = new com.nimbusds.jose.crypto.factories.DefaultJWSVerifierFactory();
    private com.nimbusds.jose.proc.JWEDecrypterFactory getHighSpeedVideoSizes = new com.nimbusds.jose.crypto.factories.DefaultJWEDecrypterFactory();
    private com.nimbusds.jwt.proc.JWTClaimsSetVerifier<C> getHighSpeedVideoFpsRanges = new com.nimbusds.jwt.proc.DefaultJWTClaimsVerifier(null, null);

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> getJWSTypeVerifier() {
        return this.getOutputMinFrameDuration;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWSTypeVerifier(com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier) {
        this.getOutputMinFrameDuration = jOSEObjectTypeVerifier;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public com.nimbusds.jose.proc.JWSKeySelector<C> getJWSKeySelector() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWSKeySelector(com.nimbusds.jose.proc.JWSKeySelector<C> jWSKeySelector) {
        this.getHighSpeedVideoSizesFor = jWSKeySelector;
    }

    @Override // com.nimbusds.jwt.proc.JWTProcessorConfiguration
    public com.nimbusds.jwt.proc.JWTClaimsSetAwareJWSKeySelector<C> getJWTClaimsSetAwareJWSKeySelector() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.nimbusds.jwt.proc.JWTProcessorConfiguration
    public void setJWTClaimsSetAwareJWSKeySelector(com.nimbusds.jwt.proc.JWTClaimsSetAwareJWSKeySelector<C> jWTClaimsSetAwareJWSKeySelector) {
        this.getHighSpeedVideoFpsRangesFor = jWTClaimsSetAwareJWSKeySelector;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> getJWETypeVerifier() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWETypeVerifier(com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier) {
        this.Camera2StreamConfigurationMap = jOSEObjectTypeVerifier;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public com.nimbusds.jose.proc.JWEKeySelector<C> getJWEKeySelector() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWEKeySelector(com.nimbusds.jose.proc.JWEKeySelector<C> jWEKeySelector) {
        this.getHighResolutionOutputSizeshNQ4ISI = jWEKeySelector;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public com.nimbusds.jose.proc.JWSVerifierFactory getJWSVerifierFactory() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWSVerifierFactory(com.nimbusds.jose.proc.JWSVerifierFactory jWSVerifierFactory) {
        this.getInputSizeshNQ4ISI = jWSVerifierFactory;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public com.nimbusds.jose.proc.JWEDecrypterFactory getJWEDecrypterFactory() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.nimbusds.jose.proc.JOSEProcessorConfiguration
    public void setJWEDecrypterFactory(com.nimbusds.jose.proc.JWEDecrypterFactory jWEDecrypterFactory) {
        this.getHighSpeedVideoSizes = jWEDecrypterFactory;
    }

    @Override // com.nimbusds.jwt.proc.JWTProcessorConfiguration
    public com.nimbusds.jwt.proc.JWTClaimsSetVerifier<C> getJWTClaimsSetVerifier() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.nimbusds.jwt.proc.JWTProcessorConfiguration
    public void setJWTClaimsSetVerifier(com.nimbusds.jwt.proc.JWTClaimsSetVerifier<C> jWTClaimsSetVerifier) {
        this.getHighSpeedVideoFpsRanges = jWTClaimsSetVerifier;
    }

    private static com.nimbusds.jwt.JWTClaimsSet getHighSpeedVideoFpsRanges(com.nimbusds.jwt.JWT jwt) throws com.nimbusds.jwt.proc.BadJWTException {
        try {
            return jwt.getJWTClaimsSet();
        } catch (java.text.ParseException e) {
            throw new com.nimbusds.jwt.proc.BadJWTException(e.getMessage(), e);
        }
    }

    @Override // com.nimbusds.jwt.proc.JWTProcessor
    public com.nimbusds.jwt.JWTClaimsSet process(java.lang.String str, C c) throws java.text.ParseException, com.nimbusds.jose.proc.BadJOSEException, com.nimbusds.jose.JOSEException {
        return process(com.nimbusds.jwt.JWTParser.parse(str), (com.nimbusds.jwt.JWT) c);
    }

    @Override // com.nimbusds.jwt.proc.JWTProcessor
    public com.nimbusds.jwt.JWTClaimsSet process(com.nimbusds.jwt.JWT jwt, C c) throws com.nimbusds.jose.proc.BadJOSEException, com.nimbusds.jose.JOSEException {
        if (jwt instanceof com.nimbusds.jwt.SignedJWT) {
            return process((com.nimbusds.jwt.SignedJWT) jwt, (com.nimbusds.jwt.SignedJWT) c);
        }
        if (jwt instanceof com.nimbusds.jwt.EncryptedJWT) {
            return process((com.nimbusds.jwt.EncryptedJWT) jwt, (com.nimbusds.jwt.EncryptedJWT) c);
        }
        if (jwt instanceof com.nimbusds.jwt.PlainJWT) {
            return process((com.nimbusds.jwt.PlainJWT) jwt, (com.nimbusds.jwt.PlainJWT) c);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected JWT object type: ");
        sb.append(jwt.getClass());
        throw new com.nimbusds.jose.JOSEException(sb.toString());
    }

    @Override // com.nimbusds.jwt.proc.JWTProcessor
    public com.nimbusds.jwt.JWTClaimsSet process(com.nimbusds.jwt.PlainJWT plainJWT, C c) throws com.nimbusds.jose.proc.BadJOSEException, com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier = this.getOutputMinFrameDuration;
        if (jOSEObjectTypeVerifier == null) {
            throw new com.nimbusds.jose.proc.BadJOSEException("Plain JWT rejected: No JWS header typ (type) verifier is configured");
        }
        jOSEObjectTypeVerifier.verify(plainJWT.getHeader().getType(), c);
        throw new com.nimbusds.jose.proc.BadJOSEException("Unsecured (plain) JWTs are rejected, extend class to handle");
    }

    @Override // com.nimbusds.jwt.proc.JWTProcessor
    public com.nimbusds.jwt.JWTClaimsSet process(com.nimbusds.jwt.SignedJWT signedJWT, C c) throws com.nimbusds.jose.proc.BadJOSEException, com.nimbusds.jose.JOSEException {
        java.util.List<? extends java.security.Key> selectJWSKeys;
        com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier = this.getOutputMinFrameDuration;
        if (jOSEObjectTypeVerifier == null) {
            throw new com.nimbusds.jose.proc.BadJOSEException("Signed JWT rejected: No JWS header typ (type) verifier is configured");
        }
        jOSEObjectTypeVerifier.verify(signedJWT.getHeader().getType(), c);
        if (getJWSKeySelector() == null && getJWTClaimsSetAwareJWSKeySelector() == null) {
            throw new com.nimbusds.jose.proc.BadJOSEException("Signed JWT rejected: No JWS key selector is configured");
        }
        if (getJWSVerifierFactory() == null) {
            throw new com.nimbusds.jose.JOSEException("No JWS verifier is configured");
        }
        com.nimbusds.jwt.JWTClaimsSet highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(signedJWT);
        com.nimbusds.jose.JWSHeader header = signedJWT.getHeader();
        if (getJWTClaimsSetAwareJWSKeySelector() != null) {
            selectJWSKeys = getJWTClaimsSetAwareJWSKeySelector().selectKeys(header, highSpeedVideoFpsRanges, c);
        } else if (getJWSKeySelector() != null) {
            selectJWSKeys = getJWSKeySelector().selectJWSKeys(header, c);
        } else {
            throw new com.nimbusds.jose.proc.BadJOSEException("Signed JWT rejected: No JWS key selector is configured");
        }
        if (selectJWSKeys == null || selectJWSKeys.isEmpty()) {
            throw new com.nimbusds.jose.proc.BadJOSEException("Signed JWT rejected: Another algorithm expected, or no matching key(s) found");
        }
        java.util.ListIterator<? extends java.security.Key> listIterator = selectJWSKeys.listIterator();
        while (listIterator.hasNext()) {
            com.nimbusds.jose.JWSVerifier createJWSVerifier = getJWSVerifierFactory().createJWSVerifier(signedJWT.getHeader(), listIterator.next());
            if (createJWSVerifier != null) {
                if (!signedJWT.verify(createJWSVerifier)) {
                    if (!listIterator.hasNext()) {
                        throw new com.nimbusds.jose.proc.BadJWSException("Signed JWT rejected: Invalid signature");
                    }
                } else {
                    if (getJWTClaimsSetVerifier() != null) {
                        getJWTClaimsSetVerifier().verify(highSpeedVideoFpsRanges, c);
                    }
                    return highSpeedVideoFpsRanges;
                }
            }
        }
        throw new com.nimbusds.jose.proc.BadJOSEException("JWS object rejected: No matching verifier(s) found");
    }

    @Override // com.nimbusds.jwt.proc.JWTProcessor
    public com.nimbusds.jwt.JWTClaimsSet process(com.nimbusds.jwt.EncryptedJWT encryptedJWT, C c) throws com.nimbusds.jose.proc.BadJOSEException, com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.proc.JOSEObjectTypeVerifier<C> jOSEObjectTypeVerifier = this.Camera2StreamConfigurationMap;
        if (jOSEObjectTypeVerifier == null) {
            throw new com.nimbusds.jose.proc.BadJOSEException("Encrypted JWT rejected: No JWE header typ (type) verifier is configured");
        }
        jOSEObjectTypeVerifier.verify(encryptedJWT.getHeader().getType(), c);
        if (getJWEKeySelector() == null) {
            throw new com.nimbusds.jose.proc.BadJOSEException("Encrypted JWT rejected: No JWE key selector is configured");
        }
        if (getJWEDecrypterFactory() == null) {
            throw new com.nimbusds.jose.JOSEException("No JWE decrypter is configured");
        }
        java.util.List<? extends java.security.Key> selectJWEKeys = getJWEKeySelector().selectJWEKeys(encryptedJWT.getHeader(), c);
        if (selectJWEKeys == null || selectJWEKeys.isEmpty()) {
            throw new com.nimbusds.jose.proc.BadJOSEException("Encrypted JWT rejected: Another algorithm expected, or no matching key(s) found");
        }
        java.util.ListIterator<? extends java.security.Key> listIterator = selectJWEKeys.listIterator();
        while (listIterator.hasNext()) {
            com.nimbusds.jose.JWEDecrypter createJWEDecrypter = getJWEDecrypterFactory().createJWEDecrypter(encryptedJWT.getHeader(), listIterator.next());
            if (createJWEDecrypter != null) {
                try {
                    encryptedJWT.decrypt(createJWEDecrypter);
                    if ("JWT".equalsIgnoreCase(encryptedJWT.getHeader().getContentType())) {
                        com.nimbusds.jwt.SignedJWT signedJWT = encryptedJWT.getPayload().toSignedJWT();
                        if (signedJWT == null) {
                            throw new com.nimbusds.jwt.proc.BadJWTException("The payload is not a nested signed JWT");
                        }
                        return process(signedJWT, (com.nimbusds.jwt.SignedJWT) c);
                    }
                    com.nimbusds.jwt.JWTClaimsSet highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(encryptedJWT);
                    if (getJWTClaimsSetVerifier() != null) {
                        getJWTClaimsSetVerifier().verify(highSpeedVideoFpsRanges, c);
                    }
                    return highSpeedVideoFpsRanges;
                } catch (com.nimbusds.jose.JOSEException e) {
                    if (!listIterator.hasNext()) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Encrypted JWT rejected: ");
                        sb.append(e.getMessage());
                        throw new com.nimbusds.jose.proc.BadJWEException(sb.toString(), e);
                    }
                }
            }
        }
        throw new com.nimbusds.jose.proc.BadJOSEException("Encrypted JWT rejected: No matching decrypter(s) found");
    }
}
