package com.paypal.oslo.feature.wallet.banks.ui.autolink;

/* loaded from: classes15.dex */
public final class AutoLinkViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.LinkExternalBankAccountsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase> getHighSpeedVideoFpsRanges;

    private AutoLinkViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.LinkExternalBankAccountsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.LinkExternalBankAccountsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase> provider2) {
        return new com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel newInstance(com.paypal.oslo.feature.wallet.banks.domain.usecase.LinkExternalBankAccountsUseCase linkExternalBankAccountsUseCase, com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase confirmBankAccountUseCase) {
        return new com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel(linkExternalBankAccountsUseCase, confirmBankAccountUseCase);
    }
}
