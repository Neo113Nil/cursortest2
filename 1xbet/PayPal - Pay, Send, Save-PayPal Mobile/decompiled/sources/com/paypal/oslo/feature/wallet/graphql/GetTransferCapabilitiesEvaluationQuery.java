package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0016*+,-./0123456789:;<=>)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/TransferCapabilitiesEvaluationInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/TransferCapabilitiesEvaluationInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/TransferCapabilitiesEvaluationInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/TransferCapabilitiesEvaluationInput;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/TransferCapabilitiesEvaluationInput;", "getInput", "Companion", "Data", "TransferCapabilitiesEvaluation", "ProductFlow", "Capability", "WithdrawalCapabilities", "WithdrawalCapability", "SupportedInstrument", "EstimatedWithdrawalTime", "SuggestedWithdrawalAmount", "OnMoney", "DepositCapabilities", "DepositCapability", "SupportedInstrument1", "EstimatedDepositTime", "RecommendedAmount", "OnMoney1", "SuggestedDepositAmount", "OnMoney2", "SuggestedAction", "OnTransferActionStandardDeposit", "OnTransferActionStandardWithdrawal"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class GetTransferCapabilitiesEvaluationQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Data> {
    public static final java.lang.String OPERATION_ID = "a4ef355f86d59620cb6e1ddf72536dd908a3a03c052bef98bc0a02bce943183d";
    public static final java.lang.String OPERATION_NAME = "GetTransferCapabilitiesEvaluation";
    private final com.paypal.oslo.api.graphql.schema.type.TransferCapabilitiesEvaluationInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Companion(null);
    public static final int $stable = 8;

    public GetTransferCapabilitiesEvaluationQuery(com.paypal.oslo.api.graphql.schema.type.TransferCapabilitiesEvaluationInput transferCapabilitiesEvaluationInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferCapabilitiesEvaluationInput, "");
        this.input = transferCapabilitiesEvaluationInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.TransferCapabilitiesEvaluationInput getInput() {
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
        com.paypal.oslo.feature.wallet.graphql.adapter.GetTransferCapabilitiesEvaluationQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetTransferCapabilitiesEvaluationQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.GetTransferCapabilitiesEvaluationQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$TransferCapabilitiesEvaluation;", "transferCapabilitiesEvaluation", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$TransferCapabilitiesEvaluation;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$TransferCapabilitiesEvaluation;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$TransferCapabilitiesEvaluation;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$TransferCapabilitiesEvaluation;", "getTransferCapabilitiesEvaluation"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.TransferCapabilitiesEvaluation transferCapabilitiesEvaluation;

        public Data(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.TransferCapabilitiesEvaluation transferCapabilitiesEvaluation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferCapabilitiesEvaluation, "");
            this.transferCapabilitiesEvaluation = transferCapabilitiesEvaluation;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.TransferCapabilitiesEvaluation getTransferCapabilitiesEvaluation() {
            return this.transferCapabilitiesEvaluation;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.TransferCapabilitiesEvaluation transferCapabilitiesEvaluation = this.transferCapabilitiesEvaluation;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(transferCapabilitiesEvaluation=");
            sb.append(transferCapabilitiesEvaluation);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.transferCapabilitiesEvaluation.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferCapabilitiesEvaluation, ((com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Data) other).transferCapabilitiesEvaluation);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Data copy(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.TransferCapabilitiesEvaluation transferCapabilitiesEvaluation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferCapabilitiesEvaluation, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Data(transferCapabilitiesEvaluation);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.TransferCapabilitiesEvaluation getTransferCapabilitiesEvaluation() {
            return this.transferCapabilitiesEvaluation;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Data copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Data data, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.TransferCapabilitiesEvaluation transferCapabilitiesEvaluation, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                transferCapabilitiesEvaluation = data.transferCapabilitiesEvaluation;
            }
            return data.copy(transferCapabilitiesEvaluation);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ>\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$TransferCapabilitiesEvaluation;", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$ProductFlow;", "productFlow", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$Capability;", "capabilities", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$SuggestedAction;", "suggestedActions", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$ProductFlow;Ljava/util/List;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$ProductFlow;", "component2", "()Ljava/util/List;", "component3", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$ProductFlow;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$TransferCapabilitiesEvaluation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$ProductFlow;", "getProductFlow", "Ljava/util/List;", "getCapabilities", "getSuggestedActions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransferCapabilitiesEvaluation {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Capability> capabilities;
        private final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.ProductFlow productFlow;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedAction> suggestedActions;

        public TransferCapabilitiesEvaluation(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.ProductFlow productFlow, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Capability> list, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedAction> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.productFlow = productFlow;
            this.capabilities = list;
            this.suggestedActions = list2;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.ProductFlow getProductFlow() {
            return this.productFlow;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Capability> getCapabilities() {
            return this.capabilities;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedAction> getSuggestedActions() {
            return this.suggestedActions;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.ProductFlow productFlow = this.productFlow;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Capability> list = this.capabilities;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedAction> list2 = this.suggestedActions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferCapabilitiesEvaluation(productFlow=");
            sb.append(productFlow);
            sb.append(", capabilities=");
            sb.append(list);
            sb.append(", suggestedActions=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.ProductFlow productFlow = this.productFlow;
            int hashCode = productFlow == null ? 0 : productFlow.hashCode();
            int hashCode2 = this.capabilities.hashCode();
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedAction> list = this.suggestedActions;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.TransferCapabilitiesEvaluation)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.TransferCapabilitiesEvaluation transferCapabilitiesEvaluation = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.TransferCapabilitiesEvaluation) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.productFlow, transferCapabilitiesEvaluation.productFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.capabilities, transferCapabilitiesEvaluation.capabilities) && kotlin.jvm.internal.Intrinsics.areEqual(this.suggestedActions, transferCapabilitiesEvaluation.suggestedActions);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.TransferCapabilitiesEvaluation copy(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.ProductFlow productFlow, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Capability> capabilities, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedAction> suggestedActions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capabilities, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.TransferCapabilitiesEvaluation(productFlow, capabilities, suggestedActions);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedAction> component3() {
            return this.suggestedActions;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Capability> component2() {
            return this.capabilities;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.ProductFlow getProductFlow() {
            return this.productFlow;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.TransferCapabilitiesEvaluation copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.TransferCapabilitiesEvaluation transferCapabilitiesEvaluation, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.ProductFlow productFlow, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                productFlow = transferCapabilitiesEvaluation.productFlow;
            }
            if ((i & 2) != 0) {
                list = transferCapabilitiesEvaluation.capabilities;
            }
            if ((i & 4) != 0) {
                list2 = transferCapabilitiesEvaluation.suggestedActions;
            }
            return transferCapabilitiesEvaluation.copy(productFlow, list, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$ProductFlow;", "", "Lcom/paypal/oslo/api/graphql/schema/type/ProductFlowIdentifier;", "identifier", "Lcom/paypal/oslo/api/graphql/schema/type/TransferChannel;", "transferChannel", "Lcom/paypal/oslo/api/graphql/schema/type/ProductSubFlowIdentifier;", "subFlow", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ProductFlowIdentifier;Lcom/paypal/oslo/api/graphql/schema/type/TransferChannel;Lcom/paypal/oslo/api/graphql/schema/type/ProductSubFlowIdentifier;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ProductFlowIdentifier;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/TransferChannel;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/ProductSubFlowIdentifier;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ProductFlowIdentifier;Lcom/paypal/oslo/api/graphql/schema/type/TransferChannel;Lcom/paypal/oslo/api/graphql/schema/type/ProductSubFlowIdentifier;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$ProductFlow;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/ProductFlowIdentifier;", "getIdentifier", "Lcom/paypal/oslo/api/graphql/schema/type/TransferChannel;", "getTransferChannel", "Lcom/paypal/oslo/api/graphql/schema/type/ProductSubFlowIdentifier;", "getSubFlow"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProductFlow {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier identifier;
        private final com.paypal.oslo.api.graphql.schema.type.ProductSubFlowIdentifier subFlow;
        private final com.paypal.oslo.api.graphql.schema.type.TransferChannel transferChannel;

        public ProductFlow(com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier, com.paypal.oslo.api.graphql.schema.type.TransferChannel transferChannel, com.paypal.oslo.api.graphql.schema.type.ProductSubFlowIdentifier productSubFlowIdentifier) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productFlowIdentifier, "");
            this.identifier = productFlowIdentifier;
            this.transferChannel = transferChannel;
            this.subFlow = productSubFlowIdentifier;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier getIdentifier() {
            return this.identifier;
        }

        public final com.paypal.oslo.api.graphql.schema.type.TransferChannel getTransferChannel() {
            return this.transferChannel;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ProductSubFlowIdentifier getSubFlow() {
            return this.subFlow;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier = this.identifier;
            com.paypal.oslo.api.graphql.schema.type.TransferChannel transferChannel = this.transferChannel;
            com.paypal.oslo.api.graphql.schema.type.ProductSubFlowIdentifier productSubFlowIdentifier = this.subFlow;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProductFlow(identifier=");
            sb.append(productFlowIdentifier);
            sb.append(", transferChannel=");
            sb.append(transferChannel);
            sb.append(", subFlow=");
            sb.append(productSubFlowIdentifier);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.identifier.hashCode();
            com.paypal.oslo.api.graphql.schema.type.TransferChannel transferChannel = this.transferChannel;
            int hashCode2 = transferChannel == null ? 0 : transferChannel.hashCode();
            com.paypal.oslo.api.graphql.schema.type.ProductSubFlowIdentifier productSubFlowIdentifier = this.subFlow;
            return (((hashCode * 31) + hashCode2) * 31) + (productSubFlowIdentifier != null ? productSubFlowIdentifier.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.ProductFlow)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.ProductFlow productFlow = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.ProductFlow) other;
            return this.identifier == productFlow.identifier && this.transferChannel == productFlow.transferChannel && this.subFlow == productFlow.subFlow;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.ProductFlow copy(com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier identifier, com.paypal.oslo.api.graphql.schema.type.TransferChannel transferChannel, com.paypal.oslo.api.graphql.schema.type.ProductSubFlowIdentifier subFlow) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.ProductFlow(identifier, transferChannel, subFlow);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ProductSubFlowIdentifier getSubFlow() {
            return this.subFlow;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.TransferChannel getTransferChannel() {
            return this.transferChannel;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier getIdentifier() {
            return this.identifier;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.ProductFlow copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.ProductFlow productFlow, com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier, com.paypal.oslo.api.graphql.schema.type.TransferChannel transferChannel, com.paypal.oslo.api.graphql.schema.type.ProductSubFlowIdentifier productSubFlowIdentifier, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                productFlowIdentifier = productFlow.identifier;
            }
            if ((i & 2) != 0) {
                transferChannel = productFlow.transferChannel;
            }
            if ((i & 4) != 0) {
                productSubFlowIdentifier = productFlow.subFlow;
            }
            return productFlow.copy(productFlowIdentifier, transferChannel, productSubFlowIdentifier);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$Capability;", "", "Lcom/paypal/oslo/api/graphql/schema/type/TransferTenant;", "tenant", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$WithdrawalCapabilities;", "withdrawalCapabilities", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$DepositCapabilities;", "depositCapabilities", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/TransferTenant;Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$WithdrawalCapabilities;Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$DepositCapabilities;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/TransferTenant;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$WithdrawalCapabilities;", "component3", "()Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$DepositCapabilities;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/TransferTenant;Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$WithdrawalCapabilities;Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$DepositCapabilities;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$Capability;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/TransferTenant;", "getTenant", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$WithdrawalCapabilities;", "getWithdrawalCapabilities", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$DepositCapabilities;", "getDepositCapabilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Capability {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapabilities depositCapabilities;
        private final com.paypal.oslo.api.graphql.schema.type.TransferTenant tenant;
        private final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapabilities withdrawalCapabilities;

        public Capability(com.paypal.oslo.api.graphql.schema.type.TransferTenant transferTenant, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapabilities withdrawalCapabilities, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapabilities depositCapabilities) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferTenant, "");
            this.tenant = transferTenant;
            this.withdrawalCapabilities = withdrawalCapabilities;
            this.depositCapabilities = depositCapabilities;
        }

        public final com.paypal.oslo.api.graphql.schema.type.TransferTenant getTenant() {
            return this.tenant;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapabilities getWithdrawalCapabilities() {
            return this.withdrawalCapabilities;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapabilities getDepositCapabilities() {
            return this.depositCapabilities;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.TransferTenant transferTenant = this.tenant;
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapabilities withdrawalCapabilities = this.withdrawalCapabilities;
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapabilities depositCapabilities = this.depositCapabilities;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Capability(tenant=");
            sb.append(transferTenant);
            sb.append(", withdrawalCapabilities=");
            sb.append(withdrawalCapabilities);
            sb.append(", depositCapabilities=");
            sb.append(depositCapabilities);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.tenant.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapabilities withdrawalCapabilities = this.withdrawalCapabilities;
            int hashCode2 = withdrawalCapabilities == null ? 0 : withdrawalCapabilities.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapabilities depositCapabilities = this.depositCapabilities;
            return (((hashCode * 31) + hashCode2) * 31) + (depositCapabilities != null ? depositCapabilities.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Capability)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Capability capability = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Capability) other;
            return this.tenant == capability.tenant && kotlin.jvm.internal.Intrinsics.areEqual(this.withdrawalCapabilities, capability.withdrawalCapabilities) && kotlin.jvm.internal.Intrinsics.areEqual(this.depositCapabilities, capability.depositCapabilities);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Capability copy(com.paypal.oslo.api.graphql.schema.type.TransferTenant tenant, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapabilities withdrawalCapabilities, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapabilities depositCapabilities) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tenant, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Capability(tenant, withdrawalCapabilities, depositCapabilities);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapabilities getDepositCapabilities() {
            return this.depositCapabilities;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapabilities getWithdrawalCapabilities() {
            return this.withdrawalCapabilities;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.TransferTenant getTenant() {
            return this.tenant;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Capability copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Capability capability, com.paypal.oslo.api.graphql.schema.type.TransferTenant transferTenant, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapabilities withdrawalCapabilities, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapabilities depositCapabilities, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                transferTenant = capability.tenant;
            }
            if ((i & 2) != 0) {
                withdrawalCapabilities = capability.withdrawalCapabilities;
            }
            if ((i & 4) != 0) {
                depositCapabilities = capability.depositCapabilities;
            }
            return capability.copy(transferTenant, withdrawalCapabilities, depositCapabilities);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ2\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$WithdrawalCapabilities;", "", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$WithdrawalCapability;", "withdrawalCapabilities", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$SuggestedWithdrawalAmount;", "suggestedWithdrawalAmounts", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$WithdrawalCapabilities;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getWithdrawalCapabilities", "getSuggestedWithdrawalAmounts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WithdrawalCapabilities {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedWithdrawalAmount> suggestedWithdrawalAmounts;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability> withdrawalCapabilities;

        public WithdrawalCapabilities(java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability> list, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedWithdrawalAmount> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.withdrawalCapabilities = list;
            this.suggestedWithdrawalAmounts = list2;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability> getWithdrawalCapabilities() {
            return this.withdrawalCapabilities;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedWithdrawalAmount> getSuggestedWithdrawalAmounts() {
            return this.suggestedWithdrawalAmounts;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability> list = this.withdrawalCapabilities;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedWithdrawalAmount> list2 = this.suggestedWithdrawalAmounts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WithdrawalCapabilities(withdrawalCapabilities=");
            sb.append(list);
            sb.append(", suggestedWithdrawalAmounts=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.withdrawalCapabilities.hashCode();
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedWithdrawalAmount> list = this.suggestedWithdrawalAmounts;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapabilities)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapabilities withdrawalCapabilities = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapabilities) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.withdrawalCapabilities, withdrawalCapabilities.withdrawalCapabilities) && kotlin.jvm.internal.Intrinsics.areEqual(this.suggestedWithdrawalAmounts, withdrawalCapabilities.suggestedWithdrawalAmounts);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapabilities copy(java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability> withdrawalCapabilities, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedWithdrawalAmount> suggestedWithdrawalAmounts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawalCapabilities, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapabilities(withdrawalCapabilities, suggestedWithdrawalAmounts);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedWithdrawalAmount> component2() {
            return this.suggestedWithdrawalAmounts;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability> component1() {
            return this.withdrawalCapabilities;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapabilities copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapabilities withdrawalCapabilities, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = withdrawalCapabilities.withdrawalCapabilities;
            }
            if ((i & 2) != 0) {
                list2 = withdrawalCapabilities.suggestedWithdrawalAmounts;
            }
            return withdrawalCapabilities.copy(list, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$WithdrawalCapability;", "", "Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalCapabilityType;", "type", "Lcom/paypal/oslo/api/graphql/schema/type/TransferCapabilityStatus;", "status", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$SupportedInstrument;", "supportedInstruments", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalCapabilityType;Lcom/paypal/oslo/api/graphql/schema/type/TransferCapabilityStatus;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalCapabilityType;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/TransferCapabilityStatus;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalCapabilityType;Lcom/paypal/oslo/api/graphql/schema/type/TransferCapabilityStatus;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$WithdrawalCapability;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalCapabilityType;", "getType", "Lcom/paypal/oslo/api/graphql/schema/type/TransferCapabilityStatus;", "getStatus", "Ljava/util/List;", "getSupportedInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WithdrawalCapability {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.TransferCapabilityStatus status;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument> supportedInstruments;
        private final com.paypal.oslo.api.graphql.schema.type.WithdrawalCapabilityType type;

        public WithdrawalCapability(com.paypal.oslo.api.graphql.schema.type.WithdrawalCapabilityType withdrawalCapabilityType, com.paypal.oslo.api.graphql.schema.type.TransferCapabilityStatus transferCapabilityStatus, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawalCapabilityType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferCapabilityStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.type = withdrawalCapabilityType;
            this.status = transferCapabilityStatus;
            this.supportedInstruments = list;
        }

        public final com.paypal.oslo.api.graphql.schema.type.WithdrawalCapabilityType getType() {
            return this.type;
        }

        public final com.paypal.oslo.api.graphql.schema.type.TransferCapabilityStatus getStatus() {
            return this.status;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument> getSupportedInstruments() {
            return this.supportedInstruments;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.WithdrawalCapabilityType withdrawalCapabilityType = this.type;
            com.paypal.oslo.api.graphql.schema.type.TransferCapabilityStatus transferCapabilityStatus = this.status;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument> list = this.supportedInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WithdrawalCapability(type=");
            sb.append(withdrawalCapabilityType);
            sb.append(", status=");
            sb.append(transferCapabilityStatus);
            sb.append(", supportedInstruments=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.type.hashCode() * 31) + this.status.hashCode()) * 31) + this.supportedInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability withdrawalCapability = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability) other;
            return this.type == withdrawalCapability.type && this.status == withdrawalCapability.status && kotlin.jvm.internal.Intrinsics.areEqual(this.supportedInstruments, withdrawalCapability.supportedInstruments);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability copy(com.paypal.oslo.api.graphql.schema.type.WithdrawalCapabilityType type, com.paypal.oslo.api.graphql.schema.type.TransferCapabilityStatus status, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument> supportedInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedInstruments, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability(type, status, supportedInstruments);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument> component3() {
            return this.supportedInstruments;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.TransferCapabilityStatus getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.WithdrawalCapabilityType getType() {
            return this.type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability withdrawalCapability, com.paypal.oslo.api.graphql.schema.type.WithdrawalCapabilityType withdrawalCapabilityType, com.paypal.oslo.api.graphql.schema.type.TransferCapabilityStatus transferCapabilityStatus, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                withdrawalCapabilityType = withdrawalCapability.type;
            }
            if ((i & 2) != 0) {
                transferCapabilityStatus = withdrawalCapability.status;
            }
            if ((i & 4) != 0) {
                list = withdrawalCapability.supportedInstruments;
            }
            return withdrawalCapability.copy(withdrawalCapabilityType, transferCapabilityStatus, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$SupportedInstrument;", "", "Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalInstrumentType;", "instrumentType", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$EstimatedWithdrawalTime;", "estimatedWithdrawalTime", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalInstrumentType;Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$EstimatedWithdrawalTime;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalInstrumentType;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$EstimatedWithdrawalTime;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalInstrumentType;Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$EstimatedWithdrawalTime;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$SupportedInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalInstrumentType;", "getInstrumentType", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$EstimatedWithdrawalTime;", "getEstimatedWithdrawalTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SupportedInstrument {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedWithdrawalTime estimatedWithdrawalTime;
        private final com.paypal.oslo.api.graphql.schema.type.WithdrawalInstrumentType instrumentType;

        public SupportedInstrument(com.paypal.oslo.api.graphql.schema.type.WithdrawalInstrumentType withdrawalInstrumentType, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedWithdrawalTime estimatedWithdrawalTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawalInstrumentType, "");
            this.instrumentType = withdrawalInstrumentType;
            this.estimatedWithdrawalTime = estimatedWithdrawalTime;
        }

        public final com.paypal.oslo.api.graphql.schema.type.WithdrawalInstrumentType getInstrumentType() {
            return this.instrumentType;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedWithdrawalTime getEstimatedWithdrawalTime() {
            return this.estimatedWithdrawalTime;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.WithdrawalInstrumentType withdrawalInstrumentType = this.instrumentType;
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedWithdrawalTime estimatedWithdrawalTime = this.estimatedWithdrawalTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SupportedInstrument(instrumentType=");
            sb.append(withdrawalInstrumentType);
            sb.append(", estimatedWithdrawalTime=");
            sb.append(estimatedWithdrawalTime);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.instrumentType.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedWithdrawalTime estimatedWithdrawalTime = this.estimatedWithdrawalTime;
            return (hashCode * 31) + (estimatedWithdrawalTime == null ? 0 : estimatedWithdrawalTime.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument supportedInstrument = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument) other;
            return this.instrumentType == supportedInstrument.instrumentType && kotlin.jvm.internal.Intrinsics.areEqual(this.estimatedWithdrawalTime, supportedInstrument.estimatedWithdrawalTime);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument copy(com.paypal.oslo.api.graphql.schema.type.WithdrawalInstrumentType instrumentType, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedWithdrawalTime estimatedWithdrawalTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentType, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument(instrumentType, estimatedWithdrawalTime);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedWithdrawalTime getEstimatedWithdrawalTime() {
            return this.estimatedWithdrawalTime;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.WithdrawalInstrumentType getInstrumentType() {
            return this.instrumentType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument supportedInstrument, com.paypal.oslo.api.graphql.schema.type.WithdrawalInstrumentType withdrawalInstrumentType, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedWithdrawalTime estimatedWithdrawalTime, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                withdrawalInstrumentType = supportedInstrument.instrumentType;
            }
            if ((i & 2) != 0) {
                estimatedWithdrawalTime = supportedInstrument.estimatedWithdrawalTime;
            }
            return supportedInstrument.copy(withdrawalInstrumentType, estimatedWithdrawalTime);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ4\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0019\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$EstimatedWithdrawalTime;", "", "maxDuration", "minDuration", "maxFundsTransferTime", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$EstimatedWithdrawalTime;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getMaxDuration", "getMinDuration", "getMaxFundsTransferTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EstimatedWithdrawalTime {
        public static final int $stable = 8;
        private final java.lang.Object maxDuration;
        private final java.lang.Object maxFundsTransferTime;
        private final java.lang.Object minDuration;

        public EstimatedWithdrawalTime(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            this.maxDuration = obj;
            this.minDuration = obj2;
            this.maxFundsTransferTime = obj3;
        }

        public final java.lang.Object getMaxDuration() {
            return this.maxDuration;
        }

        public final java.lang.Object getMinDuration() {
            return this.minDuration;
        }

        public final java.lang.Object getMaxFundsTransferTime() {
            return this.maxFundsTransferTime;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.maxDuration;
            java.lang.Object obj2 = this.minDuration;
            java.lang.Object obj3 = this.maxFundsTransferTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EstimatedWithdrawalTime(maxDuration=");
            sb.append(obj);
            sb.append(", minDuration=");
            sb.append(obj2);
            sb.append(", maxFundsTransferTime=");
            sb.append(obj3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.maxDuration;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.minDuration;
            int hashCode2 = obj2 == null ? 0 : obj2.hashCode();
            java.lang.Object obj3 = this.maxFundsTransferTime;
            return (((hashCode * 31) + hashCode2) * 31) + (obj3 != null ? obj3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedWithdrawalTime)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedWithdrawalTime estimatedWithdrawalTime = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedWithdrawalTime) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.maxDuration, estimatedWithdrawalTime.maxDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.minDuration, estimatedWithdrawalTime.minDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxFundsTransferTime, estimatedWithdrawalTime.maxFundsTransferTime);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedWithdrawalTime copy(java.lang.Object maxDuration, java.lang.Object minDuration, java.lang.Object maxFundsTransferTime) {
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedWithdrawalTime(maxDuration, minDuration, maxFundsTransferTime);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getMaxFundsTransferTime() {
            return this.maxFundsTransferTime;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getMinDuration() {
            return this.minDuration;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getMaxDuration() {
            return this.maxDuration;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedWithdrawalTime copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedWithdrawalTime estimatedWithdrawalTime, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, java.lang.Object obj4) {
            if ((i & 1) != 0) {
                obj = estimatedWithdrawalTime.maxDuration;
            }
            if ((i & 2) != 0) {
                obj2 = estimatedWithdrawalTime.minDuration;
            }
            if ((i & 4) != 0) {
                obj3 = estimatedWithdrawalTime.maxFundsTransferTime;
            }
            return estimatedWithdrawalTime.copy(obj, obj2, obj3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$SuggestedWithdrawalAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney;", "onMoney", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$SuggestedWithdrawalAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney;", "getOnMoney"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SuggestedWithdrawalAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney onMoney;

        public SuggestedWithdrawalAmount(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney onMoney) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onMoney = onMoney;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney getOnMoney() {
            return this.onMoney;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney onMoney = this.onMoney;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SuggestedWithdrawalAmount(__typename=");
            sb.append(str);
            sb.append(", onMoney=");
            sb.append(onMoney);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney onMoney = this.onMoney;
            return (hashCode * 31) + (onMoney == null ? 0 : onMoney.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedWithdrawalAmount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedWithdrawalAmount suggestedWithdrawalAmount = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedWithdrawalAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, suggestedWithdrawalAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onMoney, suggestedWithdrawalAmount.onMoney);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedWithdrawalAmount copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney onMoney) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedWithdrawalAmount(__typename, onMoney);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney getOnMoney() {
            return this.onMoney;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedWithdrawalAmount copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedWithdrawalAmount suggestedWithdrawalAmount, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney onMoney, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = suggestedWithdrawalAmount.__typename;
            }
            if ((i & 2) != 0) {
                onMoney = suggestedWithdrawalAmount.onMoney;
            }
            return suggestedWithdrawalAmount.copy(str, onMoney);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMoney {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public OnMoney(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnMoney(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney onMoney = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, onMoney.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, onMoney.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney onMoney, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = onMoney.currencyCode;
            }
            if ((i & 2) != 0) {
                str = onMoney.value;
            }
            return onMoney.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ>\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$DepositCapabilities;", "", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$DepositCapability;", "depositCapabilities", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$RecommendedAmount;", "recommendedAmount", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$SuggestedDepositAmount;", "suggestedDepositAmounts", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$RecommendedAmount;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$RecommendedAmount;", "component3", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$RecommendedAmount;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$DepositCapabilities;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getDepositCapabilities", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$RecommendedAmount;", "getRecommendedAmount", "getSuggestedDepositAmounts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DepositCapabilities {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability> depositCapabilities;
        private final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.RecommendedAmount recommendedAmount;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedDepositAmount> suggestedDepositAmounts;

        public DepositCapabilities(java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability> list, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.RecommendedAmount recommendedAmount, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedDepositAmount> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.depositCapabilities = list;
            this.recommendedAmount = recommendedAmount;
            this.suggestedDepositAmounts = list2;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability> getDepositCapabilities() {
            return this.depositCapabilities;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.RecommendedAmount getRecommendedAmount() {
            return this.recommendedAmount;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedDepositAmount> getSuggestedDepositAmounts() {
            return this.suggestedDepositAmounts;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability> list = this.depositCapabilities;
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.RecommendedAmount recommendedAmount = this.recommendedAmount;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedDepositAmount> list2 = this.suggestedDepositAmounts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DepositCapabilities(depositCapabilities=");
            sb.append(list);
            sb.append(", recommendedAmount=");
            sb.append(recommendedAmount);
            sb.append(", suggestedDepositAmounts=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.depositCapabilities.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.RecommendedAmount recommendedAmount = this.recommendedAmount;
            int hashCode2 = recommendedAmount == null ? 0 : recommendedAmount.hashCode();
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedDepositAmount> list = this.suggestedDepositAmounts;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapabilities)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapabilities depositCapabilities = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapabilities) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.depositCapabilities, depositCapabilities.depositCapabilities) && kotlin.jvm.internal.Intrinsics.areEqual(this.recommendedAmount, depositCapabilities.recommendedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.suggestedDepositAmounts, depositCapabilities.suggestedDepositAmounts);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapabilities copy(java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability> depositCapabilities, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.RecommendedAmount recommendedAmount, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedDepositAmount> suggestedDepositAmounts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositCapabilities, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapabilities(depositCapabilities, recommendedAmount, suggestedDepositAmounts);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedDepositAmount> component3() {
            return this.suggestedDepositAmounts;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.RecommendedAmount getRecommendedAmount() {
            return this.recommendedAmount;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability> component1() {
            return this.depositCapabilities;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapabilities copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapabilities depositCapabilities, java.util.List list, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.RecommendedAmount recommendedAmount, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = depositCapabilities.depositCapabilities;
            }
            if ((i & 2) != 0) {
                recommendedAmount = depositCapabilities.recommendedAmount;
            }
            if ((i & 4) != 0) {
                list2 = depositCapabilities.suggestedDepositAmounts;
            }
            return depositCapabilities.copy(list, recommendedAmount, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$DepositCapability;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DepositCapabilityType;", "type", "Lcom/paypal/oslo/api/graphql/schema/type/TransferCapabilityStatus;", "status", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$SupportedInstrument1;", "supportedInstruments", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DepositCapabilityType;Lcom/paypal/oslo/api/graphql/schema/type/TransferCapabilityStatus;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DepositCapabilityType;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/TransferCapabilityStatus;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DepositCapabilityType;Lcom/paypal/oslo/api/graphql/schema/type/TransferCapabilityStatus;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$DepositCapability;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DepositCapabilityType;", "getType", "Lcom/paypal/oslo/api/graphql/schema/type/TransferCapabilityStatus;", "getStatus", "Ljava/util/List;", "getSupportedInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DepositCapability {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.TransferCapabilityStatus status;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument1> supportedInstruments;
        private final com.paypal.oslo.api.graphql.schema.type.DepositCapabilityType type;

        public DepositCapability(com.paypal.oslo.api.graphql.schema.type.DepositCapabilityType depositCapabilityType, com.paypal.oslo.api.graphql.schema.type.TransferCapabilityStatus transferCapabilityStatus, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument1> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositCapabilityType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferCapabilityStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.type = depositCapabilityType;
            this.status = transferCapabilityStatus;
            this.supportedInstruments = list;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DepositCapabilityType getType() {
            return this.type;
        }

        public final com.paypal.oslo.api.graphql.schema.type.TransferCapabilityStatus getStatus() {
            return this.status;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument1> getSupportedInstruments() {
            return this.supportedInstruments;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.DepositCapabilityType depositCapabilityType = this.type;
            com.paypal.oslo.api.graphql.schema.type.TransferCapabilityStatus transferCapabilityStatus = this.status;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument1> list = this.supportedInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DepositCapability(type=");
            sb.append(depositCapabilityType);
            sb.append(", status=");
            sb.append(transferCapabilityStatus);
            sb.append(", supportedInstruments=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.type.hashCode() * 31) + this.status.hashCode()) * 31) + this.supportedInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability depositCapability = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability) other;
            return this.type == depositCapability.type && this.status == depositCapability.status && kotlin.jvm.internal.Intrinsics.areEqual(this.supportedInstruments, depositCapability.supportedInstruments);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability copy(com.paypal.oslo.api.graphql.schema.type.DepositCapabilityType type, com.paypal.oslo.api.graphql.schema.type.TransferCapabilityStatus status, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument1> supportedInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedInstruments, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability(type, status, supportedInstruments);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument1> component3() {
            return this.supportedInstruments;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.TransferCapabilityStatus getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DepositCapabilityType getType() {
            return this.type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability depositCapability, com.paypal.oslo.api.graphql.schema.type.DepositCapabilityType depositCapabilityType, com.paypal.oslo.api.graphql.schema.type.TransferCapabilityStatus transferCapabilityStatus, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                depositCapabilityType = depositCapability.type;
            }
            if ((i & 2) != 0) {
                transferCapabilityStatus = depositCapability.status;
            }
            if ((i & 4) != 0) {
                list = depositCapability.supportedInstruments;
            }
            return depositCapability.copy(depositCapabilityType, transferCapabilityStatus, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$SupportedInstrument1;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DepositInstrumentType;", "instrumentType", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$EstimatedDepositTime;", "estimatedDepositTime", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DepositInstrumentType;Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$EstimatedDepositTime;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DepositInstrumentType;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$EstimatedDepositTime;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DepositInstrumentType;Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$EstimatedDepositTime;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$SupportedInstrument1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DepositInstrumentType;", "getInstrumentType", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$EstimatedDepositTime;", "getEstimatedDepositTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SupportedInstrument1 {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedDepositTime estimatedDepositTime;
        private final com.paypal.oslo.api.graphql.schema.type.DepositInstrumentType instrumentType;

        public SupportedInstrument1(com.paypal.oslo.api.graphql.schema.type.DepositInstrumentType depositInstrumentType, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedDepositTime estimatedDepositTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositInstrumentType, "");
            this.instrumentType = depositInstrumentType;
            this.estimatedDepositTime = estimatedDepositTime;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DepositInstrumentType getInstrumentType() {
            return this.instrumentType;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedDepositTime getEstimatedDepositTime() {
            return this.estimatedDepositTime;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.DepositInstrumentType depositInstrumentType = this.instrumentType;
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedDepositTime estimatedDepositTime = this.estimatedDepositTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SupportedInstrument1(instrumentType=");
            sb.append(depositInstrumentType);
            sb.append(", estimatedDepositTime=");
            sb.append(estimatedDepositTime);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.instrumentType.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedDepositTime estimatedDepositTime = this.estimatedDepositTime;
            return (hashCode * 31) + (estimatedDepositTime == null ? 0 : estimatedDepositTime.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument1)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument1 supportedInstrument1 = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument1) other;
            return this.instrumentType == supportedInstrument1.instrumentType && kotlin.jvm.internal.Intrinsics.areEqual(this.estimatedDepositTime, supportedInstrument1.estimatedDepositTime);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument1 copy(com.paypal.oslo.api.graphql.schema.type.DepositInstrumentType instrumentType, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedDepositTime estimatedDepositTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentType, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument1(instrumentType, estimatedDepositTime);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedDepositTime getEstimatedDepositTime() {
            return this.estimatedDepositTime;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DepositInstrumentType getInstrumentType() {
            return this.instrumentType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument1 copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument1 supportedInstrument1, com.paypal.oslo.api.graphql.schema.type.DepositInstrumentType depositInstrumentType, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedDepositTime estimatedDepositTime, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                depositInstrumentType = supportedInstrument1.instrumentType;
            }
            if ((i & 2) != 0) {
                estimatedDepositTime = supportedInstrument1.estimatedDepositTime;
            }
            return supportedInstrument1.copy(depositInstrumentType, estimatedDepositTime);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ4\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0019\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$EstimatedDepositTime;", "", "maxDuration", "minDuration", "maxFundsTransferTime", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$EstimatedDepositTime;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getMaxDuration", "getMinDuration", "getMaxFundsTransferTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EstimatedDepositTime {
        public static final int $stable = 8;
        private final java.lang.Object maxDuration;
        private final java.lang.Object maxFundsTransferTime;
        private final java.lang.Object minDuration;

        public EstimatedDepositTime(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            this.maxDuration = obj;
            this.minDuration = obj2;
            this.maxFundsTransferTime = obj3;
        }

        public final java.lang.Object getMaxDuration() {
            return this.maxDuration;
        }

        public final java.lang.Object getMinDuration() {
            return this.minDuration;
        }

        public final java.lang.Object getMaxFundsTransferTime() {
            return this.maxFundsTransferTime;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.maxDuration;
            java.lang.Object obj2 = this.minDuration;
            java.lang.Object obj3 = this.maxFundsTransferTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EstimatedDepositTime(maxDuration=");
            sb.append(obj);
            sb.append(", minDuration=");
            sb.append(obj2);
            sb.append(", maxFundsTransferTime=");
            sb.append(obj3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.maxDuration;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.minDuration;
            int hashCode2 = obj2 == null ? 0 : obj2.hashCode();
            java.lang.Object obj3 = this.maxFundsTransferTime;
            return (((hashCode * 31) + hashCode2) * 31) + (obj3 != null ? obj3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedDepositTime)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedDepositTime estimatedDepositTime = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedDepositTime) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.maxDuration, estimatedDepositTime.maxDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.minDuration, estimatedDepositTime.minDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxFundsTransferTime, estimatedDepositTime.maxFundsTransferTime);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedDepositTime copy(java.lang.Object maxDuration, java.lang.Object minDuration, java.lang.Object maxFundsTransferTime) {
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedDepositTime(maxDuration, minDuration, maxFundsTransferTime);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getMaxFundsTransferTime() {
            return this.maxFundsTransferTime;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getMinDuration() {
            return this.minDuration;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getMaxDuration() {
            return this.maxDuration;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedDepositTime copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.EstimatedDepositTime estimatedDepositTime, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, java.lang.Object obj4) {
            if ((i & 1) != 0) {
                obj = estimatedDepositTime.maxDuration;
            }
            if ((i & 2) != 0) {
                obj2 = estimatedDepositTime.minDuration;
            }
            if ((i & 4) != 0) {
                obj3 = estimatedDepositTime.maxFundsTransferTime;
            }
            return estimatedDepositTime.copy(obj, obj2, obj3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$RecommendedAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney1;", "onMoney", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney1;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney1;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney1;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$RecommendedAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney1;", "getOnMoney"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RecommendedAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney1 onMoney;

        public RecommendedAmount(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney1 onMoney1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onMoney = onMoney1;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney1 getOnMoney() {
            return this.onMoney;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney1 onMoney1 = this.onMoney;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RecommendedAmount(__typename=");
            sb.append(str);
            sb.append(", onMoney=");
            sb.append(onMoney1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney1 onMoney1 = this.onMoney;
            return (hashCode * 31) + (onMoney1 == null ? 0 : onMoney1.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.RecommendedAmount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.RecommendedAmount recommendedAmount = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.RecommendedAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, recommendedAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onMoney, recommendedAmount.onMoney);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.RecommendedAmount copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney1 onMoney) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.RecommendedAmount(__typename, onMoney);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney1 getOnMoney() {
            return this.onMoney;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.RecommendedAmount copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.RecommendedAmount recommendedAmount, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney1 onMoney1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = recommendedAmount.__typename;
            }
            if ((i & 2) != 0) {
                onMoney1 = recommendedAmount.onMoney;
            }
            return recommendedAmount.copy(str, onMoney1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney1;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMoney1 {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public OnMoney1(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnMoney1(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney1)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney1 onMoney1 = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, onMoney1.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, onMoney1.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney1 copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney1(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney1 copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney1 onMoney1, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = onMoney1.currencyCode;
            }
            if ((i & 2) != 0) {
                str = onMoney1.value;
            }
            return onMoney1.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$SuggestedDepositAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney2;", "onMoney", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney2;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney2;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney2;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$SuggestedDepositAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney2;", "getOnMoney"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SuggestedDepositAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney2 onMoney;

        public SuggestedDepositAmount(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney2 onMoney2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onMoney = onMoney2;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney2 getOnMoney() {
            return this.onMoney;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney2 onMoney2 = this.onMoney;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SuggestedDepositAmount(__typename=");
            sb.append(str);
            sb.append(", onMoney=");
            sb.append(onMoney2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney2 onMoney2 = this.onMoney;
            return (hashCode * 31) + (onMoney2 == null ? 0 : onMoney2.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedDepositAmount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedDepositAmount suggestedDepositAmount = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedDepositAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, suggestedDepositAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onMoney, suggestedDepositAmount.onMoney);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedDepositAmount copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney2 onMoney) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedDepositAmount(__typename, onMoney);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney2 getOnMoney() {
            return this.onMoney;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedDepositAmount copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedDepositAmount suggestedDepositAmount, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney2 onMoney2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = suggestedDepositAmount.__typename;
            }
            if ((i & 2) != 0) {
                onMoney2 = suggestedDepositAmount.onMoney;
            }
            return suggestedDepositAmount.copy(str, onMoney2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney2;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnMoney2;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMoney2 {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public OnMoney2(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnMoney2(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney2)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney2 onMoney2 = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney2) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, onMoney2.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, onMoney2.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney2 copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney2(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney2 copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney2 onMoney2, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = onMoney2.currencyCode;
            }
            if ((i & 2) != 0) {
                str = onMoney2.value;
            }
            return onMoney2.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$SuggestedAction;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnTransferActionStandardDeposit;", "onTransferActionStandardDeposit", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnTransferActionStandardWithdrawal;", "onTransferActionStandardWithdrawal", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnTransferActionStandardDeposit;Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnTransferActionStandardWithdrawal;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnTransferActionStandardDeposit;", "component3", "()Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnTransferActionStandardWithdrawal;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnTransferActionStandardDeposit;Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnTransferActionStandardWithdrawal;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$SuggestedAction;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnTransferActionStandardDeposit;", "getOnTransferActionStandardDeposit", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnTransferActionStandardWithdrawal;", "getOnTransferActionStandardWithdrawal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SuggestedAction {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardDeposit onTransferActionStandardDeposit;
        private final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardWithdrawal onTransferActionStandardWithdrawal;

        public SuggestedAction(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardDeposit onTransferActionStandardDeposit, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardWithdrawal onTransferActionStandardWithdrawal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onTransferActionStandardDeposit = onTransferActionStandardDeposit;
            this.onTransferActionStandardWithdrawal = onTransferActionStandardWithdrawal;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardDeposit getOnTransferActionStandardDeposit() {
            return this.onTransferActionStandardDeposit;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardWithdrawal getOnTransferActionStandardWithdrawal() {
            return this.onTransferActionStandardWithdrawal;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardDeposit onTransferActionStandardDeposit = this.onTransferActionStandardDeposit;
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardWithdrawal onTransferActionStandardWithdrawal = this.onTransferActionStandardWithdrawal;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SuggestedAction(__typename=");
            sb.append(str);
            sb.append(", onTransferActionStandardDeposit=");
            sb.append(onTransferActionStandardDeposit);
            sb.append(", onTransferActionStandardWithdrawal=");
            sb.append(onTransferActionStandardWithdrawal);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardDeposit onTransferActionStandardDeposit = this.onTransferActionStandardDeposit;
            int hashCode2 = onTransferActionStandardDeposit == null ? 0 : onTransferActionStandardDeposit.hashCode();
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardWithdrawal onTransferActionStandardWithdrawal = this.onTransferActionStandardWithdrawal;
            return (((hashCode * 31) + hashCode2) * 31) + (onTransferActionStandardWithdrawal != null ? onTransferActionStandardWithdrawal.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedAction)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedAction suggestedAction = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedAction) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, suggestedAction.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onTransferActionStandardDeposit, suggestedAction.onTransferActionStandardDeposit) && kotlin.jvm.internal.Intrinsics.areEqual(this.onTransferActionStandardWithdrawal, suggestedAction.onTransferActionStandardWithdrawal);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedAction copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardDeposit onTransferActionStandardDeposit, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardWithdrawal onTransferActionStandardWithdrawal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedAction(__typename, onTransferActionStandardDeposit, onTransferActionStandardWithdrawal);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardWithdrawal getOnTransferActionStandardWithdrawal() {
            return this.onTransferActionStandardWithdrawal;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardDeposit getOnTransferActionStandardDeposit() {
            return this.onTransferActionStandardDeposit;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedAction copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedAction suggestedAction, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardDeposit onTransferActionStandardDeposit, com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardWithdrawal onTransferActionStandardWithdrawal, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = suggestedAction.__typename;
            }
            if ((i & 2) != 0) {
                onTransferActionStandardDeposit = suggestedAction.onTransferActionStandardDeposit;
            }
            if ((i & 4) != 0) {
                onTransferActionStandardWithdrawal = suggestedAction.onTransferActionStandardWithdrawal;
            }
            return suggestedAction.copy(str, onTransferActionStandardDeposit, onTransferActionStandardWithdrawal);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnTransferActionStandardDeposit;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CIPStatus;", "cipStatus", "", "Lcom/paypal/oslo/api/graphql/schema/type/TransferRemedialStep;", "remedialSteps", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CIPStatus;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CIPStatus;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CIPStatus;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnTransferActionStandardDeposit;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/CIPStatus;", "getCipStatus", "Ljava/util/List;", "getRemedialSteps"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTransferActionStandardDeposit {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.CIPStatus cipStatus;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep> remedialSteps;

        /* JADX WARN: Multi-variable type inference failed */
        public OnTransferActionStandardDeposit(com.paypal.oslo.api.graphql.schema.type.CIPStatus cIPStatus, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.cipStatus = cIPStatus;
            this.remedialSteps = list;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CIPStatus getCipStatus() {
            return this.cipStatus;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep> getRemedialSteps() {
            return this.remedialSteps;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.CIPStatus cIPStatus = this.cipStatus;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep> list = this.remedialSteps;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnTransferActionStandardDeposit(cipStatus=");
            sb.append(cIPStatus);
            sb.append(", remedialSteps=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.CIPStatus cIPStatus = this.cipStatus;
            return ((cIPStatus == null ? 0 : cIPStatus.hashCode()) * 31) + this.remedialSteps.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardDeposit)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardDeposit onTransferActionStandardDeposit = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardDeposit) other;
            return this.cipStatus == onTransferActionStandardDeposit.cipStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.remedialSteps, onTransferActionStandardDeposit.remedialSteps);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardDeposit copy(com.paypal.oslo.api.graphql.schema.type.CIPStatus cipStatus, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep> remedialSteps) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remedialSteps, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardDeposit(cipStatus, remedialSteps);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep> component2() {
            return this.remedialSteps;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CIPStatus getCipStatus() {
            return this.cipStatus;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardDeposit copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardDeposit onTransferActionStandardDeposit, com.paypal.oslo.api.graphql.schema.type.CIPStatus cIPStatus, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cIPStatus = onTransferActionStandardDeposit.cipStatus;
            }
            if ((i & 2) != 0) {
                list = onTransferActionStandardDeposit.remedialSteps;
            }
            return onTransferActionStandardDeposit.copy(cIPStatus, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnTransferActionStandardWithdrawal;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CIPStatus;", "cipStatus", "", "Lcom/paypal/oslo/api/graphql/schema/type/TransferRemedialStep;", "remedialSteps", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CIPStatus;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CIPStatus;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CIPStatus;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$OnTransferActionStandardWithdrawal;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/CIPStatus;", "getCipStatus", "Ljava/util/List;", "getRemedialSteps"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTransferActionStandardWithdrawal {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.CIPStatus cipStatus;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep> remedialSteps;

        /* JADX WARN: Multi-variable type inference failed */
        public OnTransferActionStandardWithdrawal(com.paypal.oslo.api.graphql.schema.type.CIPStatus cIPStatus, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.cipStatus = cIPStatus;
            this.remedialSteps = list;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CIPStatus getCipStatus() {
            return this.cipStatus;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep> getRemedialSteps() {
            return this.remedialSteps;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.CIPStatus cIPStatus = this.cipStatus;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep> list = this.remedialSteps;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnTransferActionStandardWithdrawal(cipStatus=");
            sb.append(cIPStatus);
            sb.append(", remedialSteps=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.CIPStatus cIPStatus = this.cipStatus;
            return ((cIPStatus == null ? 0 : cIPStatus.hashCode()) * 31) + this.remedialSteps.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardWithdrawal)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardWithdrawal onTransferActionStandardWithdrawal = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardWithdrawal) other;
            return this.cipStatus == onTransferActionStandardWithdrawal.cipStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.remedialSteps, onTransferActionStandardWithdrawal.remedialSteps);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardWithdrawal copy(com.paypal.oslo.api.graphql.schema.type.CIPStatus cipStatus, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep> remedialSteps) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remedialSteps, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardWithdrawal(cipStatus, remedialSteps);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep> component2() {
            return this.remedialSteps;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CIPStatus getCipStatus() {
            return this.cipStatus;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardWithdrawal copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardWithdrawal onTransferActionStandardWithdrawal, com.paypal.oslo.api.graphql.schema.type.CIPStatus cIPStatus, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cIPStatus = onTransferActionStandardWithdrawal.cipStatus;
            }
            if ((i & 2) != 0) {
                list = onTransferActionStandardWithdrawal.remedialSteps;
            }
            return onTransferActionStandardWithdrawal.copy(cIPStatus, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetTransferCapabilitiesEvaluation($input: TransferCapabilitiesEvaluationInput!) { transferCapabilitiesEvaluation(input: $input) { productFlow { identifier transferChannel subFlow } capabilities { tenant withdrawalCapabilities { withdrawalCapabilities { type status supportedInstruments { instrumentType estimatedWithdrawalTime { maxDuration minDuration maxFundsTransferTime } } } suggestedWithdrawalAmounts { __typename ... on Money { currencyCode value } } } depositCapabilities { depositCapabilities { type status supportedInstruments { instrumentType estimatedDepositTime { maxDuration minDuration maxFundsTransferTime } } } recommendedAmount { __typename ... on Money { currencyCode value } } suggestedDepositAmounts { __typename ... on Money { currencyCode value } } } } suggestedActions { __typename ... on TransferActionStandardDeposit { cipStatus remedialSteps } ... on TransferActionStandardWithdrawal { cipStatus remedialSteps } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.TransferCapabilitiesEvaluationInput transferCapabilitiesEvaluationInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetTransferCapabilitiesEvaluationQuery(input=");
        sb.append(transferCapabilitiesEvaluationInput);
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
        return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery) other).input);
    }

    public final com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery copy(com.paypal.oslo.api.graphql.schema.type.TransferCapabilitiesEvaluationInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.TransferCapabilitiesEvaluationInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery copy$default(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery getTransferCapabilitiesEvaluationQuery, com.paypal.oslo.api.graphql.schema.type.TransferCapabilitiesEvaluationInput transferCapabilitiesEvaluationInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            transferCapabilitiesEvaluationInput = getTransferCapabilitiesEvaluationQuery.input;
        }
        return getTransferCapabilitiesEvaluationQuery.copy(transferCapabilitiesEvaluationInput);
    }
}
