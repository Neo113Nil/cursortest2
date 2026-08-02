package com.paypal.oslo.feature.home.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001:\t\u001e\u001f !\"#$%&B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "__typename", "trackingId", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Wallet;", com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Wallet;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Wallet;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Wallet;)Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "getTrackingId", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Wallet;", "getWallet", "Wallet", "Balances", "TotalAvailableAmount", "TotalReservedAmount", "MoneyOnHoldAmount", "TaxOnHoldAmount", "Item", "Available", "Amount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BalanceComponentFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String __typename;
    private final java.lang.String trackingId;
    private final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Wallet wallet;

    public BalanceComponentFragment(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Wallet wallet) {
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

    public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Wallet getWallet() {
        return this.wallet;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Wallet;", "", "", "__typename", "accountId", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Balances;", "balances", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Balances;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Balances;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Balances;)Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Wallet;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "getAccountId", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Balances;", "getBalances"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Wallet {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.String accountId;
        private final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances balances;

        public Wallet(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances balances) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balances, "");
            this.__typename = str;
            this.accountId = str2;
            this.balances = balances;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances getBalances() {
            return this.balances;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.String str2 = this.accountId;
            com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances balances = this.balances;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wallet(__typename=");
            sb.append(str);
            sb.append(", accountId=");
            sb.append(str2);
            sb.append(", balances=");
            sb.append(balances);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.__typename.hashCode() * 31) + this.accountId.hashCode()) * 31) + this.balances.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Wallet)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Wallet wallet = (com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Wallet) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, wallet.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, wallet.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.balances, wallet.balances);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Wallet copy(java.lang.String __typename, java.lang.String accountId, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances balances) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balances, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Wallet(__typename, accountId, balances);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances getBalances() {
            return this.balances;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Wallet copy$default(com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Wallet wallet, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances balances, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = wallet.__typename;
            }
            if ((i & 2) != 0) {
                str2 = wallet.accountId;
            }
            if ((i & 4) != 0) {
                balances = wallet.balances;
            }
            return wallet.copy(str, str2, balances);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$Jz\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b8\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b;\u0010\u001cR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\b=\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Balances;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TotalAvailableAmount;", "totalAvailableAmount", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TotalReservedAmount;", "totalReservedAmount", "", "hasMoneyOnHold", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$MoneyOnHoldAmount;", "moneyOnHoldAmount", "hasTaxOnHold", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TaxOnHoldAmount;", "taxOnHoldAmount", "prepaidStatus", "", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Item;", "items", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TotalAvailableAmount;Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TotalReservedAmount;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$MoneyOnHoldAmount;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TaxOnHoldAmount;Ljava/lang/Boolean;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TotalAvailableAmount;", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TotalReservedAmount;", "component4", "()Ljava/lang/Boolean;", "component5", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$MoneyOnHoldAmount;", "component6", "component7", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TaxOnHoldAmount;", "component8", "component9", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TotalAvailableAmount;Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TotalReservedAmount;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$MoneyOnHoldAmount;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TaxOnHoldAmount;Ljava/lang/Boolean;Ljava/util/List;)Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Balances;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TotalAvailableAmount;", "getTotalAvailableAmount", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TotalReservedAmount;", "getTotalReservedAmount", "Ljava/lang/Boolean;", "getHasMoneyOnHold", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$MoneyOnHoldAmount;", "getMoneyOnHoldAmount", "getHasTaxOnHold", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TaxOnHoldAmount;", "getTaxOnHoldAmount", "getPrepaidStatus", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Balances {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Boolean hasMoneyOnHold;
        private final java.lang.Boolean hasTaxOnHold;
        private final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Item> items;
        private final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.MoneyOnHoldAmount moneyOnHoldAmount;
        private final java.lang.Boolean prepaidStatus;
        private final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TaxOnHoldAmount taxOnHoldAmount;
        private final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalAvailableAmount totalAvailableAmount;
        private final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalReservedAmount totalReservedAmount;

        public Balances(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalAvailableAmount totalAvailableAmount, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalReservedAmount totalReservedAmount, java.lang.Boolean bool, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.MoneyOnHoldAmount moneyOnHoldAmount, java.lang.Boolean bool2, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TaxOnHoldAmount taxOnHoldAmount, java.lang.Boolean bool3, java.util.List<com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAvailableAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalReservedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.__typename = str;
            this.totalAvailableAmount = totalAvailableAmount;
            this.totalReservedAmount = totalReservedAmount;
            this.hasMoneyOnHold = bool;
            this.moneyOnHoldAmount = moneyOnHoldAmount;
            this.hasTaxOnHold = bool2;
            this.taxOnHoldAmount = taxOnHoldAmount;
            this.prepaidStatus = bool3;
            this.items = list;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalAvailableAmount getTotalAvailableAmount() {
            return this.totalAvailableAmount;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalReservedAmount getTotalReservedAmount() {
            return this.totalReservedAmount;
        }

        public final java.lang.Boolean getHasMoneyOnHold() {
            return this.hasMoneyOnHold;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.MoneyOnHoldAmount getMoneyOnHoldAmount() {
            return this.moneyOnHoldAmount;
        }

        public final java.lang.Boolean getHasTaxOnHold() {
            return this.hasTaxOnHold;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TaxOnHoldAmount getTaxOnHoldAmount() {
            return this.taxOnHoldAmount;
        }

        public final java.lang.Boolean getPrepaidStatus() {
            return this.prepaidStatus;
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalAvailableAmount totalAvailableAmount = this.totalAvailableAmount;
            com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalReservedAmount totalReservedAmount = this.totalReservedAmount;
            java.lang.Boolean bool = this.hasMoneyOnHold;
            com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.MoneyOnHoldAmount moneyOnHoldAmount = this.moneyOnHoldAmount;
            java.lang.Boolean bool2 = this.hasTaxOnHold;
            com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TaxOnHoldAmount taxOnHoldAmount = this.taxOnHoldAmount;
            java.lang.Boolean bool3 = this.prepaidStatus;
            java.util.List<com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Balances(__typename=");
            sb.append(str);
            sb.append(", totalAvailableAmount=");
            sb.append(totalAvailableAmount);
            sb.append(", totalReservedAmount=");
            sb.append(totalReservedAmount);
            sb.append(", hasMoneyOnHold=");
            sb.append(bool);
            sb.append(", moneyOnHoldAmount=");
            sb.append(moneyOnHoldAmount);
            sb.append(", hasTaxOnHold=");
            sb.append(bool2);
            sb.append(", taxOnHoldAmount=");
            sb.append(taxOnHoldAmount);
            sb.append(", prepaidStatus=");
            sb.append(bool3);
            sb.append(", items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            int hashCode2 = this.totalAvailableAmount.hashCode();
            int hashCode3 = this.totalReservedAmount.hashCode();
            java.lang.Boolean bool = this.hasMoneyOnHold;
            int hashCode4 = bool == null ? 0 : bool.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.MoneyOnHoldAmount moneyOnHoldAmount = this.moneyOnHoldAmount;
            int hashCode5 = moneyOnHoldAmount == null ? 0 : moneyOnHoldAmount.hashCode();
            java.lang.Boolean bool2 = this.hasTaxOnHold;
            int hashCode6 = bool2 == null ? 0 : bool2.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TaxOnHoldAmount taxOnHoldAmount = this.taxOnHoldAmount;
            int hashCode7 = taxOnHoldAmount == null ? 0 : taxOnHoldAmount.hashCode();
            java.lang.Boolean bool3 = this.prepaidStatus;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (bool3 != null ? bool3.hashCode() : 0)) * 31) + this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances balances = (com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, balances.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAvailableAmount, balances.totalAvailableAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalReservedAmount, balances.totalReservedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.hasMoneyOnHold, balances.hasMoneyOnHold) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyOnHoldAmount, balances.moneyOnHoldAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.hasTaxOnHold, balances.hasTaxOnHold) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxOnHoldAmount, balances.taxOnHoldAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.prepaidStatus, balances.prepaidStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, balances.items);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalAvailableAmount totalAvailableAmount, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalReservedAmount totalReservedAmount, java.lang.Boolean hasMoneyOnHold, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.MoneyOnHoldAmount moneyOnHoldAmount, java.lang.Boolean hasTaxOnHold, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TaxOnHoldAmount taxOnHoldAmount, java.lang.Boolean prepaidStatus, java.util.List<com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAvailableAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalReservedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances(__typename, totalAvailableAmount, totalReservedAmount, hasMoneyOnHold, moneyOnHoldAmount, hasTaxOnHold, taxOnHoldAmount, prepaidStatus, items);
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Item> component9() {
            return this.items;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Boolean getPrepaidStatus() {
            return this.prepaidStatus;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TaxOnHoldAmount getTaxOnHoldAmount() {
            return this.taxOnHoldAmount;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Boolean getHasTaxOnHold() {
            return this.hasTaxOnHold;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.MoneyOnHoldAmount getMoneyOnHoldAmount() {
            return this.moneyOnHoldAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Boolean getHasMoneyOnHold() {
            return this.hasMoneyOnHold;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalReservedAmount getTotalReservedAmount() {
            return this.totalReservedAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalAvailableAmount getTotalAvailableAmount() {
            return this.totalAvailableAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TotalAvailableAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TotalAvailableAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalAvailableAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;

        public TotalAvailableAmount(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalAvailableAmount(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalAvailableAmount)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalAvailableAmount totalAvailableAmount = (com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalAvailableAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalAvailableAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, totalAvailableAmount.moneyFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalAvailableAmount copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalAvailableAmount(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalAvailableAmount copy$default(com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalAvailableAmount totalAvailableAmount, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = totalAvailableAmount.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = totalAvailableAmount.moneyFragment;
            }
            return totalAvailableAmount.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TotalReservedAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TotalReservedAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalReservedAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;

        public TotalReservedAmount(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalReservedAmount(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalReservedAmount)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalReservedAmount totalReservedAmount = (com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalReservedAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalReservedAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, totalReservedAmount.moneyFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalReservedAmount copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalReservedAmount(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalReservedAmount copy$default(com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalReservedAmount totalReservedAmount, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = totalReservedAmount.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = totalReservedAmount.moneyFragment;
            }
            return totalReservedAmount.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$MoneyOnHoldAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$MoneyOnHoldAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoneyOnHoldAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;

        public MoneyOnHoldAmount(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MoneyOnHoldAmount(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.MoneyOnHoldAmount)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.MoneyOnHoldAmount moneyOnHoldAmount = (com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.MoneyOnHoldAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, moneyOnHoldAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, moneyOnHoldAmount.moneyFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.MoneyOnHoldAmount copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.MoneyOnHoldAmount(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.MoneyOnHoldAmount copy$default(com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.MoneyOnHoldAmount moneyOnHoldAmount, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = moneyOnHoldAmount.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = moneyOnHoldAmount.moneyFragment;
            }
            return moneyOnHoldAmount.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TaxOnHoldAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$TaxOnHoldAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TaxOnHoldAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;

        public TaxOnHoldAmount(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TaxOnHoldAmount(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TaxOnHoldAmount)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TaxOnHoldAmount taxOnHoldAmount = (com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TaxOnHoldAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, taxOnHoldAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, taxOnHoldAmount.moneyFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TaxOnHoldAmount copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TaxOnHoldAmount(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TaxOnHoldAmount copy$default(com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TaxOnHoldAmount taxOnHoldAmount, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taxOnHoldAmount.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = taxOnHoldAmount.moneyFragment;
            }
            return taxOnHoldAmount.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Item;", "", "", "__typename", "id", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Available;", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Available;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Available;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Available;)Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "getId", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Available;", "getAvailable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Available available;
        private final java.lang.String id;

        public Item(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Available available) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(available, "");
            this.__typename = str;
            this.id = str2;
            this.available = available;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Available getAvailable() {
            return this.available;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.String str2 = this.id;
            com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Available available = this.available;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(__typename=");
            sb.append(str);
            sb.append(", id=");
            sb.append(str2);
            sb.append(", available=");
            sb.append(available);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.__typename.hashCode() * 31) + this.id.hashCode()) * 31) + this.available.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Item)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Item item = (com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, item.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, item.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.available, item.available);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Item copy(java.lang.String __typename, java.lang.String id, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Available available) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(available, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Item(__typename, id, available);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Available getAvailable() {
            return this.available;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Item copy$default(com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Item item, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Available available, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.__typename;
            }
            if ((i & 2) != 0) {
                str2 = item.id;
            }
            if ((i & 4) != 0) {
                available = item.available;
            }
            return item.copy(str, str2, available);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Available;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Amount;", "amount", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Amount;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Amount;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Amount;)Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Available;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Amount;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Available {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Amount amount;

        public Available(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Amount amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            this.__typename = str;
            this.amount = amount;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Amount getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Amount amount = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Available(__typename=");
            sb.append(str);
            sb.append(", amount=");
            sb.append(amount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Available)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Available available = (com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Available) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, available.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, available.amount);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Available copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Amount amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Available(__typename, amount);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Amount getAmount() {
            return this.amount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Available copy$default(com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Available available, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Amount amount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = available.__typename;
            }
            if ((i & 2) != 0) {
                amount = available.amount;
            }
            return available.copy(str, amount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Amount;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;

        public Amount(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Amount amount = (com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, amount.moneyFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Amount copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Amount(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Amount copy$default(com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Amount amount, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amount.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = amount.moneyFragment;
            }
            return amount.copy(str, moneyFragment);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.__typename;
        java.lang.String str2 = this.trackingId;
        com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Wallet wallet = this.wallet;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceComponentFragment(__typename=");
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
        com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Wallet wallet = this.wallet;
        return (((hashCode * 31) + hashCode2) * 31) + (wallet != null ? wallet.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment)) {
            return false;
        }
        com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment balanceComponentFragment = (com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, balanceComponentFragment.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingId, balanceComponentFragment.trackingId) && kotlin.jvm.internal.Intrinsics.areEqual(this.wallet, balanceComponentFragment.wallet);
    }

    public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment copy(java.lang.String __typename, java.lang.String trackingId, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Wallet wallet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
        return new com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment(__typename, trackingId, wallet);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Wallet getWallet() {
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

    public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment copy$default(com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment balanceComponentFragment, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Wallet wallet, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = balanceComponentFragment.__typename;
        }
        if ((i & 2) != 0) {
            str2 = balanceComponentFragment.trackingId;
        }
        if ((i & 4) != 0) {
            wallet = balanceComponentFragment.wallet;
        }
        return balanceComponentFragment.copy(str, str2, wallet);
    }
}
