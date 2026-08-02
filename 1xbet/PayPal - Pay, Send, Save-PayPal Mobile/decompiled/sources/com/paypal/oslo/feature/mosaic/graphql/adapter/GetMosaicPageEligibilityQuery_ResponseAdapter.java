package com.paypal.oslo.feature.mosaic.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/graphql/adapter/GetMosaicPageEligibilityQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "MosaicPageEligibility"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetMosaicPageEligibilityQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.mosaic.graphql.adapter.GetMosaicPageEligibilityQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.mosaic.graphql.adapter.GetMosaicPageEligibilityQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/graphql/adapter/GetMosaicPageEligibilityQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/mosaic/graphql/GetMosaicPageEligibilityQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/mosaic/graphql/GetMosaicPageEligibilityQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/mosaic/graphql/GetMosaicPageEligibilityQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.Data> {
        public static final com.paypal.oslo.feature.mosaic.graphql.adapter.GetMosaicPageEligibilityQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.mosaic.graphql.adapter.GetMosaicPageEligibilityQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("mosaicPageEligibility");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility mosaicPageEligibility = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                mosaicPageEligibility = (com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.mosaic.graphql.adapter.GetMosaicPageEligibilityQuery_ResponseAdapter.MosaicPageEligibility.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (mosaicPageEligibility != null) {
                return new com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.Data(mosaicPageEligibility);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "mosaicPageEligibility");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("mosaicPageEligibility");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.mosaic.graphql.adapter.GetMosaicPageEligibilityQuery_ResponseAdapter.MosaicPageEligibility.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getMosaicPageEligibility());
        }
    }

    private GetMosaicPageEligibilityQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/graphql/adapter/GetMosaicPageEligibilityQuery_ResponseAdapter$MosaicPageEligibility;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/mosaic/graphql/GetMosaicPageEligibilityQuery$MosaicPageEligibility;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/mosaic/graphql/GetMosaicPageEligibilityQuery$MosaicPageEligibility;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/mosaic/graphql/GetMosaicPageEligibilityQuery$MosaicPageEligibility;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MosaicPageEligibility implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility> {
        public static final com.paypal.oslo.feature.mosaic.graphql.adapter.GetMosaicPageEligibilityQuery_ResponseAdapter.MosaicPageEligibility INSTANCE = new com.paypal.oslo.feature.mosaic.graphql.adapter.GetMosaicPageEligibilityQuery_ResponseAdapter.MosaicPageEligibility();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"isSupportedOnMosaic", "isWebSupported", "isNativeSupported", "qualifiedIntentId"});
        public static final int $stable = 8;

        private MosaicPageEligibility() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.Boolean bool2 = null;
            java.lang.Boolean bool3 = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    bool2 = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    bool3 = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (bool2 != null) {
                    boolean booleanValue2 = bool2.booleanValue();
                    if (bool3 != null) {
                        return new com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility(booleanValue, booleanValue2, bool3.booleanValue(), obj);
                    }
                    com.apollographql.apollo.api.Assertions.missingField(reader, "isNativeSupported");
                    throw new kotlin.KotlinNothingValueException();
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "isWebSupported");
                throw new kotlin.KotlinNothingValueException();
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "isSupportedOnMosaic");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("isSupportedOnMosaic");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.isSupportedOnMosaic()));
            writer.name("isWebSupported");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.isWebSupported()));
            writer.name("isNativeSupported");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.isNativeSupported()));
            writer.name("qualifiedIntentId");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getQualifiedIntentId());
        }
    }
}
