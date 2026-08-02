package com.paypal.oslo.feature.moneymovement.api.domain;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanFee;", "", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanFeeType;", "type", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "amount", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanFeeType;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanFeeType;", "component2", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanFeeType;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanFee;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanFeeType;", "getType", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PlanFee {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amount;
    private final com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType type;

    public PlanFee(com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType planFeeType, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planFeeType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount, "");
        this.type = planFeeType;
        this.amount = moneyAmount;
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType getType() {
        return this.type;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getAmount() {
        return this.amount;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType planFeeType = this.type;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.amount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanFee(type=");
        sb.append(planFeeType);
        sb.append(", amount=");
        sb.append(moneyAmount);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.type.hashCode() * 31) + this.amount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.domain.PlanFee)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.domain.PlanFee planFee = (com.paypal.oslo.feature.moneymovement.api.domain.PlanFee) other;
        return this.type == planFee.type && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, planFee.amount);
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.PlanFee copy(com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType type, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return new com.paypal.oslo.feature.moneymovement.api.domain.PlanFee(type, amount);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.domain.PlanFee copy$default(com.paypal.oslo.feature.moneymovement.api.domain.PlanFee planFee, com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType planFeeType, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            planFeeType = planFee.type;
        }
        if ((i & 2) != 0) {
            moneyAmount = planFee.amount;
        }
        return planFee.copy(planFeeType, moneyAmount);
    }
}
