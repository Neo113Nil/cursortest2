package com.nimbusds.jose;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class JWEObject extends com.nimbusds.jose.JOSEObject {
    private static final long serialVersionUID = 1;
    private com.nimbusds.jose.util.Base64URL authTag;
    private com.nimbusds.jose.util.Base64URL cipherText;
    private com.nimbusds.jose.util.Base64URL encryptedKey;
    private com.nimbusds.jose.JWEHeader header;
    private com.nimbusds.jose.util.Base64URL iv;
    private com.nimbusds.jose.JWEObject.State state;

    public enum State {
        UNENCRYPTED,
        ENCRYPTED,
        DECRYPTED
    }

    public JWEObject(com.nimbusds.jose.JWEHeader jWEHeader, com.nimbusds.jose.Payload payload) {
        if (jWEHeader == null) {
            throw new java.lang.IllegalArgumentException("The JWE header must not be null");
        }
        this.header = jWEHeader;
        if (payload == null) {
            throw new java.lang.IllegalArgumentException("The payload must not be null");
        }
        setPayload(payload);
        this.encryptedKey = null;
        this.cipherText = null;
        this.state = com.nimbusds.jose.JWEObject.State.UNENCRYPTED;
    }

    public JWEObject(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, com.nimbusds.jose.util.Base64URL base64URL5) throws java.text.ParseException {
        if (base64URL == null) {
            throw new java.lang.IllegalArgumentException("The first part must not be null");
        }
        try {
            this.header = com.nimbusds.jose.JWEHeader.parse(base64URL);
            if (base64URL2 == null || base64URL2.toString().isEmpty()) {
                this.encryptedKey = null;
            } else {
                this.encryptedKey = base64URL2;
            }
            if (base64URL3 == null || base64URL3.toString().isEmpty()) {
                this.iv = null;
            } else {
                this.iv = base64URL3;
            }
            if (base64URL4 == null) {
                throw new java.lang.IllegalArgumentException("The fourth part must not be null");
            }
            this.cipherText = base64URL4;
            if (base64URL5 == null || base64URL5.toString().isEmpty()) {
                this.authTag = null;
            } else {
                this.authTag = base64URL5;
            }
            this.state = com.nimbusds.jose.JWEObject.State.ENCRYPTED;
            setParsedParts(base64URL, base64URL2, base64URL3, base64URL4, base64URL5);
        } catch (java.text.ParseException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid JWE header: ");
            sb.append(e.getMessage());
            throw new java.text.ParseException(sb.toString(), 0);
        }
    }

    @Override // com.nimbusds.jose.JOSEObject
    public com.nimbusds.jose.JWEHeader getHeader() {
        return this.header;
    }

    public com.nimbusds.jose.util.Base64URL getEncryptedKey() {
        return this.encryptedKey;
    }

    public com.nimbusds.jose.util.Base64URL getIV() {
        return this.iv;
    }

    public com.nimbusds.jose.util.Base64URL getCipherText() {
        return this.cipherText;
    }

    public com.nimbusds.jose.util.Base64URL getAuthTag() {
        return this.authTag;
    }

    public com.nimbusds.jose.JWEObject.State getState() {
        return this.state;
    }

    private void ensureUnencryptedState() {
        if (this.state != com.nimbusds.jose.JWEObject.State.UNENCRYPTED) {
            throw new java.lang.IllegalStateException("The JWE object must be in an unencrypted state");
        }
    }

    private void ensureEncryptedState() {
        if (this.state != com.nimbusds.jose.JWEObject.State.ENCRYPTED) {
            throw new java.lang.IllegalStateException("The JWE object must be in an encrypted state");
        }
    }

    private void ensureEncryptedOrDecryptedState() {
        if (this.state != com.nimbusds.jose.JWEObject.State.ENCRYPTED && this.state != com.nimbusds.jose.JWEObject.State.DECRYPTED) {
            throw new java.lang.IllegalStateException("The JWE object must be in an encrypted or decrypted state");
        }
    }

    private void ensureJWEEncrypterSupport(com.nimbusds.jose.JWEEncrypter jWEEncrypter) throws com.nimbusds.jose.JOSEException {
        if (!jWEEncrypter.supportedJWEAlgorithms().contains(getHeader().getAlgorithm())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The ");
            sb.append(getHeader().getAlgorithm());
            sb.append(" algorithm is not supported by the JWE encrypter: Supported algorithms: ");
            sb.append(jWEEncrypter.supportedJWEAlgorithms());
            throw new com.nimbusds.jose.JOSEException(sb.toString());
        }
        if (jWEEncrypter.supportedEncryptionMethods().contains(getHeader().getEncryptionMethod())) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The ");
        sb2.append(getHeader().getEncryptionMethod());
        sb2.append(" encryption method or key size is not supported by the JWE encrypter: Supported methods: ");
        sb2.append(jWEEncrypter.supportedEncryptionMethods());
        throw new com.nimbusds.jose.JOSEException(sb2.toString());
    }

    public void encrypt(com.nimbusds.jose.JWEEncrypter jWEEncrypter) throws com.nimbusds.jose.JOSEException {
        synchronized (this) {
            ensureUnencryptedState();
            ensureJWEEncrypterSupport(jWEEncrypter);
            try {
                try {
                    com.nimbusds.jose.JWECryptoParts encrypt = jWEEncrypter.encrypt(getHeader(), getPayload().toBytes(), com.nimbusds.jose.crypto.impl.AAD.compute(getHeader()));
                    if (encrypt.getHeader() != null) {
                        this.header = encrypt.getHeader();
                    }
                    this.encryptedKey = encrypt.getEncryptedKey();
                    this.iv = encrypt.getInitializationVector();
                    this.cipherText = encrypt.getCipherText();
                    this.authTag = encrypt.getAuthenticationTag();
                    this.state = com.nimbusds.jose.JWEObject.State.ENCRYPTED;
                } catch (java.lang.Exception e) {
                    throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
                }
            } catch (com.nimbusds.jose.JOSEException e2) {
                throw e2;
            }
        }
    }

    public void decrypt(com.nimbusds.jose.JWEDecrypter jWEDecrypter) throws com.nimbusds.jose.JOSEException {
        synchronized (this) {
            ensureEncryptedState();
            try {
                try {
                    setPayload(new com.nimbusds.jose.Payload(jWEDecrypter.decrypt(getHeader(), getEncryptedKey(), getIV(), getCipherText(), getAuthTag(), com.nimbusds.jose.crypto.impl.AAD.compute(getHeader()))));
                    this.state = com.nimbusds.jose.JWEObject.State.DECRYPTED;
                } catch (com.nimbusds.jose.JOSEException e) {
                    throw e;
                }
            } catch (java.lang.Exception e2) {
                throw new com.nimbusds.jose.JOSEException(e2.getMessage(), e2);
            }
        }
    }

    @Override // com.nimbusds.jose.JOSEObject
    public java.lang.String serialize() {
        ensureEncryptedOrDecryptedState();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.header.toBase64URL().toString());
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        com.nimbusds.jose.util.Base64URL base64URL = this.encryptedKey;
        if (base64URL != null) {
            sb.append(base64URL);
        }
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        com.nimbusds.jose.util.Base64URL base64URL2 = this.iv;
        if (base64URL2 != null) {
            sb.append(base64URL2);
        }
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(this.cipherText);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        com.nimbusds.jose.util.Base64URL base64URL3 = this.authTag;
        if (base64URL3 != null) {
            sb.append(base64URL3);
        }
        return sb.toString();
    }

    public static com.nimbusds.jose.JWEObject parse(java.lang.String str) throws java.text.ParseException {
        com.nimbusds.jose.util.Base64URL[] split = com.nimbusds.jose.JOSEObject.split(str);
        if (split.length != 5) {
            throw new java.text.ParseException("Unexpected number of Base64URL parts, must be five", 0);
        }
        return new com.nimbusds.jose.JWEObject(split[0], split[1], split[2], split[3], split[4]);
    }
}
