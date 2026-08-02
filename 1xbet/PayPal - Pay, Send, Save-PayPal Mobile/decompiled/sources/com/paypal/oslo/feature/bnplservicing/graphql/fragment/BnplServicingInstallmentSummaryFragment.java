package com.paypal.oslo.feature.bnplservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingInstallmentSummaryFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "totalRemainingInstallmentsCount", "", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingInstallmentSummaryFragment$RemainingInstallment;", "remainingInstallments", "<init>", "(ILjava/util/List;)V", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingInstallmentSummaryFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTotalRemainingInstallmentsCount", "Ljava/util/List;", "getRemainingInstallments", "RemainingInstallment", "Amount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BnplServicingInstallmentSummaryFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.RemainingInstallment> remainingInstallments;
    private final int totalRemainingInstallmentsCount;

    public BnplServicingInstallmentSummaryFragment(int i, java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.RemainingInstallment> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.totalRemainingInstallmentsCount = i;
        this.remainingInstallments = list;
    }

    public final int getTotalRemainingInstallmentsCount() {
        return this.totalRemainingInstallmentsCount;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.RemainingInstallment> getRemainingInstallments() {
        return this.remainingInstallments;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingInstallmentSummaryFragment$RemainingInstallment;", "", "dueDate", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingInstallmentSummaryFragment$Amount;", "amount", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanInstallmentDerivedStatus;", "derivedStatus", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingInstallmentSummaryFragment$Amount;Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanInstallmentDerivedStatus;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingInstallmentSummaryFragment$Amount;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanInstallmentDerivedStatus;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingInstallmentSummaryFragment$Amount;Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanInstallmentDerivedStatus;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingInstallmentSummaryFragment$RemainingInstallment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getDueDate", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingInstallmentSummaryFragment$Amount;", "getAmount", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanInstallmentDerivedStatus;", "getDerivedStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RemainingInstallment {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.Amount amount;
        private final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus derivedStatus;
        private final java.lang.Object dueDate;

        public RemainingInstallment(java.lang.Object obj, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.Amount amount, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus bNPLServicingPlanInstallmentDerivedStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            this.dueDate = obj;
            this.amount = amount;
            this.derivedStatus = bNPLServicingPlanInstallmentDerivedStatus;
        }

        public final java.lang.Object getDueDate() {
            return this.dueDate;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.Amount getAmount() {
            return this.amount;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus getDerivedStatus() {
            return this.derivedStatus;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.dueDate;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.Amount amount = this.amount;
            com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus bNPLServicingPlanInstallmentDerivedStatus = this.derivedStatus;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RemainingInstallment(dueDate=");
            sb.append(obj);
            sb.append(", amount=");
            sb.append(amount);
            sb.append(", derivedStatus=");
            sb.append(bNPLServicingPlanInstallmentDerivedStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.dueDate.hashCode();
            int hashCode2 = this.amount.hashCode();
            com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus bNPLServicingPlanInstallmentDerivedStatus = this.derivedStatus;
            return (((hashCode * 31) + hashCode2) * 31) + (bNPLServicingPlanInstallmentDerivedStatus == null ? 0 : bNPLServicingPlanInstallmentDerivedStatus.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.RemainingInstallment)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.RemainingInstallment remainingInstallment = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.RemainingInstallment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.dueDate, remainingInstallment.dueDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, remainingInstallment.amount) && this.derivedStatus == remainingInstallment.derivedStatus;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.RemainingInstallment copy(java.lang.Object dueDate, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.Amount amount, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus derivedStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dueDate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.RemainingInstallment(dueDate, amount, derivedStatus);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus getDerivedStatus() {
            return this.derivedStatus;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.Amount getAmount() {
            return this.amount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getDueDate() {
            return this.dueDate;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.RemainingInstallment copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.RemainingInstallment remainingInstallment, java.lang.Object obj, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.Amount amount, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus bNPLServicingPlanInstallmentDerivedStatus, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = remainingInstallment.dueDate;
            }
            if ((i & 2) != 0) {
                amount = remainingInstallment.amount;
            }
            if ((i & 4) != 0) {
                bNPLServicingPlanInstallmentDerivedStatus = remainingInstallment.derivedStatus;
            }
            return remainingInstallment.copy(obj, amount, bNPLServicingPlanInstallmentDerivedStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingInstallmentSummaryFragment$Amount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingInstallmentSummaryFragment$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public Amount(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currencyCode = obj;
            this.value = str;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.Amount amount = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, amount.value);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.Amount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.Amount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.Amount copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.Amount amount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = amount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = amount.value;
            }
            return amount.copy(obj, str);
        }
    }

    public final java.lang.String toString() {
        int i = this.totalRemainingInstallmentsCount;
        java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.RemainingInstallment> list = this.remainingInstallments;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplServicingInstallmentSummaryFragment(totalRemainingInstallmentsCount=");
        sb.append(i);
        sb.append(", remainingInstallments=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.totalRemainingInstallmentsCount) * 31) + this.remainingInstallments.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment bnplServicingInstallmentSummaryFragment = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment) other;
        return this.totalRemainingInstallmentsCount == bnplServicingInstallmentSummaryFragment.totalRemainingInstallmentsCount && kotlin.jvm.internal.Intrinsics.areEqual(this.remainingInstallments, bnplServicingInstallmentSummaryFragment.remainingInstallments);
    }

    public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment copy(int totalRemainingInstallmentsCount, java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.RemainingInstallment> remainingInstallments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remainingInstallments, "");
        return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment(totalRemainingInstallmentsCount, remainingInstallments);
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.RemainingInstallment> component2() {
        return this.remainingInstallments;
    }

    /* renamed from: component1, reason: from getter */
    public final int getTotalRemainingInstallmentsCount() {
        return this.totalRemainingInstallmentsCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment bnplServicingInstallmentSummaryFragment, int i, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = bnplServicingInstallmentSummaryFragment.totalRemainingInstallmentsCount;
        }
        if ((i2 & 2) != 0) {
            list = bnplServicingInstallmentSummaryFragment.remainingInstallments;
        }
        return bnplServicingInstallmentSummaryFragment.copy(i, list);
    }
}
