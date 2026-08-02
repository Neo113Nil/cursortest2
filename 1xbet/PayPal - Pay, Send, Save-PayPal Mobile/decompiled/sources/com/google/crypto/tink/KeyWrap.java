package com.google.crypto.tink;

/* loaded from: classes9.dex */
public interface KeyWrap {
    byte[] unwrap(byte[] bArr) throws java.security.GeneralSecurityException;

    byte[] wrap(byte[] bArr) throws java.security.GeneralSecurityException;
}
