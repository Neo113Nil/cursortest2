package com.paypal.oslo.feature.p2p.ui.claim.viewmodel;

/* loaded from: classes13.dex */
public final class ClaimPreviewViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.claim.viewmodel.ClaimPreviewViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ClaimMoneyUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferUseCase> getHighSpeedVideoFpsRangesFor;

    private ClaimPreviewViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ClaimMoneyUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.claim.viewmodel.ClaimPreviewViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.p2p.ui.claim.viewmodel.ClaimPreviewViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ClaimMoneyUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider3) {
        return new com.paypal.oslo.feature.p2p.ui.claim.viewmodel.ClaimPreviewViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.p2p.ui.claim.viewmodel.ClaimPreviewViewModel newInstance(com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferUseCase getPaymentTransferUseCase, com.paypal.oslo.feature.p2p.domain.usecase.ClaimMoneyUseCase claimMoneyUseCase, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.p2p.ui.claim.viewmodel.ClaimPreviewViewModel(getPaymentTransferUseCase, claimMoneyUseCase, userStore);
    }
}
