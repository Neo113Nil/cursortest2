package com.paypal.oslo.feature.consumerprivacy.domain.usecase;

/* loaded from: classes12.dex */
public final class GetPersonalizedAdsPreferenceUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedAdsPreferenceUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedAdsRepository> getHighSpeedVideoSizes;

    private GetPersonalizedAdsPreferenceUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedAdsRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedAdsPreferenceUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedAdsPreferenceUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedAdsRepository> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedAdsPreferenceUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedAdsPreferenceUseCase newInstance(com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedAdsRepository personalizedAdsRepository) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedAdsPreferenceUseCase(personalizedAdsRepository);
    }
}
