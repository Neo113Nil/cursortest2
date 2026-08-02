package com.paypal.android.taptopay.domain.repository.payment;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/android/taptopay/domain/repository/payment/PPBalance;", "", "", "amount", "", "currency", "<init>", "(DLjava/lang/String;)V", "component1", "()D", "component2", "()Ljava/lang/String;", "copy", "(DLjava/lang/String;)Lcom/paypal/android/taptopay/domain/repository/payment/PPBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "D", "getAmount", "Ljava/lang/String;", "getCurrency"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PPBalance {
    private final double amount;
    private final java.lang.String currency;

    public PPBalance(double d, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.amount = d;
        this.currency = str;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final java.lang.String getCurrency() {
        return this.currency;
    }

    public final java.lang.String toString() {
        double d = this.amount;
        java.lang.String str = this.currency;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PPBalance(amount=");
        sb.append(d);
        sb.append(", currency=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Double.hashCode(this.amount) * 31) + this.currency.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.taptopay.domain.repository.payment.PPBalance)) {
            return false;
        }
        com.paypal.android.taptopay.domain.repository.payment.PPBalance pPBalance = (com.paypal.android.taptopay.domain.repository.payment.PPBalance) other;
        return java.lang.Double.compare(this.amount, pPBalance.amount) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.currency, pPBalance.currency);
    }

    public final com.paypal.android.taptopay.domain.repository.payment.PPBalance copy(double amount, java.lang.String currency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        return new com.paypal.android.taptopay.domain.repository.payment.PPBalance(amount, currency);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrency() {
        return this.currency;
    }

    /* renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.paypal.android.taptopay.domain.repository.payment.PPBalance copy$default(com.paypal.android.taptopay.domain.repository.payment.PPBalance pPBalance, double d, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = pPBalance.amount;
        }
        if ((i & 2) != 0) {
            str = pPBalance.currency;
        }
        return pPBalance.copy(d, str);
    }
}
