package com.google.crypto.tink.hybrid;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public final class HybridEncryptFactory {
    @java.lang.Deprecated
    public static com.google.crypto.tink.HybridEncrypt getPrimitive(com.google.crypto.tink.KeysetHandle keysetHandle) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.hybrid.HybridEncryptWrapper.register();
        return (com.google.crypto.tink.HybridEncrypt) keysetHandle.getPrimitive(com.google.crypto.tink.RegistryConfiguration.get(), com.google.crypto.tink.HybridEncrypt.class);
    }

    private HybridEncryptFactory() {
    }
}
