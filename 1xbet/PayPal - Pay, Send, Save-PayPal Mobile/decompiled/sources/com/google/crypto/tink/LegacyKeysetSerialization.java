package com.google.crypto.tink;

/* loaded from: classes4.dex */
public final class LegacyKeysetSerialization {
    public static com.google.crypto.tink.KeysetHandle parseKeysetWithoutSecret(com.google.crypto.tink.KeysetReader keysetReader) throws java.security.GeneralSecurityException, java.io.IOException {
        return com.google.crypto.tink.KeysetHandle.readNoSecret(keysetReader);
    }

    public static com.google.crypto.tink.KeysetHandle parseKeyset(com.google.crypto.tink.KeysetReader keysetReader, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException, java.io.IOException {
        if (secretKeyAccess == null) {
            throw new java.lang.NullPointerException("SecretKeyAccess cannot be null");
        }
        return com.google.crypto.tink.CleartextKeysetHandle.read(keysetReader);
    }

    public static com.google.crypto.tink.KeysetHandle parseEncryptedKeyset(com.google.crypto.tink.KeysetReader keysetReader, com.google.crypto.tink.Aead aead, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        return com.google.crypto.tink.KeysetHandle.readWithAssociatedData(keysetReader, aead, bArr);
    }

    public static void serializeKeysetWithoutSecret(com.google.crypto.tink.KeysetHandle keysetHandle, com.google.crypto.tink.KeysetWriter keysetWriter) throws java.security.GeneralSecurityException, java.io.IOException {
        keysetHandle.writeNoSecret(keysetWriter);
    }

    public static void serializeKeyset(com.google.crypto.tink.KeysetHandle keysetHandle, com.google.crypto.tink.KeysetWriter keysetWriter, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.io.IOException {
        if (secretKeyAccess == null) {
            throw new java.lang.NullPointerException("SecretKeyAccess cannot be null");
        }
        com.google.crypto.tink.CleartextKeysetHandle.write(keysetHandle, keysetWriter);
    }

    public static void serializeEncryptedKeyset(com.google.crypto.tink.KeysetHandle keysetHandle, com.google.crypto.tink.KeysetWriter keysetWriter, com.google.crypto.tink.Aead aead, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        keysetHandle.writeWithAssociatedData(keysetWriter, aead, bArr);
    }

    public static com.google.crypto.tink.proto.KeysetInfo getKeysetInfo(com.google.crypto.tink.KeysetHandle keysetHandle) {
        return keysetHandle.getKeysetInfo();
    }

    private LegacyKeysetSerialization() {
    }
}
