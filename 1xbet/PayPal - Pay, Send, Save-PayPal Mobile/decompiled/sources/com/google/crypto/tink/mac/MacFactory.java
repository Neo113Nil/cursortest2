package com.google.crypto.tink.mac;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public final class MacFactory {
    @java.lang.Deprecated
    public static com.google.crypto.tink.Mac getPrimitive(com.google.crypto.tink.KeysetHandle keysetHandle) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.mac.MacWrapper.register();
        return (com.google.crypto.tink.Mac) keysetHandle.getPrimitive(com.google.crypto.tink.RegistryConfiguration.get(), com.google.crypto.tink.Mac.class);
    }

    private MacFactory() {
    }
}
