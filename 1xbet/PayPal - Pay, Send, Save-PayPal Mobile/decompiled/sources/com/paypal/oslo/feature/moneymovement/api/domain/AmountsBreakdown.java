package com.paypal.oslo.feature.moneymovement.api.domain;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JF\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/AmountsBreakdown;", "", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "totalAmount", "netAmount", "totalFee", "", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanFee;", "feeBreakdown", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Ljava/util/List;)Lcom/paypal/oslo/feature/moneymovement/api/domain/AmountsBreakdown;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "getTotalAmount", "getNetAmount", "getTotalFee", "Ljava/util/List;", "getFeeBreakdown"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AmountsBreakdown {
    public static final int $stable = 0;
    private final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanFee> feeBreakdown;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount netAmount;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount totalAmount;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount totalFee;

    public AmountsBreakdown(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount3, java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanFee> list) {
        this.totalAmount = moneyAmount;
        this.netAmount = moneyAmount2;
        this.totalFee = moneyAmount3;
        this.feeBreakdown = list;
    }

    public /* synthetic */ AmountsBreakdown(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount3, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : moneyAmount, (i & 2) != 0 ? null : moneyAmount2, (i & 4) != 0 ? null : moneyAmount3, (i & 8) != 0 ? null : list);
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getTotalAmount() {
        return this.totalAmount;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getNetAmount() {
        return this.netAmount;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getTotalFee() {
        return this.totalFee;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanFee> getFeeBreakdown() {
        return this.feeBreakdown;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.totalAmount;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2 = this.netAmount;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount3 = this.totalFee;
        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanFee> list = this.feeBreakdown;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountsBreakdown(totalAmount=");
        sb.append(moneyAmount);
        sb.append(", netAmount=");
        sb.append(moneyAmount2);
        sb.append(", totalFee=");
        sb.append(moneyAmount3);
        sb.append(", feeBreakdown=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.totalAmount;
        int hashCode = moneyAmount == null ? 0 : moneyAmount.hashCode();
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2 = this.netAmount;
        int hashCode2 = moneyAmount2 == null ? 0 : moneyAmount2.hashCode();
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount3 = this.totalFee;
        int hashCode3 = moneyAmount3 == null ? 0 : moneyAmount3.hashCode();
        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanFee> list = this.feeBreakdown;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown amountsBreakdown = (com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmount, amountsBreakdown.totalAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.netAmount, amountsBreakdown.netAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalFee, amountsBreakdown.totalFee) && kotlin.jvm.internal.Intrinsics.areEqual(this.feeBreakdown, amountsBreakdown.feeBreakdown);
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown copy(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount totalAmount, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount netAmount, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount totalFee, java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanFee> feeBreakdown) {
        return new com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown(totalAmount, netAmount, totalFee, feeBreakdown);
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanFee> component4() {
        return this.feeBreakdown;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getTotalFee() {
        return this.totalFee;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getNetAmount() {
        return this.netAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown copy$default(com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown amountsBreakdown, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount3, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            moneyAmount = amountsBreakdown.totalAmount;
        }
        if ((i & 2) != 0) {
            moneyAmount2 = amountsBreakdown.netAmount;
        }
        if ((i & 4) != 0) {
            moneyAmount3 = amountsBreakdown.totalFee;
        }
        if ((i & 8) != 0) {
            list = amountsBreakdown.feeBreakdown;
        }
        return amountsBreakdown.copy(moneyAmount, moneyAmount2, moneyAmount3, list);
    }

    public AmountsBreakdown() {
        this(null, null, null, null, 15, null);
    }
}
