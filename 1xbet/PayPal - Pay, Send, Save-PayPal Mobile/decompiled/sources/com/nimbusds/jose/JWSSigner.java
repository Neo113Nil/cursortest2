package com.nimbusds.jose;

/* loaded from: classes4.dex */
public interface JWSSigner extends com.nimbusds.jose.JWSProvider {
    com.nimbusds.jose.util.Base64URL sign(com.nimbusds.jose.JWSHeader jWSHeader, byte[] bArr) throws com.nimbusds.jose.JOSEException;
}
