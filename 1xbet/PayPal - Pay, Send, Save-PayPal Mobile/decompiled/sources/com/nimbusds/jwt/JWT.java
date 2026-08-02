package com.nimbusds.jwt;

/* loaded from: classes4.dex */
public interface JWT extends java.io.Serializable {
    com.nimbusds.jose.Header getHeader();

    com.nimbusds.jwt.JWTClaimsSet getJWTClaimsSet() throws java.text.ParseException;

    com.nimbusds.jose.util.Base64URL[] getParsedParts();

    java.lang.String getParsedString();

    java.lang.String serialize();
}
