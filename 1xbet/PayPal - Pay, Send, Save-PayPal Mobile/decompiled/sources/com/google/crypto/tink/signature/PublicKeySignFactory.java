package com.google.crypto.tink.signature;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public final class PublicKeySignFactory {
    @java.lang.Deprecated
    public static com.google.crypto.tink.PublicKeySign getPrimitive(com.google.crypto.tink.KeysetHandle keysetHandle) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.signature.PublicKeySignWrapper.register();
        return (com.google.crypto.tink.PublicKeySign) keysetHandle.getPrimitive(com.google.crypto.tink.RegistryConfiguration.get(), com.google.crypto.tink.PublicKeySign.class);
    }

    private PublicKeySignFactory() {
    }
}
