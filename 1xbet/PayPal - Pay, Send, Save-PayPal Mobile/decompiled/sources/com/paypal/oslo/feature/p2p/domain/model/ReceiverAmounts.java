package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverAmounts;", "", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "amountReceived", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/Amount;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/Amount;)Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverAmounts;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "getAmountReceived"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ReceiverAmounts {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.p2p.domain.model.Amount amountReceived;

    public ReceiverAmounts(com.paypal.oslo.feature.p2p.domain.model.Amount amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        this.amountReceived = amount;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.Amount getAmountReceived() {
        return this.amountReceived;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.p2p.domain.model.Amount amount = this.amountReceived;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReceiverAmounts(amountReceived=");
        sb.append(amount);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.amountReceived.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.p2p.domain.model.ReceiverAmounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountReceived, ((com.paypal.oslo.feature.p2p.domain.model.ReceiverAmounts) other).amountReceived);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.ReceiverAmounts copy(com.paypal.oslo.feature.p2p.domain.model.Amount amountReceived) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountReceived, "");
        return new com.paypal.oslo.feature.p2p.domain.model.ReceiverAmounts(amountReceived);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.Amount getAmountReceived() {
        return this.amountReceived;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ReceiverAmounts copy$default(com.paypal.oslo.feature.p2p.domain.model.ReceiverAmounts receiverAmounts, com.paypal.oslo.feature.p2p.domain.model.Amount amount, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            amount = receiverAmounts.amountReceived;
        }
        return receiverAmounts.copy(amount);
    }
}
