package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/TransactionErrorToastManager;", "", "<init>", "()V", "", "errorCode", "", "showToast", "(Ljava/lang/String;)V", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/SharedFlow;", "toastEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "getToastEvents", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TransactionErrorToastManager {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.String> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.SharedFlow<java.lang.String> toastEvents;

    @javax.inject.Inject
    public TransactionErrorToastManager() {
        kotlinx.coroutines.flow.MutableSharedFlow<java.lang.String> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.getHighSpeedVideoSizes = MutableSharedFlow$default;
        this.toastEvents = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final kotlinx.coroutines.flow.SharedFlow<java.lang.String> getToastEvents() {
        return this.toastEvents;
    }

    public final void showToast(java.lang.String errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        this.getHighSpeedVideoSizes.tryEmit(errorCode);
    }
}
