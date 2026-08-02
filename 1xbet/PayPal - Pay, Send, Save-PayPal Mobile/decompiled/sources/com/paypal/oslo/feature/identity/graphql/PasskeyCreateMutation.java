package com.paypal.oslo.feature.identity.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CreatePasskeyInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CreatePasskeyInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CreatePasskeyInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CreatePasskeyInput;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CreatePasskeyInput;", "getInput", "Companion", "Data", "CreatePasskey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PasskeyCreateMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.Data> {
    public static final java.lang.String OPERATION_ID = "2725a132c6365e4bc73d1ba9938f69863973d6c63de21194dc6a0d79f05efc53";
    public static final java.lang.String OPERATION_NAME = "PasskeyCreate";
    private final com.paypal.oslo.api.graphql.schema.type.CreatePasskeyInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.Companion INSTANCE = new com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.Companion(null);
    public static final int $stable = 8;

    public PasskeyCreateMutation(com.paypal.oslo.api.graphql.schema.type.CreatePasskeyInput createPasskeyInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createPasskeyInput, "");
        this.input = createPasskeyInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreatePasskeyInput getInput() {
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
        com.paypal.oslo.feature.identity.graphql.adapter.PasskeyCreateMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.PasskeyCreateMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.identity.graphql.selections.PasskeyCreateMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateMutation$CreatePasskey;", "createPasskey", "<init>", "(Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateMutation$CreatePasskey;)V", "component1", "()Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateMutation$CreatePasskey;", "copy", "(Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateMutation$CreatePasskey;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateMutation$CreatePasskey;", "getCreatePasskey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.CreatePasskey createPasskey;

        public Data(com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.CreatePasskey createPasskey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createPasskey, "");
            this.createPasskey = createPasskey;
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.CreatePasskey getCreatePasskey() {
            return this.createPasskey;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.CreatePasskey createPasskey = this.createPasskey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(createPasskey=");
            sb.append(createPasskey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.createPasskey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.createPasskey, ((com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.Data) other).createPasskey);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.Data copy(com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.CreatePasskey createPasskey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createPasskey, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.Data(createPasskey);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.CreatePasskey getCreatePasskey() {
            return this.createPasskey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.Data copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.Data data, com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.CreatePasskey createPasskey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                createPasskey = data.createPasskey;
            }
            return data.copy(createPasskey);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateMutation$CreatePasskey;", "", "", "credentialId", "rawCredentialId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateMutation$CreatePasskey;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCredentialId", "getRawCredentialId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreatePasskey {
        public static final int $stable = 0;
        private final java.lang.String credentialId;
        private final java.lang.String rawCredentialId;

        public CreatePasskey(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.credentialId = str;
            this.rawCredentialId = str2;
        }

        public final java.lang.String getCredentialId() {
            return this.credentialId;
        }

        public final java.lang.String getRawCredentialId() {
            return this.rawCredentialId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.credentialId;
            java.lang.String str2 = this.rawCredentialId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreatePasskey(credentialId=");
            sb.append(str);
            sb.append(", rawCredentialId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.credentialId.hashCode();
            java.lang.String str = this.rawCredentialId;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.CreatePasskey)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.CreatePasskey createPasskey = (com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.CreatePasskey) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.credentialId, createPasskey.credentialId) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawCredentialId, createPasskey.rawCredentialId);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.CreatePasskey copy(java.lang.String credentialId, java.lang.String rawCredentialId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentialId, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.CreatePasskey(credentialId, rawCredentialId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRawCredentialId() {
            return this.rawCredentialId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCredentialId() {
            return this.credentialId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.CreatePasskey copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.CreatePasskey createPasskey, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = createPasskey.credentialId;
            }
            if ((i & 2) != 0) {
                str2 = createPasskey.rawCredentialId;
            }
            return createPasskey.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation PasskeyCreate($input: CreatePasskeyInput!) { createPasskey(input: $input) { credentialId rawCredentialId } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CreatePasskeyInput createPasskeyInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyCreateMutation(input=");
        sb.append(createPasskeyInput);
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
        return (other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation) other).input);
    }

    public final com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation copy(com.paypal.oslo.api.graphql.schema.type.CreatePasskeyInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CreatePasskeyInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation passkeyCreateMutation, com.paypal.oslo.api.graphql.schema.type.CreatePasskeyInput createPasskeyInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            createPasskeyInput = passkeyCreateMutation.input;
        }
        return passkeyCreateMutation.copy(createPasskeyInput);
    }
}
