package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public final class RegistryConfiguration extends com.google.crypto.tink.internal.InternalConfiguration {
    private static final com.google.crypto.tink.internal.RegistryConfiguration CONFIG = new com.google.crypto.tink.internal.RegistryConfiguration();

    public static com.google.crypto.tink.internal.RegistryConfiguration get() {
        return CONFIG;
    }

    private RegistryConfiguration() {
    }

    @Override // com.google.crypto.tink.internal.InternalConfiguration
    public final <P> P wrap(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, java.lang.Class<P> cls) throws java.security.GeneralSecurityException {
        return (P) com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().wrap(keysetHandleInterface, monitoringAnnotations, cls);
    }

    public static com.google.crypto.tink.internal.InternalConfiguration createFromPrimitiveRegistry(com.google.crypto.tink.internal.PrimitiveRegistry primitiveRegistry) {
        throw new java.lang.UnsupportedOperationException("Cannot create RegistryConfiguration from a PrimitiveRegistry");
    }
}
