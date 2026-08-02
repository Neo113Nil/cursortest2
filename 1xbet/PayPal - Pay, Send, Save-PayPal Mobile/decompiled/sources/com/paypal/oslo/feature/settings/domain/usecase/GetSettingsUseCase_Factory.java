package com.paypal.oslo.feature.settings.domain.usecase;

/* loaded from: classes14.dex */
public final class GetSettingsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.domain.usecase.GetSettingsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository> getHighSpeedVideoFpsRangesFor;

    private GetSettingsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.domain.usecase.GetSettingsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.settings.domain.usecase.GetSettingsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository> provider) {
        return new com.paypal.oslo.feature.settings.domain.usecase.GetSettingsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.settings.domain.usecase.GetSettingsUseCase newInstance(com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository) {
        return new com.paypal.oslo.feature.settings.domain.usecase.GetSettingsUseCase(iSettingsRepository);
    }
}
