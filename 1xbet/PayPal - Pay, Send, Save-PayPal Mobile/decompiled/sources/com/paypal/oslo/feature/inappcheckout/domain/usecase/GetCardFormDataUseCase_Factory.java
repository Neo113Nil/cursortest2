package com.paypal.oslo.feature.inappcheckout.domain.usecase;

/* loaded from: classes13.dex */
public final class GetCardFormDataUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.CardFormDataRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighSpeedVideoFpsRangesFor;

    private GetCardFormDataUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.CardFormDataRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.CardFormDataRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider3) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase formatSavedAddressesUseCase, com.paypal.oslo.feature.inappcheckout.domain.repository.CardFormDataRepository cardFormDataRepository, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase(formatSavedAddressesUseCase, cardFormDataRepository, appSwitchSession);
    }
}
