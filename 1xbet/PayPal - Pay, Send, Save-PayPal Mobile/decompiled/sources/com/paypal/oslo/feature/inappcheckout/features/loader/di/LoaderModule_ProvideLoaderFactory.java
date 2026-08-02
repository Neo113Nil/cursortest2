package com.paypal.oslo.feature.inappcheckout.features.loader.di;

/* loaded from: classes13.dex */
public final class LoaderModule_ProvideLoaderFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> getHighSpeedVideoSizes;

    private LoaderModule_ProvideLoaderFactory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCase get() {
        return provideLoader(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.loader.di.LoaderModule_ProvideLoaderFactory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider) {
        return new com.paypal.oslo.feature.inappcheckout.features.loader.di.LoaderModule_ProvideLoaderFactory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCase provideLoader(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager) {
        return (com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCase) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.features.loader.di.LoaderModule.INSTANCE.provideLoader(featureGateManager));
    }
}
