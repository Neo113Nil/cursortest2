package com.paypal.oslo.feature.wallet.fifo.transfer.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/AmountsBreakdown;", "", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "totalAmount", "netAmount", "totalFee", "<init>", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "component2", "component3", "copy", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/AmountsBreakdown;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getTotalAmount", "getNetAmount", "getTotalFee"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AmountsBreakdown {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.common.domain.model.Money netAmount;
    private final com.paypal.oslo.feature.wallet.common.domain.model.Money totalAmount;
    private final com.paypal.oslo.feature.wallet.common.domain.model.Money totalFee;

    public AmountsBreakdown(com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.common.domain.model.Money money2, com.paypal.oslo.feature.wallet.common.domain.model.Money money3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money3, "");
        this.totalAmount = money;
        this.netAmount = money2;
        this.totalFee = money3;
    }

    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getTotalAmount() {
        return this.totalAmount;
    }

    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getNetAmount() {
        return this.netAmount;
    }

    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getTotalFee() {
        return this.totalFee;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.totalAmount;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money2 = this.netAmount;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money3 = this.totalFee;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountsBreakdown(totalAmount=");
        sb.append(money);
        sb.append(", netAmount=");
        sb.append(money2);
        sb.append(", totalFee=");
        sb.append(money3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.totalAmount.hashCode() * 31) + this.netAmount.hashCode()) * 31) + this.totalFee.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.AmountsBreakdown)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.AmountsBreakdown amountsBreakdown = (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.AmountsBreakdown) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmount, amountsBreakdown.totalAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.netAmount, amountsBreakdown.netAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalFee, amountsBreakdown.totalFee);
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.AmountsBreakdown copy(com.paypal.oslo.feature.wallet.common.domain.model.Money totalAmount, com.paypal.oslo.feature.wallet.common.domain.model.Money netAmount, com.paypal.oslo.feature.wallet.common.domain.model.Money totalFee) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(netAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalFee, "");
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.AmountsBreakdown(totalAmount, netAmount, totalFee);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getTotalFee() {
        return this.totalFee;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getNetAmount() {
        return this.netAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getTotalAmount() {
        return this.totalAmount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.AmountsBreakdown copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.AmountsBreakdown amountsBreakdown, com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.common.domain.model.Money money2, com.paypal.oslo.feature.wallet.common.domain.model.Money money3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            money = amountsBreakdown.totalAmount;
        }
        if ((i & 2) != 0) {
            money2 = amountsBreakdown.netAmount;
        }
        if ((i & 4) != 0) {
            money3 = amountsBreakdown.totalFee;
        }
        return amountsBreakdown.copy(money, money2, money3);
    }
}
