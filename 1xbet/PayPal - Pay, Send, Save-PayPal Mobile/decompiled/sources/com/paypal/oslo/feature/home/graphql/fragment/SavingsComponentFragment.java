package com.paypal.oslo.feature.home.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0005\u001e\u001f !\"B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "__typename", "trackingId", "Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$Wallet;", com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$Wallet;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$Wallet;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$Wallet;)Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "getTrackingId", "Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$Wallet;", "getWallet", "Wallet", com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_SAVINGS, "SavingsAccount", "TotalBalance", "SavingsAccountFeatures"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SavingsComponentFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String __typename;
    private final java.lang.String trackingId;
    private final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Wallet wallet;

    public SavingsComponentFragment(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Wallet wallet) {
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

    public final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Wallet getWallet() {
        return this.wallet;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$Wallet;", "", "", "__typename", "accountId", "Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$Savings;", "savings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$Savings;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$Savings;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$Savings;)Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$Wallet;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "getAccountId", "Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$Savings;", "getSavings"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Wallet {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.String accountId;
        private final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Savings savings;

        public Wallet(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Savings savings) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.__typename = str;
            this.accountId = str2;
            this.savings = savings;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Savings getSavings() {
            return this.savings;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.String str2 = this.accountId;
            com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Savings savings = this.savings;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wallet(__typename=");
            sb.append(str);
            sb.append(", accountId=");
            sb.append(str2);
            sb.append(", savings=");
            sb.append(savings);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            int hashCode2 = this.accountId.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Savings savings = this.savings;
            return (((hashCode * 31) + hashCode2) * 31) + (savings == null ? 0 : savings.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Wallet)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Wallet wallet = (com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Wallet) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, wallet.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, wallet.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.savings, wallet.savings);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Wallet copy(java.lang.String __typename, java.lang.String accountId, com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Savings savings) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountId, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Wallet(__typename, accountId, savings);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Savings getSavings() {
            return this.savings;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Wallet copy$default(com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Wallet wallet, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Savings savings, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = wallet.__typename;
            }
            if ((i & 2) != 0) {
                str2 = wallet.accountId;
            }
            if ((i & 4) != 0) {
                savings = wallet.savings;
            }
            return wallet.copy(str, str2, savings);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$Savings;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$SavingsAccount;", "savingsAccount", "Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$SavingsAccountFeatures;", "savingsAccountFeatures", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$SavingsAccount;Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$SavingsAccountFeatures;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$SavingsAccount;", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$SavingsAccountFeatures;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$SavingsAccount;Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$SavingsAccountFeatures;)Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$Savings;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$SavingsAccount;", "getSavingsAccount", "Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$SavingsAccountFeatures;", "getSavingsAccountFeatures"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Savings {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccount savingsAccount;
        private final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccountFeatures savingsAccountFeatures;

        public Savings(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccount savingsAccount, com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccountFeatures savingsAccountFeatures) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.savingsAccount = savingsAccount;
            this.savingsAccountFeatures = savingsAccountFeatures;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccount getSavingsAccount() {
            return this.savingsAccount;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccountFeatures getSavingsAccountFeatures() {
            return this.savingsAccountFeatures;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccount savingsAccount = this.savingsAccount;
            com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccountFeatures savingsAccountFeatures = this.savingsAccountFeatures;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Savings(__typename=");
            sb.append(str);
            sb.append(", savingsAccount=");
            sb.append(savingsAccount);
            sb.append(", savingsAccountFeatures=");
            sb.append(savingsAccountFeatures);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccount savingsAccount = this.savingsAccount;
            int hashCode2 = savingsAccount == null ? 0 : savingsAccount.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccountFeatures savingsAccountFeatures = this.savingsAccountFeatures;
            return (((hashCode * 31) + hashCode2) * 31) + (savingsAccountFeatures != null ? savingsAccountFeatures.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Savings)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Savings savings = (com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Savings) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, savings.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsAccount, savings.savingsAccount) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsAccountFeatures, savings.savingsAccountFeatures);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Savings copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccount savingsAccount, com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccountFeatures savingsAccountFeatures) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Savings(__typename, savingsAccount, savingsAccountFeatures);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccountFeatures getSavingsAccountFeatures() {
            return this.savingsAccountFeatures;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccount getSavingsAccount() {
            return this.savingsAccount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Savings copy$default(com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Savings savings, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccount savingsAccount, com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccountFeatures savingsAccountFeatures, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = savings.__typename;
            }
            if ((i & 2) != 0) {
                savingsAccount = savings.savingsAccount;
            }
            if ((i & 4) != 0) {
                savingsAccountFeatures = savings.savingsAccountFeatures;
            }
            return savings.copy(str, savingsAccount, savingsAccountFeatures);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$SavingsAccount;", "", "", "__typename", "id", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;", "accountStatus", "Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$TotalBalance;", "totalBalance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$TotalBalance;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;", "component4", "()Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$TotalBalance;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$TotalBalance;)Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$SavingsAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;", "getAccountStatus", "Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$TotalBalance;", "getTotalBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SavingsAccount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus accountStatus;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.TotalBalance totalBalance;

        public SavingsAccount(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus savingsAccountStatus, com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.TotalBalance totalBalance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccountStatus, "");
            this.__typename = str;
            this.id = str2;
            this.accountStatus = savingsAccountStatus;
            this.totalBalance = totalBalance;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus getAccountStatus() {
            return this.accountStatus;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.TotalBalance getTotalBalance() {
            return this.totalBalance;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.String str2 = this.id;
            com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus savingsAccountStatus = this.accountStatus;
            com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.TotalBalance totalBalance = this.totalBalance;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsAccount(__typename=");
            sb.append(str);
            sb.append(", id=");
            sb.append(str2);
            sb.append(", accountStatus=");
            sb.append(savingsAccountStatus);
            sb.append(", totalBalance=");
            sb.append(totalBalance);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            int hashCode2 = this.id.hashCode();
            int hashCode3 = this.accountStatus.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.TotalBalance totalBalance = this.totalBalance;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (totalBalance == null ? 0 : totalBalance.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccount)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccount savingsAccount = (com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, savingsAccount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, savingsAccount.id) && this.accountStatus == savingsAccount.accountStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.totalBalance, savingsAccount.totalBalance);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccount copy(java.lang.String __typename, java.lang.String id, com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus accountStatus, com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.TotalBalance totalBalance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountStatus, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccount(__typename, id, accountStatus, totalBalance);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.TotalBalance getTotalBalance() {
            return this.totalBalance;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus getAccountStatus() {
            return this.accountStatus;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccount copy$default(com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccount savingsAccount, java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus savingsAccountStatus, com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.TotalBalance totalBalance, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = savingsAccount.__typename;
            }
            if ((i & 2) != 0) {
                str2 = savingsAccount.id;
            }
            if ((i & 4) != 0) {
                savingsAccountStatus = savingsAccount.accountStatus;
            }
            if ((i & 8) != 0) {
                totalBalance = savingsAccount.totalBalance;
            }
            return savingsAccount.copy(str, str2, savingsAccountStatus, totalBalance);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$TotalBalance;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$TotalBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalBalance {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;

        public TotalBalance(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalBalance(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.TotalBalance)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.TotalBalance totalBalance = (com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.TotalBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalBalance.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, totalBalance.moneyFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.TotalBalance copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.TotalBalance(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.TotalBalance copy$default(com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.TotalBalance totalBalance, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = totalBalance.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = totalBalance.moneyFragment;
            }
            return totalBalance.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$SavingsAccountFeatures;", "", "", "__typename", "annualPercentageYield", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$SavingsAccountFeatures;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Ljava/lang/Object;", "getAnnualPercentageYield"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SavingsAccountFeatures {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object annualPercentageYield;

        public SavingsAccountFeatures(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.__typename = str;
            this.annualPercentageYield = obj;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.Object getAnnualPercentageYield() {
            return this.annualPercentageYield;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.Object obj = this.annualPercentageYield;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsAccountFeatures(__typename=");
            sb.append(str);
            sb.append(", annualPercentageYield=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.annualPercentageYield.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccountFeatures)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccountFeatures savingsAccountFeatures = (com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccountFeatures) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, savingsAccountFeatures.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.annualPercentageYield, savingsAccountFeatures.annualPercentageYield);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccountFeatures copy(java.lang.String __typename, java.lang.Object annualPercentageYield) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annualPercentageYield, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccountFeatures(__typename, annualPercentageYield);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getAnnualPercentageYield() {
            return this.annualPercentageYield;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccountFeatures copy$default(com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccountFeatures savingsAccountFeatures, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = savingsAccountFeatures.__typename;
            }
            if ((i & 2) != 0) {
                obj = savingsAccountFeatures.annualPercentageYield;
            }
            return savingsAccountFeatures.copy(str, obj);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.__typename;
        java.lang.String str2 = this.trackingId;
        com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Wallet wallet = this.wallet;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsComponentFragment(__typename=");
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
        com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Wallet wallet = this.wallet;
        return (((hashCode * 31) + hashCode2) * 31) + (wallet != null ? wallet.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment)) {
            return false;
        }
        com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment savingsComponentFragment = (com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, savingsComponentFragment.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingId, savingsComponentFragment.trackingId) && kotlin.jvm.internal.Intrinsics.areEqual(this.wallet, savingsComponentFragment.wallet);
    }

    public final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment copy(java.lang.String __typename, java.lang.String trackingId, com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Wallet wallet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
        return new com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment(__typename, trackingId, wallet);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Wallet getWallet() {
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

    public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment copy$default(com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment savingsComponentFragment, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Wallet wallet, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = savingsComponentFragment.__typename;
        }
        if ((i & 2) != 0) {
            str2 = savingsComponentFragment.trackingId;
        }
        if ((i & 4) != 0) {
            wallet = savingsComponentFragment.wallet;
        }
        return savingsComponentFragment.copy(str, str2, wallet);
    }
}
