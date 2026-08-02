package com.paypal.oslo.feature.identity.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0016*+,-./0123456789:;<=>)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;", "authInput", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticateInput;", "getAuthInput", "Companion", "Data", "Authenticate", "OnAuthenticationTokenResult", "CheckoutData", "Operation", "OnAuthenticationChallengeResult", "Challenge", "OnGenericAuthenticationChallenge", "OnOneTimePasswordGenerateCodeAuthenticationChallenge", "Phone", "OnTextOneTimePasscodeIdentityChallenge", "OnEmailOneTimePasscodeIdentityChallenge", "OnWhatsappOneTimePasscodeIdentityChallenge", "OnPhoneOneTimePasscodeIdentityChallenge", "OnAuthenticatorAppIdentityChallenge", "OnSecurityQuestionIdentityChallenge", "OnCreditCardIdentityChallenge", "OnSilentAuthenticationIdentityChallenge", "Status", "OnNotifyStepUpIdentityChallengeResult", "OnValidateStepUpIdentityChallengeResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LoginUserMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Data> {
    public static final java.lang.String OPERATION_ID = "a969d93b779fe4af79ff9d45b2e71b27dfe692fd8c2ce8a90ae9e8fba44f9382";
    public static final java.lang.String OPERATION_NAME = "LoginUser";
    private final com.paypal.oslo.api.graphql.schema.type.AuthenticateInput authInput;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Companion INSTANCE = new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Companion(null);
    public static final int $stable = 8;

    public LoginUserMutation(com.paypal.oslo.api.graphql.schema.type.AuthenticateInput authenticateInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticateInput, "");
        this.authInput = authenticateInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AuthenticateInput getAuthInput() {
        return this.authInput;
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
        com.paypal.oslo.feature.identity.graphql.adapter.LoginUserMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.LoginUserMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.identity.graphql.selections.LoginUserMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Authenticate;", "authenticate", "<init>", "(Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Authenticate;)V", "component1", "()Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Authenticate;", "copy", "(Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Authenticate;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Authenticate;", "getAuthenticate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Authenticate authenticate;

        public Data(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Authenticate authenticate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticate, "");
            this.authenticate = authenticate;
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Authenticate getAuthenticate() {
            return this.authenticate;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Authenticate authenticate = this.authenticate;
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
            return (other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticate, ((com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Data) other).authenticate);
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Data copy(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Authenticate authenticate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticate, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Data(authenticate);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Authenticate getAuthenticate() {
            return this.authenticate;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Data copy$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Data data, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Authenticate authenticate, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                authenticate = data.authenticate;
            }
            return data.copy(authenticate);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Authenticate;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationTokenResult;", "onAuthenticationTokenResult", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationChallengeResult;", "onAuthenticationChallengeResult", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationTokenResult;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationChallengeResult;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationTokenResult;", "component3", "()Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationChallengeResult;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationTokenResult;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationChallengeResult;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Authenticate;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationTokenResult;", "getOnAuthenticationTokenResult", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationChallengeResult;", "getOnAuthenticationChallengeResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Authenticate {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult;
        private final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationTokenResult onAuthenticationTokenResult;

        public Authenticate(java.lang.String str, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationTokenResult onAuthenticationTokenResult, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onAuthenticationTokenResult = onAuthenticationTokenResult;
            this.onAuthenticationChallengeResult = onAuthenticationChallengeResult;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationTokenResult getOnAuthenticationTokenResult() {
            return this.onAuthenticationTokenResult;
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult getOnAuthenticationChallengeResult() {
            return this.onAuthenticationChallengeResult;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationTokenResult onAuthenticationTokenResult = this.onAuthenticationTokenResult;
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult = this.onAuthenticationChallengeResult;
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
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationTokenResult onAuthenticationTokenResult = this.onAuthenticationTokenResult;
            int hashCode2 = onAuthenticationTokenResult == null ? 0 : onAuthenticationTokenResult.hashCode();
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult = this.onAuthenticationChallengeResult;
            return (((hashCode * 31) + hashCode2) * 31) + (onAuthenticationChallengeResult != null ? onAuthenticationChallengeResult.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Authenticate)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Authenticate authenticate = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Authenticate) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, authenticate.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onAuthenticationTokenResult, authenticate.onAuthenticationTokenResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.onAuthenticationChallengeResult, authenticate.onAuthenticationChallengeResult);
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Authenticate copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationTokenResult onAuthenticationTokenResult, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Authenticate(__typename, onAuthenticationTokenResult, onAuthenticationChallengeResult);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult getOnAuthenticationChallengeResult() {
            return this.onAuthenticationChallengeResult;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationTokenResult getOnAuthenticationTokenResult() {
            return this.onAuthenticationTokenResult;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Authenticate copy$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Authenticate authenticate, java.lang.String str, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationTokenResult onAuthenticationTokenResult, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0012Jn\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0016R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b/\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u001aR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b4\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationTokenResult;", "", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "expiresInSec", "expiresAtTime", "correlationId", "authorizationCode", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$CheckoutData;", "checkoutData", "", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Operation;", "operations", "payerId", "<init>", "(Ljava/lang/String;ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$CheckoutData;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Ljava/lang/Object;", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$CheckoutData;", "component7", "()Ljava/util/List;", "component8", "copy", "(Ljava/lang/String;ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$CheckoutData;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationTokenResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getToken", com.visa.cbp.getEncExpo.warmup, "getExpiresInSec", "Ljava/lang/Object;", "getExpiresAtTime", "getCorrelationId", "getCorrelationId$annotations", "()V", "getAuthorizationCode", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$CheckoutData;", "getCheckoutData", "Ljava/util/List;", "getOperations", "getPayerId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAuthenticationTokenResult {
        public static final int $stable = 8;
        private final java.lang.String authorizationCode;
        private final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.CheckoutData checkoutData;
        private final java.lang.String correlationId;
        private final java.lang.Object expiresAtTime;
        private final int expiresInSec;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Operation> operations;
        private final java.lang.String payerId;
        private final java.lang.String token;

        @kotlin.Deprecated(message = "Use the top-level GraphQL response `extensions.correlationId` instead.")
        public static /* synthetic */ void getCorrelationId$annotations() {
        }

        public OnAuthenticationTokenResult(java.lang.String str, int i, java.lang.Object obj, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.CheckoutData checkoutData, java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Operation> list, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.token = str;
            this.expiresInSec = i;
            this.expiresAtTime = obj;
            this.correlationId = str2;
            this.authorizationCode = str3;
            this.checkoutData = checkoutData;
            this.operations = list;
            this.payerId = str4;
        }

        public final java.lang.String getToken() {
            return this.token;
        }

        public final int getExpiresInSec() {
            return this.expiresInSec;
        }

        public final java.lang.Object getExpiresAtTime() {
            return this.expiresAtTime;
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String getAuthorizationCode() {
            return this.authorizationCode;
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.CheckoutData getCheckoutData() {
            return this.checkoutData;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Operation> getOperations() {
            return this.operations;
        }

        public final java.lang.String getPayerId() {
            return this.payerId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.token;
            int i = this.expiresInSec;
            java.lang.Object obj = this.expiresAtTime;
            java.lang.String str2 = this.correlationId;
            java.lang.String str3 = this.authorizationCode;
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.CheckoutData checkoutData = this.checkoutData;
            java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Operation> list = this.operations;
            java.lang.String str4 = this.payerId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAuthenticationTokenResult(token=");
            sb.append(str);
            sb.append(", expiresInSec=");
            sb.append(i);
            sb.append(", expiresAtTime=");
            sb.append(obj);
            sb.append(", correlationId=");
            sb.append(str2);
            sb.append(", authorizationCode=");
            sb.append(str3);
            sb.append(", checkoutData=");
            sb.append(checkoutData);
            sb.append(", operations=");
            sb.append(list);
            sb.append(", payerId=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.token.hashCode();
            int hashCode2 = java.lang.Integer.hashCode(this.expiresInSec);
            int hashCode3 = this.expiresAtTime.hashCode();
            java.lang.String str = this.correlationId;
            int hashCode4 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.authorizationCode;
            int hashCode5 = str2 == null ? 0 : str2.hashCode();
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.CheckoutData checkoutData = this.checkoutData;
            int hashCode6 = checkoutData == null ? 0 : checkoutData.hashCode();
            int hashCode7 = this.operations.hashCode();
            java.lang.String str3 = this.payerId;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationTokenResult)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationTokenResult onAuthenticationTokenResult = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationTokenResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.token, onAuthenticationTokenResult.token) && this.expiresInSec == onAuthenticationTokenResult.expiresInSec && kotlin.jvm.internal.Intrinsics.areEqual(this.expiresAtTime, onAuthenticationTokenResult.expiresAtTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, onAuthenticationTokenResult.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.authorizationCode, onAuthenticationTokenResult.authorizationCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.checkoutData, onAuthenticationTokenResult.checkoutData) && kotlin.jvm.internal.Intrinsics.areEqual(this.operations, onAuthenticationTokenResult.operations) && kotlin.jvm.internal.Intrinsics.areEqual(this.payerId, onAuthenticationTokenResult.payerId);
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationTokenResult copy(java.lang.String token, int expiresInSec, java.lang.Object expiresAtTime, java.lang.String correlationId, java.lang.String authorizationCode, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.CheckoutData checkoutData, java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Operation> operations, java.lang.String payerId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expiresAtTime, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operations, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationTokenResult(token, expiresInSec, expiresAtTime, correlationId, authorizationCode, checkoutData, operations, payerId);
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getPayerId() {
            return this.payerId;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Operation> component7() {
            return this.operations;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.CheckoutData getCheckoutData() {
            return this.checkoutData;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getAuthorizationCode() {
            return this.authorizationCode;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getExpiresAtTime() {
            return this.expiresAtTime;
        }

        /* renamed from: component2, reason: from getter */
        public final int getExpiresInSec() {
            return this.expiresInSec;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getToken() {
            return this.token;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$CheckoutData;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment;", "identityCheckoutDataFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$CheckoutData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/IdentityCheckoutDataFragment;", "getIdentityCheckoutDataFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CheckoutData {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment identityCheckoutDataFragment;

        public CheckoutData(java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment identityCheckoutDataFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityCheckoutDataFragment, "");
            this.__typename = str;
            this.identityCheckoutDataFragment = identityCheckoutDataFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment getIdentityCheckoutDataFragment() {
            return this.identityCheckoutDataFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment identityCheckoutDataFragment = this.identityCheckoutDataFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CheckoutData(__typename=");
            sb.append(str);
            sb.append(", identityCheckoutDataFragment=");
            sb.append(identityCheckoutDataFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.identityCheckoutDataFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.CheckoutData)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.CheckoutData checkoutData = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.CheckoutData) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, checkoutData.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.identityCheckoutDataFragment, checkoutData.identityCheckoutDataFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.CheckoutData copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment identityCheckoutDataFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityCheckoutDataFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.CheckoutData(__typename, identityCheckoutDataFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment getIdentityCheckoutDataFragment() {
            return this.identityCheckoutDataFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.LoginUserMutation.CheckoutData copy$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.CheckoutData checkoutData, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.IdentityCheckoutDataFragment identityCheckoutDataFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = checkoutData.__typename;
            }
            if ((i & 2) != 0) {
                identityCheckoutDataFragment = checkoutData.identityCheckoutDataFragment;
            }
            return checkoutData.copy(str, identityCheckoutDataFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Operation;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PostAuthenticationOperationType;", "type", "", "mandatory", com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY, "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PostAuthenticationOperationType;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PostAuthenticationOperationType;", "component2", "()Ljava/lang/Boolean;", "component3", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PostAuthenticationOperationType;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Operation;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/PostAuthenticationOperationType;", "getType", "Ljava/lang/Boolean;", "getMandatory", "getBackground"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Operation {
        public static final int $stable = 0;
        private final java.lang.Boolean background;
        private final java.lang.Boolean mandatory;
        private final com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType type;

        public Operation(com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType postAuthenticationOperationType, java.lang.Boolean bool, java.lang.Boolean bool2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postAuthenticationOperationType, "");
            this.type = postAuthenticationOperationType;
            this.mandatory = bool;
            this.background = bool2;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType getType() {
            return this.type;
        }

        public final java.lang.Boolean getMandatory() {
            return this.mandatory;
        }

        public final java.lang.Boolean getBackground() {
            return this.background;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType postAuthenticationOperationType = this.type;
            java.lang.Boolean bool = this.mandatory;
            java.lang.Boolean bool2 = this.background;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Operation(type=");
            sb.append(postAuthenticationOperationType);
            sb.append(", mandatory=");
            sb.append(bool);
            sb.append(", background=");
            sb.append(bool2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode();
            java.lang.Boolean bool = this.mandatory;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.background;
            return (((hashCode * 31) + hashCode2) * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Operation)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Operation operation = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Operation) other;
            return this.type == operation.type && kotlin.jvm.internal.Intrinsics.areEqual(this.mandatory, operation.mandatory) && kotlin.jvm.internal.Intrinsics.areEqual(this.background, operation.background);
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Operation copy(com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType type, java.lang.Boolean mandatory, java.lang.Boolean background) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Operation(type, mandatory, background);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getBackground() {
            return this.background;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getMandatory() {
            return this.mandatory;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Operation copy$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Operation operation, com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType postAuthenticationOperationType, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                postAuthenticationOperationType = operation.type;
            }
            if ((i & 2) != 0) {
                bool = operation.mandatory;
            }
            if ((i & 4) != 0) {
                bool2 = operation.background;
            }
            return operation.copy(postAuthenticationOperationType, bool, bool2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationChallengeResult;", "", "", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Challenge;", "challenges", "", "correlationId", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Status;", "status", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Status;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Status;", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Status;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationChallengeResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getChallenges", "Ljava/lang/String;", "getCorrelationId", "getCorrelationId$annotations", "()V", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Status;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAuthenticationChallengeResult {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge> challenges;
        private final java.lang.String correlationId;
        private final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Status status;

        @kotlin.Deprecated(message = "Use the top-level GraphQL response `extensions.correlationId` instead.")
        public static /* synthetic */ void getCorrelationId$annotations() {
        }

        public OnAuthenticationChallengeResult(java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge> list, java.lang.String str, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Status status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challenges = list;
            this.correlationId = str;
            this.status = status;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge> getChallenges() {
            return this.challenges;
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Status getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge> list = this.challenges;
            java.lang.String str = this.correlationId;
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Status status = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAuthenticationChallengeResult(challenges=");
            sb.append(list);
            sb.append(", correlationId=");
            sb.append(str);
            sb.append(", status=");
            sb.append(status);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challenges.hashCode();
            java.lang.String str = this.correlationId;
            int hashCode2 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Status status = this.status;
            return (((hashCode * 31) + hashCode2) * 31) + (status != null ? status.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenges, onAuthenticationChallengeResult.challenges) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, onAuthenticationChallengeResult.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, onAuthenticationChallengeResult.status);
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult copy(java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge> challenges, java.lang.String correlationId, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Status status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenges, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult(challenges, correlationId, status);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Status getStatus() {
            return this.status;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge> component1() {
            return this.challenges;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult copy$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult, java.util.List list, java.lang.String str, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Status status, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onAuthenticationChallengeResult.challenges;
            }
            if ((i & 2) != 0) {
                str = onAuthenticationChallengeResult.correlationId;
            }
            if ((i & 4) != 0) {
                status = onAuthenticationChallengeResult.status;
            }
            return onAuthenticationChallengeResult.copy(list, str, status);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0092\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00107\u001a\u000206HÖ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bA\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bC\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bI\u0010)R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010J\u001a\u0004\bK\u0010+R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010L\u001a\u0004\bM\u0010-R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010N\u001a\u0004\bO\u0010/"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Challenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnGenericAuthenticationChallenge;", "onGenericAuthenticationChallenge", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnOneTimePasswordGenerateCodeAuthenticationChallenge;", "onOneTimePasswordGenerateCodeAuthenticationChallenge", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnTextOneTimePasscodeIdentityChallenge;", "onTextOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnEmailOneTimePasscodeIdentityChallenge;", "onEmailOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "onWhatsappOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "onPhoneOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticatorAppIdentityChallenge;", "onAuthenticatorAppIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnSecurityQuestionIdentityChallenge;", "onSecurityQuestionIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnCreditCardIdentityChallenge;", "onCreditCardIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnSilentAuthenticationIdentityChallenge;", "onSilentAuthenticationIdentityChallenge", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnGenericAuthenticationChallenge;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnOneTimePasswordGenerateCodeAuthenticationChallenge;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnTextOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnEmailOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnWhatsappOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnPhoneOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticatorAppIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnSecurityQuestionIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnCreditCardIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnSilentAuthenticationIdentityChallenge;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnGenericAuthenticationChallenge;", "component3", "()Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnOneTimePasswordGenerateCodeAuthenticationChallenge;", "component4", "()Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnTextOneTimePasscodeIdentityChallenge;", "component5", "()Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnEmailOneTimePasscodeIdentityChallenge;", "component6", "()Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "component7", "()Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "component8", "()Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticatorAppIdentityChallenge;", "component9", "()Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnSecurityQuestionIdentityChallenge;", "component10", "()Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnCreditCardIdentityChallenge;", "component11", "()Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnSilentAuthenticationIdentityChallenge;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnGenericAuthenticationChallenge;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnOneTimePasswordGenerateCodeAuthenticationChallenge;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnTextOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnEmailOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnWhatsappOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnPhoneOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticatorAppIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnSecurityQuestionIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnCreditCardIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnSilentAuthenticationIdentityChallenge;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Challenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnGenericAuthenticationChallenge;", "getOnGenericAuthenticationChallenge", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnOneTimePasswordGenerateCodeAuthenticationChallenge;", "getOnOneTimePasswordGenerateCodeAuthenticationChallenge", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnTextOneTimePasscodeIdentityChallenge;", "getOnTextOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnEmailOneTimePasscodeIdentityChallenge;", "getOnEmailOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "getOnWhatsappOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "getOnPhoneOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticatorAppIdentityChallenge;", "getOnAuthenticatorAppIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnSecurityQuestionIdentityChallenge;", "getOnSecurityQuestionIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnCreditCardIdentityChallenge;", "getOnCreditCardIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnSilentAuthenticationIdentityChallenge;", "getOnSilentAuthenticationIdentityChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Challenge {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnCreditCardIdentityChallenge onCreditCardIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnGenericAuthenticationChallenge onGenericAuthenticationChallenge;
        private final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge;
        private final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSilentAuthenticationIdentityChallenge onSilentAuthenticationIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge;

        public Challenge(java.lang.String str, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnGenericAuthenticationChallenge onGenericAuthenticationChallenge, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnCreditCardIdentityChallenge onCreditCardIdentityChallenge, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSilentAuthenticationIdentityChallenge onSilentAuthenticationIdentityChallenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onGenericAuthenticationChallenge = onGenericAuthenticationChallenge;
            this.onOneTimePasswordGenerateCodeAuthenticationChallenge = onOneTimePasswordGenerateCodeAuthenticationChallenge;
            this.onTextOneTimePasscodeIdentityChallenge = onTextOneTimePasscodeIdentityChallenge;
            this.onEmailOneTimePasscodeIdentityChallenge = onEmailOneTimePasscodeIdentityChallenge;
            this.onWhatsappOneTimePasscodeIdentityChallenge = onWhatsappOneTimePasscodeIdentityChallenge;
            this.onPhoneOneTimePasscodeIdentityChallenge = onPhoneOneTimePasscodeIdentityChallenge;
            this.onAuthenticatorAppIdentityChallenge = onAuthenticatorAppIdentityChallenge;
            this.onSecurityQuestionIdentityChallenge = onSecurityQuestionIdentityChallenge;
            this.onCreditCardIdentityChallenge = onCreditCardIdentityChallenge;
            this.onSilentAuthenticationIdentityChallenge = onSilentAuthenticationIdentityChallenge;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnGenericAuthenticationChallenge getOnGenericAuthenticationChallenge() {
            return this.onGenericAuthenticationChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnOneTimePasswordGenerateCodeAuthenticationChallenge getOnOneTimePasswordGenerateCodeAuthenticationChallenge() {
            return this.onOneTimePasswordGenerateCodeAuthenticationChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnTextOneTimePasscodeIdentityChallenge getOnTextOneTimePasscodeIdentityChallenge() {
            return this.onTextOneTimePasscodeIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnEmailOneTimePasscodeIdentityChallenge getOnEmailOneTimePasscodeIdentityChallenge() {
            return this.onEmailOneTimePasscodeIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnWhatsappOneTimePasscodeIdentityChallenge getOnWhatsappOneTimePasscodeIdentityChallenge() {
            return this.onWhatsappOneTimePasscodeIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnPhoneOneTimePasscodeIdentityChallenge getOnPhoneOneTimePasscodeIdentityChallenge() {
            return this.onPhoneOneTimePasscodeIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticatorAppIdentityChallenge getOnAuthenticatorAppIdentityChallenge() {
            return this.onAuthenticatorAppIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSecurityQuestionIdentityChallenge getOnSecurityQuestionIdentityChallenge() {
            return this.onSecurityQuestionIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnCreditCardIdentityChallenge getOnCreditCardIdentityChallenge() {
            return this.onCreditCardIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSilentAuthenticationIdentityChallenge getOnSilentAuthenticationIdentityChallenge() {
            return this.onSilentAuthenticationIdentityChallenge;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnGenericAuthenticationChallenge onGenericAuthenticationChallenge = this.onGenericAuthenticationChallenge;
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge = this.onOneTimePasswordGenerateCodeAuthenticationChallenge;
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge = this.onTextOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge = this.onEmailOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge = this.onWhatsappOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge = this.onPhoneOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge = this.onAuthenticatorAppIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge = this.onSecurityQuestionIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnCreditCardIdentityChallenge onCreditCardIdentityChallenge = this.onCreditCardIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSilentAuthenticationIdentityChallenge onSilentAuthenticationIdentityChallenge = this.onSilentAuthenticationIdentityChallenge;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Challenge(__typename=");
            sb.append(str);
            sb.append(", onGenericAuthenticationChallenge=");
            sb.append(onGenericAuthenticationChallenge);
            sb.append(", onOneTimePasswordGenerateCodeAuthenticationChallenge=");
            sb.append(onOneTimePasswordGenerateCodeAuthenticationChallenge);
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
            sb.append(", onCreditCardIdentityChallenge=");
            sb.append(onCreditCardIdentityChallenge);
            sb.append(", onSilentAuthenticationIdentityChallenge=");
            sb.append(onSilentAuthenticationIdentityChallenge);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnGenericAuthenticationChallenge onGenericAuthenticationChallenge = this.onGenericAuthenticationChallenge;
            int hashCode2 = onGenericAuthenticationChallenge == null ? 0 : onGenericAuthenticationChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge = this.onOneTimePasswordGenerateCodeAuthenticationChallenge;
            int hashCode3 = onOneTimePasswordGenerateCodeAuthenticationChallenge == null ? 0 : onOneTimePasswordGenerateCodeAuthenticationChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge = this.onTextOneTimePasscodeIdentityChallenge;
            int hashCode4 = onTextOneTimePasscodeIdentityChallenge == null ? 0 : onTextOneTimePasscodeIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge = this.onEmailOneTimePasscodeIdentityChallenge;
            int hashCode5 = onEmailOneTimePasscodeIdentityChallenge == null ? 0 : onEmailOneTimePasscodeIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge = this.onWhatsappOneTimePasscodeIdentityChallenge;
            int hashCode6 = onWhatsappOneTimePasscodeIdentityChallenge == null ? 0 : onWhatsappOneTimePasscodeIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge = this.onPhoneOneTimePasscodeIdentityChallenge;
            int hashCode7 = onPhoneOneTimePasscodeIdentityChallenge == null ? 0 : onPhoneOneTimePasscodeIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge = this.onAuthenticatorAppIdentityChallenge;
            int hashCode8 = onAuthenticatorAppIdentityChallenge == null ? 0 : onAuthenticatorAppIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge = this.onSecurityQuestionIdentityChallenge;
            int hashCode9 = onSecurityQuestionIdentityChallenge == null ? 0 : onSecurityQuestionIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnCreditCardIdentityChallenge onCreditCardIdentityChallenge = this.onCreditCardIdentityChallenge;
            int hashCode10 = onCreditCardIdentityChallenge == null ? 0 : onCreditCardIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSilentAuthenticationIdentityChallenge onSilentAuthenticationIdentityChallenge = this.onSilentAuthenticationIdentityChallenge;
            return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (onSilentAuthenticationIdentityChallenge != null ? onSilentAuthenticationIdentityChallenge.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge challenge = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, challenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onGenericAuthenticationChallenge, challenge.onGenericAuthenticationChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onOneTimePasswordGenerateCodeAuthenticationChallenge, challenge.onOneTimePasswordGenerateCodeAuthenticationChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onTextOneTimePasscodeIdentityChallenge, challenge.onTextOneTimePasscodeIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onEmailOneTimePasscodeIdentityChallenge, challenge.onEmailOneTimePasscodeIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onWhatsappOneTimePasscodeIdentityChallenge, challenge.onWhatsappOneTimePasscodeIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPhoneOneTimePasscodeIdentityChallenge, challenge.onPhoneOneTimePasscodeIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onAuthenticatorAppIdentityChallenge, challenge.onAuthenticatorAppIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onSecurityQuestionIdentityChallenge, challenge.onSecurityQuestionIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCreditCardIdentityChallenge, challenge.onCreditCardIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onSilentAuthenticationIdentityChallenge, challenge.onSilentAuthenticationIdentityChallenge);
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnGenericAuthenticationChallenge onGenericAuthenticationChallenge, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnCreditCardIdentityChallenge onCreditCardIdentityChallenge, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSilentAuthenticationIdentityChallenge onSilentAuthenticationIdentityChallenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge(__typename, onGenericAuthenticationChallenge, onOneTimePasswordGenerateCodeAuthenticationChallenge, onTextOneTimePasscodeIdentityChallenge, onEmailOneTimePasscodeIdentityChallenge, onWhatsappOneTimePasscodeIdentityChallenge, onPhoneOneTimePasscodeIdentityChallenge, onAuthenticatorAppIdentityChallenge, onSecurityQuestionIdentityChallenge, onCreditCardIdentityChallenge, onSilentAuthenticationIdentityChallenge);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSecurityQuestionIdentityChallenge getOnSecurityQuestionIdentityChallenge() {
            return this.onSecurityQuestionIdentityChallenge;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticatorAppIdentityChallenge getOnAuthenticatorAppIdentityChallenge() {
            return this.onAuthenticatorAppIdentityChallenge;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnPhoneOneTimePasscodeIdentityChallenge getOnPhoneOneTimePasscodeIdentityChallenge() {
            return this.onPhoneOneTimePasscodeIdentityChallenge;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnWhatsappOneTimePasscodeIdentityChallenge getOnWhatsappOneTimePasscodeIdentityChallenge() {
            return this.onWhatsappOneTimePasscodeIdentityChallenge;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnEmailOneTimePasscodeIdentityChallenge getOnEmailOneTimePasscodeIdentityChallenge() {
            return this.onEmailOneTimePasscodeIdentityChallenge;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnTextOneTimePasscodeIdentityChallenge getOnTextOneTimePasscodeIdentityChallenge() {
            return this.onTextOneTimePasscodeIdentityChallenge;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnOneTimePasswordGenerateCodeAuthenticationChallenge getOnOneTimePasswordGenerateCodeAuthenticationChallenge() {
            return this.onOneTimePasswordGenerateCodeAuthenticationChallenge;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnGenericAuthenticationChallenge getOnGenericAuthenticationChallenge() {
            return this.onGenericAuthenticationChallenge;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSilentAuthenticationIdentityChallenge getOnSilentAuthenticationIdentityChallenge() {
            return this.onSilentAuthenticationIdentityChallenge;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnCreditCardIdentityChallenge getOnCreditCardIdentityChallenge() {
            return this.onCreditCardIdentityChallenge;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnGenericAuthenticationChallenge;", "", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "challengeType", "", "contextId", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnGenericAuthenticationChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "getChallengeType", "Ljava/lang/String;", "getContextId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class OnGenericAuthenticationChallenge {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType challengeType;
        private final java.lang.String contextId;

        public OnGenericAuthenticationChallenge(com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationChallengeType, "");
            this.challengeType = authenticationChallengeType;
            this.contextId = str;
        }

        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType getChallengeType() {
            return this.challengeType;
        }

        public final java.lang.String getContextId() {
            return this.contextId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType = this.challengeType;
            java.lang.String str = this.contextId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnGenericAuthenticationChallenge(challengeType=");
            sb.append(authenticationChallengeType);
            sb.append(", contextId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challengeType.hashCode();
            java.lang.String str = this.contextId;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnGenericAuthenticationChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnGenericAuthenticationChallenge onGenericAuthenticationChallenge = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnGenericAuthenticationChallenge) other;
            return this.challengeType == onGenericAuthenticationChallenge.challengeType && kotlin.jvm.internal.Intrinsics.areEqual(this.contextId, onGenericAuthenticationChallenge.contextId);
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnGenericAuthenticationChallenge copy(com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType challengeType, java.lang.String contextId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeType, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnGenericAuthenticationChallenge(challengeType, contextId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getContextId() {
            return this.contextId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType getChallengeType() {
            return this.challengeType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnGenericAuthenticationChallenge copy$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnGenericAuthenticationChallenge onGenericAuthenticationChallenge, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                authenticationChallengeType = onGenericAuthenticationChallenge.challengeType;
            }
            if ((i & 2) != 0) {
                str = onGenericAuthenticationChallenge.contextId;
            }
            return onGenericAuthenticationChallenge.copy(authenticationChallengeType, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u000fR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnOneTimePasswordGenerateCodeAuthenticationChallenge;", "", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "challengeType", "", "contextId", "nonce", "", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Phone;", "phones", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnOneTimePasswordGenerateCodeAuthenticationChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "getChallengeType", "Ljava/lang/String;", "getContextId", "getNonce", "Ljava/util/List;", "getPhones"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class OnOneTimePasswordGenerateCodeAuthenticationChallenge {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType challengeType;
        private final java.lang.String contextId;
        private final java.lang.String nonce;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Phone> phones;

        public OnOneTimePasswordGenerateCodeAuthenticationChallenge(com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType, java.lang.String str, java.lang.String str2, java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Phone> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationChallengeType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challengeType = authenticationChallengeType;
            this.contextId = str;
            this.nonce = str2;
            this.phones = list;
        }

        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType getChallengeType() {
            return this.challengeType;
        }

        public final java.lang.String getContextId() {
            return this.contextId;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Phone> getPhones() {
            return this.phones;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType = this.challengeType;
            java.lang.String str = this.contextId;
            java.lang.String str2 = this.nonce;
            java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Phone> list = this.phones;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnOneTimePasswordGenerateCodeAuthenticationChallenge(challengeType=");
            sb.append(authenticationChallengeType);
            sb.append(", contextId=");
            sb.append(str);
            sb.append(", nonce=");
            sb.append(str2);
            sb.append(", phones=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challengeType.hashCode();
            java.lang.String str = this.contextId;
            return (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.nonce.hashCode()) * 31) + this.phones.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnOneTimePasswordGenerateCodeAuthenticationChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnOneTimePasswordGenerateCodeAuthenticationChallenge) other;
            return this.challengeType == onOneTimePasswordGenerateCodeAuthenticationChallenge.challengeType && kotlin.jvm.internal.Intrinsics.areEqual(this.contextId, onOneTimePasswordGenerateCodeAuthenticationChallenge.contextId) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, onOneTimePasswordGenerateCodeAuthenticationChallenge.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.phones, onOneTimePasswordGenerateCodeAuthenticationChallenge.phones);
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnOneTimePasswordGenerateCodeAuthenticationChallenge copy(com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType challengeType, java.lang.String contextId, java.lang.String nonce, java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Phone> phones) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phones, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnOneTimePasswordGenerateCodeAuthenticationChallenge(challengeType, contextId, nonce, phones);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Phone> component4() {
            return this.phones;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getContextId() {
            return this.contextId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType getChallengeType() {
            return this.challengeType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnOneTimePasswordGenerateCodeAuthenticationChallenge copy$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                authenticationChallengeType = onOneTimePasswordGenerateCodeAuthenticationChallenge.challengeType;
            }
            if ((i & 2) != 0) {
                str = onOneTimePasswordGenerateCodeAuthenticationChallenge.contextId;
            }
            if ((i & 4) != 0) {
                str2 = onOneTimePasswordGenerateCodeAuthenticationChallenge.nonce;
            }
            if ((i & 8) != 0) {
                list = onOneTimePasswordGenerateCodeAuthenticationChallenge.phones;
            }
            return onOneTimePasswordGenerateCodeAuthenticationChallenge.copy(authenticationChallengeType, str, str2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Phone;", "", "", "phoneChallengeId", "maskedPhoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Phone;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneChallengeId", "getMaskedPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Phone {
        public static final int $stable = 0;
        private final java.lang.String maskedPhoneNumber;
        private final java.lang.String phoneChallengeId;

        public Phone(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.phoneChallengeId = str;
            this.maskedPhoneNumber = str2;
        }

        public final java.lang.String getPhoneChallengeId() {
            return this.phoneChallengeId;
        }

        public final java.lang.String getMaskedPhoneNumber() {
            return this.maskedPhoneNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneChallengeId;
            java.lang.String str2 = this.maskedPhoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Phone(phoneChallengeId=");
            sb.append(str);
            sb.append(", maskedPhoneNumber=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.phoneChallengeId.hashCode() * 31) + this.maskedPhoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Phone)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Phone phone = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Phone) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.phoneChallengeId, phone.phoneChallengeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedPhoneNumber, phone.maskedPhoneNumber);
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Phone copy(java.lang.String phoneChallengeId, java.lang.String maskedPhoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneChallengeId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedPhoneNumber, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Phone(phoneChallengeId, maskedPhoneNumber);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMaskedPhoneNumber() {
            return this.maskedPhoneNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneChallengeId() {
            return this.phoneChallengeId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Phone copy$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Phone phone, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = phone.phoneChallengeId;
            }
            if ((i & 2) != 0) {
                str2 = phone.maskedPhoneNumber;
            }
            return phone.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnTextOneTimePasscodeIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;", "textOtpChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnTextOneTimePasscodeIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;", "getTextOtpChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
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
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnTextOneTimePasscodeIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnTextOneTimePasscodeIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onTextOneTimePasscodeIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.textOtpChallengeFragment, onTextOneTimePasscodeIdentityChallenge.textOtpChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnTextOneTimePasscodeIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment textOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textOtpChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnTextOneTimePasscodeIdentityChallenge(__typename, textOtpChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment getTextOtpChallengeFragment() {
            return this.textOtpChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnTextOneTimePasscodeIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment textOtpChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onTextOneTimePasscodeIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                textOtpChallengeFragment = onTextOneTimePasscodeIdentityChallenge.textOtpChallengeFragment;
            }
            return onTextOneTimePasscodeIdentityChallenge.copy(str, textOtpChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnEmailOneTimePasscodeIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;", "emailOtpChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnEmailOneTimePasscodeIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;", "getEmailOtpChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
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
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnEmailOneTimePasscodeIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnEmailOneTimePasscodeIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onEmailOneTimePasscodeIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailOtpChallengeFragment, onEmailOneTimePasscodeIdentityChallenge.emailOtpChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnEmailOneTimePasscodeIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment emailOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailOtpChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnEmailOneTimePasscodeIdentityChallenge(__typename, emailOtpChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment getEmailOtpChallengeFragment() {
            return this.emailOtpChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnEmailOneTimePasscodeIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment emailOtpChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onEmailOneTimePasscodeIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                emailOtpChallengeFragment = onEmailOneTimePasscodeIdentityChallenge.emailOtpChallengeFragment;
            }
            return onEmailOneTimePasscodeIdentityChallenge.copy(str, emailOtpChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;", "whatsappOtpChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;", "getWhatsappOtpChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
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
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnWhatsappOneTimePasscodeIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnWhatsappOneTimePasscodeIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onWhatsappOneTimePasscodeIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.whatsappOtpChallengeFragment, onWhatsappOneTimePasscodeIdentityChallenge.whatsappOtpChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnWhatsappOneTimePasscodeIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment whatsappOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(whatsappOtpChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnWhatsappOneTimePasscodeIdentityChallenge(__typename, whatsappOtpChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment getWhatsappOtpChallengeFragment() {
            return this.whatsappOtpChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnWhatsappOneTimePasscodeIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment whatsappOtpChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onWhatsappOneTimePasscodeIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                whatsappOtpChallengeFragment = onWhatsappOneTimePasscodeIdentityChallenge.whatsappOtpChallengeFragment;
            }
            return onWhatsappOneTimePasscodeIdentityChallenge.copy(str, whatsappOtpChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;", "phoneOtpChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;", "getPhoneOtpChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
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
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnPhoneOneTimePasscodeIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnPhoneOneTimePasscodeIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onPhoneOneTimePasscodeIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneOtpChallengeFragment, onPhoneOneTimePasscodeIdentityChallenge.phoneOtpChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnPhoneOneTimePasscodeIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment phoneOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneOtpChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnPhoneOneTimePasscodeIdentityChallenge(__typename, phoneOtpChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment getPhoneOtpChallengeFragment() {
            return this.phoneOtpChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnPhoneOneTimePasscodeIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment phoneOtpChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPhoneOneTimePasscodeIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                phoneOtpChallengeFragment = onPhoneOneTimePasscodeIdentityChallenge.phoneOtpChallengeFragment;
            }
            return onPhoneOneTimePasscodeIdentityChallenge.copy(str, phoneOtpChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticatorAppIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;", "authenticatorAppChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticatorAppIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;", "getAuthenticatorAppChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
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
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticatorAppIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticatorAppIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onAuthenticatorAppIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticatorAppChallengeFragment, onAuthenticatorAppIdentityChallenge.authenticatorAppChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticatorAppIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticatorAppChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticatorAppIdentityChallenge(__typename, authenticatorAppChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment getAuthenticatorAppChallengeFragment() {
            return this.authenticatorAppChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticatorAppIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onAuthenticatorAppIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                authenticatorAppChallengeFragment = onAuthenticatorAppIdentityChallenge.authenticatorAppChallengeFragment;
            }
            return onAuthenticatorAppIdentityChallenge.copy(str, authenticatorAppChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnSecurityQuestionIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/SecurityQuestionChallengeFragment;", "securityQuestionChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/SecurityQuestionChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/SecurityQuestionChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/SecurityQuestionChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnSecurityQuestionIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/SecurityQuestionChallengeFragment;", "getSecurityQuestionChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
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
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSecurityQuestionIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSecurityQuestionIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onSecurityQuestionIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.securityQuestionChallengeFragment, onSecurityQuestionIdentityChallenge.securityQuestionChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSecurityQuestionIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.SecurityQuestionChallengeFragment securityQuestionChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(securityQuestionChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSecurityQuestionIdentityChallenge(__typename, securityQuestionChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.SecurityQuestionChallengeFragment getSecurityQuestionChallengeFragment() {
            return this.securityQuestionChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSecurityQuestionIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.SecurityQuestionChallengeFragment securityQuestionChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onSecurityQuestionIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                securityQuestionChallengeFragment = onSecurityQuestionIdentityChallenge.securityQuestionChallengeFragment;
            }
            return onSecurityQuestionIdentityChallenge.copy(str, securityQuestionChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnCreditCardIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/CreditCardChallengeFragment;", "creditCardChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/CreditCardChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/CreditCardChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/CreditCardChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnCreditCardIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/CreditCardChallengeFragment;", "getCreditCardChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class OnCreditCardIdentityChallenge {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.fragment.CreditCardChallengeFragment creditCardChallengeFragment;

        public OnCreditCardIdentityChallenge(java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.CreditCardChallengeFragment creditCardChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCardChallengeFragment, "");
            this.__typename = str;
            this.creditCardChallengeFragment = creditCardChallengeFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.fragment.CreditCardChallengeFragment getCreditCardChallengeFragment() {
            return this.creditCardChallengeFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.fragment.CreditCardChallengeFragment creditCardChallengeFragment = this.creditCardChallengeFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCreditCardIdentityChallenge(__typename=");
            sb.append(str);
            sb.append(", creditCardChallengeFragment=");
            sb.append(creditCardChallengeFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.creditCardChallengeFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnCreditCardIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnCreditCardIdentityChallenge onCreditCardIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnCreditCardIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onCreditCardIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditCardChallengeFragment, onCreditCardIdentityChallenge.creditCardChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnCreditCardIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.CreditCardChallengeFragment creditCardChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCardChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnCreditCardIdentityChallenge(__typename, creditCardChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.CreditCardChallengeFragment getCreditCardChallengeFragment() {
            return this.creditCardChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnCreditCardIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnCreditCardIdentityChallenge onCreditCardIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.CreditCardChallengeFragment creditCardChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCreditCardIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                creditCardChallengeFragment = onCreditCardIdentityChallenge.creditCardChallengeFragment;
            }
            return onCreditCardIdentityChallenge.copy(str, creditCardChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnSilentAuthenticationIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/SilentAuthChallengeFragment;", "silentAuthChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/SilentAuthChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/SilentAuthChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/SilentAuthChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnSilentAuthenticationIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/SilentAuthChallengeFragment;", "getSilentAuthChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class OnSilentAuthenticationIdentityChallenge {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.fragment.SilentAuthChallengeFragment silentAuthChallengeFragment;

        public OnSilentAuthenticationIdentityChallenge(java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.SilentAuthChallengeFragment silentAuthChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(silentAuthChallengeFragment, "");
            this.__typename = str;
            this.silentAuthChallengeFragment = silentAuthChallengeFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.fragment.SilentAuthChallengeFragment getSilentAuthChallengeFragment() {
            return this.silentAuthChallengeFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.fragment.SilentAuthChallengeFragment silentAuthChallengeFragment = this.silentAuthChallengeFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSilentAuthenticationIdentityChallenge(__typename=");
            sb.append(str);
            sb.append(", silentAuthChallengeFragment=");
            sb.append(silentAuthChallengeFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.silentAuthChallengeFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSilentAuthenticationIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSilentAuthenticationIdentityChallenge onSilentAuthenticationIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSilentAuthenticationIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onSilentAuthenticationIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.silentAuthChallengeFragment, onSilentAuthenticationIdentityChallenge.silentAuthChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSilentAuthenticationIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.SilentAuthChallengeFragment silentAuthChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(silentAuthChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSilentAuthenticationIdentityChallenge(__typename, silentAuthChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.SilentAuthChallengeFragment getSilentAuthChallengeFragment() {
            return this.silentAuthChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSilentAuthenticationIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnSilentAuthenticationIdentityChallenge onSilentAuthenticationIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.SilentAuthChallengeFragment silentAuthChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onSilentAuthenticationIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                silentAuthChallengeFragment = onSilentAuthenticationIdentityChallenge.silentAuthChallengeFragment;
            }
            return onSilentAuthenticationIdentityChallenge.copy(str, silentAuthChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Status;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnNotifyStepUpIdentityChallengeResult;", "onNotifyStepUpIdentityChallengeResult", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnValidateStepUpIdentityChallengeResult;", "onValidateStepUpIdentityChallengeResult", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnNotifyStepUpIdentityChallengeResult;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnValidateStepUpIdentityChallengeResult;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnNotifyStepUpIdentityChallengeResult;", "component3", "()Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnValidateStepUpIdentityChallengeResult;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnNotifyStepUpIdentityChallengeResult;Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnValidateStepUpIdentityChallengeResult;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Status;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnNotifyStepUpIdentityChallengeResult;", "getOnNotifyStepUpIdentityChallengeResult", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnValidateStepUpIdentityChallengeResult;", "getOnValidateStepUpIdentityChallengeResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Status {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnNotifyStepUpIdentityChallengeResult onNotifyStepUpIdentityChallengeResult;
        private final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnValidateStepUpIdentityChallengeResult onValidateStepUpIdentityChallengeResult;

        public Status(java.lang.String str, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnNotifyStepUpIdentityChallengeResult onNotifyStepUpIdentityChallengeResult, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnValidateStepUpIdentityChallengeResult onValidateStepUpIdentityChallengeResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onNotifyStepUpIdentityChallengeResult = onNotifyStepUpIdentityChallengeResult;
            this.onValidateStepUpIdentityChallengeResult = onValidateStepUpIdentityChallengeResult;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnNotifyStepUpIdentityChallengeResult getOnNotifyStepUpIdentityChallengeResult() {
            return this.onNotifyStepUpIdentityChallengeResult;
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnValidateStepUpIdentityChallengeResult getOnValidateStepUpIdentityChallengeResult() {
            return this.onValidateStepUpIdentityChallengeResult;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnNotifyStepUpIdentityChallengeResult onNotifyStepUpIdentityChallengeResult = this.onNotifyStepUpIdentityChallengeResult;
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnValidateStepUpIdentityChallengeResult onValidateStepUpIdentityChallengeResult = this.onValidateStepUpIdentityChallengeResult;
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
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnNotifyStepUpIdentityChallengeResult onNotifyStepUpIdentityChallengeResult = this.onNotifyStepUpIdentityChallengeResult;
            int hashCode2 = onNotifyStepUpIdentityChallengeResult == null ? 0 : onNotifyStepUpIdentityChallengeResult.hashCode();
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnValidateStepUpIdentityChallengeResult onValidateStepUpIdentityChallengeResult = this.onValidateStepUpIdentityChallengeResult;
            return (((hashCode * 31) + hashCode2) * 31) + (onValidateStepUpIdentityChallengeResult != null ? onValidateStepUpIdentityChallengeResult.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Status)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Status status = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Status) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, status.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onNotifyStepUpIdentityChallengeResult, status.onNotifyStepUpIdentityChallengeResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.onValidateStepUpIdentityChallengeResult, status.onValidateStepUpIdentityChallengeResult);
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Status copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnNotifyStepUpIdentityChallengeResult onNotifyStepUpIdentityChallengeResult, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnValidateStepUpIdentityChallengeResult onValidateStepUpIdentityChallengeResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Status(__typename, onNotifyStepUpIdentityChallengeResult, onValidateStepUpIdentityChallengeResult);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnValidateStepUpIdentityChallengeResult getOnValidateStepUpIdentityChallengeResult() {
            return this.onValidateStepUpIdentityChallengeResult;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnNotifyStepUpIdentityChallengeResult getOnNotifyStepUpIdentityChallengeResult() {
            return this.onNotifyStepUpIdentityChallengeResult;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Status copy$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Status status, java.lang.String str, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnNotifyStepUpIdentityChallengeResult onNotifyStepUpIdentityChallengeResult, com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnValidateStepUpIdentityChallengeResult onValidateStepUpIdentityChallengeResult, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JR\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b)\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0017R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnNotifyStepUpIdentityChallengeResult;", "", "Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;", "notifyChallengeResultStatus", "", "challengeId", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "deliveryMethod", "deliveryTarget", "", "canRetry", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;", "stepUpStatus", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;Ljava/lang/String;ZLcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "component4", "component5", "()Z", "component6", "()Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;Ljava/lang/String;ZLcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnNotifyStepUpIdentityChallengeResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;", "getNotifyChallengeResultStatus", "Ljava/lang/String;", "getChallengeId", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "getDeliveryMethod", "getDeliveryTarget", "Z", "getCanRetry", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;", "getStepUpStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
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
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnNotifyStepUpIdentityChallengeResult)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnNotifyStepUpIdentityChallengeResult onNotifyStepUpIdentityChallengeResult = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnNotifyStepUpIdentityChallengeResult) other;
            return this.notifyChallengeResultStatus == onNotifyStepUpIdentityChallengeResult.notifyChallengeResultStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeId, onNotifyStepUpIdentityChallengeResult.challengeId) && this.deliveryMethod == onNotifyStepUpIdentityChallengeResult.deliveryMethod && kotlin.jvm.internal.Intrinsics.areEqual(this.deliveryTarget, onNotifyStepUpIdentityChallengeResult.deliveryTarget) && this.canRetry == onNotifyStepUpIdentityChallengeResult.canRetry && this.stepUpStatus == onNotifyStepUpIdentityChallengeResult.stepUpStatus;
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnNotifyStepUpIdentityChallengeResult copy(com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyChallengeResultStatus, java.lang.String challengeId, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod deliveryMethod, java.lang.String deliveryTarget, boolean canRetry, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifyChallengeResultStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpStatus, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnNotifyStepUpIdentityChallengeResult(notifyChallengeResultStatus, challengeId, deliveryMethod, deliveryTarget, canRetry, stepUpStatus);
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

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnNotifyStepUpIdentityChallengeResult copy$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnNotifyStepUpIdentityChallengeResult onNotifyStepUpIdentityChallengeResult, com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyStepUpIdentityChallengeResultStatus, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod, java.lang.String str2, boolean z, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpIdentityChallengeStatus, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnValidateStepUpIdentityChallengeResult;", "", "Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;", "validationChallengeResultStatus", "", "canRetry", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;", "stepUpStatus", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;ZLcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;ZLcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;)Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnValidateStepUpIdentityChallengeResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;", "getValidationChallengeResultStatus", "Z", "getCanRetry", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;", "getStepUpStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
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
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnValidateStepUpIdentityChallengeResult)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnValidateStepUpIdentityChallengeResult onValidateStepUpIdentityChallengeResult = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnValidateStepUpIdentityChallengeResult) other;
            return this.validationChallengeResultStatus == onValidateStepUpIdentityChallengeResult.validationChallengeResultStatus && this.canRetry == onValidateStepUpIdentityChallengeResult.canRetry && this.stepUpStatus == onValidateStepUpIdentityChallengeResult.stepUpStatus;
        }

        public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnValidateStepUpIdentityChallengeResult copy(com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validationChallengeResultStatus, boolean canRetry, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpStatus, "");
            return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnValidateStepUpIdentityChallengeResult(validationChallengeResultStatus, canRetry, stepUpStatus);
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

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnValidateStepUpIdentityChallengeResult copy$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnValidateStepUpIdentityChallengeResult onValidateStepUpIdentityChallengeResult, com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus, boolean z, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpIdentityChallengeStatus, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation LoginUser($authInput: AuthenticateInput!) { authenticate(input: $authInput) { __typename ... on AuthenticationTokenResult { token expiresInSec expiresAtTime correlationId authorizationCode checkoutData { __typename ...IdentityCheckoutDataFragment } operations { type mandatory background } payerId } ... on AuthenticationChallengeResult { challenges { __typename ... on GenericAuthenticationChallenge { challengeType contextId } ... on OneTimePasswordGenerateCodeAuthenticationChallenge { challengeType contextId nonce phones { phoneChallengeId maskedPhoneNumber } } ... on TextOneTimePasscodeIdentityChallenge { __typename ...TextOtpChallengeFragment } ... on EmailOneTimePasscodeIdentityChallenge { __typename ...EmailOtpChallengeFragment } ... on WhatsappOneTimePasscodeIdentityChallenge { __typename ...WhatsappOtpChallengeFragment } ... on PhoneOneTimePasscodeIdentityChallenge { __typename ...PhoneOtpChallengeFragment } ... on AuthenticatorAppIdentityChallenge { __typename ...AuthenticatorAppChallengeFragment } ... on SecurityQuestionIdentityChallenge { __typename ...SecurityQuestionChallengeFragment } ... on CreditCardIdentityChallenge { __typename ...CreditCardChallengeFragment } ... on SilentAuthenticationIdentityChallenge { __typename ...SilentAuthChallengeFragment } } correlationId status { __typename ... on NotifyStepUpIdentityChallengeResult { notifyChallengeResultStatus challengeId deliveryMethod deliveryTarget canRetry stepUpStatus } ... on ValidateStepUpIdentityChallengeResult { validationChallengeResultStatus canRetry stepUpStatus } } } } }  fragment IdentityCheckoutDataFragment on CheckoutData { checkoutPreferences { cancelUrl returnUrl checkoutApprovalUrl bridgeUrl appSwitchPreferences { returnFlow appSwitchApiIntegrationChannel browserName isWebView fallbackUrlScheme } } nativeCheckOutData }  fragment TextOtpChallengeFragment on TextOneTimePasscodeIdentityChallenge { id phoneNumbers { challengeId maskedNumber notified } challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }  fragment EmailOtpChallengeFragment on EmailOneTimePasscodeIdentityChallenge { id emailAddresses { challengeId maskedEmail notified } challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }  fragment WhatsappOtpChallengeFragment on WhatsappOneTimePasscodeIdentityChallenge { id phoneNumbers { challengeId maskedNumber notified } challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }  fragment PhoneOtpChallengeFragment on PhoneOneTimePasscodeIdentityChallenge { id phoneNumbers { challengeId maskedNumber notified } challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }  fragment AuthenticatorAppChallengeFragment on AuthenticatorAppIdentityChallenge { id challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }  fragment SecurityQuestionChallengeFragment on SecurityQuestionIdentityChallenge { id securityQuestions { challengeId question } challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }  fragment CreditCardChallengeFragment on CreditCardIdentityChallenge { id creditCards { challengeId cardLast4Char cardType } challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }  fragment SilentAuthChallengeFragment on SilentAuthenticationIdentityChallenge { id challengeMethod phoneNumbers { challengeId maskedNumber notified evaluateURL } stepUpNonce: nonce stepUpPartialToken: partialToken }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.AuthenticateInput authenticateInput = this.authInput;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LoginUserMutation(authInput=");
        sb.append(authenticateInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.authInput.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.identity.graphql.LoginUserMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.authInput, ((com.paypal.oslo.feature.identity.graphql.LoginUserMutation) other).authInput);
    }

    public final com.paypal.oslo.feature.identity.graphql.LoginUserMutation copy(com.paypal.oslo.api.graphql.schema.type.AuthenticateInput authInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authInput, "");
        return new com.paypal.oslo.feature.identity.graphql.LoginUserMutation(authInput);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AuthenticateInput getAuthInput() {
        return this.authInput;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.LoginUserMutation copy$default(com.paypal.oslo.feature.identity.graphql.LoginUserMutation loginUserMutation, com.paypal.oslo.api.graphql.schema.type.AuthenticateInput authenticateInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            authenticateInput = loginUserMutation.authInput;
        }
        return loginUserMutation.copy(authenticateInput);
    }
}
