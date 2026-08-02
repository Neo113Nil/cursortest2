package com.google.crypto.tink;

/* loaded from: classes4.dex */
public interface Aead {
    byte[] decrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException;

    byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException;
}
