package com.google.crypto.tink.config;

/* loaded from: classes4.dex */
public final class TinkFips {
    public static boolean useOnlyFips() {
        return com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips();
    }

    public static void restrictToFips() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.Registry.restrictToFipsIfEmpty();
    }

    private TinkFips() {
    }
}
