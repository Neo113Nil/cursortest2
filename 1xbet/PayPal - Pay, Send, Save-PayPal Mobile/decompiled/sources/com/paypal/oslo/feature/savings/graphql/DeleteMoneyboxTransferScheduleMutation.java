package com.paypal.oslo.feature.savings.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxTransferScheduleMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxTransferScheduleMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/DeleteMoneyboxTransferScheduleInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DeleteMoneyboxTransferScheduleInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DeleteMoneyboxTransferScheduleInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DeleteMoneyboxTransferScheduleInput;)Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxTransferScheduleMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DeleteMoneyboxTransferScheduleInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DeleteMoneyboxTransferScheduleMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.Data> {
    public static final java.lang.String OPERATION_ID = "0451dda66bb87019c0d6b4b54c00f433dc71c93260d754ba0208d9134bd50e20";
    public static final java.lang.String OPERATION_NAME = "DeleteMoneyboxTransferSchedule";
    private final com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxTransferScheduleInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.Companion INSTANCE = new com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.Companion(null);
    public static final int $stable = 8;

    public DeleteMoneyboxTransferScheduleMutation(com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxTransferScheduleInput deleteMoneyboxTransferScheduleInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteMoneyboxTransferScheduleInput, "");
        this.input = deleteMoneyboxTransferScheduleInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxTransferScheduleInput getInput() {
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
        com.paypal.oslo.feature.savings.graphql.adapter.DeleteMoneyboxTransferScheduleMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.DeleteMoneyboxTransferScheduleMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.savings.graphql.selections.DeleteMoneyboxTransferScheduleMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxTransferScheduleMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxTransferScheduleMutation$DeleteMoneyboxTransferSchedule;", "deleteMoneyboxTransferSchedule", "<init>", "(Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxTransferScheduleMutation$DeleteMoneyboxTransferSchedule;)V", "component1", "()Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxTransferScheduleMutation$DeleteMoneyboxTransferSchedule;", "copy", "(Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxTransferScheduleMutation$DeleteMoneyboxTransferSchedule;)Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxTransferScheduleMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxTransferScheduleMutation$DeleteMoneyboxTransferSchedule;", "getDeleteMoneyboxTransferSchedule"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.DeleteMoneyboxTransferSchedule deleteMoneyboxTransferSchedule;

        public Data(com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.DeleteMoneyboxTransferSchedule deleteMoneyboxTransferSchedule) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteMoneyboxTransferSchedule, "");
            this.deleteMoneyboxTransferSchedule = deleteMoneyboxTransferSchedule;
        }

        public final com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.DeleteMoneyboxTransferSchedule getDeleteMoneyboxTransferSchedule() {
            return this.deleteMoneyboxTransferSchedule;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.DeleteMoneyboxTransferSchedule deleteMoneyboxTransferSchedule = this.deleteMoneyboxTransferSchedule;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(deleteMoneyboxTransferSchedule=");
            sb.append(deleteMoneyboxTransferSchedule);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.deleteMoneyboxTransferSchedule.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.deleteMoneyboxTransferSchedule, ((com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.Data) other).deleteMoneyboxTransferSchedule);
        }

        public final com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.Data copy(com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.DeleteMoneyboxTransferSchedule deleteMoneyboxTransferSchedule) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteMoneyboxTransferSchedule, "");
            return new com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.Data(deleteMoneyboxTransferSchedule);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.DeleteMoneyboxTransferSchedule getDeleteMoneyboxTransferSchedule() {
            return this.deleteMoneyboxTransferSchedule;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.Data copy$default(com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.Data data, com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.DeleteMoneyboxTransferSchedule deleteMoneyboxTransferSchedule, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                deleteMoneyboxTransferSchedule = data.deleteMoneyboxTransferSchedule;
            }
            return data.copy(deleteMoneyboxTransferSchedule);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxTransferScheduleMutation$DeleteMoneyboxTransferSchedule;", "", "", "success", "", "deletedScheduleId", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxTransferScheduleMutation$DeleteMoneyboxTransferSchedule;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getSuccess", "Ljava/lang/String;", "getDeletedScheduleId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteMoneyboxTransferSchedule {
        public static final int $stable = 0;
        private final java.lang.String deletedScheduleId;
        private final boolean success;

        public DeleteMoneyboxTransferSchedule(boolean z, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.success = z;
            this.deletedScheduleId = str;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final java.lang.String getDeletedScheduleId() {
            return this.deletedScheduleId;
        }

        public final java.lang.String toString() {
            boolean z = this.success;
            java.lang.String str = this.deletedScheduleId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteMoneyboxTransferSchedule(success=");
            sb.append(z);
            sb.append(", deletedScheduleId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.success) * 31) + this.deletedScheduleId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.DeleteMoneyboxTransferSchedule)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.DeleteMoneyboxTransferSchedule deleteMoneyboxTransferSchedule = (com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.DeleteMoneyboxTransferSchedule) other;
            return this.success == deleteMoneyboxTransferSchedule.success && kotlin.jvm.internal.Intrinsics.areEqual(this.deletedScheduleId, deleteMoneyboxTransferSchedule.deletedScheduleId);
        }

        public final com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.DeleteMoneyboxTransferSchedule copy(boolean success, java.lang.String deletedScheduleId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deletedScheduleId, "");
            return new com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.DeleteMoneyboxTransferSchedule(success, deletedScheduleId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDeletedScheduleId() {
            return this.deletedScheduleId;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.DeleteMoneyboxTransferSchedule copy$default(com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.DeleteMoneyboxTransferSchedule deleteMoneyboxTransferSchedule, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = deleteMoneyboxTransferSchedule.success;
            }
            if ((i & 2) != 0) {
                str = deleteMoneyboxTransferSchedule.deletedScheduleId;
            }
            return deleteMoneyboxTransferSchedule.copy(z, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxTransferScheduleMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation DeleteMoneyboxTransferSchedule($input: DeleteMoneyboxTransferScheduleInput!) { deleteMoneyboxTransferSchedule(input: $input) { success deletedScheduleId } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxTransferScheduleInput deleteMoneyboxTransferScheduleInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteMoneyboxTransferScheduleMutation(input=");
        sb.append(deleteMoneyboxTransferScheduleInput);
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
        return (other instanceof com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation) other).input);
    }

    public final com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation copy(com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxTransferScheduleInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxTransferScheduleInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation copy$default(com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation deleteMoneyboxTransferScheduleMutation, com.paypal.oslo.api.graphql.schema.type.DeleteMoneyboxTransferScheduleInput deleteMoneyboxTransferScheduleInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            deleteMoneyboxTransferScheduleInput = deleteMoneyboxTransferScheduleMutation.input;
        }
        return deleteMoneyboxTransferScheduleMutation.copy(deleteMoneyboxTransferScheduleInput);
    }
}
