package com.paypal.oslo.feature.home.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u001b\u001c\u001d\u001eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Wallet;", com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Wallet;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Wallet;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Wallet;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Wallet;", "getWallet", "Wallet", "RevolvingCredit", "Rewardsus", "Rewardsnba"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CreditConsumerRewardsComponentFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String __typename;
    private final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Wallet wallet;

    public CreditConsumerRewardsComponentFragment(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Wallet wallet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.__typename = str;
        this.wallet = wallet;
    }

    public final java.lang.String get__typename() {
        return this.__typename;
    }

    public final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Wallet getWallet() {
        return this.wallet;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Wallet;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$RevolvingCredit;", "revolvingCredit", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$RevolvingCredit;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$RevolvingCredit;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$RevolvingCredit;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Wallet;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$RevolvingCredit;", "getRevolvingCredit", "getRevolvingCredit$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Wallet {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.RevolvingCredit revolvingCredit;

        @kotlin.Deprecated(message = "Use the credit component `revolvingCreditProductOverview` field instead.")
        public static /* synthetic */ void getRevolvingCredit$annotations() {
        }

        public Wallet(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.RevolvingCredit revolvingCredit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.revolvingCredit = revolvingCredit;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.RevolvingCredit getRevolvingCredit() {
            return this.revolvingCredit;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.RevolvingCredit revolvingCredit = this.revolvingCredit;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wallet(__typename=");
            sb.append(str);
            sb.append(", revolvingCredit=");
            sb.append(revolvingCredit);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.RevolvingCredit revolvingCredit = this.revolvingCredit;
            return (hashCode * 31) + (revolvingCredit == null ? 0 : revolvingCredit.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Wallet)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Wallet wallet = (com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Wallet) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, wallet.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCredit, wallet.revolvingCredit);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Wallet copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.RevolvingCredit revolvingCredit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Wallet(__typename, revolvingCredit);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.RevolvingCredit getRevolvingCredit() {
            return this.revolvingCredit;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Wallet copy$default(com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Wallet wallet, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.RevolvingCredit revolvingCredit, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = wallet.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCredit = wallet.revolvingCredit;
            }
            return wallet.copy(str, revolvingCredit);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$RevolvingCredit;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Rewardsus;", "rewardsus", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Rewardsnba;", "rewardsnba", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Rewardsus;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Rewardsnba;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Rewardsus;", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Rewardsnba;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Rewardsus;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Rewardsnba;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$RevolvingCredit;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Rewardsus;", "getRewardsus", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Rewardsnba;", "getRewardsnba"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCredit {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsnba rewardsnba;
        private final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsus rewardsus;

        public RevolvingCredit(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsus rewardsus, com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsnba rewardsnba) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.rewardsus = rewardsus;
            this.rewardsnba = rewardsnba;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsus getRewardsus() {
            return this.rewardsus;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsnba getRewardsnba() {
            return this.rewardsnba;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsus rewardsus = this.rewardsus;
            com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsnba rewardsnba = this.rewardsnba;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCredit(__typename=");
            sb.append(str);
            sb.append(", rewardsus=");
            sb.append(rewardsus);
            sb.append(", rewardsnba=");
            sb.append(rewardsnba);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsus rewardsus = this.rewardsus;
            int hashCode2 = rewardsus == null ? 0 : rewardsus.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsnba rewardsnba = this.rewardsnba;
            return (((hashCode * 31) + hashCode2) * 31) + (rewardsnba != null ? rewardsnba.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.RevolvingCredit)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.RevolvingCredit revolvingCredit = (com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.RevolvingCredit) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCredit.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsus, revolvingCredit.rewardsus) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsnba, revolvingCredit.rewardsnba);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.RevolvingCredit copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsus rewardsus, com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsnba rewardsnba) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.RevolvingCredit(__typename, rewardsus, rewardsnba);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsnba getRewardsnba() {
            return this.rewardsnba;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsus getRewardsus() {
            return this.rewardsus;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.RevolvingCredit copy$default(com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.RevolvingCredit revolvingCredit, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsus rewardsus, com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsnba rewardsnba, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = revolvingCredit.__typename;
            }
            if ((i & 2) != 0) {
                rewardsus = revolvingCredit.rewardsus;
            }
            if ((i & 4) != 0) {
                rewardsnba = revolvingCredit.rewardsnba;
            }
            return revolvingCredit.copy(str, rewardsus, rewardsnba);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Rewardsus;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditAccountFields;", "homeCreditAccountFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditAccountFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditAccountFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditAccountFields;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Rewardsus;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditAccountFields;", "getHomeCreditAccountFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Rewardsus {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields homeCreditAccountFields;

        public Rewardsus(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields homeCreditAccountFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeCreditAccountFields, "");
            this.__typename = str;
            this.homeCreditAccountFields = homeCreditAccountFields;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields getHomeCreditAccountFields() {
            return this.homeCreditAccountFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields homeCreditAccountFields = this.homeCreditAccountFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Rewardsus(__typename=");
            sb.append(str);
            sb.append(", homeCreditAccountFields=");
            sb.append(homeCreditAccountFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.homeCreditAccountFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsus)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsus rewardsus = (com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsus) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, rewardsus.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.homeCreditAccountFields, rewardsus.homeCreditAccountFields);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsus copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields homeCreditAccountFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeCreditAccountFields, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsus(__typename, homeCreditAccountFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields getHomeCreditAccountFields() {
            return this.homeCreditAccountFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsus copy$default(com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsus rewardsus, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields homeCreditAccountFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = rewardsus.__typename;
            }
            if ((i & 2) != 0) {
                homeCreditAccountFields = rewardsus.homeCreditAccountFields;
            }
            return rewardsus.copy(str, homeCreditAccountFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Rewardsnba;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields;", "homeCreditNextBestActionFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$Rewardsnba;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields;", "getHomeCreditNextBestActionFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Rewardsnba {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields homeCreditNextBestActionFields;

        public Rewardsnba(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields homeCreditNextBestActionFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeCreditNextBestActionFields, "");
            this.__typename = str;
            this.homeCreditNextBestActionFields = homeCreditNextBestActionFields;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields getHomeCreditNextBestActionFields() {
            return this.homeCreditNextBestActionFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields homeCreditNextBestActionFields = this.homeCreditNextBestActionFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Rewardsnba(__typename=");
            sb.append(str);
            sb.append(", homeCreditNextBestActionFields=");
            sb.append(homeCreditNextBestActionFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.homeCreditNextBestActionFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsnba)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsnba rewardsnba = (com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsnba) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, rewardsnba.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.homeCreditNextBestActionFields, rewardsnba.homeCreditNextBestActionFields);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsnba copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields homeCreditNextBestActionFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeCreditNextBestActionFields, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsnba(__typename, homeCreditNextBestActionFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields getHomeCreditNextBestActionFields() {
            return this.homeCreditNextBestActionFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsnba copy$default(com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsnba rewardsnba, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields homeCreditNextBestActionFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = rewardsnba.__typename;
            }
            if ((i & 2) != 0) {
                homeCreditNextBestActionFields = rewardsnba.homeCreditNextBestActionFields;
            }
            return rewardsnba.copy(str, homeCreditNextBestActionFields);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.__typename;
        com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Wallet wallet = this.wallet;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreditConsumerRewardsComponentFragment(__typename=");
        sb.append(str);
        sb.append(", wallet=");
        sb.append(wallet);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.__typename.hashCode();
        com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Wallet wallet = this.wallet;
        return (hashCode * 31) + (wallet == null ? 0 : wallet.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment)) {
            return false;
        }
        com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment creditConsumerRewardsComponentFragment = (com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, creditConsumerRewardsComponentFragment.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.wallet, creditConsumerRewardsComponentFragment.wallet);
    }

    public final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Wallet wallet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
        return new com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment(__typename, wallet);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Wallet getWallet() {
        return this.wallet;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String get__typename() {
        return this.__typename;
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment copy$default(com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment creditConsumerRewardsComponentFragment, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Wallet wallet, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = creditConsumerRewardsComponentFragment.__typename;
        }
        if ((i & 2) != 0) {
            wallet = creditConsumerRewardsComponentFragment.wallet;
        }
        return creditConsumerRewardsComponentFragment.copy(str, wallet);
    }
}
