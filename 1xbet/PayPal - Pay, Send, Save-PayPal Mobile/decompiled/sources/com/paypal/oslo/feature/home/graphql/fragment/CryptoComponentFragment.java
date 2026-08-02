package com.paypal.oslo.feature.home.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001:\f\u001e\u001f !\"#$%&'()B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "__typename", "trackingId", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$Wallet;", com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$Wallet;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$Wallet;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$Wallet;)Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "getTrackingId", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$Wallet;", "getWallet", "Wallet", "CryptocurrencyHoldings", "TotalPortfolioValue", "SellableHolding", "GainOrLoss", "GainOrLossFiatAmount", "Holding", "AssetQuantity", "HoldingView", "FiatAmount", "RewardHolding", "RewardApy"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CryptoComponentFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String __typename;
    private final java.lang.String trackingId;
    private final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Wallet wallet;

    public CryptoComponentFragment(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Wallet wallet) {
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

    public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Wallet getWallet() {
        return this.wallet;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$Wallet;", "", "", "__typename", "accountId", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$CryptocurrencyHoldings;", "cryptocurrencyHoldings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$CryptocurrencyHoldings;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$CryptocurrencyHoldings;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$CryptocurrencyHoldings;)Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$Wallet;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "getAccountId", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$CryptocurrencyHoldings;", "getCryptocurrencyHoldings"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Wallet {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.String accountId;
        private final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.CryptocurrencyHoldings cryptocurrencyHoldings;

        public Wallet(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.CryptocurrencyHoldings cryptocurrencyHoldings) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.__typename = str;
            this.accountId = str2;
            this.cryptocurrencyHoldings = cryptocurrencyHoldings;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.CryptocurrencyHoldings getCryptocurrencyHoldings() {
            return this.cryptocurrencyHoldings;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.String str2 = this.accountId;
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.CryptocurrencyHoldings cryptocurrencyHoldings = this.cryptocurrencyHoldings;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wallet(__typename=");
            sb.append(str);
            sb.append(", accountId=");
            sb.append(str2);
            sb.append(", cryptocurrencyHoldings=");
            sb.append(cryptocurrencyHoldings);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            int hashCode2 = this.accountId.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.CryptocurrencyHoldings cryptocurrencyHoldings = this.cryptocurrencyHoldings;
            return (((hashCode * 31) + hashCode2) * 31) + (cryptocurrencyHoldings == null ? 0 : cryptocurrencyHoldings.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Wallet)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Wallet wallet = (com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Wallet) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, wallet.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, wallet.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptocurrencyHoldings, wallet.cryptocurrencyHoldings);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Wallet copy(java.lang.String __typename, java.lang.String accountId, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.CryptocurrencyHoldings cryptocurrencyHoldings) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountId, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Wallet(__typename, accountId, cryptocurrencyHoldings);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.CryptocurrencyHoldings getCryptocurrencyHoldings() {
            return this.cryptocurrencyHoldings;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Wallet copy$default(com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Wallet wallet, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.CryptocurrencyHoldings cryptocurrencyHoldings, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = wallet.__typename;
            }
            if ((i & 2) != 0) {
                str2 = wallet.accountId;
            }
            if ((i & 4) != 0) {
                cryptocurrencyHoldings = wallet.cryptocurrencyHoldings;
            }
            return wallet.copy(str, str2, cryptocurrencyHoldings);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$CryptocurrencyHoldings;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$TotalPortfolioValue;", "totalPortfolioValue", "", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$Holding;", "holdings", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$TotalPortfolioValue;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$TotalPortfolioValue;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$TotalPortfolioValue;Ljava/util/List;)Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$CryptocurrencyHoldings;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$TotalPortfolioValue;", "getTotalPortfolioValue", "Ljava/util/List;", "getHoldings"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CryptocurrencyHoldings {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Holding> holdings;
        private final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.TotalPortfolioValue totalPortfolioValue;

        public CryptocurrencyHoldings(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.TotalPortfolioValue totalPortfolioValue, java.util.List<com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Holding> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.totalPortfolioValue = totalPortfolioValue;
            this.holdings = list;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.TotalPortfolioValue getTotalPortfolioValue() {
            return this.totalPortfolioValue;
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Holding> getHoldings() {
            return this.holdings;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.TotalPortfolioValue totalPortfolioValue = this.totalPortfolioValue;
            java.util.List<com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Holding> list = this.holdings;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptocurrencyHoldings(__typename=");
            sb.append(str);
            sb.append(", totalPortfolioValue=");
            sb.append(totalPortfolioValue);
            sb.append(", holdings=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.TotalPortfolioValue totalPortfolioValue = this.totalPortfolioValue;
            int hashCode2 = totalPortfolioValue == null ? 0 : totalPortfolioValue.hashCode();
            java.util.List<com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Holding> list = this.holdings;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.CryptocurrencyHoldings)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.CryptocurrencyHoldings cryptocurrencyHoldings = (com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.CryptocurrencyHoldings) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, cryptocurrencyHoldings.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalPortfolioValue, cryptocurrencyHoldings.totalPortfolioValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.holdings, cryptocurrencyHoldings.holdings);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.CryptocurrencyHoldings copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.TotalPortfolioValue totalPortfolioValue, java.util.List<com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Holding> holdings) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.CryptocurrencyHoldings(__typename, totalPortfolioValue, holdings);
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Holding> component3() {
            return this.holdings;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.TotalPortfolioValue getTotalPortfolioValue() {
            return this.totalPortfolioValue;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.CryptocurrencyHoldings copy$default(com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.CryptocurrencyHoldings cryptocurrencyHoldings, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.TotalPortfolioValue totalPortfolioValue, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cryptocurrencyHoldings.__typename;
            }
            if ((i & 2) != 0) {
                totalPortfolioValue = cryptocurrencyHoldings.totalPortfolioValue;
            }
            if ((i & 4) != 0) {
                list = cryptocurrencyHoldings.holdings;
            }
            return cryptocurrencyHoldings.copy(str, totalPortfolioValue, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$TotalPortfolioValue;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$SellableHolding;", "sellableHolding", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$GainOrLoss;", "gainOrLoss", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$SellableHolding;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$GainOrLoss;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$SellableHolding;", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$GainOrLoss;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$SellableHolding;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$GainOrLoss;)Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$TotalPortfolioValue;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$SellableHolding;", "getSellableHolding", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$GainOrLoss;", "getGainOrLoss"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalPortfolioValue {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLoss gainOrLoss;
        private final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.SellableHolding sellableHolding;

        public TotalPortfolioValue(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.SellableHolding sellableHolding, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLoss gainOrLoss) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.sellableHolding = sellableHolding;
            this.gainOrLoss = gainOrLoss;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.SellableHolding getSellableHolding() {
            return this.sellableHolding;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLoss getGainOrLoss() {
            return this.gainOrLoss;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.SellableHolding sellableHolding = this.sellableHolding;
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLoss gainOrLoss = this.gainOrLoss;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalPortfolioValue(__typename=");
            sb.append(str);
            sb.append(", sellableHolding=");
            sb.append(sellableHolding);
            sb.append(", gainOrLoss=");
            sb.append(gainOrLoss);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.SellableHolding sellableHolding = this.sellableHolding;
            int hashCode2 = sellableHolding == null ? 0 : sellableHolding.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLoss gainOrLoss = this.gainOrLoss;
            return (((hashCode * 31) + hashCode2) * 31) + (gainOrLoss != null ? gainOrLoss.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.TotalPortfolioValue)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.TotalPortfolioValue totalPortfolioValue = (com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.TotalPortfolioValue) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalPortfolioValue.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.sellableHolding, totalPortfolioValue.sellableHolding) && kotlin.jvm.internal.Intrinsics.areEqual(this.gainOrLoss, totalPortfolioValue.gainOrLoss);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.TotalPortfolioValue copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.SellableHolding sellableHolding, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLoss gainOrLoss) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.TotalPortfolioValue(__typename, sellableHolding, gainOrLoss);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLoss getGainOrLoss() {
            return this.gainOrLoss;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.SellableHolding getSellableHolding() {
            return this.sellableHolding;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.TotalPortfolioValue copy$default(com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.TotalPortfolioValue totalPortfolioValue, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.SellableHolding sellableHolding, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLoss gainOrLoss, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = totalPortfolioValue.__typename;
            }
            if ((i & 2) != 0) {
                sellableHolding = totalPortfolioValue.sellableHolding;
            }
            if ((i & 4) != 0) {
                gainOrLoss = totalPortfolioValue.gainOrLoss;
            }
            return totalPortfolioValue.copy(str, sellableHolding, gainOrLoss);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$SellableHolding;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$SellableHolding;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SellableHolding {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;

        public SellableHolding(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            this.__typename = str;
            this.moneyFragment = moneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment = this.moneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SellableHolding(__typename=");
            sb.append(str);
            sb.append(", moneyFragment=");
            sb.append(moneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.moneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.SellableHolding)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.SellableHolding sellableHolding = (com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.SellableHolding) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, sellableHolding.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, sellableHolding.moneyFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.SellableHolding copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.SellableHolding(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.SellableHolding copy$default(com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.SellableHolding sellableHolding, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sellableHolding.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = sellableHolding.moneyFragment;
            }
            return sellableHolding.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J>\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$GainOrLoss;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$GainOrLossFiatAmount;", "gainOrLossFiatAmount", "gainOrLossPercent", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;", "gainOrLossStatus", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$GainOrLossFiatAmount;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$GainOrLossFiatAmount;", "component3", "()Ljava/lang/Object;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$GainOrLossFiatAmount;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;)Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$GainOrLoss;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$GainOrLossFiatAmount;", "getGainOrLossFiatAmount", "Ljava/lang/Object;", "getGainOrLossPercent", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;", "getGainOrLossStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GainOrLoss {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLossFiatAmount gainOrLossFiatAmount;
        private final java.lang.Object gainOrLossPercent;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus gainOrLossStatus;

        public GainOrLoss(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLossFiatAmount gainOrLossFiatAmount, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.gainOrLossFiatAmount = gainOrLossFiatAmount;
            this.gainOrLossPercent = obj;
            this.gainOrLossStatus = cryptocurrencyGainOrLossStatus;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLossFiatAmount getGainOrLossFiatAmount() {
            return this.gainOrLossFiatAmount;
        }

        public final java.lang.Object getGainOrLossPercent() {
            return this.gainOrLossPercent;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus getGainOrLossStatus() {
            return this.gainOrLossStatus;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLossFiatAmount gainOrLossFiatAmount = this.gainOrLossFiatAmount;
            java.lang.Object obj = this.gainOrLossPercent;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus = this.gainOrLossStatus;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GainOrLoss(__typename=");
            sb.append(str);
            sb.append(", gainOrLossFiatAmount=");
            sb.append(gainOrLossFiatAmount);
            sb.append(", gainOrLossPercent=");
            sb.append(obj);
            sb.append(", gainOrLossStatus=");
            sb.append(cryptocurrencyGainOrLossStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLossFiatAmount gainOrLossFiatAmount = this.gainOrLossFiatAmount;
            int hashCode2 = gainOrLossFiatAmount == null ? 0 : gainOrLossFiatAmount.hashCode();
            java.lang.Object obj = this.gainOrLossPercent;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus = this.gainOrLossStatus;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (cryptocurrencyGainOrLossStatus != null ? cryptocurrencyGainOrLossStatus.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLoss)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLoss gainOrLoss = (com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLoss) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, gainOrLoss.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.gainOrLossFiatAmount, gainOrLoss.gainOrLossFiatAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.gainOrLossPercent, gainOrLoss.gainOrLossPercent) && this.gainOrLossStatus == gainOrLoss.gainOrLossStatus;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLoss copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLossFiatAmount gainOrLossFiatAmount, java.lang.Object gainOrLossPercent, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus gainOrLossStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLoss(__typename, gainOrLossFiatAmount, gainOrLossPercent, gainOrLossStatus);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus getGainOrLossStatus() {
            return this.gainOrLossStatus;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getGainOrLossPercent() {
            return this.gainOrLossPercent;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLossFiatAmount getGainOrLossFiatAmount() {
            return this.gainOrLossFiatAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLoss copy$default(com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLoss gainOrLoss, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLossFiatAmount gainOrLossFiatAmount, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = gainOrLoss.__typename;
            }
            if ((i & 2) != 0) {
                gainOrLossFiatAmount = gainOrLoss.gainOrLossFiatAmount;
            }
            if ((i & 4) != 0) {
                obj = gainOrLoss.gainOrLossPercent;
            }
            if ((i & 8) != 0) {
                cryptocurrencyGainOrLossStatus = gainOrLoss.gainOrLossStatus;
            }
            return gainOrLoss.copy(str, gainOrLossFiatAmount, obj, cryptocurrencyGainOrLossStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$GainOrLossFiatAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$GainOrLossFiatAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GainOrLossFiatAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;

        public GainOrLossFiatAmount(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            this.__typename = str;
            this.moneyFragment = moneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment = this.moneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GainOrLossFiatAmount(__typename=");
            sb.append(str);
            sb.append(", moneyFragment=");
            sb.append(moneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.moneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLossFiatAmount)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLossFiatAmount gainOrLossFiatAmount = (com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLossFiatAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, gainOrLossFiatAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, gainOrLossFiatAmount.moneyFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLossFiatAmount copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLossFiatAmount(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLossFiatAmount copy$default(com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLossFiatAmount gainOrLossFiatAmount, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = gainOrLossFiatAmount.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = gainOrLossFiatAmount.moneyFragment;
            }
            return gainOrLossFiatAmount.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$Holding;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$AssetQuantity;", "assetQuantity", "", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$HoldingView;", "holdingViews", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$RewardHolding;", "rewardHolding", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$AssetQuantity;Ljava/util/List;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$RewardHolding;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$AssetQuantity;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$RewardHolding;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$AssetQuantity;Ljava/util/List;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$RewardHolding;)Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$Holding;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$AssetQuantity;", "getAssetQuantity", "Ljava/util/List;", "getHoldingViews", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$RewardHolding;", "getRewardHolding"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Holding {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.AssetQuantity assetQuantity;
        private final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.HoldingView> holdingViews;
        private final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardHolding rewardHolding;

        public Holding(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.AssetQuantity assetQuantity, java.util.List<com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.HoldingView> list, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardHolding rewardHolding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.assetQuantity = assetQuantity;
            this.holdingViews = list;
            this.rewardHolding = rewardHolding;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.AssetQuantity getAssetQuantity() {
            return this.assetQuantity;
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.HoldingView> getHoldingViews() {
            return this.holdingViews;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardHolding getRewardHolding() {
            return this.rewardHolding;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.AssetQuantity assetQuantity = this.assetQuantity;
            java.util.List<com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.HoldingView> list = this.holdingViews;
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardHolding rewardHolding = this.rewardHolding;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Holding(__typename=");
            sb.append(str);
            sb.append(", assetQuantity=");
            sb.append(assetQuantity);
            sb.append(", holdingViews=");
            sb.append(list);
            sb.append(", rewardHolding=");
            sb.append(rewardHolding);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.AssetQuantity assetQuantity = this.assetQuantity;
            int hashCode2 = assetQuantity == null ? 0 : assetQuantity.hashCode();
            java.util.List<com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.HoldingView> list = this.holdingViews;
            int hashCode3 = list == null ? 0 : list.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardHolding rewardHolding = this.rewardHolding;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (rewardHolding != null ? rewardHolding.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Holding)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Holding holding = (com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Holding) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, holding.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetQuantity, holding.assetQuantity) && kotlin.jvm.internal.Intrinsics.areEqual(this.holdingViews, holding.holdingViews) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardHolding, holding.rewardHolding);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Holding copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.AssetQuantity assetQuantity, java.util.List<com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.HoldingView> holdingViews, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardHolding rewardHolding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Holding(__typename, assetQuantity, holdingViews, rewardHolding);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardHolding getRewardHolding() {
            return this.rewardHolding;
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.HoldingView> component3() {
            return this.holdingViews;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.AssetQuantity getAssetQuantity() {
            return this.assetQuantity;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Holding copy$default(com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Holding holding, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.AssetQuantity assetQuantity, java.util.List list, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardHolding rewardHolding, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = holding.__typename;
            }
            if ((i & 2) != 0) {
                assetQuantity = holding.assetQuantity;
            }
            if ((i & 4) != 0) {
                list = holding.holdingViews;
            }
            if ((i & 8) != 0) {
                rewardHolding = holding.rewardHolding;
            }
            return holding.copy(str, assetQuantity, list, rewardHolding);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$AssetQuantity;", "", "", "__typename", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;)Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$AssetQuantity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "getAssetSymbol"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AssetQuantity {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;

        public AssetQuantity(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyAssetSymbol, "");
            this.__typename = str;
            this.assetSymbol = cryptocurrencyAssetSymbol;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = this.assetSymbol;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AssetQuantity(__typename=");
            sb.append(str);
            sb.append(", assetSymbol=");
            sb.append(cryptocurrencyAssetSymbol);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.assetSymbol.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.AssetQuantity)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.AssetQuantity assetQuantity = (com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.AssetQuantity) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, assetQuantity.__typename) && this.assetSymbol == assetQuantity.assetSymbol;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.AssetQuantity copy(java.lang.String __typename, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.AssetQuantity(__typename, assetSymbol);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.AssetQuantity copy$default(com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.AssetQuantity assetQuantity, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = assetQuantity.__typename;
            }
            if ((i & 2) != 0) {
                cryptocurrencyAssetSymbol = assetQuantity.assetSymbol;
            }
            return assetQuantity.copy(str, cryptocurrencyAssetSymbol);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$HoldingView;", "", "", "__typename", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyHoldingViewType;", "type", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$FiatAmount;", "fiatAmount", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyHoldingViewType;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$FiatAmount;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyHoldingViewType;", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$FiatAmount;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyHoldingViewType;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$FiatAmount;)Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$HoldingView;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyHoldingViewType;", "getType", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$FiatAmount;", "getFiatAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HoldingView {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.FiatAmount fiatAmount;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyHoldingViewType type;

        public HoldingView(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyHoldingViewType cryptocurrencyHoldingViewType, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.FiatAmount fiatAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.type = cryptocurrencyHoldingViewType;
            this.fiatAmount = fiatAmount;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyHoldingViewType getType() {
            return this.type;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.FiatAmount getFiatAmount() {
            return this.fiatAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyHoldingViewType cryptocurrencyHoldingViewType = this.type;
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.FiatAmount fiatAmount = this.fiatAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HoldingView(__typename=");
            sb.append(str);
            sb.append(", type=");
            sb.append(cryptocurrencyHoldingViewType);
            sb.append(", fiatAmount=");
            sb.append(fiatAmount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyHoldingViewType cryptocurrencyHoldingViewType = this.type;
            int hashCode2 = cryptocurrencyHoldingViewType == null ? 0 : cryptocurrencyHoldingViewType.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.FiatAmount fiatAmount = this.fiatAmount;
            return (((hashCode * 31) + hashCode2) * 31) + (fiatAmount != null ? fiatAmount.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.HoldingView)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.HoldingView holdingView = (com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.HoldingView) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, holdingView.__typename) && this.type == holdingView.type && kotlin.jvm.internal.Intrinsics.areEqual(this.fiatAmount, holdingView.fiatAmount);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.HoldingView copy(java.lang.String __typename, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyHoldingViewType type, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.FiatAmount fiatAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.HoldingView(__typename, type, fiatAmount);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.FiatAmount getFiatAmount() {
            return this.fiatAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyHoldingViewType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.HoldingView copy$default(com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.HoldingView holdingView, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyHoldingViewType cryptocurrencyHoldingViewType, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.FiatAmount fiatAmount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = holdingView.__typename;
            }
            if ((i & 2) != 0) {
                cryptocurrencyHoldingViewType = holdingView.type;
            }
            if ((i & 4) != 0) {
                fiatAmount = holdingView.fiatAmount;
            }
            return holdingView.copy(str, cryptocurrencyHoldingViewType, fiatAmount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$FiatAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$FiatAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FiatAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;

        public FiatAmount(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            this.__typename = str;
            this.moneyFragment = moneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment = this.moneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FiatAmount(__typename=");
            sb.append(str);
            sb.append(", moneyFragment=");
            sb.append(moneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.moneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.FiatAmount)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.FiatAmount fiatAmount = (com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.FiatAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, fiatAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, fiatAmount.moneyFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.FiatAmount copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.FiatAmount(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.FiatAmount copy$default(com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.FiatAmount fiatAmount, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fiatAmount.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = fiatAmount.moneyFragment;
            }
            return fiatAmount.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$RewardHolding;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$RewardApy;", "rewardApy", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$RewardApy;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$RewardApy;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$RewardApy;)Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$RewardHolding;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$RewardApy;", "getRewardApy"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RewardHolding {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardApy rewardApy;

        public RewardHolding(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardApy rewardApy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.rewardApy = rewardApy;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardApy getRewardApy() {
            return this.rewardApy;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardApy rewardApy = this.rewardApy;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RewardHolding(__typename=");
            sb.append(str);
            sb.append(", rewardApy=");
            sb.append(rewardApy);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardApy rewardApy = this.rewardApy;
            return (hashCode * 31) + (rewardApy == null ? 0 : rewardApy.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardHolding)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardHolding rewardHolding = (com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardHolding) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, rewardHolding.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardApy, rewardHolding.rewardApy);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardHolding copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardApy rewardApy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardHolding(__typename, rewardApy);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardApy getRewardApy() {
            return this.rewardApy;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardHolding copy$default(com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardHolding rewardHolding, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardApy rewardApy, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = rewardHolding.__typename;
            }
            if ((i & 2) != 0) {
                rewardApy = rewardHolding.rewardApy;
            }
            return rewardHolding.copy(str, rewardApy);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$RewardApy;", "", "", "__typename", "rate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$RewardApy;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "getRate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RewardApy {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final java.lang.String rate;

        public RewardApy(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.rate = str2;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String getRate() {
            return this.rate;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.String str2 = this.rate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RewardApy(__typename=");
            sb.append(str);
            sb.append(", rate=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            java.lang.String str = this.rate;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardApy)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardApy rewardApy = (com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardApy) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, rewardApy.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.rate, rewardApy.rate);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardApy copy(java.lang.String __typename, java.lang.String rate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardApy(__typename, rate);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRate() {
            return this.rate;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardApy copy$default(com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.RewardApy rewardApy, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = rewardApy.__typename;
            }
            if ((i & 2) != 0) {
                str2 = rewardApy.rate;
            }
            return rewardApy.copy(str, str2);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.__typename;
        java.lang.String str2 = this.trackingId;
        com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Wallet wallet = this.wallet;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoComponentFragment(__typename=");
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
        com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Wallet wallet = this.wallet;
        return (((hashCode * 31) + hashCode2) * 31) + (wallet != null ? wallet.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment)) {
            return false;
        }
        com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment cryptoComponentFragment = (com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, cryptoComponentFragment.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingId, cryptoComponentFragment.trackingId) && kotlin.jvm.internal.Intrinsics.areEqual(this.wallet, cryptoComponentFragment.wallet);
    }

    public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment copy(java.lang.String __typename, java.lang.String trackingId, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Wallet wallet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
        return new com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment(__typename, trackingId, wallet);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Wallet getWallet() {
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

    public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment copy$default(com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment cryptoComponentFragment, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Wallet wallet, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cryptoComponentFragment.__typename;
        }
        if ((i & 2) != 0) {
            str2 = cryptoComponentFragment.trackingId;
        }
        if ((i & 4) != 0) {
            wallet = cryptoComponentFragment.wallet;
        }
        return cryptoComponentFragment.copy(str, str2, wallet);
    }
}
