package com.paypal.oslo.feature.searchandintelligence.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CloseAgenticSessionMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CloseAgenticSessionMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CloseAgenticSessionInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CloseAgenticSessionInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CloseAgenticSessionInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CloseAgenticSessionInput;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CloseAgenticSessionMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CloseAgenticSessionInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.OPERATION_NAME, "Session"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CloseAgenticSessionMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Data> {
    public static final java.lang.String OPERATION_ID = "eceab42b7604a81ba56bb42bba73fe6cfd78f7bf606541bca73384bef232400a";
    public static final java.lang.String OPERATION_NAME = "CloseAgenticSession";
    private final com.paypal.oslo.api.graphql.schema.type.CloseAgenticSessionInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Companion INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Companion(null);
    public static final int $stable = 8;

    public CloseAgenticSessionMutation(com.paypal.oslo.api.graphql.schema.type.CloseAgenticSessionInput closeAgenticSessionInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAgenticSessionInput, "");
        this.input = closeAgenticSessionInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CloseAgenticSessionInput getInput() {
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
        com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CloseAgenticSessionMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.CloseAgenticSessionMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.searchandintelligence.graphql.selections.CloseAgenticSessionMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CloseAgenticSessionMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CloseAgenticSessionMutation$CloseAgenticSession;", "closeAgenticSession", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/graphql/CloseAgenticSessionMutation$CloseAgenticSession;)V", "component1", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/CloseAgenticSessionMutation$CloseAgenticSession;", "copy", "(Lcom/paypal/oslo/feature/searchandintelligence/graphql/CloseAgenticSessionMutation$CloseAgenticSession;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CloseAgenticSessionMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CloseAgenticSessionMutation$CloseAgenticSession;", "getCloseAgenticSession"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.CloseAgenticSession closeAgenticSession;

        public Data(com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.CloseAgenticSession closeAgenticSession) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAgenticSession, "");
            this.closeAgenticSession = closeAgenticSession;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.CloseAgenticSession getCloseAgenticSession() {
            return this.closeAgenticSession;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.CloseAgenticSession closeAgenticSession = this.closeAgenticSession;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(closeAgenticSession=");
            sb.append(closeAgenticSession);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.closeAgenticSession.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.closeAgenticSession, ((com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Data) other).closeAgenticSession);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Data copy(com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.CloseAgenticSession closeAgenticSession) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAgenticSession, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Data(closeAgenticSession);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.CloseAgenticSession getCloseAgenticSession() {
            return this.closeAgenticSession;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Data copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Data data, com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.CloseAgenticSession closeAgenticSession, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                closeAgenticSession = data.closeAgenticSession;
            }
            return data.copy(closeAgenticSession);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CloseAgenticSessionMutation$CloseAgenticSession;", "", "", "success", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CloseAgenticSessionMutation$Session;", "session", "<init>", "(ZLcom/paypal/oslo/feature/searchandintelligence/graphql/CloseAgenticSessionMutation$Session;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/CloseAgenticSessionMutation$Session;", "copy", "(ZLcom/paypal/oslo/feature/searchandintelligence/graphql/CloseAgenticSessionMutation$Session;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CloseAgenticSessionMutation$CloseAgenticSession;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSuccess", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/CloseAgenticSessionMutation$Session;", "getSession"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseAgenticSession {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Session session;
        private final boolean success;

        public CloseAgenticSession(boolean z, com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Session session) {
            this.success = z;
            this.session = session;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Session getSession() {
            return this.session;
        }

        public final java.lang.String toString() {
            boolean z = this.success;
            com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Session session = this.session;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseAgenticSession(success=");
            sb.append(z);
            sb.append(", session=");
            sb.append(session);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.success);
            com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Session session = this.session;
            return (hashCode * 31) + (session == null ? 0 : session.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.CloseAgenticSession)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.CloseAgenticSession closeAgenticSession = (com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.CloseAgenticSession) other;
            return this.success == closeAgenticSession.success && kotlin.jvm.internal.Intrinsics.areEqual(this.session, closeAgenticSession.session);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.CloseAgenticSession copy(boolean success, com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Session session) {
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.CloseAgenticSession(success, session);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Session getSession() {
            return this.session;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.CloseAgenticSession copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.CloseAgenticSession closeAgenticSession, boolean z, com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Session session, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = closeAgenticSession.success;
            }
            if ((i & 2) != 0) {
                session = closeAgenticSession.session;
            }
            return closeAgenticSession.copy(z, session);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CloseAgenticSessionMutation$Session;", "", "id", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/CloseAgenticSessionMutation$Session;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Session) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Session) other).id);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Session copy(java.lang.Object id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Session(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Session copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Session session, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = session.id;
            }
            return session.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/CloseAgenticSessionMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation CloseAgenticSession($input: CloseAgenticSessionInput!) { closeAgenticSession(input: $input) { success session { id } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CloseAgenticSessionInput closeAgenticSessionInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseAgenticSessionMutation(input=");
        sb.append(closeAgenticSessionInput);
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
        return (other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation) other).input);
    }

    public final com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation copy(com.paypal.oslo.api.graphql.schema.type.CloseAgenticSessionInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CloseAgenticSessionInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation closeAgenticSessionMutation, com.paypal.oslo.api.graphql.schema.type.CloseAgenticSessionInput closeAgenticSessionInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            closeAgenticSessionInput = closeAgenticSessionMutation.input;
        }
        return closeAgenticSessionMutation.copy(closeAgenticSessionInput);
    }
}
