package com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/loanconstraints/LoanAmountConstraints;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "maxAmount", "minAmount", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "component2", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/loanconstraints/LoanAmountConstraints;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "getMaxAmount", "getMinAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LoanAmountConstraints {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money maxAmount;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money minAmount;

    public LoanAmountConstraints(com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money2, "");
        this.maxAmount = money;
        this.minAmount = money2;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getMaxAmount() {
        return this.maxAmount;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getMinAmount() {
        return this.minAmount;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money = this.maxAmount;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money2 = this.minAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LoanAmountConstraints(maxAmount=");
        sb.append(money);
        sb.append(", minAmount=");
        sb.append(money2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.maxAmount.hashCode() * 31) + this.minAmount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints loanAmountConstraints = (com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.maxAmount, loanAmountConstraints.maxAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.minAmount, loanAmountConstraints.minAmount);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints copy(com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money maxAmount, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money minAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minAmount, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints(maxAmount, minAmount);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getMinAmount() {
        return this.minAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getMaxAmount() {
        return this.maxAmount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints loanAmountConstraints, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            money = loanAmountConstraints.maxAmount;
        }
        if ((i & 2) != 0) {
            money2 = loanAmountConstraints.minAmount;
        }
        return loanAmountConstraints.copy(money, money2);
    }
}
