package com.paypal.oslo.core.companion.di;

/* loaded from: classes10.dex */
public final class CompanionServiceModule_ProvidesCompanionConfigurationApiFactory implements dagger.internal.Factory<com.paypal.oslo.core.companion.domain.CompanionConfigurationApi> {
    private final dagger.internal.Provider<com.paypal.oslo.core.companion.domain.CompanionAppConfiguration> getHighSpeedVideoSizes;

    private CompanionServiceModule_ProvidesCompanionConfigurationApiFactory(dagger.internal.Provider<com.paypal.oslo.core.companion.domain.CompanionAppConfiguration> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.companion.domain.CompanionConfigurationApi get() {
        return providesCompanionConfigurationApi(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.companion.di.CompanionServiceModule_ProvidesCompanionConfigurationApiFactory create(dagger.internal.Provider<com.paypal.oslo.core.companion.domain.CompanionAppConfiguration> provider) {
        return new com.paypal.oslo.core.companion.di.CompanionServiceModule_ProvidesCompanionConfigurationApiFactory(provider);
    }

    public static com.paypal.oslo.core.companion.domain.CompanionConfigurationApi providesCompanionConfigurationApi(com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration) {
        return (com.paypal.oslo.core.companion.domain.CompanionConfigurationApi) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.companion.di.CompanionServiceModule.INSTANCE.providesCompanionConfigurationApi(companionAppConfiguration));
    }
}
