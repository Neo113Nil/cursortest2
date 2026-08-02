package com.paypal.oslo.feature.cryptocurrency.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\t*+,-./01)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/GenerateCryptocurrencyQuoteInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/GenerateCryptocurrencyQuoteInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/GenerateCryptocurrencyQuoteInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/GenerateCryptocurrencyQuoteInput;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/GenerateCryptocurrencyQuoteInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.OPERATION_NAME, "QuoteQuantity", "AssetPrice", "TradeAmountBreakdown", "BaseAmount", "TotalAmount", "TotalFee"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GenerateCryptocurrencyQuoteMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.Data> {
    public static final java.lang.String OPERATION_ID = "09a2e10fecf573302794d2c5d327e9cb3ad30a1227dfb1f382bb4f98f887df99";
    public static final java.lang.String OPERATION_NAME = "GenerateCryptocurrencyQuote";
    private final com.paypal.oslo.api.graphql.schema.type.GenerateCryptocurrencyQuoteInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.Companion INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.Companion(null);
    public static final int $stable = 8;

    public GenerateCryptocurrencyQuoteMutation(com.paypal.oslo.api.graphql.schema.type.GenerateCryptocurrencyQuoteInput generateCryptocurrencyQuoteInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generateCryptocurrencyQuoteInput, "");
        this.input = generateCryptocurrencyQuoteInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.GenerateCryptocurrencyQuoteInput getInput() {
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
        com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GenerateCryptocurrencyQuoteMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GenerateCryptocurrencyQuoteMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.cryptocurrency.graphql.selections.GenerateCryptocurrencyQuoteMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$GenerateCryptocurrencyQuote;", "generateCryptocurrencyQuote", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$GenerateCryptocurrencyQuote;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$GenerateCryptocurrencyQuote;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$GenerateCryptocurrencyQuote;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$GenerateCryptocurrencyQuote;", "getGenerateCryptocurrencyQuote"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.GenerateCryptocurrencyQuote generateCryptocurrencyQuote;

        public Data(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.GenerateCryptocurrencyQuote generateCryptocurrencyQuote) {
            this.generateCryptocurrencyQuote = generateCryptocurrencyQuote;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.GenerateCryptocurrencyQuote getGenerateCryptocurrencyQuote() {
            return this.generateCryptocurrencyQuote;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.GenerateCryptocurrencyQuote generateCryptocurrencyQuote = this.generateCryptocurrencyQuote;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(generateCryptocurrencyQuote=");
            sb.append(generateCryptocurrencyQuote);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.GenerateCryptocurrencyQuote generateCryptocurrencyQuote = this.generateCryptocurrencyQuote;
            if (generateCryptocurrencyQuote == null) {
                return 0;
            }
            return generateCryptocurrencyQuote.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.generateCryptocurrencyQuote, ((com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.Data) other).generateCryptocurrencyQuote);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.Data copy(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.GenerateCryptocurrencyQuote generateCryptocurrencyQuote) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.Data(generateCryptocurrencyQuote);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.GenerateCryptocurrencyQuote getGenerateCryptocurrencyQuote() {
            return this.generateCryptocurrencyQuote;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.Data copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.Data data, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.GenerateCryptocurrencyQuote generateCryptocurrencyQuote, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                generateCryptocurrencyQuote = data.generateCryptocurrencyQuote;
            }
            return data.copy(generateCryptocurrencyQuote);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJN\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$GenerateCryptocurrencyQuote;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeAction;", "action", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$QuoteQuantity;", "quoteQuantity", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "", "quoteId", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$AssetPrice;", "assetPrice", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TradeAmountBreakdown;", "tradeAmountBreakdown", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeAction;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$QuoteQuantity;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$AssetPrice;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TradeAmountBreakdown;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeAction;", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$QuoteQuantity;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "component4", "()Ljava/lang/String;", "component5", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$AssetPrice;", "component6", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TradeAmountBreakdown;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeAction;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$QuoteQuantity;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$AssetPrice;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TradeAmountBreakdown;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$GenerateCryptocurrencyQuote;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTradeAction;", "getAction", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$QuoteQuantity;", "getQuoteQuantity", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "getAssetSymbol", "Ljava/lang/String;", "getQuoteId", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$AssetPrice;", "getAssetPrice", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TradeAmountBreakdown;", "getTradeAmountBreakdown"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GenerateCryptocurrencyQuote {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction action;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.AssetPrice assetPrice;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;
        private final java.lang.String quoteId;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.QuoteQuantity quoteQuantity;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TradeAmountBreakdown tradeAmountBreakdown;

        public GenerateCryptocurrencyQuote(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction cryptocurrencyTradeAction, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.QuoteQuantity quoteQuantity, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.String str, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.AssetPrice assetPrice, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TradeAmountBreakdown tradeAmountBreakdown) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyTradeAction, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quoteQuantity, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyAssetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetPrice, "");
            this.action = cryptocurrencyTradeAction;
            this.quoteQuantity = quoteQuantity;
            this.assetSymbol = cryptocurrencyAssetSymbol;
            this.quoteId = str;
            this.assetPrice = assetPrice;
            this.tradeAmountBreakdown = tradeAmountBreakdown;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction getAction() {
            return this.action;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.QuoteQuantity getQuoteQuantity() {
            return this.quoteQuantity;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        public final java.lang.String getQuoteId() {
            return this.quoteId;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.AssetPrice getAssetPrice() {
            return this.assetPrice;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TradeAmountBreakdown getTradeAmountBreakdown() {
            return this.tradeAmountBreakdown;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction cryptocurrencyTradeAction = this.action;
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.QuoteQuantity quoteQuantity = this.quoteQuantity;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = this.assetSymbol;
            java.lang.String str = this.quoteId;
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.AssetPrice assetPrice = this.assetPrice;
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TradeAmountBreakdown tradeAmountBreakdown = this.tradeAmountBreakdown;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GenerateCryptocurrencyQuote(action=");
            sb.append(cryptocurrencyTradeAction);
            sb.append(", quoteQuantity=");
            sb.append(quoteQuantity);
            sb.append(", assetSymbol=");
            sb.append(cryptocurrencyAssetSymbol);
            sb.append(", quoteId=");
            sb.append(str);
            sb.append(", assetPrice=");
            sb.append(assetPrice);
            sb.append(", tradeAmountBreakdown=");
            sb.append(tradeAmountBreakdown);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.action.hashCode();
            int hashCode2 = this.quoteQuantity.hashCode();
            int hashCode3 = this.assetSymbol.hashCode();
            int hashCode4 = this.quoteId.hashCode();
            int hashCode5 = this.assetPrice.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TradeAmountBreakdown tradeAmountBreakdown = this.tradeAmountBreakdown;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (tradeAmountBreakdown == null ? 0 : tradeAmountBreakdown.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.GenerateCryptocurrencyQuote)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.GenerateCryptocurrencyQuote generateCryptocurrencyQuote = (com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.GenerateCryptocurrencyQuote) other;
            return this.action == generateCryptocurrencyQuote.action && kotlin.jvm.internal.Intrinsics.areEqual(this.quoteQuantity, generateCryptocurrencyQuote.quoteQuantity) && this.assetSymbol == generateCryptocurrencyQuote.assetSymbol && kotlin.jvm.internal.Intrinsics.areEqual(this.quoteId, generateCryptocurrencyQuote.quoteId) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetPrice, generateCryptocurrencyQuote.assetPrice) && kotlin.jvm.internal.Intrinsics.areEqual(this.tradeAmountBreakdown, generateCryptocurrencyQuote.tradeAmountBreakdown);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.GenerateCryptocurrencyQuote copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction action, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.QuoteQuantity quoteQuantity, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol, java.lang.String quoteId, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.AssetPrice assetPrice, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TradeAmountBreakdown tradeAmountBreakdown) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quoteQuantity, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quoteId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetPrice, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.GenerateCryptocurrencyQuote(action, quoteQuantity, assetSymbol, quoteId, assetPrice, tradeAmountBreakdown);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TradeAmountBreakdown getTradeAmountBreakdown() {
            return this.tradeAmountBreakdown;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.AssetPrice getAssetPrice() {
            return this.assetPrice;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getQuoteId() {
            return this.quoteId;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.QuoteQuantity getQuoteQuantity() {
            return this.quoteQuantity;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction getAction() {
            return this.action;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.GenerateCryptocurrencyQuote copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.GenerateCryptocurrencyQuote generateCryptocurrencyQuote, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction cryptocurrencyTradeAction, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.QuoteQuantity quoteQuantity, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.String str, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.AssetPrice assetPrice, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TradeAmountBreakdown tradeAmountBreakdown, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cryptocurrencyTradeAction = generateCryptocurrencyQuote.action;
            }
            if ((i & 2) != 0) {
                quoteQuantity = generateCryptocurrencyQuote.quoteQuantity;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.QuoteQuantity quoteQuantity2 = quoteQuantity;
            if ((i & 4) != 0) {
                cryptocurrencyAssetSymbol = generateCryptocurrencyQuote.assetSymbol;
            }
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol2 = cryptocurrencyAssetSymbol;
            if ((i & 8) != 0) {
                str = generateCryptocurrencyQuote.quoteId;
            }
            java.lang.String str2 = str;
            if ((i & 16) != 0) {
                assetPrice = generateCryptocurrencyQuote.assetPrice;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.AssetPrice assetPrice2 = assetPrice;
            if ((i & 32) != 0) {
                tradeAmountBreakdown = generateCryptocurrencyQuote.tradeAmountBreakdown;
            }
            return generateCryptocurrencyQuote.copy(cryptocurrencyTradeAction, quoteQuantity2, cryptocurrencyAssetSymbol2, str2, assetPrice2, tradeAmountBreakdown);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$QuoteQuantity;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "", "quantity", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$QuoteQuantity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "getAssetSymbol", "Ljava/lang/String;", "getQuantity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class QuoteQuantity {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;
        private final java.lang.String quantity;

        public QuoteQuantity(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyAssetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.assetSymbol = cryptocurrencyAssetSymbol;
            this.quantity = str;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        public final java.lang.String getQuantity() {
            return this.quantity;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = this.assetSymbol;
            java.lang.String str = this.quantity;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("QuoteQuantity(assetSymbol=");
            sb.append(cryptocurrencyAssetSymbol);
            sb.append(", quantity=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.assetSymbol.hashCode() * 31) + this.quantity.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.QuoteQuantity)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.QuoteQuantity quoteQuantity = (com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.QuoteQuantity) other;
            return this.assetSymbol == quoteQuantity.assetSymbol && kotlin.jvm.internal.Intrinsics.areEqual(this.quantity, quoteQuantity.quantity);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.QuoteQuantity copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol, java.lang.String quantity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quantity, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.QuoteQuantity(assetSymbol, quantity);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getQuantity() {
            return this.quantity;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.QuoteQuantity copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.QuoteQuantity quoteQuantity, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cryptocurrencyAssetSymbol = quoteQuantity.assetSymbol;
            }
            if ((i & 2) != 0) {
                str = quoteQuantity.quantity;
            }
            return quoteQuantity.copy(cryptocurrencyAssetSymbol, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$AssetPrice;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$AssetPrice;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AssetPrice {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public AssetPrice(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AssetPrice(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.AssetPrice)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.AssetPrice assetPrice = (com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.AssetPrice) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, assetPrice.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, assetPrice.value);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.AssetPrice copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.AssetPrice(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.AssetPrice copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.AssetPrice assetPrice, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = assetPrice.currencyCode;
            }
            if ((i & 2) != 0) {
                str = assetPrice.value;
            }
            return assetPrice.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TradeAmountBreakdown;", "", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$BaseAmount;", "baseAmount", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TotalAmount;", "totalAmount", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TotalFee;", "totalFee", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$BaseAmount;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TotalAmount;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TotalFee;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$BaseAmount;", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TotalAmount;", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TotalFee;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$BaseAmount;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TotalAmount;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TotalFee;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TradeAmountBreakdown;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$BaseAmount;", "getBaseAmount", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TotalAmount;", "getTotalAmount", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TotalFee;", "getTotalFee"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TradeAmountBreakdown {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.BaseAmount baseAmount;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalAmount totalAmount;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalFee totalFee;

        public TradeAmountBreakdown(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.BaseAmount baseAmount, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalAmount totalAmount, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalFee totalFee) {
            this.baseAmount = baseAmount;
            this.totalAmount = totalAmount;
            this.totalFee = totalFee;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.BaseAmount getBaseAmount() {
            return this.baseAmount;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalAmount getTotalAmount() {
            return this.totalAmount;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalFee getTotalFee() {
            return this.totalFee;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.BaseAmount baseAmount = this.baseAmount;
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalAmount totalAmount = this.totalAmount;
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalFee totalFee = this.totalFee;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TradeAmountBreakdown(baseAmount=");
            sb.append(baseAmount);
            sb.append(", totalAmount=");
            sb.append(totalAmount);
            sb.append(", totalFee=");
            sb.append(totalFee);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.BaseAmount baseAmount = this.baseAmount;
            int hashCode = baseAmount == null ? 0 : baseAmount.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalAmount totalAmount = this.totalAmount;
            int hashCode2 = totalAmount == null ? 0 : totalAmount.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalFee totalFee = this.totalFee;
            return (((hashCode * 31) + hashCode2) * 31) + (totalFee != null ? totalFee.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TradeAmountBreakdown)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TradeAmountBreakdown tradeAmountBreakdown = (com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TradeAmountBreakdown) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.baseAmount, tradeAmountBreakdown.baseAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmount, tradeAmountBreakdown.totalAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalFee, tradeAmountBreakdown.totalFee);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TradeAmountBreakdown copy(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.BaseAmount baseAmount, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalAmount totalAmount, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalFee totalFee) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TradeAmountBreakdown(baseAmount, totalAmount, totalFee);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalFee getTotalFee() {
            return this.totalFee;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalAmount getTotalAmount() {
            return this.totalAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.BaseAmount getBaseAmount() {
            return this.baseAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TradeAmountBreakdown copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TradeAmountBreakdown tradeAmountBreakdown, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.BaseAmount baseAmount, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalAmount totalAmount, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalFee totalFee, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                baseAmount = tradeAmountBreakdown.baseAmount;
            }
            if ((i & 2) != 0) {
                totalAmount = tradeAmountBreakdown.totalAmount;
            }
            if ((i & 4) != 0) {
                totalFee = tradeAmountBreakdown.totalFee;
            }
            return tradeAmountBreakdown.copy(baseAmount, totalAmount, totalFee);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$BaseAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$BaseAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BaseAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public BaseAmount(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BaseAmount(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.BaseAmount)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.BaseAmount baseAmount = (com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.BaseAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, baseAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, baseAmount.value);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.BaseAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.BaseAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.BaseAmount copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.BaseAmount baseAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = baseAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = baseAmount.value;
            }
            return baseAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TotalAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TotalAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TotalAmount(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalAmount(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalAmount)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalAmount totalAmount = (com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalAmount.value);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalAmount copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalAmount totalAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalAmount.value;
            }
            return totalAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TotalFee;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$TotalFee;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalFee {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TotalFee(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalFee(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalFee)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalFee totalFee = (com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalFee) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalFee.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalFee.value);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalFee copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalFee(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalFee copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation.TotalFee totalFee, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalFee.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalFee.value;
            }
            return totalFee.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyQuoteMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation GenerateCryptocurrencyQuote($input: GenerateCryptocurrencyQuoteInput!) { generateCryptocurrencyQuote(input: $input) { action quoteQuantity { assetSymbol quantity } assetSymbol quoteId assetPrice { currencyCode value } tradeAmountBreakdown { baseAmount { currencyCode value } totalAmount { currencyCode value } totalFee { currencyCode value } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.GenerateCryptocurrencyQuoteInput generateCryptocurrencyQuoteInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GenerateCryptocurrencyQuoteMutation(input=");
        sb.append(generateCryptocurrencyQuoteInput);
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
        return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation) other).input);
    }

    public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation copy(com.paypal.oslo.api.graphql.schema.type.GenerateCryptocurrencyQuoteInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.GenerateCryptocurrencyQuoteInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyQuoteMutation generateCryptocurrencyQuoteMutation, com.paypal.oslo.api.graphql.schema.type.GenerateCryptocurrencyQuoteInput generateCryptocurrencyQuoteInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            generateCryptocurrencyQuoteInput = generateCryptocurrencyQuoteMutation.input;
        }
        return generateCryptocurrencyQuoteMutation.copy(generateCryptocurrencyQuoteInput);
    }
}
