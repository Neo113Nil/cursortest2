package com.google.crypto.tink;

@com.google.errorprone.annotations.Immutable
@com.google.errorprone.annotations.CheckReturnValue
/* loaded from: classes4.dex */
public final class SecretKeyAccess {
    private static final com.google.crypto.tink.SecretKeyAccess INSTANCE = new com.google.crypto.tink.SecretKeyAccess();

    private SecretKeyAccess() {
    }

    static com.google.crypto.tink.SecretKeyAccess instance() {
        return INSTANCE;
    }

    public static com.google.crypto.tink.SecretKeyAccess requireAccess(@javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (secretKeyAccess != null) {
            return secretKeyAccess;
        }
        throw new java.security.GeneralSecurityException("SecretKeyAccess is required");
    }
}
