package com.paypal.oslo.feature.savings.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/SavingsAccountEligibility;", "", "Lcom/paypal/oslo/feature/savings/domain/model/ProductSubscription;", "savingsProductSubscription", "Lcom/paypal/oslo/feature/savings/domain/model/CashPlusProductSubscription;", "cashPlusProductSubscription", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/ProductSubscription;Lcom/paypal/oslo/feature/savings/domain/model/CashPlusProductSubscription;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/ProductSubscription;", "component2", "()Lcom/paypal/oslo/feature/savings/domain/model/CashPlusProductSubscription;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/ProductSubscription;Lcom/paypal/oslo/feature/savings/domain/model/CashPlusProductSubscription;)Lcom/paypal/oslo/feature/savings/domain/model/SavingsAccountEligibility;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/ProductSubscription;", "getSavingsProductSubscription", "Lcom/paypal/oslo/feature/savings/domain/model/CashPlusProductSubscription;", "getCashPlusProductSubscription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SavingsAccountEligibility {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.savings.domain.model.CashPlusProductSubscription cashPlusProductSubscription;
    private final com.paypal.oslo.feature.savings.domain.model.ProductSubscription savingsProductSubscription;

    public SavingsAccountEligibility(com.paypal.oslo.feature.savings.domain.model.ProductSubscription productSubscription, com.paypal.oslo.feature.savings.domain.model.CashPlusProductSubscription cashPlusProductSubscription) {
        this.savingsProductSubscription = productSubscription;
        this.cashPlusProductSubscription = cashPlusProductSubscription;
    }

    public final com.paypal.oslo.feature.savings.domain.model.ProductSubscription getSavingsProductSubscription() {
        return this.savingsProductSubscription;
    }

    public final com.paypal.oslo.feature.savings.domain.model.CashPlusProductSubscription getCashPlusProductSubscription() {
        return this.cashPlusProductSubscription;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.savings.domain.model.ProductSubscription productSubscription = this.savingsProductSubscription;
        com.paypal.oslo.feature.savings.domain.model.CashPlusProductSubscription cashPlusProductSubscription = this.cashPlusProductSubscription;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsAccountEligibility(savingsProductSubscription=");
        sb.append(productSubscription);
        sb.append(", cashPlusProductSubscription=");
        sb.append(cashPlusProductSubscription);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.savings.domain.model.ProductSubscription productSubscription = this.savingsProductSubscription;
        int hashCode = productSubscription == null ? 0 : productSubscription.hashCode();
        com.paypal.oslo.feature.savings.domain.model.CashPlusProductSubscription cashPlusProductSubscription = this.cashPlusProductSubscription;
        return (hashCode * 31) + (cashPlusProductSubscription != null ? cashPlusProductSubscription.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.SavingsAccountEligibility)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.SavingsAccountEligibility savingsAccountEligibility = (com.paypal.oslo.feature.savings.domain.model.SavingsAccountEligibility) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.savingsProductSubscription, savingsAccountEligibility.savingsProductSubscription) && kotlin.jvm.internal.Intrinsics.areEqual(this.cashPlusProductSubscription, savingsAccountEligibility.cashPlusProductSubscription);
    }

    public final com.paypal.oslo.feature.savings.domain.model.SavingsAccountEligibility copy(com.paypal.oslo.feature.savings.domain.model.ProductSubscription savingsProductSubscription, com.paypal.oslo.feature.savings.domain.model.CashPlusProductSubscription cashPlusProductSubscription) {
        return new com.paypal.oslo.feature.savings.domain.model.SavingsAccountEligibility(savingsProductSubscription, cashPlusProductSubscription);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.CashPlusProductSubscription getCashPlusProductSubscription() {
        return this.cashPlusProductSubscription;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.ProductSubscription getSavingsProductSubscription() {
        return this.savingsProductSubscription;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.SavingsAccountEligibility copy$default(com.paypal.oslo.feature.savings.domain.model.SavingsAccountEligibility savingsAccountEligibility, com.paypal.oslo.feature.savings.domain.model.ProductSubscription productSubscription, com.paypal.oslo.feature.savings.domain.model.CashPlusProductSubscription cashPlusProductSubscription, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            productSubscription = savingsAccountEligibility.savingsProductSubscription;
        }
        if ((i & 2) != 0) {
            cashPlusProductSubscription = savingsAccountEligibility.cashPlusProductSubscription;
        }
        return savingsAccountEligibility.copy(productSubscription, cashPlusProductSubscription);
    }
}
