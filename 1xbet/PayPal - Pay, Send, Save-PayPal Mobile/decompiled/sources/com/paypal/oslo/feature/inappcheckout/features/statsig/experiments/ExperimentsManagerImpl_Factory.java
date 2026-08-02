package com.paypal.oslo.feature.inappcheckout.features.statsig.experiments;

/* loaded from: classes13.dex */
public final class ExperimentsManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.statsig.experiments.ExperimentsManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.Experimentation> Camera2StreamConfigurationMap;

    private ExperimentsManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.Experimentation> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.statsig.experiments.ExperimentsManagerImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.statsig.experiments.ExperimentsManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.Experimentation> provider) {
        return new com.paypal.oslo.feature.inappcheckout.features.statsig.experiments.ExperimentsManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.statsig.experiments.ExperimentsManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.Experimentation experimentation) {
        return new com.paypal.oslo.feature.inappcheckout.features.statsig.experiments.ExperimentsManagerImpl(experimentation);
    }
}
