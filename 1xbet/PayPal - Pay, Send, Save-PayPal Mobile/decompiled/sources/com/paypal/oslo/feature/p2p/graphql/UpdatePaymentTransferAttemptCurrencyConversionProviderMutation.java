package com.paypal.oslo.feature.p2p.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000b*+,-./0123)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdatePaymentTransferAttemptCurrencyConversionProviderInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdatePaymentTransferAttemptCurrencyConversionProviderInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/UpdatePaymentTransferAttemptCurrencyConversionProviderInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdatePaymentTransferAttemptCurrencyConversionProviderInput;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/UpdatePaymentTransferAttemptCurrencyConversionProviderInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.OPERATION_NAME, "PaymentTransferAttempt", "FundingOptions", "FxQuote", "AmountFrom", "AmountTo", "ExchangeRate", "FromCurrency", "ToCurrency"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UpdatePaymentTransferAttemptCurrencyConversionProviderMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.Data> {
    public static final java.lang.String OPERATION_ID = "ef9a9b4261a289a8e3222886ec3c63b05b9639c8040a9d5157abfd099f782cbf";
    public static final java.lang.String OPERATION_NAME = "UpdatePaymentTransferAttemptCurrencyConversionProvider";
    private final com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptCurrencyConversionProviderInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.Companion INSTANCE = new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.Companion(null);
    public static final int $stable = 8;

    public UpdatePaymentTransferAttemptCurrencyConversionProviderMutation(com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptCurrencyConversionProviderInput updatePaymentTransferAttemptCurrencyConversionProviderInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentTransferAttemptCurrencyConversionProviderInput, "");
        this.input = updatePaymentTransferAttemptCurrencyConversionProviderInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptCurrencyConversionProviderInput getInput() {
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
        com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.p2p.graphql.selections.UpdatePaymentTransferAttemptCurrencyConversionProviderMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$UpdatePaymentTransferAttemptCurrencyConversionProvider;", "updatePaymentTransferAttemptCurrencyConversionProvider", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$UpdatePaymentTransferAttemptCurrencyConversionProvider;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$UpdatePaymentTransferAttemptCurrencyConversionProvider;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$UpdatePaymentTransferAttemptCurrencyConversionProvider;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$UpdatePaymentTransferAttemptCurrencyConversionProvider;", "getUpdatePaymentTransferAttemptCurrencyConversionProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.UpdatePaymentTransferAttemptCurrencyConversionProvider updatePaymentTransferAttemptCurrencyConversionProvider;

        public Data(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.UpdatePaymentTransferAttemptCurrencyConversionProvider updatePaymentTransferAttemptCurrencyConversionProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentTransferAttemptCurrencyConversionProvider, "");
            this.updatePaymentTransferAttemptCurrencyConversionProvider = updatePaymentTransferAttemptCurrencyConversionProvider;
        }

        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.UpdatePaymentTransferAttemptCurrencyConversionProvider getUpdatePaymentTransferAttemptCurrencyConversionProvider() {
            return this.updatePaymentTransferAttemptCurrencyConversionProvider;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.UpdatePaymentTransferAttemptCurrencyConversionProvider updatePaymentTransferAttemptCurrencyConversionProvider = this.updatePaymentTransferAttemptCurrencyConversionProvider;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(updatePaymentTransferAttemptCurrencyConversionProvider=");
            sb.append(updatePaymentTransferAttemptCurrencyConversionProvider);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.updatePaymentTransferAttemptCurrencyConversionProvider.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.updatePaymentTransferAttemptCurrencyConversionProvider, ((com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.Data) other).updatePaymentTransferAttemptCurrencyConversionProvider);
        }

        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.Data copy(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.UpdatePaymentTransferAttemptCurrencyConversionProvider updatePaymentTransferAttemptCurrencyConversionProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentTransferAttemptCurrencyConversionProvider, "");
            return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.Data(updatePaymentTransferAttemptCurrencyConversionProvider);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.UpdatePaymentTransferAttemptCurrencyConversionProvider getUpdatePaymentTransferAttemptCurrencyConversionProvider() {
            return this.updatePaymentTransferAttemptCurrencyConversionProvider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.Data copy$default(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.Data data, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.UpdatePaymentTransferAttemptCurrencyConversionProvider updatePaymentTransferAttemptCurrencyConversionProvider, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updatePaymentTransferAttemptCurrencyConversionProvider = data.updatePaymentTransferAttemptCurrencyConversionProvider;
            }
            return data.copy(updatePaymentTransferAttemptCurrencyConversionProvider);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$UpdatePaymentTransferAttemptCurrencyConversionProvider;", "", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$PaymentTransferAttempt;", "paymentTransferAttempt", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$PaymentTransferAttempt;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$PaymentTransferAttempt;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$PaymentTransferAttempt;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$UpdatePaymentTransferAttemptCurrencyConversionProvider;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$PaymentTransferAttempt;", "getPaymentTransferAttempt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdatePaymentTransferAttemptCurrencyConversionProvider {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt paymentTransferAttempt;

        public UpdatePaymentTransferAttemptCurrencyConversionProvider(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt paymentTransferAttempt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferAttempt, "");
            this.paymentTransferAttempt = paymentTransferAttempt;
        }

        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt getPaymentTransferAttempt() {
            return this.paymentTransferAttempt;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt paymentTransferAttempt = this.paymentTransferAttempt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePaymentTransferAttemptCurrencyConversionProvider(paymentTransferAttempt=");
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
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.UpdatePaymentTransferAttemptCurrencyConversionProvider) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTransferAttempt, ((com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.UpdatePaymentTransferAttemptCurrencyConversionProvider) other).paymentTransferAttempt);
        }

        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.UpdatePaymentTransferAttemptCurrencyConversionProvider copy(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt paymentTransferAttempt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferAttempt, "");
            return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.UpdatePaymentTransferAttemptCurrencyConversionProvider(paymentTransferAttempt);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt getPaymentTransferAttempt() {
            return this.paymentTransferAttempt;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.UpdatePaymentTransferAttemptCurrencyConversionProvider copy$default(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.UpdatePaymentTransferAttemptCurrencyConversionProvider updatePaymentTransferAttemptCurrencyConversionProvider, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt paymentTransferAttempt, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentTransferAttempt = updatePaymentTransferAttemptCurrencyConversionProvider.paymentTransferAttempt;
            }
            return updatePaymentTransferAttemptCurrencyConversionProvider.copy(paymentTransferAttempt);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$PaymentTransferAttempt;", "", "id", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FundingOptions;", "fundingOptions", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FxQuote;", "fxQuote", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FundingOptions;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FxQuote;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FundingOptions;", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FxQuote;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FundingOptions;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FxQuote;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$PaymentTransferAttempt;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getId", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FundingOptions;", "getFundingOptions", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FxQuote;", "getFxQuote"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentTransferAttempt {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions fundingOptions;
        private final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote fxQuote;
        private final java.lang.Object id;

        public PaymentTransferAttempt(java.lang.Object obj, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions fundingOptions, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote fxQuote) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.id = obj;
            this.fundingOptions = fundingOptions;
            this.fxQuote = fxQuote;
        }

        public final java.lang.Object getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions getFundingOptions() {
            return this.fundingOptions;
        }

        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote getFxQuote() {
            return this.fxQuote;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.id;
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions fundingOptions = this.fundingOptions;
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote fxQuote = this.fxQuote;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentTransferAttempt(id=");
            sb.append(obj);
            sb.append(", fundingOptions=");
            sb.append(fundingOptions);
            sb.append(", fxQuote=");
            sb.append(fxQuote);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions fundingOptions = this.fundingOptions;
            int hashCode2 = fundingOptions == null ? 0 : fundingOptions.hashCode();
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote fxQuote = this.fxQuote;
            return (((hashCode * 31) + hashCode2) * 31) + (fxQuote != null ? fxQuote.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt paymentTransferAttempt = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, paymentTransferAttempt.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptions, paymentTransferAttempt.fundingOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.fxQuote, paymentTransferAttempt.fxQuote);
        }

        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt copy(java.lang.Object id, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions fundingOptions, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote fxQuote) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt(id, fundingOptions, fxQuote);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote getFxQuote() {
            return this.fxQuote;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions getFundingOptions() {
            return this.fundingOptions;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt copy$default(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt paymentTransferAttempt, java.lang.Object obj, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions fundingOptions, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote fxQuote, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = paymentTransferAttempt.id;
            }
            if ((i & 2) != 0) {
                fundingOptions = paymentTransferAttempt.fundingOptions;
            }
            if ((i & 4) != 0) {
                fxQuote = paymentTransferAttempt.fxQuote;
            }
            return paymentTransferAttempt.copy(obj, fundingOptions, fxQuote);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FundingOptions;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PFundingOptionsFragment;", "p2PFundingOptionsFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PFundingOptionsFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PFundingOptionsFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PFundingOptionsFragment;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FundingOptions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PFundingOptionsFragment;", "getP2PFundingOptionsFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions fundingOptions = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, fundingOptions.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.p2PFundingOptionsFragment, fundingOptions.p2PFundingOptionsFragment);
        }

        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment p2PFundingOptionsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2PFundingOptionsFragment, "");
            return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions(__typename, p2PFundingOptionsFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment getP2PFundingOptionsFragment() {
            return this.p2PFundingOptionsFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions copy$default(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions fundingOptions, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment p2PFundingOptionsFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fundingOptions.__typename;
            }
            if ((i & 2) != 0) {
                p2PFundingOptionsFragment = fundingOptions.p2PFundingOptionsFragment;
            }
            return fundingOptions.copy(str, p2PFundingOptionsFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FxQuote;", "", "", "fxQuoteId", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$AmountFrom;", "amountFrom", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$AmountTo;", "amountTo", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$ExchangeRate;", "exchangeRate", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$AmountFrom;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$AmountTo;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$ExchangeRate;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$AmountFrom;", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$AmountTo;", "component4", "()Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$ExchangeRate;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$AmountFrom;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$AmountTo;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$ExchangeRate;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FxQuote;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFxQuoteId", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$AmountFrom;", "getAmountFrom", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$AmountTo;", "getAmountTo", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$ExchangeRate;", "getExchangeRate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FxQuote {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountFrom amountFrom;
        private final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountTo amountTo;
        private final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ExchangeRate exchangeRate;
        private final java.lang.String fxQuoteId;

        public FxQuote(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountFrom amountFrom, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountTo amountTo, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ExchangeRate exchangeRate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountFrom, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountTo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRate, "");
            this.fxQuoteId = str;
            this.amountFrom = amountFrom;
            this.amountTo = amountTo;
            this.exchangeRate = exchangeRate;
        }

        public final java.lang.String getFxQuoteId() {
            return this.fxQuoteId;
        }

        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountFrom getAmountFrom() {
            return this.amountFrom;
        }

        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountTo getAmountTo() {
            return this.amountTo;
        }

        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ExchangeRate getExchangeRate() {
            return this.exchangeRate;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fxQuoteId;
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountFrom amountFrom = this.amountFrom;
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountTo amountTo = this.amountTo;
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ExchangeRate exchangeRate = this.exchangeRate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FxQuote(fxQuoteId=");
            sb.append(str);
            sb.append(", amountFrom=");
            sb.append(amountFrom);
            sb.append(", amountTo=");
            sb.append(amountTo);
            sb.append(", exchangeRate=");
            sb.append(exchangeRate);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.fxQuoteId.hashCode() * 31) + this.amountFrom.hashCode()) * 31) + this.amountTo.hashCode()) * 31) + this.exchangeRate.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote fxQuote = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fxQuoteId, fxQuote.fxQuoteId) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountFrom, fxQuote.amountFrom) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountTo, fxQuote.amountTo) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRate, fxQuote.exchangeRate);
        }

        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote copy(java.lang.String fxQuoteId, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountFrom amountFrom, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountTo amountTo, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ExchangeRate exchangeRate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fxQuoteId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountFrom, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountTo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRate, "");
            return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote(fxQuoteId, amountFrom, amountTo, exchangeRate);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ExchangeRate getExchangeRate() {
            return this.exchangeRate;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountTo getAmountTo() {
            return this.amountTo;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountFrom getAmountFrom() {
            return this.amountFrom;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFxQuoteId() {
            return this.fxQuoteId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote copy$default(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote fxQuote, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountFrom amountFrom, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountTo amountTo, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ExchangeRate exchangeRate, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fxQuote.fxQuoteId;
            }
            if ((i & 2) != 0) {
                amountFrom = fxQuote.amountFrom;
            }
            if ((i & 4) != 0) {
                amountTo = fxQuote.amountTo;
            }
            if ((i & 8) != 0) {
                exchangeRate = fxQuote.exchangeRate;
            }
            return fxQuote.copy(str, amountFrom, amountTo, exchangeRate);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$AmountFrom;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;", "p2PMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$AmountFrom;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;", "getP2PMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountFrom {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment;

        public AmountFrom(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.p2PMoneyFragment = p2PMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment getP2PMoneyFragment() {
            return this.p2PMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment = this.p2PMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountFrom(__typename=");
            sb.append(str);
            sb.append(", p2PMoneyFragment=");
            sb.append(p2PMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment = this.p2PMoneyFragment;
            return (hashCode * 31) + (p2PMoneyFragment == null ? 0 : p2PMoneyFragment.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountFrom)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountFrom amountFrom = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountFrom) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amountFrom.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.p2PMoneyFragment, amountFrom.p2PMoneyFragment);
        }

        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountFrom copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountFrom(__typename, p2PMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment getP2PMoneyFragment() {
            return this.p2PMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountFrom copy$default(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountFrom amountFrom, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amountFrom.__typename;
            }
            if ((i & 2) != 0) {
                p2PMoneyFragment = amountFrom.p2PMoneyFragment;
            }
            return amountFrom.copy(str, p2PMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$AmountTo;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;", "p2PMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$AmountTo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;", "getP2PMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountTo {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment;

        public AmountTo(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.p2PMoneyFragment = p2PMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment getP2PMoneyFragment() {
            return this.p2PMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment = this.p2PMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountTo(__typename=");
            sb.append(str);
            sb.append(", p2PMoneyFragment=");
            sb.append(p2PMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment = this.p2PMoneyFragment;
            return (hashCode * 31) + (p2PMoneyFragment == null ? 0 : p2PMoneyFragment.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountTo)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountTo amountTo = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountTo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amountTo.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.p2PMoneyFragment, amountTo.p2PMoneyFragment);
        }

        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountTo copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountTo(__typename, p2PMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment getP2PMoneyFragment() {
            return this.p2PMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountTo copy$default(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountTo amountTo, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amountTo.__typename;
            }
            if ((i & 2) != 0) {
                p2PMoneyFragment = amountTo.p2PMoneyFragment;
            }
            return amountTo.copy(str, p2PMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$ExchangeRate;", "", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FromCurrency;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_FROM, "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$ToCurrency;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_TO, "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FromCurrency;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$ToCurrency;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FromCurrency;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$ToCurrency;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FromCurrency;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$ToCurrency;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$ExchangeRate;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FromCurrency;", "getFromCurrency", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$ToCurrency;", "getToCurrency"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExchangeRate {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FromCurrency fromCurrency;
        private final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ToCurrency toCurrency;

        public ExchangeRate(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FromCurrency fromCurrency, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ToCurrency toCurrency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fromCurrency, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toCurrency, "");
            this.fromCurrency = fromCurrency;
            this.toCurrency = toCurrency;
        }

        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FromCurrency getFromCurrency() {
            return this.fromCurrency;
        }

        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ToCurrency getToCurrency() {
            return this.toCurrency;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FromCurrency fromCurrency = this.fromCurrency;
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ToCurrency toCurrency = this.toCurrency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ExchangeRate(fromCurrency=");
            sb.append(fromCurrency);
            sb.append(", toCurrency=");
            sb.append(toCurrency);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.fromCurrency.hashCode() * 31) + this.toCurrency.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ExchangeRate)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ExchangeRate exchangeRate = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ExchangeRate) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fromCurrency, exchangeRate.fromCurrency) && kotlin.jvm.internal.Intrinsics.areEqual(this.toCurrency, exchangeRate.toCurrency);
        }

        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ExchangeRate copy(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FromCurrency fromCurrency, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ToCurrency toCurrency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fromCurrency, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toCurrency, "");
            return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ExchangeRate(fromCurrency, toCurrency);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ToCurrency getToCurrency() {
            return this.toCurrency;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FromCurrency getFromCurrency() {
            return this.fromCurrency;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ExchangeRate copy$default(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ExchangeRate exchangeRate, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FromCurrency fromCurrency, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ToCurrency toCurrency, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fromCurrency = exchangeRate.fromCurrency;
            }
            if ((i & 2) != 0) {
                toCurrency = exchangeRate.toCurrency;
            }
            return exchangeRate.copy(fromCurrency, toCurrency);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FromCurrency;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;", "p2PMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FromCurrency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;", "getP2PMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FromCurrency {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment;

        public FromCurrency(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.p2PMoneyFragment = p2PMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment getP2PMoneyFragment() {
            return this.p2PMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment = this.p2PMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FromCurrency(__typename=");
            sb.append(str);
            sb.append(", p2PMoneyFragment=");
            sb.append(p2PMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment = this.p2PMoneyFragment;
            return (hashCode * 31) + (p2PMoneyFragment == null ? 0 : p2PMoneyFragment.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FromCurrency)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FromCurrency fromCurrency = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FromCurrency) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, fromCurrency.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.p2PMoneyFragment, fromCurrency.p2PMoneyFragment);
        }

        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FromCurrency copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FromCurrency(__typename, p2PMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment getP2PMoneyFragment() {
            return this.p2PMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FromCurrency copy$default(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FromCurrency fromCurrency, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fromCurrency.__typename;
            }
            if ((i & 2) != 0) {
                p2PMoneyFragment = fromCurrency.p2PMoneyFragment;
            }
            return fromCurrency.copy(str, p2PMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$ToCurrency;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;", "p2PMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$ToCurrency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;", "getP2PMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ToCurrency {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment;

        public ToCurrency(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.p2PMoneyFragment = p2PMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment getP2PMoneyFragment() {
            return this.p2PMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment = this.p2PMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ToCurrency(__typename=");
            sb.append(str);
            sb.append(", p2PMoneyFragment=");
            sb.append(p2PMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment = this.p2PMoneyFragment;
            return (hashCode * 31) + (p2PMoneyFragment == null ? 0 : p2PMoneyFragment.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ToCurrency)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ToCurrency toCurrency = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ToCurrency) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, toCurrency.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.p2PMoneyFragment, toCurrency.p2PMoneyFragment);
        }

        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ToCurrency copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ToCurrency(__typename, p2PMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment getP2PMoneyFragment() {
            return this.p2PMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ToCurrency copy$default(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ToCurrency toCurrency, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = toCurrency.__typename;
            }
            if ((i & 2) != 0) {
                p2PMoneyFragment = toCurrency.p2PMoneyFragment;
            }
            return toCurrency.copy(str, p2PMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation UpdatePaymentTransferAttemptCurrencyConversionProvider($input: UpdatePaymentTransferAttemptCurrencyConversionProviderInput!) { updatePaymentTransferAttemptCurrencyConversionProvider(input: $input) { paymentTransferAttempt { id fundingOptions { __typename ...P2PFundingOptionsFragment } fxQuote { fxQuoteId amountFrom { __typename ...P2PMoneyFragment } amountTo { __typename ...P2PMoneyFragment } exchangeRate { fromCurrency { __typename ...P2PMoneyFragment } toCurrency { __typename ...P2PMoneyFragment } } } } } }  fragment BankAccountFields on BankAccount { id lastNChars nickname bankIssuer: issuer { name __typename } type __typename }  fragment BalanceFields on Balance { id availableAmount { currencyCode value __typename } __typename }  fragment CardFields on Card { id lastNChars brand cardIssuer: issuer { name __typename } __typename }  fragment P2PMoneyFragment on Money { value currencyCode }  fragment PaymentPlanDisclosureFragment on PaymentPlanDisclosure { __typename ... on InsufficientFundsDisclosure { priority } ... on QuasiCashDisclosure { priority } ... on BankAccountEcheckDisclosure { priority } ... on PaymentLinkAchDisclosure { priority } ... on PaymentLinkGenericDisclosure { priority } ... on PaymentLinkAchWithTermDisclosure { priority } ... on PaymentLinkGenericWithTermDisclosure { priority } }  fragment PlanContingencyFragment on PlanContingency { action status details { __typename ... on ThreeDSecureDataCollectionContingency { version referenceId deviceDataCollectionUrl jwt deviceDataCollectionMode authenticationProvider returnUrl source reason } ... on ThreeDSecureAuthenticationContingency { version referenceId jwt resolutionRedirectUrl resolutionRedirectMethod transactionId externalTransactionId authenticationProvider paymentAuthRequest redirectRequestParameters { key value } } ... on PlanUserDataCollection { requiredFields identityDocuments } ... on RealTimeBalanceContingency { confirmationUrl } ... on TopUpInstrumentContingency { provider minimumAmount { __typename ...P2PMoneyFragment } } ... on CardVerificationDataCollectionContingency { cvvLength } } }  fragment PaymentContingencyFragment on PaymentContingency { action status details { __typename ... on PaymentUserDataCollection { requiredFields } ... on ScamWarningContingency { riskLevel __typename } } __typename }  fragment PrePaymentDisclosureFragment on PrePaymentDisclosure { __typename ... on PaymentCannotBeReversedDisclosure { priority } ... on ConfirmPurchaseTransactionDisclosure { priority } ... on PrePaymentRemittanceDisclosure { priority } ... on ForeignTaxDisclosure { priority } ... on PaymentHoldDisclosure { priority holdDuration } ... on StateMandatedFraudulentActivityDisclosure { priority } ... on DelayedDebitDisclosure { priority maxDuration } ... on PaymentLinkAchDisclosure { priority } ... on PaymentLinkGenericDisclosure { priority } ... on PaymentLinkAchWithTermDisclosure { priority } ... on PaymentLinkGenericWithTermDisclosure { priority } ... on UnilateralRecipientDisclosure { priority } }  fragment P2PFundingOptionsFragment on PaymentTransferFundingContext { allowedOptions { id fundingSources { amount { currencyCode value __typename } instrument { __typename ... on BankAccount { __typename ...BankAccountFields } ... on Balance { __typename ...BalanceFields } ... on Card { __typename ...CardFields } } currencyConversionProvider __typename } backupFundingSources { instrument { __typename ... on BankAccount { __typename ...BankAccountFields } ... on Balance { __typename ...BalanceFields } ... on Card { __typename ...CardFields } } __typename } amountsBreakdown { sender { amountSent { currencyCode value __typename } totalFee { currencyCode value __typename } feeBreakdown { instrumentFees { currencyCode value __typename } crossBorderFees { currencyCode value __typename } __typename } totalAmountSent { currencyCode value __typename } __typename } receiver { amountReceived { currencyCode value __typename } __typename } __typename } default currencyExchange { __typename amountFrom { __typename ...P2PMoneyFragment } amountTo { __typename ...P2PMoneyFragment } exchangeRate { fromCurrency { __typename ...P2PMoneyFragment } toCurrency { __typename ...P2PMoneyFragment } __typename } ... on FiatCurrencyExchange { fxQuoteId } } paymentDelivery { speed minimumDuration maximumDuration estimatedArrivalTime } paymentDisclosures: disclosures { __typename ...PaymentPlanDisclosureFragment } planContingencies: contingencies { __typename ...PlanContingencyFragment } __typename } paymentContingencies: contingencies { __typename ...PaymentContingencyFragment } prePaymentDisclosures: disclosures { __typename ...PrePaymentDisclosureFragment } __typename }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptCurrencyConversionProviderInput updatePaymentTransferAttemptCurrencyConversionProviderInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePaymentTransferAttemptCurrencyConversionProviderMutation(input=");
        sb.append(updatePaymentTransferAttemptCurrencyConversionProviderInput);
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
        return (other instanceof com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation) other).input);
    }

    public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation copy(com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptCurrencyConversionProviderInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptCurrencyConversionProviderInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation copy$default(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation updatePaymentTransferAttemptCurrencyConversionProviderMutation, com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptCurrencyConversionProviderInput updatePaymentTransferAttemptCurrencyConversionProviderInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            updatePaymentTransferAttemptCurrencyConversionProviderInput = updatePaymentTransferAttemptCurrencyConversionProviderMutation.input;
        }
        return updatePaymentTransferAttemptCurrencyConversionProviderMutation.copy(updatePaymentTransferAttemptCurrencyConversionProviderInput);
    }
}
