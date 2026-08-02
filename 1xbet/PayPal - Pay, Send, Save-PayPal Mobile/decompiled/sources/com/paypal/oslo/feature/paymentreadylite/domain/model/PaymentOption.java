package com.paypal.oslo.feature.paymentreadylite.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentOption;", "", "", "type", "", "rank", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentOption;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getType", com.visa.cbp.getEncExpo.warmup, "getRank"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentOption {
    public static final int $stable = 0;
    private final int rank;
    private final java.lang.String type;

    public PaymentOption(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        this.rank = i;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final int getRank() {
        return this.rank;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.type;
        int i = this.rank;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentOption(type=");
        sb.append(str);
        sb.append(", rank=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.type.hashCode() * 31) + java.lang.Integer.hashCode(this.rank);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentOption)) {
            return false;
        }
        com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentOption paymentOption = (com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentOption) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, paymentOption.type) && this.rank == paymentOption.rank;
    }

    public final com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentOption copy(java.lang.String type, int rank) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentOption(type, rank);
    }

    /* renamed from: component2, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentOption copy$default(com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentOption paymentOption, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = paymentOption.type;
        }
        if ((i2 & 2) != 0) {
            i = paymentOption.rank;
        }
        return paymentOption.copy(str, i);
    }
}
