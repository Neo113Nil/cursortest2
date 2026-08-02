package com.google.crypto.tink.signature;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public final class PublicKeyVerifyFactory {
    @java.lang.Deprecated
    public static com.google.crypto.tink.PublicKeyVerify getPrimitive(com.google.crypto.tink.KeysetHandle keysetHandle) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.signature.PublicKeyVerifyWrapper.register();
        return (com.google.crypto.tink.PublicKeyVerify) keysetHandle.getPrimitive(com.google.crypto.tink.RegistryConfiguration.get(), com.google.crypto.tink.PublicKeyVerify.class);
    }

    private PublicKeyVerifyFactory() {
    }
}
