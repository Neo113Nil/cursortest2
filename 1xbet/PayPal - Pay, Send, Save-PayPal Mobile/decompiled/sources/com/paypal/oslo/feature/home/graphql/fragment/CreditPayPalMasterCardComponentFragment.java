package com.paypal.oslo.feature.home.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u001b\u001c\u001d\u001eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Wallet;", com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Wallet;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Wallet;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Wallet;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Wallet;", "getWallet", "Wallet", "RevolvingCredit", "Ppmc", "Ppmcnba"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CreditPayPalMasterCardComponentFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String __typename;
    private final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Wallet wallet;

    public CreditPayPalMasterCardComponentFragment(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Wallet wallet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.__typename = str;
        this.wallet = wallet;
    }

    public final java.lang.String get__typename() {
        return this.__typename;
    }

    public final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Wallet getWallet() {
        return this.wallet;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Wallet;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$RevolvingCredit;", "revolvingCredit", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$RevolvingCredit;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$RevolvingCredit;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$RevolvingCredit;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Wallet;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$RevolvingCredit;", "getRevolvingCredit", "getRevolvingCredit$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Wallet {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.RevolvingCredit revolvingCredit;

        @kotlin.Deprecated(message = "Use the credit component `revolvingCreditProductOverview` field instead.")
        public static /* synthetic */ void getRevolvingCredit$annotations() {
        }

        public Wallet(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.RevolvingCredit revolvingCredit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.revolvingCredit = revolvingCredit;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.RevolvingCredit getRevolvingCredit() {
            return this.revolvingCredit;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.RevolvingCredit revolvingCredit = this.revolvingCredit;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wallet(__typename=");
            sb.append(str);
            sb.append(", revolvingCredit=");
            sb.append(revolvingCredit);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.RevolvingCredit revolvingCredit = this.revolvingCredit;
            return (hashCode * 31) + (revolvingCredit == null ? 0 : revolvingCredit.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Wallet)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Wallet wallet = (com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Wallet) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, wallet.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCredit, wallet.revolvingCredit);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Wallet copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.RevolvingCredit revolvingCredit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Wallet(__typename, revolvingCredit);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.RevolvingCredit getRevolvingCredit() {
            return this.revolvingCredit;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Wallet copy$default(com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Wallet wallet, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.RevolvingCredit revolvingCredit, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = wallet.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCredit = wallet.revolvingCredit;
            }
            return wallet.copy(str, revolvingCredit);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$RevolvingCredit;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Ppmc;", "ppmc", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Ppmcnba;", "ppmcnba", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Ppmc;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Ppmcnba;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Ppmc;", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Ppmcnba;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Ppmc;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Ppmcnba;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$RevolvingCredit;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Ppmc;", "getPpmc", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Ppmcnba;", "getPpmcnba"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCredit {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmc ppmc;
        private final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmcnba ppmcnba;

        public RevolvingCredit(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmc ppmc, com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmcnba ppmcnba) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.ppmc = ppmc;
            this.ppmcnba = ppmcnba;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmc getPpmc() {
            return this.ppmc;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmcnba getPpmcnba() {
            return this.ppmcnba;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmc ppmc = this.ppmc;
            com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmcnba ppmcnba = this.ppmcnba;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCredit(__typename=");
            sb.append(str);
            sb.append(", ppmc=");
            sb.append(ppmc);
            sb.append(", ppmcnba=");
            sb.append(ppmcnba);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmc ppmc = this.ppmc;
            int hashCode2 = ppmc == null ? 0 : ppmc.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmcnba ppmcnba = this.ppmcnba;
            return (((hashCode * 31) + hashCode2) * 31) + (ppmcnba != null ? ppmcnba.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.RevolvingCredit)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.RevolvingCredit revolvingCredit = (com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.RevolvingCredit) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCredit.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.ppmc, revolvingCredit.ppmc) && kotlin.jvm.internal.Intrinsics.areEqual(this.ppmcnba, revolvingCredit.ppmcnba);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.RevolvingCredit copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmc ppmc, com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmcnba ppmcnba) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.RevolvingCredit(__typename, ppmc, ppmcnba);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmcnba getPpmcnba() {
            return this.ppmcnba;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmc getPpmc() {
            return this.ppmc;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.RevolvingCredit copy$default(com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.RevolvingCredit revolvingCredit, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmc ppmc, com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmcnba ppmcnba, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = revolvingCredit.__typename;
            }
            if ((i & 2) != 0) {
                ppmc = revolvingCredit.ppmc;
            }
            if ((i & 4) != 0) {
                ppmcnba = revolvingCredit.ppmcnba;
            }
            return revolvingCredit.copy(str, ppmc, ppmcnba);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Ppmc;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditAccountFields;", "homeCreditAccountFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditAccountFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditAccountFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditAccountFields;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Ppmc;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditAccountFields;", "getHomeCreditAccountFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Ppmc {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields homeCreditAccountFields;

        public Ppmc(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields homeCreditAccountFields) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ppmc(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmc)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmc ppmc = (com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmc) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, ppmc.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.homeCreditAccountFields, ppmc.homeCreditAccountFields);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmc copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields homeCreditAccountFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeCreditAccountFields, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmc(__typename, homeCreditAccountFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields getHomeCreditAccountFields() {
            return this.homeCreditAccountFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmc copy$default(com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmc ppmc, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields homeCreditAccountFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = ppmc.__typename;
            }
            if ((i & 2) != 0) {
                homeCreditAccountFields = ppmc.homeCreditAccountFields;
            }
            return ppmc.copy(str, homeCreditAccountFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Ppmcnba;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields;", "homeCreditNextBestActionFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$Ppmcnba;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields;", "getHomeCreditNextBestActionFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Ppmcnba {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields homeCreditNextBestActionFields;

        public Ppmcnba(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields homeCreditNextBestActionFields) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ppmcnba(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmcnba)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmcnba ppmcnba = (com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmcnba) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, ppmcnba.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.homeCreditNextBestActionFields, ppmcnba.homeCreditNextBestActionFields);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmcnba copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields homeCreditNextBestActionFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeCreditNextBestActionFields, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmcnba(__typename, homeCreditNextBestActionFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields getHomeCreditNextBestActionFields() {
            return this.homeCreditNextBestActionFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmcnba copy$default(com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmcnba ppmcnba, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields homeCreditNextBestActionFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = ppmcnba.__typename;
            }
            if ((i & 2) != 0) {
                homeCreditNextBestActionFields = ppmcnba.homeCreditNextBestActionFields;
            }
            return ppmcnba.copy(str, homeCreditNextBestActionFields);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.__typename;
        com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Wallet wallet = this.wallet;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreditPayPalMasterCardComponentFragment(__typename=");
        sb.append(str);
        sb.append(", wallet=");
        sb.append(wallet);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.__typename.hashCode();
        com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Wallet wallet = this.wallet;
        return (hashCode * 31) + (wallet == null ? 0 : wallet.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment)) {
            return false;
        }
        com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment creditPayPalMasterCardComponentFragment = (com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, creditPayPalMasterCardComponentFragment.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.wallet, creditPayPalMasterCardComponentFragment.wallet);
    }

    public final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Wallet wallet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
        return new com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment(__typename, wallet);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Wallet getWallet() {
        return this.wallet;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String get__typename() {
        return this.__typename;
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment copy$default(com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment creditPayPalMasterCardComponentFragment, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Wallet wallet, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = creditPayPalMasterCardComponentFragment.__typename;
        }
        if ((i & 2) != 0) {
            wallet = creditPayPalMasterCardComponentFragment.wallet;
        }
        return creditPayPalMasterCardComponentFragment.copy(str, wallet);
    }
}
