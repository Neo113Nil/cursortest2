package com.google.crypto.tink;

/* loaded from: classes9.dex */
public final class TinkJsonProtoKeysetFormat {
    public static com.google.crypto.tink.KeysetHandle parseKeyset(java.lang.String str, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (secretKeyAccess == null) {
            throw new java.lang.NullPointerException("SecretKeyAccess cannot be null");
        }
        try {
            return com.google.crypto.tink.CleartextKeysetHandle.read(com.google.crypto.tink.JsonKeysetReader.withString(str));
        } catch (java.io.IOException unused) {
            throw new java.security.GeneralSecurityException("Parse keyset failed");
        }
    }

    public static java.lang.String serializeKeyset(com.google.crypto.tink.KeysetHandle keysetHandle, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (secretKeyAccess == null) {
            throw new java.lang.NullPointerException("SecretKeyAccess cannot be null");
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            com.google.crypto.tink.CleartextKeysetHandle.write(keysetHandle, com.google.crypto.tink.JsonKeysetWriter.withOutputStream(byteArrayOutputStream));
            return new java.lang.String(byteArrayOutputStream.toByteArray(), com.google.crypto.tink.internal.Util.UTF_8);
        } catch (java.io.IOException unused) {
            throw new java.security.GeneralSecurityException("Serialize keyset failed");
        }
    }

    public static com.google.crypto.tink.KeysetHandle parseKeysetWithoutSecret(java.lang.String str) throws java.security.GeneralSecurityException {
        try {
            return com.google.crypto.tink.KeysetHandle.readNoSecret(com.google.crypto.tink.JsonKeysetReader.withString(str));
        } catch (java.io.IOException unused) {
            throw new java.security.GeneralSecurityException("Parse keyset failed");
        }
    }

    public static java.lang.String serializeKeysetWithoutSecret(com.google.crypto.tink.KeysetHandle keysetHandle) throws java.security.GeneralSecurityException {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            keysetHandle.writeNoSecret(com.google.crypto.tink.JsonKeysetWriter.withOutputStream(byteArrayOutputStream));
            return new java.lang.String(byteArrayOutputStream.toByteArray(), com.google.crypto.tink.internal.Util.UTF_8);
        } catch (java.io.IOException unused) {
            throw new java.security.GeneralSecurityException("Serialize keyset failed");
        }
    }

    public static com.google.crypto.tink.KeysetHandle parseEncryptedKeyset(java.lang.String str, com.google.crypto.tink.Aead aead, byte[] bArr) throws java.security.GeneralSecurityException {
        try {
            return com.google.crypto.tink.KeysetHandle.readWithAssociatedData(com.google.crypto.tink.JsonKeysetReader.withString(str), aead, bArr);
        } catch (java.io.IOException unused) {
            throw new java.security.GeneralSecurityException("Parse keyset failed");
        }
    }

    public static java.lang.String serializeEncryptedKeyset(com.google.crypto.tink.KeysetHandle keysetHandle, com.google.crypto.tink.Aead aead, byte[] bArr) throws java.security.GeneralSecurityException {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            keysetHandle.writeWithAssociatedData(com.google.crypto.tink.JsonKeysetWriter.withOutputStream(byteArrayOutputStream), aead, bArr);
            return new java.lang.String(byteArrayOutputStream.toByteArray(), com.google.crypto.tink.internal.Util.UTF_8);
        } catch (java.io.IOException unused) {
            throw new java.security.GeneralSecurityException("Serialize keyset failed");
        }
    }

    private TinkJsonProtoKeysetFormat() {
    }
}
