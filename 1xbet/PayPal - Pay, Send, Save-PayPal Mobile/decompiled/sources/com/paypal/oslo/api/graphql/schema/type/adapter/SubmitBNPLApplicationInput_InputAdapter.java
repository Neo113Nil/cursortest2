package com.paypal.oslo.api.graphql.schema.type.adapter;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/adapter/SubmitBNPLApplicationInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/api/graphql/schema/type/SubmitBNPLApplicationInput;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/api/graphql/schema/type/SubmitBNPLApplicationInput;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/api/graphql/schema/type/SubmitBNPLApplicationInput;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SubmitBNPLApplicationInput_InputAdapter implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.api.graphql.schema.type.SubmitBNPLApplicationInput> {
    public static final com.paypal.oslo.api.graphql.schema.type.adapter.SubmitBNPLApplicationInput_InputAdapter INSTANCE = new com.paypal.oslo.api.graphql.schema.type.adapter.SubmitBNPLApplicationInput_InputAdapter();

    private SubmitBNPLApplicationInput_InputAdapter() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.apollographql.apollo.api.Adapter
    public final com.paypal.oslo.api.graphql.schema.type.SubmitBNPLApplicationInput fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        throw new java.lang.IllegalStateException("Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.api.graphql.schema.type.SubmitBNPLApplicationInput value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        if (value.getAddress() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("address");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.AddressInput_InputAdapter.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getAddress());
        }
        if (value.getAnnualIncome() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("annualIncome");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.MoneyInput_InputAdapter.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getAnnualIncome());
        }
        if (value.getBirthCountry() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("birthCountry");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableAnyAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getBirthCountry());
        }
        if (value.getBirthDate() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("birthDate");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableAnyAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getBirthDate());
        }
        if (value.getBirthDepartmentCode() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("birthDepartmentCode");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getBirthDepartmentCode());
        }
        if (value.getBirthLocation() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("birthLocation");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getBirthLocation());
        }
        if (value.getBirthTown() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("birthTown");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getBirthTown());
        }
        if (value.getCitizenshipCountryCode() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("citizenshipCountryCode");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableAnyAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getCitizenshipCountryCode());
        }
        if (value.getConsents() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("consents");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.BNPLAcquisitionConsent_ResponseAdapter.INSTANCE))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getConsents());
        }
        writer.name("applicationSessionId");
        com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getApplicationSessionId());
        if (value.getGender() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name(androidx.autofill.HintConstants.AUTOFILL_HINT_GENDER);
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.Gender_ResponseAdapter.INSTANCE)).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getGender());
        }
        if (value.getLastNameAtBirth() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("lastNameAtBirth");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getLastNameAtBirth());
        }
        if (value.getNationalIdentification() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("nationalIdentification");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getNationalIdentification());
        }
        if (value.getNationalIdentificationShort() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("nationalIdentificationShort");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getNationalIdentificationShort());
        }
        if (value.getOccupation() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("occupation");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getOccupation());
        }
        if (value.getPersonTitle() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("personTitle");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getPersonTitle());
        }
        if (value.getPhoneType() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("phoneType");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BNPLAcquisitionPhoneType_ResponseAdapter.INSTANCE)).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getPhoneType());
        }
        if (value.getPhoneNumber() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("phoneNumber");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getPhoneNumber());
        }
        if (value.getSelectedPaymentFundingInstrumentId() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("selectedPaymentFundingInstrumentId");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getSelectedPaymentFundingInstrumentId());
        }
    }
}
