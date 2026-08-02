package com.paypal.oslo.feature.identity.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007*+,-./)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;", "getInput", "Companion", "Data", "Authenticate", "OnAuthenticationChallengeResult", "Challenge", "OnPasskeyCredentialRequestOptionAuthenticationChallenge", "AllowedCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PasskeyLoginChallengeContextMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Data> {
    public static final java.lang.String OPERATION_ID = "7918ef807bae12ff5b352e4a408f5c4b9f349e6863844d9e55df14bac3863508";
    public static final java.lang.String OPERATION_NAME = "PasskeyLoginChallengeContext";
    private final com.paypal.oslo.api.graphql.schema.type.AuthenticateInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Companion INSTANCE = new com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Companion(null);
    public static final int $stable = 8;

    public PasskeyLoginChallengeContextMutation(com.paypal.oslo.api.graphql.schema.type.AuthenticateInput authenticateInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticateInput, "");
        this.input = authenticateInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AuthenticateInput getInput() {
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
        com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.identity.graphql.selections.PasskeyLoginChallengeContextMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Authenticate;", "authenticate", "<init>", "(Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Authenticate;)V", "component1", "()Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Authenticate;", "copy", "(Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Authenticate;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Authenticate;", "getAuthenticate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate authenticate;

        public Data(com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate authenticate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticate, "");
            this.authenticate = authenticate;
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate getAuthenticate() {
            return this.authenticate;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate authenticate = this.authenticate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(authenticate=");
            sb.append(authenticate);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.authenticate.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticate, ((com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Data) other).authenticate);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Data copy(com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate authenticate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticate, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Data(authenticate);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate getAuthenticate() {
            return this.authenticate;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Data copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Data data, com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate authenticate, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                authenticate = data.authenticate;
            }
            return data.copy(authenticate);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Authenticate;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnAuthenticationChallengeResult;", "onAuthenticationChallengeResult", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnAuthenticationChallengeResult;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnAuthenticationChallengeResult;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnAuthenticationChallengeResult;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Authenticate;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnAuthenticationChallengeResult;", "getOnAuthenticationChallengeResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class Authenticate {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult;

        public Authenticate(java.lang.String str, com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onAuthenticationChallengeResult = onAuthenticationChallengeResult;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult getOnAuthenticationChallengeResult() {
            return this.onAuthenticationChallengeResult;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult = this.onAuthenticationChallengeResult;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Authenticate(__typename=");
            sb.append(str);
            sb.append(", onAuthenticationChallengeResult=");
            sb.append(onAuthenticationChallengeResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult = this.onAuthenticationChallengeResult;
            return (hashCode * 31) + (onAuthenticationChallengeResult == null ? 0 : onAuthenticationChallengeResult.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate authenticate = (com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, authenticate.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onAuthenticationChallengeResult, authenticate.onAuthenticationChallengeResult);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate(__typename, onAuthenticationChallengeResult);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult getOnAuthenticationChallengeResult() {
            return this.onAuthenticationChallengeResult;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate authenticate, java.lang.String str, com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = authenticate.__typename;
            }
            if ((i & 2) != 0) {
                onAuthenticationChallengeResult = authenticate.onAuthenticationChallengeResult;
            }
            return authenticate.copy(str, onAuthenticationChallengeResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnAuthenticationChallengeResult;", "", "", "correlationId", "", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Challenge;", "challenges", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnAuthenticationChallengeResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId", "getCorrelationId$annotations", "()V", "Ljava/util/List;", "getChallenges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAuthenticationChallengeResult {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Challenge> challenges;
        private final java.lang.String correlationId;

        @kotlin.Deprecated(message = "Use the top-level GraphQL response `extensions.correlationId` instead.")
        public static /* synthetic */ void getCorrelationId$annotations() {
        }

        public OnAuthenticationChallengeResult(java.lang.String str, java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Challenge> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.correlationId = str;
            this.challenges = list;
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Challenge> getChallenges() {
            return this.challenges;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Challenge> list = this.challenges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAuthenticationChallengeResult(correlationId=");
            sb.append(str);
            sb.append(", challenges=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.correlationId;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.challenges.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult = (com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, onAuthenticationChallengeResult.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.challenges, onAuthenticationChallengeResult.challenges);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult copy(java.lang.String correlationId, java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Challenge> challenges) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenges, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult(correlationId, challenges);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Challenge> component2() {
            return this.challenges;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onAuthenticationChallengeResult.correlationId;
            }
            if ((i & 2) != 0) {
                list = onAuthenticationChallengeResult.challenges;
            }
            return onAuthenticationChallengeResult.copy(str, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Challenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnPasskeyCredentialRequestOptionAuthenticationChallenge;", "onPasskeyCredentialRequestOptionAuthenticationChallenge", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnPasskeyCredentialRequestOptionAuthenticationChallenge;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnPasskeyCredentialRequestOptionAuthenticationChallenge;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnPasskeyCredentialRequestOptionAuthenticationChallenge;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Challenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnPasskeyCredentialRequestOptionAuthenticationChallenge;", "getOnPasskeyCredentialRequestOptionAuthenticationChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Challenge {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge onPasskeyCredentialRequestOptionAuthenticationChallenge;

        public Challenge(java.lang.String str, com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge onPasskeyCredentialRequestOptionAuthenticationChallenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onPasskeyCredentialRequestOptionAuthenticationChallenge = onPasskeyCredentialRequestOptionAuthenticationChallenge;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge getOnPasskeyCredentialRequestOptionAuthenticationChallenge() {
            return this.onPasskeyCredentialRequestOptionAuthenticationChallenge;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge onPasskeyCredentialRequestOptionAuthenticationChallenge = this.onPasskeyCredentialRequestOptionAuthenticationChallenge;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Challenge(__typename=");
            sb.append(str);
            sb.append(", onPasskeyCredentialRequestOptionAuthenticationChallenge=");
            sb.append(onPasskeyCredentialRequestOptionAuthenticationChallenge);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge onPasskeyCredentialRequestOptionAuthenticationChallenge = this.onPasskeyCredentialRequestOptionAuthenticationChallenge;
            return (hashCode * 31) + (onPasskeyCredentialRequestOptionAuthenticationChallenge == null ? 0 : onPasskeyCredentialRequestOptionAuthenticationChallenge.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Challenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Challenge challenge = (com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Challenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, challenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPasskeyCredentialRequestOptionAuthenticationChallenge, challenge.onPasskeyCredentialRequestOptionAuthenticationChallenge);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Challenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge onPasskeyCredentialRequestOptionAuthenticationChallenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Challenge(__typename, onPasskeyCredentialRequestOptionAuthenticationChallenge);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge getOnPasskeyCredentialRequestOptionAuthenticationChallenge() {
            return this.onPasskeyCredentialRequestOptionAuthenticationChallenge;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Challenge copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Challenge challenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge onPasskeyCredentialRequestOptionAuthenticationChallenge, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = challenge.__typename;
            }
            if ((i & 2) != 0) {
                onPasskeyCredentialRequestOptionAuthenticationChallenge = challenge.onPasskeyCredentialRequestOptionAuthenticationChallenge;
            }
            return challenge.copy(str, onPasskeyCredentialRequestOptionAuthenticationChallenge);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0016R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnPasskeyCredentialRequestOptionAuthenticationChallenge;", "", "", "contextId", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "challengeType", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "relyingPartyId", "Lcom/paypal/oslo/api/graphql/schema/type/PasskeyUserVerification;", "userVerification", "", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$AllowedCredential;", "allowedCredentials", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PasskeyUserVerification;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "component3", "component4", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/PasskeyUserVerification;", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PasskeyUserVerification;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnPasskeyCredentialRequestOptionAuthenticationChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContextId", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "getChallengeType", "getChallenge", "getRelyingPartyId", "Lcom/paypal/oslo/api/graphql/schema/type/PasskeyUserVerification;", "getUserVerification", "Ljava/util/List;", "getAllowedCredentials"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class OnPasskeyCredentialRequestOptionAuthenticationChallenge {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.AllowedCredential> allowedCredentials;
        private final java.lang.String challenge;
        private final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType challengeType;
        private final java.lang.String contextId;
        private final java.lang.String relyingPartyId;
        private final com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification userVerification;

        public OnPasskeyCredentialRequestOptionAuthenticationChallenge(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType, java.lang.String str2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification passkeyUserVerification, java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.AllowedCredential> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationChallengeType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyUserVerification, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.contextId = str;
            this.challengeType = authenticationChallengeType;
            this.challenge = str2;
            this.relyingPartyId = str3;
            this.userVerification = passkeyUserVerification;
            this.allowedCredentials = list;
        }

        public final java.lang.String getContextId() {
            return this.contextId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType getChallengeType() {
            return this.challengeType;
        }

        public final java.lang.String getChallenge() {
            return this.challenge;
        }

        public final java.lang.String getRelyingPartyId() {
            return this.relyingPartyId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification getUserVerification() {
            return this.userVerification;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.AllowedCredential> getAllowedCredentials() {
            return this.allowedCredentials;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.contextId;
            com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType = this.challengeType;
            java.lang.String str2 = this.challenge;
            java.lang.String str3 = this.relyingPartyId;
            com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification passkeyUserVerification = this.userVerification;
            java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.AllowedCredential> list = this.allowedCredentials;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPasskeyCredentialRequestOptionAuthenticationChallenge(contextId=");
            sb.append(str);
            sb.append(", challengeType=");
            sb.append(authenticationChallengeType);
            sb.append(", challenge=");
            sb.append(str2);
            sb.append(", relyingPartyId=");
            sb.append(str3);
            sb.append(", userVerification=");
            sb.append(passkeyUserVerification);
            sb.append(", allowedCredentials=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.contextId;
            return ((((((((((str == null ? 0 : str.hashCode()) * 31) + this.challengeType.hashCode()) * 31) + this.challenge.hashCode()) * 31) + this.relyingPartyId.hashCode()) * 31) + this.userVerification.hashCode()) * 31) + this.allowedCredentials.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge onPasskeyCredentialRequestOptionAuthenticationChallenge = (com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contextId, onPasskeyCredentialRequestOptionAuthenticationChallenge.contextId) && this.challengeType == onPasskeyCredentialRequestOptionAuthenticationChallenge.challengeType && kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, onPasskeyCredentialRequestOptionAuthenticationChallenge.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.relyingPartyId, onPasskeyCredentialRequestOptionAuthenticationChallenge.relyingPartyId) && this.userVerification == onPasskeyCredentialRequestOptionAuthenticationChallenge.userVerification && kotlin.jvm.internal.Intrinsics.areEqual(this.allowedCredentials, onPasskeyCredentialRequestOptionAuthenticationChallenge.allowedCredentials);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge copy(java.lang.String contextId, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType challengeType, java.lang.String challenge, java.lang.String relyingPartyId, com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification userVerification, java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.AllowedCredential> allowedCredentials) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relyingPartyId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userVerification, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allowedCredentials, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge(contextId, challengeType, challenge, relyingPartyId, userVerification, allowedCredentials);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.AllowedCredential> component6() {
            return this.allowedCredentials;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification getUserVerification() {
            return this.userVerification;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getRelyingPartyId() {
            return this.relyingPartyId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getChallenge() {
            return this.challenge;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType getChallengeType() {
            return this.challengeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getContextId() {
            return this.contextId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge onPasskeyCredentialRequestOptionAuthenticationChallenge, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType, java.lang.String str2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification passkeyUserVerification, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPasskeyCredentialRequestOptionAuthenticationChallenge.contextId;
            }
            if ((i & 2) != 0) {
                authenticationChallengeType = onPasskeyCredentialRequestOptionAuthenticationChallenge.challengeType;
            }
            com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType2 = authenticationChallengeType;
            if ((i & 4) != 0) {
                str2 = onPasskeyCredentialRequestOptionAuthenticationChallenge.challenge;
            }
            java.lang.String str4 = str2;
            if ((i & 8) != 0) {
                str3 = onPasskeyCredentialRequestOptionAuthenticationChallenge.relyingPartyId;
            }
            java.lang.String str5 = str3;
            if ((i & 16) != 0) {
                passkeyUserVerification = onPasskeyCredentialRequestOptionAuthenticationChallenge.userVerification;
            }
            com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification passkeyUserVerification2 = passkeyUserVerification;
            if ((i & 32) != 0) {
                list = onPasskeyCredentialRequestOptionAuthenticationChallenge.allowedCredentials;
            }
            return onPasskeyCredentialRequestOptionAuthenticationChallenge.copy(str, authenticationChallengeType2, str4, str5, passkeyUserVerification2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$AllowedCredential;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/PasskeyAuthenticationType;", "type", "", "Lcom/paypal/oslo/api/graphql/schema/type/PasskeyAuthenticationTransport;", "transports", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PasskeyAuthenticationType;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/PasskeyAuthenticationType;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PasskeyAuthenticationType;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$AllowedCredential;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/PasskeyAuthenticationType;", "getType", "Ljava/util/List;", "getTransports"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class AllowedCredential {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationTransport> transports;
        private final com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType type;

        /* JADX WARN: Multi-variable type inference failed */
        public AllowedCredential(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType passkeyAuthenticationType, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationTransport> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyAuthenticationType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.id = str;
            this.type = passkeyAuthenticationType;
            this.transports = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType getType() {
            return this.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationTransport> getTransports() {
            return this.transports;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType passkeyAuthenticationType = this.type;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationTransport> list = this.transports;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AllowedCredential(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(passkeyAuthenticationType);
            sb.append(", transports=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.transports.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.AllowedCredential)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.AllowedCredential allowedCredential = (com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.AllowedCredential) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, allowedCredential.id) && this.type == allowedCredential.type && kotlin.jvm.internal.Intrinsics.areEqual(this.transports, allowedCredential.transports);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.AllowedCredential copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType type, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationTransport> transports) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transports, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.AllowedCredential(id, type, transports);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationTransport> component3() {
            return this.transports;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.AllowedCredential copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.AllowedCredential allowedCredential, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType passkeyAuthenticationType, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = allowedCredential.id;
            }
            if ((i & 2) != 0) {
                passkeyAuthenticationType = allowedCredential.type;
            }
            if ((i & 4) != 0) {
                list = allowedCredential.transports;
            }
            return allowedCredential.copy(str, passkeyAuthenticationType, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation PasskeyLoginChallengeContext($input: AuthenticateInput!) { authenticate(input: $input) { __typename ... on AuthenticationChallengeResult { correlationId challenges { __typename ... on PasskeyCredentialRequestOptionAuthenticationChallenge { contextId challengeType challenge relyingPartyId userVerification allowedCredentials { id type transports } } } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.AuthenticateInput authenticateInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyLoginChallengeContextMutation(input=");
        sb.append(authenticateInput);
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
        return (other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation) other).input);
    }

    public final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation copy(com.paypal.oslo.api.graphql.schema.type.AuthenticateInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AuthenticateInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation passkeyLoginChallengeContextMutation, com.paypal.oslo.api.graphql.schema.type.AuthenticateInput authenticateInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            authenticateInput = passkeyLoginChallengeContextMutation.input;
        }
        return passkeyLoginChallengeContextMutation.copy(authenticateInput);
    }
}
