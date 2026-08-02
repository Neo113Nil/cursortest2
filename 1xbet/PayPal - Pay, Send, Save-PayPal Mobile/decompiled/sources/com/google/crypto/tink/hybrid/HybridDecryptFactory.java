package com.google.crypto.tink.hybrid;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public final class HybridDecryptFactory {
    @java.lang.Deprecated
    public static com.google.crypto.tink.HybridDecrypt getPrimitive(com.google.crypto.tink.KeysetHandle keysetHandle) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.hybrid.HybridDecryptWrapper.register();
        return (com.google.crypto.tink.HybridDecrypt) keysetHandle.getPrimitive(com.google.crypto.tink.RegistryConfiguration.get(), com.google.crypto.tink.HybridDecrypt.class);
    }

    private HybridDecryptFactory() {
    }
}
