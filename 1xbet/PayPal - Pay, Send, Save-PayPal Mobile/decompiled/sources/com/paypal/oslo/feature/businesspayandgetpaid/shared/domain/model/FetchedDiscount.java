package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/FetchedDiscount;", "", "Ljava/math/BigDecimal;", "percentage", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "amount", "<init>", "(Ljava/math/BigDecimal;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;)V", "component1", "()Ljava/math/BigDecimal;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "copy", "(Ljava/math/BigDecimal;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/FetchedDiscount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "getPercentage", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FetchedDiscount {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney amount;
    private final java.math.BigDecimal percentage;

    public FetchedDiscount(java.math.BigDecimal bigDecimal, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaidMoney, "");
        this.percentage = bigDecimal;
        this.amount = getPaidMoney;
    }

    public final java.math.BigDecimal getPercentage() {
        return this.percentage;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getAmount() {
        return this.amount;
    }

    public final java.lang.String toString() {
        java.math.BigDecimal bigDecimal = this.percentage;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney = this.amount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FetchedDiscount(percentage=");
        sb.append(bigDecimal);
        sb.append(", amount=");
        sb.append(getPaidMoney);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.math.BigDecimal bigDecimal = this.percentage;
        return ((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31) + this.amount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedDiscount)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedDiscount fetchedDiscount = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedDiscount) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.percentage, fetchedDiscount.percentage) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, fetchedDiscount.amount);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedDiscount copy(java.math.BigDecimal percentage, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedDiscount(percentage, amount);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.math.BigDecimal getPercentage() {
        return this.percentage;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedDiscount copy$default(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedDiscount fetchedDiscount, java.math.BigDecimal bigDecimal, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = fetchedDiscount.percentage;
        }
        if ((i & 2) != 0) {
            getPaidMoney = fetchedDiscount.amount;
        }
        return fetchedDiscount.copy(bigDecimal, getPaidMoney);
    }
}
