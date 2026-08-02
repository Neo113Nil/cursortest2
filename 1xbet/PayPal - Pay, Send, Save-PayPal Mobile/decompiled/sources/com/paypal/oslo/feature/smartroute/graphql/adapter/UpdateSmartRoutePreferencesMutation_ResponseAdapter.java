package com.paypal.oslo.feature.smartroute.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/UpdateSmartRoutePreferencesMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OPERATION_NAME, "Preferences", "Distribution", "Target", "Allocation", "OnSmartRoutePercentage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdateSmartRoutePreferencesMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/UpdateSmartRoutePreferencesMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Data> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("updateSmartRoutePreferences");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences updateSmartRoutePreferences = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                updateSmartRoutePreferences = (com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.UpdateSmartRoutePreferences.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Data(updateSmartRoutePreferences);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("updateSmartRoutePreferences");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.UpdateSmartRoutePreferences.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getUpdateSmartRoutePreferences());
        }
    }

    private UpdateSmartRoutePreferencesMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/UpdateSmartRoutePreferencesMutation_ResponseAdapter$UpdateSmartRoutePreferences;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$UpdateSmartRoutePreferences;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$UpdateSmartRoutePreferences;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$UpdateSmartRoutePreferences;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UpdateSmartRoutePreferences implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.UpdateSmartRoutePreferences INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.UpdateSmartRoutePreferences();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"success", "preferences"});
        public static final int $stable = 8;

        private UpdateSmartRoutePreferences() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences preferences = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    preferences = (com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.Preferences.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                }
            }
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (preferences != null) {
                    return new com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences(booleanValue, preferences);
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "preferences");
                throw new kotlin.KotlinNothingValueException();
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "success");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("success");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getSuccess()));
            writer.name("preferences");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.Preferences.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getPreferences());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/UpdateSmartRoutePreferencesMutation_ResponseAdapter$Preferences;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Preferences;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Preferences;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Preferences;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Preferences implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.Preferences INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.Preferences();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"distribution", "status", "version"});
        public static final int $stable = 8;

        private Preferences() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Distribution distribution = null;
            com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus smartRouteStatus = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    distribution = (com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Distribution) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.Distribution.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
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
                return new com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences(distribution, smartRouteStatus, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "version");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Preferences value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("distribution");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.Distribution.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getDistribution());
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("version");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getVersion());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/UpdateSmartRoutePreferencesMutation_ResponseAdapter$Distribution;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Distribution;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Distribution;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Distribution;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Distribution implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Distribution> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.Distribution INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.Distribution();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"source", "method", "targets"});
        public static final int $stable = 8;

        private Distribution() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Distribution fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.SmartRouteFundingSource smartRouteFundingSource = null;
            com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionMethod smartRouteDistributionMethod = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    smartRouteFundingSource = com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteFundingSource_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    smartRouteDistributionMethod = com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteDistributionMethod_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.Target.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (smartRouteFundingSource == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "source");
                throw new kotlin.KotlinNothingValueException();
            }
            if (smartRouteDistributionMethod == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "method");
                throw new kotlin.KotlinNothingValueException();
            }
            if (list != null) {
                return new com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Distribution(smartRouteFundingSource, smartRouteDistributionMethod, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "targets");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Distribution value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("source");
            com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteFundingSource_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getSource());
            writer.name("method");
            com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteDistributionMethod_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getMethod());
            writer.name("targets");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.Target.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getTargets());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/UpdateSmartRoutePreferencesMutation_ResponseAdapter$Target;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Target;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Target;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Target;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Target implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.Target INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.Target();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"accountType", "eligibilityStatus", "allocation"});
        public static final int $stable = 8;

        private Target() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType smartRouteAccountType = null;
            com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetEligibilityStatus smartRouteTargetEligibilityStatus = null;
            com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Allocation allocation = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    smartRouteAccountType = com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteAccountType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    smartRouteTargetEligibilityStatus = com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteTargetEligibilityStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    allocation = (com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Allocation) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.Allocation.INSTANCE, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (smartRouteAccountType == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "accountType");
                throw new kotlin.KotlinNothingValueException();
            }
            if (smartRouteTargetEligibilityStatus == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "eligibilityStatus");
                throw new kotlin.KotlinNothingValueException();
            }
            if (allocation != null) {
                return new com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target(smartRouteAccountType, smartRouteTargetEligibilityStatus, allocation);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "allocation");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Target value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("accountType");
            com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteAccountType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getAccountType());
            writer.name("eligibilityStatus");
            com.paypal.oslo.api.graphql.schema.type.adapter.SmartRouteTargetEligibilityStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getEligibilityStatus());
            writer.name("allocation");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.Allocation.INSTANCE, true).toJson(writer, customScalarAdapters, value.getAllocation());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/UpdateSmartRoutePreferencesMutation_ResponseAdapter$Allocation;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Allocation;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Allocation;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$Allocation;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Allocation implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Allocation> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.Allocation INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.Allocation();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Allocation() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Allocation fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage onSmartRoutePercentage = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("SmartRoutePercentage"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onSmartRoutePercentage = com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.OnSmartRoutePercentage.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Allocation(str, onSmartRoutePercentage);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Allocation value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnSmartRoutePercentage() != null) {
                com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.OnSmartRoutePercentage.INSTANCE.toJson(writer, customScalarAdapters, value.getOnSmartRoutePercentage());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/UpdateSmartRoutePreferencesMutation_ResponseAdapter$OnSmartRoutePercentage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$OnSmartRoutePercentage;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$OnSmartRoutePercentage;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/UpdateSmartRoutePreferencesMutation$OnSmartRoutePercentage;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnSmartRoutePercentage implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.OnSmartRoutePercentage INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateSmartRoutePreferencesMutation_ResponseAdapter.OnSmartRoutePercentage();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"__typename", "percentageValue"});
        public static final int $stable = 8;

        private OnSmartRoutePercentage() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Integer num = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
                throw new kotlin.KotlinNothingValueException();
            }
            if (num != null) {
                return new com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage(str, num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "percentageValue");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.OnSmartRoutePercentage value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            writer.name("percentageValue");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPercentageValue()));
        }
    }
}
