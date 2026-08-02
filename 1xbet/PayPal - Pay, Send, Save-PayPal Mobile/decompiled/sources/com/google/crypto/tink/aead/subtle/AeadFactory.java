package com.google.crypto.tink.aead.subtle;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public interface AeadFactory {
    com.google.crypto.tink.Aead createAead(byte[] bArr) throws java.security.GeneralSecurityException;

    int getKeySizeInBytes();
}
