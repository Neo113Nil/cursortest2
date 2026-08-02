package com.paypal.oslo.feature.searchandintelligence.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0015*+,-./0123456789:;<=)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CreateAgenticSessionInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CreateAgenticSessionInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CreateAgenticSessionInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CreateAgenticSessionInput;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CreateAgenticSessionInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OPERATION_NAME, "Session", "Item", "OnAgenticTextChatResponseComponent", "OnAgenticCategoryCarouselComponent", "Item1", "AgenticCommerceItemCarouselComponent", "Item2", "CommerceItem", "CurrentPrice", "ListPrice", "Store", "Details", "OnAgenticProductCarouselComponent", "Item3", "Product", "CurrentPrice1", "ListPrice1", "Store1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CreateAgenticSessionMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Data> {
    public static final java.lang.String OPERATION_ID = "445be5ed05cf9f6d43d58bbf70f9da24214575053632a83d8c391bd18cc48c48";
    public static final java.lang.String OPERATION_NAME = "CreateAgenticSession";
    private final com.paypal.oslo.api.graphql.schema.type.CreateAgenticSessionInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Companion INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Companion(null);
    public static final int $stable = 8;

    public CreateAgenticSessionMutation(com.paypal.oslo.api.graphql.schema.type.CreateAgenticSessionInput createAgenticSessionInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createAgenticSessionInput, "");
        this.input = createAgenticSessionInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreateAgenticSessionInput getInput() {
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
        com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CreateAgenticSessionMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.searchandintelligence.graphql.selections.CreateAgenticSessionMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CreateAgenticSession;", "createAgenticSession", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CreateAgenticSession;)V", "component1", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CreateAgenticSession;", "copy", "(Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CreateAgenticSession;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CreateAgenticSession;", "getCreateAgenticSession"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession createAgenticSession;

        public Data(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession createAgenticSession) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createAgenticSession, "");
            this.createAgenticSession = createAgenticSession;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession getCreateAgenticSession() {
            return this.createAgenticSession;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession createAgenticSession = this.createAgenticSession;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(createAgenticSession=");
            sb.append(createAgenticSession);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.createAgenticSession.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.createAgenticSession, ((com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Data) other).createAgenticSession);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Data copy(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession createAgenticSession) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createAgenticSession, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Data(createAgenticSession);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession getCreateAgenticSession() {
            return this.createAgenticSession;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Data copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Data data, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession createAgenticSession, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                createAgenticSession = data.createAgenticSession;
            }
            return data.copy(createAgenticSession);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CreateAgenticSession;", "", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Session;", "session", "", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item;", "items", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Session;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Session;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Session;Ljava/util/List;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CreateAgenticSession;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Session;", "getSession", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreateAgenticSession {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item> items;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session session;

        public CreateAgenticSession(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session session, java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.session = session;
            this.items = list;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session getSession() {
            return this.session;
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session session = this.session;
            java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateAgenticSession(session=");
            sb.append(session);
            sb.append(", items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session session = this.session;
            return ((session == null ? 0 : session.hashCode()) * 31) + this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession createAgenticSession = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.session, createAgenticSession.session) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, createAgenticSession.items);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession copy(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session session, java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession(session, items);
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item> component2() {
            return this.items;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session getSession() {
            return this.session;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession createAgenticSession, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session session, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                session = createAgenticSession.session;
            }
            if ((i & 2) != 0) {
                list = createAgenticSession.items;
            }
            return createAgenticSession.copy(session, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Session;", "", "id", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Session;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Session {
        public static final int $stable = 8;
        private final java.lang.Object id;

        public Session(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.id = obj;
        }

        public final java.lang.Object getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Session(id=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session) other).id);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session copy(java.lang.Object id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session session, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = session.id;
            }
            return session.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item;", "", "", "__typename", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticTextChatResponseComponent;", "onAgenticTextChatResponseComponent", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticCategoryCarouselComponent;", "onAgenticCategoryCarouselComponent", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticProductCarouselComponent;", "onAgenticProductCarouselComponent", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticTextChatResponseComponent;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticCategoryCarouselComponent;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticProductCarouselComponent;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticTextChatResponseComponent;", "component3", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticCategoryCarouselComponent;", "component4", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticProductCarouselComponent;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticTextChatResponseComponent;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticCategoryCarouselComponent;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticProductCarouselComponent;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticTextChatResponseComponent;", "getOnAgenticTextChatResponseComponent", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticCategoryCarouselComponent;", "getOnAgenticCategoryCarouselComponent", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticProductCarouselComponent;", "getOnAgenticProductCarouselComponent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticCategoryCarouselComponent onAgenticCategoryCarouselComponent;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticProductCarouselComponent onAgenticProductCarouselComponent;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticTextChatResponseComponent onAgenticTextChatResponseComponent;

        public Item(java.lang.String str, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticTextChatResponseComponent onAgenticTextChatResponseComponent, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticCategoryCarouselComponent onAgenticCategoryCarouselComponent, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticProductCarouselComponent onAgenticProductCarouselComponent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onAgenticTextChatResponseComponent = onAgenticTextChatResponseComponent;
            this.onAgenticCategoryCarouselComponent = onAgenticCategoryCarouselComponent;
            this.onAgenticProductCarouselComponent = onAgenticProductCarouselComponent;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticTextChatResponseComponent getOnAgenticTextChatResponseComponent() {
            return this.onAgenticTextChatResponseComponent;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticCategoryCarouselComponent getOnAgenticCategoryCarouselComponent() {
            return this.onAgenticCategoryCarouselComponent;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticProductCarouselComponent getOnAgenticProductCarouselComponent() {
            return this.onAgenticProductCarouselComponent;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticTextChatResponseComponent onAgenticTextChatResponseComponent = this.onAgenticTextChatResponseComponent;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticCategoryCarouselComponent onAgenticCategoryCarouselComponent = this.onAgenticCategoryCarouselComponent;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticProductCarouselComponent onAgenticProductCarouselComponent = this.onAgenticProductCarouselComponent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(__typename=");
            sb.append(str);
            sb.append(", onAgenticTextChatResponseComponent=");
            sb.append(onAgenticTextChatResponseComponent);
            sb.append(", onAgenticCategoryCarouselComponent=");
            sb.append(onAgenticCategoryCarouselComponent);
            sb.append(", onAgenticProductCarouselComponent=");
            sb.append(onAgenticProductCarouselComponent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticTextChatResponseComponent onAgenticTextChatResponseComponent = this.onAgenticTextChatResponseComponent;
            int hashCode2 = onAgenticTextChatResponseComponent == null ? 0 : onAgenticTextChatResponseComponent.hashCode();
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticCategoryCarouselComponent onAgenticCategoryCarouselComponent = this.onAgenticCategoryCarouselComponent;
            int hashCode3 = onAgenticCategoryCarouselComponent == null ? 0 : onAgenticCategoryCarouselComponent.hashCode();
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticProductCarouselComponent onAgenticProductCarouselComponent = this.onAgenticProductCarouselComponent;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (onAgenticProductCarouselComponent != null ? onAgenticProductCarouselComponent.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item item = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, item.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onAgenticTextChatResponseComponent, item.onAgenticTextChatResponseComponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.onAgenticCategoryCarouselComponent, item.onAgenticCategoryCarouselComponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.onAgenticProductCarouselComponent, item.onAgenticProductCarouselComponent);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item copy(java.lang.String __typename, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticTextChatResponseComponent onAgenticTextChatResponseComponent, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticCategoryCarouselComponent onAgenticCategoryCarouselComponent, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticProductCarouselComponent onAgenticProductCarouselComponent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item(__typename, onAgenticTextChatResponseComponent, onAgenticCategoryCarouselComponent, onAgenticProductCarouselComponent);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticProductCarouselComponent getOnAgenticProductCarouselComponent() {
            return this.onAgenticProductCarouselComponent;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticCategoryCarouselComponent getOnAgenticCategoryCarouselComponent() {
            return this.onAgenticCategoryCarouselComponent;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticTextChatResponseComponent getOnAgenticTextChatResponseComponent() {
            return this.onAgenticTextChatResponseComponent;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item item, java.lang.String str, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticTextChatResponseComponent onAgenticTextChatResponseComponent, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticCategoryCarouselComponent onAgenticCategoryCarouselComponent, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticProductCarouselComponent onAgenticProductCarouselComponent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.__typename;
            }
            if ((i & 2) != 0) {
                onAgenticTextChatResponseComponent = item.onAgenticTextChatResponseComponent;
            }
            if ((i & 4) != 0) {
                onAgenticCategoryCarouselComponent = item.onAgenticCategoryCarouselComponent;
            }
            if ((i & 8) != 0) {
                onAgenticProductCarouselComponent = item.onAgenticProductCarouselComponent;
            }
            return item.copy(str, onAgenticTextChatResponseComponent, onAgenticCategoryCarouselComponent, onAgenticProductCarouselComponent);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticTextChatResponseComponent;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticTextChatResponseComponent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAgenticTextChatResponseComponent {
        public static final int $stable = 0;
        private final java.lang.String text;

        public OnAgenticTextChatResponseComponent(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.text = str;
        }

        public final java.lang.String getText() {
            return this.text;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.text;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAgenticTextChatResponseComponent(text=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticTextChatResponseComponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, ((com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticTextChatResponseComponent) other).text);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticTextChatResponseComponent copy(java.lang.String text) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticTextChatResponseComponent(text);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getText() {
            return this.text;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticTextChatResponseComponent copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticTextChatResponseComponent onAgenticTextChatResponseComponent, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onAgenticTextChatResponseComponent.text;
            }
            return onAgenticTextChatResponseComponent.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticCategoryCarouselComponent;", "", "", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item1;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticCategoryCarouselComponent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAgenticCategoryCarouselComponent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item1> items;

        public OnAgenticCategoryCarouselComponent(java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item1> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item1> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item1> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAgenticCategoryCarouselComponent(items=");
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
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticCategoryCarouselComponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticCategoryCarouselComponent) other).items);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticCategoryCarouselComponent copy(java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item1> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticCategoryCarouselComponent(items);
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item1> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticCategoryCarouselComponent copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticCategoryCarouselComponent onAgenticCategoryCarouselComponent, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onAgenticCategoryCarouselComponent.items;
            }
            return onAgenticCategoryCarouselComponent.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JJ\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b!\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\"\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item1;", "", "", "name", "primaryImageUrl", "reasoningText", "reasoningCode", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$AgenticCommerceItemCarouselComponent;", "agenticCommerceItemCarouselComponent", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$AgenticCommerceItemCarouselComponent;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$AgenticCommerceItemCarouselComponent;", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$AgenticCommerceItemCarouselComponent;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Ljava/lang/Object;", "getPrimaryImageUrl", "getReasoningText", "getReasoningCode", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$AgenticCommerceItemCarouselComponent;", "getAgenticCommerceItemCarouselComponent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item1 {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.AgenticCommerceItemCarouselComponent agenticCommerceItemCarouselComponent;
        private final java.lang.String name;
        private final java.lang.Object primaryImageUrl;
        private final java.lang.String reasoningCode;
        private final java.lang.String reasoningText;

        public Item1(java.lang.String str, java.lang.Object obj, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.AgenticCommerceItemCarouselComponent agenticCommerceItemCarouselComponent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
            this.primaryImageUrl = obj;
            this.reasoningText = str2;
            this.reasoningCode = str3;
            this.agenticCommerceItemCarouselComponent = agenticCommerceItemCarouselComponent;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.Object getPrimaryImageUrl() {
            return this.primaryImageUrl;
        }

        public final java.lang.String getReasoningText() {
            return this.reasoningText;
        }

        public final java.lang.String getReasoningCode() {
            return this.reasoningCode;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.AgenticCommerceItemCarouselComponent getAgenticCommerceItemCarouselComponent() {
            return this.agenticCommerceItemCarouselComponent;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.Object obj = this.primaryImageUrl;
            java.lang.String str2 = this.reasoningText;
            java.lang.String str3 = this.reasoningCode;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.AgenticCommerceItemCarouselComponent agenticCommerceItemCarouselComponent = this.agenticCommerceItemCarouselComponent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item1(name=");
            sb.append(str);
            sb.append(", primaryImageUrl=");
            sb.append(obj);
            sb.append(", reasoningText=");
            sb.append(str2);
            sb.append(", reasoningCode=");
            sb.append(str3);
            sb.append(", agenticCommerceItemCarouselComponent=");
            sb.append(agenticCommerceItemCarouselComponent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            java.lang.Object obj = this.primaryImageUrl;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            java.lang.String str = this.reasoningText;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.reasoningCode;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.AgenticCommerceItemCarouselComponent agenticCommerceItemCarouselComponent = this.agenticCommerceItemCarouselComponent;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (agenticCommerceItemCarouselComponent != null ? agenticCommerceItemCarouselComponent.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item1)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item1 item1 = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, item1.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryImageUrl, item1.primaryImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.reasoningText, item1.reasoningText) && kotlin.jvm.internal.Intrinsics.areEqual(this.reasoningCode, item1.reasoningCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.agenticCommerceItemCarouselComponent, item1.agenticCommerceItemCarouselComponent);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item1 copy(java.lang.String name2, java.lang.Object primaryImageUrl, java.lang.String reasoningText, java.lang.String reasoningCode, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.AgenticCommerceItemCarouselComponent agenticCommerceItemCarouselComponent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item1(name2, primaryImageUrl, reasoningText, reasoningCode, agenticCommerceItemCarouselComponent);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.AgenticCommerceItemCarouselComponent getAgenticCommerceItemCarouselComponent() {
            return this.agenticCommerceItemCarouselComponent;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getReasoningCode() {
            return this.reasoningCode;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getReasoningText() {
            return this.reasoningText;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getPrimaryImageUrl() {
            return this.primaryImageUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item1 copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item1 item1, java.lang.String str, java.lang.Object obj, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.AgenticCommerceItemCarouselComponent agenticCommerceItemCarouselComponent, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = item1.name;
            }
            if ((i & 2) != 0) {
                obj = item1.primaryImageUrl;
            }
            java.lang.Object obj3 = obj;
            if ((i & 4) != 0) {
                str2 = item1.reasoningText;
            }
            java.lang.String str4 = str2;
            if ((i & 8) != 0) {
                str3 = item1.reasoningCode;
            }
            java.lang.String str5 = str3;
            if ((i & 16) != 0) {
                agenticCommerceItemCarouselComponent = item1.agenticCommerceItemCarouselComponent;
            }
            return item1.copy(str, obj3, str4, str5, agenticCommerceItemCarouselComponent);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$AgenticCommerceItemCarouselComponent;", "", "", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item2;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$AgenticCommerceItemCarouselComponent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AgenticCommerceItemCarouselComponent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item2> items;

        public AgenticCommerceItemCarouselComponent(java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item2> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item2> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item2> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AgenticCommerceItemCarouselComponent(items=");
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
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.AgenticCommerceItemCarouselComponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.AgenticCommerceItemCarouselComponent) other).items);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.AgenticCommerceItemCarouselComponent copy(java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item2> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.AgenticCommerceItemCarouselComponent(items);
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item2> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.AgenticCommerceItemCarouselComponent copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.AgenticCommerceItemCarouselComponent agenticCommerceItemCarouselComponent, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = agenticCommerceItemCarouselComponent.items;
            }
            return agenticCommerceItemCarouselComponent.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item2;", "", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CommerceItem;", "commerceItem", "", "checkoutEnabled", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Details;", "details", "", "promotionalMessage", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CommerceItem;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Details;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CommerceItem;", "component2", "()Ljava/lang/Boolean;", "component3", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Details;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CommerceItem;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Details;Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item2;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CommerceItem;", "getCommerceItem", "Ljava/lang/Boolean;", "getCheckoutEnabled", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Details;", "getDetails", "Ljava/lang/String;", "getPromotionalMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item2 {
        public static final int $stable = 8;
        private final java.lang.Boolean checkoutEnabled;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CommerceItem commerceItem;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details details;
        private final java.lang.String promotionalMessage;

        public Item2(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CommerceItem commerceItem, java.lang.Boolean bool, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details details, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commerceItem, "");
            this.commerceItem = commerceItem;
            this.checkoutEnabled = bool;
            this.details = details;
            this.promotionalMessage = str;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CommerceItem getCommerceItem() {
            return this.commerceItem;
        }

        public final java.lang.Boolean getCheckoutEnabled() {
            return this.checkoutEnabled;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details getDetails() {
            return this.details;
        }

        public final java.lang.String getPromotionalMessage() {
            return this.promotionalMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CommerceItem commerceItem = this.commerceItem;
            java.lang.Boolean bool = this.checkoutEnabled;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details details = this.details;
            java.lang.String str = this.promotionalMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item2(commerceItem=");
            sb.append(commerceItem);
            sb.append(", checkoutEnabled=");
            sb.append(bool);
            sb.append(", details=");
            sb.append(details);
            sb.append(", promotionalMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.commerceItem.hashCode();
            java.lang.Boolean bool = this.checkoutEnabled;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details details = this.details;
            int hashCode3 = details == null ? 0 : details.hashCode();
            java.lang.String str = this.promotionalMessage;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item2)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item2 item2 = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item2) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.commerceItem, item2.commerceItem) && kotlin.jvm.internal.Intrinsics.areEqual(this.checkoutEnabled, item2.checkoutEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.details, item2.details) && kotlin.jvm.internal.Intrinsics.areEqual(this.promotionalMessage, item2.promotionalMessage);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item2 copy(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CommerceItem commerceItem, java.lang.Boolean checkoutEnabled, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details details, java.lang.String promotionalMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commerceItem, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item2(commerceItem, checkoutEnabled, details, promotionalMessage);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getPromotionalMessage() {
            return this.promotionalMessage;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details getDetails() {
            return this.details;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getCheckoutEnabled() {
            return this.checkoutEnabled;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CommerceItem getCommerceItem() {
            return this.commerceItem;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item2 copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item2 item2, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CommerceItem commerceItem, java.lang.Boolean bool, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details details, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                commerceItem = item2.commerceItem;
            }
            if ((i & 2) != 0) {
                bool = item2.checkoutEnabled;
            }
            if ((i & 4) != 0) {
                details = item2.details;
            }
            if ((i & 8) != 0) {
                str = item2.promotionalMessage;
            }
            return item2.copy(commerceItem, bool, details, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u008c\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u0019R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b6\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CommerceItem;", "", "", "id", "name", "brand", "info", "primaryImageUrl", "", "secondaryImageUrls", "canonicalUrl", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CurrentPrice;", "currentPrice", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$ListPrice;", "listPrice", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Store;", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CurrentPrice;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$ListPrice;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Store;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Object;", "component6", "()Ljava/util/List;", "component7", "component8", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CurrentPrice;", "component9", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$ListPrice;", "component10", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Store;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CurrentPrice;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$ListPrice;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Store;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CommerceItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getBrand", "getInfo", "Ljava/lang/Object;", "getPrimaryImageUrl", "Ljava/util/List;", "getSecondaryImageUrls", "getCanonicalUrl", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CurrentPrice;", "getCurrentPrice", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$ListPrice;", "getListPrice", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Store;", "getStore"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CommerceItem {
        public static final int $stable = 8;
        private final java.lang.String brand;
        private final java.lang.Object canonicalUrl;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice currentPrice;
        private final java.lang.String id;
        private final java.lang.String info;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice listPrice;
        private final java.lang.String name;
        private final java.lang.Object primaryImageUrl;
        private final java.util.List<java.lang.Object> secondaryImageUrls;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store store;

        public CommerceItem(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Object obj, java.util.List<? extends java.lang.Object> list, java.lang.Object obj2, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice currentPrice, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice listPrice, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store store) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.name = str2;
            this.brand = str3;
            this.info = str4;
            this.primaryImageUrl = obj;
            this.secondaryImageUrls = list;
            this.canonicalUrl = obj2;
            this.currentPrice = currentPrice;
            this.listPrice = listPrice;
            this.store = store;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getBrand() {
            return this.brand;
        }

        public final java.lang.String getInfo() {
            return this.info;
        }

        public final java.lang.Object getPrimaryImageUrl() {
            return this.primaryImageUrl;
        }

        public final java.util.List<java.lang.Object> getSecondaryImageUrls() {
            return this.secondaryImageUrls;
        }

        public final java.lang.Object getCanonicalUrl() {
            return this.canonicalUrl;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice getCurrentPrice() {
            return this.currentPrice;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice getListPrice() {
            return this.listPrice;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store getStore() {
            return this.store;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.brand;
            java.lang.String str4 = this.info;
            java.lang.Object obj = this.primaryImageUrl;
            java.util.List<java.lang.Object> list = this.secondaryImageUrls;
            java.lang.Object obj2 = this.canonicalUrl;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice currentPrice = this.currentPrice;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice listPrice = this.listPrice;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store store = this.store;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CommerceItem(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", brand=");
            sb.append(str3);
            sb.append(", info=");
            sb.append(str4);
            sb.append(", primaryImageUrl=");
            sb.append(obj);
            sb.append(", secondaryImageUrls=");
            sb.append(list);
            sb.append(", canonicalUrl=");
            sb.append(obj2);
            sb.append(", currentPrice=");
            sb.append(currentPrice);
            sb.append(", listPrice=");
            sb.append(listPrice);
            sb.append(", store=");
            sb.append(store);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.name;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.brand;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.info;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            java.lang.Object obj = this.primaryImageUrl;
            int hashCode5 = obj == null ? 0 : obj.hashCode();
            java.util.List<java.lang.Object> list = this.secondaryImageUrls;
            int hashCode6 = list == null ? 0 : list.hashCode();
            java.lang.Object obj2 = this.canonicalUrl;
            int hashCode7 = obj2 == null ? 0 : obj2.hashCode();
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice currentPrice = this.currentPrice;
            int hashCode8 = currentPrice == null ? 0 : currentPrice.hashCode();
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice listPrice = this.listPrice;
            int hashCode9 = listPrice == null ? 0 : listPrice.hashCode();
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store store = this.store;
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (store != null ? store.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CommerceItem)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CommerceItem commerceItem = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CommerceItem) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, commerceItem.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, commerceItem.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.brand, commerceItem.brand) && kotlin.jvm.internal.Intrinsics.areEqual(this.info, commerceItem.info) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryImageUrl, commerceItem.primaryImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryImageUrls, commerceItem.secondaryImageUrls) && kotlin.jvm.internal.Intrinsics.areEqual(this.canonicalUrl, commerceItem.canonicalUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentPrice, commerceItem.currentPrice) && kotlin.jvm.internal.Intrinsics.areEqual(this.listPrice, commerceItem.listPrice) && kotlin.jvm.internal.Intrinsics.areEqual(this.store, commerceItem.store);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CommerceItem copy(java.lang.String id, java.lang.String name2, java.lang.String brand, java.lang.String info, java.lang.Object primaryImageUrl, java.util.List<? extends java.lang.Object> secondaryImageUrls, java.lang.Object canonicalUrl, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice currentPrice, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice listPrice, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store store) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CommerceItem(id, name2, brand, info, primaryImageUrl, secondaryImageUrls, canonicalUrl, currentPrice, listPrice, store);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice getListPrice() {
            return this.listPrice;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice getCurrentPrice() {
            return this.currentPrice;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Object getCanonicalUrl() {
            return this.canonicalUrl;
        }

        public final java.util.List<java.lang.Object> component6() {
            return this.secondaryImageUrls;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getPrimaryImageUrl() {
            return this.primaryImageUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getInfo() {
            return this.info;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getBrand() {
            return this.brand;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store getStore() {
            return this.store;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CurrentPrice;", "", "", "__typename", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/MoneyFields;", "moneyFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/MoneyFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/MoneyFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/MoneyFields;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CurrentPrice;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/MoneyFields;", "getMoneyFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CurrentPrice {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields moneyFields;

        public CurrentPrice(java.lang.String str, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields moneyFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFields, "");
            this.__typename = str;
            this.moneyFields = moneyFields;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields getMoneyFields() {
            return this.moneyFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields moneyFields = this.moneyFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrentPrice(__typename=");
            sb.append(str);
            sb.append(", moneyFields=");
            sb.append(moneyFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.moneyFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice currentPrice = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, currentPrice.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFields, currentPrice.moneyFields);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice copy(java.lang.String __typename, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields moneyFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFields, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice(__typename, moneyFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields getMoneyFields() {
            return this.moneyFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice currentPrice, java.lang.String str, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields moneyFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = currentPrice.__typename;
            }
            if ((i & 2) != 0) {
                moneyFields = currentPrice.moneyFields;
            }
            return currentPrice.copy(str, moneyFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$ListPrice;", "", "", "__typename", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/MoneyFields;", "moneyFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/MoneyFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/MoneyFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/MoneyFields;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$ListPrice;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/MoneyFields;", "getMoneyFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ListPrice {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields moneyFields;

        public ListPrice(java.lang.String str, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields moneyFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFields, "");
            this.__typename = str;
            this.moneyFields = moneyFields;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields getMoneyFields() {
            return this.moneyFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields moneyFields = this.moneyFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ListPrice(__typename=");
            sb.append(str);
            sb.append(", moneyFields=");
            sb.append(moneyFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.moneyFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice listPrice = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, listPrice.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFields, listPrice.moneyFields);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice copy(java.lang.String __typename, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields moneyFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFields, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice(__typename, moneyFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields getMoneyFields() {
            return this.moneyFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice listPrice, java.lang.String str, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields moneyFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = listPrice.__typename;
            }
            if ((i & 2) != 0) {
                moneyFields = listPrice.moneyFields;
            }
            return listPrice.copy(str, moneyFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Store;", "", "", "__typename", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/StoreFields;", "storeFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/StoreFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/StoreFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/StoreFields;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Store;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/StoreFields;", "getStoreFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Store {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields storeFields;

        public Store(java.lang.String str, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields storeFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storeFields, "");
            this.__typename = str;
            this.storeFields = storeFields;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields getStoreFields() {
            return this.storeFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields storeFields = this.storeFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Store(__typename=");
            sb.append(str);
            sb.append(", storeFields=");
            sb.append(storeFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.storeFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store store = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, store.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.storeFields, store.storeFields);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store copy(java.lang.String __typename, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields storeFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storeFields, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store(__typename, storeFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields getStoreFields() {
            return this.storeFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store store, java.lang.String str, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields storeFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = store.__typename;
            }
            if ((i & 2) != 0) {
                storeFields = store.storeFields;
            }
            return store.copy(str, storeFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Details;", "", "", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "flavor", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Details;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getColor", "getFlavor", "getSize"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Details {
        public static final int $stable = 0;
        private final java.lang.String color;
        private final java.lang.String flavor;
        private final java.lang.String size;

        public Details(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.color = str;
            this.flavor = str2;
            this.size = str3;
        }

        public final java.lang.String getColor() {
            return this.color;
        }

        public final java.lang.String getFlavor() {
            return this.flavor;
        }

        public final java.lang.String getSize() {
            return this.size;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.color;
            java.lang.String str2 = this.flavor;
            java.lang.String str3 = this.size;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Details(color=");
            sb.append(str);
            sb.append(", flavor=");
            sb.append(str2);
            sb.append(", size=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.color;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.flavor;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.size;
            return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details details = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.color, details.color) && kotlin.jvm.internal.Intrinsics.areEqual(this.flavor, details.flavor) && kotlin.jvm.internal.Intrinsics.areEqual(this.size, details.size);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details copy(java.lang.String color, java.lang.String flavor, java.lang.String size) {
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details(color, flavor, size);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSize() {
            return this.size;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFlavor() {
            return this.flavor;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getColor() {
            return this.color;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Details details, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = details.color;
            }
            if ((i & 2) != 0) {
                str2 = details.flavor;
            }
            if ((i & 4) != 0) {
                str3 = details.size;
            }
            return details.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticProductCarouselComponent;", "", "", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item3;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$OnAgenticProductCarouselComponent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAgenticProductCarouselComponent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item3> items;

        public OnAgenticProductCarouselComponent(java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item3> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item3> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item3> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAgenticProductCarouselComponent(items=");
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
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticProductCarouselComponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticProductCarouselComponent) other).items);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticProductCarouselComponent copy(java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item3> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticProductCarouselComponent(items);
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item3> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticProductCarouselComponent copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.OnAgenticProductCarouselComponent onAgenticProductCarouselComponent, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onAgenticProductCarouselComponent.items;
            }
            return onAgenticProductCarouselComponent.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item3;", "", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Product;", "product", "", "promotionalMessage", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Product;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Product;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Product;Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Item3;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Product;", "getProduct", "Ljava/lang/String;", "getPromotionalMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item3 {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Product product;
        private final java.lang.String promotionalMessage;

        public Item3(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Product product, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
            this.product = product;
            this.promotionalMessage = str;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Product getProduct() {
            return this.product;
        }

        public final java.lang.String getPromotionalMessage() {
            return this.promotionalMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Product product = this.product;
            java.lang.String str = this.promotionalMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item3(product=");
            sb.append(product);
            sb.append(", promotionalMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.product.hashCode();
            java.lang.String str = this.promotionalMessage;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item3)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item3 item3 = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item3) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.product, item3.product) && kotlin.jvm.internal.Intrinsics.areEqual(this.promotionalMessage, item3.promotionalMessage);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item3 copy(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Product product, java.lang.String promotionalMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item3(product, promotionalMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPromotionalMessage() {
            return this.promotionalMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Product getProduct() {
            return this.product;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item3 copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Item3 item3, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Product product, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                product = item3.product;
            }
            if ((i & 2) != 0) {
                str = item3.promotionalMessage;
            }
            return item3.copy(product, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001aJ\u0010\u0010*\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b.\u0010\u001dJÂ\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\b@\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\bA\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\bB\u0010\u001aR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\bE\u0010\u001aR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bF\u0010%R\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\bG\u0010\u001aR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\bH\u0010\u001aR\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\bJ\u0010+R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010K\u001a\u0004\bL\u0010-R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010;\u001a\u0004\bM\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Product;", "", "", "id", "title", "primaryImageUrl", "", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CurrentPrice1;", "currentPrice", "archived", "brand", "", "categories", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "additionalImageUrls", "parentId", "variantId", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$ListPrice1;", "listPrice", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Store1;", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "updatedTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CurrentPrice1;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$ListPrice1;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Store1;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "component4", "()Ljava/lang/Boolean;", "component5", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CurrentPrice1;", "component6", "component7", "component8", "()Ljava/util/List;", "component9", "component10", "component11", "component12", "component13", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$ListPrice1;", "component14", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Store1;", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CurrentPrice1;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$ListPrice1;Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Store1;Ljava/lang/Object;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Product;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getTitle", "Ljava/lang/Object;", "getPrimaryImageUrl", "Ljava/lang/Boolean;", "getAvailable", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CurrentPrice1;", "getCurrentPrice", "getArchived", "getBrand", "Ljava/util/List;", "getCategories", "getDescription", "getAdditionalImageUrls", "getParentId", "getVariantId", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$ListPrice1;", "getListPrice", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Store1;", "getStore", "getUpdatedTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Product {
        public static final int $stable = 8;
        private final java.util.List<java.lang.Object> additionalImageUrls;
        private final java.lang.Boolean archived;
        private final java.lang.Boolean available;
        private final java.lang.String brand;
        private final java.util.List<java.lang.String> categories;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice1 currentPrice;
        private final java.lang.String description;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice1 listPrice;
        private final java.lang.String parentId;
        private final java.lang.Object primaryImageUrl;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store1 store;
        private final java.lang.String title;
        private final java.lang.Object updatedTime;
        private final java.lang.String variantId;

        public Product(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.Boolean bool, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice1 currentPrice1, java.lang.Boolean bool2, java.lang.String str3, java.util.List<java.lang.String> list, java.lang.String str4, java.util.List<? extends java.lang.Object> list2, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice1 listPrice1, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store1 store1, java.lang.Object obj2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentPrice1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listPrice1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(store1, "");
            this.id = str;
            this.title = str2;
            this.primaryImageUrl = obj;
            this.available = bool;
            this.currentPrice = currentPrice1;
            this.archived = bool2;
            this.brand = str3;
            this.categories = list;
            this.description = str4;
            this.additionalImageUrls = list2;
            this.parentId = str5;
            this.variantId = str6;
            this.listPrice = listPrice1;
            this.store = store1;
            this.updatedTime = obj2;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.Object getPrimaryImageUrl() {
            return this.primaryImageUrl;
        }

        public final java.lang.Boolean getAvailable() {
            return this.available;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice1 getCurrentPrice() {
            return this.currentPrice;
        }

        public final java.lang.Boolean getArchived() {
            return this.archived;
        }

        public final java.lang.String getBrand() {
            return this.brand;
        }

        public final java.util.List<java.lang.String> getCategories() {
            return this.categories;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.util.List<java.lang.Object> getAdditionalImageUrls() {
            return this.additionalImageUrls;
        }

        public final java.lang.String getParentId() {
            return this.parentId;
        }

        public final java.lang.String getVariantId() {
            return this.variantId;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice1 getListPrice() {
            return this.listPrice;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store1 getStore() {
            return this.store;
        }

        public final java.lang.Object getUpdatedTime() {
            return this.updatedTime;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.title;
            java.lang.Object obj = this.primaryImageUrl;
            java.lang.Boolean bool = this.available;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice1 currentPrice1 = this.currentPrice;
            java.lang.Boolean bool2 = this.archived;
            java.lang.String str3 = this.brand;
            java.util.List<java.lang.String> list = this.categories;
            java.lang.String str4 = this.description;
            java.util.List<java.lang.Object> list2 = this.additionalImageUrls;
            java.lang.String str5 = this.parentId;
            java.lang.String str6 = this.variantId;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice1 listPrice1 = this.listPrice;
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store1 store1 = this.store;
            java.lang.Object obj2 = this.updatedTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Product(id=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", primaryImageUrl=");
            sb.append(obj);
            sb.append(", available=");
            sb.append(bool);
            sb.append(", currentPrice=");
            sb.append(currentPrice1);
            sb.append(", archived=");
            sb.append(bool2);
            sb.append(", brand=");
            sb.append(str3);
            sb.append(", categories=");
            sb.append(list);
            sb.append(", description=");
            sb.append(str4);
            sb.append(", additionalImageUrls=");
            sb.append(list2);
            sb.append(", parentId=");
            sb.append(str5);
            sb.append(", variantId=");
            sb.append(str6);
            sb.append(", listPrice=");
            sb.append(listPrice1);
            sb.append(", store=");
            sb.append(store1);
            sb.append(", updatedTime=");
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.title.hashCode();
            java.lang.Object obj = this.primaryImageUrl;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            java.lang.Boolean bool = this.available;
            int hashCode4 = bool == null ? 0 : bool.hashCode();
            int hashCode5 = this.currentPrice.hashCode();
            java.lang.Boolean bool2 = this.archived;
            int hashCode6 = bool2 == null ? 0 : bool2.hashCode();
            java.lang.String str = this.brand;
            int hashCode7 = str == null ? 0 : str.hashCode();
            int hashCode8 = this.categories.hashCode();
            java.lang.String str2 = this.description;
            int hashCode9 = str2 == null ? 0 : str2.hashCode();
            java.util.List<java.lang.Object> list = this.additionalImageUrls;
            int hashCode10 = list == null ? 0 : list.hashCode();
            int hashCode11 = this.parentId.hashCode();
            java.lang.String str3 = this.variantId;
            int hashCode12 = str3 == null ? 0 : str3.hashCode();
            int hashCode13 = this.listPrice.hashCode();
            int hashCode14 = this.store.hashCode();
            java.lang.Object obj2 = this.updatedTime;
            return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + (obj2 != null ? obj2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Product)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Product product = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Product) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, product.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, product.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryImageUrl, product.primaryImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.available, product.available) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentPrice, product.currentPrice) && kotlin.jvm.internal.Intrinsics.areEqual(this.archived, product.archived) && kotlin.jvm.internal.Intrinsics.areEqual(this.brand, product.brand) && kotlin.jvm.internal.Intrinsics.areEqual(this.categories, product.categories) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, product.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalImageUrls, product.additionalImageUrls) && kotlin.jvm.internal.Intrinsics.areEqual(this.parentId, product.parentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.variantId, product.variantId) && kotlin.jvm.internal.Intrinsics.areEqual(this.listPrice, product.listPrice) && kotlin.jvm.internal.Intrinsics.areEqual(this.store, product.store) && kotlin.jvm.internal.Intrinsics.areEqual(this.updatedTime, product.updatedTime);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Product copy(java.lang.String id, java.lang.String title, java.lang.Object primaryImageUrl, java.lang.Boolean available, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice1 currentPrice, java.lang.Boolean archived, java.lang.String brand, java.util.List<java.lang.String> categories, java.lang.String description, java.util.List<? extends java.lang.Object> additionalImageUrls, java.lang.String parentId, java.lang.String variantId, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice1 listPrice, com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store1 store, java.lang.Object updatedTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentPrice, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categories, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listPrice, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(store, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Product(id, title, primaryImageUrl, available, currentPrice, archived, brand, categories, description, additionalImageUrls, parentId, variantId, listPrice, store, updatedTime);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.util.List<java.lang.String> component8() {
            return this.categories;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getBrand() {
            return this.brand;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Boolean getArchived() {
            return this.archived;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice1 getCurrentPrice() {
            return this.currentPrice;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Boolean getAvailable() {
            return this.available;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getPrimaryImageUrl() {
            return this.primaryImageUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component15, reason: from getter */
        public final java.lang.Object getUpdatedTime() {
            return this.updatedTime;
        }

        /* renamed from: component14, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store1 getStore() {
            return this.store;
        }

        /* renamed from: component13, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice1 getListPrice() {
            return this.listPrice;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.String getVariantId() {
            return this.variantId;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.String getParentId() {
            return this.parentId;
        }

        public final java.util.List<java.lang.Object> component10() {
            return this.additionalImageUrls;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CurrentPrice1;", "", "", "__typename", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/MoneyFields;", "moneyFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/MoneyFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/MoneyFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/MoneyFields;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$CurrentPrice1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/MoneyFields;", "getMoneyFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CurrentPrice1 {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields moneyFields;

        public CurrentPrice1(java.lang.String str, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields moneyFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFields, "");
            this.__typename = str;
            this.moneyFields = moneyFields;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields getMoneyFields() {
            return this.moneyFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields moneyFields = this.moneyFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrentPrice1(__typename=");
            sb.append(str);
            sb.append(", moneyFields=");
            sb.append(moneyFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.moneyFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice1)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice1 currentPrice1 = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, currentPrice1.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFields, currentPrice1.moneyFields);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice1 copy(java.lang.String __typename, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields moneyFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFields, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice1(__typename, moneyFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields getMoneyFields() {
            return this.moneyFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice1 copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CurrentPrice1 currentPrice1, java.lang.String str, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields moneyFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = currentPrice1.__typename;
            }
            if ((i & 2) != 0) {
                moneyFields = currentPrice1.moneyFields;
            }
            return currentPrice1.copy(str, moneyFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$ListPrice1;", "", "", "__typename", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/MoneyFields;", "moneyFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/MoneyFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/MoneyFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/MoneyFields;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$ListPrice1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/MoneyFields;", "getMoneyFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ListPrice1 {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields moneyFields;

        public ListPrice1(java.lang.String str, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields moneyFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFields, "");
            this.__typename = str;
            this.moneyFields = moneyFields;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields getMoneyFields() {
            return this.moneyFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields moneyFields = this.moneyFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ListPrice1(__typename=");
            sb.append(str);
            sb.append(", moneyFields=");
            sb.append(moneyFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.moneyFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice1)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice1 listPrice1 = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, listPrice1.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFields, listPrice1.moneyFields);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice1 copy(java.lang.String __typename, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields moneyFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFields, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice1(__typename, moneyFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields getMoneyFields() {
            return this.moneyFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice1 copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.ListPrice1 listPrice1, java.lang.String str, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.MoneyFields moneyFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = listPrice1.__typename;
            }
            if ((i & 2) != 0) {
                moneyFields = listPrice1.moneyFields;
            }
            return listPrice1.copy(str, moneyFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Store1;", "", "", "__typename", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/StoreFields;", "storeFields", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/StoreFields;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/StoreFields;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/StoreFields;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Store1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/fragment/StoreFields;", "getStoreFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Store1 {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields storeFields;

        public Store1(java.lang.String str, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields storeFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storeFields, "");
            this.__typename = str;
            this.storeFields = storeFields;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields getStoreFields() {
            return this.storeFields;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields storeFields = this.storeFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Store1(__typename=");
            sb.append(str);
            sb.append(", storeFields=");
            sb.append(storeFields);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.storeFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store1)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store1 store1 = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, store1.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.storeFields, store1.storeFields);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store1 copy(java.lang.String __typename, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields storeFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storeFields, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store1(__typename, storeFields);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields getStoreFields() {
            return this.storeFields;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store1 copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Store1 store1, java.lang.String str, com.paypal.oslo.feature.searchandintelligence.graphql.fragment.StoreFields storeFields, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = store1.__typename;
            }
            if ((i & 2) != 0) {
                storeFields = store1.storeFields;
            }
            return store1.copy(str, storeFields);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CreateAgenticSessionMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation CreateAgenticSession($input: CreateAgenticSessionInput!) { createAgenticSession(input: $input) { session { id } items { __typename ... on AgenticTextChatResponseComponent { text } ... on AgenticCategoryCarouselComponent { items { name primaryImageUrl reasoningText reasoningCode agenticCommerceItemCarouselComponent { items { commerceItem { id name brand info primaryImageUrl secondaryImageUrls canonicalUrl currentPrice { __typename ...MoneyFields } listPrice { __typename ...MoneyFields } store { __typename ...StoreFields } } checkoutEnabled details { color flavor size } promotionalMessage } } } } ... on AgenticProductCarouselComponent { items { product { id title primaryImageUrl available currentPrice { __typename ...MoneyFields } archived brand categories description additionalImageUrls parentId variantId listPrice { __typename ...MoneyFields } store { __typename ...StoreFields } updatedTime } promotionalMessage } } } } }  fragment MoneyFields on Money { currencyCode value }  fragment StoreFields on Store { id name logoUrl }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CreateAgenticSessionInput createAgenticSessionInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateAgenticSessionMutation(input=");
        sb.append(createAgenticSessionInput);
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
        return (other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation) other).input);
    }

    public final com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation copy(com.paypal.oslo.api.graphql.schema.type.CreateAgenticSessionInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CreateAgenticSessionInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation createAgenticSessionMutation, com.paypal.oslo.api.graphql.schema.type.CreateAgenticSessionInput createAgenticSessionInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            createAgenticSessionInput = createAgenticSessionMutation.input;
        }
        return createAgenticSessionMutation.copy(createAgenticSessionInput);
    }
}
