package com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAccountFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "creditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAccountFragment$Billing;", "billing", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAccountFragment$Billing;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAccountFragment$Billing;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAccountFragment$Billing;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAccountFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCreditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAccountFragment$Billing;", "getBilling", "Billing", "CurrentBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PaymentSummaryAccountFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.Billing billing;
    private final java.lang.Object creditAccountId;

    public PaymentSummaryAccountFragment(java.lang.Object obj, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.Billing billing) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.creditAccountId = obj;
        this.billing = billing;
    }

    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.Billing getBilling() {
        return this.billing;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAccountFragment$Billing;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingPaymentStatus;", "paymentStatus", "nextPaymentDueTime", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAccountFragment$CurrentBalance;", "currentBalance", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingPaymentStatus;Ljava/lang/Object;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAccountFragment$CurrentBalance;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingPaymentStatus;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAccountFragment$CurrentBalance;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingPaymentStatus;Ljava/lang/Object;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAccountFragment$CurrentBalance;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAccountFragment$Billing;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingPaymentStatus;", "getPaymentStatus", "Ljava/lang/Object;", "getNextPaymentDueTime", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAccountFragment$CurrentBalance;", "getCurrentBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Billing {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.CurrentBalance currentBalance;
        private final java.lang.Object nextPaymentDueTime;
        private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentStatus paymentStatus;

        public Billing(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentStatus revolvingCreditServicingPaymentStatus, java.lang.Object obj, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.CurrentBalance currentBalance) {
            this.paymentStatus = revolvingCreditServicingPaymentStatus;
            this.nextPaymentDueTime = obj;
            this.currentBalance = currentBalance;
        }

        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentStatus getPaymentStatus() {
            return this.paymentStatus;
        }

        public final java.lang.Object getNextPaymentDueTime() {
            return this.nextPaymentDueTime;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.CurrentBalance getCurrentBalance() {
            return this.currentBalance;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentStatus revolvingCreditServicingPaymentStatus = this.paymentStatus;
            java.lang.Object obj = this.nextPaymentDueTime;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.CurrentBalance currentBalance = this.currentBalance;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Billing(paymentStatus=");
            sb.append(revolvingCreditServicingPaymentStatus);
            sb.append(", nextPaymentDueTime=");
            sb.append(obj);
            sb.append(", currentBalance=");
            sb.append(currentBalance);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentStatus revolvingCreditServicingPaymentStatus = this.paymentStatus;
            int hashCode = revolvingCreditServicingPaymentStatus == null ? 0 : revolvingCreditServicingPaymentStatus.hashCode();
            java.lang.Object obj = this.nextPaymentDueTime;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.CurrentBalance currentBalance = this.currentBalance;
            return (((hashCode * 31) + hashCode2) * 31) + (currentBalance != null ? currentBalance.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.Billing)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.Billing billing = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.Billing) other;
            return this.paymentStatus == billing.paymentStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.nextPaymentDueTime, billing.nextPaymentDueTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentBalance, billing.currentBalance);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.Billing copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentStatus paymentStatus, java.lang.Object nextPaymentDueTime, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.CurrentBalance currentBalance) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.Billing(paymentStatus, nextPaymentDueTime, currentBalance);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.CurrentBalance getCurrentBalance() {
            return this.currentBalance;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getNextPaymentDueTime() {
            return this.nextPaymentDueTime;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentStatus getPaymentStatus() {
            return this.paymentStatus;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.Billing copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.Billing billing, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentStatus revolvingCreditServicingPaymentStatus, java.lang.Object obj, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.CurrentBalance currentBalance, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                revolvingCreditServicingPaymentStatus = billing.paymentStatus;
            }
            if ((i & 2) != 0) {
                obj = billing.nextPaymentDueTime;
            }
            if ((i & 4) != 0) {
                currentBalance = billing.currentBalance;
            }
            return billing.copy(revolvingCreditServicingPaymentStatus, obj, currentBalance);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAccountFragment$CurrentBalance;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "revolvingCreditMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAccountFragment$CurrentBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "getRevolvingCreditMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CurrentBalance {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;

        public CurrentBalance(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditMoneyFragment, "");
            this.__typename = str;
            this.revolvingCreditMoneyFragment = revolvingCreditMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment getRevolvingCreditMoneyFragment() {
            return this.revolvingCreditMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment = this.revolvingCreditMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrentBalance(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditMoneyFragment=");
            sb.append(revolvingCreditMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.CurrentBalance)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.CurrentBalance currentBalance = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.CurrentBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, currentBalance.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditMoneyFragment, currentBalance.revolvingCreditMoneyFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.CurrentBalance copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditMoneyFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.CurrentBalance(__typename, revolvingCreditMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment getRevolvingCreditMoneyFragment() {
            return this.revolvingCreditMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.CurrentBalance copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.CurrentBalance currentBalance, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = currentBalance.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditMoneyFragment = currentBalance.revolvingCreditMoneyFragment;
            }
            return currentBalance.copy(str, revolvingCreditMoneyFragment);
        }
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.creditAccountId;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.Billing billing = this.billing;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentSummaryAccountFragment(creditAccountId=");
        sb.append(obj);
        sb.append(", billing=");
        sb.append(billing);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.creditAccountId.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.Billing billing = this.billing;
        return (hashCode * 31) + (billing == null ? 0 : billing.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment paymentSummaryAccountFragment = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, paymentSummaryAccountFragment.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.billing, paymentSummaryAccountFragment.billing);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment copy(java.lang.Object creditAccountId, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.Billing billing) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment(creditAccountId, billing);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.Billing getBilling() {
        return this.billing;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment paymentSummaryAccountFragment, java.lang.Object obj, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.Billing billing, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = paymentSummaryAccountFragment.creditAccountId;
        }
        if ((i & 2) != 0) {
            billing = paymentSummaryAccountFragment.billing;
        }
        return paymentSummaryAccountFragment.copy(obj, billing);
    }
}
