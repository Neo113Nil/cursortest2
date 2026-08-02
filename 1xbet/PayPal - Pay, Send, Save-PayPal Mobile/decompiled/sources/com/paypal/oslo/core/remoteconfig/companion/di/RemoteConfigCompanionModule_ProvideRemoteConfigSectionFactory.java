package com.paypal.oslo.core.remoteconfig.companion.di;

/* loaded from: classes5.dex */
public final class RemoteConfigCompanionModule_ProvideRemoteConfigSectionFactory implements dagger.internal.Factory<com.paypal.oslo.core.companion.domain.ConfigSection> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private RemoteConfigCompanionModule_ProvideRemoteConfigSectionFactory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory> provider, dagger.internal.Provider<android.content.Context> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.companion.domain.ConfigSection get() {
        return provideRemoteConfigSection(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.remoteconfig.companion.di.RemoteConfigCompanionModule_ProvideRemoteConfigSectionFactory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory> provider, dagger.internal.Provider<android.content.Context> provider2) {
        return new com.paypal.oslo.core.remoteconfig.companion.di.RemoteConfigCompanionModule_ProvideRemoteConfigSectionFactory(provider, provider2);
    }

    public static com.paypal.oslo.core.companion.domain.ConfigSection provideRemoteConfigSection(com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory remoteConfigSectionFactory, android.content.Context context) {
        return (com.paypal.oslo.core.companion.domain.ConfigSection) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.remoteconfig.companion.di.RemoteConfigCompanionModule.INSTANCE.provideRemoteConfigSection(remoteConfigSectionFactory, context));
    }
}
