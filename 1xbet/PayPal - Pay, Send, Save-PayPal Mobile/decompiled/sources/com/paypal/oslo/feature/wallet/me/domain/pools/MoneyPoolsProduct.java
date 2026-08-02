package com.paypal.oslo.feature.wallet.me.domain.pools;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0004\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u001a\u001a\u00020\u00198\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/pools/MoneyPoolsProduct;", "Lcom/paypal/oslo/feature/wallet/me/domain/Product;", "", "", "isEnrolled", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/paypal/oslo/feature/wallet/me/domain/pools/MoneyPoolsProduct;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/lang/String;", "getData", "Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;", "type", "Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;", "getType", "()Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class MoneyPoolsProduct implements com.paypal.oslo.feature.wallet.me.domain.Product<java.lang.Object> {
    public static final int $stable = 0;
    private final java.lang.String data;
    private final boolean isEnrolled;
    private final com.paypal.oslo.feature.wallet.me.domain.Product.Type type = com.paypal.oslo.feature.wallet.me.domain.Product.Type.MONEY_POOLS;

    public MoneyPoolsProduct(boolean z, java.lang.String str) {
        this.isEnrolled = z;
        this.data = str;
    }

    @Override // com.paypal.oslo.feature.wallet.me.domain.Product
    public final boolean isEnrolled() {
        return this.isEnrolled;
    }

    @Override // com.paypal.oslo.feature.wallet.me.domain.Product
    public final java.lang.Object getData() {
        return this.data;
    }

    @Override // com.paypal.oslo.feature.wallet.me.domain.Product
    public final com.paypal.oslo.feature.wallet.me.domain.Product.Type getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        boolean z = this.isEnrolled;
        java.lang.String str = this.data;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MoneyPoolsProduct(isEnrolled=");
        sb.append(z);
        sb.append(", data=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isEnrolled);
        java.lang.String str = this.data;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.me.domain.pools.MoneyPoolsProduct)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.me.domain.pools.MoneyPoolsProduct moneyPoolsProduct = (com.paypal.oslo.feature.wallet.me.domain.pools.MoneyPoolsProduct) other;
        return this.isEnrolled == moneyPoolsProduct.isEnrolled && kotlin.jvm.internal.Intrinsics.areEqual(this.data, moneyPoolsProduct.data);
    }

    public final com.paypal.oslo.feature.wallet.me.domain.pools.MoneyPoolsProduct copy(boolean isEnrolled, java.lang.String data) {
        return new com.paypal.oslo.feature.wallet.me.domain.pools.MoneyPoolsProduct(isEnrolled, data);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getData() {
        return this.data;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnrolled() {
        return this.isEnrolled;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.pools.MoneyPoolsProduct copy$default(com.paypal.oslo.feature.wallet.me.domain.pools.MoneyPoolsProduct moneyPoolsProduct, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = moneyPoolsProduct.isEnrolled;
        }
        if ((i & 2) != 0) {
            str = moneyPoolsProduct.data;
        }
        return moneyPoolsProduct.copy(z, str);
    }
}
