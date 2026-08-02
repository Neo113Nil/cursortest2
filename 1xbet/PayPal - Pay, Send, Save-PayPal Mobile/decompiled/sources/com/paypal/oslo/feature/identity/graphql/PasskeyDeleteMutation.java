package com.paypal.oslo.feature.identity.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyDeleteMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyDeleteMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/DeletePasskeyInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DeletePasskeyInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DeletePasskeyInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DeletePasskeyInput;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyDeleteMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DeletePasskeyInput;", "getInput", "Companion", "Data", "DeletePasskey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PasskeyDeleteMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.Data> {
    public static final java.lang.String OPERATION_ID = "0c130afb6a1dfeeef4c3b7326fefd6871cf786c1a42e0611c6b7d1093e01d504";
    public static final java.lang.String OPERATION_NAME = "PasskeyDelete";
    private final com.paypal.oslo.api.graphql.schema.type.DeletePasskeyInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.Companion INSTANCE = new com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.Companion(null);
    public static final int $stable = 8;

    public PasskeyDeleteMutation(com.paypal.oslo.api.graphql.schema.type.DeletePasskeyInput deletePasskeyInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deletePasskeyInput, "");
        this.input = deletePasskeyInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DeletePasskeyInput getInput() {
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
        com.paypal.oslo.feature.identity.graphql.adapter.PasskeyDeleteMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.PasskeyDeleteMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.identity.graphql.selections.PasskeyDeleteMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyDeleteMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyDeleteMutation$DeletePasskey;", "deletePasskey", "<init>", "(Lcom/paypal/oslo/feature/identity/graphql/PasskeyDeleteMutation$DeletePasskey;)V", "component1", "()Lcom/paypal/oslo/feature/identity/graphql/PasskeyDeleteMutation$DeletePasskey;", "copy", "(Lcom/paypal/oslo/feature/identity/graphql/PasskeyDeleteMutation$DeletePasskey;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyDeleteMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyDeleteMutation$DeletePasskey;", "getDeletePasskey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.DeletePasskey deletePasskey;

        public Data(com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.DeletePasskey deletePasskey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deletePasskey, "");
            this.deletePasskey = deletePasskey;
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.DeletePasskey getDeletePasskey() {
            return this.deletePasskey;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.DeletePasskey deletePasskey = this.deletePasskey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(deletePasskey=");
            sb.append(deletePasskey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.deletePasskey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.deletePasskey, ((com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.Data) other).deletePasskey);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.Data copy(com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.DeletePasskey deletePasskey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deletePasskey, "");
            return new com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.Data(deletePasskey);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.DeletePasskey getDeletePasskey() {
            return this.deletePasskey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.Data copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.Data data, com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.DeletePasskey deletePasskey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                deletePasskey = data.deletePasskey;
            }
            return data.copy(deletePasskey);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ>\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyDeleteMutation$DeletePasskey;", "", "", "credentialId", "rawCredentialId", "", "success", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyDeleteMutation$DeletePasskey;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCredentialId", "getRawCredentialId", "Z", "getSuccess", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeletePasskey {
        public static final int $stable = 0;
        private final java.lang.String credentialId;
        private final java.lang.String message;
        private final java.lang.String rawCredentialId;
        private final boolean success;

        public DeletePasskey(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3) {
            this.credentialId = str;
            this.rawCredentialId = str2;
            this.success = z;
            this.message = str3;
        }

        public final java.lang.String getCredentialId() {
            return this.credentialId;
        }

        public final java.lang.String getRawCredentialId() {
            return this.rawCredentialId;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.credentialId;
            java.lang.String str2 = this.rawCredentialId;
            boolean z = this.success;
            java.lang.String str3 = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeletePasskey(credentialId=");
            sb.append(str);
            sb.append(", rawCredentialId=");
            sb.append(str2);
            sb.append(", success=");
            sb.append(z);
            sb.append(", message=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.credentialId;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.rawCredentialId;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            int hashCode3 = java.lang.Boolean.hashCode(this.success);
            java.lang.String str3 = this.message;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.DeletePasskey)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.DeletePasskey deletePasskey = (com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.DeletePasskey) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.credentialId, deletePasskey.credentialId) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawCredentialId, deletePasskey.rawCredentialId) && this.success == deletePasskey.success && kotlin.jvm.internal.Intrinsics.areEqual(this.message, deletePasskey.message);
        }

        public final com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.DeletePasskey copy(java.lang.String credentialId, java.lang.String rawCredentialId, boolean success, java.lang.String message) {
            return new com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.DeletePasskey(credentialId, rawCredentialId, success, message);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRawCredentialId() {
            return this.rawCredentialId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCredentialId() {
            return this.credentialId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.DeletePasskey copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation.DeletePasskey deletePasskey, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deletePasskey.credentialId;
            }
            if ((i & 2) != 0) {
                str2 = deletePasskey.rawCredentialId;
            }
            if ((i & 4) != 0) {
                z = deletePasskey.success;
            }
            if ((i & 8) != 0) {
                str3 = deletePasskey.message;
            }
            return deletePasskey.copy(str, str2, z, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/PasskeyDeleteMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation PasskeyDelete($input: DeletePasskeyInput!) { deletePasskey(input: $input) { credentialId rawCredentialId success message } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DeletePasskeyInput deletePasskeyInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyDeleteMutation(input=");
        sb.append(deletePasskeyInput);
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
        return (other instanceof com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation) other).input);
    }

    public final com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation copy(com.paypal.oslo.api.graphql.schema.type.DeletePasskeyInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DeletePasskeyInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation copy$default(com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation passkeyDeleteMutation, com.paypal.oslo.api.graphql.schema.type.DeletePasskeyInput deletePasskeyInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            deletePasskeyInput = passkeyDeleteMutation.input;
        }
        return passkeyDeleteMutation.copy(deletePasskeyInput);
    }
}
