package com.paypal.oslo.feature.businesshome.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/adapter/GetMerchantInsightsQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "MerchantInsights", "TransactionMetrics", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING, "TotalAmount", "SingleActivity", "CounterParty", "Name", "BusinessName", "Payable", "TotalAmount1", "SingleActivity1", "CounterParty1", "Name1", "BusinessName1", "DisputeMetrics"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetMerchantInsightsQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/adapter/GetMerchantInsightsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Data> {
        public static final com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("merchantInsights");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights merchantInsights = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                merchantInsights = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.MerchantInsights.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (merchantInsights != null) {
                return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Data(merchantInsights);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "merchantInsights");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("merchantInsights");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.MerchantInsights.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getMerchantInsights());
        }
    }

    private GetMerchantInsightsQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/adapter/GetMerchantInsightsQuery_ResponseAdapter$MerchantInsights;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$MerchantInsights;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$MerchantInsights;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$MerchantInsights;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MerchantInsights implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights> {
        public static final com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.MerchantInsights INSTANCE = new com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.MerchantInsights();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"transactionMetrics", "disputeMetrics"});
        public static final int $stable = 8;

        private MerchantInsights() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics transactionMetrics = null;
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics disputeMetrics = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    transactionMetrics = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.TransactionMetrics.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    disputeMetrics = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.DisputeMetrics.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                }
            }
            if (transactionMetrics == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "transactionMetrics");
                throw new kotlin.KotlinNothingValueException();
            }
            if (disputeMetrics != null) {
                return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights(transactionMetrics, disputeMetrics);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "disputeMetrics");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("transactionMetrics");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.TransactionMetrics.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getTransactionMetrics());
            writer.name("disputeMetrics");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.DisputeMetrics.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getDisputeMetrics());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/adapter/GetMerchantInsightsQuery_ResponseAdapter$TransactionMetrics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TransactionMetrics;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TransactionMetrics;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TransactionMetrics;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TransactionMetrics implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics> {
        public static final com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.TransactionMetrics INSTANCE = new com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.TransactionMetrics();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"total", "pending", "payable"});
        public static final int $stable = 8;

        private TransactionMetrics() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending pending = null;
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable payable = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    pending = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.Pending.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    payable = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.Payable.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                }
            }
            if (num != null) {
                int intValue = num.intValue();
                if (pending == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "pending");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (payable != null) {
                    return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics(intValue, pending, payable);
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "payable");
                throw new kotlin.KotlinNothingValueException();
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "total");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("total");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getTotal()));
            writer.name("pending");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.Pending.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getPending());
            writer.name("payable");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.Payable.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getPayable());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/adapter/GetMerchantInsightsQuery_ResponseAdapter$Pending;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Pending;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Pending;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Pending;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Pending implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending> {
        public static final com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.Pending INSTANCE = new com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.Pending();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT, "totalAmount", "overdueCount", "singleActivity", "counterParties", "hasMultipleCurrencies"});
        public static final int $stable = 8;

        private Pending() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            java.lang.Integer num2 = null;
            java.lang.Boolean bool = null;
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount totalAmount = null;
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity singleActivity = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    totalAmount = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.TotalAmount.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    num2 = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    singleActivity = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.SingleActivity.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 4) {
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.CounterParty.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 5) {
                        break;
                    }
                    bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (num != null) {
                int intValue = num.intValue();
                if (totalAmount == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "totalAmount");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    if (bool != null) {
                        return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending(intValue, totalAmount, intValue2, singleActivity, list, bool.booleanValue());
                    }
                    com.apollographql.apollo.api.Assertions.missingField(reader, "hasMultipleCurrencies");
                    throw new kotlin.KotlinNothingValueException();
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "overdueCount");
                throw new kotlin.KotlinNothingValueException();
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT);
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getTotalCount()));
            writer.name("totalAmount");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.TotalAmount.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getTotalAmount());
            writer.name("overdueCount");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getOverdueCount()));
            writer.name("singleActivity");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.SingleActivity.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getSingleActivity());
            writer.name("counterParties");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.CounterParty.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getCounterParties());
            writer.name("hasMultipleCurrencies");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getHasMultipleCurrencies()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/adapter/GetMerchantInsightsQuery_ResponseAdapter$TotalAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TotalAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TotalAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TotalAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TotalAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount> {
        public static final com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.TotalAmount INSTANCE = new com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.TotalAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE});
        public static final int $stable = 8;

        private TotalAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
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
                return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount(obj, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/adapter/GetMerchantInsightsQuery_ResponseAdapter$SingleActivity;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$SingleActivity;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$SingleActivity;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$SingleActivity;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SingleActivity implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity> {
        public static final com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.SingleActivity INSTANCE = new com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.SingleActivity();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "type"});
        public static final int $stable = 8;

        private SingleActivity() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.MerchantActivityType merchantActivityType = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    merchantActivityType = com.paypal.oslo.api.graphql.schema.type.adapter.MerchantActivityType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (merchantActivityType != null) {
                return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity(str, merchantActivityType);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "type");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.MerchantActivityType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/adapter/GetMerchantInsightsQuery_ResponseAdapter$CounterParty;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$CounterParty;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$CounterParty;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$CounterParty;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CounterParty implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty> {
        public static final com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.CounterParty INSTANCE = new com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.CounterParty();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"name", "businessName", "profilePictureUrl"});
        public static final int $stable = 8;

        private CounterParty() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name name2 = null;
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName businessName = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    name2 = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.Name.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    businessName = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.BusinessName.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty(name2, businessName, obj);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.Name.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getName());
            writer.name("businessName");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.BusinessName.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getBusinessName());
            writer.name("profilePictureUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getProfilePictureUrl());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/adapter/GetMerchantInsightsQuery_ResponseAdapter$Name;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Name;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Name;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Name;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Name implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name> {
        public static final com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.Name INSTANCE = new com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.Name();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"prefix", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "secondSurname", com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "suffix", "fullName"});
        public static final int $stable = 8;

        private Name() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
        
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name(r2, r3, r4, r5, r6, r7, r8);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str5 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str6 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str7 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("prefix");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPrefix());
            writer.name(com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getGivenName());
            writer.name("surname");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getSurname());
            writer.name("secondSurname");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getSecondSurname());
            writer.name(com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getMiddleName());
            writer.name("suffix");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getSuffix());
            writer.name("fullName");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getFullName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/adapter/GetMerchantInsightsQuery_ResponseAdapter$BusinessName;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$BusinessName;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$BusinessName;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$BusinessName;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BusinessName implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName> {
        public static final com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.BusinessName INSTANCE = new com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.BusinessName();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"businessName", "orthography"});
        public static final int $stable = 8;

        private BusinessName() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.Orthography orthography = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    orthography = (com.paypal.oslo.api.graphql.schema.type.Orthography) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.Orthography_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName(str, orthography);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "businessName");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("businessName");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getBusinessName());
            writer.name("orthography");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.Orthography_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getOrthography());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/adapter/GetMerchantInsightsQuery_ResponseAdapter$Payable;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Payable;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Payable;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Payable;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Payable implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable> {
        public static final com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.Payable INSTANCE = new com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.Payable();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT, "overdueCount", "hasMultipleCurrencies", "totalAmount", "singleActivity", "counterParties"});
        public static final int $stable = 8;

        private Payable() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            java.lang.Integer num2 = null;
            java.lang.Boolean bool = null;
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1 totalAmount1 = null;
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1 singleActivity1 = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    num2 = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    totalAmount1 = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.TotalAmount1.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else if (selectName == 4) {
                    singleActivity1 = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.SingleActivity1.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 5) {
                        break;
                    }
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.CounterParty1.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                }
            }
            if (num != null) {
                int intValue = num.intValue();
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        if (totalAmount1 != null) {
                            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable(intValue, intValue2, booleanValue, totalAmount1, singleActivity1, list);
                        }
                        com.apollographql.apollo.api.Assertions.missingField(reader, "totalAmount");
                        throw new kotlin.KotlinNothingValueException();
                    }
                    com.apollographql.apollo.api.Assertions.missingField(reader, "hasMultipleCurrencies");
                    throw new kotlin.KotlinNothingValueException();
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "overdueCount");
                throw new kotlin.KotlinNothingValueException();
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT);
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getTotalCount()));
            writer.name("overdueCount");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getOverdueCount()));
            writer.name("hasMultipleCurrencies");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getHasMultipleCurrencies()));
            writer.name("totalAmount");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.TotalAmount1.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getTotalAmount());
            writer.name("singleActivity");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.SingleActivity1.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getSingleActivity());
            writer.name("counterParties");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.CounterParty1.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getCounterParties());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/adapter/GetMerchantInsightsQuery_ResponseAdapter$TotalAmount1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TotalAmount1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TotalAmount1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TotalAmount1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TotalAmount1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1> {
        public static final com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.TotalAmount1 INSTANCE = new com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.TotalAmount1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE});
        public static final int $stable = 8;

        private TotalAmount1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
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
                return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1(obj, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/adapter/GetMerchantInsightsQuery_ResponseAdapter$SingleActivity1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$SingleActivity1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$SingleActivity1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$SingleActivity1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SingleActivity1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1> {
        public static final com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.SingleActivity1 INSTANCE = new com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.SingleActivity1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "type"});
        public static final int $stable = 8;

        private SingleActivity1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.MerchantActivityType merchantActivityType = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    merchantActivityType = com.paypal.oslo.api.graphql.schema.type.adapter.MerchantActivityType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (merchantActivityType != null) {
                return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1(str, merchantActivityType);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "type");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.MerchantActivityType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/adapter/GetMerchantInsightsQuery_ResponseAdapter$CounterParty1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$CounterParty1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$CounterParty1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$CounterParty1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CounterParty1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1> {
        public static final com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.CounterParty1 INSTANCE = new com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.CounterParty1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"name", "businessName", "profilePictureUrl"});
        public static final int $stable = 8;

        private CounterParty1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1 name1 = null;
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1 businessName1 = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    name1 = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.Name1.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    businessName1 = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.BusinessName1.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1(name1, businessName1, obj);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.Name1.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getName());
            writer.name("businessName");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.BusinessName1.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getBusinessName());
            writer.name("profilePictureUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getProfilePictureUrl());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/adapter/GetMerchantInsightsQuery_ResponseAdapter$Name1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Name1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Name1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Name1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Name1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1> {
        public static final com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.Name1 INSTANCE = new com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.Name1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"prefix", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "secondSurname", com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "suffix", "fullName"});
        public static final int $stable = 8;

        private Name1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
        
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1(r2, r3, r4, r5, r6, r7, r8);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str5 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str6 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str7 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("prefix");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPrefix());
            writer.name(com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getGivenName());
            writer.name("surname");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getSurname());
            writer.name("secondSurname");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getSecondSurname());
            writer.name(com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getMiddleName());
            writer.name("suffix");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getSuffix());
            writer.name("fullName");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getFullName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/adapter/GetMerchantInsightsQuery_ResponseAdapter$BusinessName1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$BusinessName1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$BusinessName1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$BusinessName1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BusinessName1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1> {
        public static final com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.BusinessName1 INSTANCE = new com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.BusinessName1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"businessName", "orthography"});
        public static final int $stable = 8;

        private BusinessName1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.Orthography orthography = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    orthography = (com.paypal.oslo.api.graphql.schema.type.Orthography) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.Orthography_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1(str, orthography);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "businessName");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("businessName");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getBusinessName());
            writer.name("orthography");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.Orthography_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getOrthography());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/adapter/GetMerchantInsightsQuery_ResponseAdapter$DisputeMetrics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$DisputeMetrics;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$DisputeMetrics;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$DisputeMetrics;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DisputeMetrics implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics> {
        public static final com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.DisputeMetrics INSTANCE = new com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.DisputeMetrics();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"total", "priorityTotal"});
        public static final int $stable = 8;

        private DisputeMetrics() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            java.lang.Integer num2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    num2 = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (num != null) {
                int intValue = num.intValue();
                if (num2 != null) {
                    return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics(intValue, num2.intValue());
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "priorityTotal");
                throw new kotlin.KotlinNothingValueException();
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "total");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("total");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getTotal()));
            writer.name("priorityTotal");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriorityTotal()));
        }
    }
}
