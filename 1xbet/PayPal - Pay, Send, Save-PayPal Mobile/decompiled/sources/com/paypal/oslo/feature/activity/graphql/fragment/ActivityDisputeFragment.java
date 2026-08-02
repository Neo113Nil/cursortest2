package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001!B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDisputeFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "id", org.bouncycastle.i18n.ErrorBundle.SUMMARY_ENTRY, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDisputeFragment$Action;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDisputeFragment$Action;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDisputeFragment$Action;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDisputeFragment$Action;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDisputeFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getSummary", "getDescription", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDisputeFragment$Action;", "getAction", "Action"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityDisputeFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment.Action action;
    private final java.lang.String description;
    private final java.lang.String id;
    private final java.lang.String summary;

    public ActivityDisputeFragment(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment.Action action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        this.id = str;
        this.summary = str2;
        this.description = str3;
        this.action = action;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getSummary() {
        return this.summary;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment.Action getAction() {
        return this.action;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDisputeFragment$Action;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityActionsFragment;", "activityActionsFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityActionsFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityActionsFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityActionsFragment;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDisputeFragment$Action;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityActionsFragment;", "getActivityActionsFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Action {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment activityActionsFragment;

        public Action(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment activityActionsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionsFragment, "");
            this.__typename = str;
            this.activityActionsFragment = activityActionsFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment getActivityActionsFragment() {
            return this.activityActionsFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment activityActionsFragment = this.activityActionsFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Action(__typename=");
            sb.append(str);
            sb.append(", activityActionsFragment=");
            sb.append(activityActionsFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityActionsFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment.Action)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment.Action action = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment.Action) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, action.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityActionsFragment, action.activityActionsFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment.Action copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment activityActionsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionsFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment.Action(__typename, activityActionsFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment getActivityActionsFragment() {
            return this.activityActionsFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment.Action copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment.Action action, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment activityActionsFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = action.__typename;
            }
            if ((i & 2) != 0) {
                activityActionsFragment = action.activityActionsFragment;
            }
            return action.copy(str, activityActionsFragment);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.summary;
        java.lang.String str3 = this.description;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment.Action action = this.action;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityDisputeFragment(id=");
        sb.append(str);
        sb.append(", summary=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        sb.append(", action=");
        sb.append(action);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.id.hashCode() * 31) + this.summary.hashCode()) * 31) + this.description.hashCode()) * 31) + this.action.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment activityDisputeFragment = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, activityDisputeFragment.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.summary, activityDisputeFragment.summary) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, activityDisputeFragment.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, activityDisputeFragment.action);
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment copy(java.lang.String id, java.lang.String summary, java.lang.String description, com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment.Action action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(summary, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment(id, summary, description, action);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment.Action getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSummary() {
        return this.summary;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment activityDisputeFragment, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment.Action action, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activityDisputeFragment.id;
        }
        if ((i & 2) != 0) {
            str2 = activityDisputeFragment.summary;
        }
        if ((i & 4) != 0) {
            str3 = activityDisputeFragment.description;
        }
        if ((i & 8) != 0) {
            action = activityDisputeFragment.action;
        }
        return activityDisputeFragment.copy(str, str2, str3, action);
    }
}
