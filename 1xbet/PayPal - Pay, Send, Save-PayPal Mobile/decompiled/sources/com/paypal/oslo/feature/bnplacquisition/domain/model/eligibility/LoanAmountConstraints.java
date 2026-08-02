package com.paypal.oslo.feature.bnplacquisition.domain.model.eligibility;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/eligibility/LoanAmountConstraints;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "minAmount", "maxAmount", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "component2", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/eligibility/LoanAmountConstraints;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "getMinAmount", "getMaxAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LoanAmountConstraints {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money maxAmount;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money minAmount;

    public LoanAmountConstraints(com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money2) {
        this.minAmount = money;
        this.maxAmount = money2;
    }

    public /* synthetic */ LoanAmountConstraints(com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : money2);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getMinAmount() {
        return this.minAmount;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getMaxAmount() {
        return this.maxAmount;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money = this.minAmount;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money2 = this.maxAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LoanAmountConstraints(minAmount=");
        sb.append(money);
        sb.append(", maxAmount=");
        sb.append(money2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money = this.minAmount;
        int hashCode = money == null ? 0 : money.hashCode();
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money2 = this.maxAmount;
        return (hashCode * 31) + (money2 != null ? money2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.eligibility.LoanAmountConstraints)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.eligibility.LoanAmountConstraints loanAmountConstraints = (com.paypal.oslo.feature.bnplacquisition.domain.model.eligibility.LoanAmountConstraints) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.minAmount, loanAmountConstraints.minAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxAmount, loanAmountConstraints.maxAmount);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.eligibility.LoanAmountConstraints copy(com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money minAmount, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money maxAmount) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.eligibility.LoanAmountConstraints(minAmount, maxAmount);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getMaxAmount() {
        return this.maxAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getMinAmount() {
        return this.minAmount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.eligibility.LoanAmountConstraints copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.eligibility.LoanAmountConstraints loanAmountConstraints, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            money = loanAmountConstraints.minAmount;
        }
        if ((i & 2) != 0) {
            money2 = loanAmountConstraints.maxAmount;
        }
        return loanAmountConstraints.copy(money, money2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoanAmountConstraints() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
