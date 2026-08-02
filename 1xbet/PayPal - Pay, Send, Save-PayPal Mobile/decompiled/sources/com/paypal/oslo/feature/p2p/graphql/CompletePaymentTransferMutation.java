package com.paypal.oslo.feature.p2p.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\r*+,-./012345)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CompletePendingPaymentTransferInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CompletePendingPaymentTransferInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CompletePendingPaymentTransferInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CompletePendingPaymentTransferInput;)Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CompletePendingPaymentTransferInput;", "getInput", "Companion", "Data", "CompletePendingPaymentTransfer", "OnPaymentTransfer", "TransferAmount", "Note", "Media", "Receiver", "Name", "OnPersonName", "OnBusinessName", com.paypal.oslo.feature.p2p.domain.model.Disclosure.TYPENAME_PREFIX_PAYMENT_LINK, "Disclosure"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CompletePaymentTransferMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Data> {
    public static final java.lang.String OPERATION_ID = "4399109d4a83c09de41d5f9d7c7837d0f44b847a4ea4b7e9c8f12500209b0eb2";
    public static final java.lang.String OPERATION_NAME = "CompletePaymentTransfer";
    private final com.paypal.oslo.api.graphql.schema.type.CompletePendingPaymentTransferInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Companion INSTANCE = new com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Companion(null);
    public static final int $stable = 8;

    public CompletePaymentTransferMutation(com.paypal.oslo.api.graphql.schema.type.CompletePendingPaymentTransferInput completePendingPaymentTransferInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completePendingPaymentTransferInput, "");
        this.input = completePendingPaymentTransferInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CompletePendingPaymentTransferInput getInput() {
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
        com.paypal.oslo.feature.p2p.graphql.adapter.CompletePaymentTransferMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.CompletePaymentTransferMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.p2p.graphql.selections.CompletePaymentTransferMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$CompletePendingPaymentTransfer;", "completePendingPaymentTransfer", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$CompletePendingPaymentTransfer;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$CompletePendingPaymentTransfer;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$CompletePendingPaymentTransfer;)Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$CompletePendingPaymentTransfer;", "getCompletePendingPaymentTransfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.CompletePendingPaymentTransfer completePendingPaymentTransfer;

        public Data(com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.CompletePendingPaymentTransfer completePendingPaymentTransfer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completePendingPaymentTransfer, "");
            this.completePendingPaymentTransfer = completePendingPaymentTransfer;
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.CompletePendingPaymentTransfer getCompletePendingPaymentTransfer() {
            return this.completePendingPaymentTransfer;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.CompletePendingPaymentTransfer completePendingPaymentTransfer = this.completePendingPaymentTransfer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(completePendingPaymentTransfer=");
            sb.append(completePendingPaymentTransfer);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.completePendingPaymentTransfer.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.completePendingPaymentTransfer, ((com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Data) other).completePendingPaymentTransfer);
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Data copy(com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.CompletePendingPaymentTransfer completePendingPaymentTransfer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completePendingPaymentTransfer, "");
            return new com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Data(completePendingPaymentTransfer);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.CompletePendingPaymentTransfer getCompletePendingPaymentTransfer() {
            return this.completePendingPaymentTransfer;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Data copy$default(com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Data data, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.CompletePendingPaymentTransfer completePendingPaymentTransfer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                completePendingPaymentTransfer = data.completePendingPaymentTransfer;
            }
            return data.copy(completePendingPaymentTransfer);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$CompletePendingPaymentTransfer;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnPaymentTransfer;", "onPaymentTransfer", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnPaymentTransfer;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnPaymentTransfer;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnPaymentTransfer;)Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$CompletePendingPaymentTransfer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnPaymentTransfer;", "getOnPaymentTransfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class CompletePendingPaymentTransfer {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPaymentTransfer onPaymentTransfer;

        public CompletePendingPaymentTransfer(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPaymentTransfer onPaymentTransfer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPaymentTransfer, "");
            this.__typename = str;
            this.onPaymentTransfer = onPaymentTransfer;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPaymentTransfer getOnPaymentTransfer() {
            return this.onPaymentTransfer;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPaymentTransfer onPaymentTransfer = this.onPaymentTransfer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CompletePendingPaymentTransfer(__typename=");
            sb.append(str);
            sb.append(", onPaymentTransfer=");
            sb.append(onPaymentTransfer);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.onPaymentTransfer.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.CompletePendingPaymentTransfer)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.CompletePendingPaymentTransfer completePendingPaymentTransfer = (com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.CompletePendingPaymentTransfer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, completePendingPaymentTransfer.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPaymentTransfer, completePendingPaymentTransfer.onPaymentTransfer);
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.CompletePendingPaymentTransfer copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPaymentTransfer onPaymentTransfer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPaymentTransfer, "");
            return new com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.CompletePendingPaymentTransfer(__typename, onPaymentTransfer);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPaymentTransfer getOnPaymentTransfer() {
            return this.onPaymentTransfer;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.CompletePendingPaymentTransfer copy$default(com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.CompletePendingPaymentTransfer completePendingPaymentTransfer, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPaymentTransfer onPaymentTransfer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = completePendingPaymentTransfer.__typename;
            }
            if ((i & 2) != 0) {
                onPaymentTransfer = completePendingPaymentTransfer.onPaymentTransfer;
            }
            return completePendingPaymentTransfer.copy(str, onPaymentTransfer);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0082\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u00104\u001a\u0004\b5\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b6\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b7\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b9\u0010\u001bR \u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010>\u0012\u0004\b@\u0010=\u001a\u0004\b?\u0010\u001fR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010!R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010%R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010G\u001a\u0004\bH\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnPaymentTransfer;", "", "transactionID", "receiverTransactionId", "createTime", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferStatus;", "paymentStatus", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$TransferAmount;", "transferAmount", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Note;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE, "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Receiver;", "receiver", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;", "selectedTransferType", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$PaymentLink;", "paymentLink", "", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Disclosure;", "disclosures", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferStatus;Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$TransferAmount;Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Note;Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Receiver;Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$PaymentLink;Ljava/util/List;)V", "component1", "()Ljava/lang/Object;", "component2", "component3", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferStatus;", "component5", "()Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$TransferAmount;", "component6", "()Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Note;", "component7", "()Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Receiver;", "component8", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;", "component9", "()Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$PaymentLink;", "component10", "()Ljava/util/List;", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferStatus;Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$TransferAmount;Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Note;Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Receiver;Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$PaymentLink;Ljava/util/List;)Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnPaymentTransfer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getTransactionID", "getReceiverTransactionId", "getCreateTime", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferStatus;", "getPaymentStatus", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$TransferAmount;", "getTransferAmount", "getTransferAmount$annotations", "()V", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Note;", "getNote", "getNote$annotations", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Receiver;", "getReceiver", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;", "getSelectedTransferType", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$PaymentLink;", "getPaymentLink", "Ljava/util/List;", "getDisclosures"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPaymentTransfer {
        public static final int $stable = 8;
        private final java.lang.Object createTime;
        private final java.util.List<com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Disclosure> disclosures;
        private final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Note note;
        private final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.PaymentLink paymentLink;
        private final com.paypal.oslo.api.graphql.schema.type.PaymentTransferStatus paymentStatus;
        private final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Receiver receiver;
        private final java.lang.Object receiverTransactionId;
        private final com.paypal.oslo.api.graphql.schema.type.PaymentTransferType selectedTransferType;
        private final java.lang.Object transactionID;
        private final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.TransferAmount transferAmount;

        @kotlin.Deprecated(message = "Use paymentTransferNote field instead")
        public static /* synthetic */ void getNote$annotations() {
        }

        @kotlin.Deprecated(message = "Use `amount` instead.")
        public static /* synthetic */ void getTransferAmount$annotations() {
        }

        public OnPaymentTransfer(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, com.paypal.oslo.api.graphql.schema.type.PaymentTransferStatus paymentTransferStatus, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.TransferAmount transferAmount, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Note note, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Receiver receiver, com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.PaymentLink paymentLink, java.util.List<com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Disclosure> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiver, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferType, "");
            this.transactionID = obj;
            this.receiverTransactionId = obj2;
            this.createTime = obj3;
            this.paymentStatus = paymentTransferStatus;
            this.transferAmount = transferAmount;
            this.note = note;
            this.receiver = receiver;
            this.selectedTransferType = paymentTransferType;
            this.paymentLink = paymentLink;
            this.disclosures = list;
        }

        public final java.lang.Object getTransactionID() {
            return this.transactionID;
        }

        public final java.lang.Object getReceiverTransactionId() {
            return this.receiverTransactionId;
        }

        public final java.lang.Object getCreateTime() {
            return this.createTime;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferStatus getPaymentStatus() {
            return this.paymentStatus;
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.TransferAmount getTransferAmount() {
            return this.transferAmount;
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Note getNote() {
            return this.note;
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Receiver getReceiver() {
            return this.receiver;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferType getSelectedTransferType() {
            return this.selectedTransferType;
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.PaymentLink getPaymentLink() {
            return this.paymentLink;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Disclosure> getDisclosures() {
            return this.disclosures;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.transactionID;
            java.lang.Object obj2 = this.receiverTransactionId;
            java.lang.Object obj3 = this.createTime;
            com.paypal.oslo.api.graphql.schema.type.PaymentTransferStatus paymentTransferStatus = this.paymentStatus;
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.TransferAmount transferAmount = this.transferAmount;
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Note note = this.note;
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Receiver receiver = this.receiver;
            com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType = this.selectedTransferType;
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.PaymentLink paymentLink = this.paymentLink;
            java.util.List<com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Disclosure> list = this.disclosures;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPaymentTransfer(transactionID=");
            sb.append(obj);
            sb.append(", receiverTransactionId=");
            sb.append(obj2);
            sb.append(", createTime=");
            sb.append(obj3);
            sb.append(", paymentStatus=");
            sb.append(paymentTransferStatus);
            sb.append(", transferAmount=");
            sb.append(transferAmount);
            sb.append(", note=");
            sb.append(note);
            sb.append(", receiver=");
            sb.append(receiver);
            sb.append(", selectedTransferType=");
            sb.append(paymentTransferType);
            sb.append(", paymentLink=");
            sb.append(paymentLink);
            sb.append(", disclosures=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.transactionID.hashCode();
            java.lang.Object obj = this.receiverTransactionId;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            int hashCode3 = this.createTime.hashCode();
            int hashCode4 = this.paymentStatus.hashCode();
            int hashCode5 = this.transferAmount.hashCode();
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Note note = this.note;
            int hashCode6 = note == null ? 0 : note.hashCode();
            int hashCode7 = this.receiver.hashCode();
            int hashCode8 = this.selectedTransferType.hashCode();
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.PaymentLink paymentLink = this.paymentLink;
            int hashCode9 = paymentLink == null ? 0 : paymentLink.hashCode();
            java.util.List<com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Disclosure> list = this.disclosures;
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPaymentTransfer)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPaymentTransfer onPaymentTransfer = (com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPaymentTransfer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionID, onPaymentTransfer.transactionID) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiverTransactionId, onPaymentTransfer.receiverTransactionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.createTime, onPaymentTransfer.createTime) && this.paymentStatus == onPaymentTransfer.paymentStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.transferAmount, onPaymentTransfer.transferAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.note, onPaymentTransfer.note) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiver, onPaymentTransfer.receiver) && this.selectedTransferType == onPaymentTransfer.selectedTransferType && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentLink, onPaymentTransfer.paymentLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.disclosures, onPaymentTransfer.disclosures);
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPaymentTransfer copy(java.lang.Object transactionID, java.lang.Object receiverTransactionId, java.lang.Object createTime, com.paypal.oslo.api.graphql.schema.type.PaymentTransferStatus paymentStatus, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.TransferAmount transferAmount, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Note note, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Receiver receiver, com.paypal.oslo.api.graphql.schema.type.PaymentTransferType selectedTransferType, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.PaymentLink paymentLink, java.util.List<com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Disclosure> disclosures) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionID, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createTime, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiver, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedTransferType, "");
            return new com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPaymentTransfer(transactionID, receiverTransactionId, createTime, paymentStatus, transferAmount, note, receiver, selectedTransferType, paymentLink, disclosures);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.PaymentLink getPaymentLink() {
            return this.paymentLink;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferType getSelectedTransferType() {
            return this.selectedTransferType;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Receiver getReceiver() {
            return this.receiver;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Note getNote() {
            return this.note;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.TransferAmount getTransferAmount() {
            return this.transferAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferStatus getPaymentStatus() {
            return this.paymentStatus;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getCreateTime() {
            return this.createTime;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getReceiverTransactionId() {
            return this.receiverTransactionId;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Disclosure> component10() {
            return this.disclosures;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getTransactionID() {
            return this.transactionID;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$TransferAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$TransferAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransferAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TransferAmount(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.currencyCode = obj;
            this.value = str;
            this.__typename = str2;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.String str2 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferAmount(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(", __typename=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.currencyCode.hashCode() * 31) + this.value.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.TransferAmount)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.TransferAmount transferAmount = (com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.TransferAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, transferAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, transferAmount.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, transferAmount.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.TransferAmount copy(java.lang.Object currencyCode, java.lang.String value, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.TransferAmount(currencyCode, value, __typename);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.TransferAmount copy$default(com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.TransferAmount transferAmount, java.lang.Object obj, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = transferAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = transferAmount.value;
            }
            if ((i & 4) != 0) {
                str2 = transferAmount.__typename;
            }
            return transferAmount.copy(obj, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ2\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Note;", "", "", "memo", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Media;", io.ktor.http.LinkHeader.Parameters.Media, "__typename", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Media;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Media;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Media;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Note;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMemo", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Media;", "getMedia", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Note {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Media media;
        private final java.lang.String memo;

        public Note(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Media media, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.memo = str;
            this.media = media;
            this.__typename = str2;
        }

        public final java.lang.String getMemo() {
            return this.memo;
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Media getMedia() {
            return this.media;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.memo;
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Media media = this.media;
            java.lang.String str2 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Note(memo=");
            sb.append(str);
            sb.append(", media=");
            sb.append(media);
            sb.append(", __typename=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.memo;
            int hashCode = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Media media = this.media;
            return (((hashCode * 31) + (media != null ? media.hashCode() : 0)) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Note)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Note note = (com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Note) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.memo, note.memo) && kotlin.jvm.internal.Intrinsics.areEqual(this.media, note.media) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, note.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Note copy(java.lang.String memo, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Media media, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Note(memo, media, __typename);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Media getMedia() {
            return this.media;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMemo() {
            return this.memo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Note copy$default(com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Note note, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Media media, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = note.memo;
            }
            if ((i & 2) != 0) {
                media = note.media;
            }
            if ((i & 4) != 0) {
                str2 = note.__typename;
            }
            return note.copy(str, media, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\fJB\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b#\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b$\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Media;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;", "provider", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "referenceUrl", "__typename", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;", "component3", "()Ljava/lang/Object;", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Media;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;", "getProvider", "Ljava/lang/Object;", "getContentType", "getReferenceUrl", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Media {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object contentType;
        private final java.lang.String id;
        private final com.paypal.oslo.api.graphql.schema.type.MediaProvider provider;
        private final java.lang.Object referenceUrl;

        public Media(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MediaProvider mediaProvider, java.lang.Object obj, java.lang.Object obj2, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaProvider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.provider = mediaProvider;
            this.contentType = obj;
            this.referenceUrl = obj2;
            this.__typename = str2;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MediaProvider getProvider() {
            return this.provider;
        }

        public final java.lang.Object getContentType() {
            return this.contentType;
        }

        public final java.lang.Object getReferenceUrl() {
            return this.referenceUrl;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.MediaProvider mediaProvider = this.provider;
            java.lang.Object obj = this.contentType;
            java.lang.Object obj2 = this.referenceUrl;
            java.lang.String str2 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Media(id=");
            sb.append(str);
            sb.append(", provider=");
            sb.append(mediaProvider);
            sb.append(", contentType=");
            sb.append(obj);
            sb.append(", referenceUrl=");
            sb.append(obj2);
            sb.append(", __typename=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.id.hashCode() * 31) + this.provider.hashCode()) * 31) + this.contentType.hashCode()) * 31) + this.referenceUrl.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Media)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Media media = (com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Media) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, media.id) && this.provider == media.provider && kotlin.jvm.internal.Intrinsics.areEqual(this.contentType, media.contentType) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceUrl, media.referenceUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, media.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Media copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.MediaProvider provider, java.lang.Object contentType, java.lang.Object referenceUrl, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Media(id, provider, contentType, referenceUrl, __typename);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getReferenceUrl() {
            return this.referenceUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getContentType() {
            return this.contentType;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.MediaProvider getProvider() {
            return this.provider;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Media copy$default(com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Media media, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MediaProvider mediaProvider, java.lang.Object obj, java.lang.Object obj2, java.lang.String str2, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                str = media.id;
            }
            if ((i & 2) != 0) {
                mediaProvider = media.provider;
            }
            com.paypal.oslo.api.graphql.schema.type.MediaProvider mediaProvider2 = mediaProvider;
            if ((i & 4) != 0) {
                obj = media.contentType;
            }
            java.lang.Object obj4 = obj;
            if ((i & 8) != 0) {
                obj2 = media.referenceUrl;
            }
            java.lang.Object obj5 = obj2;
            if ((i & 16) != 0) {
                str2 = media.__typename;
            }
            return media.copy(str, mediaProvider2, obj4, obj5, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000eJR\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b)\u0010\u0010R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b*\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Receiver;", "", "", "accountId", "id", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentReceiverType;", "type", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Name;", "name", "profilePhotoUrl", "__typename", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PaymentReceiverType;Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Name;Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentReceiverType;", "component4", "()Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Name;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PaymentReceiverType;Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Name;Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Receiver;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccountId", "Ljava/lang/Object;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentReceiverType;", "getType", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Name;", "getName", "getProfilePhotoUrl", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Receiver {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.String accountId;
        private final java.lang.Object id;
        private final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Name name;
        private final java.lang.Object profilePhotoUrl;
        private final com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType type;

        public Receiver(java.lang.String str, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType paymentReceiverType, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Name name2, java.lang.Object obj2, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReceiverType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.accountId = str;
            this.id = obj;
            this.type = paymentReceiverType;
            this.name = name2;
            this.profilePhotoUrl = obj2;
            this.__typename = str2;
        }

        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public final java.lang.Object getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType getType() {
            return this.type;
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Name getName() {
            return this.name;
        }

        public final java.lang.Object getProfilePhotoUrl() {
            return this.profilePhotoUrl;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.accountId;
            java.lang.Object obj = this.id;
            com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType paymentReceiverType = this.type;
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Name name2 = this.name;
            java.lang.Object obj2 = this.profilePhotoUrl;
            java.lang.String str2 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Receiver(accountId=");
            sb.append(str);
            sb.append(", id=");
            sb.append(obj);
            sb.append(", type=");
            sb.append(paymentReceiverType);
            sb.append(", name=");
            sb.append(name2);
            sb.append(", profilePhotoUrl=");
            sb.append(obj2);
            sb.append(", __typename=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.accountId;
            int hashCode = str == null ? 0 : str.hashCode();
            int hashCode2 = this.id.hashCode();
            int hashCode3 = this.type.hashCode();
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Name name2 = this.name;
            int hashCode4 = name2 == null ? 0 : name2.hashCode();
            java.lang.Object obj = this.profilePhotoUrl;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (obj != null ? obj.hashCode() : 0)) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Receiver)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Receiver receiver = (com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Receiver) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, receiver.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, receiver.id) && this.type == receiver.type && kotlin.jvm.internal.Intrinsics.areEqual(this.name, receiver.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePhotoUrl, receiver.profilePhotoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, receiver.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Receiver copy(java.lang.String accountId, java.lang.Object id, com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType type, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Name name2, java.lang.Object profilePhotoUrl, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Receiver(accountId, id, type, name2, profilePhotoUrl, __typename);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getProfilePhotoUrl() {
            return this.profilePhotoUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Name getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getId() {
            return this.id;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Receiver copy$default(com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Receiver receiver, java.lang.String str, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType paymentReceiverType, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Name name2, java.lang.Object obj2, java.lang.String str2, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                str = receiver.accountId;
            }
            if ((i & 2) != 0) {
                obj = receiver.id;
            }
            java.lang.Object obj4 = obj;
            if ((i & 4) != 0) {
                paymentReceiverType = receiver.type;
            }
            com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType paymentReceiverType2 = paymentReceiverType;
            if ((i & 8) != 0) {
                name2 = receiver.name;
            }
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Name name3 = name2;
            if ((i & 16) != 0) {
                obj2 = receiver.profilePhotoUrl;
            }
            java.lang.Object obj5 = obj2;
            if ((i & 32) != 0) {
                str2 = receiver.__typename;
            }
            return receiver.copy(str, obj4, paymentReceiverType2, name3, obj5, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Name;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnPersonName;", "onPersonName", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnBusinessName;", "onBusinessName", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnPersonName;Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnBusinessName;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnPersonName;", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnBusinessName;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnPersonName;Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnBusinessName;)Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Name;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnPersonName;", "getOnPersonName", "Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnBusinessName;", "getOnBusinessName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Name {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnBusinessName onBusinessName;
        private final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPersonName onPersonName;

        public Name(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPersonName onPersonName, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnBusinessName onBusinessName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onPersonName = onPersonName;
            this.onBusinessName = onBusinessName;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPersonName getOnPersonName() {
            return this.onPersonName;
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnBusinessName getOnBusinessName() {
            return this.onBusinessName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPersonName onPersonName = this.onPersonName;
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnBusinessName onBusinessName = this.onBusinessName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Name(__typename=");
            sb.append(str);
            sb.append(", onPersonName=");
            sb.append(onPersonName);
            sb.append(", onBusinessName=");
            sb.append(onBusinessName);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPersonName onPersonName = this.onPersonName;
            int hashCode2 = onPersonName == null ? 0 : onPersonName.hashCode();
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnBusinessName onBusinessName = this.onBusinessName;
            return (((hashCode * 31) + hashCode2) * 31) + (onBusinessName != null ? onBusinessName.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Name)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Name name2 = (com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Name) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, name2.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPersonName, name2.onPersonName) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBusinessName, name2.onBusinessName);
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Name copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPersonName onPersonName, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnBusinessName onBusinessName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Name(__typename, onPersonName, onBusinessName);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnBusinessName getOnBusinessName() {
            return this.onBusinessName;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPersonName getOnPersonName() {
            return this.onPersonName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Name copy$default(com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Name name2, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPersonName onPersonName, com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnBusinessName onBusinessName, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = name2.__typename;
            }
            if ((i & 2) != 0) {
                onPersonName = name2.onPersonName;
            }
            if ((i & 4) != 0) {
                onBusinessName = name2.onBusinessName;
            }
            return name2.copy(str, onPersonName, onBusinessName);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJn\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b%\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b&\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b'\u0010\u000eR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b(\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnPersonName;", "", "", "prefix", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "secondSurname", com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "suffix", "fullName", "__typename", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnPersonName;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPrefix", "getGivenName", "getSurname", "getSecondSurname", "getMiddleName", "getSuffix", "getFullName", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class OnPersonName {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final java.lang.String fullName;
        private final java.lang.String givenName;
        private final java.lang.String middleName;
        private final java.lang.String prefix;
        private final java.lang.String secondSurname;
        private final java.lang.String suffix;
        private final java.lang.String surname;

        public OnPersonName(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
            this.prefix = str;
            this.givenName = str2;
            this.surname = str3;
            this.secondSurname = str4;
            this.middleName = str5;
            this.suffix = str6;
            this.fullName = str7;
            this.__typename = str8;
        }

        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public final java.lang.String getSurname() {
            return this.surname;
        }

        public final java.lang.String getSecondSurname() {
            return this.secondSurname;
        }

        public final java.lang.String getMiddleName() {
            return this.middleName;
        }

        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.prefix;
            java.lang.String str2 = this.givenName;
            java.lang.String str3 = this.surname;
            java.lang.String str4 = this.secondSurname;
            java.lang.String str5 = this.middleName;
            java.lang.String str6 = this.suffix;
            java.lang.String str7 = this.fullName;
            java.lang.String str8 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPersonName(prefix=");
            sb.append(str);
            sb.append(", givenName=");
            sb.append(str2);
            sb.append(", surname=");
            sb.append(str3);
            sb.append(", secondSurname=");
            sb.append(str4);
            sb.append(", middleName=");
            sb.append(str5);
            sb.append(", suffix=");
            sb.append(str6);
            sb.append(", fullName=");
            sb.append(str7);
            sb.append(", __typename=");
            sb.append(str8);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.prefix;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.givenName;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.surname;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.secondSurname;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.middleName;
            int hashCode5 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.suffix;
            int hashCode6 = str6 == null ? 0 : str6.hashCode();
            java.lang.String str7 = this.fullName;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str7 != null ? str7.hashCode() : 0)) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPersonName)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPersonName onPersonName = (com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPersonName) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.prefix, onPersonName.prefix) && kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, onPersonName.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, onPersonName.surname) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondSurname, onPersonName.secondSurname) && kotlin.jvm.internal.Intrinsics.areEqual(this.middleName, onPersonName.middleName) && kotlin.jvm.internal.Intrinsics.areEqual(this.suffix, onPersonName.suffix) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, onPersonName.fullName) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onPersonName.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPersonName copy(java.lang.String prefix, java.lang.String givenName, java.lang.String surname, java.lang.String secondSurname, java.lang.String middleName, java.lang.String suffix, java.lang.String fullName, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnPersonName(prefix, givenName, surname, secondSurname, middleName, suffix, fullName, __typename);
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getFullName() {
            return this.fullName;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getMiddleName() {
            return this.middleName;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getSecondSurname() {
            return this.secondSurname;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSurname() {
            return this.surname;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPrefix() {
            return this.prefix;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnBusinessName;", "", "", "businessName", "Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "orthography", "__typename", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/Orthography;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/Orthography;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$OnBusinessName;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBusinessName", "Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "getOrthography", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class OnBusinessName {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final java.lang.String businessName;
        private final com.paypal.oslo.api.graphql.schema.type.Orthography orthography;

        public OnBusinessName(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.Orthography orthography, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.businessName = str;
            this.orthography = orthography;
            this.__typename = str2;
        }

        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public final com.paypal.oslo.api.graphql.schema.type.Orthography getOrthography() {
            return this.orthography;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.businessName;
            com.paypal.oslo.api.graphql.schema.type.Orthography orthography = this.orthography;
            java.lang.String str2 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBusinessName(businessName=");
            sb.append(str);
            sb.append(", orthography=");
            sb.append(orthography);
            sb.append(", __typename=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.businessName.hashCode();
            com.paypal.oslo.api.graphql.schema.type.Orthography orthography = this.orthography;
            return (((hashCode * 31) + (orthography == null ? 0 : orthography.hashCode())) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnBusinessName)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnBusinessName onBusinessName = (com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnBusinessName) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.businessName, onBusinessName.businessName) && this.orthography == onBusinessName.orthography && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBusinessName.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnBusinessName copy(java.lang.String businessName, com.paypal.oslo.api.graphql.schema.type.Orthography orthography, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnBusinessName(businessName, orthography, __typename);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.Orthography getOrthography() {
            return this.orthography;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnBusinessName copy$default(com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.OnBusinessName onBusinessName, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.Orthography orthography, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBusinessName.businessName;
            }
            if ((i & 2) != 0) {
                orthography = onBusinessName.orthography;
            }
            if ((i & 4) != 0) {
                str2 = onBusinessName.__typename;
            }
            return onBusinessName.copy(str, orthography, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$PaymentLink;", "", "url", "expirationTime", "", "__typename", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$PaymentLink;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getUrl", "getExpirationTime", "Ljava/lang/String;", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentLink {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object expirationTime;
        private final java.lang.Object url;

        public PaymentLink(java.lang.Object obj, java.lang.Object obj2, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = obj;
            this.expirationTime = obj2;
            this.__typename = str;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final java.lang.Object getExpirationTime() {
            return this.expirationTime;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.url;
            java.lang.Object obj2 = this.expirationTime;
            java.lang.String str = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentLink(url=");
            sb.append(obj);
            sb.append(", expirationTime=");
            sb.append(obj2);
            sb.append(", __typename=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.url;
            return ((((obj == null ? 0 : obj.hashCode()) * 31) + this.expirationTime.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.PaymentLink)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.PaymentLink paymentLink = (com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.PaymentLink) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, paymentLink.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationTime, paymentLink.expirationTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, paymentLink.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.PaymentLink copy(java.lang.Object url, java.lang.Object expirationTime, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expirationTime, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.PaymentLink(url, expirationTime, __typename);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getExpirationTime() {
            return this.expirationTime;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.PaymentLink copy$default(com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.PaymentLink paymentLink, java.lang.Object obj, java.lang.Object obj2, java.lang.String str, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                obj = paymentLink.url;
            }
            if ((i & 2) != 0) {
                obj2 = paymentLink.expirationTime;
            }
            if ((i & 4) != 0) {
                str = paymentLink.__typename;
            }
            return paymentLink.copy(obj, obj2, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Disclosure;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment;", "postTransferDisclosureFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment;)Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Disclosure;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment;", "getPostTransferDisclosureFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Disclosure {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment postTransferDisclosureFragment;

        public Disclosure(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment postTransferDisclosureFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postTransferDisclosureFragment, "");
            this.__typename = str;
            this.postTransferDisclosureFragment = postTransferDisclosureFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment getPostTransferDisclosureFragment() {
            return this.postTransferDisclosureFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment postTransferDisclosureFragment = this.postTransferDisclosureFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Disclosure(__typename=");
            sb.append(str);
            sb.append(", postTransferDisclosureFragment=");
            sb.append(postTransferDisclosureFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.postTransferDisclosureFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Disclosure)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Disclosure disclosure = (com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Disclosure) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, disclosure.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.postTransferDisclosureFragment, disclosure.postTransferDisclosureFragment);
        }

        public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Disclosure copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment postTransferDisclosureFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postTransferDisclosureFragment, "");
            return new com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Disclosure(__typename, postTransferDisclosureFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment getPostTransferDisclosureFragment() {
            return this.postTransferDisclosureFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Disclosure copy$default(com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation.Disclosure disclosure, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment postTransferDisclosureFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = disclosure.__typename;
            }
            if ((i & 2) != 0) {
                postTransferDisclosureFragment = disclosure.postTransferDisclosureFragment;
            }
            return disclosure.copy(str, postTransferDisclosureFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/CompletePaymentTransferMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation CompletePaymentTransfer($input: CompletePendingPaymentTransferInput!) { completePendingPaymentTransfer(input: $input) { __typename ... on PaymentTransfer { transactionID: id receiverTransactionId createTime paymentStatus transferAmount { currencyCode value __typename } note { memo media { id provider contentType referenceUrl __typename } __typename } receiver { accountId id type name { __typename ... on PersonName { prefix givenName surname secondSurname middleName suffix fullName __typename } ... on BusinessName { businessName orthography __typename } } profilePhotoUrl __typename } selectedTransferType paymentLink { url expirationTime __typename } disclosures { __typename ...PostTransferDisclosureFragment } } } }  fragment PostTransferDisclosureFragment on PostTransferDisclosure { __typename ... on PaymentLinkDisclosure { priority expiryTime } ... on ReceiverSignupDisclosure { priority } ... on RegulatoryReviewDisclosure { priority } ... on PostTransferPaymentHoldDisclosure { priority } ... on ReceiverPreferenceDisclosure { priority } ... on InstantPaymentProcessedDisclosure { priority } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CompletePendingPaymentTransferInput completePendingPaymentTransferInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CompletePaymentTransferMutation(input=");
        sb.append(completePendingPaymentTransferInput);
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
        return (other instanceof com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation) other).input);
    }

    public final com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation copy(com.paypal.oslo.api.graphql.schema.type.CompletePendingPaymentTransferInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CompletePendingPaymentTransferInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation copy$default(com.paypal.oslo.feature.p2p.graphql.CompletePaymentTransferMutation completePaymentTransferMutation, com.paypal.oslo.api.graphql.schema.type.CompletePendingPaymentTransferInput completePendingPaymentTransferInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            completePendingPaymentTransferInput = completePaymentTransferMutation.input;
        }
        return completePaymentTransferMutation.copy(completePendingPaymentTransferInput);
    }
}
