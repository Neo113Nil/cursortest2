package com.paypal.oslo.feature.home.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u001b\u001c\u001d\u001eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Wallet;", com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Wallet;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Wallet;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Wallet;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Wallet;", "getWallet", "Wallet", "RevolvingCredit", "Smtccnct", "Smtccnctnba"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CreditSmartConnectComponentFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String __typename;
    private final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Wallet wallet;

    public CreditSmartConnectComponentFragment(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Wallet wallet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.__typename = str;
        this.wallet = wallet;
    }

    public final java.lang.String get__typename() {
        return this.__typename;
    }

    public final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Wallet getWallet() {
        return this.wallet;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Wallet;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$RevolvingCredit;", "revolvingCredit", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$RevolvingCredit;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$RevolvingCredit;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$RevolvingCredit;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Wallet;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$RevolvingCredit;", "getRevolvingCredit", "getRevolvingCredit$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Wallet {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.RevolvingCredit revolvingCredit;

        @kotlin.Deprecated(message = "Use the credit component `revolvingCreditProductOverview` field instead.")
        public static /* synthetic */ void getRevolvingCredit$annotations() {
        }

        public Wallet(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.RevolvingCredit revolvingCredit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.revolvingCredit = revolvingCredit;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.RevolvingCredit getRevolvingCredit() {
            return this.revolvingCredit;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.RevolvingCredit revolvingCredit = this.revolvingCredit;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wallet(__typename=");
            sb.append(str);
            sb.append(", revolvingCredit=");
            sb.append(revolvingCredit);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.RevolvingCredit revolvingCredit = this.revolvingCredit;
            return (hashCode * 31) + (revolvingCredit == null ? 0 : revolvingCredit.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Wallet)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Wallet wallet = (com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Wallet) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, wallet.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCredit, wallet.revolvingCredit);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Wallet copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.RevolvingCredit revolvingCredit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Wallet(__typename, revolvingCredit);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.RevolvingCredit getRevolvingCredit() {
            return this.revolvingCredit;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Wallet copy$default(com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Wallet wallet, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.RevolvingCredit revolvingCredit, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = wallet.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCredit = wallet.revolvingCredit;
            }
            return wallet.copy(str, revolvingCredit);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$RevolvingCredit;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Smtccnct;", "smtccnct", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Smtccnctnba;", "smtccnctnba", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Smtccnct;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Smtccnctnba;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Smtccnct;", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Smtccnctnba;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Smtccnct;Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Smtccnctnba;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$RevolvingCredit;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Smtccnct;", "getSmtccnct", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Smtccnctnba;", "getSmtccnctnba"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCredit {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnct smtccnct;
        private final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnctnba smtccnctnba;

        public RevolvingCredit(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnct smtccnct, com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnctnba smtccnctnba) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.smtccnct = smtccnct;
            this.smtccnctnba = smtccnctnba;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnct getSmtccnct() {
            return this.smtccnct;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnctnba getSmtccnctnba() {
            return this.smtccnctnba;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnct smtccnct = this.smtccnct;
            com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnctnba smtccnctnba = this.smtccnctnba;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCredit(__typename=");
            sb.append(str);
            sb.append(", smtccnct=");
            sb.append(smtccnct);
            sb.append(", smtccnctnba=");
            sb.append(smtccnctnba);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnct smtccnct = this.smtccnct;
            int hashCode2 = smtccnct == null ? 0 : smtccnct.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnctnba smtccnctnba = this.smtccnctnba;
            return (((hashCode * 31) + hashCode2) * 31) + (smtccnctnba != null ? smtccnctnba.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.RevolvingCredit)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.RevolvingCredit revolvingCredit = (com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.RevolvingCredit) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCredit.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.smtccnct, revolvingCredit.smtccnct) && kotlin.jvm.internal.Intrinsics.areEqual(this.smtccnctnba, revolvingCredit.smtccnctnba);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.RevolvingCredit copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnct smtccnct, com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnctnba smtccnctnba) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.RevolvingCredit(__typename, smtccnct, smtccnctnba);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnctnba getSmtccnctnba() {
            return this.smtccnctnba;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnct getSmtccnct() {
            return this.smtccnct;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.RevolvingCredit copy$default(com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.RevolvingCredit revolvingCredit, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnct smtccnct, com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnctnba smtccnctnba, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = revolvingCredit.__typename;
            }
            if ((i & 2) != 0) {
                smtccnct = revolvingCredit.smtccnct;
            }
            if ((i & 4) != 0) {
                smtccnctnba = revolvingCredit.smtccnctnba;
            }
            return revolvingCredit.copy(str, smtccnct, smtccnctnba);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Smtccnct;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditAccountFields;", "homeCreditAccountFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditAccountFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditAccountFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditAccountFields;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Smtccnct;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditAccountFields;", "getHomeCreditAccountFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Smtccnct {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields homeCreditAccountFields;

        public Smtccnct(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields homeCreditAccountFields) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Smtccnct(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnct)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnct smtccnct = (com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnct) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, smtccnct.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.homeCreditAccountFields, smtccnct.homeCreditAccountFields);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnct copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields homeCreditAccountFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeCreditAccountFields, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnct(__typename, homeCreditAccountFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields getHomeCreditAccountFields() {
            return this.homeCreditAccountFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnct copy$default(com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnct smtccnct, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields homeCreditAccountFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = smtccnct.__typename;
            }
            if ((i & 2) != 0) {
                homeCreditAccountFields = smtccnct.homeCreditAccountFields;
            }
            return smtccnct.copy(str, homeCreditAccountFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Smtccnctnba;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields;", "homeCreditNextBestActionFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$Smtccnctnba;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields;", "getHomeCreditNextBestActionFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Smtccnctnba {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields homeCreditNextBestActionFields;

        public Smtccnctnba(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields homeCreditNextBestActionFields) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Smtccnctnba(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnctnba)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnctnba smtccnctnba = (com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnctnba) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, smtccnctnba.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.homeCreditNextBestActionFields, smtccnctnba.homeCreditNextBestActionFields);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnctnba copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields homeCreditNextBestActionFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeCreditNextBestActionFields, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnctnba(__typename, homeCreditNextBestActionFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields getHomeCreditNextBestActionFields() {
            return this.homeCreditNextBestActionFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnctnba copy$default(com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnctnba smtccnctnba, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields homeCreditNextBestActionFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = smtccnctnba.__typename;
            }
            if ((i & 2) != 0) {
                homeCreditNextBestActionFields = smtccnctnba.homeCreditNextBestActionFields;
            }
            return smtccnctnba.copy(str, homeCreditNextBestActionFields);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.__typename;
        com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Wallet wallet = this.wallet;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreditSmartConnectComponentFragment(__typename=");
        sb.append(str);
        sb.append(", wallet=");
        sb.append(wallet);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.__typename.hashCode();
        com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Wallet wallet = this.wallet;
        return (hashCode * 31) + (wallet == null ? 0 : wallet.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment)) {
            return false;
        }
        com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment creditSmartConnectComponentFragment = (com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, creditSmartConnectComponentFragment.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.wallet, creditSmartConnectComponentFragment.wallet);
    }

    public final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Wallet wallet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
        return new com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment(__typename, wallet);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Wallet getWallet() {
        return this.wallet;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String get__typename() {
        return this.__typename;
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment copy$default(com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment creditSmartConnectComponentFragment, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Wallet wallet, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = creditSmartConnectComponentFragment.__typename;
        }
        if ((i & 2) != 0) {
            wallet = creditSmartConnectComponentFragment.wallet;
        }
        return creditSmartConnectComponentFragment.copy(str, wallet);
    }
}
