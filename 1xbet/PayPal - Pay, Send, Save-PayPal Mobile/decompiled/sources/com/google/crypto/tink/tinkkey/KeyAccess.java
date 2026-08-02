package com.google.crypto.tink.tinkkey;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class KeyAccess {
    private final boolean canAccessSecret;

    private KeyAccess(boolean z) {
        this.canAccessSecret = z;
    }

    public static com.google.crypto.tink.tinkkey.KeyAccess publicAccess() {
        return new com.google.crypto.tink.tinkkey.KeyAccess(false);
    }

    static com.google.crypto.tink.tinkkey.KeyAccess secretAccess() {
        return new com.google.crypto.tink.tinkkey.KeyAccess(true);
    }

    public final boolean canAccessSecret() {
        return this.canAccessSecret;
    }
}
