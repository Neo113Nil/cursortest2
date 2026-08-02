package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

/* loaded from: classes13.dex */
public final class PaymentTypeAccordionViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdatePaymentTransferTypeUseCase> getHighSpeedVideoSizes;

    private PaymentTypeAccordionViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdatePaymentTransferTypeUseCase> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdatePaymentTransferTypeUseCase> provider2) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel newInstance(com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getPaymentTransferAttemptUseCase, com.paypal.oslo.feature.p2p.domain.usecase.UpdatePaymentTransferTypeUseCase updatePaymentTransferTypeUseCase) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel(getPaymentTransferAttemptUseCase, updatePaymentTransferTypeUseCase);
    }
}
