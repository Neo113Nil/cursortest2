package com.paypal.oslo.feature.xoom.ui.accountlinking;

/* loaded from: classes16.dex */
public final class AccountLinkingViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.CreateAccountLinkingInitialUrlUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase> getHighSpeedVideoFpsRangesFor;

    private AccountLinkingViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.CreateAccountLinkingInitialUrlUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.CreateAccountLinkingInitialUrlUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase> provider3) {
        return new com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel newInstance(com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingReducer accountLinkingReducer, com.paypal.oslo.feature.xoom.domain.usecase.CreateAccountLinkingInitialUrlUseCase createAccountLinkingInitialUrlUseCase, com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase createWebViewHeadersUseCase) {
        return new com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel(accountLinkingReducer, createAccountLinkingInitialUrlUseCase, createWebViewHeadersUseCase);
    }
}
