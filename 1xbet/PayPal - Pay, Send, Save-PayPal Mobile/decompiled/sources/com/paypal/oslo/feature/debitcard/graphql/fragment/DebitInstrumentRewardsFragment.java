package com.paypal.oslo.feature.debitcard.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentRewardsFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentRewardsFragment$EligibleCashbackProgram;", "eligibleCashbackPrograms", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentRewardsFragment$EnrolledCashbackProgram;", "enrolledCashbackProgram", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentRewardsFragment$EnrolledCashbackProgram;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentRewardsFragment$EnrolledCashbackProgram;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentRewardsFragment$EnrolledCashbackProgram;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentRewardsFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getEligibleCashbackPrograms", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentRewardsFragment$EnrolledCashbackProgram;", "getEnrolledCashbackProgram", "EligibleCashbackProgram", "EnrolledCashbackProgram"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitInstrumentRewardsFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EligibleCashbackProgram> eligibleCashbackPrograms;
    private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EnrolledCashbackProgram enrolledCashbackProgram;

    public DebitInstrumentRewardsFragment(java.util.List<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EligibleCashbackProgram> list, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EnrolledCashbackProgram enrolledCashbackProgram) {
        this.eligibleCashbackPrograms = list;
        this.enrolledCashbackProgram = enrolledCashbackProgram;
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EligibleCashbackProgram> getEligibleCashbackPrograms() {
        return this.eligibleCashbackPrograms;
    }

    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EnrolledCashbackProgram getEnrolledCashbackProgram() {
        return this.enrolledCashbackProgram;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentRewardsFragment$EligibleCashbackProgram;", "", "cashbackPercentage", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentRewardsFragment$EligibleCashbackProgram;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCashbackPercentage", "Ljava/lang/String;", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EligibleCashbackProgram {
        public static final int $stable = 8;
        private final java.lang.Object cashbackPercentage;
        private final java.lang.String description;

        public EligibleCashbackProgram(java.lang.Object obj, java.lang.String str) {
            this.cashbackPercentage = obj;
            this.description = str;
        }

        public final java.lang.Object getCashbackPercentage() {
            return this.cashbackPercentage;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.cashbackPercentage;
            java.lang.String str = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EligibleCashbackProgram(cashbackPercentage=");
            sb.append(obj);
            sb.append(", description=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.cashbackPercentage;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.String str = this.description;
            return (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EligibleCashbackProgram)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EligibleCashbackProgram eligibleCashbackProgram = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EligibleCashbackProgram) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cashbackPercentage, eligibleCashbackProgram.cashbackPercentage) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, eligibleCashbackProgram.description);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EligibleCashbackProgram copy(java.lang.Object cashbackPercentage, java.lang.String description) {
            return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EligibleCashbackProgram(cashbackPercentage, description);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCashbackPercentage() {
            return this.cashbackPercentage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EligibleCashbackProgram copy$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EligibleCashbackProgram eligibleCashbackProgram, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = eligibleCashbackProgram.cashbackPercentage;
            }
            if ((i & 2) != 0) {
                str = eligibleCashbackProgram.description;
            }
            return eligibleCashbackProgram.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentRewardsFragment$EnrolledCashbackProgram;", "", "cashbackPercentage", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentRewardsFragment$EnrolledCashbackProgram;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCashbackPercentage", "Ljava/lang/String;", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EnrolledCashbackProgram {
        public static final int $stable = 8;
        private final java.lang.Object cashbackPercentage;
        private final java.lang.String description;

        public EnrolledCashbackProgram(java.lang.Object obj, java.lang.String str) {
            this.cashbackPercentage = obj;
            this.description = str;
        }

        public final java.lang.Object getCashbackPercentage() {
            return this.cashbackPercentage;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.cashbackPercentage;
            java.lang.String str = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EnrolledCashbackProgram(cashbackPercentage=");
            sb.append(obj);
            sb.append(", description=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.cashbackPercentage;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.String str = this.description;
            return (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EnrolledCashbackProgram)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EnrolledCashbackProgram enrolledCashbackProgram = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EnrolledCashbackProgram) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cashbackPercentage, enrolledCashbackProgram.cashbackPercentage) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, enrolledCashbackProgram.description);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EnrolledCashbackProgram copy(java.lang.Object cashbackPercentage, java.lang.String description) {
            return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EnrolledCashbackProgram(cashbackPercentage, description);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCashbackPercentage() {
            return this.cashbackPercentage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EnrolledCashbackProgram copy$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EnrolledCashbackProgram enrolledCashbackProgram, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = enrolledCashbackProgram.cashbackPercentage;
            }
            if ((i & 2) != 0) {
                str = enrolledCashbackProgram.description;
            }
            return enrolledCashbackProgram.copy(obj, str);
        }
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EligibleCashbackProgram> list = this.eligibleCashbackPrograms;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EnrolledCashbackProgram enrolledCashbackProgram = this.enrolledCashbackProgram;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentRewardsFragment(eligibleCashbackPrograms=");
        sb.append(list);
        sb.append(", enrolledCashbackProgram=");
        sb.append(enrolledCashbackProgram);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EligibleCashbackProgram> list = this.eligibleCashbackPrograms;
        int hashCode = list == null ? 0 : list.hashCode();
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EnrolledCashbackProgram enrolledCashbackProgram = this.enrolledCashbackProgram;
        return (hashCode * 31) + (enrolledCashbackProgram != null ? enrolledCashbackProgram.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment debitInstrumentRewardsFragment = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.eligibleCashbackPrograms, debitInstrumentRewardsFragment.eligibleCashbackPrograms) && kotlin.jvm.internal.Intrinsics.areEqual(this.enrolledCashbackProgram, debitInstrumentRewardsFragment.enrolledCashbackProgram);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment copy(java.util.List<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EligibleCashbackProgram> eligibleCashbackPrograms, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EnrolledCashbackProgram enrolledCashbackProgram) {
        return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment(eligibleCashbackPrograms, enrolledCashbackProgram);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EnrolledCashbackProgram getEnrolledCashbackProgram() {
        return this.enrolledCashbackProgram;
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EligibleCashbackProgram> component1() {
        return this.eligibleCashbackPrograms;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment copy$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment debitInstrumentRewardsFragment, java.util.List list, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment.EnrolledCashbackProgram enrolledCashbackProgram, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = debitInstrumentRewardsFragment.eligibleCashbackPrograms;
        }
        if ((i & 2) != 0) {
            enrolledCashbackProgram = debitInstrumentRewardsFragment.enrolledCashbackProgram;
        }
        return debitInstrumentRewardsFragment.copy(list, enrolledCashbackProgram);
    }
}
