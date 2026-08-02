package com.paypal.oslo.api.graphql.schema.type.adapter;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/adapter/RevolvingCreditHistoricalPromotionalActivitiesInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditHistoricalPromotionalActivitiesInput;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditHistoricalPromotionalActivitiesInput;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditHistoricalPromotionalActivitiesInput;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RevolvingCreditHistoricalPromotionalActivitiesInput_InputAdapter implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditHistoricalPromotionalActivitiesInput> {
    public static final com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditHistoricalPromotionalActivitiesInput_InputAdapter INSTANCE = new com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditHistoricalPromotionalActivitiesInput_InputAdapter();

    private RevolvingCreditHistoricalPromotionalActivitiesInput_InputAdapter() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.apollographql.apollo.api.Adapter
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditHistoricalPromotionalActivitiesInput fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        throw new java.lang.IllegalStateException("Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditHistoricalPromotionalActivitiesInput value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        writer.name("creditProductIdentifier");
        com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditProductIdentifier_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getCreditProductIdentifier());
        if (value.getCreditAccountId() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("creditAccountId");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableAnyAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getCreditAccountId());
        }
        if (value.getFilterOptions() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("filterOptions");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditHistoricalPromotionalActivitiesFilterOptionsInput_InputAdapter.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getFilterOptions());
        }
        if (value.getOffset() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("offset");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableIntAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getOffset());
        }
        if (value.getLimit() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("limit");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableIntAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getLimit());
        }
    }
}
