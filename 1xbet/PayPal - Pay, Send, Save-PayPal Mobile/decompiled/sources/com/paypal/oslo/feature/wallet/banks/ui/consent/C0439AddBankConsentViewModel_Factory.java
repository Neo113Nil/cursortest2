package com.paypal.oslo.feature.wallet.banks.ui.consent;

/* renamed from: com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C0439AddBankConsentViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetInstantBankConfirmationAggregatorUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private C0439AddBankConsentViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetInstantBankConfirmationAggregatorUseCase> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    public final com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel get(com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId addBankConsentFlowContentId, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams instantBankConfirmationAggregatorParams) {
        return newInstance(addBankConsentFlowContentId, instantBankConfirmationAggregatorParams, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.consent.C0439AddBankConsentViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.GetInstantBankConfirmationAggregatorUseCase> provider2) {
        return new com.paypal.oslo.feature.wallet.banks.ui.consent.C0439AddBankConsentViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel newInstance(com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId addBankConsentFlowContentId, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams instantBankConfirmationAggregatorParams, com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase getOpenBankingAggregatorUseCase, com.paypal.oslo.feature.wallet.banks.domain.usecase.GetInstantBankConfirmationAggregatorUseCase getInstantBankConfirmationAggregatorUseCase) {
        return new com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel(addBankConsentFlowContentId, instantBankConfirmationAggregatorParams, getOpenBankingAggregatorUseCase, getInstantBankConfirmationAggregatorUseCase);
    }
}
