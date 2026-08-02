package com.paypal.oslo.feature.savings.util;

/* loaded from: classes14.dex */
public final class CurrencyHandlerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> getHighSpeedVideoFpsRanges;

    private CurrencyHandlerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider) {
        return new com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl newInstance(com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider) {
        return new com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl(localeProvider);
    }
}
