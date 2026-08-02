package com.paypal.oslo.feature.settings.di;

/* loaded from: classes14.dex */
public final class SettingsModule_ProvideLegalRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.legal.domain.repository.LegalRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> getHighSpeedVideoFpsRangesFor;

    private SettingsModule_ProvideLegalRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.legal.domain.repository.LegalRepository get() {
        return provideLegalRepository(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.settings.di.SettingsModule_ProvideLegalRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration> provider) {
        return new com.paypal.oslo.feature.settings.di.SettingsModule_ProvideLegalRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.settings.legal.domain.repository.LegalRepository provideLegalRepository(com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration) {
        return (com.paypal.oslo.feature.settings.legal.domain.repository.LegalRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.settings.di.SettingsModule.INSTANCE.provideLegalRepository(settingsDynamicConfiguration));
    }
}
