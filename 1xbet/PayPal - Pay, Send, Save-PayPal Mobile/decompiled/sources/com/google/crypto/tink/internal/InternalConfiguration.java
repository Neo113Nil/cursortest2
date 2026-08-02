package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public abstract class InternalConfiguration extends com.google.crypto.tink.Configuration {
    public abstract <P> P wrap(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, java.lang.Class<P> cls) throws java.security.GeneralSecurityException;

    public static com.google.crypto.tink.internal.InternalConfiguration createFromPrimitiveRegistry(com.google.crypto.tink.internal.PrimitiveRegistry primitiveRegistry) {
        return new com.google.crypto.tink.internal.InternalConfiguration.InternalConfigurationImpl(primitiveRegistry);
    }

    /* loaded from: classes9.dex */
    static class InternalConfigurationImpl extends com.google.crypto.tink.internal.InternalConfiguration {
        private final com.google.crypto.tink.internal.PrimitiveRegistry registry;

        private InternalConfigurationImpl(com.google.crypto.tink.internal.PrimitiveRegistry primitiveRegistry) {
            this.registry = primitiveRegistry;
        }

        @Override // com.google.crypto.tink.internal.InternalConfiguration
        public <P> P wrap(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, java.lang.Class<P> cls) throws java.security.GeneralSecurityException {
            return (P) this.registry.wrap(keysetHandleInterface, monitoringAnnotations, cls);
        }
    }
}
