package com.paypal.oslo.feature.directdeposit.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/adapter/GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.OPERATION_NAME, "Distribution", "Target", "Allocation", "OnSmartRoutePercentage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/adapter/GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Data> {
        public static final com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("smartRoutePreferences");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                smartRoutePreferences = (com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.SmartRoutePreferences.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Data(smartRoutePreferences);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("smartRoutePreferences");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.SmartRoutePreferences.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getSmartRoutePreferences());
        }
    }

    private GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/adapter/GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter$SmartRoutePreferences;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$SmartRoutePreferences;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$SmartRoutePreferences;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$SmartRoutePreferences;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SmartRoutePreferences implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences> {
        public static final com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.SmartRoutePreferences INSTANCE = new com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.SmartRoutePreferences();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"distribution", "status", "version"});
        public static final int $stable = 8;

        private SmartRoutePreferences() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution distribution = null;
            com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus smartRouteStatus = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    distribution = (com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.Distribution.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
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
                return new com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences(distribution, smartRouteStatus, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "version");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.SmartRoutePreferences value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("distribution");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.Distribution.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getDistribution());
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("version");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getVersion());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/adapter/GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter$Distribution;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Distribution;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Distribution;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Distribution;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Distribution implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution> {
        public static final com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.Distribution INSTANCE = new com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.Distribution();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"method", "source", "targets"});
        public static final int $stable = 8;

        private Distribution() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
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
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.Target.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
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
                return new com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution(smartRouteDistributionMethod, smartRouteFundingSource, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "targets");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Distribution value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("method");
            com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteDistributionMethod_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getMethod());
            writer.name("source");
            com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteFundingSource_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getSource());
            writer.name("targets");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.Target.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getTargets());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/adapter/GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter$Target;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Target;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Target;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Target;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Target implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Target> {
        public static final com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.Target INSTANCE = new com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.Target();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"accountType", "allocation", "eligibilityStatus"});
        public static final int $stable = 8;

        private Target() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Target fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType smartRouteAccountType = null;
            com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Allocation allocation = null;
            com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus smartRouteTargetEligibilityStatus = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    smartRouteAccountType = com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteAccountType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    allocation = (com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Allocation) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.Allocation.INSTANCE, true).fromJson(reader, customScalarAdapters);
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
                return new com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Target(smartRouteAccountType, allocation, smartRouteTargetEligibilityStatus);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "eligibilityStatus");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Target value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("accountType");
            com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteAccountType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getAccountType());
            writer.name("allocation");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.Allocation.INSTANCE, true).toJson(writer, customScalarAdapters, value.getAllocation());
            writer.name("eligibilityStatus");
            com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteTargetEligibilityStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getEligibilityStatus());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/adapter/GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter$Allocation;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Allocation;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Allocation;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$Allocation;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Allocation implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Allocation> {
        public static final com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.Allocation INSTANCE = new com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.Allocation();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Allocation() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Allocation fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.OnSmartRoutePercentage onSmartRoutePercentage = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("SmartRoutePercentage"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onSmartRoutePercentage = com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.OnSmartRoutePercentage.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Allocation(str, onSmartRoutePercentage);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.Allocation value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnSmartRoutePercentage() != null) {
                com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.OnSmartRoutePercentage.INSTANCE.toJson(writer, customScalarAdapters, value.getOnSmartRoutePercentage());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/graphql/adapter/GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter$OnSmartRoutePercentage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$OnSmartRoutePercentage;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$OnSmartRoutePercentage;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/directdeposit/graphql/GetDirectDepositSmartRoutePreferencesQuery$OnSmartRoutePercentage;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnSmartRoutePercentage implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.OnSmartRoutePercentage> {
        public static final com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.OnSmartRoutePercentage INSTANCE = new com.paypal.oslo.feature.directdeposit.graphql.adapter.GetDirectDepositSmartRoutePreferencesQuery_ResponseAdapter.OnSmartRoutePercentage();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
        public static final int $stable = 8;

        private OnSmartRoutePercentage() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.OnSmartRoutePercentage fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.OnSmartRoutePercentage(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.directdeposit.graphql.GetDirectDepositSmartRoutePreferencesQuery.OnSmartRoutePercentage value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getValue()));
        }
    }
}
