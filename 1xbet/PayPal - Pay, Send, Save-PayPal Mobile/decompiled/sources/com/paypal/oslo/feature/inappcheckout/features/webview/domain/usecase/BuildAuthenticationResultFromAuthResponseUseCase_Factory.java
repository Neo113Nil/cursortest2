package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

/* loaded from: classes13.dex */
public final class BuildAuthenticationResultFromAuthResponseUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.BuildAuthenticationResultFromAuthResponseUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.converter.NativeRypDataConverter> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.ProcessOneShotAuthenticationDataUseCase> getHighSpeedVideoFpsRangesFor;

    private BuildAuthenticationResultFromAuthResponseUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.converter.NativeRypDataConverter> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.ProcessOneShotAuthenticationDataUseCase> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.BuildAuthenticationResultFromAuthResponseUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.BuildAuthenticationResultFromAuthResponseUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.converter.NativeRypDataConverter> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.ProcessOneShotAuthenticationDataUseCase> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.BuildAuthenticationResultFromAuthResponseUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.BuildAuthenticationResultFromAuthResponseUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.converter.NativeRypDataConverter nativeRypDataConverter, com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.ProcessOneShotAuthenticationDataUseCase processOneShotAuthenticationDataUseCase) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.BuildAuthenticationResultFromAuthResponseUseCase(nativeRypDataConverter, processOneShotAuthenticationDataUseCase);
    }
}
