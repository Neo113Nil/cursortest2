package com.paypal.oslo.feature.identity.userverification.domain.usecase;

/* loaded from: classes13.dex */
public final class FetchGoogleSignUpDetailsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.userverification.domain.usecase.FetchGoogleSignUpDetailsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.repository.GoogleSignUpRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRanges;

    private FetchGoogleSignUpDetailsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.repository.GoogleSignUpRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.userverification.domain.usecase.FetchGoogleSignUpDetailsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.userverification.domain.usecase.FetchGoogleSignUpDetailsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.repository.GoogleSignUpRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider2) {
        return new com.paypal.oslo.feature.identity.userverification.domain.usecase.FetchGoogleSignUpDetailsUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.userverification.domain.usecase.FetchGoogleSignUpDetailsUseCase newInstance(com.paypal.oslo.feature.identity.userverification.domain.repository.GoogleSignUpRepository googleSignUpRepository, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.identity.userverification.domain.usecase.FetchGoogleSignUpDetailsUseCase(googleSignUpRepository, featureGate);
    }
}
