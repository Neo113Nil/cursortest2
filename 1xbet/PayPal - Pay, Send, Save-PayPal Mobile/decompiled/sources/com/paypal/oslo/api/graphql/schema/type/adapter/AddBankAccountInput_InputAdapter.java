package com.paypal.oslo.api.graphql.schema.type.adapter;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/adapter/AddBankAccountInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/api/graphql/schema/type/AddBankAccountInput;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/api/graphql/schema/type/AddBankAccountInput;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/api/graphql/schema/type/AddBankAccountInput;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AddBankAccountInput_InputAdapter implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.api.graphql.schema.type.AddBankAccountInput> {
    public static final com.paypal.oslo.api.graphql.schema.type.adapter.AddBankAccountInput_InputAdapter INSTANCE = new com.paypal.oslo.api.graphql.schema.type.adapter.AddBankAccountInput_InputAdapter();

    private AddBankAccountInput_InputAdapter() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.apollographql.apollo.api.Adapter
    public final com.paypal.oslo.api.graphql.schema.type.AddBankAccountInput fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        throw new java.lang.IllegalStateException("Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.api.graphql.schema.type.AddBankAccountInput value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        writer.name("type");
        com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
        writer.name("dataFormat");
        com.paypal.oslo.api.graphql.schema.type.adapter.BankDataFormat_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getDataFormat());
        if (value.getAccountNumber() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber);
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getAccountNumber());
        }
        if (value.getRoutingNumber1() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameRoutingNumber);
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getRoutingNumber1());
        }
        if (value.getRoutingNumber2() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("routingNumber2");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getRoutingNumber2());
        }
        if (value.getRoutingNumber3() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("routingNumber3");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getRoutingNumber3());
        }
        writer.name("currencyCode");
        com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
        if (value.getOnboardingEntity() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("onboardingEntity");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankAccountOnboardingEntity_ResponseAdapter.INSTANCE)).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getOnboardingEntity());
        }
        if (value.getIssuer() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("issuer");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.BankIssuerInput_InputAdapter.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getIssuer());
        }
        if (value.getBeneficiary() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("beneficiary");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.BankBeneficiaryInput_InputAdapter.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getBeneficiary());
        }
    }
}
