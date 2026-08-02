package com.paypal.oslo.feature.balance.ui.autoReload.frequency;

/* loaded from: classes11.dex */
public final class FrequencyViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase> getHighSpeedVideoFpsRangesFor;

    private FrequencyViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase> provider3) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyViewModel newInstance(com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase formatOrdinalUseCase) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyViewModel(localeInformation, dateTimeFormatUseCase, formatOrdinalUseCase);
    }
}
