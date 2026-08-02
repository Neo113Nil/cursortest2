package com.paypal.oslo.feature.subscriptions.hub.domain;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/domain/LastPaymentInformation;", "", "", "paidDate", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/Balance;", "amount", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/Balance;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/Balance;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/Balance;)Lcom/paypal/oslo/feature/subscriptions/hub/domain/LastPaymentInformation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPaidDate", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/Balance;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LastPaymentInformation {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance amount;
    private final java.lang.String paidDate;

    public LastPaymentInformation(java.lang.String str, com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance balance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balance, "");
        this.paidDate = str;
        this.amount = balance;
    }

    public final java.lang.String getPaidDate() {
        return this.paidDate;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance getAmount() {
        return this.amount;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.paidDate;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance balance = this.amount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LastPaymentInformation(paidDate=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(balance);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.paidDate.hashCode() * 31) + this.amount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation lastPaymentInformation = (com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.paidDate, lastPaymentInformation.paidDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, lastPaymentInformation.amount);
    }

    public final com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation copy(java.lang.String paidDate, com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paidDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return new com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation(paidDate, amount);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPaidDate() {
        return this.paidDate;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation copy$default(com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation lastPaymentInformation, java.lang.String str, com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance balance, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = lastPaymentInformation.paidDate;
        }
        if ((i & 2) != 0) {
            balance = lastPaymentInformation.amount;
        }
        return lastPaymentInformation.copy(str, balance);
    }
}
