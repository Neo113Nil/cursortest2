package com.paypal.oslo.core.remoteconfig.registry;

/* loaded from: classes10.dex */
public final class FeatureGateRegistry_Factory implements dagger.internal.Factory<com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry_Factory create() {
        return com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry newInstance() {
        return new com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry_Factory();

        private InstanceHolder() {
        }
    }
}
