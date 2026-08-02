package com.paypal.oslo.feature.consumerprivacy.domain.usecase;

/* loaded from: classes12.dex */
public final class GetPersonalizedShoppingSettingsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedShoppingSettingsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedShoppingRepository> getHighSpeedVideoFpsRangesFor;

    private GetPersonalizedShoppingSettingsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedShoppingRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedShoppingSettingsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedShoppingSettingsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedShoppingRepository> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedShoppingSettingsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedShoppingSettingsUseCase newInstance(com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedShoppingRepository personalizedShoppingRepository) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedShoppingSettingsUseCase(personalizedShoppingRepository);
    }
}
