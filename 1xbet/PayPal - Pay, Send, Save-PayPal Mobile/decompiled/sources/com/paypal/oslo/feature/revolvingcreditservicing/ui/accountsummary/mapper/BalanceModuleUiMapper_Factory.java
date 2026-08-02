package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

/* loaded from: classes14.dex */
public final class BalanceModuleUiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.BalanceModuleUiMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.PersistentDebtUiMapper> getHighSpeedVideoSizes;

    private BalanceModuleUiMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.PersistentDebtUiMapper> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.BalanceModuleUiMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.BalanceModuleUiMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.PersistentDebtUiMapper> provider4) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.BalanceModuleUiMapper_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.BalanceModuleUiMapper newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper scheduledPaymentInfoMapper, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.PersistentDebtUiMapper persistentDebtUiMapper) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.BalanceModuleUiMapper(currencyFormatterFacade, dateFormatterFacade, scheduledPaymentInfoMapper, persistentDebtUiMapper);
    }
}
