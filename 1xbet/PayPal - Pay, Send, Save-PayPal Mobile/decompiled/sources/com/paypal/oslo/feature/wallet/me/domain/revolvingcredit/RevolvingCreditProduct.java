package com.paypal.oslo.feature.wallet.me.domain.revolvingcredit;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u0006\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/revolvingcredit/RevolvingCreditProduct;", "Lcom/paypal/oslo/feature/wallet/me/domain/Product;", "Lcom/paypal/oslo/feature/wallet/me/domain/revolvingcredit/RevolvingCreditOverview;", "Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;", "type", "", "isEnrolled", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;ZLcom/paypal/oslo/feature/wallet/me/domain/revolvingcredit/RevolvingCreditOverview;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/feature/wallet/me/domain/revolvingcredit/RevolvingCreditOverview;", "copy", "(Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;ZLcom/paypal/oslo/feature/wallet/me/domain/revolvingcredit/RevolvingCreditOverview;)Lcom/paypal/oslo/feature/wallet/me/domain/revolvingcredit/RevolvingCreditProduct;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;", "getType", "Z", "Lcom/paypal/oslo/feature/wallet/me/domain/revolvingcredit/RevolvingCreditOverview;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RevolvingCreditProduct implements com.paypal.oslo.feature.wallet.me.domain.Product<com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditOverview> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditOverview data;
    private final boolean isEnrolled;
    private final com.paypal.oslo.feature.wallet.me.domain.Product.Type type;

    public RevolvingCreditProduct(com.paypal.oslo.feature.wallet.me.domain.Product.Type type, boolean z, com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditOverview revolvingCreditOverview) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        this.type = type;
        this.isEnrolled = z;
        this.data = revolvingCreditOverview;
    }

    @Override // com.paypal.oslo.feature.wallet.me.domain.Product
    public final com.paypal.oslo.feature.wallet.me.domain.Product.Type getType() {
        return this.type;
    }

    @Override // com.paypal.oslo.feature.wallet.me.domain.Product
    public final boolean isEnrolled() {
        return this.isEnrolled;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.paypal.oslo.feature.wallet.me.domain.Product
    public final com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditOverview getData() {
        return this.data;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.me.domain.Product.Type type = this.type;
        boolean z = this.isEnrolled;
        com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditOverview revolvingCreditOverview = this.data;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditProduct(type=");
        sb.append(type);
        sb.append(", isEnrolled=");
        sb.append(z);
        sb.append(", data=");
        sb.append(revolvingCreditOverview);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.isEnrolled);
        com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditOverview revolvingCreditOverview = this.data;
        return (((hashCode * 31) + hashCode2) * 31) + (revolvingCreditOverview == null ? 0 : revolvingCreditOverview.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditProduct)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditProduct revolvingCreditProduct = (com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditProduct) other;
        return this.type == revolvingCreditProduct.type && this.isEnrolled == revolvingCreditProduct.isEnrolled && kotlin.jvm.internal.Intrinsics.areEqual(this.data, revolvingCreditProduct.data);
    }

    public final com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditProduct copy(com.paypal.oslo.feature.wallet.me.domain.Product.Type type, boolean isEnrolled, com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditOverview data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditProduct(type, isEnrolled, data);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditOverview getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEnrolled() {
        return this.isEnrolled;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.me.domain.Product.Type getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditProduct copy$default(com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditProduct revolvingCreditProduct, com.paypal.oslo.feature.wallet.me.domain.Product.Type type, boolean z, com.paypal.oslo.feature.wallet.me.domain.revolvingcredit.RevolvingCreditOverview revolvingCreditOverview, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            type = revolvingCreditProduct.type;
        }
        if ((i & 2) != 0) {
            z = revolvingCreditProduct.isEnrolled;
        }
        if ((i & 4) != 0) {
            revolvingCreditOverview = revolvingCreditProduct.data;
        }
        return revolvingCreditProduct.copy(type, z, revolvingCreditOverview);
    }
}
