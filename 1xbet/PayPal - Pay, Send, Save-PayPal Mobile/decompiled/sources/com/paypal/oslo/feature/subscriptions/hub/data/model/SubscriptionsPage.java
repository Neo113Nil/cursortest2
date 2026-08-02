package com.paypal.oslo.feature.subscriptions.hub.data.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/data/model/SubscriptionsPage;", "", "", "Lcom/paypal/oslo/feature/subscriptions/hub/domain/SubscriptionItem;", "items", "", "cursor", "", "hasNextPage", "<init>", "(Ljava/util/List;Ljava/lang/String;Z)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy", "(Ljava/util/List;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/subscriptions/hub/data/model/SubscriptionsPage;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getItems", "Ljava/lang/String;", "getCursor", "Z", "getHasNextPage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SubscriptionsPage {
    public static final int $stable = 8;
    private final java.lang.String cursor;
    private final boolean hasNextPage;
    private final java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> items;

    public SubscriptionsPage(java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> list, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
        this.cursor = str;
        this.hasNextPage = z;
    }

    public final java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> getItems() {
        return this.items;
    }

    public final java.lang.String getCursor() {
        return this.cursor;
    }

    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> list = this.items;
        java.lang.String str = this.cursor;
        boolean z = this.hasNextPage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubscriptionsPage(items=");
        sb.append(list);
        sb.append(", cursor=");
        sb.append(str);
        sb.append(", hasNextPage=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode();
        java.lang.String str = this.cursor;
        return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.hasNextPage);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.data.model.SubscriptionsPage)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.hub.data.model.SubscriptionsPage subscriptionsPage = (com.paypal.oslo.feature.subscriptions.hub.data.model.SubscriptionsPage) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.items, subscriptionsPage.items) && kotlin.jvm.internal.Intrinsics.areEqual(this.cursor, subscriptionsPage.cursor) && this.hasNextPage == subscriptionsPage.hasNextPage;
    }

    public final com.paypal.oslo.feature.subscriptions.hub.data.model.SubscriptionsPage copy(java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> items, java.lang.String cursor, boolean hasNextPage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        return new com.paypal.oslo.feature.subscriptions.hub.data.model.SubscriptionsPage(items, cursor, hasNextPage);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCursor() {
        return this.cursor;
    }

    public final java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> component1() {
        return this.items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.hub.data.model.SubscriptionsPage copy$default(com.paypal.oslo.feature.subscriptions.hub.data.model.SubscriptionsPage subscriptionsPage, java.util.List list, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = subscriptionsPage.items;
        }
        if ((i & 2) != 0) {
            str = subscriptionsPage.cursor;
        }
        if ((i & 4) != 0) {
            z = subscriptionsPage.hasNextPage;
        }
        return subscriptionsPage.copy(list, str, z);
    }
}
