package com.paypal.oslo.feature.settings.domain.usecase;

/* loaded from: classes14.dex */
public final class GetAppVersionUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.domain.usecase.GetAppVersionUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> getHighSpeedVideoFpsRangesFor;

    private GetAppVersionUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.domain.usecase.GetAppVersionUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.settings.domain.usecase.GetAppVersionUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> provider2) {
        return new com.paypal.oslo.feature.settings.domain.usecase.GetAppVersionUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.settings.domain.usecase.GetAppVersionUseCase newInstance(com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider, com.paypal.oslo.core.appidentity.domain.AppInformation appInformation) {
        return new com.paypal.oslo.feature.settings.domain.usecase.GetAppVersionUseCase(settingsStringsProvider, appInformation);
    }
}
