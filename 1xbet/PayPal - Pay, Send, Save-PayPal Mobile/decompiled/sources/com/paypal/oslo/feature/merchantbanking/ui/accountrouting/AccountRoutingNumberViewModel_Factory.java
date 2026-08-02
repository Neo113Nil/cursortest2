package com.paypal.oslo.feature.merchantbanking.ui.accountrouting;

/* loaded from: classes13.dex */
public final class AccountRoutingNumberViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.usecase.GetMerchantArnFeatureFlagUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.usecase.GetAccountRoutingNumberUseCase> getHighSpeedVideoFpsRanges;

    private AccountRoutingNumberViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.usecase.GetAccountRoutingNumberUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.usecase.GetMerchantArnFeatureFlagUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.usecase.GetAccountRoutingNumberUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.usecase.GetMerchantArnFeatureFlagUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase> provider3) {
        return new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel newInstance(com.paypal.oslo.feature.merchantbanking.domain.usecase.GetAccountRoutingNumberUseCase getAccountRoutingNumberUseCase, com.paypal.oslo.feature.merchantbanking.domain.usecase.GetMerchantArnFeatureFlagUseCase getMerchantArnFeatureFlagUseCase, com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase checkAccountRoutingEligibilityUseCase) {
        return new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel(getAccountRoutingNumberUseCase, getMerchantArnFeatureFlagUseCase, checkAccountRoutingEligibilityUseCase);
    }
}
