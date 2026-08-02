package com.google.crypto.tink.keyderivation.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public interface KeyDeriver {
    com.google.crypto.tink.Key deriveKey(byte[] bArr) throws java.security.GeneralSecurityException;
}
