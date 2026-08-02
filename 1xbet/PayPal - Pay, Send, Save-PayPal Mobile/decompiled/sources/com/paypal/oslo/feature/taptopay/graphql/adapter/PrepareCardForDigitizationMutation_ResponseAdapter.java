package com.paypal.oslo.feature.taptopay.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/adapter/PrepareCardForDigitizationMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.OPERATION_NAME, "CardToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PrepareCardForDigitizationMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taptopay.graphql.adapter.PrepareCardForDigitizationMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.taptopay.graphql.adapter.PrepareCardForDigitizationMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/adapter/PrepareCardForDigitizationMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.Data> {
        public static final com.paypal.oslo.feature.taptopay.graphql.adapter.PrepareCardForDigitizationMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.taptopay.graphql.adapter.PrepareCardForDigitizationMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("prepareCardForDigitization");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization prepareCardForDigitization = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                prepareCardForDigitization = (com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.taptopay.graphql.adapter.PrepareCardForDigitizationMutation_ResponseAdapter.PrepareCardForDigitization.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.Data(prepareCardForDigitization);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("prepareCardForDigitization");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.taptopay.graphql.adapter.PrepareCardForDigitizationMutation_ResponseAdapter.PrepareCardForDigitization.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getPrepareCardForDigitization());
        }
    }

    private PrepareCardForDigitizationMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/adapter/PrepareCardForDigitizationMutation_ResponseAdapter$PrepareCardForDigitization;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$PrepareCardForDigitization;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$PrepareCardForDigitization;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$PrepareCardForDigitization;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PrepareCardForDigitization implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization> {
        public static final com.paypal.oslo.feature.taptopay.graphql.adapter.PrepareCardForDigitizationMutation_ResponseAdapter.PrepareCardForDigitization INSTANCE = new com.paypal.oslo.feature.taptopay.graphql.adapter.PrepareCardForDigitizationMutation_ResponseAdapter.PrepareCardForDigitization();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"cardToken", "preDigitizationData"});
        public static final int $stable = 8;

        private PrepareCardForDigitization() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.CardToken cardToken = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    cardToken = (com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.CardToken) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.taptopay.graphql.adapter.PrepareCardForDigitizationMutation_ResponseAdapter.CardToken.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (cardToken != null) {
                return new com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization(cardToken, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "cardToken");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("cardToken");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.taptopay.graphql.adapter.PrepareCardForDigitizationMutation_ResponseAdapter.CardToken.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getCardToken());
            writer.name("preDigitizationData");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPreDigitizationData());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/adapter/PrepareCardForDigitizationMutation_ResponseAdapter$CardToken;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$CardToken;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$CardToken;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$CardToken;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CardToken implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.CardToken> {
        public static final com.paypal.oslo.feature.taptopay.graphql.adapter.PrepareCardForDigitizationMutation_ResponseAdapter.CardToken INSTANCE = new com.paypal.oslo.feature.taptopay.graphql.adapter.PrepareCardForDigitizationMutation_ResponseAdapter.CardToken();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("id");
        public static final int $stable = 8;

        private CardToken() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.CardToken fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.CardToken(str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "id");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.CardToken value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
        }
    }
}
