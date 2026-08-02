package com.paypal.oslo.feature.debitcard.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/adapter/EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.OPERATION_NAME, "Funding", "Options", "FundingSource", com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.MASK_ALL_CONTENT_LABEL, "Contingency", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "UserPreferences", "FundingSource1", "Image1", "Contingency1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/adapter/EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Data> {
        public static final com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("evaluateDebitInstrumentFundingOptions");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.EvaluateDebitInstrumentFundingOptions evaluateDebitInstrumentFundingOptions = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                evaluateDebitInstrumentFundingOptions = (com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.EvaluateDebitInstrumentFundingOptions) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.EvaluateDebitInstrumentFundingOptions.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (evaluateDebitInstrumentFundingOptions != null) {
                return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Data(evaluateDebitInstrumentFundingOptions);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "evaluateDebitInstrumentFundingOptions");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("evaluateDebitInstrumentFundingOptions");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.EvaluateDebitInstrumentFundingOptions.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getEvaluateDebitInstrumentFundingOptions());
        }
    }

    private EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/adapter/EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter$EvaluateDebitInstrumentFundingOptions;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$EvaluateDebitInstrumentFundingOptions;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$EvaluateDebitInstrumentFundingOptions;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$EvaluateDebitInstrumentFundingOptions;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EvaluateDebitInstrumentFundingOptions implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.EvaluateDebitInstrumentFundingOptions> {
        public static final com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.EvaluateDebitInstrumentFundingOptions INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.EvaluateDebitInstrumentFundingOptions();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("funding");
        public static final int $stable = 8;

        private EvaluateDebitInstrumentFundingOptions() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.EvaluateDebitInstrumentFundingOptions fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding funding = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                funding = (com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Funding.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.EvaluateDebitInstrumentFundingOptions(funding);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.EvaluateDebitInstrumentFundingOptions value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("funding");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Funding.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getFunding());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/adapter/EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter$Funding;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Funding;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Funding;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Funding;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Funding implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding> {
        public static final com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Funding INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Funding();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"options", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY});
        public static final int $stable = 8;

        private Funding() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options options = null;
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration configuration = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    options = (com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Options.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    configuration = (com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Configuration.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding(options, configuration);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("options");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Options.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getOptions());
            writer.name(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY);
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Configuration.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getConfiguration());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/adapter/EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter$Options;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Options;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Options;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Options;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Options implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options> {
        public static final com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Options INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Options();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"fundingSources", "canOptOutOfPrimary", "canOptOutOfSecondary"});
        public static final int $stable = 8;

        private Options() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            java.lang.Boolean bool = null;
            java.lang.Boolean bool2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.FundingSource.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    bool = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    bool2 = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options(list, bool, bool2);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("fundingSources");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.FundingSource.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getFundingSources());
            writer.name("canOptOutOfPrimary");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getCanOptOutOfPrimary());
            writer.name("canOptOutOfSecondary");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getCanOptOutOfSecondary());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/adapter/EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter$FundingSource;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$FundingSource;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$FundingSource;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$FundingSource;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FundingSource implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource> {
        public static final com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.FundingSource INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.FundingSource();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "issuerName", "type", "lastNchars", "classification", "image", "status", "contingency"});
        public static final int $stable = 8;

        private FundingSource() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
        
            return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource(r2, r3, r4, r5, r6, r7, r8, r9);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = null;
            java.lang.Object obj = null;
            java.lang.String str3 = null;
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image image = null;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus debitInstrumentFundingSourceStatus = null;
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency contingency = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        fundingInstrumentType = (com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.FundingInstrumentType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        image = (com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Image.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        debitInstrumentFundingSourceStatus = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentFundingSourceStatus_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        contingency = (com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Contingency.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("issuerName");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getIssuerName());
            writer.name("type");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.FundingInstrumentType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getType());
            writer.name("lastNchars");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getLastNchars());
            writer.name("classification");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getClassification());
            writer.name("image");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Image.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getImage());
            writer.name("status");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentFundingSourceStatus_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("contingency");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Contingency.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getContingency());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/adapter/EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter$Image;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Image;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Image;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Image;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Image implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image> {
        public static final com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Image INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Image();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("url");
        public static final int $stable = 8;

        private Image() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image(obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "url");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("url");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getUrl());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/adapter/EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter$Contingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Contingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Contingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Contingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Contingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency> {
        public static final com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Contingency INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Contingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("type");
        public static final int $stable = 8;

        private Contingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType debitInstrumentContingencyType = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                debitInstrumentContingencyType = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentContingencyType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency(debitInstrumentContingencyType);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("type");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentContingencyType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getType());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/adapter/EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter$Configuration;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Configuration;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Configuration;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Configuration;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Configuration implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration> {
        public static final com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Configuration INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Configuration();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"fundingMethod", "primaryFundingSourceType", "secondaryFundingSourceTypes", "status", "statusReason", "userPreferences"});
        public static final int $stable = 8;

        private Configuration() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType debitInstrumentFundingOptionType = null;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType debitInstrumentPrimaryFundingSourceType = null;
            java.util.List list = null;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatus debitInstrumentFundingOptionStatus = null;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason debitInstrumentFundingOptionStatusReason = null;
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences userPreferences = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    debitInstrumentFundingOptionType = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentFundingOptionType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    debitInstrumentPrimaryFundingSourceType = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentPrimaryFundingSourceType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentSecondaryFundingSourceType_ResponseAdapter.INSTANCE)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    debitInstrumentFundingOptionStatus = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatus) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentFundingOptionStatus_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 4) {
                    debitInstrumentFundingOptionStatusReason = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentFundingOptionStatusReason_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 5) {
                    userPreferences = (com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.UserPreferences.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration(debitInstrumentFundingOptionType, debitInstrumentPrimaryFundingSourceType, list, debitInstrumentFundingOptionStatus, debitInstrumentFundingOptionStatusReason, userPreferences);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("fundingMethod");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentFundingOptionType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getFundingMethod());
            writer.name("primaryFundingSourceType");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentPrimaryFundingSourceType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getPrimaryFundingSourceType());
            writer.name("secondaryFundingSourceTypes");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentSecondaryFundingSourceType_ResponseAdapter.INSTANCE)).toJson(writer, customScalarAdapters, value.getSecondaryFundingSourceTypes());
            writer.name("status");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentFundingOptionStatus_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("statusReason");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentFundingOptionStatusReason_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getStatusReason());
            writer.name("userPreferences");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.UserPreferences.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getUserPreferences());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/adapter/EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter$UserPreferences;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$UserPreferences;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$UserPreferences;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$UserPreferences;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UserPreferences implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences> {
        public static final com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.UserPreferences INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.UserPreferences();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs.FUNDING_SOURCE, "primaryFundingOption"});
        public static final int $stable = 8;

        private UserPreferences() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource1 fundingSource1 = null;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType debitInstrumentPrimaryFundingSourceType = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    fundingSource1 = (com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource1) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.FundingSource1.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    debitInstrumentPrimaryFundingSourceType = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentPrimaryFundingSourceType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences(fundingSource1, debitInstrumentPrimaryFundingSourceType);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs.FUNDING_SOURCE);
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.FundingSource1.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getFundingSource());
            writer.name("primaryFundingOption");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentPrimaryFundingSourceType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getPrimaryFundingOption());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/adapter/EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter$FundingSource1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$FundingSource1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$FundingSource1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$FundingSource1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FundingSource1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource1> {
        public static final com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.FundingSource1 INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.FundingSource1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "issuerName", "type", "lastNchars", "classification", "image", "status", "contingency"});
        public static final int $stable = 8;

        private FundingSource1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
        
            return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource1(r2, r3, r4, r5, r6, r7, r8, r9);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = null;
            java.lang.Object obj = null;
            java.lang.String str3 = null;
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image1 image1 = null;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus debitInstrumentFundingSourceStatus = null;
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency1 contingency1 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        fundingInstrumentType = (com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.FundingInstrumentType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        image1 = (com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image1) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Image1.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        debitInstrumentFundingSourceStatus = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentFundingSourceStatus_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        contingency1 = (com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency1) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Contingency1.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("issuerName");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getIssuerName());
            writer.name("type");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.FundingInstrumentType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getType());
            writer.name("lastNchars");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getLastNchars());
            writer.name("classification");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getClassification());
            writer.name("image");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Image1.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getImage());
            writer.name("status");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentFundingSourceStatus_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("contingency");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Contingency1.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getContingency());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/adapter/EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter$Image1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Image1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Image1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Image1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Image1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image1> {
        public static final com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Image1 INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Image1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("url");
        public static final int $stable = 8;

        private Image1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image1(obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "url");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("url");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getUrl());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/adapter/EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter$Contingency1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Contingency1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Contingency1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Contingency1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Contingency1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency1> {
        public static final com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Contingency1 INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Contingency1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("type");
        public static final int $stable = 8;

        private Contingency1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType debitInstrumentContingencyType = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                debitInstrumentContingencyType = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentContingencyType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency1(debitInstrumentContingencyType);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("type");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentContingencyType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getType());
        }
    }
}
