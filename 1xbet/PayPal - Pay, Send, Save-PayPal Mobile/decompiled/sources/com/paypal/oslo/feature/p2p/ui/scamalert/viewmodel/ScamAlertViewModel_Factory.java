package com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel;

/* loaded from: classes13.dex */
public final class ScamAlertViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ResolvePaymentContingencyUseCase> getHighSpeedVideoSizes;

    private ScamAlertViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ResolvePaymentContingencyUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ResolvePaymentContingencyUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> provider2) {
        return new com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel newInstance(com.paypal.oslo.feature.p2p.domain.usecase.ResolvePaymentContingencyUseCase resolvePaymentContingencyUseCase, com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getPaymentTransferAttemptUseCase) {
        return new com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel(resolvePaymentContingencyUseCase, getPaymentTransferAttemptUseCase);
    }
}
