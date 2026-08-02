package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityTaxHoldBreakdownFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityTaxHoldBreakdownFragment$Item;", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityTaxHoldBreakdownFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getDescription", "Ljava/util/List;", "getItems", "Item"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityTaxHoldBreakdownFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String description;
    private final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment.Item> items;
    private final java.lang.String title;

    public ActivityTaxHoldBreakdownFragment(java.lang.String str, java.lang.String str2, java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment.Item> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
        this.description = str2;
        this.items = list;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment.Item> getItems() {
        return this.items;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityTaxHoldBreakdownFragment$Item;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityTaxHoldBreakdownItemFragment;", "activityTaxHoldBreakdownItemFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityTaxHoldBreakdownItemFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityTaxHoldBreakdownItemFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityTaxHoldBreakdownItemFragment;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityTaxHoldBreakdownFragment$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityTaxHoldBreakdownItemFragment;", "getActivityTaxHoldBreakdownItemFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownItemFragment activityTaxHoldBreakdownItemFragment;

        public Item(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownItemFragment activityTaxHoldBreakdownItemFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTaxHoldBreakdownItemFragment, "");
            this.__typename = str;
            this.activityTaxHoldBreakdownItemFragment = activityTaxHoldBreakdownItemFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownItemFragment getActivityTaxHoldBreakdownItemFragment() {
            return this.activityTaxHoldBreakdownItemFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownItemFragment activityTaxHoldBreakdownItemFragment = this.activityTaxHoldBreakdownItemFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(__typename=");
            sb.append(str);
            sb.append(", activityTaxHoldBreakdownItemFragment=");
            sb.append(activityTaxHoldBreakdownItemFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityTaxHoldBreakdownItemFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment.Item)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment.Item item = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, item.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityTaxHoldBreakdownItemFragment, item.activityTaxHoldBreakdownItemFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment.Item copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownItemFragment activityTaxHoldBreakdownItemFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTaxHoldBreakdownItemFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment.Item(__typename, activityTaxHoldBreakdownItemFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownItemFragment getActivityTaxHoldBreakdownItemFragment() {
            return this.activityTaxHoldBreakdownItemFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment.Item copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment.Item item, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownItemFragment activityTaxHoldBreakdownItemFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.__typename;
            }
            if ((i & 2) != 0) {
                activityTaxHoldBreakdownItemFragment = item.activityTaxHoldBreakdownItemFragment;
            }
            return item.copy(str, activityTaxHoldBreakdownItemFragment);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.description;
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment.Item> list = this.items;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityTaxHoldBreakdownFragment(title=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", items=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode();
        java.lang.String str = this.description;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment.Item> list = this.items;
        return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment activityTaxHoldBreakdownFragment = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, activityTaxHoldBreakdownFragment.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, activityTaxHoldBreakdownFragment.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, activityTaxHoldBreakdownFragment.items);
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment copy(java.lang.String title, java.lang.String description, java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment.Item> items) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment(title, description, items);
    }

    public final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment.Item> component3() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityTaxHoldBreakdownFragment activityTaxHoldBreakdownFragment, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activityTaxHoldBreakdownFragment.title;
        }
        if ((i & 2) != 0) {
            str2 = activityTaxHoldBreakdownFragment.description;
        }
        if ((i & 4) != 0) {
            list = activityTaxHoldBreakdownFragment.items;
        }
        return activityTaxHoldBreakdownFragment.copy(str, str2, list);
    }
}
