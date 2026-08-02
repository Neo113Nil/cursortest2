package com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase;

/* loaded from: classes13.dex */
public final class LoaderTypeUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> getHighSpeedVideoFpsRangesFor;

    private LoaderTypeUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCaseImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider) {
        return new com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCaseImpl newInstance(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager) {
        return new com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCaseImpl(featureGateManager);
    }
}
