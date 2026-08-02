package com.paypal.oslo.feature.xoom.domain.usecase;

/* loaded from: classes16.dex */
public final class CreateWebViewHeadersUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.TransferToWebUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getHighSpeedVideoFpsRangesFor;

    private CreateWebViewHeadersUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.TransferToWebUseCase> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.TransferToWebUseCase> provider2) {
        return new com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase newInstance(com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.feature.xoom.domain.usecase.TransferToWebUseCase transferToWebUseCase) {
        return new com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase(localeInformation, transferToWebUseCase);
    }
}
