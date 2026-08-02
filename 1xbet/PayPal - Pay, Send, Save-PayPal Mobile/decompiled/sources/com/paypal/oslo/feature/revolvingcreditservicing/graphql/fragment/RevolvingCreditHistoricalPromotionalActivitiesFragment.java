package com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0006\u0017\u0018\u0019\u001a\u001b\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$Page;", "page", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$Page;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$Page;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$Page;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$Page;", "getPage", "Page", "Item", "RemainingBalance", "InterestAccrued", "OriginalTransactionAmount", "OfferConstruct"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RevolvingCreditHistoricalPromotionalActivitiesFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Page page;

    public RevolvingCreditHistoricalPromotionalActivitiesFragment(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        this.page = page;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Page getPage() {
        return this.page;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013JH\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$Page;", "", "", "offset", "limit", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$Item;", "items", "", "hasPreviousPage", "hasNextPage", "<init>", "(IILjava/util/List;ZZ)V", "component1", "()I", "component2", "component3", "()Ljava/util/List;", "component4", "()Z", "component5", "copy", "(IILjava/util/List;ZZ)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$Page;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getOffset", "getLimit", "Ljava/util/List;", "getItems", "Z", "getHasPreviousPage", "getHasNextPage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Page {
        public static final int $stable = 8;
        private final boolean hasNextPage;
        private final boolean hasPreviousPage;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Item> items;
        private final int limit;
        private final int offset;

        public Page(int i, int i2, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Item> list, boolean z, boolean z2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.offset = i;
            this.limit = i2;
            this.items = list;
            this.hasPreviousPage = z;
            this.hasNextPage = z2;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final int getLimit() {
            return this.limit;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Item> getItems() {
            return this.items;
        }

        public final boolean getHasPreviousPage() {
            return this.hasPreviousPage;
        }

        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        public final java.lang.String toString() {
            int i = this.offset;
            int i2 = this.limit;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Item> list = this.items;
            boolean z = this.hasPreviousPage;
            boolean z2 = this.hasNextPage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Page(offset=");
            sb.append(i);
            sb.append(", limit=");
            sb.append(i2);
            sb.append(", items=");
            sb.append(list);
            sb.append(", hasPreviousPage=");
            sb.append(z);
            sb.append(", hasNextPage=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((java.lang.Integer.hashCode(this.offset) * 31) + java.lang.Integer.hashCode(this.limit)) * 31) + this.items.hashCode()) * 31) + java.lang.Boolean.hashCode(this.hasPreviousPage)) * 31) + java.lang.Boolean.hashCode(this.hasNextPage);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Page)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Page page = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Page) other;
            return this.offset == page.offset && this.limit == page.limit && kotlin.jvm.internal.Intrinsics.areEqual(this.items, page.items) && this.hasPreviousPage == page.hasPreviousPage && this.hasNextPage == page.hasNextPage;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Page copy(int offset, int limit, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Item> items, boolean hasPreviousPage, boolean hasNextPage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Page(offset, limit, items, hasPreviousPage, hasNextPage);
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasPreviousPage() {
            return this.hasPreviousPage;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Item> component3() {
            return this.items;
        }

        /* renamed from: component2, reason: from getter */
        public final int getLimit() {
            return this.limit;
        }

        /* renamed from: component1, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Page copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Page page, int i, int i2, java.util.List list, boolean z, boolean z2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = page.offset;
            }
            if ((i3 & 2) != 0) {
                i2 = page.limit;
            }
            int i4 = i2;
            if ((i3 & 4) != 0) {
                list = page.items;
            }
            java.util.List list2 = list;
            if ((i3 & 8) != 0) {
                z = page.hasPreviousPage;
            }
            boolean z3 = z;
            if ((i3 & 16) != 0) {
                z2 = page.hasNextPage;
            }
            return page.copy(i, i4, list2, z3, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jn\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b*\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b3\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$Item;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPromotionalActivityStatus;", "status", "time", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$RemainingBalance;", "remainingBalance", "", "businessName", "expirationTime", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$InterestAccrued;", "interestAccrued", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$OriginalTransactionAmount;", "originalTransactionAmount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$OfferConstruct;", "offerConstruct", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPromotionalActivityStatus;Ljava/lang/Object;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$RemainingBalance;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$InterestAccrued;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$OriginalTransactionAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$OfferConstruct;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPromotionalActivityStatus;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$RemainingBalance;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$InterestAccrued;", "component7", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$OriginalTransactionAmount;", "component8", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$OfferConstruct;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPromotionalActivityStatus;Ljava/lang/Object;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$RemainingBalance;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$InterestAccrued;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$OriginalTransactionAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$OfferConstruct;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPromotionalActivityStatus;", "getStatus", "Ljava/lang/Object;", "getTime", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$RemainingBalance;", "getRemainingBalance", "Ljava/lang/String;", "getBusinessName", "getExpirationTime", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$InterestAccrued;", "getInterestAccrued", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$OriginalTransactionAmount;", "getOriginalTransactionAmount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$OfferConstruct;", "getOfferConstruct"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String businessName;
        private final java.lang.Object expirationTime;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.InterestAccrued interestAccrued;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OfferConstruct offerConstruct;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OriginalTransactionAmount originalTransactionAmount;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.RemainingBalance remainingBalance;
        private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPromotionalActivityStatus status;
        private final java.lang.Object time;

        public Item(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPromotionalActivityStatus revolvingCreditPromotionalActivityStatus, java.lang.Object obj, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.RemainingBalance remainingBalance, java.lang.String str, java.lang.Object obj2, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.InterestAccrued interestAccrued, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OriginalTransactionAmount originalTransactionAmount, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OfferConstruct offerConstruct) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPromotionalActivityStatus, "");
            this.status = revolvingCreditPromotionalActivityStatus;
            this.time = obj;
            this.remainingBalance = remainingBalance;
            this.businessName = str;
            this.expirationTime = obj2;
            this.interestAccrued = interestAccrued;
            this.originalTransactionAmount = originalTransactionAmount;
            this.offerConstruct = offerConstruct;
        }

        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPromotionalActivityStatus getStatus() {
            return this.status;
        }

        public final java.lang.Object getTime() {
            return this.time;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.RemainingBalance getRemainingBalance() {
            return this.remainingBalance;
        }

        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public final java.lang.Object getExpirationTime() {
            return this.expirationTime;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.InterestAccrued getInterestAccrued() {
            return this.interestAccrued;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OriginalTransactionAmount getOriginalTransactionAmount() {
            return this.originalTransactionAmount;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OfferConstruct getOfferConstruct() {
            return this.offerConstruct;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPromotionalActivityStatus revolvingCreditPromotionalActivityStatus = this.status;
            java.lang.Object obj = this.time;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.RemainingBalance remainingBalance = this.remainingBalance;
            java.lang.String str = this.businessName;
            java.lang.Object obj2 = this.expirationTime;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.InterestAccrued interestAccrued = this.interestAccrued;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OriginalTransactionAmount originalTransactionAmount = this.originalTransactionAmount;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OfferConstruct offerConstruct = this.offerConstruct;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(status=");
            sb.append(revolvingCreditPromotionalActivityStatus);
            sb.append(", time=");
            sb.append(obj);
            sb.append(", remainingBalance=");
            sb.append(remainingBalance);
            sb.append(", businessName=");
            sb.append(str);
            sb.append(", expirationTime=");
            sb.append(obj2);
            sb.append(", interestAccrued=");
            sb.append(interestAccrued);
            sb.append(", originalTransactionAmount=");
            sb.append(originalTransactionAmount);
            sb.append(", offerConstruct=");
            sb.append(offerConstruct);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.status.hashCode();
            java.lang.Object obj = this.time;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.RemainingBalance remainingBalance = this.remainingBalance;
            int hashCode3 = remainingBalance == null ? 0 : remainingBalance.hashCode();
            java.lang.String str = this.businessName;
            int hashCode4 = str == null ? 0 : str.hashCode();
            java.lang.Object obj2 = this.expirationTime;
            int hashCode5 = obj2 == null ? 0 : obj2.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.InterestAccrued interestAccrued = this.interestAccrued;
            int hashCode6 = interestAccrued == null ? 0 : interestAccrued.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OriginalTransactionAmount originalTransactionAmount = this.originalTransactionAmount;
            int hashCode7 = originalTransactionAmount == null ? 0 : originalTransactionAmount.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OfferConstruct offerConstruct = this.offerConstruct;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (offerConstruct != null ? offerConstruct.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Item)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Item item = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Item) other;
            return this.status == item.status && kotlin.jvm.internal.Intrinsics.areEqual(this.time, item.time) && kotlin.jvm.internal.Intrinsics.areEqual(this.remainingBalance, item.remainingBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.businessName, item.businessName) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationTime, item.expirationTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.interestAccrued, item.interestAccrued) && kotlin.jvm.internal.Intrinsics.areEqual(this.originalTransactionAmount, item.originalTransactionAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerConstruct, item.offerConstruct);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Item copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPromotionalActivityStatus status, java.lang.Object time, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.RemainingBalance remainingBalance, java.lang.String businessName, java.lang.Object expirationTime, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.InterestAccrued interestAccrued, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OriginalTransactionAmount originalTransactionAmount, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OfferConstruct offerConstruct) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Item(status, time, remainingBalance, businessName, expirationTime, interestAccrued, originalTransactionAmount, offerConstruct);
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OfferConstruct getOfferConstruct() {
            return this.offerConstruct;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OriginalTransactionAmount getOriginalTransactionAmount() {
            return this.originalTransactionAmount;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.InterestAccrued getInterestAccrued() {
            return this.interestAccrued;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getExpirationTime() {
            return this.expirationTime;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.RemainingBalance getRemainingBalance() {
            return this.remainingBalance;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getTime() {
            return this.time;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPromotionalActivityStatus getStatus() {
            return this.status;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$RemainingBalance;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "revolvingCreditMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$RemainingBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "getRevolvingCreditMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RemainingBalance {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;

        public RemainingBalance(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RemainingBalance(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.RemainingBalance)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.RemainingBalance remainingBalance = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.RemainingBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, remainingBalance.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditMoneyFragment, remainingBalance.revolvingCreditMoneyFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.RemainingBalance copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditMoneyFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.RemainingBalance(__typename, revolvingCreditMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment getRevolvingCreditMoneyFragment() {
            return this.revolvingCreditMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.RemainingBalance copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.RemainingBalance remainingBalance, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = remainingBalance.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditMoneyFragment = remainingBalance.revolvingCreditMoneyFragment;
            }
            return remainingBalance.copy(str, revolvingCreditMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$InterestAccrued;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$InterestAccrued;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/lang/Object;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InterestAccrued {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public InterestAccrued(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.value = str;
            this.currencyCode = obj;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.Object obj = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InterestAccrued(value=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.value.hashCode() * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.InterestAccrued)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.InterestAccrued interestAccrued = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.InterestAccrued) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, interestAccrued.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, interestAccrued.currencyCode);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.InterestAccrued copy(java.lang.String value, java.lang.Object currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.InterestAccrued(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.InterestAccrued copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.InterestAccrued interestAccrued, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = interestAccrued.value;
            }
            if ((i & 2) != 0) {
                obj = interestAccrued.currencyCode;
            }
            return interestAccrued.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$OriginalTransactionAmount;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$OriginalTransactionAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/lang/Object;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OriginalTransactionAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public OriginalTransactionAmount(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.value = str;
            this.currencyCode = obj;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.Object obj = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OriginalTransactionAmount(value=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.value.hashCode() * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OriginalTransactionAmount)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OriginalTransactionAmount originalTransactionAmount = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OriginalTransactionAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, originalTransactionAmount.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, originalTransactionAmount.currencyCode);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OriginalTransactionAmount copy(java.lang.String value, java.lang.Object currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OriginalTransactionAmount(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OriginalTransactionAmount copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OriginalTransactionAmount originalTransactionAmount, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = originalTransactionAmount.value;
            }
            if ((i & 2) != 0) {
                obj = originalTransactionAmount.currencyCode;
            }
            return originalTransactionAmount.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$OfferConstruct;", "", "", "Lcom/paypal/oslo/api/graphql/schema/type/CreditOfferConstructType;", "types", "id", "<init>", "(Ljava/util/List;Ljava/lang/Object;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/util/List;Ljava/lang/Object;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment$OfferConstruct;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getTypes", "Ljava/lang/Object;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OfferConstruct {
        public static final int $stable = 8;
        private final java.lang.Object id;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType> types;

        /* JADX WARN: Multi-variable type inference failed */
        public OfferConstruct(java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType> list, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.types = list;
            this.id = obj;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType> getTypes() {
            return this.types;
        }

        public final java.lang.Object getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType> list = this.types;
            java.lang.Object obj = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OfferConstruct(types=");
            sb.append(list);
            sb.append(", id=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType> list = this.types;
            return ((list == null ? 0 : list.hashCode()) * 31) + this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OfferConstruct)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OfferConstruct offerConstruct = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OfferConstruct) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.types, offerConstruct.types) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, offerConstruct.id);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OfferConstruct copy(java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType> types, java.lang.Object id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OfferConstruct(types, id);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getId() {
            return this.id;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType> component1() {
            return this.types;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OfferConstruct copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.OfferConstruct offerConstruct, java.util.List list, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                list = offerConstruct.types;
            }
            if ((i & 2) != 0) {
                obj = offerConstruct.id;
            }
            return offerConstruct.copy(list, obj);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Page page = this.page;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditHistoricalPromotionalActivitiesFragment(page=");
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
        return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.page, ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment) other).page);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment copy(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment(page);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Page getPage() {
        return this.page;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment revolvingCreditHistoricalPromotionalActivitiesFragment, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment.Page page, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            page = revolvingCreditHistoricalPromotionalActivitiesFragment.page;
        }
        return revolvingCreditHistoricalPromotionalActivitiesFragment.copy(page);
    }
}
