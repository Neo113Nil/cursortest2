package com.paypal.oslo.feature.cryptocurrency.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000b*+,-./0123)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyMarketPricesInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyMarketPricesInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyMarketPricesInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyMarketPricesInput;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyMarketPricesInput;", "getInput", "Companion", "Data", "CryptocurrencyMarketPrices", "CryptocurrencyMarketCapability", "Trade", "Transfer", "Receive", com.paypal.oslo.feature.p2p.api.navigation.SendTabConfiguration.PARENT_NAME, "CryptocurrencyMarketPrice", "AssetPrice", "PriceMovementAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GetCryptocurrencyMarketPricesQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Data> {
    public static final java.lang.String OPERATION_ID = "0542c7021e5df8fc40e0ad1059fe2a07372011861a61474e9d3db486efb618a1";
    public static final java.lang.String OPERATION_NAME = "GetCryptocurrencyMarketPrices";
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyMarketPricesInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Companion INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Companion(null);
    public static final int $stable = 8;

    public GetCryptocurrencyMarketPricesQuery(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyMarketPricesInput cryptocurrencyMarketPricesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyMarketPricesInput, "");
        this.input = cryptocurrencyMarketPricesInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyMarketPricesInput getInput() {
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
        com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyMarketPricesQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyMarketPricesQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.cryptocurrency.graphql.selections.GetCryptocurrencyMarketPricesQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$CryptocurrencyMarketPrices;", "cryptocurrencyMarketPrices", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$CryptocurrencyMarketPrices;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$CryptocurrencyMarketPrices;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$CryptocurrencyMarketPrices;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$CryptocurrencyMarketPrices;", "getCryptocurrencyMarketPrices"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices cryptocurrencyMarketPrices;

        public Data(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices cryptocurrencyMarketPrices) {
            this.cryptocurrencyMarketPrices = cryptocurrencyMarketPrices;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices getCryptocurrencyMarketPrices() {
            return this.cryptocurrencyMarketPrices;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices cryptocurrencyMarketPrices = this.cryptocurrencyMarketPrices;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(cryptocurrencyMarketPrices=");
            sb.append(cryptocurrencyMarketPrices);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices cryptocurrencyMarketPrices = this.cryptocurrencyMarketPrices;
            if (cryptocurrencyMarketPrices == null) {
                return 0;
            }
            return cryptocurrencyMarketPrices.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptocurrencyMarketPrices, ((com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Data) other).cryptocurrencyMarketPrices);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Data copy(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices cryptocurrencyMarketPrices) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Data(cryptocurrencyMarketPrices);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices getCryptocurrencyMarketPrices() {
            return this.cryptocurrencyMarketPrices;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Data copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Data data, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices cryptocurrencyMarketPrices, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cryptocurrencyMarketPrices = data.cryptocurrencyMarketPrices;
            }
            return data.copy(cryptocurrencyMarketPrices);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJH\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$CryptocurrencyMarketPrices;", "", "", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$CryptocurrencyMarketCapability;", "cryptocurrencyMarketCapabilities", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceTimeRange;", "priceTimeRange", "priceTimeInterval", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$CryptocurrencyMarketPrice;", "cryptocurrencyMarketPrices", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceTimeRange;Ljava/lang/Object;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceTimeRange;", "component3", "()Ljava/lang/Object;", "component4", "copy", "(Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceTimeRange;Ljava/lang/Object;Ljava/util/List;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$CryptocurrencyMarketPrices;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getCryptocurrencyMarketCapabilities", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceTimeRange;", "getPriceTimeRange", "Ljava/lang/Object;", "getPriceTimeInterval", "getCryptocurrencyMarketPrices"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CryptocurrencyMarketPrices {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketCapability> cryptocurrencyMarketCapabilities;
        private final java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrice> cryptocurrencyMarketPrices;
        private final java.lang.Object priceTimeInterval;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange priceTimeRange;

        public CryptocurrencyMarketPrices(java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketCapability> list, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange cryptocurrencyPriceTimeRange, java.lang.Object obj, java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrice> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyPriceTimeRange, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.cryptocurrencyMarketCapabilities = list;
            this.priceTimeRange = cryptocurrencyPriceTimeRange;
            this.priceTimeInterval = obj;
            this.cryptocurrencyMarketPrices = list2;
        }

        public final java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketCapability> getCryptocurrencyMarketCapabilities() {
            return this.cryptocurrencyMarketCapabilities;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange getPriceTimeRange() {
            return this.priceTimeRange;
        }

        public final java.lang.Object getPriceTimeInterval() {
            return this.priceTimeInterval;
        }

        public final java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrice> getCryptocurrencyMarketPrices() {
            return this.cryptocurrencyMarketPrices;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketCapability> list = this.cryptocurrencyMarketCapabilities;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange cryptocurrencyPriceTimeRange = this.priceTimeRange;
            java.lang.Object obj = this.priceTimeInterval;
            java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrice> list2 = this.cryptocurrencyMarketPrices;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptocurrencyMarketPrices(cryptocurrencyMarketCapabilities=");
            sb.append(list);
            sb.append(", priceTimeRange=");
            sb.append(cryptocurrencyPriceTimeRange);
            sb.append(", priceTimeInterval=");
            sb.append(obj);
            sb.append(", cryptocurrencyMarketPrices=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketCapability> list = this.cryptocurrencyMarketCapabilities;
            int hashCode = list == null ? 0 : list.hashCode();
            int hashCode2 = this.priceTimeRange.hashCode();
            java.lang.Object obj = this.priceTimeInterval;
            return (((((hashCode * 31) + hashCode2) * 31) + (obj != null ? obj.hashCode() : 0)) * 31) + this.cryptocurrencyMarketPrices.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices cryptocurrencyMarketPrices = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cryptocurrencyMarketCapabilities, cryptocurrencyMarketPrices.cryptocurrencyMarketCapabilities) && this.priceTimeRange == cryptocurrencyMarketPrices.priceTimeRange && kotlin.jvm.internal.Intrinsics.areEqual(this.priceTimeInterval, cryptocurrencyMarketPrices.priceTimeInterval) && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptocurrencyMarketPrices, cryptocurrencyMarketPrices.cryptocurrencyMarketPrices);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices copy(java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketCapability> cryptocurrencyMarketCapabilities, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange priceTimeRange, java.lang.Object priceTimeInterval, java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrice> cryptocurrencyMarketPrices) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priceTimeRange, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyMarketPrices, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices(cryptocurrencyMarketCapabilities, priceTimeRange, priceTimeInterval, cryptocurrencyMarketPrices);
        }

        public final java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrice> component4() {
            return this.cryptocurrencyMarketPrices;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getPriceTimeInterval() {
            return this.priceTimeInterval;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange getPriceTimeRange() {
            return this.priceTimeRange;
        }

        public final java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketCapability> component1() {
            return this.cryptocurrencyMarketCapabilities;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices cryptocurrencyMarketPrices, java.util.List list, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange cryptocurrencyPriceTimeRange, java.lang.Object obj, java.util.List list2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                list = cryptocurrencyMarketPrices.cryptocurrencyMarketCapabilities;
            }
            if ((i & 2) != 0) {
                cryptocurrencyPriceTimeRange = cryptocurrencyMarketPrices.priceTimeRange;
            }
            if ((i & 4) != 0) {
                obj = cryptocurrencyMarketPrices.priceTimeInterval;
            }
            if ((i & 8) != 0) {
                list2 = cryptocurrencyMarketPrices.cryptocurrencyMarketPrices;
            }
            return cryptocurrencyMarketPrices.copy(list, cryptocurrencyPriceTimeRange, obj, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$CryptocurrencyMarketCapability;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Trade;", "trade", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Transfer;", "transfer", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Trade;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Transfer;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Trade;", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Transfer;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Trade;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Transfer;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$CryptocurrencyMarketCapability;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "getAssetSymbol", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Trade;", "getTrade", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Transfer;", "getTransfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CryptocurrencyMarketCapability {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade trade;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Transfer transfer;

        public CryptocurrencyMarketCapability(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade trade, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Transfer transfer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyAssetSymbol, "");
            this.assetSymbol = cryptocurrencyAssetSymbol;
            this.trade = trade;
            this.transfer = transfer;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade getTrade() {
            return this.trade;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Transfer getTransfer() {
            return this.transfer;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = this.assetSymbol;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade trade = this.trade;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Transfer transfer = this.transfer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptocurrencyMarketCapability(assetSymbol=");
            sb.append(cryptocurrencyAssetSymbol);
            sb.append(", trade=");
            sb.append(trade);
            sb.append(", transfer=");
            sb.append(transfer);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.assetSymbol.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade trade = this.trade;
            int hashCode2 = trade == null ? 0 : trade.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Transfer transfer = this.transfer;
            return (((hashCode * 31) + hashCode2) * 31) + (transfer != null ? transfer.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketCapability)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketCapability cryptocurrencyMarketCapability = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketCapability) other;
            return this.assetSymbol == cryptocurrencyMarketCapability.assetSymbol && kotlin.jvm.internal.Intrinsics.areEqual(this.trade, cryptocurrencyMarketCapability.trade) && kotlin.jvm.internal.Intrinsics.areEqual(this.transfer, cryptocurrencyMarketCapability.transfer);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketCapability copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade trade, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Transfer transfer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketCapability(assetSymbol, trade, transfer);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Transfer getTransfer() {
            return this.transfer;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade getTrade() {
            return this.trade;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketCapability copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketCapability cryptocurrencyMarketCapability, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade trade, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Transfer transfer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cryptocurrencyAssetSymbol = cryptocurrencyMarketCapability.assetSymbol;
            }
            if ((i & 2) != 0) {
                trade = cryptocurrencyMarketCapability.trade;
            }
            if ((i & 4) != 0) {
                transfer = cryptocurrencyMarketCapability.transfer;
            }
            return cryptocurrencyMarketCapability.copy(cryptocurrencyAssetSymbol, trade, transfer);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Trade;", "", "", "buy", "sell", "swap", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Trade;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getBuy", "getSell", "getSwap"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Trade {
        public static final int $stable = 0;
        private final java.lang.Boolean buy;
        private final java.lang.Boolean sell;
        private final java.lang.Boolean swap;

        public Trade(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3) {
            this.buy = bool;
            this.sell = bool2;
            this.swap = bool3;
        }

        public final java.lang.Boolean getBuy() {
            return this.buy;
        }

        public final java.lang.Boolean getSell() {
            return this.sell;
        }

        public final java.lang.Boolean getSwap() {
            return this.swap;
        }

        public final java.lang.String toString() {
            java.lang.Boolean bool = this.buy;
            java.lang.Boolean bool2 = this.sell;
            java.lang.Boolean bool3 = this.swap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Trade(buy=");
            sb.append(bool);
            sb.append(", sell=");
            sb.append(bool2);
            sb.append(", swap=");
            sb.append(bool3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.buy;
            int hashCode = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.sell;
            int hashCode2 = bool2 == null ? 0 : bool2.hashCode();
            java.lang.Boolean bool3 = this.swap;
            return (((hashCode * 31) + hashCode2) * 31) + (bool3 != null ? bool3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade trade = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.buy, trade.buy) && kotlin.jvm.internal.Intrinsics.areEqual(this.sell, trade.sell) && kotlin.jvm.internal.Intrinsics.areEqual(this.swap, trade.swap);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade copy(java.lang.Boolean buy, java.lang.Boolean sell, java.lang.Boolean swap) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade(buy, sell, swap);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getSwap() {
            return this.swap;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getSell() {
            return this.sell;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getBuy() {
            return this.buy;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade trade, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = trade.buy;
            }
            if ((i & 2) != 0) {
                bool2 = trade.sell;
            }
            if ((i & 4) != 0) {
                bool3 = trade.swap;
            }
            return trade.copy(bool, bool2, bool3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Transfer;", "", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Receive;", "receive", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Send;", "send", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Receive;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Send;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Receive;", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Send;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Receive;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Send;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Transfer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Receive;", "getReceive", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Send;", "getSend"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Transfer {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Receive receive;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Send send;

        public Transfer(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Receive receive, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Send send) {
            this.receive = receive;
            this.send = send;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Receive getReceive() {
            return this.receive;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Send getSend() {
            return this.send;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Receive receive = this.receive;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Send send = this.send;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Transfer(receive=");
            sb.append(receive);
            sb.append(", send=");
            sb.append(send);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Receive receive = this.receive;
            int hashCode = receive == null ? 0 : receive.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Send send = this.send;
            return (hashCode * 31) + (send != null ? send.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Transfer)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Transfer transfer = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Transfer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.receive, transfer.receive) && kotlin.jvm.internal.Intrinsics.areEqual(this.send, transfer.send);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Transfer copy(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Receive receive, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Send send) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Transfer(receive, send);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Send getSend() {
            return this.send;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Receive getReceive() {
            return this.receive;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Transfer copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Transfer transfer, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Receive receive, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Send send, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                receive = transfer.receive;
            }
            if ((i & 2) != 0) {
                send = transfer.send;
            }
            return transfer.copy(receive, send);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Receive;", "", "", "offBlockchain", "onBlockchain", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Receive;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getOffBlockchain", "getOnBlockchain"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Receive {
        public static final int $stable = 0;
        private final java.lang.Boolean offBlockchain;
        private final java.lang.Boolean onBlockchain;

        public Receive(java.lang.Boolean bool, java.lang.Boolean bool2) {
            this.offBlockchain = bool;
            this.onBlockchain = bool2;
        }

        public final java.lang.Boolean getOffBlockchain() {
            return this.offBlockchain;
        }

        public final java.lang.Boolean getOnBlockchain() {
            return this.onBlockchain;
        }

        public final java.lang.String toString() {
            java.lang.Boolean bool = this.offBlockchain;
            java.lang.Boolean bool2 = this.onBlockchain;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Receive(offBlockchain=");
            sb.append(bool);
            sb.append(", onBlockchain=");
            sb.append(bool2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.offBlockchain;
            int hashCode = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.onBlockchain;
            return (hashCode * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Receive)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Receive receive = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Receive) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.offBlockchain, receive.offBlockchain) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBlockchain, receive.onBlockchain);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Receive copy(java.lang.Boolean offBlockchain, java.lang.Boolean onBlockchain) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Receive(offBlockchain, onBlockchain);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getOnBlockchain() {
            return this.onBlockchain;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getOffBlockchain() {
            return this.offBlockchain;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Receive copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Receive receive, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = receive.offBlockchain;
            }
            if ((i & 2) != 0) {
                bool2 = receive.onBlockchain;
            }
            return receive.copy(bool, bool2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Send;", "", "", "offBlockchain", "onBlockchain", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Send;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getOffBlockchain", "getOnBlockchain"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Send {
        public static final int $stable = 0;
        private final java.lang.Boolean offBlockchain;
        private final java.lang.Boolean onBlockchain;

        public Send(java.lang.Boolean bool, java.lang.Boolean bool2) {
            this.offBlockchain = bool;
            this.onBlockchain = bool2;
        }

        public final java.lang.Boolean getOffBlockchain() {
            return this.offBlockchain;
        }

        public final java.lang.Boolean getOnBlockchain() {
            return this.onBlockchain;
        }

        public final java.lang.String toString() {
            java.lang.Boolean bool = this.offBlockchain;
            java.lang.Boolean bool2 = this.onBlockchain;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Send(offBlockchain=");
            sb.append(bool);
            sb.append(", onBlockchain=");
            sb.append(bool2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.offBlockchain;
            int hashCode = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.onBlockchain;
            return (hashCode * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Send)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Send send = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Send) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.offBlockchain, send.offBlockchain) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBlockchain, send.onBlockchain);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Send copy(java.lang.Boolean offBlockchain, java.lang.Boolean onBlockchain) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Send(offBlockchain, onBlockchain);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getOnBlockchain() {
            return this.onBlockchain;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getOffBlockchain() {
            return this.offBlockchain;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Send copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Send send, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = send.offBlockchain;
            }
            if ((i & 2) != 0) {
                bool2 = send.onBlockchain;
            }
            return send.copy(bool, bool2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018Jp\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b3\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b6\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$CryptocurrencyMarketPrice;", "", "", "assetName", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$AssetPrice;", "assetPrice", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "logoUrl", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$PriceMovementAmount;", "priceMovementAmount", "priceMovementPercent", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceMovementIndicator;", "priceMovementIndicator", "pricedAtTime", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$AssetPrice;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/Object;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$PriceMovementAmount;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceMovementIndicator;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$AssetPrice;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "component4", "()Ljava/lang/Object;", "component5", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$PriceMovementAmount;", "component6", "component7", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceMovementIndicator;", "component8", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$AssetPrice;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Ljava/lang/Object;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$PriceMovementAmount;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceMovementIndicator;Ljava/lang/Object;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$CryptocurrencyMarketPrice;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetName", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$AssetPrice;", "getAssetPrice", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "getAssetSymbol", "Ljava/lang/Object;", "getLogoUrl", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$PriceMovementAmount;", "getPriceMovementAmount", "getPriceMovementPercent", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceMovementIndicator;", "getPriceMovementIndicator", "getPricedAtTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CryptocurrencyMarketPrice {
        public static final int $stable = 8;
        private final java.lang.String assetName;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.AssetPrice assetPrice;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;
        private final java.lang.Object logoUrl;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.PriceMovementAmount priceMovementAmount;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceMovementIndicator priceMovementIndicator;
        private final java.lang.Object priceMovementPercent;
        private final java.lang.Object pricedAtTime;

        public CryptocurrencyMarketPrice(java.lang.String str, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.AssetPrice assetPrice, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, java.lang.Object obj, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.PriceMovementAmount priceMovementAmount, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceMovementIndicator cryptocurrencyPriceMovementIndicator, java.lang.Object obj3) {
            this.assetName = str;
            this.assetPrice = assetPrice;
            this.assetSymbol = cryptocurrencyAssetSymbol;
            this.logoUrl = obj;
            this.priceMovementAmount = priceMovementAmount;
            this.priceMovementPercent = obj2;
            this.priceMovementIndicator = cryptocurrencyPriceMovementIndicator;
            this.pricedAtTime = obj3;
        }

        public final java.lang.String getAssetName() {
            return this.assetName;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.AssetPrice getAssetPrice() {
            return this.assetPrice;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        public final java.lang.Object getLogoUrl() {
            return this.logoUrl;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.PriceMovementAmount getPriceMovementAmount() {
            return this.priceMovementAmount;
        }

        public final java.lang.Object getPriceMovementPercent() {
            return this.priceMovementPercent;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceMovementIndicator getPriceMovementIndicator() {
            return this.priceMovementIndicator;
        }

        public final java.lang.Object getPricedAtTime() {
            return this.pricedAtTime;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.assetName;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.AssetPrice assetPrice = this.assetPrice;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = this.assetSymbol;
            java.lang.Object obj = this.logoUrl;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.PriceMovementAmount priceMovementAmount = this.priceMovementAmount;
            java.lang.Object obj2 = this.priceMovementPercent;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceMovementIndicator cryptocurrencyPriceMovementIndicator = this.priceMovementIndicator;
            java.lang.Object obj3 = this.pricedAtTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptocurrencyMarketPrice(assetName=");
            sb.append(str);
            sb.append(", assetPrice=");
            sb.append(assetPrice);
            sb.append(", assetSymbol=");
            sb.append(cryptocurrencyAssetSymbol);
            sb.append(", logoUrl=");
            sb.append(obj);
            sb.append(", priceMovementAmount=");
            sb.append(priceMovementAmount);
            sb.append(", priceMovementPercent=");
            sb.append(obj2);
            sb.append(", priceMovementIndicator=");
            sb.append(cryptocurrencyPriceMovementIndicator);
            sb.append(", pricedAtTime=");
            sb.append(obj3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.assetName;
            int hashCode = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.AssetPrice assetPrice = this.assetPrice;
            int hashCode2 = assetPrice == null ? 0 : assetPrice.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = this.assetSymbol;
            int hashCode3 = cryptocurrencyAssetSymbol == null ? 0 : cryptocurrencyAssetSymbol.hashCode();
            java.lang.Object obj = this.logoUrl;
            int hashCode4 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.PriceMovementAmount priceMovementAmount = this.priceMovementAmount;
            int hashCode5 = priceMovementAmount == null ? 0 : priceMovementAmount.hashCode();
            java.lang.Object obj2 = this.priceMovementPercent;
            int hashCode6 = obj2 == null ? 0 : obj2.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceMovementIndicator cryptocurrencyPriceMovementIndicator = this.priceMovementIndicator;
            int hashCode7 = cryptocurrencyPriceMovementIndicator == null ? 0 : cryptocurrencyPriceMovementIndicator.hashCode();
            java.lang.Object obj3 = this.pricedAtTime;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (obj3 != null ? obj3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrice)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrice cryptocurrencyMarketPrice = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrice) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.assetName, cryptocurrencyMarketPrice.assetName) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetPrice, cryptocurrencyMarketPrice.assetPrice) && this.assetSymbol == cryptocurrencyMarketPrice.assetSymbol && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, cryptocurrencyMarketPrice.logoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.priceMovementAmount, cryptocurrencyMarketPrice.priceMovementAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.priceMovementPercent, cryptocurrencyMarketPrice.priceMovementPercent) && this.priceMovementIndicator == cryptocurrencyMarketPrice.priceMovementIndicator && kotlin.jvm.internal.Intrinsics.areEqual(this.pricedAtTime, cryptocurrencyMarketPrice.pricedAtTime);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrice copy(java.lang.String assetName, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.AssetPrice assetPrice, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol, java.lang.Object logoUrl, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.PriceMovementAmount priceMovementAmount, java.lang.Object priceMovementPercent, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceMovementIndicator priceMovementIndicator, java.lang.Object pricedAtTime) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrice(assetName, assetPrice, assetSymbol, logoUrl, priceMovementAmount, priceMovementPercent, priceMovementIndicator, pricedAtTime);
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Object getPricedAtTime() {
            return this.pricedAtTime;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceMovementIndicator getPriceMovementIndicator() {
            return this.priceMovementIndicator;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Object getPriceMovementPercent() {
            return this.priceMovementPercent;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.PriceMovementAmount getPriceMovementAmount() {
            return this.priceMovementAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getLogoUrl() {
            return this.logoUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.AssetPrice getAssetPrice() {
            return this.assetPrice;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAssetName() {
            return this.assetName;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$AssetPrice;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$AssetPrice;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.AssetPrice)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.AssetPrice assetPrice = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.AssetPrice) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, assetPrice.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, assetPrice.value);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.AssetPrice copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.AssetPrice(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.AssetPrice copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.AssetPrice assetPrice, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = assetPrice.currencyCode;
            }
            if ((i & 2) != 0) {
                str = assetPrice.value;
            }
            return assetPrice.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$PriceMovementAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$PriceMovementAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PriceMovementAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public PriceMovementAmount(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PriceMovementAmount(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.PriceMovementAmount)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.PriceMovementAmount priceMovementAmount = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.PriceMovementAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, priceMovementAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, priceMovementAmount.value);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.PriceMovementAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.PriceMovementAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.PriceMovementAmount copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.PriceMovementAmount priceMovementAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = priceMovementAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = priceMovementAmount.value;
            }
            return priceMovementAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetCryptocurrencyMarketPrices($input: CryptocurrencyMarketPricesInput!) { cryptocurrencyMarketPrices(input: $input) { cryptocurrencyMarketCapabilities { assetSymbol trade { buy sell swap } transfer { receive { offBlockchain onBlockchain } send { offBlockchain onBlockchain } } } priceTimeRange priceTimeInterval cryptocurrencyMarketPrices { assetName assetPrice { currencyCode value } assetSymbol logoUrl priceMovementAmount { currencyCode value } priceMovementPercent priceMovementIndicator pricedAtTime } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyMarketPricesInput cryptocurrencyMarketPricesInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetCryptocurrencyMarketPricesQuery(input=");
        sb.append(cryptocurrencyMarketPricesInput);
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
        return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery) other).input);
    }

    public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyMarketPricesInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyMarketPricesInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery getCryptocurrencyMarketPricesQuery, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyMarketPricesInput cryptocurrencyMarketPricesInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cryptocurrencyMarketPricesInput = getCryptocurrencyMarketPricesQuery.input;
        }
        return getCryptocurrencyMarketPricesQuery.copy(cryptocurrencyMarketPricesInput);
    }
}
