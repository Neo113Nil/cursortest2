package com.paypal.android.taptopay.domain.usecase.payment;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/android/taptopay/domain/usecase/payment/ObservePaymentUseCase;", "", "Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepository;", "paymentRepository", "<init>", "(Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepository;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState;", "invoke", "()Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "Lcom/paypal/android/taptopay/domain/repository/payment/PaymentRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ObservePaymentUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.repository.payment.PaymentRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ObservePaymentUseCase(com.paypal.android.taptopay.domain.repository.payment.PaymentRepository paymentRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = paymentRepository;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.payment.PaymentState> invoke() {
        return this.getHighResolutionOutputSizeshNQ4ISI.observePayment();
    }
}
