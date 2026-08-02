package com.paypal.oslo.feature.taptopay.data.repository.payair;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/payair/PayairPaymentDataSource;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;", "state", "", "updateState", "(Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;)V", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/Flow;", "paymentFlow", "Lkotlinx/coroutines/flow/Flow;", "getPaymentFlow", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayairPaymentDataSource {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState> paymentFlow;

    @javax.inject.Inject
    public PayairPaymentDataSource() {
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 8, null, 5, null);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableSharedFlow$default;
        this.paymentFlow = MutableSharedFlow$default;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState> getPaymentFlow() {
        return this.paymentFlow;
    }

    public final void updateState(com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        this.getHighResolutionOutputSizeshNQ4ISI.tryEmit(state);
    }
}
