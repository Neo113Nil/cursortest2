package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/RedeemedRewardFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "Lcom/paypal/oslo/api/graphql/schema/type/ActivityRewardType;", "type", "<init>", "(Ljava/lang/Integer;Lcom/paypal/oslo/api/graphql/schema/type/ActivityRewardType;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityRewardType;", "copy", "(Ljava/lang/Integer;Lcom/paypal/oslo/api/graphql/schema/type/ActivityRewardType;)Lcom/paypal/oslo/feature/activity/graphql/fragment/RedeemedRewardFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getPoints", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityRewardType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RedeemedRewardFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final java.lang.Integer points;
    private final com.paypal.oslo.api.graphql.schema.type.ActivityRewardType type;

    public RedeemedRewardFragment(java.lang.Integer num, com.paypal.oslo.api.graphql.schema.type.ActivityRewardType activityRewardType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityRewardType, "");
        this.points = num;
        this.type = activityRewardType;
    }

    public final java.lang.Integer getPoints() {
        return this.points;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivityRewardType getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        java.lang.Integer num = this.points;
        com.paypal.oslo.api.graphql.schema.type.ActivityRewardType activityRewardType = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RedeemedRewardFragment(points=");
        sb.append(num);
        sb.append(", type=");
        sb.append(activityRewardType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Integer num = this.points;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.RedeemedRewardFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.RedeemedRewardFragment redeemedRewardFragment = (com.paypal.oslo.feature.activity.graphql.fragment.RedeemedRewardFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.points, redeemedRewardFragment.points) && this.type == redeemedRewardFragment.type;
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.RedeemedRewardFragment copy(java.lang.Integer points, com.paypal.oslo.api.graphql.schema.type.ActivityRewardType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.activity.graphql.fragment.RedeemedRewardFragment(points, type);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ActivityRewardType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Integer getPoints() {
        return this.points;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.RedeemedRewardFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.RedeemedRewardFragment redeemedRewardFragment, java.lang.Integer num, com.paypal.oslo.api.graphql.schema.type.ActivityRewardType activityRewardType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = redeemedRewardFragment.points;
        }
        if ((i & 2) != 0) {
            activityRewardType = redeemedRewardFragment.type;
        }
        return redeemedRewardFragment.copy(num, activityRewardType);
    }
}
