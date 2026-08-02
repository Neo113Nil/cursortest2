package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShipmentPackagesFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "activityId", "", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShipmentPackagesFragment$Item;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShipmentPackagesFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getActivityId", "Ljava/util/List;", "getItems", "Item"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityShipmentPackagesFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String activityId;
    private final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment.Item> items;

    public ActivityShipmentPackagesFragment(java.lang.String str, java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment.Item> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.activityId = str;
        this.items = list;
    }

    public final java.lang.String getActivityId() {
        return this.activityId;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment.Item> getItems() {
        return this.items;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShipmentPackagesFragment$Item;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShipmentPackageItemFragment;", "activityShipmentPackageItemFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShipmentPackageItemFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShipmentPackageItemFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShipmentPackageItemFragment;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShipmentPackagesFragment$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShipmentPackageItemFragment;", "getActivityShipmentPackageItemFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackageItemFragment activityShipmentPackageItemFragment;

        public Item(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackageItemFragment activityShipmentPackageItemFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityShipmentPackageItemFragment, "");
            this.__typename = str;
            this.activityShipmentPackageItemFragment = activityShipmentPackageItemFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackageItemFragment getActivityShipmentPackageItemFragment() {
            return this.activityShipmentPackageItemFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackageItemFragment activityShipmentPackageItemFragment = this.activityShipmentPackageItemFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(__typename=");
            sb.append(str);
            sb.append(", activityShipmentPackageItemFragment=");
            sb.append(activityShipmentPackageItemFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityShipmentPackageItemFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment.Item)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment.Item item = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, item.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityShipmentPackageItemFragment, item.activityShipmentPackageItemFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment.Item copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackageItemFragment activityShipmentPackageItemFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityShipmentPackageItemFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment.Item(__typename, activityShipmentPackageItemFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackageItemFragment getActivityShipmentPackageItemFragment() {
            return this.activityShipmentPackageItemFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment.Item copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment.Item item, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackageItemFragment activityShipmentPackageItemFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.__typename;
            }
            if ((i & 2) != 0) {
                activityShipmentPackageItemFragment = item.activityShipmentPackageItemFragment;
            }
            return item.copy(str, activityShipmentPackageItemFragment);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.activityId;
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment.Item> list = this.items;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityShipmentPackagesFragment(activityId=");
        sb.append(str);
        sb.append(", items=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.activityId.hashCode() * 31) + this.items.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment activityShipmentPackagesFragment = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.activityId, activityShipmentPackagesFragment.activityId) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, activityShipmentPackagesFragment.items);
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment copy(java.lang.String activityId, java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment.Item> items) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment(activityId, items);
    }

    public final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment.Item> component2() {
        return this.items;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getActivityId() {
        return this.activityId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment activityShipmentPackagesFragment, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activityShipmentPackagesFragment.activityId;
        }
        if ((i & 2) != 0) {
            list = activityShipmentPackagesFragment.items;
        }
        return activityShipmentPackagesFragment.copy(str, list);
    }
}
