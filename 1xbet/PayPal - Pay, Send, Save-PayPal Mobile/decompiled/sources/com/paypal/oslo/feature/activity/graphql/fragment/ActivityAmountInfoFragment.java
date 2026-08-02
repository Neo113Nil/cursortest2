package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0002#$B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b\u0007\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b\b\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoFragment$Amount;", "amount", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoFragment$CryptoAssetQuantity;", "cryptoAssetQuantity", "", "isAmountNeutral", "isAmountSettlementCanceled", "<init>", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoFragment$Amount;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoFragment$CryptoAssetQuantity;ZZ)V", "component1", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoFragment$Amount;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoFragment$CryptoAssetQuantity;", "component3", "()Z", "component4", "copy", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoFragment$Amount;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoFragment$CryptoAssetQuantity;ZZ)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoFragment;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoFragment$Amount;", "getAmount", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoFragment$CryptoAssetQuantity;", "getCryptoAssetQuantity", "Z", "Amount", "CryptoAssetQuantity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityAmountInfoFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.Amount amount;
    private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.CryptoAssetQuantity cryptoAssetQuantity;
    private final boolean isAmountNeutral;
    private final boolean isAmountSettlementCanceled;

    public ActivityAmountInfoFragment(com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.Amount amount, com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.CryptoAssetQuantity cryptoAssetQuantity, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        this.amount = amount;
        this.cryptoAssetQuantity = cryptoAssetQuantity;
        this.isAmountNeutral = z;
        this.isAmountSettlementCanceled = z2;
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.Amount getAmount() {
        return this.amount;
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.CryptoAssetQuantity getCryptoAssetQuantity() {
        return this.cryptoAssetQuantity;
    }

    public final boolean isAmountNeutral() {
        return this.isAmountNeutral;
    }

    public final boolean isAmountSettlementCanceled() {
        return this.isAmountSettlementCanceled;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoFragment$Amount;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;", "activityMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoFragment$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyFragment;", "getActivityMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.Amount amount = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityMoneyFragment, amount.activityMoneyFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.Amount copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityMoneyFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.Amount(__typename, activityMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment getActivityMoneyFragment() {
            return this.activityMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.Amount copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.Amount amount, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment activityMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amount.__typename;
            }
            if ((i & 2) != 0) {
                activityMoneyFragment = amount.activityMoneyFragment;
            }
            return amount.copy(str, activityMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoFragment$CryptoAssetQuantity;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetQuantityFragment;", "activityCryptoAssetQuantityFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetQuantityFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetQuantityFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetQuantityFragment;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoFragment$CryptoAssetQuantity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetQuantityFragment;", "getActivityCryptoAssetQuantityFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CryptoAssetQuantity {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment activityCryptoAssetQuantityFragment;

        public CryptoAssetQuantity(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment activityCryptoAssetQuantityFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoAssetQuantity(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.CryptoAssetQuantity)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.CryptoAssetQuantity cryptoAssetQuantity = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.CryptoAssetQuantity) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, cryptoAssetQuantity.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityCryptoAssetQuantityFragment, cryptoAssetQuantity.activityCryptoAssetQuantityFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.CryptoAssetQuantity copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment activityCryptoAssetQuantityFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityCryptoAssetQuantityFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.CryptoAssetQuantity(__typename, activityCryptoAssetQuantityFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment getActivityCryptoAssetQuantityFragment() {
            return this.activityCryptoAssetQuantityFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.CryptoAssetQuantity copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.CryptoAssetQuantity cryptoAssetQuantity, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetQuantityFragment activityCryptoAssetQuantityFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cryptoAssetQuantity.__typename;
            }
            if ((i & 2) != 0) {
                activityCryptoAssetQuantityFragment = cryptoAssetQuantity.activityCryptoAssetQuantityFragment;
            }
            return cryptoAssetQuantity.copy(str, activityCryptoAssetQuantityFragment);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.Amount amount = this.amount;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.CryptoAssetQuantity cryptoAssetQuantity = this.cryptoAssetQuantity;
        boolean z = this.isAmountNeutral;
        boolean z2 = this.isAmountSettlementCanceled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityAmountInfoFragment(amount=");
        sb.append(amount);
        sb.append(", cryptoAssetQuantity=");
        sb.append(cryptoAssetQuantity);
        sb.append(", isAmountNeutral=");
        sb.append(z);
        sb.append(", isAmountSettlementCanceled=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.amount.hashCode();
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.CryptoAssetQuantity cryptoAssetQuantity = this.cryptoAssetQuantity;
        return (((((hashCode * 31) + (cryptoAssetQuantity == null ? 0 : cryptoAssetQuantity.hashCode())) * 31) + java.lang.Boolean.hashCode(this.isAmountNeutral)) * 31) + java.lang.Boolean.hashCode(this.isAmountSettlementCanceled);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment activityAmountInfoFragment = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, activityAmountInfoFragment.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptoAssetQuantity, activityAmountInfoFragment.cryptoAssetQuantity) && this.isAmountNeutral == activityAmountInfoFragment.isAmountNeutral && this.isAmountSettlementCanceled == activityAmountInfoFragment.isAmountSettlementCanceled;
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment copy(com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.Amount amount, com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.CryptoAssetQuantity cryptoAssetQuantity, boolean isAmountNeutral, boolean isAmountSettlementCanceled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment(amount, cryptoAssetQuantity, isAmountNeutral, isAmountSettlementCanceled);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsAmountSettlementCanceled() {
        return this.isAmountSettlementCanceled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsAmountNeutral() {
        return this.isAmountNeutral;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.CryptoAssetQuantity getCryptoAssetQuantity() {
        return this.cryptoAssetQuantity;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.Amount getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment activityAmountInfoFragment, com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.Amount amount, com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoFragment.CryptoAssetQuantity cryptoAssetQuantity, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            amount = activityAmountInfoFragment.amount;
        }
        if ((i & 2) != 0) {
            cryptoAssetQuantity = activityAmountInfoFragment.cryptoAssetQuantity;
        }
        if ((i & 4) != 0) {
            z = activityAmountInfoFragment.isAmountNeutral;
        }
        if ((i & 8) != 0) {
            z2 = activityAmountInfoFragment.isAmountSettlementCanceled;
        }
        return activityAmountInfoFragment.copy(amount, cryptoAssetQuantity, z, z2);
    }
}
