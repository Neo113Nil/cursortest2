package com.paypal.oslo.feature.inappcheckout.domain.usecase;

/* loaded from: classes13.dex */
public final class FormatLocalizedUrlUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatLocalizedUrlUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> getHighSpeedVideoFpsRanges;

    private FormatLocalizedUrlUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatLocalizedUrlUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatLocalizedUrlUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatLocalizedUrlUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatLocalizedUrlUseCase newInstance(com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatLocalizedUrlUseCase(localeProvider);
    }
}
