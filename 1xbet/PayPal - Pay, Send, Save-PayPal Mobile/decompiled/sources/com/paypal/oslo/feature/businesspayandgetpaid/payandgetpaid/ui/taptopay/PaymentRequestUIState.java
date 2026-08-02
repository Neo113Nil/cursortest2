package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0003\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0004\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/PaymentRequestUIState;", "", "", "isTaxInclusive", "isTaxCalculatedAfterDiscount", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/PaymentRequestUIState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaymentRequestUIState {
    public static final int $stable = 0;
    private final boolean isTaxCalculatedAfterDiscount;
    private final boolean isTaxInclusive;

    public PaymentRequestUIState(boolean z, boolean z2) {
        this.isTaxInclusive = z;
        this.isTaxCalculatedAfterDiscount = z2;
    }

    public /* synthetic */ PaymentRequestUIState(boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2);
    }

    public final boolean isTaxInclusive() {
        return this.isTaxInclusive;
    }

    public final boolean isTaxCalculatedAfterDiscount() {
        return this.isTaxCalculatedAfterDiscount;
    }

    public final java.lang.String toString() {
        boolean z = this.isTaxInclusive;
        boolean z2 = this.isTaxCalculatedAfterDiscount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentRequestUIState(isTaxInclusive=");
        sb.append(z);
        sb.append(", isTaxCalculatedAfterDiscount=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.isTaxInclusive) * 31) + java.lang.Boolean.hashCode(this.isTaxCalculatedAfterDiscount);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestUIState)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestUIState paymentRequestUIState = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestUIState) other;
        return this.isTaxInclusive == paymentRequestUIState.isTaxInclusive && this.isTaxCalculatedAfterDiscount == paymentRequestUIState.isTaxCalculatedAfterDiscount;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestUIState copy(boolean isTaxInclusive, boolean isTaxCalculatedAfterDiscount) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestUIState(isTaxInclusive, isTaxCalculatedAfterDiscount);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsTaxCalculatedAfterDiscount() {
        return this.isTaxCalculatedAfterDiscount;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsTaxInclusive() {
        return this.isTaxInclusive;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestUIState copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestUIState paymentRequestUIState, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = paymentRequestUIState.isTaxInclusive;
        }
        if ((i & 2) != 0) {
            z2 = paymentRequestUIState.isTaxCalculatedAfterDiscount;
        }
        return paymentRequestUIState.copy(z, z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaymentRequestUIState() {
        this(r2, r2, 3, null);
        boolean z = false;
    }
}
