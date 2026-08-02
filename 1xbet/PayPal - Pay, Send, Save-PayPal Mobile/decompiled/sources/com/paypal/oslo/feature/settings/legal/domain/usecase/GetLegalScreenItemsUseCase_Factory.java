package com.paypal.oslo.feature.settings.legal.domain.usecase;

/* loaded from: classes14.dex */
public final class GetLegalScreenItemsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.legal.domain.usecase.GetLegalScreenItemsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.legal.domain.repository.LegalRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> getHighSpeedVideoFpsRangesFor;

    private GetLegalScreenItemsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.settings.legal.domain.repository.LegalRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.legal.domain.usecase.GetLegalScreenItemsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.settings.legal.domain.usecase.GetLegalScreenItemsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.legal.domain.repository.LegalRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> provider2) {
        return new com.paypal.oslo.feature.settings.legal.domain.usecase.GetLegalScreenItemsUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.settings.legal.domain.usecase.GetLegalScreenItemsUseCase newInstance(com.paypal.oslo.feature.settings.legal.domain.repository.LegalRepository legalRepository, com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider) {
        return new com.paypal.oslo.feature.settings.legal.domain.usecase.GetLegalScreenItemsUseCase(legalRepository, settingsStringsProvider);
    }
}
