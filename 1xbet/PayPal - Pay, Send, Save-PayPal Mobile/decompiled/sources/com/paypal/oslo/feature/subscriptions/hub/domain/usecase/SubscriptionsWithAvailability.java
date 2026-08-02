package com.paypal.oslo.feature.subscriptions.hub.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/domain/usecase/SubscriptionsWithAvailability;", "", "", "Lcom/paypal/oslo/feature/subscriptions/hub/domain/SubscriptionItem;", "subscriptions", "", "shouldShowLinkEntryPoints", "<init>", "(Ljava/util/List;Z)V", "component1", "()Ljava/util/List;", "component2", "()Z", "copy", "(Ljava/util/List;Z)Lcom/paypal/oslo/feature/subscriptions/hub/domain/usecase/SubscriptionsWithAvailability;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSubscriptions", "Z", "getShouldShowLinkEntryPoints"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SubscriptionsWithAvailability {
    public static final int $stable = 8;
    private final boolean shouldShowLinkEntryPoints;
    private final java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> subscriptions;

    public SubscriptionsWithAvailability(java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.subscriptions = list;
        this.shouldShowLinkEntryPoints = z;
    }

    public final java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> getSubscriptions() {
        return this.subscriptions;
    }

    public final boolean getShouldShowLinkEntryPoints() {
        return this.shouldShowLinkEntryPoints;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> list = this.subscriptions;
        boolean z = this.shouldShowLinkEntryPoints;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubscriptionsWithAvailability(subscriptions=");
        sb.append(list);
        sb.append(", shouldShowLinkEntryPoints=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.subscriptions.hashCode() * 31) + java.lang.Boolean.hashCode(this.shouldShowLinkEntryPoints);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.domain.usecase.SubscriptionsWithAvailability)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.hub.domain.usecase.SubscriptionsWithAvailability subscriptionsWithAvailability = (com.paypal.oslo.feature.subscriptions.hub.domain.usecase.SubscriptionsWithAvailability) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.subscriptions, subscriptionsWithAvailability.subscriptions) && this.shouldShowLinkEntryPoints == subscriptionsWithAvailability.shouldShowLinkEntryPoints;
    }

    public final com.paypal.oslo.feature.subscriptions.hub.domain.usecase.SubscriptionsWithAvailability copy(java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> subscriptions, boolean shouldShowLinkEntryPoints) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptions, "");
        return new com.paypal.oslo.feature.subscriptions.hub.domain.usecase.SubscriptionsWithAvailability(subscriptions, shouldShowLinkEntryPoints);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldShowLinkEntryPoints() {
        return this.shouldShowLinkEntryPoints;
    }

    public final java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> component1() {
        return this.subscriptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.hub.domain.usecase.SubscriptionsWithAvailability copy$default(com.paypal.oslo.feature.subscriptions.hub.domain.usecase.SubscriptionsWithAvailability subscriptionsWithAvailability, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = subscriptionsWithAvailability.subscriptions;
        }
        if ((i & 2) != 0) {
            z = subscriptionsWithAvailability.shouldShowLinkEntryPoints;
        }
        return subscriptionsWithAvailability.copy(list, z);
    }
}
