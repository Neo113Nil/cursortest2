package com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalObservePaymentUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/ObservePaymentUseCase;", "observePaymentUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/ObservePaymentUseCase;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;", "invoke", "()Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/ObservePaymentUseCase;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalObservePaymentUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.payment.ObservePaymentUseCase Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PayPalObservePaymentUseCase(com.paypal.oslo.feature.taptopay.domain.usecase.payment.ObservePaymentUseCase observePaymentUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observePaymentUseCase, "");
        this.Camera2StreamConfigurationMap = observePaymentUseCase;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState> invoke() {
        return this.Camera2StreamConfigurationMap.invoke();
    }
}
