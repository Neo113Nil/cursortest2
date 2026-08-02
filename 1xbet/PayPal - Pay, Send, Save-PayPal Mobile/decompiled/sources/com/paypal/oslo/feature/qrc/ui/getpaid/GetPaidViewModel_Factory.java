package com.paypal.oslo.feature.qrc.ui.getpaid;

/* loaded from: classes14.dex */
public final class GetPaidViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.LoadPayPalLogoBitmapUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidReducer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.GenerateQrCodeUseCase> getHighSpeedVideoSizes;

    private GetPaidViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.GenerateQrCodeUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.LoadPayPalLogoBitmapUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.GenerateQrCodeUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.LoadPayPalLogoBitmapUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider4) {
        return new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel newInstance(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidReducer getPaidReducer, com.paypal.oslo.feature.qrc.domain.usecase.GenerateQrCodeUseCase generateQrCodeUseCase, com.paypal.oslo.feature.qrc.domain.usecase.LoadPayPalLogoBitmapUseCase loadPayPalLogoBitmapUseCase, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel(getPaidReducer, generateQrCodeUseCase, loadPayPalLogoBitmapUseCase, userStore);
    }
}
