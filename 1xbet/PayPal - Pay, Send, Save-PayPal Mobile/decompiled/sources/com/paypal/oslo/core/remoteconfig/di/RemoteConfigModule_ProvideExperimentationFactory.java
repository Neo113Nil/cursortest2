package com.paypal.oslo.core.remoteconfig.di;

/* loaded from: classes10.dex */
public final class RemoteConfigModule_ProvideExperimentationFactory implements dagger.internal.Factory<com.paypal.oslo.core.remoteconfig.contract.Experimentation> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.remoteconfig.contract.Experimentation get() {
        return provideExperimentation();
    }

    public static com.paypal.oslo.core.remoteconfig.di.RemoteConfigModule_ProvideExperimentationFactory create() {
        return com.paypal.oslo.core.remoteconfig.di.RemoteConfigModule_ProvideExperimentationFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.core.remoteconfig.contract.Experimentation provideExperimentation() {
        return (com.paypal.oslo.core.remoteconfig.contract.Experimentation) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.remoteconfig.di.RemoteConfigModule.INSTANCE.provideExperimentation());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.remoteconfig.di.RemoteConfigModule_ProvideExperimentationFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.remoteconfig.di.RemoteConfigModule_ProvideExperimentationFactory();

        private InstanceHolder() {
        }
    }
}
