package com.google.crypto.tink;

@com.google.errorprone.annotations.Immutable
@com.google.errorprone.annotations.CheckReturnValue
/* loaded from: classes4.dex */
public final class InsecureSecretKeyAccess {
    private InsecureSecretKeyAccess() {
    }

    public static com.google.crypto.tink.SecretKeyAccess get() {
        return com.google.crypto.tink.SecretKeyAccess.instance();
    }
}
