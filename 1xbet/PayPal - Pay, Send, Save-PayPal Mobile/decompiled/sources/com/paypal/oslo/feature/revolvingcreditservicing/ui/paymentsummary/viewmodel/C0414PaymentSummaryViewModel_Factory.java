package com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0414PaymentSummaryViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentSummaryUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryObservabilityMiddleware.Factory> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryReducer> getHighSpeedVideoSizesFor;

    private C0414PaymentSummaryViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentSummaryUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus> provider4, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryReducer> provider5, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryObservabilityMiddleware.Factory> provider6) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighSpeedVideoSizesFor = provider5;
        this.getHighSpeedVideoSizes = provider6;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentSummaryNavigationArgs paymentSummaryNavigationArgs) {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoSizes.get(), paymentSummaryNavigationArgs);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.C0414PaymentSummaryViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentSummaryUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus> provider4, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryReducer> provider5, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryObservabilityMiddleware.Factory> provider6) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.C0414PaymentSummaryViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentSummaryUseCase getPaymentSummaryUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase cancelRepaymentUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper paymentSummaryUiModelMapper, com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus dataInvalidationEventBus, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryReducer paymentSummaryReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryObservabilityMiddleware.Factory factory, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentSummaryNavigationArgs paymentSummaryNavigationArgs) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel(getPaymentSummaryUseCase, cancelRepaymentUseCase, paymentSummaryUiModelMapper, dataInvalidationEventBus, paymentSummaryReducer, factory, paymentSummaryNavigationArgs);
    }
}
