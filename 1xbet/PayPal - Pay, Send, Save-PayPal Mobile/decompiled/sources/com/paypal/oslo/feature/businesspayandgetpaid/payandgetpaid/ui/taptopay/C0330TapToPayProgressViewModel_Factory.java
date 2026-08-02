package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

/* renamed from: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0330TapToPayProgressViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.CreatePurchaseUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.CreateZettleIntentUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ZettleDeviceCompatibilityUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ProcessZettleResultUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdatePurchaseUseCase> getHighSpeedVideoSizes;

    private C0330TapToPayProgressViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ZettleDeviceCompatibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.CreateZettleIntentUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ProcessZettleResultUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.CreatePurchaseUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdatePurchaseUseCase> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoSizes = provider5;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel get(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest) {
        return newInstance(paymentRequest, this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.C0330TapToPayProgressViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ZettleDeviceCompatibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.CreateZettleIntentUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ProcessZettleResultUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.CreatePurchaseUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdatePurchaseUseCase> provider5) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.C0330TapToPayProgressViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel newInstance(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ZettleDeviceCompatibilityUseCase zettleDeviceCompatibilityUseCase, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.CreateZettleIntentUseCase createZettleIntentUseCase, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ProcessZettleResultUseCase processZettleResultUseCase, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.CreatePurchaseUseCase createPurchaseUseCase, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdatePurchaseUseCase updatePurchaseUseCase) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel(paymentRequest, zettleDeviceCompatibilityUseCase, createZettleIntentUseCase, processZettleResultUseCase, createPurchaseUseCase, updatePurchaseUseCase);
    }
}
