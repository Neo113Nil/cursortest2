package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel;

/* loaded from: classes14.dex */
public final class AccountSummaryViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.C0383AccountSummaryViewModel_Factory getHighSpeedVideoFpsRanges;

    private AccountSummaryViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.C0383AccountSummaryViewModel_Factory c0383AccountSummaryViewModel_Factory) {
        this.getHighSpeedVideoFpsRanges = c0383AccountSummaryViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient) {
        return this.getHighSpeedVideoFpsRanges.get(accountSummaryNavigationArgs, starPayClient);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.C0383AccountSummaryViewModel_Factory c0383AccountSummaryViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel_Factory_Impl(c0383AccountSummaryViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.C0383AccountSummaryViewModel_Factory c0383AccountSummaryViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel_Factory_Impl(c0383AccountSummaryViewModel_Factory));
    }
}
