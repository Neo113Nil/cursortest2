package com.paypal.oslo.feature.bnplservicing.domain.model.autopay;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/CancelAutoPayResult;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "nextPaymentDueAmount", "", "nextPaymentDueDate", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/CancelAutoPayResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "getNextPaymentDueAmount", "Ljava/lang/String;", "getNextPaymentDueDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CancelAutoPayResult {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money nextPaymentDueAmount;
    private final java.lang.String nextPaymentDueDate;

    public CancelAutoPayResult(com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, java.lang.String str) {
        this.nextPaymentDueAmount = money;
        this.nextPaymentDueDate = str;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getNextPaymentDueAmount() {
        return this.nextPaymentDueAmount;
    }

    public final java.lang.String getNextPaymentDueDate() {
        return this.nextPaymentDueDate;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = this.nextPaymentDueAmount;
        java.lang.String str = this.nextPaymentDueDate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelAutoPayResult(nextPaymentDueAmount=");
        sb.append(money);
        sb.append(", nextPaymentDueDate=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = this.nextPaymentDueAmount;
        int hashCode = money == null ? 0 : money.hashCode();
        java.lang.String str = this.nextPaymentDueDate;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.autopay.CancelAutoPayResult)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.autopay.CancelAutoPayResult cancelAutoPayResult = (com.paypal.oslo.feature.bnplservicing.domain.model.autopay.CancelAutoPayResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.nextPaymentDueAmount, cancelAutoPayResult.nextPaymentDueAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.nextPaymentDueDate, cancelAutoPayResult.nextPaymentDueDate);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.autopay.CancelAutoPayResult copy(com.paypal.oslo.feature.bnplservicing.domain.model.common.Money nextPaymentDueAmount, java.lang.String nextPaymentDueDate) {
        return new com.paypal.oslo.feature.bnplservicing.domain.model.autopay.CancelAutoPayResult(nextPaymentDueAmount, nextPaymentDueDate);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNextPaymentDueDate() {
        return this.nextPaymentDueDate;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getNextPaymentDueAmount() {
        return this.nextPaymentDueAmount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.autopay.CancelAutoPayResult copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.autopay.CancelAutoPayResult cancelAutoPayResult, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            money = cancelAutoPayResult.nextPaymentDueAmount;
        }
        if ((i & 2) != 0) {
            str = cancelAutoPayResult.nextPaymentDueDate;
        }
        return cancelAutoPayResult.copy(money, str);
    }
}
