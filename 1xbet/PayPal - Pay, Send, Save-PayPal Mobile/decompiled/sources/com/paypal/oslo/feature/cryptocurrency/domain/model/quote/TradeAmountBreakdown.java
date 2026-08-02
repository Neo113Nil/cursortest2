package com.paypal.oslo.feature.cryptocurrency.domain.model.quote;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/quote/TradeAmountBreakdown;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;", "baseAmount", "totalAmount", "totalFee", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;", "component2", "component3", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/quote/TradeAmountBreakdown;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;", "getBaseAmount", "getTotalAmount", "getTotalFee"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TradeAmountBreakdown {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money baseAmount;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money totalAmount;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money totalFee;

    public TradeAmountBreakdown(com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money2, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money3, "");
        this.baseAmount = money;
        this.totalAmount = money2;
        this.totalFee = money3;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money getBaseAmount() {
        return this.baseAmount;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money getTotalAmount() {
        return this.totalAmount;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money getTotalFee() {
        return this.totalFee;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money = this.baseAmount;
        com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money2 = this.totalAmount;
        com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money3 = this.totalFee;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TradeAmountBreakdown(baseAmount=");
        sb.append(money);
        sb.append(", totalAmount=");
        sb.append(money2);
        sb.append(", totalFee=");
        sb.append(money3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.baseAmount.hashCode() * 31) + this.totalAmount.hashCode()) * 31) + this.totalFee.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.quote.TradeAmountBreakdown)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.quote.TradeAmountBreakdown tradeAmountBreakdown = (com.paypal.oslo.feature.cryptocurrency.domain.model.quote.TradeAmountBreakdown) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.baseAmount, tradeAmountBreakdown.baseAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmount, tradeAmountBreakdown.totalAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalFee, tradeAmountBreakdown.totalFee);
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.quote.TradeAmountBreakdown copy(com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money baseAmount, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money totalAmount, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money totalFee) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalFee, "");
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.quote.TradeAmountBreakdown(baseAmount, totalAmount, totalFee);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money getTotalFee() {
        return this.totalFee;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money getTotalAmount() {
        return this.totalAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money getBaseAmount() {
        return this.baseAmount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.quote.TradeAmountBreakdown copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.quote.TradeAmountBreakdown tradeAmountBreakdown, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money2, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            money = tradeAmountBreakdown.baseAmount;
        }
        if ((i & 2) != 0) {
            money2 = tradeAmountBreakdown.totalAmount;
        }
        if ((i & 4) != 0) {
            money3 = tradeAmountBreakdown.totalFee;
        }
        return tradeAmountBreakdown.copy(money, money2, money3);
    }
}
