package com.paypal.oslo.feature.bankingbundle.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/graphql/adapter/GetBalanceBundleEligibilityQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "BalanceBundleEligibility", "Balances", "TotalAvailableAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetBalanceBundleEligibilityQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bankingbundle.graphql.adapter.GetBalanceBundleEligibilityQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.bankingbundle.graphql.adapter.GetBalanceBundleEligibilityQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/graphql/adapter/GetBalanceBundleEligibilityQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Data> {
        public static final com.paypal.oslo.feature.bankingbundle.graphql.adapter.GetBalanceBundleEligibilityQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.bankingbundle.graphql.adapter.GetBalanceBundleEligibilityQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"balanceBundleEligibility", "balances"});
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Balances balances = null;
            com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility balanceBundleEligibility = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    balanceBundleEligibility = (com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bankingbundle.graphql.adapter.GetBalanceBundleEligibilityQuery_ResponseAdapter.BalanceBundleEligibility.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    balances = (com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Balances) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bankingbundle.graphql.adapter.GetBalanceBundleEligibilityQuery_ResponseAdapter.Balances.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                }
            }
            if (balances != null) {
                return new com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Data(balanceBundleEligibility, balances);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "balances");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("balanceBundleEligibility");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bankingbundle.graphql.adapter.GetBalanceBundleEligibilityQuery_ResponseAdapter.BalanceBundleEligibility.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getBalanceBundleEligibility());
            writer.name("balances");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bankingbundle.graphql.adapter.GetBalanceBundleEligibilityQuery_ResponseAdapter.Balances.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getBalances());
        }
    }

    private GetBalanceBundleEligibilityQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/graphql/adapter/GetBalanceBundleEligibilityQuery_ResponseAdapter$BalanceBundleEligibility;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$BalanceBundleEligibility;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$BalanceBundleEligibility;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$BalanceBundleEligibility;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BalanceBundleEligibility implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility> {
        public static final com.paypal.oslo.feature.bankingbundle.graphql.adapter.GetBalanceBundleEligibilityQuery_ResponseAdapter.BalanceBundleEligibility INSTANCE = new com.paypal.oslo.feature.bankingbundle.graphql.adapter.GetBalanceBundleEligibilityQuery_ResponseAdapter.BalanceBundleEligibility();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"status", "reason", com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ModuleName.Products});
        public static final int $stable = 8;

        private BalanceBundleEligibility() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityStatus balanceBundleEligibilityStatus = null;
            com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    balanceBundleEligibilityStatus = com.paypal.oslo.api.graphql.schema.type.adapter.BalanceBundleEligibilityStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    balanceBundleEligibilityReason = (com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BalanceBundleEligibilityReason_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.BalanceBundleProductName_ResponseAdapter.INSTANCE)).fromJson(reader, customScalarAdapters);
                }
            }
            if (balanceBundleEligibilityStatus != null) {
                return new com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility(balanceBundleEligibilityStatus, balanceBundleEligibilityReason, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "status");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.BalanceBundleEligibilityStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("reason");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BalanceBundleEligibilityReason_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getReason());
            writer.name(com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ModuleName.Products);
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.BalanceBundleProductName_ResponseAdapter.INSTANCE)).toJson(writer, customScalarAdapters, value.getProducts());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/graphql/adapter/GetBalanceBundleEligibilityQuery_ResponseAdapter$Balances;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$Balances;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$Balances;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$Balances;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Balances implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Balances> {
        public static final com.paypal.oslo.feature.bankingbundle.graphql.adapter.GetBalanceBundleEligibilityQuery_ResponseAdapter.Balances INSTANCE = new com.paypal.oslo.feature.bankingbundle.graphql.adapter.GetBalanceBundleEligibilityQuery_ResponseAdapter.Balances();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("totalAvailableAmount");
        public static final int $stable = 8;

        private Balances() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Balances fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount totalAvailableAmount = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                totalAvailableAmount = (com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bankingbundle.graphql.adapter.GetBalanceBundleEligibilityQuery_ResponseAdapter.TotalAvailableAmount.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (totalAvailableAmount != null) {
                return new com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Balances(totalAvailableAmount);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "totalAvailableAmount");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Balances value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("totalAvailableAmount");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bankingbundle.graphql.adapter.GetBalanceBundleEligibilityQuery_ResponseAdapter.TotalAvailableAmount.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getTotalAvailableAmount());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/graphql/adapter/GetBalanceBundleEligibilityQuery_ResponseAdapter$TotalAvailableAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$TotalAvailableAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$TotalAvailableAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$TotalAvailableAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TotalAvailableAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount> {
        public static final com.paypal.oslo.feature.bankingbundle.graphql.adapter.GetBalanceBundleEligibilityQuery_ResponseAdapter.TotalAvailableAmount INSTANCE = new com.paypal.oslo.feature.bankingbundle.graphql.adapter.GetBalanceBundleEligibilityQuery_ResponseAdapter.TotalAvailableAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE});
        public static final int $stable = 8;

        private TotalAvailableAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
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
                return new com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount(obj, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
        }
    }
}
