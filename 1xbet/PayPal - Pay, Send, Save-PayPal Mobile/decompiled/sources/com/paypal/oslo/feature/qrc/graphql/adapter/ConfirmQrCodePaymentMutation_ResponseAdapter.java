package com.paypal.oslo.feature.qrc.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/adapter/ConfirmQrCodePaymentMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OPERATION_NAME, "RequiredAction", "OnQRCodeSessionPollingAction", "OnQRCodeSessionBasicAction", "OnQRCodeSessionErrorAction", "Payment"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ConfirmQrCodePaymentMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/adapter/ConfirmQrCodePaymentMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Data> {
        public static final com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("confirmQrCodePayment");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment confirmQrCodePayment = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                confirmQrCodePayment = (com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.ConfirmQrCodePayment.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (confirmQrCodePayment != null) {
                return new com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Data(confirmQrCodePayment);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "confirmQrCodePayment");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("confirmQrCodePayment");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.ConfirmQrCodePayment.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getConfirmQrCodePayment());
        }
    }

    private ConfirmQrCodePaymentMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/adapter/ConfirmQrCodePaymentMutation_ResponseAdapter$ConfirmQrCodePayment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$ConfirmQrCodePayment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$ConfirmQrCodePayment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$ConfirmQrCodePayment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ConfirmQrCodePayment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment> {
        public static final com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.ConfirmQrCodePayment INSTANCE = new com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.ConfirmQrCodePayment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "requiredAction", "payment"});
        public static final int $stable = 8;

        private ConfirmQrCodePayment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction requiredAction = null;
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment payment = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    requiredAction = (com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.RequiredAction.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    payment = (com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.Payment.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment(str, requiredAction, payment);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "id");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("requiredAction");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.RequiredAction.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getRequiredAction());
            writer.name("payment");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.Payment.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getPayment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/adapter/ConfirmQrCodePaymentMutation_ResponseAdapter$RequiredAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$RequiredAction;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$RequiredAction;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$RequiredAction;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RequiredAction implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction> {
        public static final com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.RequiredAction INSTANCE = new com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.RequiredAction();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private RequiredAction() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction onQRCodeSessionPollingAction;
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionBasicAction onQRCodeSessionBasicAction;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction onQRCodeSessionErrorAction = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("QRCodeSessionPollingAction"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onQRCodeSessionPollingAction = com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.OnQRCodeSessionPollingAction.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onQRCodeSessionPollingAction = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("QRCodeSessionBasicAction"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onQRCodeSessionBasicAction = com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.OnQRCodeSessionBasicAction.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onQRCodeSessionBasicAction = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("QRCodeSessionErrorAction"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onQRCodeSessionErrorAction = com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.OnQRCodeSessionErrorAction.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction(str, onQRCodeSessionPollingAction, onQRCodeSessionBasicAction, onQRCodeSessionErrorAction);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnQRCodeSessionPollingAction() != null) {
                com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.OnQRCodeSessionPollingAction.INSTANCE.toJson(writer, customScalarAdapters, value.getOnQRCodeSessionPollingAction());
            }
            if (value.getOnQRCodeSessionBasicAction() != null) {
                com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.OnQRCodeSessionBasicAction.INSTANCE.toJson(writer, customScalarAdapters, value.getOnQRCodeSessionBasicAction());
            }
            if (value.getOnQRCodeSessionErrorAction() != null) {
                com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.OnQRCodeSessionErrorAction.INSTANCE.toJson(writer, customScalarAdapters, value.getOnQRCodeSessionErrorAction());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/adapter/ConfirmQrCodePaymentMutation_ResponseAdapter$OnQRCodeSessionPollingAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionPollingAction;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionPollingAction;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionPollingAction;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnQRCodeSessionPollingAction implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction> {
        public static final com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.OnQRCodeSessionPollingAction INSTANCE = new com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.OnQRCodeSessionPollingAction();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"name", "maximumPollingInterval"});
        public static final int $stable = 8;

        private OnQRCodeSessionPollingAction() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType qRCodeSessionActionType = null;
            java.lang.Integer num = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    qRCodeSessionActionType = com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeSessionActionType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    num = com.apollographql.apollo.api.Adapters.NullableIntAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (qRCodeSessionActionType != null) {
                return new com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction(qRCodeSessionActionType, num);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeSessionActionType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
            writer.name("maximumPollingInterval");
            com.apollographql.apollo.api.Adapters.NullableIntAdapter.toJson(writer, customScalarAdapters, value.getMaximumPollingInterval());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/adapter/ConfirmQrCodePaymentMutation_ResponseAdapter$OnQRCodeSessionBasicAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionBasicAction;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionBasicAction;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionBasicAction;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnQRCodeSessionBasicAction implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionBasicAction> {
        public static final com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.OnQRCodeSessionBasicAction INSTANCE = new com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.OnQRCodeSessionBasicAction();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("name");
        public static final int $stable = 8;

        private OnQRCodeSessionBasicAction() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionBasicAction fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType qRCodeSessionActionType = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                qRCodeSessionActionType = com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeSessionActionType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (qRCodeSessionActionType != null) {
                return new com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionBasicAction(qRCodeSessionActionType);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionBasicAction value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeSessionActionType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/adapter/ConfirmQrCodePaymentMutation_ResponseAdapter$OnQRCodeSessionErrorAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionErrorAction;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionErrorAction;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionErrorAction;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnQRCodeSessionErrorAction implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction> {
        public static final com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.OnQRCodeSessionErrorAction INSTANCE = new com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.OnQRCodeSessionErrorAction();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"name", "errorReason", com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE});
        public static final int $stable = 8;

        private OnQRCodeSessionErrorAction() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType qRCodeSessionActionType = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    qRCodeSessionActionType = com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeSessionActionType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (qRCodeSessionActionType != null) {
                return new com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction(qRCodeSessionActionType, str, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeSessionActionType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
            writer.name("errorReason");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getErrorReason());
            writer.name(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getIssue());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/adapter/ConfirmQrCodePaymentMutation_ResponseAdapter$Payment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$Payment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$Payment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$Payment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Payment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment> {
        public static final com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.Payment INSTANCE = new com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.Payment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "paymentMethod", "status", "statusReason", "transactionTime"});
        public static final int $stable = 8;

        private Payment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod qRCodePaymentMethod = null;
            com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentStatus qRCodePaymentStatus = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    qRCodePaymentMethod = com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodePaymentMethod_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    qRCodePaymentStatus = com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodePaymentStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 4) {
                        break;
                    }
                    str3 = (java.lang.String) com.apollographql.apollo.api.Adapters.m9938nullable(customScalarAdapters.responseAdapterFor(com.paypal.oslo.feature.qrc.graphql.type.DateTime.INSTANCE.getType())).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (qRCodePaymentMethod == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "paymentMethod");
                throw new kotlin.KotlinNothingValueException();
            }
            if (qRCodePaymentStatus != null) {
                return new com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment(str, qRCodePaymentMethod, qRCodePaymentStatus, str2, str3);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "status");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("paymentMethod");
            com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodePaymentMethod_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getPaymentMethod());
            writer.name("status");
            com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodePaymentStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("statusReason");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getStatusReason());
            writer.name("transactionTime");
            com.apollographql.apollo.api.Adapters.m9938nullable(customScalarAdapters.responseAdapterFor(com.paypal.oslo.feature.qrc.graphql.type.DateTime.INSTANCE.getType())).toJson(writer, customScalarAdapters, value.getTransactionTime());
        }
    }
}
