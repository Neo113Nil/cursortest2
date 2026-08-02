package com.paypal.oslo.core.remoteconfig.registry;

/* loaded from: classes10.dex */
public final class DynamicConfigRegistry_Factory implements dagger.internal.Factory<com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry_Factory create() {
        return com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry newInstance() {
        return new com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry_Factory();

        private InstanceHolder() {
        }
    }
}
