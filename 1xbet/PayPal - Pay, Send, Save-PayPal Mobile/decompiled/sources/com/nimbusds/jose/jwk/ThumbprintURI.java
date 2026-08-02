package com.nimbusds.jose.jwk;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public class ThumbprintURI {
    public static final java.lang.String PREFIX = "urn:ietf:params:oauth:jwk-thumbprint:";
    private final java.lang.String hashAlg;
    private final com.nimbusds.jose.util.Base64URL thumbprint;

    public ThumbprintURI(java.lang.String str, com.nimbusds.jose.util.Base64URL base64URL) {
        if (str == null || str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("The hash algorithm must not be null or empty");
        }
        this.hashAlg = str;
        if (base64URL == null || base64URL.toString().isEmpty()) {
            throw new java.lang.IllegalArgumentException("The thumbprint must not be null or empty");
        }
        this.thumbprint = base64URL;
    }

    public java.lang.String getAlgorithmString() {
        return this.hashAlg;
    }

    public com.nimbusds.jose.util.Base64URL getThumbprint() {
        return this.thumbprint;
    }

    public java.net.URI toURI() {
        return java.net.URI.create(toString());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(PREFIX);
        sb.append(this.hashAlg);
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(this.thumbprint);
        return sb.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.nimbusds.jose.jwk.ThumbprintURI)) {
            return false;
        }
        com.nimbusds.jose.jwk.ThumbprintURI thumbprintURI = (com.nimbusds.jose.jwk.ThumbprintURI) obj;
        return this.hashAlg.equals(thumbprintURI.hashAlg) && getThumbprint().equals(thumbprintURI.getThumbprint());
    }

    public int hashCode() {
        return java.util.Objects.hash(this.hashAlg, getThumbprint());
    }

    public static com.nimbusds.jose.jwk.ThumbprintURI compute(com.nimbusds.jose.jwk.JWK jwk) throws com.nimbusds.jose.JOSEException {
        return new com.nimbusds.jose.jwk.ThumbprintURI("sha-256", jwk.computeThumbprint());
    }

    public static com.nimbusds.jose.jwk.ThumbprintURI parse(java.net.URI uri) throws java.text.ParseException {
        java.lang.String obj = uri.toString();
        if (!obj.startsWith(PREFIX)) {
            throw new java.text.ParseException("Illegal JWK thumbprint prefix", 0);
        }
        java.lang.String substring = obj.substring(37);
        if (substring.isEmpty()) {
            throw new java.text.ParseException("Illegal JWK thumbprint: Missing value", 0);
        }
        java.lang.String[] split = substring.split(io.ktor.sse.ServerSentEventKt.COLON);
        if (split.length != 2) {
            throw new java.text.ParseException("Illegal JWK thumbprint: Unexpected number of components", 0);
        }
        if (split[0].isEmpty()) {
            throw new java.text.ParseException("Illegal JWK thumbprint: The hash algorithm must not be empty", 0);
        }
        return new com.nimbusds.jose.jwk.ThumbprintURI(split[0], new com.nimbusds.jose.util.Base64URL(split[1]));
    }

    public static com.nimbusds.jose.jwk.ThumbprintURI parse(java.lang.String str) throws java.text.ParseException {
        try {
            return parse(new java.net.URI(str));
        } catch (java.net.URISyntaxException e) {
            throw new java.text.ParseException(e.getMessage(), 0);
        }
    }
}
