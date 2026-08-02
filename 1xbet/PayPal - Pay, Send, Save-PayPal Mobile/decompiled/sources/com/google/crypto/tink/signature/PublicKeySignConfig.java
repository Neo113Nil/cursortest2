package com.google.crypto.tink.signature;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public final class PublicKeySignConfig {
    @java.lang.Deprecated
    public static void registerStandardKeyTypes() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.signature.SignatureConfig.register();
    }

    private PublicKeySignConfig() {
    }
}
