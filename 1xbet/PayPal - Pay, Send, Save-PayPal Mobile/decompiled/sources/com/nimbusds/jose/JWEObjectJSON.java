package com.nimbusds.jose;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class JWEObjectJSON extends com.nimbusds.jose.JOSEObjectJSON {
    private static final long serialVersionUID = 1;
    private final byte[] aad;
    private com.nimbusds.jose.util.Base64URL authTag;
    private com.nimbusds.jose.util.Base64URL cipherText;
    private final com.nimbusds.jose.JWEHeader header;
    private com.nimbusds.jose.util.Base64URL iv;
    private final java.util.List<com.nimbusds.jose.JWEObjectJSON.Recipient> recipients;
    private com.nimbusds.jose.JWEObject.State state;
    private com.nimbusds.jose.UnprotectedHeader unprotectedHeader;

    @net.jcip.annotations.Immutable
    public static final class Recipient {
        private final com.nimbusds.jose.util.Base64URL encryptedKey;
        private final com.nimbusds.jose.UnprotectedHeader unprotectedHeader;

        public Recipient(com.nimbusds.jose.UnprotectedHeader unprotectedHeader, com.nimbusds.jose.util.Base64URL base64URL) {
            this.unprotectedHeader = unprotectedHeader;
            this.encryptedKey = base64URL;
        }

        public final com.nimbusds.jose.UnprotectedHeader getUnprotectedHeader() {
            return this.unprotectedHeader;
        }

        public final com.nimbusds.jose.util.Base64URL getEncryptedKey() {
            return this.encryptedKey;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> toJSONObject() {
            java.util.Map<java.lang.String, java.lang.Object> newJSONObject = com.nimbusds.jose.util.JSONObjectUtils.newJSONObject();
            com.nimbusds.jose.UnprotectedHeader unprotectedHeader = this.unprotectedHeader;
            if (unprotectedHeader != null && !unprotectedHeader.getIncludedParams().isEmpty()) {
                newJSONObject.put(com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, this.unprotectedHeader.toJSONObject());
            }
            com.nimbusds.jose.util.Base64URL base64URL = this.encryptedKey;
            if (base64URL != null) {
                newJSONObject.put("encrypted_key", base64URL.toString());
            }
            return newJSONObject;
        }

        public static com.nimbusds.jose.JWEObjectJSON.Recipient parse(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
            return new com.nimbusds.jose.JWEObjectJSON.Recipient(com.nimbusds.jose.UnprotectedHeader.parse(com.nimbusds.jose.util.JSONObjectUtils.getJSONObject(map, com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER)), com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "encrypted_key"));
        }
    }

    public JWEObjectJSON(com.nimbusds.jose.JWEObject jWEObject) {
        super(jWEObject.getPayload());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.recipients = linkedList;
        this.header = jWEObject.getHeader();
        this.aad = null;
        this.iv = jWEObject.getIV();
        this.cipherText = jWEObject.getCipherText();
        this.authTag = jWEObject.getAuthTag();
        if (jWEObject.getState() == com.nimbusds.jose.JWEObject.State.ENCRYPTED) {
            linkedList.add(new com.nimbusds.jose.JWEObjectJSON.Recipient(null, jWEObject.getEncryptedKey()));
            this.state = com.nimbusds.jose.JWEObject.State.ENCRYPTED;
        } else if (jWEObject.getState() == com.nimbusds.jose.JWEObject.State.DECRYPTED) {
            linkedList.add(new com.nimbusds.jose.JWEObjectJSON.Recipient(null, jWEObject.getEncryptedKey()));
            this.state = com.nimbusds.jose.JWEObject.State.DECRYPTED;
        } else {
            this.state = com.nimbusds.jose.JWEObject.State.UNENCRYPTED;
        }
    }

    public JWEObjectJSON(com.nimbusds.jose.JWEHeader jWEHeader, com.nimbusds.jose.Payload payload) {
        this(jWEHeader, payload, null, null);
    }

    public JWEObjectJSON(com.nimbusds.jose.JWEHeader jWEHeader, com.nimbusds.jose.Payload payload, com.nimbusds.jose.UnprotectedHeader unprotectedHeader, byte[] bArr) {
        super(payload);
        this.recipients = new java.util.LinkedList();
        if (jWEHeader == null) {
            throw new java.lang.IllegalArgumentException("The JWE protected header must not be null");
        }
        this.header = jWEHeader;
        if (payload == null) {
            throw new java.lang.IllegalArgumentException("The payload must not be null");
        }
        setPayload(payload);
        this.unprotectedHeader = unprotectedHeader;
        this.aad = bArr;
        this.cipherText = null;
        this.state = com.nimbusds.jose.JWEObject.State.UNENCRYPTED;
    }

    public JWEObjectJSON(com.nimbusds.jose.JWEHeader jWEHeader, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, java.util.List<com.nimbusds.jose.JWEObjectJSON.Recipient> list, com.nimbusds.jose.UnprotectedHeader unprotectedHeader, byte[] bArr) {
        super(null);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.recipients = linkedList;
        if (jWEHeader == null) {
            throw new java.lang.IllegalArgumentException("The JWE protected header must not be null");
        }
        if (base64URL == null) {
            throw new java.lang.IllegalArgumentException("The cipher text must not be null");
        }
        this.header = jWEHeader;
        linkedList.addAll(list);
        this.unprotectedHeader = unprotectedHeader;
        this.aad = bArr;
        this.iv = base64URL2;
        this.cipherText = base64URL;
        this.authTag = base64URL3;
        this.state = com.nimbusds.jose.JWEObject.State.ENCRYPTED;
    }

    public com.nimbusds.jose.JWEHeader getHeader() {
        return this.header;
    }

    public com.nimbusds.jose.UnprotectedHeader getUnprotectedHeader() {
        return this.unprotectedHeader;
    }

    public com.nimbusds.jose.util.Base64URL getEncryptedKey() {
        if (this.recipients.isEmpty()) {
            return null;
        }
        if (this.recipients.size() == 1) {
            return this.recipients.get(0).getEncryptedKey();
        }
        java.util.List<java.lang.Object> newJSONArray = com.nimbusds.jose.util.JSONArrayUtils.newJSONArray();
        java.util.Iterator<com.nimbusds.jose.JWEObjectJSON.Recipient> it = this.recipients.iterator();
        while (it.hasNext()) {
            newJSONArray.add(it.next().toJSONObject());
        }
        java.util.Map<java.lang.String, java.lang.Object> newJSONObject = com.nimbusds.jose.util.JSONObjectUtils.newJSONObject();
        newJSONObject.put("recipients", newJSONArray);
        return com.nimbusds.jose.util.Base64URL.encode(com.nimbusds.jose.util.JSONObjectUtils.toJSONString(newJSONObject));
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

    public byte[] getAAD() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.header.toBase64URL().toString());
        byte[] bArr = this.aad;
        if (bArr != null && bArr.length > 0) {
            sb.append(".");
            sb.append(new java.lang.String(this.aad, java.nio.charset.StandardCharsets.US_ASCII));
        }
        return sb.toString().getBytes(java.nio.charset.StandardCharsets.US_ASCII);
    }

    public java.util.List<com.nimbusds.jose.JWEObjectJSON.Recipient> getRecipients() {
        return java.util.Collections.unmodifiableList(this.recipients);
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
            getHeader();
            try {
                com.nimbusds.jose.JWEHeader jWEHeader = (com.nimbusds.jose.JWEHeader) getHeader().join(this.unprotectedHeader);
                com.nimbusds.jose.JWECryptoParts encrypt = jWEEncrypter.encrypt(jWEHeader, getPayload().toBytes(), getAAD());
                com.nimbusds.jose.util.Base64URL encryptedKey = encrypt.getEncryptedKey();
                try {
                    for (java.util.Map<java.lang.String, java.lang.Object> map : com.nimbusds.jose.util.JSONObjectUtils.getJSONObjectArray(com.nimbusds.jose.util.JSONObjectUtils.parse(encryptedKey.decodeToString()), "recipients")) {
                        this.recipients.add(com.nimbusds.jose.JWEObjectJSON.Recipient.parse(map));
                    }
                } catch (java.lang.Exception unused) {
                    java.util.Map<java.lang.String, java.lang.Object> jSONObject = encrypt.getHeader().toJSONObject();
                    for (java.lang.String str : jWEHeader.getIncludedParams()) {
                        if (jSONObject.containsKey(str)) {
                            jSONObject.remove(str);
                        }
                    }
                    try {
                        this.recipients.add(new com.nimbusds.jose.JWEObjectJSON.Recipient(com.nimbusds.jose.UnprotectedHeader.parse(jSONObject), encryptedKey));
                    } catch (java.lang.Exception e) {
                        throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
                    }
                }
                this.iv = encrypt.getInitializationVector();
                this.cipherText = encrypt.getCipherText();
                this.authTag = encrypt.getAuthenticationTag();
                this.state = com.nimbusds.jose.JWEObject.State.ENCRYPTED;
            } catch (com.nimbusds.jose.JOSEException e2) {
                throw e2;
            } catch (java.lang.Exception e3) {
                throw new com.nimbusds.jose.JOSEException(e3.getMessage(), e3);
            }
        }
    }

    public void decrypt(com.nimbusds.jose.JWEDecrypter jWEDecrypter) throws com.nimbusds.jose.JOSEException {
        synchronized (this) {
            ensureEncryptedState();
            try {
                setPayload(new com.nimbusds.jose.Payload(jWEDecrypter.decrypt(getHeader(), getEncryptedKey(), getIV(), getCipherText(), getAuthTag(), getAAD())));
                this.state = com.nimbusds.jose.JWEObject.State.DECRYPTED;
            } catch (com.nimbusds.jose.JOSEException e) {
                throw e;
            } catch (java.lang.Exception e2) {
                throw new com.nimbusds.jose.JOSEException(e2.getMessage(), e2);
            }
        }
    }

    private java.util.Map<java.lang.String, java.lang.Object> toBaseJSONObject() {
        java.util.Map<java.lang.String, java.lang.Object> newJSONObject = com.nimbusds.jose.util.JSONObjectUtils.newJSONObject();
        newJSONObject.put("protected", this.header.toBase64URL().toString());
        byte[] bArr = this.aad;
        if (bArr != null) {
            newJSONObject.put("aad", new java.lang.String(bArr, java.nio.charset.StandardCharsets.US_ASCII));
        }
        newJSONObject.put("ciphertext", this.cipherText.toString());
        newJSONObject.put("iv", this.iv.toString());
        newJSONObject.put("tag", this.authTag.toString());
        return newJSONObject;
    }

    @Override // com.nimbusds.jose.JOSEObjectJSON
    public java.util.Map<java.lang.String, java.lang.Object> toGeneralJSONObject() {
        ensureEncryptedOrDecryptedState();
        if (this.recipients.isEmpty() || (this.recipients.get(0).getUnprotectedHeader() == null && this.recipients.get(0).getEncryptedKey() == null)) {
            throw new java.lang.IllegalStateException("The general JWE JSON serialization requires at least one recipient");
        }
        java.util.Map<java.lang.String, java.lang.Object> baseJSONObject = toBaseJSONObject();
        com.nimbusds.jose.UnprotectedHeader unprotectedHeader = this.unprotectedHeader;
        if (unprotectedHeader != null) {
            baseJSONObject.put("unprotected", unprotectedHeader.toJSONObject());
        }
        java.util.List<java.lang.Object> newJSONArray = com.nimbusds.jose.util.JSONArrayUtils.newJSONArray();
        java.util.Iterator<com.nimbusds.jose.JWEObjectJSON.Recipient> it = this.recipients.iterator();
        while (it.hasNext()) {
            newJSONArray.add(it.next().toJSONObject());
        }
        baseJSONObject.put("recipients", newJSONArray);
        return baseJSONObject;
    }

    @Override // com.nimbusds.jose.JOSEObjectJSON
    public java.util.Map<java.lang.String, java.lang.Object> toFlattenedJSONObject() {
        ensureEncryptedOrDecryptedState();
        if (this.recipients.size() != 1) {
            throw new java.lang.IllegalStateException("The flattened JWE JSON serialization requires exactly one recipient");
        }
        java.util.Map<java.lang.String, java.lang.Object> baseJSONObject = toBaseJSONObject();
        java.util.Map<java.lang.String, java.lang.Object> newJSONObject = com.nimbusds.jose.util.JSONObjectUtils.newJSONObject();
        if (this.recipients.get(0).getUnprotectedHeader() != null) {
            newJSONObject.putAll(this.recipients.get(0).getUnprotectedHeader().toJSONObject());
        }
        com.nimbusds.jose.UnprotectedHeader unprotectedHeader = this.unprotectedHeader;
        if (unprotectedHeader != null) {
            newJSONObject.putAll(unprotectedHeader.toJSONObject());
        }
        if (newJSONObject.size() > 0) {
            baseJSONObject.put("unprotected", newJSONObject);
        }
        if (this.recipients.get(0).getEncryptedKey() != null) {
            baseJSONObject.put("encrypted_key", this.recipients.get(0).getEncryptedKey().toString());
        }
        return baseJSONObject;
    }

    @Override // com.nimbusds.jose.JOSEObjectJSON
    public java.lang.String serializeGeneral() {
        return com.nimbusds.jose.util.JSONObjectUtils.toJSONString(toGeneralJSONObject());
    }

    @Override // com.nimbusds.jose.JOSEObjectJSON
    public java.lang.String serializeFlattened() {
        return com.nimbusds.jose.util.JSONObjectUtils.toJSONString(toFlattenedJSONObject());
    }

    public static com.nimbusds.jose.JWEObjectJSON parse(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        if (map == null) {
            throw new java.lang.IllegalArgumentException("The JSON object must not be null");
        }
        if (!map.containsKey("protected")) {
            throw new java.text.ParseException("The JWE protected header mast be present", 0);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.nimbusds.jose.JWEHeader parse = com.nimbusds.jose.JWEHeader.parse(com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "protected"));
        com.nimbusds.jose.UnprotectedHeader parse2 = com.nimbusds.jose.UnprotectedHeader.parse(com.nimbusds.jose.util.JSONObjectUtils.getJSONObject(map, "unprotected"));
        com.nimbusds.jose.util.Base64URL base64URL = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "ciphertext");
        com.nimbusds.jose.util.Base64URL base64URL2 = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "iv");
        com.nimbusds.jose.util.Base64URL base64URL3 = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "tag");
        com.nimbusds.jose.util.Base64URL base64URL4 = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "aad");
        com.nimbusds.jose.JWEHeader jWEHeader = (com.nimbusds.jose.JWEHeader) parse.join(parse2);
        if (map.containsKey("recipients")) {
            java.util.Map<java.lang.String, java.lang.Object>[] jSONObjectArray = com.nimbusds.jose.util.JSONObjectUtils.getJSONObjectArray(map, "recipients");
            if (jSONObjectArray == null || jSONObjectArray.length == 0) {
                throw new java.text.ParseException("The \"recipients\" member must be present in general JSON Serialization", 0);
            }
            for (java.util.Map<java.lang.String, java.lang.Object> map2 : jSONObjectArray) {
                com.nimbusds.jose.JWEObjectJSON.Recipient parse3 = com.nimbusds.jose.JWEObjectJSON.Recipient.parse(map2);
                try {
                    com.nimbusds.jose.HeaderValidation.ensureDisjoint(jWEHeader, parse3.getUnprotectedHeader());
                    linkedList.add(parse3);
                } catch (com.nimbusds.jose.IllegalHeaderException e) {
                    throw new java.text.ParseException(e.getMessage(), 0);
                }
            }
        } else {
            linkedList.add(new com.nimbusds.jose.JWEObjectJSON.Recipient(null, com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "encrypted_key")));
        }
        return new com.nimbusds.jose.JWEObjectJSON(parse, base64URL, base64URL2, base64URL3, linkedList, parse2, base64URL4 == null ? null : base64URL4.toString().getBytes(java.nio.charset.StandardCharsets.US_ASCII));
    }

    public static com.nimbusds.jose.JWEObjectJSON parse(java.lang.String str) throws java.text.ParseException {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("The JSON object string must not be null");
        }
        return parse(com.nimbusds.jose.util.JSONObjectUtils.parse(str));
    }
}
