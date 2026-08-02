package com.paypal.oslo.feature.home.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001:\u000e\u001e\u001f !\"#$%&'()*+B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "__typename", "trackingId", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$BnplProfilePresentation;", "bnplProfilePresentation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$BnplProfilePresentation;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$BnplProfilePresentation;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$BnplProfilePresentation;)Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "getTrackingId", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$BnplProfilePresentation;", "getBnplProfilePresentation", "BnplProfilePresentation", "Status", "OnBNPLProfileStatusPrequalified", "SpendingPower", "OnBNPLProfileStatusDueThisWeek", "TotalAmountDueThisWeek", "OnBNPLProfileStatusDueToday", "TotalAmountDueToday", "OnBNPLProfileStatusOverdue", "TotalOverdueAmount", "OnBNPLProfileStatusDueOnSpecificDate", "AmountDue", "Plans", "TotalRemainingBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BnplComponentFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String __typename;
    private final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.BnplProfilePresentation bnplProfilePresentation;
    private final java.lang.String trackingId;

    public BnplComponentFragment(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.BnplProfilePresentation bnplProfilePresentation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.__typename = str;
        this.trackingId = str2;
        this.bnplProfilePresentation = bnplProfilePresentation;
    }

    public final java.lang.String get__typename() {
        return this.__typename;
    }

    public final java.lang.String getTrackingId() {
        return this.trackingId;
    }

    public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.BnplProfilePresentation getBnplProfilePresentation() {
        return this.bnplProfilePresentation;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$BnplProfilePresentation;", "", "", "__typename", "accountId", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$Status;", "status", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$Plans;", "plans", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$Status;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$Plans;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$Status;", "component4", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$Plans;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$Status;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$Plans;)Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$BnplProfilePresentation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "getAccountId", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$Status;", "getStatus", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$Plans;", "getPlans"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BnplProfilePresentation {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.String accountId;
        private final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Plans plans;
        private final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Status status;

        public BnplProfilePresentation(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Status status, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Plans plans) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.__typename = str;
            this.accountId = str2;
            this.status = status;
            this.plans = plans;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Status getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Plans getPlans() {
            return this.plans;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.String str2 = this.accountId;
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Status status = this.status;
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Plans plans = this.plans;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplProfilePresentation(__typename=");
            sb.append(str);
            sb.append(", accountId=");
            sb.append(str2);
            sb.append(", status=");
            sb.append(status);
            sb.append(", plans=");
            sb.append(plans);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            int hashCode2 = this.accountId.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Status status = this.status;
            int hashCode3 = status == null ? 0 : status.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Plans plans = this.plans;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (plans != null ? plans.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.BnplProfilePresentation)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.BnplProfilePresentation bnplProfilePresentation = (com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.BnplProfilePresentation) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, bnplProfilePresentation.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, bnplProfilePresentation.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, bnplProfilePresentation.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.plans, bnplProfilePresentation.plans);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.BnplProfilePresentation copy(java.lang.String __typename, java.lang.String accountId, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Status status, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Plans plans) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountId, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.BnplProfilePresentation(__typename, accountId, status, plans);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Plans getPlans() {
            return this.plans;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Status getStatus() {
            return this.status;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.BnplProfilePresentation copy$default(com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.BnplProfilePresentation bnplProfilePresentation, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Status status, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Plans plans, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = bnplProfilePresentation.__typename;
            }
            if ((i & 2) != 0) {
                str2 = bnplProfilePresentation.accountId;
            }
            if ((i & 4) != 0) {
                status = bnplProfilePresentation.status;
            }
            if ((i & 8) != 0) {
                plans = bnplProfilePresentation.plans;
            }
            return bnplProfilePresentation.copy(str, str2, status, plans);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJV\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$Status;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusPrequalified;", "onBNPLProfileStatusPrequalified", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueThisWeek;", "onBNPLProfileStatusDueThisWeek", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueToday;", "onBNPLProfileStatusDueToday", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusOverdue;", "onBNPLProfileStatusOverdue", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueOnSpecificDate;", "onBNPLProfileStatusDueOnSpecificDate", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusPrequalified;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueThisWeek;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueToday;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusOverdue;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueOnSpecificDate;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusPrequalified;", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueThisWeek;", "component4", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueToday;", "component5", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusOverdue;", "component6", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueOnSpecificDate;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusPrequalified;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueThisWeek;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueToday;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusOverdue;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueOnSpecificDate;)Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$Status;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusPrequalified;", "getOnBNPLProfileStatusPrequalified", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueThisWeek;", "getOnBNPLProfileStatusDueThisWeek", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueToday;", "getOnBNPLProfileStatusDueToday", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusOverdue;", "getOnBNPLProfileStatusOverdue", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueOnSpecificDate;", "getOnBNPLProfileStatusDueOnSpecificDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Status {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueOnSpecificDate onBNPLProfileStatusDueOnSpecificDate;
        private final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueThisWeek onBNPLProfileStatusDueThisWeek;
        private final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueToday onBNPLProfileStatusDueToday;
        private final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusOverdue onBNPLProfileStatusOverdue;
        private final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusPrequalified onBNPLProfileStatusPrequalified;

        public Status(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusPrequalified onBNPLProfileStatusPrequalified, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueThisWeek onBNPLProfileStatusDueThisWeek, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueToday onBNPLProfileStatusDueToday, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusOverdue onBNPLProfileStatusOverdue, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueOnSpecificDate onBNPLProfileStatusDueOnSpecificDate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onBNPLProfileStatusPrequalified = onBNPLProfileStatusPrequalified;
            this.onBNPLProfileStatusDueThisWeek = onBNPLProfileStatusDueThisWeek;
            this.onBNPLProfileStatusDueToday = onBNPLProfileStatusDueToday;
            this.onBNPLProfileStatusOverdue = onBNPLProfileStatusOverdue;
            this.onBNPLProfileStatusDueOnSpecificDate = onBNPLProfileStatusDueOnSpecificDate;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusPrequalified getOnBNPLProfileStatusPrequalified() {
            return this.onBNPLProfileStatusPrequalified;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueThisWeek getOnBNPLProfileStatusDueThisWeek() {
            return this.onBNPLProfileStatusDueThisWeek;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueToday getOnBNPLProfileStatusDueToday() {
            return this.onBNPLProfileStatusDueToday;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusOverdue getOnBNPLProfileStatusOverdue() {
            return this.onBNPLProfileStatusOverdue;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueOnSpecificDate getOnBNPLProfileStatusDueOnSpecificDate() {
            return this.onBNPLProfileStatusDueOnSpecificDate;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusPrequalified onBNPLProfileStatusPrequalified = this.onBNPLProfileStatusPrequalified;
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueThisWeek onBNPLProfileStatusDueThisWeek = this.onBNPLProfileStatusDueThisWeek;
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueToday onBNPLProfileStatusDueToday = this.onBNPLProfileStatusDueToday;
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusOverdue onBNPLProfileStatusOverdue = this.onBNPLProfileStatusOverdue;
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueOnSpecificDate onBNPLProfileStatusDueOnSpecificDate = this.onBNPLProfileStatusDueOnSpecificDate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Status(__typename=");
            sb.append(str);
            sb.append(", onBNPLProfileStatusPrequalified=");
            sb.append(onBNPLProfileStatusPrequalified);
            sb.append(", onBNPLProfileStatusDueThisWeek=");
            sb.append(onBNPLProfileStatusDueThisWeek);
            sb.append(", onBNPLProfileStatusDueToday=");
            sb.append(onBNPLProfileStatusDueToday);
            sb.append(", onBNPLProfileStatusOverdue=");
            sb.append(onBNPLProfileStatusOverdue);
            sb.append(", onBNPLProfileStatusDueOnSpecificDate=");
            sb.append(onBNPLProfileStatusDueOnSpecificDate);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusPrequalified onBNPLProfileStatusPrequalified = this.onBNPLProfileStatusPrequalified;
            int hashCode2 = onBNPLProfileStatusPrequalified == null ? 0 : onBNPLProfileStatusPrequalified.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueThisWeek onBNPLProfileStatusDueThisWeek = this.onBNPLProfileStatusDueThisWeek;
            int hashCode3 = onBNPLProfileStatusDueThisWeek == null ? 0 : onBNPLProfileStatusDueThisWeek.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueToday onBNPLProfileStatusDueToday = this.onBNPLProfileStatusDueToday;
            int hashCode4 = onBNPLProfileStatusDueToday == null ? 0 : onBNPLProfileStatusDueToday.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusOverdue onBNPLProfileStatusOverdue = this.onBNPLProfileStatusOverdue;
            int hashCode5 = onBNPLProfileStatusOverdue == null ? 0 : onBNPLProfileStatusOverdue.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueOnSpecificDate onBNPLProfileStatusDueOnSpecificDate = this.onBNPLProfileStatusDueOnSpecificDate;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (onBNPLProfileStatusDueOnSpecificDate != null ? onBNPLProfileStatusDueOnSpecificDate.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Status)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Status status = (com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Status) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, status.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBNPLProfileStatusPrequalified, status.onBNPLProfileStatusPrequalified) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBNPLProfileStatusDueThisWeek, status.onBNPLProfileStatusDueThisWeek) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBNPLProfileStatusDueToday, status.onBNPLProfileStatusDueToday) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBNPLProfileStatusOverdue, status.onBNPLProfileStatusOverdue) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBNPLProfileStatusDueOnSpecificDate, status.onBNPLProfileStatusDueOnSpecificDate);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Status copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusPrequalified onBNPLProfileStatusPrequalified, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueThisWeek onBNPLProfileStatusDueThisWeek, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueToday onBNPLProfileStatusDueToday, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusOverdue onBNPLProfileStatusOverdue, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueOnSpecificDate onBNPLProfileStatusDueOnSpecificDate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Status(__typename, onBNPLProfileStatusPrequalified, onBNPLProfileStatusDueThisWeek, onBNPLProfileStatusDueToday, onBNPLProfileStatusOverdue, onBNPLProfileStatusDueOnSpecificDate);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueOnSpecificDate getOnBNPLProfileStatusDueOnSpecificDate() {
            return this.onBNPLProfileStatusDueOnSpecificDate;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusOverdue getOnBNPLProfileStatusOverdue() {
            return this.onBNPLProfileStatusOverdue;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueToday getOnBNPLProfileStatusDueToday() {
            return this.onBNPLProfileStatusDueToday;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueThisWeek getOnBNPLProfileStatusDueThisWeek() {
            return this.onBNPLProfileStatusDueThisWeek;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusPrequalified getOnBNPLProfileStatusPrequalified() {
            return this.onBNPLProfileStatusPrequalified;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Status copy$default(com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Status status, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusPrequalified onBNPLProfileStatusPrequalified, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueThisWeek onBNPLProfileStatusDueThisWeek, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueToday onBNPLProfileStatusDueToday, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusOverdue onBNPLProfileStatusOverdue, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueOnSpecificDate onBNPLProfileStatusDueOnSpecificDate, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = status.__typename;
            }
            if ((i & 2) != 0) {
                onBNPLProfileStatusPrequalified = status.onBNPLProfileStatusPrequalified;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusPrequalified onBNPLProfileStatusPrequalified2 = onBNPLProfileStatusPrequalified;
            if ((i & 4) != 0) {
                onBNPLProfileStatusDueThisWeek = status.onBNPLProfileStatusDueThisWeek;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueThisWeek onBNPLProfileStatusDueThisWeek2 = onBNPLProfileStatusDueThisWeek;
            if ((i & 8) != 0) {
                onBNPLProfileStatusDueToday = status.onBNPLProfileStatusDueToday;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueToday onBNPLProfileStatusDueToday2 = onBNPLProfileStatusDueToday;
            if ((i & 16) != 0) {
                onBNPLProfileStatusOverdue = status.onBNPLProfileStatusOverdue;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusOverdue onBNPLProfileStatusOverdue2 = onBNPLProfileStatusOverdue;
            if ((i & 32) != 0) {
                onBNPLProfileStatusDueOnSpecificDate = status.onBNPLProfileStatusDueOnSpecificDate;
            }
            return status.copy(str, onBNPLProfileStatusPrequalified2, onBNPLProfileStatusDueThisWeek2, onBNPLProfileStatusDueToday2, onBNPLProfileStatusOverdue2, onBNPLProfileStatusDueOnSpecificDate);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusPrequalified;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$SpendingPower;", "spendingPower", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$SpendingPower;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$SpendingPower;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$SpendingPower;)Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusPrequalified;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$SpendingPower;", "getSpendingPower"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBNPLProfileStatusPrequalified {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.SpendingPower spendingPower;

        public OnBNPLProfileStatusPrequalified(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.SpendingPower spendingPower) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spendingPower, "");
            this.__typename = str;
            this.spendingPower = spendingPower;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.SpendingPower getSpendingPower() {
            return this.spendingPower;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.SpendingPower spendingPower = this.spendingPower;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBNPLProfileStatusPrequalified(__typename=");
            sb.append(str);
            sb.append(", spendingPower=");
            sb.append(spendingPower);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.spendingPower.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusPrequalified)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusPrequalified onBNPLProfileStatusPrequalified = (com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusPrequalified) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBNPLProfileStatusPrequalified.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.spendingPower, onBNPLProfileStatusPrequalified.spendingPower);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusPrequalified copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.SpendingPower spendingPower) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spendingPower, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusPrequalified(__typename, spendingPower);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.SpendingPower getSpendingPower() {
            return this.spendingPower;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusPrequalified copy$default(com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusPrequalified onBNPLProfileStatusPrequalified, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.SpendingPower spendingPower, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBNPLProfileStatusPrequalified.__typename;
            }
            if ((i & 2) != 0) {
                spendingPower = onBNPLProfileStatusPrequalified.spendingPower;
            }
            return onBNPLProfileStatusPrequalified.copy(str, spendingPower);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$SpendingPower;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$SpendingPower;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SpendingPower {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;

        public SpendingPower(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SpendingPower(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.SpendingPower)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.SpendingPower spendingPower = (com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.SpendingPower) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, spendingPower.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, spendingPower.moneyFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.SpendingPower copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.SpendingPower(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.SpendingPower copy$default(com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.SpendingPower spendingPower, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = spendingPower.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = spendingPower.moneyFragment;
            }
            return spendingPower.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueThisWeek;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalAmountDueThisWeek;", "totalAmountDueThisWeek", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalAmountDueThisWeek;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalAmountDueThisWeek;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalAmountDueThisWeek;)Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueThisWeek;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalAmountDueThisWeek;", "getTotalAmountDueThisWeek"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBNPLProfileStatusDueThisWeek {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueThisWeek totalAmountDueThisWeek;

        public OnBNPLProfileStatusDueThisWeek(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueThisWeek totalAmountDueThisWeek) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmountDueThisWeek, "");
            this.__typename = str;
            this.totalAmountDueThisWeek = totalAmountDueThisWeek;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueThisWeek getTotalAmountDueThisWeek() {
            return this.totalAmountDueThisWeek;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueThisWeek totalAmountDueThisWeek = this.totalAmountDueThisWeek;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBNPLProfileStatusDueThisWeek(__typename=");
            sb.append(str);
            sb.append(", totalAmountDueThisWeek=");
            sb.append(totalAmountDueThisWeek);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.totalAmountDueThisWeek.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueThisWeek)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueThisWeek onBNPLProfileStatusDueThisWeek = (com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueThisWeek) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBNPLProfileStatusDueThisWeek.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmountDueThisWeek, onBNPLProfileStatusDueThisWeek.totalAmountDueThisWeek);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueThisWeek copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueThisWeek totalAmountDueThisWeek) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmountDueThisWeek, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueThisWeek(__typename, totalAmountDueThisWeek);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueThisWeek getTotalAmountDueThisWeek() {
            return this.totalAmountDueThisWeek;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueThisWeek copy$default(com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueThisWeek onBNPLProfileStatusDueThisWeek, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueThisWeek totalAmountDueThisWeek, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBNPLProfileStatusDueThisWeek.__typename;
            }
            if ((i & 2) != 0) {
                totalAmountDueThisWeek = onBNPLProfileStatusDueThisWeek.totalAmountDueThisWeek;
            }
            return onBNPLProfileStatusDueThisWeek.copy(str, totalAmountDueThisWeek);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalAmountDueThisWeek;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalAmountDueThisWeek;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalAmountDueThisWeek {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;

        public TotalAmountDueThisWeek(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalAmountDueThisWeek(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueThisWeek)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueThisWeek totalAmountDueThisWeek = (com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueThisWeek) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalAmountDueThisWeek.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, totalAmountDueThisWeek.moneyFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueThisWeek copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueThisWeek(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueThisWeek copy$default(com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueThisWeek totalAmountDueThisWeek, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = totalAmountDueThisWeek.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = totalAmountDueThisWeek.moneyFragment;
            }
            return totalAmountDueThisWeek.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueToday;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalAmountDueToday;", "totalAmountDueToday", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalAmountDueToday;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalAmountDueToday;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalAmountDueToday;)Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueToday;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalAmountDueToday;", "getTotalAmountDueToday"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBNPLProfileStatusDueToday {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueToday totalAmountDueToday;

        public OnBNPLProfileStatusDueToday(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueToday totalAmountDueToday) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmountDueToday, "");
            this.__typename = str;
            this.totalAmountDueToday = totalAmountDueToday;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueToday getTotalAmountDueToday() {
            return this.totalAmountDueToday;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueToday totalAmountDueToday = this.totalAmountDueToday;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBNPLProfileStatusDueToday(__typename=");
            sb.append(str);
            sb.append(", totalAmountDueToday=");
            sb.append(totalAmountDueToday);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.totalAmountDueToday.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueToday)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueToday onBNPLProfileStatusDueToday = (com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueToday) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBNPLProfileStatusDueToday.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmountDueToday, onBNPLProfileStatusDueToday.totalAmountDueToday);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueToday copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueToday totalAmountDueToday) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmountDueToday, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueToday(__typename, totalAmountDueToday);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueToday getTotalAmountDueToday() {
            return this.totalAmountDueToday;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueToday copy$default(com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueToday onBNPLProfileStatusDueToday, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueToday totalAmountDueToday, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBNPLProfileStatusDueToday.__typename;
            }
            if ((i & 2) != 0) {
                totalAmountDueToday = onBNPLProfileStatusDueToday.totalAmountDueToday;
            }
            return onBNPLProfileStatusDueToday.copy(str, totalAmountDueToday);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalAmountDueToday;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalAmountDueToday;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalAmountDueToday {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;

        public TotalAmountDueToday(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalAmountDueToday(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueToday)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueToday totalAmountDueToday = (com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueToday) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalAmountDueToday.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, totalAmountDueToday.moneyFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueToday copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueToday(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueToday copy$default(com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalAmountDueToday totalAmountDueToday, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = totalAmountDueToday.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = totalAmountDueToday.moneyFragment;
            }
            return totalAmountDueToday.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusOverdue;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalOverdueAmount;", "totalOverdueAmount", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalOverdueAmount;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalOverdueAmount;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalOverdueAmount;)Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusOverdue;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalOverdueAmount;", "getTotalOverdueAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBNPLProfileStatusOverdue {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalOverdueAmount totalOverdueAmount;

        public OnBNPLProfileStatusOverdue(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalOverdueAmount totalOverdueAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalOverdueAmount, "");
            this.__typename = str;
            this.totalOverdueAmount = totalOverdueAmount;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalOverdueAmount getTotalOverdueAmount() {
            return this.totalOverdueAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalOverdueAmount totalOverdueAmount = this.totalOverdueAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBNPLProfileStatusOverdue(__typename=");
            sb.append(str);
            sb.append(", totalOverdueAmount=");
            sb.append(totalOverdueAmount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.totalOverdueAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusOverdue)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusOverdue onBNPLProfileStatusOverdue = (com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusOverdue) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBNPLProfileStatusOverdue.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalOverdueAmount, onBNPLProfileStatusOverdue.totalOverdueAmount);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusOverdue copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalOverdueAmount totalOverdueAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalOverdueAmount, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusOverdue(__typename, totalOverdueAmount);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalOverdueAmount getTotalOverdueAmount() {
            return this.totalOverdueAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusOverdue copy$default(com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusOverdue onBNPLProfileStatusOverdue, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalOverdueAmount totalOverdueAmount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBNPLProfileStatusOverdue.__typename;
            }
            if ((i & 2) != 0) {
                totalOverdueAmount = onBNPLProfileStatusOverdue.totalOverdueAmount;
            }
            return onBNPLProfileStatusOverdue.copy(str, totalOverdueAmount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalOverdueAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalOverdueAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalOverdueAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;

        public TotalOverdueAmount(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalOverdueAmount(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalOverdueAmount)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalOverdueAmount totalOverdueAmount = (com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalOverdueAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalOverdueAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, totalOverdueAmount.moneyFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalOverdueAmount copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalOverdueAmount(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalOverdueAmount copy$default(com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalOverdueAmount totalOverdueAmount, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = totalOverdueAmount.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = totalOverdueAmount.moneyFragment;
            }
            return totalOverdueAmount.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueOnSpecificDate;", "", "", "__typename", "dueDate", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$AmountDue;", "amountDue", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$AmountDue;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$AmountDue;", "copy", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$AmountDue;)Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$OnBNPLProfileStatusDueOnSpecificDate;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Ljava/lang/Object;", "getDueDate", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$AmountDue;", "getAmountDue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBNPLProfileStatusDueOnSpecificDate {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.AmountDue amountDue;
        private final java.lang.Object dueDate;

        public OnBNPLProfileStatusDueOnSpecificDate(java.lang.String str, java.lang.Object obj, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.AmountDue amountDue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountDue, "");
            this.__typename = str;
            this.dueDate = obj;
            this.amountDue = amountDue;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.Object getDueDate() {
            return this.dueDate;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.AmountDue getAmountDue() {
            return this.amountDue;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.Object obj = this.dueDate;
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.AmountDue amountDue = this.amountDue;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBNPLProfileStatusDueOnSpecificDate(__typename=");
            sb.append(str);
            sb.append(", dueDate=");
            sb.append(obj);
            sb.append(", amountDue=");
            sb.append(amountDue);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            java.lang.Object obj = this.dueDate;
            return (((hashCode * 31) + (obj == null ? 0 : obj.hashCode())) * 31) + this.amountDue.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueOnSpecificDate)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueOnSpecificDate onBNPLProfileStatusDueOnSpecificDate = (com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueOnSpecificDate) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBNPLProfileStatusDueOnSpecificDate.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.dueDate, onBNPLProfileStatusDueOnSpecificDate.dueDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountDue, onBNPLProfileStatusDueOnSpecificDate.amountDue);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueOnSpecificDate copy(java.lang.String __typename, java.lang.Object dueDate, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.AmountDue amountDue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountDue, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueOnSpecificDate(__typename, dueDate, amountDue);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.AmountDue getAmountDue() {
            return this.amountDue;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getDueDate() {
            return this.dueDate;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueOnSpecificDate copy$default(com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.OnBNPLProfileStatusDueOnSpecificDate onBNPLProfileStatusDueOnSpecificDate, java.lang.String str, java.lang.Object obj, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.AmountDue amountDue, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = onBNPLProfileStatusDueOnSpecificDate.__typename;
            }
            if ((i & 2) != 0) {
                obj = onBNPLProfileStatusDueOnSpecificDate.dueDate;
            }
            if ((i & 4) != 0) {
                amountDue = onBNPLProfileStatusDueOnSpecificDate.amountDue;
            }
            return onBNPLProfileStatusDueOnSpecificDate.copy(str, obj, amountDue);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$AmountDue;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$AmountDue;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountDue {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;

        public AmountDue(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountDue(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.AmountDue)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.AmountDue amountDue = (com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.AmountDue) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amountDue.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, amountDue.moneyFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.AmountDue copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.AmountDue(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.AmountDue copy$default(com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.AmountDue amountDue, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amountDue.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = amountDue.moneyFragment;
            }
            return amountDue.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$Plans;", "", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalRemainingBalance;", "totalRemainingBalance", "", com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT, "<init>", "(Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalRemainingBalance;Ljava/lang/Integer;)V", "component1", "()Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalRemainingBalance;", "component2", "()Ljava/lang/Integer;", "copy", "(Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalRemainingBalance;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$Plans;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalRemainingBalance;", "getTotalRemainingBalance", "Ljava/lang/Integer;", "getTotalCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Plans {
        public static final int $stable = 8;
        private final java.lang.Integer totalCount;
        private final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalRemainingBalance totalRemainingBalance;

        public Plans(com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalRemainingBalance totalRemainingBalance, java.lang.Integer num) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalRemainingBalance, "");
            this.totalRemainingBalance = totalRemainingBalance;
            this.totalCount = num;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalRemainingBalance getTotalRemainingBalance() {
            return this.totalRemainingBalance;
        }

        public final java.lang.Integer getTotalCount() {
            return this.totalCount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalRemainingBalance totalRemainingBalance = this.totalRemainingBalance;
            java.lang.Integer num = this.totalCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Plans(totalRemainingBalance=");
            sb.append(totalRemainingBalance);
            sb.append(", totalCount=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.totalRemainingBalance.hashCode();
            java.lang.Integer num = this.totalCount;
            return (hashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Plans)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Plans plans = (com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Plans) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.totalRemainingBalance, plans.totalRemainingBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalCount, plans.totalCount);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Plans copy(com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalRemainingBalance totalRemainingBalance, java.lang.Integer totalCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalRemainingBalance, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Plans(totalRemainingBalance, totalCount);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getTotalCount() {
            return this.totalCount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalRemainingBalance getTotalRemainingBalance() {
            return this.totalRemainingBalance;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Plans copy$default(com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.Plans plans, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalRemainingBalance totalRemainingBalance, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                totalRemainingBalance = plans.totalRemainingBalance;
            }
            if ((i & 2) != 0) {
                num = plans.totalCount;
            }
            return plans.copy(totalRemainingBalance, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalRemainingBalance;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment$TotalRemainingBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalRemainingBalance {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;

        public TotalRemainingBalance(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalRemainingBalance(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalRemainingBalance)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalRemainingBalance totalRemainingBalance = (com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalRemainingBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalRemainingBalance.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, totalRemainingBalance.moneyFragment);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalRemainingBalance copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalRemainingBalance(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalRemainingBalance copy$default(com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.TotalRemainingBalance totalRemainingBalance, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = totalRemainingBalance.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = totalRemainingBalance.moneyFragment;
            }
            return totalRemainingBalance.copy(str, moneyFragment);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.__typename;
        java.lang.String str2 = this.trackingId;
        com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.BnplProfilePresentation bnplProfilePresentation = this.bnplProfilePresentation;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplComponentFragment(__typename=");
        sb.append(str);
        sb.append(", trackingId=");
        sb.append(str2);
        sb.append(", bnplProfilePresentation=");
        sb.append(bnplProfilePresentation);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.__typename.hashCode();
        java.lang.String str = this.trackingId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.BnplProfilePresentation bnplProfilePresentation = this.bnplProfilePresentation;
        return (((hashCode * 31) + hashCode2) * 31) + (bnplProfilePresentation != null ? bnplProfilePresentation.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment)) {
            return false;
        }
        com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment bnplComponentFragment = (com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, bnplComponentFragment.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingId, bnplComponentFragment.trackingId) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplProfilePresentation, bnplComponentFragment.bnplProfilePresentation);
    }

    public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment copy(java.lang.String __typename, java.lang.String trackingId, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.BnplProfilePresentation bnplProfilePresentation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
        return new com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment(__typename, trackingId, bnplProfilePresentation);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.BnplProfilePresentation getBnplProfilePresentation() {
        return this.bnplProfilePresentation;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTrackingId() {
        return this.trackingId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String get__typename() {
        return this.__typename;
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment copy$default(com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment bnplComponentFragment, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment.BnplProfilePresentation bnplProfilePresentation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bnplComponentFragment.__typename;
        }
        if ((i & 2) != 0) {
            str2 = bnplComponentFragment.trackingId;
        }
        if ((i & 4) != 0) {
            bnplProfilePresentation = bnplComponentFragment.bnplProfilePresentation;
        }
        return bnplComponentFragment.copy(str, str2, bnplProfilePresentation);
    }
}
