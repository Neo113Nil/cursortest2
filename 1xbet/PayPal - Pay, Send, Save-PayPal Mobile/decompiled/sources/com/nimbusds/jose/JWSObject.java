package com.nimbusds.jose;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes4.dex */
public class JWSObject extends com.nimbusds.jose.JOSEObject {
    private static final long serialVersionUID = 1;
    private final com.nimbusds.jose.JWSHeader header;
    private com.nimbusds.jose.util.Base64URL signature;
    private final java.lang.String signingInputString;
    private final java.util.concurrent.atomic.AtomicReference<com.nimbusds.jose.JWSObject.State> state;

    public enum State {
        UNSIGNED,
        SIGNED,
        VERIFIED
    }

    public JWSObject(com.nimbusds.jose.JWSHeader jWSHeader, com.nimbusds.jose.Payload payload) {
        java.util.concurrent.atomic.AtomicReference<com.nimbusds.jose.JWSObject.State> atomicReference = new java.util.concurrent.atomic.AtomicReference<>();
        this.state = atomicReference;
        if (jWSHeader == null) {
            throw new java.lang.IllegalArgumentException("The JWS header must not be null");
        }
        this.header = jWSHeader;
        if (payload == null) {
            throw new java.lang.IllegalArgumentException("The payload must not be null");
        }
        setPayload(payload);
        this.signingInputString = composeSigningInput();
        this.signature = null;
        atomicReference.set(com.nimbusds.jose.JWSObject.State.UNSIGNED);
    }

    public JWSObject(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3) throws java.text.ParseException {
        this(base64URL, new com.nimbusds.jose.Payload(base64URL2), base64URL3);
    }

    public JWSObject(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.Payload payload, com.nimbusds.jose.util.Base64URL base64URL2) throws java.text.ParseException {
        java.util.concurrent.atomic.AtomicReference<com.nimbusds.jose.JWSObject.State> atomicReference = new java.util.concurrent.atomic.AtomicReference<>();
        this.state = atomicReference;
        if (base64URL == null) {
            throw new java.lang.IllegalArgumentException("The first part must not be null");
        }
        try {
            this.header = com.nimbusds.jose.JWSHeader.parse(base64URL);
            if (payload == null) {
                throw new java.lang.IllegalArgumentException("The payload (second part) must not be null");
            }
            setPayload(payload);
            this.signingInputString = composeSigningInput();
            if (base64URL2 == null) {
                throw new java.lang.IllegalArgumentException("The third part must not be null");
            }
            if (base64URL2.toString().trim().isEmpty()) {
                throw new java.text.ParseException("The signature must not be empty", 0);
            }
            this.signature = base64URL2;
            atomicReference.set(com.nimbusds.jose.JWSObject.State.SIGNED);
            if (getHeader().isBase64URLEncodePayload()) {
                setParsedParts(base64URL, payload.toBase64URL(), base64URL2);
            } else {
                setParsedParts(base64URL, new com.nimbusds.jose.util.Base64URL(""), base64URL2);
            }
        } catch (java.text.ParseException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid JWS header: ");
            sb.append(e.getMessage());
            throw new java.text.ParseException(sb.toString(), 0);
        }
    }

    @Override // com.nimbusds.jose.JOSEObject
    public com.nimbusds.jose.JWSHeader getHeader() {
        return this.header;
    }

    private java.lang.String composeSigningInput() {
        if (this.header.isBase64URLEncodePayload()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getHeader().toBase64URL().toString());
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            sb.append(getPayload().toBase64URL().toString());
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(getHeader().toBase64URL().toString());
        sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb2.append(getPayload().toString());
        return sb2.toString();
    }

    public byte[] getSigningInput() {
        return this.signingInputString.getBytes(com.nimbusds.jose.util.StandardCharset.UTF_8);
    }

    public com.nimbusds.jose.util.Base64URL getSignature() {
        return this.signature;
    }

    public com.nimbusds.jose.JWSObject.State getState() {
        return this.state.get();
    }

    private void ensureUnsignedState() {
        if (this.state.get() != com.nimbusds.jose.JWSObject.State.UNSIGNED) {
            throw new java.lang.IllegalStateException("The JWS object must be in an unsigned state");
        }
    }

    private void ensureSignedOrVerifiedState() {
        if (this.state.get() != com.nimbusds.jose.JWSObject.State.SIGNED && this.state.get() != com.nimbusds.jose.JWSObject.State.VERIFIED) {
            throw new java.lang.IllegalStateException("The JWS object must be in a signed or verified state");
        }
    }

