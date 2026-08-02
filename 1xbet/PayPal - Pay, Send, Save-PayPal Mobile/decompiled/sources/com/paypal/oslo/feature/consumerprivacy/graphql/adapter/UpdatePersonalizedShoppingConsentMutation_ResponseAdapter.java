package com.paypal.oslo.feature.consumerprivacy.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/adapter/UpdatePersonalizedShoppingConsentMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedShoppingConsentMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UpdatePersonalizedShoppingConsentMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.consumerprivacy.graphql.adapter.UpdatePersonalizedShoppingConsentMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.adapter.UpdatePersonalizedShoppingConsentMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/adapter/UpdatePersonalizedShoppingConsentMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdatePersonalizedShoppingConsentMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdatePersonalizedShoppingConsentMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdatePersonalizedShoppingConsentMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedShoppingConsentMutation.Data> {
        public static final com.paypal.oslo.feature.consumerprivacy.graphql.adapter.UpdatePersonalizedShoppingConsentMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.adapter.UpdatePersonalizedShoppingConsentMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("updatePersonalizedShoppingConsent");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedShoppingConsentMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedShoppingConsentMutation.UpdatePersonalizedShoppingConsent updatePersonalizedShoppingConsent = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                updatePersonalizedShoppingConsent = (com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedShoppingConsentMutation.UpdatePersonalizedShoppingConsent) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.UpdatePersonalizedShoppingConsentMutation_ResponseAdapter.UpdatePersonalizedShoppingConsent.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (updatePersonalizedShoppingConsent != null) {
                return new com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedShoppingConsentMutation.Data(updatePersonalizedShoppingConsent);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "updatePersonalizedShoppingConsent");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedShoppingConsentMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("updatePersonalizedShoppingConsent");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.consumerprivacy.graphql.adapter.UpdatePersonalizedShoppingConsentMutation_ResponseAdapter.UpdatePersonalizedShoppingConsent.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getUpdatePersonalizedShoppingConsent());
        }
    }

    private UpdatePersonalizedShoppingConsentMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/graphql/adapter/UpdatePersonalizedShoppingConsentMutation_ResponseAdapter$UpdatePersonalizedShoppingConsent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdatePersonalizedShoppingConsentMutation$UpdatePersonalizedShoppingConsent;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdatePersonalizedShoppingConsentMutation$UpdatePersonalizedShoppingConsent;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/consumerprivacy/graphql/UpdatePersonalizedShoppingConsentMutation$UpdatePersonalizedShoppingConsent;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UpdatePersonalizedShoppingConsent implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedShoppingConsentMutation.UpdatePersonalizedShoppingConsent> {
        public static final com.paypal.oslo.feature.consumerprivacy.graphql.adapter.UpdatePersonalizedShoppingConsentMutation_ResponseAdapter.UpdatePersonalizedShoppingConsent INSTANCE = new com.paypal.oslo.feature.consumerprivacy.graphql.adapter.UpdatePersonalizedShoppingConsentMutation_ResponseAdapter.UpdatePersonalizedShoppingConsent();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("success");
        public static final int $stable = 8;

        private UpdatePersonalizedShoppingConsent() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedShoppingConsentMutation.UpdatePersonalizedShoppingConsent fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
            }
            if (bool != null) {
                return new com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedShoppingConsentMutation.UpdatePersonalizedShoppingConsent(bool.booleanValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "success");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.consumerprivacy.graphql.UpdatePersonalizedShoppingConsentMutation.UpdatePersonalizedShoppingConsent value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("success");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getSuccess()));
        }
    }
}
