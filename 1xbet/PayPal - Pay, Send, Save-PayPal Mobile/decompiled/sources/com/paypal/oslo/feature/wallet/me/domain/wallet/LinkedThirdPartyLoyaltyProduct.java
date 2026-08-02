package com.paypal.oslo.feature.wallet.me.domain.wallet;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B#\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u0005\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u001d\u001a\u00020\u001c8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/wallet/LinkedThirdPartyLoyaltyProduct;", "Lcom/paypal/oslo/feature/wallet/me/domain/Product;", "", "Lcom/paypal/oslo/feature/wallet/me/domain/wallet/ThirdPartyLoyaltyCard;", "", "isEnrolled", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(ZLjava/util/List;)V", "component1", "()Z", "component2", "()Ljava/util/List;", "copy", "(ZLjava/util/List;)Lcom/paypal/oslo/feature/wallet/me/domain/wallet/LinkedThirdPartyLoyaltyProduct;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Ljava/util/List;", "getData", "Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;", "type", "Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;", "getType", "()Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class LinkedThirdPartyLoyaltyProduct implements com.paypal.oslo.feature.wallet.me.domain.Product<java.util.List<? extends com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard>> {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard> data;
    private final boolean isEnrolled;
    private final com.paypal.oslo.feature.wallet.me.domain.Product.Type type;

    public LinkedThirdPartyLoyaltyProduct(boolean z, java.util.List<com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard> list) {
        this.isEnrolled = z;
        this.data = list;
        this.type = com.paypal.oslo.feature.wallet.me.domain.Product.Type.LINKED_3P_LOYALTY;
    }

    @Override // com.paypal.oslo.feature.wallet.me.domain.Product
    public final boolean isEnrolled() {
        return this.isEnrolled;
    }

    public /* synthetic */ LinkedThirdPartyLoyaltyProduct(boolean z, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    @Override // com.paypal.oslo.feature.wallet.me.domain.Product
    public final java.util.List<? extends com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard> getData() {
        return this.data;
    }

    @Override // com.paypal.oslo.feature.wallet.me.domain.Product
    public final com.paypal.oslo.feature.wallet.me.domain.Product.Type getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        boolean z = this.isEnrolled;
        java.util.List<com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard> list = this.data;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkedThirdPartyLoyaltyProduct(isEnrolled=");
        sb.append(z);
        sb.append(", data=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isEnrolled);
        java.util.List<com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard> list = this.data;
        return (hashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedThirdPartyLoyaltyProduct)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedThirdPartyLoyaltyProduct linkedThirdPartyLoyaltyProduct = (com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedThirdPartyLoyaltyProduct) other;
        return this.isEnrolled == linkedThirdPartyLoyaltyProduct.isEnrolled && kotlin.jvm.internal.Intrinsics.areEqual(this.data, linkedThirdPartyLoyaltyProduct.data);
    }

    public final com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedThirdPartyLoyaltyProduct copy(boolean isEnrolled, java.util.List<com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard> data) {
        return new com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedThirdPartyLoyaltyProduct(isEnrolled, data);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard> component2() {
        return this.data;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnrolled() {
        return this.isEnrolled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedThirdPartyLoyaltyProduct copy$default(com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedThirdPartyLoyaltyProduct linkedThirdPartyLoyaltyProduct, boolean z, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = linkedThirdPartyLoyaltyProduct.isEnrolled;
        }
        if ((i & 2) != 0) {
            list = linkedThirdPartyLoyaltyProduct.data;
        }
        return linkedThirdPartyLoyaltyProduct.copy(z, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LinkedThirdPartyLoyaltyProduct() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
