package com.paypal.oslo.feature.savings.util;

/* loaded from: classes14.dex */
public final class DateTimeHandlerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> getHighResolutionOutputSizeshNQ4ISI;

    private DateTimeHandlerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider) {
        return new com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl newInstance(com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider) {
        return new com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl(localeProvider);
    }
}
