package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/adapter/ExternalThreeDsBrowserDetailsInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalThreeDsBrowserDetailsInput;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalThreeDsBrowserDetailsInput;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalThreeDsBrowserDetailsInput;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExternalThreeDsBrowserDetailsInput_InputAdapter implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsBrowserDetailsInput> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalThreeDsBrowserDetailsInput_InputAdapter INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalThreeDsBrowserDetailsInput_InputAdapter();

    private ExternalThreeDsBrowserDetailsInput_InputAdapter() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.apollographql.apollo.api.Adapter
    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsBrowserDetailsInput fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        throw new java.lang.IllegalStateException("Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalThreeDsBrowserDetailsInput value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        writer.name("colorDepth");
        com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getColorDepth()));
        if (value.getJavaEnabled() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("javaEnabled");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableBooleanAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getJavaEnabled());
        }
        if (value.getLanguage() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name(com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY);
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getLanguage());
        }
        writer.name("screenHeight");
        com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getScreenHeight()));
        writer.name("screenWidth");
        com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getScreenWidth()));
        writer.name("timeZoneOffset");
        com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getTimeZoneOffset()));
        if (value.getWindowSize() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("windowSize");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getWindowSize());
        }
        if (value.getUserAgent() instanceof com.apollographql.apollo.api.Optional.Present) {
            writer.name("userAgent");
            com.apollographql.apollo.api.Adapters.m9942present(com.apollographql.apollo.api.Adapters.NullableStringAdapter).toJson(writer, customScalarAdapters, (com.apollographql.apollo.api.Optional.Present) value.getUserAgent());
        }
    }
}
