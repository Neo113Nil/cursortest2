package com.paypal.oslo.feature.searchandintelligence.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetAgenticStartersQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetAgenticStartersQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/AgenticStartersInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/AgenticStartersInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/AgenticStartersInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/AgenticStartersInput;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetAgenticStartersQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/AgenticStartersInput;", "getInput", "Companion", "Data", "AgenticStarter"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GetAgenticStartersQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.Data> {
    public static final java.lang.String OPERATION_ID = "fe779bdf985491aca7b05a3fc9ec79141b5e25380cc41f4a57a1951e1ec10415";
    public static final java.lang.String OPERATION_NAME = "GetAgenticStarters";
    private final com.paypal.oslo.api.graphql.schema.type.AgenticStartersInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.Companion INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.Companion(null);
    public static final int $stable = 8;

    public GetAgenticStartersQuery(com.paypal.oslo.api.graphql.schema.type.AgenticStartersInput agenticStartersInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agenticStartersInput, "");
        this.input = agenticStartersInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AgenticStartersInput getInput() {
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
        com.paypal.oslo.feature.searchandintelligence.graphql.adapter.GetAgenticStartersQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.GetAgenticStartersQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.searchandintelligence.graphql.selections.GetAgenticStartersQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetAgenticStartersQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetAgenticStartersQuery$AgenticStarter;", "agenticStarters", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetAgenticStartersQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getAgenticStarters"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter> agenticStarters;

        public Data(java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.agenticStarters = list;
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter> getAgenticStarters() {
            return this.agenticStarters;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter> list = this.agenticStarters;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(agenticStarters=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.agenticStarters.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.agenticStarters, ((com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.Data) other).agenticStarters);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.Data copy(java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter> agenticStarters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agenticStarters, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.Data(agenticStarters);
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter> component1() {
            return this.agenticStarters;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.Data copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.Data data, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = data.agenticStarters;
            }
            return data.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetAgenticStartersQuery$AgenticStarter;", "", "", "__typename", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/AgenticStarterFragment;", "agenticStarterFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/AgenticStarterFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/AgenticStarterFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/AgenticStarterFragment;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetAgenticStartersQuery$AgenticStarter;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/AgenticStarterFragment;", "getAgenticStarterFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AgenticStarter {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.AgenticStarterFragment agenticStarterFragment;

        public AgenticStarter(java.lang.String str, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.AgenticStarterFragment agenticStarterFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agenticStarterFragment, "");
            this.__typename = str;
            this.agenticStarterFragment = agenticStarterFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.AgenticStarterFragment getAgenticStarterFragment() {
            return this.agenticStarterFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.searchandintelligence.graphql.fragment.AgenticStarterFragment agenticStarterFragment = this.agenticStarterFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AgenticStarter(__typename=");
            sb.append(str);
            sb.append(", agenticStarterFragment=");
            sb.append(agenticStarterFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.agenticStarterFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter agenticStarter = (com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, agenticStarter.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.agenticStarterFragment, agenticStarter.agenticStarterFragment);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter copy(java.lang.String __typename, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.AgenticStarterFragment agenticStarterFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agenticStarterFragment, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter(__typename, agenticStarterFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.AgenticStarterFragment getAgenticStarterFragment() {
            return this.agenticStarterFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery.AgenticStarter agenticStarter, java.lang.String str, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.AgenticStarterFragment agenticStarterFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = agenticStarter.__typename;
            }
            if ((i & 2) != 0) {
                agenticStarterFragment = agenticStarter.agenticStarterFragment;
            }
            return agenticStarter.copy(str, agenticStarterFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetAgenticStartersQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetAgenticStarters($input: AgenticStartersInput!) { agenticStarters(input: $input) { __typename ...AgenticStarterFragment } }  fragment AgenticStarterFragment on AgenticStarter { id displayText icon { __typename ... on URLIcon { url alt } } surface }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.AgenticStartersInput agenticStartersInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetAgenticStartersQuery(input=");
        sb.append(agenticStartersInput);
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
        return (other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery) other).input);
    }

    public final com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery copy(com.paypal.oslo.api.graphql.schema.type.AgenticStartersInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AgenticStartersInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.GetAgenticStartersQuery getAgenticStartersQuery, com.paypal.oslo.api.graphql.schema.type.AgenticStartersInput agenticStartersInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            agenticStartersInput = getAgenticStartersQuery.input;
        }
        return getAgenticStartersQuery.copy(agenticStartersInput);
    }
}
