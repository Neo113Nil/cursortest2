package com.nimbusds.jose;

/* loaded from: classes4.dex */
public abstract class JOSEObject implements java.io.Serializable {
    public static final java.lang.String MIME_TYPE_COMPACT = "application/jose; charset=UTF-8";

    @java.lang.Deprecated
    public static final java.lang.String MIME_TYPE_JS = "application/jose+json; charset=UTF-8";
    private static final long serialVersionUID = 1;
    private com.nimbusds.jose.util.Base64URL[] parsedParts;
    private com.nimbusds.jose.Payload payload;

    public abstract com.nimbusds.jose.Header getHeader();

    public abstract java.lang.String serialize();

    protected JOSEObject() {
        this.payload = null;
        this.parsedParts = null;
    }

    protected JOSEObject(com.nimbusds.jose.Payload payload) {
        this.payload = payload;
    }

    public void setPayload(com.nimbusds.jose.Payload payload) {
        this.payload = payload;
    }

    public com.nimbusds.jose.Payload getPayload() {
        return this.payload;
    }

    protected void setParsedParts(com.nimbusds.jose.util.Base64URL... base64URLArr) {
        this.parsedParts = base64URLArr;
    }

    public com.nimbusds.jose.util.Base64URL[] getParsedParts() {
        return this.parsedParts;
    }

    public java.lang.String getParsedString() {
        if (this.parsedParts == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (com.nimbusds.jose.util.Base64URL base64URL : this.parsedParts) {
            if (sb.length() > 0) {
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            }
            if (base64URL != null) {
                sb.append(base64URL);
            }
        }
        return sb.toString();
    }

    public static com.nimbusds.jose.util.Base64URL[] split(java.lang.String str) throws java.text.ParseException {
        java.lang.String trim = str.trim();
        int indexOf = trim.indexOf(".");
        if (indexOf == -1) {
            throw new java.text.ParseException("Invalid serialized unsecured/JWS/JWE object: Missing part delimiters", 0);
        }
        int i = indexOf + 1;
        int indexOf2 = trim.indexOf(".", i);
        if (indexOf2 == -1) {
            throw new java.text.ParseException("Invalid serialized unsecured/JWS/JWE object: Missing second delimiter", 0);
        }
        int i2 = indexOf2 + 1;
        int indexOf3 = trim.indexOf(".", i2);
        if (indexOf3 == -1) {
            return new com.nimbusds.jose.util.Base64URL[]{new com.nimbusds.jose.util.Base64URL(trim.substring(0, indexOf)), new com.nimbusds.jose.util.Base64URL(trim.substring(i, indexOf2)), new com.nimbusds.jose.util.Base64URL(trim.substring(i2))};
        }
        int i3 = indexOf3 + 1;
        int indexOf4 = trim.indexOf(".", i3);
        if (indexOf4 == -1) {
            throw new java.text.ParseException("Invalid serialized JWE object: Missing fourth delimiter", 0);
        }
        if (indexOf4 != -1 && trim.indexOf(".", indexOf4 + 1) != -1) {
            throw new java.text.ParseException("Invalid serialized unsecured/JWS/JWE object: Too many part delimiters", 0);
        }
        return new com.nimbusds.jose.util.Base64URL[]{new com.nimbusds.jose.util.Base64URL(trim.substring(0, indexOf)), new com.nimbusds.jose.util.Base64URL(trim.substring(i, indexOf2)), new com.nimbusds.jose.util.Base64URL(trim.substring(i2, indexOf3)), new com.nimbusds.jose.util.Base64URL(trim.substring(i3, indexOf4)), new com.nimbusds.jose.util.Base64URL(trim.substring(indexOf4 + 1))};
    }

    public static com.nimbusds.jose.JOSEObject parse(java.lang.String str) throws java.text.ParseException {
        try {
            com.nimbusds.jose.Algorithm parseAlgorithm = com.nimbusds.jose.Header.parseAlgorithm(com.nimbusds.jose.util.JSONObjectUtils.parse(split(str)[0].decodeToString()));
            if (parseAlgorithm.equals(com.nimbusds.jose.Algorithm.NONE)) {
                return com.nimbusds.jose.PlainObject.parse(str);
            }
            if (parseAlgorithm instanceof com.nimbusds.jose.JWSAlgorithm) {
                return com.nimbusds.jose.JWSObject.parse(str);
            }
            if (parseAlgorithm instanceof com.nimbusds.jose.JWEAlgorithm) {
                return com.nimbusds.jose.JWEObject.parse(str);
            }
            throw new java.lang.AssertionError("Unexpected algorithm type: ".concat(java.lang.String.valueOf(parseAlgorithm)));
        } catch (java.text.ParseException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid unsecured/JWS/JWE header: ");
            sb.append(e.getMessage());
            throw new java.text.ParseException(sb.toString(), 0);
        }
    }
}
