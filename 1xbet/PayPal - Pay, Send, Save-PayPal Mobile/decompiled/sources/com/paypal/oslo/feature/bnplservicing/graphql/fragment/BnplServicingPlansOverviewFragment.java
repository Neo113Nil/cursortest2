package com.paypal.oslo.feature.bnplservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001:\u000f\u001d\u001e\u001f !\"#$%&'()*+B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$BnplServicingActivePlans;", com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.PLANS_OVERVIEW_ACTIVE, "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$BnplServicingHistoryPlans;", com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.PLANS_OVERVIEW_HISTORY, "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$BnplServicingActivePlans;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$BnplServicingHistoryPlans;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$BnplServicingActivePlans;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$BnplServicingHistoryPlans;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$BnplServicingActivePlans;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$BnplServicingHistoryPlans;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$BnplServicingActivePlans;", "getBnplServicingActivePlans", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$BnplServicingHistoryPlans;", "getBnplServicingHistoryPlans", "BnplServicingActivePlans", "BnplServicingHistoryPlans", "Page", "Item", "OnBNPLAlmostCompletePlan", "OnBNPLCompletedPlan", "OnBNPLDelinquentPlan", "OnBNPLOnTrackPlan", "OnBNPLPastDuePlan", "OnBNPLPendingPlan", "OnBNPLReadyToUsePlan", "Page1", "Item1", "OnBNPLCompletedPlan1", "OnBNPLMaturedPlan"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BnplServicingPlansOverviewFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingActivePlans bnplServicingActivePlans;
    private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingHistoryPlans bnplServicingHistoryPlans;

    public BnplServicingPlansOverviewFragment(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingActivePlans bnplServicingActivePlans, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingHistoryPlans bnplServicingHistoryPlans) {
        this.bnplServicingActivePlans = bnplServicingActivePlans;
        this.bnplServicingHistoryPlans = bnplServicingHistoryPlans;
    }

    public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingActivePlans getBnplServicingActivePlans() {
        return this.bnplServicingActivePlans;
    }

    public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingHistoryPlans getBnplServicingHistoryPlans() {
        return this.bnplServicingHistoryPlans;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$BnplServicingActivePlans;", "", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$Page;", "page", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$Page;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$Page;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$Page;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$BnplServicingActivePlans;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$Page;", "getPage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BnplServicingActivePlans {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page page;

        public BnplServicingActivePlans(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page page) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            this.page = page;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page getPage() {
            return this.page;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page page = this.page;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplServicingActivePlans(page=");
            sb.append(page);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.page.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingActivePlans) && kotlin.jvm.internal.Intrinsics.areEqual(this.page, ((com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingActivePlans) other).page);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingActivePlans copy(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page page) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingActivePlans(page);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page getPage() {
            return this.page;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingActivePlans copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingActivePlans bnplServicingActivePlans, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page page, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                page = bnplServicingActivePlans.page;
            }
            return bnplServicingActivePlans.copy(page);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$BnplServicingHistoryPlans;", "", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$Page1;", "page", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$Page1;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$Page1;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$Page1;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$BnplServicingHistoryPlans;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$Page1;", "getPage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BnplServicingHistoryPlans {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page1 page;

        public BnplServicingHistoryPlans(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page1 page1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page1, "");
            this.page = page1;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page1 getPage() {
            return this.page;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page1 page1 = this.page;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplServicingHistoryPlans(page=");
            sb.append(page1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.page.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingHistoryPlans) && kotlin.jvm.internal.Intrinsics.areEqual(this.page, ((com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingHistoryPlans) other).page);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingHistoryPlans copy(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page1 page) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingHistoryPlans(page);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page1 getPage() {
            return this.page;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingHistoryPlans copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingHistoryPlans bnplServicingHistoryPlans, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page1 page1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                page1 = bnplServicingHistoryPlans.page;
            }
            return bnplServicingHistoryPlans.copy(page1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$Page;", "", "", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$Page;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Page {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item> items;

        public Page(java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Page(items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page) other).items);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page copy(java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page(items);
        }

        public final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page page, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = page.items;
            }
            return page.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jn\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$Item;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLAlmostCompletePlan;", "onBNPLAlmostCompletePlan", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLCompletedPlan;", "onBNPLCompletedPlan", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLDelinquentPlan;", "onBNPLDelinquentPlan", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLOnTrackPlan;", "onBNPLOnTrackPlan", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLPastDuePlan;", "onBNPLPastDuePlan", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLPendingPlan;", "onBNPLPendingPlan", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLReadyToUsePlan;", "onBNPLReadyToUsePlan", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLAlmostCompletePlan;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLCompletedPlan;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLDelinquentPlan;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLOnTrackPlan;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLPastDuePlan;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLPendingPlan;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLReadyToUsePlan;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLAlmostCompletePlan;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLCompletedPlan;", "component4", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLDelinquentPlan;", "component5", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLOnTrackPlan;", "component6", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLPastDuePlan;", "component7", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLPendingPlan;", "component8", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLReadyToUsePlan;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLAlmostCompletePlan;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLCompletedPlan;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLDelinquentPlan;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLOnTrackPlan;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLPastDuePlan;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLPendingPlan;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLReadyToUsePlan;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLAlmostCompletePlan;", "getOnBNPLAlmostCompletePlan", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLCompletedPlan;", "getOnBNPLCompletedPlan", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLDelinquentPlan;", "getOnBNPLDelinquentPlan", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLOnTrackPlan;", "getOnBNPLOnTrackPlan", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLPastDuePlan;", "getOnBNPLPastDuePlan", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLPendingPlan;", "getOnBNPLPendingPlan", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLReadyToUsePlan;", "getOnBNPLReadyToUsePlan"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLAlmostCompletePlan onBNPLAlmostCompletePlan;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan onBNPLCompletedPlan;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLDelinquentPlan onBNPLDelinquentPlan;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLOnTrackPlan onBNPLOnTrackPlan;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPastDuePlan onBNPLPastDuePlan;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPendingPlan onBNPLPendingPlan;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLReadyToUsePlan onBNPLReadyToUsePlan;

        public Item(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLAlmostCompletePlan onBNPLAlmostCompletePlan, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan onBNPLCompletedPlan, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLDelinquentPlan onBNPLDelinquentPlan, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLOnTrackPlan onBNPLOnTrackPlan, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPastDuePlan onBNPLPastDuePlan, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPendingPlan onBNPLPendingPlan, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLReadyToUsePlan onBNPLReadyToUsePlan) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onBNPLAlmostCompletePlan = onBNPLAlmostCompletePlan;
            this.onBNPLCompletedPlan = onBNPLCompletedPlan;
            this.onBNPLDelinquentPlan = onBNPLDelinquentPlan;
            this.onBNPLOnTrackPlan = onBNPLOnTrackPlan;
            this.onBNPLPastDuePlan = onBNPLPastDuePlan;
            this.onBNPLPendingPlan = onBNPLPendingPlan;
            this.onBNPLReadyToUsePlan = onBNPLReadyToUsePlan;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLAlmostCompletePlan getOnBNPLAlmostCompletePlan() {
            return this.onBNPLAlmostCompletePlan;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan getOnBNPLCompletedPlan() {
            return this.onBNPLCompletedPlan;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLDelinquentPlan getOnBNPLDelinquentPlan() {
            return this.onBNPLDelinquentPlan;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLOnTrackPlan getOnBNPLOnTrackPlan() {
            return this.onBNPLOnTrackPlan;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPastDuePlan getOnBNPLPastDuePlan() {
            return this.onBNPLPastDuePlan;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPendingPlan getOnBNPLPendingPlan() {
            return this.onBNPLPendingPlan;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLReadyToUsePlan getOnBNPLReadyToUsePlan() {
            return this.onBNPLReadyToUsePlan;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLAlmostCompletePlan onBNPLAlmostCompletePlan = this.onBNPLAlmostCompletePlan;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan onBNPLCompletedPlan = this.onBNPLCompletedPlan;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLDelinquentPlan onBNPLDelinquentPlan = this.onBNPLDelinquentPlan;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLOnTrackPlan onBNPLOnTrackPlan = this.onBNPLOnTrackPlan;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPastDuePlan onBNPLPastDuePlan = this.onBNPLPastDuePlan;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPendingPlan onBNPLPendingPlan = this.onBNPLPendingPlan;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLReadyToUsePlan onBNPLReadyToUsePlan = this.onBNPLReadyToUsePlan;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(__typename=");
            sb.append(str);
            sb.append(", onBNPLAlmostCompletePlan=");
            sb.append(onBNPLAlmostCompletePlan);
            sb.append(", onBNPLCompletedPlan=");
            sb.append(onBNPLCompletedPlan);
            sb.append(", onBNPLDelinquentPlan=");
            sb.append(onBNPLDelinquentPlan);
            sb.append(", onBNPLOnTrackPlan=");
            sb.append(onBNPLOnTrackPlan);
            sb.append(", onBNPLPastDuePlan=");
            sb.append(onBNPLPastDuePlan);
            sb.append(", onBNPLPendingPlan=");
            sb.append(onBNPLPendingPlan);
            sb.append(", onBNPLReadyToUsePlan=");
            sb.append(onBNPLReadyToUsePlan);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLAlmostCompletePlan onBNPLAlmostCompletePlan = this.onBNPLAlmostCompletePlan;
            int hashCode2 = onBNPLAlmostCompletePlan == null ? 0 : onBNPLAlmostCompletePlan.hashCode();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan onBNPLCompletedPlan = this.onBNPLCompletedPlan;
            int hashCode3 = onBNPLCompletedPlan == null ? 0 : onBNPLCompletedPlan.hashCode();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLDelinquentPlan onBNPLDelinquentPlan = this.onBNPLDelinquentPlan;
            int hashCode4 = onBNPLDelinquentPlan == null ? 0 : onBNPLDelinquentPlan.hashCode();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLOnTrackPlan onBNPLOnTrackPlan = this.onBNPLOnTrackPlan;
            int hashCode5 = onBNPLOnTrackPlan == null ? 0 : onBNPLOnTrackPlan.hashCode();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPastDuePlan onBNPLPastDuePlan = this.onBNPLPastDuePlan;
            int hashCode6 = onBNPLPastDuePlan == null ? 0 : onBNPLPastDuePlan.hashCode();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPendingPlan onBNPLPendingPlan = this.onBNPLPendingPlan;
            int hashCode7 = onBNPLPendingPlan == null ? 0 : onBNPLPendingPlan.hashCode();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLReadyToUsePlan onBNPLReadyToUsePlan = this.onBNPLReadyToUsePlan;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (onBNPLReadyToUsePlan != null ? onBNPLReadyToUsePlan.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item item = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, item.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBNPLAlmostCompletePlan, item.onBNPLAlmostCompletePlan) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBNPLCompletedPlan, item.onBNPLCompletedPlan) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBNPLDelinquentPlan, item.onBNPLDelinquentPlan) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBNPLOnTrackPlan, item.onBNPLOnTrackPlan) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBNPLPastDuePlan, item.onBNPLPastDuePlan) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBNPLPendingPlan, item.onBNPLPendingPlan) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBNPLReadyToUsePlan, item.onBNPLReadyToUsePlan);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLAlmostCompletePlan onBNPLAlmostCompletePlan, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan onBNPLCompletedPlan, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLDelinquentPlan onBNPLDelinquentPlan, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLOnTrackPlan onBNPLOnTrackPlan, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPastDuePlan onBNPLPastDuePlan, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPendingPlan onBNPLPendingPlan, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLReadyToUsePlan onBNPLReadyToUsePlan) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item(__typename, onBNPLAlmostCompletePlan, onBNPLCompletedPlan, onBNPLDelinquentPlan, onBNPLOnTrackPlan, onBNPLPastDuePlan, onBNPLPendingPlan, onBNPLReadyToUsePlan);
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLReadyToUsePlan getOnBNPLReadyToUsePlan() {
            return this.onBNPLReadyToUsePlan;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPendingPlan getOnBNPLPendingPlan() {
            return this.onBNPLPendingPlan;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPastDuePlan getOnBNPLPastDuePlan() {
            return this.onBNPLPastDuePlan;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLOnTrackPlan getOnBNPLOnTrackPlan() {
            return this.onBNPLOnTrackPlan;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLDelinquentPlan getOnBNPLDelinquentPlan() {
            return this.onBNPLDelinquentPlan;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan getOnBNPLCompletedPlan() {
            return this.onBNPLCompletedPlan;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLAlmostCompletePlan getOnBNPLAlmostCompletePlan() {
            return this.onBNPLAlmostCompletePlan;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLAlmostCompletePlan;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingAlmostCompletePlanFragment;", "bnplServicingAlmostCompletePlanFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingAlmostCompletePlanFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingAlmostCompletePlanFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingAlmostCompletePlanFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLAlmostCompletePlan;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingAlmostCompletePlanFragment;", "getBnplServicingAlmostCompletePlanFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBNPLAlmostCompletePlan {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAlmostCompletePlanFragment bnplServicingAlmostCompletePlanFragment;

        public OnBNPLAlmostCompletePlan(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAlmostCompletePlanFragment bnplServicingAlmostCompletePlanFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingAlmostCompletePlanFragment, "");
            this.__typename = str;
            this.bnplServicingAlmostCompletePlanFragment = bnplServicingAlmostCompletePlanFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAlmostCompletePlanFragment getBnplServicingAlmostCompletePlanFragment() {
            return this.bnplServicingAlmostCompletePlanFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAlmostCompletePlanFragment bnplServicingAlmostCompletePlanFragment = this.bnplServicingAlmostCompletePlanFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBNPLAlmostCompletePlan(__typename=");
            sb.append(str);
            sb.append(", bnplServicingAlmostCompletePlanFragment=");
            sb.append(bnplServicingAlmostCompletePlanFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplServicingAlmostCompletePlanFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLAlmostCompletePlan)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLAlmostCompletePlan onBNPLAlmostCompletePlan = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLAlmostCompletePlan) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBNPLAlmostCompletePlan.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingAlmostCompletePlanFragment, onBNPLAlmostCompletePlan.bnplServicingAlmostCompletePlanFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLAlmostCompletePlan copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAlmostCompletePlanFragment bnplServicingAlmostCompletePlanFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingAlmostCompletePlanFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLAlmostCompletePlan(__typename, bnplServicingAlmostCompletePlanFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAlmostCompletePlanFragment getBnplServicingAlmostCompletePlanFragment() {
            return this.bnplServicingAlmostCompletePlanFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLAlmostCompletePlan copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLAlmostCompletePlan onBNPLAlmostCompletePlan, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAlmostCompletePlanFragment bnplServicingAlmostCompletePlanFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBNPLAlmostCompletePlan.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingAlmostCompletePlanFragment = onBNPLAlmostCompletePlan.bnplServicingAlmostCompletePlanFragment;
            }
            return onBNPLAlmostCompletePlan.copy(str, bnplServicingAlmostCompletePlanFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLCompletedPlan;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment;", "bnplServicingCompletedPlanFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLCompletedPlan;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment;", "getBnplServicingCompletedPlanFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBNPLCompletedPlan {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment bnplServicingCompletedPlanFragment;

        public OnBNPLCompletedPlan(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment bnplServicingCompletedPlanFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingCompletedPlanFragment, "");
            this.__typename = str;
            this.bnplServicingCompletedPlanFragment = bnplServicingCompletedPlanFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment getBnplServicingCompletedPlanFragment() {
            return this.bnplServicingCompletedPlanFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment bnplServicingCompletedPlanFragment = this.bnplServicingCompletedPlanFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBNPLCompletedPlan(__typename=");
            sb.append(str);
            sb.append(", bnplServicingCompletedPlanFragment=");
            sb.append(bnplServicingCompletedPlanFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplServicingCompletedPlanFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan onBNPLCompletedPlan = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBNPLCompletedPlan.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingCompletedPlanFragment, onBNPLCompletedPlan.bnplServicingCompletedPlanFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment bnplServicingCompletedPlanFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingCompletedPlanFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan(__typename, bnplServicingCompletedPlanFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment getBnplServicingCompletedPlanFragment() {
            return this.bnplServicingCompletedPlanFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan onBNPLCompletedPlan, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment bnplServicingCompletedPlanFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBNPLCompletedPlan.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingCompletedPlanFragment = onBNPLCompletedPlan.bnplServicingCompletedPlanFragment;
            }
            return onBNPLCompletedPlan.copy(str, bnplServicingCompletedPlanFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLDelinquentPlan;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingDelinquentPlanFragment;", "bnplServicingDelinquentPlanFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingDelinquentPlanFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingDelinquentPlanFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingDelinquentPlanFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLDelinquentPlan;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingDelinquentPlanFragment;", "getBnplServicingDelinquentPlanFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBNPLDelinquentPlan {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingDelinquentPlanFragment bnplServicingDelinquentPlanFragment;

        public OnBNPLDelinquentPlan(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingDelinquentPlanFragment bnplServicingDelinquentPlanFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingDelinquentPlanFragment, "");
            this.__typename = str;
            this.bnplServicingDelinquentPlanFragment = bnplServicingDelinquentPlanFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingDelinquentPlanFragment getBnplServicingDelinquentPlanFragment() {
            return this.bnplServicingDelinquentPlanFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingDelinquentPlanFragment bnplServicingDelinquentPlanFragment = this.bnplServicingDelinquentPlanFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBNPLDelinquentPlan(__typename=");
            sb.append(str);
            sb.append(", bnplServicingDelinquentPlanFragment=");
            sb.append(bnplServicingDelinquentPlanFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplServicingDelinquentPlanFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLDelinquentPlan)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLDelinquentPlan onBNPLDelinquentPlan = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLDelinquentPlan) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBNPLDelinquentPlan.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingDelinquentPlanFragment, onBNPLDelinquentPlan.bnplServicingDelinquentPlanFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLDelinquentPlan copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingDelinquentPlanFragment bnplServicingDelinquentPlanFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingDelinquentPlanFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLDelinquentPlan(__typename, bnplServicingDelinquentPlanFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingDelinquentPlanFragment getBnplServicingDelinquentPlanFragment() {
            return this.bnplServicingDelinquentPlanFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLDelinquentPlan copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLDelinquentPlan onBNPLDelinquentPlan, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingDelinquentPlanFragment bnplServicingDelinquentPlanFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBNPLDelinquentPlan.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingDelinquentPlanFragment = onBNPLDelinquentPlan.bnplServicingDelinquentPlanFragment;
            }
            return onBNPLDelinquentPlan.copy(str, bnplServicingDelinquentPlanFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLOnTrackPlan;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment;", "bnplServicingOnTrackPlanFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLOnTrackPlan;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment;", "getBnplServicingOnTrackPlanFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBNPLOnTrackPlan {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment bnplServicingOnTrackPlanFragment;

        public OnBNPLOnTrackPlan(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment bnplServicingOnTrackPlanFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingOnTrackPlanFragment, "");
            this.__typename = str;
            this.bnplServicingOnTrackPlanFragment = bnplServicingOnTrackPlanFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment getBnplServicingOnTrackPlanFragment() {
            return this.bnplServicingOnTrackPlanFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment bnplServicingOnTrackPlanFragment = this.bnplServicingOnTrackPlanFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBNPLOnTrackPlan(__typename=");
            sb.append(str);
            sb.append(", bnplServicingOnTrackPlanFragment=");
            sb.append(bnplServicingOnTrackPlanFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplServicingOnTrackPlanFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLOnTrackPlan)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLOnTrackPlan onBNPLOnTrackPlan = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLOnTrackPlan) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBNPLOnTrackPlan.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingOnTrackPlanFragment, onBNPLOnTrackPlan.bnplServicingOnTrackPlanFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLOnTrackPlan copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment bnplServicingOnTrackPlanFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingOnTrackPlanFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLOnTrackPlan(__typename, bnplServicingOnTrackPlanFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment getBnplServicingOnTrackPlanFragment() {
            return this.bnplServicingOnTrackPlanFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLOnTrackPlan copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLOnTrackPlan onBNPLOnTrackPlan, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment bnplServicingOnTrackPlanFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBNPLOnTrackPlan.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingOnTrackPlanFragment = onBNPLOnTrackPlan.bnplServicingOnTrackPlanFragment;
            }
            return onBNPLOnTrackPlan.copy(str, bnplServicingOnTrackPlanFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLPastDuePlan;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragment;", "bnplServicingPastDuePlanFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLPastDuePlan;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragment;", "getBnplServicingPastDuePlanFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBNPLPastDuePlan {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment bnplServicingPastDuePlanFragment;

        public OnBNPLPastDuePlan(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment bnplServicingPastDuePlanFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingPastDuePlanFragment, "");
            this.__typename = str;
            this.bnplServicingPastDuePlanFragment = bnplServicingPastDuePlanFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment getBnplServicingPastDuePlanFragment() {
            return this.bnplServicingPastDuePlanFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment bnplServicingPastDuePlanFragment = this.bnplServicingPastDuePlanFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBNPLPastDuePlan(__typename=");
            sb.append(str);
            sb.append(", bnplServicingPastDuePlanFragment=");
            sb.append(bnplServicingPastDuePlanFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplServicingPastDuePlanFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPastDuePlan)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPastDuePlan onBNPLPastDuePlan = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPastDuePlan) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBNPLPastDuePlan.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingPastDuePlanFragment, onBNPLPastDuePlan.bnplServicingPastDuePlanFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPastDuePlan copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment bnplServicingPastDuePlanFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingPastDuePlanFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPastDuePlan(__typename, bnplServicingPastDuePlanFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment getBnplServicingPastDuePlanFragment() {
            return this.bnplServicingPastDuePlanFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPastDuePlan copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPastDuePlan onBNPLPastDuePlan, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment bnplServicingPastDuePlanFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBNPLPastDuePlan.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingPastDuePlanFragment = onBNPLPastDuePlan.bnplServicingPastDuePlanFragment;
            }
            return onBNPLPastDuePlan.copy(str, bnplServicingPastDuePlanFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLPendingPlan;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPendingPlanFragment;", "bnplServicingPendingPlanFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPendingPlanFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPendingPlanFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPendingPlanFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLPendingPlan;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPendingPlanFragment;", "getBnplServicingPendingPlanFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBNPLPendingPlan {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPendingPlanFragment bnplServicingPendingPlanFragment;

        public OnBNPLPendingPlan(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPendingPlanFragment bnplServicingPendingPlanFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingPendingPlanFragment, "");
            this.__typename = str;
            this.bnplServicingPendingPlanFragment = bnplServicingPendingPlanFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPendingPlanFragment getBnplServicingPendingPlanFragment() {
            return this.bnplServicingPendingPlanFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPendingPlanFragment bnplServicingPendingPlanFragment = this.bnplServicingPendingPlanFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBNPLPendingPlan(__typename=");
            sb.append(str);
            sb.append(", bnplServicingPendingPlanFragment=");
            sb.append(bnplServicingPendingPlanFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplServicingPendingPlanFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPendingPlan)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPendingPlan onBNPLPendingPlan = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPendingPlan) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBNPLPendingPlan.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingPendingPlanFragment, onBNPLPendingPlan.bnplServicingPendingPlanFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPendingPlan copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPendingPlanFragment bnplServicingPendingPlanFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingPendingPlanFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPendingPlan(__typename, bnplServicingPendingPlanFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPendingPlanFragment getBnplServicingPendingPlanFragment() {
            return this.bnplServicingPendingPlanFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPendingPlan copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLPendingPlan onBNPLPendingPlan, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPendingPlanFragment bnplServicingPendingPlanFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBNPLPendingPlan.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingPendingPlanFragment = onBNPLPendingPlan.bnplServicingPendingPlanFragment;
            }
            return onBNPLPendingPlan.copy(str, bnplServicingPendingPlanFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLReadyToUsePlan;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment;", "bnplServicingReadyToUsePlanFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLReadyToUsePlan;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment;", "getBnplServicingReadyToUsePlanFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBNPLReadyToUsePlan {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment bnplServicingReadyToUsePlanFragment;

        public OnBNPLReadyToUsePlan(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment bnplServicingReadyToUsePlanFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingReadyToUsePlanFragment, "");
            this.__typename = str;
            this.bnplServicingReadyToUsePlanFragment = bnplServicingReadyToUsePlanFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment getBnplServicingReadyToUsePlanFragment() {
            return this.bnplServicingReadyToUsePlanFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment bnplServicingReadyToUsePlanFragment = this.bnplServicingReadyToUsePlanFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBNPLReadyToUsePlan(__typename=");
            sb.append(str);
            sb.append(", bnplServicingReadyToUsePlanFragment=");
            sb.append(bnplServicingReadyToUsePlanFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplServicingReadyToUsePlanFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLReadyToUsePlan)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLReadyToUsePlan onBNPLReadyToUsePlan = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLReadyToUsePlan) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBNPLReadyToUsePlan.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingReadyToUsePlanFragment, onBNPLReadyToUsePlan.bnplServicingReadyToUsePlanFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLReadyToUsePlan copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment bnplServicingReadyToUsePlanFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingReadyToUsePlanFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLReadyToUsePlan(__typename, bnplServicingReadyToUsePlanFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment getBnplServicingReadyToUsePlanFragment() {
            return this.bnplServicingReadyToUsePlanFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLReadyToUsePlan copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLReadyToUsePlan onBNPLReadyToUsePlan, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment bnplServicingReadyToUsePlanFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBNPLReadyToUsePlan.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingReadyToUsePlanFragment = onBNPLReadyToUsePlan.bnplServicingReadyToUsePlanFragment;
            }
            return onBNPLReadyToUsePlan.copy(str, bnplServicingReadyToUsePlanFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$Page1;", "", "", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$Item1;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$Page1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Page1 {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item1> items;

        public Page1(java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item1> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item1> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item1> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Page1(items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page1) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page1) other).items);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page1 copy(java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item1> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page1(items);
        }

        public final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item1> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page1 copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Page1 page1, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = page1.items;
            }
            return page1.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$Item1;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLCompletedPlan1;", "onBNPLCompletedPlan", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLMaturedPlan;", "onBNPLMaturedPlan", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLCompletedPlan1;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLMaturedPlan;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLCompletedPlan1;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLMaturedPlan;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLCompletedPlan1;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLMaturedPlan;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$Item1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLCompletedPlan1;", "getOnBNPLCompletedPlan", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLMaturedPlan;", "getOnBNPLMaturedPlan"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item1 {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan1 onBNPLCompletedPlan;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLMaturedPlan onBNPLMaturedPlan;

        public Item1(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan1 onBNPLCompletedPlan1, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLMaturedPlan onBNPLMaturedPlan) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onBNPLCompletedPlan = onBNPLCompletedPlan1;
            this.onBNPLMaturedPlan = onBNPLMaturedPlan;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan1 getOnBNPLCompletedPlan() {
            return this.onBNPLCompletedPlan;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLMaturedPlan getOnBNPLMaturedPlan() {
            return this.onBNPLMaturedPlan;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan1 onBNPLCompletedPlan1 = this.onBNPLCompletedPlan;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLMaturedPlan onBNPLMaturedPlan = this.onBNPLMaturedPlan;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item1(__typename=");
            sb.append(str);
            sb.append(", onBNPLCompletedPlan=");
            sb.append(onBNPLCompletedPlan1);
            sb.append(", onBNPLMaturedPlan=");
            sb.append(onBNPLMaturedPlan);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan1 onBNPLCompletedPlan1 = this.onBNPLCompletedPlan;
            int hashCode2 = onBNPLCompletedPlan1 == null ? 0 : onBNPLCompletedPlan1.hashCode();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLMaturedPlan onBNPLMaturedPlan = this.onBNPLMaturedPlan;
            return (((hashCode * 31) + hashCode2) * 31) + (onBNPLMaturedPlan != null ? onBNPLMaturedPlan.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item1)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item1 item1 = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, item1.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBNPLCompletedPlan, item1.onBNPLCompletedPlan) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBNPLMaturedPlan, item1.onBNPLMaturedPlan);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item1 copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan1 onBNPLCompletedPlan, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLMaturedPlan onBNPLMaturedPlan) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item1(__typename, onBNPLCompletedPlan, onBNPLMaturedPlan);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLMaturedPlan getOnBNPLMaturedPlan() {
            return this.onBNPLMaturedPlan;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan1 getOnBNPLCompletedPlan() {
            return this.onBNPLCompletedPlan;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item1 copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.Item1 item1, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan1 onBNPLCompletedPlan1, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLMaturedPlan onBNPLMaturedPlan, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item1.__typename;
            }
            if ((i & 2) != 0) {
                onBNPLCompletedPlan1 = item1.onBNPLCompletedPlan;
            }
            if ((i & 4) != 0) {
                onBNPLMaturedPlan = item1.onBNPLMaturedPlan;
            }
            return item1.copy(str, onBNPLCompletedPlan1, onBNPLMaturedPlan);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLCompletedPlan1;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment;", "bnplServicingCompletedPlanFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLCompletedPlan1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment;", "getBnplServicingCompletedPlanFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBNPLCompletedPlan1 {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment bnplServicingCompletedPlanFragment;

        public OnBNPLCompletedPlan1(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment bnplServicingCompletedPlanFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingCompletedPlanFragment, "");
            this.__typename = str;
            this.bnplServicingCompletedPlanFragment = bnplServicingCompletedPlanFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment getBnplServicingCompletedPlanFragment() {
            return this.bnplServicingCompletedPlanFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment bnplServicingCompletedPlanFragment = this.bnplServicingCompletedPlanFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBNPLCompletedPlan1(__typename=");
            sb.append(str);
            sb.append(", bnplServicingCompletedPlanFragment=");
            sb.append(bnplServicingCompletedPlanFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplServicingCompletedPlanFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan1)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan1 onBNPLCompletedPlan1 = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBNPLCompletedPlan1.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingCompletedPlanFragment, onBNPLCompletedPlan1.bnplServicingCompletedPlanFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan1 copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment bnplServicingCompletedPlanFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingCompletedPlanFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan1(__typename, bnplServicingCompletedPlanFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment getBnplServicingCompletedPlanFragment() {
            return this.bnplServicingCompletedPlanFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan1 copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLCompletedPlan1 onBNPLCompletedPlan1, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment bnplServicingCompletedPlanFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBNPLCompletedPlan1.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingCompletedPlanFragment = onBNPLCompletedPlan1.bnplServicingCompletedPlanFragment;
            }
            return onBNPLCompletedPlan1.copy(str, bnplServicingCompletedPlanFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLMaturedPlan;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMaturedPlanFragment;", "bnplServicingMaturedPlanFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMaturedPlanFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMaturedPlanFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMaturedPlanFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment$OnBNPLMaturedPlan;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMaturedPlanFragment;", "getBnplServicingMaturedPlanFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBNPLMaturedPlan {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMaturedPlanFragment bnplServicingMaturedPlanFragment;

        public OnBNPLMaturedPlan(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMaturedPlanFragment bnplServicingMaturedPlanFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingMaturedPlanFragment, "");
            this.__typename = str;
            this.bnplServicingMaturedPlanFragment = bnplServicingMaturedPlanFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMaturedPlanFragment getBnplServicingMaturedPlanFragment() {
            return this.bnplServicingMaturedPlanFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMaturedPlanFragment bnplServicingMaturedPlanFragment = this.bnplServicingMaturedPlanFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBNPLMaturedPlan(__typename=");
            sb.append(str);
            sb.append(", bnplServicingMaturedPlanFragment=");
            sb.append(bnplServicingMaturedPlanFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplServicingMaturedPlanFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLMaturedPlan)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLMaturedPlan onBNPLMaturedPlan = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLMaturedPlan) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBNPLMaturedPlan.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingMaturedPlanFragment, onBNPLMaturedPlan.bnplServicingMaturedPlanFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLMaturedPlan copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMaturedPlanFragment bnplServicingMaturedPlanFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingMaturedPlanFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLMaturedPlan(__typename, bnplServicingMaturedPlanFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMaturedPlanFragment getBnplServicingMaturedPlanFragment() {
            return this.bnplServicingMaturedPlanFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLMaturedPlan copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.OnBNPLMaturedPlan onBNPLMaturedPlan, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMaturedPlanFragment bnplServicingMaturedPlanFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBNPLMaturedPlan.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingMaturedPlanFragment = onBNPLMaturedPlan.bnplServicingMaturedPlanFragment;
            }
            return onBNPLMaturedPlan.copy(str, bnplServicingMaturedPlanFragment);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingActivePlans bnplServicingActivePlans = this.bnplServicingActivePlans;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingHistoryPlans bnplServicingHistoryPlans = this.bnplServicingHistoryPlans;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplServicingPlansOverviewFragment(bnplServicingActivePlans=");
        sb.append(bnplServicingActivePlans);
        sb.append(", bnplServicingHistoryPlans=");
        sb.append(bnplServicingHistoryPlans);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingActivePlans bnplServicingActivePlans = this.bnplServicingActivePlans;
        int hashCode = bnplServicingActivePlans == null ? 0 : bnplServicingActivePlans.hashCode();
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingHistoryPlans bnplServicingHistoryPlans = this.bnplServicingHistoryPlans;
        return (hashCode * 31) + (bnplServicingHistoryPlans != null ? bnplServicingHistoryPlans.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment bnplServicingPlansOverviewFragment = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingActivePlans, bnplServicingPlansOverviewFragment.bnplServicingActivePlans) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingHistoryPlans, bnplServicingPlansOverviewFragment.bnplServicingHistoryPlans);
    }

    public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment copy(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingActivePlans bnplServicingActivePlans, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingHistoryPlans bnplServicingHistoryPlans) {
        return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment(bnplServicingActivePlans, bnplServicingHistoryPlans);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingHistoryPlans getBnplServicingHistoryPlans() {
        return this.bnplServicingHistoryPlans;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingActivePlans getBnplServicingActivePlans() {
        return this.bnplServicingActivePlans;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment bnplServicingPlansOverviewFragment, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingActivePlans bnplServicingActivePlans, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment.BnplServicingHistoryPlans bnplServicingHistoryPlans, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bnplServicingActivePlans = bnplServicingPlansOverviewFragment.bnplServicingActivePlans;
        }
        if ((i & 2) != 0) {
            bnplServicingHistoryPlans = bnplServicingPlansOverviewFragment.bnplServicingHistoryPlans;
        }
        return bnplServicingPlansOverviewFragment.copy(bnplServicingActivePlans, bnplServicingHistoryPlans);
    }
}
