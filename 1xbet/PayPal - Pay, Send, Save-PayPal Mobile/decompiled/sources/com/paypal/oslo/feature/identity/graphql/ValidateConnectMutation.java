package com.paypal.oslo.feature.identity.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ValidateConnectMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/identity/graphql/ValidateConnectMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ValidateConnectInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ValidateConnectInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ValidateConnectInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ValidateConnectInput;)Lcom/paypal/oslo/feature/identity/graphql/ValidateConnectMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ValidateConnectInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ValidateConnectMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.Data> {
    public static final java.lang.String OPERATION_ID = "d3b7afe8ebeb64a76086b4bbb75552077101d28743669beb646b72c5cfa7ec85";
    public static final java.lang.String OPERATION_NAME = "ValidateConnect";
    private final com.paypal.oslo.api.graphql.schema.type.ValidateConnectInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.Companion INSTANCE = new com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.Companion(null);
    public static final int $stable = 8;

    public ValidateConnectMutation(com.paypal.oslo.api.graphql.schema.type.ValidateConnectInput validateConnectInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateConnectInput, "");
        this.input = validateConnectInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ValidateConnectInput getInput() {
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
        com.paypal.oslo.feature.identity.graphql.adapter.ValidateConnectMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.ValidateConnectMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.identity.graphql.selections.ValidateConnectMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ValidateConnectMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/identity/graphql/ValidateConnectMutation$ValidateConnect;", "validateConnect", "<init>", "(Lcom/paypal/oslo/feature/identity/graphql/ValidateConnectMutation$ValidateConnect;)V", "component1", "()Lcom/paypal/oslo/feature/identity/graphql/ValidateConnectMutation$ValidateConnect;", "copy", "(Lcom/paypal/oslo/feature/identity/graphql/ValidateConnectMutation$ValidateConnect;)Lcom/paypal/oslo/feature/identity/graphql/ValidateConnectMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/graphql/ValidateConnectMutation$ValidateConnect;", "getValidateConnect"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.ValidateConnect validateConnect;

        public Data(com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.ValidateConnect validateConnect) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateConnect, "");
            this.validateConnect = validateConnect;
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.ValidateConnect getValidateConnect() {
            return this.validateConnect;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.ValidateConnect validateConnect = this.validateConnect;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(validateConnect=");
            sb.append(validateConnect);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.validateConnect.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.validateConnect, ((com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.Data) other).validateConnect);
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.Data copy(com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.ValidateConnect validateConnect) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateConnect, "");
            return new com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.Data(validateConnect);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.ValidateConnect getValidateConnect() {
            return this.validateConnect;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.Data copy$default(com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.Data data, com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.ValidateConnect validateConnect, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                validateConnect = data.validateConnect;
            }
            return data.copy(validateConnect);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ValidateConnectMutation$ValidateConnect;", "", "", "__typename", "connectUrl", "returnUrl", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/feature/identity/graphql/ValidateConnectMutation$ValidateConnect;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Ljava/lang/Object;", "getConnectUrl", "getReturnUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidateConnect {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object connectUrl;
        private final java.lang.Object returnUrl;

        public ValidateConnect(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            this.__typename = str;
            this.connectUrl = obj;
            this.returnUrl = obj2;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.Object getConnectUrl() {
            return this.connectUrl;
        }

        public final java.lang.Object getReturnUrl() {
            return this.returnUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.Object obj = this.connectUrl;
            java.lang.Object obj2 = this.returnUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidateConnect(__typename=");
            sb.append(str);
            sb.append(", connectUrl=");
            sb.append(obj);
            sb.append(", returnUrl=");
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.__typename.hashCode() * 31) + this.connectUrl.hashCode()) * 31) + this.returnUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.ValidateConnect)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.ValidateConnect validateConnect = (com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.ValidateConnect) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, validateConnect.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.connectUrl, validateConnect.connectUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, validateConnect.returnUrl);
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.ValidateConnect copy(java.lang.String __typename, java.lang.Object connectUrl, java.lang.Object returnUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnUrl, "");
            return new com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.ValidateConnect(__typename, connectUrl, returnUrl);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getReturnUrl() {
            return this.returnUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getConnectUrl() {
            return this.connectUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.ValidateConnect copy$default(com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.ValidateConnect validateConnect, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                str = validateConnect.__typename;
            }
            if ((i & 2) != 0) {
                obj = validateConnect.connectUrl;
            }
            if ((i & 4) != 0) {
                obj2 = validateConnect.returnUrl;
            }
            return validateConnect.copy(str, obj, obj2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ValidateConnectMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation ValidateConnect($input: ValidateConnectInput!) { validateConnect(input: $input) { __typename connectUrl returnUrl } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ValidateConnectInput validateConnectInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidateConnectMutation(input=");
        sb.append(validateConnectInput);
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
        return (other instanceof com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation) other).input);
    }

    public final com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation copy(com.paypal.oslo.api.graphql.schema.type.ValidateConnectInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ValidateConnectInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation copy$default(com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation validateConnectMutation, com.paypal.oslo.api.graphql.schema.type.ValidateConnectInput validateConnectInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            validateConnectInput = validateConnectMutation.input;
        }
        return validateConnectMutation.copy(validateConnectInput);
    }
}
