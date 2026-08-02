package com.paypal.oslo.feature.savings.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/SavingsInterestData;", "", "Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;", "monthToDateInterest", "lifetimeInterest", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;", "component2", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;)Lcom/paypal/oslo/feature/savings/domain/model/SavingsInterestData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;", "getMonthToDateInterest", "getLifetimeInterest"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SavingsInterestData {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.savings.domain.model.MoneyData lifetimeInterest;
    private final com.paypal.oslo.feature.savings.domain.model.MoneyData monthToDateInterest;

    public SavingsInterestData(com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData, com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData2) {
        this.monthToDateInterest = moneyData;
        this.lifetimeInterest = moneyData2;
    }

    public final com.paypal.oslo.feature.savings.domain.model.MoneyData getMonthToDateInterest() {
        return this.monthToDateInterest;
    }

    public final com.paypal.oslo.feature.savings.domain.model.MoneyData getLifetimeInterest() {
        return this.lifetimeInterest;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData = this.monthToDateInterest;
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData2 = this.lifetimeInterest;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsInterestData(monthToDateInterest=");
        sb.append(moneyData);
        sb.append(", lifetimeInterest=");
        sb.append(moneyData2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData = this.monthToDateInterest;
        int hashCode = moneyData == null ? 0 : moneyData.hashCode();
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData2 = this.lifetimeInterest;
        return (hashCode * 31) + (moneyData2 != null ? moneyData2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.SavingsInterestData)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.SavingsInterestData savingsInterestData = (com.paypal.oslo.feature.savings.domain.model.SavingsInterestData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.monthToDateInterest, savingsInterestData.monthToDateInterest) && kotlin.jvm.internal.Intrinsics.areEqual(this.lifetimeInterest, savingsInterestData.lifetimeInterest);
    }

    public final com.paypal.oslo.feature.savings.domain.model.SavingsInterestData copy(com.paypal.oslo.feature.savings.domain.model.MoneyData monthToDateInterest, com.paypal.oslo.feature.savings.domain.model.MoneyData lifetimeInterest) {
        return new com.paypal.oslo.feature.savings.domain.model.SavingsInterestData(monthToDateInterest, lifetimeInterest);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.MoneyData getLifetimeInterest() {
        return this.lifetimeInterest;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.MoneyData getMonthToDateInterest() {
        return this.monthToDateInterest;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.SavingsInterestData copy$default(com.paypal.oslo.feature.savings.domain.model.SavingsInterestData savingsInterestData, com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData, com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            moneyData = savingsInterestData.monthToDateInterest;
        }
        if ((i & 2) != 0) {
            moneyData2 = savingsInterestData.lifetimeInterest;
        }
        return savingsInterestData.copy(moneyData, moneyData2);
    }
}