    private void ensureJWSSignerSupport(com.nimbusds.jose.JWSSigner jWSSigner) throws com.nimbusds.jose.JOSEException {
        if (jWSSigner.supportedJWSAlgorithms().contains(getHeader().getAlgorithm())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The ");
        sb.append(getHeader().getAlgorithm());
        sb.append(" algorithm is not allowed or supported by the JWS signer: Supported algorithms: ");
        sb.append(jWSSigner.supportedJWSAlgorithms());
        throw new com.nimbusds.jose.JOSEException(sb.toString());
    }

    public void sign(com.nimbusds.jose.JWSSigner jWSSigner) throws com.nimbusds.jose.JOSEException {
        synchronized (this) {
            ensureUnsignedState();
            ensureJWSSignerSupport(jWSSigner);
            try {
                this.signature = jWSSigner.sign(getHeader(), getSigningInput());
                this.state.set(com.nimbusds.jose.JWSObject.State.SIGNED);
            } catch (com.nimbusds.jose.ActionRequiredForJWSCompletionException e) {
                throw new com.nimbusds.jose.ActionRequiredForJWSCompletionException(e.getMessage(), e.getTriggeringOption(), new com.nimbusds.jose.CompletableJWSObjectSigning() { // from class: com.nimbusds.jose.JWSObject.1
                    @Override // com.nimbusds.jose.CompletableJWSObjectSigning
                    public java.security.Signature getInitializedSignature() {
                        return e.getCompletableJWSObjectSigning().getInitializedSignature();
                    }

                    @Override // com.nimbusds.jose.CompletableJWSObjectSigning
                    public com.nimbusds.jose.util.Base64URL complete() throws com.nimbusds.jose.JOSEException {
                        com.nimbusds.jose.JWSObject.this.signature = e.getCompletableJWSObjectSigning().complete();
                        com.nimbusds.jose.JWSObject.this.state.set(com.nimbusds.jose.JWSObject.State.SIGNED);
                        return com.nimbusds.jose.JWSObject.this.signature;
                    }
                });
            } catch (com.nimbusds.jose.JOSEException e2) {
                throw e2;
            } catch (java.lang.Exception e3) {
                throw new com.nimbusds.jose.JOSEException(e3.getMessage(), e3);
            }
        }
    }

    public boolean verify(com.nimbusds.jose.JWSVerifier jWSVerifier) throws com.nimbusds.jose.JOSEException {
        boolean verify;
        synchronized (this) {
            ensureSignedOrVerifiedState();
            try {
                verify = jWSVerifier.verify(getHeader(), getSigningInput(), getSignature());
                if (verify) {
                    this.state.set(com.nimbusds.jose.JWSObject.State.VERIFIED);
                }
            } catch (com.nimbusds.jose.JOSEException e) {
                throw e;
            } catch (java.lang.Exception e2) {
                throw new com.nimbusds.jose.JOSEException(e2.getMessage(), e2);
            }
        }
        return verify;
    }

    @Override // com.nimbusds.jose.JOSEObject
    public java.lang.String serialize() {
        return serialize(false);
    }

    public java.lang.String serialize(boolean z) {
        ensureSignedOrVerifiedState();
        if (z) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.header.toBase64URL().toString());
            sb.append("..");
            sb.append(this.signature.toString());
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(this.signingInputString);
        sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb2.append(this.signature.toString());
        return sb2.toString();
    }

    public static com.nimbusds.jose.JWSObject parse(java.lang.String str) throws java.text.ParseException {
        com.nimbusds.jose.util.Base64URL[] split = com.nimbusds.jose.JOSEObject.split(str);
        if (split.length != 3) {
            throw new java.text.ParseException("Unexpected number of Base64URL parts, must be three", 0);
        }
        return new com.nimbusds.jose.JWSObject(split[0], split[1], split[2]);
    }

    public static com.nimbusds.jose.JWSObject parse(java.lang.String str, com.nimbusds.jose.Payload payload) throws java.text.ParseException {
        com.nimbusds.jose.util.Base64URL[] split = com.nimbusds.jose.JOSEObject.split(str);
        if (split.length != 3) {
            throw new java.text.ParseException("Unexpected number of Base64URL parts, must be three", 0);
        }
        if (!split[1].toString().isEmpty()) {
            throw new java.text.ParseException("The payload Base64URL part must be empty", 0);
        }
        return new com.nimbusds.jose.JWSObject(split[0], payload, split[2]);
    }
}
