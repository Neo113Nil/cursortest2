package com.paypal.oslo.feature.balance.domain.model.autoreload;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0003\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/autoreload/BalanceAutoTransfer;", "", "", "isActive", "", "currencyCode", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/paypal/oslo/feature/balance/domain/model/autoreload/BalanceAutoTransfer;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/lang/String;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BalanceAutoTransfer {
    public static final int $stable = 0;
    private final java.lang.String currencyCode;
    private final boolean isActive;

    public BalanceAutoTransfer(boolean z, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.isActive = z;
        this.currencyCode = str;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public /* synthetic */ BalanceAutoTransfer(boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String toString() {
        boolean z = this.isActive;
        java.lang.String str = this.currencyCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceAutoTransfer(isActive=");
        sb.append(z);
        sb.append(", currencyCode=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.isActive) * 31) + this.currencyCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.BalanceAutoTransfer)) {
            return false;
        }
        com.paypal.oslo.feature.balance.domain.model.autoreload.BalanceAutoTransfer balanceAutoTransfer = (com.paypal.oslo.feature.balance.domain.model.autoreload.BalanceAutoTransfer) other;
        return this.isActive == balanceAutoTransfer.isActive && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, balanceAutoTransfer.currencyCode);
    }

    public final com.paypal.oslo.feature.balance.domain.model.autoreload.BalanceAutoTransfer copy(boolean isActive, java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        return new com.paypal.oslo.feature.balance.domain.model.autoreload.BalanceAutoTransfer(isActive, currencyCode);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.domain.model.autoreload.BalanceAutoTransfer copy$default(com.paypal.oslo.feature.balance.domain.model.autoreload.BalanceAutoTransfer balanceAutoTransfer, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = balanceAutoTransfer.isActive;
        }
        if ((i & 2) != 0) {
            str = balanceAutoTransfer.currencyCode;
        }
        return balanceAutoTransfer.copy(z, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BalanceAutoTransfer() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
