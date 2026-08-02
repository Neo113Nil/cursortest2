package com.paypal.oslo.feature.wallet.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/GetOpenBankingAggregatorQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "OpenBankingAggregator"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class GetOpenBankingAggregatorQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingAggregatorQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingAggregatorQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/GetOpenBankingAggregatorQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.Data> {
        public static final com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingAggregatorQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingAggregatorQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("openBankingAggregator");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator openBankingAggregator = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                openBankingAggregator = (com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingAggregatorQuery_ResponseAdapter.OpenBankingAggregator.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.Data(openBankingAggregator);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("openBankingAggregator");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingAggregatorQuery_ResponseAdapter.OpenBankingAggregator.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getOpenBankingAggregator());
        }
    }

    private GetOpenBankingAggregatorQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/GetOpenBankingAggregatorQuery_ResponseAdapter$OpenBankingAggregator;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery$OpenBankingAggregator;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery$OpenBankingAggregator;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery$OpenBankingAggregator;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OpenBankingAggregator implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator> {
        public static final com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingAggregatorQuery_ResponseAdapter.OpenBankingAggregator INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingAggregatorQuery_ResponseAdapter.OpenBankingAggregator();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"aggregatorName", "operationMode"});
        public static final int $stable = 8;

        private OpenBankingAggregator() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.BankAggregatorName bankAggregatorName = null;
            com.paypal.oslo.api.graphql.schema.type.BankOperationMode bankOperationMode = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    bankAggregatorName = com.paypal.oslo.api.graphql.schema.type.adapter.BankAggregatorName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    bankOperationMode = com.paypal.oslo.api.graphql.schema.type.adapter.BankOperationMode_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (bankAggregatorName == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "aggregatorName");
                throw new kotlin.KotlinNothingValueException();
            }
            if (bankOperationMode != null) {
                return new com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator(bankAggregatorName, bankOperationMode);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "operationMode");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("aggregatorName");
            com.paypal.oslo.api.graphql.schema.type.adapter.BankAggregatorName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getAggregatorName());
            writer.name("operationMode");
            com.paypal.oslo.api.graphql.schema.type.adapter.BankOperationMode_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getOperationMode());
        }
    }
}
