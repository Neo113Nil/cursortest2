package com.paypal.oslo.feature.cryptocurrency.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006*+,-.)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ExecuteCryptocurrencyTradeInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ExecuteCryptocurrencyTradeInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ExecuteCryptocurrencyTradeInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ExecuteCryptocurrencyTradeInput;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ExecuteCryptocurrencyTradeInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.OPERATION_NAME, "AmountFulfilled", "AssetQuantityTruncated", "Payment"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ExecuteCryptocurrencyTradeMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Data> {
    public static final java.lang.String OPERATION_ID = "387c8e713c9f2ca7319b19ae42da25e672e703e8ab2ad7810d2602183d5d5cec";
    public static final java.lang.String OPERATION_NAME = "ExecuteCryptocurrencyTrade";
    private final com.paypal.oslo.api.graphql.schema.type.ExecuteCryptocurrencyTradeInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Companion INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Companion(null);
    public static final int $stable = 8;

    public ExecuteCryptocurrencyTradeMutation(com.paypal.oslo.api.graphql.schema.type.ExecuteCryptocurrencyTradeInput executeCryptocurrencyTradeInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executeCryptocurrencyTradeInput, "");
        this.input = executeCryptocurrencyTradeInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ExecuteCryptocurrencyTradeInput getInput() {
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
        com.paypal.oslo.feature.cryptocurrency.graphql.adapter.ExecuteCryptocurrencyTradeMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.ExecuteCryptocurrencyTradeMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.cryptocurrency.graphql.selections.ExecuteCryptocurrencyTradeMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$ExecuteCryptocurrencyTrade;", "executeCryptocurrencyTrade", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$ExecuteCryptocurrencyTrade;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$ExecuteCryptocurrencyTrade;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$ExecuteCryptocurrencyTrade;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$ExecuteCryptocurrencyTrade;", "getExecuteCryptocurrencyTrade"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.ExecuteCryptocurrencyTrade executeCryptocurrencyTrade;

        public Data(com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.ExecuteCryptocurrencyTrade executeCryptocurrencyTrade) {
            this.executeCryptocurrencyTrade = executeCryptocurrencyTrade;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.ExecuteCryptocurrencyTrade getExecuteCryptocurrencyTrade() {
            return this.executeCryptocurrencyTrade;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.ExecuteCryptocurrencyTrade executeCryptocurrencyTrade = this.executeCryptocurrencyTrade;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(executeCryptocurrencyTrade=");
            sb.append(executeCryptocurrencyTrade);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.ExecuteCryptocurrencyTrade executeCryptocurrencyTrade = this.executeCryptocurrencyTrade;
            if (executeCryptocurrencyTrade == null) {
                return 0;
            }
            return executeCryptocurrencyTrade.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.executeCryptocurrencyTrade, ((com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Data) other).executeCryptocurrencyTrade);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Data copy(com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.ExecuteCryptocurrencyTrade executeCryptocurrencyTrade) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Data(executeCryptocurrencyTrade);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.ExecuteCryptocurrencyTrade getExecuteCryptocurrencyTrade() {
            return this.executeCryptocurrencyTrade;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Data copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Data data, com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.ExecuteCryptocurrencyTrade executeCryptocurrencyTrade, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                executeCryptocurrencyTrade = data.executeCryptocurrencyTrade;
            }
            return data.copy(executeCryptocurrencyTrade);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$Jz\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b<\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b=\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$ExecuteCryptocurrencyTrade;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeStatus;", "status", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeStatusReason;", "statusReason", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$AmountFulfilled;", "amountFulfilled", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$AssetQuantityTruncated;", "assetQuantityTruncated", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$Payment;", "payment", "createTime", "fulfilledTime", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeAction;", "action", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeStatus;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeStatusReason;Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$AmountFulfilled;Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$AssetQuantityTruncated;Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$Payment;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeAction;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeStatus;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeStatusReason;", "component4", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$AmountFulfilled;", "component5", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$AssetQuantityTruncated;", "component6", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$Payment;", "component7", "()Ljava/lang/Object;", "component8", "component9", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeAction;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeStatus;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeStatusReason;Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$AmountFulfilled;Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$AssetQuantityTruncated;Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$Payment;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeAction;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$ExecuteCryptocurrencyTrade;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeStatus;", "getStatus", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeStatusReason;", "getStatusReason", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$AmountFulfilled;", "getAmountFulfilled", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$AssetQuantityTruncated;", "getAssetQuantityTruncated", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$Payment;", "getPayment", "Ljava/lang/Object;", "getCreateTime", "getFulfilledTime", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeAction;", "getAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExecuteCryptocurrencyTrade {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction action;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AmountFulfilled amountFulfilled;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AssetQuantityTruncated assetQuantityTruncated;
        private final java.lang.Object createTime;
        private final java.lang.Object fulfilledTime;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Payment payment;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeStatus status;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeStatusReason statusReason;

        public ExecuteCryptocurrencyTrade(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeStatus cryptocurrencyTradeStatus, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeStatusReason cryptocurrencyTradeStatusReason, com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AmountFulfilled amountFulfilled, com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AssetQuantityTruncated assetQuantityTruncated, com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Payment payment, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction cryptocurrencyTradeAction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.status = cryptocurrencyTradeStatus;
            this.statusReason = cryptocurrencyTradeStatusReason;
            this.amountFulfilled = amountFulfilled;
            this.assetQuantityTruncated = assetQuantityTruncated;
            this.payment = payment;
            this.createTime = obj;
            this.fulfilledTime = obj2;
            this.action = cryptocurrencyTradeAction;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeStatusReason getStatusReason() {
            return this.statusReason;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AmountFulfilled getAmountFulfilled() {
            return this.amountFulfilled;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AssetQuantityTruncated getAssetQuantityTruncated() {
            return this.assetQuantityTruncated;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Payment getPayment() {
            return this.payment;
        }

        public final java.lang.Object getCreateTime() {
            return this.createTime;
        }

        public final java.lang.Object getFulfilledTime() {
            return this.fulfilledTime;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction getAction() {
            return this.action;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeStatus cryptocurrencyTradeStatus = this.status;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeStatusReason cryptocurrencyTradeStatusReason = this.statusReason;
            com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AmountFulfilled amountFulfilled = this.amountFulfilled;
            com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AssetQuantityTruncated assetQuantityTruncated = this.assetQuantityTruncated;
            com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Payment payment = this.payment;
            java.lang.Object obj = this.createTime;
            java.lang.Object obj2 = this.fulfilledTime;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction cryptocurrencyTradeAction = this.action;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ExecuteCryptocurrencyTrade(id=");
            sb.append(str);
            sb.append(", status=");
            sb.append(cryptocurrencyTradeStatus);
            sb.append(", statusReason=");
            sb.append(cryptocurrencyTradeStatusReason);
            sb.append(", amountFulfilled=");
            sb.append(amountFulfilled);
            sb.append(", assetQuantityTruncated=");
            sb.append(assetQuantityTruncated);
            sb.append(", payment=");
            sb.append(payment);
            sb.append(", createTime=");
            sb.append(obj);
            sb.append(", fulfilledTime=");
            sb.append(obj2);
            sb.append(", action=");
            sb.append(cryptocurrencyTradeAction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeStatus cryptocurrencyTradeStatus = this.status;
            int hashCode2 = cryptocurrencyTradeStatus == null ? 0 : cryptocurrencyTradeStatus.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeStatusReason cryptocurrencyTradeStatusReason = this.statusReason;
            int hashCode3 = cryptocurrencyTradeStatusReason == null ? 0 : cryptocurrencyTradeStatusReason.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AmountFulfilled amountFulfilled = this.amountFulfilled;
            int hashCode4 = amountFulfilled == null ? 0 : amountFulfilled.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AssetQuantityTruncated assetQuantityTruncated = this.assetQuantityTruncated;
            int hashCode5 = assetQuantityTruncated == null ? 0 : assetQuantityTruncated.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Payment payment = this.payment;
            int hashCode6 = payment == null ? 0 : payment.hashCode();
            java.lang.Object obj = this.createTime;
            int hashCode7 = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.fulfilledTime;
            int hashCode8 = obj2 == null ? 0 : obj2.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction cryptocurrencyTradeAction = this.action;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (cryptocurrencyTradeAction != null ? cryptocurrencyTradeAction.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.ExecuteCryptocurrencyTrade)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.ExecuteCryptocurrencyTrade executeCryptocurrencyTrade = (com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.ExecuteCryptocurrencyTrade) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, executeCryptocurrencyTrade.id) && this.status == executeCryptocurrencyTrade.status && this.statusReason == executeCryptocurrencyTrade.statusReason && kotlin.jvm.internal.Intrinsics.areEqual(this.amountFulfilled, executeCryptocurrencyTrade.amountFulfilled) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetQuantityTruncated, executeCryptocurrencyTrade.assetQuantityTruncated) && kotlin.jvm.internal.Intrinsics.areEqual(this.payment, executeCryptocurrencyTrade.payment) && kotlin.jvm.internal.Intrinsics.areEqual(this.createTime, executeCryptocurrencyTrade.createTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.fulfilledTime, executeCryptocurrencyTrade.fulfilledTime) && this.action == executeCryptocurrencyTrade.action;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.ExecuteCryptocurrencyTrade copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeStatus status, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeStatusReason statusReason, com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AmountFulfilled amountFulfilled, com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AssetQuantityTruncated assetQuantityTruncated, com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Payment payment, java.lang.Object createTime, java.lang.Object fulfilledTime, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.ExecuteCryptocurrencyTrade(id, status, statusReason, amountFulfilled, assetQuantityTruncated, payment, createTime, fulfilledTime, action);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction getAction() {
            return this.action;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Object getFulfilledTime() {
            return this.fulfilledTime;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Object getCreateTime() {
            return this.createTime;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Payment getPayment() {
            return this.payment;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AssetQuantityTruncated getAssetQuantityTruncated() {
            return this.assetQuantityTruncated;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AmountFulfilled getAmountFulfilled() {
            return this.amountFulfilled;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeStatusReason getStatusReason() {
            return this.statusReason;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeStatus getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$AmountFulfilled;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$AmountFulfilled;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountFulfilled {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public AmountFulfilled(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountFulfilled(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AmountFulfilled)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AmountFulfilled amountFulfilled = (com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AmountFulfilled) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amountFulfilled.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, amountFulfilled.value);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AmountFulfilled copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AmountFulfilled(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AmountFulfilled copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AmountFulfilled amountFulfilled, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = amountFulfilled.currencyCode;
            }
            if ((i & 2) != 0) {
                str = amountFulfilled.value;
            }
            return amountFulfilled.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$AssetQuantityTruncated;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "", "quantity", "quantityInSubunits", "", "decimals", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Integer;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$AssetQuantityTruncated;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "getAssetSymbol", "Ljava/lang/String;", "getQuantity", "getQuantityInSubunits", "Ljava/lang/Integer;", "getDecimals"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AssetQuantityTruncated {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;
        private final java.lang.Integer decimals;
        private final java.lang.String quantity;
        private final java.lang.String quantityInSubunits;

        public AssetQuantityTruncated(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.String str, java.lang.String str2, java.lang.Integer num) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyAssetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.assetSymbol = cryptocurrencyAssetSymbol;
            this.quantity = str;
            this.quantityInSubunits = str2;
            this.decimals = num;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        public final java.lang.String getQuantity() {
            return this.quantity;
        }

        public final java.lang.String getQuantityInSubunits() {
            return this.quantityInSubunits;
        }

        public final java.lang.Integer getDecimals() {
            return this.decimals;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = this.assetSymbol;
            java.lang.String str = this.quantity;
            java.lang.String str2 = this.quantityInSubunits;
            java.lang.Integer num = this.decimals;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AssetQuantityTruncated(assetSymbol=");
            sb.append(cryptocurrencyAssetSymbol);
            sb.append(", quantity=");
            sb.append(str);
            sb.append(", quantityInSubunits=");
            sb.append(str2);
            sb.append(", decimals=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.assetSymbol.hashCode();
            int hashCode2 = this.quantity.hashCode();
            java.lang.String str = this.quantityInSubunits;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.Integer num = this.decimals;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num != null ? num.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AssetQuantityTruncated)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AssetQuantityTruncated assetQuantityTruncated = (com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AssetQuantityTruncated) other;
            return this.assetSymbol == assetQuantityTruncated.assetSymbol && kotlin.jvm.internal.Intrinsics.areEqual(this.quantity, assetQuantityTruncated.quantity) && kotlin.jvm.internal.Intrinsics.areEqual(this.quantityInSubunits, assetQuantityTruncated.quantityInSubunits) && kotlin.jvm.internal.Intrinsics.areEqual(this.decimals, assetQuantityTruncated.decimals);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AssetQuantityTruncated copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol, java.lang.String quantity, java.lang.String quantityInSubunits, java.lang.Integer decimals) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quantity, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AssetQuantityTruncated(assetSymbol, quantity, quantityInSubunits, decimals);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Integer getDecimals() {
            return this.decimals;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getQuantityInSubunits() {
            return this.quantityInSubunits;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getQuantity() {
            return this.quantity;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AssetQuantityTruncated copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.AssetQuantityTruncated assetQuantityTruncated, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cryptocurrencyAssetSymbol = assetQuantityTruncated.assetSymbol;
            }
            if ((i & 2) != 0) {
                str = assetQuantityTruncated.quantity;
            }
            if ((i & 4) != 0) {
                str2 = assetQuantityTruncated.quantityInSubunits;
            }
            if ((i & 8) != 0) {
                num = assetQuantityTruncated.decimals;
            }
            return assetQuantityTruncated.copy(cryptocurrencyAssetSymbol, str, str2, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR$\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$Payment;", "", "", "id", "", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentDecision;", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$Payment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getAttributes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Payment {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentDecision> attributes;
        private final java.lang.String id;

        /* JADX WARN: Multi-variable type inference failed */
        public Payment(java.lang.String str, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PaymentDecision> list) {
            this.id = str;
            this.attributes = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentDecision> getAttributes() {
            return this.attributes;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentDecision> list = this.attributes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Payment(id=");
            sb.append(str);
            sb.append(", attributes=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.id;
            int hashCode = str == null ? 0 : str.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentDecision> list = this.attributes;
            return (hashCode * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Payment)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Payment payment = (com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Payment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, payment.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, payment.attributes);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Payment copy(java.lang.String id, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PaymentDecision> attributes) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Payment(id, attributes);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentDecision> component2() {
            return this.attributes;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Payment copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation.Payment payment, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = payment.id;
            }
            if ((i & 2) != 0) {
                list = payment.attributes;
            }
            return payment.copy(str, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/ExecuteCryptocurrencyTradeMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation ExecuteCryptocurrencyTrade($input: ExecuteCryptocurrencyTradeInput!) { executeCryptocurrencyTrade(input: $input) { id status statusReason amountFulfilled { currencyCode value } assetQuantityTruncated { assetSymbol quantity quantityInSubunits decimals } payment { id attributes } createTime fulfilledTime action } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ExecuteCryptocurrencyTradeInput executeCryptocurrencyTradeInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExecuteCryptocurrencyTradeMutation(input=");
        sb.append(executeCryptocurrencyTradeInput);
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
        return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation) other).input);
    }

    public final com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation copy(com.paypal.oslo.api.graphql.schema.type.ExecuteCryptocurrencyTradeInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ExecuteCryptocurrencyTradeInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.ExecuteCryptocurrencyTradeMutation executeCryptocurrencyTradeMutation, com.paypal.oslo.api.graphql.schema.type.ExecuteCryptocurrencyTradeInput executeCryptocurrencyTradeInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            executeCryptocurrencyTradeInput = executeCryptocurrencyTradeMutation.input;
        }
        return executeCryptocurrencyTradeMutation.copy(executeCryptocurrencyTradeInput);
    }
}
