package com.google.crypto.tink.subtle;

/* loaded from: classes4.dex */
public interface IndCpaCipher {
    byte[] decrypt(byte[] bArr) throws java.security.GeneralSecurityException;

    byte[] encrypt(byte[] bArr) throws java.security.GeneralSecurityException;
}
