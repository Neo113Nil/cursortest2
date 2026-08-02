package com.paypal.oslo.feature.cryptocurrency.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0019*+,-./0123456789:;<=>?@A)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyHoldingsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyHoldingsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyHoldingsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyHoldingsInput;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyHoldingsInput;", "getInput", "Companion", "Data", "CryptocurrencyHoldings", "TotalPortfolioValue", "TotalHolding", "GainOrLoss", "GainOrLossFiatAmount", "Holding", "RewardHolding", "RewardApy", "Payout", "LifetimePayout", "AssetQuantity", "Accrued", "AssetQuantity1", "FiatAmount", "AssetExchangeRate", "AssetQuantity2", "FiatAmount1", "FiatAmount2", "GainOrLoss1", "GainOrLossFiatAmount1", "DailyGainOrLoss", "DailyGainOrLossFiatAmount", "AssetQuantityTruncated"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GetCryptocurrencyHoldingsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "d40b8b4f3088b344732af53c0196f49036c70b9be642e666a25f7a26335d517f";
    public static final java.lang.String OPERATION_NAME = "GetCryptocurrencyHoldings";
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyHoldingsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Companion INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Companion(null);
    public static final int $stable = 8;

    public GetCryptocurrencyHoldingsQuery(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyHoldingsInput cryptocurrencyHoldingsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyHoldingsInput, "");
        this.input = cryptocurrencyHoldingsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyHoldingsInput getInput() {
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
        com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.cryptocurrency.graphql.selections.GetCryptocurrencyHoldingsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$CryptocurrencyHoldings;", "cryptocurrencyHoldings", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$CryptocurrencyHoldings;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$CryptocurrencyHoldings;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$CryptocurrencyHoldings;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$CryptocurrencyHoldings;", "getCryptocurrencyHoldings"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings cryptocurrencyHoldings;

        public Data(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings cryptocurrencyHoldings) {
            this.cryptocurrencyHoldings = cryptocurrencyHoldings;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings getCryptocurrencyHoldings() {
            return this.cryptocurrencyHoldings;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings cryptocurrencyHoldings = this.cryptocurrencyHoldings;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(cryptocurrencyHoldings=");
            sb.append(cryptocurrencyHoldings);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings cryptocurrencyHoldings = this.cryptocurrencyHoldings;
            if (cryptocurrencyHoldings == null) {
                return 0;
            }
            return cryptocurrencyHoldings.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptocurrencyHoldings, ((com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Data) other).cryptocurrencyHoldings);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Data copy(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings cryptocurrencyHoldings) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Data(cryptocurrencyHoldings);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings getCryptocurrencyHoldings() {
            return this.cryptocurrencyHoldings;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Data copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Data data, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings cryptocurrencyHoldings, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cryptocurrencyHoldings = data.cryptocurrencyHoldings;
            }
            return data.copy(cryptocurrencyHoldings);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$CryptocurrencyHoldings;", "", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$TotalPortfolioValue;", "totalPortfolioValue", "", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Holding;", "holdings", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$TotalPortfolioValue;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$TotalPortfolioValue;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$TotalPortfolioValue;Ljava/util/List;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$CryptocurrencyHoldings;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$TotalPortfolioValue;", "getTotalPortfolioValue", "Ljava/util/List;", "getHoldings"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CryptocurrencyHoldings {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Holding> holdings;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue totalPortfolioValue;

        public CryptocurrencyHoldings(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue totalPortfolioValue, java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Holding> list) {
            this.totalPortfolioValue = totalPortfolioValue;
            this.holdings = list;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue getTotalPortfolioValue() {
            return this.totalPortfolioValue;
        }

        public final java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Holding> getHoldings() {
            return this.holdings;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue totalPortfolioValue = this.totalPortfolioValue;
            java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Holding> list = this.holdings;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptocurrencyHoldings(totalPortfolioValue=");
            sb.append(totalPortfolioValue);
            sb.append(", holdings=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue totalPortfolioValue = this.totalPortfolioValue;
            int hashCode = totalPortfolioValue == null ? 0 : totalPortfolioValue.hashCode();
            java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Holding> list = this.holdings;
            return (hashCode * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings cryptocurrencyHoldings = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.totalPortfolioValue, cryptocurrencyHoldings.totalPortfolioValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.holdings, cryptocurrencyHoldings.holdings);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings copy(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue totalPortfolioValue, java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Holding> holdings) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings(totalPortfolioValue, holdings);
        }

        public final java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Holding> component2() {
            return this.holdings;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue getTotalPortfolioValue() {
            return this.totalPortfolioValue;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings cryptocurrencyHoldings, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue totalPortfolioValue, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                totalPortfolioValue = cryptocurrencyHoldings.totalPortfolioValue;
            }
            if ((i & 2) != 0) {
                list = cryptocurrencyHoldings.holdings;
            }
            return cryptocurrencyHoldings.copy(totalPortfolioValue, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$TotalPortfolioValue;", "", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$TotalHolding;", "totalHolding", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLoss;", "gainOrLoss", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$TotalHolding;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLoss;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$TotalHolding;", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLoss;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$TotalHolding;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLoss;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$TotalPortfolioValue;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$TotalHolding;", "getTotalHolding", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLoss;", "getGainOrLoss"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalPortfolioValue {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss gainOrLoss;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding totalHolding;

        public TotalPortfolioValue(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding totalHolding, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss gainOrLoss) {
            this.totalHolding = totalHolding;
            this.gainOrLoss = gainOrLoss;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding getTotalHolding() {
            return this.totalHolding;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss getGainOrLoss() {
            return this.gainOrLoss;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding totalHolding = this.totalHolding;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss gainOrLoss = this.gainOrLoss;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalPortfolioValue(totalHolding=");
            sb.append(totalHolding);
            sb.append(", gainOrLoss=");
            sb.append(gainOrLoss);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding totalHolding = this.totalHolding;
            int hashCode = totalHolding == null ? 0 : totalHolding.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss gainOrLoss = this.gainOrLoss;
            return (hashCode * 31) + (gainOrLoss != null ? gainOrLoss.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue totalPortfolioValue = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.totalHolding, totalPortfolioValue.totalHolding) && kotlin.jvm.internal.Intrinsics.areEqual(this.gainOrLoss, totalPortfolioValue.gainOrLoss);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue copy(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding totalHolding, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss gainOrLoss) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue(totalHolding, gainOrLoss);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss getGainOrLoss() {
            return this.gainOrLoss;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding getTotalHolding() {
            return this.totalHolding;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue totalPortfolioValue, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding totalHolding, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss gainOrLoss, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                totalHolding = totalPortfolioValue.totalHolding;
            }
            if ((i & 2) != 0) {
                gainOrLoss = totalPortfolioValue.gainOrLoss;
            }
            return totalPortfolioValue.copy(totalHolding, gainOrLoss);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$TotalHolding;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$TotalHolding;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalHolding {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TotalHolding(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalHolding(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding totalHolding = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalHolding.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalHolding.value);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding totalHolding, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalHolding.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalHolding.value;
            }
            return totalHolding.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLoss;", "", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLossFiatAmount;", "gainOrLossFiatAmount", "gainOrLossPercent", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;", "gainOrLossStatus", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLossFiatAmount;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLossFiatAmount;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLossFiatAmount;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLoss;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLossFiatAmount;", "getGainOrLossFiatAmount", "Ljava/lang/Object;", "getGainOrLossPercent", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;", "getGainOrLossStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GainOrLoss {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount gainOrLossFiatAmount;
        private final java.lang.Object gainOrLossPercent;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus gainOrLossStatus;

        public GainOrLoss(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount gainOrLossFiatAmount, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus) {
            this.gainOrLossFiatAmount = gainOrLossFiatAmount;
            this.gainOrLossPercent = obj;
            this.gainOrLossStatus = cryptocurrencyGainOrLossStatus;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount getGainOrLossFiatAmount() {
            return this.gainOrLossFiatAmount;
        }

        public final java.lang.Object getGainOrLossPercent() {
            return this.gainOrLossPercent;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus getGainOrLossStatus() {
            return this.gainOrLossStatus;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount gainOrLossFiatAmount = this.gainOrLossFiatAmount;
            java.lang.Object obj = this.gainOrLossPercent;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus = this.gainOrLossStatus;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GainOrLoss(gainOrLossFiatAmount=");
            sb.append(gainOrLossFiatAmount);
            sb.append(", gainOrLossPercent=");
            sb.append(obj);
            sb.append(", gainOrLossStatus=");
            sb.append(cryptocurrencyGainOrLossStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount gainOrLossFiatAmount = this.gainOrLossFiatAmount;
            int hashCode = gainOrLossFiatAmount == null ? 0 : gainOrLossFiatAmount.hashCode();
            java.lang.Object obj = this.gainOrLossPercent;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus = this.gainOrLossStatus;
            return (((hashCode * 31) + hashCode2) * 31) + (cryptocurrencyGainOrLossStatus != null ? cryptocurrencyGainOrLossStatus.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss gainOrLoss = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.gainOrLossFiatAmount, gainOrLoss.gainOrLossFiatAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.gainOrLossPercent, gainOrLoss.gainOrLossPercent) && this.gainOrLossStatus == gainOrLoss.gainOrLossStatus;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss copy(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount gainOrLossFiatAmount, java.lang.Object gainOrLossPercent, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus gainOrLossStatus) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss(gainOrLossFiatAmount, gainOrLossPercent, gainOrLossStatus);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus getGainOrLossStatus() {
            return this.gainOrLossStatus;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getGainOrLossPercent() {
            return this.gainOrLossPercent;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount getGainOrLossFiatAmount() {
            return this.gainOrLossFiatAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss gainOrLoss, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount gainOrLossFiatAmount, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                gainOrLossFiatAmount = gainOrLoss.gainOrLossFiatAmount;
            }
            if ((i & 2) != 0) {
                obj = gainOrLoss.gainOrLossPercent;
            }
            if ((i & 4) != 0) {
                cryptocurrencyGainOrLossStatus = gainOrLoss.gainOrLossStatus;
            }
            return gainOrLoss.copy(gainOrLossFiatAmount, obj, cryptocurrencyGainOrLossStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLossFiatAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLossFiatAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GainOrLossFiatAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public GainOrLossFiatAmount(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GainOrLossFiatAmount(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount gainOrLossFiatAmount = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, gainOrLossFiatAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, gainOrLossFiatAmount.value);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount gainOrLossFiatAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = gainOrLossFiatAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = gainOrLossFiatAmount.value;
            }
            return gainOrLossFiatAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"Jp\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Holding;", "", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$RewardHolding;", "rewardHolding", "", "assetName", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetExchangeRate;", "assetExchangeRate", "logoUrl", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount2;", "fiatAmount", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLoss1;", "gainOrLoss", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$DailyGainOrLoss;", "dailyGainOrLoss", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantityTruncated;", "assetQuantityTruncated", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$RewardHolding;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetExchangeRate;Ljava/lang/Object;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount2;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLoss1;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$DailyGainOrLoss;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantityTruncated;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$RewardHolding;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetExchangeRate;", "component4", "()Ljava/lang/Object;", "component5", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount2;", "component6", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLoss1;", "component7", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$DailyGainOrLoss;", "component8", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantityTruncated;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$RewardHolding;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetExchangeRate;Ljava/lang/Object;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount2;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLoss1;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$DailyGainOrLoss;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantityTruncated;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Holding;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$RewardHolding;", "getRewardHolding", "Ljava/lang/String;", "getAssetName", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetExchangeRate;", "getAssetExchangeRate", "Ljava/lang/Object;", "getLogoUrl", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount2;", "getFiatAmount", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLoss1;", "getGainOrLoss", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$DailyGainOrLoss;", "getDailyGainOrLoss", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantityTruncated;", "getAssetQuantityTruncated"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Holding {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate assetExchangeRate;
        private final java.lang.String assetName;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated assetQuantityTruncated;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss dailyGainOrLoss;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2 fiatAmount;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1 gainOrLoss;
        private final java.lang.Object logoUrl;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardHolding rewardHolding;

        public Holding(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardHolding rewardHolding, java.lang.String str, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate assetExchangeRate, java.lang.Object obj, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2 fiatAmount2, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1 gainOrLoss1, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss dailyGainOrLoss, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated assetQuantityTruncated) {
            this.rewardHolding = rewardHolding;
            this.assetName = str;
            this.assetExchangeRate = assetExchangeRate;
            this.logoUrl = obj;
            this.fiatAmount = fiatAmount2;
            this.gainOrLoss = gainOrLoss1;
            this.dailyGainOrLoss = dailyGainOrLoss;
            this.assetQuantityTruncated = assetQuantityTruncated;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardHolding getRewardHolding() {
            return this.rewardHolding;
        }

        public final java.lang.String getAssetName() {
            return this.assetName;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate getAssetExchangeRate() {
            return this.assetExchangeRate;
        }

        public final java.lang.Object getLogoUrl() {
            return this.logoUrl;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2 getFiatAmount() {
            return this.fiatAmount;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1 getGainOrLoss() {
            return this.gainOrLoss;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss getDailyGainOrLoss() {
            return this.dailyGainOrLoss;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated getAssetQuantityTruncated() {
            return this.assetQuantityTruncated;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardHolding rewardHolding = this.rewardHolding;
            java.lang.String str = this.assetName;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate assetExchangeRate = this.assetExchangeRate;
            java.lang.Object obj = this.logoUrl;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2 fiatAmount2 = this.fiatAmount;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1 gainOrLoss1 = this.gainOrLoss;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss dailyGainOrLoss = this.dailyGainOrLoss;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated assetQuantityTruncated = this.assetQuantityTruncated;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Holding(rewardHolding=");
            sb.append(rewardHolding);
            sb.append(", assetName=");
            sb.append(str);
            sb.append(", assetExchangeRate=");
            sb.append(assetExchangeRate);
            sb.append(", logoUrl=");
            sb.append(obj);
            sb.append(", fiatAmount=");
            sb.append(fiatAmount2);
            sb.append(", gainOrLoss=");
            sb.append(gainOrLoss1);
            sb.append(", dailyGainOrLoss=");
            sb.append(dailyGainOrLoss);
            sb.append(", assetQuantityTruncated=");
            sb.append(assetQuantityTruncated);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardHolding rewardHolding = this.rewardHolding;
            int hashCode = rewardHolding == null ? 0 : rewardHolding.hashCode();
            java.lang.String str = this.assetName;
            int hashCode2 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate assetExchangeRate = this.assetExchangeRate;
            int hashCode3 = assetExchangeRate == null ? 0 : assetExchangeRate.hashCode();
            java.lang.Object obj = this.logoUrl;
            int hashCode4 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2 fiatAmount2 = this.fiatAmount;
            int hashCode5 = fiatAmount2 == null ? 0 : fiatAmount2.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1 gainOrLoss1 = this.gainOrLoss;
            int hashCode6 = gainOrLoss1 == null ? 0 : gainOrLoss1.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss dailyGainOrLoss = this.dailyGainOrLoss;
            int hashCode7 = dailyGainOrLoss == null ? 0 : dailyGainOrLoss.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated assetQuantityTruncated = this.assetQuantityTruncated;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (assetQuantityTruncated != null ? assetQuantityTruncated.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Holding)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Holding holding = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Holding) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.rewardHolding, holding.rewardHolding) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetName, holding.assetName) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetExchangeRate, holding.assetExchangeRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, holding.logoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiatAmount, holding.fiatAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.gainOrLoss, holding.gainOrLoss) && kotlin.jvm.internal.Intrinsics.areEqual(this.dailyGainOrLoss, holding.dailyGainOrLoss) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetQuantityTruncated, holding.assetQuantityTruncated);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Holding copy(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardHolding rewardHolding, java.lang.String assetName, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate assetExchangeRate, java.lang.Object logoUrl, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2 fiatAmount, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1 gainOrLoss, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss dailyGainOrLoss, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated assetQuantityTruncated) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Holding(rewardHolding, assetName, assetExchangeRate, logoUrl, fiatAmount, gainOrLoss, dailyGainOrLoss, assetQuantityTruncated);
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated getAssetQuantityTruncated() {
            return this.assetQuantityTruncated;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss getDailyGainOrLoss() {
            return this.dailyGainOrLoss;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1 getGainOrLoss() {
            return this.gainOrLoss;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2 getFiatAmount() {
            return this.fiatAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getLogoUrl() {
            return this.logoUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate getAssetExchangeRate() {
            return this.assetExchangeRate;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAssetName() {
            return this.assetName;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardHolding getRewardHolding() {
            return this.rewardHolding;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$RewardHolding;", "", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$RewardApy;", "rewardApy", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$RewardApy;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$RewardApy;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$RewardApy;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$RewardHolding;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$RewardApy;", "getRewardApy"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RewardHolding {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy rewardApy;

        public RewardHolding(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy rewardApy) {
            this.rewardApy = rewardApy;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy getRewardApy() {
            return this.rewardApy;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy rewardApy = this.rewardApy;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RewardHolding(rewardApy=");
            sb.append(rewardApy);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy rewardApy = this.rewardApy;
            if (rewardApy == null) {
                return 0;
            }
            return rewardApy.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardHolding) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardApy, ((com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardHolding) other).rewardApy);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardHolding copy(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy rewardApy) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardHolding(rewardApy);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy getRewardApy() {
            return this.rewardApy;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardHolding copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardHolding rewardHolding, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy rewardApy, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                rewardApy = rewardHolding.rewardApy;
            }
            return rewardHolding.copy(rewardApy);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$RewardApy;", "", "", "rate", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Payout;", "payout", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$LifetimePayout;", "lifetimePayout", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Accrued;", "accrued", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Payout;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$LifetimePayout;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Accrued;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Payout;", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$LifetimePayout;", "component4", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Accrued;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Payout;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$LifetimePayout;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Accrued;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$RewardApy;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRate", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Payout;", "getPayout", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$LifetimePayout;", "getLifetimePayout", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Accrued;", "getAccrued"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RewardApy {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued accrued;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout lifetimePayout;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout payout;
        private final java.lang.String rate;

        public RewardApy(java.lang.String str, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout payout, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout lifetimePayout, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued accrued) {
            this.rate = str;
            this.payout = payout;
            this.lifetimePayout = lifetimePayout;
            this.accrued = accrued;
        }

        public final java.lang.String getRate() {
            return this.rate;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout getPayout() {
            return this.payout;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout getLifetimePayout() {
            return this.lifetimePayout;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued getAccrued() {
            return this.accrued;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.rate;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout payout = this.payout;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout lifetimePayout = this.lifetimePayout;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued accrued = this.accrued;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RewardApy(rate=");
            sb.append(str);
            sb.append(", payout=");
            sb.append(payout);
            sb.append(", lifetimePayout=");
            sb.append(lifetimePayout);
            sb.append(", accrued=");
            sb.append(accrued);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.rate;
            int hashCode = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout payout = this.payout;
            int hashCode2 = payout == null ? 0 : payout.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout lifetimePayout = this.lifetimePayout;
            int hashCode3 = lifetimePayout == null ? 0 : lifetimePayout.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued accrued = this.accrued;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (accrued != null ? accrued.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy rewardApy = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.rate, rewardApy.rate) && kotlin.jvm.internal.Intrinsics.areEqual(this.payout, rewardApy.payout) && kotlin.jvm.internal.Intrinsics.areEqual(this.lifetimePayout, rewardApy.lifetimePayout) && kotlin.jvm.internal.Intrinsics.areEqual(this.accrued, rewardApy.accrued);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy copy(java.lang.String rate, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout payout, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout lifetimePayout, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued accrued) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy(rate, payout, lifetimePayout, accrued);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued getAccrued() {
            return this.accrued;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout getLifetimePayout() {
            return this.lifetimePayout;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout getPayout() {
            return this.payout;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRate() {
            return this.rate;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy rewardApy, java.lang.String str, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout payout, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout lifetimePayout, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued accrued, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = rewardApy.rate;
            }
            if ((i & 2) != 0) {
                payout = rewardApy.payout;
            }
            if ((i & 4) != 0) {
                lifetimePayout = rewardApy.lifetimePayout;
            }
            if ((i & 8) != 0) {
                accrued = rewardApy.accrued;
            }
            return rewardApy.copy(str, payout, lifetimePayout, accrued);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Payout;", "", "", "lastPayoutReason", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPayoutStatus;", "lastPayoutStatus", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPayoutStatus;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPayoutStatus;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPayoutStatus;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Payout;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLastPayoutReason", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPayoutStatus;", "getLastPayoutStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Payout {
        public static final int $stable = 0;
        private final java.lang.String lastPayoutReason;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPayoutStatus lastPayoutStatus;

        public Payout(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPayoutStatus cryptocurrencyPayoutStatus) {
            this.lastPayoutReason = str;
            this.lastPayoutStatus = cryptocurrencyPayoutStatus;
        }

        public final java.lang.String getLastPayoutReason() {
            return this.lastPayoutReason;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPayoutStatus getLastPayoutStatus() {
            return this.lastPayoutStatus;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.lastPayoutReason;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPayoutStatus cryptocurrencyPayoutStatus = this.lastPayoutStatus;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Payout(lastPayoutReason=");
            sb.append(str);
            sb.append(", lastPayoutStatus=");
            sb.append(cryptocurrencyPayoutStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.lastPayoutReason;
            int hashCode = str == null ? 0 : str.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPayoutStatus cryptocurrencyPayoutStatus = this.lastPayoutStatus;
            return (hashCode * 31) + (cryptocurrencyPayoutStatus != null ? cryptocurrencyPayoutStatus.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout payout = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.lastPayoutReason, payout.lastPayoutReason) && this.lastPayoutStatus == payout.lastPayoutStatus;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout copy(java.lang.String lastPayoutReason, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPayoutStatus lastPayoutStatus) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout(lastPayoutReason, lastPayoutStatus);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPayoutStatus getLastPayoutStatus() {
            return this.lastPayoutStatus;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getLastPayoutReason() {
            return this.lastPayoutReason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout payout, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPayoutStatus cryptocurrencyPayoutStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = payout.lastPayoutReason;
            }
            if ((i & 2) != 0) {
                cryptocurrencyPayoutStatus = payout.lastPayoutStatus;
            }
            return payout.copy(str, cryptocurrencyPayoutStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$LifetimePayout;", "", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity;", "assetQuantity", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$LifetimePayout;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity;", "getAssetQuantity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LifetimePayout {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity assetQuantity;

        public LifetimePayout(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity assetQuantity) {
            this.assetQuantity = assetQuantity;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity getAssetQuantity() {
            return this.assetQuantity;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity assetQuantity = this.assetQuantity;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LifetimePayout(assetQuantity=");
            sb.append(assetQuantity);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity assetQuantity = this.assetQuantity;
            if (assetQuantity == null) {
                return 0;
            }
            return assetQuantity.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetQuantity, ((com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout) other).assetQuantity);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout copy(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity assetQuantity) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout(assetQuantity);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity getAssetQuantity() {
            return this.assetQuantity;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout lifetimePayout, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity assetQuantity, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                assetQuantity = lifetimePayout.assetQuantity;
            }
            return lifetimePayout.copy(assetQuantity);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "", "quantity", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "getAssetSymbol", "Ljava/lang/String;", "getQuantity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AssetQuantity {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;
        private final java.lang.String quantity;

        public AssetQuantity(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AssetQuantity(assetSymbol=");
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity assetQuantity = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity) other;
            return this.assetSymbol == assetQuantity.assetSymbol && kotlin.jvm.internal.Intrinsics.areEqual(this.quantity, assetQuantity.quantity);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol, java.lang.String quantity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quantity, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity(assetSymbol, quantity);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getQuantity() {
            return this.quantity;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity assetQuantity, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cryptocurrencyAssetSymbol = assetQuantity.assetSymbol;
            }
            if ((i & 2) != 0) {
                str = assetQuantity.quantity;
            }
            return assetQuantity.copy(cryptocurrencyAssetSymbol, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Accrued;", "", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity1;", "assetQuantity", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount;", "fiatAmount", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity1;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity1;", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity1;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Accrued;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity1;", "getAssetQuantity", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount;", "getFiatAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Accrued {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1 assetQuantity;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount fiatAmount;

        public Accrued(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1 assetQuantity1, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount fiatAmount) {
            this.assetQuantity = assetQuantity1;
            this.fiatAmount = fiatAmount;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1 getAssetQuantity() {
            return this.assetQuantity;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount getFiatAmount() {
            return this.fiatAmount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1 assetQuantity1 = this.assetQuantity;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount fiatAmount = this.fiatAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Accrued(assetQuantity=");
            sb.append(assetQuantity1);
            sb.append(", fiatAmount=");
            sb.append(fiatAmount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1 assetQuantity1 = this.assetQuantity;
            int hashCode = assetQuantity1 == null ? 0 : assetQuantity1.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount fiatAmount = this.fiatAmount;
            return (hashCode * 31) + (fiatAmount != null ? fiatAmount.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued accrued = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.assetQuantity, accrued.assetQuantity) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiatAmount, accrued.fiatAmount);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued copy(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1 assetQuantity, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount fiatAmount) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued(assetQuantity, fiatAmount);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount getFiatAmount() {
            return this.fiatAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1 getAssetQuantity() {
            return this.assetQuantity;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued accrued, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1 assetQuantity1, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount fiatAmount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                assetQuantity1 = accrued.assetQuantity;
            }
            if ((i & 2) != 0) {
                fiatAmount = accrued.fiatAmount;
            }
            return accrued.copy(assetQuantity1, fiatAmount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity1;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "", "quantity", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "getAssetSymbol", "Ljava/lang/String;", "getQuantity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AssetQuantity1 {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;
        private final java.lang.String quantity;

        public AssetQuantity1(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AssetQuantity1(assetSymbol=");
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1 assetQuantity1 = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1) other;
            return this.assetSymbol == assetQuantity1.assetSymbol && kotlin.jvm.internal.Intrinsics.areEqual(this.quantity, assetQuantity1.quantity);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1 copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol, java.lang.String quantity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quantity, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1(assetSymbol, quantity);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getQuantity() {
            return this.quantity;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1 copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1 assetQuantity1, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cryptocurrencyAssetSymbol = assetQuantity1.assetSymbol;
            }
            if ((i & 2) != 0) {
                str = assetQuantity1.quantity;
            }
            return assetQuantity1.copy(cryptocurrencyAssetSymbol, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/lang/Object;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FiatAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public FiatAmount(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.value = str;
            this.currencyCode = obj;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.Object obj = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FiatAmount(value=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.value.hashCode() * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount fiatAmount = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, fiatAmount.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, fiatAmount.currencyCode);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount copy(java.lang.String value, java.lang.Object currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount fiatAmount, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = fiatAmount.value;
            }
            if ((i & 2) != 0) {
                obj = fiatAmount.currencyCode;
            }
            return fiatAmount.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetExchangeRate;", "", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity2;", "assetQuantity", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount1;", "fiatAmount", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity2;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount1;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity2;", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount1;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity2;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount1;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetExchangeRate;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity2;", "getAssetQuantity", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount1;", "getFiatAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AssetExchangeRate {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity2 assetQuantity;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1 fiatAmount;

        public AssetExchangeRate(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity2 assetQuantity2, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1 fiatAmount1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetQuantity2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiatAmount1, "");
            this.assetQuantity = assetQuantity2;
            this.fiatAmount = fiatAmount1;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity2 getAssetQuantity() {
            return this.assetQuantity;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1 getFiatAmount() {
            return this.fiatAmount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity2 assetQuantity2 = this.assetQuantity;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1 fiatAmount1 = this.fiatAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AssetExchangeRate(assetQuantity=");
            sb.append(assetQuantity2);
            sb.append(", fiatAmount=");
            sb.append(fiatAmount1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.assetQuantity.hashCode() * 31) + this.fiatAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate assetExchangeRate = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.assetQuantity, assetExchangeRate.assetQuantity) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiatAmount, assetExchangeRate.fiatAmount);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate copy(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity2 assetQuantity, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1 fiatAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetQuantity, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiatAmount, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate(assetQuantity, fiatAmount);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1 getFiatAmount() {
            return this.fiatAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity2 getAssetQuantity() {
            return this.assetQuantity;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate assetExchangeRate, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity2 assetQuantity2, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1 fiatAmount1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                assetQuantity2 = assetExchangeRate.assetQuantity;
            }
            if ((i & 2) != 0) {
                fiatAmount1 = assetExchangeRate.fiatAmount;
            }
            return assetExchangeRate.copy(assetQuantity2, fiatAmount1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity2;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "", "quantity", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity2;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "getAssetSymbol", "Ljava/lang/String;", "getQuantity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AssetQuantity2 {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;
        private final java.lang.String quantity;

        public AssetQuantity2(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AssetQuantity2(assetSymbol=");
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity2)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity2 assetQuantity2 = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity2) other;
            return this.assetSymbol == assetQuantity2.assetSymbol && kotlin.jvm.internal.Intrinsics.areEqual(this.quantity, assetQuantity2.quantity);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity2 copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol, java.lang.String quantity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quantity, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity2(assetSymbol, quantity);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getQuantity() {
            return this.quantity;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity2 copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity2 assetQuantity2, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cryptocurrencyAssetSymbol = assetQuantity2.assetSymbol;
            }
            if ((i & 2) != 0) {
                str = assetQuantity2.quantity;
            }
            return assetQuantity2.copy(cryptocurrencyAssetSymbol, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount1;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/lang/Object;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FiatAmount1 {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public FiatAmount1(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.value = str;
            this.currencyCode = obj;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.Object obj = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FiatAmount1(value=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.value.hashCode() * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1 fiatAmount1 = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, fiatAmount1.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, fiatAmount1.currencyCode);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1 copy(java.lang.String value, java.lang.Object currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1 copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1 fiatAmount1, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = fiatAmount1.value;
            }
            if ((i & 2) != 0) {
                obj = fiatAmount1.currencyCode;
            }
            return fiatAmount1.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount2;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount2;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FiatAmount2 {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public FiatAmount2(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FiatAmount2(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2 fiatAmount2 = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, fiatAmount2.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, fiatAmount2.value);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2 copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2 copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2 fiatAmount2, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = fiatAmount2.currencyCode;
            }
            if ((i & 2) != 0) {
                str = fiatAmount2.value;
            }
            return fiatAmount2.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLoss1;", "", "gainOrLossPercent", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;", "gainOrLossStatus", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLossFiatAmount1;", "gainOrLossFiatAmount", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLossFiatAmount1;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLossFiatAmount1;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLossFiatAmount1;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLoss1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getGainOrLossPercent", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;", "getGainOrLossStatus", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLossFiatAmount1;", "getGainOrLossFiatAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GainOrLoss1 {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1 gainOrLossFiatAmount;
        private final java.lang.Object gainOrLossPercent;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus gainOrLossStatus;

        public GainOrLoss1(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1 gainOrLossFiatAmount1) {
            this.gainOrLossPercent = obj;
            this.gainOrLossStatus = cryptocurrencyGainOrLossStatus;
            this.gainOrLossFiatAmount = gainOrLossFiatAmount1;
        }

        public final java.lang.Object getGainOrLossPercent() {
            return this.gainOrLossPercent;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus getGainOrLossStatus() {
            return this.gainOrLossStatus;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1 getGainOrLossFiatAmount() {
            return this.gainOrLossFiatAmount;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.gainOrLossPercent;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus = this.gainOrLossStatus;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1 gainOrLossFiatAmount1 = this.gainOrLossFiatAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GainOrLoss1(gainOrLossPercent=");
            sb.append(obj);
            sb.append(", gainOrLossStatus=");
            sb.append(cryptocurrencyGainOrLossStatus);
            sb.append(", gainOrLossFiatAmount=");
            sb.append(gainOrLossFiatAmount1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.gainOrLossPercent;
            int hashCode = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus = this.gainOrLossStatus;
            int hashCode2 = cryptocurrencyGainOrLossStatus == null ? 0 : cryptocurrencyGainOrLossStatus.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1 gainOrLossFiatAmount1 = this.gainOrLossFiatAmount;
            return (((hashCode * 31) + hashCode2) * 31) + (gainOrLossFiatAmount1 != null ? gainOrLossFiatAmount1.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1 gainOrLoss1 = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.gainOrLossPercent, gainOrLoss1.gainOrLossPercent) && this.gainOrLossStatus == gainOrLoss1.gainOrLossStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.gainOrLossFiatAmount, gainOrLoss1.gainOrLossFiatAmount);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1 copy(java.lang.Object gainOrLossPercent, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus gainOrLossStatus, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1 gainOrLossFiatAmount) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1(gainOrLossPercent, gainOrLossStatus, gainOrLossFiatAmount);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1 getGainOrLossFiatAmount() {
            return this.gainOrLossFiatAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus getGainOrLossStatus() {
            return this.gainOrLossStatus;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getGainOrLossPercent() {
            return this.gainOrLossPercent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1 copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1 gainOrLoss1, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1 gainOrLossFiatAmount1, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = gainOrLoss1.gainOrLossPercent;
            }
            if ((i & 2) != 0) {
                cryptocurrencyGainOrLossStatus = gainOrLoss1.gainOrLossStatus;
            }
            if ((i & 4) != 0) {
                gainOrLossFiatAmount1 = gainOrLoss1.gainOrLossFiatAmount;
            }
            return gainOrLoss1.copy(obj, cryptocurrencyGainOrLossStatus, gainOrLossFiatAmount1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLossFiatAmount1;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLossFiatAmount1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GainOrLossFiatAmount1 {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public GainOrLossFiatAmount1(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GainOrLossFiatAmount1(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1 gainOrLossFiatAmount1 = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, gainOrLossFiatAmount1.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, gainOrLossFiatAmount1.value);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1 copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1 copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1 gainOrLossFiatAmount1, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = gainOrLossFiatAmount1.currencyCode;
            }
            if ((i & 2) != 0) {
                str = gainOrLossFiatAmount1.value;
            }
            return gainOrLossFiatAmount1.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$DailyGainOrLoss;", "", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$DailyGainOrLossFiatAmount;", "dailyGainOrLossFiatAmount", "dailyGainOrLossFiatPercent", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;", "dailyGainOrLossStatus", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$DailyGainOrLossFiatAmount;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$DailyGainOrLossFiatAmount;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$DailyGainOrLossFiatAmount;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$DailyGainOrLoss;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$DailyGainOrLossFiatAmount;", "getDailyGainOrLossFiatAmount", "Ljava/lang/Object;", "getDailyGainOrLossFiatPercent", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;", "getDailyGainOrLossStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DailyGainOrLoss {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount dailyGainOrLossFiatAmount;
        private final java.lang.Object dailyGainOrLossFiatPercent;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus dailyGainOrLossStatus;

        public DailyGainOrLoss(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount dailyGainOrLossFiatAmount, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus) {
            this.dailyGainOrLossFiatAmount = dailyGainOrLossFiatAmount;
            this.dailyGainOrLossFiatPercent = obj;
            this.dailyGainOrLossStatus = cryptocurrencyGainOrLossStatus;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount getDailyGainOrLossFiatAmount() {
            return this.dailyGainOrLossFiatAmount;
        }

        public final java.lang.Object getDailyGainOrLossFiatPercent() {
            return this.dailyGainOrLossFiatPercent;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus getDailyGainOrLossStatus() {
            return this.dailyGainOrLossStatus;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount dailyGainOrLossFiatAmount = this.dailyGainOrLossFiatAmount;
            java.lang.Object obj = this.dailyGainOrLossFiatPercent;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus = this.dailyGainOrLossStatus;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DailyGainOrLoss(dailyGainOrLossFiatAmount=");
            sb.append(dailyGainOrLossFiatAmount);
            sb.append(", dailyGainOrLossFiatPercent=");
            sb.append(obj);
            sb.append(", dailyGainOrLossStatus=");
            sb.append(cryptocurrencyGainOrLossStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount dailyGainOrLossFiatAmount = this.dailyGainOrLossFiatAmount;
            int hashCode = dailyGainOrLossFiatAmount == null ? 0 : dailyGainOrLossFiatAmount.hashCode();
            java.lang.Object obj = this.dailyGainOrLossFiatPercent;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus = this.dailyGainOrLossStatus;
            return (((hashCode * 31) + hashCode2) * 31) + (cryptocurrencyGainOrLossStatus != null ? cryptocurrencyGainOrLossStatus.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss dailyGainOrLoss = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.dailyGainOrLossFiatAmount, dailyGainOrLoss.dailyGainOrLossFiatAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.dailyGainOrLossFiatPercent, dailyGainOrLoss.dailyGainOrLossFiatPercent) && this.dailyGainOrLossStatus == dailyGainOrLoss.dailyGainOrLossStatus;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss copy(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount dailyGainOrLossFiatAmount, java.lang.Object dailyGainOrLossFiatPercent, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus dailyGainOrLossStatus) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss(dailyGainOrLossFiatAmount, dailyGainOrLossFiatPercent, dailyGainOrLossStatus);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus getDailyGainOrLossStatus() {
            return this.dailyGainOrLossStatus;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getDailyGainOrLossFiatPercent() {
            return this.dailyGainOrLossFiatPercent;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount getDailyGainOrLossFiatAmount() {
            return this.dailyGainOrLossFiatAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss dailyGainOrLoss, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount dailyGainOrLossFiatAmount, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                dailyGainOrLossFiatAmount = dailyGainOrLoss.dailyGainOrLossFiatAmount;
            }
            if ((i & 2) != 0) {
                obj = dailyGainOrLoss.dailyGainOrLossFiatPercent;
            }
            if ((i & 4) != 0) {
                cryptocurrencyGainOrLossStatus = dailyGainOrLoss.dailyGainOrLossStatus;
            }
            return dailyGainOrLoss.copy(dailyGainOrLossFiatAmount, obj, cryptocurrencyGainOrLossStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$DailyGainOrLossFiatAmount;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$DailyGainOrLossFiatAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/lang/Object;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DailyGainOrLossFiatAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public DailyGainOrLossFiatAmount(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.value = str;
            this.currencyCode = obj;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.Object obj = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DailyGainOrLossFiatAmount(value=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.value.hashCode() * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount dailyGainOrLossFiatAmount = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, dailyGainOrLossFiatAmount.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, dailyGainOrLossFiatAmount.currencyCode);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount copy(java.lang.String value, java.lang.Object currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount dailyGainOrLossFiatAmount, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = dailyGainOrLossFiatAmount.value;
            }
            if ((i & 2) != 0) {
                obj = dailyGainOrLossFiatAmount.currencyCode;
            }
            return dailyGainOrLossFiatAmount.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantityTruncated;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "", "quantity", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantityTruncated;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "getAssetSymbol", "Ljava/lang/String;", "getQuantity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AssetQuantityTruncated {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;
        private final java.lang.String quantity;

        public AssetQuantityTruncated(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AssetQuantityTruncated(assetSymbol=");
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated assetQuantityTruncated = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated) other;
            return this.assetSymbol == assetQuantityTruncated.assetSymbol && kotlin.jvm.internal.Intrinsics.areEqual(this.quantity, assetQuantityTruncated.quantity);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol, java.lang.String quantity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quantity, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated(assetSymbol, quantity);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getQuantity() {
            return this.quantity;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated assetQuantityTruncated, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cryptocurrencyAssetSymbol = assetQuantityTruncated.assetSymbol;
            }
            if ((i & 2) != 0) {
                str = assetQuantityTruncated.quantity;
            }
            return assetQuantityTruncated.copy(cryptocurrencyAssetSymbol, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetCryptocurrencyHoldings($input: CryptocurrencyHoldingsInput!) { cryptocurrencyHoldings(input: $input) { totalPortfolioValue { totalHolding { currencyCode value } gainOrLoss { gainOrLossFiatAmount { currencyCode value } gainOrLossPercent gainOrLossStatus } } holdings { rewardHolding { rewardApy { rate payout { lastPayoutReason lastPayoutStatus } lifetimePayout { assetQuantity { assetSymbol quantity } } accrued { assetQuantity { assetSymbol quantity } fiatAmount { value currencyCode } } } } assetName assetExchangeRate { assetQuantity { assetSymbol quantity } fiatAmount { value currencyCode } } logoUrl fiatAmount { currencyCode value } gainOrLoss { gainOrLossPercent gainOrLossStatus gainOrLossFiatAmount { currencyCode value } } dailyGainOrLoss { dailyGainOrLossFiatAmount { value currencyCode } dailyGainOrLossFiatPercent dailyGainOrLossStatus } assetQuantityTruncated { assetSymbol quantity } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyHoldingsInput cryptocurrencyHoldingsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetCryptocurrencyHoldingsQuery(input=");
        sb.append(cryptocurrencyHoldingsInput);
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
        return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery) other).input);
    }

    public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyHoldingsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyHoldingsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery getCryptocurrencyHoldingsQuery, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyHoldingsInput cryptocurrencyHoldingsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cryptocurrencyHoldingsInput = getCryptocurrencyHoldingsQuery.input;
        }
        return getCryptocurrencyHoldingsQuery.copy(cryptocurrencyHoldingsInput);
    }
}
