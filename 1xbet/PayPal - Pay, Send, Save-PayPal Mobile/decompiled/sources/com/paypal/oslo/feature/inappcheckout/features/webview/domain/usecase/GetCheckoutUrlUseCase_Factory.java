package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

/* loaded from: classes13.dex */
public final class GetCheckoutUrlUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutPreferencesUseCase> getHighSpeedVideoSizes;

    private GetCheckoutUrlUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutPreferencesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutPreferencesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase> provider3) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase newInstance(com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutPreferencesUseCase getCheckoutPreferencesUseCase, com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository authRepository, com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase trackMonitoringEventUseCase) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutUrlUseCase(getCheckoutPreferencesUseCase, authRepository, trackMonitoringEventUseCase);
    }
}
