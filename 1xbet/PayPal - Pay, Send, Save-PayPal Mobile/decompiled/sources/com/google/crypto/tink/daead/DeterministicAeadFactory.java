package com.google.crypto.tink.daead;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public final class DeterministicAeadFactory {
    @java.lang.Deprecated
    public static com.google.crypto.tink.DeterministicAead getPrimitive(com.google.crypto.tink.KeysetHandle keysetHandle) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.daead.DeterministicAeadWrapper.register();
        return (com.google.crypto.tink.DeterministicAead) keysetHandle.getPrimitive(com.google.crypto.tink.RegistryConfiguration.get(), com.google.crypto.tink.DeterministicAead.class);
    }

    private DeterministicAeadFactory() {
    }
}
