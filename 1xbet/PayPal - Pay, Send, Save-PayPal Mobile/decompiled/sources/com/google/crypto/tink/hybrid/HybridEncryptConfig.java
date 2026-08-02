package com.google.crypto.tink.hybrid;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public final class HybridEncryptConfig {
    @java.lang.Deprecated
    public static void registerStandardKeyTypes() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.Config.register(com.google.crypto.tink.hybrid.HybridConfig.TINK_1_0_0);
    }

    private HybridEncryptConfig() {
    }
}
