package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityActionsFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;", "type", "", "url", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;", "component2", "()Ljava/lang/Object;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;Ljava/lang/Object;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityActionsFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;", "getType", "Ljava/lang/Object;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityActionsFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.api.graphql.schema.type.ActivityActionType type;
    private final java.lang.Object url;

    public ActivityActionsFragment(com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionType, "");
        this.type = activityActionType;
        this.url = obj;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivityActionType getType() {
        return this.type;
    }

    public final java.lang.Object getUrl() {
        return this.url;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType = this.type;
        java.lang.Object obj = this.url;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityActionsFragment(type=");
        sb.append(activityActionType);
        sb.append(", url=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        java.lang.Object obj = this.url;
        return (hashCode * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment activityActionsFragment = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment) other;
        return this.type == activityActionsFragment.type && kotlin.jvm.internal.Intrinsics.areEqual(this.url, activityActionsFragment.url);
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment copy(com.paypal.oslo.api.graphql.schema.type.ActivityActionType type, java.lang.Object url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment(type, url);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getUrl() {
        return this.url;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ActivityActionType getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment activityActionsFragment, com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            activityActionType = activityActionsFragment.type;
        }
        if ((i & 2) != 0) {
            obj = activityActionsFragment.url;
        }
        return activityActionsFragment.copy(activityActionType, obj);
    }
}
