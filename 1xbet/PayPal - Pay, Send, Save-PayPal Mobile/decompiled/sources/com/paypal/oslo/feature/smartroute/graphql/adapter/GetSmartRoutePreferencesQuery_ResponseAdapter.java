package com.paypal.oslo.feature.smartroute.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/GetSmartRoutePreferencesQuery_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.OPERATION_NAME, "Distribution", "Target", "Allocation", "OnSmartRoutePercentage", "CryptocurrencyPreferences", "AssetPreference", "SavingsAccountFeatures", "BalanceAutoReload", "OnBalanceAutoReloadThreshold", "ReloadAmount", "ThresholdAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetSmartRoutePreferencesQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/GetSmartRoutePreferencesQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Data> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"smartRoutePreferences", "cryptocurrencyPreferences", "savingsAccountFeatures", "balanceAutoReload"});
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.SavingsAccountFeatures savingsAccountFeatures = null;
            com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences = null;
            com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.CryptocurrencyPreferences cryptocurrencyPreferences = null;
            com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.BalanceAutoReload balanceAutoReload = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    smartRoutePreferences = (com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.SmartRoutePreferences) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.SmartRoutePreferences.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    cryptocurrencyPreferences = (com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.CryptocurrencyPreferences) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.CryptocurrencyPreferences.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    savingsAccountFeatures = (com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.SavingsAccountFeatures) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.SavingsAccountFeatures.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    balanceAutoReload = (com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.BalanceAutoReload) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.BalanceAutoReload.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (savingsAccountFeatures != null) {
                return new com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Data(smartRoutePreferences, cryptocurrencyPreferences, savingsAccountFeatures, balanceAutoReload);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "savingsAccountFeatures");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("smartRoutePreferences");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.SmartRoutePreferences.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getSmartRoutePreferences());
            writer.name("cryptocurrencyPreferences");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.CryptocurrencyPreferences.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getCryptocurrencyPreferences());
            writer.name("savingsAccountFeatures");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.SavingsAccountFeatures.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getSavingsAccountFeatures());
            writer.name("balanceAutoReload");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.BalanceAutoReload.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getBalanceAutoReload());
        }
    }

    private GetSmartRoutePreferencesQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/GetSmartRoutePreferencesQuery_ResponseAdapter$SmartRoutePreferences;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$SmartRoutePreferences;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$SmartRoutePreferences;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$SmartRoutePreferences;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SmartRoutePreferences implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.SmartRoutePreferences> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.SmartRoutePreferences INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.SmartRoutePreferences();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"distribution", "status", "version"});
        public static final int $stable = 8;

        private SmartRoutePreferences() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.SmartRoutePreferences fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Distribution distribution = null;
            com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus smartRouteStatus = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    distribution = (com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Distribution) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.Distribution.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    smartRouteStatus = com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (distribution == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "distribution");
                throw new kotlin.KotlinNothingValueException();
            }
            if (smartRouteStatus == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "status");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.SmartRoutePreferences(distribution, smartRouteStatus, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "version");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.SmartRoutePreferences value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("distribution");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.Distribution.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getDistribution());
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("version");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getVersion());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/GetSmartRoutePreferencesQuery_ResponseAdapter$Distribution;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$Distribution;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$Distribution;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$Distribution;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Distribution implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Distribution> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.Distribution INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.Distribution();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"method", "source", "targets"});
        public static final int $stable = 8;

        private Distribution() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Distribution fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod smartRouteDistributionMethod = null;
            com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource smartRouteFundingSource = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    smartRouteDistributionMethod = com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteDistributionMethod_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    smartRouteFundingSource = com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteFundingSource_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.Target.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (smartRouteDistributionMethod == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "method");
                throw new kotlin.KotlinNothingValueException();
            }
            if (smartRouteFundingSource == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "source");
                throw new kotlin.KotlinNothingValueException();
            }
            if (list != null) {
                return new com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Distribution(smartRouteDistributionMethod, smartRouteFundingSource, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "targets");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Distribution value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("method");
            com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteDistributionMethod_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getMethod());
            writer.name("source");
            com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteFundingSource_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getSource());
            writer.name("targets");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.Target.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getTargets());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/GetSmartRoutePreferencesQuery_ResponseAdapter$Target;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$Target;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$Target;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$Target;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Target implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Target> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.Target INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.Target();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"accountType", "allocation", "eligibilityStatus"});
        public static final int $stable = 8;

        private Target() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Target fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType smartRouteAccountType = null;
            com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Allocation allocation = null;
            com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus smartRouteTargetEligibilityStatus = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    smartRouteAccountType = com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteAccountType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    allocation = (com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Allocation) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.Allocation.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    smartRouteTargetEligibilityStatus = com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteTargetEligibilityStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (smartRouteAccountType == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "accountType");
                throw new kotlin.KotlinNothingValueException();
            }
            if (allocation == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "allocation");
                throw new kotlin.KotlinNothingValueException();
            }
            if (smartRouteTargetEligibilityStatus != null) {
                return new com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Target(smartRouteAccountType, allocation, smartRouteTargetEligibilityStatus);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "eligibilityStatus");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Target value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("accountType");
            com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteAccountType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getAccountType());
            writer.name("allocation");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.Allocation.INSTANCE, true).toJson(writer, customScalarAdapters, value.getAllocation());
            writer.name("eligibilityStatus");
            com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteTargetEligibilityStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getEligibilityStatus());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/GetSmartRoutePreferencesQuery_ResponseAdapter$Allocation;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$Allocation;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$Allocation;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$Allocation;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Allocation implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Allocation> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.Allocation INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.Allocation();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Allocation() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Allocation fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.OnSmartRoutePercentage onSmartRoutePercentage = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("SmartRoutePercentage"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onSmartRoutePercentage = com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.OnSmartRoutePercentage.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Allocation(str, onSmartRoutePercentage);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Allocation value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnSmartRoutePercentage() != null) {
                com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.OnSmartRoutePercentage.INSTANCE.toJson(writer, customScalarAdapters, value.getOnSmartRoutePercentage());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/GetSmartRoutePreferencesQuery_ResponseAdapter$OnSmartRoutePercentage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$OnSmartRoutePercentage;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$OnSmartRoutePercentage;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$OnSmartRoutePercentage;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnSmartRoutePercentage implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.OnSmartRoutePercentage> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.OnSmartRoutePercentage INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.OnSmartRoutePercentage();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
        public static final int $stable = 8;

        private OnSmartRoutePercentage() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.OnSmartRoutePercentage fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.OnSmartRoutePercentage(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.OnSmartRoutePercentage value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getValue()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/GetSmartRoutePreferencesQuery_ResponseAdapter$CryptocurrencyPreferences;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$CryptocurrencyPreferences;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$CryptocurrencyPreferences;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$CryptocurrencyPreferences;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CryptocurrencyPreferences implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.CryptocurrencyPreferences> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.CryptocurrencyPreferences INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.CryptocurrencyPreferences();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("assetPreference");
        public static final int $stable = 8;

        private CryptocurrencyPreferences() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.CryptocurrencyPreferences fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.AssetPreference assetPreference = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                assetPreference = (com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.AssetPreference) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.AssetPreference.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.CryptocurrencyPreferences(assetPreference);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.CryptocurrencyPreferences value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("assetPreference");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.AssetPreference.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getAssetPreference());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/GetSmartRoutePreferencesQuery_ResponseAdapter$AssetPreference;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$AssetPreference;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$AssetPreference;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$AssetPreference;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AssetPreference implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.AssetPreference> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.AssetPreference INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.AssetPreference();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"rate", "status"});
        public static final int $stable = 8;

        private AssetPreference() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.AssetPreference fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus cryptocurrencyPreferenceStatus = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    cryptocurrencyPreferenceStatus = com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyPreferenceStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (cryptocurrencyPreferenceStatus != null) {
                return new com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.AssetPreference(obj, cryptocurrencyPreferenceStatus);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "status");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.AssetPreference value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("rate");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getRate());
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyPreferenceStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/GetSmartRoutePreferencesQuery_ResponseAdapter$SavingsAccountFeatures;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$SavingsAccountFeatures;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$SavingsAccountFeatures;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$SavingsAccountFeatures;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SavingsAccountFeatures implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.SavingsAccountFeatures> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.SavingsAccountFeatures INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.SavingsAccountFeatures();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("annualPercentageYield");
        public static final int $stable = 8;

        private SavingsAccountFeatures() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.SavingsAccountFeatures fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.SavingsAccountFeatures(obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "annualPercentageYield");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.SavingsAccountFeatures value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("annualPercentageYield");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getAnnualPercentageYield());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/GetSmartRoutePreferencesQuery_ResponseAdapter$BalanceAutoReload;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$BalanceAutoReload;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$BalanceAutoReload;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$BalanceAutoReload;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BalanceAutoReload implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.BalanceAutoReload> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.BalanceAutoReload INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.BalanceAutoReload();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private BalanceAutoReload() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.BalanceAutoReload fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("BalanceAutoReloadThreshold"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onBalanceAutoReloadThreshold = com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.OnBalanceAutoReloadThreshold.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.BalanceAutoReload(str, onBalanceAutoReloadThreshold);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.BalanceAutoReload value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnBalanceAutoReloadThreshold() != null) {
                com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.OnBalanceAutoReloadThreshold.INSTANCE.toJson(writer, customScalarAdapters, value.getOnBalanceAutoReloadThreshold());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/GetSmartRoutePreferencesQuery_ResponseAdapter$OnBalanceAutoReloadThreshold;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$OnBalanceAutoReloadThreshold;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$OnBalanceAutoReloadThreshold;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$OnBalanceAutoReloadThreshold;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnBalanceAutoReloadThreshold implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.OnBalanceAutoReloadThreshold> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.OnBalanceAutoReloadThreshold INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.OnBalanceAutoReloadThreshold();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"balanceId", "financialInstrumentId", "reloadAmount", "thresholdAmount"});
        public static final int $stable = 8;

        private OnBalanceAutoReloadThreshold() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.OnBalanceAutoReloadThreshold fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.ReloadAmount reloadAmount = null;
            com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.ThresholdAmount thresholdAmount = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    reloadAmount = (com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.ReloadAmount) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.ReloadAmount.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    thresholdAmount = (com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.ThresholdAmount) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.ThresholdAmount.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "balanceId");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "financialInstrumentId");
                throw new kotlin.KotlinNothingValueException();
            }
            if (reloadAmount == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "reloadAmount");
                throw new kotlin.KotlinNothingValueException();
            }
            if (thresholdAmount != null) {
                return new com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.OnBalanceAutoReloadThreshold(str, str2, reloadAmount, thresholdAmount);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "thresholdAmount");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.OnBalanceAutoReloadThreshold value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("balanceId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getBalanceId());
            writer.name("financialInstrumentId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getFinancialInstrumentId());
            writer.name("reloadAmount");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.ReloadAmount.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getReloadAmount());
            writer.name("thresholdAmount");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.ThresholdAmount.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getThresholdAmount());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/GetSmartRoutePreferencesQuery_ResponseAdapter$ReloadAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$ReloadAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$ReloadAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$ReloadAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ReloadAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.ReloadAmount> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.ReloadAmount INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.ReloadAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE});
        public static final int $stable = 8;

        private ReloadAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.ReloadAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
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
                return new com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.ReloadAmount(obj, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.ReloadAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/GetSmartRoutePreferencesQuery_ResponseAdapter$ThresholdAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$ThresholdAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$ThresholdAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRoutePreferencesQuery$ThresholdAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ThresholdAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.ThresholdAmount> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.ThresholdAmount INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.GetSmartRoutePreferencesQuery_ResponseAdapter.ThresholdAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE});
        public static final int $stable = 8;

        private ThresholdAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.ThresholdAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
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
                return new com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.ThresholdAmount(obj, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.ThresholdAmount value) {
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
