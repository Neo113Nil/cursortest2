package com.paypal.oslo.feature.subscriptions.shared.domain;

/* loaded from: classes15.dex */
public final class FormatHelper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> getHighSpeedVideoSizes;

    private FormatHelper_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider2) {
        return new com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper newInstance(com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase) {
        return new com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper(formatCurrencyUseCase, dateTimeFormatUseCase);
    }
}
