package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class AccountVisibilityViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularRequestMoneyUseCases> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimplifiedPolicyUseCases> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularSendMoneyUseCases> getHighSpeedVideoSizes;

    private AccountVisibilityViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimplifiedPolicyUseCases> provider2, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularSendMoneyUseCases> provider3, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularRequestMoneyUseCases> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimplifiedPolicyUseCases> provider2, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularSendMoneyUseCases> provider3, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularRequestMoneyUseCases> provider4) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel newInstance(com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityUseCase getAccountVisibilityUseCase, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimplifiedPolicyUseCases simplifiedPolicyUseCases, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularSendMoneyUseCases granularSendMoneyUseCases, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularRequestMoneyUseCases granularRequestMoneyUseCases) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel(getAccountVisibilityUseCase, simplifiedPolicyUseCases, granularSendMoneyUseCases, granularRequestMoneyUseCases);
    }
}
