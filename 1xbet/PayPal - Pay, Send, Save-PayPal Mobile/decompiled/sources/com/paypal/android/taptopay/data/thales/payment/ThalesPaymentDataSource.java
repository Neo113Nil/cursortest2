package com.paypal.android.taptopay.data.thales.payment;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/payment/ThalesPaymentDataSource;", "", "<init>", "()V", "Lcom/paypal/android/taptopay/domain/model/payment/PaymentState;", "state", "", "updateState", "(Lcom/paypal/android/taptopay/domain/model/payment/PaymentState;)V", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/Flow;", "paymentFlow", "Lkotlinx/coroutines/flow/Flow;", "getPaymentFlow", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ThalesPaymentDataSource {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.android.taptopay.domain.model.payment.PaymentState> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.payment.PaymentState> paymentFlow;

    @javax.inject.Inject
    public ThalesPaymentDataSource() {
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.android.taptopay.domain.model.payment.PaymentState> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 8, null, 5, null);
        this.getHighSpeedVideoFpsRangesFor = MutableSharedFlow$default;
        this.paymentFlow = MutableSharedFlow$default;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.payment.PaymentState> getPaymentFlow() {
        return this.paymentFlow;
    }

    public final void updateState(com.paypal.android.taptopay.domain.model.payment.PaymentState state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        this.getHighSpeedVideoFpsRangesFor.tryEmit(state);
    }
}
