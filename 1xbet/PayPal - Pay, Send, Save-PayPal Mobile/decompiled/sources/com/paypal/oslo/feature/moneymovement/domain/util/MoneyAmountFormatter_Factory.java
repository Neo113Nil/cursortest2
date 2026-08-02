package com.paypal.oslo.feature.moneymovement.domain.util;

/* loaded from: classes13.dex */
public final class MoneyAmountFormatter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> getHighSpeedVideoSizes;

    private MoneyAmountFormatter_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider) {
        return new com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter_Factory(provider);
    }

    public static com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter newInstance(com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase) {
        return new com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter(formatCurrencyUseCase);
    }
}
