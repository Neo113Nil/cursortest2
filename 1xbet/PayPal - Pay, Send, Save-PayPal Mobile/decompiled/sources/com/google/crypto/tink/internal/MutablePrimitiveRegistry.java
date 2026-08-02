package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public final class MutablePrimitiveRegistry {
    private static com.google.crypto.tink.internal.MutablePrimitiveRegistry globalInstance = new com.google.crypto.tink.internal.MutablePrimitiveRegistry();
    private final java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.PrimitiveRegistry> registry = new java.util.concurrent.atomic.AtomicReference<>(com.google.crypto.tink.internal.PrimitiveRegistry.builder().build());

    public static com.google.crypto.tink.internal.MutablePrimitiveRegistry globalInstance() {
        return globalInstance;
    }

    public static void resetGlobalInstanceTestOnly() {
        globalInstance = new com.google.crypto.tink.internal.MutablePrimitiveRegistry();
    }

    MutablePrimitiveRegistry() {
    }

    public final <KeyT extends com.google.crypto.tink.Key, PrimitiveT> void registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor<KeyT, PrimitiveT> primitiveConstructor) throws java.security.GeneralSecurityException {
        synchronized (this) {
            this.registry.set(com.google.crypto.tink.internal.PrimitiveRegistry.builder(this.registry.get()).registerPrimitiveConstructor(primitiveConstructor).build());
        }
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> void registerPrimitiveWrapper(com.google.crypto.tink.internal.PrimitiveWrapper<InputPrimitiveT, WrapperPrimitiveT> primitiveWrapper) throws java.security.GeneralSecurityException {
        synchronized (this) {
            this.registry.set(com.google.crypto.tink.internal.PrimitiveRegistry.builder(this.registry.get()).registerPrimitiveWrapper(primitiveWrapper).build());
        }
    }

    public final <KeyT extends com.google.crypto.tink.Key, PrimitiveT> PrimitiveT getPrimitive(KeyT keyt, java.lang.Class<PrimitiveT> cls) throws java.security.GeneralSecurityException {
        return (PrimitiveT) this.registry.get().getPrimitive(keyt, cls);
    }

    public final <WrapperPrimitiveT> WrapperPrimitiveT wrap(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, java.lang.Class<WrapperPrimitiveT> cls) throws java.security.GeneralSecurityException {
        return (WrapperPrimitiveT) this.registry.get().wrap(keysetHandleInterface, monitoringAnnotations, cls);
    }
}
