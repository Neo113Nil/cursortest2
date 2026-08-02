package com.paypal.oslo.feature.qrc.ui.enteramount;

/* loaded from: classes14.dex */
public final class EnterAmountViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.CancelQrCodePaymentUseCase> getHighSpeedVideoFpsRangesFor;

    private EnterAmountViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.CancelQrCodePaymentUseCase> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.CancelQrCodePaymentUseCase> provider2) {
        return new com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountViewModel newInstance(com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountReducer enterAmountReducer, com.paypal.oslo.feature.qrc.domain.usecase.CancelQrCodePaymentUseCase cancelQrCodePaymentUseCase) {
        return new com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountViewModel(enterAmountReducer, cancelQrCodePaymentUseCase);
    }
}
