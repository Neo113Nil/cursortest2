package com.paypal.oslo.feature.savings.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateMoneyboxTransferScheduleInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateMoneyboxTransferScheduleInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/UpdateMoneyboxTransferScheduleInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateMoneyboxTransferScheduleInput;)Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateMoneyboxTransferScheduleInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.OPERATION_NAME, "TransferSchedule", "ReloadAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class UpdateMoneyboxTransferScheduleMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.Data> {
    public static final java.lang.String OPERATION_ID = "8bf119a054815ddf06f77f90c48ae010eec74e55350c299d45725cc5ac88a6d7";
    public static final java.lang.String OPERATION_NAME = "UpdateMoneyboxTransferSchedule";
    private final com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxTransferScheduleInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.Companion INSTANCE = new com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.Companion(null);
    public static final int $stable = 8;

    public UpdateMoneyboxTransferScheduleMutation(com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxTransferScheduleInput updateMoneyboxTransferScheduleInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateMoneyboxTransferScheduleInput, "");
        this.input = updateMoneyboxTransferScheduleInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxTransferScheduleInput getInput() {
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
        com.paypal.oslo.feature.savings.graphql.adapter.UpdateMoneyboxTransferScheduleMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.UpdateMoneyboxTransferScheduleMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.savings.graphql.selections.UpdateMoneyboxTransferScheduleMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$UpdateMoneyboxTransferSchedule;", "updateMoneyboxTransferSchedule", "<init>", "(Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$UpdateMoneyboxTransferSchedule;)V", "component1", "()Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$UpdateMoneyboxTransferSchedule;", "copy", "(Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$UpdateMoneyboxTransferSchedule;)Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$UpdateMoneyboxTransferSchedule;", "getUpdateMoneyboxTransferSchedule"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.UpdateMoneyboxTransferSchedule updateMoneyboxTransferSchedule;

        public Data(com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.UpdateMoneyboxTransferSchedule updateMoneyboxTransferSchedule) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateMoneyboxTransferSchedule, "");
            this.updateMoneyboxTransferSchedule = updateMoneyboxTransferSchedule;
        }

        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.UpdateMoneyboxTransferSchedule getUpdateMoneyboxTransferSchedule() {
            return this.updateMoneyboxTransferSchedule;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.UpdateMoneyboxTransferSchedule updateMoneyboxTransferSchedule = this.updateMoneyboxTransferSchedule;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(updateMoneyboxTransferSchedule=");
            sb.append(updateMoneyboxTransferSchedule);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.updateMoneyboxTransferSchedule.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateMoneyboxTransferSchedule, ((com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.Data) other).updateMoneyboxTransferSchedule);
        }

        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.Data copy(com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.UpdateMoneyboxTransferSchedule updateMoneyboxTransferSchedule) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateMoneyboxTransferSchedule, "");
            return new com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.Data(updateMoneyboxTransferSchedule);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.UpdateMoneyboxTransferSchedule getUpdateMoneyboxTransferSchedule() {
            return this.updateMoneyboxTransferSchedule;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.Data copy$default(com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.Data data, com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.UpdateMoneyboxTransferSchedule updateMoneyboxTransferSchedule, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updateMoneyboxTransferSchedule = data.updateMoneyboxTransferSchedule;
            }
            return data.copy(updateMoneyboxTransferSchedule);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$UpdateMoneyboxTransferSchedule;", "", "", "success", "Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$TransferSchedule;", "transferSchedule", "<init>", "(ZLcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$TransferSchedule;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$TransferSchedule;", "copy", "(ZLcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$TransferSchedule;)Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$UpdateMoneyboxTransferSchedule;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSuccess", "Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$TransferSchedule;", "getTransferSchedule"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateMoneyboxTransferSchedule {
        public static final int $stable = 8;
        private final boolean success;
        private final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule transferSchedule;

        public UpdateMoneyboxTransferSchedule(boolean z, com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule transferSchedule) {
            this.success = z;
            this.transferSchedule = transferSchedule;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule getTransferSchedule() {
            return this.transferSchedule;
        }

        public final java.lang.String toString() {
            boolean z = this.success;
            com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule transferSchedule = this.transferSchedule;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateMoneyboxTransferSchedule(success=");
            sb.append(z);
            sb.append(", transferSchedule=");
            sb.append(transferSchedule);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.success);
            com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule transferSchedule = this.transferSchedule;
            return (hashCode * 31) + (transferSchedule == null ? 0 : transferSchedule.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.UpdateMoneyboxTransferSchedule)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.UpdateMoneyboxTransferSchedule updateMoneyboxTransferSchedule = (com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.UpdateMoneyboxTransferSchedule) other;
            return this.success == updateMoneyboxTransferSchedule.success && kotlin.jvm.internal.Intrinsics.areEqual(this.transferSchedule, updateMoneyboxTransferSchedule.transferSchedule);
        }

        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.UpdateMoneyboxTransferSchedule copy(boolean success, com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule transferSchedule) {
            return new com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.UpdateMoneyboxTransferSchedule(success, transferSchedule);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule getTransferSchedule() {
            return this.transferSchedule;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.UpdateMoneyboxTransferSchedule copy$default(com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.UpdateMoneyboxTransferSchedule updateMoneyboxTransferSchedule, boolean z, com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule transferSchedule, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = updateMoneyboxTransferSchedule.success;
            }
            if ((i & 2) != 0) {
                transferSchedule = updateMoneyboxTransferSchedule.transferSchedule;
            }
            return updateMoneyboxTransferSchedule.copy(z, transferSchedule);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JL\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b)\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$TransferSchedule;", "", "", "id", "startDate", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleRecurrence;", "recurrence", "financialInstrumentId", "Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$ReloadAmount;", "reloadAmount", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleStatus;", "status", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleRecurrence;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$ReloadAmount;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleStatus;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleRecurrence;", "component4", "component5", "()Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$ReloadAmount;", "component6", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleStatus;", "copy", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleRecurrence;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$ReloadAmount;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleStatus;)Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$TransferSchedule;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Ljava/lang/Object;", "getStartDate", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleRecurrence;", "getRecurrence", "getFinancialInstrumentId", "Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$ReloadAmount;", "getReloadAmount", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransferSchedule {
        public static final int $stable = 8;
        private final java.lang.String financialInstrumentId;
        private final java.lang.String id;
        private final com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleRecurrence recurrence;
        private final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount reloadAmount;
        private final java.lang.Object startDate;
        private final com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus status;

        public TransferSchedule(java.lang.String str, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleRecurrence moneyboxScheduleRecurrence, java.lang.String str2, com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount reloadAmount, com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus moneyboxScheduleStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxScheduleRecurrence, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxScheduleStatus, "");
            this.id = str;
            this.startDate = obj;
            this.recurrence = moneyboxScheduleRecurrence;
            this.financialInstrumentId = str2;
            this.reloadAmount = reloadAmount;
            this.status = moneyboxScheduleStatus;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.Object getStartDate() {
            return this.startDate;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleRecurrence getRecurrence() {
            return this.recurrence;
        }

        public final java.lang.String getFinancialInstrumentId() {
            return this.financialInstrumentId;
        }

        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount getReloadAmount() {
            return this.reloadAmount;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.Object obj = this.startDate;
            com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleRecurrence moneyboxScheduleRecurrence = this.recurrence;
            java.lang.String str2 = this.financialInstrumentId;
            com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount reloadAmount = this.reloadAmount;
            com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus moneyboxScheduleStatus = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferSchedule(id=");
            sb.append(str);
            sb.append(", startDate=");
            sb.append(obj);
            sb.append(", recurrence=");
            sb.append(moneyboxScheduleRecurrence);
            sb.append(", financialInstrumentId=");
            sb.append(str2);
            sb.append(", reloadAmount=");
            sb.append(reloadAmount);
            sb.append(", status=");
            sb.append(moneyboxScheduleStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((this.id.hashCode() * 31) + this.startDate.hashCode()) * 31) + this.recurrence.hashCode()) * 31) + this.financialInstrumentId.hashCode()) * 31) + this.reloadAmount.hashCode()) * 31) + this.status.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule transferSchedule = (com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, transferSchedule.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, transferSchedule.startDate) && this.recurrence == transferSchedule.recurrence && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstrumentId, transferSchedule.financialInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.reloadAmount, transferSchedule.reloadAmount) && this.status == transferSchedule.status;
        }

        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule copy(java.lang.String id, java.lang.Object startDate, com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleRecurrence recurrence, java.lang.String financialInstrumentId, com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount reloadAmount, com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurrence, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstrumentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule(id, startDate, recurrence, financialInstrumentId, reloadAmount, status);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus getStatus() {
            return this.status;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount getReloadAmount() {
            return this.reloadAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getFinancialInstrumentId() {
            return this.financialInstrumentId;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleRecurrence getRecurrence() {
            return this.recurrence;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getStartDate() {
            return this.startDate;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule copy$default(com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule transferSchedule, java.lang.String str, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleRecurrence moneyboxScheduleRecurrence, java.lang.String str2, com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount reloadAmount, com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus moneyboxScheduleStatus, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = transferSchedule.id;
            }
            if ((i & 2) != 0) {
                obj = transferSchedule.startDate;
            }
            java.lang.Object obj3 = obj;
            if ((i & 4) != 0) {
                moneyboxScheduleRecurrence = transferSchedule.recurrence;
            }
            com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleRecurrence moneyboxScheduleRecurrence2 = moneyboxScheduleRecurrence;
            if ((i & 8) != 0) {
                str2 = transferSchedule.financialInstrumentId;
            }
            java.lang.String str3 = str2;
            if ((i & 16) != 0) {
                reloadAmount = transferSchedule.reloadAmount;
            }
            com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount reloadAmount2 = reloadAmount;
            if ((i & 32) != 0) {
                moneyboxScheduleStatus = transferSchedule.status;
            }
            return transferSchedule.copy(str, obj3, moneyboxScheduleRecurrence2, str3, reloadAmount2, moneyboxScheduleStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$ReloadAmount;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$ReloadAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/lang/Object;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReloadAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public ReloadAmount(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.value = str;
            this.currencyCode = obj;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.Object obj = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReloadAmount(value=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.value.hashCode() * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount reloadAmount = (com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, reloadAmount.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, reloadAmount.currencyCode);
        }

        public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount copy(java.lang.String value, java.lang.Object currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount copy$default(com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.ReloadAmount reloadAmount, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = reloadAmount.value;
            }
            if ((i & 2) != 0) {
                obj = reloadAmount.currencyCode;
            }
            return reloadAmount.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation UpdateMoneyboxTransferSchedule($input: UpdateMoneyboxTransferScheduleInput!) { updateMoneyboxTransferSchedule(input: $input) { success transferSchedule { id startDate recurrence financialInstrumentId reloadAmount { value currencyCode } status } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxTransferScheduleInput updateMoneyboxTransferScheduleInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateMoneyboxTransferScheduleMutation(input=");
        sb.append(updateMoneyboxTransferScheduleInput);
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
        return (other instanceof com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation) other).input);
    }

    public final com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation copy(com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxTransferScheduleInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxTransferScheduleInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation copy$default(com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation updateMoneyboxTransferScheduleMutation, com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxTransferScheduleInput updateMoneyboxTransferScheduleInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            updateMoneyboxTransferScheduleInput = updateMoneyboxTransferScheduleMutation.input;
        }
        return updateMoneyboxTransferScheduleMutation.copy(updateMoneyboxTransferScheduleInput);
    }
}
