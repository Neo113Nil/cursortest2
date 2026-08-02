package com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceTransactionFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "id", "type", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceTransactionFragment$Amount;", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceTransactionFragment$Amount;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceTransactionFragment$Amount;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceTransactionFragment$Amount;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceTransactionFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getType", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceTransactionFragment$Amount;", "getAmount", "Amount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InvoiceTransactionFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment.Amount amount;
    private final java.lang.String id;
    private final java.lang.String type;

    public InvoiceTransactionFragment(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment.Amount amount) {
        this.id = str;
        this.type = str2;
        this.amount = amount;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment.Amount getAmount() {
        return this.amount;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceTransactionFragment$Amount;", "", "", "__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceTransactionFragment$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment;

        public Amount(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            this.__typename = str;
            this.moneyFragment = moneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment = this.moneyFragment;
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
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment.Amount amount = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, amount.moneyFragment);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment.Amount copy(java.lang.String __typename, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment.Amount(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment.Amount copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment.Amount amount, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
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
        java.lang.String str = this.id;
        java.lang.String str2 = this.type;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment.Amount amount = this.amount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InvoiceTransactionFragment(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(str2);
        sb.append(", amount=");
        sb.append(amount);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.id;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.type;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment.Amount amount = this.amount;
        return (((hashCode * 31) + hashCode2) * 31) + (amount != null ? amount.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment invoiceTransactionFragment = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, invoiceTransactionFragment.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, invoiceTransactionFragment.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, invoiceTransactionFragment.amount);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment copy(java.lang.String id, java.lang.String type, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment.Amount amount) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment(id, type, amount);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment.Amount getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment invoiceTransactionFragment, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment.Amount amount, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = invoiceTransactionFragment.id;
        }
        if ((i & 2) != 0) {
            str2 = invoiceTransactionFragment.type;
        }
        if ((i & 4) != 0) {
            amount = invoiceTransactionFragment.amount;
        }
        return invoiceTransactionFragment.copy(str, str2, amount);
    }
}
