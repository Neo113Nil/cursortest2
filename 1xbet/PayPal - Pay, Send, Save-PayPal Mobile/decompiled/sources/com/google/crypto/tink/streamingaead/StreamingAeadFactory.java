package com.google.crypto.tink.streamingaead;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public final class StreamingAeadFactory {
    public static com.google.crypto.tink.StreamingAead getPrimitive(com.google.crypto.tink.KeysetHandle keysetHandle) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.streamingaead.StreamingAeadWrapper.register();
        return (com.google.crypto.tink.StreamingAead) keysetHandle.getPrimitive(com.google.crypto.tink.RegistryConfiguration.get(), com.google.crypto.tink.StreamingAead.class);
    }

    private StreamingAeadFactory() {
    }
}
