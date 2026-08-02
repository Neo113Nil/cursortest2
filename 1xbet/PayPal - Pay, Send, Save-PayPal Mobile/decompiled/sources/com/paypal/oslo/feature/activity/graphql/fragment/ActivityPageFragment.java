package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001!B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPageFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPageFragment$Item;", "items", "", "cursor", "", "hasNextPage", "<init>", "(Ljava/util/List;Ljava/lang/String;Z)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy", "(Ljava/util/List;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPageFragment;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getItems", "Ljava/lang/String;", "getCursor", "Z", "getHasNextPage", "Item"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityPageFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String cursor;
    private final boolean hasNextPage;
    private final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> items;

    public ActivityPageFragment(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> list, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
        this.cursor = str;
        this.hasNextPage = z;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> getItems() {
        return this.items;
    }

    public final java.lang.String getCursor() {
        return this.cursor;
    }

    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPageFragment$Item;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment;", "activityItemFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPageFragment$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityItemFragment;", "getActivityItemFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment activityItemFragment;

        public Item(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment activityItemFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityItemFragment, "");
            this.__typename = str;
            this.activityItemFragment = activityItemFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment getActivityItemFragment() {
            return this.activityItemFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment activityItemFragment = this.activityItemFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(__typename=");
            sb.append(str);
            sb.append(", activityItemFragment=");
            sb.append(activityItemFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityItemFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item item = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, item.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityItemFragment, item.activityItemFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment activityItemFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityItemFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item(__typename, activityItemFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment getActivityItemFragment() {
            return this.activityItemFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item item, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityItemFragment activityItemFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.__typename;
            }
            if ((i & 2) != 0) {
                activityItemFragment = item.activityItemFragment;
            }
            return item.copy(str, activityItemFragment);
        }
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> list = this.items;
        java.lang.String str = this.cursor;
        boolean z = this.hasNextPage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityPageFragment(items=");
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
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment activityPageFragment = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.items, activityPageFragment.items) && kotlin.jvm.internal.Intrinsics.areEqual(this.cursor, activityPageFragment.cursor) && this.hasNextPage == activityPageFragment.hasNextPage;
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment copy(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> items, java.lang.String cursor, boolean hasNextPage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment(items, cursor, hasNextPage);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCursor() {
        return this.cursor;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> component1() {
        return this.items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment activityPageFragment, java.util.List list, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = activityPageFragment.items;
        }
        if ((i & 2) != 0) {
            str = activityPageFragment.cursor;
        }
        if ((i & 4) != 0) {
            z = activityPageFragment.hasNextPage;
        }
        return activityPageFragment.copy(list, str, z);
    }
}
