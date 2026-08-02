package com.paypal.oslo.feature.qrc.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/adapter/GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "ConsumerPresentedQrCodeEligibility", "QrCodeEligibilityStatus", "QrCodeCapability"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.qrc.graphql.adapter.GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.qrc.graphql.adapter.GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/adapter/GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.Data> {
        public static final com.paypal.oslo.feature.qrc.graphql.adapter.GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.qrc.graphql.adapter.GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("consumerPresentedQrCodeEligibility");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility consumerPresentedQrCodeEligibility = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                consumerPresentedQrCodeEligibility = (com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.adapter.GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter.ConsumerPresentedQrCodeEligibility.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (consumerPresentedQrCodeEligibility != null) {
                return new com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.Data(consumerPresentedQrCodeEligibility);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "consumerPresentedQrCodeEligibility");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("consumerPresentedQrCodeEligibility");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.adapter.GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter.ConsumerPresentedQrCodeEligibility.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getConsumerPresentedQrCodeEligibility());
        }
    }

    private GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/adapter/GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter$ConsumerPresentedQrCodeEligibility;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$ConsumerPresentedQrCodeEligibility;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$ConsumerPresentedQrCodeEligibility;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$ConsumerPresentedQrCodeEligibility;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ConsumerPresentedQrCodeEligibility implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility> {
        public static final com.paypal.oslo.feature.qrc.graphql.adapter.GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter.ConsumerPresentedQrCodeEligibility INSTANCE = new com.paypal.oslo.feature.qrc.graphql.adapter.GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter.ConsumerPresentedQrCodeEligibility();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("qrCodeEligibilityStatuses");
        public static final int $stable = 8;

        private ConsumerPresentedQrCodeEligibility() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.adapter.GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter.QrCodeEligibilityStatus.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            if (list != null) {
                return new com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility(list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "qrCodeEligibilityStatuses");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("qrCodeEligibilityStatuses");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.adapter.GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter.QrCodeEligibilityStatus.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getQrCodeEligibilityStatuses());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/adapter/GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter$QrCodeEligibilityStatus;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$QrCodeEligibilityStatus;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$QrCodeEligibilityStatus;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$QrCodeEligibilityStatus;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class QrCodeEligibilityStatus implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeEligibilityStatus> {
        public static final com.paypal.oslo.feature.qrc.graphql.adapter.GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter.QrCodeEligibilityStatus INSTANCE = new com.paypal.oslo.feature.qrc.graphql.adapter.GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter.QrCodeEligibilityStatus();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"qrCodeType", "status", "statusReason", "qrCodeCapabilities"});
        public static final int $stable = 8;

        private QrCodeEligibilityStatus() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeEligibilityStatus fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qRCodeType = null;
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus qRCodeEligibilityStatus = null;
            java.lang.String str = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    qRCodeType = (com.paypal.oslo.feature.qrc.graphql.type.QRCodeType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    qRCodeEligibilityStatus = (com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeEligibilityStatus_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.adapter.GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter.QrCodeCapability.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeEligibilityStatus(qRCodeType, qRCodeEligibilityStatus, str, list);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeEligibilityStatus value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("qrCodeType");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getQrCodeType());
            writer.name("status");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeEligibilityStatus_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("statusReason");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getStatusReason());
            writer.name("qrCodeCapabilities");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.adapter.GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter.QrCodeCapability.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getQrCodeCapabilities());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/adapter/GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter$QrCodeCapability;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$QrCodeCapability;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$QrCodeCapability;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$QrCodeCapability;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class QrCodeCapability implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability> {
        public static final com.paypal.oslo.feature.qrc.graphql.adapter.GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter.QrCodeCapability INSTANCE = new com.paypal.oslo.feature.qrc.graphql.adapter.GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter.QrCodeCapability();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"capability", "status", "statusReason"});
        public static final int $stable = 8;

        private QrCodeCapability() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability qRCodeCapability = null;
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus qRCodeEligibilityStatus = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    qRCodeCapability = (com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeCapability_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    qRCodeEligibilityStatus = (com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeEligibilityStatus_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability(qRCodeCapability, qRCodeEligibilityStatus, str);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("capability");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeCapability_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getCapability());
            writer.name("status");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeEligibilityStatus_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("statusReason");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getStatusReason());
        }
    }
}
