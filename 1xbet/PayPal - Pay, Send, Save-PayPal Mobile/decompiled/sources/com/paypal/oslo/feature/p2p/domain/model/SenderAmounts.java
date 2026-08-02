package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/SenderAmounts;", "", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "amountSent", "totalFee", "Lcom/paypal/oslo/feature/p2p/domain/model/FeeBreakdown;", "feeBreakdown", "totalAmountSent", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/Amount;Lcom/paypal/oslo/feature/p2p/domain/model/Amount;Lcom/paypal/oslo/feature/p2p/domain/model/FeeBreakdown;Lcom/paypal/oslo/feature/p2p/domain/model/Amount;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "component2", "component3", "()Lcom/paypal/oslo/feature/p2p/domain/model/FeeBreakdown;", "component4", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/Amount;Lcom/paypal/oslo/feature/p2p/domain/model/Amount;Lcom/paypal/oslo/feature/p2p/domain/model/FeeBreakdown;Lcom/paypal/oslo/feature/p2p/domain/model/Amount;)Lcom/paypal/oslo/feature/p2p/domain/model/SenderAmounts;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "getAmountSent", "getTotalFee", "Lcom/paypal/oslo/feature/p2p/domain/model/FeeBreakdown;", "getFeeBreakdown", "getTotalAmountSent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SenderAmounts {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.p2p.domain.model.Amount amountSent;
    private final com.paypal.oslo.feature.p2p.domain.model.FeeBreakdown feeBreakdown;
    private final com.paypal.oslo.feature.p2p.domain.model.Amount totalAmountSent;
    private final com.paypal.oslo.feature.p2p.domain.model.Amount totalFee;

    public SenderAmounts(com.paypal.oslo.feature.p2p.domain.model.Amount amount, com.paypal.oslo.feature.p2p.domain.model.Amount amount2, com.paypal.oslo.feature.p2p.domain.model.FeeBreakdown feeBreakdown, com.paypal.oslo.feature.p2p.domain.model.Amount amount3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feeBreakdown, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount3, "");
        this.amountSent = amount;
        this.totalFee = amount2;
        this.feeBreakdown = feeBreakdown;
        this.totalAmountSent = amount3;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.Amount getAmountSent() {
        return this.amountSent;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.Amount getTotalFee() {
        return this.totalFee;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.FeeBreakdown getFeeBreakdown() {
        return this.feeBreakdown;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.Amount getTotalAmountSent() {
        return this.totalAmountSent;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.p2p.domain.model.Amount amount = this.amountSent;
        com.paypal.oslo.feature.p2p.domain.model.Amount amount2 = this.totalFee;
        com.paypal.oslo.feature.p2p.domain.model.FeeBreakdown feeBreakdown = this.feeBreakdown;
        com.paypal.oslo.feature.p2p.domain.model.Amount amount3 = this.totalAmountSent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SenderAmounts(amountSent=");
        sb.append(amount);
        sb.append(", totalFee=");
        sb.append(amount2);
        sb.append(", feeBreakdown=");
        sb.append(feeBreakdown);
        sb.append(", totalAmountSent=");
        sb.append(amount3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.amountSent.hashCode() * 31) + this.totalFee.hashCode()) * 31) + this.feeBreakdown.hashCode()) * 31) + this.totalAmountSent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.SenderAmounts)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.model.SenderAmounts senderAmounts = (com.paypal.oslo.feature.p2p.domain.model.SenderAmounts) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amountSent, senderAmounts.amountSent) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalFee, senderAmounts.totalFee) && kotlin.jvm.internal.Intrinsics.areEqual(this.feeBreakdown, senderAmounts.feeBreakdown) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmountSent, senderAmounts.totalAmountSent);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.SenderAmounts copy(com.paypal.oslo.feature.p2p.domain.model.Amount amountSent, com.paypal.oslo.feature.p2p.domain.model.Amount totalFee, com.paypal.oslo.feature.p2p.domain.model.FeeBreakdown feeBreakdown, com.paypal.oslo.feature.p2p.domain.model.Amount totalAmountSent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountSent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalFee, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feeBreakdown, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmountSent, "");
        return new com.paypal.oslo.feature.p2p.domain.model.SenderAmounts(amountSent, totalFee, feeBreakdown, totalAmountSent);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.Amount getTotalAmountSent() {
        return this.totalAmountSent;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.FeeBreakdown getFeeBreakdown() {
        return this.feeBreakdown;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.Amount getTotalFee() {
        return this.totalFee;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.Amount getAmountSent() {
        return this.amountSent;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.SenderAmounts copy$default(com.paypal.oslo.feature.p2p.domain.model.SenderAmounts senderAmounts, com.paypal.oslo.feature.p2p.domain.model.Amount amount, com.paypal.oslo.feature.p2p.domain.model.Amount amount2, com.paypal.oslo.feature.p2p.domain.model.FeeBreakdown feeBreakdown, com.paypal.oslo.feature.p2p.domain.model.Amount amount3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            amount = senderAmounts.amountSent;
        }
        if ((i & 2) != 0) {
            amount2 = senderAmounts.totalFee;
        }
        if ((i & 4) != 0) {
            feeBreakdown = senderAmounts.feeBreakdown;
        }
        if ((i & 8) != 0) {
            amount3 = senderAmounts.totalAmountSent;
        }
        return senderAmounts.copy(amount, amount2, feeBreakdown, amount3);
    }
}
