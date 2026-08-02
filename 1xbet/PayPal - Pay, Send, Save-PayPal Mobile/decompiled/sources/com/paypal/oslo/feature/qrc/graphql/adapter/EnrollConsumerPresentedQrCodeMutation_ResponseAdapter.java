package com.paypal.oslo.feature.qrc.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/adapter/EnrollConsumerPresentedQrCodeMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EnrollConsumerPresentedQrCodeMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.qrc.graphql.adapter.EnrollConsumerPresentedQrCodeMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.qrc.graphql.adapter.EnrollConsumerPresentedQrCodeMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/adapter/EnrollConsumerPresentedQrCodeMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.Data> {
        public static final com.paypal.oslo.feature.qrc.graphql.adapter.EnrollConsumerPresentedQrCodeMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.qrc.graphql.adapter.EnrollConsumerPresentedQrCodeMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("enrollConsumerPresentedQrCode");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode enrollConsumerPresentedQrCode = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                enrollConsumerPresentedQrCode = (com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.adapter.EnrollConsumerPresentedQrCodeMutation_ResponseAdapter.EnrollConsumerPresentedQrCode.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (enrollConsumerPresentedQrCode != null) {
                return new com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.Data(enrollConsumerPresentedQrCode);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "enrollConsumerPresentedQrCode");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("enrollConsumerPresentedQrCode");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.adapter.EnrollConsumerPresentedQrCodeMutation_ResponseAdapter.EnrollConsumerPresentedQrCode.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getEnrollConsumerPresentedQrCode());
        }
    }

    private EnrollConsumerPresentedQrCodeMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/adapter/EnrollConsumerPresentedQrCodeMutation_ResponseAdapter$EnrollConsumerPresentedQrCode;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation$EnrollConsumerPresentedQrCode;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation$EnrollConsumerPresentedQrCode;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation$EnrollConsumerPresentedQrCode;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EnrollConsumerPresentedQrCode implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode> {
        public static final com.paypal.oslo.feature.qrc.graphql.adapter.EnrollConsumerPresentedQrCodeMutation_ResponseAdapter.EnrollConsumerPresentedQrCode INSTANCE = new com.paypal.oslo.feature.qrc.graphql.adapter.EnrollConsumerPresentedQrCodeMutation_ResponseAdapter.EnrollConsumerPresentedQrCode();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"qrCodeType", "status", "deniedReason", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.NEXT_ACTION, "stepupAuthContextId"});
        public static final int $stable = 8;

        private EnrollConsumerPresentedQrCode() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qRCodeType = null;
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentStatus qRCodeEnrollmentStatus = null;
            java.lang.String str = null;
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentNextAction qRCodeEnrollmentNextAction = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    qRCodeType = (com.paypal.oslo.feature.qrc.graphql.type.QRCodeType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    qRCodeEnrollmentStatus = com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeEnrollmentStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    qRCodeEnrollmentNextAction = (com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentNextAction) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeEnrollmentNextAction_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 4) {
                        break;
                    }
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (qRCodeEnrollmentStatus != null) {
                return new com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode(qRCodeType, qRCodeEnrollmentStatus, str, qRCodeEnrollmentNextAction, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "status");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("qrCodeType");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getQrCodeType());
            writer.name("status");
            com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeEnrollmentStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("deniedReason");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getDeniedReason());
            writer.name(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.NEXT_ACTION);
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeEnrollmentNextAction_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getNextAction());
            writer.name("stepupAuthContextId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getStepupAuthContextId());
        }
    }
}
