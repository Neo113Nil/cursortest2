package com.paypal.oslo.feature.consumerprivacy.domain.usecase;

/* loaded from: classes12.dex */
public final class UpdatePersonalizedShoppingPreferenceUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedShoppingPreferenceUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedShoppingRepository> Camera2StreamConfigurationMap;

    private UpdatePersonalizedShoppingPreferenceUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedShoppingRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedShoppingPreferenceUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedShoppingPreferenceUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedShoppingRepository> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedShoppingPreferenceUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedShoppingPreferenceUseCase newInstance(com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedShoppingRepository personalizedShoppingRepository) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedShoppingPreferenceUseCase(personalizedShoppingRepository);
    }
}
