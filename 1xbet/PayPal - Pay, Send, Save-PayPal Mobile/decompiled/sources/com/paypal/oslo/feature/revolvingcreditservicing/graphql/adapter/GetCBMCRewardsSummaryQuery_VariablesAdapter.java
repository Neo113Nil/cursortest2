package com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetCBMCRewardsSummaryQuery_VariablesAdapter;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetCBMCRewardsSummaryQuery;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetCBMCRewardsSummaryQuery;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetCBMCRewardsSummaryQuery_VariablesAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetCBMCRewardsSummaryQuery_VariablesAdapter INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetCBMCRewardsSummaryQuery_VariablesAdapter();

    private GetCBMCRewardsSummaryQuery_VariablesAdapter() {
    }

    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCRewardsSummaryQuery value, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        writer.name("creditProductIdentifier");
        com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditProductIdentifier_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getCreditProductIdentifier());
        if (value.getCreditAccountId() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("creditAccountId");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableAnyAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getCreditAccountId());
        }
        writer.name("skipProductFeatureOffers");
        com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getSkipProductFeatureOffers()));
    }
}
