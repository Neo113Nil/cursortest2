package com.paypal.oslo.feature.p2p.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ResolvePlanContingencyForTransferAttemptInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ResolvePlanContingencyForTransferAttemptInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ResolvePlanContingencyForTransferAttemptInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ResolvePlanContingencyForTransferAttemptInput;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ResolvePlanContingencyForTransferAttemptInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.OPERATION_NAME, "PaymentTransferAttempt", "FundingOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ResolvePlanContingencyForTransferAttemptMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.Data> {
    public static final java.lang.String OPERATION_ID = "623f1c0a6fa69e10a0e235e924d04493896269ccdf296d358a3f5dc9e58603c4";
    public static final java.lang.String OPERATION_NAME = "ResolvePlanContingencyForTransferAttempt";
    private final com.paypal.oslo.api.graphql.schema.type.ResolvePlanContingencyForTransferAttemptInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.Companion INSTANCE = new com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.Companion(null);
    public static final int $stable = 8;

    public ResolvePlanContingencyForTransferAttemptMutation(com.paypal.oslo.api.graphql.schema.type.ResolvePlanContingencyForTransferAttemptInput resolvePlanContingencyForTransferAttemptInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolvePlanContingencyForTransferAttemptInput, "");
        this.input = resolvePlanContingencyForTransferAttemptInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ResolvePlanContingencyForTransferAttemptInput getInput() {
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
        com.paypal.oslo.feature.p2p.graphql.adapter.ResolvePlanContingencyForTransferAttemptMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.ResolvePlanContingencyForTransferAttemptMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.p2p.graphql.selections.ResolvePlanContingencyForTransferAttemptMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$ResolvePlanContingencyForTransferAttempt;", "resolvePlanContingencyForTransferAttempt", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$ResolvePlanContingencyForTransferAttempt;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$ResolvePlanContingencyForTransferAttempt;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$ResolvePlanContingencyForTransferAttempt;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$ResolvePlanContingencyForTransferAttempt;", "getResolvePlanContingencyForTransferAttempt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.ResolvePlanContingencyForTransferAttempt resolvePlanContingencyForTransferAttempt;

        public Data(com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.ResolvePlanContingencyForTransferAttempt resolvePlanContingencyForTransferAttempt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolvePlanContingencyForTransferAttempt, "");
            this.resolvePlanContingencyForTransferAttempt = resolvePlanContingencyForTransferAttempt;
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.ResolvePlanContingencyForTransferAttempt getResolvePlanContingencyForTransferAttempt() {
            return this.resolvePlanContingencyForTransferAttempt;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.ResolvePlanContingencyForTransferAttempt resolvePlanContingencyForTransferAttempt = this.resolvePlanContingencyForTransferAttempt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(resolvePlanContingencyForTransferAttempt=");
            sb.append(resolvePlanContingencyForTransferAttempt);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.resolvePlanContingencyForTransferAttempt.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.resolvePlanContingencyForTransferAttempt, ((com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.Data) other).resolvePlanContingencyForTransferAttempt);
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.Data copy(com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.ResolvePlanContingencyForTransferAttempt resolvePlanContingencyForTransferAttempt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolvePlanContingencyForTransferAttempt, "");
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.Data(resolvePlanContingencyForTransferAttempt);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.ResolvePlanContingencyForTransferAttempt getResolvePlanContingencyForTransferAttempt() {
            return this.resolvePlanContingencyForTransferAttempt;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.Data copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.Data data, com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.ResolvePlanContingencyForTransferAttempt resolvePlanContingencyForTransferAttempt, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                resolvePlanContingencyForTransferAttempt = data.resolvePlanContingencyForTransferAttempt;
            }
            return data.copy(resolvePlanContingencyForTransferAttempt);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$ResolvePlanContingencyForTransferAttempt;", "", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$PaymentTransferAttempt;", "paymentTransferAttempt", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$PaymentTransferAttempt;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$PaymentTransferAttempt;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$PaymentTransferAttempt;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$ResolvePlanContingencyForTransferAttempt;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$PaymentTransferAttempt;", "getPaymentTransferAttempt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ResolvePlanContingencyForTransferAttempt {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt;

        public ResolvePlanContingencyForTransferAttempt(com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferAttempt, "");
            this.paymentTransferAttempt = paymentTransferAttempt;
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.PaymentTransferAttempt getPaymentTransferAttempt() {
            return this.paymentTransferAttempt;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt = this.paymentTransferAttempt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ResolvePlanContingencyForTransferAttempt(paymentTransferAttempt=");
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
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.ResolvePlanContingencyForTransferAttempt) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTransferAttempt, ((com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.ResolvePlanContingencyForTransferAttempt) other).paymentTransferAttempt);
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.ResolvePlanContingencyForTransferAttempt copy(com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferAttempt, "");
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.ResolvePlanContingencyForTransferAttempt(paymentTransferAttempt);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.PaymentTransferAttempt getPaymentTransferAttempt() {
            return this.paymentTransferAttempt;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.ResolvePlanContingencyForTransferAttempt copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.ResolvePlanContingencyForTransferAttempt resolvePlanContingencyForTransferAttempt, com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentTransferAttempt = resolvePlanContingencyForTransferAttempt.paymentTransferAttempt;
            }
            return resolvePlanContingencyForTransferAttempt.copy(paymentTransferAttempt);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$PaymentTransferAttempt;", "", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$FundingOptions;", "fundingOptions", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$FundingOptions;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$FundingOptions;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$FundingOptions;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$PaymentTransferAttempt;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$FundingOptions;", "getFundingOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentTransferAttempt {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.FundingOptions fundingOptions;

        public PaymentTransferAttempt(com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.FundingOptions fundingOptions) {
            this.fundingOptions = fundingOptions;
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.FundingOptions getFundingOptions() {
            return this.fundingOptions;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.FundingOptions fundingOptions = this.fundingOptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentTransferAttempt(fundingOptions=");
            sb.append(fundingOptions);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.FundingOptions fundingOptions = this.fundingOptions;
            if (fundingOptions == null) {
                return 0;
            }
            return fundingOptions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.PaymentTransferAttempt) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptions, ((com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.PaymentTransferAttempt) other).fundingOptions);
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.PaymentTransferAttempt copy(com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.FundingOptions fundingOptions) {
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.PaymentTransferAttempt(fundingOptions);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.FundingOptions getFundingOptions() {
            return this.fundingOptions;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.PaymentTransferAttempt copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt, com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.FundingOptions fundingOptions, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fundingOptions = paymentTransferAttempt.fundingOptions;
            }
            return paymentTransferAttempt.copy(fundingOptions);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$FundingOptions;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PFundingOptionsFragment;", "p2PFundingOptionsFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PFundingOptionsFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PFundingOptionsFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PFundingOptionsFragment;)Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$FundingOptions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PFundingOptionsFragment;", "getP2PFundingOptionsFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.FundingOptions)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.FundingOptions fundingOptions = (com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.FundingOptions) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, fundingOptions.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.p2PFundingOptionsFragment, fundingOptions.p2PFundingOptionsFragment);
        }

        public final com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.FundingOptions copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment p2PFundingOptionsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2PFundingOptionsFragment, "");
            return new com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.FundingOptions(__typename, p2PFundingOptionsFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment getP2PFundingOptionsFragment() {
            return this.p2PFundingOptionsFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.FundingOptions copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation.FundingOptions fundingOptions, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment p2PFundingOptionsFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fundingOptions.__typename;
            }
            if ((i & 2) != 0) {
                p2PFundingOptionsFragment = fundingOptions.p2PFundingOptionsFragment;
            }
            return fundingOptions.copy(str, p2PFundingOptionsFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/ResolvePlanContingencyForTransferAttemptMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation ResolvePlanContingencyForTransferAttempt($input: ResolvePlanContingencyForTransferAttemptInput!) { resolvePlanContingencyForTransferAttempt(input: $input) { paymentTransferAttempt { fundingOptions { __typename ...P2PFundingOptionsFragment } } } }  fragment BankAccountFields on BankAccount { id lastNChars nickname bankIssuer: issuer { name __typename } type __typename }  fragment BalanceFields on Balance { id availableAmount { currencyCode value __typename } __typename }  fragment CardFields on Card { id lastNChars brand cardIssuer: issuer { name __typename } __typename }  fragment P2PMoneyFragment on Money { value currencyCode }  fragment PaymentPlanDisclosureFragment on PaymentPlanDisclosure { __typename ... on InsufficientFundsDisclosure { priority } ... on QuasiCashDisclosure { priority } ... on BankAccountEcheckDisclosure { priority } ... on PaymentLinkAchDisclosure { priority } ... on PaymentLinkGenericDisclosure { priority } ... on PaymentLinkAchWithTermDisclosure { priority } ... on PaymentLinkGenericWithTermDisclosure { priority } }  fragment PlanContingencyFragment on PlanContingency { action status details { __typename ... on ThreeDSecureDataCollectionContingency { version referenceId deviceDataCollectionUrl jwt deviceDataCollectionMode authenticationProvider returnUrl source reason } ... on ThreeDSecureAuthenticationContingency { version referenceId jwt resolutionRedirectUrl resolutionRedirectMethod transactionId externalTransactionId authenticationProvider paymentAuthRequest redirectRequestParameters { key value } } ... on PlanUserDataCollection { requiredFields identityDocuments } ... on RealTimeBalanceContingency { confirmationUrl } ... on TopUpInstrumentContingency { provider minimumAmount { __typename ...P2PMoneyFragment } } ... on CardVerificationDataCollectionContingency { cvvLength } } }  fragment PaymentContingencyFragment on PaymentContingency { action status details { __typename ... on PaymentUserDataCollection { requiredFields } ... on ScamWarningContingency { riskLevel __typename } } __typename }  fragment PrePaymentDisclosureFragment on PrePaymentDisclosure { __typename ... on PaymentCannotBeReversedDisclosure { priority } ... on ConfirmPurchaseTransactionDisclosure { priority } ... on PrePaymentRemittanceDisclosure { priority } ... on ForeignTaxDisclosure { priority } ... on PaymentHoldDisclosure { priority holdDuration } ... on StateMandatedFraudulentActivityDisclosure { priority } ... on DelayedDebitDisclosure { priority maxDuration } ... on PaymentLinkAchDisclosure { priority } ... on PaymentLinkGenericDisclosure { priority } ... on PaymentLinkAchWithTermDisclosure { priority } ... on PaymentLinkGenericWithTermDisclosure { priority } ... on UnilateralRecipientDisclosure { priority } }  fragment P2PFundingOptionsFragment on PaymentTransferFundingContext { allowedOptions { id fundingSources { amount { currencyCode value __typename } instrument { __typename ... on BankAccount { __typename ...BankAccountFields } ... on Balance { __typename ...BalanceFields } ... on Card { __typename ...CardFields } } currencyConversionProvider __typename } backupFundingSources { instrument { __typename ... on BankAccount { __typename ...BankAccountFields } ... on Balance { __typename ...BalanceFields } ... on Card { __typename ...CardFields } } __typename } amountsBreakdown { sender { amountSent { currencyCode value __typename } totalFee { currencyCode value __typename } feeBreakdown { instrumentFees { currencyCode value __typename } crossBorderFees { currencyCode value __typename } __typename } totalAmountSent { currencyCode value __typename } __typename } receiver { amountReceived { currencyCode value __typename } __typename } __typename } default currencyExchange { __typename amountFrom { __typename ...P2PMoneyFragment } amountTo { __typename ...P2PMoneyFragment } exchangeRate { fromCurrency { __typename ...P2PMoneyFragment } toCurrency { __typename ...P2PMoneyFragment } __typename } ... on FiatCurrencyExchange { fxQuoteId } } paymentDelivery { speed minimumDuration maximumDuration estimatedArrivalTime } paymentDisclosures: disclosures { __typename ...PaymentPlanDisclosureFragment } planContingencies: contingencies { __typename ...PlanContingencyFragment } __typename } paymentContingencies: contingencies { __typename ...PaymentContingencyFragment } prePaymentDisclosures: disclosures { __typename ...PrePaymentDisclosureFragment } __typename }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ResolvePlanContingencyForTransferAttemptInput resolvePlanContingencyForTransferAttemptInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResolvePlanContingencyForTransferAttemptMutation(input=");
        sb.append(resolvePlanContingencyForTransferAttemptInput);
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
        return (other instanceof com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation) other).input);
    }

    public final com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation copy(com.paypal.oslo.api.graphql.schema.type.ResolvePlanContingencyForTransferAttemptInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ResolvePlanContingencyForTransferAttemptInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation copy$default(com.paypal.oslo.feature.p2p.graphql.ResolvePlanContingencyForTransferAttemptMutation resolvePlanContingencyForTransferAttemptMutation, com.paypal.oslo.api.graphql.schema.type.ResolvePlanContingencyForTransferAttemptInput resolvePlanContingencyForTransferAttemptInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            resolvePlanContingencyForTransferAttemptInput = resolvePlanContingencyForTransferAttemptMutation.input;
        }
        return resolvePlanContingencyForTransferAttemptMutation.copy(resolvePlanContingencyForTransferAttemptInput);
    }
}
