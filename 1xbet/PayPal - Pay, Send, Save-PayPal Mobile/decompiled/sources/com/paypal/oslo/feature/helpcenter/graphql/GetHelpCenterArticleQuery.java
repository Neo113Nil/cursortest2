package com.paypal.oslo.feature.helpcenter.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/HelpArticleInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/HelpArticleInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/HelpArticleInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/HelpArticleInput;)Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/HelpArticleInput;", "getInput", "Companion", "Data", "HelpArticle", "ContentJson", "RelatedArticle"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GetHelpCenterArticleQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.Data> {
    public static final java.lang.String OPERATION_ID = "ffe9d306236cb9f474d032d004d73ffb0d2f0c6db66610397d108c56e056b543";
    public static final java.lang.String OPERATION_NAME = "GetHelpCenterArticle";
    private final com.paypal.oslo.api.graphql.schema.type.HelpArticleInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.Companion INSTANCE = new com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.Companion(null);
    public static final int $stable = 8;

    public GetHelpCenterArticleQuery(com.paypal.oslo.api.graphql.schema.type.HelpArticleInput helpArticleInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpArticleInput, "");
        this.input = helpArticleInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.HelpArticleInput getInput() {
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
        com.paypal.oslo.feature.helpcenter.graphql.adapter.GetHelpCenterArticleQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.helpcenter.graphql.adapter.GetHelpCenterArticleQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.helpcenter.graphql.selections.GetHelpCenterArticleQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$HelpArticle;", "helpArticle", "<init>", "(Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$HelpArticle;)V", "component1", "()Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$HelpArticle;", "copy", "(Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$HelpArticle;)Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$HelpArticle;", "getHelpArticle"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.HelpArticle helpArticle;

        public Data(com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.HelpArticle helpArticle) {
            this.helpArticle = helpArticle;
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.HelpArticle getHelpArticle() {
            return this.helpArticle;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.HelpArticle helpArticle = this.helpArticle;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(helpArticle=");
            sb.append(helpArticle);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.HelpArticle helpArticle = this.helpArticle;
            if (helpArticle == null) {
                return 0;
            }
            return helpArticle.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.helpArticle, ((com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.Data) other).helpArticle);
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.Data copy(com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.HelpArticle helpArticle) {
            return new com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.Data(helpArticle);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.HelpArticle getHelpArticle() {
            return this.helpArticle;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.Data copy$default(com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.Data data, com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.HelpArticle helpArticle, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                helpArticle = data.helpArticle;
            }
            return data.copy(helpArticle);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJr\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u001aR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$HelpArticle;", "", "", "id", "title", "excerpt", "topicId", "topicName", "Lcom/paypal/oslo/api/graphql/schema/type/HelpContentCategory;", "contentCategory", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$ContentJson;", "contentJson", "", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$RelatedArticle;", "relatedArticles", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/HelpContentCategory;Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$ContentJson;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/paypal/oslo/api/graphql/schema/type/HelpContentCategory;", "component7", "()Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$ContentJson;", "component8", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/HelpContentCategory;Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$ContentJson;Ljava/util/List;)Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$HelpArticle;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getTitle", "getExcerpt", "getTopicId", "getTopicName", "Lcom/paypal/oslo/api/graphql/schema/type/HelpContentCategory;", "getContentCategory", "Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$ContentJson;", "getContentJson", "Ljava/util/List;", "getRelatedArticles"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HelpArticle {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.HelpContentCategory contentCategory;
        private final com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.ContentJson contentJson;
        private final java.lang.String excerpt;
        private final java.lang.String id;
        private final java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.RelatedArticle> relatedArticles;
        private final java.lang.String title;
        private final java.lang.String topicId;
        private final java.lang.String topicName;

        public HelpArticle(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.api.graphql.schema.type.HelpContentCategory helpContentCategory, com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.ContentJson contentJson, java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.RelatedArticle> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.title = str2;
            this.excerpt = str3;
            this.topicId = str4;
            this.topicName = str5;
            this.contentCategory = helpContentCategory;
            this.contentJson = contentJson;
            this.relatedArticles = list;
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

        public final java.lang.String getTopicId() {
            return this.topicId;
        }

        public final java.lang.String getTopicName() {
            return this.topicName;
        }

        public final com.paypal.oslo.api.graphql.schema.type.HelpContentCategory getContentCategory() {
            return this.contentCategory;
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.ContentJson getContentJson() {
            return this.contentJson;
        }

        public final java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.RelatedArticle> getRelatedArticles() {
            return this.relatedArticles;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.title;
            java.lang.String str3 = this.excerpt;
            java.lang.String str4 = this.topicId;
            java.lang.String str5 = this.topicName;
            com.paypal.oslo.api.graphql.schema.type.HelpContentCategory helpContentCategory = this.contentCategory;
            com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.ContentJson contentJson = this.contentJson;
            java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.RelatedArticle> list = this.relatedArticles;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HelpArticle(id=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", excerpt=");
            sb.append(str3);
            sb.append(", topicId=");
            sb.append(str4);
            sb.append(", topicName=");
            sb.append(str5);
            sb.append(", contentCategory=");
            sb.append(helpContentCategory);
            sb.append(", contentJson=");
            sb.append(contentJson);
            sb.append(", relatedArticles=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.title.hashCode();
            java.lang.String str = this.excerpt;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.topicId;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.topicName;
            int hashCode5 = str3 == null ? 0 : str3.hashCode();
            com.paypal.oslo.api.graphql.schema.type.HelpContentCategory helpContentCategory = this.contentCategory;
            int hashCode6 = helpContentCategory == null ? 0 : helpContentCategory.hashCode();
            com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.ContentJson contentJson = this.contentJson;
            int hashCode7 = contentJson == null ? 0 : contentJson.hashCode();
            java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.RelatedArticle> list = this.relatedArticles;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.HelpArticle)) {
                return false;
            }
            com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.HelpArticle helpArticle = (com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.HelpArticle) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, helpArticle.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, helpArticle.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.excerpt, helpArticle.excerpt) && kotlin.jvm.internal.Intrinsics.areEqual(this.topicId, helpArticle.topicId) && kotlin.jvm.internal.Intrinsics.areEqual(this.topicName, helpArticle.topicName) && this.contentCategory == helpArticle.contentCategory && kotlin.jvm.internal.Intrinsics.areEqual(this.contentJson, helpArticle.contentJson) && kotlin.jvm.internal.Intrinsics.areEqual(this.relatedArticles, helpArticle.relatedArticles);
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.HelpArticle copy(java.lang.String id, java.lang.String title, java.lang.String excerpt, java.lang.String topicId, java.lang.String topicName, com.paypal.oslo.api.graphql.schema.type.HelpContentCategory contentCategory, com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.ContentJson contentJson, java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.RelatedArticle> relatedArticles) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            return new com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.HelpArticle(id, title, excerpt, topicId, topicName, contentCategory, contentJson, relatedArticles);
        }

        public final java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.RelatedArticle> component8() {
            return this.relatedArticles;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.ContentJson getContentJson() {
            return this.contentJson;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.HelpContentCategory getContentCategory() {
            return this.contentCategory;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getTopicName() {
            return this.topicName;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getTopicId() {
            return this.topicId;
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
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$ContentJson;", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UserProfileConstants.KEY_ACCOUNT_TYPE_PERSONAL, "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$ContentJson;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getPersonal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContentJson {
        public static final int $stable = 8;
        private final java.lang.Object personal;

        public ContentJson(java.lang.Object obj) {
            this.personal = obj;
        }

        public final java.lang.Object getPersonal() {
            return this.personal;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.personal;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentJson(personal=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.personal;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.ContentJson) && kotlin.jvm.internal.Intrinsics.areEqual(this.personal, ((com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.ContentJson) other).personal);
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.ContentJson copy(java.lang.Object personal) {
            return new com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.ContentJson(personal);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getPersonal() {
            return this.personal;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.ContentJson copy$default(com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.ContentJson contentJson, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = contentJson.personal;
            }
            return contentJson.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$RelatedArticle;", "", "", "id", "title", "excerpt", "Lcom/paypal/oslo/api/graphql/schema/type/HelpContentCategory;", "contentCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/HelpContentCategory;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/HelpContentCategory;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/HelpContentCategory;)Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$RelatedArticle;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getTitle", "getExcerpt", "Lcom/paypal/oslo/api/graphql/schema/type/HelpContentCategory;", "getContentCategory"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RelatedArticle {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.HelpContentCategory contentCategory;
        private final java.lang.String excerpt;
        private final java.lang.String id;
        private final java.lang.String title;

        public RelatedArticle(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.HelpContentCategory helpContentCategory) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RelatedArticle(id=");
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
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.RelatedArticle)) {
                return false;
            }
            com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.RelatedArticle relatedArticle = (com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.RelatedArticle) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, relatedArticle.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, relatedArticle.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.excerpt, relatedArticle.excerpt) && this.contentCategory == relatedArticle.contentCategory;
        }

        public final com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.RelatedArticle copy(java.lang.String id, java.lang.String title, java.lang.String excerpt, com.paypal.oslo.api.graphql.schema.type.HelpContentCategory contentCategory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            return new com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.RelatedArticle(id, title, excerpt, contentCategory);
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

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.RelatedArticle copy$default(com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.RelatedArticle relatedArticle, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.HelpContentCategory helpContentCategory, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = relatedArticle.id;
            }
            if ((i & 2) != 0) {
                str2 = relatedArticle.title;
            }
            if ((i & 4) != 0) {
                str3 = relatedArticle.excerpt;
            }
            if ((i & 8) != 0) {
                helpContentCategory = relatedArticle.contentCategory;
            }
            return relatedArticle.copy(str, str2, str3, helpContentCategory);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/graphql/GetHelpCenterArticleQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetHelpCenterArticle($input: HelpArticleInput!) { helpArticle(input: $input) { id title excerpt topicId topicName contentCategory contentJson { personal } relatedArticles { id title excerpt contentCategory } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.HelpArticleInput helpArticleInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetHelpCenterArticleQuery(input=");
        sb.append(helpArticleInput);
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
        return (other instanceof com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery) other).input);
    }

    public final com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery copy(com.paypal.oslo.api.graphql.schema.type.HelpArticleInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.HelpArticleInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery copy$default(com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery getHelpCenterArticleQuery, com.paypal.oslo.api.graphql.schema.type.HelpArticleInput helpArticleInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            helpArticleInput = getHelpCenterArticleQuery.input;
        }
        return getHelpCenterArticleQuery.copy(helpArticleInput);
    }
}
