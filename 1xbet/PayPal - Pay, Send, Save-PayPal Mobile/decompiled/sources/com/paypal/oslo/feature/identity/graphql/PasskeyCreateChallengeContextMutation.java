package com.paypal.oslo.feature.identity.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007*+,-./)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CreatePasskeyRegistrationOptionInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CreatePasskeyRegistrationOptionInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CreatePasskeyRegistrationOptionInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CreatePasskeyRegistrationOptionInput;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CreatePasskeyRegistrationOptionInput;", "getInput", "Companion", "Data", "CreatePasskeyRegistrationOption", "RelyingParty", "PublicKeyCredentialParam", "User", "ExcludeCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PasskeyCreateChallengeContextMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.Data> {
    public static final java.lang.String OPERATION_ID = "72a8581cbd1f99f52f35e50005a16da16d2d7e61b19b0f9d3d08f64b67b20da0";
    public static final java.lang.String OPERATION_NAME = "PasskeyCreateChallengeContext";
    private final com.paypal.oslo.api.graphql.schema.type.CreatePasskeyRegistrationOptionInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.Companion INSTANCE = new com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.Companion(null);
    public static final int $stable = 8;

    public PasskeyCreateChallengeContextMutation(com.paypal.oslo.api.graphql.schema.type.CreatePasskeyRegistrationOptionInput createPasskeyRegistrationOptionInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createPasskeyRegistrationOptionInput, "");
        this.input = createPasskeyRegistrationOptionInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreatePasskeyRegistrationOptionInput getInput() {
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
        com.paypal.oslo.feature.identity.graphql.adapter.PasskeyCreateChallengeContextMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.PasskeyCreateChallengeContextMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.identity.graphql.selections.PasskeyCreateChallengeContextMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$CreatePasskeyRegistrationOption;", "createPasskeyRegistrationOption", "<init>", "(Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$CreatePasskeyRegistrationOption;)V", "component1", "()Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$CreatePasskeyRegistrationOption;", "copy", "(Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$CreatePasskeyRegistrationOption;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$CreatePasskeyRegistrationOption;", "getCreatePasskeyRegistrationOption"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.CreatePasskeyRegistrationOption createPasskeyRegistrationOption;

        public Data(com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.CreatePasskeyRegistrationOption createPasskeyRegistrationOption) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createPasskeyRegistrationOption, "");
            this.createPasskeyRegistrationOption = createPasskeyRegistrationOption;
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.CreatePasskeyRegistrationOption getCreatePasskeyRegistrationOption() {
            return this.createPasskeyRegistrationOption;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.CreatePasskeyRegistrationOption createPasskeyRegistrationOption = this.createPasskeyRegistrationOption;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(createPasskeyRegistrationOption=");
            sb.append(createPasskeyRegistrationOption);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.createPasskeyRegistrationOption.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.createPasskeyRegistrationOption, ((com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.Data) other).createPasskeyRegistrationOption);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.Data copy(com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.CreatePasskeyRegistrationOption createPasskeyRegistrationOption) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createPasskeyRegistrationOption, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.Data(createPasskeyRegistrationOption);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.CreatePasskeyRegistrationOption getCreatePasskeyRegistrationOption() {
            return this.createPasskeyRegistrationOption;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.Data copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.Data data, com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.CreatePasskeyRegistrationOption createPasskeyRegistrationOption, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                createPasskeyRegistrationOption = data.createPasskeyRegistrationOption;
            }
            return data.copy(createPasskeyRegistrationOption);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJZ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0018R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b.\u0010\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$CreatePasskeyRegistrationOption;", "", "", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$RelyingParty;", "relyingParty", "", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$PublicKeyCredentialParam;", "publicKeyCredentialParams", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$User;", "user", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$ExcludeCredential;", "excludeCredentials", "Lcom/paypal/oslo/api/graphql/schema/type/PasskeyUserVerification;", "userVerification", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$RelyingParty;Ljava/util/List;Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$User;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/PasskeyUserVerification;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$RelyingParty;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$User;", "component5", "component6", "()Lcom/paypal/oslo/api/graphql/schema/type/PasskeyUserVerification;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$RelyingParty;Ljava/util/List;Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$User;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/PasskeyUserVerification;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$CreatePasskeyRegistrationOption;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getChallenge", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$RelyingParty;", "getRelyingParty", "Ljava/util/List;", "getPublicKeyCredentialParams", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$User;", "getUser", "getExcludeCredentials", "Lcom/paypal/oslo/api/graphql/schema/type/PasskeyUserVerification;", "getUserVerification"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreatePasskeyRegistrationOption {
        public static final int $stable = 8;
        private final java.lang.String challenge;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.ExcludeCredential> excludeCredentials;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.PublicKeyCredentialParam> publicKeyCredentialParams;
        private final com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.RelyingParty relyingParty;
        private final com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.User user;
        private final com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification userVerification;

        public CreatePasskeyRegistrationOption(java.lang.String str, com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.RelyingParty relyingParty, java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.PublicKeyCredentialParam> list, com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.User user, java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.ExcludeCredential> list2, com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification passkeyUserVerification) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relyingParty, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.challenge = str;
            this.relyingParty = relyingParty;
            this.publicKeyCredentialParams = list;
            this.user = user;
            this.excludeCredentials = list2;
            this.userVerification = passkeyUserVerification;
        }

        public final java.lang.String getChallenge() {
            return this.challenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.RelyingParty getRelyingParty() {
            return this.relyingParty;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.PublicKeyCredentialParam> getPublicKeyCredentialParams() {
            return this.publicKeyCredentialParams;
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.User getUser() {
            return this.user;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.ExcludeCredential> getExcludeCredentials() {
            return this.excludeCredentials;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification getUserVerification() {
            return this.userVerification;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.challenge;
            com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.RelyingParty relyingParty = this.relyingParty;
            java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.PublicKeyCredentialParam> list = this.publicKeyCredentialParams;
            com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.User user = this.user;
            java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.ExcludeCredential> list2 = this.excludeCredentials;
            com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification passkeyUserVerification = this.userVerification;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreatePasskeyRegistrationOption(challenge=");
            sb.append(str);
            sb.append(", relyingParty=");
            sb.append(relyingParty);
            sb.append(", publicKeyCredentialParams=");
            sb.append(list);
            sb.append(", user=");
            sb.append(user);
            sb.append(", excludeCredentials=");
            sb.append(list2);
            sb.append(", userVerification=");
            sb.append(passkeyUserVerification);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.challenge.hashCode();
            int hashCode2 = this.relyingParty.hashCode();
            int hashCode3 = this.publicKeyCredentialParams.hashCode();
            int hashCode4 = this.user.hashCode();
            int hashCode5 = this.excludeCredentials.hashCode();
            com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification passkeyUserVerification = this.userVerification;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (passkeyUserVerification == null ? 0 : passkeyUserVerification.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.CreatePasskeyRegistrationOption)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.CreatePasskeyRegistrationOption createPasskeyRegistrationOption = (com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.CreatePasskeyRegistrationOption) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, createPasskeyRegistrationOption.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.relyingParty, createPasskeyRegistrationOption.relyingParty) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicKeyCredentialParams, createPasskeyRegistrationOption.publicKeyCredentialParams) && kotlin.jvm.internal.Intrinsics.areEqual(this.user, createPasskeyRegistrationOption.user) && kotlin.jvm.internal.Intrinsics.areEqual(this.excludeCredentials, createPasskeyRegistrationOption.excludeCredentials) && this.userVerification == createPasskeyRegistrationOption.userVerification;
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.CreatePasskeyRegistrationOption copy(java.lang.String challenge, com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.RelyingParty relyingParty, java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.PublicKeyCredentialParam> publicKeyCredentialParams, com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.User user, java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.ExcludeCredential> excludeCredentials, com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification userVerification) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relyingParty, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicKeyCredentialParams, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(excludeCredentials, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.CreatePasskeyRegistrationOption(challenge, relyingParty, publicKeyCredentialParams, user, excludeCredentials, userVerification);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification getUserVerification() {
            return this.userVerification;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.ExcludeCredential> component5() {
            return this.excludeCredentials;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.User getUser() {
            return this.user;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.PublicKeyCredentialParam> component3() {
            return this.publicKeyCredentialParams;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.RelyingParty getRelyingParty() {
            return this.relyingParty;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getChallenge() {
            return this.challenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.CreatePasskeyRegistrationOption copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.CreatePasskeyRegistrationOption createPasskeyRegistrationOption, java.lang.String str, com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.RelyingParty relyingParty, java.util.List list, com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.User user, java.util.List list2, com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification passkeyUserVerification, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = createPasskeyRegistrationOption.challenge;
            }
            if ((i & 2) != 0) {
                relyingParty = createPasskeyRegistrationOption.relyingParty;
            }
            com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.RelyingParty relyingParty2 = relyingParty;
            if ((i & 4) != 0) {
                list = createPasskeyRegistrationOption.publicKeyCredentialParams;
            }
            java.util.List list3 = list;
            if ((i & 8) != 0) {
                user = createPasskeyRegistrationOption.user;
            }
            com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.User user2 = user;
            if ((i & 16) != 0) {
                list2 = createPasskeyRegistrationOption.excludeCredentials;
            }
            java.util.List list4 = list2;
            if ((i & 32) != 0) {
                passkeyUserVerification = createPasskeyRegistrationOption.userVerification;
            }
            return createPasskeyRegistrationOption.copy(str, relyingParty2, list3, user2, list4, passkeyUserVerification);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$RelyingParty;", "", "", "id", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$RelyingParty;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RelyingParty {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final java.lang.String name;

        public RelyingParty(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.name = str2;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RelyingParty(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.name;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.RelyingParty)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.RelyingParty relyingParty = (com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.RelyingParty) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, relyingParty.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, relyingParty.name);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.RelyingParty copy(java.lang.String id, java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.RelyingParty(id, name2);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.RelyingParty copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.RelyingParty relyingParty, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = relyingParty.id;
            }
            if ((i & 2) != 0) {
                str2 = relyingParty.name;
            }
            return relyingParty.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$PublicKeyCredentialParam;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PasskeyAuthenticationType;", "type", "", "algorithm", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PasskeyAuthenticationType;I)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PasskeyAuthenticationType;", "component2", "()I", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PasskeyAuthenticationType;I)Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$PublicKeyCredentialParam;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/PasskeyAuthenticationType;", "getType", com.visa.cbp.getEncExpo.warmup, "getAlgorithm"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PublicKeyCredentialParam {
        public static final int $stable = 0;
        private final int algorithm;
        private final com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType type;

        public PublicKeyCredentialParam(com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType passkeyAuthenticationType, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyAuthenticationType, "");
            this.type = passkeyAuthenticationType;
            this.algorithm = i;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType getType() {
            return this.type;
        }

        public final int getAlgorithm() {
            return this.algorithm;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType passkeyAuthenticationType = this.type;
            int i = this.algorithm;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PublicKeyCredentialParam(type=");
            sb.append(passkeyAuthenticationType);
            sb.append(", algorithm=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.type.hashCode() * 31) + java.lang.Integer.hashCode(this.algorithm);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.PublicKeyCredentialParam)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.PublicKeyCredentialParam publicKeyCredentialParam = (com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.PublicKeyCredentialParam) other;
            return this.type == publicKeyCredentialParam.type && this.algorithm == publicKeyCredentialParam.algorithm;
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.PublicKeyCredentialParam copy(com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType type, int algorithm) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.PublicKeyCredentialParam(type, algorithm);
        }

        /* renamed from: component2, reason: from getter */
        public final int getAlgorithm() {
            return this.algorithm;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.PublicKeyCredentialParam copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.PublicKeyCredentialParam publicKeyCredentialParam, com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType passkeyAuthenticationType, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                passkeyAuthenticationType = publicKeyCredentialParam.type;
            }
            if ((i2 & 2) != 0) {
                i = publicKeyCredentialParam.algorithm;
            }
            return publicKeyCredentialParam.copy(passkeyAuthenticationType, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$User;", "", "", "id", "displayName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$User;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getDisplayName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class User {
        public static final int $stable = 0;
        private final java.lang.String displayName;
        private final java.lang.String id;

        public User(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.displayName = str2;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.displayName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("User(id=");
            sb.append(str);
            sb.append(", displayName=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.displayName;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.User)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.User user = (com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.User) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, user.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, user.displayName);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.User copy(java.lang.String id, java.lang.String displayName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.User(id, displayName);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.User copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.User user, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = user.id;
            }
            if ((i & 2) != 0) {
                str2 = user.displayName;
            }
            return user.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$ExcludeCredential;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/PasskeyAuthenticationType;", "type", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PasskeyAuthenticationType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/PasskeyAuthenticationType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PasskeyAuthenticationType;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$ExcludeCredential;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/PasskeyAuthenticationType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExcludeCredential {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType type;

        public ExcludeCredential(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType passkeyAuthenticationType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyAuthenticationType, "");
            this.id = str;
            this.type = passkeyAuthenticationType;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType passkeyAuthenticationType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ExcludeCredential(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(passkeyAuthenticationType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.ExcludeCredential)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.ExcludeCredential excludeCredential = (com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.ExcludeCredential) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, excludeCredential.id) && this.type == excludeCredential.type;
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.ExcludeCredential copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.ExcludeCredential(id, type);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.ExcludeCredential copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation.ExcludeCredential excludeCredential, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType passkeyAuthenticationType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = excludeCredential.id;
            }
            if ((i & 2) != 0) {
                passkeyAuthenticationType = excludeCredential.type;
            }
            return excludeCredential.copy(str, passkeyAuthenticationType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateChallengeContextMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation PasskeyCreateChallengeContext($input: CreatePasskeyRegistrationOptionInput!) { createPasskeyRegistrationOption(input: $input) { challenge relyingParty { id name } publicKeyCredentialParams { type algorithm } user { id displayName } excludeCredentials { id type } userVerification } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CreatePasskeyRegistrationOptionInput createPasskeyRegistrationOptionInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyCreateChallengeContextMutation(input=");
        sb.append(createPasskeyRegistrationOptionInput);
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
        return (other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation) other).input);
    }

    public final com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation copy(com.paypal.oslo.api.graphql.schema.type.CreatePasskeyRegistrationOptionInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CreatePasskeyRegistrationOptionInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation passkeyCreateChallengeContextMutation, com.paypal.oslo.api.graphql.schema.type.CreatePasskeyRegistrationOptionInput createPasskeyRegistrationOptionInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            createPasskeyRegistrationOptionInput = passkeyCreateChallengeContextMutation.input;
        }
        return passkeyCreateChallengeContextMutation.copy(createPasskeyRegistrationOptionInput);
    }
}
