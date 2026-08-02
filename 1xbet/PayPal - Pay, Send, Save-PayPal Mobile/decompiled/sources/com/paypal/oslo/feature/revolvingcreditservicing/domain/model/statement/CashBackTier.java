package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/CashBackTier;", "", "", "percentage", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "earnedAmount", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/CashBackTier;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPercentage", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getEarnedAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CashBackTier {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount earnedAmount;
    private final java.lang.String percentage;

    public CashBackTier(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount, "");
        this.percentage = str;
        this.earnedAmount = currencyAmount;
    }

    public final java.lang.String getPercentage() {
        return this.percentage;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getEarnedAmount() {
        return this.earnedAmount;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.percentage;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.earnedAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CashBackTier(percentage=");
        sb.append(str);
        sb.append(", earnedAmount=");
        sb.append(currencyAmount);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.percentage.hashCode() * 31) + this.earnedAmount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.CashBackTier)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.CashBackTier cashBackTier = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.CashBackTier) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.percentage, cashBackTier.percentage) && kotlin.jvm.internal.Intrinsics.areEqual(this.earnedAmount, cashBackTier.earnedAmount);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.CashBackTier copy(java.lang.String percentage, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount earnedAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percentage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(earnedAmount, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.CashBackTier(percentage, earnedAmount);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getEarnedAmount() {
        return this.earnedAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPercentage() {
        return this.percentage;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.CashBackTier copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.CashBackTier cashBackTier, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cashBackTier.percentage;
        }
        if ((i & 2) != 0) {
            currencyAmount = cashBackTier.earnedAmount;
        }
        return cashBackTier.copy(str, currencyAmount);
    }
}
