package com.google.crypto.tink;

/* loaded from: classes4.dex */
public class RegistryConfiguration {
    private RegistryConfiguration() {
    }

    public static com.google.crypto.tink.Configuration get() throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.RegistryConfiguration.get();
    }
}
