package com.nimbusds.jose;

@net.jcip.annotations.Immutable
/* loaded from: classes4.dex */
public final class Payload implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final com.nimbusds.jose.util.Base64URL base64URL;
    private final byte[] bytes;
    private final java.util.Map<java.lang.String, java.lang.Object> jsonObject;
    private final com.nimbusds.jose.JWSObject jwsObject;
    private final com.nimbusds.jose.Payload.Origin origin;
    private final com.nimbusds.jwt.SignedJWT signedJWT;
    private final java.lang.String string;

    public enum Origin {
        JSON,
        STRING,
        BYTE_ARRAY,
        BASE64URL,
        JWS_OBJECT,
        SIGNED_JWT
    }

    private static java.lang.String byteArrayToString(byte[] bArr) {
        if (bArr != null) {
            return new java.lang.String(bArr, com.nimbusds.jose.util.StandardCharset.UTF_8);
        }
        return null;
    }

    private static byte[] stringToByteArray(java.lang.String str) {
        if (str != null) {
            return str.getBytes(com.nimbusds.jose.util.StandardCharset.UTF_8);
        }
        return null;
    }

    public Payload(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            throw new java.lang.IllegalArgumentException("The JSON object must not be null");
        }
        java.util.Map<java.lang.String, java.lang.Object> newJSONObject = com.nimbusds.jose.util.JSONObjectUtils.newJSONObject();
        this.jsonObject = newJSONObject;
        newJSONObject.putAll(map);
        this.string = null;
        this.bytes = null;
        this.base64URL = null;
        this.jwsObject = null;
        this.signedJWT = null;
        this.origin = com.nimbusds.jose.Payload.Origin.JSON;
    }

    public Payload(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("The string must not be null");
        }
        this.jsonObject = null;
        this.string = str;
        this.bytes = null;
        this.base64URL = null;
        this.jwsObject = null;
        this.signedJWT = null;
        this.origin = com.nimbusds.jose.Payload.Origin.STRING;
    }

    public Payload(byte[] bArr) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("The byte array must not be null");
        }
        this.jsonObject = null;
        this.string = null;
        this.bytes = bArr;
        this.base64URL = null;
        this.jwsObject = null;
        this.signedJWT = null;
        this.origin = com.nimbusds.jose.Payload.Origin.BYTE_ARRAY;
    }

    public Payload(com.nimbusds.jose.util.Base64URL base64URL) {
        if (base64URL == null) {
            throw new java.lang.IllegalArgumentException("The Base64URL-encoded object must not be null");
        }
        this.jsonObject = null;
        this.string = null;
        this.bytes = null;
        this.base64URL = base64URL;
        this.jwsObject = null;
        this.signedJWT = null;
        this.origin = com.nimbusds.jose.Payload.Origin.BASE64URL;
    }

    public Payload(com.nimbusds.jose.JWSObject jWSObject) {
        if (jWSObject == null) {
            throw new java.lang.IllegalArgumentException("The JWS object must not be null");
        }
        if (jWSObject.getState() == com.nimbusds.jose.JWSObject.State.UNSIGNED) {
            throw new java.lang.IllegalArgumentException("The JWS object must be signed");
        }
        this.jsonObject = null;
        this.string = null;
        this.bytes = null;
        this.base64URL = null;
        this.jwsObject = jWSObject;
        this.signedJWT = null;
        this.origin = com.nimbusds.jose.Payload.Origin.JWS_OBJECT;
    }

    public Payload(com.nimbusds.jwt.SignedJWT signedJWT) {
        if (signedJWT == null) {
            throw new java.lang.IllegalArgumentException("The signed JWT must not be null");
        }
        if (signedJWT.getState() == com.nimbusds.jose.JWSObject.State.UNSIGNED) {
            throw new java.lang.IllegalArgumentException("The JWT must be signed");
        }
        this.jsonObject = null;
        this.string = null;
        this.bytes = null;
        this.base64URL = null;
        this.signedJWT = signedJWT;
        this.jwsObject = signedJWT;
        this.origin = com.nimbusds.jose.Payload.Origin.SIGNED_JWT;
    }

    public final com.nimbusds.jose.Payload.Origin getOrigin() {
        return this.origin;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> toJSONObject() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.jsonObject;
        if (map != null) {
            return map;
        }
        java.lang.String obj = toString();
        if (obj == null) {
            return null;
        }
        try {
            return com.nimbusds.jose.util.JSONObjectUtils.parse(obj);
        } catch (java.text.ParseException unused) {
            return null;
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.string;
        if (str != null) {
            return str;
        }
        com.nimbusds.jose.JWSObject jWSObject = this.jwsObject;
        if (jWSObject != null) {
            if (jWSObject.getParsedString() != null) {
                return this.jwsObject.getParsedString();
            }
            return this.jwsObject.serialize();
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.jsonObject;
        if (map != null) {
            return com.nimbusds.jose.util.JSONObjectUtils.toJSONString(map);
        }
        byte[] bArr = this.bytes;
        if (bArr != null) {
            return byteArrayToString(bArr);
        }
        com.nimbusds.jose.util.Base64URL base64URL = this.base64URL;
        if (base64URL != null) {
            return base64URL.decodeToString();
        }
        return null;
    }

    public final byte[] toBytes() {
        byte[] bArr = this.bytes;
        if (bArr != null) {
            return bArr;
        }
        com.nimbusds.jose.util.Base64URL base64URL = this.base64URL;
        if (base64URL != null) {
            return base64URL.decode();
        }
        return stringToByteArray(toString());
    }

    public final com.nimbusds.jose.util.Base64URL toBase64URL() {
        com.nimbusds.jose.util.Base64URL base64URL = this.base64URL;
        return base64URL != null ? base64URL : com.nimbusds.jose.util.Base64URL.encode(toBytes());
    }

    public final com.nimbusds.jose.JWSObject toJWSObject() {
        com.nimbusds.jose.JWSObject jWSObject = this.jwsObject;
        if (jWSObject != null) {
            return jWSObject;
        }
        try {
            return com.nimbusds.jose.JWSObject.parse(toString());
        } catch (java.text.ParseException unused) {
            return null;
        }
    }

    public final com.nimbusds.jwt.SignedJWT toSignedJWT() {
        com.nimbusds.jwt.SignedJWT signedJWT = this.signedJWT;
        if (signedJWT != null) {
            return signedJWT;
        }
        try {
            return com.nimbusds.jwt.SignedJWT.parse(toString());
        } catch (java.text.ParseException unused) {
            return null;
        }
    }

    public final <T> T toType(com.nimbusds.jose.PayloadTransformer<T> payloadTransformer) {
        return payloadTransformer.transform(this);
    }
}
