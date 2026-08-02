package com.paypal.oslo.feature.shoppingrewards.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\"#$B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$AmountAvailable;", "amountAvailable", "", "pointsAvailable", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$ExchangeRate;", "exchangeRate", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$AmountAvailable;Ljava/lang/Object;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$ExchangeRate;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$AmountAvailable;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$ExchangeRate;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$AmountAvailable;Ljava/lang/Object;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$ExchangeRate;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$AmountAvailable;", "getAmountAvailable", "Ljava/lang/Object;", "getPointsAvailable", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$ExchangeRate;", "getExchangeRate", "AmountAvailable", "ExchangeRate", "Amount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RedeemablePointBalanceFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.AmountAvailable amountAvailable;
    private final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.ExchangeRate exchangeRate;
    private final java.lang.Object pointsAvailable;

    public RedeemablePointBalanceFragment(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.AmountAvailable amountAvailable, java.lang.Object obj, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.ExchangeRate exchangeRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountAvailable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.amountAvailable = amountAvailable;
        this.pointsAvailable = obj;
        this.exchangeRate = exchangeRate;
    }

    public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.AmountAvailable getAmountAvailable() {
        return this.amountAvailable;
    }

    public final java.lang.Object getPointsAvailable() {
        return this.pointsAvailable;
    }

    public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.ExchangeRate getExchangeRate() {
        return this.exchangeRate;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$AmountAvailable;", "", "", "__typename", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RewardsMoneyFragment;", "rewardsMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RewardsMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RewardsMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RewardsMoneyFragment;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$AmountAvailable;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RewardsMoneyFragment;", "getRewardsMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountAvailable {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RewardsMoneyFragment rewardsMoneyFragment;

        public AmountAvailable(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RewardsMoneyFragment rewardsMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsMoneyFragment, "");
            this.__typename = str;
            this.rewardsMoneyFragment = rewardsMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RewardsMoneyFragment getRewardsMoneyFragment() {
            return this.rewardsMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RewardsMoneyFragment rewardsMoneyFragment = this.rewardsMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountAvailable(__typename=");
            sb.append(str);
            sb.append(", rewardsMoneyFragment=");
            sb.append(rewardsMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.rewardsMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.AmountAvailable)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.AmountAvailable amountAvailable = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.AmountAvailable) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amountAvailable.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsMoneyFragment, amountAvailable.rewardsMoneyFragment);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.AmountAvailable copy(java.lang.String __typename, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RewardsMoneyFragment rewardsMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsMoneyFragment, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.AmountAvailable(__typename, rewardsMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RewardsMoneyFragment getRewardsMoneyFragment() {
            return this.rewardsMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.AmountAvailable copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.AmountAvailable amountAvailable, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RewardsMoneyFragment rewardsMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amountAvailable.__typename;
            }
            if ((i & 2) != 0) {
                rewardsMoneyFragment = amountAvailable.rewardsMoneyFragment;
            }
            return amountAvailable.copy(str, rewardsMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$ExchangeRate;", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$Amount;", "amount", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$Amount;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$Amount;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$Amount;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$ExchangeRate;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getPoints", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$Amount;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExchangeRate {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.Amount amount;
        private final java.lang.Object points;

        public ExchangeRate(java.lang.Object obj, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.Amount amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            this.points = obj;
            this.amount = amount;
        }

        public final java.lang.Object getPoints() {
            return this.points;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.Amount getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.points;
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.Amount amount = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ExchangeRate(points=");
            sb.append(obj);
            sb.append(", amount=");
            sb.append(amount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.points.hashCode() * 31) + this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.ExchangeRate)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.ExchangeRate exchangeRate = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.ExchangeRate) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.points, exchangeRate.points) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, exchangeRate.amount);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.ExchangeRate copy(java.lang.Object points, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.Amount amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(points, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.ExchangeRate(points, amount);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.Amount getAmount() {
            return this.amount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getPoints() {
            return this.points;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.ExchangeRate copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.ExchangeRate exchangeRate, java.lang.Object obj, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.Amount amount, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = exchangeRate.points;
            }
            if ((i & 2) != 0) {
                amount = exchangeRate.amount;
            }
            return exchangeRate.copy(obj, amount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$Amount;", "", "", "__typename", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RewardsMoneyFragment;", "rewardsMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RewardsMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RewardsMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RewardsMoneyFragment;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RewardsMoneyFragment;", "getRewardsMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RewardsMoneyFragment rewardsMoneyFragment;

        public Amount(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RewardsMoneyFragment rewardsMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsMoneyFragment, "");
            this.__typename = str;
            this.rewardsMoneyFragment = rewardsMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RewardsMoneyFragment getRewardsMoneyFragment() {
            return this.rewardsMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RewardsMoneyFragment rewardsMoneyFragment = this.rewardsMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(__typename=");
            sb.append(str);
            sb.append(", rewardsMoneyFragment=");
            sb.append(rewardsMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.rewardsMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.Amount amount = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsMoneyFragment, amount.rewardsMoneyFragment);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.Amount copy(java.lang.String __typename, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RewardsMoneyFragment rewardsMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsMoneyFragment, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.Amount(__typename, rewardsMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RewardsMoneyFragment getRewardsMoneyFragment() {
            return this.rewardsMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.Amount copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.Amount amount, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RewardsMoneyFragment rewardsMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amount.__typename;
            }
            if ((i & 2) != 0) {
                rewardsMoneyFragment = amount.rewardsMoneyFragment;
            }
            return amount.copy(str, rewardsMoneyFragment);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.AmountAvailable amountAvailable = this.amountAvailable;
        java.lang.Object obj = this.pointsAvailable;
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.ExchangeRate exchangeRate = this.exchangeRate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RedeemablePointBalanceFragment(amountAvailable=");
        sb.append(amountAvailable);
        sb.append(", pointsAvailable=");
        sb.append(obj);
        sb.append(", exchangeRate=");
        sb.append(exchangeRate);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.amountAvailable.hashCode();
        int hashCode2 = this.pointsAvailable.hashCode();
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.ExchangeRate exchangeRate = this.exchangeRate;
        return (((hashCode * 31) + hashCode2) * 31) + (exchangeRate == null ? 0 : exchangeRate.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment redeemablePointBalanceFragment = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amountAvailable, redeemablePointBalanceFragment.amountAvailable) && kotlin.jvm.internal.Intrinsics.areEqual(this.pointsAvailable, redeemablePointBalanceFragment.pointsAvailable) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRate, redeemablePointBalanceFragment.exchangeRate);
    }

    public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment copy(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.AmountAvailable amountAvailable, java.lang.Object pointsAvailable, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.ExchangeRate exchangeRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountAvailable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointsAvailable, "");
        return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment(amountAvailable, pointsAvailable, exchangeRate);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.ExchangeRate getExchangeRate() {
        return this.exchangeRate;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getPointsAvailable() {
        return this.pointsAvailable;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.AmountAvailable getAmountAvailable() {
        return this.amountAvailable;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment redeemablePointBalanceFragment, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.AmountAvailable amountAvailable, java.lang.Object obj, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment.ExchangeRate exchangeRate, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            amountAvailable = redeemablePointBalanceFragment.amountAvailable;
        }
        if ((i & 2) != 0) {
            obj = redeemablePointBalanceFragment.pointsAvailable;
        }
        if ((i & 4) != 0) {
            exchangeRate = redeemablePointBalanceFragment.exchangeRate;
        }
        return redeemablePointBalanceFragment.copy(amountAvailable, obj, exchangeRate);
    }
}
