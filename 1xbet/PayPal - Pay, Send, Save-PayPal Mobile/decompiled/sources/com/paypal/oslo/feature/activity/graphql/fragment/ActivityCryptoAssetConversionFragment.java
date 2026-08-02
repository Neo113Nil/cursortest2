package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment$AssetQuantity;", "assetQuantity", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment$Amount;", "amount", "<init>", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment$AssetQuantity;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment$Amount;)V", "component1", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment$AssetQuantity;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment$Amount;", "copy", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment$AssetQuantity;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment$Amount;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment$AssetQuantity;", "getAssetQuantity", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment$Amount;", "getAmount", "AssetQuantity", "Amount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityCryptoAssetConversionFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.Amount amount;
    private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.AssetQuantity assetQuantity;

    public ActivityCryptoAssetConversionFragment(com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.AssetQuantity assetQuantity, com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.Amount amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetQuantity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        this.assetQuantity = assetQuantity;
        this.amount = amount;
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.AssetQuantity getAssetQuantity() {
        return this.assetQuantity;
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.Amount getAmount() {
        return this.amount;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment$AssetQuantity;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetQuantityFragment;", "activityCryptoAssetQuantityFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetQuantityFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetQuantityFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetQuantityFragment;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment$AssetQuantity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetQuantityFragment;", "getActivityCryptoAssetQuantityFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AssetQuantity {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment activityCryptoAssetQuantityFragment;

        public AssetQuantity(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment activityCryptoAssetQuantityFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityCryptoAssetQuantityFragment, "");
            this.__typename = str;
            this.activityCryptoAssetQuantityFragment = activityCryptoAssetQuantityFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment getActivityCryptoAssetQuantityFragment() {
            return this.activityCryptoAssetQuantityFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment activityCryptoAssetQuantityFragment = this.activityCryptoAssetQuantityFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AssetQuantity(__typename=");
            sb.append(str);
            sb.append(", activityCryptoAssetQuantityFragment=");
            sb.append(activityCryptoAssetQuantityFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityCryptoAssetQuantityFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.AssetQuantity)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.AssetQuantity assetQuantity = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.AssetQuantity) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, assetQuantity.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityCryptoAssetQuantityFragment, assetQuantity.activityCryptoAssetQuantityFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.AssetQuantity copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment activityCryptoAssetQuantityFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityCryptoAssetQuantityFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.AssetQuantity(__typename, activityCryptoAssetQuantityFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment getActivityCryptoAssetQuantityFragment() {
            return this.activityCryptoAssetQuantityFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.AssetQuantity copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.AssetQuantity assetQuantity, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment activityCryptoAssetQuantityFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = assetQuantity.__typename;
            }
            if ((i & 2) != 0) {
                activityCryptoAssetQuantityFragment = assetQuantity.activityCryptoAssetQuantityFragment;
            }
            return assetQuantity.copy(str, activityCryptoAssetQuantityFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment$Amount;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;", "activityMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;", "getActivityMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.Amount amount = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityMoneyFragment, amount.activityMoneyFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.Amount copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityMoneyFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.Amount(__typename, activityMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment getActivityMoneyFragment() {
            return this.activityMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.Amount copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.Amount amount, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment, int i, java.lang.Object obj) {
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
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.AssetQuantity assetQuantity = this.assetQuantity;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.Amount amount = this.amount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityCryptoAssetConversionFragment(assetQuantity=");
        sb.append(assetQuantity);
        sb.append(", amount=");
        sb.append(amount);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.assetQuantity.hashCode() * 31) + this.amount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment activityCryptoAssetConversionFragment = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.assetQuantity, activityCryptoAssetConversionFragment.assetQuantity) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, activityCryptoAssetConversionFragment.amount);
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment copy(com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.AssetQuantity assetQuantity, com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.Amount amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetQuantity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment(assetQuantity, amount);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.Amount getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.AssetQuantity getAssetQuantity() {
        return this.assetQuantity;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment activityCryptoAssetConversionFragment, com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.AssetQuantity assetQuantity, com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment.Amount amount, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            assetQuantity = activityCryptoAssetConversionFragment.assetQuantity;
        }
        if ((i & 2) != 0) {
            amount = activityCryptoAssetConversionFragment.amount;
        }
        return activityCryptoAssetConversionFragment.copy(assetQuantity, amount);
    }
}
