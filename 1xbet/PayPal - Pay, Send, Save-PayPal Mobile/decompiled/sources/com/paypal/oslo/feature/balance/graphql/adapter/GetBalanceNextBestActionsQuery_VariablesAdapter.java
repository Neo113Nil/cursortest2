package com.paypal.oslo.feature.balance.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/adapter/GetBalanceNextBestActionsQuery_VariablesAdapter;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceNextBestActionsQuery;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/paypal/oslo/feature/balance/graphql/GetBalanceNextBestActionsQuery;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetBalanceNextBestActionsQuery_VariablesAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_VariablesAdapter INSTANCE = new com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceNextBestActionsQuery_VariablesAdapter();

    private GetBalanceNextBestActionsQuery_VariablesAdapter() {
    }

    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery value, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        writer.name("surface");
        com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getSurface());
        if (value.getPageName() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("pageName");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.StringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getPageName());
        } else if (withDefaultValues) {
            writer.name("pageName");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, "mobile_home");
        }
        if (value.getLimit() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("limit");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.IntAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getLimit());
        } else if (withDefaultValues) {
            writer.name("limit");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, 3);
        }
    }
}
