package com.paypal.oslo.feature.smartroute.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/UpdateCryptocurrencyPreferencesMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.OPERATION_NAME, "ActionPreference"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdateCryptocurrencyPreferencesMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateCryptocurrencyPreferencesMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateCryptocurrencyPreferencesMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/UpdateCryptocurrencyPreferencesMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.Data> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateCryptocurrencyPreferencesMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateCryptocurrencyPreferencesMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("updateCryptocurrencyPreferences");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.UpdateCryptocurrencyPreferences updateCryptocurrencyPreferences = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                updateCryptocurrencyPreferences = (com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.UpdateCryptocurrencyPreferences) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateCryptocurrencyPreferencesMutation_ResponseAdapter.UpdateCryptocurrencyPreferences.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.Data(updateCryptocurrencyPreferences);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("updateCryptocurrencyPreferences");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateCryptocurrencyPreferencesMutation_ResponseAdapter.UpdateCryptocurrencyPreferences.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getUpdateCryptocurrencyPreferences());
        }
    }

    private UpdateCryptocurrencyPreferencesMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/UpdateCryptocurrencyPreferencesMutation_ResponseAdapter$UpdateCryptocurrencyPreferences;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$UpdateCryptocurrencyPreferences;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$UpdateCryptocurrencyPreferences;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$UpdateCryptocurrencyPreferences;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UpdateCryptocurrencyPreferences implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.UpdateCryptocurrencyPreferences> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateCryptocurrencyPreferencesMutation_ResponseAdapter.UpdateCryptocurrencyPreferences INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateCryptocurrencyPreferencesMutation_ResponseAdapter.UpdateCryptocurrencyPreferences();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("actionPreference");
        public static final int $stable = 8;

        private UpdateCryptocurrencyPreferences() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.UpdateCryptocurrencyPreferences fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.ActionPreference actionPreference = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                actionPreference = (com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.ActionPreference) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateCryptocurrencyPreferencesMutation_ResponseAdapter.ActionPreference.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.UpdateCryptocurrencyPreferences(actionPreference);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.UpdateCryptocurrencyPreferences value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("actionPreference");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateCryptocurrencyPreferencesMutation_ResponseAdapter.ActionPreference.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getActionPreference());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/adapter/UpdateCryptocurrencyPreferencesMutation_ResponseAdapter$ActionPreference;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$ActionPreference;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$ActionPreference;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/smartroute/graphql/UpdateCryptocurrencyPreferencesMutation$ActionPreference;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActionPreference implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.ActionPreference> {
        public static final com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateCryptocurrencyPreferencesMutation_ResponseAdapter.ActionPreference INSTANCE = new com.paypal.oslo.feature.smartroute.graphql.adapter.UpdateCryptocurrencyPreferencesMutation_ResponseAdapter.ActionPreference();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("status");
        public static final int $stable = 8;

        private ActionPreference() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.ActionPreference fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus cryptocurrencyPreferenceStatus = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                cryptocurrencyPreferenceStatus = com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyPreferenceStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (cryptocurrencyPreferenceStatus != null) {
                return new com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.ActionPreference(cryptocurrencyPreferenceStatus);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "status");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.ActionPreference value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyPreferenceStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
        }
    }
}
