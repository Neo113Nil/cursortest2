package com.paypal.oslo.feature.helpcenter.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/SearchHelpCenterArticlesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/helpcenter/graphql/SearchHelpCenterArticlesQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/SearchHelpArticlesInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SearchHelpArticlesInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SearchHelpArticlesInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SearchHelpArticlesInput;)Lcom/paypal/oslo/feature/helpcenter/graphql/SearchHelpCenterArticlesQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/SearchHelpArticlesInput;", "getInput", "Companion", "Data", "SearchHelpArticles", "Item"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SearchHelpCenterArticlesQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Data> {
    public static final java.lang.String OPERATION_ID = "fe42578f2d2ef1621c4248eae1988319600f2126f5e9bc1c8ad4adac41a93860";
    public static final java.lang.String OPERATION_NAME = "SearchHelpCenterArticles";
    private final com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Companion INSTANCE = new com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Companion(null);
    public static final int $stable = 8;

    public SearchHelpCenterArticlesQuery(com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesInput searchHelpArticlesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchHelpArticlesInput, "");
        this.input = searchHelpArticlesInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesInput getInput() {
        return this.input;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String id() {
        return OPERATION_ID;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String document() {
        return INSTANCE.getOPERATION_DOCUMENT();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.paypal.oslo.feature.helpcenter.graphql.adapter.SearchHelpCenterArticlesQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.helpcenter.graphql.adapter.SearchHelpCenterArticlesQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.helpcenter.graphql.selections.SearchHelpCenterArticlesQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/SearchHelpCenterArticlesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/helpcenter/graphql/SearchHelpCenterArticlesQuery$SearchHelpArticles;", "searchHelpArticles", "<init>", "(Lcom/paypal/oslo/feature/helpcenter/graphql/SearchHelpCenterArticlesQuery$SearchHelpArticles;)V", "component1", "()Lcom/paypal/oslo/feature/helpcenter/graphql/SearchHelpCenterArticlesQuery$SearchHelpArticles;", "copy", "(Lcom/paypal/oslo/feature/helpcenter/graphql/SearchHelpCenterArticlesQuery$SearchHelpArticles;)Lcom/paypal/oslo/feature/helpcenter/graphql/SearchHelpCenterArticlesQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/helpcenter/graphql/SearchHelpCenterArticlesQuery$SearchHelpArticles;", "getSearchHelpArticles"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.SearchHelpArticles searchHelpArticles;

        public Data(com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.SearchHelpArticles searchHelpArticles) {
            this.searchHelpArticles = searchHelpArticles;
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.SearchHelpArticles getSearchHelpArticles() {
            return this.searchHelpArticles;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.SearchHelpArticles searchHelpArticles = this.searchHelpArticles;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(searchHelpArticles=");
            sb.append(searchHelpArticles);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.SearchHelpArticles searchHelpArticles = this.searchHelpArticles;
            if (searchHelpArticles == null) {
                return 0;
            }
            return searchHelpArticles.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.searchHelpArticles, ((com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Data) other).searchHelpArticles);
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Data copy(com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.SearchHelpArticles searchHelpArticles) {
            return new com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Data(searchHelpArticles);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.SearchHelpArticles getSearchHelpArticles() {
            return this.searchHelpArticles;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Data copy$default(com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Data data, com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.SearchHelpArticles searchHelpArticles, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                searchHelpArticles = data.searchHelpArticles;
            }
            return data.copy(searchHelpArticles);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/SearchHelpCenterArticlesQuery$SearchHelpArticles;", "", "", "Lcom/paypal/oslo/feature/helpcenter/graphql/SearchHelpCenterArticlesQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/helpcenter/graphql/SearchHelpCenterArticlesQuery$SearchHelpArticles;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchHelpArticles {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Item> items;

        public SearchHelpArticles(java.util.List<com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchHelpArticles(items=");
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
            return (other instanceof com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.SearchHelpArticles) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.SearchHelpArticles) other).items);
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.SearchHelpArticles copy(java.util.List<com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.SearchHelpArticles(items);
        }

        public final java.util.List<com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.SearchHelpArticles copy$default(com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.SearchHelpArticles searchHelpArticles, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = searchHelpArticles.items;
            }
            return searchHelpArticles.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/SearchHelpCenterArticlesQuery$Item;", "", "", "id", "title", "excerpt", "Lcom/paypal/oslo/api/graphql/schema/type/HelpContentCategory;", "contentCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/HelpContentCategory;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/HelpContentCategory;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/HelpContentCategory;)Lcom/paypal/oslo/feature/helpcenter/graphql/SearchHelpCenterArticlesQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getTitle", "getExcerpt", "Lcom/paypal/oslo/api/graphql/schema/type/HelpContentCategory;", "getContentCategory"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.HelpContentCategory contentCategory;
        private final java.lang.String excerpt;
        private final java.lang.String id;
        private final java.lang.String title;

        public Item(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.HelpContentCategory helpContentCategory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.title = str2;
            this.excerpt = str3;
            this.contentCategory = helpContentCategory;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getExcerpt() {
            return this.excerpt;
        }

        public final com.paypal.oslo.api.graphql.schema.type.HelpContentCategory getContentCategory() {
            return this.contentCategory;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.title;
            java.lang.String str3 = this.excerpt;
            com.paypal.oslo.api.graphql.schema.type.HelpContentCategory helpContentCategory = this.contentCategory;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(id=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", excerpt=");
            sb.append(str3);
            sb.append(", contentCategory=");
            sb.append(helpContentCategory);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.title.hashCode();
            java.lang.String str = this.excerpt;
            int hashCode3 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.api.graphql.schema.type.HelpContentCategory helpContentCategory = this.contentCategory;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (helpContentCategory != null ? helpContentCategory.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Item item = (com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, item.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, item.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.excerpt, item.excerpt) && this.contentCategory == item.contentCategory;
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Item copy(java.lang.String id, java.lang.String title, java.lang.String excerpt, com.paypal.oslo.api.graphql.schema.type.HelpContentCategory contentCategory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            return new com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Item(id, title, excerpt, contentCategory);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.HelpContentCategory getContentCategory() {
            return this.contentCategory;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getExcerpt() {
            return this.excerpt;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Item copy$default(com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Item item, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.HelpContentCategory helpContentCategory, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.id;
            }
            if ((i & 2) != 0) {
                str2 = item.title;
            }
            if ((i & 4) != 0) {
                str3 = item.excerpt;
            }
            if ((i & 8) != 0) {
                helpContentCategory = item.contentCategory;
            }
            return item.copy(str, str2, str3, helpContentCategory);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/SearchHelpCenterArticlesQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query SearchHelpCenterArticles($input: SearchHelpArticlesInput!) { searchHelpArticles(input: $input) { items { id title excerpt contentCategory } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesInput searchHelpArticlesInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchHelpCenterArticlesQuery(input=");
        sb.append(searchHelpArticlesInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.input.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery) other).input);
    }

    public final com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery copy(com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery copy$default(com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery searchHelpCenterArticlesQuery, com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesInput searchHelpArticlesInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            searchHelpArticlesInput = searchHelpCenterArticlesQuery.input;
        }
        return searchHelpCenterArticlesQuery.copy(searchHelpArticlesInput);
    }
}
