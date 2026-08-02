package com.paypal.oslo.feature.settings.di;

/* loaded from: classes14.dex */
public final class SettingsModule_ProvideSettingsStringProviderFactory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private SettingsModule_ProvideSettingsStringProviderFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider get() {
        return provideSettingsStringProvider(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.settings.di.SettingsModule_ProvideSettingsStringProviderFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.settings.di.SettingsModule_ProvideSettingsStringProviderFactory(provider);
    }

    public static com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider provideSettingsStringProvider(android.content.Context context) {
        return (com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.settings.di.SettingsModule.INSTANCE.provideSettingsStringProvider(context));
    }
}
