package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivitiesFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivitiesFragment$Page;", "page", "", com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT, "<init>", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivitiesFragment$Page;Ljava/lang/Integer;)V", "component1", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivitiesFragment$Page;", "component2", "()Ljava/lang/Integer;", "copy", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivitiesFragment$Page;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivitiesFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivitiesFragment$Page;", "getPage", "Ljava/lang/Integer;", "getTotalCount", "Page"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivitiesFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment.Page page;
    private final java.lang.Integer totalCount;

    public ActivitiesFragment(com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment.Page page, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        this.page = page;
        this.totalCount = num;
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment.Page getPage() {
        return this.page;
    }

    public final java.lang.Integer getTotalCount() {
        return this.totalCount;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivitiesFragment$Page;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPageFragment;", "activityPageFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPageFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPageFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPageFragment;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivitiesFragment$Page;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPageFragment;", "getActivityPageFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Page {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment activityPageFragment;

        public Page(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment activityPageFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityPageFragment, "");
            this.__typename = str;
            this.activityPageFragment = activityPageFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment getActivityPageFragment() {
            return this.activityPageFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment activityPageFragment = this.activityPageFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Page(__typename=");
            sb.append(str);
            sb.append(", activityPageFragment=");
            sb.append(activityPageFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityPageFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment.Page)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment.Page page = (com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment.Page) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, page.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityPageFragment, page.activityPageFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment.Page copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment activityPageFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityPageFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment.Page(__typename, activityPageFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment getActivityPageFragment() {
            return this.activityPageFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment.Page copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment.Page page, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment activityPageFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = page.__typename;
            }
            if ((i & 2) != 0) {
                activityPageFragment = page.activityPageFragment;
            }
            return page.copy(str, activityPageFragment);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment.Page page = this.page;
        java.lang.Integer num = this.totalCount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivitiesFragment(page=");
        sb.append(page);
        sb.append(", totalCount=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.page.hashCode();
        java.lang.Integer num = this.totalCount;
        return (hashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment activitiesFragment = (com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.page, activitiesFragment.page) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalCount, activitiesFragment.totalCount);
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment copy(com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment.Page page, java.lang.Integer totalCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        return new com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment(page, totalCount);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Integer getTotalCount() {
        return this.totalCount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment.Page getPage() {
        return this.page;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment activitiesFragment, com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment.Page page, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            page = activitiesFragment.page;
        }
        if ((i & 2) != 0) {
            num = activitiesFragment.totalCount;
        }
        return activitiesFragment.copy(page, num);
    }
}
