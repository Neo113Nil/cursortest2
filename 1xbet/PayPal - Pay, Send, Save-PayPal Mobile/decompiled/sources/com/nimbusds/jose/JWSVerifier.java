package com.nimbusds.jose;

/* loaded from: classes4.dex */
public interface JWSVerifier extends com.nimbusds.jose.JWSProvider {
    boolean verify(com.nimbusds.jose.JWSHeader jWSHeader, byte[] bArr, com.nimbusds.jose.util.Base64URL base64URL) throws com.nimbusds.jose.JOSEException;
}
