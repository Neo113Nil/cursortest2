package com.paypal.oslo.core.i18n.data.implementation;

/* loaded from: classes10.dex */
public final class I18nUserStatusObserver_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.data.implementation.I18nUserStatusObserver> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ReconfigureI18nUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighResolutionOutputSizeshNQ4ISI;

    private I18nUserStatusObserver_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ReconfigureI18nUseCase> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.data.implementation.I18nUserStatusObserver get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.i18n.data.implementation.I18nUserStatusObserver_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ReconfigureI18nUseCase> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        return new com.paypal.oslo.core.i18n.data.implementation.I18nUserStatusObserver_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.i18n.data.implementation.I18nUserStatusObserver newInstance(com.paypal.oslo.core.i18n.domain.usecase.ReconfigureI18nUseCase reconfigureI18nUseCase, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.core.i18n.data.implementation.I18nUserStatusObserver(reconfigureI18nUseCase, coroutineScope);
    }
}
