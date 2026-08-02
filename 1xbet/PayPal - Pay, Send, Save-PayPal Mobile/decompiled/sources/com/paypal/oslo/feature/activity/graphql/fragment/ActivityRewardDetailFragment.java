package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityRewardDetailFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/api/graphql/schema/type/ActivityRewardStatus;", "status", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityRewardStatus;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityRewardStatus;", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityRewardStatus;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityRewardDetailFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDescription", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityRewardStatus;", "getStatus", "Ljava/lang/Integer;", "getPoints"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityRewardDetailFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final java.lang.String description;
    private final java.lang.Integer points;
    private final com.paypal.oslo.api.graphql.schema.type.ActivityRewardStatus status;

    public ActivityRewardDetailFragment(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivityRewardStatus activityRewardStatus, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityRewardStatus, "");
        this.description = str;
        this.status = activityRewardStatus;
        this.points = num;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivityRewardStatus getStatus() {
        return this.status;
    }

    public final java.lang.Integer getPoints() {
        return this.points;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.description;
        com.paypal.oslo.api.graphql.schema.type.ActivityRewardStatus activityRewardStatus = this.status;
        java.lang.Integer num = this.points;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityRewardDetailFragment(description=");
        sb.append(str);
        sb.append(", status=");
        sb.append(activityRewardStatus);
        sb.append(", points=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.description;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.status.hashCode();
        java.lang.Integer num = this.points;
        return (((hashCode * 31) + hashCode2) * 31) + (num != null ? num.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardDetailFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardDetailFragment activityRewardDetailFragment = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardDetailFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.description, activityRewardDetailFragment.description) && this.status == activityRewardDetailFragment.status && kotlin.jvm.internal.Intrinsics.areEqual(this.points, activityRewardDetailFragment.points);
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardDetailFragment copy(java.lang.String description, com.paypal.oslo.api.graphql.schema.type.ActivityRewardStatus status, java.lang.Integer points) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardDetailFragment(description, status, points);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getPoints() {
        return this.points;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ActivityRewardStatus getStatus() {
        return this.status;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardDetailFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardDetailFragment activityRewardDetailFragment, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivityRewardStatus activityRewardStatus, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activityRewardDetailFragment.description;
        }
        if ((i & 2) != 0) {
            activityRewardStatus = activityRewardDetailFragment.status;
        }
        if ((i & 4) != 0) {
            num = activityRewardDetailFragment.points;
        }
        return activityRewardDetailFragment.copy(str, activityRewardStatus, num);
    }
}
