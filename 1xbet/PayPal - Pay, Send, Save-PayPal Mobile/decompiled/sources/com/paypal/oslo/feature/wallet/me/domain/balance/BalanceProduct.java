package com.paypal.oslo.feature.wallet.me.domain.balance;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u0004\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u001d\u001a\u00020\u001c8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/balance/BalanceProduct;", "Lcom/paypal/oslo/feature/wallet/me/domain/Product;", "Lcom/paypal/oslo/feature/wallet/me/domain/balance/BalanceOverview;", "", "isEnrolled", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(ZLcom/paypal/oslo/feature/wallet/me/domain/balance/BalanceOverview;)V", "isCipEligible", "()Z", "component1", "component2", "()Lcom/paypal/oslo/feature/wallet/me/domain/balance/BalanceOverview;", "copy", "(ZLcom/paypal/oslo/feature/wallet/me/domain/balance/BalanceOverview;)Lcom/paypal/oslo/feature/wallet/me/domain/balance/BalanceProduct;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Lcom/paypal/oslo/feature/wallet/me/domain/balance/BalanceOverview;", "getData", "Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;", "type", "Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;", "getType", "()Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class BalanceProduct implements com.paypal.oslo.feature.wallet.me.domain.Product<com.paypal.oslo.feature.wallet.me.domain.balance.BalanceOverview> {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.me.domain.balance.BalanceOverview data;
    private final boolean isEnrolled;
    private final com.paypal.oslo.feature.wallet.me.domain.Product.Type type = com.paypal.oslo.feature.wallet.me.domain.Product.Type.BALANCE;

    public BalanceProduct(boolean z, com.paypal.oslo.feature.wallet.me.domain.balance.BalanceOverview balanceOverview) {
        this.isEnrolled = z;
        this.data = balanceOverview;
    }

    @Override // com.paypal.oslo.feature.wallet.me.domain.Product
    public final boolean isEnrolled() {
        return this.isEnrolled;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.paypal.oslo.feature.wallet.me.domain.Product
    public final com.paypal.oslo.feature.wallet.me.domain.balance.BalanceOverview getData() {
        return this.data;
    }

    @Override // com.paypal.oslo.feature.wallet.me.domain.Product
    public final com.paypal.oslo.feature.wallet.me.domain.Product.Type getType() {
        return this.type;
    }

    public final boolean isCipEligible() {
        com.paypal.oslo.feature.wallet.me.domain.balance.BalanceOverview data = getData();
        if (data != null) {
            return data.getPrepaidStatus();
        }
        return false;
    }

    public final java.lang.String toString() {
        boolean z = this.isEnrolled;
        com.paypal.oslo.feature.wallet.me.domain.balance.BalanceOverview balanceOverview = this.data;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceProduct(isEnrolled=");
        sb.append(z);
        sb.append(", data=");
        sb.append(balanceOverview);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isEnrolled);
        com.paypal.oslo.feature.wallet.me.domain.balance.BalanceOverview balanceOverview = this.data;
        return (hashCode * 31) + (balanceOverview == null ? 0 : balanceOverview.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.me.domain.balance.BalanceProduct)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.me.domain.balance.BalanceProduct balanceProduct = (com.paypal.oslo.feature.wallet.me.domain.balance.BalanceProduct) other;
        return this.isEnrolled == balanceProduct.isEnrolled && kotlin.jvm.internal.Intrinsics.areEqual(this.data, balanceProduct.data);
    }

    public final com.paypal.oslo.feature.wallet.me.domain.balance.BalanceProduct copy(boolean isEnrolled, com.paypal.oslo.feature.wallet.me.domain.balance.BalanceOverview data) {
        return new com.paypal.oslo.feature.wallet.me.domain.balance.BalanceProduct(isEnrolled, data);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.me.domain.balance.BalanceOverview getData() {
        return this.data;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnrolled() {
        return this.isEnrolled;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.balance.BalanceProduct copy$default(com.paypal.oslo.feature.wallet.me.domain.balance.BalanceProduct balanceProduct, boolean z, com.paypal.oslo.feature.wallet.me.domain.balance.BalanceOverview balanceOverview, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = balanceProduct.isEnrolled;
        }
        if ((i & 2) != 0) {
            balanceOverview = balanceProduct.data;
        }
        return balanceProduct.copy(z, balanceOverview);
    }
}
