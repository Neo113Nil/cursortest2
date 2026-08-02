package com.google.crypto.tink.util;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class SecretBigInteger {
    private final java.math.BigInteger value;

    private SecretBigInteger(java.math.BigInteger bigInteger) {
        this.value = bigInteger;
    }

    public static com.google.crypto.tink.util.SecretBigInteger fromBigInteger(java.math.BigInteger bigInteger, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
        if (secretKeyAccess == null) {
            throw new java.lang.NullPointerException("SecretKeyAccess required");
        }
        return new com.google.crypto.tink.util.SecretBigInteger(bigInteger);
    }

    public final java.math.BigInteger getBigInteger(com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
        if (secretKeyAccess == null) {
            throw new java.lang.NullPointerException("SecretKeyAccess required");
        }
        return this.value;
    }

    public final boolean equalsSecretBigInteger(com.google.crypto.tink.util.SecretBigInteger secretBigInteger) {
        return java.security.MessageDigest.isEqual(this.value.toByteArray(), secretBigInteger.value.toByteArray());
    }
}
