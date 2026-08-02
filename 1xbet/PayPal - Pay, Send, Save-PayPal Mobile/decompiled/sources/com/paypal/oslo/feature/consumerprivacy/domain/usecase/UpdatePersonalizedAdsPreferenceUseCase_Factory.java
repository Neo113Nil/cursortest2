package com.paypal.oslo.feature.consumerprivacy.domain.usecase;

/* loaded from: classes12.dex */
public final class UpdatePersonalizedAdsPreferenceUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedAdsPreferenceUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedAdsRepository> getHighSpeedVideoFpsRangesFor;

    private UpdatePersonalizedAdsPreferenceUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedAdsRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedAdsPreferenceUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedAdsPreferenceUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedAdsRepository> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedAdsPreferenceUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedAdsPreferenceUseCase newInstance(com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedAdsRepository personalizedAdsRepository) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedAdsPreferenceUseCase(personalizedAdsRepository);
    }
}
