package com.nimbusds.jose;

/* loaded from: classes10.dex */
public abstract class JOSEObjectJSON implements java.io.Serializable {
    public static final java.lang.String MIME_TYPE_JOSE_JSON = "application/jose+json; charset=UTF-8";
    private static final long serialVersionUID = 1;
    private com.nimbusds.jose.Payload payload;

    public abstract java.lang.String serializeFlattened();

    public abstract java.lang.String serializeGeneral();

    public abstract java.util.Map<java.lang.String, java.lang.Object> toFlattenedJSONObject();

    public abstract java.util.Map<java.lang.String, java.lang.Object> toGeneralJSONObject();

    protected JOSEObjectJSON(com.nimbusds.jose.Payload payload) {
        this.payload = payload;
    }

    protected void setPayload(com.nimbusds.jose.Payload payload) {
        this.payload = payload;
    }

    public com.nimbusds.jose.Payload getPayload() {
        return this.payload;
    }

    public static com.nimbusds.jose.JOSEObjectJSON parse(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        if (map.containsKey("signature") || map.containsKey("signatures")) {
            return com.nimbusds.jose.JWSObjectJSON.parse(map);
        }
        if (map.containsKey("ciphertext")) {
            throw new java.text.ParseException("JWE JSON not supported", 0);
        }
        throw new java.text.ParseException("Invalid JOSE object", 0);
    }

    public static com.nimbusds.jose.JOSEObjectJSON parse(java.lang.String str) throws java.text.ParseException {
        java.util.Objects.requireNonNull(str);
        return parse(com.nimbusds.jose.util.JSONObjectUtils.parse(str));
    }
}
