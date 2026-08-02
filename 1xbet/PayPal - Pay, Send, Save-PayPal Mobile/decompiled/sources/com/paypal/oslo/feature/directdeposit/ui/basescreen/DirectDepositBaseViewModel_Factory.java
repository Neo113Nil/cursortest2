package com.paypal.oslo.feature.directdeposit.ui.basescreen;

/* loaded from: classes12.dex */
public final class DirectDepositBaseViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.usecase.GetBankingBundleEligibilityUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.manager.DirectDepositFeatureManager> getHighSpeedVideoFpsRanges;

    private DirectDepositBaseViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.usecase.GetBankingBundleEligibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.manager.DirectDepositFeatureManager> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.usecase.GetBankingBundleEligibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.manager.DirectDepositFeatureManager> provider2) {
        return new com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel newInstance(com.paypal.oslo.feature.directdeposit.domain.usecase.GetBankingBundleEligibilityUseCase getBankingBundleEligibilityUseCase, com.paypal.oslo.feature.directdeposit.manager.DirectDepositFeatureManager directDepositFeatureManager) {
        return new com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel(getBankingBundleEligibilityUseCase, directDepositFeatureManager);
    }
}
