package com.google.crypto.tink.keyderivation;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public interface KeysetDeriver {
    com.google.crypto.tink.KeysetHandle deriveKeyset(byte[] bArr) throws java.security.GeneralSecurityException;
}
