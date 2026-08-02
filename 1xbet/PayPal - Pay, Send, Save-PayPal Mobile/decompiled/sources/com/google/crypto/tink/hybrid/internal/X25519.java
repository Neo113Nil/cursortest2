package com.google.crypto.tink.hybrid.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public interface X25519 {
    byte[] computeSharedSecret(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException;

    com.google.crypto.tink.hybrid.internal.X25519.KeyPair generateKeyPair() throws java.security.GeneralSecurityException;

    public static final class KeyPair {
        public final byte[] privateKey;
        public final byte[] publicKey;

        public KeyPair(byte[] bArr, byte[] bArr2) {
            this.privateKey = bArr;
            this.publicKey = bArr2;
        }
    }
}
