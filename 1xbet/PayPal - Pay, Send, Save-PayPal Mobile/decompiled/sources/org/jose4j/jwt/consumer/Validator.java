package org.jose4j.jwt.consumer;

/* loaded from: classes18.dex */
public interface Validator {
    java.lang.String validate(org.jose4j.jwt.consumer.JwtContext jwtContext) throws org.jose4j.jwt.MalformedClaimException;
}
