package com.paypal.oslo.feature.p2p.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0012*+,-./0123456789:)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ResolvePaymentContingencyForTransferAttemptInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ResolvePaymentContingencyForTransferAttemptInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ResolvePaymentContingencyForTransferAttemptInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ResolvePaymentContingencyForTransferAttemptInput;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ResolvePaymentContingencyForTransferAttemptInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OPERATION_NAME, "PaymentTransferAttempt", "TransferAmount", "Note", "Media", "RecommendedContact", "Name", "OnPersonName", "OnBusinessName", "Receiver", "Name1", "OnPersonName1", "OnBusinessName1", "SupportedTransferType", "FundingOptions", com.paypal.oslo.feature.p2p.domain.model.Disclosure.TYPENAME_PREFIX_PAYMENT_LINK}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ResolvePaymentContingencyForTransferAttemptMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Data> {
    public static final java.lang.String OPERATION_ID = "1b9b5fb158c69628068a455494254f8ba3bf9dffd31795c6c54e42f1871b0c9c";
    public static final java.lang.String OPERATION_NAME = "ResolvePaymentContingencyForTransferAttempt";
    private final com.paypal.oslo.api.graphql.schema.type.ResolvePaymentContingencyForTransferAttemptInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Companion INSTANCE = new com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Companion(null);
    public static final int $stable = 8;

    public ResolvePaymentContingencyForTransferAttemptMutation(com.paypal.oslo.api.graphql.schema.type.ResolvePaymentContingencyForTransferAttemptInput resolvePaymentContingencyForTransferAttemptInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolvePaymentContingencyForTransferAttemptInput, "");
        this.input = resolvePaymentContingencyForTransferAttemptInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ResolvePaymentContingencyForTransferAttemptInput getInput() {
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
        com.paypal.oslo.feature.p2p.graphql.adapter.ResolvePaymentContingencyForTransferAttemptMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.ResolvePaymentContingencyForTransferAttemptMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.p2p.graphql.selections.ResolvePaymentContingencyForTransferAttemptMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$ResolvePaymentContingencyForTransferAttempt;", "resolvePaymentContingencyForTransferAttempt", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$ResolvePaymentContingencyForTransferAttempt;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$ResolvePaymentContingencyForTransferAttempt;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$ResolvePaymentContingencyForTransferAttempt;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$ResolvePaymentContingencyForTransferAttempt;", "getResolvePaymentContingencyForTransferAttempt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.ResolvePaymentContingencyForTransferAttempt resolvePaymentContingencyForTransferAttempt;

        public Data(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.ResolvePaymentContingencyForTransferAttempt resolvePaymentContingencyForTransferAttempt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolvePaymentContingencyForTransferAttempt, "");
            this.resolvePaymentContingencyForTransferAttempt = resolvePaymentContingencyForTransferAttempt;
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.ResolvePaymentContingencyForTransferAttempt getResolvePaymentContingencyForTransferAttempt() {
            return this.resolvePaymentContingencyForTransferAttempt;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.ResolvePaymentContingencyForTransferAttempt resolvePaymentContingencyForTransferAttempt = this.resolvePaymentContingencyForTransferAttempt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(resolvePaymentContingencyForTransferAttempt=");
            sb.append(resolvePaymentContingencyForTransferAttempt);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.resolvePaymentContingencyForTransferAttempt.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.resolvePaymentContingencyForTransferAttempt, ((com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Data) other).resolvePaymentContingencyForTransferAttempt);
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Data copy(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.ResolvePaymentContingencyForTransferAttempt resolvePaymentContingencyForTransferAttempt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolvePaymentContingencyForTransferAttempt, "");
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Data(resolvePaymentContingencyForTransferAttempt);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.ResolvePaymentContingencyForTransferAttempt getResolvePaymentContingencyForTransferAttempt() {
            return this.resolvePaymentContingencyForTransferAttempt;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Data copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Data data, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.ResolvePaymentContingencyForTransferAttempt resolvePaymentContingencyForTransferAttempt, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                resolvePaymentContingencyForTransferAttempt = data.resolvePaymentContingencyForTransferAttempt;
            }
            return data.copy(resolvePaymentContingencyForTransferAttempt);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$ResolvePaymentContingencyForTransferAttempt;", "", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$PaymentTransferAttempt;", "paymentTransferAttempt", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$PaymentTransferAttempt;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$PaymentTransferAttempt;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$PaymentTransferAttempt;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$ResolvePaymentContingencyForTransferAttempt;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$PaymentTransferAttempt;", "getPaymentTransferAttempt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class ResolvePaymentContingencyForTransferAttempt {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt;

        public ResolvePaymentContingencyForTransferAttempt(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferAttempt, "");
            this.paymentTransferAttempt = paymentTransferAttempt;
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentTransferAttempt getPaymentTransferAttempt() {
            return this.paymentTransferAttempt;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt = this.paymentTransferAttempt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ResolvePaymentContingencyForTransferAttempt(paymentTransferAttempt=");
            sb.append(paymentTransferAttempt);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.paymentTransferAttempt.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.ResolvePaymentContingencyForTransferAttempt) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTransferAttempt, ((com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.ResolvePaymentContingencyForTransferAttempt) other).paymentTransferAttempt);
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.ResolvePaymentContingencyForTransferAttempt copy(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferAttempt, "");
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.ResolvePaymentContingencyForTransferAttempt(paymentTransferAttempt);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentTransferAttempt getPaymentTransferAttempt() {
            return this.paymentTransferAttempt;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.ResolvePaymentContingencyForTransferAttempt copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.ResolvePaymentContingencyForTransferAttempt resolvePaymentContingencyForTransferAttempt, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentTransferAttempt = resolvePaymentContingencyForTransferAttempt.paymentTransferAttempt;
            }
            return resolvePaymentContingencyForTransferAttempt.copy(paymentTransferAttempt);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b/\u00100J¬\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020:HÖ\u0001¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010=\u001a\u0004\b>\u0010\u001cR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010?\u0012\u0004\bA\u0010B\u001a\u0004\b@\u0010\u001eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bD\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bF\u0010\"R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010G\u0012\u0004\bI\u0010B\u001a\u0004\bH\u0010$R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bJ\u0010 R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010K\u0012\u0004\bM\u0010B\u001a\u0004\bL\u0010'R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bN\u0010 R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\bP\u0010*R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010Q\u001a\u0004\bR\u0010,R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010S\u001a\u0004\bT\u0010.R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010U\u0012\u0004\bW\u0010B\u001a\u0004\bV\u00100"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$PaymentTransferAttempt;", "", "id", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$TransferAmount;", "transferAmount", "", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferIntent;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SUPPORTED_INTENTS, "selectedIntent", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Note;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE, "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$RecommendedContact;", "recommendedContacts", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Receiver;", "receiver", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$SupportedTransferType;", "supportedTransferTypes", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;", "selectedTransferType", "Lcom/paypal/oslo/api/graphql/schema/type/TransferTypeSelectionRequirement;", "transferTypeSelectionRequirement", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$FundingOptions;", "fundingOptions", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$PaymentLink;", "paymentLink", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$TransferAmount;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferIntent;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Note;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Receiver;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;Lcom/paypal/oslo/api/graphql/schema/type/TransferTypeSelectionRequirement;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$FundingOptions;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$PaymentLink;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$TransferAmount;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferIntent;", "component5", "()Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Note;", "component6", "component7", "()Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Receiver;", "component8", "component9", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;", "component10", "()Lcom/paypal/oslo/api/graphql/schema/type/TransferTypeSelectionRequirement;", "component11", "()Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$FundingOptions;", "component12", "()Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$PaymentLink;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$TransferAmount;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferIntent;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Note;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Receiver;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;Lcom/paypal/oslo/api/graphql/schema/type/TransferTypeSelectionRequirement;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$FundingOptions;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$PaymentLink;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$PaymentTransferAttempt;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getId", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$TransferAmount;", "getTransferAmount", "getTransferAmount$annotations", "()V", "Ljava/util/List;", "getSupportedIntents", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferIntent;", "getSelectedIntent", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Note;", "getNote", "getNote$annotations", "getRecommendedContacts", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Receiver;", "getReceiver", "getReceiver$annotations", "getSupportedTransferTypes", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;", "getSelectedTransferType", "Lcom/paypal/oslo/api/graphql/schema/type/TransferTypeSelectionRequirement;", "getTransferTypeSelectionRequirement", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$FundingOptions;", "getFundingOptions", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$PaymentLink;", "getPaymentLink", "getPaymentLink$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentTransferAttempt {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.FundingOptions fundingOptions;
        private final java.lang.Object id;
        private final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Note note;
        private final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentLink paymentLink;
        private final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Receiver receiver;
        private final java.util.List<com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.RecommendedContact> recommendedContacts;
        private final com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent selectedIntent;
        private final com.paypal.oslo.api.graphql.schema.type.PaymentTransferType selectedTransferType;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent> supportedIntents;
        private final java.util.List<com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.SupportedTransferType> supportedTransferTypes;
        private final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.TransferAmount transferAmount;
        private final com.paypal.oslo.api.graphql.schema.type.TransferTypeSelectionRequirement transferTypeSelectionRequirement;

        @kotlin.Deprecated(message = "Use paymentTransferNote field instead")
        public static /* synthetic */ void getNote$annotations() {
        }

        @kotlin.Deprecated(message = "Use `recipient` field instead. When the recipient is a PaymentLink, query the `recipient` field and use `__typename` to determine the type, then access PaymentLink-specific fields via inline fragment.")
        public static /* synthetic */ void getPaymentLink$annotations() {
        }

        @kotlin.Deprecated(message = "Use `recipient` instead. PayPal account recipients will be added in a future release.")
        public static /* synthetic */ void getReceiver$annotations() {
        }

        @kotlin.Deprecated(message = "Use `amount` instead.")
        public static /* synthetic */ void getTransferAmount$annotations() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PaymentTransferAttempt(java.lang.Object obj, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.TransferAmount transferAmount, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent> list, com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent paymentTransferIntent, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Note note, java.util.List<com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.RecommendedContact> list2, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Receiver receiver, java.util.List<com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.SupportedTransferType> list3, com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType, com.paypal.oslo.api.graphql.schema.type.TransferTypeSelectionRequirement transferTypeSelectionRequirement, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.FundingOptions fundingOptions, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentLink paymentLink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
            this.id = obj;
            this.transferAmount = transferAmount;
            this.supportedIntents = list;
            this.selectedIntent = paymentTransferIntent;
            this.note = note;
            this.recommendedContacts = list2;
            this.receiver = receiver;
            this.supportedTransferTypes = list3;
            this.selectedTransferType = paymentTransferType;
            this.transferTypeSelectionRequirement = transferTypeSelectionRequirement;
            this.fundingOptions = fundingOptions;
            this.paymentLink = paymentLink;
        }

        public final java.lang.Object getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.TransferAmount getTransferAmount() {
            return this.transferAmount;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent> getSupportedIntents() {
            return this.supportedIntents;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent getSelectedIntent() {
            return this.selectedIntent;
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Note getNote() {
            return this.note;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.RecommendedContact> getRecommendedContacts() {
            return this.recommendedContacts;
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Receiver getReceiver() {
            return this.receiver;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.SupportedTransferType> getSupportedTransferTypes() {
            return this.supportedTransferTypes;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferType getSelectedTransferType() {
            return this.selectedTransferType;
        }

        public final com.paypal.oslo.api.graphql.schema.type.TransferTypeSelectionRequirement getTransferTypeSelectionRequirement() {
            return this.transferTypeSelectionRequirement;
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.FundingOptions getFundingOptions() {
            return this.fundingOptions;
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentLink getPaymentLink() {
            return this.paymentLink;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.id;
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.TransferAmount transferAmount = this.transferAmount;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent> list = this.supportedIntents;
            com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent paymentTransferIntent = this.selectedIntent;
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Note note = this.note;
            java.util.List<com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.RecommendedContact> list2 = this.recommendedContacts;
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Receiver receiver = this.receiver;
            java.util.List<com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.SupportedTransferType> list3 = this.supportedTransferTypes;
            com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType = this.selectedTransferType;
            com.paypal.oslo.api.graphql.schema.type.TransferTypeSelectionRequirement transferTypeSelectionRequirement = this.transferTypeSelectionRequirement;
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.FundingOptions fundingOptions = this.fundingOptions;
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentLink paymentLink = this.paymentLink;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentTransferAttempt(id=");
            sb.append(obj);
            sb.append(", transferAmount=");
            sb.append(transferAmount);
            sb.append(", supportedIntents=");
            sb.append(list);
            sb.append(", selectedIntent=");
            sb.append(paymentTransferIntent);
            sb.append(", note=");
            sb.append(note);
            sb.append(", recommendedContacts=");
            sb.append(list2);
            sb.append(", receiver=");
            sb.append(receiver);
            sb.append(", supportedTransferTypes=");
            sb.append(list3);
            sb.append(", selectedTransferType=");
            sb.append(paymentTransferType);
            sb.append(", transferTypeSelectionRequirement=");
            sb.append(transferTypeSelectionRequirement);
            sb.append(", fundingOptions=");
            sb.append(fundingOptions);
            sb.append(", paymentLink=");
            sb.append(paymentLink);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.TransferAmount transferAmount = this.transferAmount;
            int hashCode2 = transferAmount == null ? 0 : transferAmount.hashCode();
            int hashCode3 = this.supportedIntents.hashCode();
            com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent paymentTransferIntent = this.selectedIntent;
            int hashCode4 = paymentTransferIntent == null ? 0 : paymentTransferIntent.hashCode();
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Note note = this.note;
            int hashCode5 = note == null ? 0 : note.hashCode();
            java.util.List<com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.RecommendedContact> list = this.recommendedContacts;
            int hashCode6 = list == null ? 0 : list.hashCode();
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Receiver receiver = this.receiver;
            int hashCode7 = receiver == null ? 0 : receiver.hashCode();
            int hashCode8 = this.supportedTransferTypes.hashCode();
            com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType = this.selectedTransferType;
            int hashCode9 = paymentTransferType == null ? 0 : paymentTransferType.hashCode();
            com.paypal.oslo.api.graphql.schema.type.TransferTypeSelectionRequirement transferTypeSelectionRequirement = this.transferTypeSelectionRequirement;
            int hashCode10 = transferTypeSelectionRequirement == null ? 0 : transferTypeSelectionRequirement.hashCode();
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.FundingOptions fundingOptions = this.fundingOptions;
            int hashCode11 = fundingOptions == null ? 0 : fundingOptions.hashCode();
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentLink paymentLink = this.paymentLink;
            return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (paymentLink != null ? paymentLink.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentTransferAttempt)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt = (com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentTransferAttempt) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, paymentTransferAttempt.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferAmount, paymentTransferAttempt.transferAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.supportedIntents, paymentTransferAttempt.supportedIntents) && this.selectedIntent == paymentTransferAttempt.selectedIntent && kotlin.jvm.internal.Intrinsics.areEqual(this.note, paymentTransferAttempt.note) && kotlin.jvm.internal.Intrinsics.areEqual(this.recommendedContacts, paymentTransferAttempt.recommendedContacts) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiver, paymentTransferAttempt.receiver) && kotlin.jvm.internal.Intrinsics.areEqual(this.supportedTransferTypes, paymentTransferAttempt.supportedTransferTypes) && this.selectedTransferType == paymentTransferAttempt.selectedTransferType && this.transferTypeSelectionRequirement == paymentTransferAttempt.transferTypeSelectionRequirement && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptions, paymentTransferAttempt.fundingOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentLink, paymentTransferAttempt.paymentLink);
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentTransferAttempt copy(java.lang.Object id, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.TransferAmount transferAmount, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent> supportedIntents, com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent selectedIntent, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Note note, java.util.List<com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.RecommendedContact> recommendedContacts, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Receiver receiver, java.util.List<com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.SupportedTransferType> supportedTransferTypes, com.paypal.oslo.api.graphql.schema.type.PaymentTransferType selectedTransferType, com.paypal.oslo.api.graphql.schema.type.TransferTypeSelectionRequirement transferTypeSelectionRequirement, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.FundingOptions fundingOptions, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentLink paymentLink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedIntents, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedTransferTypes, "");
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentTransferAttempt(id, transferAmount, supportedIntents, selectedIntent, note, recommendedContacts, receiver, supportedTransferTypes, selectedTransferType, transferTypeSelectionRequirement, fundingOptions, paymentLink);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferType getSelectedTransferType() {
            return this.selectedTransferType;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.SupportedTransferType> component8() {
            return this.supportedTransferTypes;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Receiver getReceiver() {
            return this.receiver;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.RecommendedContact> component6() {
            return this.recommendedContacts;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Note getNote() {
            return this.note;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent getSelectedIntent() {
            return this.selectedIntent;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent> component3() {
            return this.supportedIntents;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.TransferAmount getTransferAmount() {
            return this.transferAmount;
        }

        /* renamed from: component12, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentLink getPaymentLink() {
            return this.paymentLink;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.FundingOptions getFundingOptions() {
            return this.fundingOptions;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.TransferTypeSelectionRequirement getTransferTypeSelectionRequirement() {
            return this.transferTypeSelectionRequirement;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$TransferAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$TransferAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransferAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TransferAmount(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferAmount(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.TransferAmount)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.TransferAmount transferAmount = (com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.TransferAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, transferAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, transferAmount.value);
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.TransferAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.TransferAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.TransferAmount copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.TransferAmount transferAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = transferAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = transferAmount.value;
            }
            return transferAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Note;", "", "", "memo", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Media;", io.ktor.http.LinkHeader.Parameters.Media, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Media;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Media;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Media;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Note;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMemo", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Media;", "getMedia"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Note {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Media media;
        private final java.lang.String memo;

        public Note(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Media media) {
            this.memo = str;
            this.media = media;
        }

        public final java.lang.String getMemo() {
            return this.memo;
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Media getMedia() {
            return this.media;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.memo;
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Media media = this.media;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Note(memo=");
            sb.append(str);
            sb.append(", media=");
            sb.append(media);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.memo;
            int hashCode = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Media media = this.media;
            return (hashCode * 31) + (media != null ? media.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Note)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Note note = (com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Note) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.memo, note.memo) && kotlin.jvm.internal.Intrinsics.areEqual(this.media, note.media);
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Note copy(java.lang.String memo, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Media media) {
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Note(memo, media);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Media getMedia() {
            return this.media;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMemo() {
            return this.memo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Note copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Note note, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Media media, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = note.memo;
            }
            if ((i & 2) != 0) {
                media = note.media;
            }
            return note.copy(str, media);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Media;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;", "provider", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "referenceUrl", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;", "component3", "()Ljava/lang/Object;", "component4", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Media;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;", "getProvider", "Ljava/lang/Object;", "getContentType", "getReferenceUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Media {
        public static final int $stable = 8;
        private final java.lang.Object contentType;
        private final java.lang.String id;
        private final com.paypal.oslo.api.graphql.schema.type.MediaProvider provider;
        private final java.lang.Object referenceUrl;

        public Media(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MediaProvider mediaProvider, java.lang.Object obj, java.lang.Object obj2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaProvider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            this.id = str;
            this.provider = mediaProvider;
            this.contentType = obj;
            this.referenceUrl = obj2;
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

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.MediaProvider mediaProvider = this.provider;
            java.lang.Object obj = this.contentType;
            java.lang.Object obj2 = this.referenceUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Media(id=");
            sb.append(str);
            sb.append(", provider=");
            sb.append(mediaProvider);
            sb.append(", contentType=");
            sb.append(obj);
            sb.append(", referenceUrl=");
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.id.hashCode() * 31) + this.provider.hashCode()) * 31) + this.contentType.hashCode()) * 31) + this.referenceUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Media)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Media media = (com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Media) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, media.id) && this.provider == media.provider && kotlin.jvm.internal.Intrinsics.areEqual(this.contentType, media.contentType) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceUrl, media.referenceUrl);
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Media copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.MediaProvider provider, java.lang.Object contentType, java.lang.Object referenceUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceUrl, "");
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Media(id, provider, contentType, referenceUrl);
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

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Media copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Media media, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MediaProvider mediaProvider, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                str = media.id;
            }
            if ((i & 2) != 0) {
                mediaProvider = media.provider;
            }
            if ((i & 4) != 0) {
                obj = media.contentType;
            }
            if ((i & 8) != 0) {
                obj2 = media.referenceUrl;
            }
            return media.copy(str, mediaProvider, obj, obj2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJf\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010\u001bR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b5\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$RecommendedContact;", "", "", "id", "accountId", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Name;", "name", "Lcom/paypal/oslo/api/graphql/schema/type/PeerType;", "type", "profilePhotoUrl", "Lcom/paypal/oslo/api/graphql/schema/type/PeerStatus;", "status", "", "favorite", com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper.ERROR_MSG_BLOCKED, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Name;Lcom/paypal/oslo/api/graphql/schema/type/PeerType;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PeerStatus;ZZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Name;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/PeerType;", "component5", "()Ljava/lang/Object;", "component6", "()Lcom/paypal/oslo/api/graphql/schema/type/PeerStatus;", "component7", "()Z", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Name;Lcom/paypal/oslo/api/graphql/schema/type/PeerType;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PeerStatus;ZZ)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$RecommendedContact;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getAccountId", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Name;", "getName", "Lcom/paypal/oslo/api/graphql/schema/type/PeerType;", "getType", "Ljava/lang/Object;", "getProfilePhotoUrl", "Lcom/paypal/oslo/api/graphql/schema/type/PeerStatus;", "getStatus", "Z", "getFavorite", "getBlocked"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RecommendedContact {
        public static final int $stable = 8;
        private final java.lang.String accountId;
        private final boolean blocked;
        private final boolean favorite;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name name;
        private final java.lang.Object profilePhotoUrl;
        private final com.paypal.oslo.api.graphql.schema.type.PeerStatus status;
        private final com.paypal.oslo.api.graphql.schema.type.PeerType type;

        public RecommendedContact(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name name2, com.paypal.oslo.api.graphql.schema.type.PeerType peerType, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PeerStatus peerStatus, boolean z, boolean z2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peerType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peerStatus, "");
            this.id = str;
            this.accountId = str2;
            this.name = name2;
            this.type = peerType;
            this.profilePhotoUrl = obj;
            this.status = peerStatus;
            this.favorite = z;
            this.blocked = z2;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name getName() {
            return this.name;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PeerType getType() {
            return this.type;
        }

        public final java.lang.Object getProfilePhotoUrl() {
            return this.profilePhotoUrl;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PeerStatus getStatus() {
            return this.status;
        }

        public final boolean getFavorite() {
            return this.favorite;
        }

        public final boolean getBlocked() {
            return this.blocked;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.accountId;
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name name2 = this.name;
            com.paypal.oslo.api.graphql.schema.type.PeerType peerType = this.type;
            java.lang.Object obj = this.profilePhotoUrl;
            com.paypal.oslo.api.graphql.schema.type.PeerStatus peerStatus = this.status;
            boolean z = this.favorite;
            boolean z2 = this.blocked;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RecommendedContact(id=");
            sb.append(str);
            sb.append(", accountId=");
            sb.append(str2);
            sb.append(", name=");
            sb.append(name2);
            sb.append(", type=");
            sb.append(peerType);
            sb.append(", profilePhotoUrl=");
            sb.append(obj);
            sb.append(", status=");
            sb.append(peerStatus);
            sb.append(", favorite=");
            sb.append(z);
            sb.append(", blocked=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.accountId;
            int hashCode2 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name name2 = this.name;
            int hashCode3 = name2 == null ? 0 : name2.hashCode();
            int hashCode4 = this.type.hashCode();
            java.lang.Object obj = this.profilePhotoUrl;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (obj != null ? obj.hashCode() : 0)) * 31) + this.status.hashCode()) * 31) + java.lang.Boolean.hashCode(this.favorite)) * 31) + java.lang.Boolean.hashCode(this.blocked);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.RecommendedContact)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.RecommendedContact recommendedContact = (com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.RecommendedContact) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, recommendedContact.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, recommendedContact.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, recommendedContact.name) && this.type == recommendedContact.type && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePhotoUrl, recommendedContact.profilePhotoUrl) && this.status == recommendedContact.status && this.favorite == recommendedContact.favorite && this.blocked == recommendedContact.blocked;
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.RecommendedContact copy(java.lang.String id, java.lang.String accountId, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name name2, com.paypal.oslo.api.graphql.schema.type.PeerType type, java.lang.Object profilePhotoUrl, com.paypal.oslo.api.graphql.schema.type.PeerStatus status, boolean favorite, boolean blocked) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.RecommendedContact(id, accountId, name2, type, profilePhotoUrl, status, favorite, blocked);
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getBlocked() {
            return this.blocked;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getFavorite() {
            return this.favorite;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PeerStatus getStatus() {
            return this.status;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getProfilePhotoUrl() {
            return this.profilePhotoUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PeerType getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Name;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnPersonName;", "onPersonName", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnBusinessName;", "onBusinessName", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnPersonName;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnBusinessName;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnPersonName;", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnBusinessName;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnPersonName;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnBusinessName;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Name;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnPersonName;", "getOnPersonName", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnBusinessName;", "getOnBusinessName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Name {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName onBusinessName;
        private final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName onPersonName;

        public Name(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName onPersonName, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName onBusinessName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onPersonName = onPersonName;
            this.onBusinessName = onBusinessName;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName getOnPersonName() {
            return this.onPersonName;
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName getOnBusinessName() {
            return this.onBusinessName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName onPersonName = this.onPersonName;
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName onBusinessName = this.onBusinessName;
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
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName onPersonName = this.onPersonName;
            int hashCode2 = onPersonName == null ? 0 : onPersonName.hashCode();
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName onBusinessName = this.onBusinessName;
            return (((hashCode * 31) + hashCode2) * 31) + (onBusinessName != null ? onBusinessName.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name name2 = (com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, name2.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPersonName, name2.onPersonName) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBusinessName, name2.onBusinessName);
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName onPersonName, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName onBusinessName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name(__typename, onPersonName, onBusinessName);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName getOnBusinessName() {
            return this.onBusinessName;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName getOnPersonName() {
            return this.onPersonName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name name2, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName onPersonName, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName onBusinessName, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnPersonName;", "", "", "prefix", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "suffix", "fullName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnPersonName;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPrefix", "getGivenName", "getSurname", "getMiddleName", "getSuffix", "getFullName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class OnPersonName {
        public static final int $stable = 0;
        private final java.lang.String fullName;
        private final java.lang.String givenName;
        private final java.lang.String middleName;
        private final java.lang.String prefix;
        private final java.lang.String suffix;
        private final java.lang.String surname;

        public OnPersonName(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
            this.prefix = str;
            this.givenName = str2;
            this.surname = str3;
            this.middleName = str4;
            this.suffix = str5;
            this.fullName = str6;
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

        public final java.lang.String getMiddleName() {
            return this.middleName;
        }

        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.prefix;
            java.lang.String str2 = this.givenName;
            java.lang.String str3 = this.surname;
            java.lang.String str4 = this.middleName;
            java.lang.String str5 = this.suffix;
            java.lang.String str6 = this.fullName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPersonName(prefix=");
            sb.append(str);
            sb.append(", givenName=");
            sb.append(str2);
            sb.append(", surname=");
            sb.append(str3);
            sb.append(", middleName=");
            sb.append(str4);
            sb.append(", suffix=");
            sb.append(str5);
            sb.append(", fullName=");
            sb.append(str6);
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
            java.lang.String str4 = this.middleName;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.suffix;
            int hashCode5 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.fullName;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName onPersonName = (com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.prefix, onPersonName.prefix) && kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, onPersonName.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, onPersonName.surname) && kotlin.jvm.internal.Intrinsics.areEqual(this.middleName, onPersonName.middleName) && kotlin.jvm.internal.Intrinsics.areEqual(this.suffix, onPersonName.suffix) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, onPersonName.fullName);
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName copy(java.lang.String prefix, java.lang.String givenName, java.lang.String surname, java.lang.String middleName, java.lang.String suffix, java.lang.String fullName) {
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName(prefix, givenName, surname, middleName, suffix, fullName);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getFullName() {
            return this.fullName;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getMiddleName() {
            return this.middleName;
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

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName onPersonName, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPersonName.prefix;
            }
            if ((i & 2) != 0) {
                str2 = onPersonName.givenName;
            }
            java.lang.String str7 = str2;
            if ((i & 4) != 0) {
                str3 = onPersonName.surname;
            }
            java.lang.String str8 = str3;
            if ((i & 8) != 0) {
                str4 = onPersonName.middleName;
            }
            java.lang.String str9 = str4;
            if ((i & 16) != 0) {
                str5 = onPersonName.suffix;
            }
            java.lang.String str10 = str5;
            if ((i & 32) != 0) {
                str6 = onPersonName.fullName;
            }
            return onPersonName.copy(str, str7, str8, str9, str10, str6);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnBusinessName;", "", "", "businessName", "Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "orthography", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/Orthography;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/Orthography;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnBusinessName;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBusinessName", "Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "getOrthography"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class OnBusinessName {
        public static final int $stable = 0;
        private final java.lang.String businessName;
        private final com.paypal.oslo.api.graphql.schema.type.Orthography orthography;

        public OnBusinessName(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.Orthography orthography) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.businessName = str;
            this.orthography = orthography;
        }

        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public final com.paypal.oslo.api.graphql.schema.type.Orthography getOrthography() {
            return this.orthography;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.businessName;
            com.paypal.oslo.api.graphql.schema.type.Orthography orthography = this.orthography;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBusinessName(businessName=");
            sb.append(str);
            sb.append(", orthography=");
            sb.append(orthography);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.businessName.hashCode();
            com.paypal.oslo.api.graphql.schema.type.Orthography orthography = this.orthography;
            return (hashCode * 31) + (orthography == null ? 0 : orthography.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName onBusinessName = (com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.businessName, onBusinessName.businessName) && this.orthography == onBusinessName.orthography;
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName copy(java.lang.String businessName, com.paypal.oslo.api.graphql.schema.type.Orthography orthography) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessName, "");
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName(businessName, orthography);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.Orthography getOrthography() {
            return this.orthography;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName onBusinessName, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.Orthography orthography, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBusinessName.businessName;
            }
            if ((i & 2) != 0) {
                orthography = onBusinessName.orthography;
            }
            return onBusinessName.copy(str, orthography);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJH\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b'\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Receiver;", "", "", "accountId", "id", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentReceiverType;", "type", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Name1;", "name", "profilePhotoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PaymentReceiverType;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Name1;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentReceiverType;", "component4", "()Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Name1;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PaymentReceiverType;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Name1;Ljava/lang/Object;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Receiver;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccountId", "Ljava/lang/Object;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentReceiverType;", "getType", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Name1;", "getName", "getProfilePhotoUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Receiver {
        public static final int $stable = 8;
        private final java.lang.String accountId;
        private final java.lang.Object id;
        private final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name1 name;
        private final java.lang.Object profilePhotoUrl;
        private final com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType type;

        public Receiver(java.lang.String str, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType paymentReceiverType, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name1 name1, java.lang.Object obj2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReceiverType, "");
            this.accountId = str;
            this.id = obj;
            this.type = paymentReceiverType;
            this.name = name1;
            this.profilePhotoUrl = obj2;
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

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name1 getName() {
            return this.name;
        }

        public final java.lang.Object getProfilePhotoUrl() {
            return this.profilePhotoUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.accountId;
            java.lang.Object obj = this.id;
            com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType paymentReceiverType = this.type;
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name1 name1 = this.name;
            java.lang.Object obj2 = this.profilePhotoUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Receiver(accountId=");
            sb.append(str);
            sb.append(", id=");
            sb.append(obj);
            sb.append(", type=");
            sb.append(paymentReceiverType);
            sb.append(", name=");
            sb.append(name1);
            sb.append(", profilePhotoUrl=");
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.accountId;
            int hashCode = str == null ? 0 : str.hashCode();
            int hashCode2 = this.id.hashCode();
            int hashCode3 = this.type.hashCode();
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name1 name1 = this.name;
            int hashCode4 = name1 == null ? 0 : name1.hashCode();
            java.lang.Object obj = this.profilePhotoUrl;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (obj != null ? obj.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Receiver)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Receiver receiver = (com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Receiver) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, receiver.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, receiver.id) && this.type == receiver.type && kotlin.jvm.internal.Intrinsics.areEqual(this.name, receiver.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePhotoUrl, receiver.profilePhotoUrl);
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Receiver copy(java.lang.String accountId, java.lang.Object id, com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType type, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name1 name2, java.lang.Object profilePhotoUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Receiver(accountId, id, type, name2, profilePhotoUrl);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getProfilePhotoUrl() {
            return this.profilePhotoUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name1 getName() {
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

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Receiver copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Receiver receiver, java.lang.String str, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType paymentReceiverType, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name1 name1, java.lang.Object obj2, int i, java.lang.Object obj3) {
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
                name1 = receiver.name;
            }
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name1 name12 = name1;
            if ((i & 16) != 0) {
                obj2 = receiver.profilePhotoUrl;
            }
            return receiver.copy(str, obj4, paymentReceiverType2, name12, obj2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Name1;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnPersonName1;", "onPersonName", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnBusinessName1;", "onBusinessName", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnPersonName1;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnBusinessName1;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnPersonName1;", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnBusinessName1;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnPersonName1;Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnBusinessName1;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Name1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnPersonName1;", "getOnPersonName", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnBusinessName1;", "getOnBusinessName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Name1 {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName1 onBusinessName;
        private final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName1 onPersonName;

        public Name1(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName1 onPersonName1, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName1 onBusinessName1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onPersonName = onPersonName1;
            this.onBusinessName = onBusinessName1;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName1 getOnPersonName() {
            return this.onPersonName;
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName1 getOnBusinessName() {
            return this.onBusinessName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName1 onPersonName1 = this.onPersonName;
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName1 onBusinessName1 = this.onBusinessName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Name1(__typename=");
            sb.append(str);
            sb.append(", onPersonName=");
            sb.append(onPersonName1);
            sb.append(", onBusinessName=");
            sb.append(onBusinessName1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName1 onPersonName1 = this.onPersonName;
            int hashCode2 = onPersonName1 == null ? 0 : onPersonName1.hashCode();
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName1 onBusinessName1 = this.onBusinessName;
            return (((hashCode * 31) + hashCode2) * 31) + (onBusinessName1 != null ? onBusinessName1.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name1)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name1 name1 = (com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, name1.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPersonName, name1.onPersonName) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBusinessName, name1.onBusinessName);
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name1 copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName1 onPersonName, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName1 onBusinessName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name1(__typename, onPersonName, onBusinessName);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName1 getOnBusinessName() {
            return this.onBusinessName;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName1 getOnPersonName() {
            return this.onPersonName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name1 copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.Name1 name1, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName1 onPersonName1, com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName1 onBusinessName1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = name1.__typename;
            }
            if ((i & 2) != 0) {
                onPersonName1 = name1.onPersonName;
            }
            if ((i & 4) != 0) {
                onBusinessName1 = name1.onBusinessName;
            }
            return name1.copy(str, onPersonName1, onBusinessName1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnPersonName1;", "", "", "prefix", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "suffix", "fullName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnPersonName1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPrefix", "getGivenName", "getSurname", "getMiddleName", "getSuffix", "getFullName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class OnPersonName1 {
        public static final int $stable = 0;
        private final java.lang.String fullName;
        private final java.lang.String givenName;
        private final java.lang.String middleName;
        private final java.lang.String prefix;
        private final java.lang.String suffix;
        private final java.lang.String surname;

        public OnPersonName1(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
            this.prefix = str;
            this.givenName = str2;
            this.surname = str3;
            this.middleName = str4;
            this.suffix = str5;
            this.fullName = str6;
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

        public final java.lang.String getMiddleName() {
            return this.middleName;
        }

        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.prefix;
            java.lang.String str2 = this.givenName;
            java.lang.String str3 = this.surname;
            java.lang.String str4 = this.middleName;
            java.lang.String str5 = this.suffix;
            java.lang.String str6 = this.fullName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPersonName1(prefix=");
            sb.append(str);
            sb.append(", givenName=");
            sb.append(str2);
            sb.append(", surname=");
            sb.append(str3);
            sb.append(", middleName=");
            sb.append(str4);
            sb.append(", suffix=");
            sb.append(str5);
            sb.append(", fullName=");
            sb.append(str6);
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
            java.lang.String str4 = this.middleName;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.suffix;
            int hashCode5 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.fullName;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName1)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName1 onPersonName1 = (com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.prefix, onPersonName1.prefix) && kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, onPersonName1.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, onPersonName1.surname) && kotlin.jvm.internal.Intrinsics.areEqual(this.middleName, onPersonName1.middleName) && kotlin.jvm.internal.Intrinsics.areEqual(this.suffix, onPersonName1.suffix) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, onPersonName1.fullName);
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName1 copy(java.lang.String prefix, java.lang.String givenName, java.lang.String surname, java.lang.String middleName, java.lang.String suffix, java.lang.String fullName) {
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName1(prefix, givenName, surname, middleName, suffix, fullName);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getFullName() {
            return this.fullName;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getMiddleName() {
            return this.middleName;
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

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName1 copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnPersonName1 onPersonName1, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPersonName1.prefix;
            }
            if ((i & 2) != 0) {
                str2 = onPersonName1.givenName;
            }
            java.lang.String str7 = str2;
            if ((i & 4) != 0) {
                str3 = onPersonName1.surname;
            }
            java.lang.String str8 = str3;
            if ((i & 8) != 0) {
                str4 = onPersonName1.middleName;
            }
            java.lang.String str9 = str4;
            if ((i & 16) != 0) {
                str5 = onPersonName1.suffix;
            }
            java.lang.String str10 = str5;
            if ((i & 32) != 0) {
                str6 = onPersonName1.fullName;
            }
            return onPersonName1.copy(str, str7, str8, str9, str10, str6);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnBusinessName1;", "", "", "businessName", "Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "orthography", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/Orthography;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/Orthography;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$OnBusinessName1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBusinessName", "Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "getOrthography"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class OnBusinessName1 {
        public static final int $stable = 0;
        private final java.lang.String businessName;
        private final com.paypal.oslo.api.graphql.schema.type.Orthography orthography;

        public OnBusinessName1(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.Orthography orthography) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.businessName = str;
            this.orthography = orthography;
        }

        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public final com.paypal.oslo.api.graphql.schema.type.Orthography getOrthography() {
            return this.orthography;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.businessName;
            com.paypal.oslo.api.graphql.schema.type.Orthography orthography = this.orthography;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBusinessName1(businessName=");
            sb.append(str);
            sb.append(", orthography=");
            sb.append(orthography);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.businessName.hashCode();
            com.paypal.oslo.api.graphql.schema.type.Orthography orthography = this.orthography;
            return (hashCode * 31) + (orthography == null ? 0 : orthography.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName1)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName1 onBusinessName1 = (com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.businessName, onBusinessName1.businessName) && this.orthography == onBusinessName1.orthography;
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName1 copy(java.lang.String businessName, com.paypal.oslo.api.graphql.schema.type.Orthography orthography) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessName, "");
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName1(businessName, orthography);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.Orthography getOrthography() {
            return this.orthography;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName1 copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.OnBusinessName1 onBusinessName1, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.Orthography orthography, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBusinessName1.businessName;
            }
            if ((i & 2) != 0) {
                orthography = onBusinessName1.orthography;
            }
            return onBusinessName1.copy(str, orthography);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$SupportedTransferType;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;", "type", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;Z)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;Z)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$SupportedTransferType;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;", "getType", "Z", "getDefault"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SupportedTransferType {
        public static final int $stable = 0;
        private final boolean default;
        private final com.paypal.oslo.api.graphql.schema.type.PaymentTransferType type;

        public SupportedTransferType(com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferType, "");
            this.type = paymentTransferType;
            this.default = z;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferType getType() {
            return this.type;
        }

        public final boolean getDefault() {
            return this.default;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType = this.type;
            boolean z = this.default;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SupportedTransferType(type=");
            sb.append(paymentTransferType);
            sb.append(", default=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.type.hashCode() * 31) + java.lang.Boolean.hashCode(this.default);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.SupportedTransferType)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.SupportedTransferType supportedTransferType = (com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.SupportedTransferType) other;
            return this.type == supportedTransferType.type && this.default == supportedTransferType.default;
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.SupportedTransferType copy(com.paypal.oslo.api.graphql.schema.type.PaymentTransferType type, boolean r3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.SupportedTransferType(type, r3);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getDefault() {
            return this.default;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.SupportedTransferType copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.SupportedTransferType supportedTransferType, com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentTransferType = supportedTransferType.type;
            }
            if ((i & 2) != 0) {
                z = supportedTransferType.default;
            }
            return supportedTransferType.copy(paymentTransferType, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$FundingOptions;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PFundingOptionsFragment;", "p2PFundingOptionsFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PFundingOptionsFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PFundingOptionsFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PFundingOptionsFragment;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$FundingOptions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PFundingOptionsFragment;", "getP2PFundingOptionsFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingOptions {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment p2PFundingOptionsFragment;

        public FundingOptions(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment p2PFundingOptionsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2PFundingOptionsFragment, "");
            this.__typename = str;
            this.p2PFundingOptionsFragment = p2PFundingOptionsFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment getP2PFundingOptionsFragment() {
            return this.p2PFundingOptionsFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment p2PFundingOptionsFragment = this.p2PFundingOptionsFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingOptions(__typename=");
            sb.append(str);
            sb.append(", p2PFundingOptionsFragment=");
            sb.append(p2PFundingOptionsFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.p2PFundingOptionsFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.FundingOptions)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.FundingOptions fundingOptions = (com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.FundingOptions) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, fundingOptions.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.p2PFundingOptionsFragment, fundingOptions.p2PFundingOptionsFragment);
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.FundingOptions copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment p2PFundingOptionsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2PFundingOptionsFragment, "");
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.FundingOptions(__typename, p2PFundingOptionsFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment getP2PFundingOptionsFragment() {
            return this.p2PFundingOptionsFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.FundingOptions copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.FundingOptions fundingOptions, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment p2PFundingOptionsFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fundingOptions.__typename;
            }
            if ((i & 2) != 0) {
                p2PFundingOptionsFragment = fundingOptions.p2PFundingOptionsFragment;
            }
            return fundingOptions.copy(str, p2PFundingOptionsFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J&\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0017\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$PaymentLink;", "", "url", "expirationTime", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$PaymentLink;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getUrl", "getExpirationTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentLink {
        public static final int $stable = 8;
        private final java.lang.Object expirationTime;
        private final java.lang.Object url;

        public PaymentLink(java.lang.Object obj, java.lang.Object obj2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            this.url = obj;
            this.expirationTime = obj2;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final java.lang.Object getExpirationTime() {
            return this.expirationTime;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.url;
            java.lang.Object obj2 = this.expirationTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentLink(url=");
            sb.append(obj);
            sb.append(", expirationTime=");
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.url;
            return ((obj == null ? 0 : obj.hashCode()) * 31) + this.expirationTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentLink)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentLink paymentLink = (com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentLink) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, paymentLink.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationTime, paymentLink.expirationTime);
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentLink copy(java.lang.Object url, java.lang.Object expirationTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expirationTime, "");
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentLink(url, expirationTime);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getExpirationTime() {
            return this.expirationTime;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentLink copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation.PaymentLink paymentLink, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                obj = paymentLink.url;
            }
            if ((i & 2) != 0) {
                obj2 = paymentLink.expirationTime;
            }
            return paymentLink.copy(obj, obj2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePaymentContingencyForTransferAttemptMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation ResolvePaymentContingencyForTransferAttempt($input: ResolvePaymentContingencyForTransferAttemptInput!) { resolvePaymentContingencyForTransferAttempt(input: $input) { paymentTransferAttempt { id transferAmount { currencyCode value } supportedIntents selectedIntent note { memo media { id provider contentType referenceUrl } } recommendedContacts { id accountId name { __typename ... on PersonName { prefix givenName surname middleName suffix fullName } ... on BusinessName { businessName orthography } } type profilePhotoUrl status favorite blocked } receiver { accountId id type name { __typename ... on PersonName { prefix givenName surname middleName suffix fullName } ... on BusinessName { businessName orthography } } profilePhotoUrl } supportedTransferTypes { type default } selectedTransferType transferTypeSelectionRequirement fundingOptions { __typename ...P2PFundingOptionsFragment } paymentLink { url expirationTime } } } }  fragment BankAccountFields on BankAccount { id lastNChars nickname bankIssuer: issuer { name __typename } type __typename }  fragment BalanceFields on Balance { id availableAmount { currencyCode value __typename } __typename }  fragment CardFields on Card { id lastNChars brand cardIssuer: issuer { name __typename } __typename }  fragment P2PMoneyFragment on Money { value currencyCode }  fragment PaymentPlanDisclosureFragment on PaymentPlanDisclosure { __typename ... on InsufficientFundsDisclosure { priority } ... on QuasiCashDisclosure { priority } ... on BankAccountEcheckDisclosure { priority } ... on PaymentLinkAchDisclosure { priority } ... on PaymentLinkGenericDisclosure { priority } ... on PaymentLinkAchWithTermDisclosure { priority } ... on PaymentLinkGenericWithTermDisclosure { priority } }  fragment PlanContingencyFragment on PlanContingency { action status details { __typename ... on ThreeDSecureDataCollectionContingency { version referenceId deviceDataCollectionUrl jwt deviceDataCollectionMode authenticationProvider returnUrl source reason } ... on ThreeDSecureAuthenticationContingency { version referenceId jwt resolutionRedirectUrl resolutionRedirectMethod transactionId externalTransactionId authenticationProvider paymentAuthRequest redirectRequestParameters { key value } } ... on PlanUserDataCollection { requiredFields identityDocuments } ... on RealTimeBalanceContingency { confirmationUrl } ... on TopUpInstrumentContingency { provider minimumAmount { __typename ...P2PMoneyFragment } } ... on CardVerificationDataCollectionContingency { cvvLength } } }  fragment PaymentContingencyFragment on PaymentContingency { action status details { __typename ... on PaymentUserDataCollection { requiredFields } ... on ScamWarningContingency { riskLevel __typename } } __typename }  fragment PrePaymentDisclosureFragment on PrePaymentDisclosure { __typename ... on PaymentCannotBeReversedDisclosure { priority } ... on ConfirmPurchaseTransactionDisclosure { priority } ... on PrePaymentRemittanceDisclosure { priority } ... on ForeignTaxDisclosure { priority } ... on PaymentHoldDisclosure { priority holdDuration } ... on StateMandatedFraudulentActivityDisclosure { priority } ... on DelayedDebitDisclosure { priority maxDuration } ... on PaymentLinkAchDisclosure { priority } ... on PaymentLinkGenericDisclosure { priority } ... on PaymentLinkAchWithTermDisclosure { priority } ... on PaymentLinkGenericWithTermDisclosure { priority } ... on UnilateralRecipientDisclosure { priority } }  fragment P2PFundingOptionsFragment on PaymentTransferFundingContext { allowedOptions { id fundingSources { amount { currencyCode value __typename } instrument { __typename ... on BankAccount { __typename ...BankAccountFields } ... on Balance { __typename ...BalanceFields } ... on Card { __typename ...CardFields } } currencyConversionProvider __typename } backupFundingSources { instrument { __typename ... on BankAccount { __typename ...BankAccountFields } ... on Balance { __typename ...BalanceFields } ... on Card { __typename ...CardFields } } __typename } amountsBreakdown { sender { amountSent { currencyCode value __typename } totalFee { currencyCode value __typename } feeBreakdown { instrumentFees { currencyCode value __typename } crossBorderFees { currencyCode value __typename } __typename } totalAmountSent { currencyCode value __typename } __typename } receiver { amountReceived { currencyCode value __typename } __typename } __typename } default currencyExchange { __typename amountFrom { __typename ...P2PMoneyFragment } amountTo { __typename ...P2PMoneyFragment } exchangeRate { fromCurrency { __typename ...P2PMoneyFragment } toCurrency { __typename ...P2PMoneyFragment } __typename } ... on FiatCurrencyExchange { fxQuoteId } } paymentDelivery { speed minimumDuration maximumDuration estimatedArrivalTime } paymentDisclosures: disclosures { __typename ...PaymentPlanDisclosureFragment } planContingencies: contingencies { __typename ...PlanContingencyFragment } __typename } paymentContingencies: contingencies { __typename ...PaymentContingencyFragment } prePaymentDisclosures: disclosures { __typename ...PrePaymentDisclosureFragment } __typename }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ResolvePaymentContingencyForTransferAttemptInput resolvePaymentContingencyForTransferAttemptInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResolvePaymentContingencyForTransferAttemptMutation(input=");
        sb.append(resolvePaymentContingencyForTransferAttemptInput);
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
        return (other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation) other).input);
    }

    public final com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation copy(com.paypal.oslo.api.graphql.schema.type.ResolvePaymentContingencyForTransferAttemptInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ResolvePaymentContingencyForTransferAttemptInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePaymentContingencyForTransferAttemptMutation resolvePaymentContingencyForTransferAttemptMutation, com.paypal.oslo.api.graphql.schema.type.ResolvePaymentContingencyForTransferAttemptInput resolvePaymentContingencyForTransferAttemptInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            resolvePaymentContingencyForTransferAttemptInput = resolvePaymentContingencyForTransferAttemptMutation.input;
        }
        return resolvePaymentContingencyForTransferAttemptMutation.copy(resolvePaymentContingencyForTransferAttemptInput);
    }
}
