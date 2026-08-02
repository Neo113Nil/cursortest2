package com.paypal.oslo.core.i18n.data.implementation;

/* loaded from: classes10.dex */
public final class I18NConfiguratorImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.data.implementation.I18NConfiguratorImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private I18NConfiguratorImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.data.implementation.I18NConfiguratorImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.i18n.data.implementation.I18NConfiguratorImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase> provider) {
        return new com.paypal.oslo.core.i18n.data.implementation.I18NConfiguratorImpl_Factory(provider);
    }

    public static com.paypal.oslo.core.i18n.data.implementation.I18NConfiguratorImpl newInstance(com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase localeResolverUseCase) {
        return new com.paypal.oslo.core.i18n.data.implementation.I18NConfiguratorImpl(localeResolverUseCase);
    }
}
