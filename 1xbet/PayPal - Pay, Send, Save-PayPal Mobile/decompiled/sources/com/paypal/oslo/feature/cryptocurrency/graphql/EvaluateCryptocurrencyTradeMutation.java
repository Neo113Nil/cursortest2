package com.paypal.oslo.feature.cryptocurrency.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/EvaluateCryptocurrencyTradeMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/EvaluateCryptocurrencyTradeMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/EvaluateCryptocurrencyTradeInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/EvaluateCryptocurrencyTradeInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/EvaluateCryptocurrencyTradeInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/EvaluateCryptocurrencyTradeInput;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/EvaluateCryptocurrencyTradeMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/EvaluateCryptocurrencyTradeInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EvaluateCryptocurrencyTradeMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.Data> {
    public static final java.lang.String OPERATION_ID = "251f01d4edc7e765d049333959bcf77aafdd663ca707310a0d7c2eff171e18ee";
    public static final java.lang.String OPERATION_NAME = "EvaluateCryptocurrencyTrade";
    private final com.paypal.oslo.api.graphql.schema.type.EvaluateCryptocurrencyTradeInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.Companion INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.Companion(null);
    public static final int $stable = 8;

    public EvaluateCryptocurrencyTradeMutation(com.paypal.oslo.api.graphql.schema.type.EvaluateCryptocurrencyTradeInput evaluateCryptocurrencyTradeInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluateCryptocurrencyTradeInput, "");
        this.input = evaluateCryptocurrencyTradeInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.EvaluateCryptocurrencyTradeInput getInput() {
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
        com.paypal.oslo.feature.cryptocurrency.graphql.adapter.EvaluateCryptocurrencyTradeMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.EvaluateCryptocurrencyTradeMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.cryptocurrency.graphql.selections.EvaluateCryptocurrencyTradeMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/EvaluateCryptocurrencyTradeMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/EvaluateCryptocurrencyTradeMutation$EvaluateCryptocurrencyTrade;", "evaluateCryptocurrencyTrade", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/EvaluateCryptocurrencyTradeMutation$EvaluateCryptocurrencyTrade;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/EvaluateCryptocurrencyTradeMutation$EvaluateCryptocurrencyTrade;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/EvaluateCryptocurrencyTradeMutation$EvaluateCryptocurrencyTrade;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/EvaluateCryptocurrencyTradeMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/EvaluateCryptocurrencyTradeMutation$EvaluateCryptocurrencyTrade;", "getEvaluateCryptocurrencyTrade"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.EvaluateCryptocurrencyTrade evaluateCryptocurrencyTrade;

        public Data(com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.EvaluateCryptocurrencyTrade evaluateCryptocurrencyTrade) {
            this.evaluateCryptocurrencyTrade = evaluateCryptocurrencyTrade;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.EvaluateCryptocurrencyTrade getEvaluateCryptocurrencyTrade() {
            return this.evaluateCryptocurrencyTrade;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.EvaluateCryptocurrencyTrade evaluateCryptocurrencyTrade = this.evaluateCryptocurrencyTrade;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(evaluateCryptocurrencyTrade=");
            sb.append(evaluateCryptocurrencyTrade);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.EvaluateCryptocurrencyTrade evaluateCryptocurrencyTrade = this.evaluateCryptocurrencyTrade;
            if (evaluateCryptocurrencyTrade == null) {
                return 0;
            }
            return evaluateCryptocurrencyTrade.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.evaluateCryptocurrencyTrade, ((com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.Data) other).evaluateCryptocurrencyTrade);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.Data copy(com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.EvaluateCryptocurrencyTrade evaluateCryptocurrencyTrade) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.Data(evaluateCryptocurrencyTrade);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.EvaluateCryptocurrencyTrade getEvaluateCryptocurrencyTrade() {
            return this.evaluateCryptocurrencyTrade;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.Data copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.Data data, com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.EvaluateCryptocurrencyTrade evaluateCryptocurrencyTrade, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                evaluateCryptocurrencyTrade = data.evaluateCryptocurrencyTrade;
            }
            return data.copy(evaluateCryptocurrencyTrade);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/EvaluateCryptocurrencyTradeMutation$EvaluateCryptocurrencyTrade;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyEvaluateAction;", "action", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "", "transactionTrackingId", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyDecisionCode;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_DECISION_CODE, "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyEvaluateAction;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyDecisionCode;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyEvaluateAction;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyDecisionCode;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyEvaluateAction;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyDecisionCode;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/EvaluateCryptocurrencyTradeMutation$EvaluateCryptocurrencyTrade;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyEvaluateAction;", "getAction", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "getAssetSymbol", "Ljava/lang/String;", "getTransactionTrackingId", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyDecisionCode;", "getDecisionCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EvaluateCryptocurrencyTrade {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEvaluateAction action;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode decisionCode;
        private final java.lang.String transactionTrackingId;

        public EvaluateCryptocurrencyTrade(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEvaluateAction cryptocurrencyEvaluateAction, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode cryptocurrencyDecisionCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyEvaluateAction, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyAssetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyDecisionCode, "");
            this.action = cryptocurrencyEvaluateAction;
            this.assetSymbol = cryptocurrencyAssetSymbol;
            this.transactionTrackingId = str;
            this.decisionCode = cryptocurrencyDecisionCode;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEvaluateAction getAction() {
            return this.action;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        public final java.lang.String getTransactionTrackingId() {
            return this.transactionTrackingId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode getDecisionCode() {
            return this.decisionCode;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEvaluateAction cryptocurrencyEvaluateAction = this.action;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = this.assetSymbol;
            java.lang.String str = this.transactionTrackingId;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode cryptocurrencyDecisionCode = this.decisionCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EvaluateCryptocurrencyTrade(action=");
            sb.append(cryptocurrencyEvaluateAction);
            sb.append(", assetSymbol=");
            sb.append(cryptocurrencyAssetSymbol);
            sb.append(", transactionTrackingId=");
            sb.append(str);
            sb.append(", decisionCode=");
            sb.append(cryptocurrencyDecisionCode);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.action.hashCode() * 31) + this.assetSymbol.hashCode()) * 31) + this.transactionTrackingId.hashCode()) * 31) + this.decisionCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.EvaluateCryptocurrencyTrade)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.EvaluateCryptocurrencyTrade evaluateCryptocurrencyTrade = (com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.EvaluateCryptocurrencyTrade) other;
            return this.action == evaluateCryptocurrencyTrade.action && this.assetSymbol == evaluateCryptocurrencyTrade.assetSymbol && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionTrackingId, evaluateCryptocurrencyTrade.transactionTrackingId) && this.decisionCode == evaluateCryptocurrencyTrade.decisionCode;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.EvaluateCryptocurrencyTrade copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEvaluateAction action, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol, java.lang.String transactionTrackingId, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode decisionCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionTrackingId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decisionCode, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.EvaluateCryptocurrencyTrade(action, assetSymbol, transactionTrackingId, decisionCode);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode getDecisionCode() {
            return this.decisionCode;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getTransactionTrackingId() {
            return this.transactionTrackingId;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEvaluateAction getAction() {
            return this.action;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.EvaluateCryptocurrencyTrade copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.EvaluateCryptocurrencyTrade evaluateCryptocurrencyTrade, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyEvaluateAction cryptocurrencyEvaluateAction, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode cryptocurrencyDecisionCode, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cryptocurrencyEvaluateAction = evaluateCryptocurrencyTrade.action;
            }
            if ((i & 2) != 0) {
                cryptocurrencyAssetSymbol = evaluateCryptocurrencyTrade.assetSymbol;
            }
            if ((i & 4) != 0) {
                str = evaluateCryptocurrencyTrade.transactionTrackingId;
            }
            if ((i & 8) != 0) {
                cryptocurrencyDecisionCode = evaluateCryptocurrencyTrade.decisionCode;
            }
            return evaluateCryptocurrencyTrade.copy(cryptocurrencyEvaluateAction, cryptocurrencyAssetSymbol, str, cryptocurrencyDecisionCode);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/EvaluateCryptocurrencyTradeMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation EvaluateCryptocurrencyTrade($input: EvaluateCryptocurrencyTradeInput!) { evaluateCryptocurrencyTrade(input: $input) { action assetSymbol transactionTrackingId decisionCode } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.EvaluateCryptocurrencyTradeInput evaluateCryptocurrencyTradeInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EvaluateCryptocurrencyTradeMutation(input=");
        sb.append(evaluateCryptocurrencyTradeInput);
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
        return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation) other).input);
    }

    public final com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation copy(com.paypal.oslo.api.graphql.schema.type.EvaluateCryptocurrencyTradeInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.EvaluateCryptocurrencyTradeInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation evaluateCryptocurrencyTradeMutation, com.paypal.oslo.api.graphql.schema.type.EvaluateCryptocurrencyTradeInput evaluateCryptocurrencyTradeInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            evaluateCryptocurrencyTradeInput = evaluateCryptocurrencyTradeMutation.input;
        }
        return evaluateCryptocurrencyTradeMutation.copy(evaluateCryptocurrencyTradeInput);
    }
}
