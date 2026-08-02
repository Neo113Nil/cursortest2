package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware;

/* loaded from: classes14.dex */
public final class CancelScheduledPaymentMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.CancelScheduledPaymentMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus> getHighSpeedVideoFpsRanges;

    private CancelScheduledPaymentMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.CancelScheduledPaymentMiddleware get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.CancelScheduledPaymentMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.CancelScheduledPaymentMiddleware_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.CancelScheduledPaymentMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase cancelRepaymentUseCase, com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus dataInvalidationEventBus) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.CancelScheduledPaymentMiddleware(cancelRepaymentUseCase, dataInvalidationEventBus);
    }
}
