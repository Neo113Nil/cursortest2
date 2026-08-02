package com.nimbusds.jose.jwk;

/* loaded from: classes4.dex */
final class JWKMetadata {
    JWKMetadata() {
    }

    static com.nimbusds.jose.jwk.KeyType parseKeyType(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        try {
            return com.nimbusds.jose.jwk.KeyType.parse(com.nimbusds.jose.util.JSONObjectUtils.getString(map, "kty"));
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.text.ParseException(e.getMessage(), 0);
        }
    }

    static com.nimbusds.jose.jwk.KeyUse parseKeyUse(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        return com.nimbusds.jose.jwk.KeyUse.parse(com.nimbusds.jose.util.JSONObjectUtils.getString(map, "use"));
    }

    static java.util.Set<com.nimbusds.jose.jwk.KeyOperation> parseKeyOperations(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        return com.nimbusds.jose.jwk.KeyOperation.parse(com.nimbusds.jose.util.JSONObjectUtils.getStringList(map, "key_ops"));
    }

    static com.nimbusds.jose.Algorithm parseAlgorithm(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        return com.nimbusds.jose.Algorithm.parse(com.nimbusds.jose.util.JSONObjectUtils.getString(map, "alg"));
    }

    static java.lang.String parseKeyID(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        return com.nimbusds.jose.util.JSONObjectUtils.getString(map, "kid");
    }

    static java.net.URI parseX509CertURL(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        return com.nimbusds.jose.util.JSONObjectUtils.getURI(map, "x5u");
    }

    static com.nimbusds.jose.util.Base64URL parseX509CertThumbprint(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        return com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "x5t");
    }

    static com.nimbusds.jose.util.Base64URL parseX509CertSHA256Thumbprint(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        return com.nimbusds.jose.util.JSONObjectUtils.getBase64URL(map, "x5t#S256");
    }

    static java.util.List<com.nimbusds.jose.util.Base64> parseX509CertChain(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        java.util.List<com.nimbusds.jose.util.Base64> base64List = com.nimbusds.jose.util.X509CertChainUtils.toBase64List(com.nimbusds.jose.util.JSONObjectUtils.getJSONArray(map, "x5c"));
        if (base64List == null || !base64List.isEmpty()) {
            return base64List;
        }
        return null;
    }

    static java.util.Date parseExpirationTime(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        if (map.get("exp") == null) {
            return null;
        }
        return com.nimbusds.jwt.util.DateUtils.fromSecondsSinceEpoch(com.nimbusds.jose.util.JSONObjectUtils.getLong(map, "exp"));
    }

    static java.util.Date parseNotBeforeTime(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        if (map.get("nbf") == null) {
            return null;
        }
        return com.nimbusds.jwt.util.DateUtils.fromSecondsSinceEpoch(com.nimbusds.jose.util.JSONObjectUtils.getLong(map, "nbf"));
    }

    static java.util.Date parseIssueTime(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        if (map.get("iat") == null) {
            return null;
        }
        return com.nimbusds.jwt.util.DateUtils.fromSecondsSinceEpoch(com.nimbusds.jose.util.JSONObjectUtils.getLong(map, "iat"));
    }
}
