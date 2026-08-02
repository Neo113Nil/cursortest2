package com.paypal.oslo.feature.home.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u001e\u001f B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "__typename", "trackingId", "Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$Wallet;", com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$Wallet;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$Wallet;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$Wallet;)Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "getTrackingId", "Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$Wallet;", "getWallet", "Wallet", "RewardsOverview", "RedeemablePointBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RewardsComponentFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String __typename;
    private final java.lang.String trackingId;
    private final com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.Wallet wallet;

    public RewardsComponentFragment(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.Wallet wallet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.__typename = str;
        this.trackingId = str2;
        this.wallet = wallet;
    }

    public final java.lang.String get__typename() {
        return this.__typename;
    }

    public final java.lang.String getTrackingId() {
        return this.trackingId;
    }

    public final com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.Wallet getWallet() {
        return this.wallet;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$Wallet;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$RewardsOverview;", "rewardsOverview", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$RewardsOverview;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$RewardsOverview;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$RewardsOverview;)Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$Wallet;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$RewardsOverview;", "getRewardsOverview"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Wallet {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RewardsOverview rewardsOverview;

        public Wallet(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RewardsOverview rewardsOverview) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.rewardsOverview = rewardsOverview;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RewardsOverview getRewardsOverview() {
            return this.rewardsOverview;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RewardsOverview rewardsOverview = this.rewardsOverview;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wallet(__typename=");
            sb.append(str);
            sb.append(", rewardsOverview=");
            sb.append(rewardsOverview);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RewardsOverview rewardsOverview = this.rewardsOverview;
            return (hashCode * 31) + (rewardsOverview == null ? 0 : rewardsOverview.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.Wallet)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.Wallet wallet = (com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.Wallet) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, wallet.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsOverview, wallet.rewardsOverview);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.Wallet copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RewardsOverview rewardsOverview) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.Wallet(__typename, rewardsOverview);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RewardsOverview getRewardsOverview() {
            return this.rewardsOverview;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.Wallet copy$default(com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.Wallet wallet, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RewardsOverview rewardsOverview, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = wallet.__typename;
            }
            if ((i & 2) != 0) {
                rewardsOverview = wallet.rewardsOverview;
            }
            return wallet.copy(str, rewardsOverview);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$RewardsOverview;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$RedeemablePointBalance;", "redeemablePointBalance", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$RedeemablePointBalance;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$RedeemablePointBalance;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$RedeemablePointBalance;)Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$RewardsOverview;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$RedeemablePointBalance;", "getRedeemablePointBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RewardsOverview {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RedeemablePointBalance redeemablePointBalance;

        public RewardsOverview(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RedeemablePointBalance redeemablePointBalance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemablePointBalance, "");
            this.__typename = str;
            this.redeemablePointBalance = redeemablePointBalance;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RedeemablePointBalance getRedeemablePointBalance() {
            return this.redeemablePointBalance;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RedeemablePointBalance redeemablePointBalance = this.redeemablePointBalance;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RewardsOverview(__typename=");
            sb.append(str);
            sb.append(", redeemablePointBalance=");
            sb.append(redeemablePointBalance);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.redeemablePointBalance.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RewardsOverview)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RewardsOverview rewardsOverview = (com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RewardsOverview) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, rewardsOverview.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.redeemablePointBalance, rewardsOverview.redeemablePointBalance);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RewardsOverview copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RedeemablePointBalance redeemablePointBalance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemablePointBalance, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RewardsOverview(__typename, redeemablePointBalance);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RedeemablePointBalance getRedeemablePointBalance() {
            return this.redeemablePointBalance;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RewardsOverview copy$default(com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RewardsOverview rewardsOverview, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RedeemablePointBalance redeemablePointBalance, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = rewardsOverview.__typename;
            }
            if ((i & 2) != 0) {
                redeemablePointBalance = rewardsOverview.redeemablePointBalance;
            }
            return rewardsOverview.copy(str, redeemablePointBalance);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$RedeemablePointBalance;", "", "", "__typename", "pointsAvailable", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$RedeemablePointBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Ljava/lang/Object;", "getPointsAvailable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RedeemablePointBalance {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object pointsAvailable;

        public RedeemablePointBalance(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.__typename = str;
            this.pointsAvailable = obj;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.Object getPointsAvailable() {
            return this.pointsAvailable;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.Object obj = this.pointsAvailable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RedeemablePointBalance(__typename=");
            sb.append(str);
            sb.append(", pointsAvailable=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.pointsAvailable.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RedeemablePointBalance)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RedeemablePointBalance redeemablePointBalance = (com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RedeemablePointBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, redeemablePointBalance.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.pointsAvailable, redeemablePointBalance.pointsAvailable);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RedeemablePointBalance copy(java.lang.String __typename, java.lang.Object pointsAvailable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointsAvailable, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RedeemablePointBalance(__typename, pointsAvailable);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getPointsAvailable() {
            return this.pointsAvailable;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RedeemablePointBalance copy$default(com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RedeemablePointBalance redeemablePointBalance, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = redeemablePointBalance.__typename;
            }
            if ((i & 2) != 0) {
                obj = redeemablePointBalance.pointsAvailable;
            }
            return redeemablePointBalance.copy(str, obj);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.__typename;
        java.lang.String str2 = this.trackingId;
        com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.Wallet wallet = this.wallet;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RewardsComponentFragment(__typename=");
        sb.append(str);
        sb.append(", trackingId=");
        sb.append(str2);
        sb.append(", wallet=");
        sb.append(wallet);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.__typename.hashCode();
        java.lang.String str = this.trackingId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.Wallet wallet = this.wallet;
        return (((hashCode * 31) + hashCode2) * 31) + (wallet != null ? wallet.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment)) {
            return false;
        }
        com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment rewardsComponentFragment = (com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, rewardsComponentFragment.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingId, rewardsComponentFragment.trackingId) && kotlin.jvm.internal.Intrinsics.areEqual(this.wallet, rewardsComponentFragment.wallet);
    }

    public final com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment copy(java.lang.String __typename, java.lang.String trackingId, com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.Wallet wallet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
        return new com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment(__typename, trackingId, wallet);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.Wallet getWallet() {
        return this.wallet;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTrackingId() {
        return this.trackingId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String get__typename() {
        return this.__typename;
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment copy$default(com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment rewardsComponentFragment, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.Wallet wallet, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = rewardsComponentFragment.__typename;
        }
        if ((i & 2) != 0) {
            str2 = rewardsComponentFragment.trackingId;
        }
        if ((i & 4) != 0) {
            wallet = rewardsComponentFragment.wallet;
        }
        return rewardsComponentFragment.copy(str, str2, wallet);
    }
}
