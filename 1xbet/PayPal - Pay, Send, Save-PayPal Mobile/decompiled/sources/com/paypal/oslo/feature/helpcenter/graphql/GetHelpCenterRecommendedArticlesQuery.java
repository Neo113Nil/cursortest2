package com.paypal.oslo.feature.helpcenter.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterRecommendedArticlesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterRecommendedArticlesQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/RecommendedHelpArticlesInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RecommendedHelpArticlesInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RecommendedHelpArticlesInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RecommendedHelpArticlesInput;)Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterRecommendedArticlesQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/RecommendedHelpArticlesInput;", "getInput", "Companion", "Data", "RecommendedHelpArticles", "Item"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GetHelpCenterRecommendedArticlesQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Data> {
    public static final java.lang.String OPERATION_ID = "a9ca4a4fae3cee46750bd18894ac3618870673f77fa4a701b828ec5577e814ba";
    public static final java.lang.String OPERATION_NAME = "GetHelpCenterRecommendedArticles";
    private final com.paypal.oslo.api.graphql.schema.type.RecommendedHelpArticlesInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Companion INSTANCE = new com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Companion(null);
    public static final int $stable = 8;

    public GetHelpCenterRecommendedArticlesQuery(com.paypal.oslo.api.graphql.schema.type.RecommendedHelpArticlesInput recommendedHelpArticlesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedHelpArticlesInput, "");
        this.input = recommendedHelpArticlesInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RecommendedHelpArticlesInput getInput() {
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
        com.paypal.oslo.feature.helpcenter.graphql.adapter.GetHelpCenterRecommendedArticlesQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.helpcenter.graphql.adapter.GetHelpCenterRecommendedArticlesQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.helpcenter.graphql.selections.GetHelpCenterRecommendedArticlesQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterRecommendedArticlesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterRecommendedArticlesQuery$RecommendedHelpArticles;", "recommendedHelpArticles", "<init>", "(Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterRecommendedArticlesQuery$RecommendedHelpArticles;)V", "component1", "()Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterRecommendedArticlesQuery$RecommendedHelpArticles;", "copy", "(Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterRecommendedArticlesQuery$RecommendedHelpArticles;)Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterRecommendedArticlesQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterRecommendedArticlesQuery$RecommendedHelpArticles;", "getRecommendedHelpArticles"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.RecommendedHelpArticles recommendedHelpArticles;

        public Data(com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.RecommendedHelpArticles recommendedHelpArticles) {
            this.recommendedHelpArticles = recommendedHelpArticles;
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.RecommendedHelpArticles getRecommendedHelpArticles() {
            return this.recommendedHelpArticles;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.RecommendedHelpArticles recommendedHelpArticles = this.recommendedHelpArticles;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(recommendedHelpArticles=");
            sb.append(recommendedHelpArticles);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.RecommendedHelpArticles recommendedHelpArticles = this.recommendedHelpArticles;
            if (recommendedHelpArticles == null) {
                return 0;
            }
            return recommendedHelpArticles.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.recommendedHelpArticles, ((com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Data) other).recommendedHelpArticles);
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Data copy(com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.RecommendedHelpArticles recommendedHelpArticles) {
            return new com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Data(recommendedHelpArticles);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.RecommendedHelpArticles getRecommendedHelpArticles() {
            return this.recommendedHelpArticles;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Data copy$default(com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Data data, com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.RecommendedHelpArticles recommendedHelpArticles, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                recommendedHelpArticles = data.recommendedHelpArticles;
            }
            return data.copy(recommendedHelpArticles);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterRecommendedArticlesQuery$RecommendedHelpArticles;", "", "", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterRecommendedArticlesQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterRecommendedArticlesQuery$RecommendedHelpArticles;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RecommendedHelpArticles {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Item> items;

        public RecommendedHelpArticles(java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RecommendedHelpArticles(items=");
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
            return (other instanceof com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.RecommendedHelpArticles) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.RecommendedHelpArticles) other).items);
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.RecommendedHelpArticles copy(java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.RecommendedHelpArticles(items);
        }

        public final java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.RecommendedHelpArticles copy$default(com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.RecommendedHelpArticles recommendedHelpArticles, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = recommendedHelpArticles.items;
            }
            return recommendedHelpArticles.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterRecommendedArticlesQuery$Item;", "", "", "id", "title", "excerpt", "Lcom/paypal/oslo/api/graphql/schema/type/HelpContentCategory;", "contentCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/HelpContentCategory;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/HelpContentCategory;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/HelpContentCategory;)Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterRecommendedArticlesQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getTitle", "getExcerpt", "Lcom/paypal/oslo/api/graphql/schema/type/HelpContentCategory;", "getContentCategory"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Item item = (com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, item.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, item.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.excerpt, item.excerpt) && this.contentCategory == item.contentCategory;
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Item copy(java.lang.String id, java.lang.String title, java.lang.String excerpt, com.paypal.oslo.api.graphql.schema.type.HelpContentCategory contentCategory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            return new com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Item(id, title, excerpt, contentCategory);
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

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Item copy$default(com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Item item, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.HelpContentCategory helpContentCategory, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterRecommendedArticlesQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetHelpCenterRecommendedArticles($input: RecommendedHelpArticlesInput!) { recommendedHelpArticles(input: $input) { items { id title excerpt contentCategory } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RecommendedHelpArticlesInput recommendedHelpArticlesInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetHelpCenterRecommendedArticlesQuery(input=");
        sb.append(recommendedHelpArticlesInput);
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
        return (other instanceof com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery) other).input);
    }

    public final com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery copy(com.paypal.oslo.api.graphql.schema.type.RecommendedHelpArticlesInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RecommendedHelpArticlesInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery copy$default(com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery getHelpCenterRecommendedArticlesQuery, com.paypal.oslo.api.graphql.schema.type.RecommendedHelpArticlesInput recommendedHelpArticlesInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            recommendedHelpArticlesInput = getHelpCenterRecommendedArticlesQuery.input;
        }
        return getHelpCenterRecommendedArticlesQuery.copy(recommendedHelpArticlesInput);
    }
}
