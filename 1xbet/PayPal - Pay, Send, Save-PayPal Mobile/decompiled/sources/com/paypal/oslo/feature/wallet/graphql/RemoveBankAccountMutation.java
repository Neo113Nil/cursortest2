package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/RemoveBankAccountMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/wallet/graphql/RemoveBankAccountMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/RemoveBankAccountInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RemoveBankAccountInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RemoveBankAccountInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RemoveBankAccountInput;)Lcom/paypal/oslo/feature/wallet/graphql/RemoveBankAccountMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/RemoveBankAccountInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RemoveBankAccountMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.Data> {
    public static final java.lang.String OPERATION_ID = "160950f52a4f07aa97b25582483870196e6af834741806b9c318dcdae3ebf765";
    public static final java.lang.String OPERATION_NAME = "RemoveBankAccount";
    private final com.paypal.oslo.api.graphql.schema.type.RemoveBankAccountInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.Companion(null);
    public static final int $stable = 8;

    public RemoveBankAccountMutation(com.paypal.oslo.api.graphql.schema.type.RemoveBankAccountInput removeBankAccountInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeBankAccountInput, "");
        this.input = removeBankAccountInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RemoveBankAccountInput getInput() {
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
        com.paypal.oslo.feature.wallet.graphql.adapter.RemoveBankAccountMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.RemoveBankAccountMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.RemoveBankAccountMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/RemoveBankAccountMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/RemoveBankAccountMutation$RemoveBankAccount;", "removeBankAccount", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/RemoveBankAccountMutation$RemoveBankAccount;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/RemoveBankAccountMutation$RemoveBankAccount;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/RemoveBankAccountMutation$RemoveBankAccount;)Lcom/paypal/oslo/feature/wallet/graphql/RemoveBankAccountMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/RemoveBankAccountMutation$RemoveBankAccount;", "getRemoveBankAccount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.RemoveBankAccount removeBankAccount;

        public Data(com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.RemoveBankAccount removeBankAccount) {
            this.removeBankAccount = removeBankAccount;
        }

        public final com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.RemoveBankAccount getRemoveBankAccount() {
            return this.removeBankAccount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.RemoveBankAccount removeBankAccount = this.removeBankAccount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(removeBankAccount=");
            sb.append(removeBankAccount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.RemoveBankAccount removeBankAccount = this.removeBankAccount;
            if (removeBankAccount == null) {
                return 0;
            }
            return removeBankAccount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.removeBankAccount, ((com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.Data) other).removeBankAccount);
        }

        public final com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.Data copy(com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.RemoveBankAccount removeBankAccount) {
            return new com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.Data(removeBankAccount);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.RemoveBankAccount getRemoveBankAccount() {
            return this.removeBankAccount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.Data copy$default(com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.Data data, com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.RemoveBankAccount removeBankAccount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                removeBankAccount = data.removeBankAccount;
            }
            return data.copy(removeBankAccount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/RemoveBankAccountMutation$RemoveBankAccount;", "", "", "success", "<init>", "(Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/wallet/graphql/RemoveBankAccountMutation$RemoveBankAccount;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getSuccess"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RemoveBankAccount {
        public static final int $stable = 0;
        private final java.lang.Boolean success;

        public RemoveBankAccount(java.lang.Boolean bool) {
            this.success = bool;
        }

        public final java.lang.Boolean getSuccess() {
            return this.success;
        }

        public final java.lang.String toString() {
            java.lang.Boolean bool = this.success;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoveBankAccount(success=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.success;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.RemoveBankAccount) && kotlin.jvm.internal.Intrinsics.areEqual(this.success, ((com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.RemoveBankAccount) other).success);
        }

        public final com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.RemoveBankAccount copy(java.lang.Boolean success) {
            return new com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.RemoveBankAccount(success);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getSuccess() {
            return this.success;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.RemoveBankAccount copy$default(com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.RemoveBankAccount removeBankAccount, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = removeBankAccount.success;
            }
            return removeBankAccount.copy(bool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/RemoveBankAccountMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation RemoveBankAccount($input: RemoveBankAccountInput!) { removeBankAccount(input: $input) { success } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RemoveBankAccountInput removeBankAccountInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoveBankAccountMutation(input=");
        sb.append(removeBankAccountInput);
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
        return (other instanceof com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation) other).input);
    }

    public final com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation copy(com.paypal.oslo.api.graphql.schema.type.RemoveBankAccountInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RemoveBankAccountInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation copy$default(com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation removeBankAccountMutation, com.paypal.oslo.api.graphql.schema.type.RemoveBankAccountInput removeBankAccountInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            removeBankAccountInput = removeBankAccountMutation.input;
        }
        return removeBankAccountMutation.copy(removeBankAccountInput);
    }
}
