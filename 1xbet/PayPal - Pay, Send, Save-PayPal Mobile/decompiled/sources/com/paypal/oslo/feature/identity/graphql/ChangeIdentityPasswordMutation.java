package com.paypal.oslo.feature.identity.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ChangeIdentityPasswordMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/identity/graphql/ChangeIdentityPasswordMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ChangePasswordInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ChangePasswordInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ChangePasswordInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ChangePasswordInput;)Lcom/paypal/oslo/feature/identity/graphql/ChangeIdentityPasswordMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ChangePasswordInput;", "getInput", "Companion", "Data", "ChangePassword"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChangeIdentityPasswordMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.Data> {
    public static final java.lang.String OPERATION_ID = "45f7ca60dfb38a9d1c09f05d611771f95b79656ff47c0fe8b8c5aa91bed6cbdb";
    public static final java.lang.String OPERATION_NAME = "ChangeIdentityPassword";
    private final com.paypal.oslo.api.graphql.schema.type.ChangePasswordInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.Companion INSTANCE = new com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.Companion(null);
    public static final int $stable = 8;

    public ChangeIdentityPasswordMutation(com.paypal.oslo.api.graphql.schema.type.ChangePasswordInput changePasswordInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changePasswordInput, "");
        this.input = changePasswordInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ChangePasswordInput getInput() {
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
        com.paypal.oslo.feature.identity.graphql.adapter.ChangeIdentityPasswordMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.ChangeIdentityPasswordMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.identity.graphql.selections.ChangeIdentityPasswordMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ChangeIdentityPasswordMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/identity/graphql/ChangeIdentityPasswordMutation$ChangePassword;", "changePassword", "<init>", "(Lcom/paypal/oslo/feature/identity/graphql/ChangeIdentityPasswordMutation$ChangePassword;)V", "component1", "()Lcom/paypal/oslo/feature/identity/graphql/ChangeIdentityPasswordMutation$ChangePassword;", "copy", "(Lcom/paypal/oslo/feature/identity/graphql/ChangeIdentityPasswordMutation$ChangePassword;)Lcom/paypal/oslo/feature/identity/graphql/ChangeIdentityPasswordMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/graphql/ChangeIdentityPasswordMutation$ChangePassword;", "getChangePassword"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.ChangePassword changePassword;

        public Data(com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.ChangePassword changePassword) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changePassword, "");
            this.changePassword = changePassword;
        }

        public final com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.ChangePassword getChangePassword() {
            return this.changePassword;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.ChangePassword changePassword = this.changePassword;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(changePassword=");
            sb.append(changePassword);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.changePassword.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.changePassword, ((com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.Data) other).changePassword);
        }

        public final com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.Data copy(com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.ChangePassword changePassword) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changePassword, "");
            return new com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.Data(changePassword);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.ChangePassword getChangePassword() {
            return this.changePassword;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.Data copy$default(com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.Data data, com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.ChangePassword changePassword, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                changePassword = data.changePassword;
            }
            return data.copy(changePassword);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ChangeIdentityPasswordMutation$ChangePassword;", "", "Lcom/paypal/oslo/api/graphql/schema/type/ChangePasswordResultStatus;", "status", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ChangePasswordResultStatus;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ChangePasswordResultStatus;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ChangePasswordResultStatus;)Lcom/paypal/oslo/feature/identity/graphql/ChangeIdentityPasswordMutation$ChangePassword;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/ChangePasswordResultStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChangePassword {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus status;

        public ChangePassword(com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus changePasswordResultStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changePasswordResultStatus, "");
            this.status = changePasswordResultStatus;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus changePasswordResultStatus = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChangePassword(status=");
            sb.append(changePasswordResultStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.status.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.ChangePassword) && this.status == ((com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.ChangePassword) other).status;
        }

        public final com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.ChangePassword copy(com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.ChangePassword(status);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.ChangePassword copy$default(com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation.ChangePassword changePassword, com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus changePasswordResultStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                changePasswordResultStatus = changePassword.status;
            }
            return changePassword.copy(changePasswordResultStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ChangeIdentityPasswordMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation ChangeIdentityPassword($input: ChangePasswordInput!) { changePassword(input: $input) { status } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ChangePasswordInput changePasswordInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChangeIdentityPasswordMutation(input=");
        sb.append(changePasswordInput);
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
        return (other instanceof com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation) other).input);
    }

    public final com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation copy(com.paypal.oslo.api.graphql.schema.type.ChangePasswordInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ChangePasswordInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation copy$default(com.paypal.oslo.feature.identity.graphql.ChangeIdentityPasswordMutation changeIdentityPasswordMutation, com.paypal.oslo.api.graphql.schema.type.ChangePasswordInput changePasswordInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            changePasswordInput = changeIdentityPasswordMutation.input;
        }
        return changeIdentityPasswordMutation.copy(changePasswordInput);
    }
}
