package com.nimbusds.jose;

/* loaded from: classes10.dex */
public interface JWEEncrypter extends com.nimbusds.jose.JWEProvider {
    com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr, byte[] bArr2) throws com.nimbusds.jose.JOSEException;
}
