package com.paypal.oslo.api.graphql.schema.type.adapter;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/adapter/BNPLPlanProgramInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlanProgramInput;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlanProgramInput;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlanProgramInput;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BNPLPlanProgramInput_InputAdapter implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramInput> {
    public static final com.paypal.oslo.api.graphql.schema.type.adapter.BNPLPlanProgramInput_InputAdapter INSTANCE = new com.paypal.oslo.api.graphql.schema.type.adapter.BNPLPlanProgramInput_InputAdapter();

    private BNPLPlanProgramInput_InputAdapter() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.apollographql.apollo.api.Adapter
    public final com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramInput fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        throw new java.lang.IllegalStateException("Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.api.graphql.schema.type.BNPLPlanProgramInput value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        writer.name("name");
        com.paypal.oslo.api.graphql.schema.type.adapter.BNPLPlanProgramName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
        writer.name("reason");
        com.paypal.oslo.api.graphql.schema.type.adapter.BNPLPlanProgramEnrollmentReason_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getReason());
        if (value.getDefermentDuration() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("defermentDuration");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableAnyAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getDefermentDuration());
        }
        if (value.getEnrollmentFee() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("enrollmentFee");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.MoneyInput_InputAdapter.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getEnrollmentFee());
        }
        if (value.getOutstandingBalance() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("outstandingBalance");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.MoneyInput_InputAdapter.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getOutstandingBalance());
        }
        if (value.getCentralBankRate() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("centralBankRate");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableAnyAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getCentralBankRate());
        }
        if (value.getLegalLimitRate() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("legalLimitRate");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableAnyAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getLegalLimitRate());
        }
        if (value.getLegalLimitRateThreshold() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("legalLimitRateThreshold");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.MoneyInput_InputAdapter.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getLegalLimitRateThreshold());
        }
    }
}
