package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionOfferEarnedRewardTotalsFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionOfferEarnedRewardTotalsFragment$Amount;", "amounts", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "<init>", "(Ljava/util/List;Ljava/lang/Object;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/util/List;Ljava/lang/Object;)Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionOfferEarnedRewardTotalsFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getAmounts", "Ljava/lang/Object;", "getPoints", "Amount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PromotionOfferEarnedRewardTotalsFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount> amounts;
    private final java.lang.Object points;

    public PromotionOfferEarnedRewardTotalsFragment(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount> list, java.lang.Object obj) {
        this.amounts = list;
        this.points = obj;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount> getAmounts() {
        return this.amounts;
    }

    public final java.lang.Object getPoints() {
        return this.points;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionOfferEarnedRewardTotalsFragment$Amount;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;", "activityMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;)Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionOfferEarnedRewardTotalsFragment$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;", "getActivityMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment;

        public Amount(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityMoneyFragment, "");
            this.__typename = str;
            this.activityMoneyFragment = activityMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment getActivityMoneyFragment() {
            return this.activityMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment = this.activityMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(__typename=");
            sb.append(str);
            sb.append(", activityMoneyFragment=");
            sb.append(activityMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount amount = (com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityMoneyFragment, amount.activityMoneyFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityMoneyFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount(__typename, activityMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment getActivityMoneyFragment() {
            return this.activityMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount copy$default(com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount amount, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amount.__typename;
            }
            if ((i & 2) != 0) {
                activityMoneyFragment = amount.activityMoneyFragment;
            }
            return amount.copy(str, activityMoneyFragment);
        }
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount> list = this.amounts;
        java.lang.Object obj = this.points;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PromotionOfferEarnedRewardTotalsFragment(amounts=");
        sb.append(list);
        sb.append(", points=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount> list = this.amounts;
        int hashCode = list == null ? 0 : list.hashCode();
        java.lang.Object obj = this.points;
        return (hashCode * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment promotionOfferEarnedRewardTotalsFragment = (com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amounts, promotionOfferEarnedRewardTotalsFragment.amounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.points, promotionOfferEarnedRewardTotalsFragment.points);
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment copy(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount> amounts, java.lang.Object points) {
        return new com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment(amounts, points);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getPoints() {
        return this.points;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount> component1() {
        return this.amounts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment promotionOfferEarnedRewardTotalsFragment, java.util.List list, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            list = promotionOfferEarnedRewardTotalsFragment.amounts;
        }
        if ((i & 2) != 0) {
            obj = promotionOfferEarnedRewardTotalsFragment.points;
        }
        return promotionOfferEarnedRewardTotalsFragment.copy(list, obj);
    }
}
