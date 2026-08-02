package com.paypal.oslo.feature.savings.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/DeleteMoneyboxInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DeleteMoneyboxInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DeleteMoneyboxInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DeleteMoneyboxInput;)Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DeleteMoneyboxInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DeleteMoneyboxMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.Data> {
    public static final java.lang.String OPERATION_ID = "d3e7af71ebc596ae5ad27c70c792f03371034e22c81d6ca472179437a29b2991";
    public static final java.lang.String OPERATION_NAME = "DeleteMoneybox";
    private final com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.Companion INSTANCE = new com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.Companion(null);
    public static final int $stable = 8;

    public DeleteMoneyboxMutation(com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxInput deleteMoneyboxInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteMoneyboxInput, "");
        this.input = deleteMoneyboxInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxInput getInput() {
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
        com.paypal.oslo.feature.savings.graphql.adapter.DeleteMoneyboxMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.DeleteMoneyboxMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.savings.graphql.selections.DeleteMoneyboxMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxMutation$DeleteMoneybox;", "deleteMoneybox", "<init>", "(Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxMutation$DeleteMoneybox;)V", "component1", "()Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxMutation$DeleteMoneybox;", "copy", "(Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxMutation$DeleteMoneybox;)Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxMutation$DeleteMoneybox;", "getDeleteMoneybox"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.DeleteMoneybox deleteMoneybox;

        public Data(com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.DeleteMoneybox deleteMoneybox) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteMoneybox, "");
            this.deleteMoneybox = deleteMoneybox;
        }

        public final com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.DeleteMoneybox getDeleteMoneybox() {
            return this.deleteMoneybox;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.DeleteMoneybox deleteMoneybox = this.deleteMoneybox;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(deleteMoneybox=");
            sb.append(deleteMoneybox);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.deleteMoneybox.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.deleteMoneybox, ((com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.Data) other).deleteMoneybox);
        }

        public final com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.Data copy(com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.DeleteMoneybox deleteMoneybox) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteMoneybox, "");
            return new com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.Data(deleteMoneybox);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.DeleteMoneybox getDeleteMoneybox() {
            return this.deleteMoneybox;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.Data copy$default(com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.Data data, com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.DeleteMoneybox deleteMoneybox, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                deleteMoneybox = data.deleteMoneybox;
            }
            return data.copy(deleteMoneybox);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxMutation$DeleteMoneybox;", "", "", "deletedMoneyboxId", "", "success", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxMutation$DeleteMoneybox;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDeletedMoneyboxId", "Z", "getSuccess"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteMoneybox {
        public static final int $stable = 0;
        private final java.lang.String deletedMoneyboxId;
        private final boolean success;

        public DeleteMoneybox(java.lang.String str, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.deletedMoneyboxId = str;
            this.success = z;
        }

        public final java.lang.String getDeletedMoneyboxId() {
            return this.deletedMoneyboxId;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.deletedMoneyboxId;
            boolean z = this.success;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteMoneybox(deletedMoneyboxId=");
            sb.append(str);
            sb.append(", success=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.deletedMoneyboxId.hashCode() * 31) + java.lang.Boolean.hashCode(this.success);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.DeleteMoneybox)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.DeleteMoneybox deleteMoneybox = (com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.DeleteMoneybox) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.deletedMoneyboxId, deleteMoneybox.deletedMoneyboxId) && this.success == deleteMoneybox.success;
        }

        public final com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.DeleteMoneybox copy(java.lang.String deletedMoneyboxId, boolean success) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deletedMoneyboxId, "");
            return new com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.DeleteMoneybox(deletedMoneyboxId, success);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDeletedMoneyboxId() {
            return this.deletedMoneyboxId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.DeleteMoneybox copy$default(com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.DeleteMoneybox deleteMoneybox, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deleteMoneybox.deletedMoneyboxId;
            }
            if ((i & 2) != 0) {
                z = deleteMoneybox.success;
            }
            return deleteMoneybox.copy(str, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation DeleteMoneybox($input: DeleteMoneyboxInput!) { deleteMoneybox(input: $input) { deletedMoneyboxId success } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxInput deleteMoneyboxInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteMoneyboxMutation(input=");
        sb.append(deleteMoneyboxInput);
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
        return (other instanceof com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation) other).input);
    }

    public final com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation copy(com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation copy$default(com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation deleteMoneyboxMutation, com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxInput deleteMoneyboxInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            deleteMoneyboxInput = deleteMoneyboxMutation.input;
        }
        return deleteMoneyboxMutation.copy(deleteMoneyboxInput);
    }
}
