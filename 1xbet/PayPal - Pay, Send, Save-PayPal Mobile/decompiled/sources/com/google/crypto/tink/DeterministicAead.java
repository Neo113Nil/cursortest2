package com.google.crypto.tink;

/* loaded from: classes4.dex */
public interface DeterministicAead {
    byte[] decryptDeterministically(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException;

    byte[] encryptDeterministically(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException;
}
