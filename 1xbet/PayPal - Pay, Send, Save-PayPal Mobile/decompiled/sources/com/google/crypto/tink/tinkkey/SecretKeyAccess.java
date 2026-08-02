package com.google.crypto.tink.tinkkey;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class SecretKeyAccess {
    private SecretKeyAccess() {
    }

    public static com.google.crypto.tink.tinkkey.KeyAccess insecureSecretAccess() {
        return com.google.crypto.tink.tinkkey.KeyAccess.secretAccess();
    }
}
