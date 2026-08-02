package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0002#$B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment$SourceAmount;", "sourceAmount", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment$TargetAmount;", "targetAmount", "", "exchangeRate", "<init>", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment$SourceAmount;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment$TargetAmount;Ljava/lang/Double;)V", "component1", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment$SourceAmount;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment$TargetAmount;", "component3", "()Ljava/lang/Double;", "copy", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment$SourceAmount;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment$TargetAmount;Ljava/lang/Double;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment$SourceAmount;", "getSourceAmount", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment$TargetAmount;", "getTargetAmount", "Ljava/lang/Double;", "getExchangeRate", "SourceAmount", "TargetAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityMoneyConversionFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.Double exchangeRate;
    private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.SourceAmount sourceAmount;
    private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.TargetAmount targetAmount;

    public ActivityMoneyConversionFragment(com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.SourceAmount sourceAmount, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.TargetAmount targetAmount, java.lang.Double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetAmount, "");
        this.sourceAmount = sourceAmount;
        this.targetAmount = targetAmount;
        this.exchangeRate = d;
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.SourceAmount getSourceAmount() {
        return this.sourceAmount;
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.TargetAmount getTargetAmount() {
        return this.targetAmount;
    }

    public final java.lang.Double getExchangeRate() {
        return this.exchangeRate;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment$SourceAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;", "activityMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment$SourceAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;", "getActivityMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SourceAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment;

        public SourceAmount(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SourceAmount(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.SourceAmount)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.SourceAmount sourceAmount = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.SourceAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, sourceAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityMoneyFragment, sourceAmount.activityMoneyFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.SourceAmount copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityMoneyFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.SourceAmount(__typename, activityMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment getActivityMoneyFragment() {
            return this.activityMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.SourceAmount copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.SourceAmount sourceAmount, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sourceAmount.__typename;
            }
            if ((i & 2) != 0) {
                activityMoneyFragment = sourceAmount.activityMoneyFragment;
            }
            return sourceAmount.copy(str, activityMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment$TargetAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;", "activityMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment$TargetAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;", "getActivityMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TargetAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment;

        public TargetAmount(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TargetAmount(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.TargetAmount)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.TargetAmount targetAmount = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.TargetAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, targetAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityMoneyFragment, targetAmount.activityMoneyFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.TargetAmount copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityMoneyFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.TargetAmount(__typename, activityMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment getActivityMoneyFragment() {
            return this.activityMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.TargetAmount copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.TargetAmount targetAmount, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = targetAmount.__typename;
            }
            if ((i & 2) != 0) {
                activityMoneyFragment = targetAmount.activityMoneyFragment;
            }
            return targetAmount.copy(str, activityMoneyFragment);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.SourceAmount sourceAmount = this.sourceAmount;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.TargetAmount targetAmount = this.targetAmount;
        java.lang.Double d = this.exchangeRate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityMoneyConversionFragment(sourceAmount=");
        sb.append(sourceAmount);
        sb.append(", targetAmount=");
        sb.append(targetAmount);
        sb.append(", exchangeRate=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.sourceAmount.hashCode();
        int hashCode2 = this.targetAmount.hashCode();
        java.lang.Double d = this.exchangeRate;
        return (((hashCode * 31) + hashCode2) * 31) + (d == null ? 0 : d.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment activityMoneyConversionFragment = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sourceAmount, activityMoneyConversionFragment.sourceAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetAmount, activityMoneyConversionFragment.targetAmount) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.exchangeRate, (java.lang.Object) activityMoneyConversionFragment.exchangeRate);
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment copy(com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.SourceAmount sourceAmount, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.TargetAmount targetAmount, java.lang.Double exchangeRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetAmount, "");
        return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment(sourceAmount, targetAmount, exchangeRate);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Double getExchangeRate() {
        return this.exchangeRate;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.TargetAmount getTargetAmount() {
        return this.targetAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.SourceAmount getSourceAmount() {
        return this.sourceAmount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment activityMoneyConversionFragment, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.SourceAmount sourceAmount, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.TargetAmount targetAmount, java.lang.Double d, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            sourceAmount = activityMoneyConversionFragment.sourceAmount;
        }
        if ((i & 2) != 0) {
            targetAmount = activityMoneyConversionFragment.targetAmount;
        }
        if ((i & 4) != 0) {
            d = activityMoneyConversionFragment.exchangeRate;
        }
        return activityMoneyConversionFragment.copy(sourceAmount, targetAmount, d);
    }
}
