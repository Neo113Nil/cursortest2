package com.nimbusds.jose;

/* loaded from: classes10.dex */
public interface JWEDecrypter extends com.nimbusds.jose.JWEProvider {
    byte[] decrypt(com.nimbusds.jose.JWEHeader jWEHeader, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, byte[] bArr) throws com.nimbusds.jose.JOSEException;
}
