package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui;

/* loaded from: classes11.dex */
public final class PayAndGetPaidViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ZettleDeviceCompatibilityUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.api.domain.usecase.GetPayGetPaidVerificationStatusUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.InitializeZettleUseCase> getHighSpeedVideoSizes;

    private PayAndGetPaidViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.api.domain.usecase.GetPayGetPaidVerificationStatusUseCase> provider, dagger.internal.Provider<android.content.Context> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.InitializeZettleUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ZettleDeviceCompatibilityUseCase> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.api.domain.usecase.GetPayGetPaidVerificationStatusUseCase> provider, dagger.internal.Provider<android.content.Context> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.InitializeZettleUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ZettleDeviceCompatibilityUseCase> provider4) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel newInstance(com.paypal.oslo.feature.businesshome.api.domain.usecase.GetPayGetPaidVerificationStatusUseCase getPayGetPaidVerificationStatusUseCase, android.content.Context context, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.InitializeZettleUseCase initializeZettleUseCase, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ZettleDeviceCompatibilityUseCase zettleDeviceCompatibilityUseCase) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel(getPayGetPaidVerificationStatusUseCase, context, initializeZettleUseCase, zettleDeviceCompatibilityUseCase);
    }
}
