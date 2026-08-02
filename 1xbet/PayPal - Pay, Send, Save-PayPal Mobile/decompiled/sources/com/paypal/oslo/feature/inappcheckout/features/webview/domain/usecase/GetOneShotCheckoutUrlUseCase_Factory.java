package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

/* loaded from: classes13.dex */
public final class GetOneShotCheckoutUrlUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.BuildAuthenticationResultFromAuthResponseUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase> getHighSpeedVideoSizes;

    private GetOneShotCheckoutUrlUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.BuildAuthenticationResultFromAuthResponseUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.BuildAuthenticationResultFromAuthResponseUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase> provider3) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository authRepository, com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.BuildAuthenticationResultFromAuthResponseUseCase buildAuthenticationResultFromAuthResponseUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase trackMonitoringEventUseCase) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase(authRepository, buildAuthenticationResultFromAuthResponseUseCase, trackMonitoringEventUseCase);
    }
}
