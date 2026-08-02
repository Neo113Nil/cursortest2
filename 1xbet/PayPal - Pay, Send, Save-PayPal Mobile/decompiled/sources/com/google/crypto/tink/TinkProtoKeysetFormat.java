package com.google.crypto.tink;

/* loaded from: classes9.dex */
public final class TinkProtoKeysetFormat {
    public static com.google.crypto.tink.KeysetHandle parseKeyset(byte[] bArr, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (secretKeyAccess == null) {
            throw new java.lang.NullPointerException("SecretKeyAccess cannot be null");
        }
        try {
            return com.google.crypto.tink.CleartextKeysetHandle.read(com.google.crypto.tink.BinaryKeysetReader.withBytes(bArr));
        } catch (java.io.IOException unused) {
            throw new java.security.GeneralSecurityException("Parse keyset failed");
        }
    }

    public static byte[] serializeKeyset(com.google.crypto.tink.KeysetHandle keysetHandle, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (secretKeyAccess == null) {
            throw new java.lang.NullPointerException("SecretKeyAccess cannot be null");
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            com.google.crypto.tink.CleartextKeysetHandle.write(keysetHandle, com.google.crypto.tink.BinaryKeysetWriter.withOutputStream(byteArrayOutputStream));
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException unused) {
            throw new java.security.GeneralSecurityException("Serialize keyset failed");
        }
    }

    public static com.google.crypto.tink.KeysetHandle parseKeysetWithoutSecret(byte[] bArr) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.KeysetHandle.readNoSecret(bArr);
    }

    public static byte[] serializeKeysetWithoutSecret(com.google.crypto.tink.KeysetHandle keysetHandle) throws java.security.GeneralSecurityException {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            keysetHandle.writeNoSecret(com.google.crypto.tink.BinaryKeysetWriter.withOutputStream(byteArrayOutputStream));
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException unused) {
            throw new java.security.GeneralSecurityException("Serialize keyset failed");
        }
    }

    public static com.google.crypto.tink.KeysetHandle parseEncryptedKeyset(byte[] bArr, com.google.crypto.tink.Aead aead, byte[] bArr2) throws java.security.GeneralSecurityException {
        try {
            return com.google.crypto.tink.KeysetHandle.readWithAssociatedData(com.google.crypto.tink.BinaryKeysetReader.withBytes(bArr), aead, bArr2);
        } catch (java.io.IOException unused) {
            throw new java.security.GeneralSecurityException("Parse keyset failed");
        }
    }

    public static byte[] serializeEncryptedKeyset(com.google.crypto.tink.KeysetHandle keysetHandle, com.google.crypto.tink.Aead aead, byte[] bArr) throws java.security.GeneralSecurityException {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            keysetHandle.writeWithAssociatedData(com.google.crypto.tink.BinaryKeysetWriter.withOutputStream(byteArrayOutputStream), aead, bArr);
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException unused) {
            throw new java.security.GeneralSecurityException("Serialize keyset failed");
        }
    }

    private TinkProtoKeysetFormat() {
    }
}
