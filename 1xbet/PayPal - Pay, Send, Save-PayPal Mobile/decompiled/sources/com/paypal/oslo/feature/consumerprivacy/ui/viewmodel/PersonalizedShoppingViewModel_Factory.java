package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class PersonalizedShoppingViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedShoppingPreferenceUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedShoppingSettingsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> getHighSpeedVideoFpsRanges;

    private PersonalizedShoppingViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedShoppingSettingsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedShoppingPreferenceUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedShoppingSettingsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedShoppingPreferenceUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider3) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel newInstance(com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedShoppingSettingsUseCase getPersonalizedShoppingSettingsUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedShoppingPreferenceUseCase updatePersonalizedShoppingPreferenceUseCase, com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel(getPersonalizedShoppingSettingsUseCase, updatePersonalizedShoppingPreferenceUseCase, dateTimeFormatUseCase);
    }
}
