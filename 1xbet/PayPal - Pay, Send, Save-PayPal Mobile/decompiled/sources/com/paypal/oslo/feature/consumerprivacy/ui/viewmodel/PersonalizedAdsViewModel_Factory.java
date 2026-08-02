package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class PersonalizedAdsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedAdsPreferenceUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedAdsPreferenceUseCase> getHighSpeedVideoSizes;

    private PersonalizedAdsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedAdsPreferenceUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedAdsPreferenceUseCase> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedAdsPreferenceUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedAdsPreferenceUseCase> provider2) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel newInstance(com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedAdsPreferenceUseCase getPersonalizedAdsPreferenceUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedAdsPreferenceUseCase updatePersonalizedAdsPreferenceUseCase) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel(getPersonalizedAdsPreferenceUseCase, updatePersonalizedAdsPreferenceUseCase);
    }
}
