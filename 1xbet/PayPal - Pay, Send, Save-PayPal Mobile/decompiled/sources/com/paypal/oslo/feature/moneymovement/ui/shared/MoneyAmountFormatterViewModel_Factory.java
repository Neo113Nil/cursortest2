package com.paypal.oslo.feature.moneymovement.ui.shared;

/* loaded from: classes13.dex */
public final class MoneyAmountFormatterViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.moneymovement.ui.shared.MoneyAmountFormatterViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> Camera2StreamConfigurationMap;

    private MoneyAmountFormatterViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.moneymovement.ui.shared.MoneyAmountFormatterViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.moneymovement.ui.shared.MoneyAmountFormatterViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> provider) {
        return new com.paypal.oslo.feature.moneymovement.ui.shared.MoneyAmountFormatterViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.moneymovement.ui.shared.MoneyAmountFormatterViewModel newInstance(com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter) {
        return new com.paypal.oslo.feature.moneymovement.ui.shared.MoneyAmountFormatterViewModel(moneyAmountFormatter);
    }
}
