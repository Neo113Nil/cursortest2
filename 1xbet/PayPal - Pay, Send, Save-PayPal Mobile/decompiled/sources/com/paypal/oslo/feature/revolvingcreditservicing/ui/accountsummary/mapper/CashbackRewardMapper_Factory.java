package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

/* loaded from: classes14.dex */
public final class CashbackRewardMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.CashbackRewardMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> getHighSpeedVideoSizes;

    private CashbackRewardMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.CashbackRewardMapper get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.CashbackRewardMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.CashbackRewardMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.CashbackRewardMapper newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.CashbackRewardMapper(currencyFormatterFacade);
    }
}
