package com.paypal.oslo.feature.qrc.graphql.type.adapter;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/type/adapter/QRCodePaymentOptionsInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentOptionsInput;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentOptionsInput;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentOptionsInput;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QRCodePaymentOptionsInput_InputAdapter implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentOptionsInput> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodePaymentOptionsInput_InputAdapter INSTANCE = new com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodePaymentOptionsInput_InputAdapter();

    private QRCodePaymentOptionsInput_InputAdapter() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.apollographql.apollo.api.Adapter
    public final com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentOptionsInput fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        throw new java.lang.IllegalStateException("Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentOptionsInput value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        writer.name("sessionId");
        com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getSessionId());
        if (value.getPaymentAmount() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("paymentAmount");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.type.adapter.MoneyInput_InputAdapter.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getPaymentAmount());
        }
        if (value.getTipAmount() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("tipAmount");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.type.adapter.MoneyInput_InputAdapter.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getTipAmount());
        }
        if (value.getPayeeAccountId() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("payeeAccountId");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getPayeeAccountId());
        }
        if (value.getNote() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name(com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE);
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getNote());
        }
        writer.name("clientConfiguration");
        com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeClientConfigurationInput_InputAdapter.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getClientConfiguration());
        if (value.getFlowDirectives() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("flowDirectives");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.feature.qrc.graphql.type.adapter.QRCodeFlowDirective_ResponseAdapter.INSTANCE))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getFlowDirectives());
        }
        if (value.getTouchpointCodes() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("touchpointCodes");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getTouchpointCodes());
        }
    }
}
