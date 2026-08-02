package com.paypal.oslo.feature.savings.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/TransferMoneyboxInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/TransferMoneyboxInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/TransferMoneyboxInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/TransferMoneyboxInput;)Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/TransferMoneyboxInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.OPERATION_NAME, "Transfer", "Amount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TransferMoneyboxMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Data> {
    public static final java.lang.String OPERATION_ID = "b99bd16c7e679485752420851a9206274fa8a5011af461e5012ad2d4aedd5628";
    public static final java.lang.String OPERATION_NAME = "TransferMoneybox";
    private final com.paypal.oslo.api.graphql.schema.type.TransferMoneyboxInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Companion INSTANCE = new com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Companion(null);
    public static final int $stable = 8;

    public TransferMoneyboxMutation(com.paypal.oslo.api.graphql.schema.type.TransferMoneyboxInput transferMoneyboxInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferMoneyboxInput, "");
        this.input = transferMoneyboxInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.TransferMoneyboxInput getInput() {
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
        com.paypal.oslo.feature.savings.graphql.adapter.TransferMoneyboxMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.TransferMoneyboxMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.savings.graphql.selections.TransferMoneyboxMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$TransferMoneybox;", "transferMoneybox", "<init>", "(Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$TransferMoneybox;)V", "component1", "()Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$TransferMoneybox;", "copy", "(Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$TransferMoneybox;)Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$TransferMoneybox;", "getTransferMoneybox"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.TransferMoneybox transferMoneybox;

        public Data(com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.TransferMoneybox transferMoneybox) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferMoneybox, "");
            this.transferMoneybox = transferMoneybox;
        }

        public final com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.TransferMoneybox getTransferMoneybox() {
            return this.transferMoneybox;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.TransferMoneybox transferMoneybox = this.transferMoneybox;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(transferMoneybox=");
            sb.append(transferMoneybox);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.transferMoneybox.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferMoneybox, ((com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Data) other).transferMoneybox);
        }

        public final com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Data copy(com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.TransferMoneybox transferMoneybox) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferMoneybox, "");
            return new com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Data(transferMoneybox);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.TransferMoneybox getTransferMoneybox() {
            return this.transferMoneybox;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Data copy$default(com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Data data, com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.TransferMoneybox transferMoneybox, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                transferMoneybox = data.transferMoneybox;
            }
            return data.copy(transferMoneybox);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$TransferMoneybox;", "", "", "success", "Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$Transfer;", "transfer", "<init>", "(ZLcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$Transfer;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$Transfer;", "copy", "(ZLcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$Transfer;)Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$TransferMoneybox;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSuccess", "Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$Transfer;", "getTransfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransferMoneybox {
        public static final int $stable = 8;
        private final boolean success;
        private final com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Transfer transfer;

        public TransferMoneybox(boolean z, com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Transfer transfer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transfer, "");
            this.success = z;
            this.transfer = transfer;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Transfer getTransfer() {
            return this.transfer;
        }

        public final java.lang.String toString() {
            boolean z = this.success;
            com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Transfer transfer = this.transfer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferMoneybox(success=");
            sb.append(z);
            sb.append(", transfer=");
            sb.append(transfer);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.success) * 31) + this.transfer.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.TransferMoneybox)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.TransferMoneybox transferMoneybox = (com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.TransferMoneybox) other;
            return this.success == transferMoneybox.success && kotlin.jvm.internal.Intrinsics.areEqual(this.transfer, transferMoneybox.transfer);
        }

        public final com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.TransferMoneybox copy(boolean success, com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Transfer transfer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transfer, "");
            return new com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.TransferMoneybox(success, transfer);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Transfer getTransfer() {
            return this.transfer;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.TransferMoneybox copy$default(com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.TransferMoneybox transferMoneybox, boolean z, com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Transfer transfer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = transferMoneybox.success;
            }
            if ((i & 2) != 0) {
                transfer = transferMoneybox.transfer;
            }
            return transferMoneybox.copy(z, transfer);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0013R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$Transfer;", "", "", "id", "moneyboxId", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferOperationType;", "type", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferStatus;", "status", "Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$Amount;", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferOperationType;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferStatus;Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$Amount;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferOperationType;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferStatus;", "component5", "()Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$Amount;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferOperationType;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferStatus;Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$Amount;)Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$Transfer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getMoneyboxId", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferOperationType;", "getType", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferStatus;", "getStatus", "Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$Amount;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Transfer {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Amount amount;
        private final java.lang.String id;
        private final java.lang.String moneyboxId;
        private final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferStatus status;
        private final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferOperationType type;

        public Transfer(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferOperationType moneyboxTransferOperationType, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferStatus moneyboxTransferStatus, com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Amount amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxTransferOperationType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxTransferStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            this.id = str;
            this.moneyboxId = str2;
            this.type = moneyboxTransferOperationType;
            this.status = moneyboxTransferStatus;
            this.amount = amount;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getMoneyboxId() {
            return this.moneyboxId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferOperationType getType() {
            return this.type;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Amount getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.moneyboxId;
            com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferOperationType moneyboxTransferOperationType = this.type;
            com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferStatus moneyboxTransferStatus = this.status;
            com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Amount amount = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Transfer(id=");
            sb.append(str);
            sb.append(", moneyboxId=");
            sb.append(str2);
            sb.append(", type=");
            sb.append(moneyboxTransferOperationType);
            sb.append(", status=");
            sb.append(moneyboxTransferStatus);
            sb.append(", amount=");
            sb.append(amount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.id.hashCode() * 31) + this.moneyboxId.hashCode()) * 31) + this.type.hashCode()) * 31) + this.status.hashCode()) * 31) + this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Transfer)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Transfer transfer = (com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Transfer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, transfer.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyboxId, transfer.moneyboxId) && this.type == transfer.type && this.status == transfer.status && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, transfer.amount);
        }

        public final com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Transfer copy(java.lang.String id, java.lang.String moneyboxId, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferOperationType type, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferStatus status, com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Amount amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Transfer(id, moneyboxId, type, status, amount);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Amount getAmount() {
            return this.amount;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferStatus getStatus() {
            return this.status;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferOperationType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMoneyboxId() {
            return this.moneyboxId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Transfer copy$default(com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Transfer transfer, java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferOperationType moneyboxTransferOperationType, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferStatus moneyboxTransferStatus, com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Amount amount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = transfer.id;
            }
            if ((i & 2) != 0) {
                str2 = transfer.moneyboxId;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                moneyboxTransferOperationType = transfer.type;
            }
            com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferOperationType moneyboxTransferOperationType2 = moneyboxTransferOperationType;
            if ((i & 8) != 0) {
                moneyboxTransferStatus = transfer.status;
            }
            com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferStatus moneyboxTransferStatus2 = moneyboxTransferStatus;
            if ((i & 16) != 0) {
                amount = transfer.amount;
            }
            return transfer.copy(str, str3, moneyboxTransferOperationType2, moneyboxTransferStatus2, amount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$Amount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public Amount(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currencyCode = obj;
            this.value = str;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Amount amount = (com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, amount.value);
        }

        public final com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Amount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Amount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Amount copy$default(com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Amount amount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = amount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = amount.value;
            }
            return amount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation TransferMoneybox($input: TransferMoneyboxInput!) { transferMoneybox(input: $input) { success transfer { id moneyboxId type status amount { currencyCode value } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.TransferMoneyboxInput transferMoneyboxInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferMoneyboxMutation(input=");
        sb.append(transferMoneyboxInput);
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
        return (other instanceof com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation) other).input);
    }

    public final com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation copy(com.paypal.oslo.api.graphql.schema.type.TransferMoneyboxInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.TransferMoneyboxInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation copy$default(com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation transferMoneyboxMutation, com.paypal.oslo.api.graphql.schema.type.TransferMoneyboxInput transferMoneyboxInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            transferMoneyboxInput = transferMoneyboxMutation.input;
        }
        return transferMoneyboxMutation.copy(transferMoneyboxInput);
    }
}
