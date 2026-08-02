package com.paypal.oslo.feature.wallet.banks.ui.openbanking;

/* loaded from: classes15.dex */
public final class FailedLinkedAccountsErrorViewModel_Factory_Impl implements com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.Factory {
    private final com.paypal.oslo.feature.wallet.banks.ui.openbanking.C0443FailedLinkedAccountsErrorViewModel_Factory getHighSpeedVideoFpsRangesFor;

    private FailedLinkedAccountsErrorViewModel_Factory_Impl(com.paypal.oslo.feature.wallet.banks.ui.openbanking.C0443FailedLinkedAccountsErrorViewModel_Factory c0443FailedLinkedAccountsErrorViewModel_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0443FailedLinkedAccountsErrorViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.Factory
    public final com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel create(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list) {
        return this.getHighSpeedVideoFpsRangesFor.get(list);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.Factory> create(com.paypal.oslo.feature.wallet.banks.ui.openbanking.C0443FailedLinkedAccountsErrorViewModel_Factory c0443FailedLinkedAccountsErrorViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel_Factory_Impl(c0443FailedLinkedAccountsErrorViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.wallet.banks.ui.openbanking.C0443FailedLinkedAccountsErrorViewModel_Factory c0443FailedLinkedAccountsErrorViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel_Factory_Impl(c0443FailedLinkedAccountsErrorViewModel_Factory));
    }
}
