package com.paypal.oslo.feature.wallet.me.domain.savings;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0004\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u001b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsProduct;", "Lcom/paypal/oslo/feature/wallet/me/domain/Product;", "Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsOverview;", "", "isEnrolled", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(ZLcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsOverview;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsOverview;", "copy", "(ZLcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsOverview;)Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsProduct;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsOverview;", "getData", "Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;", "type", "Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;", "getType", "()Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SavingsProduct implements com.paypal.oslo.feature.wallet.me.domain.Product<com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview data;
    private final boolean isEnrolled;
    private final com.paypal.oslo.feature.wallet.me.domain.Product.Type type = com.paypal.oslo.feature.wallet.me.domain.Product.Type.SAVINGS;

    public SavingsProduct(boolean z, com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview savingsOverview) {
        this.isEnrolled = z;
        this.data = savingsOverview;
    }

    @Override // com.paypal.oslo.feature.wallet.me.domain.Product
    public final boolean isEnrolled() {
        return this.isEnrolled;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.paypal.oslo.feature.wallet.me.domain.Product
    public final com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview getData() {
        return this.data;
    }

    @Override // com.paypal.oslo.feature.wallet.me.domain.Product
    public final com.paypal.oslo.feature.wallet.me.domain.Product.Type getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        boolean z = this.isEnrolled;
        com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview savingsOverview = this.data;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsProduct(isEnrolled=");
        sb.append(z);
        sb.append(", data=");
        sb.append(savingsOverview);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isEnrolled);
        com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview savingsOverview = this.data;
        return (hashCode * 31) + (savingsOverview == null ? 0 : savingsOverview.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct savingsProduct = (com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct) other;
        return this.isEnrolled == savingsProduct.isEnrolled && kotlin.jvm.internal.Intrinsics.areEqual(this.data, savingsProduct.data);
    }

    public final com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct copy(boolean isEnrolled, com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview data) {
        return new com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct(isEnrolled, data);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview getData() {
        return this.data;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnrolled() {
        return this.isEnrolled;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct copy$default(com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct savingsProduct, boolean z, com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview savingsOverview, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = savingsProduct.isEnrolled;
        }
        if ((i & 2) != 0) {
            savingsOverview = savingsProduct.data;
        }
        return savingsProduct.copy(z, savingsOverview);
    }
}
