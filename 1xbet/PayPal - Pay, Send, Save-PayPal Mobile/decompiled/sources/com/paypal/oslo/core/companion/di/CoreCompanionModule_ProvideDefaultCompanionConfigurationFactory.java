package com.paypal.oslo.core.companion.di;

/* loaded from: classes4.dex */
public final class CoreCompanionModule_ProvideDefaultCompanionConfigurationFactory implements dagger.internal.Factory<com.paypal.oslo.core.companion.domain.CompanionAppConfiguration> {
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.companion.domain.ConfigSection>> Camera2StreamConfigurationMap;

    private CoreCompanionModule_ProvideDefaultCompanionConfigurationFactory(dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.companion.domain.ConfigSection>> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.companion.domain.CompanionAppConfiguration get() {
        return provideDefaultCompanionConfiguration(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.companion.di.CoreCompanionModule_ProvideDefaultCompanionConfigurationFactory create(dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.companion.domain.ConfigSection>> provider) {
        return new com.paypal.oslo.core.companion.di.CoreCompanionModule_ProvideDefaultCompanionConfigurationFactory(provider);
    }

    public static com.paypal.oslo.core.companion.domain.CompanionAppConfiguration provideDefaultCompanionConfiguration(java.util.Set<com.paypal.oslo.core.companion.domain.ConfigSection> set) {
        return (com.paypal.oslo.core.companion.domain.CompanionAppConfiguration) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.companion.di.CoreCompanionModule.INSTANCE.provideDefaultCompanionConfiguration(set));
    }
}
