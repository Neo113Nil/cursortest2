package com.paypal.oslo.feature.settings.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CreateAccountActivityLogInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CreateAccountActivityLogInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CreateAccountActivityLogInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CreateAccountActivityLogInput;)Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CreateAccountActivityLogInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.OPERATION_NAME, com.google.common.net.HttpHeaders.LINK}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CreateAccountActivityLogMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Data> {
    public static final java.lang.String OPERATION_ID = "38e18260f3cfe92c289211b9fbed53469fa8a55a3daab2f3afaa322a1bc3dd4b";
    public static final java.lang.String OPERATION_NAME = "CreateAccountActivityLog";
    private final com.paypal.oslo.api.graphql.schema.type.CreateAccountActivityLogInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Companion INSTANCE = new com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Companion(null);
    public static final int $stable = 8;

    public CreateAccountActivityLogMutation(com.paypal.oslo.api.graphql.schema.type.CreateAccountActivityLogInput createAccountActivityLogInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createAccountActivityLogInput, "");
        this.input = createAccountActivityLogInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreateAccountActivityLogInput getInput() {
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
        com.paypal.oslo.feature.settings.graphql.adapter.CreateAccountActivityLogMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.settings.graphql.adapter.CreateAccountActivityLogMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.settings.graphql.selections.CreateAccountActivityLogMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation$CreateAccountActivityLog;", "createAccountActivityLog", "<init>", "(Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation$CreateAccountActivityLog;)V", "component1", "()Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation$CreateAccountActivityLog;", "copy", "(Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation$CreateAccountActivityLog;)Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation$CreateAccountActivityLog;", "getCreateAccountActivityLog", "getCreateAccountActivityLog$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.CreateAccountActivityLog createAccountActivityLog;

        @kotlin.Deprecated(message = "Migrating the flow to a different component")
        public static /* synthetic */ void getCreateAccountActivityLog$annotations() {
        }

        public Data(com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.CreateAccountActivityLog createAccountActivityLog) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createAccountActivityLog, "");
            this.createAccountActivityLog = createAccountActivityLog;
        }

        public final com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.CreateAccountActivityLog getCreateAccountActivityLog() {
            return this.createAccountActivityLog;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.CreateAccountActivityLog createAccountActivityLog = this.createAccountActivityLog;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(createAccountActivityLog=");
            sb.append(createAccountActivityLog);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.createAccountActivityLog.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.createAccountActivityLog, ((com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Data) other).createAccountActivityLog);
        }

        public final com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Data copy(com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.CreateAccountActivityLog createAccountActivityLog) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createAccountActivityLog, "");
            return new com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Data(createAccountActivityLog);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.CreateAccountActivityLog getCreateAccountActivityLog() {
            return this.createAccountActivityLog;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Data copy$default(com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Data data, com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.CreateAccountActivityLog createAccountActivityLog, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                createAccountActivityLog = data.createAccountActivityLog;
            }
            return data.copy(createAccountActivityLog);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation$CreateAccountActivityLog;", "", "", "Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation$Link;", "links", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation$CreateAccountActivityLog;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getLinks"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreateAccountActivityLog {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Link> links;

        public CreateAccountActivityLog(java.util.List<com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Link> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.links = list;
        }

        public final java.util.List<com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Link> getLinks() {
            return this.links;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Link> list = this.links;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateAccountActivityLog(links=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.links.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.CreateAccountActivityLog) && kotlin.jvm.internal.Intrinsics.areEqual(this.links, ((com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.CreateAccountActivityLog) other).links);
        }

        public final com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.CreateAccountActivityLog copy(java.util.List<com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Link> links) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(links, "");
            return new com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.CreateAccountActivityLog(links);
        }

        public final java.util.List<com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Link> component1() {
            return this.links;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.CreateAccountActivityLog copy$default(com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.CreateAccountActivityLog createAccountActivityLog, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = createAccountActivityLog.links;
            }
            return createAccountActivityLog.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation$Link;", "", "href", "", io.ktor.http.LinkHeader.Parameters.Rel, "Lcom/paypal/oslo/api/graphql/schema/type/HttpMethod;", "method", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/HttpMethod;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/HttpMethod;", "copy", "(Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/HttpMethod;)Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation$Link;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getHref", "Ljava/lang/String;", "getRel", "Lcom/paypal/oslo/api/graphql/schema/type/HttpMethod;", "getMethod"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final /* data */ class Link {
        public static final int $stable = 8;
        private final java.lang.Object href;
        private final com.paypal.oslo.api.graphql.schema.type.HttpMethod method;
        private final java.lang.String rel;

        public Link(java.lang.Object obj, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.HttpMethod httpMethod) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMethod, "");
            this.href = obj;
            this.rel = str;
            this.method = httpMethod;
        }

        public final java.lang.Object getHref() {
            return this.href;
        }

        public final java.lang.String getRel() {
            return this.rel;
        }

        public final com.paypal.oslo.api.graphql.schema.type.HttpMethod getMethod() {
            return this.method;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.href;
            java.lang.String str = this.rel;
            com.paypal.oslo.api.graphql.schema.type.HttpMethod httpMethod = this.method;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Link(href=");
            sb.append(obj);
            sb.append(", rel=");
            sb.append(str);
            sb.append(", method=");
            sb.append(httpMethod);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.href.hashCode() * 31) + this.rel.hashCode()) * 31) + this.method.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Link)) {
                return false;
            }
            com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Link link = (com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Link) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.href, link.href) && kotlin.jvm.internal.Intrinsics.areEqual(this.rel, link.rel) && this.method == link.method;
        }

        public final com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Link copy(java.lang.Object href, java.lang.String rel, com.paypal.oslo.api.graphql.schema.type.HttpMethod method) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(href, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            return new com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Link(href, rel, method);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.HttpMethod getMethod() {
            return this.method;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRel() {
            return this.rel;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getHref() {
            return this.href;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Link copy$default(com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Link link, java.lang.Object obj, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.HttpMethod httpMethod, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = link.href;
            }
            if ((i & 2) != 0) {
                str = link.rel;
            }
            if ((i & 4) != 0) {
                httpMethod = link.method;
            }
            return link.copy(obj, str, httpMethod);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation CreateAccountActivityLog($input: CreateAccountActivityLogInput!) { createAccountActivityLog(input: $input) { links { href rel method } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CreateAccountActivityLogInput createAccountActivityLogInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateAccountActivityLogMutation(input=");
        sb.append(createAccountActivityLogInput);
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
        return (other instanceof com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation) other).input);
    }

    public final com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation copy(com.paypal.oslo.api.graphql.schema.type.CreateAccountActivityLogInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CreateAccountActivityLogInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation copy$default(com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation createAccountActivityLogMutation, com.paypal.oslo.api.graphql.schema.type.CreateAccountActivityLogInput createAccountActivityLogInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            createAccountActivityLogInput = createAccountActivityLogMutation.input;
        }
        return createAccountActivityLogMutation.copy(createAccountActivityLogInput);
    }
}
