package com.paypal.oslo.feature.subscriptions.hub.domain.repository;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/domain/repository/SubscriptionsWithIncentives;", "", "", "Lcom/paypal/oslo/feature/subscriptions/hub/domain/SubscriptionItem;", "subscriptions", "", "incentivesCount", "<init>", "(Ljava/util/List;I)V", "component1", "()Ljava/util/List;", "component2", "()I", "copy", "(Ljava/util/List;I)Lcom/paypal/oslo/feature/subscriptions/hub/domain/repository/SubscriptionsWithIncentives;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSubscriptions", com.visa.cbp.getEncExpo.warmup, "getIncentivesCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SubscriptionsWithIncentives {
    public static final int $stable = 8;
    private final int incentivesCount;
    private final java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> subscriptions;

    public SubscriptionsWithIncentives(java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> list, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.subscriptions = list;
        this.incentivesCount = i;
    }

    public final java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> getSubscriptions() {
        return this.subscriptions;
    }

    public final int getIncentivesCount() {
        return this.incentivesCount;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> list = this.subscriptions;
        int i = this.incentivesCount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubscriptionsWithIncentives(subscriptions=");
        sb.append(list);
        sb.append(", incentivesCount=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.subscriptions.hashCode() * 31) + java.lang.Integer.hashCode(this.incentivesCount);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives subscriptionsWithIncentives = (com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.subscriptions, subscriptionsWithIncentives.subscriptions) && this.incentivesCount == subscriptionsWithIncentives.incentivesCount;
    }

    public final com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives copy(java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> subscriptions, int incentivesCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptions, "");
        return new com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives(subscriptions, incentivesCount);
    }

    /* renamed from: component2, reason: from getter */
    public final int getIncentivesCount() {
        return this.incentivesCount;
    }

    public final java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> component1() {
        return this.subscriptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives copy$default(com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives subscriptionsWithIncentives, java.util.List list, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            list = subscriptionsWithIncentives.subscriptions;
        }
        if ((i2 & 2) != 0) {
            i = subscriptionsWithIncentives.incentivesCount;
        }
        return subscriptionsWithIncentives.copy(list, i);
    }
}
