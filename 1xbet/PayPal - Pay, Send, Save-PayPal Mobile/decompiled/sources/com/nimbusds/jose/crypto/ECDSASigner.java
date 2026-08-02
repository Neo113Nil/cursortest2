package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes4.dex */
public class ECDSASigner extends com.nimbusds.jose.crypto.impl.ECDSAProvider implements com.nimbusds.jose.JWSSigner {
    private final java.util.Set<com.nimbusds.jose.JWSSignerOption> opts;
    private final java.security.PrivateKey privateKey;

    public ECDSASigner(java.security.interfaces.ECPrivateKey eCPrivateKey) throws com.nimbusds.jose.JOSEException {
        this(eCPrivateKey, (java.util.Set<com.nimbusds.jose.JWSSignerOption>) null);
    }

    public ECDSASigner(java.security.interfaces.ECPrivateKey eCPrivateKey, java.util.Set<com.nimbusds.jose.JWSSignerOption> set) throws com.nimbusds.jose.JOSEException {
        super(com.nimbusds.jose.crypto.impl.ECDSA.resolveAlgorithm(eCPrivateKey));
        this.privateKey = eCPrivateKey;
        this.opts = set == null ? java.util.Collections.emptySet() : set;
    }

    public ECDSASigner(java.security.PrivateKey privateKey, com.nimbusds.jose.jwk.Curve curve) throws com.nimbusds.jose.JOSEException {
        this(privateKey, curve, null);
    }

    public ECDSASigner(java.security.PrivateKey privateKey, com.nimbusds.jose.jwk.Curve curve, java.util.Set<com.nimbusds.jose.JWSSignerOption> set) throws com.nimbusds.jose.JOSEException {
        super(com.nimbusds.jose.crypto.impl.ECDSA.resolveAlgorithm(curve));
        if (!"EC".equalsIgnoreCase(privateKey.getAlgorithm())) {
            throw new java.lang.IllegalArgumentException("The private key algorithm must be EC");
        }
        this.privateKey = privateKey;
        this.opts = set == null ? java.util.Collections.emptySet() : set;
    }

    public ECDSASigner(com.nimbusds.jose.jwk.ECKey eCKey) throws com.nimbusds.jose.JOSEException {
        this(eCKey, (java.util.Set<com.nimbusds.jose.JWSSignerOption>) null);
    }

    public ECDSASigner(com.nimbusds.jose.jwk.ECKey eCKey, java.util.Set<com.nimbusds.jose.JWSSignerOption> set) throws com.nimbusds.jose.JOSEException {
        super(com.nimbusds.jose.crypto.impl.ECDSA.resolveAlgorithm(eCKey.getCurve()));
        if (!eCKey.isPrivate()) {
            throw new com.nimbusds.jose.JOSEException("The EC JWK doesn't contain a private part");
        }
        this.privateKey = eCKey.toPrivateKey();
        this.opts = set == null ? java.util.Collections.emptySet() : set;
    }

    public java.security.PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    @Override // com.nimbusds.jose.JWSSigner
    public com.nimbusds.jose.util.Base64URL sign(final com.nimbusds.jose.JWSHeader jWSHeader, final byte[] bArr) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.JWSAlgorithm algorithm = jWSHeader.getAlgorithm();
        if (!supportedJWSAlgorithms().contains(algorithm)) {
            throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedJWSAlgorithm(algorithm, supportedJWSAlgorithms()));
        }
        try {
            final java.security.Signature signerAndVerifier = com.nimbusds.jose.crypto.impl.ECDSA.getSignerAndVerifier(algorithm, getJCAContext().getProvider());
            signerAndVerifier.initSign(this.privateKey, getJCAContext().getSecureRandom());
            if (com.nimbusds.jose.crypto.opts.OptionUtils.optionIsPresent(this.opts, com.nimbusds.jose.crypto.opts.UserAuthenticationRequired.class)) {
                throw new com.nimbusds.jose.ActionRequiredForJWSCompletionException("Authenticate user to complete signing", com.nimbusds.jose.crypto.opts.UserAuthenticationRequired.getInstance(), new com.nimbusds.jose.CompletableJWSObjectSigning() { // from class: com.nimbusds.jose.crypto.ECDSASigner.1
                    @Override // com.nimbusds.jose.CompletableJWSObjectSigning
                    public java.security.Signature getInitializedSignature() {
                        return signerAndVerifier;
                    }

                    @Override // com.nimbusds.jose.CompletableJWSObjectSigning
                    public com.nimbusds.jose.util.Base64URL complete() throws com.nimbusds.jose.JOSEException {
                        try {
                            signerAndVerifier.update(bArr);
                            return com.nimbusds.jose.util.Base64URL.encode(com.nimbusds.jose.crypto.impl.ECDSA.transcodeSignatureToConcat(signerAndVerifier.sign(), com.nimbusds.jose.crypto.impl.ECDSA.getSignatureByteArrayLength(jWSHeader.getAlgorithm())));
                        } catch (java.security.SignatureException e) {
                            throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
                        }
                    }
                });
            }
            signerAndVerifier.update(bArr);
            return com.nimbusds.jose.util.Base64URL.encode(com.nimbusds.jose.crypto.impl.ECDSA.transcodeSignatureToConcat(signerAndVerifier.sign(), com.nimbusds.jose.crypto.impl.ECDSA.getSignatureByteArrayLength(jWSHeader.getAlgorithm())));
        } catch (java.security.InvalidKeyException | java.security.SignatureException e) {
            throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
        }
    }
}
