package com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0391BackupPaymentMethodViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodReducer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodObservabilityMiddleware.Factory> getHighSpeedVideoSizes;

    private C0391BackupPaymentMethodViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodObservabilityMiddleware.Factory> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.BackupPaymentMethodDestination backupPaymentMethodDestination) {
        return newInstance(backupPaymentMethodDestination, this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.C0391BackupPaymentMethodViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodObservabilityMiddleware.Factory> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.C0391BackupPaymentMethodViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.BackupPaymentMethodDestination backupPaymentMethodDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodReducer backupPaymentMethodReducer, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodObservabilityMiddleware.Factory factory) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel(backupPaymentMethodDestination, backupPaymentMethodReducer, currencyFormatterFacade, factory);
    }
}
