package com.nimbusds.jose.jwk;

/* loaded from: classes10.dex */
public final class ThumbprintUtils {
    public static com.nimbusds.jose.util.Base64URL compute(com.nimbusds.jose.jwk.JWK jwk) throws com.nimbusds.jose.JOSEException {
        return compute("SHA-256", jwk);
    }

    public static com.nimbusds.jose.util.Base64URL compute(java.lang.String str, com.nimbusds.jose.jwk.JWK jwk) throws com.nimbusds.jose.JOSEException {
        return compute(str, jwk.getRequiredParams());
    }

    public static com.nimbusds.jose.util.Base64URL compute(java.lang.String str, java.util.LinkedHashMap<java.lang.String, ?> linkedHashMap) throws com.nimbusds.jose.JOSEException {
        java.lang.String jSONString = com.nimbusds.jose.util.JSONObjectUtils.toJSONString(linkedHashMap);
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str);
            messageDigest.update(jSONString.getBytes(com.nimbusds.jose.util.StandardCharset.UTF_8));
            return com.nimbusds.jose.util.Base64URL.encode(messageDigest.digest());
        } catch (java.security.NoSuchAlgorithmException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't compute JWK thumbprint: Unsupported hash algorithm: ");
            sb.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
        }
    }
}
