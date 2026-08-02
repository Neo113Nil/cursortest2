package org.jose4j.jwt.consumer;

/* loaded from: classes18.dex */
public class InvalidJwtSignatureException extends org.jose4j.jwt.consumer.InvalidJwtException {
    public InvalidJwtSignatureException(org.jose4j.jws.JsonWebSignature jsonWebSignature, org.jose4j.jwt.consumer.JwtContext jwtContext) {
        super("JWT rejected due to invalid signature.", java.util.Collections.singletonList(new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(9, "Invalid JWS Signature: ".concat(java.lang.String.valueOf(jsonWebSignature)))), jwtContext);
    }
}
