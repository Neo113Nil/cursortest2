package com.paypal.oslo.core.remoteconfig.registry;

/* loaded from: classes10.dex */
public final class ExperimentRegistry_Factory implements dagger.internal.Factory<com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry_Factory create() {
        return com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry newInstance() {
        return new com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry_Factory();

        private InstanceHolder() {
        }
    }
}
