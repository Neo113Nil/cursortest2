package com.paypal.oslo.feature.wallet.banks.ui.finicity;

/* renamed from: com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C0442FinicityFlowViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.InitiateExternalBankAccessUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.connectsdk.domain.usecase.InitiateMastercardConnectUseCase> getHighSpeedVideoFpsRangesFor;

    private C0442FinicityFlowViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.InitiateExternalBankAccessUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.connectsdk.domain.usecase.InitiateMastercardConnectUseCase> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    public final com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel get(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, java.lang.String str5, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, java.lang.String str6, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails) {
        return newInstance(str, str2, str3, str4, integrationType, str5, addFIFlow, externalBankAccessAction, str6, instantBankConfirmationBankDetails, this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.finicity.C0442FinicityFlowViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.InitiateExternalBankAccessUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.connectsdk.domain.usecase.InitiateMastercardConnectUseCase> provider2) {
        return new com.paypal.oslo.feature.wallet.banks.ui.finicity.C0442FinicityFlowViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel newInstance(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, java.lang.String str5, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, java.lang.String str6, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, com.paypal.oslo.feature.wallet.banks.domain.usecase.InitiateExternalBankAccessUseCase initiateExternalBankAccessUseCase, com.paypal.oslo.feature.wallet.banks.connectsdk.domain.usecase.InitiateMastercardConnectUseCase initiateMastercardConnectUseCase) {
        return new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel(str, str2, str3, str4, integrationType, str5, addFIFlow, externalBankAccessAction, str6, instantBankConfirmationBankDetails, initiateExternalBankAccessUseCase, initiateMastercardConnectUseCase);
    }
}
