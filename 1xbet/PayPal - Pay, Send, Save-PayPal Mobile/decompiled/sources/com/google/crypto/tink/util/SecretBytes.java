package com.google.crypto.tink.util;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class SecretBytes {
    private final com.google.crypto.tink.util.Bytes bytes;

    private SecretBytes(com.google.crypto.tink.util.Bytes bytes) {
        this.bytes = bytes;
    }

    public static com.google.crypto.tink.util.SecretBytes copyFrom(byte[] bArr, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
        if (secretKeyAccess == null) {
            throw new java.lang.NullPointerException("SecretKeyAccess required");
        }
        return new com.google.crypto.tink.util.SecretBytes(com.google.crypto.tink.util.Bytes.copyFrom(bArr));
    }

    public static com.google.crypto.tink.util.SecretBytes randomBytes(int i) {
        return new com.google.crypto.tink.util.SecretBytes(com.google.crypto.tink.util.Bytes.copyFrom(com.google.crypto.tink.subtle.Random.randBytes(i)));
    }

    public final byte[] toByteArray(com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
        if (secretKeyAccess == null) {
            throw new java.lang.NullPointerException("SecretKeyAccess required");
        }
        return this.bytes.toByteArray();
    }

    public final int size() {
        return this.bytes.size();
    }

    public final boolean equalsSecretBytes(com.google.crypto.tink.util.SecretBytes secretBytes) {
        return java.security.MessageDigest.isEqual(this.bytes.toByteArray(), secretBytes.bytes.toByteArray());
    }
}
