package com.paypal.oslo.feature.balance.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/DisableAutoTransferMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/balance/graphql/DisableAutoTransferMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/DisableBalanceAutoTransferInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DisableBalanceAutoTransferInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DisableBalanceAutoTransferInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DisableBalanceAutoTransferInput;)Lcom/paypal/oslo/feature/balance/graphql/DisableAutoTransferMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DisableBalanceAutoTransferInput;", "getInput", "Companion", "Data", "DisableBalanceAutoTransfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DisableAutoTransferMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.Data> {
    public static final java.lang.String OPERATION_ID = "e33b81a368d00330e8498aed6e9d9181cdcaee5431c4b1763b8fe2136ef059f3";
    public static final java.lang.String OPERATION_NAME = "DisableAutoTransfer";
    private final com.paypal.oslo.api.graphql.schema.type.DisableBalanceAutoTransferInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.Companion INSTANCE = new com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.Companion(null);
    public static final int $stable = 8;

    public DisableAutoTransferMutation(com.paypal.oslo.api.graphql.schema.type.DisableBalanceAutoTransferInput disableBalanceAutoTransferInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disableBalanceAutoTransferInput, "");
        this.input = disableBalanceAutoTransferInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DisableBalanceAutoTransferInput getInput() {
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
        com.paypal.oslo.feature.balance.graphql.adapter.DisableAutoTransferMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.balance.graphql.adapter.DisableAutoTransferMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.balance.graphql.selections.DisableAutoTransferMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/DisableAutoTransferMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/balance/graphql/DisableAutoTransferMutation$DisableBalanceAutoTransfer;", "disableBalanceAutoTransfer", "<init>", "(Lcom/paypal/oslo/feature/balance/graphql/DisableAutoTransferMutation$DisableBalanceAutoTransfer;)V", "component1", "()Lcom/paypal/oslo/feature/balance/graphql/DisableAutoTransferMutation$DisableBalanceAutoTransfer;", "copy", "(Lcom/paypal/oslo/feature/balance/graphql/DisableAutoTransferMutation$DisableBalanceAutoTransfer;)Lcom/paypal/oslo/feature/balance/graphql/DisableAutoTransferMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/graphql/DisableAutoTransferMutation$DisableBalanceAutoTransfer;", "getDisableBalanceAutoTransfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.DisableBalanceAutoTransfer disableBalanceAutoTransfer;

        public Data(com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.DisableBalanceAutoTransfer disableBalanceAutoTransfer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disableBalanceAutoTransfer, "");
            this.disableBalanceAutoTransfer = disableBalanceAutoTransfer;
        }

        public final com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.DisableBalanceAutoTransfer getDisableBalanceAutoTransfer() {
            return this.disableBalanceAutoTransfer;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.DisableBalanceAutoTransfer disableBalanceAutoTransfer = this.disableBalanceAutoTransfer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(disableBalanceAutoTransfer=");
            sb.append(disableBalanceAutoTransfer);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.disableBalanceAutoTransfer.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.disableBalanceAutoTransfer, ((com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.Data) other).disableBalanceAutoTransfer);
        }

        public final com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.Data copy(com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.DisableBalanceAutoTransfer disableBalanceAutoTransfer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disableBalanceAutoTransfer, "");
            return new com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.Data(disableBalanceAutoTransfer);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.DisableBalanceAutoTransfer getDisableBalanceAutoTransfer() {
            return this.disableBalanceAutoTransfer;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.Data copy$default(com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.Data data, com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.DisableBalanceAutoTransfer disableBalanceAutoTransfer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                disableBalanceAutoTransfer = data.disableBalanceAutoTransfer;
            }
            return data.copy(disableBalanceAutoTransfer);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/DisableAutoTransferMutation$DisableBalanceAutoTransfer;", "", "", "success", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/balance/graphql/DisableAutoTransferMutation$DisableBalanceAutoTransfer;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSuccess"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DisableBalanceAutoTransfer {
        public static final int $stable = 0;
        private final boolean success;

        public DisableBalanceAutoTransfer(boolean z) {
            this.success = z;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final java.lang.String toString() {
            boolean z = this.success;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DisableBalanceAutoTransfer(success=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.success);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.DisableBalanceAutoTransfer) && this.success == ((com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.DisableBalanceAutoTransfer) other).success;
        }

        public final com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.DisableBalanceAutoTransfer copy(boolean success) {
            return new com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.DisableBalanceAutoTransfer(success);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.DisableBalanceAutoTransfer copy$default(com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation.DisableBalanceAutoTransfer disableBalanceAutoTransfer, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = disableBalanceAutoTransfer.success;
            }
            return disableBalanceAutoTransfer.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/DisableAutoTransferMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation DisableAutoTransfer($input: DisableBalanceAutoTransferInput!) { disableBalanceAutoTransfer(input: $input) { success } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DisableBalanceAutoTransferInput disableBalanceAutoTransferInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DisableAutoTransferMutation(input=");
        sb.append(disableBalanceAutoTransferInput);
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
        return (other instanceof com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation) other).input);
    }

    public final com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation copy(com.paypal.oslo.api.graphql.schema.type.DisableBalanceAutoTransferInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DisableBalanceAutoTransferInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation copy$default(com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation disableAutoTransferMutation, com.paypal.oslo.api.graphql.schema.type.DisableBalanceAutoTransferInput disableBalanceAutoTransferInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            disableBalanceAutoTransferInput = disableAutoTransferMutation.input;
        }
        return disableAutoTransferMutation.copy(disableBalanceAutoTransferInput);
    }
}
