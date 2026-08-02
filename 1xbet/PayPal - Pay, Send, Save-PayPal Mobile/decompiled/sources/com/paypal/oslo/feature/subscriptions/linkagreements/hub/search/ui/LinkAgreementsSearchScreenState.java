package com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchScreenState;", "", "", "searchQuery", "", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/model/ConsumerAgreementMerchant;", "popularAgreements", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent;", "content", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent;)Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchScreenState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSearchQuery", "Ljava/util/List;", "getPopularAgreements", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchContent;", "getContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LinkAgreementsSearchScreenState {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent content;
    private final java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> popularAgreements;
    private final java.lang.String searchQuery;

    public LinkAgreementsSearchScreenState(java.lang.String str, java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> list, com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent merchantSearchContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantSearchContent, "");
        this.searchQuery = str;
        this.popularAgreements = list;
        this.content = merchantSearchContent;
    }

    public /* synthetic */ LinkAgreementsSearchScreenState(java.lang.String str, java.util.List list, com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Idle idle, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Idle.INSTANCE : idle);
    }

    public final java.lang.String getSearchQuery() {
        return this.searchQuery;
    }

    public final java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> getPopularAgreements() {
        return this.popularAgreements;
    }

    public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent getContent() {
        return this.content;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.searchQuery;
        java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> list = this.popularAgreements;
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent merchantSearchContent = this.content;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkAgreementsSearchScreenState(searchQuery=");
        sb.append(str);
        sb.append(", popularAgreements=");
        sb.append(list);
        sb.append(", content=");
        sb.append(merchantSearchContent);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.searchQuery.hashCode();
        java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> list = this.popularAgreements;
        return (((hashCode * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.content.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState linkAgreementsSearchScreenState = (com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.searchQuery, linkAgreementsSearchScreenState.searchQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.popularAgreements, linkAgreementsSearchScreenState.popularAgreements) && kotlin.jvm.internal.Intrinsics.areEqual(this.content, linkAgreementsSearchScreenState.content);
    }

    public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState copy(java.lang.String searchQuery, java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> popularAgreements, com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchQuery, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState(searchQuery, popularAgreements, content);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent getContent() {
        return this.content;
    }

    public final java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant> component2() {
        return this.popularAgreements;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSearchQuery() {
        return this.searchQuery;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState copy$default(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState linkAgreementsSearchScreenState, java.lang.String str, java.util.List list, com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent merchantSearchContent, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = linkAgreementsSearchScreenState.searchQuery;
        }
        if ((i & 2) != 0) {
            list = linkAgreementsSearchScreenState.popularAgreements;
        }
        if ((i & 4) != 0) {
            merchantSearchContent = linkAgreementsSearchScreenState.content;
        }
        return linkAgreementsSearchScreenState.copy(str, list, merchantSearchContent);
    }

    public LinkAgreementsSearchScreenState() {
        this(null, null, null, 7, null);
    }
}
