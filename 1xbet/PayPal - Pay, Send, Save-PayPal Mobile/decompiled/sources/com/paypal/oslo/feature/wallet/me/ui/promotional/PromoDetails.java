package com.paypal.oslo.feature.wallet.me.ui.promotional;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u0005\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/ui/promotional/PromoDetails;", "", "", "callToActionResId", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "", "Lcom/paypal/oslo/feature/wallet/me/ui/promotional/PromoDetailsItem;", "items", "<init>", "(IZLjava/util/List;)V", "component1", "()I", "component2", "()Z", "component3", "()Ljava/util/List;", "copy", "(IZLjava/util/List;)Lcom/paypal/oslo/feature/wallet/me/ui/promotional/PromoDetails;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getCallToActionResId", "Z", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PromoDetails {
    public static final int $stable = 8;
    private final int callToActionResId;
    private final boolean isExpanded;
    private final java.util.List<com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsItem> items;

    public PromoDetails(int i, boolean z, java.util.List<com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsItem> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.callToActionResId = i;
        this.isExpanded = z;
        this.items = list;
    }

    public final int getCallToActionResId() {
        return this.callToActionResId;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public /* synthetic */ PromoDetails(int i, boolean z, java.util.List list, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsItem> getItems() {
        return this.items;
    }

    public final java.lang.String toString() {
        int i = this.callToActionResId;
        boolean z = this.isExpanded;
        java.util.List<com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsItem> list = this.items;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PromoDetails(callToActionResId=");
        sb.append(i);
        sb.append(", isExpanded=");
        sb.append(z);
        sb.append(", items=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Integer.hashCode(this.callToActionResId) * 31) + java.lang.Boolean.hashCode(this.isExpanded)) * 31) + this.items.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetails)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetails promoDetails = (com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetails) other;
        return this.callToActionResId == promoDetails.callToActionResId && this.isExpanded == promoDetails.isExpanded && kotlin.jvm.internal.Intrinsics.areEqual(this.items, promoDetails.items);
    }

    public final com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetails copy(int callToActionResId, boolean isExpanded, java.util.List<com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsItem> items) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        return new com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetails(callToActionResId, isExpanded, items);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsItem> component3() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* renamed from: component1, reason: from getter */
    public final int getCallToActionResId() {
        return this.callToActionResId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetails copy$default(com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetails promoDetails, int i, boolean z, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = promoDetails.callToActionResId;
        }
        if ((i2 & 2) != 0) {
            z = promoDetails.isExpanded;
        }
        if ((i2 & 4) != 0) {
            list = promoDetails.items;
        }
        return promoDetails.copy(i, z, list);
    }
}
