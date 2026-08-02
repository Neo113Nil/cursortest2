package com.paypal.oslo.feature.userprofile.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/adapter/VerifyPartyEmailWithOtpMutation_VariablesAdapter;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/paypal/oslo/feature/userprofile/graphql/VerifyPartyEmailWithOtpMutation;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/paypal/oslo/feature/userprofile/graphql/VerifyPartyEmailWithOtpMutation;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VerifyPartyEmailWithOtpMutation_VariablesAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.userprofile.graphql.adapter.VerifyPartyEmailWithOtpMutation_VariablesAdapter INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.adapter.VerifyPartyEmailWithOtpMutation_VariablesAdapter();

    private VerifyPartyEmailWithOtpMutation_VariablesAdapter() {
    }

    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation value, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        writer.name("input");
        com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.VerifyPartyEmailWithOtpInput_InputAdapter.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getInput());
    }
}
