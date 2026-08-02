package com.paypal.oslo.feature.p2p.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:-!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKL B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OPERATION_NAME, "PaymentTransferAttempt", "TransferAmount", "Note", "Media", "RecommendedContact", "Name", "OnPersonName", "OnBusinessName", "Receiver", "Name1", "OnPersonName1", "OnBusinessName1", "SupportedTransferType", "FundingOptions", "AllowedOption", "FundingSource", "Amount", "Instrument", "OnBankAccount", "BankIssuer", "OnBalance", "AvailableAmount", "OnCard", "CardIssuer", "BackupFundingSource", "Instrument1", "OnBankAccount1", "BankIssuer1", "OnBalance1", "AvailableAmount1", "OnCard1", "CardIssuer1", "AmountsBreakdown", "Sender", "AmountSent", "TotalFee", "FeeBreakdown", "InstrumentFees", "CrossBorderFees", "TotalAmountSent", "Receiver1", "AmountReceived"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StartPaymentTransferAttemptMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Companion INSTANCE = new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Companion(null);
    public static final java.lang.String OPERATION_ID = "ba5da55ec945e5cca0ba3c4b813b0643b54942d6f8aa35f31731d2bab67ead97";
    public static final java.lang.String OPERATION_NAME = "StartPaymentTransferAttempt";

    public final boolean equals(java.lang.Object other) {
        return other != null && other.getClass() == getClass();
    }

    public final int hashCode() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).hashCode();
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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.p2p.graphql.selections.StartPaymentTransferAttemptMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$StartPaymentTransferAttempt;", "startPaymentTransferAttempt", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$StartPaymentTransferAttempt;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$StartPaymentTransferAttempt;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$StartPaymentTransferAttempt;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$StartPaymentTransferAttempt;", "getStartPaymentTransferAttempt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.StartPaymentTransferAttempt startPaymentTransferAttempt;

        public Data(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.StartPaymentTransferAttempt startPaymentTransferAttempt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startPaymentTransferAttempt, "");
            this.startPaymentTransferAttempt = startPaymentTransferAttempt;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.StartPaymentTransferAttempt getStartPaymentTransferAttempt() {
            return this.startPaymentTransferAttempt;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.StartPaymentTransferAttempt startPaymentTransferAttempt = this.startPaymentTransferAttempt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(startPaymentTransferAttempt=");
            sb.append(startPaymentTransferAttempt);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.startPaymentTransferAttempt.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.startPaymentTransferAttempt, ((com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Data) other).startPaymentTransferAttempt);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Data copy(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.StartPaymentTransferAttempt startPaymentTransferAttempt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startPaymentTransferAttempt, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Data(startPaymentTransferAttempt);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.StartPaymentTransferAttempt getStartPaymentTransferAttempt() {
            return this.startPaymentTransferAttempt;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Data copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Data data, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.StartPaymentTransferAttempt startPaymentTransferAttempt, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                startPaymentTransferAttempt = data.startPaymentTransferAttempt;
            }
            return data.copy(startPaymentTransferAttempt);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$StartPaymentTransferAttempt;", "", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$PaymentTransferAttempt;", "paymentTransferAttempt", "", "__typename", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$PaymentTransferAttempt;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$PaymentTransferAttempt;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$PaymentTransferAttempt;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$StartPaymentTransferAttempt;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$PaymentTransferAttempt;", "getPaymentTransferAttempt", "Ljava/lang/String;", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class StartPaymentTransferAttempt {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt;

        public StartPaymentTransferAttempt(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferAttempt, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.paymentTransferAttempt = paymentTransferAttempt;
            this.__typename = str;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.PaymentTransferAttempt getPaymentTransferAttempt() {
            return this.paymentTransferAttempt;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt = this.paymentTransferAttempt;
            java.lang.String str = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StartPaymentTransferAttempt(paymentTransferAttempt=");
            sb.append(paymentTransferAttempt);
            sb.append(", __typename=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.paymentTransferAttempt.hashCode() * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.StartPaymentTransferAttempt)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.StartPaymentTransferAttempt startPaymentTransferAttempt = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.StartPaymentTransferAttempt) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTransferAttempt, startPaymentTransferAttempt.paymentTransferAttempt) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, startPaymentTransferAttempt.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.StartPaymentTransferAttempt copy(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferAttempt, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.StartPaymentTransferAttempt(paymentTransferAttempt, __typename);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.PaymentTransferAttempt getPaymentTransferAttempt() {
            return this.paymentTransferAttempt;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.StartPaymentTransferAttempt copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.StartPaymentTransferAttempt startPaymentTransferAttempt, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentTransferAttempt = startPaymentTransferAttempt.paymentTransferAttempt;
            }
            if ((i & 2) != 0) {
                str = startPaymentTransferAttempt.__typename;
            }
            return startPaymentTransferAttempt.copy(paymentTransferAttempt, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b+\u0010,J\u009e\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b6\u0010,R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u00107\u001a\u0004\b8\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010\u001cR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b@\u0010 R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010A\u0012\u0004\bC\u0010<\u001a\u0004\bB\u0010\"R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\bD\u0010\u001eR\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010E\u0012\u0004\bG\u0010<\u001a\u0004\bF\u0010%R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\bH\u0010\u001eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010I\u001a\u0004\bJ\u0010(R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010K\u001a\u0004\bL\u0010*R\u001a\u0010\u0016\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010M\u001a\u0004\bN\u0010,"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$PaymentTransferAttempt;", "", "id", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TransferAmount;", "transferAmount", "", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferIntent;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SUPPORTED_INTENTS, "selectedIntent", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Note;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE, "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$RecommendedContact;", "recommendedContacts", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Receiver;", "receiver", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$SupportedTransferType;", "supportedTransferTypes", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;", "selectedTransferType", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$FundingOptions;", "fundingOptions", "", "__typename", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TransferAmount;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferIntent;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Note;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Receiver;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$FundingOptions;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TransferAmount;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferIntent;", "component5", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Note;", "component6", "component7", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Receiver;", "component8", "component9", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;", "component10", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$FundingOptions;", "component11", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TransferAmount;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferIntent;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Note;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Receiver;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$FundingOptions;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$PaymentTransferAttempt;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getId", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TransferAmount;", "getTransferAmount", "getTransferAmount$annotations", "()V", "Ljava/util/List;", "getSupportedIntents", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferIntent;", "getSelectedIntent", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Note;", "getNote", "getNote$annotations", "getRecommendedContacts", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Receiver;", "getReceiver", "getReceiver$annotations", "getSupportedTransferTypes", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;", "getSelectedTransferType", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$FundingOptions;", "getFundingOptions", "Ljava/lang/String;", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentTransferAttempt {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingOptions fundingOptions;
        private final java.lang.Object id;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Note note;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver receiver;
        private final java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.RecommendedContact> recommendedContacts;
        private final com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent selectedIntent;
        private final com.paypal.oslo.api.graphql.schema.type.PaymentTransferType selectedTransferType;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent> supportedIntents;
        private final java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.SupportedTransferType> supportedTransferTypes;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TransferAmount transferAmount;

        @kotlin.Deprecated(message = "Use paymentTransferNote field instead")
        public static /* synthetic */ void getNote$annotations() {
        }

        @kotlin.Deprecated(message = "Use `recipient` instead. PayPal account recipients will be added in a future release.")
        public static /* synthetic */ void getReceiver$annotations() {
        }

        @kotlin.Deprecated(message = "Use `amount` instead.")
        public static /* synthetic */ void getTransferAmount$annotations() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PaymentTransferAttempt(java.lang.Object obj, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TransferAmount transferAmount, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent> list, com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent paymentTransferIntent, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Note note, java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.RecommendedContact> list2, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver receiver, java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.SupportedTransferType> list3, com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingOptions fundingOptions, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = obj;
            this.transferAmount = transferAmount;
            this.supportedIntents = list;
            this.selectedIntent = paymentTransferIntent;
            this.note = note;
            this.recommendedContacts = list2;
            this.receiver = receiver;
            this.supportedTransferTypes = list3;
            this.selectedTransferType = paymentTransferType;
            this.fundingOptions = fundingOptions;
            this.__typename = str;
        }

        public final java.lang.Object getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TransferAmount getTransferAmount() {
            return this.transferAmount;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent> getSupportedIntents() {
            return this.supportedIntents;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent getSelectedIntent() {
            return this.selectedIntent;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Note getNote() {
            return this.note;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.RecommendedContact> getRecommendedContacts() {
            return this.recommendedContacts;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver getReceiver() {
            return this.receiver;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.SupportedTransferType> getSupportedTransferTypes() {
            return this.supportedTransferTypes;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferType getSelectedTransferType() {
            return this.selectedTransferType;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingOptions getFundingOptions() {
            return this.fundingOptions;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.id;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TransferAmount transferAmount = this.transferAmount;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent> list = this.supportedIntents;
            com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent paymentTransferIntent = this.selectedIntent;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Note note = this.note;
            java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.RecommendedContact> list2 = this.recommendedContacts;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver receiver = this.receiver;
            java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.SupportedTransferType> list3 = this.supportedTransferTypes;
            com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType = this.selectedTransferType;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingOptions fundingOptions = this.fundingOptions;
            java.lang.String str = this.__typename;
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
            sb.append(", fundingOptions=");
            sb.append(fundingOptions);
            sb.append(", __typename=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TransferAmount transferAmount = this.transferAmount;
            int hashCode2 = transferAmount == null ? 0 : transferAmount.hashCode();
            int hashCode3 = this.supportedIntents.hashCode();
            com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent paymentTransferIntent = this.selectedIntent;
            int hashCode4 = paymentTransferIntent == null ? 0 : paymentTransferIntent.hashCode();
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Note note = this.note;
            int hashCode5 = note == null ? 0 : note.hashCode();
            java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.RecommendedContact> list = this.recommendedContacts;
            int hashCode6 = list == null ? 0 : list.hashCode();
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver receiver = this.receiver;
            int hashCode7 = receiver == null ? 0 : receiver.hashCode();
            int hashCode8 = this.supportedTransferTypes.hashCode();
            com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType = this.selectedTransferType;
            int hashCode9 = paymentTransferType == null ? 0 : paymentTransferType.hashCode();
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingOptions fundingOptions = this.fundingOptions;
            return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (fundingOptions != null ? fundingOptions.hashCode() : 0)) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.PaymentTransferAttempt)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.PaymentTransferAttempt paymentTransferAttempt = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.PaymentTransferAttempt) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, paymentTransferAttempt.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferAmount, paymentTransferAttempt.transferAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.supportedIntents, paymentTransferAttempt.supportedIntents) && this.selectedIntent == paymentTransferAttempt.selectedIntent && kotlin.jvm.internal.Intrinsics.areEqual(this.note, paymentTransferAttempt.note) && kotlin.jvm.internal.Intrinsics.areEqual(this.recommendedContacts, paymentTransferAttempt.recommendedContacts) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiver, paymentTransferAttempt.receiver) && kotlin.jvm.internal.Intrinsics.areEqual(this.supportedTransferTypes, paymentTransferAttempt.supportedTransferTypes) && this.selectedTransferType == paymentTransferAttempt.selectedTransferType && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptions, paymentTransferAttempt.fundingOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, paymentTransferAttempt.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.PaymentTransferAttempt copy(java.lang.Object id, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TransferAmount transferAmount, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent> supportedIntents, com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent selectedIntent, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Note note, java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.RecommendedContact> recommendedContacts, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver receiver, java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.SupportedTransferType> supportedTransferTypes, com.paypal.oslo.api.graphql.schema.type.PaymentTransferType selectedTransferType, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingOptions fundingOptions, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedIntents, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedTransferTypes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.PaymentTransferAttempt(id, transferAmount, supportedIntents, selectedIntent, note, recommendedContacts, receiver, supportedTransferTypes, selectedTransferType, fundingOptions, __typename);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferType getSelectedTransferType() {
            return this.selectedTransferType;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.SupportedTransferType> component8() {
            return this.supportedTransferTypes;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver getReceiver() {
            return this.receiver;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.RecommendedContact> component6() {
            return this.recommendedContacts;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Note getNote() {
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
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TransferAmount getTransferAmount() {
            return this.transferAmount;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingOptions getFundingOptions() {
            return this.fundingOptions;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TransferAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TransferAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TransferAmount)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TransferAmount transferAmount = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TransferAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, transferAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, transferAmount.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, transferAmount.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TransferAmount copy(java.lang.Object currencyCode, java.lang.String value, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TransferAmount(currencyCode, value, __typename);
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

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TransferAmount copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TransferAmount transferAmount, java.lang.Object obj, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj2) {
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

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ2\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Note;", "", "", "memo", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Media;", io.ktor.http.LinkHeader.Parameters.Media, "__typename", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Media;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Media;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Media;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Note;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMemo", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Media;", "getMedia", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Note {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Media media;
        private final java.lang.String memo;

        public Note(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Media media, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.memo = str;
            this.media = media;
            this.__typename = str2;
        }

        public final java.lang.String getMemo() {
            return this.memo;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Media getMedia() {
            return this.media;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.memo;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Media media = this.media;
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
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Media media = this.media;
            return (((hashCode * 31) + (media != null ? media.hashCode() : 0)) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Note)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Note note = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Note) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.memo, note.memo) && kotlin.jvm.internal.Intrinsics.areEqual(this.media, note.media) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, note.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Note copy(java.lang.String memo, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Media media, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Note(memo, media, __typename);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Media getMedia() {
            return this.media;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMemo() {
            return this.memo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Note copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Note note, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Media media, java.lang.String str2, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\fJB\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b#\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b$\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Media;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;", "provider", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "referenceUrl", "__typename", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;", "component3", "()Ljava/lang/Object;", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Media;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;", "getProvider", "Ljava/lang/Object;", "getContentType", "getReferenceUrl", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Media)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Media media = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Media) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, media.id) && this.provider == media.provider && kotlin.jvm.internal.Intrinsics.areEqual(this.contentType, media.contentType) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceUrl, media.referenceUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, media.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Media copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.MediaProvider provider, java.lang.Object contentType, java.lang.Object referenceUrl, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Media(id, provider, contentType, referenceUrl, __typename);
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

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Media copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Media media, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MediaProvider mediaProvider, java.lang.Object obj, java.lang.Object obj2, java.lang.String str2, int i, java.lang.Object obj3) {
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

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0013Jp\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010\u001cR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b7\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b8\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$RecommendedContact;", "", "", "id", "accountId", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Name;", "name", "Lcom/paypal/oslo/api/graphql/schema/type/PeerType;", "type", "profilePhotoUrl", "Lcom/paypal/oslo/api/graphql/schema/type/PeerStatus;", "status", "", "favorite", com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper.ERROR_MSG_BLOCKED, "__typename", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Name;Lcom/paypal/oslo/api/graphql/schema/type/PeerType;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PeerStatus;ZZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Name;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/PeerType;", "component5", "()Ljava/lang/Object;", "component6", "()Lcom/paypal/oslo/api/graphql/schema/type/PeerStatus;", "component7", "()Z", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Name;Lcom/paypal/oslo/api/graphql/schema/type/PeerType;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PeerStatus;ZZLjava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$RecommendedContact;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getAccountId", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Name;", "getName", "Lcom/paypal/oslo/api/graphql/schema/type/PeerType;", "getType", "Ljava/lang/Object;", "getProfilePhotoUrl", "Lcom/paypal/oslo/api/graphql/schema/type/PeerStatus;", "getStatus", "Z", "getFavorite", "getBlocked", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RecommendedContact {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.String accountId;
        private final boolean blocked;
        private final boolean favorite;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name name;
        private final java.lang.Object profilePhotoUrl;
        private final com.paypal.oslo.api.graphql.schema.type.PeerStatus status;
        private final com.paypal.oslo.api.graphql.schema.type.PeerType type;

        public RecommendedContact(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name name2, com.paypal.oslo.api.graphql.schema.type.PeerType peerType, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PeerStatus peerStatus, boolean z, boolean z2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peerType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peerStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.id = str;
            this.accountId = str2;
            this.name = name2;
            this.type = peerType;
            this.profilePhotoUrl = obj;
            this.status = peerStatus;
            this.favorite = z;
            this.blocked = z2;
            this.__typename = str3;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name getName() {
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

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.accountId;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name name2 = this.name;
            com.paypal.oslo.api.graphql.schema.type.PeerType peerType = this.type;
            java.lang.Object obj = this.profilePhotoUrl;
            com.paypal.oslo.api.graphql.schema.type.PeerStatus peerStatus = this.status;
            boolean z = this.favorite;
            boolean z2 = this.blocked;
            java.lang.String str3 = this.__typename;
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
            sb.append(", __typename=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.accountId;
            int hashCode2 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name name2 = this.name;
            int hashCode3 = name2 == null ? 0 : name2.hashCode();
            int hashCode4 = this.type.hashCode();
            java.lang.Object obj = this.profilePhotoUrl;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (obj != null ? obj.hashCode() : 0)) * 31) + this.status.hashCode()) * 31) + java.lang.Boolean.hashCode(this.favorite)) * 31) + java.lang.Boolean.hashCode(this.blocked)) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.RecommendedContact)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.RecommendedContact recommendedContact = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.RecommendedContact) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, recommendedContact.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, recommendedContact.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, recommendedContact.name) && this.type == recommendedContact.type && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePhotoUrl, recommendedContact.profilePhotoUrl) && this.status == recommendedContact.status && this.favorite == recommendedContact.favorite && this.blocked == recommendedContact.blocked && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, recommendedContact.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.RecommendedContact copy(java.lang.String id, java.lang.String accountId, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name name2, com.paypal.oslo.api.graphql.schema.type.PeerType type, java.lang.Object profilePhotoUrl, com.paypal.oslo.api.graphql.schema.type.PeerStatus status, boolean favorite, boolean blocked, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.RecommendedContact(id, accountId, name2, type, profilePhotoUrl, status, favorite, blocked, __typename);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
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
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name getName() {
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

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Name;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnPersonName;", "onPersonName", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBusinessName;", "onBusinessName", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnPersonName;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBusinessName;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnPersonName;", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBusinessName;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnPersonName;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBusinessName;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Name;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnPersonName;", "getOnPersonName", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBusinessName;", "getOnBusinessName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Name {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName onBusinessName;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName onPersonName;

        public Name(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName onPersonName, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName onBusinessName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onPersonName = onPersonName;
            this.onBusinessName = onBusinessName;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName getOnPersonName() {
            return this.onPersonName;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName getOnBusinessName() {
            return this.onBusinessName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName onPersonName = this.onPersonName;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName onBusinessName = this.onBusinessName;
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
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName onPersonName = this.onPersonName;
            int hashCode2 = onPersonName == null ? 0 : onPersonName.hashCode();
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName onBusinessName = this.onBusinessName;
            return (((hashCode * 31) + hashCode2) * 31) + (onBusinessName != null ? onBusinessName.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name name2 = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, name2.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPersonName, name2.onPersonName) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBusinessName, name2.onBusinessName);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName onPersonName, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName onBusinessName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name(__typename, onPersonName, onBusinessName);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName getOnBusinessName() {
            return this.onBusinessName;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName getOnPersonName() {
            return this.onPersonName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name name2, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName onPersonName, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName onBusinessName, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJn\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b%\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b&\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b'\u0010\u000eR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b(\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnPersonName;", "", "", "prefix", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "secondSurname", com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "suffix", "fullName", "__typename", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnPersonName;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPrefix", "getGivenName", "getSurname", "getSecondSurname", "getMiddleName", "getSuffix", "getFullName", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName onPersonName = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.prefix, onPersonName.prefix) && kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, onPersonName.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, onPersonName.surname) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondSurname, onPersonName.secondSurname) && kotlin.jvm.internal.Intrinsics.areEqual(this.middleName, onPersonName.middleName) && kotlin.jvm.internal.Intrinsics.areEqual(this.suffix, onPersonName.suffix) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, onPersonName.fullName) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onPersonName.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName copy(java.lang.String prefix, java.lang.String givenName, java.lang.String surname, java.lang.String secondSurname, java.lang.String middleName, java.lang.String suffix, java.lang.String fullName, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName(prefix, givenName, surname, secondSurname, middleName, suffix, fullName, __typename);
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

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBusinessName;", "", "", "businessName", "Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "orthography", "__typename", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/Orthography;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/Orthography;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBusinessName;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBusinessName", "Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "getOrthography", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName onBusinessName = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.businessName, onBusinessName.businessName) && this.orthography == onBusinessName.orthography && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBusinessName.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName copy(java.lang.String businessName, com.paypal.oslo.api.graphql.schema.type.Orthography orthography, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName(businessName, orthography, __typename);
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

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName onBusinessName, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.Orthography orthography, java.lang.String str2, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000eJR\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b)\u0010\u0010R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b*\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Receiver;", "", "", "accountId", "id", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentReceiverType;", "type", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Name1;", "name", "profilePhotoUrl", "__typename", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PaymentReceiverType;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Name1;Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentReceiverType;", "component4", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Name1;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PaymentReceiverType;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Name1;Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Receiver;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccountId", "Ljava/lang/Object;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentReceiverType;", "getType", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Name1;", "getName", "getProfilePhotoUrl", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Receiver {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.String accountId;
        private final java.lang.Object id;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name1 name;
        private final java.lang.Object profilePhotoUrl;
        private final com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType type;

        public Receiver(java.lang.String str, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType paymentReceiverType, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name1 name1, java.lang.Object obj2, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReceiverType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.accountId = str;
            this.id = obj;
            this.type = paymentReceiverType;
            this.name = name1;
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

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name1 getName() {
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
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name1 name1 = this.name;
            java.lang.Object obj2 = this.profilePhotoUrl;
            java.lang.String str2 = this.__typename;
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
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name1 name1 = this.name;
            int hashCode4 = name1 == null ? 0 : name1.hashCode();
            java.lang.Object obj = this.profilePhotoUrl;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (obj != null ? obj.hashCode() : 0)) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver receiver = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, receiver.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, receiver.id) && this.type == receiver.type && kotlin.jvm.internal.Intrinsics.areEqual(this.name, receiver.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePhotoUrl, receiver.profilePhotoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, receiver.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver copy(java.lang.String accountId, java.lang.Object id, com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType type, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name1 name2, java.lang.Object profilePhotoUrl, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver(accountId, id, type, name2, profilePhotoUrl, __typename);
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
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name1 getName() {
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

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver receiver, java.lang.String str, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType paymentReceiverType, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name1 name1, java.lang.Object obj2, java.lang.String str2, int i, java.lang.Object obj3) {
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
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name1 name12 = name1;
            if ((i & 16) != 0) {
                obj2 = receiver.profilePhotoUrl;
            }
            java.lang.Object obj5 = obj2;
            if ((i & 32) != 0) {
                str2 = receiver.__typename;
            }
            return receiver.copy(str, obj4, paymentReceiverType2, name12, obj5, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Name1;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnPersonName1;", "onPersonName", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBusinessName1;", "onBusinessName", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnPersonName1;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBusinessName1;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnPersonName1;", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBusinessName1;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnPersonName1;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBusinessName1;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Name1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnPersonName1;", "getOnPersonName", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBusinessName1;", "getOnBusinessName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Name1 {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName1 onBusinessName;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName1 onPersonName;

        public Name1(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName1 onPersonName1, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName1 onBusinessName1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onPersonName = onPersonName1;
            this.onBusinessName = onBusinessName1;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName1 getOnPersonName() {
            return this.onPersonName;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName1 getOnBusinessName() {
            return this.onBusinessName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName1 onPersonName1 = this.onPersonName;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName1 onBusinessName1 = this.onBusinessName;
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
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName1 onPersonName1 = this.onPersonName;
            int hashCode2 = onPersonName1 == null ? 0 : onPersonName1.hashCode();
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName1 onBusinessName1 = this.onBusinessName;
            return (((hashCode * 31) + hashCode2) * 31) + (onBusinessName1 != null ? onBusinessName1.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name1)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name1 name1 = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, name1.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPersonName, name1.onPersonName) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBusinessName, name1.onBusinessName);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name1 copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName1 onPersonName, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName1 onBusinessName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name1(__typename, onPersonName, onBusinessName);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName1 getOnBusinessName() {
            return this.onBusinessName;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName1 getOnPersonName() {
            return this.onPersonName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name1 copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Name1 name1, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName1 onPersonName1, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName1 onBusinessName1, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJn\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b%\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b&\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b'\u0010\u000eR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b(\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnPersonName1;", "", "", "prefix", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "secondSurname", com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "suffix", "fullName", "__typename", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnPersonName1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPrefix", "getGivenName", "getSurname", "getSecondSurname", "getMiddleName", "getSuffix", "getFullName", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class OnPersonName1 {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final java.lang.String fullName;
        private final java.lang.String givenName;
        private final java.lang.String middleName;
        private final java.lang.String prefix;
        private final java.lang.String secondSurname;
        private final java.lang.String suffix;
        private final java.lang.String surname;

        public OnPersonName1(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPersonName1(prefix=");
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName1)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName1 onPersonName1 = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.prefix, onPersonName1.prefix) && kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, onPersonName1.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, onPersonName1.surname) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondSurname, onPersonName1.secondSurname) && kotlin.jvm.internal.Intrinsics.areEqual(this.middleName, onPersonName1.middleName) && kotlin.jvm.internal.Intrinsics.areEqual(this.suffix, onPersonName1.suffix) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, onPersonName1.fullName) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onPersonName1.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName1 copy(java.lang.String prefix, java.lang.String givenName, java.lang.String surname, java.lang.String secondSurname, java.lang.String middleName, java.lang.String suffix, java.lang.String fullName, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnPersonName1(prefix, givenName, surname, secondSurname, middleName, suffix, fullName, __typename);
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

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBusinessName1;", "", "", "businessName", "Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "orthography", "__typename", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/Orthography;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/Orthography;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBusinessName1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBusinessName", "Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "getOrthography", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class OnBusinessName1 {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final java.lang.String businessName;
        private final com.paypal.oslo.api.graphql.schema.type.Orthography orthography;

        public OnBusinessName1(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.Orthography orthography, java.lang.String str2) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBusinessName1(businessName=");
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName1)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName1 onBusinessName1 = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.businessName, onBusinessName1.businessName) && this.orthography == onBusinessName1.orthography && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBusinessName1.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName1 copy(java.lang.String businessName, com.paypal.oslo.api.graphql.schema.type.Orthography orthography, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName1(businessName, orthography, __typename);
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

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName1 copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBusinessName1 onBusinessName1, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.Orthography orthography, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBusinessName1.businessName;
            }
            if ((i & 2) != 0) {
                orthography = onBusinessName1.orthography;
            }
            if ((i & 4) != 0) {
                str2 = onBusinessName1.__typename;
            }
            return onBusinessName1.copy(str, orthography, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$SupportedTransferType;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;", "type", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "", "__typename", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;ZLjava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;", "component2", "()Z", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;ZLjava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$SupportedTransferType;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;", "getType", "Z", "getDefault", "Ljava/lang/String;", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SupportedTransferType {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final boolean default;
        private final com.paypal.oslo.api.graphql.schema.type.PaymentTransferType type;

        public SupportedTransferType(com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType, boolean z, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.type = paymentTransferType;
            this.default = z;
            this.__typename = str;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferType getType() {
            return this.type;
        }

        public final boolean getDefault() {
            return this.default;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType = this.type;
            boolean z = this.default;
            java.lang.String str = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SupportedTransferType(type=");
            sb.append(paymentTransferType);
            sb.append(", default=");
            sb.append(z);
            sb.append(", __typename=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.type.hashCode() * 31) + java.lang.Boolean.hashCode(this.default)) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.SupportedTransferType)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.SupportedTransferType supportedTransferType = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.SupportedTransferType) other;
            return this.type == supportedTransferType.type && this.default == supportedTransferType.default && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, supportedTransferType.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.SupportedTransferType copy(com.paypal.oslo.api.graphql.schema.type.PaymentTransferType type, boolean r3, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.SupportedTransferType(type, r3, __typename);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getDefault() {
            return this.default;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.SupportedTransferType copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.SupportedTransferType supportedTransferType, com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentTransferType = supportedTransferType.type;
            }
            if ((i & 2) != 0) {
                z = supportedTransferType.default;
            }
            if ((i & 4) != 0) {
                str = supportedTransferType.__typename;
            }
            return supportedTransferType.copy(paymentTransferType, z, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$FundingOptions;", "", "", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AllowedOption;", "allowedOptions", "", "__typename", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$FundingOptions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getAllowedOptions", "getAllowedOptions$annotations", "()V", "Ljava/lang/String;", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingOptions {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AllowedOption> allowedOptions;

        @kotlin.Deprecated(message = "Use `availablePlans` instead.")
        public static /* synthetic */ void getAllowedOptions$annotations() {
        }

        public FundingOptions(java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AllowedOption> list, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.allowedOptions = list;
            this.__typename = str;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AllowedOption> getAllowedOptions() {
            return this.allowedOptions;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AllowedOption> list = this.allowedOptions;
            java.lang.String str = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingOptions(allowedOptions=");
            sb.append(list);
            sb.append(", __typename=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.allowedOptions.hashCode() * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingOptions)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingOptions fundingOptions = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingOptions) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.allowedOptions, fundingOptions.allowedOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, fundingOptions.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingOptions copy(java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AllowedOption> allowedOptions, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allowedOptions, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingOptions(allowedOptions, __typename);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AllowedOption> component1() {
            return this.allowedOptions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingOptions copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingOptions fundingOptions, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = fundingOptions.allowedOptions;
            }
            if ((i & 2) != 0) {
                str = fundingOptions.__typename;
            }
            return fundingOptions.copy(list, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\\\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b#\u0010\u001aR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010$\u001a\u0004\b%\u0010\u0011R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0013R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b(\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0018R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AllowedOption;", "", "id", "", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$FundingSource;", "fundingSources", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$BackupFundingSource;", "backupFundingSources", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountsBreakdown;", "amountsBreakdown", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "", "__typename", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountsBreakdown;ZLjava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountsBreakdown;", "component5", "()Z", "component6", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountsBreakdown;ZLjava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AllowedOption;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getId", "Ljava/util/List;", "getFundingSources", "getBackupFundingSources", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountsBreakdown;", "getAmountsBreakdown", "Z", "getDefault", "Ljava/lang/String;", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AllowedOption {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountsBreakdown amountsBreakdown;
        private final java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BackupFundingSource> backupFundingSources;
        private final boolean default;
        private final java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingSource> fundingSources;
        private final java.lang.Object id;

        public AllowedOption(java.lang.Object obj, java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingSource> list, java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BackupFundingSource> list2, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountsBreakdown amountsBreakdown, boolean z, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = obj;
            this.fundingSources = list;
            this.backupFundingSources = list2;
            this.amountsBreakdown = amountsBreakdown;
            this.default = z;
            this.__typename = str;
        }

        public final java.lang.Object getId() {
            return this.id;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingSource> getFundingSources() {
            return this.fundingSources;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BackupFundingSource> getBackupFundingSources() {
            return this.backupFundingSources;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountsBreakdown getAmountsBreakdown() {
            return this.amountsBreakdown;
        }

        public final boolean getDefault() {
            return this.default;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.id;
            java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingSource> list = this.fundingSources;
            java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BackupFundingSource> list2 = this.backupFundingSources;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountsBreakdown amountsBreakdown = this.amountsBreakdown;
            boolean z = this.default;
            java.lang.String str = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AllowedOption(id=");
            sb.append(obj);
            sb.append(", fundingSources=");
            sb.append(list);
            sb.append(", backupFundingSources=");
            sb.append(list2);
            sb.append(", amountsBreakdown=");
            sb.append(amountsBreakdown);
            sb.append(", default=");
            sb.append(z);
            sb.append(", __typename=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.fundingSources.hashCode();
            java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BackupFundingSource> list = this.backupFundingSources;
            int hashCode3 = list == null ? 0 : list.hashCode();
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountsBreakdown amountsBreakdown = this.amountsBreakdown;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (amountsBreakdown != null ? amountsBreakdown.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.default)) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AllowedOption)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AllowedOption allowedOption = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AllowedOption) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, allowedOption.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSources, allowedOption.fundingSources) && kotlin.jvm.internal.Intrinsics.areEqual(this.backupFundingSources, allowedOption.backupFundingSources) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountsBreakdown, allowedOption.amountsBreakdown) && this.default == allowedOption.default && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, allowedOption.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AllowedOption copy(java.lang.Object id, java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingSource> fundingSources, java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BackupFundingSource> backupFundingSources, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountsBreakdown amountsBreakdown, boolean r13, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSources, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AllowedOption(id, fundingSources, backupFundingSources, amountsBreakdown, r13, __typename);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getDefault() {
            return this.default;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountsBreakdown getAmountsBreakdown() {
            return this.amountsBreakdown;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BackupFundingSource> component3() {
            return this.backupFundingSources;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingSource> component2() {
            return this.fundingSources;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AllowedOption copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AllowedOption allowedOption, java.lang.Object obj, java.util.List list, java.util.List list2, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountsBreakdown amountsBreakdown, boolean z, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = allowedOption.id;
            }
            if ((i & 2) != 0) {
                list = allowedOption.fundingSources;
            }
            java.util.List list3 = list;
            if ((i & 4) != 0) {
                list2 = allowedOption.backupFundingSources;
            }
            java.util.List list4 = list2;
            if ((i & 8) != 0) {
                amountsBreakdown = allowedOption.amountsBreakdown;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountsBreakdown amountsBreakdown2 = amountsBreakdown;
            if ((i & 16) != 0) {
                z = allowedOption.default;
            }
            boolean z2 = z;
            if ((i & 32) != 0) {
                str = allowedOption.__typename;
            }
            return allowedOption.copy(obj, list3, list4, amountsBreakdown2, z2, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$FundingSource;", "", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Amount;", "amount", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Instrument;", "instrument", "", "__typename", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Amount;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Instrument;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Amount;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Instrument;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Amount;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Instrument;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$FundingSource;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Amount;", "getAmount", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Instrument;", "getInstrument", "Ljava/lang/String;", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class FundingSource {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Amount amount;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument instrument;

        public FundingSource(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Amount amount, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument instrument, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrument, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amount = amount;
            this.instrument = instrument;
            this.__typename = str;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Amount getAmount() {
            return this.amount;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument getInstrument() {
            return this.instrument;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Amount amount = this.amount;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument instrument = this.instrument;
            java.lang.String str = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingSource(amount=");
            sb.append(amount);
            sb.append(", instrument=");
            sb.append(instrument);
            sb.append(", __typename=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.amount.hashCode() * 31) + this.instrument.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingSource)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingSource fundingSource = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingSource) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, fundingSource.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrument, fundingSource.instrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, fundingSource.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingSource copy(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Amount amount, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument instrument, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrument, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingSource(amount, instrument, __typename);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument getInstrument() {
            return this.instrument;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Amount getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingSource copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FundingSource fundingSource, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Amount amount, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument instrument, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amount = fundingSource.amount;
            }
            if ((i & 2) != 0) {
                instrument = fundingSource.instrument;
            }
            if ((i & 4) != 0) {
                str = fundingSource.__typename;
            }
            return fundingSource.copy(amount, instrument, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Amount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public Amount(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Amount amount = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, amount.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amount.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Amount copy(java.lang.Object currencyCode, java.lang.String value, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Amount(currencyCode, value, __typename);
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

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Amount copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Amount amount, java.lang.Object obj, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = amount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = amount.value;
            }
            if ((i & 4) != 0) {
                str2 = amount.__typename;
            }
            return amount.copy(obj, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Instrument;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBankAccount;", "onBankAccount", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBalance;", "onBalance", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnCard;", "onCard", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBankAccount;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBalance;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnCard;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBankAccount;", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBalance;", "component4", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnCard;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBankAccount;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBalance;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnCard;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Instrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBankAccount;", "getOnBankAccount", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBalance;", "getOnBalance", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnCard;", "getOnCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Instrument {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance onBalance;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount onBankAccount;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard onCard;

        public Instrument(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount onBankAccount, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance onBalance, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard onCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onBankAccount = onBankAccount;
            this.onBalance = onBalance;
            this.onCard = onCard;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount getOnBankAccount() {
            return this.onBankAccount;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance getOnBalance() {
            return this.onBalance;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard getOnCard() {
            return this.onCard;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount onBankAccount = this.onBankAccount;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance onBalance = this.onBalance;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard onCard = this.onCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Instrument(__typename=");
            sb.append(str);
            sb.append(", onBankAccount=");
            sb.append(onBankAccount);
            sb.append(", onBalance=");
            sb.append(onBalance);
            sb.append(", onCard=");
            sb.append(onCard);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount onBankAccount = this.onBankAccount;
            int hashCode2 = onBankAccount == null ? 0 : onBankAccount.hashCode();
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance onBalance = this.onBalance;
            int hashCode3 = onBalance == null ? 0 : onBalance.hashCode();
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard onCard = this.onCard;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (onCard != null ? onCard.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument instrument = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, instrument.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBankAccount, instrument.onBankAccount) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBalance, instrument.onBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCard, instrument.onCard);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount onBankAccount, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance onBalance, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard onCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument(__typename, onBankAccount, onBalance, onCard);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard getOnCard() {
            return this.onCard;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance getOnBalance() {
            return this.onBalance;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount getOnBankAccount() {
            return this.onBankAccount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument instrument, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount onBankAccount, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance onBalance, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard onCard, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = instrument.__typename;
            }
            if ((i & 2) != 0) {
                onBankAccount = instrument.onBankAccount;
            }
            if ((i & 4) != 0) {
                onBalance = instrument.onBalance;
            }
            if ((i & 8) != 0) {
                onCard = instrument.onCard;
            }
            return instrument.copy(str, onBankAccount, onBalance, onCard);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJD\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBankAccount;", "", "", "id", "lastNChars", "nickname", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$BankIssuer;", "bankIssuer", "__typename", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$BankIssuer;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$BankIssuer;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$BankIssuer;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBankAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "getNickname", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$BankIssuer;", "getBankIssuer", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class OnBankAccount {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer bankIssuer;
        private final java.lang.String id;
        private final java.lang.String lastNChars;
        private final java.lang.String nickname;

        public OnBankAccount(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer bankIssuer, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankIssuer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.id = str;
            this.lastNChars = str2;
            this.nickname = str3;
            this.bankIssuer = bankIssuer;
            this.__typename = str4;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final java.lang.String getNickname() {
            return this.nickname;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer getBankIssuer() {
            return this.bankIssuer;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            java.lang.String str3 = this.nickname;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer bankIssuer = this.bankIssuer;
            java.lang.String str4 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBankAccount(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", nickname=");
            sb.append(str3);
            sb.append(", bankIssuer=");
            sb.append(bankIssuer);
            sb.append(", __typename=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.lastNChars.hashCode();
            java.lang.String str = this.nickname;
            return (((((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.bankIssuer.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount onBankAccount = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onBankAccount.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, onBankAccount.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.nickname, onBankAccount.nickname) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankIssuer, onBankAccount.bankIssuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBankAccount.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount copy(java.lang.String id, java.lang.String lastNChars, java.lang.String nickname, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer bankIssuer, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankIssuer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount(id, lastNChars, nickname, bankIssuer, __typename);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer getBankIssuer() {
            return this.bankIssuer;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getNickname() {
            return this.nickname;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount onBankAccount, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer bankIssuer, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBankAccount.id;
            }
            if ((i & 2) != 0) {
                str2 = onBankAccount.lastNChars;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = onBankAccount.nickname;
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                bankIssuer = onBankAccount.bankIssuer;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer bankIssuer2 = bankIssuer;
            if ((i & 16) != 0) {
                str4 = onBankAccount.__typename;
            }
            return onBankAccount.copy(str, str5, str6, bankIssuer2, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$BankIssuer;", "", "", "name", "__typename", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$BankIssuer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class BankIssuer {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final java.lang.String name;

        public BankIssuer(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.name = str;
            this.__typename = str2;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.String str2 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BankIssuer(name=");
            sb.append(str);
            sb.append(", __typename=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.name.hashCode() * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer bankIssuer = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, bankIssuer.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, bankIssuer.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer copy(java.lang.String name2, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer(name2, __typename);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer bankIssuer, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = bankIssuer.name;
            }
            if ((i & 2) != 0) {
                str2 = bankIssuer.__typename;
            }
            return bankIssuer.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBalance;", "", "", "id", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AvailableAmount;", "availableAmount", "__typename", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AvailableAmount;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AvailableAmount;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AvailableAmount;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AvailableAmount;", "getAvailableAmount", "getAvailableAmount$annotations", "()V", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBalance {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount availableAmount;
        private final java.lang.String id;

        @kotlin.Deprecated(message = "Use 'available' field instead for available balance")
        public static /* synthetic */ void getAvailableAmount$annotations() {
        }

        public OnBalance(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount availableAmount, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.availableAmount = availableAmount;
            this.__typename = str2;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount getAvailableAmount() {
            return this.availableAmount;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount availableAmount = this.availableAmount;
            java.lang.String str2 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBalance(id=");
            sb.append(str);
            sb.append(", availableAmount=");
            sb.append(availableAmount);
            sb.append(", __typename=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.id.hashCode() * 31) + this.availableAmount.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance onBalance = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onBalance.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableAmount, onBalance.availableAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBalance.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance copy(java.lang.String id, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount availableAmount, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance(id, availableAmount, __typename);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount getAvailableAmount() {
            return this.availableAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance onBalance, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount availableAmount, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBalance.id;
            }
            if ((i & 2) != 0) {
                availableAmount = onBalance.availableAmount;
            }
            if ((i & 4) != 0) {
                str2 = onBalance.__typename;
            }
            return onBalance.copy(str, availableAmount, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AvailableAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AvailableAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AvailableAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public AvailableAmount(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AvailableAmount(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount availableAmount = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, availableAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, availableAmount.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, availableAmount.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount copy(java.lang.Object currencyCode, java.lang.String value, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount(currencyCode, value, __typename);
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

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount availableAmount, java.lang.Object obj, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = availableAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = availableAmount.value;
            }
            if ((i & 4) != 0) {
                str2 = availableAmount.__typename;
            }
            return availableAmount.copy(obj, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnCard;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "brand", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CardIssuer;", "cardIssuer", "__typename", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CardIssuer;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "component4", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CardIssuer;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CardIssuer;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnCard;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "getBrand", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CardIssuer;", "getCardIssuer", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class OnCard {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.api.graphql.schema.type.CardBrand brand;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer cardIssuer;
        private final java.lang.String id;
        private final java.lang.String lastNChars;

        public OnCard(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer cardIssuer, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardBrand, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.id = str;
            this.lastNChars = str2;
            this.brand = cardBrand;
            this.cardIssuer = cardIssuer;
            this.__typename = str3;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardBrand getBrand() {
            return this.brand;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer getCardIssuer() {
            return this.cardIssuer;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand = this.brand;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer cardIssuer = this.cardIssuer;
            java.lang.String str3 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCard(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", brand=");
            sb.append(cardBrand);
            sb.append(", cardIssuer=");
            sb.append(cardIssuer);
            sb.append(", __typename=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.lastNChars.hashCode();
            int hashCode3 = this.brand.hashCode();
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer cardIssuer = this.cardIssuer;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (cardIssuer == null ? 0 : cardIssuer.hashCode())) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard onCard = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onCard.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, onCard.lastNChars) && this.brand == onCard.brand && kotlin.jvm.internal.Intrinsics.areEqual(this.cardIssuer, onCard.cardIssuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onCard.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard copy(java.lang.String id, java.lang.String lastNChars, com.paypal.oslo.api.graphql.schema.type.CardBrand brand, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer cardIssuer, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brand, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard(id, lastNChars, brand, cardIssuer, __typename);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer getCardIssuer() {
            return this.cardIssuer;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardBrand getBrand() {
            return this.brand;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard onCard, java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer cardIssuer, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCard.id;
            }
            if ((i & 2) != 0) {
                str2 = onCard.lastNChars;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                cardBrand = onCard.brand;
            }
            com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand2 = cardBrand;
            if ((i & 8) != 0) {
                cardIssuer = onCard.cardIssuer;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer cardIssuer2 = cardIssuer;
            if ((i & 16) != 0) {
                str3 = onCard.__typename;
            }
            return onCard.copy(str, str4, cardBrand2, cardIssuer2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CardIssuer;", "", "", "name", "__typename", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CardIssuer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class CardIssuer {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final java.lang.String name;

        public CardIssuer(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.name = str;
            this.__typename = str2;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.String str2 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardIssuer(name=");
            sb.append(str);
            sb.append(", __typename=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.name;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer cardIssuer = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, cardIssuer.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, cardIssuer.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer copy(java.lang.String name2, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer(name2, __typename);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer cardIssuer, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cardIssuer.name;
            }
            if ((i & 2) != 0) {
                str2 = cardIssuer.__typename;
            }
            return cardIssuer.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$BackupFundingSource;", "", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Instrument1;", "instrument", "", "__typename", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Instrument1;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Instrument1;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Instrument1;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$BackupFundingSource;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Instrument1;", "getInstrument", "Ljava/lang/String;", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class BackupFundingSource {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument1 instrument;

        public BackupFundingSource(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument1 instrument1, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrument1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.instrument = instrument1;
            this.__typename = str;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument1 getInstrument() {
            return this.instrument;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument1 instrument1 = this.instrument;
            java.lang.String str = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BackupFundingSource(instrument=");
            sb.append(instrument1);
            sb.append(", __typename=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.instrument.hashCode() * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BackupFundingSource)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BackupFundingSource backupFundingSource = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BackupFundingSource) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.instrument, backupFundingSource.instrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, backupFundingSource.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BackupFundingSource copy(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument1 instrument, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrument, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BackupFundingSource(instrument, __typename);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument1 getInstrument() {
            return this.instrument;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BackupFundingSource copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BackupFundingSource backupFundingSource, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument1 instrument1, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                instrument1 = backupFundingSource.instrument;
            }
            if ((i & 2) != 0) {
                str = backupFundingSource.__typename;
            }
            return backupFundingSource.copy(instrument1, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Instrument1;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBankAccount1;", "onBankAccount", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBalance1;", "onBalance", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnCard1;", "onCard", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBankAccount1;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBalance1;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnCard1;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBankAccount1;", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBalance1;", "component4", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnCard1;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBankAccount1;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBalance1;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnCard1;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Instrument1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBankAccount1;", "getOnBankAccount", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBalance1;", "getOnBalance", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnCard1;", "getOnCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Instrument1 {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance1 onBalance;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount1 onBankAccount;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard1 onCard;

        public Instrument1(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount1 onBankAccount1, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance1 onBalance1, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard1 onCard1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onBankAccount = onBankAccount1;
            this.onBalance = onBalance1;
            this.onCard = onCard1;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount1 getOnBankAccount() {
            return this.onBankAccount;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance1 getOnBalance() {
            return this.onBalance;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard1 getOnCard() {
            return this.onCard;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount1 onBankAccount1 = this.onBankAccount;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance1 onBalance1 = this.onBalance;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard1 onCard1 = this.onCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Instrument1(__typename=");
            sb.append(str);
            sb.append(", onBankAccount=");
            sb.append(onBankAccount1);
            sb.append(", onBalance=");
            sb.append(onBalance1);
            sb.append(", onCard=");
            sb.append(onCard1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount1 onBankAccount1 = this.onBankAccount;
            int hashCode2 = onBankAccount1 == null ? 0 : onBankAccount1.hashCode();
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance1 onBalance1 = this.onBalance;
            int hashCode3 = onBalance1 == null ? 0 : onBalance1.hashCode();
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard1 onCard1 = this.onCard;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (onCard1 != null ? onCard1.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument1)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument1 instrument1 = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, instrument1.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBankAccount, instrument1.onBankAccount) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBalance, instrument1.onBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCard, instrument1.onCard);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument1 copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount1 onBankAccount, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance1 onBalance, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard1 onCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument1(__typename, onBankAccount, onBalance, onCard);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard1 getOnCard() {
            return this.onCard;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance1 getOnBalance() {
            return this.onBalance;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount1 getOnBankAccount() {
            return this.onBankAccount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument1 copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Instrument1 instrument1, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount1 onBankAccount1, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance1 onBalance1, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard1 onCard1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = instrument1.__typename;
            }
            if ((i & 2) != 0) {
                onBankAccount1 = instrument1.onBankAccount;
            }
            if ((i & 4) != 0) {
                onBalance1 = instrument1.onBalance;
            }
            if ((i & 8) != 0) {
                onCard1 = instrument1.onCard;
            }
            return instrument1.copy(str, onBankAccount1, onBalance1, onCard1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJD\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBankAccount1;", "", "", "id", "lastNChars", "nickname", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$BankIssuer1;", "bankIssuer", "__typename", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$BankIssuer1;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$BankIssuer1;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$BankIssuer1;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBankAccount1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "getNickname", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$BankIssuer1;", "getBankIssuer", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class OnBankAccount1 {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer1 bankIssuer;
        private final java.lang.String id;
        private final java.lang.String lastNChars;
        private final java.lang.String nickname;

        public OnBankAccount1(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer1 bankIssuer1, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankIssuer1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.id = str;
            this.lastNChars = str2;
            this.nickname = str3;
            this.bankIssuer = bankIssuer1;
            this.__typename = str4;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final java.lang.String getNickname() {
            return this.nickname;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer1 getBankIssuer() {
            return this.bankIssuer;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            java.lang.String str3 = this.nickname;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer1 bankIssuer1 = this.bankIssuer;
            java.lang.String str4 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBankAccount1(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", nickname=");
            sb.append(str3);
            sb.append(", bankIssuer=");
            sb.append(bankIssuer1);
            sb.append(", __typename=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.lastNChars.hashCode();
            java.lang.String str = this.nickname;
            return (((((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.bankIssuer.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount1)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount1 onBankAccount1 = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onBankAccount1.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, onBankAccount1.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.nickname, onBankAccount1.nickname) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankIssuer, onBankAccount1.bankIssuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBankAccount1.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount1 copy(java.lang.String id, java.lang.String lastNChars, java.lang.String nickname, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer1 bankIssuer, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankIssuer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount1(id, lastNChars, nickname, bankIssuer, __typename);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer1 getBankIssuer() {
            return this.bankIssuer;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getNickname() {
            return this.nickname;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount1 copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBankAccount1 onBankAccount1, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer1 bankIssuer1, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBankAccount1.id;
            }
            if ((i & 2) != 0) {
                str2 = onBankAccount1.lastNChars;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = onBankAccount1.nickname;
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                bankIssuer1 = onBankAccount1.bankIssuer;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer1 bankIssuer12 = bankIssuer1;
            if ((i & 16) != 0) {
                str4 = onBankAccount1.__typename;
            }
            return onBankAccount1.copy(str, str5, str6, bankIssuer12, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$BankIssuer1;", "", "", "name", "__typename", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$BankIssuer1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class BankIssuer1 {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final java.lang.String name;

        public BankIssuer1(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.name = str;
            this.__typename = str2;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.String str2 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BankIssuer1(name=");
            sb.append(str);
            sb.append(", __typename=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.name.hashCode() * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer1)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer1 bankIssuer1 = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, bankIssuer1.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, bankIssuer1.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer1 copy(java.lang.String name2, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer1(name2, __typename);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer1 copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.BankIssuer1 bankIssuer1, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = bankIssuer1.name;
            }
            if ((i & 2) != 0) {
                str2 = bankIssuer1.__typename;
            }
            return bankIssuer1.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBalance1;", "", "", "id", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AvailableAmount1;", "availableAmount", "__typename", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AvailableAmount1;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AvailableAmount1;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AvailableAmount1;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnBalance1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AvailableAmount1;", "getAvailableAmount", "getAvailableAmount$annotations", "()V", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBalance1 {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount1 availableAmount;
        private final java.lang.String id;

        @kotlin.Deprecated(message = "Use 'available' field instead for available balance")
        public static /* synthetic */ void getAvailableAmount$annotations() {
        }

        public OnBalance1(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount1 availableAmount1, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableAmount1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.availableAmount = availableAmount1;
            this.__typename = str2;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount1 getAvailableAmount() {
            return this.availableAmount;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount1 availableAmount1 = this.availableAmount;
            java.lang.String str2 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBalance1(id=");
            sb.append(str);
            sb.append(", availableAmount=");
            sb.append(availableAmount1);
            sb.append(", __typename=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.id.hashCode() * 31) + this.availableAmount.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance1)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance1 onBalance1 = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onBalance1.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableAmount, onBalance1.availableAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBalance1.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance1 copy(java.lang.String id, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount1 availableAmount, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance1(id, availableAmount, __typename);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount1 getAvailableAmount() {
            return this.availableAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance1 copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnBalance1 onBalance1, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount1 availableAmount1, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBalance1.id;
            }
            if ((i & 2) != 0) {
                availableAmount1 = onBalance1.availableAmount;
            }
            if ((i & 4) != 0) {
                str2 = onBalance1.__typename;
            }
            return onBalance1.copy(str, availableAmount1, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AvailableAmount1;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AvailableAmount1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AvailableAmount1 {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public AvailableAmount1(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AvailableAmount1(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount1)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount1 availableAmount1 = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, availableAmount1.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, availableAmount1.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, availableAmount1.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount1 copy(java.lang.Object currencyCode, java.lang.String value, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount1(currencyCode, value, __typename);
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

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount1 copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AvailableAmount1 availableAmount1, java.lang.Object obj, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = availableAmount1.currencyCode;
            }
            if ((i & 2) != 0) {
                str = availableAmount1.value;
            }
            if ((i & 4) != 0) {
                str2 = availableAmount1.__typename;
            }
            return availableAmount1.copy(obj, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnCard1;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "brand", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CardIssuer1;", "cardIssuer", "__typename", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CardIssuer1;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "component4", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CardIssuer1;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CardIssuer1;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$OnCard1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "getBrand", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CardIssuer1;", "getCardIssuer", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class OnCard1 {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.api.graphql.schema.type.CardBrand brand;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer1 cardIssuer;
        private final java.lang.String id;
        private final java.lang.String lastNChars;

        public OnCard1(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer1 cardIssuer1, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardBrand, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.id = str;
            this.lastNChars = str2;
            this.brand = cardBrand;
            this.cardIssuer = cardIssuer1;
            this.__typename = str3;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardBrand getBrand() {
            return this.brand;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer1 getCardIssuer() {
            return this.cardIssuer;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand = this.brand;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer1 cardIssuer1 = this.cardIssuer;
            java.lang.String str3 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCard1(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", brand=");
            sb.append(cardBrand);
            sb.append(", cardIssuer=");
            sb.append(cardIssuer1);
            sb.append(", __typename=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.lastNChars.hashCode();
            int hashCode3 = this.brand.hashCode();
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer1 cardIssuer1 = this.cardIssuer;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (cardIssuer1 == null ? 0 : cardIssuer1.hashCode())) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard1)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard1 onCard1 = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onCard1.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, onCard1.lastNChars) && this.brand == onCard1.brand && kotlin.jvm.internal.Intrinsics.areEqual(this.cardIssuer, onCard1.cardIssuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onCard1.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard1 copy(java.lang.String id, java.lang.String lastNChars, com.paypal.oslo.api.graphql.schema.type.CardBrand brand, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer1 cardIssuer, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brand, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard1(id, lastNChars, brand, cardIssuer, __typename);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer1 getCardIssuer() {
            return this.cardIssuer;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardBrand getBrand() {
            return this.brand;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard1 copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.OnCard1 onCard1, java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer1 cardIssuer1, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCard1.id;
            }
            if ((i & 2) != 0) {
                str2 = onCard1.lastNChars;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                cardBrand = onCard1.brand;
            }
            com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand2 = cardBrand;
            if ((i & 8) != 0) {
                cardIssuer1 = onCard1.cardIssuer;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer1 cardIssuer12 = cardIssuer1;
            if ((i & 16) != 0) {
                str3 = onCard1.__typename;
            }
            return onCard1.copy(str, str4, cardBrand2, cardIssuer12, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CardIssuer1;", "", "", "name", "__typename", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CardIssuer1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class CardIssuer1 {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final java.lang.String name;

        public CardIssuer1(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.name = str;
            this.__typename = str2;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.String str2 = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardIssuer1(name=");
            sb.append(str);
            sb.append(", __typename=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.name;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer1)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer1 cardIssuer1 = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, cardIssuer1.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, cardIssuer1.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer1 copy(java.lang.String name2, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer1(name2, __typename);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer1 copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CardIssuer1 cardIssuer1, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cardIssuer1.name;
            }
            if ((i & 2) != 0) {
                str2 = cardIssuer1.__typename;
            }
            return cardIssuer1.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountsBreakdown;", "", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Sender;", "sender", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Receiver1;", "receiver", "", "__typename", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Sender;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Receiver1;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Sender;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Receiver1;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Sender;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Receiver1;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountsBreakdown;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Sender;", "getSender", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Receiver1;", "getReceiver", "Ljava/lang/String;", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class AmountsBreakdown {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver1 receiver;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Sender sender;

        public AmountsBreakdown(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Sender sender, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver1 receiver1, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sender, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiver1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.sender = sender;
            this.receiver = receiver1;
            this.__typename = str;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Sender getSender() {
            return this.sender;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver1 getReceiver() {
            return this.receiver;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Sender sender = this.sender;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver1 receiver1 = this.receiver;
            java.lang.String str = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountsBreakdown(sender=");
            sb.append(sender);
            sb.append(", receiver=");
            sb.append(receiver1);
            sb.append(", __typename=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.sender.hashCode() * 31) + this.receiver.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountsBreakdown)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountsBreakdown amountsBreakdown = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountsBreakdown) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.sender, amountsBreakdown.sender) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiver, amountsBreakdown.receiver) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amountsBreakdown.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountsBreakdown copy(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Sender sender, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver1 receiver, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sender, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiver, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountsBreakdown(sender, receiver, __typename);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver1 getReceiver() {
            return this.receiver;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Sender getSender() {
            return this.sender;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountsBreakdown copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountsBreakdown amountsBreakdown, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Sender sender, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver1 receiver1, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                sender = amountsBreakdown.sender;
            }
            if ((i & 2) != 0) {
                receiver1 = amountsBreakdown.receiver;
            }
            if ((i & 4) != 0) {
                str = amountsBreakdown.__typename;
            }
            return amountsBreakdown.copy(sender, receiver1, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Sender;", "", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountSent;", "amountSent", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TotalFee;", "totalFee", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$FeeBreakdown;", "feeBreakdown", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TotalAmountSent;", "totalAmountSent", "", "__typename", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountSent;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TotalFee;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$FeeBreakdown;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TotalAmountSent;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountSent;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TotalFee;", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$FeeBreakdown;", "component4", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TotalAmountSent;", "component5", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountSent;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TotalFee;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$FeeBreakdown;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TotalAmountSent;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Sender;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountSent;", "getAmountSent", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TotalFee;", "getTotalFee", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$FeeBreakdown;", "getFeeBreakdown", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TotalAmountSent;", "getTotalAmountSent", "Ljava/lang/String;", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Sender {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountSent amountSent;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FeeBreakdown feeBreakdown;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalAmountSent totalAmountSent;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalFee totalFee;

        public Sender(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountSent amountSent, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalFee totalFee, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FeeBreakdown feeBreakdown, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalAmountSent totalAmountSent, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountSent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalFee, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmountSent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amountSent = amountSent;
            this.totalFee = totalFee;
            this.feeBreakdown = feeBreakdown;
            this.totalAmountSent = totalAmountSent;
            this.__typename = str;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountSent getAmountSent() {
            return this.amountSent;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalFee getTotalFee() {
            return this.totalFee;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FeeBreakdown getFeeBreakdown() {
            return this.feeBreakdown;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalAmountSent getTotalAmountSent() {
            return this.totalAmountSent;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountSent amountSent = this.amountSent;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalFee totalFee = this.totalFee;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FeeBreakdown feeBreakdown = this.feeBreakdown;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalAmountSent totalAmountSent = this.totalAmountSent;
            java.lang.String str = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Sender(amountSent=");
            sb.append(amountSent);
            sb.append(", totalFee=");
            sb.append(totalFee);
            sb.append(", feeBreakdown=");
            sb.append(feeBreakdown);
            sb.append(", totalAmountSent=");
            sb.append(totalAmountSent);
            sb.append(", __typename=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.amountSent.hashCode();
            int hashCode2 = this.totalFee.hashCode();
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FeeBreakdown feeBreakdown = this.feeBreakdown;
            return (((((((hashCode * 31) + hashCode2) * 31) + (feeBreakdown == null ? 0 : feeBreakdown.hashCode())) * 31) + this.totalAmountSent.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Sender)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Sender sender = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Sender) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amountSent, sender.amountSent) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalFee, sender.totalFee) && kotlin.jvm.internal.Intrinsics.areEqual(this.feeBreakdown, sender.feeBreakdown) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmountSent, sender.totalAmountSent) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, sender.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Sender copy(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountSent amountSent, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalFee totalFee, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FeeBreakdown feeBreakdown, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalAmountSent totalAmountSent, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountSent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalFee, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmountSent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Sender(amountSent, totalFee, feeBreakdown, totalAmountSent, __typename);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalAmountSent getTotalAmountSent() {
            return this.totalAmountSent;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FeeBreakdown getFeeBreakdown() {
            return this.feeBreakdown;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalFee getTotalFee() {
            return this.totalFee;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountSent getAmountSent() {
            return this.amountSent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Sender copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Sender sender, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountSent amountSent, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalFee totalFee, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FeeBreakdown feeBreakdown, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalAmountSent totalAmountSent, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amountSent = sender.amountSent;
            }
            if ((i & 2) != 0) {
                totalFee = sender.totalFee;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalFee totalFee2 = totalFee;
            if ((i & 4) != 0) {
                feeBreakdown = sender.feeBreakdown;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FeeBreakdown feeBreakdown2 = feeBreakdown;
            if ((i & 8) != 0) {
                totalAmountSent = sender.totalAmountSent;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalAmountSent totalAmountSent2 = totalAmountSent;
            if ((i & 16) != 0) {
                str = sender.__typename;
            }
            return sender.copy(amountSent, totalFee2, feeBreakdown2, totalAmountSent2, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountSent;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountSent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class AmountSent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public AmountSent(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountSent(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountSent)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountSent amountSent = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountSent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amountSent.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, amountSent.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amountSent.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountSent copy(java.lang.Object currencyCode, java.lang.String value, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountSent(currencyCode, value, __typename);
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

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountSent copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountSent amountSent, java.lang.Object obj, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = amountSent.currencyCode;
            }
            if ((i & 2) != 0) {
                str = amountSent.value;
            }
            if ((i & 4) != 0) {
                str2 = amountSent.__typename;
            }
            return amountSent.copy(obj, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TotalFee;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TotalFee;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class TotalFee {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TotalFee(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalFee(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalFee)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalFee totalFee = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalFee) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalFee.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalFee.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalFee.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalFee copy(java.lang.Object currencyCode, java.lang.String value, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalFee(currencyCode, value, __typename);
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

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalFee copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalFee totalFee, java.lang.Object obj, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalFee.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalFee.value;
            }
            if ((i & 4) != 0) {
                str2 = totalFee.__typename;
            }
            return totalFee.copy(obj, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$FeeBreakdown;", "", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$InstrumentFees;", "instrumentFees", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CrossBorderFees;", "crossBorderFees", "", "__typename", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$InstrumentFees;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CrossBorderFees;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$InstrumentFees;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CrossBorderFees;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$InstrumentFees;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CrossBorderFees;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$FeeBreakdown;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$InstrumentFees;", "getInstrumentFees", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CrossBorderFees;", "getCrossBorderFees", "Ljava/lang/String;", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class FeeBreakdown {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CrossBorderFees crossBorderFees;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.InstrumentFees instrumentFees;

        public FeeBreakdown(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.InstrumentFees instrumentFees, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CrossBorderFees crossBorderFees, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.instrumentFees = instrumentFees;
            this.crossBorderFees = crossBorderFees;
            this.__typename = str;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.InstrumentFees getInstrumentFees() {
            return this.instrumentFees;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CrossBorderFees getCrossBorderFees() {
            return this.crossBorderFees;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.InstrumentFees instrumentFees = this.instrumentFees;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CrossBorderFees crossBorderFees = this.crossBorderFees;
            java.lang.String str = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FeeBreakdown(instrumentFees=");
            sb.append(instrumentFees);
            sb.append(", crossBorderFees=");
            sb.append(crossBorderFees);
            sb.append(", __typename=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.InstrumentFees instrumentFees = this.instrumentFees;
            int hashCode = instrumentFees == null ? 0 : instrumentFees.hashCode();
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CrossBorderFees crossBorderFees = this.crossBorderFees;
            return (((hashCode * 31) + (crossBorderFees != null ? crossBorderFees.hashCode() : 0)) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FeeBreakdown)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FeeBreakdown feeBreakdown = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FeeBreakdown) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentFees, feeBreakdown.instrumentFees) && kotlin.jvm.internal.Intrinsics.areEqual(this.crossBorderFees, feeBreakdown.crossBorderFees) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, feeBreakdown.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FeeBreakdown copy(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.InstrumentFees instrumentFees, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CrossBorderFees crossBorderFees, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FeeBreakdown(instrumentFees, crossBorderFees, __typename);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CrossBorderFees getCrossBorderFees() {
            return this.crossBorderFees;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.InstrumentFees getInstrumentFees() {
            return this.instrumentFees;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FeeBreakdown copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.FeeBreakdown feeBreakdown, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.InstrumentFees instrumentFees, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CrossBorderFees crossBorderFees, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                instrumentFees = feeBreakdown.instrumentFees;
            }
            if ((i & 2) != 0) {
                crossBorderFees = feeBreakdown.crossBorderFees;
            }
            if ((i & 4) != 0) {
                str = feeBreakdown.__typename;
            }
            return feeBreakdown.copy(instrumentFees, crossBorderFees, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$InstrumentFees;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$InstrumentFees;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class InstrumentFees {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public InstrumentFees(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InstrumentFees(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.InstrumentFees)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.InstrumentFees instrumentFees = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.InstrumentFees) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, instrumentFees.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, instrumentFees.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, instrumentFees.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.InstrumentFees copy(java.lang.Object currencyCode, java.lang.String value, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.InstrumentFees(currencyCode, value, __typename);
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

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.InstrumentFees copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.InstrumentFees instrumentFees, java.lang.Object obj, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = instrumentFees.currencyCode;
            }
            if ((i & 2) != 0) {
                str = instrumentFees.value;
            }
            if ((i & 4) != 0) {
                str2 = instrumentFees.__typename;
            }
            return instrumentFees.copy(obj, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CrossBorderFees;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$CrossBorderFees;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class CrossBorderFees {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public CrossBorderFees(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CrossBorderFees(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CrossBorderFees)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CrossBorderFees crossBorderFees = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CrossBorderFees) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, crossBorderFees.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, crossBorderFees.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, crossBorderFees.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CrossBorderFees copy(java.lang.Object currencyCode, java.lang.String value, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CrossBorderFees(currencyCode, value, __typename);
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

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CrossBorderFees copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.CrossBorderFees crossBorderFees, java.lang.Object obj, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = crossBorderFees.currencyCode;
            }
            if ((i & 2) != 0) {
                str = crossBorderFees.value;
            }
            if ((i & 4) != 0) {
                str2 = crossBorderFees.__typename;
            }
            return crossBorderFees.copy(obj, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TotalAmountSent;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$TotalAmountSent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class TotalAmountSent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TotalAmountSent(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalAmountSent(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalAmountSent)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalAmountSent totalAmountSent = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalAmountSent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalAmountSent.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalAmountSent.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalAmountSent.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalAmountSent copy(java.lang.Object currencyCode, java.lang.String value, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalAmountSent(currencyCode, value, __typename);
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

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalAmountSent copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.TotalAmountSent totalAmountSent, java.lang.Object obj, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalAmountSent.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalAmountSent.value;
            }
            if ((i & 4) != 0) {
                str2 = totalAmountSent.__typename;
            }
            return totalAmountSent.copy(obj, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Receiver1;", "", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountReceived;", "amountReceived", "", "__typename", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountReceived;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountReceived;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountReceived;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Receiver1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountReceived;", "getAmountReceived", "Ljava/lang/String;", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class Receiver1 {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountReceived amountReceived;

        public Receiver1(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountReceived amountReceived, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountReceived, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amountReceived = amountReceived;
            this.__typename = str;
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountReceived getAmountReceived() {
            return this.amountReceived;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountReceived amountReceived = this.amountReceived;
            java.lang.String str = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Receiver1(amountReceived=");
            sb.append(amountReceived);
            sb.append(", __typename=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.amountReceived.hashCode() * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver1)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver1 receiver1 = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amountReceived, receiver1.amountReceived) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, receiver1.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver1 copy(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountReceived amountReceived, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountReceived, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver1(amountReceived, __typename);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountReceived getAmountReceived() {
            return this.amountReceived;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver1 copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.Receiver1 receiver1, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountReceived amountReceived, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amountReceived = receiver1.amountReceived;
            }
            if ((i & 2) != 0) {
                str = receiver1.__typename;
            }
            return receiver1.copy(amountReceived, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountReceived;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$AmountReceived;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class AmountReceived {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public AmountReceived(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountReceived(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountReceived)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountReceived amountReceived = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountReceived) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amountReceived.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, amountReceived.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amountReceived.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountReceived copy(java.lang.Object currencyCode, java.lang.String value, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountReceived(currencyCode, value, __typename);
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

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountReceived copy$default(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptMutation.AmountReceived amountReceived, java.lang.Object obj, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = amountReceived.currencyCode;
            }
            if ((i & 2) != 0) {
                str = amountReceived.value;
            }
            if ((i & 4) != 0) {
                str2 = amountReceived.__typename;
            }
            return amountReceived.copy(obj, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation StartPaymentTransferAttempt { startPaymentTransferAttempt: startPaymentTransferAttempt { paymentTransferAttempt { id transferAmount { currencyCode value __typename } supportedIntents selectedIntent note { memo media { id provider contentType referenceUrl __typename } __typename } recommendedContacts { id accountId name { __typename ... on PersonName { prefix givenName surname secondSurname middleName suffix fullName __typename } ... on BusinessName { businessName orthography __typename } } type profilePhotoUrl status favorite blocked __typename } receiver { accountId id type name { __typename ... on PersonName { prefix givenName surname secondSurname middleName suffix fullName __typename } ... on BusinessName { businessName orthography __typename } } profilePhotoUrl __typename } supportedTransferTypes { type default __typename } selectedTransferType fundingOptions { allowedOptions { id fundingSources { amount { currencyCode value __typename } instrument { __typename ... on BankAccount { id lastNChars nickname bankIssuer: issuer { name __typename } __typename } ... on Balance { id availableAmount { currencyCode value __typename } __typename } ... on Card { id lastNChars brand cardIssuer: issuer { name __typename } __typename } } __typename } backupFundingSources { instrument { __typename ... on BankAccount { id lastNChars nickname bankIssuer: issuer { name __typename } __typename } ... on Balance { id availableAmount { currencyCode value __typename } __typename } ... on Card { id lastNChars brand cardIssuer: issuer { name __typename } __typename } } __typename } amountsBreakdown { sender { amountSent { currencyCode value __typename } totalFee { currencyCode value __typename } feeBreakdown { instrumentFees { currencyCode value __typename } crossBorderFees { currencyCode value __typename } __typename } totalAmountSent { currencyCode value __typename } __typename } receiver { amountReceived { currencyCode value __typename } __typename } __typename } default __typename } __typename } __typename } __typename } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
    }
}
