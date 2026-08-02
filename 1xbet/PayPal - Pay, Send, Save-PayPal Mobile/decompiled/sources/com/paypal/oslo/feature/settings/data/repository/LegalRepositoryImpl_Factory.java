package com.paypal.oslo.feature.settings.data.repository;

/* loaded from: classes14.dex */
public final class LegalRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.data.repository.LegalRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> getHighSpeedVideoFpsRanges;

    private LegalRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.data.repository.LegalRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.settings.data.repository.LegalRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> provider) {
        return new com.paypal.oslo.feature.settings.data.repository.LegalRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.settings.data.repository.LegalRepositoryImpl newInstance(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration) {
        return new com.paypal.oslo.feature.settings.data.repository.LegalRepositoryImpl(settingsDynamicConfiguration);
    }
}
