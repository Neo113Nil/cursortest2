package com.google.crypto.tink.aead;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public final class AeadFactory {
    @java.lang.Deprecated
    public static com.google.crypto.tink.Aead getPrimitive(com.google.crypto.tink.KeysetHandle keysetHandle) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.aead.AeadWrapper.register();
        return (com.google.crypto.tink.Aead) keysetHandle.getPrimitive(com.google.crypto.tink.RegistryConfiguration.get(), com.google.crypto.tink.Aead.class);
    }

    private AeadFactory() {
    }
}
