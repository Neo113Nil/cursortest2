package com.paypal.oslo.feature.bnplacquisition.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionInstallmentSummaryFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionInstallmentSummaryFragment$InstallmentAmount;", "installmentAmount", "", "installmentFrequency", "", "totalInstallmentsCount", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionInstallmentSummaryFragment$InstallmentAmount;Ljava/lang/Object;I)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionInstallmentSummaryFragment$InstallmentAmount;", "component2", "()Ljava/lang/Object;", "component3", "()I", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionInstallmentSummaryFragment$InstallmentAmount;Ljava/lang/Object;I)Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionInstallmentSummaryFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionInstallmentSummaryFragment$InstallmentAmount;", "getInstallmentAmount", "Ljava/lang/Object;", "getInstallmentFrequency", com.visa.cbp.getEncExpo.warmup, "getTotalInstallmentsCount", "InstallmentAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BnplAcquisitionInstallmentSummaryFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment.InstallmentAmount installmentAmount;
    private final java.lang.Object installmentFrequency;
    private final int totalInstallmentsCount;

    public BnplAcquisitionInstallmentSummaryFragment(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment.InstallmentAmount installmentAmount, java.lang.Object obj, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(installmentAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.installmentAmount = installmentAmount;
        this.installmentFrequency = obj;
        this.totalInstallmentsCount = i;
    }

    public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment.InstallmentAmount getInstallmentAmount() {
        return this.installmentAmount;
    }

    public final java.lang.Object getInstallmentFrequency() {
        return this.installmentFrequency;
    }

    public final int getTotalInstallmentsCount() {
        return this.totalInstallmentsCount;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionInstallmentSummaryFragment$InstallmentAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "bnplAcquisitionMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionInstallmentSummaryFragment$InstallmentAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "getBnplAcquisitionMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InstallmentAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment;

        public InstallmentAmount(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
            this.__typename = str;
            this.bnplAcquisitionMoneyFragment = bnplAcquisitionMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getBnplAcquisitionMoneyFragment() {
            return this.bnplAcquisitionMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment = this.bnplAcquisitionMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InstallmentAmount(__typename=");
            sb.append(str);
            sb.append(", bnplAcquisitionMoneyFragment=");
            sb.append(bnplAcquisitionMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplAcquisitionMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment.InstallmentAmount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment.InstallmentAmount installmentAmount = (com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment.InstallmentAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, installmentAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionMoneyFragment, installmentAmount.bnplAcquisitionMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment.InstallmentAmount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment.InstallmentAmount(__typename, bnplAcquisitionMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getBnplAcquisitionMoneyFragment() {
            return this.bnplAcquisitionMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment.InstallmentAmount copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment.InstallmentAmount installmentAmount, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = installmentAmount.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionMoneyFragment = installmentAmount.bnplAcquisitionMoneyFragment;
            }
            return installmentAmount.copy(str, bnplAcquisitionMoneyFragment);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment.InstallmentAmount installmentAmount = this.installmentAmount;
        java.lang.Object obj = this.installmentFrequency;
        int i = this.totalInstallmentsCount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplAcquisitionInstallmentSummaryFragment(installmentAmount=");
        sb.append(installmentAmount);
        sb.append(", installmentFrequency=");
        sb.append(obj);
        sb.append(", totalInstallmentsCount=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.installmentAmount.hashCode() * 31) + this.installmentFrequency.hashCode()) * 31) + java.lang.Integer.hashCode(this.totalInstallmentsCount);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment bnplAcquisitionInstallmentSummaryFragment = (com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.installmentAmount, bnplAcquisitionInstallmentSummaryFragment.installmentAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.installmentFrequency, bnplAcquisitionInstallmentSummaryFragment.installmentFrequency) && this.totalInstallmentsCount == bnplAcquisitionInstallmentSummaryFragment.totalInstallmentsCount;
    }

    public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment copy(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment.InstallmentAmount installmentAmount, java.lang.Object installmentFrequency, int totalInstallmentsCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(installmentAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(installmentFrequency, "");
        return new com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment(installmentAmount, installmentFrequency, totalInstallmentsCount);
    }

    /* renamed from: component3, reason: from getter */
    public final int getTotalInstallmentsCount() {
        return this.totalInstallmentsCount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getInstallmentFrequency() {
        return this.installmentFrequency;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment.InstallmentAmount getInstallmentAmount() {
        return this.installmentAmount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment bnplAcquisitionInstallmentSummaryFragment, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment.InstallmentAmount installmentAmount, java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        if ((i2 & 1) != 0) {
            installmentAmount = bnplAcquisitionInstallmentSummaryFragment.installmentAmount;
        }
        if ((i2 & 2) != 0) {
            obj = bnplAcquisitionInstallmentSummaryFragment.installmentFrequency;
        }
        if ((i2 & 4) != 0) {
            i = bnplAcquisitionInstallmentSummaryFragment.totalInstallmentsCount;
        }
        return bnplAcquisitionInstallmentSummaryFragment.copy(installmentAmount, obj, i);
    }
}
