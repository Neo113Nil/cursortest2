package com.paypal.oslo.feature.activity.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivitySearchSuggestionsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/activity/graphql/GetActivitySearchSuggestionsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ActivitySearchSuggestionsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ActivitySearchSuggestionsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivitySearchSuggestionsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ActivitySearchSuggestionsInput;)Lcom/paypal/oslo/feature/activity/graphql/GetActivitySearchSuggestionsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ActivitySearchSuggestionsInput;", "getInput", "Companion", "Data"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GetActivitySearchSuggestionsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "27de9d2e72d3bd45f6c4bd8b3180a517a8625485b6218f2e7b83c62fcdd0d0b6";
    public static final java.lang.String OPERATION_NAME = "GetActivitySearchSuggestions";
    private final com.paypal.oslo.api.graphql.schema.type.ActivitySearchSuggestionsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery.Companion INSTANCE = new com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery.Companion(null);
    public static final int $stable = 8;

    public GetActivitySearchSuggestionsQuery(com.paypal.oslo.api.graphql.schema.type.ActivitySearchSuggestionsInput activitySearchSuggestionsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySearchSuggestionsInput, "");
        this.input = activitySearchSuggestionsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivitySearchSuggestionsInput getInput() {
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
        com.paypal.oslo.feature.activity.graphql.adapter.GetActivitySearchSuggestionsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.activity.graphql.adapter.GetActivitySearchSuggestionsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.activity.graphql.selections.GetActivitySearchSuggestionsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivitySearchSuggestionsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "", "", "activitySearchSuggestions", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/activity/graphql/GetActivitySearchSuggestionsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getActivitySearchSuggestions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final java.util.List<java.lang.String> activitySearchSuggestions;

        public Data(java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.activitySearchSuggestions = list;
        }

        public final java.util.List<java.lang.String> getActivitySearchSuggestions() {
            return this.activitySearchSuggestions;
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.activitySearchSuggestions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(activitySearchSuggestions=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activitySearchSuggestions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.activitySearchSuggestions, ((com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery.Data) other).activitySearchSuggestions);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery.Data copy(java.util.List<java.lang.String> activitySearchSuggestions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySearchSuggestions, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery.Data(activitySearchSuggestions);
        }

        public final java.util.List<java.lang.String> component1() {
            return this.activitySearchSuggestions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery.Data copy$default(com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery.Data data, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = data.activitySearchSuggestions;
            }
            return data.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivitySearchSuggestionsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetActivitySearchSuggestions($input: ActivitySearchSuggestionsInput!) { activitySearchSuggestions(input: $input) }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ActivitySearchSuggestionsInput activitySearchSuggestionsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetActivitySearchSuggestionsQuery(input=");
        sb.append(activitySearchSuggestionsInput);
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
        return (other instanceof com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery) other).input);
    }

    public final com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery copy(com.paypal.oslo.api.graphql.schema.type.ActivitySearchSuggestionsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ActivitySearchSuggestionsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery copy$default(com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery getActivitySearchSuggestionsQuery, com.paypal.oslo.api.graphql.schema.type.ActivitySearchSuggestionsInput activitySearchSuggestionsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            activitySearchSuggestionsInput = getActivitySearchSuggestionsQuery.input;
        }
        return getActivitySearchSuggestionsQuery.copy(activitySearchSuggestionsInput);
    }
}
