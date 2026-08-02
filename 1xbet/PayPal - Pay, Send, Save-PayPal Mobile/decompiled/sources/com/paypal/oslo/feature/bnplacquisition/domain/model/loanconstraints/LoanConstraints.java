package com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/loanconstraints/LoanConstraints;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/loanconstraints/LoanAmountConstraints;", "loanAmountConstraints", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/spendingpower/SpendingPower;", "spendingPower", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/loanconstraints/LoanAmountConstraints;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/spendingpower/SpendingPower;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/loanconstraints/LoanAmountConstraints;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/spendingpower/SpendingPower;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/loanconstraints/LoanAmountConstraints;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/spendingpower/SpendingPower;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/loanconstraints/LoanConstraints;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/loanconstraints/LoanAmountConstraints;", "getLoanAmountConstraints", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/spendingpower/SpendingPower;", "getSpendingPower"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LoanConstraints {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints loanAmountConstraints;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.spendingpower.SpendingPower spendingPower;

    public LoanConstraints(com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints loanAmountConstraints, com.paypal.oslo.feature.bnplacquisition.domain.model.spendingpower.SpendingPower spendingPower) {
        this.loanAmountConstraints = loanAmountConstraints;
        this.spendingPower = spendingPower;
    }

    public /* synthetic */ LoanConstraints(com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints loanAmountConstraints, com.paypal.oslo.feature.bnplacquisition.domain.model.spendingpower.SpendingPower spendingPower, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(loanAmountConstraints, (i & 2) != 0 ? null : spendingPower);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints getLoanAmountConstraints() {
        return this.loanAmountConstraints;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.spendingpower.SpendingPower getSpendingPower() {
        return this.spendingPower;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints loanAmountConstraints = this.loanAmountConstraints;
        com.paypal.oslo.feature.bnplacquisition.domain.model.spendingpower.SpendingPower spendingPower = this.spendingPower;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LoanConstraints(loanAmountConstraints=");
        sb.append(loanAmountConstraints);
        sb.append(", spendingPower=");
        sb.append(spendingPower);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints loanAmountConstraints = this.loanAmountConstraints;
        int hashCode = loanAmountConstraints == null ? 0 : loanAmountConstraints.hashCode();
        com.paypal.oslo.feature.bnplacquisition.domain.model.spendingpower.SpendingPower spendingPower = this.spendingPower;
        return (hashCode * 31) + (spendingPower != null ? spendingPower.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanConstraints)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanConstraints loanConstraints = (com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanConstraints) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.loanAmountConstraints, loanConstraints.loanAmountConstraints) && kotlin.jvm.internal.Intrinsics.areEqual(this.spendingPower, loanConstraints.spendingPower);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanConstraints copy(com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints loanAmountConstraints, com.paypal.oslo.feature.bnplacquisition.domain.model.spendingpower.SpendingPower spendingPower) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanConstraints(loanAmountConstraints, spendingPower);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.spendingpower.SpendingPower getSpendingPower() {
        return this.spendingPower;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints getLoanAmountConstraints() {
        return this.loanAmountConstraints;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanConstraints copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanConstraints loanConstraints, com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints loanAmountConstraints, com.paypal.oslo.feature.bnplacquisition.domain.model.spendingpower.SpendingPower spendingPower, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            loanAmountConstraints = loanConstraints.loanAmountConstraints;
        }
        if ((i & 2) != 0) {
            spendingPower = loanConstraints.spendingPower;
        }
        return loanConstraints.copy(loanAmountConstraints, spendingPower);
    }
}
