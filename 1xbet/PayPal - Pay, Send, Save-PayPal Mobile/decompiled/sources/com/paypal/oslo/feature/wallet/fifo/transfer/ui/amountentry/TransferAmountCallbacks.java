package com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJF\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/amountentry/TransferAmountCallbacks;", "", "Lkotlin/Function1;", "", "", "onAmountChange", "Lkotlin/Function0;", "onCloseClick", "onContinue", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lkotlin/jvm/functions/Function1;", "component2", "()Lkotlin/jvm/functions/Function0;", "component3", "copy", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/amountentry/TransferAmountCallbacks;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "getOnAmountChange", "Lkotlin/jvm/functions/Function0;", "getOnCloseClick", "getOnContinue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TransferAmountCallbacks {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onAmountChange;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onCloseClick;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onContinue;

    /* JADX WARN: Multi-variable type inference failed */
    public TransferAmountCallbacks(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        this.onAmountChange = function1;
        this.onCloseClick = function0;
        this.onContinue = function02;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnAmountChange() {
        return this.onAmountChange;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnCloseClick() {
        return this.onCloseClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnContinue() {
        return this.onContinue;
    }

    public final java.lang.String toString() {
        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.onAmountChange;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onCloseClick;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.onContinue;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferAmountCallbacks(onAmountChange=");
        sb.append(function1);
        sb.append(", onCloseClick=");
        sb.append(function0);
        sb.append(", onContinue=");
        sb.append(function02);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.onAmountChange.hashCode() * 31) + this.onCloseClick.hashCode()) * 31) + this.onContinue.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountCallbacks)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountCallbacks transferAmountCallbacks = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountCallbacks) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.onAmountChange, transferAmountCallbacks.onAmountChange) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCloseClick, transferAmountCallbacks.onCloseClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.onContinue, transferAmountCallbacks.onContinue);
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountCallbacks copy(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onAmountChange, kotlin.jvm.functions.Function0<kotlin.Unit> onCloseClick, kotlin.jvm.functions.Function0<kotlin.Unit> onContinue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onAmountChange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCloseClick, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onContinue, "");
        return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountCallbacks(onAmountChange, onCloseClick, onContinue);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
        return this.onContinue;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
        return this.onCloseClick;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> component1() {
        return this.onAmountChange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountCallbacks copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountCallbacks transferAmountCallbacks, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = transferAmountCallbacks.onAmountChange;
        }
        if ((i & 2) != 0) {
            function0 = transferAmountCallbacks.onCloseClick;
        }
        if ((i & 4) != 0) {
            function02 = transferAmountCallbacks.onContinue;
        }
        return transferAmountCallbacks.copy(function1, function0, function02);
    }
}
