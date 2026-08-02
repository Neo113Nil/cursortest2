package com.paypal.oslo.feature.pushnotification.preferences.domain.usecase;

/* loaded from: classes13.dex */
public final class UpdatePreferencesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.preferences.domain.repository.PushPreferenceRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider> getHighSpeedVideoSizes;

    private UpdatePreferencesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.preferences.domain.repository.PushPreferenceRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.preferences.domain.repository.PushPreferenceRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider> provider2) {
        return new com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase newInstance(com.paypal.oslo.feature.pushnotification.preferences.domain.repository.PushPreferenceRepository pushPreferenceRepository, com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider deviceIdProvider) {
        return new com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase(pushPreferenceRepository, deviceIdProvider);
    }
}
