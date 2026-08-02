package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class RSASSASigner extends com.nimbusds.jose.crypto.impl.RSASSAProvider implements com.nimbusds.jose.JWSSigner {
    private final java.util.Set<com.nimbusds.jose.JWSSignerOption> opts;
    private final java.security.PrivateKey privateKey;

    public RSASSASigner(java.security.PrivateKey privateKey) {
        this(privateKey, false);
    }

    @java.lang.Deprecated
    public RSASSASigner(java.security.PrivateKey privateKey, boolean z) {
        this(privateKey, (java.util.Set<com.nimbusds.jose.JWSSignerOption>) (z ? java.util.Collections.singleton(com.nimbusds.jose.crypto.opts.AllowWeakRSAKey.getInstance()) : java.util.Collections.emptySet()));
    }

    public RSASSASigner(java.security.PrivateKey privateKey, java.util.Set<com.nimbusds.jose.JWSSignerOption> set) {
        int keyBitLength;
        if ((privateKey instanceof java.security.interfaces.RSAPrivateKey) || "RSA".equalsIgnoreCase(privateKey.getAlgorithm())) {
            this.privateKey = privateKey;
            set = set == null ? java.util.Collections.emptySet() : set;
            this.opts = set;
            if (!com.nimbusds.jose.crypto.opts.OptionUtils.optionIsPresent(set, com.nimbusds.jose.crypto.opts.AllowWeakRSAKey.class) && (keyBitLength = com.nimbusds.jose.crypto.impl.RSAKeyUtils.keyBitLength(privateKey)) > 0 && keyBitLength < 2048) {
                throw new java.lang.IllegalArgumentException("The RSA key size must be at least 2048 bits");
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("The private key algorithm must be RSA");
    }

    public RSASSASigner(com.nimbusds.jose.jwk.RSAKey rSAKey) throws com.nimbusds.jose.JOSEException {
        this(rSAKey, (java.util.Set<com.nimbusds.jose.JWSSignerOption>) null);
    }

    @java.lang.Deprecated
    public RSASSASigner(com.nimbusds.jose.jwk.RSAKey rSAKey, boolean z) throws com.nimbusds.jose.JOSEException {
        this(com.nimbusds.jose.crypto.impl.RSAKeyUtils.toRSAPrivateKey(rSAKey), z);
    }

    public RSASSASigner(com.nimbusds.jose.jwk.RSAKey rSAKey, java.util.Set<com.nimbusds.jose.JWSSignerOption> set) throws com.nimbusds.jose.JOSEException {
        this(com.nimbusds.jose.crypto.impl.RSAKeyUtils.toRSAPrivateKey(rSAKey), set);
    }

    public java.security.PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    @Override // com.nimbusds.jose.JWSSigner
    public com.nimbusds.jose.util.Base64URL sign(com.nimbusds.jose.JWSHeader jWSHeader, final byte[] bArr) throws com.nimbusds.jose.JOSEException {
        final java.security.Signature initiatedSignature = getInitiatedSignature(jWSHeader);
        if (com.nimbusds.jose.crypto.opts.OptionUtils.optionIsPresent(this.opts, com.nimbusds.jose.crypto.opts.UserAuthenticationRequired.class)) {
            throw new com.nimbusds.jose.ActionRequiredForJWSCompletionException("Authenticate user to complete signing", com.nimbusds.jose.crypto.opts.UserAuthenticationRequired.getInstance(), new com.nimbusds.jose.CompletableJWSObjectSigning() { // from class: com.nimbusds.jose.crypto.RSASSASigner.1
                @Override // com.nimbusds.jose.CompletableJWSObjectSigning
                public java.security.Signature getInitializedSignature() {
                    return initiatedSignature;
                }

                @Override // com.nimbusds.jose.CompletableJWSObjectSigning
                public com.nimbusds.jose.util.Base64URL complete() throws com.nimbusds.jose.JOSEException {
                    return com.nimbusds.jose.crypto.RSASSASigner.this.sign(bArr, initiatedSignature);
                }
            });
        }
        return sign(bArr, initiatedSignature);
    }

    private java.security.Signature getInitiatedSignature(com.nimbusds.jose.JWSHeader jWSHeader) throws com.nimbusds.jose.JOSEException {
        java.security.Signature signerAndVerifier = com.nimbusds.jose.crypto.impl.RSASSA.getSignerAndVerifier(jWSHeader.getAlgorithm(), getJCAContext().getProvider());
        try {
            signerAndVerifier.initSign(this.privateKey);
            return signerAndVerifier;
        } catch (java.security.InvalidKeyException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid private RSA key: ");
            sb.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.nimbusds.jose.util.Base64URL sign(byte[] bArr, java.security.Signature signature) throws com.nimbusds.jose.JOSEException {
        try {
            signature.update(bArr);
            return com.nimbusds.jose.util.Base64URL.encode(signature.sign());
        } catch (java.security.SignatureException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RSA signature exception: ");
            sb.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
        }
    }
}
