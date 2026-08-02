package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityRewardRedeemedFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityRewardRedeemedFragment$Amount;", "amount", "<init>", "(Ljava/lang/Integer;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityRewardRedeemedFragment$Amount;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityRewardRedeemedFragment$Amount;", "copy", "(Ljava/lang/Integer;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityRewardRedeemedFragment$Amount;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityRewardRedeemedFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getPoints", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityRewardRedeemedFragment$Amount;", "getAmount", "Amount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityRewardRedeemedFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment.Amount amount;
    private final java.lang.Integer points;

    public ActivityRewardRedeemedFragment(java.lang.Integer num, com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment.Amount amount) {
        this.points = num;
        this.amount = amount;
    }

    public final java.lang.Integer getPoints() {
        return this.points;
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment.Amount getAmount() {
        return this.amount;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityRewardRedeemedFragment$Amount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityRewardRedeemedFragment$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public Amount(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currencyCode = obj;
            this.value = str;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment.Amount amount = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, amount.value);
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment.Amount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment.Amount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment.Amount copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment.Amount amount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = amount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = amount.value;
            }
            return amount.copy(obj, str);
        }
    }

    public final java.lang.String toString() {
        java.lang.Integer num = this.points;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment.Amount amount = this.amount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityRewardRedeemedFragment(points=");
        sb.append(num);
        sb.append(", amount=");
        sb.append(amount);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Integer num = this.points;
        int hashCode = num == null ? 0 : num.hashCode();
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment.Amount amount = this.amount;
        return (hashCode * 31) + (amount != null ? amount.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment activityRewardRedeemedFragment = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.points, activityRewardRedeemedFragment.points) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, activityRewardRedeemedFragment.amount);
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment copy(java.lang.Integer points, com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment.Amount amount) {
        return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment(points, amount);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment.Amount getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Integer getPoints() {
        return this.points;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment activityRewardRedeemedFragment, java.lang.Integer num, com.paypal.oslo.feature.activity.graphql.fragment.ActivityRewardRedeemedFragment.Amount amount, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = activityRewardRedeemedFragment.points;
        }
        if ((i & 2) != 0) {
            amount = activityRewardRedeemedFragment.amount;
        }
        return activityRewardRedeemedFragment.copy(num, amount);
    }
}
