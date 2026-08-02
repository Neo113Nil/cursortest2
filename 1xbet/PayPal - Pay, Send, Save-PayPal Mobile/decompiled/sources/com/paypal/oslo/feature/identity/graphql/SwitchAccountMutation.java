package com.paypal.oslo.feature.identity.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000f*+,-./01234567)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;)Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;", "getInput", "Companion", "Data", "Authenticate", "OnAuthenticationTokenResult", "OnAuthenticationChallengeResult", "Challenge", "OnTextOneTimePasscodeIdentityChallenge", "OnEmailOneTimePasscodeIdentityChallenge", "OnWhatsappOneTimePasscodeIdentityChallenge", "OnPhoneOneTimePasscodeIdentityChallenge", "OnAuthenticatorAppIdentityChallenge", "OnSecurityQuestionIdentityChallenge", "Status", "OnNotifyStepUpIdentityChallengeResult", "OnValidateStepUpIdentityChallengeResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SwitchAccountMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Data> {
    public static final java.lang.String OPERATION_ID = "023e7bca0a40466cc948aeae989c064524e4e6405521b9fedc6561804b594938";
    public static final java.lang.String OPERATION_NAME = "SwitchAccount";
    private final com.paypal.oslo.api.graphql.schema.type.AuthenticateInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Companion INSTANCE = new com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Companion(null);
    public static final int $stable = 8;

    public SwitchAccountMutation(com.paypal.oslo.api.graphql.schema.type.AuthenticateInput authenticateInput) {
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
        com.paypal.oslo.feature.identity.graphql.adapter.SwitchAccountMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.SwitchAccountMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.identity.graphql.selections.SwitchAccountMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Authenticate;", "authenticate", "<init>", "(Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Authenticate;)V", "component1", "()Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Authenticate;", "copy", "(Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Authenticate;)Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Authenticate;", "getAuthenticate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Authenticate authenticate;

        public Data(com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Authenticate authenticate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticate, "");
            this.authenticate = authenticate;
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Authenticate getAuthenticate() {
            return this.authenticate;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Authenticate authenticate = this.authenticate;
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
            return (other instanceof com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticate, ((com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Data) other).authenticate);
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Data copy(com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Authenticate authenticate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticate, "");
            return new com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Data(authenticate);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Authenticate getAuthenticate() {
            return this.authenticate;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Data copy$default(com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Data data, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Authenticate authenticate, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                authenticate = data.authenticate;
            }
            return data.copy(authenticate);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Authenticate;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticationTokenResult;", "onAuthenticationTokenResult", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticationChallengeResult;", "onAuthenticationChallengeResult", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticationTokenResult;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticationChallengeResult;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticationTokenResult;", "component3", "()Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticationChallengeResult;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticationTokenResult;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticationChallengeResult;)Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Authenticate;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticationTokenResult;", "getOnAuthenticationTokenResult", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticationChallengeResult;", "getOnAuthenticationChallengeResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Authenticate {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult;
        private final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationTokenResult onAuthenticationTokenResult;

        public Authenticate(java.lang.String str, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationTokenResult onAuthenticationTokenResult, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onAuthenticationTokenResult = onAuthenticationTokenResult;
            this.onAuthenticationChallengeResult = onAuthenticationChallengeResult;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationTokenResult getOnAuthenticationTokenResult() {
            return this.onAuthenticationTokenResult;
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationChallengeResult getOnAuthenticationChallengeResult() {
            return this.onAuthenticationChallengeResult;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationTokenResult onAuthenticationTokenResult = this.onAuthenticationTokenResult;
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult = this.onAuthenticationChallengeResult;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Authenticate(__typename=");
            sb.append(str);
            sb.append(", onAuthenticationTokenResult=");
            sb.append(onAuthenticationTokenResult);
            sb.append(", onAuthenticationChallengeResult=");
            sb.append(onAuthenticationChallengeResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationTokenResult onAuthenticationTokenResult = this.onAuthenticationTokenResult;
            int hashCode2 = onAuthenticationTokenResult == null ? 0 : onAuthenticationTokenResult.hashCode();
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult = this.onAuthenticationChallengeResult;
            return (((hashCode * 31) + hashCode2) * 31) + (onAuthenticationChallengeResult != null ? onAuthenticationChallengeResult.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Authenticate)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Authenticate authenticate = (com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Authenticate) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, authenticate.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onAuthenticationTokenResult, authenticate.onAuthenticationTokenResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.onAuthenticationChallengeResult, authenticate.onAuthenticationChallengeResult);
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Authenticate copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationTokenResult onAuthenticationTokenResult, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Authenticate(__typename, onAuthenticationTokenResult, onAuthenticationChallengeResult);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationChallengeResult getOnAuthenticationChallengeResult() {
            return this.onAuthenticationChallengeResult;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationTokenResult getOnAuthenticationTokenResult() {
            return this.onAuthenticationTokenResult;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Authenticate copy$default(com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Authenticate authenticate, java.lang.String str, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationTokenResult onAuthenticationTokenResult, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = authenticate.__typename;
            }
            if ((i & 2) != 0) {
                onAuthenticationTokenResult = authenticate.onAuthenticationTokenResult;
            }
            if ((i & 4) != 0) {
                onAuthenticationChallengeResult = authenticate.onAuthenticationChallengeResult;
            }
            return authenticate.copy(str, onAuthenticationTokenResult, onAuthenticationChallengeResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticationTokenResult;", "", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticationTokenResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAuthenticationTokenResult {
        public static final int $stable = 0;
        private final java.lang.String token;

        public OnAuthenticationTokenResult(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.token = str;
        }

        public final java.lang.String getToken() {
            return this.token;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.token;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAuthenticationTokenResult(token=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationTokenResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.token, ((com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationTokenResult) other).token);
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationTokenResult copy(java.lang.String token) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            return new com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationTokenResult(token);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getToken() {
            return this.token;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationTokenResult copy$default(com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationTokenResult onAuthenticationTokenResult, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onAuthenticationTokenResult.token;
            }
            return onAuthenticationTokenResult.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticationChallengeResult;", "", "", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Challenge;", "challenges", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Status;", "status", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Status;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Status;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Status;)Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticationChallengeResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getChallenges", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Status;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAuthenticationChallengeResult {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Challenge> challenges;
        private final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Status status;

        public OnAuthenticationChallengeResult(java.util.List<com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Challenge> list, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Status status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenges = list;
            this.status = status;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Challenge> getChallenges() {
            return this.challenges;
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Status getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Challenge> list = this.challenges;
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Status status = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAuthenticationChallengeResult(challenges=");
            sb.append(list);
            sb.append(", status=");
            sb.append(status);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challenges.hashCode();
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Status status = this.status;
            return (hashCode * 31) + (status == null ? 0 : status.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationChallengeResult)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult = (com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationChallengeResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenges, onAuthenticationChallengeResult.challenges) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, onAuthenticationChallengeResult.status);
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationChallengeResult copy(java.util.List<com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Challenge> challenges, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Status status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenges, "");
            return new com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationChallengeResult(challenges, status);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Status getStatus() {
            return this.status;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Challenge> component1() {
            return this.challenges;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationChallengeResult copy$default(com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult, java.util.List list, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Status status, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onAuthenticationChallengeResult.challenges;
            }
            if ((i & 2) != 0) {
                status = onAuthenticationChallengeResult.status;
            }
            return onAuthenticationChallengeResult.copy(list, status);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJb\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Challenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnTextOneTimePasscodeIdentityChallenge;", "onTextOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnEmailOneTimePasscodeIdentityChallenge;", "onEmailOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "onWhatsappOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "onPhoneOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticatorAppIdentityChallenge;", "onAuthenticatorAppIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnSecurityQuestionIdentityChallenge;", "onSecurityQuestionIdentityChallenge", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnTextOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnEmailOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnWhatsappOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnPhoneOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticatorAppIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnSecurityQuestionIdentityChallenge;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnTextOneTimePasscodeIdentityChallenge;", "component3", "()Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnEmailOneTimePasscodeIdentityChallenge;", "component4", "()Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "component5", "()Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "component6", "()Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticatorAppIdentityChallenge;", "component7", "()Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnSecurityQuestionIdentityChallenge;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnTextOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnEmailOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnWhatsappOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnPhoneOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticatorAppIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnSecurityQuestionIdentityChallenge;)Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Challenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnTextOneTimePasscodeIdentityChallenge;", "getOnTextOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnEmailOneTimePasscodeIdentityChallenge;", "getOnEmailOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "getOnWhatsappOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "getOnPhoneOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticatorAppIdentityChallenge;", "getOnAuthenticatorAppIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnSecurityQuestionIdentityChallenge;", "getOnSecurityQuestionIdentityChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Challenge {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge;

        public Challenge(java.lang.String str, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onTextOneTimePasscodeIdentityChallenge = onTextOneTimePasscodeIdentityChallenge;
            this.onEmailOneTimePasscodeIdentityChallenge = onEmailOneTimePasscodeIdentityChallenge;
            this.onWhatsappOneTimePasscodeIdentityChallenge = onWhatsappOneTimePasscodeIdentityChallenge;
            this.onPhoneOneTimePasscodeIdentityChallenge = onPhoneOneTimePasscodeIdentityChallenge;
            this.onAuthenticatorAppIdentityChallenge = onAuthenticatorAppIdentityChallenge;
            this.onSecurityQuestionIdentityChallenge = onSecurityQuestionIdentityChallenge;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnTextOneTimePasscodeIdentityChallenge getOnTextOneTimePasscodeIdentityChallenge() {
            return this.onTextOneTimePasscodeIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnEmailOneTimePasscodeIdentityChallenge getOnEmailOneTimePasscodeIdentityChallenge() {
            return this.onEmailOneTimePasscodeIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnWhatsappOneTimePasscodeIdentityChallenge getOnWhatsappOneTimePasscodeIdentityChallenge() {
            return this.onWhatsappOneTimePasscodeIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnPhoneOneTimePasscodeIdentityChallenge getOnPhoneOneTimePasscodeIdentityChallenge() {
            return this.onPhoneOneTimePasscodeIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticatorAppIdentityChallenge getOnAuthenticatorAppIdentityChallenge() {
            return this.onAuthenticatorAppIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnSecurityQuestionIdentityChallenge getOnSecurityQuestionIdentityChallenge() {
            return this.onSecurityQuestionIdentityChallenge;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge = this.onTextOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge = this.onEmailOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge = this.onWhatsappOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge = this.onPhoneOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge = this.onAuthenticatorAppIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge = this.onSecurityQuestionIdentityChallenge;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Challenge(__typename=");
            sb.append(str);
            sb.append(", onTextOneTimePasscodeIdentityChallenge=");
            sb.append(onTextOneTimePasscodeIdentityChallenge);
            sb.append(", onEmailOneTimePasscodeIdentityChallenge=");
            sb.append(onEmailOneTimePasscodeIdentityChallenge);
            sb.append(", onWhatsappOneTimePasscodeIdentityChallenge=");
            sb.append(onWhatsappOneTimePasscodeIdentityChallenge);
            sb.append(", onPhoneOneTimePasscodeIdentityChallenge=");
            sb.append(onPhoneOneTimePasscodeIdentityChallenge);
            sb.append(", onAuthenticatorAppIdentityChallenge=");
            sb.append(onAuthenticatorAppIdentityChallenge);
            sb.append(", onSecurityQuestionIdentityChallenge=");
            sb.append(onSecurityQuestionIdentityChallenge);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge = this.onTextOneTimePasscodeIdentityChallenge;
            int hashCode2 = onTextOneTimePasscodeIdentityChallenge == null ? 0 : onTextOneTimePasscodeIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge = this.onEmailOneTimePasscodeIdentityChallenge;
            int hashCode3 = onEmailOneTimePasscodeIdentityChallenge == null ? 0 : onEmailOneTimePasscodeIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge = this.onWhatsappOneTimePasscodeIdentityChallenge;
            int hashCode4 = onWhatsappOneTimePasscodeIdentityChallenge == null ? 0 : onWhatsappOneTimePasscodeIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge = this.onPhoneOneTimePasscodeIdentityChallenge;
            int hashCode5 = onPhoneOneTimePasscodeIdentityChallenge == null ? 0 : onPhoneOneTimePasscodeIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge = this.onAuthenticatorAppIdentityChallenge;
            int hashCode6 = onAuthenticatorAppIdentityChallenge == null ? 0 : onAuthenticatorAppIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge = this.onSecurityQuestionIdentityChallenge;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (onSecurityQuestionIdentityChallenge != null ? onSecurityQuestionIdentityChallenge.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Challenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Challenge challenge = (com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Challenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, challenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onTextOneTimePasscodeIdentityChallenge, challenge.onTextOneTimePasscodeIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onEmailOneTimePasscodeIdentityChallenge, challenge.onEmailOneTimePasscodeIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onWhatsappOneTimePasscodeIdentityChallenge, challenge.onWhatsappOneTimePasscodeIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPhoneOneTimePasscodeIdentityChallenge, challenge.onPhoneOneTimePasscodeIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onAuthenticatorAppIdentityChallenge, challenge.onAuthenticatorAppIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onSecurityQuestionIdentityChallenge, challenge.onSecurityQuestionIdentityChallenge);
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Challenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Challenge(__typename, onTextOneTimePasscodeIdentityChallenge, onEmailOneTimePasscodeIdentityChallenge, onWhatsappOneTimePasscodeIdentityChallenge, onPhoneOneTimePasscodeIdentityChallenge, onAuthenticatorAppIdentityChallenge, onSecurityQuestionIdentityChallenge);
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnSecurityQuestionIdentityChallenge getOnSecurityQuestionIdentityChallenge() {
            return this.onSecurityQuestionIdentityChallenge;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticatorAppIdentityChallenge getOnAuthenticatorAppIdentityChallenge() {
            return this.onAuthenticatorAppIdentityChallenge;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnPhoneOneTimePasscodeIdentityChallenge getOnPhoneOneTimePasscodeIdentityChallenge() {
            return this.onPhoneOneTimePasscodeIdentityChallenge;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnWhatsappOneTimePasscodeIdentityChallenge getOnWhatsappOneTimePasscodeIdentityChallenge() {
            return this.onWhatsappOneTimePasscodeIdentityChallenge;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnEmailOneTimePasscodeIdentityChallenge getOnEmailOneTimePasscodeIdentityChallenge() {
            return this.onEmailOneTimePasscodeIdentityChallenge;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnTextOneTimePasscodeIdentityChallenge getOnTextOneTimePasscodeIdentityChallenge() {
            return this.onTextOneTimePasscodeIdentityChallenge;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Challenge copy$default(com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Challenge challenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = challenge.__typename;
            }
            if ((i & 2) != 0) {
                onTextOneTimePasscodeIdentityChallenge = challenge.onTextOneTimePasscodeIdentityChallenge;
            }
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge2 = onTextOneTimePasscodeIdentityChallenge;
            if ((i & 4) != 0) {
                onEmailOneTimePasscodeIdentityChallenge = challenge.onEmailOneTimePasscodeIdentityChallenge;
            }
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge2 = onEmailOneTimePasscodeIdentityChallenge;
            if ((i & 8) != 0) {
                onWhatsappOneTimePasscodeIdentityChallenge = challenge.onWhatsappOneTimePasscodeIdentityChallenge;
            }
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge2 = onWhatsappOneTimePasscodeIdentityChallenge;
            if ((i & 16) != 0) {
                onPhoneOneTimePasscodeIdentityChallenge = challenge.onPhoneOneTimePasscodeIdentityChallenge;
            }
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge2 = onPhoneOneTimePasscodeIdentityChallenge;
            if ((i & 32) != 0) {
                onAuthenticatorAppIdentityChallenge = challenge.onAuthenticatorAppIdentityChallenge;
            }
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge2 = onAuthenticatorAppIdentityChallenge;
            if ((i & 64) != 0) {
                onSecurityQuestionIdentityChallenge = challenge.onSecurityQuestionIdentityChallenge;
            }
            return challenge.copy(str, onTextOneTimePasscodeIdentityChallenge2, onEmailOneTimePasscodeIdentityChallenge2, onWhatsappOneTimePasscodeIdentityChallenge2, onPhoneOneTimePasscodeIdentityChallenge2, onAuthenticatorAppIdentityChallenge2, onSecurityQuestionIdentityChallenge);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnTextOneTimePasscodeIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;", "textOtpChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnTextOneTimePasscodeIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;", "getTextOtpChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTextOneTimePasscodeIdentityChallenge {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment textOtpChallengeFragment;

        public OnTextOneTimePasscodeIdentityChallenge(java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment textOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textOtpChallengeFragment, "");
            this.__typename = str;
            this.textOtpChallengeFragment = textOtpChallengeFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment getTextOtpChallengeFragment() {
            return this.textOtpChallengeFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment textOtpChallengeFragment = this.textOtpChallengeFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnTextOneTimePasscodeIdentityChallenge(__typename=");
            sb.append(str);
            sb.append(", textOtpChallengeFragment=");
            sb.append(textOtpChallengeFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.textOtpChallengeFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnTextOneTimePasscodeIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnTextOneTimePasscodeIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onTextOneTimePasscodeIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.textOtpChallengeFragment, onTextOneTimePasscodeIdentityChallenge.textOtpChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnTextOneTimePasscodeIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment textOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textOtpChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnTextOneTimePasscodeIdentityChallenge(__typename, textOtpChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment getTextOtpChallengeFragment() {
            return this.textOtpChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnTextOneTimePasscodeIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment textOtpChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onTextOneTimePasscodeIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                textOtpChallengeFragment = onTextOneTimePasscodeIdentityChallenge.textOtpChallengeFragment;
            }
            return onTextOneTimePasscodeIdentityChallenge.copy(str, textOtpChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnEmailOneTimePasscodeIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;", "emailOtpChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnEmailOneTimePasscodeIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;", "getEmailOtpChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnEmailOneTimePasscodeIdentityChallenge {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment emailOtpChallengeFragment;

        public OnEmailOneTimePasscodeIdentityChallenge(java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment emailOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailOtpChallengeFragment, "");
            this.__typename = str;
            this.emailOtpChallengeFragment = emailOtpChallengeFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment getEmailOtpChallengeFragment() {
            return this.emailOtpChallengeFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment emailOtpChallengeFragment = this.emailOtpChallengeFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnEmailOneTimePasscodeIdentityChallenge(__typename=");
            sb.append(str);
            sb.append(", emailOtpChallengeFragment=");
            sb.append(emailOtpChallengeFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.emailOtpChallengeFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnEmailOneTimePasscodeIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnEmailOneTimePasscodeIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onEmailOneTimePasscodeIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailOtpChallengeFragment, onEmailOneTimePasscodeIdentityChallenge.emailOtpChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnEmailOneTimePasscodeIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment emailOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailOtpChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnEmailOneTimePasscodeIdentityChallenge(__typename, emailOtpChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment getEmailOtpChallengeFragment() {
            return this.emailOtpChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnEmailOneTimePasscodeIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment emailOtpChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onEmailOneTimePasscodeIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                emailOtpChallengeFragment = onEmailOneTimePasscodeIdentityChallenge.emailOtpChallengeFragment;
            }
            return onEmailOneTimePasscodeIdentityChallenge.copy(str, emailOtpChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;", "whatsappOtpChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;", "getWhatsappOtpChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnWhatsappOneTimePasscodeIdentityChallenge {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment whatsappOtpChallengeFragment;

        public OnWhatsappOneTimePasscodeIdentityChallenge(java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment whatsappOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(whatsappOtpChallengeFragment, "");
            this.__typename = str;
            this.whatsappOtpChallengeFragment = whatsappOtpChallengeFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment getWhatsappOtpChallengeFragment() {
            return this.whatsappOtpChallengeFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment whatsappOtpChallengeFragment = this.whatsappOtpChallengeFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnWhatsappOneTimePasscodeIdentityChallenge(__typename=");
            sb.append(str);
            sb.append(", whatsappOtpChallengeFragment=");
            sb.append(whatsappOtpChallengeFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.whatsappOtpChallengeFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnWhatsappOneTimePasscodeIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnWhatsappOneTimePasscodeIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onWhatsappOneTimePasscodeIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.whatsappOtpChallengeFragment, onWhatsappOneTimePasscodeIdentityChallenge.whatsappOtpChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnWhatsappOneTimePasscodeIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment whatsappOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(whatsappOtpChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnWhatsappOneTimePasscodeIdentityChallenge(__typename, whatsappOtpChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment getWhatsappOtpChallengeFragment() {
            return this.whatsappOtpChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnWhatsappOneTimePasscodeIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment whatsappOtpChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onWhatsappOneTimePasscodeIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                whatsappOtpChallengeFragment = onWhatsappOneTimePasscodeIdentityChallenge.whatsappOtpChallengeFragment;
            }
            return onWhatsappOneTimePasscodeIdentityChallenge.copy(str, whatsappOtpChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;", "phoneOtpChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;", "getPhoneOtpChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPhoneOneTimePasscodeIdentityChallenge {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment phoneOtpChallengeFragment;

        public OnPhoneOneTimePasscodeIdentityChallenge(java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment phoneOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneOtpChallengeFragment, "");
            this.__typename = str;
            this.phoneOtpChallengeFragment = phoneOtpChallengeFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment getPhoneOtpChallengeFragment() {
            return this.phoneOtpChallengeFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment phoneOtpChallengeFragment = this.phoneOtpChallengeFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPhoneOneTimePasscodeIdentityChallenge(__typename=");
            sb.append(str);
            sb.append(", phoneOtpChallengeFragment=");
            sb.append(phoneOtpChallengeFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.phoneOtpChallengeFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnPhoneOneTimePasscodeIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnPhoneOneTimePasscodeIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onPhoneOneTimePasscodeIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneOtpChallengeFragment, onPhoneOneTimePasscodeIdentityChallenge.phoneOtpChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnPhoneOneTimePasscodeIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment phoneOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneOtpChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnPhoneOneTimePasscodeIdentityChallenge(__typename, phoneOtpChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment getPhoneOtpChallengeFragment() {
            return this.phoneOtpChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnPhoneOneTimePasscodeIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment phoneOtpChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPhoneOneTimePasscodeIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                phoneOtpChallengeFragment = onPhoneOneTimePasscodeIdentityChallenge.phoneOtpChallengeFragment;
            }
            return onPhoneOneTimePasscodeIdentityChallenge.copy(str, phoneOtpChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticatorAppIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;", "authenticatorAppChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticatorAppIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;", "getAuthenticatorAppChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAuthenticatorAppIdentityChallenge {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment;

        public OnAuthenticatorAppIdentityChallenge(java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticatorAppChallengeFragment, "");
            this.__typename = str;
            this.authenticatorAppChallengeFragment = authenticatorAppChallengeFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment getAuthenticatorAppChallengeFragment() {
            return this.authenticatorAppChallengeFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment = this.authenticatorAppChallengeFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAuthenticatorAppIdentityChallenge(__typename=");
            sb.append(str);
            sb.append(", authenticatorAppChallengeFragment=");
            sb.append(authenticatorAppChallengeFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.authenticatorAppChallengeFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticatorAppIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticatorAppIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onAuthenticatorAppIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticatorAppChallengeFragment, onAuthenticatorAppIdentityChallenge.authenticatorAppChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticatorAppIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticatorAppChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticatorAppIdentityChallenge(__typename, authenticatorAppChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment getAuthenticatorAppChallengeFragment() {
            return this.authenticatorAppChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticatorAppIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onAuthenticatorAppIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                authenticatorAppChallengeFragment = onAuthenticatorAppIdentityChallenge.authenticatorAppChallengeFragment;
            }
            return onAuthenticatorAppIdentityChallenge.copy(str, authenticatorAppChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnSecurityQuestionIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/SecurityQuestionChallengeFragment;", "securityQuestionChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/SecurityQuestionChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/SecurityQuestionChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/SecurityQuestionChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnSecurityQuestionIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/SecurityQuestionChallengeFragment;", "getSecurityQuestionChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSecurityQuestionIdentityChallenge {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.fragment.SecurityQuestionChallengeFragment securityQuestionChallengeFragment;

        public OnSecurityQuestionIdentityChallenge(java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.SecurityQuestionChallengeFragment securityQuestionChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(securityQuestionChallengeFragment, "");
            this.__typename = str;
            this.securityQuestionChallengeFragment = securityQuestionChallengeFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.fragment.SecurityQuestionChallengeFragment getSecurityQuestionChallengeFragment() {
            return this.securityQuestionChallengeFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.fragment.SecurityQuestionChallengeFragment securityQuestionChallengeFragment = this.securityQuestionChallengeFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSecurityQuestionIdentityChallenge(__typename=");
            sb.append(str);
            sb.append(", securityQuestionChallengeFragment=");
            sb.append(securityQuestionChallengeFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.securityQuestionChallengeFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnSecurityQuestionIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnSecurityQuestionIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onSecurityQuestionIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.securityQuestionChallengeFragment, onSecurityQuestionIdentityChallenge.securityQuestionChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnSecurityQuestionIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.SecurityQuestionChallengeFragment securityQuestionChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(securityQuestionChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnSecurityQuestionIdentityChallenge(__typename, securityQuestionChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.SecurityQuestionChallengeFragment getSecurityQuestionChallengeFragment() {
            return this.securityQuestionChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnSecurityQuestionIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.SecurityQuestionChallengeFragment securityQuestionChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onSecurityQuestionIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                securityQuestionChallengeFragment = onSecurityQuestionIdentityChallenge.securityQuestionChallengeFragment;
            }
            return onSecurityQuestionIdentityChallenge.copy(str, securityQuestionChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Status;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnNotifyStepUpIdentityChallengeResult;", "onNotifyStepUpIdentityChallengeResult", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnValidateStepUpIdentityChallengeResult;", "onValidateStepUpIdentityChallengeResult", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnNotifyStepUpIdentityChallengeResult;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnValidateStepUpIdentityChallengeResult;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnNotifyStepUpIdentityChallengeResult;", "component3", "()Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnValidateStepUpIdentityChallengeResult;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnNotifyStepUpIdentityChallengeResult;Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnValidateStepUpIdentityChallengeResult;)Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Status;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnNotifyStepUpIdentityChallengeResult;", "getOnNotifyStepUpIdentityChallengeResult", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnValidateStepUpIdentityChallengeResult;", "getOnValidateStepUpIdentityChallengeResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Status {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnNotifyStepUpIdentityChallengeResult onNotifyStepUpIdentityChallengeResult;
        private final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnValidateStepUpIdentityChallengeResult onValidateStepUpIdentityChallengeResult;

        public Status(java.lang.String str, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnNotifyStepUpIdentityChallengeResult onNotifyStepUpIdentityChallengeResult, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnValidateStepUpIdentityChallengeResult onValidateStepUpIdentityChallengeResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onNotifyStepUpIdentityChallengeResult = onNotifyStepUpIdentityChallengeResult;
            this.onValidateStepUpIdentityChallengeResult = onValidateStepUpIdentityChallengeResult;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnNotifyStepUpIdentityChallengeResult getOnNotifyStepUpIdentityChallengeResult() {
            return this.onNotifyStepUpIdentityChallengeResult;
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnValidateStepUpIdentityChallengeResult getOnValidateStepUpIdentityChallengeResult() {
            return this.onValidateStepUpIdentityChallengeResult;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnNotifyStepUpIdentityChallengeResult onNotifyStepUpIdentityChallengeResult = this.onNotifyStepUpIdentityChallengeResult;
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnValidateStepUpIdentityChallengeResult onValidateStepUpIdentityChallengeResult = this.onValidateStepUpIdentityChallengeResult;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Status(__typename=");
            sb.append(str);
            sb.append(", onNotifyStepUpIdentityChallengeResult=");
            sb.append(onNotifyStepUpIdentityChallengeResult);
            sb.append(", onValidateStepUpIdentityChallengeResult=");
            sb.append(onValidateStepUpIdentityChallengeResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnNotifyStepUpIdentityChallengeResult onNotifyStepUpIdentityChallengeResult = this.onNotifyStepUpIdentityChallengeResult;
            int hashCode2 = onNotifyStepUpIdentityChallengeResult == null ? 0 : onNotifyStepUpIdentityChallengeResult.hashCode();
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnValidateStepUpIdentityChallengeResult onValidateStepUpIdentityChallengeResult = this.onValidateStepUpIdentityChallengeResult;
            return (((hashCode * 31) + hashCode2) * 31) + (onValidateStepUpIdentityChallengeResult != null ? onValidateStepUpIdentityChallengeResult.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Status)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Status status = (com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Status) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, status.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onNotifyStepUpIdentityChallengeResult, status.onNotifyStepUpIdentityChallengeResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.onValidateStepUpIdentityChallengeResult, status.onValidateStepUpIdentityChallengeResult);
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Status copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnNotifyStepUpIdentityChallengeResult onNotifyStepUpIdentityChallengeResult, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnValidateStepUpIdentityChallengeResult onValidateStepUpIdentityChallengeResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Status(__typename, onNotifyStepUpIdentityChallengeResult, onValidateStepUpIdentityChallengeResult);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnValidateStepUpIdentityChallengeResult getOnValidateStepUpIdentityChallengeResult() {
            return this.onValidateStepUpIdentityChallengeResult;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnNotifyStepUpIdentityChallengeResult getOnNotifyStepUpIdentityChallengeResult() {
            return this.onNotifyStepUpIdentityChallengeResult;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Status copy$default(com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Status status, java.lang.String str, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnNotifyStepUpIdentityChallengeResult onNotifyStepUpIdentityChallengeResult, com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnValidateStepUpIdentityChallengeResult onValidateStepUpIdentityChallengeResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = status.__typename;
            }
            if ((i & 2) != 0) {
                onNotifyStepUpIdentityChallengeResult = status.onNotifyStepUpIdentityChallengeResult;
            }
            if ((i & 4) != 0) {
                onValidateStepUpIdentityChallengeResult = status.onValidateStepUpIdentityChallengeResult;
            }
            return status.copy(str, onNotifyStepUpIdentityChallengeResult, onValidateStepUpIdentityChallengeResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JR\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b)\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0017R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnNotifyStepUpIdentityChallengeResult;", "", "Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;", "notifyChallengeResultStatus", "", "challengeId", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "deliveryMethod", "deliveryTarget", "", "canRetry", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;", "stepUpStatus", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;Ljava/lang/String;ZLcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "component4", "component5", "()Z", "component6", "()Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;Ljava/lang/String;ZLcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;)Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnNotifyStepUpIdentityChallengeResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;", "getNotifyChallengeResultStatus", "Ljava/lang/String;", "getChallengeId", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "getDeliveryMethod", "getDeliveryTarget", "Z", "getCanRetry", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;", "getStepUpStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNotifyStepUpIdentityChallengeResult {
        public static final int $stable = 0;
        private final boolean canRetry;
        private final java.lang.String challengeId;
        private final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod deliveryMethod;
        private final java.lang.String deliveryTarget;
        private final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyChallengeResultStatus;
        private final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpStatus;

        public OnNotifyStepUpIdentityChallengeResult(com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyStepUpIdentityChallengeResultStatus, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod, java.lang.String str2, boolean z, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpIdentityChallengeStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifyStepUpIdentityChallengeResultStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpIdentityChallengeStatus, "");
            this.notifyChallengeResultStatus = notifyStepUpIdentityChallengeResultStatus;
            this.challengeId = str;
            this.deliveryMethod = stepUpIdentityChallengeMethod;
            this.deliveryTarget = str2;
            this.canRetry = z;
            this.stepUpStatus = stepUpIdentityChallengeStatus;
        }

        public final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus getNotifyChallengeResultStatus() {
            return this.notifyChallengeResultStatus;
        }

        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod getDeliveryMethod() {
            return this.deliveryMethod;
        }

        public final java.lang.String getDeliveryTarget() {
            return this.deliveryTarget;
        }

        public final boolean getCanRetry() {
            return this.canRetry;
        }

        public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus getStepUpStatus() {
            return this.stepUpStatus;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyStepUpIdentityChallengeResultStatus = this.notifyChallengeResultStatus;
            java.lang.String str = this.challengeId;
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod = this.deliveryMethod;
            java.lang.String str2 = this.deliveryTarget;
            boolean z = this.canRetry;
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpIdentityChallengeStatus = this.stepUpStatus;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnNotifyStepUpIdentityChallengeResult(notifyChallengeResultStatus=");
            sb.append(notifyStepUpIdentityChallengeResultStatus);
            sb.append(", challengeId=");
            sb.append(str);
            sb.append(", deliveryMethod=");
            sb.append(stepUpIdentityChallengeMethod);
            sb.append(", deliveryTarget=");
            sb.append(str2);
            sb.append(", canRetry=");
            sb.append(z);
            sb.append(", stepUpStatus=");
            sb.append(stepUpIdentityChallengeStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.notifyChallengeResultStatus.hashCode();
            java.lang.String str = this.challengeId;
            int hashCode2 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod = this.deliveryMethod;
            int hashCode3 = stepUpIdentityChallengeMethod == null ? 0 : stepUpIdentityChallengeMethod.hashCode();
            java.lang.String str2 = this.deliveryTarget;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.canRetry)) * 31) + this.stepUpStatus.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnNotifyStepUpIdentityChallengeResult)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnNotifyStepUpIdentityChallengeResult onNotifyStepUpIdentityChallengeResult = (com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnNotifyStepUpIdentityChallengeResult) other;
            return this.notifyChallengeResultStatus == onNotifyStepUpIdentityChallengeResult.notifyChallengeResultStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeId, onNotifyStepUpIdentityChallengeResult.challengeId) && this.deliveryMethod == onNotifyStepUpIdentityChallengeResult.deliveryMethod && kotlin.jvm.internal.Intrinsics.areEqual(this.deliveryTarget, onNotifyStepUpIdentityChallengeResult.deliveryTarget) && this.canRetry == onNotifyStepUpIdentityChallengeResult.canRetry && this.stepUpStatus == onNotifyStepUpIdentityChallengeResult.stepUpStatus;
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnNotifyStepUpIdentityChallengeResult copy(com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyChallengeResultStatus, java.lang.String challengeId, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod deliveryMethod, java.lang.String deliveryTarget, boolean canRetry, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifyChallengeResultStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpStatus, "");
            return new com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnNotifyStepUpIdentityChallengeResult(notifyChallengeResultStatus, challengeId, deliveryMethod, deliveryTarget, canRetry, stepUpStatus);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus getStepUpStatus() {
            return this.stepUpStatus;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getCanRetry() {
            return this.canRetry;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getDeliveryTarget() {
            return this.deliveryTarget;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod getDeliveryMethod() {
            return this.deliveryMethod;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus getNotifyChallengeResultStatus() {
            return this.notifyChallengeResultStatus;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnNotifyStepUpIdentityChallengeResult copy$default(com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnNotifyStepUpIdentityChallengeResult onNotifyStepUpIdentityChallengeResult, com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyStepUpIdentityChallengeResultStatus, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod, java.lang.String str2, boolean z, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpIdentityChallengeStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                notifyStepUpIdentityChallengeResultStatus = onNotifyStepUpIdentityChallengeResult.notifyChallengeResultStatus;
            }
            if ((i & 2) != 0) {
                str = onNotifyStepUpIdentityChallengeResult.challengeId;
            }
            java.lang.String str3 = str;
            if ((i & 4) != 0) {
                stepUpIdentityChallengeMethod = onNotifyStepUpIdentityChallengeResult.deliveryMethod;
            }
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod2 = stepUpIdentityChallengeMethod;
            if ((i & 8) != 0) {
                str2 = onNotifyStepUpIdentityChallengeResult.deliveryTarget;
            }
            java.lang.String str4 = str2;
            if ((i & 16) != 0) {
                z = onNotifyStepUpIdentityChallengeResult.canRetry;
            }
            boolean z2 = z;
            if ((i & 32) != 0) {
                stepUpIdentityChallengeStatus = onNotifyStepUpIdentityChallengeResult.stepUpStatus;
            }
            return onNotifyStepUpIdentityChallengeResult.copy(notifyStepUpIdentityChallengeResultStatus, str3, stepUpIdentityChallengeMethod2, str4, z2, stepUpIdentityChallengeStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnValidateStepUpIdentityChallengeResult;", "", "Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;", "validationChallengeResultStatus", "", "canRetry", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;", "stepUpStatus", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;ZLcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;ZLcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;)Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnValidateStepUpIdentityChallengeResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;", "getValidationChallengeResultStatus", "Z", "getCanRetry", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;", "getStepUpStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnValidateStepUpIdentityChallengeResult {
        public static final int $stable = 0;
        private final boolean canRetry;
        private final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpStatus;
        private final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validationChallengeResultStatus;

        public OnValidateStepUpIdentityChallengeResult(com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus, boolean z, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpIdentityChallengeStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpIdentityChallengeStatus, "");
            this.validationChallengeResultStatus = validateStepUpIdentityChallengeResultStatus;
            this.canRetry = z;
            this.stepUpStatus = stepUpIdentityChallengeStatus;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus getValidationChallengeResultStatus() {
            return this.validationChallengeResultStatus;
        }

        public final boolean getCanRetry() {
            return this.canRetry;
        }

        public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus getStepUpStatus() {
            return this.stepUpStatus;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus = this.validationChallengeResultStatus;
            boolean z = this.canRetry;
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpIdentityChallengeStatus = this.stepUpStatus;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnValidateStepUpIdentityChallengeResult(validationChallengeResultStatus=");
            sb.append(validateStepUpIdentityChallengeResultStatus);
            sb.append(", canRetry=");
            sb.append(z);
            sb.append(", stepUpStatus=");
            sb.append(stepUpIdentityChallengeStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus = this.validationChallengeResultStatus;
            return ((((validateStepUpIdentityChallengeResultStatus == null ? 0 : validateStepUpIdentityChallengeResultStatus.hashCode()) * 31) + java.lang.Boolean.hashCode(this.canRetry)) * 31) + this.stepUpStatus.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnValidateStepUpIdentityChallengeResult)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnValidateStepUpIdentityChallengeResult onValidateStepUpIdentityChallengeResult = (com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnValidateStepUpIdentityChallengeResult) other;
            return this.validationChallengeResultStatus == onValidateStepUpIdentityChallengeResult.validationChallengeResultStatus && this.canRetry == onValidateStepUpIdentityChallengeResult.canRetry && this.stepUpStatus == onValidateStepUpIdentityChallengeResult.stepUpStatus;
        }

        public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnValidateStepUpIdentityChallengeResult copy(com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validationChallengeResultStatus, boolean canRetry, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpStatus, "");
            return new com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnValidateStepUpIdentityChallengeResult(validationChallengeResultStatus, canRetry, stepUpStatus);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus getStepUpStatus() {
            return this.stepUpStatus;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getCanRetry() {
            return this.canRetry;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus getValidationChallengeResultStatus() {
            return this.validationChallengeResultStatus;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnValidateStepUpIdentityChallengeResult copy$default(com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnValidateStepUpIdentityChallengeResult onValidateStepUpIdentityChallengeResult, com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus, boolean z, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpIdentityChallengeStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                validateStepUpIdentityChallengeResultStatus = onValidateStepUpIdentityChallengeResult.validationChallengeResultStatus;
            }
            if ((i & 2) != 0) {
                z = onValidateStepUpIdentityChallengeResult.canRetry;
            }
            if ((i & 4) != 0) {
                stepUpIdentityChallengeStatus = onValidateStepUpIdentityChallengeResult.stepUpStatus;
            }
            return onValidateStepUpIdentityChallengeResult.copy(validateStepUpIdentityChallengeResultStatus, z, stepUpIdentityChallengeStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation SwitchAccount($input: AuthenticateInput!) { authenticate(input: $input) { __typename ... on AuthenticationTokenResult { token } ... on AuthenticationChallengeResult { challenges { __typename ... on TextOneTimePasscodeIdentityChallenge { __typename ...TextOtpChallengeFragment } ... on EmailOneTimePasscodeIdentityChallenge { __typename ...EmailOtpChallengeFragment } ... on WhatsappOneTimePasscodeIdentityChallenge { __typename ...WhatsappOtpChallengeFragment } ... on PhoneOneTimePasscodeIdentityChallenge { __typename ...PhoneOtpChallengeFragment } ... on AuthenticatorAppIdentityChallenge { __typename ...AuthenticatorAppChallengeFragment } ... on SecurityQuestionIdentityChallenge { __typename ...SecurityQuestionChallengeFragment } } status { __typename ... on NotifyStepUpIdentityChallengeResult { notifyChallengeResultStatus challengeId deliveryMethod deliveryTarget canRetry stepUpStatus } ... on ValidateStepUpIdentityChallengeResult { validationChallengeResultStatus canRetry stepUpStatus } } } } }  fragment TextOtpChallengeFragment on TextOneTimePasscodeIdentityChallenge { id phoneNumbers { challengeId maskedNumber notified } challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }  fragment EmailOtpChallengeFragment on EmailOneTimePasscodeIdentityChallenge { id emailAddresses { challengeId maskedEmail notified } challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }  fragment WhatsappOtpChallengeFragment on WhatsappOneTimePasscodeIdentityChallenge { id phoneNumbers { challengeId maskedNumber notified } challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }  fragment PhoneOtpChallengeFragment on PhoneOneTimePasscodeIdentityChallenge { id phoneNumbers { challengeId maskedNumber notified } challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }  fragment AuthenticatorAppChallengeFragment on AuthenticatorAppIdentityChallenge { id challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }  fragment SecurityQuestionChallengeFragment on SecurityQuestionIdentityChallenge { id securityQuestions { challengeId question } challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.AuthenticateInput authenticateInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SwitchAccountMutation(input=");
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
        return (other instanceof com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation) other).input);
    }

    public final com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation copy(com.paypal.oslo.api.graphql.schema.type.AuthenticateInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AuthenticateInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation copy$default(com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation switchAccountMutation, com.paypal.oslo.api.graphql.schema.type.AuthenticateInput authenticateInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            authenticateInput = switchAccountMutation.input;
        }
        return switchAccountMutation.copy(authenticateInput);
    }
}
