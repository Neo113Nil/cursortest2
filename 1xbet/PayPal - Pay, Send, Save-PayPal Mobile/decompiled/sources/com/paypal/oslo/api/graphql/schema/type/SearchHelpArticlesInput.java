package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/SearchHelpArticlesInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;", "channel", "Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;", "accountCategory", "", "searchQuery", "Lcom/paypal/oslo/api/graphql/schema/type/SearchHelpArticlesType;", com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Attributes.SEARCH_TYPE, "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/SearchHelpArticlesType;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/SearchHelpArticlesType;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/SearchHelpArticlesType;)Lcom/paypal/oslo/api/graphql/schema/type/SearchHelpArticlesInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/HelpChannel;", "getChannel", "Lcom/paypal/oslo/api/graphql/schema/type/AccountCategory;", "getAccountCategory", "Ljava/lang/String;", "getSearchQuery", "Lcom/paypal/oslo/api/graphql/schema/type/SearchHelpArticlesType;", "getSearchType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SearchHelpArticlesInput {
    private final com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory;
    private final com.paypal.oslo.api.graphql.schema.type.HelpChannel channel;
    private final java.lang.String searchQuery;
    private final com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesType searchType;

    public SearchHelpArticlesInput(com.paypal.oslo.api.graphql.schema.type.HelpChannel helpChannel, com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesType searchHelpArticlesType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCategory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchHelpArticlesType, "");
        this.channel = helpChannel;
        this.accountCategory = accountCategory;
        this.searchQuery = str;
        this.searchType = searchHelpArticlesType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.HelpChannel getChannel() {
        return this.channel;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AccountCategory getAccountCategory() {
        return this.accountCategory;
    }

    public final java.lang.String getSearchQuery() {
        return this.searchQuery;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesType getSearchType() {
        return this.searchType;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.HelpChannel helpChannel = this.channel;
        com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory = this.accountCategory;
        java.lang.String str = this.searchQuery;
        com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesType searchHelpArticlesType = this.searchType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchHelpArticlesInput(channel=");
        sb.append(helpChannel);
        sb.append(", accountCategory=");
        sb.append(accountCategory);
        sb.append(", searchQuery=");
        sb.append(str);
        sb.append(", searchType=");
        sb.append(searchHelpArticlesType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.channel.hashCode() * 31) + this.accountCategory.hashCode()) * 31) + this.searchQuery.hashCode()) * 31) + this.searchType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesInput searchHelpArticlesInput = (com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesInput) other;
        return this.channel == searchHelpArticlesInput.channel && this.accountCategory == searchHelpArticlesInput.accountCategory && kotlin.jvm.internal.Intrinsics.areEqual(this.searchQuery, searchHelpArticlesInput.searchQuery) && this.searchType == searchHelpArticlesInput.searchType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesInput copy(com.paypal.oslo.api.graphql.schema.type.HelpChannel channel, com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory, java.lang.String searchQuery, com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesType searchType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCategory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchQuery, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchType, "");
        return new com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesInput(channel, accountCategory, searchQuery, searchType);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesType getSearchType() {
        return this.searchType;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSearchQuery() {
        return this.searchQuery;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AccountCategory getAccountCategory() {
        return this.accountCategory;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.HelpChannel getChannel() {
        return this.channel;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesInput copy$default(com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesInput searchHelpArticlesInput, com.paypal.oslo.api.graphql.schema.type.HelpChannel helpChannel, com.paypal.oslo.api.graphql.schema.type.AccountCategory accountCategory, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesType searchHelpArticlesType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            helpChannel = searchHelpArticlesInput.channel;
        }
        if ((i & 2) != 0) {
            accountCategory = searchHelpArticlesInput.accountCategory;
        }
        if ((i & 4) != 0) {
            str = searchHelpArticlesInput.searchQuery;
        }
        if ((i & 8) != 0) {
            searchHelpArticlesType = searchHelpArticlesInput.searchType;
        }
        return searchHelpArticlesInput.copy(helpChannel, accountCategory, str, searchHelpArticlesType);
    }
}
