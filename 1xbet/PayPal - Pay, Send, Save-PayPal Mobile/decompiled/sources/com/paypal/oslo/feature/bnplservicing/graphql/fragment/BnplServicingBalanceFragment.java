package com.paypal.oslo.feature.bnplservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingBalanceFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "id", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingBalanceFragment$AvailableAmount;", "availableAmount", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingBalanceFragment$AvailableAmount;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingBalanceFragment$AvailableAmount;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingBalanceFragment$AvailableAmount;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingBalanceFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingBalanceFragment$AvailableAmount;", "getAvailableAmount", "getAvailableAmount$annotations", "()V", "AvailableAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BnplServicingBalanceFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment.AvailableAmount availableAmount;
    private final java.lang.String id;

    @kotlin.Deprecated(message = "Use 'available' field instead for available balance")
    public static /* synthetic */ void getAvailableAmount$annotations() {
    }

    public BnplServicingBalanceFragment(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment.AvailableAmount availableAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableAmount, "");
        this.id = str;
        this.availableAmount = availableAmount;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment.AvailableAmount getAvailableAmount() {
        return this.availableAmount;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingBalanceFragment$AvailableAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "bnplServicingMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingBalanceFragment$AvailableAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "getBnplServicingMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AvailableAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment;

        public AvailableAmount(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingMoneyFragment, "");
            this.__typename = str;
            this.bnplServicingMoneyFragment = bnplServicingMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment getBnplServicingMoneyFragment() {
            return this.bnplServicingMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment = this.bnplServicingMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AvailableAmount(__typename=");
            sb.append(str);
            sb.append(", bnplServicingMoneyFragment=");
            sb.append(bnplServicingMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplServicingMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment.AvailableAmount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment.AvailableAmount availableAmount = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment.AvailableAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, availableAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingMoneyFragment, availableAmount.bnplServicingMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment.AvailableAmount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment.AvailableAmount(__typename, bnplServicingMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment getBnplServicingMoneyFragment() {
            return this.bnplServicingMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment.AvailableAmount copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment.AvailableAmount availableAmount, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = availableAmount.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingMoneyFragment = availableAmount.bnplServicingMoneyFragment;
            }
            return availableAmount.copy(str, bnplServicingMoneyFragment);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment.AvailableAmount availableAmount = this.availableAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplServicingBalanceFragment(id=");
        sb.append(str);
        sb.append(", availableAmount=");
        sb.append(availableAmount);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.id.hashCode() * 31) + this.availableAmount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment bnplServicingBalanceFragment = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, bnplServicingBalanceFragment.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableAmount, bnplServicingBalanceFragment.availableAmount);
    }

    public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment copy(java.lang.String id, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment.AvailableAmount availableAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableAmount, "");
        return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment(id, availableAmount);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment.AvailableAmount getAvailableAmount() {
        return this.availableAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment bnplServicingBalanceFragment, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment.AvailableAmount availableAmount, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bnplServicingBalanceFragment.id;
        }
        if ((i & 2) != 0) {
            availableAmount = bnplServicingBalanceFragment.availableAmount;
        }
        return bnplServicingBalanceFragment.copy(str, availableAmount);
    }
}
