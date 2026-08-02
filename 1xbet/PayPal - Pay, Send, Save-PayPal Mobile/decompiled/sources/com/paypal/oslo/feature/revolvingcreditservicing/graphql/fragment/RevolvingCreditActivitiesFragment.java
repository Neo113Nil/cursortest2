package com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0007\u0017\u0018\u0019\u001a\u001b\u001c\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Page;", "page", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Page;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Page;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Page;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Page;", "getPage", "Page", "Item", "Amount", "DisplayLogo", com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_REWARDS, "Cashback", "OfferConstruct"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RevolvingCreditActivitiesFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Page page;

    public RevolvingCreditActivitiesFragment(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        this.page = page;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Page getPage() {
        return this.page;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013JH\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\"\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Page;", "", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Item;", "items", "", "offset", "limit", "", "hasNextPage", "hasPreviousPage", "<init>", "(Ljava/util/List;IIZZ)V", "component1", "()Ljava/util/List;", "component2", "()I", "component3", "component4", "()Z", "component5", "copy", "(Ljava/util/List;IIZZ)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Page;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems", com.visa.cbp.getEncExpo.warmup, "getOffset", "getLimit", "Z", "getHasNextPage", "getHasPreviousPage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Page {
        public static final int $stable = 8;
        private final boolean hasNextPage;
        private final boolean hasPreviousPage;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Item> items;
        private final int limit;
        private final int offset;

        public Page(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Item> list, int i, int i2, boolean z, boolean z2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
            this.offset = i;
            this.limit = i2;
            this.hasNextPage = z;
            this.hasPreviousPage = z2;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Item> getItems() {
            return this.items;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final int getLimit() {
            return this.limit;
        }

        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        public final boolean getHasPreviousPage() {
            return this.hasPreviousPage;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Item> list = this.items;
            int i = this.offset;
            int i2 = this.limit;
            boolean z = this.hasNextPage;
            boolean z2 = this.hasPreviousPage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Page(items=");
            sb.append(list);
            sb.append(", offset=");
            sb.append(i);
            sb.append(", limit=");
            sb.append(i2);
            sb.append(", hasNextPage=");
            sb.append(z);
            sb.append(", hasPreviousPage=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.items.hashCode() * 31) + java.lang.Integer.hashCode(this.offset)) * 31) + java.lang.Integer.hashCode(this.limit)) * 31) + java.lang.Boolean.hashCode(this.hasNextPage)) * 31) + java.lang.Boolean.hashCode(this.hasPreviousPage);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Page)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Page page = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Page) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.items, page.items) && this.offset == page.offset && this.limit == page.limit && this.hasNextPage == page.hasNextPage && this.hasPreviousPage == page.hasPreviousPage;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Page copy(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Item> items, int offset, int limit, boolean hasNextPage, boolean hasPreviousPage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Page(items, offset, limit, hasNextPage, hasPreviousPage);
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getHasPreviousPage() {
            return this.hasPreviousPage;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        /* renamed from: component3, reason: from getter */
        public final int getLimit() {
            return this.limit;
        }

        /* renamed from: component2, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Item> component1() {
            return this.items;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Page copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Page page, java.util.List list, int i, int i2, boolean z, boolean z2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                list = page.items;
            }
            if ((i3 & 2) != 0) {
                i = page.offset;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                i2 = page.limit;
            }
            int i5 = i2;
            if ((i3 & 8) != 0) {
                z = page.hasNextPage;
            }
            boolean z3 = z;
            if ((i3 & 16) != 0) {
                z2 = page.hasPreviousPage;
            }
            return page.copy(list, i4, i5, z3, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b'\u0010(J\u008e\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b1\u0010\u001bR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u00102\u001a\u0004\b3\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b5\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010\u001dR\u001a\u0010\t\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b:\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b;\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b>\u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b@\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bB\u0010&R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u0010("}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Item;", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingActivityType;", "type", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Amount;", "amount", "transactionTime", "transactionReferenceNumber", "", "settled", "businessName", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$DisplayLogo;", "displayLogo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Rewards;", "rewards", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$OfferConstruct;", "offerConstruct", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingActivityType;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Amount;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$DisplayLogo;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Rewards;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$OfferConstruct;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingActivityType;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Amount;", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$DisplayLogo;", "component10", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Rewards;", "component11", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$OfferConstruct;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingActivityType;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Amount;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$DisplayLogo;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Rewards;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$OfferConstruct;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Item;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingActivityType;", "getType", "Ljava/lang/String;", "getDescription", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Amount;", "getAmount", "getTransactionTime", "getTransactionReferenceNumber", "Ljava/lang/Boolean;", "getSettled", "getBusinessName", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$DisplayLogo;", "getDisplayLogo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Rewards;", "getRewards", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$OfferConstruct;", "getOfferConstruct"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Amount amount;
        private final java.lang.String businessName;
        private final java.lang.String description;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.DisplayLogo displayLogo;
        private final java.lang.Object id;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.OfferConstruct offerConstruct;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Rewards rewards;
        private final java.lang.Boolean settled;
        private final java.lang.Object transactionReferenceNumber;
        private final java.lang.Object transactionTime;
        private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingActivityType type;

        public Item(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingActivityType revolvingCreditServicingActivityType, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Amount amount, java.lang.Object obj2, java.lang.Object obj3, java.lang.Boolean bool, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.DisplayLogo displayLogo, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Rewards rewards, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.OfferConstruct offerConstruct) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingActivityType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            this.id = obj;
            this.type = revolvingCreditServicingActivityType;
            this.description = str;
            this.amount = amount;
            this.transactionTime = obj2;
            this.transactionReferenceNumber = obj3;
            this.settled = bool;
            this.businessName = str2;
            this.displayLogo = displayLogo;
            this.rewards = rewards;
            this.offerConstruct = offerConstruct;
        }

        public final java.lang.Object getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingActivityType getType() {
            return this.type;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Amount getAmount() {
            return this.amount;
        }

        public final java.lang.Object getTransactionTime() {
            return this.transactionTime;
        }

        public final java.lang.Object getTransactionReferenceNumber() {
            return this.transactionReferenceNumber;
        }

        public final java.lang.Boolean getSettled() {
            return this.settled;
        }

        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.DisplayLogo getDisplayLogo() {
            return this.displayLogo;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Rewards getRewards() {
            return this.rewards;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.OfferConstruct getOfferConstruct() {
            return this.offerConstruct;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.id;
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingActivityType revolvingCreditServicingActivityType = this.type;
            java.lang.String str = this.description;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Amount amount = this.amount;
            java.lang.Object obj2 = this.transactionTime;
            java.lang.Object obj3 = this.transactionReferenceNumber;
            java.lang.Boolean bool = this.settled;
            java.lang.String str2 = this.businessName;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.DisplayLogo displayLogo = this.displayLogo;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Rewards rewards = this.rewards;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.OfferConstruct offerConstruct = this.offerConstruct;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(id=");
            sb.append(obj);
            sb.append(", type=");
            sb.append(revolvingCreditServicingActivityType);
            sb.append(", description=");
            sb.append(str);
            sb.append(", amount=");
            sb.append(amount);
            sb.append(", transactionTime=");
            sb.append(obj2);
            sb.append(", transactionReferenceNumber=");
            sb.append(obj3);
            sb.append(", settled=");
            sb.append(bool);
            sb.append(", businessName=");
            sb.append(str2);
            sb.append(", displayLogo=");
            sb.append(displayLogo);
            sb.append(", rewards=");
            sb.append(rewards);
            sb.append(", offerConstruct=");
            sb.append(offerConstruct);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.id;
            int hashCode = obj == null ? 0 : obj.hashCode();
            int hashCode2 = this.type.hashCode();
            java.lang.String str = this.description;
            int hashCode3 = str == null ? 0 : str.hashCode();
            int hashCode4 = this.amount.hashCode();
            int hashCode5 = this.transactionTime.hashCode();
            java.lang.Object obj2 = this.transactionReferenceNumber;
            int hashCode6 = obj2 == null ? 0 : obj2.hashCode();
            java.lang.Boolean bool = this.settled;
            int hashCode7 = bool == null ? 0 : bool.hashCode();
            java.lang.String str2 = this.businessName;
            int hashCode8 = str2 == null ? 0 : str2.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.DisplayLogo displayLogo = this.displayLogo;
            int hashCode9 = displayLogo == null ? 0 : displayLogo.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Rewards rewards = this.rewards;
            int hashCode10 = rewards == null ? 0 : rewards.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.OfferConstruct offerConstruct = this.offerConstruct;
            return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (offerConstruct != null ? offerConstruct.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Item)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Item item = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, item.id) && this.type == item.type && kotlin.jvm.internal.Intrinsics.areEqual(this.description, item.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, item.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionTime, item.transactionTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionReferenceNumber, item.transactionReferenceNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.settled, item.settled) && kotlin.jvm.internal.Intrinsics.areEqual(this.businessName, item.businessName) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayLogo, item.displayLogo) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewards, item.rewards) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerConstruct, item.offerConstruct);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Item copy(java.lang.Object id, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingActivityType type, java.lang.String description, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Amount amount, java.lang.Object transactionTime, java.lang.Object transactionReferenceNumber, java.lang.Boolean settled, java.lang.String businessName, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.DisplayLogo displayLogo, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Rewards rewards, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.OfferConstruct offerConstruct) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionTime, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Item(id, type, description, amount, transactionTime, transactionReferenceNumber, settled, businessName, displayLogo, rewards, offerConstruct);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.DisplayLogo getDisplayLogo() {
            return this.displayLogo;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Boolean getSettled() {
            return this.settled;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Object getTransactionReferenceNumber() {
            return this.transactionReferenceNumber;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getTransactionTime() {
            return this.transactionTime;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Amount getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingActivityType getType() {
            return this.type;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.OfferConstruct getOfferConstruct() {
            return this.offerConstruct;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Rewards getRewards() {
            return this.rewards;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Amount;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "revolvingCreditMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "getRevolvingCreditMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;

        public Amount(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Amount amount = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditMoneyFragment, amount.revolvingCreditMoneyFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Amount copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditMoneyFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Amount(__typename, revolvingCreditMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment getRevolvingCreditMoneyFragment() {
            return this.revolvingCreditMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Amount copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Amount amount, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amount.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditMoneyFragment = amount.revolvingCreditMoneyFragment;
            }
            return amount.copy(str, revolvingCreditMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$DisplayLogo;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;", "revolvingCreditImageFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$DisplayLogo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;", "getRevolvingCreditImageFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DisplayLogo {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment;

        public DisplayLogo(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditImageFragment, "");
            this.__typename = str;
            this.revolvingCreditImageFragment = revolvingCreditImageFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment getRevolvingCreditImageFragment() {
            return this.revolvingCreditImageFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment = this.revolvingCreditImageFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DisplayLogo(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditImageFragment=");
            sb.append(revolvingCreditImageFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditImageFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.DisplayLogo)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.DisplayLogo displayLogo = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.DisplayLogo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, displayLogo.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditImageFragment, displayLogo.revolvingCreditImageFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.DisplayLogo copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditImageFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.DisplayLogo(__typename, revolvingCreditImageFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment getRevolvingCreditImageFragment() {
            return this.revolvingCreditImageFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.DisplayLogo copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.DisplayLogo displayLogo, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = displayLogo.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditImageFragment = displayLogo.revolvingCreditImageFragment;
            }
            return displayLogo.copy(str, revolvingCreditImageFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Rewards;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Cashback;", "cashback", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Cashback;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Cashback;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Cashback;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Rewards;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Cashback;", "getCashback"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Rewards {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Cashback cashback;

        public Rewards(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Cashback cashback) {
            this.cashback = cashback;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Cashback getCashback() {
            return this.cashback;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Cashback cashback = this.cashback;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Rewards(cashback=");
            sb.append(cashback);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Cashback cashback = this.cashback;
            if (cashback == null) {
                return 0;
            }
            return cashback.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Rewards) && kotlin.jvm.internal.Intrinsics.areEqual(this.cashback, ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Rewards) other).cashback);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Rewards copy(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Cashback cashback) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Rewards(cashback);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Cashback getCashback() {
            return this.cashback;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Rewards copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Rewards rewards, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Cashback cashback, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cashback = rewards.cashback;
            }
            return rewards.copy(cashback);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Cashback;", "", "percent", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$Cashback;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getPercent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Cashback {
        public static final int $stable = 8;
        private final java.lang.Object percent;

        public Cashback(java.lang.Object obj) {
            this.percent = obj;
        }

        public final java.lang.Object getPercent() {
            return this.percent;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.percent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cashback(percent=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.percent;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Cashback) && kotlin.jvm.internal.Intrinsics.areEqual(this.percent, ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Cashback) other).percent);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Cashback copy(java.lang.Object percent) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Cashback(percent);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getPercent() {
            return this.percent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Cashback copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Cashback cashback, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = cashback.percent;
            }
            return cashback.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$OfferConstruct;", "", "id", "", "Lcom/paypal/oslo/api/graphql/schema/type/CreditOfferConstructType;", "types", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/Object;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment$OfferConstruct;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getId", "Ljava/util/List;", "getTypes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OfferConstruct {
        public static final int $stable = 8;
        private final java.lang.Object id;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType> types;

        /* JADX WARN: Multi-variable type inference failed */
        public OfferConstruct(java.lang.Object obj, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.id = obj;
            this.types = list;
        }

        public final java.lang.Object getId() {
            return this.id;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType> getTypes() {
            return this.types;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.id;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType> list = this.types;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OfferConstruct(id=");
            sb.append(obj);
            sb.append(", types=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType> list = this.types;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.OfferConstruct)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.OfferConstruct offerConstruct = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.OfferConstruct) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, offerConstruct.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.types, offerConstruct.types);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.OfferConstruct copy(java.lang.Object id, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType> types) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.OfferConstruct(id, types);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CreditOfferConstructType> component2() {
            return this.types;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getId() {
            return this.id;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.OfferConstruct copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.OfferConstruct offerConstruct, java.lang.Object obj, java.util.List list, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = offerConstruct.id;
            }
            if ((i & 2) != 0) {
                list = offerConstruct.types;
            }
            return offerConstruct.copy(obj, list);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Page page = this.page;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditActivitiesFragment(page=");
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
        return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.page, ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment) other).page);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment copy(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment(page);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Page getPage() {
        return this.page;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment revolvingCreditActivitiesFragment, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment.Page page, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            page = revolvingCreditActivitiesFragment.page;
        }
        return revolvingCreditActivitiesFragment.copy(page);
    }
}
