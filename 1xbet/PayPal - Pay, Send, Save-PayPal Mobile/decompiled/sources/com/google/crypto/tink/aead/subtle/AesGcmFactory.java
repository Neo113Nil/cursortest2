package com.google.crypto.tink.aead.subtle;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class AesGcmFactory implements com.google.crypto.tink.aead.subtle.AeadFactory {
    private final int keySizeInBytes;

    public AesGcmFactory(int i) throws java.security.GeneralSecurityException {
        this.keySizeInBytes = validateAesKeySize(i);
    }

    @Override // com.google.crypto.tink.aead.subtle.AeadFactory
    public final int getKeySizeInBytes() {
        return this.keySizeInBytes;
    }

    @Override // com.google.crypto.tink.aead.subtle.AeadFactory
    public final com.google.crypto.tink.Aead createAead(byte[] bArr) throws java.security.GeneralSecurityException {
        if (bArr.length != getKeySizeInBytes()) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Symmetric key has incorrect length; expected %s, but got %s", java.lang.Integer.valueOf(getKeySizeInBytes()), java.lang.Integer.valueOf(bArr.length)));
        }
        return new com.google.crypto.tink.subtle.AesGcmJce(bArr);
    }

    private static int validateAesKeySize(int i) throws java.security.InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            return i;
        }
        throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid AES key size, expected 16 or 32, but got %d", java.lang.Integer.valueOf(i)));
    }
}
