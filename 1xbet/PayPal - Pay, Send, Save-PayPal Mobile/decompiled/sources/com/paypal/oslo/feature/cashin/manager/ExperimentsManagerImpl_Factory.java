package com.paypal.oslo.feature.cashin.manager;

/* loaded from: classes11.dex */
public final class ExperimentsManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.manager.ExperimentsManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.Experimentation> getHighSpeedVideoSizes;

    private ExperimentsManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.Experimentation> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.manager.ExperimentsManagerImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cashin.manager.ExperimentsManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.Experimentation> provider) {
        return new com.paypal.oslo.feature.cashin.manager.ExperimentsManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.cashin.manager.ExperimentsManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.Experimentation experimentation) {
        return new com.paypal.oslo.feature.cashin.manager.ExperimentsManagerImpl(experimentation);
    }
}
