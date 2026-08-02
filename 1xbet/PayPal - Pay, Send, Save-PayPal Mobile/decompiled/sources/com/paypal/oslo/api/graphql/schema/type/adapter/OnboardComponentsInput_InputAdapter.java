package com.paypal.oslo.api.graphql.schema.type.adapter;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/adapter/OnboardComponentsInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardComponentsInput;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardComponentsInput;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/api/graphql/schema/type/OnboardComponentsInput;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OnboardComponentsInput_InputAdapter implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.api.graphql.schema.type.OnboardComponentsInput> {
    public static final com.paypal.oslo.api.graphql.schema.type.adapter.OnboardComponentsInput_InputAdapter INSTANCE = new com.paypal.oslo.api.graphql.schema.type.adapter.OnboardComponentsInput_InputAdapter();

    private OnboardComponentsInput_InputAdapter() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.apollographql.apollo.api.Adapter
    public final com.paypal.oslo.api.graphql.schema.type.OnboardComponentsInput fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        throw new java.lang.IllegalStateException("Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.api.graphql.schema.type.OnboardComponentsInput value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        if (value.getNameInputComponentInputs() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("nameInputComponentInputs");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.OnboardNameInputComponentInput_InputAdapter.INSTANCE, false, 1, null)))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getNameInputComponentInputs());
        }
        if (value.getAddressInputComponentInputs() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("addressInputComponentInputs");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.OnboardAddressInputComponentInput_InputAdapter.INSTANCE, false, 1, null)))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getAddressInputComponentInputs());
        }
        if (value.getDateOfBirthInputComponentInputs() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("dateOfBirthInputComponentInputs");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.OnboardDateOfBirthInputComponentInput_InputAdapter.INSTANCE, false, 1, null)))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getDateOfBirthInputComponentInputs());
        }
        if (value.getTaxpayerIdInputComponentInputs() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("taxpayerIdInputComponentInputs");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.OnboardTaxpayerIdInputComponentInput_InputAdapter.INSTANCE, false, 1, null)))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getTaxpayerIdInputComponentInputs());
        }
        if (value.getBalanceTermsInputComponentInput() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("balanceTermsInputComponentInput");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.OnboardTermsInput_InputAdapter.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getBalanceTermsInputComponentInput());
        }
        if (value.getCryptoTermsInputComponentInput() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("cryptoTermsInputComponentInput");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.OnboardTermsInput_InputAdapter.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getCryptoTermsInputComponentInput());
        }
        if (value.getPpdcTermsInputComponentInput() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("ppdcTermsInputComponentInput");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.OnboardTermsInput_InputAdapter.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getPpdcTermsInputComponentInput());
        }
        if (value.getW9TermsInputComponentInput() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("w9TermsInputComponentInput");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.OnboardTermsInput_InputAdapter.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getW9TermsInputComponentInput());
        }
        if (value.getPhoneInputComponentInputs() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("phoneInputComponentInputs");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.OnboardPhoneInputComponentInput_InputAdapter.INSTANCE, false, 1, null)))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getPhoneInputComponentInputs());
        }
        if (value.getPasswordInputComponentInput() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("passwordInputComponentInput");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.OnboardPasswordInputComponentInput_InputAdapter.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getPasswordInputComponentInput());
        }
        if (value.getAccountCreationTermsInputComponentInput() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("accountCreationTermsInputComponentInput");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.OnboardAccountCreationTermsInputComponentInput_InputAdapter.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getAccountCreationTermsInputComponentInput());
        }
        if (value.getDocUploadInputComponentInputs() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("docUploadInputComponentInputs");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.schema.type.adapter.OnboardDocUploadInputComponentInput_InputAdapter.INSTANCE, false, 1, null)))).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getDocUploadInputComponentInputs());
        }
    }
}
