package com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid;

/* renamed from: com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C0444PlaidViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<android.app.Application> getHighSpeedVideoSizes;

    private C0444PlaidViewModel_Factory(dagger.internal.Provider<android.app.Application> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    public final com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel get(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, java.lang.String str, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, java.lang.String str2) {
        return newInstance(addFIFlow, externalBankAccessAction, str, instantBankConfirmationBankDetails, str2, this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.C0444PlaidViewModel_Factory create(dagger.internal.Provider<android.app.Application> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase> provider4) {
        return new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.C0444PlaidViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel newInstance(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, java.lang.String str, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, java.lang.String str2, android.app.Application application, com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase getPlaidTokenUseCase, com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase fetchAndUpdateForPlaidUseCase, com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase confirmBankAccountUseCase) {
        return new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel(addFIFlow, externalBankAccessAction, str, instantBankConfirmationBankDetails, str2, application, getPlaidTokenUseCase, fetchAndUpdateForPlaidUseCase, confirmBankAccountUseCase);
    }
}
