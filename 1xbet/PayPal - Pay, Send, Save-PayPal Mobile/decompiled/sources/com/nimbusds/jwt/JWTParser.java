package com.nimbusds.jwt;

/* loaded from: classes10.dex */
public final class JWTParser {
    public static com.nimbusds.jwt.JWT parse(java.lang.String str) throws java.text.ParseException {
        int indexOf = str.indexOf(".");
        if (indexOf == -1) {
            throw new java.text.ParseException("Invalid JWT serialization: Missing dot delimiter(s)", 0);
        }
        try {
            com.nimbusds.jose.Algorithm parseAlgorithm = com.nimbusds.jose.Header.parseAlgorithm(com.nimbusds.jose.util.JSONObjectUtils.parse(new com.nimbusds.jose.util.Base64URL(str.substring(0, indexOf)).decodeToString()));
            if (parseAlgorithm.equals(com.nimbusds.jose.Algorithm.NONE)) {
                return com.nimbusds.jwt.PlainJWT.parse(str);
            }
            if (parseAlgorithm instanceof com.nimbusds.jose.JWSAlgorithm) {
                return com.nimbusds.jwt.SignedJWT.parse(str);
            }
            if (parseAlgorithm instanceof com.nimbusds.jose.JWEAlgorithm) {
                return com.nimbusds.jwt.EncryptedJWT.parse(str);
            }
            throw new java.lang.AssertionError("Unexpected algorithm type: ".concat(java.lang.String.valueOf(parseAlgorithm)));
        } catch (java.text.ParseException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid unsecured/JWS/JWE header: ");
            sb.append(e.getMessage());
            throw new java.text.ParseException(sb.toString(), 0);
        }
    }

    private JWTParser() {
    }
}
