package com.nimbusds.jose;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class JWSObjectJSON extends com.nimbusds.jose.JOSEObjectJSON {
    private static final long serialVersionUID = 1;
    private final java.util.List<com.nimbusds.jose.JWSObjectJSON.Signature> signatures;

    public enum State {
        UNSIGNED,
        SIGNED,
        VERIFIED
    }

    @net.jcip.annotations.Immutable
    public static final class Signature {
        private final com.nimbusds.jose.JWSHeader header;
        private final com.nimbusds.jose.Payload payload;
        private final com.nimbusds.jose.util.Base64URL signature;
        private final com.nimbusds.jose.UnprotectedHeader unprotectedHeader;
        private final java.util.concurrent.atomic.AtomicBoolean verified;

        private Signature(com.nimbusds.jose.Payload payload, com.nimbusds.jose.JWSHeader jWSHeader, com.nimbusds.jose.UnprotectedHeader unprotectedHeader, com.nimbusds.jose.util.Base64URL base64URL) {
            this.verified = new java.util.concurrent.atomic.AtomicBoolean(false);
            java.util.Objects.requireNonNull(payload);
            this.payload = payload;
            this.header = jWSHeader;
            this.unprotectedHeader = unprotectedHeader;
            java.util.Objects.requireNonNull(base64URL);
            this.signature = base64URL;
        }

        public final com.nimbusds.jose.JWSHeader getHeader() {
            return this.header;
        }

        public final com.nimbusds.jose.UnprotectedHeader getUnprotectedHeader() {
            return this.unprotectedHeader;
        }

        public final com.nimbusds.jose.util.Base64URL getSignature() {
            return this.signature;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.util.Map<java.lang.String, java.lang.Object> toJSONObject() {
            java.util.Map<java.lang.String, java.lang.Object> newJSONObject = com.nimbusds.jose.util.JSONObjectUtils.newJSONObject();
            com.nimbusds.jose.JWSHeader jWSHeader = this.header;
            if (jWSHeader != null) {
                newJSONObject.put("protected", jWSHeader.toBase64URL().toString());
            }
            com.nimbusds.jose.UnprotectedHeader unprotectedHeader = this.unprotectedHeader;
            if (unprotectedHeader != null && !unprotectedHeader.getIncludedParams().isEmpty()) {
                newJSONObject.put(com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, this.unprotectedHeader.toJSONObject());
            }
            newJSONObject.put("signature", this.signature.toString());
            return newJSONObject;
        }

        public final com.nimbusds.jose.JWSObject toJWSObject() {
            try {
                return new com.nimbusds.jose.JWSObject(this.header.toBase64URL(), this.payload.toBase64URL(), this.signature);
            } catch (java.text.ParseException unused) {
                throw new java.lang.IllegalStateException();
            }
        }

        public final boolean isVerified() {
            return this.verified.get();
        }

        public final boolean verify(com.nimbusds.jose.JWSVerifier jWSVerifier) throws com.nimbusds.jose.JOSEException {
            boolean z;
            synchronized (this) {
                try {
                    try {
                        this.verified.set(toJWSObject().verify(jWSVerifier));
                        z = this.verified.get();
                    } catch (java.lang.Exception e) {
                        throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
                    }
                } catch (com.nimbusds.jose.JOSEException e2) {
                    throw e2;
                }
            }
            return z;
        }
    }

    public JWSObjectJSON(com.nimbusds.jose.Payload payload) {
        super(payload);
        this.signatures = new java.util.LinkedList();
        java.util.Objects.requireNonNull(payload, "The payload must not be null");
    }

    private JWSObjectJSON(com.nimbusds.jose.Payload payload, java.util.List<com.nimbusds.jose.JWSObjectJSON.Signature> list) {
        super(payload);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.signatures = linkedList;
        java.util.Objects.requireNonNull(payload, "The payload must not be null");
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("At least one signature required");
        }
        linkedList.addAll(list);
    }

    public java.util.List<com.nimbusds.jose.JWSObjectJSON.Signature> getSignatures() {
        return java.util.Collections.unmodifiableList(this.signatures);
    }

    public void sign(com.nimbusds.jose.JWSHeader jWSHeader, com.nimbusds.jose.JWSSigner jWSSigner) throws com.nimbusds.jose.JOSEException {
        synchronized (this) {
            sign(jWSHeader, null, jWSSigner);
        }
    }

    public void sign(com.nimbusds.jose.JWSHeader jWSHeader, com.nimbusds.jose.UnprotectedHeader unprotectedHeader, com.nimbusds.jose.JWSSigner jWSSigner) throws com.nimbusds.jose.JOSEException {
        synchronized (this) {
            try {
                com.nimbusds.jose.HeaderValidation.ensureDisjoint(jWSHeader, unprotectedHeader);
                com.nimbusds.jose.JWSObject jWSObject = new com.nimbusds.jose.JWSObject(jWSHeader, getPayload());
                jWSObject.sign(jWSSigner);
                this.signatures.add(new com.nimbusds.jose.JWSObjectJSON.Signature(getPayload(), jWSHeader, unprotectedHeader, jWSObject.getSignature()));
            } catch (com.nimbusds.jose.IllegalHeaderException e) {
                throw new java.lang.IllegalArgumentException(e.getMessage(), e);
            }
        }
    }

    public com.nimbusds.jose.JWSObjectJSON.State getState() {
        if (getSignatures().isEmpty()) {
            return com.nimbusds.jose.JWSObjectJSON.State.UNSIGNED;
        }
        java.util.Iterator<com.nimbusds.jose.JWSObjectJSON.Signature> it = getSignatures().iterator();
        while (it.hasNext()) {
            if (!it.next().isVerified()) {
                return com.nimbusds.jose.JWSObjectJSON.State.SIGNED;
            }
        }
        return com.nimbusds.jose.JWSObjectJSON.State.VERIFIED;
    }

    @Override // com.nimbusds.jose.JOSEObjectJSON
    public java.util.Map<java.lang.String, java.lang.Object> toGeneralJSONObject() {
        if (this.signatures.size() <= 0) {
            throw new java.lang.IllegalStateException("The general JWS JSON serialization requires at least one signature");
        }
        java.util.Map<java.lang.String, java.lang.Object> newJSONObject = com.nimbusds.jose.util.JSONObjectUtils.newJSONObject();
        newJSONObject.put("payload", getPayload().toBase64URL().toString());
        java.util.List<java.lang.Object> newJSONArray = com.nimbusds.jose.util.JSONArrayUtils.newJSONArray();
        java.util.Iterator<com.nimbusds.jose.JWSObjectJSON.Signature> it = getSignatures().iterator();
        while (it.hasNext()) {
            newJSONArray.add(it.next().toJSONObject());
        }
        newJSONObject.put("signatures", newJSONArray);
        return newJSONObject;
    }

    @Override // com.nimbusds.jose.JOSEObjectJSON
    public java.util.Map<java.lang.String, java.lang.Object> toFlattenedJSONObject() {
        if (this.signatures.size() != 1) {
            throw new java.lang.IllegalStateException("The flattened JWS JSON serialization requires exactly one signature");
        }
        java.util.Map<java.lang.String, java.lang.Object> newJSONObject = com.nimbusds.jose.util.JSONObjectUtils.newJSONObject();
        newJSONObject.put("payload", getPayload().toBase64URL().toString());
        newJSONObject.putAll(getSignatures().get(0).toJSONObject());
        return newJSONObject;
    }

    @Override // com.nimbusds.jose.JOSEObjectJSON
    public java.lang.String serializeGeneral() {
        return com.nimbusds.jose.util.JSONObjectUtils.toJSONString(toGeneralJSONObject());
    }

    @Override // com.nimbusds.jose.JOSEObjectJSON
    public java.lang.String serializeFlattened() {
        return com.nimbusds.jose.util.JSONObjectUtils.toJSONString(toFlattenedJSONObject());
    }

    private static com.nimbusds.jose.JWSHeader parseJWSHeader(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        com.nimbusds.jose.util.Base64URL base64URL = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "protected");
        if (base64URL == null) {
            throw new java.text.ParseException("Missing protected header (required by this library)", 0);
        }
        try {
            return com.nimbusds.jose.JWSHeader.parse(base64URL);
        } catch (java.text.ParseException e) {
            if ("Not a JWS header".equals(e.getMessage())) {
                throw new java.text.ParseException("Missing JWS \"alg\" parameter in protected header (required by this library)", 0);
            }
            throw e;
        }
    }

    public static com.nimbusds.jose.JWSObjectJSON parse(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        com.nimbusds.jose.util.Base64URL base64URL = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "payload");
        if (base64URL == null) {
            throw new java.text.ParseException("Missing payload", 0);
        }
        com.nimbusds.jose.Payload payload = new com.nimbusds.jose.Payload(base64URL);
        com.nimbusds.jose.util.Base64URL base64URL2 = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "signature");
        boolean z = base64URL2 != null;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (z) {
            com.nimbusds.jose.JWSHeader parseJWSHeader = parseJWSHeader(map);
            com.nimbusds.jose.UnprotectedHeader parse = com.nimbusds.jose.UnprotectedHeader.parse(com.nimbusds.jose.util.JSONObjectUtils.getJSONObject(map, com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER));
            if (map.get("signatures") != null) {
                throw new java.text.ParseException("The \"signatures\" member must not be present in flattened JWS JSON serialization", 0);
            }
            try {
                com.nimbusds.jose.HeaderValidation.ensureDisjoint(parseJWSHeader, parse);
                linkedList.add(new com.nimbusds.jose.JWSObjectJSON.Signature(payload, parseJWSHeader, parse, base64URL2));
            } catch (com.nimbusds.jose.IllegalHeaderException e) {
                throw new java.text.ParseException(e.getMessage(), 0);
            }
        } else {
            java.util.Map<java.lang.String, java.lang.Object>[] jSONObjectArray = com.nimbusds.jose.util.JSONObjectUtils.getJSONObjectArray(map, "signatures");
            if (jSONObjectArray == null || jSONObjectArray.length == 0) {
                throw new java.text.ParseException("The \"signatures\" member must be present in general JSON Serialization", 0);
            }
            for (java.util.Map<java.lang.String, java.lang.Object> map2 : jSONObjectArray) {
                com.nimbusds.jose.JWSHeader parseJWSHeader2 = parseJWSHeader(map2);
                com.nimbusds.jose.UnprotectedHeader parse2 = com.nimbusds.jose.UnprotectedHeader.parse(com.nimbusds.jose.util.JSONObjectUtils.getJSONObject(map2, com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER));
                try {
                    com.nimbusds.jose.HeaderValidation.ensureDisjoint(parseJWSHeader2, parse2);
                    com.nimbusds.jose.util.Base64URL base64URL3 = com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map2, "signature");
                    if (base64URL3 == null) {
                        throw new java.text.ParseException("Missing \"signature\" member", 0);
                    }
                    linkedList.add(new com.nimbusds.jose.JWSObjectJSON.Signature(payload, parseJWSHeader2, parse2, base64URL3));
                } catch (com.nimbusds.jose.IllegalHeaderException e2) {
                    throw new java.text.ParseException(e2.getMessage(), 0);
                }
            }
        }
        return new com.nimbusds.jose.JWSObjectJSON(payload, linkedList);
    }

    public static com.nimbusds.jose.JWSObjectJSON parse(java.lang.String str) throws java.text.ParseException {
        return parse(com.nimbusds.jose.util.JSONObjectUtils.parse(str));
    }
}
