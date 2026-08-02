package com.paypal.oslo.core.companion.di;

/* loaded from: classes10.dex */
public final class CompanionServiceModule_ProvidesCompanionConfigChangeHandlerFactory implements dagger.internal.Factory<com.paypal.oslo.core.companion.data.CompanionAppMessageHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.core.companion.domain.CompanionConfigurationApi> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.serialization.json.Json> getHighSpeedVideoSizes;

    private CompanionServiceModule_ProvidesCompanionConfigChangeHandlerFactory(dagger.internal.Provider<com.paypal.oslo.core.companion.domain.CompanionConfigurationApi> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.companion.data.CompanionAppMessageHandler get() {
        return providesCompanionConfigChangeHandler(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.companion.di.CompanionServiceModule_ProvidesCompanionConfigChangeHandlerFactory create(dagger.internal.Provider<com.paypal.oslo.core.companion.domain.CompanionConfigurationApi> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2) {
        return new com.paypal.oslo.core.companion.di.CompanionServiceModule_ProvidesCompanionConfigChangeHandlerFactory(provider, provider2);
    }

    public static com.paypal.oslo.core.companion.data.CompanionAppMessageHandler providesCompanionConfigChangeHandler(com.paypal.oslo.core.companion.domain.CompanionConfigurationApi companionConfigurationApi, kotlinx.serialization.json.Json json) {
        return (com.paypal.oslo.core.companion.data.CompanionAppMessageHandler) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.companion.di.CompanionServiceModule.INSTANCE.providesCompanionConfigChangeHandler(companionConfigurationApi, json));
    }
}
