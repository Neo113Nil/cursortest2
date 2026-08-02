package com.paypal.oslo.feature.cryptocurrency.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001:\u0018\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "CryptocurrencyHoldings", "TotalPortfolioValue", "TotalHolding", "GainOrLoss", "GainOrLossFiatAmount", "Holding", "RewardHolding", "RewardApy", "Payout", "LifetimePayout", "AssetQuantity", "Accrued", "AssetQuantity1", "FiatAmount", "AssetExchangeRate", "AssetQuantity2", "FiatAmount1", "FiatAmount2", "GainOrLoss1", "GainOrLossFiatAmount1", "DailyGainOrLoss", "DailyGainOrLossFiatAmount", "AssetQuantityTruncated"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetCryptocurrencyHoldingsQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Data> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("cryptocurrencyHoldings");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings cryptocurrencyHoldings = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                cryptocurrencyHoldings = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.CryptocurrencyHoldings.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Data(cryptocurrencyHoldings);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("cryptocurrencyHoldings");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.CryptocurrencyHoldings.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getCryptocurrencyHoldings());
        }
    }

    private GetCryptocurrencyHoldingsQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$CryptocurrencyHoldings;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$CryptocurrencyHoldings;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$CryptocurrencyHoldings;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$CryptocurrencyHoldings;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CryptocurrencyHoldings implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.CryptocurrencyHoldings INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.CryptocurrencyHoldings();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"totalPortfolioValue", "holdings"});
        public static final int $stable = 8;

        private CryptocurrencyHoldings() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue totalPortfolioValue = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    totalPortfolioValue = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.TotalPortfolioValue.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.Holding.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings(totalPortfolioValue, list);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("totalPortfolioValue");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.TotalPortfolioValue.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getTotalPortfolioValue());
            writer.name("holdings");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.Holding.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getHoldings());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$TotalPortfolioValue;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$TotalPortfolioValue;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$TotalPortfolioValue;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$TotalPortfolioValue;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TotalPortfolioValue implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.TotalPortfolioValue INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.TotalPortfolioValue();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"totalHolding", "gainOrLoss"});
        public static final int $stable = 8;

        private TotalPortfolioValue() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding totalHolding = null;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss gainOrLoss = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    totalHolding = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.TotalHolding.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    gainOrLoss = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.GainOrLoss.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue(totalHolding, gainOrLoss);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("totalHolding");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.TotalHolding.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getTotalHolding());
            writer.name("gainOrLoss");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.GainOrLoss.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getGainOrLoss());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$TotalHolding;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$TotalHolding;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$TotalHolding;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$TotalHolding;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TotalHolding implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.TotalHolding INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.TotalHolding();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE});
        public static final int $stable = 8;

        private TotalHolding() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding(obj, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$GainOrLoss;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLoss;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLoss;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLoss;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class GainOrLoss implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.GainOrLoss INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.GainOrLoss();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"gainOrLossFiatAmount", "gainOrLossPercent", "gainOrLossStatus"});
        public static final int $stable = 8;

        private GainOrLoss() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount gainOrLossFiatAmount = null;
            java.lang.Object obj = null;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    gainOrLossFiatAmount = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.GainOrLossFiatAmount.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    cryptocurrencyGainOrLossStatus = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyGainOrLossStatus_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss(gainOrLossFiatAmount, obj, cryptocurrencyGainOrLossStatus);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("gainOrLossFiatAmount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.GainOrLossFiatAmount.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getGainOrLossFiatAmount());
            writer.name("gainOrLossPercent");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getGainOrLossPercent());
            writer.name("gainOrLossStatus");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyGainOrLossStatus_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getGainOrLossStatus());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$GainOrLossFiatAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLossFiatAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLossFiatAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLossFiatAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class GainOrLossFiatAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.GainOrLossFiatAmount INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.GainOrLossFiatAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE});
        public static final int $stable = 8;

        private GainOrLossFiatAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount(obj, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$Holding;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Holding;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Holding;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Holding;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Holding implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Holding> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.Holding INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.Holding();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"rewardHolding", "assetName", "assetExchangeRate", "logoUrl", "fiatAmount", "gainOrLoss", "dailyGainOrLoss", "assetQuantityTruncated"});
        public static final int $stable = 8;

        private Holding() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
        
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Holding(r2, r3, r4, r5, r6, r7, r8, r9);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Holding fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardHolding rewardHolding = null;
            java.lang.String str = null;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate assetExchangeRate = null;
            java.lang.Object obj = null;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2 fiatAmount2 = null;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1 gainOrLoss1 = null;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss dailyGainOrLoss = null;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated assetQuantityTruncated = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        rewardHolding = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardHolding) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.RewardHolding.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        assetExchangeRate = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.AssetExchangeRate.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        fiatAmount2 = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.FiatAmount2.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        gainOrLoss1 = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.GainOrLoss1.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        dailyGainOrLoss = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.DailyGainOrLoss.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        assetQuantityTruncated = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.AssetQuantityTruncated.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Holding value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("rewardHolding");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.RewardHolding.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getRewardHolding());
            writer.name("assetName");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAssetName());
            writer.name("assetExchangeRate");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.AssetExchangeRate.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getAssetExchangeRate());
            writer.name("logoUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getLogoUrl());
            writer.name("fiatAmount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.FiatAmount2.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getFiatAmount());
            writer.name("gainOrLoss");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.GainOrLoss1.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getGainOrLoss());
            writer.name("dailyGainOrLoss");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.DailyGainOrLoss.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getDailyGainOrLoss());
            writer.name("assetQuantityTruncated");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.AssetQuantityTruncated.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getAssetQuantityTruncated());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$RewardHolding;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$RewardHolding;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$RewardHolding;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$RewardHolding;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RewardHolding implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardHolding> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.RewardHolding INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.RewardHolding();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("rewardApy");
        public static final int $stable = 8;

        private RewardHolding() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardHolding fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy rewardApy = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                rewardApy = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.RewardApy.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardHolding(rewardApy);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardHolding value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("rewardApy");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.RewardApy.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getRewardApy());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$RewardApy;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$RewardApy;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$RewardApy;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$RewardApy;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RewardApy implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.RewardApy INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.RewardApy();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"rate", "payout", "lifetimePayout", "accrued"});
        public static final int $stable = 8;

        private RewardApy() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout payout = null;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout lifetimePayout = null;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued accrued = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    payout = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.Payout.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    lifetimePayout = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.LifetimePayout.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    accrued = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.Accrued.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy(str, payout, lifetimePayout, accrued);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("rate");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getRate());
            writer.name("payout");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.Payout.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getPayout());
            writer.name("lifetimePayout");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.LifetimePayout.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getLifetimePayout());
            writer.name("accrued");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.Accrued.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getAccrued());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$Payout;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Payout;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Payout;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Payout;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Payout implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.Payout INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.Payout();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"lastPayoutReason", "lastPayoutStatus"});
        public static final int $stable = 8;

        private Payout() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPayoutStatus cryptocurrencyPayoutStatus = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    cryptocurrencyPayoutStatus = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPayoutStatus) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyPayoutStatus_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout(str, cryptocurrencyPayoutStatus);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("lastPayoutReason");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getLastPayoutReason());
            writer.name("lastPayoutStatus");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyPayoutStatus_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getLastPayoutStatus());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$LifetimePayout;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$LifetimePayout;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$LifetimePayout;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$LifetimePayout;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LifetimePayout implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.LifetimePayout INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.LifetimePayout();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("assetQuantity");
        public static final int $stable = 8;

        private LifetimePayout() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity assetQuantity = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                assetQuantity = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.AssetQuantity.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout(assetQuantity);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("assetQuantity");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.AssetQuantity.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getAssetQuantity());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$AssetQuantity;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AssetQuantity implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.AssetQuantity INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.AssetQuantity();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "quantity"});
        public static final int $stable = 8;

        private AssetQuantity() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    cryptocurrencyAssetSymbol = com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyAssetSymbol_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (cryptocurrencyAssetSymbol == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL);
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity(cryptocurrencyAssetSymbol, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "quantity");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL);
            com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyAssetSymbol_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getAssetSymbol());
            writer.name("quantity");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getQuantity());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$Accrued;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Accrued;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Accrued;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$Accrued;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Accrued implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.Accrued INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.Accrued();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"assetQuantity", "fiatAmount"});
        public static final int $stable = 8;

        private Accrued() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1 assetQuantity1 = null;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount fiatAmount = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    assetQuantity1 = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.AssetQuantity1.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    fiatAmount = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.FiatAmount.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued(assetQuantity1, fiatAmount);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("assetQuantity");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.AssetQuantity1.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getAssetQuantity());
            writer.name("fiatAmount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.FiatAmount.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getFiatAmount());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$AssetQuantity1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AssetQuantity1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.AssetQuantity1 INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.AssetQuantity1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "quantity"});
        public static final int $stable = 8;

        private AssetQuantity1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    cryptocurrencyAssetSymbol = com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyAssetSymbol_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (cryptocurrencyAssetSymbol == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL);
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1(cryptocurrencyAssetSymbol, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "quantity");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL);
            com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyAssetSymbol_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getAssetSymbol());
            writer.name("quantity");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getQuantity());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$FiatAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FiatAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.FiatAmount INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.FiatAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode"});
        public static final int $stable = 8;

        private FiatAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount(str, obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$AssetExchangeRate;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetExchangeRate;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetExchangeRate;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetExchangeRate;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AssetExchangeRate implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.AssetExchangeRate INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.AssetExchangeRate();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"assetQuantity", "fiatAmount"});
        public static final int $stable = 8;

        private AssetExchangeRate() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity2 assetQuantity2 = null;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1 fiatAmount1 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    assetQuantity2 = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity2) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.AssetQuantity2.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    fiatAmount1 = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.FiatAmount1.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                }
            }
            if (assetQuantity2 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "assetQuantity");
                throw new kotlin.KotlinNothingValueException();
            }
            if (fiatAmount1 != null) {
                return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate(assetQuantity2, fiatAmount1);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "fiatAmount");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("assetQuantity");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.AssetQuantity2.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getAssetQuantity());
            writer.name("fiatAmount");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.FiatAmount1.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getFiatAmount());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$AssetQuantity2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity2;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity2;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantity2;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AssetQuantity2 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity2> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.AssetQuantity2 INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.AssetQuantity2();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "quantity"});
        public static final int $stable = 8;

        private AssetQuantity2() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity2 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    cryptocurrencyAssetSymbol = com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyAssetSymbol_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (cryptocurrencyAssetSymbol == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL);
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity2(cryptocurrencyAssetSymbol, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "quantity");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity2 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL);
            com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyAssetSymbol_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getAssetSymbol());
            writer.name("quantity");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getQuantity());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$FiatAmount1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FiatAmount1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.FiatAmount1 INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.FiatAmount1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode"});
        public static final int $stable = 8;

        private FiatAmount1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1(str, obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$FiatAmount2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount2;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount2;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$FiatAmount2;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FiatAmount2 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.FiatAmount2 INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.FiatAmount2();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE});
        public static final int $stable = 8;

        private FiatAmount2() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2(obj, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$GainOrLoss1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLoss1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLoss1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLoss1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class GainOrLoss1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.GainOrLoss1 INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.GainOrLoss1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"gainOrLossPercent", "gainOrLossStatus", "gainOrLossFiatAmount"});
        public static final int $stable = 8;

        private GainOrLoss1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus = null;
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1 gainOrLossFiatAmount1 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    cryptocurrencyGainOrLossStatus = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyGainOrLossStatus_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    gainOrLossFiatAmount1 = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.GainOrLossFiatAmount1.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1(obj, cryptocurrencyGainOrLossStatus, gainOrLossFiatAmount1);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("gainOrLossPercent");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getGainOrLossPercent());
            writer.name("gainOrLossStatus");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyGainOrLossStatus_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getGainOrLossStatus());
            writer.name("gainOrLossFiatAmount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.GainOrLossFiatAmount1.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getGainOrLossFiatAmount());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$GainOrLossFiatAmount1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLossFiatAmount1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLossFiatAmount1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$GainOrLossFiatAmount1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class GainOrLossFiatAmount1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.GainOrLossFiatAmount1 INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.GainOrLossFiatAmount1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE});
        public static final int $stable = 8;

        private GainOrLossFiatAmount1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1(obj, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$DailyGainOrLoss;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$DailyGainOrLoss;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$DailyGainOrLoss;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$DailyGainOrLoss;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DailyGainOrLoss implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.DailyGainOrLoss INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.DailyGainOrLoss();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"dailyGainOrLossFiatAmount", "dailyGainOrLossFiatPercent", "dailyGainOrLossStatus"});
        public static final int $stable = 8;

        private DailyGainOrLoss() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount dailyGainOrLossFiatAmount = null;
            java.lang.Object obj = null;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    dailyGainOrLossFiatAmount = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.DailyGainOrLossFiatAmount.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    cryptocurrencyGainOrLossStatus = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyGainOrLossStatus_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss(dailyGainOrLossFiatAmount, obj, cryptocurrencyGainOrLossStatus);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("dailyGainOrLossFiatAmount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.DailyGainOrLossFiatAmount.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getDailyGainOrLossFiatAmount());
            writer.name("dailyGainOrLossFiatPercent");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getDailyGainOrLossFiatPercent());
            writer.name("dailyGainOrLossStatus");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyGainOrLossStatus_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getDailyGainOrLossStatus());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$DailyGainOrLossFiatAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$DailyGainOrLossFiatAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$DailyGainOrLossFiatAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$DailyGainOrLossFiatAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DailyGainOrLossFiatAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.DailyGainOrLossFiatAmount INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.DailyGainOrLossFiatAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode"});
        public static final int $stable = 8;

        private DailyGainOrLossFiatAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount(str, obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLossFiatAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GetCryptocurrencyHoldingsQuery_ResponseAdapter$AssetQuantityTruncated;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantityTruncated;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantityTruncated;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$AssetQuantityTruncated;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AssetQuantityTruncated implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.AssetQuantityTruncated INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyHoldingsQuery_ResponseAdapter.AssetQuantityTruncated();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "quantity"});
        public static final int $stable = 8;

        private AssetQuantityTruncated() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    cryptocurrencyAssetSymbol = com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyAssetSymbol_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (cryptocurrencyAssetSymbol == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL);
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated(cryptocurrencyAssetSymbol, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "quantity");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL);
            com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyAssetSymbol_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getAssetSymbol());
            writer.name("quantity");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getQuantity());
        }
    }
}
