package com.nimbusds.jose.jwk;

/* loaded from: classes4.dex */
public final class KeyUse implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final java.lang.String identifier;
    public static final com.nimbusds.jose.jwk.KeyUse SIGNATURE = new com.nimbusds.jose.jwk.KeyUse(org.jose4j.jwk.Use.SIGNATURE);
    public static final com.nimbusds.jose.jwk.KeyUse ENCRYPTION = new com.nimbusds.jose.jwk.KeyUse("enc");

    public KeyUse(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("The key use identifier must not be null");
        }
        this.identifier = str;
    }

    public final java.lang.String identifier() {
        return this.identifier;
    }

    public final java.lang.String getValue() {
        return identifier();
    }

    public final java.lang.String toString() {
        return identifier();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.nimbusds.jose.jwk.KeyUse) {
            return java.util.Objects.equals(this.identifier, ((com.nimbusds.jose.jwk.KeyUse) obj).identifier);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.identifier);
    }

    public static com.nimbusds.jose.jwk.KeyUse parse(java.lang.String str) throws java.text.ParseException {
        if (str == null) {
            return null;
        }
        com.nimbusds.jose.jwk.KeyUse keyUse = SIGNATURE;
        if (str.equals(keyUse.identifier())) {
            return keyUse;
        }
        com.nimbusds.jose.jwk.KeyUse keyUse2 = ENCRYPTION;
        if (str.equals(keyUse2.identifier())) {
            return keyUse2;
        }
        if (str.trim().isEmpty()) {
            throw new java.text.ParseException("JWK use value must not be empty or blank", 0);
        }
        return new com.nimbusds.jose.jwk.KeyUse(str);
    }

    public static com.nimbusds.jose.jwk.KeyUse from(java.security.cert.X509Certificate x509Certificate) {
        if (x509Certificate.getKeyUsage() == null) {
            return null;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        if (x509Certificate.getKeyUsage()[0] || x509Certificate.getKeyUsage()[1]) {
            hashSet.add(SIGNATURE);
        }
        if (x509Certificate.getKeyUsage()[0] && x509Certificate.getKeyUsage()[2]) {
            hashSet.add(ENCRYPTION);
        }
        if (x509Certificate.getKeyUsage()[0] && x509Certificate.getKeyUsage()[4]) {
            hashSet.add(ENCRYPTION);
        }
        if (x509Certificate.getKeyUsage()[2] || x509Certificate.getKeyUsage()[3] || x509Certificate.getKeyUsage()[4]) {
            hashSet.add(ENCRYPTION);
        }
        if (x509Certificate.getKeyUsage()[5] || x509Certificate.getKeyUsage()[6]) {
            hashSet.add(SIGNATURE);
        }
        if (hashSet.size() == 1) {
            return (com.nimbusds.jose.jwk.KeyUse) hashSet.iterator().next();
        }
        return null;
    }
}
