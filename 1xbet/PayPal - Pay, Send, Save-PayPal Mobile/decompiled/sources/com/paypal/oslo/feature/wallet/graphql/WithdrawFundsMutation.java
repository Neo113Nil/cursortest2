package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\t*+,-./01)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/WithdrawFundsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/WithdrawFundsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/WithdrawFundsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/WithdrawFundsInput;)Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/WithdrawFundsInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OPERATION_NAME, "Amount", "OnMoney", "Fees", "OnMoney1", "NetAmount", "OnMoney2"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class WithdrawFundsMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Data> {
    public static final java.lang.String OPERATION_ID = "7922c5678c47b5959acf5515bc388c4c80b713782d2b94dab80ef65d91003080";
    public static final java.lang.String OPERATION_NAME = "WithdrawFunds";
    private final com.paypal.oslo.api.graphql.schema.type.WithdrawFundsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Companion(null);
    public static final int $stable = 8;

    public WithdrawFundsMutation(com.paypal.oslo.api.graphql.schema.type.WithdrawFundsInput withdrawFundsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawFundsInput, "");
        this.input = withdrawFundsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.WithdrawFundsInput getInput() {
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
        com.paypal.oslo.feature.wallet.graphql.adapter.WithdrawFundsMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.WithdrawFundsMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.WithdrawFundsMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$WithdrawFunds;", "withdrawFunds", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$WithdrawFunds;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$WithdrawFunds;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$WithdrawFunds;)Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$WithdrawFunds;", "getWithdrawFunds"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.WithdrawFunds withdrawFunds;

        public Data(com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.WithdrawFunds withdrawFunds) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawFunds, "");
            this.withdrawFunds = withdrawFunds;
        }

        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.WithdrawFunds getWithdrawFunds() {
            return this.withdrawFunds;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.WithdrawFunds withdrawFunds = this.withdrawFunds;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(withdrawFunds=");
            sb.append(withdrawFunds);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.withdrawFunds.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.withdrawFunds, ((com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Data) other).withdrawFunds);
        }

        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Data copy(com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.WithdrawFunds withdrawFunds) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawFunds, "");
            return new com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Data(withdrawFunds);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.WithdrawFunds getWithdrawFunds() {
            return this.withdrawFunds;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Data copy$default(com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Data data, com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.WithdrawFunds withdrawFunds, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                withdrawFunds = data.withdrawFunds;
            }
            return data.copy(withdrawFunds);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJV\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u001bR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$WithdrawFunds;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/WithdrawStatus;", "status", "Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalTransferMethod;", "transferMethod", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanTransferSpeed;", "transferMode", "Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$Amount;", "amount", "Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$Fees;", "fees", "Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$NetAmount;", "netAmount", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/WithdrawStatus;Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalTransferMethod;Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanTransferSpeed;Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$Amount;Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$Fees;Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$NetAmount;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/WithdrawStatus;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalTransferMethod;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanTransferSpeed;", "component5", "()Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$Amount;", "component6", "()Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$Fees;", "component7", "()Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$NetAmount;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/WithdrawStatus;Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalTransferMethod;Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanTransferSpeed;Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$Amount;Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$Fees;Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$NetAmount;)Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$WithdrawFunds;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/WithdrawStatus;", "getStatus", "Lcom/paypal/oslo/api/graphql/schema/type/WithdrawalTransferMethod;", "getTransferMethod", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanTransferSpeed;", "getTransferMode", "Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$Amount;", "getAmount", "Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$Fees;", "getFees", "Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$NetAmount;", "getNetAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WithdrawFunds {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Amount amount;
        private final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Fees fees;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.NetAmount netAmount;
        private final com.paypal.oslo.api.graphql.schema.type.WithdrawStatus status;
        private final com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod transferMethod;
        private final com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed transferMode;

        public WithdrawFunds(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.WithdrawStatus withdrawStatus, com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod withdrawalTransferMethod, com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed paymentPlanTransferSpeed, com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Amount amount, com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Fees fees, com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.NetAmount netAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawalTransferMethod, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentPlanTransferSpeed, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fees, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(netAmount, "");
            this.id = str;
            this.status = withdrawStatus;
            this.transferMethod = withdrawalTransferMethod;
            this.transferMode = paymentPlanTransferSpeed;
            this.amount = amount;
            this.fees = fees;
            this.netAmount = netAmount;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.WithdrawStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod getTransferMethod() {
            return this.transferMethod;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed getTransferMode() {
            return this.transferMode;
        }

        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Amount getAmount() {
            return this.amount;
        }

        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Fees getFees() {
            return this.fees;
        }

        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.NetAmount getNetAmount() {
            return this.netAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.WithdrawStatus withdrawStatus = this.status;
            com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod withdrawalTransferMethod = this.transferMethod;
            com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed paymentPlanTransferSpeed = this.transferMode;
            com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Amount amount = this.amount;
            com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Fees fees = this.fees;
            com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.NetAmount netAmount = this.netAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WithdrawFunds(id=");
            sb.append(str);
            sb.append(", status=");
            sb.append(withdrawStatus);
            sb.append(", transferMethod=");
            sb.append(withdrawalTransferMethod);
            sb.append(", transferMode=");
            sb.append(paymentPlanTransferSpeed);
            sb.append(", amount=");
            sb.append(amount);
            sb.append(", fees=");
            sb.append(fees);
            sb.append(", netAmount=");
            sb.append(netAmount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((this.id.hashCode() * 31) + this.status.hashCode()) * 31) + this.transferMethod.hashCode()) * 31) + this.transferMode.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.fees.hashCode()) * 31) + this.netAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.WithdrawFunds)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.WithdrawFunds withdrawFunds = (com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.WithdrawFunds) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, withdrawFunds.id) && this.status == withdrawFunds.status && this.transferMethod == withdrawFunds.transferMethod && this.transferMode == withdrawFunds.transferMode && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, withdrawFunds.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.fees, withdrawFunds.fees) && kotlin.jvm.internal.Intrinsics.areEqual(this.netAmount, withdrawFunds.netAmount);
        }

        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.WithdrawFunds copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.WithdrawStatus status, com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod transferMethod, com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed transferMode, com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Amount amount, com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Fees fees, com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.NetAmount netAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferMethod, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferMode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fees, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(netAmount, "");
            return new com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.WithdrawFunds(id, status, transferMethod, transferMode, amount, fees, netAmount);
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.NetAmount getNetAmount() {
            return this.netAmount;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Fees getFees() {
            return this.fees;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Amount getAmount() {
            return this.amount;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed getTransferMode() {
            return this.transferMode;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod getTransferMethod() {
            return this.transferMethod;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.WithdrawStatus getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.WithdrawFunds copy$default(com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.WithdrawFunds withdrawFunds, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.WithdrawStatus withdrawStatus, com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod withdrawalTransferMethod, com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed paymentPlanTransferSpeed, com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Amount amount, com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Fees fees, com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.NetAmount netAmount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = withdrawFunds.id;
            }
            if ((i & 2) != 0) {
                withdrawStatus = withdrawFunds.status;
            }
            com.paypal.oslo.api.graphql.schema.type.WithdrawStatus withdrawStatus2 = withdrawStatus;
            if ((i & 4) != 0) {
                withdrawalTransferMethod = withdrawFunds.transferMethod;
            }
            com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod withdrawalTransferMethod2 = withdrawalTransferMethod;
            if ((i & 8) != 0) {
                paymentPlanTransferSpeed = withdrawFunds.transferMode;
            }
            com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed paymentPlanTransferSpeed2 = paymentPlanTransferSpeed;
            if ((i & 16) != 0) {
                amount = withdrawFunds.amount;
            }
            com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Amount amount2 = amount;
            if ((i & 32) != 0) {
                fees = withdrawFunds.fees;
            }
            com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Fees fees2 = fees;
            if ((i & 64) != 0) {
                netAmount = withdrawFunds.netAmount;
            }
            return withdrawFunds.copy(str, withdrawStatus2, withdrawalTransferMethod2, paymentPlanTransferSpeed2, amount2, fees2, netAmount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$Amount;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney;", "onMoney", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney;)Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney;", "getOnMoney"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney onMoney;

        public Amount(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney onMoney) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onMoney = onMoney;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney getOnMoney() {
            return this.onMoney;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney onMoney = this.onMoney;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(__typename=");
            sb.append(str);
            sb.append(", onMoney=");
            sb.append(onMoney);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney onMoney = this.onMoney;
            return (hashCode * 31) + (onMoney == null ? 0 : onMoney.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Amount amount = (com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onMoney, amount.onMoney);
        }

        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Amount copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney onMoney) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Amount(__typename, onMoney);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney getOnMoney() {
            return this.onMoney;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Amount copy$default(com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Amount amount, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney onMoney, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amount.__typename;
            }
            if ((i & 2) != 0) {
                onMoney = amount.onMoney;
            }
            return amount.copy(str, onMoney);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney onMoney = (com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, onMoney.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, onMoney.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney copy$default(com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney onMoney, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = onMoney.currencyCode;
            }
            if ((i & 2) != 0) {
                str = onMoney.value;
            }
            return onMoney.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$Fees;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney1;", "onMoney", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney1;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney1;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney1;)Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$Fees;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney1;", "getOnMoney"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Fees {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney1 onMoney;

        public Fees(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney1 onMoney1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onMoney = onMoney1;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney1 getOnMoney() {
            return this.onMoney;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney1 onMoney1 = this.onMoney;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Fees(__typename=");
            sb.append(str);
            sb.append(", onMoney=");
            sb.append(onMoney1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney1 onMoney1 = this.onMoney;
            return (hashCode * 31) + (onMoney1 == null ? 0 : onMoney1.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Fees)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Fees fees = (com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Fees) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, fees.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onMoney, fees.onMoney);
        }

        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Fees copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney1 onMoney) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Fees(__typename, onMoney);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney1 getOnMoney() {
            return this.onMoney;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Fees copy$default(com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Fees fees, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney1 onMoney1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fees.__typename;
            }
            if ((i & 2) != 0) {
                onMoney1 = fees.onMoney;
            }
            return fees.copy(str, onMoney1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney1;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney1)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney1 onMoney1 = (com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, onMoney1.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, onMoney1.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney1 copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney1(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney1 copy$default(com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney1 onMoney1, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = onMoney1.currencyCode;
            }
            if ((i & 2) != 0) {
                str = onMoney1.value;
            }
            return onMoney1.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$NetAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney2;", "onMoney", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney2;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney2;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney2;)Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$NetAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney2;", "getOnMoney"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney2 onMoney;

        public NetAmount(java.lang.String str, com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney2 onMoney2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onMoney = onMoney2;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney2 getOnMoney() {
            return this.onMoney;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney2 onMoney2 = this.onMoney;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetAmount(__typename=");
            sb.append(str);
            sb.append(", onMoney=");
            sb.append(onMoney2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney2 onMoney2 = this.onMoney;
            return (hashCode * 31) + (onMoney2 == null ? 0 : onMoney2.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.NetAmount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.NetAmount netAmount = (com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.NetAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, netAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onMoney, netAmount.onMoney);
        }

        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.NetAmount copy(java.lang.String __typename, com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney2 onMoney) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.NetAmount(__typename, onMoney);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney2 getOnMoney() {
            return this.onMoney;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.NetAmount copy$default(com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.NetAmount netAmount, java.lang.String str, com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney2 onMoney2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = netAmount.__typename;
            }
            if ((i & 2) != 0) {
                onMoney2 = netAmount.onMoney;
            }
            return netAmount.copy(str, onMoney2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney2;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$OnMoney2;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney2)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney2 onMoney2 = (com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney2) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, onMoney2.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, onMoney2.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney2 copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney2(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney2 copy$default(com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney2 onMoney2, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = onMoney2.currencyCode;
            }
            if ((i & 2) != 0) {
                str = onMoney2.value;
            }
            return onMoney2.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation WithdrawFunds($input: WithdrawFundsInput!) { withdrawFunds(input: $input) { id status transferMethod transferMode amount { __typename ... on Money { currencyCode value } } fees { __typename ... on Money { currencyCode value } } netAmount { __typename ... on Money { currencyCode value } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.WithdrawFundsInput withdrawFundsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WithdrawFundsMutation(input=");
        sb.append(withdrawFundsInput);
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
        return (other instanceof com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation) other).input);
    }

    public final com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation copy(com.paypal.oslo.api.graphql.schema.type.WithdrawFundsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.WithdrawFundsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation copy$default(com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation withdrawFundsMutation, com.paypal.oslo.api.graphql.schema.type.WithdrawFundsInput withdrawFundsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            withdrawFundsInput = withdrawFundsMutation.input;
        }
        return withdrawFundsMutation.copy(withdrawFundsInput);
    }
}
